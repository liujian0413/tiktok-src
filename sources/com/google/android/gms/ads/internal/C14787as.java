package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.bym;

/* renamed from: com.google.android.gms.ads.internal.as */
final class C14787as extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ C14786ar f38205a;

    C14787as(C14786ar arVar) {
        this.f38205a = arVar;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f38205a.mo37688d())) {
            return false;
        }
        if (str.startsWith((String) bym.m50299d().mo41272a(C15585bw.f43886ca))) {
            if (this.f38205a.f38202g != null) {
                try {
                    this.f38205a.f38202g.mo41420a(3);
                } catch (RemoteException e) {
                    acd.m45782d("#007 Could not call remote method.", e);
                }
            }
            this.f38205a.mo37685a(0);
            return true;
        }
        if (str.startsWith((String) bym.m50299d().mo41272a(C15585bw.f43887cb))) {
            if (this.f38205a.f38202g != null) {
                try {
                    this.f38205a.f38202g.mo41420a(0);
                } catch (RemoteException e2) {
                    acd.m45782d("#007 Could not call remote method.", e2);
                }
            }
            this.f38205a.mo37685a(0);
            return true;
        }
        if (str.startsWith((String) bym.m50299d().mo41272a(C15585bw.f43888cc))) {
            if (this.f38205a.f38202g != null) {
                try {
                    this.f38205a.f38202g.mo41422c();
                } catch (RemoteException e3) {
                    acd.m45782d("#007 Could not call remote method.", e3);
                }
            }
            this.f38205a.mo37685a(this.f38205a.mo37686c(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f38205a.f38202g != null) {
                try {
                    this.f38205a.f38202g.mo41421b();
                } catch (RemoteException e4) {
                    acd.m45782d("#007 Could not call remote method.", e4);
                }
            }
            this.f38205a.m42852e(this.f38205a.m42850d(str));
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f38205a.f38202g != null) {
            try {
                this.f38205a.f38202g.mo41420a(0);
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }
}
