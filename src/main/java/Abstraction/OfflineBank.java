package Abstraction;

public class OfflineBank {
    int postalCode;
    String branchName;

    public String info() {
        return "OfflineBank{" +
                "postalCode=" + postalCode +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
