package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.util.concurrent.Callable;

public final class bfe implements Callable {

    /* renamed from: a */
    private final beh f41832a;

    /* renamed from: b */
    private final C16247a f41833b;

    public bfe(beh beh, C16247a aVar) {
        this.f41832a = beh;
        this.f41833b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f41832a.f41766g != null) {
            this.f41832a.f41766g.get();
        }
        zza zza = this.f41832a.f41765f;
        if (zza != null) {
            try {
                synchronized (this.f41833b) {
                    C16247a aVar = this.f41833b;
                    byte[] g = zza.mo40082g();
                    aVar.mo40086a(g, 0, g.length, axi.m47630b());
                }
            } catch (zzcdx unused) {
            }
        }
        return null;
    }
}
