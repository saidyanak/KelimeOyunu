import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int difficulty;                                               // Zorluk seviyesini saklayacak olan tamsayı değişkeni
        System.out.println("Please enter the difficulty level: 0-2"); // Kullanıcıdan zorluk seviyesini girmesini istiyoruz
        Scanner scanner = new Scanner(System.in);                     // Kullanıcıdan girdi almak için Scanner'ı newliyoruz
        difficulty = scanner.nextInt();                               // Kullanıcının girdiği tamsayı değeri, difficulty değişkenine atıyoruz
        String[] strings = {"python", "java", "inheritance"};         // Üç farklı kelime içeren bir dizi oluşturduk
        char[] src = new char[strings[difficulty].length()];          // Seçilen kelimenin uzunluğu kadar bir karakter dizisi oluşturulur
        arraySettings settings = new arraySettings();                 // arraySettings sınıfını newliyoruz birazdan kullanıcaz
        settings.arraySettings1(strings[difficulty], src);            // arraySettings1 metoduna seçilen kelime ve karakter dizisi parametre olarak geçirilerek çağrılır
        char[] dest = new char[strings[difficulty].length()];         // Tahmin edilen kelimenin uzunluğu kadar bir karakter dizisi oluşturulur
        int life = 5;                                                 // Kullanıcının yanlış tahmin yapma hakkı olan can sayısı
        System.out.println("The length of the string you want to find: " + src.length); // Kullanıcıya bulunması gereken kelimenin uzunluğunu ekrana yazdırıyoruz
        char letter;                                                  // Kullanıcının gireceği harfi tutacak olan karakter değişkeni
        String[] clue = new String[strings.length];                   // İpucu dizisi oluşturulur
        clue[0] = "A very easy programming language";                 // İlk zorluk seviyesi için ipucu atanır
        clue[1] = "My favorite programming language";                 // İkinci zorluk seviyesi için ipucu atanır
        clue[2] = "The way you say it is so cool";                    // Üçüncü zorluk seviyesi için ipucu atanır
        String newClue = new String(clue[difficulty]);                // Seçilen zorluk seviyesi için uygun olan ipucu alınır
        for (int i = 0; i < life; i++) {                              // Kullanıcının can sayısı kadar bir döngü başlatılır
            System.out.println("You have " + (life - i) + " lives left\nword status\n" + new String(dest) + "\nplease enter a letter"); // Kullanıcıya kaç canının kaldığı, tahmin edilen kelimenin mevcut durumu ve bir harf girmesi istenir
            letter = scanner.next().charAt(0);                        // Kullanıcıdan bir harf girişi alınır
            for (int j = 0; j < src.length; j++) {                    // src dizisini tarayarak kullanıcının girdiği harfin doğru olup olmadığını kontrol eden döngü
                if (letter == src[j]) {                               // Kullanıcının girdiği harf, gizli kelimenin j. indeksinde bulunursa
                    System.out.println("You found the right letter"); // Doğru harfi bulduğuna dair bir mesaj verilir
                    dest[j] = src[j];                                 // Doğru tahmin edilen harf, dest dizisine eklenir
                    life++;                                           // Doğru tahmin edildiği için hak 1 arttırıldı
                    break;                                            // Doğru harfi bulduktan sonra iç döngüden çıkılır
                }
            }
            int found = 0;                                            // Doğru tahmin edilen harf sayısını saklayacak olan değişken
            for (int k = 0; k < dest.length; k++) {                   // Doğru tahmin edilen harfleri sayan döngü
                if (dest[k] == src[k]) {                              // Eğer dest ve src dizilerindeki k. indeksteki elemanlar eşitse
                    found++;                                          // found değişkeni artırılır
                }
            }
            System.out.println("Let me give you some hints" + new String(newClue)); // Kullanıcıya ipucu verilir
            if (found == dest.length) {                               // Eğer found değişkeni, dest dizisinin uzunluğuna eşitse
                System.out.println("You found the right String");     // Kullanıcı tüm harfleri doğru tahmin ettiğine dair bir mesaj verilir
                break;                                                // Döngüden çıkılır
            }
        }
        System.out.println("You dont found the right String");        // Kullanıcı tüm canlarını kullanıp kelimeyi doğru tahmin edemediğinde bir mesaj gösterilir
    }
}
