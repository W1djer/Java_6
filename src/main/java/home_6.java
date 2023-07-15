import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class home_6 {
    public static void main(String[] args) {
        Notebooks one = new Notebooks("Asus", "Windows 10", 16, 512, 16);
        Notebooks two = new Notebooks("Asus", "Windows 10", 8, 512, 14);
        Notebooks three = new Notebooks("Asus", "Windows 11", 32, 2048, 18);
        Notebooks four = new Notebooks("HP", "Windows 10", 16, 1024, 16);
        Notebooks five = new Notebooks("HP", "Windows 10", 8, 512, 14);
        Notebooks six = new Notebooks("Lenovo", "Windows 11", 32, 2048, 18);
        Set<Notebooks> list = new HashSet<>();
        list.add(one); list.add(two); list.add(three); list.add(four); list.add(five); list.add(six);
        sort(list);
    }

    public static void sort(Set<Notebooks> a){
        Set<Notebooks> empty = new HashSet<>(a);
        Set<Notebooks> empty1 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите фильтр:");
            System.out.println("1 - OS");
            System.out.println("2 - Объем RAM");
            System.out.println("3 - Объем SSD");
            System.out.println("4 - Применить фильтры");
            System.out.println("5 - Сбросить фильтры");
            System.out.println("6 - Выход");
            Integer temp = Integer.valueOf(scanner.nextLine());
            switch (temp) {
                case 1:
                    System.out.println("Выберите OS:");
                    System.out.println("1 - Windows 10");
                    System.out.println("2 - Windows 11");
                    Integer veros = Integer.valueOf(scanner.nextLine());
                    if (veros == 1){
                        String version = "Windows 10";
                        for (Object o: empty) {
                            Notebooks x = (Notebooks) o;
                            if (version.equals(x.os)) empty1.add(x);
                        }
                        empty.clear();
                        empty.addAll(empty1);
                        empty1.clear();
                    }
                    else {
                        String version = "Windows 11";
                        for (Object o: empty) {
                            Notebooks x = (Notebooks) o;
                            if (version.equals(x.os)) empty1.add(x);
                        }
                        empty.clear();
                        empty.addAll(empty1);
                        empty1.clear();
                    }
                    break;
                case 2:
                    System.out.print("Введите минимальный объем ОЗУ: ");
                    Integer b = Integer.valueOf(scanner.nextLine());
                    for (Object o: empty) {
                        Notebooks x = (Notebooks) o;
                        if (x.ram >= b) empty1.add(x);
                    }
                    empty.clear();
                    empty.addAll(empty1);
                    empty1.clear();
                    break;
                case 3:
                    System.out.print("Введите минимальный объем SSD: ");
                    Integer c = Integer.valueOf(scanner.nextLine());
                    for (Object o: empty) {
                        Notebooks x = (Notebooks) o;
                        if (x.hw >= c) empty1.add(x);
                    }
                    empty.clear();
                    empty.addAll(empty1);
                    empty1.clear();
                    break;
                case 4:
                    for (Object o: empty) {
                        System.out.println(o.toString());
                    }
                    break;
                case 5:
                    for (Object o: a) {
                        System.out.println(o.toString());
                    }
                    empty.clear();
                    empty.addAll(a);
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }

    }

}
