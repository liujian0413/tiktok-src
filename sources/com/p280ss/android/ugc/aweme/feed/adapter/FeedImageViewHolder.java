package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24717ak;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p280ss.android.ugc.aweme.feed.C28066ac;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.C28227b;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoPostTimeWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28502r;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28510y;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.main.CleanModeManager2;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder */
public class FeedImageViewHolder extends C28155b {

    /* renamed from: a */
    protected String f73944a;

    /* renamed from: b */
    public boolean f73945b;

    /* renamed from: c */
    public boolean f73946c;
    FrameLayout commerceTagFrameLayout;

    /* renamed from: d */
    protected Fragment f73947d;

    /* renamed from: e */
    long f73948e;

    /* renamed from: f */
    private Context f73949f;

    /* renamed from: g */
    private Aweme f73950g;

    /* renamed from: k */
    private C28343z<C28318an> f73951k;

    /* renamed from: l */
    private JSONObject f73952l;
    LinearLayout llAwemeIntro;
    LinearLayout llRightMenu;

    /* renamed from: m */
    private int f73953m;
    ViewGroup mAwemeInCheckLayout;
    View mBottomView;
    RemoteImageView mCoverView;
    View mGradualBottomView;
    LineProgressBar mLineProgressBar;
    LongPressLayout mLongPressLayout;
    ViewGroup mPoiRatingContainer;
    TextView mRateText;
    RatingBar mRatingBar;
    FrameLayout mRootView;
    TextView mTitleView;
    TextView mTxtExtra;
    RelativeLayout mWidgetContainer;

    /* renamed from: n */
    private int f73954n;

    /* renamed from: o */
    private String f73955o;

    /* renamed from: p */
    private C24717ak f73956p;

    /* renamed from: q */
    private int f73957q;

    /* renamed from: r */
    private int f73958r;

    /* renamed from: s */
    private boolean f73959s;

    /* renamed from: t */
    private int f73960t;
    TagLayout tagLayout;

    /* renamed from: B */
    public final boolean mo71517B() {
        return this.f73945b;
    }

    /* renamed from: f */
    public final int mo65709f() {
        return 2;
    }

    /* renamed from: f */
    public final void mo71536f(boolean z) {
    }

    /* renamed from: g */
    public final int mo65710g() {
        return 1;
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f73950g;
    }

    /* renamed from: j */
    public final void mo65713j() {
        mo71771s();
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return null;
    }

    /* renamed from: v */
    public final Context mo71539v() {
        return this.f73949f;
    }

