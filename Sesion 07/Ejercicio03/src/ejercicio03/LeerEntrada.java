package ejercicio03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {

    private Reader stream;

    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }

    public char getChar() throws IOException {
        int c;
        do {
            c = this.stream.read();
        } while ((c == '\t' || c == ' ') && c != -1);
        return (char) c;
    }
}
