import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        int secim;

        Scanner input= new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz: ");
        userName=input.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password=input.nextLine();

        if((userName.equals("Sule")) && (password.equals("1234"))){
            System.out.println("Giris Basarili!!");
        }
        else {
            System.out.println("Giris Basarisiz.Kullanici sifrenizi sifirlamak ister misiniz?");
            System.out.println("1-EVET  2-HAYIR");
            System.out.print("Seciminiz: ");
            secim=input.nextInt();

            if(secim == 1 ){
                Scanner input1 = new Scanner(System.in);
                System.out.print("Sifrenizi olusturunuz: ");
                password=input1.nextLine();

                if(password.equals("1234")){
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz: ");
                    password=input1.nextLine();
                    if(!password.equals("1234")) {
                        System.out.println("Sifre olusturuldu.");
                    }
                }
                else {
                    System.out.println("Sifre olusturuldu.");
                }
            }

        }
    }
}
