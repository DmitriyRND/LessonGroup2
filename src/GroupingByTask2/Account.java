package GroupingByTask2;

public class Account {
    private String login;
    private double balance;
    private boolean prem;

    public Account(String login, double balance, boolean prem) {
        this.login = login;
        this.balance = balance;
        this.prem = prem;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isPrem() {
        return prem;
    }

    public void setPrem(boolean prem) {
        this.prem = prem;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", balance=" + balance +
                ", prem=" + prem +
                '}';
    }
}
