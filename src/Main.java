import com.grocery.GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Uygulama sonlandırılıyor...");
                    break;
                case 1:
                    System.out.println("Ekleme yapılcak ürünü giriniz :");
                    groceryList.addItems();
                    break;
                case 2:
                    System.out.println("Cıkarmak istediğiniz ürünü giriniz:");
                    groceryList.removeItems();
                    break;
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
            }
            groceryList.printSortList();
        } while (choice != 0);
        scanner.close();
    }

    private static void printMenu() {

        System.out.println("\n********** Menü **********");
        System.out.println("0 - Uygulamayı Kapat");
        System.out.println("1 - Eleman Ekle");
        System.out.println("2 - Eleman Çıkar");
    }
}
