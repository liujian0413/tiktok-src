package p1896pl.droidsonroids.gif;

import java.io.IOException;

/* renamed from: pl.droidsonroids.gif.GifIOException */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;
    private final String mErrnoMessage;
    public final GifError reason;

    public String getMessage() {
        if (this.mErrnoMessage == null) {
            return this.reason.getFormattedDescription();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.reason.getFormattedDescription());
        sb.append(": ");
        sb.append(this.mErrnoMessage);
        return sb.toString();
    }

    static GifIOException fromCode(int i) {
        if (i == GifError.NO_ERROR.errorCode) {
            return null;
        }
        return new GifIOException(i, null);
    }

    GifIOException(int i, String str) {
        this.reason = GifError.fromCode(i);
        this.mErrnoMessage = str;
    }
}
