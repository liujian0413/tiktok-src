package com.p280ss.android.vesdk;

import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.af */
public final class C45255af {

    /* renamed from: a */
    public String[] f116436a;

    /* renamed from: b */
    public int[] f116437b;

    /* renamed from: c */
    public String[] f116438c = null;

    /* renamed from: d */
    public String[] f116439d = null;

    /* renamed from: e */
    public int[] f116440e;

    /* renamed from: f */
    public int[] f116441f;

    /* renamed from: g */
    public int[] f116442g;

    /* renamed from: h */
    public int[] f116443h;

    /* renamed from: i */
    public double[] f116444i;

    /* renamed from: j */
    public boolean[] f116445j;

    /* renamed from: k */
    public ROTATE_DEGREE[] f116446k;

    /* renamed from: l */
    private int[] f116447l;

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            if (this.f116436a == null) {
                i = 0;
            } else {
                i = this.f116436a.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f116437b != null && this.f116437b.length > i2) {
                    sb.append(" videoFileIndex: ");
                    sb.append(this.f116437b[i2]);
                }
                if (this.f116436a != null && this.f116436a.length > i2) {
                    sb.append(" videoFilePath: ");
                    sb.append(this.f116436a[i2]);
                }
                if (this.f116440e != null && this.f116440e.length > i2) {
                    sb.append(" vTrimIn: ");
                    sb.append(this.f116440e[i2]);
                }
                if (this.f116441f != null && this.f116441f.length > i2) {
                    sb.append(" vTrimOut: ");
                    sb.append(this.f116441f[i2]);
                }
                if (this.f116442g != null && this.f116442g.length > i2) {
                    sb.append(" aTrimIn: ");
                    sb.append(this.f116442g[i2]);
                }
                if (this.f116443h != null && this.f116443h.length > i2) {
                    sb.append(" aTrimOut: ");
                    sb.append(this.f116443h[i2]);
                }
                if (this.f116444i != null && this.f116444i.length > i2) {
                    sb.append(" speed: ");
                    sb.append(this.f116444i[i2]);
                }
                if (this.f116445j != null && this.f116445j.length > i2) {
                    sb.append(" enable: ");
                    sb.append(this.f116445j[i2]);
                }
                if (this.f116446k != null && this.f116446k.length > i2) {
                    sb.append(" rotate: ");
                    sb.append(this.f116446k[i2]);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    public C45255af(String[] strArr) {
        int length = strArr.length;
        this.f116436a = (String[]) strArr.clone();
        this.f116440e = new int[length];
        Arrays.fill(this.f116440e, 0);
        this.f116441f = new int[length];
        Arrays.fill(this.f116441f, -1);
        this.f116442g = new int[length];
        Arrays.fill(this.f116442g, 0);
        this.f116443h = new int[length];
        Arrays.fill(this.f116443h, -1);
        this.f116444i = new double[length];
        Arrays.fill(this.f116444i, 1.0d);
        this.f116437b = new int[length];
        this.f116447l = new int[length];
        this.f116445j = new boolean[length];
        Arrays.fill(this.f116445j, true);
        this.f116446k = new ROTATE_DEGREE[length];
        Arrays.fill(this.f116446k, ROTATE_DEGREE.ROTATE_NONE);
        for (int i = 0; i < length; i++) {
            this.f116437b[i] = i;
            this.f116447l[i] = i;
        }
    }
}
