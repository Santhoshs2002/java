public class ApplicationRunner{
public static void main(String[] args){
Application game = new Application();
game.creatByApplicationName("Whats app");
game.creatByApplicationName("Insta");
game.creatByApplicationName("Snap chart");
game.creatByApplicationName("Twitter");
game.creatByApplicationName("Facebook");
game.readByApplicationName();
System.out.println("-------UPDATE---------");
String update = game.updatesByApplicationName("Insta" , "Dr Drive");
System.out.println(update);
game.readByApplicationName();
System.out.println("-------DELETE---------");
String delete = game.deleteByApplicationName("Gta");
System.out.println(delete);
game.readByApplicationName();
System.out.println("-------SEARCH---------");
String search = game.searchByApplicationName("Facebook");
System.out.println(search);
}
}