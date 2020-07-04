package shark.internal;

import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: shark.internal.l */
public final class C48805l {

    /* renamed from: a */
    public final int f124061a;

    /* renamed from: b */
    public final int f124062b;

    /* renamed from: c */
    public final boolean f124063c;

    /* renamed from: d */
    public final int f124064d;

    /* renamed from: e */
    public final byte[] f124065e;

    /* renamed from: f */
    private final int f124066f;

    /* renamed from: shark.internal.l$a */
    static final class C48806a extends Lambda implements C7562b<Integer, Pair<? extends Long, ? extends C48758a>> {

        /* renamed from: a */
        final /* synthetic */ C48805l f124067a;

        C48806a(C48805l lVar) {
            this.f124067a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m150708a(((Number) obj).intValue());
        }

        /* renamed from: a */
        private Pair<Long, C48758a> m150708a(int i) {
            return C7579l.m23633a(Long.valueOf(this.f124067a.mo123565a(i)), new C48758a(this.f124067a.f124065e, (this.f124067a.f124062b * i) + this.f124067a.f124061a, this.f124067a.f124064d, this.f124067a.f124063c));
        }
    }

    /* renamed from: a */
    public final C7604g<Pair<Long, C48758a>> mo123566a() {
        return C7605h.m23659d(C7525m.m23526p(C7551d.m23565b(0, this.f124066f)), new C48806a(this));
    }

    /* renamed from: a */
    public final long mo123565a(int i) {
        int i2 = i * this.f124062b;
        if (this.f124063c) {
            return C48762b.m150582c(this.f124065e, i2);
        }
        return (long) C48762b.m150581b(this.f124065e, i2);
    }

    /* renamed from: b */
    private final int m150704b(long j) {
        int i = this.f124066f - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long a = mo123565a(i3);
            if (a < j) {
                i2 = i3 + 1;
            } else if (a <= j) {
                return i3;
            } else {
                i = i3 - 1;
            }
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public final C48758a mo123567a(long j) {
        int b = m150704b(j);
        if (b < 0) {
            return null;
        }
        return new C48758a(this.f124065e, (b * this.f124062b) + this.f124061a, this.f124064d, this.f124063c);
    }

    public C48805l(boolean z, int i, byte[] bArr) {
        int i2;
        C7573i.m23587b(bArr, "sortedEntries");
        this.f124063c = z;
        this.f124064d = i;
        this.f124065e = bArr;
        if (this.f124063c) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        this.f124061a = i2;
        this.f124062b = this.f124061a + this.f124064d;
        this.f124066f = this.f124065e.length / this.f124062b;
    }
}
