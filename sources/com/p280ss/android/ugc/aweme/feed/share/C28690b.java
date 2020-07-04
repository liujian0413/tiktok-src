package com.p280ss.android.ugc.aweme.feed.share;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C37981am;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.gif.C38044a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38073ac;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38089c;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38098g;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38102h;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38107j;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38108k;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38124p;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38135w;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43167r;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.feed.share.b */
public final class C28690b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f75559a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28690b.class), "needAddStatusAction", "getNeedAddStatusAction()Z"))};

    /* renamed from: b */
    public final Aweme f75560b;

    /* renamed from: c */
    public final boolean f75561c;

    /* renamed from: d */
    private final C7541d f75562d = C7546e.m23569a(new C28691a(this));

    /* renamed from: e */
    private final Context f75563e;

    /* renamed from: f */
    private final C38382b f75564f;

    /* renamed from: g */
    private final C28343z<C28318an> f75565g;

    /* renamed from: h */
    private final String f75566h;

    /* renamed from: i */
    private final int f75567i;

    /* renamed from: com.ss.android.ugc.aweme.feed.share.b$a */
    static final class C28691a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C28690b f75568a;

        C28691a(C28690b bVar) {
            this.f75568a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m94405a());
        }

        /* renamed from: a */
        private boolean m94405a() {
            boolean z = false;
            if ((this.f75568a.f75561c && !C28482e.m93606a(this.f75568a.f75560b)) || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableStatusMode()) {
                return false;
            }
            if (this.f75568a.f75560b.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(this.f75568a.f75560b.getUploadMiscInfoStruct().mStatusId)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: m */
    private final boolean m94393m() {
        return ((Boolean) this.f75562d.getValue()).booleanValue();
    }

    /* renamed from: c */
    private final void m94383c() {
        if (C7163a.m22363a() && C25329c.m83221d(this.f75560b)) {
            this.f75564f.mo95967a((C38389f) new C38102h(this.f75560b));
        }
    }

    /* renamed from: d */
    private final void m94384d() {
        if (C7163a.m22363a()) {
            C38389f adminOpsAction = C37950a.m121238a().getAdminOpsAction(this.f75560b, this.f75566h);
            if (adminOpsAction != null) {
                this.f75564f.mo95967a(adminOpsAction);
            }
        }
    }

    /* renamed from: i */
    private final void m94389i() {
        this.f75564f.mo95967a((C38389f) new C38098g(this.f75560b, this.f75566h));
    }

    /* renamed from: j */
    private final void m94390j() {
        if (C28482e.m93606a(this.f75560b)) {
            this.f75564f.mo95967a((C38389f) new C38107j(this.f75565g));
        }
    }

    /* renamed from: p */
    private final void m94396p() {
        if (m94393m()) {
            this.f75564f.mo95967a(C37950a.m121238a().getStatusAction(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: e */
    private final void m94385e() {
        if (!this.f75561c && !C25329c.m83220c(this.f75560b) && !C38044a.f99049a.mo95682a(this.f75560b)) {
            this.f75564f.mo95967a((C38389f) new C38124p(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: h */
    private final void m94388h() {
        if (!C28482e.m93606a(this.f75560b) && !this.f75561c) {
            this.f75564f.mo95967a((C38389f) new C38073ac(this.f75560b, this.f75565g, this.f75566h));
        }
    }

    /* renamed from: k */
    private final void m94391k() {
        if (C28482e.m93618k(this.f75560b)) {
            this.f75564f.mo95967a(C37984ap.m121302b().getDownloadAction(C38157b.m121903a(this.f75563e), this.f75560b, this.f75566h, "click_download_icon", true));
        }
    }

    /* renamed from: l */
    private final void m94392l() {
        if (C37950a.m121238a().isEnterpriseUserVideo(this.f75560b) || C37950a.m121238a().shouldStickVideoTop(this.f75560b)) {
            this.f75564f.mo95967a(C37950a.m121238a().getEnterpriseTopAction(this.f75560b));
        }
    }

    /* renamed from: s */
    private final void m94399s() {
        C37950a.m121238a().eventForLiveWallPaper(this.f75560b, this.f75566h);
        if (C37950a.m121238a().isShowLiveWallpaper(this.f75560b)) {
            C38389f liveWallPaperAction = C37950a.m121238a().getLiveWallPaperAction(this.f75560b, this.f75566h);
            if (liveWallPaperAction != null) {
                this.f75564f.mo95967a(liveWallPaperAction);
            }
        }
    }

    /* renamed from: t */
    private final void m94400t() {
        if (!this.f75561c && !C25329c.m83220c(this.f75560b) && C7573i.m23585a((Object) this.f75566h, (Object) "homepage_hot") && !C28482e.m93606a(this.f75560b)) {
            this.f75564f.mo95967a((C38389f) new C38108k(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: u */
    private final void m94401u() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isPrivateAvailable = inst.getIsPrivateAvailable();
        C7573i.m23582a((Object) isPrivateAvailable, "SharePrefCache.inst().isPrivateAvailable");
        Object d = isPrivateAvailable.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().isPrivateAvailable.cache");
        if (((Boolean) d).booleanValue() && C28482e.m93606a(this.f75560b)) {
            this.f75564f.mo95967a((C38389f) new C38135w(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: v */
    private final void m94402v() {
        if (C28482e.m93606a(this.f75560b) && this.f75560b.isUserPost()) {
            this.f75564f.mo95967a((C38389f) new C38089c(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: b */
    private final void m94382b() {
        Object service = ServiceManager.get().getService(IUserService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
        User currentUser = ((IUserService) service).getCurrentUser();
        if (C28482e.m93606a(this.f75560b) && currentUser != null) {
            CommerceUserInfo commerceUserInfo = currentUser.getCommerceUserInfo();
            if (commerceUserInfo != null && commerceUserInfo.getAdInfluencerType() == 1) {
                C38389f adSettingAction = C37950a.m121238a().getAdSettingAction(this.f75560b, this.f75566h);
                if (adSettingAction != null) {
                    this.f75564f.mo95967a(adSettingAction);
                }
            }
        }
    }

    /* renamed from: f */
    private final void m94386f() {
        if (C43167r.m136906c(this.f75560b)) {
            C6907h.m21524a("download_without_logo", (Map) new C22984d().mo59973a("action_type", "show").mo59973a("group_id", this.f75560b.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f75560b)).mo59973a("enter_from", this.f75566h).f60753a);
            C38389f noWatermarkDownloadAction = C37950a.m121238a().getNoWatermarkDownloadAction(this.f75560b, this.f75566h, this.f75567i);
            if (noWatermarkDownloadAction != null) {
                this.f75564f.mo95967a(noWatermarkDownloadAction);
            }
        }
    }

    /* renamed from: g */
    private final void m94387g() {
        if (C6399b.m19944t()) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl canCreateInsights = inst.getCanCreateInsights();
            C7573i.m23582a((Object) canCreateInsights, "SharePrefCache.inst().canCreateInsights");
            Object d = canCreateInsights.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().canCreateInsights.cache");
            if (((Boolean) d).booleanValue()) {
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                if (f.getCurUser() != null) {
                    IAccountUserService f2 = C6861a.m21337f();
                    C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                    User curUser = f2.getCurUser();
                    C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                    if (curUser.getIsCreater() && C37981am.m121297a(this.f75560b.getAuthorUid())) {
                        C38389f insightAction = C37950a.m121238a().getInsightAction(this.f75560b);
                        if (insightAction != null) {
                            this.f75564f.mo95967a(insightAction);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private final void m94394n() {
        if (!m94393m()) {
            if ((!this.f75561c || C28482e.m93606a(this.f75560b)) && this.f75560b.hasStickerID()) {
                C6907h.m21524a("prop_reuse_icon", (Map) C22984d.m75611a().mo59973a("prop_id", this.f75560b.getStickerIDs()).mo59973a("action_type", "show").mo59973a("group_id", this.f75560b.getAid()).f60753a);
                this.f75564f.mo95967a(C37950a.m121238a().getReuseStickerAction(this.f75560b, this.f75566h));
            }
        }
    }

    /* renamed from: o */
    private final void m94395o() {
        if (!m94393m()) {
            if ((!this.f75561c || C28482e.m93606a(this.f75560b)) && !this.f75560b.hasStickerID() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().showMvThemeRecordMode() && this.f75560b.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(this.f75560b.getUploadMiscInfoStruct().mvThemeId)) {
                this.f75564f.mo95967a(C37950a.m121238a().getReuseMvThemeAction(this.f75560b, this.f75566h));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (((java.lang.Boolean) r0.mo59877d()).booleanValue() == false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m94397q() {
        /*
            r4 = this;
            boolean r0 = r4.f75561c
            if (r0 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f75560b
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93606a(r0)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f75560b
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43167r.m136904a(r0)
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f75560b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "aweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f75560b
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93606a(r0)
            if (r0 == 0) goto L_0x0050
        L_0x002e:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19947w()
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60041K()
            java.lang.String r1 = "CommonSharePrefCache.inst().canDuet()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 != 0) goto L_0x0064
            com.ss.android.ugc.aweme.sharer.ui.c$b r0 = r4.f75564f
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a.m121238a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f75560b
            java.lang.String r3 = r4.f75566h
            com.ss.android.ugc.aweme.sharer.ui.f r1 = r1.getDuetAction(r2, r3)
            r0.mo95967a(r1)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.share.C28690b.m94397q():void");
    }

    /* renamed from: r */
    private final void m94398r() {
        boolean z;
        if ((!this.f75561c || C28482e.m93606a(this.f75560b)) && this.f75560b.getStatus() != null && this.f75560b.getAuthor() != null) {
            boolean z2 = true;
            if (C43167r.m136905b(this.f75560b)) {
                AwemeStatus status = this.f75560b.getStatus();
                C7573i.m23582a((Object) status, "aweme.status");
                if (!status.isDelete()) {
                    z = true;
                    User author = this.f75560b.getAuthor();
                    C7573i.m23582a((Object) author, "aweme.author");
                    if (!author.isSecret() || C37981am.m121297a(this.f75560b.getAuthorUid())) {
                        z2 = false;
                    }
                    if (z && !z2) {
                        this.f75564f.mo95967a(C37950a.m121238a().getReactAction(this.f75560b, this.f75566h));
                    }
                }
            }
            z = false;
            User author2 = this.f75560b.getAuthor();
            C7573i.m23582a((Object) author2, "aweme.author");
            z2 = false;
            this.f75564f.mo95967a(C37950a.m121238a().getReactAction(this.f75560b, this.f75566h));
        }
    }

    /* renamed from: w */
    private final void m94403w() {
        if (C7573i.m23585a((Object) this.f75566h, (Object) "homepage_hot")) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl isOb = inst.isOb();
            C7573i.m23582a((Object) isOb, "SharePrefCache.inst().isOb");
            Object d = isOb.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().isOb.cache");
            if (((Boolean) d).booleanValue()) {
                this.f75564f.mo95967a(C37950a.m121238a().getRestrictAction(this.f75560b, this.f75566h)).mo95967a(C37950a.m121238a().getBlackListAction(this.f75560b, this.f75566h));
            }
        }
    }

    /* renamed from: a */
    public final void mo73751a() {
        if (C43168s.m136911c(this.f75560b) && !C28482e.m93606a(this.f75560b)) {
            m94388h();
            m94389i();
        } else if (this.f75560b.getAwemeType() == 13) {
            m94388h();
            m94390j();
        } else if (C24220a.m79551a().isInLongVideoPage(C38157b.m121903a(this.f75563e))) {
            m94388h();
            m94389i();
        } else if (C43122ff.m136767b()) {
            m94388h();
        } else {
            m94387g();
            m94394n();
            m94395o();
            m94396p();
            m94397q();
            m94398r();
            m94391k();
            m94386f();
            m94385e();
            m94389i();
            m94401u();
            m94400t();
            m94388h();
            m94399s();
            m94382b();
            m94390j();
            m94402v();
            m94392l();
            m94403w();
        }
        m94383c();
        m94384d();
    }

    public C28690b(Aweme aweme, boolean z, Context context, C38382b bVar, C28343z<C28318an> zVar, String str, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar, "builder");
        C7573i.m23587b(zVar, "listener");
        C7573i.m23587b(str, "enterFrom");
        this.f75560b = aweme;
        this.f75561c = z;
        this.f75563e = context;
        this.f75564f = bVar;
        this.f75565g = zVar;
        this.f75566h = str;
        this.f75567i = i;
    }
}
