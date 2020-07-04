package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.BaseDetailFragment;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23742a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.C26051c;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.p280ss.android.ugc.aweme.detail.C26116k;
import com.p280ss.android.ugc.aweme.discover.helper.C26656d;
import com.p280ss.android.ugc.aweme.discover.mob.C26801u;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.hotsearch.p1296d.C30361a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.MusicOwnerAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.SimilarMusicCoverAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter;
import com.p280ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicDetail;
import com.p280ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p280ss.android.ugc.aweme.music.model.SimilarMusicInfo;
import com.p280ss.android.ugc.aweme.music.p1405a.C33673a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.music.presenter.C33820o;
import com.p280ss.android.ugc.aweme.music.presenter.C33823p;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38162d;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.views.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment */
public class MusicDetailFragment extends BaseDetailFragment implements C23742a, C27746c, C33823p, C33970a {

    /* renamed from: J */
    private ViewGroup f88269J;

    /* renamed from: K */
    private ViewGroup f88270K;

    /* renamed from: L */
    private ViewGroup f88271L;

    /* renamed from: M */
    private RecyclerView f88272M;

    /* renamed from: N */
    private RecyclerView f88273N;

    /* renamed from: O */
    private RecyclerView f88274O;

    /* renamed from: P */
    private ThirdMusicCoverAdapter f88275P;

    /* renamed from: Q */
    private MusicOwnerAdapter f88276Q;

    /* renamed from: R */
    private SimilarMusicCoverAdapter f88277R;

    /* renamed from: S */
    private boolean f88278S;

    /* renamed from: T */
    private boolean f88279T;

    /* renamed from: U */
    private String f88280U;

    /* renamed from: V */
    private String f88281V;

    /* renamed from: W */
    private C33820o f88282W;

    /* renamed from: X */
    private String f88283X;

    /* renamed from: Y */
    private String f88284Y;

    /* renamed from: Z */
    private String f88285Z;

    /* renamed from: aa */
    private C27743a f88286aa;

    /* renamed from: ab */
    private boolean f88287ab;

    /* renamed from: ac */
    private C33963h f88288ac;

    /* renamed from: ad */
    private DetailAwemeListFragment f88289ad;

    /* renamed from: ae */
    private DetailAwemeListFragment f88290ae;

    /* renamed from: af */
    private MusicDetail f88291af;

    /* renamed from: ag */
    private int f88292ag;

    /* renamed from: ah */
    private String f88293ah;

    /* renamed from: ai */
    private C35481c f88294ai;

    /* renamed from: aj */
    private boolean f88295aj;

    /* renamed from: ak */
    private boolean f88296ak;

    /* renamed from: al */
    private String f88297al;

    /* renamed from: am */
    private CountDownTimer f88298am;

    /* renamed from: an */
    private long f88299an;
    Button btnEditMusicTitle;

    /* renamed from: h */
    public boolean f88300h;

    /* renamed from: i */
    C41654d f88301i;
    CheckableImageView ivMusicCollect;
    ImageView ivMusicianMark;
    ImageView ivPlay;
    ImageView ivShareBtn;
    ImageView ivStop;

    /* renamed from: j */
    public Music f88302j;

    /* renamed from: k */
    public MusicModel f88303k;

    /* renamed from: l */
    public C43656b f88304l;

    /* renamed from: m */
    float f88305m;
    SmartImageView mBgCover;
    FrameLayout mFlStartRecord;
    View mHeadLayout;
    View mMusicCollectLayout;
    TextView mMusicCollectionText;
    SmartImageView mMusicCover;
    ViewGroup mMusicName;
    TextView mMusicTitle;
    TextView mMusicUsedCount;
    public ImageView mMusicianEntry;
    TextView mNickName;
    TextView mPlaceHolder;
    DmtStatusView mStatusView;
    View mTitleLayout;
    ViewStub mVsMusicOwner;
    ViewStub mVsOriginalMusic;
    ViewStub mVsSimilarMusic;
    ViewStub mVsThirdMusic;
    ViewStub mVsThirdMusicNewStyle;

    /* renamed from: n */
    float f88306n;

    /* renamed from: o */
    boolean f88307o;

    /* renamed from: p */
    private MusicCollectGuidePopupWindow f88308p;

    /* renamed from: q */
    private ViewGroup f88309q;
    RecyclerView recyclerTag;
    View tagLayout;
    View tagMask;
    TextView txtElse;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a */
    class C33855a extends ClickableSpan {

        /* renamed from: a */
        private MusicOwnerInfo f88324a;

        C33855a() {
        }

