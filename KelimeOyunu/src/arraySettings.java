public class arraySettings {
    // arraySettings1 metodu, bir dize ve bir karakter dizisi alır,
    // ve dizedeki her karakteri karakter dizisine kopyalar.
    // Son olarak, karakter dizisini döndürür.
    public char[] arraySettings1(String src, char[] dest) {
                                                // src dizisinin uzunluğu kadar bir döngü başlatılır
        for (int i = 0; i < src.length(); i++) {
                                                // src dizisindeki her karakter, karşılık gelen indeksteki
                                                // dest dizisine atanır
            dest[i] = src.charAt(i);
        }
                                                // Kopyalama işlemi tamamlandıktan sonra dest dizisi döndürülür
        return dest;
    }
}
