package service;

import entity.Client;
import util.Helper;

public class Transaction extends Helper {

    public void transferMoney(Client client, String identificationClientId) {
        validIdentificationTwoAccount(client.getIdentificationClientId(), identificationClientId);
    }
}
