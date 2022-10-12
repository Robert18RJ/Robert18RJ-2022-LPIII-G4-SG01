package Lab07.Ejercicios;

public class prin {
    public static void main(String[] args) throws Enumero, Esalida, Eblanco, Evocal{

    LeerEntrada leerEntrada = new LeerEntrada(new InputStreamReader(System.in));
    char c = leerEntrada.getChar();
    System.out.println(c);
    procesar(c);
    }

    public static void procesar(char c) throws Enumero, Esalida, Eblanco, Evocal{
        switch (c){
            case 'A':
                System.out.println("A");
                break;
}

