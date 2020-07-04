package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12089a;
import com.bytedance.lighten.core.p613d.C12123c;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.C21647ag;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23793i;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.RelatedMusicChallengeAdapter;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoAdapter;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoViewHolder.C23763b;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C23812a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p1288h.C30221c.C30223b;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.p280ss.android.ugc.aweme.utils.C43086eb.C43087a;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p280ss.android.ugc.aweme.views.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a */
public abstract class C23755a extends FrameLayout {

    /* renamed from: d */
    public static final C23756a f62666d = new C23756a(null);

    /* renamed from: A */
    private SmartImageView f62667A;

    /* renamed from: B */
    private View f62668B;

    /* renamed from: C */
    private boolean f62669C;

    /* renamed from: D */
    private final List<C23784i> f62670D = new ArrayList();

    /* renamed from: E */
    private final C23783h f62671E;

    /* renamed from: F */
    private ChallengeDetailViewModel f62672F;

    /* renamed from: G */
    private final C0053p<Pair<Integer, C23671a>> f62673G;

    /* renamed from: H */
    private final C23758c f62674H;

    /* renamed from: a */
    protected SmartImageView f62675a;

    /* renamed from: b */
    protected ChallengeDetail f62676b;

    /* renamed from: c */
    protected Challenge f62677c;

    /* renamed from: e */
    private final String f62678e = "AbsCommonHeaderView";

    /* renamed from: f */
    private SmartImageView f62679f;

    /* renamed from: g */
    private View f62680g;

    /* renamed from: h */
    private LinearLayout f62681h;

    /* renamed from: i */
    private View f62682i;

    /* renamed from: j */
    private DmtTextView f62683j;

    /* renamed from: k */
    private ViewStub f62684k;

    /* renamed from: l */
    private View f62685l;

    /* renamed from: m */
    private DmtTextView f62686m;

    /* renamed from: n */
    private LinearLayout f62687n;

    /* renamed from: o */
    private DmtTextView f62688o;

    /* renamed from: p */
    private ImageView f62689p;

    /* renamed from: q */
    private ViewStub f62690q;

    /* renamed from: r */
    private View f62691r;

    /* renamed from: s */
    private DmtTextView f62692s;

    /* renamed from: t */
    private RecyclerView f62693t;

    /* renamed from: u */
    private ViewStub f62694u;

    /* renamed from: v */
    private View f62695v;

    /* renamed from: w */
    private DmtTextView f62696w;

    /* renamed from: x */
    private RecyclerView f62697x;

    /* renamed from: y */
    private HorizontalSlideVideoAdapter f62698y;

    /* renamed from: z */
    private FrameLayout f62699z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$a */
    public static final class C23756a {
        private C23756a() {
        }

