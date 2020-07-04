package com.google.android.gms.internal.ads;

import android.content.Context;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ld */
public final class C15837ld extends C15848lo<C15889nb> implements C15844lk, C15851lr {

    /* renamed from: b */
    private final aok f44592b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15852ls f44593c;

    public C15837ld(Context context, zzbgz zzbgz) throws zzbnv {
        try {
            this.f44592b = new aok(context, new C15843lj(this));
            this.f44592b.setWillNotDraw(true);
            this.f44592b.addJavascriptInterface(new C15842li(this), "GoogleJsInterface");
            C14793ay.m42895a().mo39171a(context, zzbgz.f45677a, this.f44592b.getSettings());
            this.f44603a = this;
        } catch (Throwable th) {
            throw new zzbnv("Init failed.", th);
        }
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
    public final void mo41720a(String str) {
        mo41721b(C1642a.m8034a("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo41721b(String str) {
        ago.f40189a.execute(new C15838le(this, str));
    }

    /* renamed from: c */
    public final void mo41724c(String str) {
        ago.f40189a.execute(new C15839lf(this, str));
    }

    /* renamed from: a */
    public final void mo41719a(C15852ls lsVar) {
        this.f44593c = lsVar;
    }

    /* renamed from: a */
    public final void mo41718a() {
        this.f44592b.destroy();
    }

    /* renamed from: b */
    public final boolean mo41722b() {
        return this.f44592b.mo39897C();
    }

    /* renamed from: c */
    public final C15890nc mo41723c() {
        return new C15891nd(this);
    }

    /* renamed from: d */
    public final void mo39815d(String str) {
        ago.f40189a.execute(new C15840lg(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo41725e(String str) {
        this.f44592b.mo39815d(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo41726f(String str) {
        this.f44592b.loadUrl(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo41727g(String str) {
        this.f44592b.loadData(str, "text/html", "UTF-8");
    }
}
