package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C14836c;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hg */
final class C15732hg implements C15742hq<ami> {
    C15732hg() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        C14836c s = ami.mo39751s();
        if (s != null) {
            s.mo37808a();
            return;
        }
        C14836c t = ami.mo39758t();
        if (t != null) {
            t.mo37808a();
        } else {
            acd.m45783e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
