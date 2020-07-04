package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.C15945pd;
import com.google.android.gms.internal.ads.C15948pg;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ami;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.y */
final class C14868y implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ C15945pd f38488a;

    /* renamed from: b */
    private final /* synthetic */ C14822d f38489b;

    /* renamed from: c */
    private final /* synthetic */ C15948pg f38490c;

    C14868y(C15945pd pdVar, C14822d dVar, C15948pg pgVar) {
        this.f38488a = pdVar;
        this.f38489b = dVar;
        this.f38490c = pgVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        View view = ami.getView();
        if (view != null) {
            try {
                if (this.f38488a == null) {
                    if (this.f38490c != null) {
                        if (!this.f38490c.mo41878i()) {
                            this.f38490c.mo41867a(C15349d.m44668a(view));
                            this.f38489b.f38344a.mo7870v_();
                            return;
                        }
                        C14863t.m43179b(ami);
                    }
                } else if (!this.f38488a.mo41859k()) {
                    this.f38488a.mo41846a(C15349d.m44668a(view));
                    this.f38489b.f38344a.mo7870v_();
                } else {
                    C14863t.m43179b(ami);
                }
            } catch (RemoteException e) {
                acd.m45780c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
