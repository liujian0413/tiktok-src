package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

public class BufferedHttpEntity extends HttpEntityWrapper {
    private final byte[] buffer;

    public boolean isRepeatable() {
        return true;
    }

    public long getContentLength() {
        if (this.buffer != null) {
            return (long) this.buffer.length;
        }
        return this.wrappedEntity.getContentLength();
    }

    public boolean isChunked() {
        if (this.buffer != null || !this.wrappedEntity.isChunked()) {
            return false;
        }
        return true;
    }

    public boolean isStreaming() {
        if (this.buffer != null || !this.wrappedEntity.isStreaming()) {
            return false;
        }
        return true;
    }

    public InputStream getContent() throws IOException {
        if (this.buffer != null) {
            return new ByteArrayInputStream(this.buffer);
        }
        return this.wrappedEntity.getContent();
    }

    public BufferedHttpEntity(HttpEntity httpEntity) throws IOException {
        super(httpEntity);
        if (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) {
            this.buffer = EntityUtils.toByteArray(httpEntity);
        } else {
            this.buffer = null;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        } else if (this.buffer != null) {
            outputStream.write(this.buffer);
        } else {
            this.wrappedEntity.writeTo(outputStream);
        }
    }
}
