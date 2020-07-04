package org.apache.http.entity;

import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public abstract class AbstractHttpEntity implements HttpEntity {
    protected boolean chunked;
    protected Header contentEncoding;
    protected Header contentType;

    protected AbstractHttpEntity() {
    }

    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    public Header getContentType() {
        return this.contentType;
    }

    public boolean isChunked() {
        return this.chunked;
    }

    public void consumeContent() throws IOException, UnsupportedOperationException {
        if (isStreaming()) {
            throw new UnsupportedOperationException("streaming entity does not implement consumeContent()");
        }
    }

    public void setChunked(boolean z) {
        this.chunked = z;
    }

    public void setContentEncoding(Header header) {
        this.contentEncoding = header;
    }

    public void setContentType(Header header) {
        this.contentType = header;
    }

    public void setContentEncoding(String str) {
        BasicHeader basicHeader;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Encoding", str);
        } else {
            basicHeader = null;
        }
        setContentEncoding((Header) basicHeader);
    }

    public void setContentType(String str) {
        BasicHeader basicHeader;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Type", str);
        } else {
            basicHeader = null;
        }
        setContentType((Header) basicHeader);
    }
}
