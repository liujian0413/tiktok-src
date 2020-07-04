package com.p280ss.android.ugc.aweme.share.p1529a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.google.common.collect.ImmutableList;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33241am;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38104i;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38124p;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.share.a.a */
public final class C37956a {

    /* renamed from: a */
    public final int f98833a = this.f98847o.getInt("page_type");

    /* renamed from: b */
    public final String f98834b = this.f98847o.getString("event_type", "");

    /* renamed from: c */
    public final String f98835c = this.f98847o.getString("enter_method", "");

    /* renamed from: d */
    public final String f98836d = this.f98847o.getString("play_list_id", "");

    /* renamed from: e */
    public final String f98837e = this.f98847o.getString("play_list_id_key", "");

    /* renamed from: f */
    public final String f98838f = this.f98847o.getString("play_list_type", "");

    /* renamed from: g */
    public final String f98839g = this.f98847o.getString("tab_name", "");

    /* renamed from: h */
    public final String f98840h = this.f98847o.getString("from", "");

    /* renamed from: i */
    public final String f98841i = this.f98847o.getString("creation_id", "");

    /* renamed from: j */
    public final Aweme f98842j;

    /* renamed from: k */
    public final C28343z<C28318an> f98843k;

    /* renamed from: l */
    private final List<String> f98844l;

    /* renamed from: m */
    private final Activity f98845m;

    /* renamed from: n */
    private final Fragment f98846n;

    /* renamed from: o */
    private final Bundle f98847o;

    /* renamed from: com.ss.android.ugc.aweme.share.a.a$a */
    public static final class C37957a extends C38388e {

        /* renamed from: a */
        final /* synthetic */ C37956a f98848a;

        C37957a(C37956a aVar) {
            this.f98848a = aVar;
        }

        /* renamed from: a */
        public final void mo67217a(SharePackage sharePackage, Context context) {
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
            this.f98848a.f98843k.mo64929a(new C28318an(28));
        }

        /* renamed from: a */
        public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
            C7573i.m23587b(fVar, "action");
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
            if (fVar instanceof C38104i) {
                this.f98848a.mo95567a(fVar.mo95715b(), true, sharePackage, context, this.f98848a.f98842j);
            }
            if (fVar instanceof C38124p) {
                this.f98848a.mo95567a(fVar.mo95715b(), true, sharePackage, context, this.f98848a.f98842j);
            }
            if (C7573i.m23585a((Object) fVar.mo95715b(), (Object) "live_photo")) {
                this.f98848a.mo95567a(fVar.mo95715b(), true, sharePackage, context, this.f98848a.f98842j);
            }
        }

