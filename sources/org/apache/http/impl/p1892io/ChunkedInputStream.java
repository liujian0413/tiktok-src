package org.apache.http.impl.p1892io;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.p1893io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.ExceptionUtils;

/* renamed from: org.apache.http.impl.io.ChunkedInputStream */
public class ChunkedInputStream extends InputStream {
    private boolean bof = true;
    private final CharArrayBuffer buffer;
    private int chunkSize;
    private boolean closed;
    private boolean eof;
    private Header[] footers = new Header[0];

    /* renamed from: in */
    private SessionInputBuffer f123355in;
    private int pos;

    public void close() throws IOException {
        if (!this.closed) {
            try {
                if (!this.eof) {
                    exhaustInputStream(this);
                }
            } finally {
                this.eof = true;
                this.closed = true;
            }
        }
    }

    private void nextChunk() throws IOException {
        this.chunkSize = getChunkSize();
        if (this.chunkSize >= 0) {
            this.bof = false;
            this.pos = 0;
            if (this.chunkSize == 0) {
                this.eof = true;
                parseTrailerHeaders();
                return;
            }
            return;
        }
        throw new MalformedChunkCodingException("Negative chunk size");
    }

    private void parseTrailerHeaders() throws IOException {
        try {
            this.footers = AbstractMessageParser.parseHeaders(this.f123355in, -1, -1, null);
        } catch (HttpException e) {
            StringBuffer stringBuffer = new StringBuffer("Invalid footer: ");
            stringBuffer.append(e.getMessage());
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException(stringBuffer.toString());
            ExceptionUtils.initCause(malformedChunkCodingException, e);
            throw malformedChunkCodingException;
        }
    }

    public int read() throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.eof) {
            return -1;
        } else {
            if (this.pos >= this.chunkSize) {
                nextChunk();
                if (this.eof) {
                    return -1;
                }
            }
            int read = this.f123355in.read();
            if (read != -1) {
                this.pos++;
            }
            return read;
        }
    }

    private int getChunkSize() throws IOException {
        if (!this.bof) {
            int read = this.f123355in.read();
            int read2 = this.f123355in.read();
            if (!(read == 13 && read2 == 10)) {
                throw new MalformedChunkCodingException("CRLF expected at end of chunk");
            }
        }
        this.buffer.clear();
        if (this.f123355in.readLine(this.buffer) == -1) {
            return 0;
        }
        int indexOf = this.buffer.indexOf(59);
        if (indexOf < 0) {
            indexOf = this.buffer.length();
        }
        try {
            return Integer.parseInt(this.buffer.substringTrimmed(0, indexOf), 16);
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header");
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    static void exhaustInputStream(InputStream inputStream) throws IOException {
        do {
        } while (inputStream.read(new byte[PreloadTask.BYTE_UNIT_NUMBER]) >= 0);
    }

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        if (sessionInputBuffer != null) {
            this.f123355in = sessionInputBuffer;
            this.pos = 0;
            this.buffer = new CharArrayBuffer(16);
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.eof) {
            return -1;
        } else {
            if (this.pos >= this.chunkSize) {
                nextChunk();
                if (this.eof) {
                    return -1;
                }
            }
            int read = this.f123355in.read(bArr, i, Math.min(i2, this.chunkSize - this.pos));
            if (read != -1) {
                this.pos += read;
                return read;
            }
            throw new MalformedChunkCodingException("Truncated chunk");
        }
    }
}
