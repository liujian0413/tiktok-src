package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.k */
public class C13917k extends C13877ab {

    /* renamed from: k */
    private static final String f36825k = "com.facebook.internal.k";

    /* renamed from: l */
    private boolean f36826l;

    public void cancel() {
        WebView webView = this.f36754d;
        if (!this.f36760j || this.f36758h || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.f36826l) {
            this.f36826l = true;
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            C13919l.m41084a(webView, sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    C13917k.super.cancel();
                }
            }, 1500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo33514a(String str) {
        Bundle d = C13967z.m41265d(Uri.parse(str).getQuery());
        String string = d.getString("bridge_args");
        d.remove("bridge_args");
        if (!C13967z.m41249a(string)) {
            try {
                d.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C13896c.m41029a(new JSONObject(string)));
            } catch (JSONException e) {
                C13967z.m41242a(f36825k, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = d.getString("method_results");
        d.remove("method_results");
        if (!C13967z.m41249a(string2)) {
            if (C13967z.m41249a(string2)) {
                string2 = "{}";
            }
            try {
                d.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C13896c.m41029a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C13967z.m41242a(f36825k, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        d.remove(C38347c.f99551f);
        d.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C13953v.m41153a());
        return d;
    }

    private C13917k(Context context, String str, String str2) {
        super(context, str);
        this.f36752b = str2;
    }

    /* renamed from: a */
    public static C13917k m41081a(Context context, String str, String str2) {
        C13877ab.m40992a(context);
        return new C13917k(context, str, str2);
    }
}
