package shark.internal.p1903b;

import com.C1642a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: shark.internal.b.b */
public final class C48764b {

    /* renamed from: a */
    public long[] f123930a = new long[0];

    /* renamed from: b */
    public long[] f123931b = new long[0];

    /* renamed from: c */
    public boolean f123932c;

    /* renamed from: d */
    private int f123933d;

    /* renamed from: e */
    private int f123934e;

    /* renamed from: f */
    private int f123935f;

    /* renamed from: g */
    private double f123936g = 0.75d;

    /* renamed from: shark.internal.b.b$a */
    static final class C48765a extends Lambda implements C7561a<Pair<? extends Long, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ C48764b f123937a;

        /* renamed from: b */
        final /* synthetic */ IntRef f123938b;

        /* renamed from: c */
        final /* synthetic */ int f123939c;

        C48765a(C48764b bVar, IntRef intRef, int i) {
            this.f123937a = bVar;
            this.f123938b = intRef;
            this.f123939c = i;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, Long> invoke() {
            if (this.f123938b.element < this.f123939c) {
                this.f123938b.element++;
                while (this.f123938b.element < this.f123939c) {
                    long j = this.f123937a.f123930a[this.f123938b.element];
                    if (j != 0) {
                        return C7579l.m23633a(Long.valueOf(j), Long.valueOf(this.f123937a.f123931b[this.f123938b.element]));
                    }
                    this.f123938b.element++;
                }
            }
            if (this.f123938b.element != this.f123939c || !this.f123937a.f123932c) {
                return null;
            }
            this.f123938b.element++;
            return C7579l.m23633a(Long.valueOf(0), Long.valueOf(this.f123937a.f123931b[this.f123939c]));
        }
    }

    /* renamed from: d */
    private int m150593d() {
        return this.f123933d + (this.f123932c ? 1 : 0);
    }

    /* renamed from: c */
    private boolean m150592c() {
        if (m150593d() == 0) {
            return true;
        }
        return false;
    }

    public C48764b() {
        m150590b(4);
    }

    /* renamed from: b */
    public final void mo123534b() {
        this.f123933d = 0;
        this.f123932c = false;
        m150591c(C48763a.f123929a.mo123527a(4, this.f123936g));
    }

    /* renamed from: a */
    public final C7604g<Pair<Long, Long>> mo123531a() {
        int i = this.f123934e + 1;
        IntRef intRef = new IntRef();
        intRef.element = -1;
        return C7605h.m23638a((C7561a<? extends T>) new C48765a<Object>(this, intRef, i));
    }

    /* renamed from: a */
    public final long mo123528a(int i) {
        return this.f123931b[i];
    }

    /* renamed from: d */
    private static int m150594d(long j) {
        return C48763a.m150584a(j);
    }

    /* renamed from: b */
    private void m150590b(int i) {
        if (4 > this.f123935f) {
            long[] jArr = this.f123930a;
            long[] jArr2 = this.f123931b;
            m150591c(C48763a.f123929a.mo123527a(4, this.f123936g));
            if (!m150592c()) {
                m150589a(jArr, jArr2);
            }
        }
    }

    /* renamed from: d */
    private final void m150595d(int i) {
        int i2;
        long j;
        long[] jArr = this.f123930a;
        long[] jArr2 = this.f123931b;
        int i3 = this.f123934e;
        while (true) {
            int i4 = 0;
            do {
                i4++;
                i2 = (i + i4) & i3;
                j = jArr[i2];
                if (j == 0) {
                    jArr[i] = 0;
                    jArr2[i] = 0;
                    this.f123933d--;
                    return;
                }
            } while (((i2 - m150594d(j)) & i3) < i4);
            jArr[i] = j;
            jArr2[i] = jArr2[i2];
            i = i2;
        }
    }

    /* renamed from: b */
    public final int mo123533b(long j) {
        if (j != 0) {
            long[] jArr = this.f123930a;
            int i = this.f123934e;
            int d = m150594d(j) & i;
            long j2 = jArr[d];
            while (j2 != 0) {
                if (j2 == j) {
                    return d;
                }
                d = (d + 1) & i;
                j2 = jArr[d];
            }
            return -1;
        } else if (this.f123932c) {
            return this.f123934e + 1;
        } else {
            return -1;
        }
    }