        /* renamed from: a */
        public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
            C7573i.m23587b(bVar, "channel");
            C7573i.m23587b(context, "context");
            this.f98848a.mo95567a(bVar.mo95739b(), z, sharePackage, context, this.f98848a.f98842j);
        }
    }

    /* renamed from: c */
    private final boolean m121255c() {
        if (this.f98846n != null && !(this.f98846n instanceof AbsFragment)) {
            Fragment fragment = this.f98846n;
            if (fragment != null) {
                return ((AbsFragment) fragment).isViewValid();
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsFragment");
        } else if (this.f98845m == null || this.f98845m.isFinishing()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private final boolean m121252b() {
        if (TextUtils.equals(this.f98834b, "homepage_follow") || TextUtils.equals(this.f98834b, "homepage_friends") || TextUtils.equals(this.f98834b, "general_search")) {
            return true;
        }
        if (TextUtils.equals(this.f98834b, "personal_homepage") && TextUtils.isEmpty(this.f98840h)) {
            return true;
        }
        if (!TextUtils.equals(this.f98834b, "others_homepage") || !TextUtils.isEmpty(this.f98840h)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0103, code lost:
        if (r3 != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0111, code lost:
        if (com.p280ss.android.ugc.aweme.utils.C43168s.m136911c(r12.f98842j) == false) goto L_0x0119;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog mo95566a() {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.f98842j
            boolean r0 = r12.m121257e(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.f98842j
            android.app.Activity r2 = r12.f98845m
            android.content.Context r2 = (android.content.Context) r2
            int r3 = r12.f98833a
            java.lang.String r4 = r12.f98834b
            java.lang.String r5 = "eventType"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r5 = r12.f98835c
            java.lang.String r6 = "enterMethod"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r0 = com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C38177b.m121950a(r0, r2, r3, r4, r5)
            android.os.Bundle r2 = r0.f20186l
            android.os.Bundle r3 = r12.f98847o
            r2.putAll(r3)
            com.ss.android.ugc.aweme.sharer.ui.c$b r2 = new com.ss.android.ugc.aweme.sharer.ui.c$b
            r2.<init>()
            r3 = r0
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r3 = (com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage) r3
            com.ss.android.ugc.aweme.sharer.ui.c$b r2 = r2.mo95964a(r3)
            com.ss.android.ugc.aweme.share.ShareDependService r4 = com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a.m121238a()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.f98842j
            android.support.v4.app.Fragment r6 = r12.f98846n
            boolean r4 = r4.whetherShowForwardView(r5, r6)
            if (r4 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel r4 = new com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.f98842j
            android.support.v4.app.Fragment r6 = r12.f98846n
            java.lang.String r7 = r12.f98834b
            java.lang.String r8 = "eventType"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            r4.<init>(r5, r6, r7)
            com.ss.android.ugc.aweme.sharer.b r4 = (com.p280ss.android.ugc.aweme.sharer.C38343b) r4
            r2.mo95963a(r4)
        L_0x005a:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r12.f98842j
            boolean r4 = m121253b(r4)
            if (r4 != 0) goto L_0x0075
            com.ss.android.ugc.aweme.share.ShareDependService r4 = com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a.m121238a()
            java.lang.String r5 = r12.f98834b
            java.lang.String r6 = "eventType"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            r6 = -1
            com.ss.android.ugc.aweme.sharer.b r3 = r4.getImChannel(r3, r5, r6)
            r2.mo95963a(r3)
        L_0x0075:
            com.ss.android.ugc.aweme.share.improve.d.a$a r4 = com.p280ss.android.ugc.aweme.share.improve.p1541d.C38165a.f99287b
            r6 = 0
            r7 = 0
            r8 = 4
            r9 = 0
            r5 = r2
            com.p280ss.android.ugc.aweme.share.improve.p1541d.C38165a.C38166a.m121923a(r5, false, com.bytedance.ies.ugc.appcontext.C6405d.m19984g())
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43168s.m136915g(r3)
            if (r3 == 0) goto L_0x008c
            java.lang.String r3 = "copy"
            r2.mo95968a(r3)
        L_0x008c:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            m121250a(r3, r2)
            com.ss.android.ugc.aweme.share.improve.e.b r3 = new com.ss.android.ugc.aweme.share.improve.e.b
            r4 = 0
            r3.<init>(r4)
            java.util.Comparator r3 = (java.util.Comparator) r3
            r2.mo95976b(r3)
            boolean r3 = com.p280ss.android.ugc.aweme.language.C32326h.m104887i()
            if (r3 != 0) goto L_0x00a8
            boolean r3 = com.p280ss.android.ugc.aweme.language.C32326h.m104880d()
            if (r3 == 0) goto L_0x00ae
        L_0x00a8:
            r3 = 2131826760(0x7f111848, float:1.9286413E38)
            r2.mo95962a(r3)
        L_0x00ae:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x0105
            com.ss.android.ugc.aweme.IAccountService r3 = com.p280ss.android.ugc.aweme.account.C6861a.m21332a()
            com.ss.android.ugc.aweme.IAccountUserService r3 = r3.userService()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.f98842j
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r6 = "aweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getUid()
            boolean r3 = r3.isMe(r5)
            if (r3 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r5 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurUser()
            if (r3 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r5 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurUser()
            boolean r3 = r3.isSecret()
            goto L_0x0103
        L_0x00f4:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            java.lang.String r5 = "aweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            boolean r3 = r3.isSecret()
        L_0x0103:
            if (r3 != 0) goto L_0x0113
        L_0x0105:
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r3 != 0) goto L_0x0113
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43168s.m136911c(r3)
            if (r3 == 0) goto L_0x0119
        L_0x0113:
            r2.mo95974b()
            r2.mo95977b(r4)
        L_0x0119:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            boolean r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25329c.m83220c(r3)
            if (r3 == 0) goto L_0x0124
            r2.mo95977b(r4)
        L_0x0124:
            com.ss.android.ugc.aweme.feed.share.b r3 = new com.ss.android.ugc.aweme.feed.share.b
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.f98842j
            r6 = 0
            android.app.Activity r4 = r12.f98845m
            r7 = r4
            android.content.Context r7 = (android.content.Context) r7
            com.ss.android.ugc.aweme.feed.event.z<com.ss.android.ugc.aweme.feed.event.an> r9 = r12.f98843k
            java.lang.String r10 = r12.f98834b
            java.lang.String r4 = "eventType"
            kotlin.jvm.internal.C7573i.m23582a(r10, r4)
            int r11 = r12.f98833a
            r4 = r3
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.mo73751a()
            com.ss.android.ugc.aweme.share.a.a$a r3 = new com.ss.android.ugc.aweme.share.a.a$a
            r3.<init>(r12)
            com.ss.android.ugc.aweme.sharer.ui.d r3 = (com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d) r3
            r2.mo95966a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            boolean r3 = m121251a(r3)
            if (r3 == 0) goto L_0x01ad
            boolean r3 = r12.m121255c()
            if (r3 == 0) goto L_0x01ad
            android.app.Activity r3 = r12.f98845m
            boolean r3 = r3.isFinishing()
            if (r3 != 0) goto L_0x01ad
            android.os.Bundle r1 = r0.f20186l
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r12.f98842j
            java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107205a(r4)
            r1.putString(r3, r4)
            com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            android.os.Bundle r1 = r0.f20186l
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r12.f98834b
            r1.putString(r3, r4)
            android.os.Bundle r0 = r0.f20186l
            java.lang.String r1 = "content_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.f98842j
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107240o(r3)
            r0.putString(r1, r3)
            java.lang.String r0 = r12.f98834b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.f98842j
            com.p280ss.android.ugc.aweme.share.C38024d.m121363a(r2, r0, r1)
            boolean r0 = r12.m121252b()
            if (r0 == 0) goto L_0x0198
            r0 = 2131886811(0x7f1202db, float:1.9408211E38)
            goto L_0x019b
        L_0x0198:
            r0 = 2131886813(0x7f1202dd, float:1.9408215E38)
        L_0x019b:
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a.m121238a()
            android.app.Activity r3 = r12.f98845m
            com.ss.android.ugc.aweme.sharer.ui.c r2 = r2.mo95972a()
            com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog r0 = r1.scoopShareDialogWithImModule(r3, r2, r0)
            r0.show()
            return r0
        L_0x01ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.p1529a.C37956a.mo95566a():com.ss.android.ugc.aweme.sharer.ui.SkeletonShareDialog");
    }

    /* renamed from: b */
    private static boolean m121253b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 13) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m121251a(Aweme aweme) {
        if (aweme == null || ((aweme.getAuthor() == null && !C25300bx.m83125a(aweme, 3)) || aweme.getVideo() == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final JSONObject m121256d(Aweme aweme) {
        return ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, this.f98833a);
    }

    /* renamed from: a */
    private static String m121249a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int hashCode = str.hashCode();
            if (hashCode != -1374807695) {
                if (hashCode != -1194195335) {
                    if (hashCode != 28903346) {
                        if (hashCode == 497130182 && str.equals("facebook")) {
                            return "FB";
                        }
                    } else if (str.equals("instagram")) {
                        return "Ins";
                    }
                } else if (str.equals("kakao_story")) {
                    return "kakaostory";
                }
            } else if (str.equals("naver_blog")) {
                return "naver";
            }
        }
        return str;
    }

    /* renamed from: c */
    private final JSONObject m121254c(Aweme aweme) {
        C6869c a = C6869c.m21382a(m121256d(aweme));
        a.mo16887a("enter_from", this.f98834b);
        int a2 = C6384b.m19835a().mo15287a(ShareButtonStyleExperiment.class, true, "share_button_style", C6384b.m19835a().mo15295d().share_button_style, 0);
        String str = "";
        if (a2 == 1) {
            str = "plain";
        } else if (a2 == 2) {
            str = "text";
        } else if (a2 == 3) {
            str = "num";
        }
        a.mo16887a("style", str);
        C6903bc.m21485d().mo75952b(a, aweme, this.f98834b);
        C6903bc.m21485d().mo75945a(a, aweme, C6903bc.m21485d().mo75946a());
        return a.mo16888b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m121257e(com.p280ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = this;
            boolean r0 = r8.isProhibited()
            r1 = 2131829407(0x7f11229f, float:1.9291782E38)
            r2 = 0
            if (r0 != 0) goto L_0x006f
            boolean r0 = r8.isDelete()
            if (r0 == 0) goto L_0x0011
            goto L_0x006f
        L_0x0011:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r8.getStatus()
            r3 = 1
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r8.getStatus()
            java.lang.String r4 = "aweme.status"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            int r0 = r0.getPrivateStatus()
            if (r0 != r3) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r4 = r8.getStatus()
            r5 = 2
            if (r4 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r4 = r8.getStatus()
            java.lang.String r6 = "aweme.status"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            int r4 = r4.getPrivateStatus()
            if (r4 != r5) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0051
            android.app.Activity r8 = r7.f98845m
            android.content.Context r8 = (android.content.Context) r8
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r8, r1)
            r8.mo25750a()
            return r2
        L_0x0051:
            if (r4 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getAuthor()
            java.lang.String r0 = "aweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            int r8 = r8.getFollowStatus()
            if (r8 == r5) goto L_0x006e
            android.app.Activity r8 = r7.f98845m
            android.content.Context r8 = (android.content.Context) r8
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r8, r1)
            r8.mo25750a()
            return r2
        L_0x006e:
            return r3
        L_0x006f:
            android.app.Activity r8 = r7.f98845m
            android.content.Context r8 = (android.content.Context) r8
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r8, r1)
            r8.mo25750a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.p1529a.C37956a.m121257e(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m121250a(com.p280ss.android.ugc.aweme.feed.model.Aweme r2, com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b r3) {
        /*
            if (r2 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.getAuthor()
            if (r0 != 0) goto L_0x0009
            goto L_0x0077
        L_0x0009:
            int r0 = r2.getAwemeType()
            r1 = 13
            if (r0 != r1) goto L_0x0012
            return
        L_0x0012:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r2.getStatus()
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r2.getStatus()
            java.lang.String r1 = "aweme.status"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.getPrivateStatus()
            if (r0 != 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x002d
            return
        L_0x002d:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.getCurUserId()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = r2.getAuthorUid()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x006b
            goto L_0x0076
        L_0x006b:
            com.ss.android.ugc.aweme.share.improve.b.d r0 = new com.ss.android.ugc.aweme.share.improve.b.d
            r0.<init>(r2)
            com.ss.android.ugc.aweme.sharer.b r0 = (com.p280ss.android.ugc.aweme.sharer.C38343b) r0
            r3.mo95963a(r0)
            return
        L_0x0076:
            return
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.p1529a.C37956a.m121250a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.sharer.ui.c$b):void");
    }

    public C37956a(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(zVar, "eventListener");
        C7573i.m23587b(bundle, "extras");
        this.f98845m = activity;
        this.f98846n = fragment;
        this.f98842j = aweme;
        this.f98843k = zVar;
        this.f98847o = bundle;
        ImmutableList of = ImmutableList.m58544of("instagram", "instagram_story", "snapchat", "imo", "bbm", "zalo", "whatsapp", "kakaotalk");
        C7573i.m23582a((Object) of, "ImmutableList.of(\n      …akaotalkChannel.KEY\n    )");
        this.f98844l = of;
    }

    /* renamed from: a */
    public final void mo95567a(String str, boolean z, SharePackage sharePackage, Context context, Aweme aweme) {
        boolean z2 = !z;
        C6877n.m21444a("aweme_share_error_rate", z2 ? 1 : 0, new C6869c().mo16887a("platform", m121249a(str)).mo16888b());
        if (z) {
            C37950a.m121238a().logForAdShare(context, aweme, null, "");
            C6907h.m21519a(context, "share_video", str, aweme.getAid(), 0, m121254c(aweme));
            CharSequence charSequence = str;
            if (!TextUtils.equals(charSequence, "chat_merge")) {
                ((C33241am) ((C33241am) new C33241am().mo85105a(this.f98834b).mo85071g(aweme).mo85109d(this.f98836d).mo85108c(this.f98837e).mo85107b(this.f98838f).mo85283l(this.f98839g)).mo85284m(C33230ac.m107216b(aweme, this.f98833a))).mo85112f(str).mo85110e("normal_share").mo85104a(C24220a.m79551a().getIsLongItem(context)).mo85106b(this.f98844l.contains(str) ^ true ? 1 : 0).mo85113g(this.f98841i).mo85252e();
            }
            if (this.f98843k != null && !TextUtils.equals(charSequence, "copy")) {
                this.f98843k.mo64929a(new C28318an(16, aweme));
            }
            C25652b bVar = new C25652b();
            bVar.mo66536a(new C28442a());
            bVar.mo56976a(aweme.getAid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(1), str);
            C28205ai.m92704a(str);
            C38025a.m121371a().mo95663a(str, 0);
        }
    }
}
