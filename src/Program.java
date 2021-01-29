import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("----------------------------------");
            System.out.println("Enter the number of your selection");
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Update Name");
            System.out.println("4.Update Price");
            System.out.println("5.Display All");
            System.out.println("6.Search");
            System.out.println("7. Ascending Price Sort");
            System.out.println("8. Descending Price Sort");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Product p = Menus.getProduct();
                    m.add(p);
                    break;
                case 2:
                    System.out.println("Enter product's id: ");
                    int id = Integer.parseInt(input.nextLine());
                    m.delete(id);
                    break;
                case 3:
                    System.out.println("Enter product's id: ");
                    int id3 =  Integer.parseInt(input.nextLine());
                    System.out.println("Enter product's name: ");
                    String name = input.nextLine();
                    m.updateName(id3, name);
                    break;
                case 4:
                    System.out.println("Enter product's id: ");
                    int id4 =  Integer.parseInt(input.nextLine());
                    System.out.println("Enter product's price: ");
                    int price = Integer.parseInt(input.nextLine());
                    m.updatePrice(id4, price);
                    break;
                case 5:
                    m.showAll();
                    break;
                case 6:
                    System.out.println("Enter product's name: ");
                    String name_search = input.nextLine();
                    m.search(name_search);
                    break;
                case 7:
                    PriceComparator pc = new PriceComparator();
                    m.products.sort(pc);
                    break;
                case 8:
                    PriceComparator pct = new PriceComparator();
                    m.products.sort(pct);
                    Collections.reverse(m.products);
                    break;
            }
        }while(true);
    }
}
