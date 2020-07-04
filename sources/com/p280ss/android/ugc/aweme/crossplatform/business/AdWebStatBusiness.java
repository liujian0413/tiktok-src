package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.sdk.webview.C20140h.C20141a;
import com.p280ss.android.sdk.webview.C20142i;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.business.p1152a.C25854a;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.web.C43432a;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness */
public class AdWebStatBusiness extends Business {

    /* renamed from: a */
    private long f68323a;

    /* renamed from: b */
    private boolean f68324b;

    /* renamed from: c */
    private final C25854a f68325c = new C25854a();

    /* renamed from: a */
    public final void mo67172a(boolean z) {
        Activity a = C23487o.m77130a(this.f68328g.getContext());
        C25884b bVar = this.f68330i.f68474b;
        if (a != null) {
            JSONObject a2 = m84986a(bVar);
            long currentTimeMillis = System.currentTimeMillis() - this.f68323a;
            this.f68323a = 0;
            if (bVar.f68446a > 0) {
                if (currentTimeMillis > 0 && !this.f68324b) {
                    this.f68325c.mo67224a(currentTimeMillis, bVar.f68446a, a2, m84987a(bVar, (String) null));
                    this.f68324b = true;
                }
                if (z || a.isFinishing()) {
                    this.f68325c.mo67225a(this.f68328g.getContext(), (String) null, bVar.f68446a, a2, m84987a(bVar, (String) null));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67166a() {
        this.f68323a = System.currentTimeMillis();
        this.f68324b = false;
        this.f68325c.mo67223a();
    }

    public AdWebStatBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private static JSONObject m84986a(C25884b bVar) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(bVar.f68456k)) {
                jSONObject = new JSONObject(bVar.f68456k);
            } else {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("log_extra", bVar.f68454i);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo67171a(List<Pattern> list) {
        C25884b bVar = this.f68330i.f68474b;
        if (TextUtils.isEmpty(bVar.f68465t) || bVar.f68466u == 4) {
            if (list == null) {
                list = new ArrayList<>();
            }
            try {
                List<String> adLandingPagePreloadCommonPrefix = C30199h.m98861a().getAdLandingPageConfig().getAdLandingPagePreloadCommonPrefix();
                if (!C6307b.m19566a((Collection<T>) adLandingPagePreloadCommonPrefix)) {
                    for (String compile : adLandingPagePreloadCommonPrefix) {
                        list.add(Pattern.compile(compile));
                    }
                }
            } catch (NullValueException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo67173b(WebView webView, String str) {
        C25884b bVar = this.f68330i.f68474b;
        this.f68325c.mo67226a(webView, str, bVar.f68446a, m84986a(bVar), m84987a(bVar, (String) null));
    }

    /* renamed from: c */
    public final void mo67174c(WebView webView, String str) {
        C25884b bVar = this.f68330i.f68474b;
        this.f68325c.mo67228b(webView, str, bVar.f68446a, m84986a(bVar), m84987a(bVar, (String) null));
    }

    /* renamed from: a */
    private static JSONObject m84987a(C25884b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", bVar.f68467v);
            if (!TextUtils.isEmpty(bVar.f68465t)) {
                jSONObject.put("site_id", bVar.f68465t);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo67168a(WebView webView, String str) {
        C25884b bVar = this.f68330i.f68474b;
        this.f68325c.mo67227a(webView, str, bVar);
        C24736b.f65176b.mo64731a(bVar.f68465t, bVar.f68466u, bVar.f68467v);
    }

    /* renamed from: a */
    public final void mo67170a(C20142i iVar, C20145l lVar) {
        C25884b bVar = this.f68330i.f68474b;
        if (TextUtils.isEmpty(bVar.f68465t) || bVar.f68466u == 4) {
            iVar.mo53905a((C20141a) new C43432a(lVar.mo53917a(C43447i.m137876h())));
        }
    }

    /* renamed from: a */
    public final void mo67167a(WebView webView, WebResourceRequest webResourceRequest, String str) {
        if (webView != null && webResourceRequest != null && VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
            mo67169a(webView, webResourceRequest.getUrl().toString(), str);
        }
    }

    /* renamed from: a */
    public final void mo67169a(WebView webView, String str, String str2) {
        C25884b bVar = this.f68330i.f68474b;
        this.f68325c.mo67229c(webView, str, bVar.f68446a, m84986a(bVar), m84987a(bVar, str2));
    }
}
