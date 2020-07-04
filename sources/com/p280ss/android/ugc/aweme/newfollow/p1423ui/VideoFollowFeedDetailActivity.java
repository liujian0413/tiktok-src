package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.DragView;
import com.p280ss.android.ugc.aweme.common.widget.DragView.C25731b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29365a;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.newfollow.C34118b.C34119a;
import com.p280ss.android.ugc.aweme.newfollow.C34118b.C34120b;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34135h;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.C40727a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1608a.C40712b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.p280ss.android.ugc.aweme.sticker.C41849d;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41844c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity */
public class VideoFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<FollowFeedVideoContent> implements OnClickListener, C34120b, C40724f {

    /* renamed from: l */
    public C34135h f89063l;

    /* renamed from: m */
    public boolean f89064m;
    ViewGroup mAdDownloadButton;
    ImageView mAdDownloadButtonDetail;
    TextView mAdDownloadButtonPercent;
    TextView mAdDownloadButtonSize;
    ViewGroup mInteractStickers;
    ImageView mIvMusicIcon;
    ImageView mIvPause;
    ImageView mIvPlay;
    ImageView mLoadingView;
    ViewGroup mMusicLayout;
    ViewGroup mMusicTitleLayout;
    MarqueeView mMusicTitleView;
    ViewGroup mPlayStatusLayout;
    TextView mTvMusicOriginal;

    /* renamed from: n */
    public boolean f89065n;

    /* renamed from: o */
    public boolean f89066o;

    /* renamed from: p */
    private InteractStickerWidget f89067p;

    /* renamed from: q */
    private long f89068q = -1;

    /* renamed from: r */
    private C34166c f89069r = new C34166c();

    /* renamed from: s */
    private C34164b f89070s = new C34164b();

    /* renamed from: t */
    private RotateAnimation f89071t;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$a */
    class C34163a implements C25731b {
        private C34163a() {
        }

