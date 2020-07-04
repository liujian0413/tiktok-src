package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.p1893io.HttpTransportMetrics;
import org.apache.http.p1893io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

public class LoggingSessionInputBuffer implements SessionInputBuffer {

    /* renamed from: in */
    private final SessionInputBuffer f123354in;
    private final Wire wire;

    public HttpTransportMetrics getMetrics() {
        return this.f123354in.getMetrics();
    }

    public int read() throws IOException {
        int read = this.f123354in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    public boolean isDataAvailable(int i) throws IOException {
        return this.f123354in.isDataAvailable(i);
    }

    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int readLine = this.f123354in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            String str = new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine);
            Wire wire2 = this.wire;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            wire2.input(sb.toString());
        }
        return readLine;
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this.f123354in = sessionInputBuffer;
        this.wire = wire2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f123354in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }
}
