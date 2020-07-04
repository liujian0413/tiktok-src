package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.ad */
public class C45253ad {

    /* renamed from: j */
    private static volatile C45253ad f116424j;

    /* renamed from: k */
    private static float[] f116425k = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: l */
    private static float[] f116426l = {-2.0f, -2.0f};

    /* renamed from: a */
    public float f116427a;

    /* renamed from: b */
    public float f116428b;

    /* renamed from: c */
    public float f116429c;

    /* renamed from: d */
    public double f116430d;

    /* renamed from: e */
    public double f116431e;

    /* renamed from: f */
    public float f116432f;

    /* renamed from: g */
    public float[] f116433g = f116425k;

    /* renamed from: h */
    public float[] f116434h = f116426l;

    /* renamed from: i */
    public boolean f116435i;

    private C45253ad() {
    }

    /* renamed from: a */
    public static C45253ad m142779a() {
        if (f116424j == null) {
            synchronized (C45253ad.class) {
                if (f116424j == null) {
                    f116424j = new C45253ad();
                }
            }
        }
        return f116424j;
    }

    /* renamed from: a */
    private void m142780a(float[] fArr) {
        if (fArr == null || fArr.length != 4) {
            this.f116433g = f116425k;
        } else {
            this.f116433g = fArr;
        }
    }

    /* renamed from: a */
    public final void mo108197a(float[] fArr, double d) {
        m142780a(fArr);
        this.f116431e = d;
    }

    /* renamed from: a */
    public final void mo108196a(float f, float f2, float f3, double d) {
        this.f116427a = f;
        this.f116428b = f2;
        this.f116429c = f3;
        this.f116430d = d;
    }
}
