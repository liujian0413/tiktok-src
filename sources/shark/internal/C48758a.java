package shark.internal;

import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.a */
public final class C48758a {

    /* renamed from: a */
    private final int f123912a;

    /* renamed from: b */
    private int f123913b;

    /* renamed from: c */
    private final byte[] f123914c;

    /* renamed from: d */
    private final int f123915d;

    /* renamed from: e */
    private final boolean f123916e;

    /* renamed from: b */
    public final long mo123520b() {
        if (this.f123916e) {
            return m150559d();
        }
        return (long) mo123521c();
    }

    /* renamed from: a */
    public final byte mo123518a() {
        int i = this.f123913b;
        boolean z = true;
        this.f123913b++;
        int i2 = this.f123912a;
        if (i < 0 || i2 < i) {
            z = false;
        }
        if (z) {
            return this.f123914c[this.f123915d + i];
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" should be between 0 and ");
        sb.append(this.f123912a);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: d */
    private long m150559d() {
        boolean z;
        int i = this.f123913b;
        this.f123913b += 8;
        if (i < 0 || i > this.f123912a - 7) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C48762b.m150582c(this.f123914c, this.f123915d + i);
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" should be between 0 and ");
        sb.append(this.f123912a - 7);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: c */
    public final int mo123521c() {
        boolean z;
        int i = this.f123913b;
        this.f123913b += 4;
        if (i < 0 || i > this.f123912a - 3) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C48762b.m150581b(this.f123914c, this.f123915d + i);
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" should be between 0 and ");
        sb.append(this.f123912a - 3);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final long mo123519a(int i) {
        boolean z;
        int i2 = this.f123913b;
        this.f123913b += i;
        if (i2 < 0 || i2 > this.f123912a - (i - 1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i3 = this.f123915d + i2;
            byte[] bArr = this.f123914c;
            long j = 0;
            int i4 = (i - 1) * 8;
            while (i4 >= 8) {
                j |= (255 & ((long) bArr[i3])) << i4;
                i4 -= 8;
                i3++;
            }
            return (((long) bArr[i3]) & 255) | j;
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i2);
        sb.append(" should be between 0 and ");
        sb.append(this.f123912a - (i - 1));
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public C48758a(byte[] bArr, int i, int i2, boolean z) {
        C7573i.m23587b(bArr, "array");
        this.f123914c = bArr;
        this.f123915d = i;
        this.f123916e = z;
        this.f123912a = i2 - 1;
    }
}
