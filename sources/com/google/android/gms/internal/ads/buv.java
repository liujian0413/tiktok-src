package com.google.android.gms.internal.ads;

final class buv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ buu f43663a;

    buv(buu buu) {
        this.f43663a = buu;
    }

    public final void run() {
        synchronized (this.f43663a.f43655c) {
            if (!this.f43663a.f43656d || !this.f43663a.f43657e) {
                acd.m45777b("App is still foreground");
            } else {
                this.f43663a.f43656d = false;
                acd.m45777b("App went background");
                for (buw a : this.f43663a.f43658f) {
                    try {
                        a.mo39125a(false);
                    } catch (Exception e) {
                        afm.m45778b("", e);
                    }
                }
            }
        }
    }
}
