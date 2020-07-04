package android.support.constraint.solver;

import java.util.Arrays;

public final class SolverVariable {

    /* renamed from: k */
    private static int f588k = 1;

    /* renamed from: l */
    private static int f589l = 1;

    /* renamed from: m */
    private static int f590m = 1;

    /* renamed from: n */
    private static int f591n = 1;

    /* renamed from: o */
    private static int f592o = 1;

    /* renamed from: a */
    public String f593a;

    /* renamed from: b */
    public int f594b = -1;

    /* renamed from: c */
    int f595c = -1;

    /* renamed from: d */
    public int f596d;

    /* renamed from: e */
    public float f597e;

    /* renamed from: f */
    float[] f598f = new float[7];

    /* renamed from: g */
    Type f599g;

    /* renamed from: h */
    C0182b[] f600h = new C0182b[8];

    /* renamed from: i */
    int f601i;

    /* renamed from: j */
    public int f602j;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: a */
    static void m527a() {
        f589l++;
    }

    /* renamed from: b */
    public final void mo446b() {
        this.f593a = null;
        this.f599g = Type.UNKNOWN;
        this.f596d = 0;
        this.f594b = -1;
        this.f595c = -1;
        this.f597e = 0.0f;
        this.f601i = 0;
        this.f602j = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f593a);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo448c(C0182b bVar) {
        int i = this.f601i;
        for (int i2 = 0; i2 < i; i2++) {
            this.f600h[i2].f617d.mo458a(this.f600h[i2], bVar, false);
        }
        this.f601i = 0;
    }

    /* renamed from: a */
    public final void mo445a(C0182b bVar) {
        int i = 0;
        while (i < this.f601i) {
            if (this.f600h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f601i >= this.f600h.length) {
            this.f600h = (C0182b[]) Arrays.copyOf(this.f600h, this.f600h.length * 2);
        }
        this.f600h[this.f601i] = bVar;
        this.f601i++;
    }

    /* renamed from: b */
    public final void mo447b(C0182b bVar) {
        int i = this.f601i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f600h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f600h[i4] = this.f600h[i4 + 1];
                }
                this.f601i--;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo444a(Type type, String str) {
        this.f599g = type;
    }

    public SolverVariable(Type type, String str) {
        this.f599g = type;
    }
}
