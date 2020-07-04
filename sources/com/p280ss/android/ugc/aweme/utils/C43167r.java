package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;

/* renamed from: com.ss.android.ugc.aweme.utils.r */
public final class C43167r {

    /* renamed from: a */
    public static final C43167r f111790a = new C43167r();

    private C43167r() {
    }

    /* renamed from: c */
    public static final boolean m136906c(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            z = aweme.downloadWithoutWatermark;
        } else {
            z = false;
        }
        if (!z || !C28482e.m93606a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static final boolean m136908e(Aweme aweme) {
        Music music;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (music == null || aweme.getMusic().getMusicStatus() != 0 || C24671f.m80862l().mo65866a(aweme)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.isSelfSee() == false) goto L_0x005f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m136907d(com.p280ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            if (r3 == 0) goto L_0x007c
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x007c
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            java.lang.String r1 = "LegacyServiceUtils.getTimeLockRulerService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.mo59240a()
            if (r0 != 0) goto L_0x007c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r3.getStatus()
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.isAllowShare()
            r1 = 1
            if (r0 != r1) goto L_0x007c
            int r0 = r3.getAwemeType()
            r2 = 13
            if (r0 == r2) goto L_0x007c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r3.getStatus()
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r3.getStatus()
            java.lang.String r2 = "status"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r0 = r0.isReviewed()
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r3.getStatus()
            java.lang.String r2 = "status"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r0 = r0.isSelfSee()
            if (r0 != 0) goto L_0x007c
        L_0x005f:
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136775f(r0)
            if (r0 != 0) goto L_0x007c
            com.ss.android.ugc.aweme.feed.model.AwemeControl r0 = r3.getAwemeControl()
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.canShare()
            if (r0 != r1) goto L_0x007c
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43168s.m136910b(r3)
            if (r3 == 0) goto L_0x007c
            return r1
        L_0x007c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43167r.m136907d(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static final boolean m136904a(Aweme aweme) {
        Video video;
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video == null || aweme.getVideo().getVideoLength() <= 0 || ((((long) aweme.getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() && !aweme.isSupportGameChallenge()) || !aweme.canDuetVideoType() || aweme.isVr() || aweme.getDuetSetting() == 2 || m136908e(aweme) || aweme.getMusic() == null || aweme.getMusic().getPlayUrl() == null || aweme.getMusic().getPlayUrl().getUrlList() == null || aweme.getMusic().getPlayUrl().getUrlList().isEmpty() || ((C6399b.m19944t() && aweme.isWithPromotionalMusic()) || aweme.isDouyinGovMediaVip()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m136905b(Aweme aweme) {
        Video video;
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableReact()) {
            if (aweme != null) {
                video = aweme.getVideo();
            } else {
                video = null;
            }
            if (video != null && aweme.getVideo().getVideoLength() > 0 && ((long) aweme.getVideo().getVideoLength()) <= shortVideoConfig.maxDuetVideoTime() && aweme.canReactVideoType() && !aweme.isVr() && aweme.getReactSetting() != 2 && !m136908e(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && !aweme.getMusic().getPlayUrl().getUrlList().isEmpty() && ((!C6399b.m19944t() || !aweme.isWithPromotionalMusic()) && !aweme.isDouyinGovMediaVip())) {
                return true;
            }
        }
        return false;
    }
}
