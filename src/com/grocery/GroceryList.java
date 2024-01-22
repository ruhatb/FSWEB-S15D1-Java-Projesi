package com.grocery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<String> itemsList = new ArrayList<>();

    public void addItems() {
        String[] splitItems = scanner.nextLine().split(",");
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            if (!itemsList.contains(trimmedItem)) {
                itemsList.add(trimmedItem);
                sortItems(); // Eklenen öğe sonrasında listeyi sırala
            } else {
                System.out.println("Mevcut ürün bulunmaktadır.");
            }
        }
    }

    public void sortItems() {
        Collections.sort(itemsList);
    }

    public void removeItems() {
        String[] splitItems = scanner.nextLine().split(",");
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            itemsList.remove(trimmedItem);
        }
        sortItems(); // Silinen öğe sonrasında listeyi sırala
    }

  public void printSortList(){
        System.out.println("Sıralı liste :");
        for (String item : this.itemsList){
            System.out.println("" + item);
        }
    }
}
