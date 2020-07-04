package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.of */
final class C15920of implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15918od f44782a;

    /* renamed from: b */
    private final /* synthetic */ C15919oe f44783b;

    C15920of(C15919oe oeVar, C15918od odVar) {
        this.f44783b = oeVar;
        this.f44782a = odVar;
    }

    public final void run() {
        synchronized (this.f44783b.f44770i) {
            if (this.f44783b.f44780s == -2) {
                this.f44783b.f44779r = this.f44783b.m51472d();
                if (this.f44783b.f44779r == null) {
                    this.f44783b.mo41804a(4);
                } else if (!this.f44783b.m51474e() || this.f44783b.m51469b(1)) {
                    this.f44782a.mo41785a((C15923oi) this.f44783b);
                    this.f44783b.m51463a(this.f44782a);
                } else {
                    String f = this.f44783b.f44762a;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(f);
                    sb.append(" as delayed impression is not supported");
                    acd.m45783e(sb.toString());
                    this.f44783b.mo41804a(2);
                }
            }
        }
    }
}
