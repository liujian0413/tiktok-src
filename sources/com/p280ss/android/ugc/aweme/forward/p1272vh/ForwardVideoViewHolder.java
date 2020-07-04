package com.p280ss.android.ugc.aweme.forward.p1272vh;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21749g;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29875f;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29889i;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPlayerProgressbar;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.C40727a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1608a.C40712b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p280ss.android.ugc.aweme.sticker.C41849d;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder */
public class ForwardVideoViewHolder extends BaseForwardViewHolder implements C29875f {

    /* renamed from: S */
    protected RemoteImageView f78637S;

    /* renamed from: T */
    protected ViewGroup f78638T;

    /* renamed from: U */
    MentionTextView f78639U;

    /* renamed from: V */
    View f78640V;

    /* renamed from: W */
    ViewGroup f78641W;

    /* renamed from: X */
    protected KeepSurfaceTextureView f78642X;

    /* renamed from: Y */
    ImageView f78643Y;

    /* renamed from: Z */
    TextView f78644Z;

    /* renamed from: aa */
    MarqueeView f78645aa;

    /* renamed from: ab */
    FrameLayout f78646ab;

    /* renamed from: ac */
    VideoPlayerProgressbar f78647ac;

    /* renamed from: ad */
    ImageView f78648ad;

    /* renamed from: ae */
    protected ViewGroup f78649ae;

    /* renamed from: af */
    ImageView f78650af;

    /* renamed from: ag */
    ImageView f78651ag;

    /* renamed from: ah */
    ViewStub f78652ah;

    /* renamed from: ai */
    ViewGroup f78653ai;

    /* renamed from: aj */
    ViewGroup f78654aj;

    /* renamed from: ak */
    TextView f78655ak;

    /* renamed from: al */
    private AbsInteractStickerWidget f78656al;

    /* renamed from: am */
    private RotateAnimation f78657am;

    /* renamed from: an */
    private boolean f78658an;

