package Lab3.Actividades;

public class Contador {
    static int acumulador = 0;
    static int nContadores = 0;
    static int ultimoContador = 0;    
    final static int VALOR_INICIAL = 10; //e. Constante
    //private static int acumulador = 0; // 3.c
    private int valor;

    public static int acumulador() {
        return acumulador;
    }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
        //Contador.VALOR_INICIAL +=valor;
        //this.acumulador+=valor; //3.a.1 Cambiar en el constructor Contador
        //Contador.acumulador+=valor; //3.a.2 Cambiar en el constructor Contador
    }

    public Contador() {
        //this(Contador.VALOR_INICIAL); 
        //new Contador(Contador.VALOR_INICIAL);//e. Valor inicial
        this(Contador.VALOR_INICIAL);
        nContadores++;
        ultimoContador = valor;
    }

    public void inc() {
        valor++;
        //this.valor++; // 3.a.3 Cambiar en el metodo inc()
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}