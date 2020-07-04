package shark.internal.p1903b;

import com.C1642a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: shark.internal.b.c */
public final class C48766c<T> {

    /* renamed from: a */
    public long[] f123940a = new long[0];

    /* renamed from: b */
    public T[] f123941b = new Object[0];

    /* renamed from: c */
    public boolean f123942c;

    /* renamed from: d */
    private int f123943d;

    /* renamed from: e */
    private int f123944e;

    /* renamed from: f */
    private int f123945f;

    /* renamed from: g */
    private double f123946g = 0.75d;

    /* renamed from: shark.internal.b.c$a */
    static final class C48767a extends Lambda implements C7561a<Pair<? extends Long, ? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C48766c f123947a;

        /* renamed from: b */
        final /* synthetic */ IntRef f123948b;

        /* renamed from: c */
        final /* synthetic */ int f123949c;

        C48767a(C48766c cVar, IntRef intRef, int i) {
            this.f123947a = cVar;
            this.f123948b = intRef;
            this.f123949c = i;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, T> invoke() {
            if (this.f123948b.element < this.f123949c) {
                this.f123948b.element++;
                while (this.f123948b.element < this.f123949c) {
                    long j = this.f123947a.f123940a[this.f123948b.element];
                    if (j != 0) {
                        Long valueOf = Long.valueOf(j);
                        T t = this.f123947a.f123941b[this.f123948b.element];
                        if (t == null) {
                            C7573i.m23580a();
                        }
                        return C7579l.m23633a(valueOf, t);
                    }
                    this.f123948b.element++;
                }
            }
            if (this.f123948b.element != this.f123949c || !this.f123947a.f123942c) {
                return null;
            }
            this.f123948b.element++;
            Long valueOf2 = Long.valueOf(0);
            T t2 = this.f123947a.f123941b[this.f123949c];
            if (t2 == null) {
                C7573i.m23580a();
            }
            return C7579l.m23633a(valueOf2, t2);
        }
    }

    /* renamed from: c */
    private int m150611c() {
        return this.f123943d + (this.f123942c ? 1 : 0);
    }

    /* renamed from: b */
    private boolean m150610b() {
        if (m150611c() == 0) {
            return true;
        }
        return false;
    }

    public C48766c() {
        m150605a(4);
    }

    /* renamed from: a */
    public final C7604g<Pair<Long, T>> mo123538a() {
        int i = this.f123944e + 1;
        IntRef intRef = new IntRef();
        intRef.element = -1;
        return C7605h.m23638a((C7561a<? extends T>) new C48767a<Object>(this, intRef, i));
    }

    /* renamed from: b */
    private static int m150608b(long j) {
        return C48763a.m150584a(j);
    }

    /* renamed from: a */
    private void m150605a(int i) {
        if (4 > this.f123945f) {
            long[] jArr = this.f123940a;
            T[] tArr = this.f123941b;
            m150609b(C48763a.f123929a.mo123527a(4, this.f123946g));
            if (!m150610b()) {
                m150607a(jArr, tArr);
            }
        }
    }

    /* renamed from: b */
    private final void m150609b(int i) {
        long[] jArr = this.f123940a;
        T[] tArr = this.f123941b;
        int i2 = i + 1;
        try {
            this.f123940a = new long[i2];
            this.f123941b = new Object[i2];
            this.f123945f = C48763a.m150585b(i, this.f123946g);
            this.f123944e = i - 1;
        } catch (OutOfMemoryError e) {
            this.f123940a = jArr;
            this.f123941b = tArr;
            Locale locale = Locale.ROOT;
            C7573i.m23582a((Object) locale, "Locale.ROOT");
            String str = "Not enough memory to allocate buffers for rehashing: %,d -> %,d";
            String a = C1642a.m8035a(locale, str, Arrays.copyOf(new Object[]{Integer.valueOf(this.f123944e + 1), Integer.valueOf(i)}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(a, e);
        }
    }

    /* renamed from: a */
    public final T mo123536a(long j) {
        if (j != 0) {
            long[] jArr = this.f123940a;
            int i = this.f123944e;
            int b = m150608b(j) & i;
            long j2 = jArr[b];
            while (j2 != 0) {
                if (j2 == j) {
                    return this.f123941b[b];
                }
                b = (b + 1) & i;
                j2 = jArr[b];
            }
            return null;
        } else if (this.f123942c) {
            return this.f123941b[this.f123944e + 1];
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private final void m150607a(long[] jArr, T[] tArr) {
        int i;
        long[] jArr2 = this.f123940a;
        T[] tArr2 = this.f123941b;
        int i2 = this.f123944e;
        int length = jArr.length - 1;
        jArr2[jArr2.length - 1] = jArr[length];
        tArr2[tArr2.length - 1] = tArr[length];
        while (true) {
            length--;
            if (length >= 0) {
                long j = jArr[length];
                if (j != 0) {
                    int b = m150608b(j);
                    while (true) {
                        i = b & i2;
                        if (jArr2[i] == 0) {
                            break;
                        }
                        b = i + 1;
                    }
                    jArr2[i] = j;
                    tArr2[i] = tArr[length];
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo123537a(long j, T t) {
        int i = this.f123944e;
        if (j == 0) {
            this.f123942c = true;
            int i2 = i + 1;
            T t2 = this.f123941b[i2];
            this.f123941b[i2] = t;
            return t2;
        }
        long[] jArr = this.f123940a;
        int b = m150608b(j) & i;
        long j2 = jArr[b];
        while (j2 != 0) {
            if (j2 == j) {
                T t3 = this.f123941b[b];
                this.f123941b[b] = t;
                return t3;
            }
            b = (b + 1) & i;
            j2 = jArr[b];
        }
        if (this.f123943d == this.f123945f) {
            m150606a(b, j, t);
        } else {
            jArr[b] = j;
            this.f123941b[b] = t;
        }
        this.f123943d++;
        return null;
    }

    /* renamed from: a */
    private final void m150606a(int i, long j, T t) {
        long[] jArr = this.f123940a;
        T[] tArr = this.f123941b;
        m150609b(C48763a.m150583a(this.f123944e + 1, m150611c(), this.f123946g));
        jArr[i] = j;
        tArr[i] = t;
        m150607a(jArr, tArr);
    }
}
