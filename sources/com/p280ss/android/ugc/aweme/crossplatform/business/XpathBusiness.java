package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.newmedia.p897ui.webview.C19996a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25220ac;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness */
public class XpathBusiness extends Business {
    XpathBusiness(C25856c cVar) {
        super(cVar);
    }

    public void xpathDirect(C25886b bVar, WebView webView) {
        if (bVar != null) {
            long j = bVar.f68474b.f68446a;
            String str = bVar.f68474b.f68462q;
            if (j > 0 && !TextUtils.isEmpty(str)) {
                String a = C19996a.m65913a(str, j);
                if (!TextUtils.isEmpty(a) && webView != null) {
                    C25868n.m85107a(webView, a);
                }
            }
            C25220ac.f66537b.mo65837b(j, str);
        }
    }
}