    /* renamed from: ao */
    private C21098ab f78659ao;

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo76012K() {
        mo76062O();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public String mo76064Q() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public int mo76065R() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public String mo76066S() {
        return "from_follow_page";
    }

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* renamed from: n */
    public final KeepSurfaceTextureView mo76057n() {
        return this.f78642X;
    }

    /* renamed from: o */
    public final View mo76058o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo76041s() {
        return this.f78658an;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo76062O() {
        ((C29889i) this.f78560N).mo75940q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo76067T() {
        this.f78560N.mo75886g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo76050z() {
        this.f78599y.setVisibility(4);
    }

    /* renamed from: h */
    public final void mo75893h() {
        super.mo75893h();
        this.f78645aa.postDelayed(new Runnable() {
            public final void run() {
                if (ForwardVideoViewHolder.this.f78645aa != null && ForwardVideoViewHolder.this.f78555I) {
                    ForwardVideoViewHolder.this.f78645aa.mo74411a();
                }
            }
        }, 100);
    }

    /* renamed from: i */
    public final void mo75894i() {
        super.mo75894i();
        if (this.f78645aa != null) {
            this.f78645aa.mo74412b();
        }
    }

    /* renamed from: l */
    public final void mo75895l() {
        super.mo75895l();
        if (this.f78645aa != null) {
            this.f78645aa.mo74413c();
        }
    }

    /* renamed from: X */
    private void m98026X() {
        Activity g = C6405d.m19984g();
        if (g instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            HomePageDataViewModel.m98904a(fragmentActivity).f79568g.observe(fragmentActivity, new C29932n(this));
        }
    }

    /* renamed from: p */
    public final int[] mo76059p() {
        return new int[]{this.f78649ae.getLayoutParams().width, this.f78649ae.getLayoutParams().height};
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo76040r() {
        this.f78656al = C29363d.m96451a().mo75033a();
        this.f78559M.mo60151a((int) R.id.b2b, (Widget) this.f78656al);
    }

    /* renamed from: U */
    private void m98023U() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f78657am = rotateAnimation;
        this.f78657am.setRepeatCount(-1);
        this.f78657am.setInterpolator(new LinearInterpolator());
        this.f78657am.setDuration(1000);
    }

    /* renamed from: V */
    private void m98024V() {
        if (this.f78552F.getForwardItem() != null) {
            new C40727a().mo100939a(this.f78552F.getForwardItem()).mo100940a(this.f78656al.mo101065d()).mo100948a().mo100936d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo76006B() {
        if (this.f78552F.getForwardItem() != null && this.f78552F.getForwardItem().getAuthor() != null) {
            mo76028b(this.f78639U, this.f78552F.getForwardItem());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo76011J() {
        if (VERSION.SDK_INT >= 21) {
            this.f78641W.setOutlineProvider(new C43070ds(this.f78641W.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f78641W.setClipToOutline(true);
        }
    }

    /* renamed from: N */
    public final void mo76061N() {
        if (this.f78552F.getForwardItem() != null) {
            new C40727a().mo100939a(this.f78552F.getForwardItem()).mo100940a(this.f78656al.mo101065d()).mo100948a().mo100934b();
        }
    }

    /* renamed from: q */
    public final void mo76060q() {
        if (this.f78642X != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.f78642X.getTransform(matrix);
            matrix.getValues(fArr);
            m98027a((int) (((float) this.f78638T.getLayoutParams().width) * fArr[0]), (int) (((float) this.f78638T.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo76045u() {
        super.mo76045u();
        if (this.f78552F.getForwardItem() != null) {
            mo75901a(true);
            m98025W();
            this.f78647ac.setVisibility(8);
            mo75899a(1);
            C6903bc.m21489h().mo85868a(mo75888b(), this.f78552F.getForwardItem(), this.f78654aj, this.f78655ak, mo76044t(), mo76065R());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo76063P() {
        if (this.f78552F != null) {
            C6903bc.m21486e().mo75372b(this.f78552F, mo76044t());
            C28418f.m93413a().f74931a = ((C29889i) this.f78560N).mo75937o();
            C28418f.m93413a().f74933c = ((C29889i) this.f78560N).mo75927j().f77401f;
            C28503s.m93679a(this.f78550D.mo58090c(this.f78552F));
            m98029d(true);
            ((C29889i) this.f78560N).mo75936n();
            ((C29889i) this.f78560N).f78508m = true;
            C29363d.m96451a().mo75038a(mo75888b(), this.f78552F.getAid(), mo76044t(), mo76066S(), this.f78552F.getEnterpriseType(), mo76065R(), mo76064Q(), (View) this.f78638T);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo76049y() {
        if (this.f78552F.getForwardItem() != null && this.f78552F.getForwardItem().getVideo() != null) {
            mo76020a((View) this.f78638T, this.f78552F.getForwardItem().getVideo().getWidth(), this.f78552F.getForwardItem().getVideo().getHeight());
            m98027a(this.f78638T.getLayoutParams().width, this.f78638T.getLayoutParams().height, 0, 0);
        }
    }

    /* renamed from: W */
    private void m98025W() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        LayoutParams layoutParams = this.f78649ae.getLayoutParams();
        layoutParams.width = (int) (((float) this.f78638T.getLayoutParams().width) * 0.6f);
        this.f78649ae.setLayoutParams(layoutParams);
        Music music = this.f78552F.getForwardItem().getMusic();
        if (music == null || !music.isOriginMusic()) {
            this.f78644Z.setVisibility(8);
            this.f78643Y.setImageResource(R.drawable.a8p);
        } else {
            this.f78644Z.setVisibility(0);
            this.f78643Y.setImageResource(R.drawable.auw);
        }
        if (music != null) {
            marqueeView = this.f78645aa;
            resources = this.itemView.getResources();
            i = R.string.ci0;
            objArr = new Object[2];
            objArr[0] = music.getMusicName();
            str = music.getAuthorName();
        } else {
            marqueeView = this.f78645aa;
            resources = this.itemView.getResources();
            i = R.string.chz;
            objArr = new Object[2];
            objArr[0] = this.itemView.getResources().getString(R.string.chc);
            if (this.f78552F.getForwardItem().getAuthor() == null) {
                str = "";
            } else {
                str = this.f78552F.getForwardItem().getAuthor().getNickname();
            }
        }
        objArr[1] = str;
        marqueeView.setText(resources.getString(i, objArr));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo76076j(View view) {
        mo76067T();
    }

    /* renamed from: a */
    public final void mo76069a(C21746d dVar) {
        ((C29889i) this.f78560N).f78506k = dVar;
    }

    /* renamed from: b */
    public final void mo75902b(boolean z) {
        this.f78647ac.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo76071e(View view) {
        ((C29889i) this.f78560N).mo75939p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo76072f(View view) {
        ((C29889i) this.f78560N).mo75939p();
    }

    /* renamed from: d */
    private void m98029d(boolean z) {
        ((C29889i) this.f78560N).mo75934c(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C29889i mo76068a(C29376j jVar) {
        return new C29889i(this, jVar, mo76065R(), this.f78659ao);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo76077k(View view) {
        if (!C27326a.m89578a(view)) {
            mo76062O();
        }
    }

    /* renamed from: a */
    public final void mo75900a(C39330h hVar) {
        this.f78647ac.mo101727a(hVar, (int) hVar.f102158a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo76075i(View view) {
        if (!C27326a.m89578a(view)) {
            mo76062O();
        }
    }

    /* renamed from: c */
    private void m98028c(boolean z) {
        if (z) {
            if (this.f78648ad.getVisibility() != 0) {
                this.f78648ad.startAnimation(this.f78657am);
                this.f78648ad.setVisibility(0);
            }
        } else if (this.f78648ad.getVisibility() != 8) {
            this.f78648ad.clearAnimation();
            this.f78648ad.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76070a(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            C29889i iVar = (C29889i) this.f78560N;
            if (iVar.mo75937o().mo104916o()) {
                iVar.mo75935m();
                mo75899a(1);
                C32950d.m106524a("play", mo76044t(), this.f78552F);
                return;
            }
            C32950d.m106524a("pause", mo76044t(), this.f78552F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo76073g(View view) {
        if (!(this.f78552F == null || this.f78552F.getForwardItem() == null || this.f78550D == null || !(this.f78550D instanceof C21749g))) {
            ((C21749g) this.f78550D).mo58091c(view, this.itemView, this.f78552F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo76074h(View view) {
        if (!(this.f78552F == null || this.f78552F.getForwardItem() == null || this.f78550D == null || !(this.f78550D instanceof C21749g))) {
            ((C21749g) this.f78550D).mo58092d(view, this.itemView, this.f78552F);
        }
    }

    /* renamed from: a */
    public final void mo75899a(int i) {
        switch (i) {
            case 0:
                this.f78650af.setVisibility(8);
                m98028c(false);
                this.f78651ag.setVisibility(0);
                return;
            case 1:
                m98028c(false);
                this.f78651ag.setVisibility(8);
                this.f78650af.setVisibility(0);
                return;
            case 2:
                this.f78650af.setVisibility(8);
                this.f78651ag.setVisibility(8);
                m98028c(true);
                break;
            case 3:
                this.f78650af.setVisibility(8);
                m98028c(false);
                this.f78651ag.setVisibility(8);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6w);
        mo76017a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6d);
        mo76017a(viewStub4.inflate(), 12.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        mo76017a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub6.setLayoutResource(R.layout.a6p);
        mo76017a(viewStub6.inflate(), 12.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76016a(View view) {
        super.mo76016a(view);
        this.f78637S = (RemoteImageView) view.findViewById(R.id.b7x);
        this.f78637S.setOnClickListener(new C29925g(this));
        this.f78638T = (ViewGroup) view.findViewById(R.id.bkm);
        this.f78639U = (MentionTextView) view.findViewById(R.id.dz3);
        this.f78640V = view.findViewById(R.id.biq);
        this.f78640V.setOnClickListener(new C29926h(this));
        this.f78641W = (ViewGroup) view.findViewById(R.id.cwp);
        this.f78641W.setOnClickListener(new C29927i(this));
        this.f78642X = (KeepSurfaceTextureView) view.findViewById(R.id.dij);
        this.f78643Y = (ImageView) view.findViewById(R.id.c1e);
        this.f78644Z = (TextView) view.findViewById(R.id.c1l);
        this.f78644Z.setOnClickListener(new C29928j(this));
        this.f78646ab = (FrameLayout) view.findViewById(R.id.bih);
        this.f78646ab.setOnClickListener(new C29929k(this));
        this.f78645aa = (MarqueeView) view.findViewById(R.id.c24);
        this.f78647ac = (VideoPlayerProgressbar) view.findViewById(R.id.eb_);
        this.f78648ad = (ImageView) view.findViewById(R.id.b_w);
        this.f78649ae = (ViewGroup) view.findViewById(R.id.big);
        this.f78650af = (ImageView) view.findViewById(R.id.bb4);
        this.f78651ag = (ImageView) view.findViewById(R.id.bau);
        this.f78650af.setOnClickListener(new C29930l(this));
        this.f78651ag.setOnClickListener(new C29931m(this));
        this.f78652ah = (ViewStub) view.findViewById(R.id.dc3);
        this.f78653ai = (ViewGroup) view.findViewById(R.id.b2b);
        this.f78654aj = (ViewGroup) view.findViewById(R.id.bz6);
        this.f78655ak = (TextView) view.findViewById(R.id.bz2);
    }

    /* renamed from: a */
    public final void mo75901a(boolean z) {
        if (z) {
            this.f78637S.setVisibility(0);
            if (!(this.f78552F == null || this.f78552F.getForwardItem() == null || this.f78552F.getForwardItem().getVideo() == null)) {
                C23323e.m76506a(this.f78637S, this.f78552F.getForwardItem().getVideo().getOriginCover(), this.f78637S.getWidth(), this.f78637S.getHeight());
            }
        } else {
            this.f78637S.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m98027a(int i, int i2, int i3, int i4) {
        if (this.f78552F.getForwardItem() != null) {
            C41849d dVar = new C41849d();
            dVar.mo102613b(this.f78552F.getForwardItem().getAuthorUid()).mo102612a(mo76044t()).mo102614c(this.f78552F.getForwardItem().getAid()).mo102615d(C28199ae.m92689a().mo71791a(this.f78552F.getForwardItem().getRequestId()));
            new C40727a().mo100939a(this.f78552F.getForwardItem()).mo100940a(this.f78656al.mo101065d()).mo100942a((C41842b) new C40712b(i, i2, i3, i4)).mo100944a(dVar).mo100947a(false).mo100948a().mo100931a();
        }
    }

    public ForwardVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        this(followFeedLayout, bVar, jVar, eVar, aVar, false);
    }

    /* renamed from: a */
    public final void mo76022a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        super.mo76022a(aweme, list, list2, str, str2);
        m98024V();
        mo76061N();
        if (this.f78659ao == null) {
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
            if (frameLayout != null) {
                this.f78659ao = C21780t.m72808a(false).mo57895b(mo75888b());
                if (this.f78659ao != null) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(this.f78659ao.mo56936a());
                }
            }
        }
        if (this.f78659ao != null && this.f78552F != null) {
            this.f78552F.getUploadMiscInfoStruct();
            this.f78552F.getAid();
        }
    }

    public ForwardVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, eVar, aVar);
        m98023U();
        this.f78658an = z;
        this.f78560N = mo76068a(jVar);
        if (EarPhoneUnplugExperiment.shouldPausePlayVideo()) {
            m98026X();
        }
    }
}
