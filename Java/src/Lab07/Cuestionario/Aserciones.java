package Lab07.Cuestionario;

public class Aserciones {
    /*private static int saldo;

    public Aserciones() {
        Aserciones.saldo = 100;
    }

    public static void main(String[] args) throws Exception {
        while (saldo > 0){
            saldo-=20;
        }
    }assert(saldo<=0);*/

    static int val=3;
    static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for(int i=0;i<10; i++){
            n=getnum();
            assert n>0; // fallará cuando n es 0
            System.out.println("n es "+n);
        }
    }
}
