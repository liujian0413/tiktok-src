package kotlin.p355d;

/* renamed from: kotlin.d.f */
public final class C47963f extends C7542d {

    /* renamed from: d */
    private int f122794d;

    /* renamed from: e */
    private int f122795e;

    /* renamed from: f */
    private int f122796f;

    /* renamed from: g */
    private int f122797g;

    /* renamed from: h */
    private int f122798h;

    /* renamed from: i */
    private int f122799i;

    /* renamed from: b */
    public final int mo19427b() {
        int i = this.f122794d;
        int i2 = i ^ (i >>> 2);
        this.f122794d = this.f122795e;
        this.f122795e = this.f122796f;
        this.f122796f = this.f122797g;
        int i3 = this.f122798h;
        this.f122797g = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f122798h = i4;
        this.f122799i += 362437;
        return i4 + this.f122799i;
    }

    /* renamed from: a */
    public final int mo19425a(int i) {
        return C7545e.m23546a(mo19427b(), i);
    }

    public C47963f(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        this(i3, i4, 0, 0, i ^ -1, (i << 10) ^ (i2 >>> 4));
    }

    private C47963f(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        this.f122794d = i;
        this.f122795e = i2;
        this.f122796f = 0;
        this.f122797g = 0;
        this.f122798h = i5;
        this.f122799i = i6;
        if ((this.f122794d | this.f122795e | this.f122796f | this.f122797g | this.f122798h) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i7 = 0; i7 < 64; i7++) {
                mo19427b();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }
}
