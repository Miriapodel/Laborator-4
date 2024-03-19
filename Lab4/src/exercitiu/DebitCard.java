package exercitiu;

public record DebitCard(String utilizator, double limitAmount) implements BankCard {
    private static int spentAmount = 0;

    @Override
    public void doTransaction(double amount) {

        if (limitAmount - spentAmount >= amount) {
            spentAmount += amount;
            System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        }
        else{
            System.out.println("Not enough money");
        }
    }
}
