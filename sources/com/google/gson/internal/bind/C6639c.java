package com.google.gson.internal.bind;

import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6710l;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.JsonToken;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.gson.internal.bind.c */
public final class C6639c extends C6718a {

    /* renamed from: c */
    private static final Reader f19051c = new Reader() {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: d */
    private static final Object f19052d = new Object();

    /* renamed from: e */
    private Object[] f19053e = new Object[32];

    /* renamed from: f */
    private int f19054f;

    /* renamed from: g */
    private String[] f19055g = new String[32];

    /* renamed from: h */
    private int[] f19056h = new int[32];

    /* renamed from: s */
    private Object m20590s() {
        return this.f19053e[this.f19054f - 1];
    }

    public final void close() throws IOException {
        this.f19053e = new Object[]{f19052d};
        this.f19054f = 1;
    }

    /* renamed from: e */
    public final boolean mo16087e() throws IOException {
        JsonToken f = mo16088f();
        if (f == JsonToken.END_OBJECT || f == JsonToken.END_ARRAY) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: t */
    private Object m20591t() {
        Object[] objArr = this.f19053e;
        int i = this.f19054f - 1;
        this.f19054f = i;
        Object obj = objArr[i];
        this.f19053e[this.f19054f] = null;
        return obj;
    }

    /* renamed from: u */
    private String m20592u() {
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(mo16098p());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo16082a() throws IOException {
        m20588a(JsonToken.BEGIN_ARRAY);
        m20589a((Object) ((C6609h) m20590s()).iterator());
        this.f19056h[this.f19054f - 1] = 0;
    }

    /* renamed from: b */
    public final void mo16083b() throws IOException {
        m20588a(JsonToken.END_ARRAY);
        m20591t();
        m20591t();
        if (this.f19054f > 0) {
            int[] iArr = this.f19056h;
            int i = this.f19054f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: c */
    public final void mo16084c() throws IOException {
        m20588a(JsonToken.BEGIN_OBJECT);
        m20589a((Object) ((C6711m) m20590s()).mo16143a().iterator());
    }

    /* renamed from: d */
    public final void mo16086d() throws IOException {
        m20588a(JsonToken.END_OBJECT);
        m20591t();
        m20591t();
        if (this.f19054f > 0) {
            int[] iArr = this.f19056h;
            int i = this.f19054f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: i */
    public final boolean mo16091i() throws IOException {
        m20588a(JsonToken.BOOLEAN);
        boolean h = ((C6712o) m20591t()).mo16004h();
        if (this.f19054f > 0) {
            int[] iArr = this.f19056h;
            int i = this.f19054f - 1;
            iArr[i] = iArr[i] + 1;
        }
        return h;
    }

    /* renamed from: j */
    public final void mo16092j() throws IOException {
        m20588a(JsonToken.NULL);
        m20591t();
        if (this.f19054f > 0) {
            int[] iArr = this.f19056h;
            int i = this.f19054f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: g */
    public final String mo16089g() throws IOException {
        m20588a(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) m20590s()).next();
        String str = (String) entry.getKey();
        this.f19055g[this.f19054f - 1] = str;
        m20589a(entry.getValue());
        return str;
    }

    /* renamed from: n */
    public final void mo16096n() throws IOException {
        if (mo16088f() == JsonToken.NAME) {
            mo16089g();
            this.f19055g[this.f19054f - 2] = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            m20591t();
            if (this.f19054f > 0) {
                this.f19055g[this.f19054f - 1] = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
        }
        if (this.f19054f > 0) {
            int[] iArr = this.f19056h;
            int i = this.f19054f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: o */
    public final void mo16097o() throws IOException {
        m20588a(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) m20590s()).next();
        m20589a(entry.getValue());
        m20589a((Object) new C6712o((String) entry.getKey()));
    }

    /* renamed from: h */
    public final String mo16090h() throws IOException {
        JsonToken f = mo16088f();
        if (f == JsonToken.STRING || f == JsonToken.NUMBER) {
            String c = ((C6712o) m20591t()).mo15998c();
            if (this.f19054f > 0) {
                int[] iArr = this.f19056h;
                int i = this.f19054f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.STRING);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m20592u());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public final double mo16093k() throws IOException {
        JsonToken f = mo16088f();
        if (f == JsonToken.NUMBER || f == JsonToken.STRING) {
            double d = ((C6712o) m20590s()).mo15999d();
            if (this.f19170a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                m20591t();
                if (this.f19054f > 0) {
                    int[] iArr = this.f19056h;
                    int i = this.f19054f - 1;
                    iArr[i] = iArr[i] + 1;
                }
                return d;
            }
            StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
            sb.append(d);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(JsonToken.NUMBER);
        sb2.append(" but was ");
        sb2.append(f);
        sb2.append(m20592u());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: l */
    public final long mo16094l() throws IOException {
        JsonToken f = mo16088f();
        if (f == JsonToken.NUMBER || f == JsonToken.STRING) {
            long f2 = ((C6712o) m20590s()).mo16002f();
            m20591t();
            if (this.f19054f > 0) {
                int[] iArr = this.f19056h;
                int i = this.f19054f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return f2;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m20592u());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public final int mo16095m() throws IOException {
        JsonToken f = mo16088f();
        if (f == JsonToken.NUMBER || f == JsonToken.STRING) {
            int g = ((C6712o) m20590s()).mo16003g();
            m20591t();
            if (this.f19054f > 0) {
                int[] iArr = this.f19056h;
                int i = this.f19054f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return g;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m20592u());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public final String mo16098p() {
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        int i = 0;
        while (i < this.f19054f) {
            if (this.f19053e[i] instanceof C6609h) {
                i++;
                if (this.f19053e[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f19056h[i]);
                    sb.append(']');
                }
            } else if (this.f19053e[i] instanceof C6711m) {
                i++;
                if (this.f19053e[i] instanceof Iterator) {
                    sb.append('.');
                    if (this.f19055g[i] != null) {
                        sb.append(this.f19055g[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final JsonToken mo16088f() throws IOException {
        while (this.f19054f != 0) {
            Object s = m20590s();
            if (s instanceof Iterator) {
                boolean z = this.f19053e[this.f19054f - 2] instanceof C6711m;
                Iterator it = (Iterator) s;
                if (it.hasNext()) {
                    if (z) {
                        return JsonToken.NAME;
                    }
                    m20589a(it.next());
                } else if (z) {
                    return JsonToken.END_OBJECT;
                } else {
                    return JsonToken.END_ARRAY;
                }
            } else if (s instanceof C6711m) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (s instanceof C6609h) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (s instanceof C6712o) {
                    C6712o oVar = (C6712o) s;
                    if (oVar.mo16160r()) {
                        return JsonToken.STRING;
                    }
                    if (oVar.mo16156a()) {
                        return JsonToken.BOOLEAN;
                    }
                    if (oVar.mo16159q()) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (s instanceof C6710l) {
                    return JsonToken.NULL;
                } else {
                    if (s == f19052d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return JsonToken.END_DOCUMENT;
    }

    public C6639c(C6709k kVar) {
        super(f19051c);
        m20589a((Object) kVar);
    }

    /* renamed from: a */
    private void m20588a(JsonToken jsonToken) throws IOException {
        if (mo16088f() != jsonToken) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(mo16088f());
            sb.append(m20592u());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m20589a(Object obj) {
        if (this.f19054f == this.f19053e.length) {
            Object[] objArr = new Object[(this.f19054f * 2)];
            int[] iArr = new int[(this.f19054f * 2)];
            String[] strArr = new String[(this.f19054f * 2)];
            System.arraycopy(this.f19053e, 0, objArr, 0, this.f19054f);
            System.arraycopy(this.f19056h, 0, iArr, 0, this.f19054f);
            System.arraycopy(this.f19055g, 0, strArr, 0, this.f19054f);
            this.f19053e = objArr;
            this.f19056h = iArr;
            this.f19055g = strArr;
        }
        Object[] objArr2 = this.f19053e;
        int i = this.f19054f;
        this.f19054f = i + 1;
        objArr2[i] = obj;
    }
}
