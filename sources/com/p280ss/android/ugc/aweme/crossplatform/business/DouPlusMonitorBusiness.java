package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness */
public class DouPlusMonitorBusiness extends Business {

    /* renamed from: a */
    private boolean f68332a;

    /* renamed from: b */
    private long f68333b;

    /* renamed from: a */
    private String m84998a() {
        return this.f68330i.f68474b.f68463r;
    }

    DouPlusMonitorBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public final void mo67179b(String str) {
        if (TextUtils.equals(m84998a(), str)) {
            this.f68332a = false;
        }
    }

    /* renamed from: a */
    public final void mo67178a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(m84998a(), str)) {
                this.f68332a = true;
                this.f68333b = System.currentTimeMillis();
                return;
            }
            this.f68332a = false;
        }
    }

    /* renamed from: a */
    public final void mo67176a(int i, String str) {
        if (this.f68332a) {
            this.f68332a = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f68333b;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                jSONObject2.put("error_status", i);
                jSONObject2.put("error_message", str);
            } catch (JSONException unused) {
            }
            C6877n.m21445a("douplus_delivery_show", 0, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo67177a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f68332a && webResourceRequest != null && webResourceError != null && webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                mo67176a(webResourceError.getErrorCode(), (String) null);
            } else {
                mo67176a(webResourceError.getErrorCode(), url.toString());
            }
        }
    }
}
