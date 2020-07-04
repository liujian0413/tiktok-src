package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.webkit.WebView;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26038l;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetWebViewInfo.C27890b;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness */
public final class PreRenderWebViewBusiness extends Business {

    /* renamed from: a */
    public static final Map<Integer, String> f68365a = C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a(Integer.valueOf(2), "video_bottom_button"), C7579l.m23633a(Integer.valueOf(3), "video_mask_button"), C7579l.m23633a(Integer.valueOf(6), "comment_end_button"), C7579l.m23633a(Integer.valueOf(8), "profile_bottom_button"), C7579l.m23633a(Integer.valueOf(33), "ad_card")});

    /* renamed from: b */
    public static final C25851a f68366b = new C25851a(null);

    /* renamed from: c */
    private C11087a f68367c;

    /* renamed from: d */
    private int f68368d;

    /* renamed from: e */
    private String f68369e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness$a */
    public static final class C25851a {
        private C25851a() {
        }

        public /* synthetic */ C25851a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m85060a(int i) {
            String str = (String) PreRenderWebViewBusiness.f68365a.get(Integer.valueOf(i));
            if (str == null) {
                return "others";
            }
            return str;
        }

        /* renamed from: a */
        public static PreRenderWebViewBusiness m85059a(C25862i iVar, C25886b bVar) {
            if (bVar != null) {
                C25884b bVar2 = bVar.f68474b;
                if (!(bVar2 == null || bVar2.f68466u != 7 || iVar == null)) {
                    return (PreRenderWebViewBusiness) iVar.mo67230a(PreRenderWebViewBusiness.class);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final PreRenderWebViewBusiness m85051a(C25862i iVar, C25886b bVar) {
        return C25851a.m85059a(iVar, bVar);
    }

    /* renamed from: a */
    public static final String m85052a(int i) {
        return C25851a.m85060a(i);
    }

    /* renamed from: a */
    public final void mo67205a() {
        mo67208a((String) null);
    }

    /* renamed from: b */
    public final void mo67209b() {
        this.f68368d = 0;
        C11087a aVar = this.f68367c;
        if (aVar != null) {
            aVar.mo27034b("webViewDidHide", null);
        }
    }

    public PreRenderWebViewBusiness(C25856c cVar) {
        C7573i.m23587b(cVar, "crossPlatformBusiness");
        super(cVar);
    }

    /* renamed from: a */
    public final void mo67208a(String str) {
        this.f68368d = 2;
        C11087a aVar = this.f68367c;
        if (aVar != null) {
            String str2 = "webViewDidShow";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception unused) {
            }
            aVar.mo27034b(str2, jSONObject);
        }
        this.f68369e = str;
    }

    /* renamed from: a */
    public final void mo67207a(C26025c cVar, C27890b bVar) {
        C27876a aVar;
        C7573i.m23587b(cVar, "crossPlatformWebView");
        if (bVar != null) {
            aVar = bVar.f73474b;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int i = bVar.f73473a;
            C26038l a = cVar.mo67463a(C26039m.class);
            C7573i.m23582a((Object) a, "crossPlatformWebView.get…(WebViewWrap::class.java)");
            SingleWebView b = ((C26039m) a).mo67531b();
            if (b != null && i == b.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f68368d);
                jSONObject.put("code", C29956a.f78750c);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f68369e);
                bVar.f73474b.mo71365a(jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo67206a(WebView webView, String str, C11087a aVar) {
        C7573i.m23587b(aVar, "jsBridge");
        this.f68367c = aVar;
    }
}
