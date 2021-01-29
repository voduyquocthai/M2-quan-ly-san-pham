import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);
    public static Product getProduct(){
        Product p = new Product();
        System.out.println("Enter product's id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter product's name: ");
        String name = input.nextLine();
        System.out.println("Enter product's price: ");
        int price = Integer.parseInt(input.nextLine());
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        return p;
    }
}
