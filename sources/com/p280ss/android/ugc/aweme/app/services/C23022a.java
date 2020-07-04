package com.p280ss.android.ugc.aweme.app.services;

import android.webkit.WebView;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.newmedia.p897ui.webview.C20006h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.api.FriendApi;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.util.C42866a;

/* renamed from: com.ss.android.ugc.aweme.app.services.a */
public final class C23022a implements C33014a {

    /* renamed from: com.ss.android.ugc.aweme.app.services.a$a */
    static final class C23023a<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        public static final C23023a f60799a = new C23023a();

        C23023a() {
        }

        public final /* bridge */ /* synthetic */ Object then(C1592h hVar) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo59997a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append(C35731g.m115444a(true));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo59998a(String str) {
        C42866a.m136074a(str);
    }

    /* renamed from: a */
    public final void mo59999a(String str, WebView webView) {
        C20006h.m65928a(str, webView);
    }

    /* renamed from: a */
    public final void mo60000a(String str, String str2, String str3) {
        ((FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FriendApi.class)).uploadAccessToken(str, str2, str3).mo6875a((C1591g<TResult, TContinuationResult>) C23023a.f60799a);
    }
}
