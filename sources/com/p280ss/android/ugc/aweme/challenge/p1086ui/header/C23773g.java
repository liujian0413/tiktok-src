package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoAdapter;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoViewHolder.C23763b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeTask;
import com.p280ss.android.ugc.aweme.discover.model.InquiryStruct;
import com.p280ss.android.ugc.aweme.discover.model.ShareReward;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g */
public final class C23773g implements C23784i {

    /* renamed from: e */
    public static final C23774a f62731e = new C23774a(null);

    /* renamed from: A */
    private View f62732A;

    /* renamed from: B */
    private ViewStub f62733B;

    /* renamed from: C */
    private View f62734C;

    /* renamed from: D */
    private DmtTextView f62735D;

    /* renamed from: E */
    private ViewStub f62736E;

    /* renamed from: F */
    private View f62737F;

    /* renamed from: G */
    private DmtTextView f62738G;

    /* renamed from: H */
    private Context f62739H;

    /* renamed from: I */
    private C23783h f62740I;

    /* renamed from: J */
    private ChallengeDetail f62741J;

    /* renamed from: K */
    private final C23775b f62742K = new C23775b(this);

    /* renamed from: a */
    public ImageView f62743a;

    /* renamed from: b */
    public ImageView f62744b;

    /* renamed from: c */
    public List<? extends Aweme> f62745c;

    /* renamed from: d */
    public WrapContentRemoteImageView f62746d;

    /* renamed from: f */
    private View f62747f;

    /* renamed from: g */
    private CheckableImageView f62748g;

    /* renamed from: h */
    private DmtTextView f62749h;

    /* renamed from: i */
    private ViewStub f62750i;

    /* renamed from: j */
    private View f62751j;

    /* renamed from: k */
    private LinearLayout f62752k;

    /* renamed from: l */
    private LinearLayout f62753l;

    /* renamed from: m */
    private LinearLayout f62754m;

    /* renamed from: n */
    private DmtTextView f62755n;

    /* renamed from: o */
    private DmtTextView f62756o;

    /* renamed from: p */
    private DmtTextView f62757p;

    /* renamed from: q */
    private DmtTextView f62758q;

    /* renamed from: r */
    private DmtTextView f62759r;

    /* renamed from: s */
    private CircleImageView f62760s;

    /* renamed from: t */
    private DmtTextView f62761t;

    /* renamed from: u */
    private LinearLayout f62762u;

    /* renamed from: v */
    private DmtTextView f62763v;

    /* renamed from: w */
    private RecyclerView f62764w;

    /* renamed from: x */
    private HorizontalSlideVideoAdapter f62765x;

    /* renamed from: y */
    private ViewStub f62766y;

    /* renamed from: z */
    private DmtTextView f62767z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$a */
    public static final class C23774a {
        private C23774a() {
        }

        public /* synthetic */ C23774a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m77955a(ChallengeDetail challengeDetail) {
            C7573i.m23587b(challengeDetail, "data");
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null) {
                InquiryStruct inquiryStruct = challenge.inquiryStruct;
                if (inquiryStruct != null) {
                    if ((C23764b.m77913a(inquiryStruct.getOpenUrl()) || C23764b.m77913a(inquiryStruct.getWebUrl())) && C23764b.m77913a(inquiryStruct.getDesc())) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static String m77954a(String str, String str2) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(str2, "bgColor");
            if (C23764b.m77913a(str)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", str2).build().toString();
            }
            C7573i.m23582a((Object) str, "if (url.isNotNullOrEmpty…            url\n        }");
            return str;
        }

        /* renamed from: b */
        public static String m77956b(String str, String str2) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(str2, "commerceEnterFrom");
            if (C23764b.m77913a(str)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).build().toString();
            }
            C7573i.m23582a((Object) str, "if (url.isNotNullOrEmpty…            url\n        }");
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$b */
    public static final class C23775b implements C23763b {

        /* renamed from: a */
        final /* synthetic */ C23773g f62768a;

        C23775b(C23773g gVar) {
            this.f62768a = gVar;
        }

