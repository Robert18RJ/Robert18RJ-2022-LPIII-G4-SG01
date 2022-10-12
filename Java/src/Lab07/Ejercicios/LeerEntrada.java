package Lab07.Ejercicios;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {
    private Reader stream;
    /*
     * @param
     * fuente la
     * fuente de datos
     */

    public LeerEntrada(InputStream Fuente) { // ingresa el valor para el char
        stream = new InputStreamReader(Fuente);
    }

    /*
     * @return el caracter escrito
     * 
     * @throws IOException
     */

    public char getChar() throws IOException { // convierte la entrada en un char
        return (char) this.stream.read(); // develve el char
    }
}
