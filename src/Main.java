import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   Выберите операцию:");
            System.out.println("1.Добавить товар в список");
            System.out.println("2.Показать список покупок");
            System.out.println("3.Удалить товар из списка");
            String choice = scanner.next();
            switch (choice) {
                case ("1"): {
                    System.out.println("Какой товар хотите добавить?");
                    String product = scanner.next();
                    list.add(product);
                    System.out.println("Итого в списке покупок " + list.size() + " шт.");
                    System.out.println("--------------------------");
                    continue;
                }
                case ("2"): {
                    System.out.println("   Список покупок: ");
                    int i = 0;
                    for (String s : list) {
                        i++;
                        System.out.println(i + "." + s);
                    }
                    System.out.println("------------------------");
                    continue;
                }
                case ("3"): {
                    System.out.println("   Список покупок: ");
                    int i = 0;
                    for (String s : list) {
                        i++;
                        System.out.println(i + "." + s);
                    }
                    System.out.println("   Какой товар хотите удалить?");
                    System.out.println("Выберите номер или название товара:");
                    if (scanner.hasNextInt()) {
                        int delete = scanner.nextInt();
                        System.out.println("Покупка " + list.get(delete - 1) + " удалена, список покупок:");
                        list.remove(delete - 1);
                    } else {
                        String productDelete = scanner.next();
                        list.remove(productDelete);
                        System.out.println("Покупка " + productDelete + " удалена, список покупок:");
                    }
                    int j = 0;
                    for (String s : list) {
                        j++;
                        System.out.println(j + "." + s);
                    }
                    System.out.println("------------------------");
                }
            }
        }
    }
}




