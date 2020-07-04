package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15334q;
import com.google.android.gms.dynamic.C15345b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

@C6505uv
public final class ams extends FrameLayout implements ami {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ami f40697a;

    /* renamed from: b */
    private final aib f40698b;

    public ams(ami ami) {
        super(ami.getContext());
        this.f40697a = ami;
        this.f40698b = new aib(ami.mo39750r(), this, this);
        addView(this.f40697a.getView());
    }

    public final View getView() {
        return this;
    }

    /* renamed from: a */
    public final aib mo39458a() {
        return this.f40698b;
    }

    public final void onPause() {
        this.f40698b.mo39439b();
        this.f40697a.onPause();
    }

    /* renamed from: D */
    public final void mo39704D() {
        this.f40698b.mo39440c();
        this.f40697a.mo39704D();
    }

    /* renamed from: K */
    public final void mo39711K() {
        setBackgroundColor(0);
        this.f40697a.setBackgroundColor(0);
    }

    /* renamed from: l */
    public final int mo39473l() {
        return getMeasuredHeight();
    }

    /* renamed from: m */
    public final int mo39474m() {
        return getMeasuredWidth();
    }

    /* renamed from: n */
    public final void mo39475n() {
        this.f40697a.mo39475n();
    }

    public final WebView getWebView() {
        return this.f40697a.getWebView();
    }

    /* renamed from: a */
    public final void mo39809a(String str, Map<String, ?> map) {
        this.f40697a.mo39809a(str, map);
    }

    /* renamed from: a */
    public final void mo39810a(String str, JSONObject jSONObject) {
        this.f40697a.mo39810a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo39721a(String str, C15742hq<? super ami> hqVar) {
        this.f40697a.mo39721a(str, hqVar);
    }

    /* renamed from: b */
    public final void mo39725b(String str, C15742hq<? super ami> hqVar) {
        this.f40697a.mo39725b(str, hqVar);
    }

    /* renamed from: a */
    public final void mo39720a(String str, C15334q<C15742hq<? super ami>> qVar) {
        this.f40697a.mo39720a(str, qVar);
    }

    /* renamed from: o */
    public final void mo39745o() {
        this.f40697a.mo39745o();
    }

    /* renamed from: a */
    public final void mo39713a(int i) {
        this.f40697a.mo39713a(i);
    }

    /* renamed from: p */
    public final void mo39748p() {
        this.f40697a.mo39748p();
    }

    /* renamed from: q */
    public final void mo39749q() {
        this.f40697a.mo39749q();
    }

    /* renamed from: a */
    public final void mo39463a(boolean z, long j) {
        this.f40697a.mo39463a(z, j);
    }

    /* renamed from: d */
    public final void mo39815d(String str) {
        this.f40697a.mo39815d(str);
    }

    /* renamed from: b */
    public final void mo39814b(String str, JSONObject jSONObject) {
        this.f40697a.mo39814b(str, jSONObject);
    }

    /* renamed from: d */
    public final Activity mo39466d() {
        return this.f40697a.mo39466d();
    }

    /* renamed from: r */
    public final Context mo39750r() {
        return this.f40697a.mo39750r();
    }

    /* renamed from: e */
    public final C14816bu mo39467e() {
        return this.f40697a.mo39467e();
    }

    /* renamed from: s */
    public final C14836c mo39751s() {
        return this.f40697a.mo39751s();
    }

    /* renamed from: A */
    public final C15345b mo39701A() {
        return this.f40697a.mo39701A();
    }

    /* renamed from: t */
    public final C14836c mo39758t() {
        return this.f40697a.mo39758t();
    }

    /* renamed from: u */
    public final anv mo39759u() {
        return this.f40697a.mo39759u();
    }

    /* renamed from: v */
    public final String mo39760v() {
        return this.f40697a.mo39760v();
    }

    /* renamed from: w */
    public final anp mo39761w() {
        return this.f40697a.mo39761w();
    }

    /* renamed from: x */
    public final WebViewClient mo39762x() {
        return this.f40697a.mo39762x();
    }

    /* renamed from: y */
    public final boolean mo39763y() {
        return this.f40697a.mo39763y();
    }

    /* renamed from: z */
    public final bdt mo39764z() {
        return this.f40697a.mo39764z();
    }

    /* renamed from: k */
    public final zzbgz mo39472k() {
        return this.f40697a.mo39472k();
    }

    /* renamed from: B */
    public final boolean mo39702B() {
        return this.f40697a.mo39702B();
    }

    public final int getRequestedOrientation() {
        return this.f40697a.getRequestedOrientation();
    }

    /* renamed from: C */
    public final boolean mo39703C() {
        return this.f40697a.mo39703C();
    }

    /* renamed from: E */
    public final boolean mo39705E() {
        return this.f40697a.mo39705E();
    }

    /* renamed from: F */
    public final boolean mo39706F() {
        return this.f40697a.mo39706F();
    }

    /* renamed from: A_ */
    public final void mo37682A_() {
        this.f40697a.mo37682A_();
    }

    /* renamed from: z_ */
    public final void mo37683z_() {
        this.f40697a.mo37683z_();
    }

    /* renamed from: g */
    public final String mo39469g() {
        return this.f40697a.mo39469g();
    }

    /* renamed from: c */
    public final C15598ci mo39465c() {
        return this.f40697a.mo39465c();
    }

    /* renamed from: j */
    public final C15599cj mo39471j() {
        return this.f40697a.mo39471j();
    }

    /* renamed from: b */
    public final amy mo39464b() {
        return this.f40697a.mo39464b();
    }

    /* renamed from: a */
    public final void mo39715a(C14836c cVar) {
        this.f40697a.mo39715a(cVar);
    }

    /* renamed from: a */
    public final void mo39716a(C15345b bVar) {
        this.f40697a.mo39716a(bVar);
    }

    /* renamed from: a */
    public final void mo39717a(anv anv) {
        this.f40697a.mo39717a(anv);
    }

    /* renamed from: b */
    public final void mo39726b(boolean z) {
        this.f40697a.mo39726b(z);
    }

    /* renamed from: H */
    public final void mo39708H() {
        this.f40697a.mo39708H();
    }

    /* renamed from: a */
    public final void mo39714a(Context context) {
        this.f40697a.mo39714a(context);
    }

    /* renamed from: c */
    public final void mo39727c(boolean z) {
        this.f40697a.mo39727c(z);
    }

    public final void setRequestedOrientation(int i) {
        this.f40697a.setRequestedOrientation(i);
    }

    /* renamed from: b */
    public final void mo39723b(C14836c cVar) {
        this.f40697a.mo39723b(cVar);
    }

    /* renamed from: d */
    public final void mo39728d(boolean z) {
        this.f40697a.mo39728d(z);
    }

    /* renamed from: b */
    public final void mo39724b(String str) {
        this.f40697a.mo39724b(str);
    }

    /* renamed from: a */
    public final void mo39461a(String str, alb alb) {
        this.f40697a.mo39461a(str, alb);
    }

    /* renamed from: a */
    public final alb mo39459a(String str) {
        return this.f40697a.mo39459a(str);
    }

    /* renamed from: I */
    public final void mo39709I() {
        this.f40697a.mo39709I();
    }

    public final void destroy() {
        C15345b A = mo39701A();
        if (A != null) {
            C14793ay.m42909o().mo41961b(A);
            acl.f40003a.postDelayed(new amt(this), (long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43875cP)).intValue());
            return;
        }
        this.f40697a.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f40697a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f40697a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f40697a.loadUrl(str);
    }

