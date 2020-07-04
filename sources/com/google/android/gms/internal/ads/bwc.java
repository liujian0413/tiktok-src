package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.C14793ay;
import java.io.InputStream;
import java.util.concurrent.Future;

@C6505uv
public final class bwc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public bvw f44037a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f44038b;

    /* renamed from: c */
    private final Context f44039c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f44040d = new Object();

    bwc(Context context) {
        this.f44039c = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Future<InputStream> mo41405a(zzwr zzwr) {
        bwd bwd = new bwd(this);
        bwe bwe = new bwe(this, zzwr, bwd);
        bwj bwj = new bwj(this, bwd);
        synchronized (this.f44040d) {
            this.f44037a = new bvw(this.f44039c, C14793ay.m42908n().mo39258a(), bwe, bwj);
            this.f44037a.mo38565l();
        }
        return bwd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m50193a() {
        synchronized (this.f44040d) {
            if (this.f44037a != null) {
                this.f44037a.mo38559f();
                this.f44037a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
