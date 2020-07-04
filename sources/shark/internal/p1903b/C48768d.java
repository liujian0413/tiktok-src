package shark.internal.p1903b;

import com.C1642a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.b.d */
public final class C48768d {

    /* renamed from: a */
    private long[] f123950a = new long[0];

    /* renamed from: b */
    private int f123951b;

    /* renamed from: c */
    private int f123952c;

    /* renamed from: d */
    private int f123953d;

    /* renamed from: e */
    private boolean f123954e;

    /* renamed from: f */
    private final double f123955f = 0.75d;

    /* renamed from: a */
    private int m150616a() {
        return this.f123951b + (this.f123954e ? 1 : 0);
    }

    public C48768d() {
        m150617a(4);
    }

    /* renamed from: c */
    private static int m150621c(long j) {
        return C48763a.m150584a(j);
    }

    /* renamed from: a */
    private void m150617a(int i) {
        if (4 > this.f123953d) {
            long[] jArr = this.f123950a;
            m150620b(C48763a.f123929a.mo123527a(4, this.f123955f));
            if (m150616a() != 0) {
                m150619a(jArr);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo123540b(long j) {
        if (j == 0) {
            return this.f123954e;
        }
        long[] jArr = this.f123950a;
        int i = this.f123952c;
        int c = m150621c(j) & i;
        long j2 = jArr[c];
        while (j2 != 0) {
            if (j2 == j) {
                return true;
            }
            c = (c + 1) & i;
            j2 = jArr[c];
        }
        return false;
    }

    /* renamed from: a */
    private final void m150619a(long[] jArr) {
        int i;
        long[] jArr2 = this.f123950a;
        int i2 = this.f123952c;
        int length = jArr.length - 1;
        while (true) {
            length--;
            if (length >= 0) {
                long j = jArr[length];
                if (j != 0) {
                    int c = m150621c(j);
                    while (true) {
                        i = c & i2;
                        if (jArr2[i] == 0) {
                            break;
                        }
                        c = i + 1;
                    }
                    jArr2[i] = j;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private final void m150620b(int i) {
        long[] jArr = this.f123950a;
        try {
            this.f123950a = new long[(i + 1)];
            this.f123953d = C48763a.m150585b(i, this.f123955f);
            this.f123952c = i - 1;
        } catch (OutOfMemoryError e) {
            this.f123950a = jArr;
            Locale locale = Locale.ROOT;
            C7573i.m23582a((Object) locale, "Locale.ROOT");
            String str = "Not enough memory to allocate buffers for rehashing: %,d -> %,d";
            String a = C1642a.m8035a(locale, str, Arrays.copyOf(new Object[]{Integer.valueOf(m150616a()), Integer.valueOf(i)}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(a, e);
        }
    }

    /* renamed from: a */
    public final boolean mo123539a(long j) {
        if (j == 0) {
            boolean z = !this.f123954e;
            this.f123954e = true;
            return z;
        }
        long[] jArr = this.f123950a;
        int i = this.f123952c;
        int c = m150621c(j) & i;
        long j2 = jArr[c];
        while (j2 != 0) {
            if (j2 == j) {
                return false;
            }
            c = (c + 1) & i;
            j2 = jArr[c];
        }
        if (this.f123951b == this.f123953d) {
            m150618a(c, j);
        } else {
            jArr[c] = j;
        }
        this.f123951b++;
        return true;
    }

    /* renamed from: a */
    private final void m150618a(int i, long j) {
        long[] jArr = this.f123950a;
        m150620b(C48763a.m150583a(this.f123952c + 1, m150616a(), this.f123955f));
        jArr[i] = j;
        m150619a(jArr);
    }
}
