package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0578a;
import android.support.p022v4.app.C0578a.C0580a;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.DUserGuideMusicDetailGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ca */
public final class C28865ca extends C28895f implements C0053p<C23083a> {

    /* renamed from: r */
    public static boolean f76108r;

    /* renamed from: c */
    SmartCircleImageView f76109c;

    /* renamed from: d */
    SmartCircleImageView f76110d;

    /* renamed from: e */
    PeriscopeLayout f76111e;

    /* renamed from: f */
    FrameLayout f76112f;

    /* renamed from: s */
    public C10751a f76113s;

    /* renamed from: t */
    public Runnable f76114t;

    /* renamed from: u */
    public long f76115u;

    /* renamed from: v */
    private ValueAnimator f76116v;

    /* renamed from: w */
    private boolean f76117w;

    /* renamed from: k */
    private void m94985k() {
        this.f76110d.setOnClickListener(this.f76181b);
    }

    /* renamed from: g */
    public final void mo73804g() {
        super.mo73804g();
        m94989o();
    }

    /* renamed from: n */
    private void m94988n() {
        if (!this.f76117w) {
            this.f76117w = true;
            m94987m();
            m94991q();
        }
    }

    /* renamed from: p */
    private void m94990p() {
        if (this.f76111e != null) {
            this.f76111e.mo74428c();
        }
    }

    /* renamed from: q */
    private void m94991q() {
        if (this.f76111e != null) {
            this.f76111e.mo74425a(800, 3000);
        }
    }

    /* renamed from: r */
    private void m94992r() {
        if (this.f76111e != null) {
            this.f76111e.mo74427b();
        }
    }