    /* renamed from: a */
    public final void mo39722a(String str, String str2, String str3) {
        this.f40697a.mo39722a(str, str2, str3);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f40697a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f40697a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f40697a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f40697a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f40697a.stopLoading();
    }

    public final void onResume() {
        this.f40697a.onResume();
    }

    /* renamed from: L */
    public final void mo39712L() {
        TextView textView = new TextView(getContext());
        Resources f = C14793ay.m42898d().mo39096f();
        textView.setText(f != null ? f.getString(R.string.dhw) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: f */
    public final void mo39731f(boolean z) {
        this.f40697a.mo39731f(z);
    }

    /* renamed from: a */
    public final void mo39718a(C15617da daVar) {
        this.f40697a.mo39718a(daVar);
    }

    /* renamed from: a */
    public final void mo39036a(bue bue) {
        this.f40697a.mo39036a(bue);
    }

    public final OnClickListener getOnClickListener() {
        return this.f40697a.getOnClickListener();
    }

    /* renamed from: a */
    public final void mo39719a(C15630dn dnVar) {
        this.f40697a.mo39719a(dnVar);
    }

    /* renamed from: J */
    public final C15630dn mo39710J() {
        return this.f40697a.mo39710J();
    }

    /* renamed from: a */
    public final void mo39460a(amy amy) {
        this.f40697a.mo39460a(amy);
    }

    /* renamed from: G */
    public final boolean mo39707G() {
        return this.f40697a.mo39707G();
    }

    /* renamed from: e */
    public final void mo39730e(boolean z) {
        this.f40697a.mo39730e(z);
    }

    /* renamed from: a */
    public final void mo39462a(boolean z) {
        this.f40697a.mo39462a(z);
    }

    /* renamed from: f */
    public final void mo39468f() {
        this.f40697a.mo39468f();
    }

    /* renamed from: a */
    public final void mo39808a(zzc zzc) {
        this.f40697a.mo39808a(zzc);
    }

    /* renamed from: a */
    public final void mo39811a(boolean z, int i) {
        this.f40697a.mo39811a(z, i);
    }

    /* renamed from: a */
    public final void mo39812a(boolean z, int i, String str) {
        this.f40697a.mo39812a(z, i, str);
    }

    /* renamed from: a */
    public final void mo39813a(boolean z, int i, String str, String str2) {
        this.f40697a.mo39813a(z, i, str, str2);
    }
}
