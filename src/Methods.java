import java.util.ArrayList;

public class Methods {

    ArrayList<Product> products = new ArrayList<Product>();

    public void add(Product p){
        products.add(p);
    };

    public void delete(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id  ){
                products.remove(products.get(i));
            }
        }
    };

    public void updateName(int id, String name){
        for (Product product: products
             ) {
            if(product.getId() == id){
                product.setName(name);
            };
        }
    };

    public void updatePrice(int id, int price){
        for (Product product: products
        ) {
            if(product.getId() == id){
                product.setPrice(price);
            };
        }
    };

    public void showAll(){
        for (Product product: products
             ) {
            System.out.println(product.toString());
        }
    };

    public void search(String name){
        for (Product p: products
             ) {
            if(p.getName().equals(name)){
                System.out.println(p.toString() + "at index: " + this.getProductIndex(p.getId()));
            };
        }
    };
    public int getProductIndex(int id) {
        for (int i = 0; i < this.products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
