package homework.task002;

import java.math.BigDecimal;

public class Client {
    private String name;
    private BigDecimal balance;

    public Client(String name) {
        this.name = name;
        this.balance = new BigDecimal("0.0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
