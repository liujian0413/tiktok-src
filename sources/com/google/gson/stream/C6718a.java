package com.google.gson.stream;

import com.google.gson.internal.C6696e;
import com.google.gson.internal.bind.C6639c;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.gson.stream.a */
public class C6718a implements Closeable {

    /* renamed from: c */
    private static final char[] f19169c = ")]}'\n".toCharArray();

    /* renamed from: a */
    public boolean f19170a;

    /* renamed from: b */
    int f19171b;

    /* renamed from: d */
    private final Reader f19172d;

    /* renamed from: e */
    private final char[] f19173e = new char[PreloadTask.BYTE_UNIT_NUMBER];

    /* renamed from: f */
    private int f19174f;

    /* renamed from: g */
    private int f19175g;

    /* renamed from: h */
    private int f19176h;

    /* renamed from: i */
    private int f19177i;

    /* renamed from: j */
    private long f19178j;

    /* renamed from: k */
    private int f19179k;

    /* renamed from: l */
    private String f19180l;

    /* renamed from: m */
    private int[] f19181m = new int[32];

    /* renamed from: n */
    private int f19182n;

    /* renamed from: o */
    private String[] f19183o;

    /* renamed from: p */
    private int[] f19184p;

    static {
        C6696e.f19153a = new C6696e() {
            /* renamed from: a */
            public final void mo16123a(C6718a aVar) throws IOException {
                if (aVar instanceof C6639c) {
                    ((C6639c) aVar).mo16097o();
                    return;
                }
                int i = aVar.f19171b;
                if (i == 0) {
                    i = aVar.mo16168q();
                }
                if (i == 13) {
                    aVar.f19171b = 9;
                } else if (i == 12) {
                    aVar.f19171b = 8;
                } else if (i == 14) {
                    aVar.f19171b = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(aVar.mo16088f());
                    sb.append(aVar.mo16169r());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    /* renamed from: v */
    private void m20790v() throws IOException {
        if (!this.f19170a) {
            throw m20782b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public void close() throws IOException {
        this.f19171b = 0;
        this.f19181m[0] = 8;
        this.f19182n = 1;
        this.f19172d.close();
    }

    /* renamed from: e */
    public boolean mo16087e() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 2 || i == 4) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo16169r());
        return sb.toString();
    }

    /* renamed from: w */
    private void m20791w() throws IOException {
        char c;
        do {
            if (this.f19174f >= this.f19175g && !m20784b(1)) {
                break;
            }
            char[] cArr = this.f19173e;
            int i = this.f19174f;
            this.f19174f = i + 1;
            c = cArr[i];
            if (c == 10) {
                this.f19176h++;
                this.f19177i = this.f19174f;
                return;
            }
        } while (c != 13);
    }

    /* renamed from: y */
    private void m20793y() throws IOException {
        m20778a(true);
        this.f19174f--;
        if (this.f19174f + f19169c.length <= this.f19175g || m20784b(f19169c.length)) {
            int i = 0;
            while (i < f19169c.length) {
                if (this.f19173e[this.f19174f + i] == f19169c[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f19174f += f19169c.length;
        }
    }

    /* renamed from: b */
    public void mo16083b() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 4) {
            this.f19182n--;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f19171b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(mo16088f());
        sb.append(mo16169r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public void mo16092j() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 7) {
            this.f19171b = 0;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(mo16088f());
        sb.append(mo16169r());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final String mo16169r() {
        int i = this.f19176h + 1;
        int i2 = (this.f19174f - this.f19177i) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo16098p());
        return sb.toString();
    }

    /* renamed from: u */
    private void m20789u() throws IOException {
        do {
            int i = 0;
            while (this.f19174f + i < this.f19175g) {
                switch (this.f19173e[this.f19174f + i]) {
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case BaseNotice.TCM /*61*/:
                    case '\\':
                        m20790v();
                        break;
                    default:
                        i++;
                }
                this.f19174f += i;
                return;
            }
            this.f19174f += i;
        } while (m20784b(1));
    }

    /* renamed from: c */
    public void mo16084c() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 1) {
            m20779a(3);
            this.f19171b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(mo16088f());
        sb.append(mo16169r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public void mo16086d() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 2) {
            this.f19182n--;
            this.f19183o[this.f19182n] = null;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f19171b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(mo16088f());
        sb.append(mo16169r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public JsonToken mo16088f() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: g */
    public String mo16089g() throws IOException {
        String str;
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 14) {
            str = m20788t();
        } else if (i == 12) {
            str = m20783b('\'');
        } else if (i == 13) {
            str = m20783b('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(mo16088f());
            sb.append(mo16169r());
            throw new IllegalStateException(sb.toString());
        }
        this.f19171b = 0;
        this.f19183o[this.f19182n - 1] = str;
        return str;
    }

    /* renamed from: i */
    public boolean mo16091i() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 5) {
            this.f19171b = 0;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f19171b = 0;
            int[] iArr2 = this.f19184p;
            int i3 = this.f19182n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(mo16088f());
            sb.append(mo16169r());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: n */
    public void mo16096n() throws IOException {
        int i = 0;
        do {
            int i2 = this.f19171b;
            if (i2 == 0) {
                i2 = mo16168q();
            }
            if (i2 == 3) {
                m20779a(1);
                i++;
            } else if (i2 == 1) {
                m20779a(3);
                i++;
            } else if (i2 == 4) {
                this.f19182n--;
                i--;
            } else if (i2 == 2) {
                this.f19182n--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                m20789u();
            } else if (i2 == 8 || i2 == 12) {
                m20785c('\'');
            } else if (i2 == 9 || i2 == 13) {
                m20785c('\"');
            } else if (i2 == 16) {
                this.f19174f += this.f19179k;
            }
            this.f19171b = 0;
        } while (i != 0);
        int[] iArr = this.f19184p;
        int i3 = this.f19182n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f19183o[this.f19182n - 1] = TEVideoRecorder.FACE_BEAUTY_NULL;
    }

    /* renamed from: p */
    public String mo16098p() {
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        int i = this.f19182n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f19181m[i2]) {
                case 1:
                case 2:
                    sb.append('[');
                    sb.append(this.f19184p[i2]);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.f19183o[i2] == null) {
                        break;
                    } else {
                        sb.append(this.f19183o[i2]);
                        break;
                    }
            }
        }
        return sb.toString();
    }

    /* renamed from: o */
    private int mo16097o() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.f19173e[this.f19174f];
        if (c == 't' || c == 'T') {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
            str = POIService.INVALID_ID;
            i = 7;
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f19174f + i2 >= this.f19175g && !m20784b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f19173e[this.f19174f + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f19174f + length < this.f19175g || m20784b(length + 1)) && m20780a(this.f19173e[this.f19174f + length])) {
            return 0;
        }
        this.f19174f += length;
        this.f19171b = i;
        return i;
    }

    /* renamed from: t */
    private String m20788t() throws IOException {
        int i;
        String str;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            i = 0;
            while (true) {
                if (this.f19174f + i < this.f19175g) {
                    switch (this.f19173e[this.f19174f + i]) {
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case BaseNotice.TCM /*61*/:
                        case '\\':
                            m20790v();
                            break;
                        default:
                            i++;
                            break;
                    }
                } else if (i >= this.f19173e.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i, 16));
                    }
                    sb.append(this.f19173e, this.f19174f, i);
                    this.f19174f += i;
                    if (!m20784b(1)) {
                    }
                } else if (m20784b(i + 1)) {
                }
            }
        }
        i2 = i;
        if (sb == null) {
            str = new String(this.f19173e, this.f19174f, i2);
        } else {
            sb.append(this.f19173e, this.f19174f, i2);
            str = sb.toString();
        }
        this.f19174f += i2;
        return str;
    }

