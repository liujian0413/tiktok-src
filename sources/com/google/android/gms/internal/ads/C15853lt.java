package com.google.android.gms.internal.ads;

import android.content.Context;
import com.C1642a;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.common.util.C15334q;
import java.util.Map;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.lt */
public final class C15853lt implements C15844lk, C15851lr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ami f44616a;

    /* renamed from: b */
    private final Context f44617b;

    public C15853lt(Context context, zzbgz zzbgz, bdt bdt, C14816bu buVar) throws zzbnv {
        this.f44617b = context;
        this.f44616a = amo.m46434a(context, anv.m46662a(), "", false, false, bdt, zzbgz, null, null, null, bwl.m50206a());
        this.f44616a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    public final void mo39875a(String str, String str2) {
        C15845ll.m51279a((C15844lk) this, str, str2);
    }

    /* renamed from: a */
    public final void mo39809a(String str, Map map) {
        C15845ll.m51280a((C15844lk) this, str, map);
    }

    /* renamed from: a */
    public final void mo39810a(String str, JSONObject jSONObject) {
        C15845ll.m51282b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo39814b(String str, JSONObject jSONObject) {
        C15845ll.m51281a((C15844lk) this, str, jSONObject);
    }

    /* renamed from: a */
    private static void m51302a(Runnable runnable) {
        if (afb.m45734b()) {
            runnable.run();
        } else {
            acl.f40003a.post(runnable);
        }
    }

    /* renamed from: d */
    public final void mo39815d(String str) {
        m51302a((Runnable) new C15854lu(this, str));
    }

    /* renamed from: a */
    public final void mo41720a(String str) {
        m51302a((Runnable) new C15857lx(this, C1642a.m8034a("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: b */
    public final void mo41721b(String str) {
        m51302a((Runnable) new C15858ly(this, str));
    }

    /* renamed from: c */
    public final void mo41724c(String str) {
        m51302a((Runnable) new C15859lz(this, str));
    }

    /* renamed from: a */
    public final void mo41741a(String str, C15742hq<? super C15889nb> hqVar) {
        this.f44616a.mo39721a(str, (C15742hq<? super ami>) new C15861ma<Object>(this, hqVar));
    }

    /* renamed from: b */
    public final void mo41742b(String str, C15742hq<? super C15889nb> hqVar) {
        this.f44616a.mo39720a(str, (C15334q<C15742hq<? super ami>>) new C15855lv<C15742hq<? super ami>>(hqVar));
    }

    /* renamed from: a */
    public final void mo41719a(C15852ls lsVar) {
        anp w = this.f44616a.mo39761w();
        lsVar.getClass();
        w.mo39772a(C15856lw.m51319a(lsVar));
    }

    /* renamed from: c */
    public final C15890nc mo41723c() {
        return new C15891nd(this);
    }

    /* renamed from: a */
    public final void mo41718a() {
        this.f44616a.destroy();
    }

    /* renamed from: b */
    public final boolean mo41722b() {
        return this.f44616a.mo39703C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo41743e(String str) {
        this.f44616a.mo39815d(str);
    }
}
