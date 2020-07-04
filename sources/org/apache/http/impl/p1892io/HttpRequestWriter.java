package org.apache.http.impl.p1892io;

import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.message.LineFormatter;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

/* renamed from: org.apache.http.impl.io.HttpRequestWriter */
public class HttpRequestWriter extends AbstractMessageWriter {
    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpMessage httpMessage) throws IOException {
        this.lineFormatter.formatRequestLine(this.lineBuf, ((HttpRequest) httpMessage).getRequestLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }

    public HttpRequestWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }
}
