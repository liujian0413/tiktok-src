package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager.C32984a;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.p1685ug.praise.C42731b;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;

/* renamed from: com.ss.android.ugc.aweme.bk */
public final class C21678bk implements C21668ba {
    /* renamed from: f */
    public final boolean mo57948f() {
        return C32984a.m106625a();
    }

    /* renamed from: a */
    public final void mo57930a() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkOnLineTimer();
    }

    /* renamed from: d */
    public final void mo57944d() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onRecommendFeedStopForLanguage();
    }

    /* renamed from: e */
    public final void mo57946e() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onFeedStop();
    }

    /* renamed from: b */
    public final boolean mo57941b() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isUploadContactsNoticeDialogShowing();
    }

    /* renamed from: c */
    public final boolean mo57943c() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getInterestSelectShowed();
    }

    /* renamed from: b */
    public final void mo57938b(int i) {
        C42731b.m135640a(i);
    }

    /* renamed from: d */
    public final void mo57945d(Context context) {
        C42731b.m135645b(context);
    }

    /* renamed from: e */
    public final void mo57947e(Context context) {
        C43033cw.m136552b(context);
    }

    /* renamed from: b */
    public final void mo57940b(boolean z) {
        C42731b.m135642a(z);
    }

    /* renamed from: b */
    public final void mo57939b(Context context) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkContentDialogNeedShow(context);
    }

    /* renamed from: c */
    public final void mo57942c(Context context) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onFeedStartForInitialChooseLanguage(context);
    }

    /* renamed from: f */
    public final boolean mo57949f(Context context) {
        return C43034cx.m136550a(context);
    }

    /* renamed from: a */
    public final void mo57931a(int i) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).startFeedsDetectTask(i);
    }

    /* renamed from: a */
    public final void mo57934a(Context context) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryShowMoneyGrowthDialog(context);
    }

    /* renamed from: a */
    public final void mo57936a(boolean z) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).increaseViewedCount(z);
    }

    /* renamed from: a */
    public final void mo57932a(int i, boolean z) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(i, false);
    }

    /* renamed from: a */
    public final void mo57933a(Activity activity, boolean z) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkForUpdate(activity, false, "");
    }

    /* renamed from: a */
    public final void mo57935a(Context context, Aweme aweme) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onFeedStartForContentLanguageGuide(context, aweme);
    }

    /* renamed from: a */
    public final boolean mo57937a(Context context, String str, String str2) {
        return C42722c.m135620a(context, str, str2);
    }
}