    /* renamed from: x */
    private char m20792x() throws IOException {
        int i;
        if (this.f19174f != this.f19175g || m20784b(1)) {
            char[] cArr = this.f19173e;
            int i2 = this.f19174f;
            this.f19174f = i2 + 1;
            char c = cArr[i2];
            if (c == 10) {
                this.f19176h++;
                this.f19177i = this.f19174f;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                switch (c) {
                    case 't':
                        return 9;
                    case 'u':
                        if (this.f19174f + 4 <= this.f19175g || m20784b(4)) {
                            char c2 = 0;
                            int i3 = this.f19174f;
                            int i4 = i3 + 4;
                            while (i3 < i4) {
                                char c3 = this.f19173e[i3];
                                char c4 = (char) (c2 << 4);
                                if (c3 >= '0' && c3 <= '9') {
                                    i = c3 - '0';
                                } else if (c3 >= 'a' && c3 <= 'f') {
                                    i = (c3 - 'a') + 10;
                                } else if (c3 < 'A' || c3 > 'F') {
                                    StringBuilder sb = new StringBuilder("\\u");
                                    sb.append(new String(this.f19173e, this.f19174f, 4));
                                    throw new NumberFormatException(sb.toString());
                                } else {
                                    i = (c3 - 'A') + 10;
                                }
                                c2 = (char) (c4 + i);
                                i3++;
                            }
                            this.f19174f += 4;
                            return c2;
                        }
                        throw m20782b("Unterminated escape sequence");
                    default:
                        throw m20782b("Invalid escape sequence");
                }
            }
            return c;
        }
        throw m20782b("Unterminated escape sequence");
    }

