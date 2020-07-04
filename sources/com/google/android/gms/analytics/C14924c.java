package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16545g;
import com.google.android.gms.internal.measurement.C16663k;
import com.google.android.gms.internal.measurement.C16697t;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.analytics.c */
public class C14924c extends C14932k<C14924c> {

    /* renamed from: c */
    public final C16697t f38593c;

    /* renamed from: d */
    public boolean f38594d;

    public C14924c(C16697t tVar) {
        super(tVar.mo43217b(), tVar.f46641c);
        this.f38593c = tVar;
    }

    /* renamed from: d */
    public final C14930i mo37985d() {
        C14930i a = this.f38615f.mo37990a();
        a.mo37992a((C14931j) this.f38593c.mo43226k().mo42493b());
        a.mo37992a((C14931j) this.f38593c.f46644f.mo42527b());
        mo37999b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37983a(C14930i iVar) {
        C16545g gVar = (C16545g) iVar.mo37993b(C16545g.class);
        if (TextUtils.isEmpty(gVar.f46334b)) {
            gVar.f46334b = this.f38593c.mo43225j().mo42507b();
        }
        if (this.f38594d && TextUtils.isEmpty(gVar.f46336d)) {
            C16663k i = this.f38593c.mo43224i();
            gVar.f46336d = i.mo43107c();
            gVar.f46337e = i.mo43106b();
        }
    }

    /* renamed from: a */
    public final void mo37984a(String str) {
        C15267r.m44386a(str);
        Uri a = C14925d.m43343a(str);
        ListIterator listIterator = this.f38615f.f38607f.listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((C14939o) listIterator.next()).mo37986a())) {
                listIterator.remove();
            }
        }
        this.f38615f.f38607f.add(new C14925d(this.f38593c, str));
    }
}
