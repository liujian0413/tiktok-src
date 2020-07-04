package com.p280ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedDisplayInnerMsgPlatformExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareGuideThresholdExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.utils.C42937ar;

/* renamed from: com.ss.android.ugc.aweme.feed.ai */
public final class C28205ai {
    /* renamed from: d */
    public static void m92708d() {
        C23338f.m76566d().mo60632b("last_share_type", (String) null);
    }

    /* renamed from: b */
    public static void m92706b() {
        m92709e();
        C23339g d = C23338f.m76566d();
        d.mo60629b("share_guide_show_times", d.mo60620a("share_guide_show_times", 0) + 1);
    }

    /* renamed from: a */
    public static boolean m92705a() {
        int a = C6384b.m19835a().mo15287a(ShareGuideThresholdExperiment.class, true, "share_guide_threshold", C6384b.m19835a().mo15295d().share_guide_threshold, 0);
        if (a < 0) {
            a = Integer.MAX_VALUE;
        }
        m92709e();
        if (C23338f.m76566d().mo60620a("share_guide_show_times", 0) < a) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static void m92709e() {
        int d = C42937ar.m136299d(System.currentTimeMillis());
        C23339g d2 = C23338f.m76566d();
        if (d2.mo60620a("share_guide_date_day", -1) != d) {
            d2.mo60629b("share_guide_date_day", d);
            d2.mo60629b("share_guide_show_times", 0);
        }
    }

    /* renamed from: c */
    public static String m92707c() {
        boolean z;
        String a = C23338f.m76566d().mo60623a("last_share_type", (String) C23060u.m75742a().mo60033C().mo59877d());
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService == null || !iIMService.isImReduction()) {
            z = false;
        } else {
            z = true;
        }
        if (C6399b.m19944t() || ((C6384b.m19835a().mo15292a(FeedDisplayInnerMsgPlatformExperiment.class, true, "play_twice_share_show_friends", C6384b.m19835a().mo15295d().play_twice_share_show_friends, false) && !z) || !TextUtils.equals(a, "chat_merge"))) {
            return a;
        }
        return (String) C23060u.m75742a().mo60033C().mo59877d();
    }

    /* renamed from: a */
    public static void m92704a(String str) {
        boolean z;
        C23339g d = C23338f.m76566d();
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService == null || !iIMService.isImReduction()) {
            z = false;
        } else {
            z = true;
        }
        if (C6399b.m19944t() || ((C6384b.m19835a().mo15292a(FeedDisplayInnerMsgPlatformExperiment.class, true, "play_twice_share_show_friends", C6384b.m19835a().mo15295d().play_twice_share_show_friends, false) && !z) || !"chat_merge".equals(str))) {
            d.mo60632b("last_share_type", str);
        }
    }
}
