import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.Transaction;
import util.Helper;

import java.util.Scanner;

public class Main {

    Helper helper = new Helper();

    public static void main(String[] args) {
        Main main = new Main();
        Transaction transaction = new Transaction();
        Client client = new Client("1234567890");
        Client clientFromScanner = main.setScanner();
        main.checkIdentificationClientId(clientFromScanner.getIdentificationClientId());
        main.checkClientId(clientFromScanner.getClientId());
        main.checkSum(clientFromScanner.getSum());
        transaction.transferMoney(client, client.getIdentificationClientId());
    }

    public void checkIdentificationClientId(String enteredFromScanner) {
        boolean clientIdentificationId = true;
        while (clientIdentificationId) {
            try {
                helper.validClientId(enteredFromScanner);
                clientIdentificationId = false;
            } catch (WrongFieldException e) {
                System.out.println(e);
                enteredFromScanner = setScanner().getIdentificationClientId();
            }
        }
    }

    public void checkClientId(String clientIdFromScanner) {
        boolean clientId = true;
        while (clientId){
            try {
                helper.validClientId(clientIdFromScanner);
                clientId = false;
            } catch (WrongFieldException e) {
                System.out.println(e);
                clientIdFromScanner = setScanner().getClientId();
            }
        }
    }

    public void checkSum(double sumFromScanner) {
        boolean sum = true;
        while (sum) {
            try {
                helper.validSum(sumFromScanner);
                sum = false;
            } catch (WrongSumException e) {
                System.out.println(e);
                sumFromScanner = setScanner().getSum();
            }
        }
    }

    public Client setScanner() {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write identification_Client_Id: ");
        client.setIdentificationClientId(scanner.nextLine());
        System.out.print("Write client_Id: ");
        client.setClientId(scanner.nextLine());
        System.out.print("Write sum: ");
        client.setSum(scanner.nextInt());
        return client;
    }
}
