import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Оберіть магазин в якому ви хочете переглянути одяг : ");
        System.out.println("1.Adidas");
        System.out.println("2.Levi's");
        System.out.println("3.Zara");
        Scanner scanner = new Scanner(System.in);
        int choiceShop = scanner.nextInt();
        switch (choiceShop){
            case 1:
                System.out.println("Ви обрали магазин adidas");
                break;
            case 2:
                System.out.println("Ви обрали магазин levi's");
                break;
            case 3:
                System.out.println("Ви обрали магазин zara");
                break;
            default:
                System.out.println("Невірний вибір, спробуйте ще.");
        }
        System.out.println("Оберіть одяг який вас цікавить : ");
        System.out.println("1.Світшот");
        System.out.println("2.Джинси");
        System.out.println("3.Кросівки");
        Scanner sc = new Scanner(System.in);
        int choiceClothes = sc.nextInt();
        switch (choiceClothes){
            case 1:
                System.out.println("Ви обрали світшот");
                break;
            case 2:
                System.out.println("Ви обрали джинси");
                break;
            case 3:
                System.out.println("Ви обрали кросівки");
                break;
            default:
                System.out.println("Невірний вибір, спробуйте ще.");
        }
        if (choiceClothes == 1){
            Seller seller = new Seller("Владислав", 27);
            System.out.println("Seller : " + seller.getName() + " " + seller.getAge());
            Clothes sweatshirt = new Clothes("світшот","M", 2400, "чорний");
            System.out.println("Details : ");
            sweatshirt.allDetails();
            System.out.println("Який розмір вам потрібен?");
            Scanner scan = new Scanner(System.in);
            String sz = scan.nextLine();
            System.out.println(sweatshirt.willSizeFit(sz));
        } else if (choiceClothes == 2) {
            Seller seller = new Seller("Владислав", 27);
            System.out.println("Seller : " + seller.getName() + " " + seller.getAge());
            Clothes jeans = new Clothes("джинси","M", 1350, "синій");
            System.out.println("Details : ");
            jeans.allDetails();
            System.out.println("Який розмір вам потрібен?");
            Scanner scanner1 = new Scanner(System.in);
            String sz = scanner1.nextLine();
            System.out.println(jeans.willSizeFit(sz));
        } else if (choiceClothes == 3) {
            Seller seller = new Seller("Владислав", 27);
            System.out.println("Seller : " + seller.getName() + " " + seller.getAge());
            Clothes sneakers = new Clothes.Sneakers("кросівки","38", 4700, "білий", "шкіра");
            System.out.println("Details : ");
            sneakers.allDetails();
            System.out.println("Який розмір вам потрібен?");
            Scanner scanner2 = new Scanner(System.in);
            String sz = scanner2.nextLine();
            System.out.println(sneakers.willSizeFit(sz));
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Будь ласка, залиште відгук, щоб ми ставали кращими!");
        String userFeedback = scanner3.nextLine();
        Response response = new Response(userFeedback);
        response.displayFeedback();
        response.displayThankYou();
        scanner3.close();

    }
}