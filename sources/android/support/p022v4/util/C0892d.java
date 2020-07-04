package android.support.p022v4.util;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Writer;

/* renamed from: android.support.v4.util.d */
public final class C0892d extends Writer {

    /* renamed from: a */
    private final String f3125a;

    /* renamed from: b */
    private StringBuilder f3126b = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);

    public final void close() {
        m3791a();
    }

    public final void flush() {
        m3791a();
    }

    /* renamed from: a */
    private void m3791a() {
        if (this.f3126b.length() > 0) {
            this.f3126b.delete(0, this.f3126b.length());
        }
    }

    public C0892d(String str) {
        this.f3125a = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m3791a();
            } else {
                this.f3126b.append(c);
            }
        }
    }
}
