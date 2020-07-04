package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xk */
final class C16167xk implements Callable<C16164xh> {

    /* renamed from: a */
    private final /* synthetic */ Context f45398a;

    /* renamed from: b */
    private final /* synthetic */ C16166xj f45399b;

    C16167xk(C16166xj xjVar, Context context) {
        this.f45399b = xjVar;
        this.f45398a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        C16164xh xhVar;
        C16168xl xlVar = (C16168xl) this.f45399b.f45397a.get(this.f45398a);
        if (xlVar != null) {
            if (!(xlVar.f45400a + ((Long) bym.m50299d().mo41272a(C15585bw.f43843bk)).longValue() < C14793ay.m42901g().mo38684a())) {
                xhVar = new C16165xi(this.f45398a, xlVar.f45401b).mo42063a();
                this.f45399b.f45397a.put(this.f45398a, new C16168xl(this.f45399b, xhVar));
                return xhVar;
            }
        }
        xhVar = new C16165xi(this.f45398a).mo42063a();
        this.f45399b.f45397a.put(this.f45398a, new C16168xl(this.f45399b, xhVar));
        return xhVar;
    }
}
