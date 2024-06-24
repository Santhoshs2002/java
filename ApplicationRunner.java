public class ApplicationRunner {
   
    static String appName = "MyApp";
    static String version = "1.0.0";
    static String developer = "Rahul";
    static String releaseDate = "2024-06-19";
    static String platform = "Android";
    static int downloads = 5000;
    static double rating = 4.5;
    static boolean isFree = true;
    static String category = "Productivity";

    public static void main(String[] args) {
       
        String userName = "Santhu";
        String userEmail = "santhu.xworkz@gmail.com";
        int userAge = 21;
        String userCountry = "India";
        String deviceModel = "Samsung Galaxy S21";
        String osVersion = "Android 12";
        boolean isSubscribed = true;
        double appSize = 50.5;
		System.out.println("App Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Platform: " + platform);
        System.out.println("Downloads: " + downloads);
        System.out.println("Rating: " + rating);
        System.out.println("Is Free: " + isFree);
        System.out.println("Category: " + category);

        System.out.println("User Name: " + userName);
        System.out.println("User Email: " + userEmail);
        System.out.println("User Age: " + userAge);
        System.out.println("User Country: " + userCountry);
        System.out.println("Device Model: " + deviceModel);
        System.out.println("OS Version: " + osVersion);
        System.out.println("Is Subscribed: " + isSubscribed);
        System.out.println("App Size: " + appSize + " MB");
		}
		}