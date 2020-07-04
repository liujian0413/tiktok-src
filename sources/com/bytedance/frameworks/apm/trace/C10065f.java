package com.bytedance.frameworks.apm.trace;

/* renamed from: com.bytedance.frameworks.apm.trace.f */
public final class C10065f {

    /* renamed from: a */
    int f27387a;

    /* renamed from: b */
    int f27388b;

    /* renamed from: c */
    int f27389c;

    /* renamed from: d */
    int f27390d = 1;

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: a */
    public final String mo24710a() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f27389c; i++) {
            stringBuffer.append('.');
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stringBuffer.toString());
        sb.append(this.f27387a);
        sb.append(" ");
        sb.append(this.f27390d);
        sb.append(" ");
        sb.append(this.f27388b);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27389c);
        sb.append(",");
        sb.append(this.f27387a);
        sb.append(",");
        sb.append(this.f27390d);
        sb.append(",");
        sb.append(this.f27388b);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo24711a(long j) {
        this.f27390d++;
        this.f27388b = (int) (((long) this.f27388b) + j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10065f) {
            C10065f fVar = (C10065f) obj;
            if (fVar.f27387a == this.f27387a && fVar.f27389c == this.f27389c) {
                return true;
            }
        }
        return false;
    }

    C10065f(int i, int i2, int i3) {
        this.f27387a = i;
        this.f27388b = i2;
        this.f27389c = i3;
    }
}