    /* renamed from: o */
    private void m94989o() {
        if (this.f76117w) {
            this.f76117w = false;
            m94992r();
            if (!(this.f76112f == null || this.f76116v == null)) {
                this.f76116v.end();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo74136j() {
        if (this.f76117w) {
            this.f76117w = false;
            if (!(this.f76112f == null || this.f76116v == null)) {
                this.f76116v.end();
            }
            m94990p();
        }
    }

    /* renamed from: s */
    private boolean m94993s() {
        if (this.f76114t != null) {
            C6726a.m20845c(this.f76114t);
            this.f76114t = null;
            return true;
        } else if (this.f76113s == null) {
            return false;
        } else {
            if (this.f76174l != null) {
                this.f76174l.mo60134a("is_show_music_guide", (Object) Boolean.valueOf(false));
            }
            this.f76113s.dismiss();
            this.f76113s = null;
            return true;
        }
    }

    /* renamed from: t */
    private void m94994t() {
        if (this.f76114t != null) {
            C6726a.m20845c(this.f76114t);
            this.f76114t = null;
        }
        if (this.f76113s != null) {
            this.f76174l.mo60134a("is_show_music_guide", (Object) Boolean.valueOf(false));
            this.f76113s.mo25722b();
            this.f76113s = null;
        }
    }

    /* renamed from: l */
    private void m94986l() {
        if (C28410h.m93359a()) {
            if ((!C6399b.m19944t() || C28344a.m93111b() != 0) && !C43122ff.m136767b() && !C6903bc.m21484c().mo59240a() && !C25072c.m82577c(this.f76169g)) {
                if ((!C6399b.m19945u() || C6384b.m19835a().mo15287a(DUserGuideMusicDetailGuideExperiment.class, false, "D_enable_music_detail_guide", C6384b.m19835a().mo15295d().D_enable_music_detail_guide, 1) != 0) && !f76108r && C6319n.m19594a(this.f76170h, "homepage_hot")) {
                    f76108r = true;
                    this.f76114t = new Runnable() {
                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ Object mo74137a() throws Exception {
                            long j;
                            String str = "music_guidance_toast_show";
                            C22984d a = new C22984d().mo59973a("enter_from", "homepage_hot").mo59973a("group_id", C28865ca.this.f76169g.getAid()).mo59973a("author_id", C28865ca.this.f76169g.getAuthorUid());
                            String str2 = "music_id";
                            if (C28865ca.this.f76169g.getMusic() != null) {
                                j = C28865ca.this.f76169g.getMusic().getId();
                            } else {
                                j = 0;
                            }
                            C6907h.m21524a(str, (Map) a.mo59971a(str2, j).f60753a);
                            return null;
                        }

                        public final void run() {
                            int i;
                            C28865ca.this.f76114t = null;
                            if (C28865ca.this.f76169g == null) {
                                C28865ca.f76108r = false;
                            } else if (C28865ca.this.f76169g == null || !C28865ca.this.f76169g.isAd()) {
                                if (C28410h.m93359a()) {
                                    if (C6399b.m19944t()) {
                                        C1592h.m7855a(C28869cb.f76121a, (Executor) C6907h.m21516a());
                                    }
                                    if (C28865ca.this.f76113s == null) {
                                        if (C6399b.m19944t()) {
                                            i = R.string.dl2;
                                        } else {
                                            i = R.string.dti;
                                        }
                                        C28865ca.this.f76113s = new C10752a((Activity) C28865ca.this.f76175m).mo25738b(i).mo25739b(false).mo25736a(false).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25737a();
                                    }
                                    if (C6399b.m19944t()) {
                                        C28865ca.this.f76113s.mo25716a();
                                        if (VERSION.SDK_INT < 17 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                                            C28865ca.this.f76113s.mo25717a(C28865ca.this.f76112f, 48, (float) (C28865ca.this.f76113s.mo25724d() - (C28865ca.this.f76112f.getWidth() / 2)), ((int) C9738o.m28708b(C28865ca.this.f76175m, 7.0f)) - (C28865ca.this.f76113s.mo25724d() - C28865ca.this.f76112f.getWidth()));
                                        } else {
                                            C28865ca.this.f76113s.mo25717a(C28865ca.this.f76112f, 48, 0.0f, 0);
                                        }
                                        C1592h.m7855a((Callable<TResult>) new C28870cc<TResult>(this), (Executor) C6907h.m21516a());
                                    } else {
                                        C28865ca.this.f76113s.mo25716a();
                                        C28865ca.this.f76113s.mo25717a(C28865ca.this.f76112f, 48, ((float) (C28865ca.this.f76113s.mo25726e() - (C28865ca.this.f76112f.getWidth() / 2))) - C9738o.m28708b(C28865ca.this.f76175m, 20.0f), (-C23486n.m77122a(5.0d)) - (C28865ca.this.f76113s.mo25726e() - C28865ca.this.f76112f.getWidth()));
                                    }
                                    C28865ca.this.f76174l.mo60134a("is_show_music_guide", (Object) Boolean.valueOf(true));
                                    C28410h.m93360b();
                                }
                            } else {
                                C28865ca.f76108r = false;
                            }
                        }
                    };
                    C6726a.m20844b(this.f76114t);
                }
            }
        }
    }

    /* renamed from: m */
    private void m94987m() {
        if (this.f76112f != null) {
            if (this.f76116v != null) {
                this.f76116v.end();
            } else {
                this.f76116v = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
                this.f76116v.setDuration(8000);
                this.f76116v.setRepeatMode(1);
                this.f76116v.setInterpolator(new LinearInterpolator());
                this.f76116v.setRepeatCount(-1);
                this.f76116v.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (System.currentTimeMillis() - C28865ca.this.f76115u > 64) {
                            C28865ca.this.f76115u = System.currentTimeMillis();
                            C28865ca.this.f76112f.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
            }
            this.f76116v.start();
        }
    }

    /* renamed from: u */
    private void m94995u() {
        if (!C6399b.m19944t()) {
            C0578a.m2438a((View) this.f76110d, (C0580a) new C0580a() {
                /* renamed from: a */
                public final void mo2559a(View view, C0945c cVar) {
                    cVar.mo3656b((CharSequence) Button.class.getName());
                    cVar.mo3669d((CharSequence) C28865ca.this.f76175m.getString(R.string.cgy));
                }
            });
            if (this.f76169g == null || this.f76169g.getMusic() == null || TextUtils.isEmpty(this.f76169g.getMusic().getMusicName())) {
                this.f76112f.setContentDescription(this.f76175m.getString(R.string.cgv, new Object[]{this.f76175m.getResources().getString(R.string.cec)}));
                return;
            }
            this.f76112f.setContentDescription(this.f76175m.getString(R.string.cgv, new Object[]{this.f76169g.getMusic().getMusicName()}));
        }
    }

    public C28865ca(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        dataCenter.mo60132a("stopPlayAnimation", (C0053p<C23083a>) this).mo60132a("startPlayAnimation", (C0053p<C23083a>) this).mo60132a("pausePlayAnimation", (C0053p<C23083a>) this).mo60132a("tryDestroyEnterMusicGuide", (C0053p<C23083a>) this).mo60132a("tryDismissEnterMusicGuide", (C0053p<C23083a>) this).mo60132a("tryShowEnterMusicGuide", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -2058685350:
                    if (str.equals("pausePlayAnimation")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -588144512:
                    if (str.equals("tryDismissEnterMusicGuide")) {
                        c = 4;
                        break;
                    }
                    break;
                case 307897710:
                    if (str.equals("startPlayAnimation")) {
                        c = 0;
                        break;
                    }
                    break;
                case 974857488:
                    if (str.equals("tryDestroyEnterMusicGuide")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1625981527:
                    if (str.equals("tryShowEnterMusicGuide")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m94988n();
                    return;
                case 1:
                    m94989o();
                    return;
                case 2:
                    mo74136j();
                    return;
                case 3:
                    m94986l();
                    return;
                case 4:
                    m94993s();
                    return;
                case 5:
                    m94994t();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo72019a(View view) {
        super.mo72019a(view);
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_cover_music);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f76112f = (FrameLayout) view2.findViewById(R.id.c1a);
        this.f76110d = (SmartCircleImageView) view2.findViewById(R.id.c1_);
        this.f76109c = (SmartCircleImageView) view2.findViewById(R.id.c9e);
        this.f76111e = (PeriscopeLayout) view2.findViewById(R.id.c5a);
        this.f76110d.setOnTouchListener(new C10804a(0.5f, 1.0f));
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        int i;
        super.mo72021a(videoItemParams);
        if (!(this.f76176n == null || this.f76175m == null)) {
            boolean c = C25072c.m82577c(this.f76169g);
            View view = this.f76176n;
            int i2 = 0;
            if (c) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            LayoutParams layoutParams = this.f76176n.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (c) {
                    i2 = (int) (-(this.f76175m.getResources().getDimension(R.dimen.f124293if) + this.f76175m.getResources().getDimension(R.dimen.ie)));
                }
                marginLayoutParams.bottomMargin = i2;
                this.f76176n.setLayoutParams(layoutParams);
            }
        }
        if (C6399b.m19944t()) {
            m94983a(this.f76169g.getMusic(), this.f76169g.getAuthor());
        } else {
            m94984b(this.f76169g.getMusic(), this.f76169g.getAuthor());
        }
        this.f76112f.setRotation(0.0f);
        m94985k();
        m94995u();
    }

    /* renamed from: a */
    private static void m94980a(SmartImageView smartImageView, int i) {
        C12133n.m35298a((int) R.drawable.a_i).mo29844a((C12128i) smartImageView).mo29848a();
    }

    /* renamed from: a */
    private void m94983a(Music music, User user) {
        if (music == null || music.getCoverThumb() == null) {
            m94980a((SmartImageView) this.f76110d, (int) R.drawable.a_i);
            this.f76109c.setVisibility(8);
        } else if (TextUtils.isEmpty(music.getOwnerId())) {
            m94981a(this.f76110d, music.getCoverThumb(), C23486n.m77122a(49.0d), C23486n.m77122a(49.0d));
            this.f76109c.setVisibility(8);
        } else {
            this.f76109c.setVisibility(0);
            m94981a(this.f76109c, music.getCoverThumb(), C23486n.m77122a(27.0d), C23486n.m77122a(27.0d));
            m94980a((SmartImageView) this.f76110d, (int) R.drawable.a_i);
        }
    }

    /* renamed from: b */
    private void m94984b(Music music, User user) {
        if (music == null || music.isVcdNotAuth) {
            m94980a((SmartImageView) this.f76110d, (int) R.drawable.a_i);
            this.f76109c.setVisibility(8);
        } else if (TextUtils.isEmpty(music.getOwnerId())) {
            m94981a(this.f76110d, music.getCoverThumb(), C23486n.m77122a(49.0d), C23486n.m77122a(49.0d));
            this.f76109c.setVisibility(8);
        } else {
            this.f76109c.setVisibility(0);
            m94981a(this.f76109c, music.getCoverThumb(), C23486n.m77122a(27.0d), C23486n.m77122a(27.0d));
            m94980a((SmartImageView) this.f76110d, (int) R.drawable.a_i);
        }
    }

    /* renamed from: a */
    private static void m94981a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2) {
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29836a(i, i2).mo29855c(true).mo29845a("VideoMusicCoverView").mo29844a((C12128i) smartImageView).mo29848a();
    }
}
