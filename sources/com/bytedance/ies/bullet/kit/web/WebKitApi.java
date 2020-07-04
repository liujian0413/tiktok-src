package com.bytedance.ies.bullet.kit.web;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10397r;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.kit.KitNotMatchException;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

public final class WebKitApi implements C10378c<C10644k, C10642i, C10648o, C10643j> {
    public static final C10614a Companion = new C10614a(null);
    public static final String SCHEME_HTTP = "http";
    public static final String SCHEME_HTTPS = "https";

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$a */
    public static final class C10614a {
        private C10614a() {
        }

        public /* synthetic */ C10614a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$b */
    public static final class C10615b implements C10410d<C10397r> {

        /* renamed from: a */
        final /* synthetic */ WebKitApi f28455a;

        C10615b(WebKitApi webKitApi) {
            this.f28455a = webKitApi;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo25083a(C10397r rVar, C7562b<? super C10397r, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
            C7573i.m23587b(rVar, "input");
            C7573i.m23587b(bVar, "resolve");
            C7573i.m23587b(bVar2, "reject");
            if (C7573i.m23585a((Object) rVar.f28126a.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) rVar.f28126a.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                bVar.invoke(rVar);
                return;
            }
            KitNotMatchException kitNotMatchException = new KitNotMatchException(this.f28455a, rVar.f28126a, null, 4, null);
            bVar2.invoke(kitNotMatchException);
        }
    }

    public final void onApiMounted(C10648o oVar) {
        C7573i.m23587b(oVar, "kitInstanceApi");
    }

    public final C10410d<C10397r> provideProcessor() {
        return new C10615b<>(this);
    }

    public final void onInitialized(C10643j jVar, C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        if (jVar != null) {
            C10666s a = jVar.mo25498a();
            if (a != null && VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(a.f28526a);
            }
        }
    }

    public final C10648o provideInstanceApi(C10400u uVar, List<String> list, C10336c cVar, C10403b bVar) {
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        C10648o oVar = new C10648o(this, uVar, list, cVar, bVar);
        return oVar;
    }
}