        public void onClick(View view) {
            if (!C27326a.m89578a(view)) {
                MusicDetailFragment.m109085a(this.f88324a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(MusicDetailFragment.this.getResources().getColor(R.color.a53));
            textPaint.setUnderlineText(false);
        }

        C33855a(MusicOwnerInfo musicOwnerInfo) {
            this.f88324a = musicOwnerInfo;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b */
    class C33856b implements OnTouchListener {

        /* renamed from: a */
        long f88326a;

        C33856b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f88326a = System.currentTimeMillis();
                    break;
                case 1:
                    if (System.currentTimeMillis() - this.f88326a > 300) {
                        return true;
                    }
                    TextView textView = (TextView) view;
                    CharSequence text = textView.getText();
                    if (text instanceof SpannedString) {
                        int x = (int) motionEvent.getX();
                        int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                        C33855a[] aVarArr = (C33855a[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, C33855a.class);
                        if (aVarArr.length != 0) {
                            aVarArr[0].onClick(textView);
                            return true;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final String mo61693a(int i) {
        return i == 0 ? "single_song" : i == 1 ? "single_song_fresh" : "";
    }

    /* renamed from: a */
    public final void mo86461a(MusicModel musicModel) {
    }

    public final String bp_() {
        return "single_song";
    }

    /* renamed from: m */
    public final int mo61706m() {
        return R.layout.p5;
    }

    /* renamed from: n */
    public final String mo61707n() {
        return this.f88283X;
    }

    /* renamed from: o */
    public final String mo86491o() {
        return "single_song";
    }

    /* renamed from: a */
    public final void mo67556a(View view) {
        super.mo67556a(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.daa);
        if (viewStub != null) {
            viewStub.setLayoutParams(new LayoutParams(-1, -1));
            Context context = getContext();
            if (C6399b.m19944t()) {
                viewStub.setLayoutResource(R.layout.a99);
                viewStub.inflate();
                ((TextView) view.findViewById(R.id.da9)).setText(R.string.dtk);
                View findViewById = view.findViewById(R.id.da5);
                int c = C0683b.m2912c(context, R.color.a2w);
                C33937am amVar = new C33937am(C9738o.m28708b(context, 4.0f), Blur.NORMAL, 0.0f, C9738o.m28708b(context, 2.0f), C0683b.m2912c(context, R.color.bb));
                findViewById.setBackground(new C33939ao(c, amVar));
                return;
            }
            viewStub.setLayoutResource(R.layout.a9_);
            viewStub.inflate();
        }
    }

    /* renamed from: a */
    public final C26065h mo67554a(ViewGroup viewGroup) {
        if (C6399b.m19944t()) {
            return new C33673a(getContext(), viewGroup);
        }
        return super.mo67554a(viewGroup);
    }

    /* renamed from: a */
    private void m109088a(boolean z) {
        if (this.mStatusView.mo25940d(true)) {
            m109066E();
            if (z) {
                for (C26060f d : this.f68822D) {
                    d.mo61748d();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86483a(boolean z, boolean z2) {
        if (z) {
            C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("request_id", String.valueOf(this.f88289ad.mo61753m())).mo59973a("music_id", this.f88283X).mo59973a("enter_from", this.f88293ah).mo59975b().f60753a);
        }
    }

    /* renamed from: a */
    public final void mo61696a(Bundle bundle) {
        if (bundle != null) {
            this.f88283X = bundle.getString("id");
            this.f88280U = bundle.getString("aweme_id");
            this.f88281V = bundle.getString("extra_music_from");
            this.f68824F = bundle.getString("sticker_id");
            this.f88292ag = bundle.getInt("click_reason");
            this.f88293ah = bundle.getString("from_token");
            this.f88284Y = bundle.getString("partnerMusicId");
            this.f88285Z = bundle.getString("partnerName");
        }
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f88294ai != null && this.f88294ai.isShowing()) {
            this.f88294ai.dismiss();
        }
        if (this.f88308p != null) {
            this.f88308p.mo86473a(i, i2);
        }
        if (this.f88306n == 0.0f) {
            if (this.mMusicName.getVisibility() == 0) {
                this.f88306n = (float) (this.mMusicName.getBottom() - this.f68831v.getBottom());
            } else if (this.mMusicTitle.getVisibility() == 0) {
                this.f88306n = (float) (this.mMusicTitle.getBottom() - this.f68831v.getBottom());
            }
        }
        if (this.f88305m == 0.0f) {
            this.f88305m = (float) (this.mHeadLayout.getBottom() - this.f68831v.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f88306n) / (this.f88305m - this.f88306n);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f68831v.setAlpha(f2);
        if (C6399b.m19944t()) {
            this.f68830u.setAlpha(f2);
            this.mHeadLayout.setAlpha(1.0f - (f / this.f88305m));
            this.f68830u.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.f68830u.setAlpha(f2 * f2 * f2);
            this.mHeadLayout.setAlpha((float) Math.pow((double) (1.0f - (f / this.f88305m)), 3.0d));
        }
        ImageView imageView = this.mMusicianEntry;
        imageView.setAlpha(1.0f - f2);
        imageView.setClickable(imageView.getAlpha() >= 0.5f);
        if (this.f88307o && f2 < 0.1f) {
            if (this.f68825G != null) {
                this.f68825G.mo67574c();
            }
            this.f88307o = false;
        }
    }

    /* renamed from: a */
    public static void m109086a(MusicModel musicModel, String str) {
        if (musicModel != null) {
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("music_id", musicModel.getMusicId()).mo59973a("enter_from", "single_song").mo59973a("enter_method", "click_play_music").f60753a);
        }
    }

    /* renamed from: a */
    public static void m109087a(String str, boolean z, SharePackage sharePackage, Context context, Music music) {
        if (z && C6399b.m19944t() && music != null) {
            C25652b bVar = new C25652b();
            bVar.mo66536a(new C28442a());
            bVar.mo56976a(music.getMid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(2), str);
        }
    }

    /* renamed from: a */
    public final void mo83268a(MusicDetail musicDetail) {
        if (isViewValid() && musicDetail != null) {
            if (TextUtils.isEmpty(this.f88283X) || (musicDetail.music != null && !this.f88283X.equals(musicDetail.music.getMid()))) {
                this.f88283X = musicDetail.music.getMid();
                if (this.f68822D != null && this.f68822D.size() > 0) {
                    for (C26060f fVar : this.f68822D) {
                        ((DetailAwemeListFragment) fVar).f62587f = this.f88283X;
                        fVar.mo61748d();
                    }
                }
            }
            if (C6399b.m19944t()) {
                m109107f(musicDetail);
                m109098c(musicDetail);
                m109104d(musicDetail);
            } else {
                m109106e(musicDetail);
            }
            m109084a(musicDetail.music);
            m109093b(musicDetail);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86487b(List list, int i) {
        if (i >= 0 && i < list.size()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) list.get(i);
            C6907h.m21524a("click_musician_profile", (Map) C22984d.m75611a().mo59973a("author_id", musicOwnerInfo.getUid()).mo59973a("enter_from", "single_song").f60753a);
            m109085a(musicOwnerInfo);
        }
    }

    /* renamed from: a */
    public static void m109085a(MusicOwnerInfo musicOwnerInfo) {
        if (musicOwnerInfo != null && musicOwnerInfo.getUid() != null && musicOwnerInfo.getSecUid() != null) {
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_method", "click_profile").mo59973a("to_user_id", musicOwnerInfo.getUid()).mo59973a("enter_from", "single_song").f60753a);
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(musicOwnerInfo.getUid());
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", musicOwnerInfo.getSecUid()).mo18695a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86485b(View view) {
        if (!C27326a.m89578a(view)) {
            SmartRouter.buildRoute((Context) getActivity(), "aweme://music/similar").withParam("music_id", this.f88302j.getMid()).withParam("music_title", this.f88302j.getMusicName()).withParam("anthor_id", this.f88302j.getOwnerId()).withParam("enter_type", "music_detail").open();
            C6907h.m21524a("click_similar_song_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "single_song").mo59973a("music_id", this.f88302j.getMid()).mo59973a("author_id", this.f88302j.getOwnerId()).f60753a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo86484a(View view, MotionEvent motionEvent) {
        return this.f88271L.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86481a(List list, int i) {
        if (i >= 0 && i < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
            m109083a(externalMusicInfo);
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("music_from", externalMusicInfo.getPartnerName());
            C6907h.m21524a("click_copyright_music", (Map) hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86482a(List list, View view) {
        ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(0);
        m109083a(externalMusicInfo);
        HashMap hashMap = new HashMap();
        hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
        hashMap.put("music_from", externalMusicInfo.getPartnerName());
        C6907h.m21524a("click_copyright_music", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo29060a() {
        ImageView imageView = this.mMusicianEntry;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setClickable(true);
        }
    }

    /* renamed from: a */
    private void m109089a(boolean z, boolean z2, SpannableStringBuilder spannableStringBuilder) {
        if (z) {
            if (z2) {
                this.mMusicTitle.setText(this.f88291af.music.getMusicName());
                this.btnEditMusicTitle.setVisibility(8);
                return;
            }
            String ownerId = this.f88291af.music.getOwnerId();
            if (this.f88291af != null && !C6319n.m19593a(ownerId) && C6319n.m19594a(ownerId, C6861a.m21337f().getCurUserId())) {
                this.btnEditMusicTitle.setVisibility(8);
                SpannableString spannableString = new SpannableString(getResources().getString(R.string.axc));
                C33938an anVar = new C33938an(getResources().getDrawable(R.drawable.p0));
                anVar.mo86598a(C9738o.m28708b(getContext(), 8.5f));
                anVar.mo86602a(Style.FILL);
                anVar.mo86601a(getResources().getColor(R.color.a5d));
                anVar.mo86600a(C9738o.m28708b(getContext(), 4.0f), C9738o.m28708b(getContext(), 4.0f), C9738o.m28708b(getContext(), 4.0f), C9738o.m28708b(getContext(), 4.0f));
                anVar.mo86599a(C9738o.m28708b(getContext(), 4.0f), 0.0f);
                spannableString.setSpan(anVar, 0, spannableString.length(), 18);
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        if (MusicDetailFragment.this.f88302j != null) {
                            C6907h.onEvent(MobClick.obtain().setEventName("edit_title").setLabelName("song_cover").setValue(String.valueOf(MusicDetailFragment.this.f88302j.getId())));
                            C6907h.onEvent(MobClick.obtain().setEventName("original_title_click").setLabelName("original_music"));
                            Intent intent = new Intent(MusicDetailFragment.this.getActivity(), EditOriginMusicTitleActivity.class);
                            intent.putExtra("MUSIC_TITLE", String.valueOf(MusicDetailFragment.this.f88302j.getId()));
                            MusicDetailFragment.this.startActivityForResult(intent, 0);
                        }
                    }
                }, 0, spannableString.length(), 18);
                if (spannableStringBuilder != null) {
                    spannableStringBuilder.append(spannableString);
                }
                C6907h.onEvent(MobClick.obtain().setEventName("original_title_show").setLabelName("original_music").setValue(String.valueOf(this.f88302j.getId())));
            }
        }
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        if (C6399b.m19944t()) {
            m109097c(baseResponse);
        } else {
            m109092b(baseResponse);
        }
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
        if (getActivity() != null) {
            C22814a.m75244a((Context) getActivity(), (Throwable) exc);
        }
        m109074M();
        mo29173d();
    }

    /* renamed from: a */
    public final void mo67555a(int i, boolean z) {
        super.mo67555a(i, z);
        if (System.currentTimeMillis() - this.f88299an >= 1000) {
            if (z) {
                if (i == 0) {
                    C6907h.m21517a((Context) getActivity(), "slide_right", "single_song", 0, 0);
                } else if (i == 1) {
                    C6907h.m21517a((Context) getActivity(), "slide_left", "single_song", 0, 0);
                }
            }
            this.f88299an = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo86486b(MusicModel musicModel) {
        if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
            if (this.f88298am != null) {
                this.f88298am.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    StringBuilder sb = new StringBuilder("MusicDetailFragment: audition_duration is zero, music id: ");
                    sb.append(musicModel.getMusicId());
                    C42880h.m136156a(sb.toString());
                    return;
                }
                C338483 r1 = new CountDownTimer(realAuditionDuration, 1000) {
                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        MusicDetailFragment.this.mo86490f();
                    }
                };
                this.f88298am = r1;
                this.f88298am.start();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo61761b(int i) {
        if (i == 0) {
            this.f88278S = true;
        } else if (i == 1) {
            this.f88279T = true;
        }
        if (this.f88289ad == null) {
            this.f88278S = true;
        }
        if (this.f88290ae == null) {
            this.f88279T = true;
        }
        if (this.f88278S && this.f88279T) {
            m109076O();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo86480a(String str) {
        if (this.f88303k != null && !TextUtils.isEmpty(str)) {
            C6907h.onEvent(new MobClick().setEventName("share_single_song").setLabelName(str).setExtValueString(this.f88303k.getSongId()).setJsonObject(new C6909j().mo16966a("request_id", String.valueOf(this.f88289ad.mo61752l())).mo16967a()));
            if (!TextUtils.equals(str, "qr_code")) {
                C6907h.m21524a("share_music", (Map) C22984d.m75611a().mo59973a("music_id", this.f88303k.getMusicId()).mo59973a("platform", str).mo59973a("share_mode", "normal_share").f60753a);
            }
            C37984ap.m121302b().addShareRecord(str, 2);
        }
    }

    /* renamed from: a */
    public final void mo61676a(Intent intent) {
        if (TextUtils.isEmpty(this.f88297al)) {
            this.f88297al = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.f88297al);
    }

    /* renamed from: a */
    public final void mo86462a(String str, MusicModel musicModel) {
        if (musicModel.getMusic().getChallenge() != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_origin", "single_song");
        if (!(musicModel == null || musicModel.getMusicWaveBean() == null)) {
            intent.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        if ("direct_shoot".equals(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getShootWay()) && 2 == ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getMusicChooseType()) {
            intent.putExtra("extra_clear_dialog_show_needed", ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic() != null);
        }
        intent.putExtra("reverse_video_record_show_planD", true);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
        intent.putExtra("shoot_way", mo86491o());
        mo61676a(intent);
        if (!TextUtils.isEmpty(this.f68824F)) {
            intent.putStringArrayListExtra("reuse_sticker_ids", m109090b(this.f68824F));
            m109091b(intent);
        }
        C33242an.m107315a(bp_());
        intent.putExtra("translation_type", 3);
        boolean isRecording = ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording();
        FragmentActivity activity = getActivity();
        if (!isRecording || activity == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(getActivity(), intent, true, true, isRecording);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("path", str);
        intent2.putExtra("music_model", musicModel);
        intent2.putExtra("music_origin", 0);
        activity.setResult(-1, intent2);
        activity.finish();
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
        mo67561v();
        if (Math.abs(f) < Math.abs(f2) && this.f68821C) {
            if (f2 > 30.0f) {
                if (this.f68825G != null) {
                    this.f68825G.mo67575d();
                }
            } else if (f2 < -30.0f) {
                this.f88307o = true;
            }
        }
    }

    /* renamed from: M */
    private void m109074M() {
        this.f88287ab = !this.f88287ab;
    }

    /* renamed from: l */
    public final boolean mo86469l() {
        return isAdded();
    }

    /* renamed from: F */
    private void m109067F() {
        if (this.f88270K != null) {
            this.f88270K.setVisibility(8);
        }
    }

    /* renamed from: G */
    private void m109068G() {
        if (this.f88271L != null) {
            this.f88271L.setVisibility(8);
        }
    }

    /* renamed from: H */
    private void m109069H() {
        if (this.f88309q != null) {
            this.f88309q.setVisibility(8);
        }
    }

    public final void bq_() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (MusicDetailFragment.this.f88301i != null && MusicDetailFragment.this.f88301i.isShowing()) {
                    MusicDetailFragment.this.f88301i.setProgress(100);
                }
                MusicDetailFragment.this.mo86466i();
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        mo86466i();
        this.f88304l.mo105598a();
    }

    public void onPause() {
        super.onPause();
        m109075N();
        if (this.f88298am != null) {
            this.f88298am.cancel();
        }
    }

    /* renamed from: q */
    public final FragmentPagerAdapter mo61713q() {
        if (C6399b.m19944t()) {
            return m109063A();
        }
        return m109110z();
    }

    /* renamed from: y */
    private void m109109y() {
        if (!C6399b.m19944t()) {
            this.mFlStartRecord.setContentDescription(getResources().getString(R.string.e1_));
        }
    }

    /* renamed from: i */
    public final void mo86466i() {
        if (this.f88301i != null && this.f88301i.isShowing()) {
            this.f88301i.dismiss();
            this.f88301i = null;
        }
    }

    /* renamed from: k */
    public final void mo86468k() {
        this.f88301i = C41654d.m132586b(getActivity(), getString(R.string.ch6));
        this.f88301i.setIndeterminate(false);
    }

    public void onDestroyView() {
        if (this.f88298am != null) {
            this.f88298am.cancel();
        }
        super.onDestroyView();
        if (this.f88282W != null) {
            this.f88282W.mo59134U_();
        }
        this.f88304l.mo105598a();
    }

    /* renamed from: p */
    public final void mo61712p() {
        super.mo61712p();
        this.f68830u.setAlpha(0.0f);
        this.f68833x.setBackgroundColor(getResources().getColor(R.color.yc));
    }

    /* renamed from: L */
    private void m109073L() {
        if (C23338f.m76569g().mo60627a("is_need_show_collect_guide", true)) {
            if (this.f88308p == null) {
                this.f88308p = new MusicCollectGuidePopupWindow(getContext());
            }
            getLifecycle().mo55a(this.f88308p);
            this.mMusicCollectLayout.post(new C33984v(this));
            C23338f.m76569g().mo60634b("is_need_show_collect_guide", false);
        }
    }

    /* renamed from: N */
    private void m109075N() {
        if (this.f88298am != null) {
            this.f88298am.cancel();
        }
        this.f88300h = false;
        this.ivPlay.setVisibility(0);
        this.ivStop.setVisibility(8);
        this.f88304l.mo105608b();
        if (m109096b(this.f88302j)) {
            mo61678g();
            if (this.ivMusicCollect != null) {
                this.ivMusicCollect.setVisibility(8);
            }
            this.ivPlay.setVisibility(8);
        }
    }

    /* renamed from: O */
    private void m109076O() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aff, null);
        ((TextView) inflate.findViewById(R.id.e70)).setText("");
        DmtTextView d = m109102d((int) R.string.c48);
        if (this.f88289ad != null) {
            this.f88289ad.mo61739a(inflate, (View) d);
        }
        if (this.f88290ae != null) {
            this.f88290ae.mo61739a(inflate, (View) d);
        }
    }

    /* renamed from: P */
    private void m109077P() {
        if (!C6399b.m19944t() && this.f88295aj && this.f88296ak) {
            if (getActivity() != null) {
                this.f88294ai = C26051c.m85573a(this.mMusicCollectLayout, getActivity(), "music_detail", "music", this.f88283X, false);
            }
            this.f88296ak = false;
            this.f88295aj = false;
        }
    }

    /* renamed from: e */
    public final void mo29191e() {
        int i;
        if (this.mMusicCollectionText != null) {
            TextView textView = this.mMusicCollectionText;
            if (this.f88287ab) {
                i = R.string.fg;
            } else {
                i = R.string.fd;
            }
            textView.setText(i);
        }
        if (!this.f88287ab && this.f88294ai != null && this.f88294ai.isShowing()) {
            this.f88294ai.dismiss();
        }
        if (this.f88287ab) {
            this.f88295aj = true;
            m109077P();
        }
    }

    /* renamed from: j */
    public final void mo86467j() {
        C32656f.m105747a((Fragment) this, mo61693a(this.f68820B), "click_music_shoot", C42914ab.m136242a().mo104633a("login_title", C6399b.m19921a().getString(R.string.dtg)).f111445a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ void mo86495s() {
        if (getActivity() != null && !getActivity().isFinishing() && isViewValid()) {
            try {
                this.f88308p.mo86474a(this.mMusicCollectLayout);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: E */
    private void m109066E() {
        if (!TextUtils.isEmpty(this.f88283X) || TextUtils.isEmpty(this.f88284Y)) {
            this.f88282W.mo56976a(this.f88283X, Integer.valueOf(this.f88292ag), Integer.valueOf(0));
            return;
        }
        this.f88282W.mo56976a(this.f88284Y, this.f88285Z, Integer.valueOf(1));
    }

    /* renamed from: K */
    private void m109072K() {
        if (C23338f.m76569g().mo60627a("is_need_show_collect_succed_dialog", true)) {
            new C10741a(getActivity()).mo25657b((int) R.string.fi).mo25649a((int) R.string.fg).mo25650a((int) R.string.cdc, (OnClickListener) null).mo25664d(-3476230).mo25663c(R.drawable.b7f).mo25656a().mo25638b();
            C23338f.m76569g().mo60634b("is_need_show_collect_succed_dialog", false);
        }
    }

    /* renamed from: A */
    private FragmentPagerAdapter m109063A() {
        boolean z;
        this.f68822D = new ArrayList();
        this.f62485e = new ArrayList();
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f68818r);
        sb.append(0);
        this.f88289ad = (DetailAwemeListFragment) childFragmentManager.mo2644a(sb.toString());
        if (this.f88289ad == null) {
            this.f88289ad = DetailAwemeListFragment.m77807a(0, "single_song", this.f88283X, this.f88281V, new MusicDetailListProvider());
        }
        DetailAwemeListFragment detailAwemeListFragment = this.f88289ad;
        if (this.f68820B == 0) {
            z = true;
        } else {
            z = false;
        }
        detailAwemeListFragment.f62597p = z;
        this.f88289ad.f62593l = this;
        C0608j childFragmentManager2 = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f68818r);
        sb2.append(1);
        this.f88290ae = (DetailAwemeListFragment) childFragmentManager2.mo2644a(sb2.toString());
        this.f68822D.add(this.f88289ad);
        this.f62485e.add(Integer.valueOf(0));
        this.f88279T = true;
        ArrayList arrayList = new ArrayList();
        for (AmeBaseFragment add : this.f68822D) {
            arrayList.add(add);
        }
        return new ProfileFragmentAdapter(getChildFragmentManager(), arrayList, this.f62485e);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void mo86496x() {
        if (this.f88303k != null && this.ivMusicCollect != null) {
            this.f88296ak = false;
            this.f88295aj = false;
            if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88303k, getContext(), true)) {
                C6907h.m21524a("user_music_failed", (Map) C22984d.m75611a().mo59973a("previous_page", "single_song").mo59973a("action_type", "save").mo59973a("music_id", this.f88303k.getMusicId()).mo59973a("enter_from", this.f88281V).f60753a);
                return;
            }
            this.f88286aa.mo56976a(Integer.valueOf(1), this.f88303k.getMusicId(), Integer.valueOf(this.f88287ab ^ true ? 1 : 0));
            m109074M();
            this.ivMusicCollect.mo86446b();
        }
    }

    /* renamed from: J */
    private void m109071J() {
        String str;
        String str2;
        String str3;
        if (!this.f88287ab) {
            String str4 = "favourite_song";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "single_song");
            String str5 = "music_id";
            if (this.f88303k != null) {
                str3 = this.f88303k.getMusicId();
            } else {
                str3 = "";
            }
            C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).f60753a);
        } else {
            String str6 = "cancel_favourite_song";
            C22984d a2 = C22984d.m75611a().mo59973a("enter_from", "single_song");
            String str7 = "music_id";
            if (this.f88303k != null) {
                str2 = this.f88303k.getMusicId();
            } else {
                str2 = "";
            }
            C6907h.m21524a(str6, (Map) a2.mo59973a(str7, str2).f60753a);
        }
        if ((TextUtils.equals(this.f88281V, "search_result") || TextUtils.equals(this.f88281V, "general_search")) && !this.f88287ab) {
            C26801u D = C6903bc.m21463D();
            String str8 = "search_favourite";
            String str9 = "single_song";
            if (this.f88303k == null || TextUtils.isEmpty(this.f88303k.getMusicId())) {
                str = "";
            } else {
                str = this.f88303k.getMusicId();
            }
            D.mo68583a(str8, str9, str, TextUtils.equals(this.f88281V, "search_result"));
        }
    }

    /* renamed from: z */
    private FragmentPagerAdapter m109110z() {
        boolean z;
        this.f68822D = new ArrayList();
        this.f62485e = new ArrayList();
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f68818r);
        sb.append(0);
        this.f88289ad = (DetailAwemeListFragment) childFragmentManager.mo2644a(sb.toString());
        if (this.f88289ad == null) {
            this.f88289ad = DetailAwemeListFragment.m77807a(0, "single_song", this.f88283X, this.f88281V, new MusicDetailListProvider());
        }
        DetailAwemeListFragment detailAwemeListFragment = this.f88289ad;
        if (this.f68820B == 0) {
            z = true;
        } else {
            z = false;
        }
        detailAwemeListFragment.f62597p = z;
        this.f88289ad.f62593l = this;
        this.f68822D.add(this.f88289ad);
        this.f62485e.add(Integer.valueOf(0));
        if (!TextUtils.isEmpty(this.f88293ah)) {
            this.f88289ad.mo61740a((C26116k) new C33977o(this));
        }
        ArrayList arrayList = new ArrayList();
        for (AmeBaseFragment add : this.f68822D) {
            arrayList.add(add);
        }
        return new ProfileFragmentAdapter(getChildFragmentManager(), arrayList, this.f62485e);
    }

    /* renamed from: f */
    public final void mo86490f() {
        String str;
        this.f88300h = true;
        if (this.ivPlay != null) {
            this.ivPlay.setVisibility(8);
        }
        if (this.ivStop != null) {
            this.ivStop.setVisibility(0);
        }
        if (this.f88303k != null) {
            C43657a aVar = new C43657a();
            if (this.f88303k.getMusicType() == MusicType.ONLINE) {
                aVar.f112969b = 4;
            }
            if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
                aVar.f112970c = this.f88303k.getAuditionDuration().intValue();
            } else {
                aVar.f112970c = this.f88303k.getDuration();
            }
            aVar.f112968a = this.f88303k.getPath();
            this.f88304l.mo105604a(aVar);
            this.f88304l.mo105602a((C43654d) new C43654d() {
                /* renamed from: a */
                public final void mo61985a(int i, int i2) {
                    MusicDetailFragment.this.mo86486b(MusicDetailFragment.this.f88303k);
                    if (!MusicDetailFragment.this.f88300h) {
                        MusicDetailFragment.this.f88304l.mo105608b();
                    }
                    MusicDetailFragment.m109086a(MusicDetailFragment.this.f88303k, "play_music");
                }
            });
            MobClick labelName = MobClick.obtain().setEventName("music_play").setLabelName("single_song");
            C6909j jVar = new C6909j();
            String str2 = "song_id";
            if (this.f88303k != null) {
                str = this.f88303k.getMusicId();
            } else {
                str = "";
            }
            C6907h.onEvent(labelName.setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
        }
    }

    /* renamed from: B */
    private void m109064B() {
        String str;
        String str2;
        String str3;
        if (C6861a.m21337f().getCurUser().isLive()) {
            C10761a.m31409e(getContext(), (int) R.string.bvo).mo25750a();
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
            C10761a.m31409e(getContext(), (int) R.string.ig).mo25750a();
        } else if (this.f88302j == null || TextUtils.isEmpty(this.f88302j.getOwnerBanShowInfo())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("route", "1");
                jSONObject.put("group_id", this.f88280U);
            } catch (JSONException unused) {
            }
            C33242an.m107315a(bp_());
            C33242an.m107318c("click_music_publish");
            C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(this.f88283X).setJsonObject(jSONObject));
            this.f88297al = UUID.randomUUID().toString();
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f88297al).mo59973a("shoot_way", "single_song").mo59973a("music_id", this.f88283X).mo59973a("group_id", this.f88280U);
            if (C33230ac.m107230h(this.f88281V)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107232i(this.f88280U)));
            }
            C6907h.m21524a("shoot", (Map) a.f60753a);
            if (TextUtils.equals("search_result", this.f88281V) || TextUtils.equals("general_search", this.f88281V) || TextUtils.equals("search_for_you_list", this.f88281V)) {
                String str4 = "search_shoot";
                C22984d a2 = C22984d.m75611a().mo59973a("creation_id", this.f88297al).mo59973a("shoot_way", "single_song").mo59973a("music_id", this.f88283X);
                String str5 = "search_type";
                if (TextUtils.equals("general_search", this.f88281V)) {
                    str2 = "general";
                } else {
                    str2 = "music";
                }
                C22984d a3 = a2.mo59973a(str5, str2);
                String str6 = "previous_page";
                if (TextUtils.equals("general_search", this.f88281V)) {
                    str3 = "search_result";
                } else {
                    str3 = this.f88281V;
                }
                C6907h.m21524a(str4, (Map) a3.mo59973a(str6, str3).f60753a);
            }
            if (this.f88302j == null || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88302j.convertToMusicModel(), getActivity(), true)) {
                this.f88288ac.mo86626a(this.f88303k);
                return;
            }
            String str7 = "user_music_failed";
            C22984d a4 = C22984d.m75611a();
            String str8 = "previous_page";
            if (TextUtils.equals("general_search", this.f88281V)) {
                str = "search_result";
            } else {
                str = this.f88281V;
            }
            C6907h.m21524a(str7, (Map) a4.mo59973a(str8, str).mo59973a("action_type", "shoot").mo59973a("music_id", this.f88283X).mo59973a("enter_from", this.f88281V).f60753a);
        } else {
            C10761a.m31403c(getContext(), this.f88302j.getOwnerBanShowInfo()).mo25750a();
        }
    }

    /* renamed from: D */
    private void m109065D() {
        String str;
        String str2;
        String str3;
        if (C6903bc.m21484c().mo59240a()) {
            C10761a.m31410e((Context) getActivity(), getString(R.string.e5p)).mo25750a();
        } else if (C6861a.m21337f().getCurUser().isLive()) {
            C10761a.m31409e(getContext(), (int) R.string.bvo).mo25750a();
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().checkIsAlreadyPublished(getContext())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("route", "1");
                jSONObject.put("group_id", this.f88280U);
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(this.f88283X).setJsonObject(jSONObject));
            this.f88297al = UUID.randomUUID().toString();
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f88297al).mo59973a("shoot_way", "single_song").mo59973a("music_id", this.f88283X).mo59973a("impr_type", C33230ac.m107245t(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(this.f88280U))).mo59973a("group_id", this.f88280U);
            if (C33230ac.m107230h(this.f88281V)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107232i(this.f88280U)));
            }
            C6907h.m21524a("shoot", (Map) a.f60753a);
            if (TextUtils.equals("search_result", this.f88281V) || TextUtils.equals("general_search", this.f88281V) || TextUtils.equals("search_for_you_list", this.f88281V)) {
                String str4 = "search_shoot";
                C22984d a2 = C22984d.m75611a().mo59973a("creation_id", this.f88297al).mo59973a("shoot_way", "single_song").mo59973a("music_id", this.f88283X);
                String str5 = "search_type";
                if (TextUtils.equals("general_search", this.f88281V)) {
                    str2 = "general";
                } else {
                    str2 = "music";
                }
                C22984d a3 = a2.mo59973a(str5, str2);
                String str6 = "previous_page";
                if (TextUtils.equals("general_search", this.f88281V)) {
                    str3 = "search_result";
                } else {
                    str3 = this.f88281V;
                }
                C6907h.m21524a(str4, (Map) a3.mo59973a(str6, str3).f60753a);
            }
            if (this.f88303k == null || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88303k, getActivity(), true)) {
                this.f88288ac.mo86626a(this.f88303k);
                return;
            }
            String str7 = "user_music_failed";
            C22984d a4 = C22984d.m75611a();
            String str8 = "previous_page";
            if (TextUtils.equals("general_search", this.f88281V)) {
                str = "search_result";
            } else {
                str = this.f88281V;
            }
            C6907h.m21524a(str7, (Map) a4.mo59973a(str8, str).mo59973a("action_type", "shoot").mo59973a("music_id", this.f88283X).mo59973a("enter_from", this.f88281V).f60753a);
        }
    }

    /* renamed from: d */
    public final void mo29173d() {
        int i;
        if (this.ivMusicCollect != null) {
            CheckableImageView checkableImageView = this.ivMusicCollect;
            if (this.f88287ab) {
                i = R.drawable.alg;
            } else {
                i = R.drawable.ali;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo86488c(View view) {
        m109088a(true);
    }

    /* renamed from: c */
    private void m109100c(boolean z) {
        m109095b(z);
        this.mMusicianEntry.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String str = "";
                try {
                    str = C30199h.m98861a().getOrginalMusicianUrl();
                } catch (NullValueException unused) {
                }
                SmartRouter.buildRoute(MusicDetailFragment.this.getContext(), "aweme://webview/").withParam("url", str).withParam("use_webview_title", true).withParam("status_bar_color", MusicDetailFragment.this.getResources().getString(R.color.a3z).replace("#", "")).open();
            }
        });
    }

    /* renamed from: b_ */
    public final void mo83269b_(Exception exc) {
        C6921a.m21559a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.mo25934a(true);
        }
    }

    /* renamed from: b */
    private static boolean m109096b(Music music) {
        if (!C6399b.m19946v() || music == null) {
            return false;
        }
        if (music.getMusicStatus() == 0 || music.getSource() == 78) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m109101c(Music music) {
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static void m109103d(Music music) {
        if (music != null) {
            C6893q.m21452b("music_name_empty", "", C6869c.m21381a().mo16886a("music_id", Long.valueOf(music.getId())).mo16888b());
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/music/detail/?")) {
            C42961az.m136385f(aVar);
            m109088a(true);
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("music", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.mHeadLayout, shareCompleteEvent);
        }
    }

    /* renamed from: b */
    private static ArrayList<String> m109090b(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m109098c(MusicDetail musicDetail) {
        if (musicDetail == null || musicDetail.music == null || musicDetail.music.getMusicOwnerInfos() == null) {
            m109067F();
            return;
        }
        List musicOwnerInfos = musicDetail.music.getMusicOwnerInfos();
        if (C6307b.m19566a((Collection<T>) musicOwnerInfos)) {
            m109067F();
            return;
        }
        List a = m109081a(musicOwnerInfos);
        if (C6307b.m19566a((Collection<T>) a)) {
            m109067F();
        } else {
            m109094b(a);
        }
    }

    /* renamed from: d */
    private DmtTextView m109102d(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(R.string.c48);
        return dmtTextView;
    }

    /* renamed from: a */
    private SpannableStringBuilder m109078a(SpannableStringBuilder spannableStringBuilder) {
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.ad9);
        drawable.setBounds(0, 0, (int) C9738o.m28708b(getContext(), 20.0f), (int) C9738o.m28708b(getContext(), 20.0f));
        C33946c cVar = new C33946c(getContext(), drawable, 2);
        SpannableStringBuilder append = new SpannableStringBuilder().append(" ", 0, 1);
        append.setSpan(cVar, 0, 1, 17);
        append.append(spannableStringBuilder);
        return append;
    }

    /* renamed from: b */
    private void m109091b(Intent intent) {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isOpenMusicRecordWithSticker()) {
            ArrayList b = m109090b(this.f68824F);
            if (!b.isEmpty()) {
                intent.putExtra("music_reuse_sticker_id", (String) b.get(0));
            }
        }
    }

    /* renamed from: d */
    private void m109104d(MusicDetail musicDetail) {
        if (musicDetail == null || musicDetail.music == null || musicDetail.music.isOriginMusic() || !C6307b.m19566a((Collection<T>) musicDetail.music.getMusicOwnerInfos()) || musicDetail.mSimilarMusicList == null) {
            m109068G();
            return;
        }
        List<SimilarMusicInfo> list = musicDetail.mSimilarMusicList;
        if (list == null || C6307b.m19566a((Collection<T>) list) || list.size() != 3) {
            m109068G();
        } else {
            m109099c(list);
        }
    }

    /* renamed from: c */
    public final void mo67558c(int i) {
        super.mo67558c(i);
        if (i == 0) {
            C6907h.m21517a((Context) getActivity(), "click_hot", "single_song", 0, 0);
            return;
        }
        if (i == 1) {
            C6907h.m21517a((Context) getActivity(), "click_fresh", "single_song", 0, 0);
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (anVar.f74631a == 2) {
            String str = (String) anVar.f74632b;
            if (isViewValid() && this.f88291af != null && !TextUtils.isEmpty(str)) {
                Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                if (!(awemeById == null || awemeById.getMusic() == null || awemeById.getMusic().getId() != this.f88291af.music.getId())) {
                    int userCount = this.f88291af.music.getUserCount();
                    if (userCount > 0) {
                        this.f88291af.music.setUserCount(userCount - 1);
                        mo83268a(this.f88291af);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m109092b(BaseResponse baseResponse) {
        String str;
        String str2;
        if (this.f88287ab) {
            this.f88303k.setCollectionType(CollectionType.COLLECTED);
            this.f88302j.setCollectStatus(1);
            C33769d dVar = new C33769d(1, this.f88303k);
            dVar.f88126c = "music_detail";
            C42961az.m136380a(dVar);
            MobClick labelName = MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song");
            if (this.f88303k != null) {
                str2 = this.f88303k.getMusicId();
            } else {
                str2 = "";
            }
            C6907h.onEvent(labelName.setValue(str2).setExtValueLong(0));
            this.f88296ak = true;
            m109077P();
            return;
        }
        this.f88303k.setCollectionType(CollectionType.NOT_COLLECTED);
        this.f88302j.setCollectStatus(0);
        C33769d dVar2 = new C33769d(0, this.f88303k);
        dVar2.f88126c = "music_detail";
        C42961az.m136380a(dVar2);
        MobClick labelName2 = MobClick.obtain().setEventName("collection_music").setLabelName("single_song");
        if (this.f88303k != null) {
            str = this.f88303k.getMusicId();
        } else {
            str = "";
        }
        C6907h.onEvent(labelName2.setValue(str).setExtValueLong(0));
    }

    /* renamed from: c */
    private void m109097c(BaseResponse baseResponse) {
        if (this.f88287ab) {
            this.f88303k.setCollectionType(CollectionType.COLLECTED);
            this.f88302j.setCollectStatus(1);
            C33769d dVar = new C33769d(1, this.f88303k);
            dVar.f88126c = "music_detail";
            C42961az.m136380a(dVar);
            m109072K();
            C6907h.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(this.f88303k.getMusicId())).setExtValueLong(0));
            return;
        }
        this.f88303k.setCollectionType(CollectionType.NOT_COLLECTED);
        this.f88302j.setCollectStatus(0);
        C33769d dVar2 = new C33769d(0, this.f88303k);
        dVar2.f88126c = "music_detail";
        C42961az.m136380a(dVar2);
        C6907h.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(this.f88303k.getMusicId())).setExtValueLong(0));
    }

    /* renamed from: d */
    private void m109105d(List<ExternalMusicInfo> list) {
        if (this.f88309q == null) {
            if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).getIsUseMusicPartnersNewStyle()) {
                this.f88309q = (ViewGroup) this.mVsThirdMusicNewStyle.inflate();
                Collections.reverse(list);
            } else {
                this.f88309q = (ViewGroup) this.mVsThirdMusic.inflate();
            }
        }
        if (this.f88272M == null) {
            this.f88272M = (RecyclerView) this.f88309q.findViewById(R.id.dip);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 0, false);
            if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).getIsUseMusicPartnersNewStyle()) {
                wrapLinearLayoutManager.mo5428b(true);
            } else {
                this.f88272M.mo5525a((C1272h) new ThirdMusicItemDecoration());
            }
            this.f88272M.setLayoutManager(wrapLinearLayoutManager);
            this.f88275P = new ThirdMusicCoverAdapter();
            this.f88275P.f88069a = new C33982t(this, list);
            if (list.size() == 1) {
                this.f88309q.setClickable(true);
                this.f88309q.setOnClickListener(new C33983u(this, list));
            }
            this.f88275P.mo66516d(false);
            this.f88272M.setAdapter(this.f88275P);
        }
        if (this.f88275P != null) {
            this.f88275P.mo58045a(list);
        }
        for (ExternalMusicInfo externalMusicInfo : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("music_from", externalMusicInfo.getPartnerName());
            C6907h.m21524a("show_copyright_music", (Map) hashMap);
        }
        this.f88309q.setVisibility(0);
    }

    /* renamed from: g */
    private void m109108g(MusicDetail musicDetail) {
        String str;
        int i;
        int i2;
        Music music = musicDetail.music;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<RelatedChallengeMusic> list = musicDetail.relatedChallengeMusicList;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) list.get(i3);
            if (relatedChallengeMusic.categoryType == 1) {
                Music music2 = relatedChallengeMusic.music;
                if (music2 != null) {
                    sb.append(music2.getMid());
                    sb.append(",");
                }
            } else if (relatedChallengeMusic.categoryType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (music != null) {
                    sb2.append(challenge.getCid());
                    sb2.append(",");
                }
            }
        }
        String str2 = "0";
        if (TextUtils.equals(this.f88281V, "from_related_tag")) {
            str = this.f88283X;
            str2 = "1";
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str2);
            jSONObject.put("enter_from", str);
            JSONObject jSONObject2 = new JSONObject();
            String str3 = "music";
            String sb3 = sb.toString();
            if (sb.length() > 0) {
                i = sb.length() - 1;
            } else {
                i = 0;
            }
            jSONObject2.put(str3, sb3.substring(0, i));
            String str4 = "challenge";
            String sb4 = sb2.toString();
            if (sb2.length() > 0) {
                i2 = sb2.length() - 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put(str4, sb4.substring(0, i2));
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.f88283X).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    private static List<MusicOwnerInfo> m109081a(List<MusicOwnerInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (MusicOwnerInfo musicOwnerInfo : list) {
                if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                    arrayList.add(musicOwnerInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m109093b(MusicDetail musicDetail) {
        if (musicDetail == null || musicDetail.music == null || musicDetail.music.getExternalMusicInfos() == null) {
            m109069H();
            return;
        }
        List<ExternalMusicInfo> externalMusicInfos = musicDetail.music.getExternalMusicInfos();
        if (C6307b.m19566a((Collection<T>) externalMusicInfos)) {
            m109069H();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) externalMusicInfos)) {
            for (ExternalMusicInfo externalMusicInfo : externalMusicInfos) {
                if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl()) && !TextUtils.isEmpty(externalMusicInfo.getPartnerName()) && !C6307b.m19566a((Collection<T>) ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getMusicCoverUrl(externalMusicInfo.getPartnerName()))) {
                    arrayList.add(externalMusicInfo);
                }
            }
        }
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            m109069H();
        } else {
            m109105d((List<ExternalMusicInfo>) arrayList);
        }
    }

