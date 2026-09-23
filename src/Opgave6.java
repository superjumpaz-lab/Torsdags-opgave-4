import java.util.ArrayList;

public class Opgave6 {
    public class Item{
        private String name;
        private int value;
        private String type;
        private static int totalItemsCreated = 0;

        public Item(String name, int value, String type){
            this.name = name;
            this.value = value;
            this.type = type;
            this.totalItemsCreated += 1;
        }

        public String getName(){
            return name;
        }

        public int getValue(){
            return value;
        }

        public String getType(){
            return type;
        }

        public static int getTotalItemsCreated(){
            return totalItemsCreated;
        }

        public String toString(){
            return "- " + name;
        }
    }

    public class Inventory{
        private String playerName;
        private ArrayList<Item> items;
        private int maxCapacity;

        public Inventory(String playerName, int maxCapacity){
            this.playerName = playerName;
            this.maxCapacity = maxCapacity;
            items = new ArrayList<>();
        }

        public void addItem(Item item){
            items.add(item);
        }

        public void getTotalValue(){
            int sum = 0;
            for(Item item : items){
                sum += item.value;
            }
            System.out.println("Total value: " + sum);
        }

        public ArrayList<Item> findItemsByType(String type){
            ArrayList<Item> itemTypes = new ArrayList<>();
            for(Item item : items){
                if(type.equals(item.type)) {
                    itemTypes.add(item);
                }
            }
            return itemTypes;
        }

        public void printInventory(){
            System.out.println(this.playerName + "'s inventory");
            for(Item item : items){
                System.out.println(item);
            }
        }

    }

void main(){
        Inventory player1 = new Inventory("sims",2);
        Inventory player2 = new Inventory("smis",3);
        player1.addItem(new Item("Sword",20,"Weapon"));
        player1.addItem(new Item("Cat",200,"Animal"));
        player2.addItem(new Item("Dog",100,"Animal"));
        player2.addItem(new Item("Axe",30,"Weapon"));

        player1.printInventory();
        player2.printInventory();

        System.out.println("Items created: " + Item.getTotalItemsCreated());

        player1.getTotalValue();
        player2.getTotalValue();

}












}
