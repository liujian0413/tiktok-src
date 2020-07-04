package com.p280ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36403cq;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.service.b */
public final class C36066b implements C36069e {
    /* renamed from: a */
    public final void mo91792a() {
        m116162b().checkToTransformMusDraft();
    }

    /* renamed from: b */
    private static IBridgeService m116162b() {
        return (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
    }

    /* renamed from: a */
    public final void mo91796a(BindAccountView bindAccountView) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setHasShowToutiaoLink(bindAccountView);
    }

    /* renamed from: a */
    public final void mo91793a(Activity activity, String str) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).switchToBioUrl(activity, str);
    }

    /* renamed from: a */
    public final void mo91794a(Context context, User user, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).startThirdSocialActivity(context, user, i);
    }

    /* renamed from: a */
    public final void mo91795a(C0608j jVar, String str, C36403cq cqVar) {
        C7573i.m23587b(jVar, "fragmentManager");
        C7573i.m23587b(str, "enterFrom");
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showLinkAccountDialog(jVar, str, cqVar);
    }
}
