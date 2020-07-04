package com.google.android.gms.internal.ads;

final class ahl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40231a;

    /* renamed from: b */
    private final /* synthetic */ String f40232b;

    /* renamed from: c */
    private final /* synthetic */ ahh f40233c;

    ahl(ahh ahh, String str, String str2) {
        this.f40233c = ahh;
        this.f40231a = str;
        this.f40232b = str2;
    }

    public final void run() {
        if (this.f40233c.f40226r != null) {
            this.f40233c.f40226r.mo39389a(this.f40231a, this.f40232b);
        }
    }
}
