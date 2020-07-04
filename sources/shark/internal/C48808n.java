package shark.internal;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.Arrays;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import shark.internal.p1902a.C48759a;
import shark.internal.p1902a.C48760b;

/* renamed from: shark.internal.n */
public final class C48808n {

    /* renamed from: a */
    public final int f124069a;

    /* renamed from: b */
    public byte[] f124070b;

    /* renamed from: c */
    public int f124071c;

    /* renamed from: d */
    public int f124072d;

    /* renamed from: e */
    public final boolean f124073e;

    /* renamed from: f */
    private final C48809a f124074f;

    /* renamed from: g */
    private int f124075g;

    /* renamed from: h */
    private final int f124076h;

    /* renamed from: i */
    private final int f124077i;

    /* renamed from: j */
    private final double f124078j;

    /* renamed from: shark.internal.n$a */
    public final class C48809a {
        public C48809a() {
        }

        /* renamed from: a */
        public final void mo123574a(long j) {
            if (C48808n.this.f124073e) {
                m150718b(j);
            } else {
                mo123573a((int) j);
            }
        }

        /* renamed from: a */
        public final void mo123572a(byte b) {
            boolean z;
            int i = C48808n.this.f124071c;
            C48808n.this.f124071c++;
            int i2 = C48808n.this.f124069a;
            if (i >= 0 && i2 >= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = ((C48808n.this.f124072d - 1) * C48808n.this.f124069a) + i;
                byte[] bArr = C48808n.this.f124070b;
                if (bArr == null) {
                    C7573i.m23580a();
                }
                bArr[i3] = b;
                return;
            }
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" should be between 0 and ");
            sb.append(C48808n.this.f124069a);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: b */
        private void m150718b(long j) {
            boolean z;
            int i = C48808n.this.f124071c;
            C48808n.this.f124071c += 8;
            if (i < 0 || i > C48808n.this.f124069a - 8) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i2 = ((C48808n.this.f124072d - 1) * C48808n.this.f124069a) + i;
                byte[] bArr = C48808n.this.f124070b;
                if (bArr == null) {
                    C7573i.m23580a();
                }
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((int) ((j >>> 56) & 255));
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((int) ((j >>> 48) & 255));
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) ((j >>> 40) & 255));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) ((j >>> 32) & 255));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) ((j >>> 24) & 255));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) ((j >>> 16) & 255));
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((int) ((j >>> 8) & 255));
                bArr[i9] = (byte) ((int) (j & 255));
                return;
            }
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" should be between 0 and ");
            sb.append(C48808n.this.f124069a - 8);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final void mo123573a(int i) {
            boolean z;
            int i2 = C48808n.this.f124071c;
            C48808n.this.f124071c += 4;
            if (i2 < 0 || i2 > C48808n.this.f124069a - 4) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i3 = ((C48808n.this.f124072d - 1) * C48808n.this.f124069a) + i2;
                byte[] bArr = C48808n.this.f124070b;
                if (bArr == null) {
                    C7573i.m23580a();
                }
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >>> 24) & NormalGiftView.ALPHA_255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >>> 16) & NormalGiftView.ALPHA_255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((i >>> 8) & NormalGiftView.ALPHA_255);
                bArr[i6] = (byte) (i & NormalGiftView.ALPHA_255);
                return;
            }
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i2);
            sb.append(" should be between 0 and ");
            sb.append(C48808n.this.f124069a - 4);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final void mo123575a(long j, int i) {
            boolean z;
            int i2 = C48808n.this.f124071c;
            C48808n.this.f124071c += i;
            if (i2 < 0 || i2 > C48808n.this.f124069a - i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i3 = ((C48808n.this.f124072d - 1) * C48808n.this.f124069a) + i2;
                byte[] bArr = C48808n.this.f124070b;
                if (bArr == null) {
                    C7573i.m23580a();
                }
                int i4 = (i - 1) * 8;
                while (i4 >= 8) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) ((int) (255 & (j >>> i4)));
                    i4 -= 8;
                    i3 = i5;
                }
                bArr[i3] = (byte) ((int) (j & 255));
                return;
            }
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i2);
            sb.append(" should be between 0 and ");
            sb.append(C48808n.this.f124069a - i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: shark.internal.n$b */
    public static final class C48810b implements C48759a {

        /* renamed from: a */
        final /* synthetic */ C48808n f124080a;

        C48810b(C48808n nVar) {
            this.f124080a = nVar;
        }

        /* renamed from: a */
        public final int mo123522a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
            C7573i.m23587b(bArr, "o1Array");
            C7573i.m23587b(bArr2, "o2Array");
            if (this.f124080a.f124073e) {
                return (this.f124080a.mo123571b(bArr, i2 * i) > this.f124080a.mo123571b(bArr2, i3 * i) ? 1 : (this.f124080a.mo123571b(bArr, i2 * i) == this.f124080a.mo123571b(bArr2, i3 * i) ? 0 : -1));
            }
            return C7573i.m23576a(this.f124080a.mo123568a(bArr, i2 * i), this.f124080a.mo123568a(bArr2, i3 * i));
        }
    }

    /* renamed from: a */
    public final C48805l mo123569a() {
        if (this.f124072d == 0) {
            return new C48805l(this.f124073e, this.f124076h, new byte[0]);
        }
        byte[] bArr = this.f124070b;
        if (bArr == null) {
            C7573i.m23580a();
        }
        C48760b.f123918c.mo123526a(bArr, 0, this.f124072d, this.f124069a, new C48810b(this));
        if (bArr.length > this.f124072d * this.f124069a) {
            bArr = Arrays.copyOf(bArr, this.f124072d * this.f124069a);
            C7573i.m23582a((Object) bArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        this.f124070b = null;
        this.f124072d = 0;
        return new C48805l(this.f124073e, this.f124076h, bArr);
    }

    /* renamed from: a */
    private final void m150713a(int i) {
        byte[] bArr = new byte[(i * this.f124069a)];
        System.arraycopy(this.f124070b, 0, bArr, 0, this.f124072d * this.f124069a);
        this.f124070b = bArr;
    }

    /* renamed from: a */
    public final C48809a mo123570a(long j) {
        if (this.f124070b == null) {
            this.f124075g = this.f124077i;
            this.f124070b = new byte[(this.f124075g * this.f124069a)];
        } else if (this.f124075g == this.f124072d) {
            double d = (double) this.f124075g;
            double d2 = this.f124078j;
            Double.isNaN(d);
            int i = (int) (d * d2);
            m150713a(i);
            this.f124075g = i;
        }
        this.f124072d++;
        this.f124071c = 0;
        this.f124074f.mo123574a(j);
        return this.f124074f;
    }

    /* renamed from: a */
    public final int mo123568a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        return (bArr[i3 + 1] & 255) | b | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: b */
    public final long mo123571b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i7 + 1]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    private C48808n(int i, boolean z, int i2, double d) {
        int i3;
        this.f124076h = i;
        this.f124073e = z;
        this.f124077i = i2;
        this.f124078j = d;
        int i4 = this.f124076h;
        if (this.f124073e) {
            i3 = 8;
        } else {
            i3 = 4;
        }
        this.f124069a = i4 + i3;
        this.f124074f = new C48809a();
    }

    public /* synthetic */ C48808n(int i, boolean z, int i2, double d, int i3, C7571f fVar) {
        this(i, z, i2, 2.0d);
    }
}
