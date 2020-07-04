package org.apache.http.impl.conn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;

public class Wire {
    private final Log log;

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public Wire(Log log2) {
        this.log = log2;
    }

    public void input(int i) throws IOException {
        input(new byte[]{(byte) i});
    }

    public void output(int i) throws IOException {
        output(new byte[]{(byte) i});
    }

    public void input(String str) throws IOException {
        if (str != null) {
            input(str.getBytes());
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    public void output(String str) throws IOException {
        if (str != null) {
            output(str.getBytes());
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    public void input(byte[] bArr) throws IOException {
        if (bArr != null) {
            wire("<< ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    public void output(byte[] bArr) throws IOException {
        if (bArr != null) {
            wire(">> ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    private void wire(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.log.debug(sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.log.debug(sb.toString());
        }
    }

    public void input(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            wire("<< ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    public void output(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            wire(">> ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }
}
