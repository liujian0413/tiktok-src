package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15725h;
import com.google.android.gms.internal.ads.C15833l;
import com.google.android.gms.internal.ads.C15914o;
import com.google.android.gms.internal.ads.C16027se;
import com.google.android.gms.internal.ads.C16033sk;
import com.google.android.gms.internal.ads.C16076u;
import com.google.android.gms.internal.ads.C16194yk;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acj;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.bdt;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.byp;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzdh;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.ar */
public final class C14786ar extends C15725h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzbgz f38196a;

    /* renamed from: b */
    private final zzyz f38197b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Future<bdt> f38198c = acj.m45509a((Callable<T>) new C14789au<T>(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f38199d;

    /* renamed from: e */
    private final C14792ax f38200e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f38201f = new WebView(this.f38199d);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public bys f38202g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public bdt f38203h;

    /* renamed from: i */
    private AsyncTask<Void, Void, String> f38204i;

    public C14786ar(Context context, zzyz zzyz, String str, zzbgz zzbgz) {
        this.f38199d = context;
        this.f38196a = zzbgz;
        this.f38197b = zzyz;
        this.f38200e = new C14792ax(str);
        mo37685a(0);
        this.f38201f.setVerticalScrollBarEnabled(false);
        this.f38201f.getSettings().setJavaScriptEnabled(true);
        this.f38201f.setWebViewClient(C6490c.m20171a((WebViewClient) new C14787as(this)));
        this.f38201f.setOnTouchListener(new C14788at(this));
    }

    /* renamed from: a */
    public final String mo37684a() throws RemoteException {
        return null;
    }

    /* renamed from: a */
    public final void mo37607a(boolean z) throws RemoteException {
    }

    /* renamed from: j */
    public final boolean mo37620j() throws RemoteException {
        return false;
    }

    /* renamed from: o */
    public final void mo37625o() throws RemoteException {
    }

    /* renamed from: p */
    public final boolean mo37626p() throws RemoteException {
        return false;
    }

    /* renamed from: q */
    public final C15488ak mo37627q() {
        return null;
    }

    /* renamed from: y_ */
    public final String mo37689y_() throws RemoteException {
        return null;
    }

    /* renamed from: h */
    public final C15345b mo37618h() throws RemoteException {
        C15267r.m44393b("getAdFrame must be called on the main UI thread.");
        return C15349d.m44668a(this.f38201f);
    }

    /* renamed from: g */
    public final void mo37617g() throws RemoteException {
        C15267r.m44393b("destroy must be called on the main UI thread.");
        this.f38204i.cancel(true);
        this.f38198c.cancel(true);
        this.f38201f.destroy();
        this.f38201f = null;
    }

    /* renamed from: b */
    public final boolean mo37614b(zzyv zzyv) throws RemoteException {
        C15267r.m44385a(this.f38201f, (Object) "This Search Ad has already been torn down");
        this.f38200e.mo37697a(zzyv, this.f38196a);
        this.f38204i = new C14790av(this, null).execute(new Void[0]);
        return true;
    }

    /* renamed from: l */
    public final void mo37622l() throws RemoteException {
        C15267r.m44393b("pause must be called on the main UI thread.");
    }

    /* renamed from: m */
    public final void mo37623m() throws RemoteException {
        C15267r.m44393b("resume must be called on the main UI thread.");
    }

    /* renamed from: a */
    public final void mo37589a(bys bys) throws RemoteException {
        this.f38202g = bys;
    }

    /* renamed from: a */
    public final void mo37593a(C15914o oVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37592a(C15833l lVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: n */
    public final Bundle mo37624n() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: E */
    public final void mo37640E() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: k */
    public final void mo37621k() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: i */
    public final zzyz mo37619i() throws RemoteException {
        return this.f38197b;
    }

    /* renamed from: a */
    public final void mo37602a(zzyz zzyz) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: a */
    public final void mo37594a(C16027se seVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37595a(C16033sk skVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: A */
    public final String mo37576A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: B */
    public final C15914o mo37577B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: C */
    public final bys mo37578C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37588a(byp byp) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37596a(C16076u uVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37598a(C16194yk ykVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37603a(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo37612b(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37600a(zzacq zzacq) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo37599a(zzabp zzabp) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo37613b(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo37686c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            return afb.m45721a(this.f38199d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo37685a(int i) {
        if (this.f38201f != null) {
            this.f38201f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo37687c() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) bym.m50299d().mo41272a(C15585bw.f43889cd));
        builder.appendQueryParameter("query", this.f38200e.f38211c);
        builder.appendQueryParameter("pubId", this.f38200e.f38209a);
        Map<String, String> map = this.f38200e.f38210b;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, (String) map.get(str));
        }
        Uri build = builder.build();
        if (this.f38203h != null) {
            try {
                build = this.f38203h.mo40532a(build, this.f38199d);
            } catch (zzdh e) {
                acd.m45780c("Unable to process ad data", e);
            }
        }
        String d = mo37688d();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(d);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo37688d() {
        String str = this.f38200e.f38212d;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) bym.m50299d().mo41272a(C15585bw.f43889cd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m42850d(String str) {
        if (this.f38203h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f38203h.mo40536b(parse, this.f38199d);
        } catch (zzdh e) {
            acd.m45780c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m42852e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f38199d.startActivity(intent);
    }
}
