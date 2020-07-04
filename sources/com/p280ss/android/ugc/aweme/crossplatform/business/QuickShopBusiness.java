package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness */
public class QuickShopBusiness extends Business {

    /* renamed from: a */
    private boolean f68370a;

    /* renamed from: b */
    private boolean f68371b;

    /* renamed from: c */
    private boolean f68372c;

    /* renamed from: b */
    private void m85061b() {
        this.f68370a = false;
        this.f68371b = false;
        this.f68372c = false;
    }

    /* renamed from: a */
    public final void mo67210a() {
        if (m85062c().booleanValue()) {
            m85061b();
        }
    }

    /* renamed from: c */
    private Boolean m85062c() {
        boolean z;
        if (this.f68330i == null || this.f68330i.f68474b == null || this.f68330i.f68474b.f68469x != 2 || !TextUtils.equals(this.f68330i.f68474b.f68470y, "user_profile")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public QuickShopBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo67212a(WebResourceError webResourceError) {
        this.f68370a = true;
    }

    /* renamed from: a */
    public final void mo67214a(String str) {
        String str2;
        if (!this.f68372c && m85062c().booleanValue()) {
            this.f68372c = true;
            if (!this.f68371b) {
                str2 = "failed_user";
            } else if (this.f68370a) {
                str2 = "failed_app";
            } else {
                str2 = "success";
            }
            C6907h.m21524a("enter_flash_store", (Map) C22984d.m75611a().mo59973a("author_id", str).mo59973a("enter_method", "click").mo59973a("is_success", str2).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo67211a(int i, String str, String str2) {
        this.f68370a = true;
    }

    /* renamed from: a */
    public final void mo67213a(WebView webView, String str, String str2) {
        if (!TextUtils.equals(str, "about:blank")) {
            this.f68371b = true;
            mo67214a(str2);
        }
    }
}
