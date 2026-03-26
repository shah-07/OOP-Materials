package mainpackage.telemedicineappv2;

import java.io.*;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    public void writeStreamHeader() throws IOException {
        reset();
    }
}