    /* renamed from: c */
    public final long mo123535c(long j) {
        boolean z;
        int b = mo123533b(j);
        if (b != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo123528a(b);
        }
        StringBuilder sb = new StringBuilder("Unknown key ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: c */
    private final void m150591c(int i) {
        long[] jArr = this.f123930a;
        long[] jArr2 = this.f123931b;
        int i2 = i + 1;
        try {
            this.f123930a = new long[i2];
            this.f123931b = new long[i2];
            this.f123935f = C48763a.m150585b(i, this.f123936g);
            this.f123934e = i - 1;
        } catch (OutOfMemoryError e) {
            this.f123930a = jArr;
            this.f123931b = jArr2;
            Locale locale = Locale.ROOT;
            C7573i.m23582a((Object) locale, "Locale.ROOT");
            String str = "Not enough memory to allocate buffers for rehashing: %,d -> %,d";
            String a = C1642a.m8035a(locale, str, Arrays.copyOf(new Object[]{Integer.valueOf(this.f123934e + 1), Integer.valueOf(i)}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(a, e);
        }
    }

    /* renamed from: a */
    public final long mo123529a(long j) {
        int i = this.f123934e;
        if (j == 0) {
            this.f123932c = false;
            int i2 = i + 1;
            long j2 = this.f123931b[i2];
            this.f123931b[i2] = 0;
            return j2;
        }
        long[] jArr = this.f123930a;
        int d = m150594d(j) & i;
        long j3 = jArr[d];
        while (j3 != 0) {
            if (j3 == j) {
                long j4 = this.f123931b[d];
                m150595d(d);
                return j4;
            }
            d = (d + 1) & i;
            j3 = jArr[d];
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo123532a(C7563m<? super Long, ? super Long, C7581n> mVar) {
        C7573i.m23587b(mVar, "block");
        int i = this.f123934e + 1;
        int i2 = -1;
        while (true) {
            if (i2 < i) {
                i2++;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    long j = this.f123930a[i2];
                    if (j != 0) {
                        mVar.invoke(Long.valueOf(j), Long.valueOf(this.f123931b[i2]));
                        break;
                    }
                    i2++;
                }
            }
            if (i2 == i && this.f123932c) {
                i2++;
                mVar.invoke(Long.valueOf(0), Long.valueOf(this.f123931b[i]));
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m150589a(long[] jArr, long[] jArr2) {
        int i;
        long[] jArr3 = this.f123930a;
        long[] jArr4 = this.f123931b;
        int i2 = this.f123934e;
        int length = jArr.length - 1;
        jArr3[jArr3.length - 1] = jArr[length];
        jArr4[jArr4.length - 1] = jArr2[length];
        while (true) {
            length--;
            if (length >= 0) {
                long j = jArr[length];
                if (j != 0) {
                    int d = m150594d(j);
                    while (true) {
                        i = d & i2;
                        if (jArr3[i] == 0) {
                            break;
                        }
                        d = i + 1;
                    }
                    jArr3[i] = j;
                    jArr4[i] = jArr2[length];
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final long mo123530a(long j, long j2) {
        int i = this.f123934e;
        if (j == 0) {
            this.f123932c = true;
            int i2 = i + 1;
            long j3 = this.f123931b[i2];
            this.f123931b[i2] = j2;
            return j3;
        }
        long[] jArr = this.f123930a;
        int d = m150594d(j) & i;
        long j4 = jArr[d];
        while (j4 != 0) {
            if (j4 == j) {
                long j5 = this.f123931b[d];
                this.f123931b[d] = j2;
                return j5;
            }
            d = (d + 1) & i;
            j4 = jArr[d];
        }
        if (this.f123933d == this.f123935f) {
            m150588a(d, j, j2);
        } else {
            jArr[d] = j;
            this.f123931b[d] = j2;
        }
        this.f123933d++;
        return 0;
    }

    /* renamed from: a */
    private final void m150588a(int i, long j, long j2) {
        long[] jArr = this.f123930a;
        long[] jArr2 = this.f123931b;
        m150591c(C48763a.m150583a(this.f123934e + 1, m150593d(), this.f123936g));
        jArr[i] = j;
        jArr2[i] = j2;
        m150589a(jArr, jArr2);
    }
}
