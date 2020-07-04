package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.p1893io.HttpTransportMetrics;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final SessionOutputBuffer out;
    private final Wire wire;

    public void flush() throws IOException {
        this.out.flush();
    }

    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        if (this.wire.enabled()) {
            this.wire.output(i);
        }
    }

    public void writeLine(String str) throws IOException {
        this.out.writeLine(str);
        if (this.wire.enabled()) {
            Wire wire2 = this.wire;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            wire2.output(sb.toString());
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        this.out.writeLine(charArrayBuffer);
        if (this.wire.enabled()) {
            String str = new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length());
            Wire wire2 = this.wire;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            wire2.output(sb.toString());
        }
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire2) {
        this.out = sessionOutputBuffer;
        this.wire = wire2;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        if (this.wire.enabled()) {
            this.wire.output(bArr, i, i2);
        }
    }
}
