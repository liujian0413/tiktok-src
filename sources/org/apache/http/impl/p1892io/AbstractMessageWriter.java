package org.apache.http.impl.p1892io;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p1893io.HttpMessageWriter;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.AbstractMessageWriter */
public abstract class AbstractMessageWriter implements HttpMessageWriter {
    protected final CharArrayBuffer lineBuf;
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    /* access modifiers changed from: protected */
    public abstract void writeHeadLine(HttpMessage httpMessage) throws IOException;

    public void write(HttpMessage httpMessage) throws IOException, HttpException {
        if (httpMessage != null) {
            writeHeadLine(httpMessage);
            HeaderIterator headerIterator = httpMessage.headerIterator();
            while (headerIterator.hasNext()) {
                this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, (Header) headerIterator.next()));
            }
            this.lineBuf.clear();
            this.sessionBuffer.writeLine(this.lineBuf);
            return;
        }
        throw new IllegalArgumentException("HTTP message may not be null");
    }

    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter2, HttpParams httpParams) {
        if (sessionOutputBuffer != null) {
            this.sessionBuffer = sessionOutputBuffer;
            this.lineBuf = new CharArrayBuffer(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (lineFormatter2 == null) {
                lineFormatter2 = BasicLineFormatter.DEFAULT;
            }
            this.lineFormatter = lineFormatter2;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }
}
