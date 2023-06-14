public class Main {
    public static void main(String[] args) {
        String str = "To jest przykładowy łańcuch z spacjami.";
        
        
        String withoutSpaces = str.replaceAll(" ", "");
        
        System.out.println("Oryginalny łańcuch: " + str);
        System.out.println("Łańcuch bez spacji: " + withoutSpaces);
    }
}