package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.common.util.C15334q;
import com.google.android.gms.dynamic.C15345b;

@C6505uv
public interface ami extends C14785aq, aik, ane, anf, anj, anm, ann, ano, buf, C15836lc, C15862mb {
    /* renamed from: A */
    C15345b mo39701A();

    /* renamed from: B */
    boolean mo39702B();

    /* renamed from: C */
    boolean mo39703C();

    /* renamed from: D */
    void mo39704D();

    /* renamed from: E */
    boolean mo39705E();

    /* renamed from: F */
    boolean mo39706F();

    /* renamed from: G */
    boolean mo39707G();

    /* renamed from: H */
    void mo39708H();

    /* renamed from: I */
    void mo39709I();

    /* renamed from: J */
    C15630dn mo39710J();

    /* renamed from: K */
    void mo39711K();

    /* renamed from: L */
    void mo39712L();

    /* renamed from: a */
    void mo39713a(int i);

    /* renamed from: a */
    void mo39714a(Context context);

    /* renamed from: a */
    void mo39715a(C14836c cVar);

    /* renamed from: a */
    void mo39716a(C15345b bVar);

    /* renamed from: a */
    void mo39460a(amy amy);

    /* renamed from: a */
    void mo39717a(anv anv);

    /* renamed from: a */
    void mo39718a(C15617da daVar);

    /* renamed from: a */
    void mo39719a(C15630dn dnVar);

    /* renamed from: a */
    void mo39720a(String str, C15334q<C15742hq<? super ami>> qVar);

    /* renamed from: a */
    void mo39461a(String str, alb alb);

    /* renamed from: a */
    void mo39721a(String str, C15742hq<? super ami> hqVar);

    /* renamed from: a */
    void mo39722a(String str, String str2, String str3);

    /* renamed from: b */
    amy mo39464b();

    /* renamed from: b */
    void mo39723b(C14836c cVar);

    /* renamed from: b */
    void mo39724b(String str);

    /* renamed from: b */
    void mo39725b(String str, C15742hq<? super ami> hqVar);

    /* renamed from: b */
    void mo39726b(boolean z);

    /* renamed from: c */
    void mo39727c(boolean z);

    /* renamed from: d */
    Activity mo39466d();

    /* renamed from: d */
    void mo39728d(boolean z);

    void destroy();

    /* renamed from: e */
    C14816bu mo39467e();

    /* renamed from: e */
    void mo39730e(boolean z);

    /* renamed from: f */
    void mo39731f(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: j */
    C15599cj mo39471j();

    /* renamed from: k */
    zzbgz mo39472k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* renamed from: o */
    void mo39745o();

    void onPause();

    void onResume();

    /* renamed from: p */
    void mo39748p();

    /* renamed from: q */
    void mo39749q();

    /* renamed from: r */
    Context mo39750r();

    /* renamed from: s */
    C14836c mo39751s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    C14836c mo39758t();

    /* renamed from: u */
    anv mo39759u();

    /* renamed from: v */
    String mo39760v();

    /* renamed from: w */
    anp mo39761w();

    /* renamed from: x */
    WebViewClient mo39762x();

    /* renamed from: y */
    boolean mo39763y();

    /* renamed from: z */
    bdt mo39764z();
}
