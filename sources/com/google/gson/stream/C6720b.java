package com.google.gson.stream;

import com.C1642a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.stream.b */
public class C6720b implements Closeable, Flushable {

    /* renamed from: d */
    private static final String[] f19185d = new String[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];

    /* renamed from: e */
    private static final String[] f19186e;

    /* renamed from: a */
    public boolean f19187a;

    /* renamed from: b */
    public boolean f19188b;

    /* renamed from: c */
    public boolean f19189c;

    /* renamed from: f */
    private final Writer f19190f;

    /* renamed from: g */
    private int[] f19191g = new int[32];

    /* renamed from: h */
    private int f19192h;

    /* renamed from: i */
    private String f19193i;

    /* renamed from: j */
    private String f19194j;

    /* renamed from: k */
    private String f19195k;

    /* renamed from: a */
    public C6720b mo16107a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f19195k != null) {
            throw new IllegalStateException();
        } else if (this.f19192h != 0) {
            this.f19195k = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C6720b mo16108a(boolean z) throws IOException {
        m20818g();
        m20821j();
        this.f19190f.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: g */
    private void m20818g() throws IOException {
        if (this.f19195k != null) {
            m20820i();
            m20817d(this.f19195k);
            this.f19195k = null;
        }
    }

    /* renamed from: c */
    public C6720b mo16111c() throws IOException {
        return m20813a(1, 2, "]");
    }

    /* renamed from: d */
    public C6720b mo16113d() throws IOException {
        m20818g();
        return m20814a(3, "{");
    }

    /* renamed from: e */
    public C6720b mo16114e() throws IOException {
        return m20813a(3, 5, "}");
    }

    /* renamed from: a */
    private int mo16102a() {
        if (this.f19192h != 0) {
            return this.f19191g[this.f19192h - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    private void m20819h() throws IOException {
        if (this.f19193i != null) {
            this.f19190f.write("\n");
            int i = this.f19192h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f19190f.write(this.f19193i);
            }
        }
    }

    /* renamed from: b */
    public C6720b mo16109b() throws IOException {
        m20818g();
        return m20814a(1, "[");
    }

    public void close() throws IOException {
        this.f19190f.close();
        int i = this.f19192h;
        if (i > 1 || (i == 1 && this.f19191g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19192h = 0;
    }

    /* renamed from: f */
    public C6720b mo16115f() throws IOException {
        if (this.f19195k != null) {
            if (this.f19189c) {
                m20818g();
            } else {
                this.f19195k = null;
                return this;
            }
        }
        m20821j();
        this.f19190f.write(TEVideoRecorder.FACE_BEAUTY_NULL);
        return this;
    }

    public void flush() throws IOException {
        if (this.f19192h != 0) {
            this.f19190f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    private void m20820i() throws IOException {
        int a = mo16102a();
        if (a == 5) {
            this.f19190f.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m20819h();
        m20816b(4);
    }

    /* renamed from: j */
    private void m20821j() throws IOException {
        switch (mo16102a()) {
            case 1:
                m20816b(2);
                m20819h();
                return;
            case 2:
                this.f19190f.append(',');
                m20819h();
                return;
            case 4:
                this.f19190f.append(this.f19194j);
                m20816b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f19187a) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m20816b(7);
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f19185d[i] = C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f19185d[34] = "\\\"";
        f19185d[92] = "\\\\";
        f19185d[9] = "\\t";
        f19185d[8] = "\\b";
        f19185d[10] = "\\n";
        f19185d[13] = "\\r";
        f19185d[12] = "\\f";
        String[] strArr = (String[]) f19185d.clone();
        f19186e = strArr;
        strArr[60] = "\\u003c";
        f19186e[62] = "\\u003e";
        f19186e[38] = "\\u0026";
        f19186e[61] = "\\u003d";
        f19186e[39] = "\\u0027";
    }

    /* renamed from: b */
    private void m20816b(int i) {
        this.f19191g[this.f19192h - 1] = i;
    }

    /* renamed from: c */
    public final void mo16170c(String str) {
        if (str.length() == 0) {
            this.f19193i = null;
            this.f19194j = ":";
            return;
        }
        this.f19193i = str;
        this.f19194j = ": ";
    }

    public C6720b(Writer writer) {
        m20815a(6);
        this.f19194j = ":";
        this.f19189c = true;
        if (writer != null) {
            this.f19190f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: b */
    public C6720b mo16110b(String str) throws IOException {
        if (str == null) {
            return mo16115f();
        }
        m20818g();
        m20821j();
        m20817d(str);
        return this;
    }

    /* renamed from: a */
    private void m20815a(int i) {
        if (this.f19192h == this.f19191g.length) {
            int[] iArr = new int[(this.f19192h * 2)];
            System.arraycopy(this.f19191g, 0, iArr, 0, this.f19192h);
            this.f19191g = iArr;
        }
        int[] iArr2 = this.f19191g;
        int i2 = this.f19192h;
        this.f19192h = i2 + 1;
        iArr2[i2] = i;
    }

    /* renamed from: d */
    private void m20817d(String str) throws IOException {
        String[] strArr;
        String str2;
        if (this.f19188b) {
            strArr = f19186e;
        } else {
            strArr = f19185d;
        }
        this.f19190f.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f19190f.write(str, i, i2 - i);
            }
            this.f19190f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f19190f.write(str, i, length - i);
        }
        this.f19190f.write("\"");
    }

    /* renamed from: a */
    public C6720b mo16103a(double d) throws IOException {
        m20818g();
        if (this.f19187a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m20821j();
            this.f19190f.append(Double.toString(d));
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C6720b mo16104a(long j) throws IOException {
        m20818g();
        m20821j();
        this.f19190f.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C6720b mo16105a(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            return mo16115f();
        }
        m20818g();
        m20821j();
        Writer writer = this.f19190f;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: a */
    public C6720b mo16106a(Number number) throws IOException {
        if (number == null) {
            return mo16115f();
        }
        m20818g();
        String obj = number.toString();
        if (this.f19187a || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m20821j();
            this.f19190f.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private C6720b m20814a(int i, String str) throws IOException {
        m20821j();
        m20815a(i);
        this.f19190f.write(str);
        return this;
    }

    /* renamed from: a */
    private C6720b m20813a(int i, int i2, String str) throws IOException {
        int a = mo16102a();
        if (a != i2 && a != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f19195k == null) {
            this.f19192h--;
            if (a == i2) {
                m20819h();
            }
            this.f19190f.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.f19195k);
            throw new IllegalStateException(sb.toString());
        }
    }
}
