package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;

public class BasicHttpResponse extends AbstractHttpMessage implements HttpResponse {
    private HttpEntity entity;
    private Locale locale;
    private ReasonPhraseCatalog reasonCatalog;
    private StatusLine statusline;

    public HttpEntity getEntity() {
        return this.entity;
    }

    public StatusLine getStatusLine() {
        return this.statusline;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.statusline.getProtocolVersion();
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }

    public BasicHttpResponse(StatusLine statusLine) {
        this(statusLine, null, null);
    }

    public BasicHttpResponse(StatusLine statusLine, ReasonPhraseCatalog reasonPhraseCatalog, Locale locale2) {
        if (statusLine != null) {
            this.statusline = statusLine;
            this.reasonCatalog = reasonPhraseCatalog;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            this.locale = locale2;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null.");
    }
}
