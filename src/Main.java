import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int right = 3;
        int balance = 1500;
        int select ;
        boolean select1 = true;


        while (right > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanıcı adınız: ");
            String userName = scanner.nextLine();

            System.out.println("Parolanız: ");
            String password = scanner.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba , kodluyoruz bankasına hoşgeldiniz!");

                while (select1) {

                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz para miktarı : ");
                            int price = scanner.nextInt();
                            balance += price;

                            System.out.println("Güncel bakiyeniz : " + balance);
                            continue;
                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarı : ");
                            int price1 = scanner.nextInt();

                            if (price1 > balance) {
                                System.out.println("Bakiye yetersiz!Bakiyeniz : " + balance);
                            } else {
                                balance -= price1;
                                System.out.println("Güncel bakiyeniz : " + balance);
                            }
                            continue;

                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            continue;

                        case 4:
                            System.out.println("Çıkış yapılıyor.");
                            select1 = false;
                            break;


                        default:
                            System.out.println("Geçersiz işlem.Tekrar deneyiniz.");
                            break;
                    }
                    break;
                }
                break;

            } else if (userName.equals("patika") && !password.equals("dev123")) {
                System.out.println("Hatalı şifre.Tekrar deneyiniz!");
                right--;

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                }

                else {
                    System.out.println("Kalan hatalı giriş hakkınız : " + right);
                }

            } else if (!userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hatalı kullanıcı adı.Tekrar deneyiniz!");
                right --;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                }
                else {
                    System.out.println("Kalan hatalı giriş hakkınız : " + right);
                }


            }else{
                System.out.println("Hatalı kullanıcı adı ve parola.Tekrar deneyiniz!");
                right --;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                break;
                }
                else {
                    System.out.println("Kalan hatalı giriş hakkınız : " + right);
                }
            }
        }
    }
}