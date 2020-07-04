package com.p280ss.android.ttvecamera;

import java.util.List;

/* renamed from: com.ss.android.ttvecamera.l */
public final class C20651l {

    /* renamed from: a */
    public int f55775a;

    /* renamed from: b */
    public int f55776b;

    /* renamed from: c */
    public int f55777c = 1;

    public final int hashCode() {
        return (this.f55775a * 65537) + 1 + this.f55776b;
    }

    /* renamed from: a */
    public final int[] mo55827a() {
        return new int[]{this.f55775a / this.f55777c, this.f55776b / this.f55777c};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f55775a / this.f55777c);
        sb.append(":");
        sb.append(this.f55776b / this.f55777c);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static int m68429a(List<int[]> list) {
        if (list.size() > 0 && ((int[]) list.get(0))[1] > 1000) {
            return 1000;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20651l)) {
            return false;
        }
        C20651l lVar = (C20651l) obj;
        if (this.f55775a == lVar.f55775a && this.f55776b == lVar.f55776b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int[] mo55828a(int i) {
        return new int[]{(this.f55775a / this.f55777c) * i, (this.f55776b / this.f55777c) * i};
    }

    public C20651l(int i, int i2) {
        this.f55775a = i;
        this.f55776b = 30;
        this.f55777c = 1;
    }
}
