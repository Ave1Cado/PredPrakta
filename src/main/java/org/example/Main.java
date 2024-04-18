package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void produceItem(String itemName) {
        System.out.println("Производство товара: " + itemName);
    }

    static void shipItem(String itemName, int quantity) {
        System.out.println("Отгрузка товара: " + itemName + ", количество: " + quantity);
    }

    static void calculateProductionCost(String itemName) {
        System.out.println("Расчет себестоимости товара: " + itemName);
    }

    void manageProduction() {
        System.out.println("Управление производством");
    }

    void inspectQuality(String itemName) {
        System.out.println("Проверка качества товара: " + itemName);
    }

    void orderRawMaterials() {
        System.out.println("Заказ сырья");
    }

    static void produceUniqueItem(String itemName) {
        System.out.println("Производство уникального товара: " + itemName);
    }

    static void shipExpress(String itemName, int quantity) {
        System.out.println("Экспресс-отгрузка товара: " + itemName + ", количество: " + quantity);
    }

    public static void main(String[] args) {
        produceItem("Книги");
        shipItem("Книги", 100);
        calculateProductionCost("Книги");

        Main main = new Main();
        main.manageProduction();
        main.inspectQuality("Книги");
        main.orderRawMaterials();

        produceUniqueItem("Уникальный товар");
        shipExpress("Уникальный товар", 10);
    }
}