    /* renamed from: a */
    public final void mo71527a(String str, String str2, String str3, String str4) {
        this.f74252h.mo60134a("playlist_id", (Object) str3);
        this.f74252h.mo60134a("playlist_type", (Object) str);
        this.f74252h.mo60134a("playlist_id_key", (Object) str2);
        this.f74252h.mo60134a("tab_name", (Object) str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71526a(Object obj) {
        if (this.f73952l != null) {
            String str = "";
            try {
                str = this.f73952l.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f73950g.setRequestId(str);
            }
        }
        if (this.f73951k != null && this.f73950g != null) {
            this.f73951k.mo64929a(new C28318an(43, obj));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71523a(int i, float f, float f2) {
        if (!C43122ff.m136767b() && C28502r.m93676a(this.f73944a)) {
            C42961az.m136380a(new C28324g(true, i, mo71539v().hashCode()));
        }
    }

    /* renamed from: a */
    public void mo65708a(Aweme aweme) {
        if (aweme != null) {
            if (this.f73959s) {
                C28510y.m93718a((View) this.mCoverView);
            }
            this.f73950g = aweme;
            this.f73948e = System.currentTimeMillis();
            mo71540w();
            m91736J();
            mo56928d();
            this.mWidgetContainer.setVisibility(0);
            m91746d(aweme);
            if (this.f73959s) {
                m91741a((View) this.mCoverView);
            }
        }
    }

    /* renamed from: a */
    public final void mo71525a(C28308ad adVar) {
        if (this.f73950g.getAid().equals(adVar.f74617b.getAid())) {
            UrlModel urlModel = adVar.f74616a.labelPrivate;
            this.f73950g.setLabelPrivate(urlModel);
            m91743a(urlModel, adVar.f74618c);
            if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue() || urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                this.tagLayout.mo61049b();
            } else {
                this.tagLayout.mo61050b(this.f73950g, this.f73950g.getVideoLabels(), new C23440a(7, 20));
            }
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c = 0;
                        break;
                    }
                    break;
                case -492284990:
                    if (str.equals("video_comment_list")) {
                        c = 1;
                        break;
                    }
                    break;
                case -162745511:
                    if (str.equals("feed_internal_event")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1181771620:
                    if (str.equals("video_share_click")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1964086245:
                    if (str.equals("to_profile")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m91747f(((Integer) aVar.mo60161a()).intValue());
                    return;
                case 1:
                    m91747f(((Integer) aVar.mo60161a()).intValue());
                    return;
                case 2:
                    m91747f(3);
                    return;
                case 3:
                    if (this.f73951k != null) {
                        this.f73951k.mo64929a(aVar.mo60161a());
                        return;
                    }
                    break;
                case 4:
                    m91737K();
                    break;
            }
        }
    }

    /* renamed from: J */
    private void m91736J() {
        C43081e.m136670a(this.mBottomView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final /* synthetic */ long mo71519H() {
        return System.currentTimeMillis() - this.f73948e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final /* synthetic */ void mo71520I() {
        m91741a((View) this.mCoverView);
    }

    /* renamed from: L */
    private static JSONObject m91738L() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_photo", 1);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: t */
    private void mo71772t() {
        this.f74253i.mo60157b(R.id.ebb, new VideoPostTimeWidget());
    }

    /* renamed from: F */
    public final C28201af mo71518F() {
        if (this.f73959s) {
            return new C28184l(this);
        }
        return null;
    }

    /* renamed from: l */
    public final void mo65715l() {
        mo71771s();
        if (this.f74252h != null) {
            this.f74252h.mo60134a("on_image_page_unselected", (Object) null);
        }
    }

    /* renamed from: K */
    private void m91737K() {
        String str = this.f73944a;
        boolean z = true;
        if (this.f73953m != 1) {
            z = false;
        }
        C28141am.m92411a(new C28311ag(str, z), new C28312ah(this.f73949f.hashCode()), this.f73944a);
    }

    /* renamed from: M */
    private boolean m91739M() {
        if (!C6903bc.m21482a().mo84630a() || !TextUtils.equals(this.f73944a, "homepage_follow")) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void mo71771s() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("stopPlayAnimation", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: k */
    public final void mo65714k() {
        this.f73948e = System.currentTimeMillis();
        if (this.f74252h != null) {
            this.f74252h.mo60134a("image_resume", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: N */
    private boolean m91740N() {
        if (C32891b.m106468a().f85831a || ((m91739M() && C32891b.m106468a().f85832b) || CleanModeManager2.m106210b(mo71539v()))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void mo71773u() {
        List imageInfos = this.f73950g.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                this.mCoverView.setVisibility(0);
                this.mLineProgressBar.mo74361a();
                C23323e.m76524b(this.mCoverView, imageInfo.getLabelLarge());
                C23323e.m76502a(imageInfo.getLabelLarge(), (C23328a) new C23328a() {
                    /* renamed from: a */
                    public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                        FeedImageViewHolder.this.mLineProgressBar.mo74362b();
                    }

                    /* renamed from: a */
                    public final void mo60610a(Exception exc) {
                        FeedImageViewHolder.this.mLineProgressBar.mo74362b();
                    }
                });
            }
        }
    }

    /* renamed from: i */
    public final void mo65712i() {
        if (this.f73948e != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f73948e;
            this.f73948e = -1;
            C6907h.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(this.f73944a).setValue(this.f73950g.getAid()).setExtValueLong(currentTimeMillis).setJsonObject(m91738L()));
            C6907h.m21524a("play_time", (Map) C22984d.m75611a().mo59973a("enter_from", this.f73944a).mo59973a("group_id", this.f73950g.getAid()).mo59971a("duration", currentTimeMillis).f60753a);
            if (this.f74252h != null) {
                this.f74252h.mo60134a("image_pause", (Object) Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo71537n() {
        this.f74252h = DataCenter.m75849a(C23087c.m75887a(this.f73947d, this), (C0043i) this.f73947d);
        this.f74252h.mo60132a("update_diig_view", (C0053p<C23083a>) this).mo60132a("video_digg", (C0053p<C23083a>) this).mo60132a("feed_internal_event", (C0053p<C23083a>) this).mo60132a("video_share_click", (C0053p<C23083a>) this).mo60132a("to_profile", (C0053p<C23083a>) this).mo60132a("video_comment_list", (C0053p<C23083a>) this);
        this.f74253i = WidgetManager.m75867a(this.f73947d, (View) this.mRootView);
        this.f74253i.mo60153a(this.f74252h);
        this.f74253i.mo60156a((Callable) new C28185m(this), C6384b.m19835a().mo15292a(DisableAsyncBindAB.class, true, "disable_async_widgetbind", C6384b.m19835a().mo15295d().disable_async_widgetbind, true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final /* synthetic */ Object mo71541z() throws Exception {
        this.f74253i.mo60157b(R.id.a8y, new VideoDiggWidget(this.f73944a, new C28186n(this))).mo60157b(R.id.ec0, new VideoDescWidget()).mo60157b(R.id.ajl, C28677a.m94348b().mo71731a()).mo60157b(R.id.j3, new FeedAvatarWidget()).mo60157b(R.id.d5b, new VideoShareWidget()).mo60157b(R.id.ze, new VideoCommentWidget());
        mo71772t();
        return null;
    }

    /* renamed from: d */
    public final void mo56928d() {
        int i;
        if (!this.f73959s || !C32891b.m106468a().f85831a) {
            if (!C21085a.m71117a().f56622i || (C25329c.m83231n(this.f73950g) && !C25329c.m83233p(this.f73950g) && !C24671f.m80857g().mo65559f())) {
                i = 0;
            } else {
                i = -C21085a.m71117a().mo56926b();
            }
            this.f73960t = i;
            if (C21085a.m71129c()) {
                i += C21085a.f56610a;
            }
            LayoutParams layoutParams = (LayoutParams) this.mWidgetContainer.getLayoutParams();
            layoutParams.bottomMargin = i;
            this.mWidgetContainer.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo71521a() {
        super.mo71521a();
        if (this.mLineProgressBar != null) {
            this.mLineProgressBar.mo74363c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo71540w() {
        boolean z;
        VideoItemParams requestId = VideoItemParams.newBuilder().setFragment(this.f73947d).setAweme(this.f73950g).setAwemeFromPage(this.f73953m).setEventType(this.f73944a).setMyProfile(this.f73946c).setPageType(this.f73954n).setEnterMethodValue(this.f74254j).setRequestId(this.f73952l);
        if (this.f74252h != null) {
            this.f74252h.mo60134a("video_params", (Object) requestId);
        }
        mo71773u();
        User author = this.f73950g.getAuthor();
        if (author != null) {
            this.mTitleView.setText(this.f73949f.getString(R.string.b5s, new Object[]{author.getNickname()}));
            this.mTitleView.getPaint().setFakeBoldText(true);
        } else {
            this.mTitleView.setText("");
        }
        if (this.f73950g == null || this.f73950g.isCanPlay()) {
            this.mTitleView.setVisibility(0);
        } else {
            this.mTitleView.setVisibility(4);
        }
        this.tagLayout.setEventType(this.f73944a);
        List videoLabels = this.f73950g.getVideoLabels();
        m91744a(videoLabels);
        if (!RelationLabelHelper.hasDuoShanLabel(this.f73950g)) {
            if (C6319n.m19594a(this.f73944a, "homepage_hot")) {
                this.tagLayout.mo61051c(this.f73950g, videoLabels, new C23440a(7, 20));
            } else {
                this.tagLayout.mo61050b(this.f73950g, videoLabels, new C23440a(7, 20));
            }
        }
        if (TextUtils.isEmpty(this.f73950g.getExtra()) || !C6399b.m19928c()) {
            this.mTxtExtra.setVisibility(8);
        } else {
            this.mTxtExtra.setText(this.f73950g.getExtra());
            this.mTxtExtra.setVisibility(0);
        }
        if (this.f73950g.getUserDigg() == 1) {
            z = true;
        } else {
            z = false;
        }
        mo71770a(z);
        if (this.f73953m == 1) {
            mo71533d(m91740N());
        }
        AwemeStatus status = this.f73950g.getStatus();
        if (status == null) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else if (status.isInReviewing()) {
            this.mAwemeInCheckLayout.setVisibility(0);
        } else {
            this.mAwemeInCheckLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Aweme mo71532d(int i) {
        return this.f73950g;
    }

    /* renamed from: e */
    public final void mo71534e(int i) {
        ((MarginLayoutParams) this.mBottomView.getLayoutParams()).bottomMargin = i;
        this.mBottomView.requestLayout();
    }

    /* renamed from: a */
    private void mo71770a(boolean z) {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("update_diig_view_from_panel", (Object) Boolean.valueOf(z));
        }
    }

    /* renamed from: f */
    private void m91747f(int i) {
        if (this.f73951k != null && this.f73950g != null) {
            this.f73951k.mo64929a(new C28318an(i, mo71532d(i)));
        }
    }

    /* renamed from: b */
    public final void mo71528b(int i) {
        super.mo71528b(i);
        if (this.f74252h != null) {
            this.f74252h.mo60134a("holder_on_pause", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    public final void mo71530c(int i) {
        super.mo71530c(i);
        if (this.f74252h != null) {
            this.f74252h.mo60134a("holder_on_resume", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public void mo71533d(boolean z) {
        super.mo71533d(z);
        if (z) {
            this.mWidgetContainer.setVisibility(4);
        } else {
            this.mWidgetContainer.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m91741a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            this.f73957q = layoutParams.width;
            this.f73958r = layoutParams.height;
        } else if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            view.post(new C28183k(this));
        } else {
            this.f73957q = view.getMeasuredWidth();
            this.f73958r = view.getMeasuredHeight();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71529b(Aweme aweme) {
        if (aweme != null) {
            if (this.f73959s) {
                C28510y.m93718a((View) this.mCoverView);
            }
            this.f73950g = aweme;
            this.f73948e = System.currentTimeMillis();
            mo71540w();
            mo56928d();
            this.mWidgetContainer.setVisibility(0);
            if (this.f73959s) {
                m91741a((View) this.mCoverView);
            }
            this.mTitleView.setVisibility(8);
            this.tagLayout.setVisibility(8);
            this.commerceTagFrameLayout.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo71531c(Aweme aweme) {
        if (!(this.f73949f == null || aweme == null || this.f74252h == null)) {
            this.f74252h.mo60134a("handle_double_click", (Object) aweme);
        }
    }

    /* renamed from: d */
    private void m91746d(Aweme aweme) {
        boolean z;
        if (TextUtils.equals(this.f73944a, "poi_rate_list") || TextUtils.equals(this.f73944a, "homestay_reservation_detail") || (TextUtils.equals(this.f73944a, "poi_page") && TextUtils.equals(this.f73955o, "rate"))) {
            z = true;
        } else {
            z = false;
        }
        if (!z || TextUtils.isEmpty(aweme.getRateScore())) {
            this.mPoiRatingContainer.setVisibility(8);
            return;
        }
        this.mPoiRatingContainer.setVisibility(0);
        this.mRatingBar.setStar(Float.valueOf(aweme.getRateScore()).floatValue());
        this.mRateText.setText(C1642a.m8034a(mo71539v().getResources().getString(R.string.d00), new Object[]{aweme.getRateScore()}));
    }

    /* renamed from: e */
    public void mo71535e(boolean z) {
        if (z) {
            C41540at.m132301a(this.llRightMenu, this.llRightMenu.getAlpha(), 0.0f);
            C41540at.m132301a(this.llAwemeIntro, this.llAwemeIntro.getAlpha(), 0.0f);
            C41540at.m132301a(this.mBottomView, this.mBottomView.getAlpha(), 0.0f);
            this.f73945b = true;
            return;
        }
        C41540at.m132301a(this.llRightMenu, this.llRightMenu.getAlpha(), 1.0f);
        C41540at.m132301a(this.llAwemeIntro, this.llAwemeIntro.getAlpha(), 1.0f);
        C41540at.m132301a(this.mBottomView, this.mBottomView.getAlpha(), 1.0f);
        if (this.f73945b) {
            this.f73945b = false;
        }
    }

    /* renamed from: a */
    private void m91744a(List<AwemeLabelModel> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (int i = 0; i < list.size(); i++) {
                AwemeLabelModel awemeLabelModel = (AwemeLabelModel) list.get(i);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !C28482e.m93606a(this.f73950g) && this.f73950g.getStatus() != null && this.f73950g.getStatus().getPrivateStatus() == 1) {
                    list.remove(awemeLabelModel);
                }
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.title) {
            if (this.f73950g != null && (!this.f73950g.isCanPlay() || this.f73950g.isDelete())) {
                C10761a.m31399c(this.f73949f, (int) R.string.bsx).mo25750a();
            } else if (!(this.f73950g == null || this.f73950g.getAuthor() == null)) {
                m91747f(18);
                m91737K();
            }
        } else if (id == R.id.jg && this.f73950g != null && !TextUtils.isEmpty(this.f73950g.getAid())) {
            SmartRouter.buildRoute(mo71539v(), "//webview").withParam("url", C1642a.m8034a("https://aweme.snssdk.com/falcon/douyin_falcon/reviewing/?itemId=%s", new Object[]{this.f73950g.getAid()})).withParam("hide_nav_bar", true).open();
        }
    }

    /* renamed from: a */
    public final void mo65707a(int i) {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("on_image_page_selected", (Object) null);
        }
        BusinessComponentServiceUtils.getLabService().mo91801a(this.f73950g.getAid());
        mo71533d(false);
        C28227b.m92771a(this.f73954n, this.f73950g.getAid(), 2);
        if (C28066ac.m91704a(this.f73953m)) {
            C42961az.m136380a(new C28306ab(this.f73950g));
        }
        this.mLineProgressBar.mo74362b();
        C6907h.onEvent(MobClick.obtain().setEventName("show").setLabelName(this.f73944a).setValue(this.f73950g.getAid()).setJsonObject(m91738L()));
        C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(this.f73944a).setValue(this.f73950g.getAid()).setJsonObject(m91738L()));
        this.f73948e = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected static void m91742a(View view, boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m91743a(UrlModel urlModel, int i) {
        AwemeLabelModel awemeLabelModel;
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(i);
            awemeLabelModel.setUrlModels(urlModel);
        } else {
            awemeLabelModel = null;
        }
        if (!(this.f73950g == null || this.f73950g.videoLabels == null)) {
            int size = this.f73950g.videoLabels.size();
            int i2 = 0;
            while (i2 < size) {
                int labelType = ((AwemeLabelModel) this.f73950g.videoLabels.get(i2)).getLabelType();
                if (labelType != 1 && labelType != 11) {
                    i2++;
                } else if (i == 0) {
                    this.f73950g.videoLabels.remove(i2);
                    return;
                } else {
                    this.f73950g.videoLabels.set(i2, awemeLabelModel);
                    return;
                }
            }
            if (i != 0) {
                this.f73950g.videoLabels.add(0, awemeLabelModel);
            }
        }
    }

    /* renamed from: a */
    public final void mo71522a(float f, float f2) {
        float f3;
        float f4 = f + ((float) this.f73960t);
        float f5 = f2 + ((float) this.f73960t);
        if (f4 > 120.0f && !C32891b.m106468a().f85831a) {
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(false);
            C32891b.m106468a().mo84616a(true);
        } else if (f4 <= 120.0f && C32891b.m106468a().f85831a) {
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
            C32891b.m106468a().mo84616a(false);
        }
        if (f4 < 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = f4;
        }
        C28510y.m93717a(this.mRootView.getContext(), this.mRootView, this.mCoverView, f3, f5, this.f73957q, this.f73958r);
    }

    public FeedImageViewHolder(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        this(i, view, zVar, str, onTouchListener, fragment, i2, null);
    }

    public FeedImageViewHolder(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2, String str2) {
        int i3 = i;
        this.f73959s = C6384b.m19835a().mo15292a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", C6384b.m19835a().mo15295d().enable_comment_video_shrink, false);
        this.f73948e = -1;
        this.f73949f = view.getContext();
        View view2 = view;
        ButterKnife.bind((Object) this, view);
        this.mGradualBottomView.getLayoutParams().height = (C9738o.m28709b(this.f73949f) * 3) / 4;
        this.f73944a = str;
        this.f73953m = i3;
        this.f73947d = fragment;
        this.f73954n = i2;
        this.f73955o = str2;
        this.f73951k = zVar;
        if ("upload".equals(this.f73944a)) {
            this.f73944a = null;
        }
        this.mTitleView.setOnTouchListener(new C10804a(0.5f, 1.0f));
        this.mLongPressLayout.setListener(new C28182j(this, i));
        this.mLongPressLayout.setTapListener(onTouchListener);
        if (DDislikeStyleExperiment.enableOptimizeLongPressTimeInterval()) {
            this.mLongPressLayout.setTimeInterval(C34943c.f91128x);
        } else {
            this.mLongPressLayout.setTimeInterval(VETransitionFilterParam.TransitionDuration_DEFAULT);
        }
        mo71537n();
        this.f73956p = C24436a.m80356a().getECVideoViewHolder(view, this.commerceTagFrameLayout, null, this.f73954n, null, this.f73944a, zVar);
        if (this.mLongPressLayout != null) {
            if (DDislikeStyleExperiment.enableOptimizeLongPressTimeInterval()) {
                this.mLongPressLayout.setTimeInterval(C34943c.f91128x);
                return;
            }
            this.mLongPressLayout.setTimeInterval(VETransitionFilterParam.TransitionDuration_DEFAULT);
        }
    }
}
