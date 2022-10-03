package entity;

public class Client {

    String clientId;
    String surName;
    String identificationClientId;
    double sum;

    public Client() {
    }

    public Client(String identificationClientId) {
        this.identificationClientId = identificationClientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdentificationClientId() {
        return identificationClientId;
    }

    public void setIdentificationClientId(String identificationClientId) {
        this.identificationClientId = identificationClientId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
