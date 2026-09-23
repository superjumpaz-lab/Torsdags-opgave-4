public class Opgave2 {

    public class Product {
        private String name;
        private double price;
        String[] tags;

        public Product(String name, double price, String[] tags) {
            this.name = name;
            this.price = price;
            this.tags = tags;
        }

        public void printInfo() {
            System.out.println("Item: " + this.name + "\nPrice: " + this.price);
            for (int i = 0; i < tags.length; i++) {
                System.out.println("Tag: " + tags[i]);
                if (i < tags.length - 1) {
                    System.out.println(", ");
                }
            }

        }

        public boolean hasTag(String tag) {
           /* for(String tag : tags){
                if(tag.equals(tags)){
                    return true;
                }
            }
            */
            for (String t : tags) {
                if (t.equals(tag)) {
                    return true;
                }
            }
            return false;

        }

    }

    void main(String[] args) {
        Product onion = new Product("Onion", 20, new String[]{"Veggie"});
        Product tv = new Product("TV", 1000, new String[]{"Electronics"});
        Product plushie = new Product("Plushie", 60, new String[]{"Toy"});
        Product cucumber = new Product("Cucumber", 50, new String[]{"Veggie"});
        Product[] basket = new Product[4];
        basket[0] = onion;
        basket[1] = tv;
        basket[2] = plushie;
        basket[3] = cucumber;

        for(Product product : basket){
            if(product.hasTag("Veggie")){
                System.out.println("- " + product.name);
            }
        }

        double max = 0;
        String mostExpensive = "Something";
        for(Product product : basket){
            if(product.price > max){
                max = product.price;
                mostExpensive = product.name;
            }
        }
        System.out.println(mostExpensive + " is the most expensive item at " + max + " dollars");
    }
}







