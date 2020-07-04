package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dw */
final class C15640dw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<ami> f44369a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f44370b;

    public C15640dw(ami ami) {
        this.f44369a = new WeakReference<>(ami);
    }

    /* renamed from: a */
    public final void mo41616a(C16075tz tzVar) {
        tzVar.mo42004a("/loadHtml", (C15742hq<? super T>) new C15641dx<Object>(this, tzVar));
        tzVar.mo42004a("/showOverlay", (C15742hq<? super T>) new C15643dz<Object>(this, tzVar));
        tzVar.mo42004a("/hideOverlay", (C15742hq<? super T>) new C15645ea<Object>(this, tzVar));
        ami ami = (ami) this.f44369a.get();
        if (ami != null) {
            ami.mo39721a("/sendMessageToSdk", (C15742hq<? super ami>) new C15646eb<Object>(this, tzVar));
        }
    }
}