        public /* synthetic */ C23756a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m77904a(ChallengeDetail challengeDetail) {
            C7573i.m23587b(challengeDetail, "data");
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null) {
                ChallengeTransform transfrom = challenge.getTransfrom();
                if (transfrom != null && C23764b.m77913a(transfrom.getText()) && C23764b.m77913a(transfrom.getAction())) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$b */
    static final class C23757b<T> implements C0053p<Pair<? extends Integer, ? extends C23671a>> {

        /* renamed from: a */
        final /* synthetic */ C23755a f62700a;

        C23757b(C23755a aVar) {
            this.f62700a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Pair<Integer, ? extends C23671a> pair) {
            this.f62700a.mo61774c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$c */
    public static final class C23758c implements C23763b {

        /* renamed from: a */
        final /* synthetic */ C23755a f62701a;

        C23758c(C23755a aVar) {
            this.f62701a = aVar;
        }

        /* renamed from: a */
        public final void mo61795a(Aweme aweme, int i) {
            C7573i.m23587b(aweme, "aweme");
            ChallengeDetailViewModel mViewModel = this.f62701a.getMViewModel();
            if (mViewModel != null) {
                C23084b<Pair<Integer, C23671a>> bVar = mViewModel.f62857b;
                if (bVar != null) {
                    Pair pair = (Pair) bVar.getValue();
                    if (pair != null) {
                        C23671a aVar = (C23671a) pair.getSecond();
                        if (aVar != null) {
                            C28503s.m93679a((C25673a) aVar);
                            C7195s a = C7195s.m22438a();
                            Activity activity = this.f62701a.getActivity();
                            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                            sb.append(aweme.getAid());
                            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("refer", "challenge").mo18694a("video_from", "from_challenge").mo18694a("challenge_id", this.f62701a.getMChallenge().getCid()).mo18693a("video_type", 2).mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18695a());
                            C28229b.m92772a(aweme);
                            this.f62701a.mo61772a(aweme, i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$d */
    static final class C23759d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23755a f62702a;

        /* renamed from: b */
        final /* synthetic */ C30221c f62703b;

        /* renamed from: c */
        final /* synthetic */ ChallengeDetail f62704c;

        C23759d(C23755a aVar, C30221c cVar, ChallengeDetail challengeDetail) {
            this.f62702a = aVar;
            this.f62703b = cVar;
            this.f62704c = challengeDetail;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21647ag T = C6903bc.m21479T();
            Context context = this.f62702a.getContext();
            C30223b bVar = this.f62703b.f79529s;
            C7573i.m23582a((Object) bVar, "entry.bannerDetail");
            T.mo57875a(context, bVar.f79533b);
            Challenge challenge = this.f62704c.challenge;
            C7573i.m23582a((Object) challenge, "data.challenge");
            C6907h.m21524a("xmas_banner_click", (Map) C22984d.m75611a().mo59973a("enter_from", "tag_page").mo59973a("gen", C29132a.m95567d()).mo59973a("tag_id", challenge.getCid()).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$e */
    static final class C23760e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23755a f62705a;

        /* renamed from: b */
        final /* synthetic */ String f62706b;

        C23760e(C23755a aVar, String str) {
            this.f62705a = aVar;
            this.f62706b = str;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (C6399b.m19944t()) {
                C6907h.m21524a("tag_detail_click_icon", (Map) C22984d.m75611a().mo59973a("process_id", this.f62705a.getMHeaderParam().f62783e).mo59973a("tag_id", this.f62705a.getMChallenge().getCid()).f60753a);
            }
            C21647ag T = C6903bc.m21479T();
            Activity activity = this.f62705a.getActivity();
            C42914ab a = C42914ab.m136242a().mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(this.f62705a.getMAvatar())).mo104629a("wh_ratio", 0.1f).mo104634a("enable_download_img", false).mo104632a("challenge_info", (Serializable) this.f62705a.getMChallenge()).mo104633a("process_id", this.f62705a.getMHeaderParam().f62783e);
            String str2 = "uri";
            String[] strArr = new String[1];
            if (TextUtils.isEmpty(this.f62706b)) {
                str = new Builder().scheme("res").path("2131233338").build().toString();
            } else {
                str = this.f62706b;
            }
            strArr[0] = str;
            T.mo57873a(activity, a.mo104635a(str2, strArr).f111445a);
        }
    }

    /* renamed from: a */
    public void mo61769a() {
    }

    /* access modifiers changed from: protected */
    public abstract int getAttrsResId();

    /* access modifiers changed from: protected */
    public abstract int getButtonResId();

    public final boolean getHasBgCoverMask() {
        return this.f62669C;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutResId();

    /* access modifiers changed from: protected */
    public final C23783h getMHeaderParam() {
        return this.f62671E;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetailViewModel getMViewModel() {
        return this.f62672F;
    }

    public final FragmentActivity getActivity() {
        Activity e = C23487o.m77158e(this);
        if (!(e instanceof FragmentActivity)) {
            e = null;
        }
        return (FragmentActivity) e;
    }

    /* access modifiers changed from: protected */
    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.f62675a;
        if (smartImageView == null) {
            C7573i.m23583a("mAvatar");
        }
        return smartImageView;
    }

    /* access modifiers changed from: protected */
    public final Challenge getMChallenge() {
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        return challenge;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.f62676b;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        return challengeDetail;
    }

    /* renamed from: e */
    private final void mo61838e() {
        if (VERSION.SDK_INT >= 19) {
            View view = this.f62682i;
            if (view == null) {
                C7573i.m23583a("mStatusBar");
            }
            view.getLayoutParams().height = C10994a.m32204a(getContext());
        }
    }

    /* renamed from: l */
    private final void m77895l() {
        View view = this.f62680g;
        if (view == null) {
            C7573i.m23583a("mBgCoverMask");
        }
        view.setBackgroundResource(R.drawable.i6);
        this.f62669C = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.f62672F;
        if (challengeDetailViewModel == null) {
            C7573i.m23580a();
        }
        challengeDetailViewModel.f62857b.removeObserver(this.f62673G);
        this.f62672F = null;
    }

    /* renamed from: h */
    private final void m77891h() {
        boolean z;
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        String challengeName = challenge.getChallengeName();
        DmtTextView dmtTextView = this.f62683j;
        if (dmtTextView == null) {
            C7573i.m23583a("mTitle");
        }
        TextView textView = dmtTextView;
        if (!C6399b.m19944t()) {
            Challenge challenge2 = this.f62677c;
            if (challenge2 == null) {
                C7573i.m23583a("mChallenge");
            }
            z = challenge2.isTrending();
        } else {
            z = false;
        }
        C23793i.m77999a(challengeName, textView, z);
    }

    /* renamed from: c */
    public final void mo61774c() {
        ChallengeDetailViewModel challengeDetailViewModel = this.f62672F;
        if (challengeDetailViewModel != null) {
            C23084b<Pair<Integer, C23671a>> bVar = challengeDetailViewModel.f62857b;
            if (bVar != null) {
                Pair pair = (Pair) bVar.getValue();
                if (pair != null) {
                    C23671a aVar = (C23671a) pair.getSecond();
                    if (aVar != null) {
                        ChallengeDetail challengeDetail = this.f62676b;
                        if (challengeDetail == null) {
                            C7573i.m23583a("mChallengeDetail");
                        }
                        aVar.mo61601a(challengeDetail.slideList);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        this.f62672F = C23812a.m78027a(activity);
        ChallengeDetailViewModel challengeDetailViewModel = this.f62672F;
        if (challengeDetailViewModel == null) {
            C7573i.m23580a();
        }
        C23084b<Pair<Integer, C23671a>> bVar = challengeDetailViewModel.f62857b;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        bVar.observe(activity2, this.f62673G);
        mo61774c();
    }

    /* renamed from: g */
    private final void m77890g() {
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        String challengeProfileUrl = challenge.getChallengeProfileUrl();
        if (!TextUtils.isEmpty(challengeProfileUrl)) {
            C12139r a = C12133n.m35301a(challengeProfileUrl).mo29845a(this.f62678e);
            SmartImageView smartImageView = this.f62675a;
            if (smartImageView == null) {
                C7573i.m23583a("mAvatar");
            }
            a.mo29844a((C12128i) smartImageView).mo29848a();
        }
        SmartImageView smartImageView2 = this.f62675a;
        if (smartImageView2 == null) {
            C7573i.m23583a("mAvatar");
        }
        smartImageView2.setOnClickListener(new C23760e(this, challengeProfileUrl));
    }

    /* renamed from: d */
    public final void mo61775d() {
        View view = this.f62668B;
        if (view == null) {
            C7573i.m23583a("mBottomSpace");
        }
        LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout linearLayout = this.f62681h;
        if (linearLayout == null) {
            C7573i.m23583a("mHeaderContainer");
        }
        int childCount = linearLayout.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            LinearLayout linearLayout2 = this.f62681h;
            if (linearLayout2 == null) {
                C7573i.m23583a("mHeaderContainer");
            }
            View childAt = linearLayout2.getChildAt(childCount);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup == null) {
                childCount--;
            } else {
                int id = viewGroup.getId();
                if (id == R.id.im || id == R.id.d7n) {
                    layoutParams.height = C23486n.m77122a(32.0d);
                } else {
                    if (id == R.id.a7g || id == R.id.a05) {
                        layoutParams.height = C23486n.m77122a(23.0d);
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private final void m77889f() {
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        String challengeBgUrl = challenge.getChallengeBgUrl();
        Challenge challenge2 = this.f62677c;
        if (challenge2 == null) {
            C7573i.m23583a("mChallenge");
        }
        UrlModel backgroundImageUrl = challenge2.getBackgroundImageUrl();
        if (!TextUtils.isEmpty(challengeBgUrl)) {
            C12139r a = C12133n.m35301a(challengeBgUrl).mo29845a(this.f62678e);
            SmartImageView smartImageView = this.f62679f;
            if (smartImageView == null) {
                C7573i.m23583a("mBgCover");
            }
            a.mo29844a((C12128i) smartImageView).mo29848a();
            m77895l();
        } else if (backgroundImageUrl != null) {
            C12139r a2 = C12133n.m35299a(C23400r.m76741a(backgroundImageUrl)).mo29845a(this.f62678e);
            SmartImageView smartImageView2 = this.f62679f;
            if (smartImageView2 == null) {
                C7573i.m23583a("mBgCover");
            }
            C12139r a3 = a2.mo29844a((C12128i) smartImageView2);
            C43087a aVar = C43086eb.f111705c;
            SmartImageView smartImageView3 = this.f62679f;
            if (smartImageView3 == null) {
                C7573i.m23583a("mBgCover");
            }
            a3.mo29853b(aVar.mo104750a((View) smartImageView3)).mo29848a();
            m77895l();
        } else {
            Challenge challenge3 = this.f62677c;
            if (challenge3 == null) {
                C7573i.m23583a("mChallenge");
            }
            User author = challenge3.getAuthor();
            if (author != null) {
                Challenge challenge4 = this.f62677c;
                if (challenge4 == null) {
                    C7573i.m23583a("mChallenge");
                }
                boolean z = true;
                if (challenge4.getSubType() != 1) {
                    z = false;
                }
                if (!z) {
                    author = null;
                }
                if (author != null) {
                    C12139r a4 = C12133n.m35299a(C23400r.m76741a(author.getAvatarLarger())).mo29845a(this.f62678e);
                    SmartImageView smartImageView4 = this.f62679f;
                    if (smartImageView4 == null) {
                        C7573i.m23583a("mBgCover");
                    }
                    C12139r a5 = a4.mo29844a((C12128i) smartImageView4);
                    C43087a aVar2 = C43086eb.f111705c;
                    SmartImageView smartImageView5 = this.f62679f;
                    if (smartImageView5 == null) {
                        C7573i.m23583a("mBgCover");
                    }
                    a5.mo29853b(aVar2.mo104750a((View) smartImageView5)).mo29848a();
                    m77895l();
                }
            }
        }
    }

    /* renamed from: i */
    private final void m77892i() {
        boolean z;
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        if (TextUtils.isEmpty(challenge.getDesc())) {
            View view = this.f62685l;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        ViewStub viewStub = this.f62684k;
        if (viewStub == null) {
            C7573i.m23583a("mDescContainerVs");
        }
        if (this.f62685l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            viewStub = null;
        }
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.f62686m = (DmtTextView) inflate.findViewById(R.id.dt5);
            this.f62687n = (LinearLayout) inflate.findViewById(R.id.ah5);
            this.f62688o = (DmtTextView) inflate.findViewById(R.id.du9);
            this.f62689p = (ImageView) inflate.findViewById(R.id.b8z);
            if (C6399b.m19946v()) {
                ImageView imageView = this.f62689p;
                if (imageView == null) {
                    C7573i.m23580a();
                }
                imageView.setImageDrawable(inflate.getResources().getDrawable(R.drawable.ar5));
            }
            this.f62685l = inflate;
        }
        Challenge challenge2 = this.f62677c;
        if (challenge2 == null) {
            C7573i.m23583a("mChallenge");
        }
        C23793i.m77997a(challenge2, this.f62686m, this.f62687n, this.f62688o, this.f62689p, true);
        View view2 = this.f62685l;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.setVisibility(0);
    }

    /* renamed from: j */
    private final void m77893j() {
        boolean z;
        ChallengeDetail challengeDetail = this.f62676b;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        if (C6307b.m19566a((Collection<T>) challengeDetail.relatedChallengeMusicList)) {
            View view = this.f62691r;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        ViewStub viewStub = this.f62690q;
        if (viewStub == null) {
            C7573i.m23583a("mRelatedContainerVs");
        }
        if (this.f62691r == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            viewStub = null;
        }
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.f62692s = (DmtTextView) inflate.findViewById(R.id.ad8);
            this.f62693t = (RecyclerView) inflate.findViewById(R.id.dg9);
            RecyclerView recyclerView = this.f62693t;
            if (recyclerView == null) {
                C7573i.m23580a();
            }
            Context context = recyclerView.getContext();
            C7573i.m23582a((Object) context, "context");
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(context.getResources().getColor(R.color.a3t), (int) C9738o.m28708b(recyclerView.getContext(), 24.0f), 0, C9738o.m28708b(recyclerView.getContext(), 0.0f), C9738o.m28708b(recyclerView.getContext(), 0.0f), false);
            recyclerView.mo5525a((C1272h) dividerItemDecoration);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext(), 0, false));
            this.f62691r = inflate;
        }
        RecyclerView recyclerView2 = this.f62693t;
        if (recyclerView2 == null) {
            C7573i.m23580a();
        }
        ChallengeDetail challengeDetail2 = this.f62676b;
        if (challengeDetail2 == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        RelatedMusicChallengeAdapter relatedMusicChallengeAdapter = new RelatedMusicChallengeAdapter(challengeDetail2.relatedChallengeMusicList, getContext());
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        relatedMusicChallengeAdapter.f62630b = challenge.getCid();
        relatedMusicChallengeAdapter.f62632d = "challenge_page";
        recyclerView2.setAdapter(relatedMusicChallengeAdapter);
        View view2 = this.f62691r;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.setVisibility(0);
        m77896m();
    }

    /* renamed from: k */
    private final void m77894k() {
        ChallengeDetail challengeDetail = this.f62676b;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        if (!TextUtils.isEmpty(challengeDetail.slideTitle)) {
            ChallengeDetail challengeDetail2 = this.f62676b;
            if (challengeDetail2 == null) {
                C7573i.m23583a("mChallengeDetail");
            }
            if (!C6307b.m19566a((Collection<T>) challengeDetail2.slideList)) {
                if (this.f62695v == null) {
                    ViewStub viewStub = this.f62694u;
                    if (viewStub == null) {
                        C7573i.m23583a("mHorizontalSlideContainerVs");
                    }
                    View inflate = viewStub.inflate();
                    this.f62696w = (DmtTextView) inflate.findViewById(R.id.d7t);
                    this.f62697x = (RecyclerView) inflate.findViewById(R.id.d7s);
                    RecyclerView recyclerView = this.f62697x;
                    if (recyclerView == null) {
                        C7573i.m23580a();
                    }
                    recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
                    RecyclerView recyclerView2 = this.f62697x;
                    if (recyclerView2 == null) {
                        C7573i.m23580a();
                    }
                    recyclerView2.mo5525a((C1272h) new AbsCommonHeaderView$updateHorizontalSlide$1());
                    this.f62698y = new HorizontalSlideVideoAdapter(this.f62674H);
                    RecyclerView recyclerView3 = this.f62697x;
                    if (recyclerView3 == null) {
                        C7573i.m23580a();
                    }
                    recyclerView3.setAdapter(this.f62698y);
                    this.f62695v = inflate;
                }
                DmtTextView dmtTextView = this.f62696w;
                if (dmtTextView == null) {
                    C7573i.m23580a();
                }
                ChallengeDetail challengeDetail3 = this.f62676b;
                if (challengeDetail3 == null) {
                    C7573i.m23583a("mChallengeDetail");
                }
                dmtTextView.setText(challengeDetail3.slideTitle);
                HorizontalSlideVideoAdapter horizontalSlideVideoAdapter = this.f62698y;
                if (horizontalSlideVideoAdapter == null) {
                    C7573i.m23580a();
                }
                ChallengeDetail challengeDetail4 = this.f62676b;
                if (challengeDetail4 == null) {
                    C7573i.m23583a("mChallengeDetail");
                }
                horizontalSlideVideoAdapter.mo61798a(challengeDetail4.slideList);
                View view = this.f62695v;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setVisibility(0);
                mo61774c();
                return;
            }
        }
        View view2 = this.f62695v;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: m */
    private final void m77896m() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = ",";
        ChallengeDetail challengeDetail = this.f62676b;
        if (challengeDetail == null) {
            C7573i.m23583a("mChallengeDetail");
        }
        List<RelatedChallengeMusic> list = challengeDetail.relatedChallengeMusicList;
        C7573i.m23582a((Object) list, "mChallengeDetail.relatedChallengeMusicList");
        for (RelatedChallengeMusic relatedChallengeMusic : list) {
            C7573i.m23582a((Object) relatedChallengeMusic, "it");
            if (relatedChallengeMusic.categoryType == 1 && relatedChallengeMusic.music != null) {
                Music music = relatedChallengeMusic.music;
                C7573i.m23582a((Object) music, "it.music");
                sb.append(music.getMid());
                sb.append(str);
            } else if (relatedChallengeMusic.categoryType == 2 && relatedChallengeMusic.challenge != null) {
                Challenge challenge = relatedChallengeMusic.challenge;
                C7573i.m23582a((Object) challenge, "it.challenge");
                sb2.append(challenge.getCid());
                sb2.append(str);
            }
        }
        CharSequence charSequence = str;
        C7634n.m23735a((CharSequence) sb, charSequence);
        C7634n.m23735a((CharSequence) sb2, charSequence);
        String str2 = "";
        String str3 = "0";
        if (TextUtils.equals(this.f62671E.f62782d, "from_related_tag")) {
            Challenge challenge2 = this.f62677c;
            if (challenge2 == null) {
                C7573i.m23583a("mChallenge");
            }
            str2 = challenge2.getCid();
            C7573i.m23582a((Object) str2, "mChallenge.cid");
            str3 = "1";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str3);
            jSONObject.put("enter_from", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("music", sb.toString());
            jSONObject2.put("challenge", sb2.toString());
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName("extend_challenge").setLabelName("challenge");
        Challenge challenge3 = this.f62677c;
        if (challenge3 == null) {
            C7573i.m23583a("mChallenge");
        }
        C6907h.onEvent(labelName.setValue(challenge3.getCid()).setJsonObject(jSONObject));
    }

    /* renamed from: b */
    public void mo61773b() {
        View findViewById = findViewById(R.id.lo);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.bg_cover)");
        this.f62679f = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.lp);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.bg_cover_mask)");
        this.f62680g = findViewById2;
        View findViewById3 = findViewById(R.id.auq);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.header_container)");
        this.f62681h = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.dal);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.status_bar)");
        this.f62682i = findViewById4;
        View findViewById5 = findViewById(R.id.ic);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.avatar)");
        this.f62675a = (SmartImageView) findViewById5;
        View findViewById6 = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.title)");
        this.f62683j = (DmtTextView) findViewById6;
        View findViewById7 = findViewById(R.id.eeq);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.vs_desc_container)");
        this.f62684k = (ViewStub) findViewById7;
        View findViewById8 = findViewById(R.id.eex);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.vs_related_container)");
        this.f62690q = (ViewStub) findViewById8;
        View findViewById9 = findViewById(R.id.ees);
        C7573i.m23582a((Object) findViewById9, "findViewById(R.id.vs_horizontal_slide)");
        this.f62694u = (ViewStub) findViewById9;
        View findViewById10 = findViewById(R.id.ob);
        C7573i.m23582a((Object) findViewById10, "findViewById(R.id.bottom_space)");
        this.f62668B = findViewById10;
        for (C23784i a : this.f62670D) {
            a.mo61814a(this, this.f62671E);
        }
        mo61838e();
    }

    public final void setHasBgCoverMask(boolean z) {
        this.f62669C = z;
    }

    /* access modifiers changed from: protected */
    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.f62672F = challengeDetailViewModel;
    }

    /* access modifiers changed from: protected */
    public final void setMAvatar(SmartImageView smartImageView) {
        C7573i.m23587b(smartImageView, "<set-?>");
        this.f62675a = smartImageView;
    }

    /* access modifiers changed from: protected */
    public final void setMChallenge(Challenge challenge) {
        C7573i.m23587b(challenge, "<set-?>");
        this.f62677c = challenge;
    }

    /* access modifiers changed from: protected */
    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        C7573i.m23587b(challengeDetail, "<set-?>");
        this.f62676b = challengeDetail;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61771a(C23784i iVar) {
        C7573i.m23587b(iVar, "delegate");
        this.f62670D.add(iVar);
    }

    /* renamed from: a */
    private static CircleOptions m77886a(Context context) {
        CircleOptions a = new C12089a().mo29783b(C12123c.m35292a(context, 2.0f)).mo29780a(C12123c.m35292a(context, 0.0f)).mo29782a();
        C7573i.m23582a((Object) a, "builder.build()");
        return a;
    }

    @C7709l
    public final void onEvent(ShareCompleteEvent shareCompleteEvent) {
        C7573i.m23587b(shareCompleteEvent, "event");
        if (TextUtils.equals("challenge", shareCompleteEvent.itemType)) {
            Context context = getContext();
            SmartImageView smartImageView = this.f62675a;
            if (smartImageView == null) {
                C7573i.m23583a("mAvatar");
            }
            C43091ed.m136696a(context, smartImageView, shareCompleteEvent);
        }
    }

    public final void setHeaderAlpha(float f) {
        LinearLayout linearLayout = this.f62681h;
        if (linearLayout == null) {
            C7573i.m23583a("mHeaderContainer");
        }
        linearLayout.setAlpha(1.0f - f);
        for (C23784i a : this.f62670D) {
            a.mo61813a(f);
        }
    }

    /* renamed from: a */
    public void mo61770a(ChallengeDetail challengeDetail) {
        C7573i.m23587b(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            this.f62676b = challengeDetail;
            Challenge challenge = challengeDetail.challenge;
            C7573i.m23582a((Object) challenge, "data.challenge");
            this.f62677c = challenge;
            m77889f();
            m77890g();
            m77891h();
            m77892i();
            m77893j();
            m77894k();
            m77887b(challengeDetail);
            for (C23784i a : this.f62670D) {
                a.mo61815a(challengeDetail);
            }
        }
    }

    /* renamed from: b */
    private final void m77887b(ChallengeDetail challengeDetail) {
        if (!C6399b.m19944t() || !C29132a.m95560a()) {
            C30221c g = C29132a.m95572g();
            if (!(g == null || g.f79528r == null)) {
                List<String> list = g.f79528r;
                Challenge challenge = challengeDetail.challenge;
                C7573i.m23582a((Object) challenge, "data.challenge");
                if (list.contains(challenge.getCid())) {
                    View view = this.f62685l;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }
            this.f62667A = (SmartImageView) findViewById(R.id.ar);
            FrameLayout frameLayout = this.f62699z;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            C30221c g2 = C29132a.m95572g();
            if (!(g2 == null || g2.f79529s == null || g2.f79528r == null)) {
                List<String> list2 = g2.f79528r;
                Challenge challenge2 = challengeDetail.challenge;
                C7573i.m23582a((Object) challenge2, "data.challenge");
                if (list2.contains(challenge2.getCid())) {
                    this.f62699z = (FrameLayout) findViewById(R.id.aq);
                    this.f62667A = (SmartImageView) findViewById(R.id.ar);
                    FrameLayout frameLayout2 = this.f62699z;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                    }
                    SmartImageView smartImageView = this.f62667A;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(0);
                    }
                    C30223b bVar = g2.f79529s;
                    C7573i.m23582a((Object) bVar, "entry.bannerDetail");
                    C12139r a = C12133n.m35301a(bVar.f79532a).mo29845a("AbsCommonHeaderLayout");
                    Context context = getContext();
                    C7573i.m23582a((Object) context, "context");
                    a.mo29842a(m77886a(context)).mo29844a((C12128i) this.f62667A).mo29848a();
                    Challenge challenge3 = challengeDetail.challenge;
                    C7573i.m23582a((Object) challenge3, "data.challenge");
                    C6907h.m21524a("xmas_banner_show", (Map) C22984d.m75611a().mo59973a("enter_from", "tag_page").mo59973a("gen", C29132a.m95567d()).mo59973a("tag_id", challenge3.getCid()).f60753a);
                    FrameLayout frameLayout3 = this.f62699z;
                    if (frameLayout3 != null) {
                        frameLayout3.setOnClickListener(new C23759d(this, g2, challengeDetail));
                    }
                }
            }
        }
        C30221c g3 = C29132a.m95572g();
        if (!(g3 == null || g3.f79528r == null)) {
            List<String> list3 = g3.f79528r;
            Challenge challenge4 = challengeDetail.challenge;
            C7573i.m23582a((Object) challenge4, "data.challenge");
            if (list3.contains(challenge4.getCid()) && C32326h.m104882f()) {
                View view2 = this.f62685l;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61772a(Aweme aweme, int i) {
        String str = "click_challenge_video_card";
        C22984d a = C22984d.m75611a();
        String str2 = "challenge_id";
        Challenge challenge = this.f62677c;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        C6907h.m21524a(str, (Map) a.mo59973a(str2, challenge.getCid()).mo59973a("group_id", aweme.getAid()).mo59970a(POIService.KEY_ORDER, i).f60753a);
    }

    public C23755a(Context context, C23783h hVar, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        if (hVar == null) {
            C7573i.m23580a();
        }
        this.f62671E = hVar;
        LayoutInflater.from(context).inflate(getLayoutResId(), this, true);
        mo61769a();
        mo61773b();
        this.f62673G = new C23757b(this);
        this.f62674H = new C23758c(this);
    }
}
