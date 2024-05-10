import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    boolean continuar= true ;
    int tamñ= 0;
    do {
        try {
            System.out.println("cuantos productos desea llevar");
            tamñ=scanner.nextInt();
            continuar=false;
        } catch (Exception e) {
            System.out.println("solo numeros enteros");
            scanner.nextLine();
        }
} while(continuar);
scanner.nextLine();
String[] producto= new String [tamñ];
int [] cantdproducto= new int [tamñ];
 for(int x=0 ; x<producto.length; x++){
    System.out.println("ingrese el  nombre del producto " +(x+1));
    producto[x]=scanner.nextLine();
    System.out.println("ingrese cuantos productos va a llevar");
    cantdproducto[x]=scanner.nextInt();
    scanner.nextLine();
 }
System.out.println("ingrese el nombre del producto a encontrar");
String target = scanner.nextLine();
int resultado= linearSearch(producto,target);
if (resultado != -1) {
    System.out.println("producto encontrado en el inventario:" +resultado);
} else{
    System.out.println("Producto no enconrado en el inventario");
}
   scanner.close();
}
public static int linearSearch(String[] producto , String Target){
    for (int x= 0; x <producto.length; x++) {
    if (producto[x].equalsIgnoreCase(Target)) {
          return x;   
          }
       }  
        return -1;
    }
}