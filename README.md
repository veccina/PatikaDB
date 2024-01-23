# Java MySQL Veritabanı Bağlantısı ve Veri Çekme
Bu örnek Java programı, bir MySQL veritabanına bağlanmayı ve bu veritabanından veri çekmeyi göstermek için oluşturulmuştur. Aşağıda programın temel işleyişi ve kullanımı hakkında bilgiler bulunmaktadır.

## Gereksinimler
Bu programın çalışması için aşağıdaki gereksinimlere ihtiyacınız vardır:

- Java Development Kit (JDK)
- MySQL veritabanı sunucusu
- MySQL JDBC sürücüsü (genellikle JAR dosyası olarak sağlanır)
- Veritabanı Bağlantısı Ayarları
- Programın düzgün çalışabilmesi için, veritabanı bağlantı ayarlarınızı aşağıdaki gibi düzenlemeniz gerekmektedir:

java
public static final String DB_URL = "jdbc:mysql://localhost/workplace";
public static final String DB_USERNAME = "root";
public static final String DB_PASSWORD = "mysql";
DB_URL: MySQL veritabanınızın URL'sini temsil eder. Örnekte "localhost" üzerindeki "workplace" adlı bir veritabanına bağlanıldığı varsayılmıştır.
DB_USERNAME ve DB_PASSWORD: MySQL veritabanına bağlanmak için kullanıcı adı ve şifre bilgilerinizi içerir.
Bu ayarları kendi veritabanınıza uygun şekilde güncellemelisiniz.

## Programın Çalıştırılması
Programı çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

- Java programınızı bir Java IDE (Integrated Development Environment) veya komut satırı üzerinden derleyin ve çalıştırın.

- Program başlatıldığında, belirtilen veritabanına bağlanacak ve "employees" tablosundaki verileri alacaktır.

- Verileri başarıyla çekildiğinde, her bir çalışanın ID, adı, pozisyonu ve maaşı ekrana yazdırılacaktır.

- Program işlemi tamamladığında, bağlantıları kapatır ve program sonlanır.

- Hata Yakalama
Program, olası SQL hatalarını yakalamak için bir hata işleme mekanizması içerir. Hata durumunda, hata mesajları ekrana yazdırılır.

- Sonuç
Bu örnek program, Java kullanarak MySQL veritabanına nasıl bağlanılacağını ve veri nasıl çekileceğini göstermektedir. Kendi projelerinizde veritabanı bağlantılarınızı ve sorgularınızı uygun şekilde yapılandırarak kullanabilirsiniz.
