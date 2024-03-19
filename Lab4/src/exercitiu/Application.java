package exercitiu;

public class Application {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard("Gigel");
        DebitCard debitCard = new DebitCard("Marcel", 500);

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.achizitie(200);
        shoppingMall.achizitie(300);;
        shoppingMall.achizitie(10);

        shoppingMall.setCard(creditCard);

        shoppingMall.achizitie(100);
        shoppingMall.achizitie(200);

    }
}
