class AmazonRunner{
public static void main(String args[])
{
Amazon.details();
Amazon.types("electronics","groceries","groceries");
String filters[]={"color","size","price"};
Amazon.filters(filters);
Amazon.rating(5);
}
}