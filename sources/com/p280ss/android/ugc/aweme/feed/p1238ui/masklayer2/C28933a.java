package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.experiment.MDislikeReasonExperiment;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28897g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28980c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28985f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28943c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28947f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28948g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28949h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28952j;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28954k;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28956m;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.settings.DislikeReason;
import com.p280ss.android.ugc.aweme.settings.DislikeReasonsSettings;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C38024d;
import com.p280ss.android.ugc.aweme.share.ShareService;
import com.p280ss.android.ugc.aweme.share.experiment.VideoReportEnhanceExperiment;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a */
public final class C28933a implements C28343z<C28318an>, C28519d {

    /* renamed from: e */
    public static final C28934a f76269e = new C28934a(null);

    /* renamed from: a */
    public final C28967f f76270a;

    /* renamed from: b */
    public Aweme f76271b;

    /* renamed from: c */
    public String f76272c;

    /* renamed from: d */
    public SharePackage f76273d;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a$a */
    public static final class C28934a {
        private C28934a() {
        }

        /* renamed from: a */
        public static boolean m95163a() {
            if (!C6399b.m19946v() || C6384b.m19835a().mo15287a(MDislikeReasonExperiment.class, false, "m_dislike_with_reason", C6384b.m19835a().mo15295d().m_dislike_with_reason, 0) != 1) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C28934a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64929a(Object obj) {
    }

    /* renamed from: d */
    public final void mo74230d() {
        C28967f fVar = this.f76270a;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    /* renamed from: e */
    private final C28964c m95149e() {
        if (!C28934a.m95163a()) {
            return null;
        }
        Aweme aweme = this.f76271b;
        if ((aweme == null || !aweme.isAd()) && TextUtils.equals(this.f76272c, "homepage_hot")) {
            return new C28964c(new C28985f(R.drawable.aw1, R.string.cmd), new C28954k(this), new C28956m(this));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (((com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0).isFamiliarFeedFullScreen() != false) goto L_0x0058;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28969h m95150f() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isAd()
            r2 = 1
            if (r0 != r2) goto L_0x0012
            return r1
        L_0x0012:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93606a(r0)
            if (r0 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.String r0 = r4.f76272c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = "homepage_follow"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = r4.f76272c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = "homepage_familiar"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136762a(r0)
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r2 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r2)
            java.lang.String r2 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.isFamiliarFeedFullScreen()
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r1
        L_0x0058:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r0 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r2 = 2131232926(0x7f08089e, float:1.8081975E38)
            r3 = 2131829271(0x7f112217, float:1.9291506E38)
            r1.<init>(r2, r3)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.b r2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.b
            r2.<init>(r4)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l r2 = (com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l) r2
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a.m95150f():com.ss.android.ugc.aweme.feed.ui.masklayer2.h");
    }

    /* renamed from: g */
    private final C28969h m95151g() {
        int i;
        if (this.f76271b == null) {
            return null;
        }
        Aweme aweme = this.f76271b;
        if ((aweme == null || !aweme.isAd()) && !C28482e.m93606a(this.f76271b) && TextUtils.equals(this.f76272c, "homepage_familiar") && !C43122ff.m136762a(this.f76271b)) {
            Object service = ServiceManager.get().getService(IBridgeService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
            if (((IBridgeService) service).isFamiliarFeedFullScreen()) {
                Aweme aweme2 = this.f76271b;
                if (aweme2 != null) {
                    User author = aweme2.getAuthor();
                    if (author != null && author.getGender() == 2) {
                        i = R.string.dh;
                        return new C28969h(new C28985f(R.drawable.avt, i), new C28947f(this));
                    }
                }
                i = R.string.di;
                return new C28969h(new C28985f(R.drawable.avt, i), new C28947f(this));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28969h m95152h() {
        /*
            r4 = this;
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a.C28934a.m95163a()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76271b
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.getUid()
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            boolean r0 = com.p280ss.android.ugc.aweme.share.C37981am.m121297a(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r4.f76272c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = "homepage_hot"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r0 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f
            r2 = 2131232935(0x7f0808a7, float:1.8081993E38)
            r3 = 2131825139(0x7f1111f3, float:1.9283126E38)
            r1.<init>(r2, r3)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.k r2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.k
            r2.<init>(r4)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l r2 = (com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l) r2
            r0.<init>(r1, r2)
            return r0
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a.m95152h():com.ss.android.ugc.aweme.feed.ui.masklayer2.h");
    }

    /* renamed from: i */
    private final C28969h m95153i() {
        boolean z;
        if (C6399b.m19944t()) {
            z = C28482e.m93618k(this.f76271b);
        } else {
            if (this.f76271b != null && !C28482e.m93616i(this.f76271b) && !C28482e.m93617j(this.f76271b)) {
                Aweme aweme = this.f76271b;
                if ((aweme == null || aweme.getAwemeType() != 13) && ((C43168s.m136910b(this.f76271b) || C28482e.m93606a(this.f76271b)) && C43168s.m136915g(this.f76271b))) {
                    C28482e.m93606a(this.f76271b);
                }
            }
            z = false;
        }
        if (z) {
            C38024d.m121366a(true, this.f76272c, this.f76271b);
            return new C28969h(new C28985f(R.drawable.avu, R.string.dis), new C28948g(this));
        }
        C38024d.m121366a(false, this.f76272c, this.f76271b);
        return null;
    }

    /* renamed from: j */
    private final C28969h m95154j() {
        int i;
        int i2;
        int i3;
        Aweme aweme = this.f76271b;
        if (aweme == null || !aweme.isCollected()) {
            if (C6399b.m19944t()) {
                i3 = R.string.ip;
            } else {
                i3 = R.string.e1m;
            }
            if (C6399b.m19946v()) {
                i = R.drawable.avx;
            } else {
                i = R.drawable.avw;
            }
        } else {
            if (C6399b.m19944t()) {
                i2 = R.string.iq;
            } else {
                i2 = R.string.wc;
            }
            if (C6399b.m19946v()) {
                i = R.drawable.avz;
            } else {
                i = R.drawable.avy;
            }
        }
        return new C28969h(new C28985f(i, i2), new C28949h(this));
    }

    /* renamed from: k */
    private final C28969h m95155k() {
        Aweme aweme = this.f76271b;
        if ((aweme == null || !aweme.isAd()) && !C28482e.m93606a(this.f76271b) && C6384b.m19835a().mo15292a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", C6384b.m19835a().mo15295d().enable_enhance_report, false)) {
            return new C28969h(new C28985f(R.drawable.aw3, R.string.des), new C28974j(this));
        }
        return null;
    }

    /* renamed from: a */
    public final List<C28968g> mo74227a() {
        List arrayList = new ArrayList();
        if (C6399b.m19944t()) {
            arrayList.add(m95152h());
            arrayList.add(m95149e());
            arrayList.add(m95153i());
            arrayList.add(m95154j());
            arrayList.add(m95155k());
        } else {
            arrayList.add(m95152h());
            arrayList.add(m95150f());
            arrayList.add(m95151g());
            arrayList.add(m95153i());
            arrayList.add(m95154j());
        }
        return C7525m.m23509d((Collection<? extends T>) C7525m.m23510e(arrayList));
    }

    /* renamed from: b */
    public final boolean mo74228b() {
        User user;
        if (this.f76271b != null && !C6399b.m19944t() && DDislikeStyleExperiment.enableIMShare()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin() && !TimeLockRuler.isTeenModeON()) {
                Aweme aweme = this.f76271b;
                if (aweme != null) {
                    AwemeStatus status = aweme.getStatus();
                    if (status != null && status.isAllowShare()) {
                        Aweme aweme2 = this.f76271b;
                        if ((aweme2 == null || aweme2.getAwemeType() != 13) && !C28897g.m95083b(this.f76271b)) {
                            Aweme aweme3 = this.f76271b;
                            if (aweme3 != null) {
                                user = aweme3.getAuthor();
                            } else {
                                user = null;
                            }
                            if (!C43122ff.m136775f(user)) {
                                Aweme aweme4 = this.f76271b;
                                if (aweme4 != null) {
                                    AwemeControl awemeControl = aweme4.getAwemeControl();
                                    if (awemeControl != null && awemeControl.canShare() && C43168s.m136910b(this.f76271b)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final List<C28965d> mo74229c() {
        DislikeReason[] dislikeReasonArr;
        List<C28965d> arrayList = new ArrayList<>();
        try {
            Object a = C10292j.m30480a().mo25014a(DislikeReasonsSettings.class, "dislike_reasons", C6384b.m19835a().mo15294c().getDislikeReasons(), "com.ss.android.ugc.aweme.settings.DislikeReason[]", DislikeReason[].class);
            C7573i.m23582a(a, "SettingsManager.getInsta…sonsSettings::class.java)");
            for (DislikeReason dislikeReason : (DislikeReason[]) a) {
                arrayList.add(new C28965d(new C28980c(dislikeReason.getId(), dislikeReason.getText()), new C28943c(this)));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f76272c;
    }

    /* renamed from: a */
    public final C28966e mo74226a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        return new C28966e(iMContact, new C28952j(this, iMContact));
    }

    public C28933a(C28967f fVar, Aweme aweme, String str) {
        C7573i.m23587b(str, "enterFrom");
        this.f76270a = fVar;
        this.f76271b = aweme;
        this.f76272c = str;
        ShareService a = C37984ap.m121301a();
        Context a2 = C6399b.m19921a();
        if (aweme == null) {
            C7573i.m23580a();
        }
        this.f76273d = a.parseAweme(a2, aweme, 0, str, "long_press_download");
    }
}
