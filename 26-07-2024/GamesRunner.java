public class GamesRunner{
public static void main(String[] args){
Games game = new Games();
game.creatByGamesName("Cgi");
game.creatByGamesName("Bgmi");
game.creatByGamesName("Counter Strike");
game.creatByGamesName("Gta");
game.creatByGamesName("Cash of Clans");
game.readByGamesName();
System.out.println("-------UPDATE---------");
String update = game.updatesByGamesName("Bgmi" , "Dr Drive");
System.out.println(update);
game.readByGamesName();
System.out.println("-------DELETE---------");
String delete = game.deleteByGamesName("Gta");
System.out.println(delete);
game.readByGamesName();
System.out.println("-------SEARCH---------");
String search = game.searchByGamesName("Cgi");
System.out.println(search);
}
}