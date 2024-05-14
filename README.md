# KelimeOyunu
## Kullanıcıya bir zorluk seviyesi seçtirir ve bu seviyeye bağlı olarak bir kelime seçer. Daha sonra kullanıcıdan harf tahminleri alır. Her tahminde, kullanıcının girdiği harf seçilen kelimenin içinde var mı diye kontrol edilir. Eğer varsa, bu harfin doğru tahmin olduğu belirtilir ve bu harf hedef kelime içindeki yerine yerleştirilir. Her doğru tahmin sonrasında kullanıcıya hedef kelimenin güncel durumu gösterilir ve kullanıcının kalan can sayısı bildirilir. Ayrıca, kullanıcıya zorluk seviyesine uygun bir ipucu verilir.

ArraySettings sınıfı ise, bir dize ve bir karakter dizisi alan arraySettings1 metodunu içerir. Bu metod, aldığı dizedeki her karakteri alınan karakter dizisine kopyalar. Yani, Main sınıfındaki kullanımıyla, seçilen kelimenin karakterlerini bir karakter dizisine kopyalamak için kullanılır.

Birlikte bu iki sınıf, bir kelime tahmin oyununun temel işlevselliğini sağlar. Main sınıfı oyunun akışını kontrol ederken, ArraySettings sınıfı ise gerekli yardımcı işlemleri gerçekleştirir.
