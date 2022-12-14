package Lab05.Actividades;

public class Motor {
    private int numMotor;
    private int revPorMin;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    public String toString() {
        return "NUMERO DE MOTOR " + numMotor + " REVOLUCIONES POR MINUTO " + revPorMin;
    }

}