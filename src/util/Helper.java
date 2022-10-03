package util;

import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {

    public void validClientId(String identificationClientId) throws WrongFieldException {
        if (identificationClientId.length() != 10) {
            throw new WrongFieldException("Client account length is wrong. Less or more then 10");
        } else {
            System.out.println("Identification successful");
        }
    }

    public void validSum(double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException("Your sum bigger then 1000! Please write sum then 1000");
        } else {
            System.out.println("Sum is continue");
        }
    }

    public void validIdentificationTwoAccount(String firstClient, String secondClient){
        if (firstClient != secondClient){
            throw new UserExpectedError("User does not match");
        } else {
            System.out.println("Transaction is successful");
        }
    }
}
