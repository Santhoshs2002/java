public class StatesRunner{
public static void main(String[] args){
States state = new States();
state.creatByStatesName("Karnataka");
state.creatByStatesName("Andhra pradesh");
state.creatByStatesName("Kerla");
state.creatByStatesName("Tamil nadu");
state.creatByStatesName("Maharastra");
state.readByStatesName();
System.out.println("-------UPDATE---------");
String update = state.updatesByStatesName("Maharastra" , "Goa");
System.out.println(update);
state.readByStatesName();
System.out.println("-------DELETE---------");
String delete = state.deleteByStatesName("Goa");
System.out.println(delete);
state.readByStatesName();
System.out.println("-------SEARCH---------");
String search = state.searchByStatesName("Kerla");
System.out.println(search);
}
}