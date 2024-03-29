import service.StorageService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StorageService storageService = new StorageService();

        while (true){ //acesta va rula la infinit pana apare comanda return (care iese din metoda main)
                      // sau break in main
            menu();

            String command = scanner.nextLine().toLowerCase();
            System.out.println("Command received: " + command);
            switch (command){
                case "create":
                    storageService.create(scanner);
                    break;
                case "read":
                    storageService.read(scanner);
                    break;
                case "delete":
                    storageService.delete(scanner);
                    break;
                case "update":
                    storageService.update(scanner);
                    break;
                case "quit":
                    System.out.println("Exiting");
                    return; // acesta va opri programul; va iesi din metoda main
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void menu() {
        System.out.println("Available commands:");
        System.out.println("create");
        System.out.println("read");
        System.out.println("update");
        System.out.println("delete");
        System.out.println("quit");
        System.out.println("Enter command:");
    }
}