    /* renamed from: h */
    public String mo16090h() throws IOException {
        String str;
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 10) {
            str = m20788t();
        } else if (i == 8) {
            str = m20783b('\'');
        } else if (i == 9) {
            str = m20783b('\"');
        } else if (i == 11) {
            str = this.f19180l;
            this.f19180l = null;
        } else if (i == 15) {
            str = Long.toString(this.f19178j);
        } else if (i == 16) {
            str = new String(this.f19173e, this.f19174f, this.f19179k);
            this.f19174f += this.f19179k;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(mo16088f());
            sb.append(mo16169r());
            throw new IllegalStateException(sb.toString());
        }
        this.f19171b = 0;
        int[] iArr = this.f19184p;
        int i2 = this.f19182n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: k */
    public double mo16093k() throws IOException {
        char c;
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 15) {
            this.f19171b = 0;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f19178j;
        }
        if (i == 16) {
            this.f19180l = new String(this.f19173e, this.f19174f, this.f19179k);
            this.f19174f += this.f19179k;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f19180l = m20783b(c);
        } else if (i == 10) {
            this.f19180l = m20788t();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(mo16088f());
            sb.append(mo16169r());
            throw new IllegalStateException(sb.toString());
        }
        this.f19171b = 11;
        double parseDouble = Double.parseDouble(this.f19180l);
        if (this.f19170a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f19180l = null;
            this.f19171b = 0;
            int[] iArr2 = this.f19184p;
            int i3 = this.f19182n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo16169r());
        throw new MalformedJsonException(sb2.toString());
    }

    /* renamed from: l */
    public long mo16094l() throws IOException {
        char c;
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 15) {
            this.f19171b = 0;
            int[] iArr = this.f19184p;
            int i2 = this.f19182n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f19178j;
        }
        if (i == 16) {
            this.f19180l = new String(this.f19173e, this.f19174f, this.f19179k);
            this.f19174f += this.f19179k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f19180l = m20788t();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f19180l = m20783b(c);
            }
            try {
                long parseLong = Long.parseLong(this.f19180l);
                this.f19171b = 0;
                int[] iArr2 = this.f19184p;
                int i3 = this.f19182n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(mo16088f());
            sb.append(mo16169r());
            throw new IllegalStateException(sb.toString());
        }
        this.f19171b = 11;
        double parseDouble = Double.parseDouble(this.f19180l);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f19180l = null;
            this.f19171b = 0;
            int[] iArr3 = this.f19184p;
            int i4 = this.f19182n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder("Expected a long but was ");
        sb2.append(this.f19180l);
        sb2.append(mo16169r());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: m */
    public int mo16095m() throws IOException {
        char c;
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 15) {
            int i2 = (int) this.f19178j;
            if (this.f19178j == ((long) i2)) {
                this.f19171b = 0;
                int[] iArr = this.f19184p;
                int i3 = this.f19182n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.f19178j);
            sb.append(mo16169r());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f19180l = new String(this.f19173e, this.f19174f, this.f19179k);
            this.f19174f += this.f19179k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f19180l = m20788t();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f19180l = m20783b(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f19180l);
                this.f19171b = 0;
                int[] iArr2 = this.f19184p;
                int i4 = this.f19182n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(mo16088f());
            sb2.append(mo16169r());
            throw new IllegalStateException(sb2.toString());
        }
        this.f19171b = 11;
        double parseDouble = Double.parseDouble(this.f19180l);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f19180l = null;
            this.f19171b = 0;
            int[] iArr3 = this.f19184p;
            int i6 = this.f19182n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder("Expected an int but was ");
        sb3.append(this.f19180l);
        sb3.append(mo16169r());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m20787s() throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            char[] r1 = r0.f19173e
            int r2 = r0.f19174f
            int r3 = r0.f19175g
            r6 = 1
            r7 = 0
            r8 = r3
            r3 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r13 = 0
        L_0x0011:
            int r14 = r2 + r3
            r15 = 2
            if (r14 != r8) goto L_0x0026
            int r2 = r1.length
            if (r3 != r2) goto L_0x001a
            return r7
        L_0x001a:
            int r2 = r3 + 1
            boolean r2 = r0.m20784b(r2)
            if (r2 == 0) goto L_0x0097
            int r2 = r0.f19174f
            int r8 = r0.f19175g
        L_0x0026:
            int r14 = r2 + r3
            char r14 = r1[r14]
            r7 = 43
            r4 = 3
            r5 = 5
            if (r14 == r7) goto L_0x00ee
            r7 = 69
            if (r14 == r7) goto L_0x00e2
            r7 = 101(0x65, float:1.42E-43)
            if (r14 == r7) goto L_0x00e2
            switch(r14) {
                case 45: goto L_0x00d5;
                case 46: goto L_0x00cd;
                default: goto L_0x003b;
            }
        L_0x003b:
            r7 = 48
            if (r14 < r7) goto L_0x008f
            r7 = 57
            if (r14 <= r7) goto L_0x0044
            goto L_0x008f
        L_0x0044:
            if (r9 == r6) goto L_0x0084
            if (r9 != 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            if (r9 != r15) goto L_0x0074
            r16 = 0
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            r4 = 0
            return r4
        L_0x0053:
            r4 = 10
            long r4 = r4 * r11
            int r14 = r14 + -48
            long r14 = (long) r14
            long r4 = r4 - r14
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x006f
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r7 = 0
            goto L_0x0070
        L_0x006f:
            r7 = 1
        L_0x0070:
            r7 = r7 & r10
            r11 = r4
            r10 = r7
            goto L_0x007f
        L_0x0074:
            if (r9 != r4) goto L_0x0079
            r7 = 0
            r9 = 4
            goto L_0x008b
        L_0x0079:
            if (r9 == r5) goto L_0x0081
            r4 = 6
            if (r9 != r4) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r7 = 0
            goto L_0x008b
        L_0x0081:
            r7 = 0
            r9 = 7
            goto L_0x008b
        L_0x0084:
            int r14 = r14 + -48
            int r4 = -r14
            long r4 = (long) r4
            r11 = r4
            r7 = 0
            r9 = 2
        L_0x008b:
            r16 = 0
            goto L_0x00f5
        L_0x008f:
            boolean r1 = r0.m20780a(r14)
            if (r1 == 0) goto L_0x0097
            r1 = 0
            return r1
        L_0x0097:
            if (r9 != r15) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            r1 = -9223372036854775808
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x00a3
            if (r13 == 0) goto L_0x00bb
        L_0x00a3:
            r16 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00ab
            if (r13 != 0) goto L_0x00bb
        L_0x00ab:
            if (r13 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            long r11 = -r11
        L_0x00af:
            r0.f19178j = r11
            int r1 = r0.f19174f
            int r1 = r1 + r3
            r0.f19174f = r1
            r1 = 15
            r0.f19171b = r1
            return r1
        L_0x00bb:
            if (r9 == r15) goto L_0x00c6
            r1 = 4
            if (r9 == r1) goto L_0x00c6
            r1 = 7
            if (r9 != r1) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r7 = 0
            return r7
        L_0x00c6:
            r0.f19179k = r3
            r1 = 16
            r0.f19171b = r1
            return r1
        L_0x00cd:
            r7 = 0
            r16 = 0
            if (r9 != r15) goto L_0x00d4
            r9 = 3
            goto L_0x00f5
        L_0x00d4:
            return r7
        L_0x00d5:
            r4 = 6
            r7 = 0
            r16 = 0
            if (r9 != 0) goto L_0x00de
            r9 = 1
            r13 = 1
            goto L_0x00f5
        L_0x00de:
            if (r9 != r5) goto L_0x00e1
            goto L_0x00f4
        L_0x00e1:
            return r7
        L_0x00e2:
            r7 = 0
            r16 = 0
            if (r9 == r15) goto L_0x00ec
            r4 = 4
            if (r9 != r4) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            return r7
        L_0x00ec:
            r9 = 5
            goto L_0x00f5
        L_0x00ee:
            r4 = 6
            r7 = 0
            r16 = 0
            if (r9 != r5) goto L_0x00f9
        L_0x00f4:
            r9 = 6
        L_0x00f5:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x00f9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6718a.m20787s():int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final int mo16168q() throws IOException {
        int i = this.f19181m[this.f19182n - 1];
        if (i == 1) {
            this.f19181m[this.f19182n - 1] = 2;
        } else if (i == 2) {
            int a = m20778a(true);
            if (a != 44) {
                if (a == 59) {
                    m20790v();
                } else if (a == 93) {
                    this.f19171b = 4;
                    return 4;
                } else {
                    throw m20782b("Unterminated array");
                }
            }
        } else if (i == 3 || i == 5) {
            this.f19181m[this.f19182n - 1] = 4;
            if (i == 5) {
                int a2 = m20778a(true);
                if (a2 != 44) {
                    if (a2 == 59) {
                        m20790v();
                    } else if (a2 == 125) {
                        this.f19171b = 2;
                        return 2;
                    } else {
                        throw m20782b("Unterminated object");
                    }
                }
            }
            int a3 = m20778a(true);
            if (a3 == 34) {
                this.f19171b = 13;
                return 13;
            } else if (a3 == 39) {
                m20790v();
                this.f19171b = 12;
                return 12;
            } else if (a3 != 125) {
                m20790v();
                this.f19174f--;
                if (m20780a((char) a3)) {
                    this.f19171b = 14;
                    return 14;
                }
                throw m20782b("Expected name");
            } else if (i != 5) {
                this.f19171b = 2;
                return 2;
            } else {
                throw m20782b("Expected name");
            }
        } else if (i == 4) {
            this.f19181m[this.f19182n - 1] = 5;
            int a4 = m20778a(true);
            if (a4 != 58) {
                if (a4 == 61) {
                    m20790v();
                    if ((this.f19174f < this.f19175g || m20784b(1)) && this.f19173e[this.f19174f] == '>') {
                        this.f19174f++;
                    }
                } else {
                    throw m20782b("Expected ':'");
                }
            }
        } else if (i == 6) {
            if (this.f19170a) {
                m20793y();
            }
            this.f19181m[this.f19182n - 1] = 7;
        } else if (i == 7) {
            if (m20778a(false) == -1) {
                this.f19171b = 17;
                return 17;
            }
            m20790v();
            this.f19174f--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m20778a(true);
        if (a5 == 34) {
            this.f19171b = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f19171b = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        this.f19174f--;
                        int o = mo16097o();
                        if (o != 0) {
                            return o;
                        }
                        int s = m20787s();
                        if (s != 0) {
                            return s;
                        }
                        if (m20780a(this.f19173e[this.f19174f])) {
                            m20790v();
                            this.f19171b = 10;
                            return 10;
                        }
                        throw m20782b("Expected value");
                    }
                    this.f19171b = 1;
                    return 1;
                } else if (i == 1) {
                    this.f19171b = 4;
                    return 4;
                }
            }
            if (i == 1 || i == 2) {
                m20790v();
                this.f19174f--;
                this.f19171b = 7;
                return 7;
            }
            throw m20782b("Unexpected value");
        } else {
            m20790v();
            this.f19171b = 8;
            return 8;
        }
    }

    /* renamed from: a */
    public void mo16082a() throws IOException {
        int i = this.f19171b;
        if (i == 0) {
            i = mo16168q();
        }
        if (i == 3) {
            m20779a(1);
            this.f19184p[this.f19182n - 1] = 0;
            this.f19171b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(mo16088f());
        sb.append(mo16169r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private IOException m20782b(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo16169r());
        throw new MalformedJsonException(sb.toString());
    }

    public C6718a(Reader reader) {
        int[] iArr = this.f19181m;
        int i = this.f19182n;
        this.f19182n = i + 1;
        iArr[i] = 6;
        this.f19183o = new String[32];
        this.f19184p = new int[32];
        if (reader != null) {
            this.f19172d = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    private void m20779a(int i) {
        if (this.f19182n == this.f19181m.length) {
            int[] iArr = new int[(this.f19182n * 2)];
            int[] iArr2 = new int[(this.f19182n * 2)];
            String[] strArr = new String[(this.f19182n * 2)];
            System.arraycopy(this.f19181m, 0, iArr, 0, this.f19182n);
            System.arraycopy(this.f19184p, 0, iArr2, 0, this.f19182n);
            System.arraycopy(this.f19183o, 0, strArr, 0, this.f19182n);
            this.f19181m = iArr;
            this.f19184p = iArr2;
            this.f19183o = strArr;
        }
        int[] iArr3 = this.f19181m;
        int i2 = this.f19182n;
        this.f19182n = i2 + 1;
        iArr3[i2] = i;
    }

    /* renamed from: c */
    private void m20785c(char c) throws IOException {
        char[] cArr = this.f19173e;
        do {
            int i = this.f19174f;
            int i2 = this.f19175g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f19174f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f19174f = i3;
                    m20792x();
                    i = this.f19174f;
                    i2 = this.f19175g;
                } else {
                    if (c2 == 10) {
                        this.f19176h++;
                        this.f19177i = i3;
                    }
                    i = i3;
                }
            }
            this.f19174f = i;
        } while (m20784b(1));
        throw m20782b("Unterminated string");
    }

    /* renamed from: a */
    private boolean m20780a(char c) throws IOException {
        switch (c) {
            case 9:
            case 10:
            case 12:
            case 13:
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case BaseNotice.TCM /*61*/:
            case '\\':
                m20790v();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m20784b(int i) throws IOException {
        char[] cArr = this.f19173e;
        this.f19177i -= this.f19174f;
        if (this.f19175g != this.f19174f) {
            this.f19175g -= this.f19174f;
            System.arraycopy(cArr, this.f19174f, cArr, 0, this.f19175g);
        } else {
            this.f19175g = 0;
        }
        this.f19174f = 0;
        do {
            int read = this.f19172d.read(cArr, this.f19175g, cArr.length - this.f19175g);
            if (read == -1) {
                return false;
            }
            this.f19175g += read;
            if (this.f19176h == 0 && this.f19177i == 0 && this.f19175g > 0 && cArr[0] == 65279) {
                this.f19174f++;
                this.f19177i++;
                i++;
            }
        } while (this.f19175g < i);
        return true;
    }

    /* renamed from: a */
    private int m20778a(boolean z) throws IOException {
        char[] cArr = this.f19173e;
        int i = this.f19174f;
        int i2 = this.f19175g;
        while (true) {
            if (i == i2) {
                this.f19174f = i;
                if (m20784b(1)) {
                    i = this.f19174f;
                    i2 = this.f19175g;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(mo16169r());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f19176h++;
                this.f19177i = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f19174f = i3;
                    if (i3 == i2) {
                        this.f19174f--;
                        boolean b = m20784b(2);
                        this.f19174f++;
                        if (!b) {
                            return c;
                        }
                    }
                    m20790v();
                    char c2 = cArr[this.f19174f];
                    if (c2 == '*') {
                        this.f19174f++;
                        if (m20781a("*/")) {
                            i = this.f19174f + 2;
                            i2 = this.f19175g;
                        } else {
                            throw m20782b("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f19174f++;
                        m20791w();
                        i = this.f19174f;
                        i2 = this.f19175g;
                    }
                } else if (c == '#') {
                    this.f19174f = i3;
                    m20790v();
                    m20791w();
                    i = this.f19174f;
                    i2 = this.f19175g;
                } else {
                    this.f19174f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private String m20783b(char c) throws IOException {
        char[] cArr = this.f19173e;
        StringBuilder sb = null;
        do {
            int i = this.f19174f;
            int i2 = this.f19175g;
            int i3 = i;
            while (i < i2) {
                int i4 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f19174f = i4;
                    int i5 = (i4 - i3) - 1;
                    if (sb == null) {
                        return new String(cArr, i3, i5);
                    }
                    sb.append(cArr, i3, i5);
                    return sb.toString();
                } else if (c2 == '\\') {
                    this.f19174f = i4;
                    int i6 = (i4 - i3) - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                    }
                    sb.append(cArr, i3, i6);
                    sb.append(m20792x());
                    i3 = this.f19174f;
                    i2 = this.f19175g;
                    i = i3;
                } else {
                    if (c2 == 10) {
                        this.f19176h++;
                        this.f19177i = i4;
                    }
                    i = i4;
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i3) * 2, 16));
            }
            sb.append(cArr, i3, i - i3);
            this.f19174f = i;
        } while (m20784b(1));
        throw m20782b("Unterminated string");
    }

    /* renamed from: a */
    private boolean m20781a(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f19174f + length > this.f19175g && !m20784b(length)) {
                return false;
            }
            if (this.f19173e[this.f19174f] == 10) {
                this.f19176h++;
                this.f19177i = this.f19174f + 1;
            } else {
                while (i < length) {
                    if (this.f19173e[this.f19174f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f19174f++;
        }
    }
}
