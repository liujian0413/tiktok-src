package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.net.C34090k;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38070aa;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38134v;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness */
public class ShareBusiness extends AbsShareBusiness {
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo67164c() {
        super.mo67164c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo67161b() {
        boolean z;
        boolean z2;
        if ((this.f68331j instanceof Activity) && this.f68314a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "h5_page");
            hashMap.put("previous_page", this.f68330i.f68473a.f68433f);
            hashMap.put("scene_id", "1004");
            C6907h.m21524a("h5_click_more_button", (Map) hashMap);
            C38382b bVar = new C38382b();
            bVar.mo95963a((C38343b) new C38144b(this.f68314a));
            C37984ap.m121301a().injectUniversalConfig(bVar, (Activity) this.f68331j, true);
            bVar.mo95964a((SharePackage) this.f68314a);
            bVar.mo95977b(true);
            String host = Uri.parse(this.f68316c).getHost();
            ArrayList arrayList = new ArrayList(C25833b.m84956a());
            arrayList.addAll((Set) C23060u.m75742a().mo60083m().mo59877d());
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C34090k.m109754a(host, (String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z || !mo67160a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                bVar.mo95974b();
            }
            if (this.f68315b.contains("copylink")) {
                bVar.mo95967a((C38389f) new C38090d("fromWeb", false, true));
            }
            if (this.f68315b.contains("refresh")) {
                bVar.mo95967a((C38389f) new C38070aa(this.f68328g));
            }
            if (this.f68315b.contains("browser")) {
                bVar.mo95967a((C38389f) new C38134v());
            }
            bVar.mo95971a(true);
            this.f68314a.f20186l.putString("aweme_id", this.f68330i.f68473a.f68437j);
            bVar.mo95966a((C38386d) new C38386d() {
                /* renamed from: a */
                public final void mo67217a(SharePackage sharePackage, Context context) {
                }

                /* renamed from: b */
                public final void mo67219b(SharePackage sharePackage, Context context) {
                }

                /* renamed from: a */
                public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                    if (fVar instanceof C38090d) {
                        ShareBusiness.this.mo67163b(fVar.mo95715b());
                    }
                }

                /* renamed from: a */
                public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                    ShareBusiness.this.mo67163b(bVar.mo95739b());
                }
            });
            new CommonShareDialog(C6405d.m19984g(), bVar.mo95972a()).show();
        }
    }

    public ShareBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67157a(WebView webView) {
        super.mo67157a(webView);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo67162b(WebView webView) {
        super.mo67162b(webView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67158a(String str) {
        super.mo67158a(str);
    }
}
