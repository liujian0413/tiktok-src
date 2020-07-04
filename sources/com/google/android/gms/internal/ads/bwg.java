package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class bwg implements Runnable {

    /* renamed from: a */
    private final bwe f44049a;

    /* renamed from: b */
    private final bvw f44050b;

    /* renamed from: c */
    private final zzwr f44051c;

    /* renamed from: d */
    private final agu f44052d;

    bwg(bwe bwe, bvw bvw, zzwr zzwr, agu agu) {
        this.f44049a = bwe;
        this.f44050b = bvw;
        this.f44051c = zzwr;
        this.f44052d = agu;
    }

    public final void run() {
        bwe bwe = this.f44049a;
        bvw bvw = this.f44050b;
        zzwr zzwr = this.f44051c;
        agu agu = this.f44052d;
        try {
            zzwo a = bvw.mo39918q().mo41404a(zzwr);
            if (!a.mo42392a()) {
                agu.mo39332a(new RuntimeException("No entry contents."));
                bwe.f44042a.m50193a();
                return;
            }
            bwi bwi = new bwi(bwe, a.mo42393b(), 1);
            int read = bwi.read();
            if (read != -1) {
                bwi.unread(read);
                agu.mo39333b(bwi);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            acd.m45778b("Unable to obtain a cache service instance.", e);
            agu.mo39332a(e);
            bwe.f44042a.m50193a();
        }
    }
}
