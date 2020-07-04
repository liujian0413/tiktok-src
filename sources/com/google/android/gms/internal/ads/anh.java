package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@C6505uv
public class anh extends amj {
    public anh(ami ami, bwl bwl, boolean z) {
        super(ami, bwl, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo39842a(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof ami)) {
            acd.m45783e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        ami ami = (ami) webView;
        if (this.f40649c != null) {
            this.f40649c.mo39030a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo39765a(str, map);
        }
        if (ami.mo39761w() != null) {
            ami.mo39761w().mo39793m();
        }
        if (ami.mo39759u().mo39849e()) {
            str2 = (String) bym.m50299d().mo41272a(C15585bw.f43737K);
        } else if (ami.mo39702B()) {
            str2 = (String) bym.m50299d().mo41272a(C15585bw.f43736J);
        } else {
            str2 = (String) bym.m50299d().mo41272a(C15585bw.f43735I);
        }
        return acl.m45547c(ami.getContext(), ami.mo39472k().f45677a, str2);
    }
}
