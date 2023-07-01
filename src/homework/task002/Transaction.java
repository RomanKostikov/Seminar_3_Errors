package homework.task002;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Transaction {
    /*
    Вы разрабатываете систему банковских транзакций. Необходимо написать программу,
    которая позволяет пользователям осуществлять переводы средств со своего банковского счета
    на другие счета. Однако, в системе существуют некоторые ограничения и возможные ошибки,
    которые нужно обрабатывать.
    Требования:
    При переводе средств, сумма должна быть положительной и не превышать доступный баланс на счете.
    Если сумма перевода отрицательная или равна нулю, выбрасывается исключение
    InvalidAmountException с сообщением "Некорректная сумма перевода".
    Если на балансе недостаточно средств для перевода, выбрасывается исключение
    InsufficientFundsException с сообщением "Недостаточно средств на счете".
    При успешном переводе, сумма должна списываться с текущего счета и зачисляться на целевой счет.
     */
    public static void main(String[] args) {
        Client client1 = new Client("Roman");
        Client client2 = new Client("Sergey");
        try {
            Transaction transaction = new Transaction();
            transaction.addMoney(client1, transaction.inputFromUser(
                    String.format("Введите сумму для зачисления клиенту %s: ", client1.getName())));
            transaction.addMoney(client2, transaction.inputFromUser(
                    String.format("Введите сумму для зачисления клиенту %s: ", client2.getName())));
            transaction.transferMoney(client2, client1, transaction.inputFromUser(String.format(
                    "Введите сумму списания с клиента %s к клиенту %s: ", client2.getName(), client1.getName())));
            System.out.println("Транзакция успешно проведена:");
            System.out.printf("Клиент %s, баланс: %.2f\n", client1.getName(), client1.getBalance());
            System.out.printf("Клиент %s, баланс: %.2f\n", client2.getName(), client2.getBalance());
        } catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println("Транзакция отменена! Ошибка: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Транзакция отменена! Ошибка: Некорректный ввод");
        }
    }

    /**
     * Зачисление денежных средств на счет клиента
     * @param client клиент для зачисления
     * @param sumTransaction сумма для зачисления
     */
    public void addMoney(Client client, BigDecimal sumTransaction){
        BigDecimal balance = client.getBalance();
        client.setBalance(balance.add(sumTransaction));
    }

    /**
     * Списание денежных средств со счета клиента
     * @param client клиент для списания
     * @param sumTransaction сумма списания
     */
    public void takeMoney(Client client, BigDecimal sumTransaction) throws InsufficientFundsException{
        BigDecimal balance = client.getBalance();
        if (balance.subtract(sumTransaction).compareTo(new BigDecimal("0.0")) < 0){
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        client.setBalance(balance.subtract(sumTransaction));
    }

    /**
     * Перевод денежных средств между счетами клиентов
     * @param clientOut клиент для списания
     * @param clientIn клиент для зачисления
     * @param sumTransaction сумма перевода
     */
    public void transferMoney(Client clientOut, Client clientIn, BigDecimal sumTransaction) throws InsufficientFundsException{
        takeMoney(clientOut, sumTransaction);
        addMoney(clientIn, sumTransaction);
    }

    /**
     * Полуучение суммы транзакции от пользователя
     * @param message сообщение для пользователя
     * @return сумма транзакции
     */
    public BigDecimal inputFromUser(String message) throws InvalidAmountException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        BigDecimal userInput = BigDecimal.valueOf(sc.nextDouble());
        if (userInput.compareTo(new BigDecimal("0.0")) == 0 || userInput.compareTo(new BigDecimal("0.0")) < 0){
            throw new InvalidAmountException("Некорректная сумма перевода");
        }
        return userInput;
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
