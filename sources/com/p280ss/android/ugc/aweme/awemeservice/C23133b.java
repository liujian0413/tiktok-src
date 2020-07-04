package com.p280ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.p1046a.C23115a;
import com.p280ss.android.ugc.aweme.awemeservice.p1046a.C23122b;
import com.p280ss.android.ugc.aweme.awemeservice.p1046a.C23123c;
import com.p280ss.android.ugc.aweme.awemeservice.p1046a.C23128g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.VideoControl;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.b */
public final class C23133b {

    /* renamed from: a */
    private static C23133b f61060a;

    /* renamed from: b */
    private C23122b<String> f61061b;

    /* renamed from: c */
    private boolean f61062c;

    /* renamed from: d */
    private boolean f61063d;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo60279c() throws Exception {
        this.f61061b.mo60235b();
        return null;
    }

    /* renamed from: a */
    public static C23133b m76028a() {
        if (f61060a == null) {
            f61060a = new C23133b();
        }
        return f61060a;
    }

    /* renamed from: b */
    public final void mo60277b() {
        C1592h.m7853a((Callable<TResult>) new C23136c<TResult>(this));
    }

    private C23133b() {
        boolean z;
        C23122b<String> bVar;
        if (((IMainService) ServiceManager.get().getService(IMainService.class)).isUseJediAwemelistFragment() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isRelationLabelClickEnter()) {
            z = true;
        } else {
            z = false;
        }
        this.f61062c = z;
        this.f61063d = ((IMainService) ServiceManager.get().getService(IMainService.class)).isReplaceAwemeCache();
        if (this.f61062c) {
            bVar = C23115a.f61033a;
        } else if (this.f61063d) {
            bVar = new C23128g<>();
        } else {
            bVar = new C23123c<>();
        }
        this.f61061b = bVar;
    }

    /* renamed from: b */
    private static boolean m76031b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: d */
    private static boolean m76036d(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m76033c(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private Aweme m76034d(String str) {
        if (this.f61061b.mo60236b(str)) {
            return this.f61061b.mo60232a(str);
        }
        return null;
    }

    /* renamed from: f */
    private static AwemeStatistics m76038f(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null) {
            statistics = new AwemeStatistics();
            aweme.setStatistics(statistics);
        }
        return statistics;
    }

    /* renamed from: a */
    public final void mo60274a(long j) {
        for (Aweme feedCount : this.f61061b.mo60233a()) {
            feedCount.setFeedCount(j);
        }
    }

    /* renamed from: e */
    private static boolean m76037e(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (C25268bg.m83039a(aweme) != null) {
            return true;
        }
        if ((aweme.getStarAtlasInfo() == null || aweme.getStarAtlasInfo().getStarAtlasLink() == null) && aweme.getAwemeNationalTask() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Aweme mo60276b(String str) {
        Aweme aweme;
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return null;
        }
        if (this.f61061b.mo60236b(str)) {
            aweme = this.f61061b.mo60232a(str);
        } else {
            aweme = C23114a.m75956a().mo60227a(str);
        }
        return aweme;
    }

    /* renamed from: c */
    public final void mo60280c(String str) {
        C23114a.m75956a().mo60231c(str);
        Aweme d = m76034d(str);
        AwemeStatistics f = m76038f(d);
        if (f != null) {
            f.setCommentCount(f.getCommentCount() + 1);
            this.f61061b.mo60234a(d.getAid(), d);
        }
    }

    /* renamed from: a */
    public final Aweme mo60270a(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (m76031b(aweme) || m76033c(aweme) || m76036d(aweme) || m76037e(aweme)) {
            return C23114a.m75956a().mo60226a(aweme);
        }
        return m76029a(aweme, this.f61061b);
    }

    /* renamed from: a */
    public final Aweme mo60272a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("type0");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("type1");
        String sb4 = sb3.toString();
        if (this.f61061b.mo60236b(sb2)) {
            return this.f61061b.mo60232a(sb2);
        }
        if (this.f61061b.mo60236b(sb4)) {
            return this.f61061b.mo60232a(sb4);
        }
        return null;
    }

    /* renamed from: b */
    public static void m76030b(Aweme aweme, int i) {
        if (aweme != null) {
            aweme.setCommentSetting(i);
        }
    }

    /* renamed from: c */
    public static void m76032c(Aweme aweme, int i) {
        if (aweme != null) {
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                videoControl.preventDownloadType = i;
            }
        }
    }

    /* renamed from: a */
    public static Aweme m76029a(Aweme aweme, C23122b<String> bVar) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || bVar == null || aweme.isProhibited() || aweme.isSelfSee()) {
            return aweme;
        }
        if (bVar.mo60236b(aweme.getAid())) {
            Aweme a = bVar.mo60232a(aweme.getAid());
            if (a != null) {
                a.update(aweme);
                aweme = a;
            }
        }
        bVar.mo60234a(aweme.getAid(), aweme);
        return aweme;
    }

    /* renamed from: d */
    public final void mo60282d(String str, int i) {
        Aweme b = mo60276b(str);
        if (b != null) {
            b.setCollectStatus(i);
            this.f61061b.mo60234a(b.getAid(), b);
        }
        if (C6399b.m19944t() && i == 1) {
            ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("collect_video", str);
        }
    }

    /* renamed from: d */
    private void m76035d(Aweme aweme, int i) {
        aweme.setUserDigg(i);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i != 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            if (C6399b.m19944t()) {
                ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_like_video_1", aweme.getAid());
                ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_like_video_5", null);
            }
        } else if (statistics != null) {
            statistics.setDiggCount(statistics.getDiggCount() - 1);
        }
        this.f61061b.mo60234a(aweme.getAid(), aweme);
    }

    /* renamed from: b */
    public final void mo60278b(String str, int i) {
        C23114a.m75956a().mo60228a(str, i);
        Aweme d = m76034d(str);
        AwemeStatistics f = m76038f(d);
        if (f != null) {
            f.setCommentCount(i);
            this.f61061b.mo60234a(d.getAid(), d);
        }
    }

    /* renamed from: c */
    public final void mo60281c(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            C23114a.m75956a().mo60230b(str, i);
            Aweme d = m76034d(str);
            if (d == null) {
                Aweme a = mo60273a(str, 0);
                if (a != null) {
                    m76035d(a, i);
                }
                Aweme a2 = mo60273a(str, 1);
                if (a2 != null) {
                    m76035d(a2, i);
                }
                return;
            }
            m76035d(d, i);
        }
    }

    /* renamed from: a */
    public final Aweme mo60271a(Aweme aweme, int i) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (m76031b(aweme) || m76033c(aweme) || m76036d(aweme) || m76037e(aweme)) {
            return C23114a.m75956a().mo60226a(aweme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append("type");
        sb.append(i);
        String sb2 = sb.toString();
        if (this.f61061b.mo60236b(sb2)) {
            Aweme a = this.f61061b.mo60232a(sb2);
            if (a != null) {
                a.update(aweme);
                return a;
            }
            this.f61061b.mo60234a(sb2, aweme);
        } else {
            this.f61061b.mo60234a(sb2, aweme);
        }
        return aweme;
    }

    /* renamed from: a */
    public final Aweme mo60273a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("type");
        sb.append(i);
        String sb2 = sb.toString();
        if (this.f61061b.mo60236b(sb2)) {
            return this.f61061b.mo60232a(sb2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo60275a(String str, String str2) {
        Aweme b = mo60276b(str);
        if (b != null) {
            b.setRawPromotion(str2);
        }
    }
}
