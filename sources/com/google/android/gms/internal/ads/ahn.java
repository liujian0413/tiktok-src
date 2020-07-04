package com.google.android.gms.internal.ads;

final class ahn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f40235a;

    /* renamed from: b */
    private final /* synthetic */ int f40236b;

    /* renamed from: c */
    private final /* synthetic */ ahh f40237c;

    ahn(ahh ahh, int i, int i2) {
        this.f40237c = ahh;
        this.f40235a = i;
        this.f40236b = i2;
    }

    public final void run() {
        if (this.f40237c.f40226r != null) {
            this.f40237c.f40226r.mo39388a(this.f40235a, this.f40236b);
        }
    }
}
