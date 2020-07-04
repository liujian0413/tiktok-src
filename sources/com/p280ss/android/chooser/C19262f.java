package com.p280ss.android.chooser;

/* renamed from: com.ss.android.chooser.f */
public final class C19262f implements Comparable<C19262f> {

    /* renamed from: a */
    public long f52148a;

    /* renamed from: b */
    public String f52149b;

    /* renamed from: c */
    public long f52150c;

    /* renamed from: d */
    public int f52151d;

    /* renamed from: e */
    public long f52152e;

    /* renamed from: f */
    public long f52153f;

    /* renamed from: g */
    public String f52154g;

    /* renamed from: h */
    public String f52155h;

    /* renamed from: i */
    public int f52156i;

    /* renamed from: j */
    public int f52157j;

    public final int hashCode() {
        return Long.valueOf(this.f52148a).hashCode();
    }

    public C19262f(long j) {
        this.f52148a = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C19262f fVar) {
        if (this.f52150c > fVar.f52150c) {
            return -1;
        }
        if (this.f52150c < fVar.f52150c) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19262f) || obj == null || this.f52148a != ((C19262f) obj).f52148a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C19262f m63133a(int i) {
        C19262f fVar = new C19262f(-1);
        fVar.f52150c = Long.MAX_VALUE;
        fVar.f52151d = i;
        return fVar;
    }
}
