public class Clothes {
    String name;
    String size;
    int price;
    String color;
    public Clothes ( String name,  String size, int price, String color){
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public static class Sneakers extends Clothes{
        String material;
        public Sneakers(String name,  String size, int price, String color, String material) {
            super(name, size, price, color);
            this.material = material;
        }

        @Override
        void allDetails() {
            super.allDetails();
            System.out.println("Material : " + material);
        }
    }
    String willSizeFit(String mySize) {
        if (size.equalsIgnoreCase(mySize)) {
            return "Цей розмір вам підходить : " + size;
        } else {
            return "Цей розмір вам не підходить : " + size;
        }
    }
    void allDetails(){
        System.out.println("Name : " + name);
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
    }
}