    /* renamed from: c */
    private void m109099c(List<SimilarMusicInfo> list) {
        if (this.f88271L == null) {
            this.f88271L = (ViewGroup) this.mVsSimilarMusic.inflate();
            this.f88271L.setOnClickListener(new C33980r(this));
        }
        if (this.f88274O == null) {
            this.f88274O = (RecyclerView) this.f88271L.findViewById(R.id.d6v);
            this.f88274O.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
            this.f88274O.mo5525a((C1272h) new SimilarMusicCoverDecoration());
            this.f88277R = new SimilarMusicCoverAdapter();
            this.f88277R.mo66516d(false);
            this.f88274O.setAdapter(this.f88277R);
            this.f88274O.setOnTouchListener(new C33981s(this));
        }
        if (this.f88277R != null) {
            this.f88277R.mo58045a(list);
        }
        this.f88271L.setVisibility(0);
        C6907h.m21524a("show_similar_song_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "single_song").mo59973a("music_id", this.f88302j.getMid()).mo59973a("author_id", this.f88302j.getOwnerId()).f60753a);
    }

    /* renamed from: a */
    private void m109083a(ExternalMusicInfo externalMusicInfo) {
        C6907h.m21524a("click_listen_complete_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "single_song").mo59973a("music_id", this.f88283X).f60753a);
        if (externalMusicInfo != null && !TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) {
            SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam("url", externalMusicInfo.getJumpUrl()).withParam("hide_nav_bar", false).withParam("use_webview_title", true).withParam("bundle_forbidden_jump", true).open();
        }
    }

    /* renamed from: b */
    private void m109094b(List<MusicOwnerInfo> list) {
        if (this.f88270K == null) {
            this.f88270K = (ViewGroup) this.mVsMusicOwner.inflate();
        }
        if (this.f88273N == null) {
            this.f88273N = (RecyclerView) this.f88270K.findViewById(R.id.c1q);
            this.f88273N.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
                /* renamed from: f */
                public final boolean mo5441f() {
                    return false;
                }
            });
            RecyclerView recyclerView = this.f88273N;
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a4l), (int) C9738o.m28708b((Context) getActivity(), 0.5f), 1, C9738o.m28708b((Context) getActivity(), 16.0f), C9738o.m28708b((Context) getActivity(), 16.0f));
            recyclerView.mo5525a((C1272h) dividerItemDecoration);
            this.f88276Q = new MusicOwnerAdapter();
            this.f88276Q.f88018a = new C33979q(this, list);
            this.f88276Q.mo66516d(false);
            this.f88273N.setAdapter(this.f88276Q);
        }
        if (this.f88276Q != null) {
            this.f88276Q.mo58045a(list);
        }
        this.f88270K.setVisibility(0);
    }

    /* renamed from: e */
    private void m109106e(MusicDetail musicDetail) {
        if (musicDetail == null || musicDetail.music == null) {
            this.mStatusView.mo25938c(false);
            return;
        }
        this.mStatusView.mo25938c(true);
        this.f88291af = musicDetail;
        Music music = musicDetail.music;
        this.f88302j = music;
        boolean isOriginMusic = music.isOriginMusic();
        m109100c(isOriginMusic);
        if (isOriginMusic) {
            this.mMusicTitle.setText(m109078a(m109079a(music, new SpannableStringBuilder(music.getMusicName()))));
            this.mMusicTitle.setHighlightColor(getResources().getColor(R.color.ac4));
            this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
            this.mNickName.setText(music.getAuthorName());
            this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.a2z), null);
            this.mPlaceHolder.setText(R.string.crj);
            this.mMusicName.setClickable(true);
            this.mMusicName.setVisibility(0);
        } else {
            boolean z = !TextUtils.isEmpty(music.getOwnerId());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z) {
                String musicName = music.getMusicName();
                if (!TextUtils.isEmpty(musicName) && musicName.startsWith("@")) {
                    musicName = musicName.substring(1);
                }
                spannableStringBuilder.append(musicName);
                this.mNickName.setText(music.getOwnerNickName());
                this.mPlaceHolder.setText(R.string.crh);
                this.mMusicName.setVisibility(0);
                this.mMusicName.setClickable(true);
                this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.a2z), null);
            } else {
                if (!TextUtils.isEmpty(music.getMusicName())) {
                    spannableStringBuilder.append(music.getMusicName());
                }
                this.mMusicTitle.setClickable(true);
                this.mNickName.setText(music.getAuthorName());
                this.mMusicName.setVisibility(0);
            }
            SpannableStringBuilder a = m109079a(music, spannableStringBuilder);
            m109089a(z, m109101c(music), a);
            this.mMusicTitle.setHighlightColor(getResources().getColor(R.color.ac4));
            this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
            this.mMusicTitle.setText(a);
        }
        this.f68830u.setText(music.getMusicName());
        String a2 = C30537o.m99738a((long) music.getUserCount());
        TextView textView = this.mMusicUsedCount;
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(" ");
        textView.setText(sb.toString());
        if (C6307b.m19566a((Collection<T>) musicDetail.relatedChallengeMusicList)) {
            this.tagLayout.setVisibility(8);
        } else {
            m109108g(musicDetail);
            this.txtElse.setVisibility(0);
            this.tagLayout.setVisibility(0);
            MusicDetailRelatedAdapter musicDetailRelatedAdapter = new MusicDetailRelatedAdapter(musicDetail.relatedChallengeMusicList, getContext());
            musicDetailRelatedAdapter.f87981d = "music_page";
            musicDetailRelatedAdapter.f87979b = this.f88283X;
            RecyclerView recyclerView = this.recyclerTag;
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a6c), (int) C9738o.m28708b((Context) getActivity(), 4.0f), 0, C9738o.m28708b((Context) getActivity(), 0.0f), C9738o.m28708b((Context) getActivity(), 0.0f), false);
            recyclerView.mo5525a((C1272h) dividerItemDecoration);
            this.recyclerTag.setHasFixedSize(true);
            this.recyclerTag.setLayoutManager(new WrapLinearLayoutManager(getActivity(), 0, false));
            this.recyclerTag.setAdapter(musicDetailRelatedAdapter);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.tagMask.getLayoutParams();
        layoutParams.height = this.recyclerTag.getHeight();
        this.tagMask.setLayoutParams(layoutParams);
        m109082a(this.mMusicCover, music.getCoverMedium(), C43012cg.m136513a(302));
        m109082a(this.mBgCover, music.getCoverLarge(), C43012cg.m136513a(303));
        this.f88303k = this.f88302j.convertToMusicModel();
        if (this.f88303k.getCollectionType() != null) {
            this.f88287ab = CollectionType.COLLECTED.equals(this.f88303k.getCollectionType());
        }
        mo29173d();
        mo29191e();
    }

    /* renamed from: f */
    private void m109107f(MusicDetail musicDetail) {
        SpannableStringBuilder spannableStringBuilder;
        if (musicDetail == null || musicDetail.music == null) {
            this.mStatusView.mo25938c(false);
            return;
        }
        this.mStatusView.mo25938c(true);
        this.f88291af = musicDetail;
        final Music music = musicDetail.music;
        this.f88302j = music;
        boolean isOriginMusic = music.isOriginMusic();
        m109100c(isOriginMusic);
        List a = m109081a(music.getMusicOwnerInfos());
        if (a.size() > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) a.get(0);
            spannableStringBuilder.append(musicOwnerInfo.getNickName());
            spannableStringBuilder.setSpan(new C33855a(musicOwnerInfo), 0, spannableStringBuilder.length(), 33);
            for (int i = 1; i < a.size(); i++) {
                spannableStringBuilder.append(", ");
                int length = spannableStringBuilder.length();
                MusicOwnerInfo musicOwnerInfo2 = (MusicOwnerInfo) a.get(i);
                spannableStringBuilder.append(musicOwnerInfo2.getNickName());
                spannableStringBuilder.setSpan(new C33855a(musicOwnerInfo2), length, spannableStringBuilder.length(), 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        if (isOriginMusic) {
            StringBuilder sb = new StringBuilder();
            sb.append(music.getMusicName());
            sb.append(" ");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
            this.mMusicTitle.setText(spannableStringBuilder2);
            this.mMusicTitle.setHighlightColor(getResources().getColor(R.color.ac4));
            this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
            this.mMusicTitle.setText(m109078a(spannableStringBuilder2));
            if (spannableStringBuilder != null) {
                spannableStringBuilder.append(", ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append(music.getAuthorName());
                spannableStringBuilder.setSpan(new C33855a() {
                    public final void onClick(View view) {
                        if (!C27326a.m89578a(view) && music != null && !TextUtils.isEmpty(music.getOwnerId())) {
                            C7195s a = C7195s.m22438a();
                            StringBuilder sb = new StringBuilder("aweme://user/profile/");
                            sb.append(music.getOwnerId());
                            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", music.getSecUid()).mo18695a());
                        }
                    }
                }, length2, spannableStringBuilder.length(), 33);
                this.mNickName.setText(spannableStringBuilder);
                this.mNickName.setOnTouchListener(new C33856b());
                this.mMusicName.setClickable(false);
            } else {
                this.mNickName.setText(music.getAuthorName());
                this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.a2z), null);
                this.mMusicName.setClickable(true);
            }
            this.mPlaceHolder.setText(R.string.crj);
            this.mMusicName.setVisibility(0);
        } else {
            boolean z = !TextUtils.isEmpty(music.getOwnerId());
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            if (z) {
                String musicName = music.getMusicName();
                if (musicName.startsWith("@")) {
                    musicName = musicName.substring(1);
                }
                spannableStringBuilder3.append(musicName);
                this.mNickName.setText(music.getOwnerNickName());
                this.mPlaceHolder.setText(R.string.crh);
                this.mMusicName.setVisibility(0);
                this.mMusicName.setClickable(true);
                if (C6399b.m19944t()) {
                    this.mMusicTitle.setHighlightColor(getResources().getColor(R.color.ac4));
                    this.mMusicTitle.setMovementMethod(LinkMovementMethod.getInstance());
                }
                this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(R.drawable.a2z), null);
            } else {
                String musicName2 = music.getMusicName();
                if (TextUtils.isEmpty(musicName2)) {
                    m109103d(music);
                } else {
                    spannableStringBuilder3.append(musicName2);
                }
                this.mMusicTitle.setClickable(true);
                if (spannableStringBuilder != null) {
                    this.mNickName.setText(spannableStringBuilder);
                    this.mNickName.setOnTouchListener(new C33856b());
                    if (a.size() == 1) {
                        Drawable drawable = getResources().getDrawable(R.drawable.a2z);
                        if (VERSION.SDK_INT >= 19) {
                            drawable.setAutoMirrored(true);
                        }
                        if (VERSION.SDK_INT >= 17) {
                            this.mNickName.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawable, null);
                        } else {
                            this.mNickName.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
                        }
                    }
                } else {
                    this.mNickName.setText(music.getAuthorName());
                }
                this.mMusicName.setVisibility(0);
            }
            m109089a(z, m109101c(music), spannableStringBuilder3);
            this.mMusicTitle.setText(spannableStringBuilder3);
        }
        this.f68830u.setText(music.getMusicName());
        String a2 = C30537o.m99738a((long) music.getUserCount());
        TextView textView = this.mMusicUsedCount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a2);
        sb2.append(" ");
        textView.setText(sb2.toString());
        if (C6307b.m19566a((Collection<T>) musicDetail.relatedChallengeMusicList)) {
            this.tagLayout.setVisibility(8);
        } else {
            m109108g(musicDetail);
            this.txtElse.setVisibility(0);
            this.tagLayout.setVisibility(0);
            MusicDetailRelatedAdapter musicDetailRelatedAdapter = new MusicDetailRelatedAdapter(musicDetail.relatedChallengeMusicList, getContext());
            musicDetailRelatedAdapter.f87981d = "music_page";
            musicDetailRelatedAdapter.f87979b = this.f88283X;
            RecyclerView recyclerView = this.recyclerTag;
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a6c), (int) C9738o.m28708b((Context) getActivity(), 4.0f), 0, C9738o.m28708b((Context) getActivity(), 0.0f), C9738o.m28708b((Context) getActivity(), 0.0f), false);
            recyclerView.mo5525a((C1272h) dividerItemDecoration);
            this.recyclerTag.setHasFixedSize(true);
            this.recyclerTag.setLayoutManager(new WrapLinearLayoutManager(getActivity(), 0, false));
            this.recyclerTag.setAdapter(musicDetailRelatedAdapter);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.tagMask.getLayoutParams();
        layoutParams.height = this.recyclerTag.getHeight();
        this.tagMask.setLayoutParams(layoutParams);
        m109082a(this.mMusicCover, music.getCoverMedium(), C43012cg.m136513a(302));
        this.mBgCover.setVisibility(8);
        this.f88303k = this.f88302j.convertToMusicModel();
        if (this.f88303k.getCollectionType() != null) {
            this.f88287ab = CollectionType.COLLECTED.equals(this.f88303k.getCollectionType());
        }
        mo29173d();
        mo29191e();
        m109073L();
        if (m109096b(music)) {
            mo61678g();
            if (this.ivMusicCollect != null) {
                this.ivMusicCollect.setVisibility(8);
            }
            this.ivPlay.setVisibility(8);
        }
    }

    public void click(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (id != R.id.da5) {
            List list = null;
            if (id == R.id.bs1) {
                m109071J();
                if (!C6861a.m21337f().isLogin()) {
                    C32656f.m105748a((Fragment) this, "single_song", "click_favorite_music", (Bundle) null, (C23305g) new C33978p(this));
                } else {
                    mo86496x();
                }
            } else {
                if (id == R.id.d4t) {
                    if (this.f88302j != null) {
                        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88302j.convertToMusicModel(), getContext(), true)) {
                            C6907h.m21524a("user_music_failed", (Map) C22984d.m75611a().mo59973a("previous_page", "music_hot").mo59973a("action_type", "share").mo59973a("music_id", this.f88302j.getMid()).mo59973a("enter_from", this.f88281V).f60753a);
                            return;
                        }
                        C6907h.m21518a(getActivity().getApplicationContext(), "click_share_button", "music_hot", this.f88302j.getMid(), 0);
                        if (C6399b.m19944t()) {
                            new C33267i().mo85268d("music_hot").mo85269e("music_hot").mo85274j(this.f88280U).mo85252e();
                        }
                    }
                    ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("share");
                    if (!(this.f88302j == null || this.f88302j.getShareInfo() == null)) {
                        if (this.f88289ad != null) {
                            list = this.f88289ad.mo61754n();
                        }
                        C37984ap.m121301a().shareMusic(getActivity(), this.f88302j, new C38388e() {
                            /* renamed from: a */
                            public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                                if (C38162d.m121918a(fVar)) {
                                    MusicDetailFragment.this.mo86480a(fVar.mo95715b());
                                    MusicDetailFragment.m109087a(fVar.mo95715b(), true, sharePackage, context, MusicDetailFragment.this.f88302j);
                                }
                            }

                            /* renamed from: a */
                            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                                MusicDetailFragment.this.mo86480a(bVar.mo95739b());
                                MusicDetailFragment.m109087a(bVar.mo95739b(), z, sharePackage, context, MusicDetailFragment.this.f88302j);
                            }
                        }, list);
                    }
                } else if (id == R.id.c1t) {
                    if (this.f88302j == null || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88302j.convertToMusicModel(), getActivity(), true)) {
                        mo86490f();
                    } else {
                        C6907h.m21524a("user_music_failed", (Map) C22984d.m75611a().mo59973a("previous_page", "music_hot").mo59973a("action_type", "play").mo59973a("music_id", this.f88302j.getMid()).mo59973a("enter_from", this.f88281V).f60753a);
                    }
                } else if (id == R.id.c1z) {
                    m109075N();
                } else if (id == R.id.c1j && !C27326a.m89578a(view) && this.f88303k != null && this.f88303k.getMusic() != null && !TextUtils.isEmpty(this.f88303k.getMusic().getOwnerId())) {
                    SmartRouter.buildRoute(getContext(), "aweme://user/profile/").withParam("id", this.f88303k.getMusic().getOwnerId()).withParam("sec_user_id", this.f88303k.getMusic().getSecUid()).withParam("enter_from", "music_detail").open();
                }
            }
        } else if (this.f88302j != null && !((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f88302j.convertToMusicModel(), getActivity(), true)) {
            String str2 = "user_music_failed";
            C22984d a = C22984d.m75611a();
            String str3 = "previous_page";
            if (TextUtils.equals("general_search", this.f88281V)) {
                str = "search_result";
            } else {
                str = this.f88281V;
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("action_type", "shoot").mo59973a("music_id", this.f88283X).mo59973a("enter_from", this.f88281V).f60753a);
        } else if (C6399b.m19944t()) {
            m109064B();
        } else {
            m109065D();
        }
    }

    /* renamed from: a */
    private void m109084a(final Music music) {
        if (music == null || !music.isOriginMusic()) {
            if (this.f88269J != null) {
                this.f88269J.setVisibility(8);
            }
            return;
        }
        if (this.f88269J == null) {
            this.f88269J = (ViewGroup) this.mVsOriginalMusic.inflate();
        }
        ViewGroup.LayoutParams layoutParams = this.f88269J.getLayoutParams();
        layoutParams.height = (int) C9738o.m28708b(getContext(), 64.0f);
        this.f88269J.setLayoutParams(layoutParams);
        this.f88269J.setOnTouchListener(new C33936al() {
            /* renamed from: b */
            public final void mo86504b(View view, MotionEvent motionEvent) {
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(music.getOwnerId());
                a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", music.getSecUid()).mo18695a());
            }
        });
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) this.f88269J.findViewById(R.id.b9u);
        avatarImageWithVerify.setPlaceHolder(R.color.ee);
        avatarImageWithVerify.mo60895a(music.getAvatarThumb(), 2);
        TextView textView = (TextView) this.f88269J.findViewById(R.id.dqn);
        if (C6399b.m19944t()) {
            textView.getPaint().setFakeBoldText(true);
        }
        textView.setText(music.getAuthorName());
        if (C6399b.m19944t()) {
            avatarImageWithVerify.mo60896b();
            C43126fg.m136801a(getContext(), "2", "", textView);
        }
        this.f88269J.setVisibility(0);
    }

    /* renamed from: b */
    private void m109095b(boolean z) {
        boolean z2;
        int i = 0;
        try {
            z2 = C30199h.m98861a().getOriginalMusicianEntry().booleanValue();
        } catch (NullValueException unused) {
            z2 = false;
        }
        if (z2) {
            try {
                i = C30199h.m98861a().getMusicianShowType().intValue();
            } catch (NullValueException unused2) {
            }
            if (i == 1 || z) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        MusicDetailFragment.this.mo29060a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo61695a(int i, int i2) {
        super.mo61695a(i, i2);
    }

    /* renamed from: a_ */
    public final void mo86463a_(int i, int i2) {
        if (this.f88301i != null) {
            if (i > i2) {
                this.f88301i.setProgress(i2);
            } else {
                this.f88301i.setProgress(i);
            }
            if (i >= 98 && this.f88301i != null) {
                this.f88301i.setCancelable(true);
            }
        }
    }

    /* renamed from: a */
    private SpannableStringBuilder m109079a(Music music, SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        String str;
        int i;
        try {
            z = C30199h.m98861a().getHotsearchSwitchs().getHotsearchMusicBillboardSwitch().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (C26656d.m87587a() && z && music.getBillboardRank() > 0 && music.getBillboardRank() <= 30) {
            if (!C26656d.m87588b() && music.getBillboardType() > 0) {
                return spannableStringBuilder;
            }
            if (music.getBillboardType() <= 0 || music.getWeeklyBillInfo() == null) {
                str = getString(R.string.chj);
            } else {
                str = C1642a.m8034a(getString(R.string.chk), new Object[]{Integer.valueOf(music.getWeeklyBillInfo().getEditionNo())});
            }
            C30361a aVar = new C30361a(music.getBillboardRank(), str, 4);
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    C6907h.m21524a("enter_music_leaderboard", (Map) C22984d.m75611a().mo59973a("enter_from", "single_song").mo59970a("scene_id", 1001).f60753a);
                    String str = "aweme://search/trending?type=2";
                    if (MusicDetailFragment.this.f88302j.getBillboardType() != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("&edition_uid=");
                        sb.append(MusicDetailFragment.this.f88302j.getWeeklyBillInfo().getUid());
                        str = sb.toString();
                    }
                    SmartRouter.buildRoute(MusicDetailFragment.this.getContext(), str).open();
                }
            }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
            if (getContext() != null) {
                float textSize = this.mMusicTitle.getTextSize();
                int size = aVar.getSize(this.mMusicTitle.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), this.mMusicTitle.getPaint().getFontMetricsInt());
                this.mMusicTitle.getPaint().setTextSize(textSize);
                i = size;
            } else {
                i = 144;
            }
            spannableStringBuilder = C30357c.m99184a(spannableStringBuilder, this.mMusicTitle.getPaint(), this.mMusicTitle.getMeasuredWidth(), this.mMusicTitle.getMaxLines(), 1, i);
        }
        return spannableStringBuilder;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!C34016w.m109544a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        }
        if (!TextUtils.isEmpty(this.f88283X) || !TextUtils.isEmpty(this.f88284Y)) {
            this.f88288ac = new C33963h(this.f62486f, getActivity(), this);
            this.f88304l = new C43656b();
            this.f88282W = new C33820o();
            this.f88282W.mo66537a(this);
            this.f88286aa = new C27743a();
            this.f88286aa.mo66537a(this);
            this.f88286aa.f73180e = "single_song";
            this.ivMusicCollect.setOnStateChangeListener(new C33833a() {
                /* renamed from: a */
                public final void mo61810a() {
                }

                /* renamed from: a */
                public final void mo61811a(int i) {
                    if (i == 1) {
                        MusicDetailFragment.this.mo29173d();
                        MusicDetailFragment.this.mo29191e();
                    }
                }
            });
            this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25964b(new C10806a(getContext()).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new C33976n(this)).f29135a));
            m109088a(false);
            m109109y();
            BusinessComponentServiceUtils.getLabService().mo91800a();
            return;
        }
        getActivity().finish();
    }

    /* renamed from: a */
    private static void m109082a(SmartImageView smartImageView, UrlModel urlModel, int[] iArr) {
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29853b(iArr).mo29845a("MusicDetailFragment").mo29844a((C12128i) smartImageView).mo29848a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null && this.f88302j != null) {
            this.f88302j.setMusicName(intent.getStringExtra("MUSIC_TITLE"));
            m109089a(true, true, (SpannableStringBuilder) null);
        }
    }

    /* renamed from: a */
    public static MusicDetailFragment m109080a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        Bundle bundle = new Bundle(3);
        bundle.putString("id", str);
        bundle.putString("partnerName", str7);
        bundle.putString("partnerMusicId", str6);
        bundle.putString("aweme_id", str2);
        bundle.putString("sticker_id", str4);
        bundle.putString("extra_music_from", str3);
        bundle.putInt("click_reason", i);
        bundle.putString("from_token", str5);
        MusicDetailFragment musicDetailFragment = new MusicDetailFragment();
        musicDetailFragment.setArguments(bundle);
        return musicDetailFragment;
    }
}