        /* renamed from: a */
        public final void mo66670a(float f, float f2, float f3, float f4) {
            LayoutParams layoutParams = (LayoutParams) VideoFollowFeedDetailActivity.this.mInteractStickers.getLayoutParams();
            int i = (int) f;
            layoutParams.width = i;
            int i2 = (int) f2;
            layoutParams.height = i2;
            layoutParams.setMargins((int) f3, (int) f4, 0, 0);
            VideoFollowFeedDetailActivity.this.mInteractStickers.setLayoutParams(layoutParams);
            VideoFollowFeedDetailActivity.this.mo86887b(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$b */
    class C34164b implements C41841a {
        private C34164b() {
        }

        /* renamed from: a */
        public final void mo71721a(int i, MotionEvent motionEvent) {
            VideoFollowFeedDetailActivity.this.f89066o = true;
            VideoFollowFeedDetailActivity.this.f89064m = true;
        }

        /* renamed from: a */
        public final void mo71723a(int i, final boolean z) {
            VideoFollowFeedDetailActivity.this.f88999f.postDelayed(new Runnable() {
                public final void run() {
                    VideoFollowFeedDetailActivity.this.f89065n = z;
                }
            }, (long) ViewConfiguration.getDoubleTapTimeout());
        }

        /* renamed from: a */
        public final void mo71722a(int i, View view, float f, float f2, InteractStickerStruct interactStickerStruct, boolean z) {
            if (z) {
                VideoFollowFeedDetailActivity.this.f89063l.mo86816c();
            } else {
                VideoFollowFeedDetailActivity.this.f89063l.mo86815b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$c */
    class C34166c implements C41844c {

        /* renamed from: b */
        private boolean f89077b;

        /* renamed from: a */
        public final void mo71724a() {
            if (VideoFollowFeedDetailActivity.this.f89063l != null && VideoFollowFeedDetailActivity.this.f89063l.f88944c != null && 3 == VideoFollowFeedDetailActivity.this.f89063l.f88944c.f74354a) {
                VideoFollowFeedDetailActivity.this.f89063l.mo86821h();
            }
        }

        /* renamed from: b */
        public final void mo71726b() {
            if (VideoFollowFeedDetailActivity.this.f89063l != null && VideoFollowFeedDetailActivity.this.f89063l.f88944c != null && 3 != VideoFollowFeedDetailActivity.this.f89063l.f88944c.f74354a) {
                this.f89077b = true;
                VideoFollowFeedDetailActivity.this.f89063l.mo86821h();
            }
        }

        /* renamed from: c */
        public final void mo71727c() {
            if (VideoFollowFeedDetailActivity.this.f89063l != null && VideoFollowFeedDetailActivity.this.f89063l.f88944c != null && 3 == VideoFollowFeedDetailActivity.this.f89063l.f88944c.f74354a && this.f89077b) {
                VideoFollowFeedDetailActivity.this.f89063l.mo86821h();
            }
        }

        private C34166c() {
        }

        /* renamed from: a */
        public final void mo71725a(boolean z) {
            if (!z) {
                VideoFollowFeedDetailActivity.this.f89064m = true;
            }
        }
    }

    /* renamed from: d */
    public final Activity mo86784d() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo86844f() {
        return R.layout.bp;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo86778a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        mo86887b(i, i2);
        m110160q();
        m110161r();
    }

    /* renamed from: a */
    public final void mo86779a(int i, int i2, float f) {
        LayoutParams layoutParams = (LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        mo86887b(i, i2);
    }

    /* renamed from: a */
    public final void mo86780a(C39330h hVar) {
        ((FollowFeedVideoContent) this.f88994a).mProgressbar.mo101727a(hVar, (int) hVar.f102158a);
        if (C25352e.m83221d(this.f88995b) && hVar.f102160c == 7) {
            C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("play_over").mo65283e("video").mo65271b((long) this.f88995b.getVideo().getVideoLength()).mo65270a((Context) this);
            C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("play").mo65270a((Context) this);
        }
    }

    /* renamed from: a */
    public final void mo86781a(boolean z) {
        RemoteImageView remoteImageView = ((FollowFeedVideoContent) this.f88994a).mCover;
        Aweme n = mo86852n();
        if (!z || n == null || n.getVideo() == null) {
            remoteImageView.setVisibility(8);
            return;
        }
        remoteImageView.setVisibility(0);
        C23323e.m76506a(remoteImageView, n.getVideo().getOriginCover(), remoteImageView.getWidth(), remoteImageView.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86886a(View view) {
        this.f89064m = true;
        if (!C25352e.m83313X(this.f88995b)) {
            String openUrl = this.f88995b.getAwemeRawAd().getOpenUrl();
            if (!C25371n.m83473b(openUrl) || !C25371n.m83458a((Context) this, this.f88995b.getAwemeRawAd().getOpenUrl(), this.f88995b, false, false)) {
                if (C25371n.m83453a((Context) this, this.f88995b, C25352e.m83303N(this.f88995b), C25352e.m83304O(this.f88995b), this.f88995b.getAwemeRawAd().isUseOrdinaryWeb(), false, 5)) {
                    C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("open_url_h5").mo65270a((Context) this);
                }
            } else {
                if (C25352e.m83361c(openUrl)) {
                    C24558c.m80613a().f64800a = this.f88995b;
                }
                C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("open_url_app").mo65270a((Context) this);
                C25371n.m83440a((C25372a) new C34175i(this));
            }
            C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("click").mo65283e("more_button").mo65270a((Context) this);
        } else if (!C6399b.m19944t()) {
            if (C6776h.m20948b(this, C25352e.m83305P(this.f88995b))) {
                if (C25352e.m83361c(this.f88995b.getAwemeRawAd().getOpenUrl())) {
                    C24558c.m80613a().f64800a = this.f88995b;
                }
                if (C25371n.m83473b(this.f88995b.getAwemeRawAd().getOpenUrl())) {
                    C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad").mo65276b("open_url_app").mo65270a((Context) this);
                    C25371n.m83440a((C25372a) new C34174h(this));
                }
            }
            DownloaderManagerHolder.m75524a().mo51670a(C25352e.m83241x(this.f88995b), this.f88995b.getAwemeRawAd().getAdId().longValue(), 2, C22943b.m75512a("draw_ad", this.f88995b.getAwemeRawAd(), true), C22942a.m75508a(this.f88995b.getAwemeRawAd()));
        } else if (C25371n.m83443a((Context) this)) {
            C25371n.m83471b((Context) this, C25352e.m83305P(this.f88995b));
        }
    }

    /* renamed from: e */
    public final boolean mo86785e() {
        return isFinishing();
    }

    /* renamed from: s */
    private void m110162s() {
        C29365a.m96457a(this.mPlayStatusLayout);
        mo86851m();
    }

    /* renamed from: t */
    private void m110163t() {
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo74413c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public FollowFeedVideoContent mo86848j() {
        FollowFeedVideoContent followFeedVideoContent = new FollowFeedVideoContent(this);
        followFeedVideoContent.setListener(new C34163a());
        return followFeedVideoContent;
    }

    /* renamed from: v */
    private void m110165v() {
        if (this.f89068q == -1) {
            this.f89068q = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final C44962h mo86776a() {
        return ((FollowFeedVideoContent) this.f88994a).getVideoSurfaceHolder();
    }

    /* renamed from: ai */
    public final long mo71677ai() {
        if (this.f89063l != null) {
            return this.f89063l.mo86822i();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo86782b() {
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo74411a();
        }
    }

    /* renamed from: c */
    public final void mo86783c() {
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo74412b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo86850l() {
        super.mo86850l();
        this.f89063l.mo86815b();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f89063l != null) {
            this.f89063l.mo86817d();
        }
    }

    /* renamed from: p */
    private void m110159p() {
        Aweme c = C40707a.m130166c(this.f88995b);
        if (c != null) {
            new C40727a().mo100939a(c).mo100938a(this.f89002i).mo100948a().mo100934b();
        }
    }

    /* renamed from: q */
    private void m110160q() {
        new C40727a().mo100939a(this.f88995b).mo100938a(this.f89002i).mo100948a().mo100932a(getApplicationContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo86845g() {
        super.mo86845g();
        this.f89067p = new InteractStickerWidget();
        this.f89067p.mo101064a((C40724f) this);
        this.f89003j.mo60151a((int) R.id.b2b, (Widget) this.f89067p);
        m110159p();
    }

    /* renamed from: r */
    private void m110161r() {
        Aweme c = C40707a.m130166c(this.f88995b);
        if (c != null) {
            new C40727a().mo100939a(c).mo100938a(this.f89002i).mo100945a(this.f89063l.mo86818e()).mo100948a().mo100935c();
        }
    }

    /* renamed from: w */
    private void m110166w() {
        if (this.f89068q != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f89068q;
            if (currentTimeMillis > 0) {
                if ("poi_page".equalsIgnoreCase(this.f88996c)) {
                    C6907h.m21517a((Context) this, "stay_time", this.f88996c, currentTimeMillis, 0);
                    m110148a(currentTimeMillis);
                } else {
                    return;
                }
            }
            this.f89068q = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo86846h() {
        super.mo86846h();
        if (this.f89004k) {
            this.mPlayStatusLayout.setVisibility(8);
            this.mMusicLayout.setVisibility(8);
            if (this.mAdDownloadButton != null) {
                this.mAdDownloadButton.setVisibility(8);
            }
        } else {
            this.mPlayStatusLayout.setVisibility(0);
            m110156e(true);
            m110157f(true);
        }
        if (this.f89067p != null) {
            this.f89065n = false;
            this.f89067p.mo101070e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo86847i() {
        if (!TextUtils.isEmpty(this.f88997d) && this.f89063l != null) {
            C29371f.m96475a().mo75102a(this.f88997d, this.f89063l.f88944c.f74354a);
        }
        m110163t();
        super.mo86847i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo86849k() {
        if (this.f89066o || !this.f89065n || this.f89067p == null) {
            if (!this.f89064m) {
                m110162s();
            }
            this.f89064m = false;
            this.f89066o = false;
            return;
        }
        this.f89067p.mo101070e();
        this.f89063l.mo86815b();
        this.f89065n = false;
        this.f89066o = false;
    }

    public void onPause() {
        super.onPause();
        this.f89063l.mo86816c();
        this.f89067p.mo101070e();
        this.f89065n = false;
        m110166w();
        if (this.mAdDownloadButton != null && C25352e.m83313X(this.f88995b)) {
            DownloaderManagerHolder.m75524a().mo51669a(C25352e.m83241x(this.f88995b), hashCode());
        }
    }

    /* renamed from: o */
    private void m110158o() {
        ViewGroup.LayoutParams layoutParams = this.mMusicLayout.getLayoutParams();
        layoutParams.width = (int) (((float) C9738o.m28691a((Context) this)) * 0.6f);
        this.mMusicLayout.setLayoutParams(layoutParams);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f89071t = rotateAnimation;
        this.f89071t.setRepeatCount(-1);
        this.f89071t.setInterpolator(new LinearInterpolator());
        this.f89071t.setDuration(500);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        if (!C43076dy.m136656a()) {
            this.f89063l.mo86815b();
        }
        m110165v();
        if (this.mAdDownloadButton != null && C25352e.m83313X(this.f88995b)) {
            C19535g a = DownloaderManagerHolder.m75524a();
            int hashCode = hashCode();
            C34177k kVar = new C34177k(this.f88995b, this, this.mAdDownloadButtonPercent, this.mAdDownloadButtonSize, this.mAdDownloadButtonDetail);
            a.mo51666a(this, hashCode, kVar, C22944c.m75516a(this, this.f88995b.getAwemeRawAd(), true, null));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86888b(boolean z) {
        String str;
        C24961b a = C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad");
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a.mo65276b(str).mo65270a((Context) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo86889c(boolean z) {
        String str;
        C24961b a = C24958f.m81905a().mo65273b(this.f88995b).mo65266a("draw_ad");
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a.mo65276b(str).mo65270a((Context) this);
    }

    /* renamed from: a */
    private void m110148a(long j) {
        new C33248at().mo85071g(this.f88995b).mo85138a(String.valueOf(j)).mo85139b(this.f88996c).mo85141d("video_full_screen").mo85140c(this.f88996c).mo85252e();
    }

    /* renamed from: d */
    private void m110155d(boolean z) {
        if (z) {
            if (this.mLoadingView.getVisibility() != 0) {
                this.mLoadingView.startAnimation(this.f89071t);
                this.mLoadingView.setVisibility(0);
            }
        } else if (this.mLoadingView.getVisibility() != 8) {
            this.mLoadingView.clearAnimation();
            this.mLoadingView.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m110156e(boolean z) {
        if (this.mMusicLayout != null) {
            this.mMusicLayout.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mMusicLayout, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    /* renamed from: f */
    private void m110157f(boolean z) {
        if (this.mAdDownloadButton != null) {
            this.mAdDownloadButton.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mAdDownloadButton, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    /* renamed from: b */
    private void m110153b(int i) {
        switch (i) {
            case 0:
                this.mIvPlay.setVisibility(8);
                m110155d(false);
                this.mIvPause.setVisibility(0);
                return;
            case 1:
                m110155d(false);
                this.mIvPause.setVisibility(8);
                this.mIvPlay.setVisibility(0);
                return;
            case 2:
                this.mIvPlay.setVisibility(8);
                this.mIvPause.setVisibility(8);
                m110155d(true);
                break;
            case 3:
                this.mIvPlay.setVisibility(8);
                m110155d(false);
                this.mIvPause.setVisibility(8);
                return;
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.bau || id == R.id.bb4) {
            this.f89064m = true;
            this.f89063l.mo86821h();
        } else if (id == R.id.bih) {
            this.f89064m = true;
            this.f89063l.mo86819f();
        } else {
            if (id == R.id.c1l) {
                this.f89064m = true;
                if (C6399b.m19944t()) {
                    this.f89063l.mo86819f();
                    return;
                }
                this.f89063l.mo86820g();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        C34135h hVar = new C34135h(this.f88995b, this, this.f88996c, this.f88997d);
        hVar.f88946e = this.f88998e;
        m110152a((C34119a) hVar);
        ((FollowFeedVideoContent) this.f88994a).setOnClickListener(this);
        m110158o();
        m110151a(this.f88995b, this.f88997d);
        m110154b(this.f88995b);
        this.mIvPlay.setOnClickListener(this);
        this.mIvPause.setOnClickListener(this);
        this.mTvMusicOriginal.setOnClickListener(this);
        this.mMusicTitleLayout.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    private void m110154b(Aweme aweme) {
        if (this.mAdDownloadButton != null) {
            if (!C25352e.m83221d(aweme)) {
                m110149a((View) this.mAdDownloadButton, 0);
                return;
            }
            if (!(this.mDragView == null || this.f88994a == null || ((FollowFeedVideoContent) this.f88994a).mProgressbar == null)) {
                DragView dragView = this.mDragView;
                ((FollowFeedVideoContent) this.f88994a).addOnLayoutChangeListener(new C34172f(((FollowFeedVideoContent) this.f88994a).mProgressbar, dragView));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C9738o.m28708b((Context) this, 4.0f));
            gradientDrawable.setColor(Color.parseColor(C25352e.m83242y(this.f88995b)));
            this.mAdDownloadButton.setBackground(gradientDrawable);
            if (this.mAdDownloadButtonPercent != null) {
                this.mAdDownloadButtonPercent.setTextColor(getResources().getColor(R.color.az3));
                this.mAdDownloadButtonPercent.setText(C25352e.m83243z(aweme));
            }
            if (this.mAdDownloadButtonSize != null) {
                this.mAdDownloadButtonSize.setVisibility(8);
            }
            if (this.mAdDownloadButtonDetail != null) {
                this.mAdDownloadButtonDetail.setVisibility(8);
            }
            this.mAdDownloadButton.setOnClickListener(new C34173g(this));
        }
    }

    /* renamed from: a */
    private void m110152a(C34119a aVar) {
        this.f89063l = (C34135h) aVar;
        this.f89063l.f88943b = this.f89000g;
        this.f89063l.f88945d = getIntent().getIntExtra("play_action_type", 0);
        this.f89063l.f88942a = getIntent().getBooleanExtra("pause_on_close", false);
    }

    /* renamed from: a */
    public final void mo86777a(int i) {
        if (C34176j.m110200a(this)) {
            m110153b(i);
            C21751b bVar = new C21751b(1, this.f88995b);
            bVar.f58261c = i;
            C42961az.m136380a(bVar);
        }
    }

    /* renamed from: a */
    private static void m110149a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != 0) {
                layoutParams.height = 0;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: b */
    public final void mo86887b(int i, int i2) {
        float[] fArr = new float[9];
        Matrix matrix = new Matrix();
        ((TextureView) mo86776a().mo107454a()).getTransform(matrix);
        matrix.getValues(fArr);
        m110147a((int) (((float) i) * fArr[0]), (int) (((float) i2) * fArr[4]), (int) fArr[2], (int) fArr[5]);
    }

    /* renamed from: a */
    private void m110151a(Aweme aweme, String str) {
        MarqueeView marqueeView;
        Object obj;
        int i;
        Resources resources;
        Object[] objArr;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    C42880h.m136156a("aweme.getForwardItem()为空");
                    return;
                }
                aweme = aweme.getForwardItem();
            }
            if (aweme.getMusic() == null || !aweme.getMusic().isOriginMusic()) {
                this.mTvMusicOriginal.setVisibility(8);
                this.mIvMusicIcon.setImageResource(R.drawable.a8p);
            } else {
                this.mTvMusicOriginal.setVisibility(0);
                this.mIvMusicIcon.setImageResource(R.drawable.auw);
            }
            Music music = aweme.getMusic();
            if (music != null) {
                MarqueeView marqueeView2 = this.mMusicTitleView;
                resources = getResources();
                i = R.string.ci0;
                objArr = new Object[2];
                objArr[0] = music.getMusicName();
                Object authorName = music.getAuthorName();
                marqueeView = marqueeView2;
                obj = authorName;
            } else {
                marqueeView = this.mMusicTitleView;
                resources = getResources();
                i = R.string.chz;
                objArr = new Object[2];
                objArr[0] = getResources().getString(R.string.chc);
                if (aweme.getAuthor() == null) {
                    obj = "";
                } else {
                    obj = aweme.getAuthor().getNickname();
                }
            }
            objArr[1] = obj;
            marqueeView.setText(resources.getString(i, objArr));
        }
    }

    /* renamed from: a */
    private void m110147a(int i, int i2, int i3, int i4) {
        Aweme c = C40707a.m130166c(this.f88995b);
        if (c != null) {
            C41849d dVar = new C41849d();
            dVar.mo102613b(c.getAuthorUid()).mo102612a(this.f88996c).mo102614c(c.getAid()).mo102615d(C28199ae.m92689a().mo71791a(c.getRequestId()));
            new C40727a().mo100939a(c).mo100938a(this.f89002i).mo100941a((C41841a) this.f89070s).mo100942a((C41842b) new C40712b(i, i2, i3, i4)).mo100944a(dVar).mo100945a(this.f89063l.mo86818e()).mo100943a((C41844c) this.f89069r).mo100948a().mo100931a();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m110150a(View view, View view2, View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).bottomMargin = C23486n.m77122a(72.0d) - (view2.getHeight() - i4);
            view.setLayoutParams(layoutParams);
        }
    }
}
