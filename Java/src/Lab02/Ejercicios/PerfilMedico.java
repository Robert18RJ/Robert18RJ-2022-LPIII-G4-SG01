package Java.src.Lab02.Ejercicios;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;    

    //Inicializar el objeto (constructor)
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }   
    
    public String getnombre() {
        return nombre;
    }    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getsexo() {
        return sexo;
    }    
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public int getdia() {
        return dia;
    }    
    public void setsexo(int dia) {
        this.dia = dia;
    }

    public int getmes() {
        return mes;
    }    
    public void setmes(int mes) {
        this.mes = mes;
    }

    public int getanio() {
        return anio;
    }    
    public void setanio(int anio) {
        this.anio = anio;
    }

    public double getaltura() {
        return altura;
    }    
    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getpeso() {
        return peso;
    }    
    public void setpeso(double peso) {
        this.peso = peso;
    }
        
    // toString convierte a los objetos en cadena
    @Override
    public String toString() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha nacimiento: " + dia + "/" + mes + "/" + anio);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Edad: " + edad());
        System.out.println("IMC: " + imc());
        return "FCM: " + frecuenciCardiaca();
    }

    // Funciones
    public int edad() {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }

    public int frecuenciCardiaca() {
        int fmc;
        fmc = 220 - edad();
        return fmc;
    }

    public double imc() {
        double imc;
        imc = peso / (altura * altura);
        return imc;
    }
}