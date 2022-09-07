import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа: список покупок");
        List<String> Shopping = new ArrayList<>();
        while (true) {                             //цикл while
            System.out.println("Выберите операцию и введите её номер");
            System.out.println("1 - добавить товар");
            System.out.println("2 - показать товары");
            System.out.println("3 - удалить товар");
            System.out.println("4 - поиск товара");
            System.out.println("введите end для завершения программы");
            int sum = 0;
            String operation = scanner.nextLine(); // ввод операции
            if (("end").equals(operation)) {
                System.out.println("Программа завершена!");
                break;
            }
            switch (operation) {
                case "1": { //покупки
                    System.out.println("Введите какую покупку вы хотите добавить?");
                    String productBuy = scanner.nextLine(); // ввод добавляемого товара
                    Shopping.add(productBuy);
                    System.out.println("Итого товаров в списке покупок: " + Shopping.size());
                    break;
                }
                case "2": { //список
                    System.out.println("Список покупок:"); // вывод покупаемых товаров
                    ShoppingList(Shopping);
                    System.out.println("Итого товаров в списке покупок: " + Shopping.size());
                    break;
                }
                case "3": {//удаление
                    System.out.println("Какую покупку вы хотите удалить? Введите номер или название");
                    String productRemoval = scanner.nextLine(); // ввод удаляемого товара
                    Shopping.remove(productRemoval);
                    System.out.println("Покупка " + productRemoval + " удалена, список покупок:");
                    ShoppingList(Shopping);
                    System.out.println("Итого товаров в списке покупок: " + Shopping.size());
                    break;
                }
                case "4": { //поиск
                    System.out.println("Введите текст для поиска");
                    String searchText = scanner.nextLine(); // ввод искомого числа
                    for (String items : Shopping) {
                        items.toLowerCase();
                        searchText.toLowerCase();
                        for (int i = 0; i < Shopping.size(); i++) {
                            if (Shopping.get(i).toLowerCase().contains(searchText.toLowerCase())) {
                                System.out.println((i + 1) + ". " + Shopping.get(i));
                            }
                        }
                        break;
                    }
                    break;
                }
                default:
                    System.out.println("Такой операции нет, введите номер операцию вновь: ");
            }
        }
    }

    public static void ShoppingList(List<String> Shopping) {
        for (int i = 0; i < Shopping.size(); i++) {
            System.out.println((i + 1) + ". " + Shopping.get(i));
        }
    }
}