        /* renamed from: a */
        public final void mo61795a(Aweme aweme, int i) {
            C7573i.m23587b(aweme, "aweme");
            C36018b bVar = new C36018b();
            bVar.setItems(this.f62768a.f62745c);
            C28503s.m93679a((C25673a) bVar);
            if (!C6399b.m19944t()) {
                C7195s a = C7195s.m22438a();
                Activity b = this.f62768a.mo61821b();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(aweme.getAid());
                a.mo18679a(b, C7203u.m22460a(sb.toString()).mo18694a("refer", "challenge").mo18694a("video_from", "from_no_request").mo18693a("video_type", 2).mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18695a());
                C28229b.m92772a(aweme);
                this.f62768a.mo61816a(aweme, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$c */
    public static final class C23776c extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ C23773g f62769a;

        C23776c(C23773g gVar) {
            this.f62769a = gVar;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
        }

        public final void onIntermediateImageFailed(String str, Throwable th) {
            super.onIntermediateImageFailed(str, th);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onIntermediateImageSet(String str, C13648f fVar) {
            WrapContentRemoteImageView wrapContentRemoteImageView = this.f62769a.f62746d;
            if (wrapContentRemoteImageView != null) {
                wrapContentRemoteImageView.mo105230b(fVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            WrapContentRemoteImageView wrapContentRemoteImageView = this.f62769a.f62746d;
            if (wrapContentRemoteImageView != null) {
                wrapContentRemoteImageView.mo105230b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$d */
    static final class C23777d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23773g f62770a;

        /* renamed from: b */
        final /* synthetic */ CommerceChallengeBanner f62771b;

        C23777d(C23773g gVar, CommerceChallengeBanner commerceChallengeBanner) {
            this.f62770a = gVar;
            this.f62771b = commerceChallengeBanner;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62770a.mo61822b("banner_click");
            if (!this.f62770a.mo61820a(this.f62771b.getOpenUrl(), false)) {
                this.f62770a.mo61819a(C23774a.m77956b(this.f62771b.getWebUrl(), "commerce_challenge_banner"), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$e */
    static final class C23778e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23773g f62772a;

        C23778e(C23773g gVar) {
            this.f62772a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62772a.mo61824c("click_link");
            if (this.f62772a.mo61812a().isLinkActionAsOpenUrl()) {
                C23773g gVar = this.f62772a;
                String linkAction = this.f62772a.mo61812a().getLinkAction();
                C7573i.m23582a((Object) linkAction, "mChallenge.linkAction");
                gVar.mo61820a(C7634n.m23711a(linkAction, "aweme://", "sslocal://", false), true);
            } else if (C6399b.m19944t() || !C33447f.m108191d(this.f62772a.mo61812a().getLinkAction())) {
                C23773g gVar2 = this.f62772a;
                String linkAction2 = this.f62772a.mo61812a().getLinkAction();
                C7573i.m23582a((Object) linkAction2, "mChallenge.linkAction");
                gVar2.mo61819a(C23774a.m77956b(C23774a.m77954a(linkAction2, "ffffff"), "commerce_challenge_link"), this.f62772a.mo61812a().getLinkTitle());
            } else {
                C23773g gVar3 = this.f62772a;
                String linkAction3 = this.f62772a.mo61812a().getLinkAction();
                C33471b a = new C33472a().mo85791b("challenge").mo85790a();
                C7573i.m23582a((Object) a, "ExtraParams.Builder().en….Label.CHALLENGE).build()");
                gVar3.mo61818a(linkAction3, a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$f */
    static final class C23779f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceChallengeTask f62773a;

        C23779f(CommerceChallengeTask commerceChallengeTask) {
            this.f62773a = commerceChallengeTask;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view) && !TextUtils.isEmpty(this.f62773a.getSchema())) {
                C7195s.m22438a().mo18682a(this.f62773a.getSchema());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$g */
    static final class C23780g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23773g f62774a;

        /* renamed from: b */
        final /* synthetic */ Integer f62775b;

        C23780g(C23773g gVar, Integer num) {
            this.f62774a = gVar;
            this.f62775b = num;
        }

        public final void run() {
            LayoutParams layoutParams;
            ImageView imageView = this.f62774a.f62744b;
            Integer num = null;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ImageView imageView2 = this.f62774a.f62743a;
                if (imageView2 != null) {
                    num = Integer.valueOf(imageView2.getWidth());
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                layoutParams.width = (int) (((float) (num.intValue() * this.f62775b.intValue())) / 100.0f);
            }
            ImageView imageView3 = this.f62774a.f62744b;
            if (imageView3 != null) {
                imageView3.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$h */
    public static final class C23781h extends C6597a<List<? extends Aweme>> {
        C23781h() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.g$i */
    static final class C23782i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23773g f62776a;

        /* renamed from: b */
        final /* synthetic */ String f62777b;

        /* renamed from: c */
        final /* synthetic */ String f62778c;

        C23782i(C23773g gVar, String str, String str2) {
            this.f62776a = gVar;
            this.f62777b = str;
            this.f62778c = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
            if (r3.mo61819a(com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77956b(com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77954a(r0, "ffffff"), "commerce_challenge_transform_button"), "") != false) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r3)
                boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r3 != 0) goto L_0x0034
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                r3.mo61823c()
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                java.lang.String r0 = r2.f62777b
                r1 = 0
                boolean r3 = r3.mo61820a(r0, r1)
                if (r3 != 0) goto L_0x006b
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                java.lang.String r0 = r2.f62778c
                java.lang.String r1 = "webUrl"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r1 = "ffffff"
                java.lang.String r0 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77954a(r0, r1)
                java.lang.String r1 = "commerce_challenge_transform_button"
                java.lang.String r0 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77956b(r0, r1)
                java.lang.String r1 = ""
                r3.mo61819a(r0, r1)
                return
            L_0x0034:
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                java.lang.String r0 = r2.f62777b
                boolean r3 = r3.mo61817a(r0)
                if (r3 != 0) goto L_0x0066
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                java.lang.String r0 = r2.f62777b
                r1 = 1
                boolean r3 = r3.mo61820a(r0, r1)
                if (r3 != 0) goto L_0x0066
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                java.lang.String r0 = r2.f62778c
                java.lang.String r1 = "webUrl"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r1 = "ffffff"
                java.lang.String r0 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77954a(r0, r1)
                java.lang.String r1 = "commerce_challenge_transform_button"
                java.lang.String r0 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23774a.m77956b(r0, r1)
                java.lang.String r1 = ""
                boolean r3 = r3.mo61819a(r0, r1)
                if (r3 == 0) goto L_0x006b
            L_0x0066:
                com.ss.android.ugc.aweme.challenge.ui.header.g r3 = r2.f62776a
                r3.mo61823c()
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.C23782i.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public final boolean mo61820a(String str, boolean z) {
        Context context = this.f62739H;
        if (context == null) {
            C7573i.m23583a("mContext");
        }
        return C25371n.m83463a(context, str, z);
    }

    /* renamed from: a */
    public final boolean mo61819a(String str, String str2) {
        Context context = this.f62739H;
        if (context == null) {
            C7573i.m23583a("mContext");
        }
        return C25371n.m83459a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo61818a(String str, C33471b bVar) {
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        IMiniAppService a = b.mo18647a();
        Context context = this.f62739H;
        if (context == null) {
            C7573i.m23583a("mContext");
        }
        return a.openMiniApp(context, str, bVar);
    }

    /* renamed from: b */
    public final FragmentActivity mo61821b() {
        Context context = this.f62739H;
        if (context == null) {
            C7573i.m23583a("mContext");
        }
        Activity a = C23487o.m77130a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        return (FragmentActivity) a;
    }

    /* renamed from: a */
    public final Challenge mo61812a() {
        ChallengeDetail challengeDetail = this.f62741J;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        Challenge challenge = challengeDetail.challenge;
        C7573i.m23582a((Object) challenge, "mChallengeDetail.challenge");
        return challenge;
    }

    /* renamed from: c */
    public final void mo61823c() {
        String str = "click_variable_button";
        C22984d a = C22984d.m75611a().mo59973a("tag_id", mo61812a().getCid());
        String str2 = "enter_from";
        C23783h hVar = this.f62740I;
        if (hVar == null) {
            C7573i.m23583a("mHeaderParam");
        }
        C6907h.m21524a(str, (Map) a.mo59973a(str2, hVar.f62782d).mo59973a("page_type", "challenge").f60753a);
    }

    /* renamed from: e */
    private final void m77937e() {
        ChallengeDetail challengeDetail = this.f62741J;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        if (C23774a.m77955a(challengeDetail)) {
            View view = this.f62747f;
            if (view != null) {
                view.setVisibility(8);
            }
            InquiryStruct inquiryStruct = mo61812a().inquiryStruct;
            if (inquiryStruct != null) {
                String desc = inquiryStruct.getDesc();
                String openUrl = inquiryStruct.getOpenUrl();
                String webUrl = inquiryStruct.getWebUrl();
                if (inquiryStruct.getIcon() == null) {
                    CheckableImageView checkableImageView = this.f62748g;
                    if (checkableImageView != null) {
                        checkableImageView.setVisibility(8);
                    }
                } else {
                    C23323e.m76524b(this.f62748g, inquiryStruct.getIcon());
                }
                DmtTextView dmtTextView = this.f62749h;
                if (dmtTextView != null) {
                    dmtTextView.setText(desc);
                }
                View view2 = this.f62747f;
                if (view2 != null) {
                    view2.setOnClickListener(new C23782i(this, openUrl, webUrl));
                }
                View view3 = this.f62747f;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final void m77938f() {
        boolean z;
        int i;
        if (!C25352e.m83327a(mo61812a())) {
            View view = this.f62737F;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        ViewStub viewStub = this.f62736E;
        if (viewStub == null) {
            C7573i.m23583a("mDisclaimerContainerVs");
        }
        if (this.f62737F == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            viewStub = null;
        }
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.f62738G = (DmtTextView) inflate.findViewById(R.id.a07);
            this.f62767z = (DmtTextView) inflate.findViewById(R.id.a06);
            this.f62737F = inflate;
        }
        DmtTextView dmtTextView = this.f62738G;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        dmtTextView.setText(C25352e.m83351b(mo61812a()));
        String c = C25352e.m83358c(mo61812a());
        C7573i.m23582a((Object) c, "AdDataUtils.getDisClaimerContent(mChallenge)");
        DmtTextView dmtTextView2 = this.f62767z;
        if (dmtTextView2 == null) {
            C7573i.m23580a();
        }
        boolean a = m77935a(c, (View) dmtTextView2);
        DmtTextView dmtTextView3 = this.f62767z;
        if (dmtTextView3 == null) {
            C7573i.m23580a();
        }
        if (a) {
            i = 3;
        } else {
            i = 5;
        }
        dmtTextView3.setGravity(i);
        if (VERSION.SDK_INT >= 17) {
            DmtTextView dmtTextView4 = this.f62767z;
            if (dmtTextView4 == null) {
                C7573i.m23580a();
            }
            dmtTextView4.setTextDirection(a ^ true ? 1 : 0);
        }
        DmtTextView dmtTextView5 = this.f62767z;
        if (dmtTextView5 == null) {
            C7573i.m23580a();
        }
        dmtTextView5.setText(C25352e.m83358c(mo61812a()));
        View view2 = this.f62737F;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.setVisibility(0);
    }

    /* renamed from: g */
    private final void m77939g() {
        LayoutParams layoutParams;
        View view = this.f62732A;
        if (view != null) {
            view.setVisibility(8);
        }
        List<CommerceChallengeBanner> list = mo61812a().commerceChallengeBannerList;
        if (list != null) {
            boolean z = true;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ViewStub viewStub = this.f62766y;
                if (viewStub == null) {
                    C7573i.m23583a("mBannerContainerVs");
                }
                if (this.f62732A != null) {
                    z = false;
                }
                if (!z) {
                    viewStub = null;
                }
                if (viewStub != null) {
                    View inflate = viewStub.inflate();
                    this.f62746d = (WrapContentRemoteImageView) inflate.findViewById(R.id.a00);
                    this.f62732A = inflate;
                }
                CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) list.get(0);
                Context context = this.f62739H;
                if (context == null) {
                    C7573i.m23583a("mContext");
                }
                int b = C23482j.m77098b(context) - C23486n.m77122a(32.0d);
                WrapContentRemoteImageView wrapContentRemoteImageView = this.f62746d;
                if (wrapContentRemoteImageView != null) {
                    layoutParams = wrapContentRemoteImageView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.width = b;
                }
                WrapContentRemoteImageView wrapContentRemoteImageView2 = this.f62746d;
                if (wrapContentRemoteImageView2 != null) {
                    wrapContentRemoteImageView2.setLayoutParams(layoutParams);
                }
                if (!C6307b.m19566a((Collection<T>) commerceChallengeBanner.getIcon().getUrlList()) && this.f62746d != null) {
                    WrapContentRemoteImageView wrapContentRemoteImageView3 = this.f62746d;
                    if (wrapContentRemoteImageView3 != null) {
                        wrapContentRemoteImageView3.mo105229a((String) commerceChallengeBanner.getIcon().getUrlList().get(0), null, new C23776c(this));
                    }
                }
                WrapContentRemoteImageView wrapContentRemoteImageView4 = this.f62746d;
                if (wrapContentRemoteImageView4 == null) {
                    C7573i.m23580a();
                }
                wrapContentRemoteImageView4.setOnClickListener(new C23777d(this, commerceChallengeBanner));
                View view2 = this.f62732A;
                if (view2 == null) {
                    C7573i.m23580a();
                }
                view2.setVisibility(0);
                mo61822b("banner_show");
            }
        }
    }

    /* renamed from: h */
    private final void m77940h() {
        boolean z;
        int i;
        if (!C25352e.m83365d(mo61812a())) {
            View view = this.f62734C;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        ViewStub viewStub = this.f62733B;
        if (viewStub == null) {
            C7573i.m23583a("mLinkContainerVs");
        }
        if (this.f62734C == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            viewStub = null;
        }
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.f62735D = (DmtTextView) inflate.findViewById(R.id.e6i);
            this.f62734C = inflate;
        }
        DmtTextView dmtTextView = this.f62735D;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        dmtTextView.setOnClickListener(new C23778e(this));
        DmtTextView dmtTextView2 = this.f62735D;
        if (dmtTextView2 == null) {
            C7573i.m23580a();
        }
        boolean a = C43127fh.m136806a(dmtTextView2.getContext());
        DmtTextView dmtTextView3 = this.f62735D;
        if (dmtTextView3 == null) {
            C7573i.m23580a();
        }
        if (a) {
            i = 5;
        } else {
            i = 3;
        }
        dmtTextView3.setGravity(i);
        if (VERSION.SDK_INT >= 17) {
            DmtTextView dmtTextView4 = this.f62735D;
            if (dmtTextView4 == null) {
                C7573i.m23580a();
            }
            dmtTextView4.setTextDirection(a ? 1 : 0);
        }
        DmtTextView dmtTextView5 = this.f62735D;
        if (dmtTextView5 == null) {
            C7573i.m23580a();
        }
        dmtTextView5.setText(mo61812a().getLinkText());
        View view2 = this.f62734C;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.setVisibility(0);
        mo61824c("show_link");
    }

    /* renamed from: d */
    private final void m77936d() {
        boolean z;
        CommerceChallengeTask commerceChallengeTask = mo61812a().getCommerceChallengeTask();
        if (commerceChallengeTask == null) {
            ViewStub viewStub = this.f62750i;
            if (viewStub == null) {
                C7573i.m23583a("mTaskDescContainerVs");
            }
            viewStub.setVisibility(8);
            return;
        }
        ViewStub viewStub2 = this.f62750i;
        if (viewStub2 == null) {
            C7573i.m23583a("mTaskDescContainerVs");
        }
        if (this.f62751j == null) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            View inflate = viewStub2.inflate();
            this.f62752k = (LinearLayout) inflate.findViewById(R.id.dgj);
            this.f62753l = (LinearLayout) inflate.findViewById(R.id.um);
            this.f62754m = (LinearLayout) inflate.findViewById(R.id.ul);
            this.f62755n = (DmtTextView) inflate.findViewById(R.id.drg);
            this.f62756o = (DmtTextView) inflate.findViewById(R.id.drc);
            this.f62757p = (DmtTextView) inflate.findViewById(R.id.drd);
            this.f62758q = (DmtTextView) inflate.findViewById(R.id.drf);
            this.f62759r = (DmtTextView) inflate.findViewById(R.id.dre);
            this.f62743a = (ImageView) inflate.findViewById(R.id.b6l);
            this.f62744b = (ImageView) inflate.findViewById(R.id.b72);
            this.f62762u = (LinearLayout) inflate.findViewById(R.id.agx);
            this.f62763v = (DmtTextView) inflate.findViewById(R.id.agz);
            this.f62764w = (RecyclerView) inflate.findViewById(R.id.agy);
            this.f62760s = (CircleImageView) inflate.findViewById(R.id.chq);
            this.f62761t = (DmtTextView) inflate.findViewById(R.id.dzz);
            this.f62751j = inflate;
        }
        LinearLayout linearLayout = this.f62752k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C23779f(commerceChallengeTask));
        }
        DmtTextView dmtTextView = this.f62755n;
        if (dmtTextView != null) {
            dmtTextView.setText(commerceChallengeTask.getCommerceChallengeTaskType());
        }
        DmtTextView dmtTextView2 = this.f62756o;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(commerceChallengeTask.getDesc());
        }
        m77934a(commerceChallengeTask);
        ShareReward shareReward = commerceChallengeTask.getShareReward();
        if (shareReward != null) {
            num = shareReward.getRewardConsumePercent();
        }
        if (num != null) {
            DmtTextView dmtTextView3 = this.f62759r;
            if (dmtTextView3 != null) {
                Context context = this.f62739H;
                if (context == null) {
                    C7573i.m23583a("mContext");
                }
                String string = context.getString(R.string.z6);
                C7573i.m23582a((Object) string, "mContext.getString(R.str…k_reward_consume_percent)");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{String.valueOf(num.intValue())}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView3.setText(a);
            }
            if (num.intValue() > 0) {
                ImageView imageView = this.f62744b;
                if (imageView != null) {
                    imageView.post(new C23780g(this, num));
                }
            }
        }
        if (!TextUtils.isEmpty(commerceChallengeTask.getExampleAwemes())) {
            this.f62745c = (List) C25352e.m83319a(commerceChallengeTask.getExampleAwemes(), new C23781h().type);
        }
        if (C6307b.m19566a((Collection<T>) this.f62745c)) {
            LinearLayout linearLayout2 = this.f62762u;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.f62764w;
        if (recyclerView != null) {
            Context context2 = this.f62739H;
            if (context2 == null) {
                C7573i.m23583a("mContext");
            }
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(context2, 0, false));
        }
        RecyclerView recyclerView2 = this.f62764w;
        if (recyclerView2 != null) {
            recyclerView2.mo5525a((C1272h) new CommerceHeaderDelegate$updateNationalTask$6());
        }
        this.f62765x = new HorizontalSlideVideoAdapter(this.f62742K);
        RecyclerView recyclerView3 = this.f62764w;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f62765x);
        }
        DmtTextView dmtTextView4 = this.f62763v;
        if (dmtTextView4 != null) {
            Context context3 = this.f62739H;
            if (context3 == null) {
                C7573i.m23583a("mContext");
            }
            dmtTextView4.setText(context3.getString(R.string.b2l));
        }
        HorizontalSlideVideoAdapter horizontalSlideVideoAdapter = this.f62765x;
        if (horizontalSlideVideoAdapter != null) {
            horizontalSlideVideoAdapter.mo61798a(this.f62745c);
        }
    }

    /* renamed from: a */
    public final boolean mo61817a(String str) {
        Context context = this.f62739H;
        if (context == null) {
            C7573i.m23583a("mContext");
        }
        return C25371n.m83454a(context, str);
    }

    /* renamed from: b */
    public final void mo61822b(String str) {
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("tag_id", mo61812a().getCid()).mo59973a("enter_from", "challenge").f60753a);
    }

    /* renamed from: a */
    public final void mo61813a(float f) {
        boolean z;
        DmtTextView dmtTextView = this.f62735D;
        if (dmtTextView != null) {
            if (((double) f) <= 0.9d) {
                z = true;
            } else {
                z = false;
            }
            dmtTextView.setClickable(z);
        }
    }

    /* renamed from: c */
    public final void mo61824c(String str) {
        String str2;
        C6907h.onEvent(MobClick.obtain().setEventName(str).setLabelName("challenge").setValue(mo61812a().getCid()).setJsonObject(new C6869c().mo16887a("link_type", "web_link").mo16888b()));
        User author = mo61812a().getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = "";
        }
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("author_id", str2).mo59973a("tag_id", mo61812a().getCid()).mo59973a("link_type", "web_link").mo59973a("enter_from", "challenge").f60753a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1.intValue() != 4) goto L_0x014e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77934a(com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeTask r13) {
        /*
            r12 = this;
            r0 = 8
            if (r13 == 0) goto L_0x014e
            java.lang.Integer r1 = r13.getRewardType()
            r2 = 4
            r3 = 3
            if (r1 != 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            int r1 = r1.intValue()
            if (r1 == r3) goto L_0x0023
        L_0x0013:
            java.lang.Integer r1 = r13.getRewardType()
            if (r1 != 0) goto L_0x001b
            goto L_0x014e
        L_0x001b:
            int r1 = r1.intValue()
            if (r1 == r2) goto L_0x0023
            goto L_0x014e
        L_0x0023:
            com.ss.android.ugc.aweme.discover.model.ShareReward r1 = r13.getShareReward()
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r1.getHighestProfit()
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.Integer r5 = r13.getRewardType()
            r6 = 4625759767262920704(0x4032000000000000, double:18.0)
            r8 = 0
            r9 = 17
            if (r5 != 0) goto L_0x0041
            goto L_0x00b8
        L_0x0041:
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00b8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r12.f62757p
            if (r3 == 0) goto L_0x0060
            android.content.Context r5 = r12.f62739H
            if (r5 != 0) goto L_0x0054
            java.lang.String r10 = "mContext"
            kotlin.jvm.internal.C7573i.m23583a(r10)
        L_0x0054:
            r10 = 2131821503(0x7f1103bf, float:1.9275751E38)
            java.lang.String r5 = r5.getString(r10)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
        L_0x0060:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x00a1
            android.content.Context r5 = r12.f62739H
            if (r5 != 0) goto L_0x0072
            java.lang.String r10 = "mContext"
            kotlin.jvm.internal.C7573i.m23583a(r10)
        L_0x0072:
            r10 = 2131821504(0x7f1103c0, float:1.9275753E38)
            java.lang.String r5 = r5.getString(r10)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.append(r5)
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            r10 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r10 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r10)
            r5.<init>(r10)
            r10 = 1
            r4.setSpan(r5, r8, r10, r9)
            r4.append(r3)
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            int r5 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            r3.<init>(r5)
            int r5 = r4.length()
            r4.setSpan(r3, r10, r5, r9)
            goto L_0x00b8
        L_0x00a1:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62761t
            if (r13 == 0) goto L_0x00a8
            r13.setVisibility(r0)
        L_0x00a8:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r13 = r12.f62760s
            if (r13 == 0) goto L_0x00af
            r13.setVisibility(r0)
        L_0x00af:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62758q
            if (r13 == 0) goto L_0x00b7
            r13.setVisibility(r0)
            return
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.Integer r13 = r13.getRewardType()
            if (r13 != 0) goto L_0x00c0
            goto L_0x0143
        L_0x00c0:
            int r13 = r13.intValue()
            if (r13 != r2) goto L_0x0143
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62757p
            if (r13 == 0) goto L_0x00df
            android.content.Context r2 = r12.f62739H
            if (r2 != 0) goto L_0x00d3
            java.lang.String r3 = "mContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00d3:
            r3 = 2131821501(0x7f1103bd, float:1.9275747E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r13.setText(r2)
        L_0x00df:
            r13 = r1
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L_0x012c
            r4.append(r13)
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            int r0 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            r13.<init>(r0)
            if (r1 != 0) goto L_0x00f9
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00f9:
            int r0 = r1.length()
            r4.setSpan(r13, r8, r0, r9)
            android.content.Context r13 = r12.f62739H
            if (r13 != 0) goto L_0x0109
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0109:
            r0 = 2131821502(0x7f1103be, float:1.927575E38)
            java.lang.String r13 = r13.getString(r0)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r4.append(r13)
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            r2 = 4623507967449235456(0x402a000000000000, double:13.0)
            int r0 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r2)
            r13.<init>(r0)
            int r0 = r1.length()
            int r1 = r4.length()
            r4.setSpan(r13, r0, r1, r9)
            goto L_0x0143
        L_0x012c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62761t
            if (r13 == 0) goto L_0x0133
            r13.setVisibility(r0)
        L_0x0133:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r13 = r12.f62760s
            if (r13 == 0) goto L_0x013a
            r13.setVisibility(r0)
        L_0x013a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62758q
            if (r13 == 0) goto L_0x0142
            r13.setVisibility(r0)
            return
        L_0x0142:
            return
        L_0x0143:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f62758q
            if (r13 == 0) goto L_0x014d
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r13.setText(r4)
            return
        L_0x014d:
            return
        L_0x014e:
            android.widget.LinearLayout r13 = r12.f62753l
            if (r13 == 0) goto L_0x0155
            r13.setVisibility(r0)
        L_0x0155:
            android.widget.LinearLayout r13 = r12.f62754m
            if (r13 == 0) goto L_0x015d
            r13.setVisibility(r0)
            return
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g.m77934a(com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask):void");
    }

    /* renamed from: a */
    public final void mo61815a(ChallengeDetail challengeDetail) {
        C7573i.m23587b(challengeDetail, "data");
        this.f62741J = challengeDetail;
        m77937e();
        m77936d();
        m77938f();
        m77939g();
        m77940h();
    }

    /* renamed from: a */
    private static boolean m77935a(String str, View view) {
        int i;
        if (C43127fh.m136806a(view.getContext())) {
            i = -1;
        } else {
            i = -2;
        }
        return new Bidi(str, i).baseIsLeftToRight();
    }

    /* renamed from: a */
    public final void mo61814a(FrameLayout frameLayout, C23783h hVar) {
        C7573i.m23587b(frameLayout, "root");
        C7573i.m23587b(hVar, "headerParam");
        Context context = frameLayout.getContext();
        C7573i.m23582a((Object) context, "root.context");
        this.f62739H = context;
        this.f62740I = hVar;
        if (hVar.f62781c == ButtonType.TYPE_TRANSFORM) {
            this.f62747f = frameLayout.findViewById(R.id.dn_);
            this.f62748g = (CheckableImageView) frameLayout.findViewById(R.id.bd9);
            this.f62749h = (DmtTextView) frameLayout.findViewById(R.id.e44);
        }
        View findViewById = frameLayout.findViewById(R.id.eeo);
        C7573i.m23582a((Object) findViewById, "root.findViewById(R.id.v…rce_disclaimer_container)");
        this.f62736E = (ViewStub) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.een);
        C7573i.m23582a((Object) findViewById2, "root.findViewById(R.id.v…ommerce_banner_container)");
        this.f62766y = (ViewStub) findViewById2;
        View findViewById3 = frameLayout.findViewById(R.id.eep);
        C7573i.m23582a((Object) findViewById3, "root.findViewById(R.id.vs_commerce_link_container)");
        this.f62733B = (ViewStub) findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.eez);
        C7573i.m23582a((Object) findViewById4, "root.findViewById(R.id.vs_task_desc_container)");
        this.f62750i = (ViewStub) findViewById4;
    }

    /* renamed from: a */
    public final void mo61816a(Aweme aweme, int i) {
        C6907h.m21524a("click_challenge_video_card", (Map) C22984d.m75611a().mo59973a("challenge_id", mo61812a().getCid()).mo59973a("group_id", aweme.getAid()).mo59970a(POIService.KEY_ORDER, i).f60753a);
    }
}
