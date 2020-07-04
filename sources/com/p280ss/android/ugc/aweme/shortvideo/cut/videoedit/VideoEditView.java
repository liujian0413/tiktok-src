package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38783b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38784c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38785d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41543av;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41706n;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView */
public class VideoEditView extends AbstractVideoEditView implements OnTouchListener {

    /* renamed from: A */
    C41706n f101759A;

    /* renamed from: B */
    protected float f101760B;

    /* renamed from: C */
    protected float f101761C;

    /* renamed from: D */
    protected int f101762D;

    /* renamed from: E */
    protected int f101763E;

    /* renamed from: F */
    protected int f101764F;

    /* renamed from: G */
    protected int f101765G;

    /* renamed from: H */
    protected C38784c f101766H;

    /* renamed from: I */
    protected C38785d f101767I;

    /* renamed from: J */
    protected int f101768J;

    /* renamed from: K */
    protected int f101769K;

    /* renamed from: L */
    protected int f101770L;

    /* renamed from: M */
    protected int f101771M;

    /* renamed from: N */
    protected int f101772N;

    /* renamed from: O */
    private float f101773O;

    /* renamed from: P */
    private long f101774P;

    /* renamed from: Q */
    private long f101775Q;

    /* renamed from: R */
    private float f101776R;

    /* renamed from: S */
    private float f101777S;

    /* renamed from: T */
    private float f101778T;

    /* renamed from: U */
    private boolean f101779U;

    /* renamed from: V */
    private boolean f101780V;

    /* renamed from: W */
    private long f101781W;

    /* renamed from: a */
    private boolean f101782a;

    /* renamed from: aa */
    private int f101783aa;

    /* renamed from: ab */
    private int f101784ab;

    /* renamed from: ac */
    private int f101785ac;

    /* renamed from: ad */
    private int f101786ad;

    /* renamed from: ae */
    private boolean f101787ae;

    /* renamed from: af */
    private boolean f101788af;

    /* renamed from: ag */
    private C15389d f101789ag;

    /* renamed from: ah */
    private C0052o<Bitmap> f101790ah;

    /* renamed from: ai */
    private C0052o<Boolean> f101791ai;

    /* renamed from: aj */
    private boolean f101792aj;

    /* renamed from: ak */
    private boolean f101793ak;

    /* renamed from: al */
    private int f101794al;

    /* renamed from: am */
    private int f101795am;

    /* renamed from: an */
    private int f101796an;

    /* renamed from: ao */
    private int f101797ao;

    /* renamed from: ap */
    private int f101798ap;

    /* renamed from: aq */
    private boolean f101799aq;

    /* renamed from: ar */
    private boolean f101800ar;

    /* renamed from: as */
    private long f101801as;

    /* renamed from: at */
    private C1281m f101802at;

    /* renamed from: b */
    protected int f101803b;

    /* renamed from: c */
    FragmentActivity f101804c;

    /* renamed from: d */
    VideoEditViewModel f101805d;

    /* renamed from: e */
    CutMultiVideoViewModel f101806e;

    /* renamed from: f */
    protected RTLImageView f101807f;

    /* renamed from: g */
    protected RTLImageView f101808g;

    /* renamed from: h */
    protected TextView f101809h;

    /* renamed from: i */
    protected TextView f101810i;

    /* renamed from: j */
    protected LayoutParams f101811j;

    /* renamed from: k */
    protected LayoutParams f101812k;

    /* renamed from: l */
    protected View f101813l;

    /* renamed from: m */
    protected View f101814m;

    /* renamed from: n */
    protected View f101815n;

    /* renamed from: o */
    protected View f101816o;

    /* renamed from: p */
    protected View f101817p;

    /* renamed from: q */
    RTLLinearLayout f101818q;

    /* renamed from: r */
    ImageView f101819r;

    /* renamed from: s */
    protected boolean f101820s;

    /* renamed from: t */
    protected C38783b f101821t;

    /* renamed from: u */
    FrameLayout f101822u;

    /* renamed from: v */
    MVRecycleView f101823v;

    /* renamed from: w */
    MVRecycleView f101824w;

    /* renamed from: x */
    View f101825x;

    /* renamed from: y */
    FramesAdapter f101826y;

    /* renamed from: z */
    FramesAdapter f101827z;

    /* renamed from: a */
    public void mo97599a(List<VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo97600a(boolean z) {
    }

    /* renamed from: d */
    public void mo97602d() {
    }

    /* renamed from: e */
    public void mo97603e() {
    }

    public int getEditState() {
        return this.f101763E;
    }

    public View getEndSlide() {
        return this.f101807f;
    }

    public int getFrameHeight() {
        return this.f101768J;
    }

    public int getFrameWidth() {
        return this.f101796an;
    }

    public int getLeftRightMargin() {
        return this.f101770L;
    }

    public long getLeftSeekingValue() {
        return 0;
    }

    public long getMinVideoLength() {
        return this.f101774P;
    }

    public int getOverXScroll() {
        return this.f101762D;
    }

    public long getPlayingPosition() {
        return 0;
    }

    public long getRightSeekingValue() {
        return 0;
    }

    public View getStartSlide() {
        return this.f101808g;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.f101805d;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* renamed from: a */
    public final boolean mo97632a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.f101806e = cutMultiVideoViewModel;
        MediaModel a = m125303a(str, cutMultiVideoViewModel);
        if (a == null) {
            return false;
        }
        return mo97633a(fragmentActivity, cutMultiVideoViewModel, Collections.singletonList(a));
    }

    /* renamed from: a */
    public final boolean mo97631a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, C41706n nVar, List<MediaModel> list) {
        this.f101759A = nVar;
        return mo97633a(fragmentActivity, cutMultiVideoViewModel, list);
    }

    /* renamed from: a */
    public final boolean mo97633a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        this.f101804c = fragmentActivity;
        this.f101763E = list.size() > 1 ? 1 : 0;
        this.f101806e = cutMultiVideoViewModel;
        this.f101805d = (VideoEditViewModel) C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        m125308a(cutMultiVideoViewModel, list);
        m125314r();
        return true;
    }

    /* renamed from: a */
    public final boolean mo97634a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z) {
        this.f101804c = fragmentActivity;
        this.f101763E = z ? 1 : 0;
        this.f101806e = cutMultiVideoViewModel;
        this.f101805d = (VideoEditViewModel) C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        m125308a(cutMultiVideoViewModel, list);
        m125314r();
        return true;
    }

    /* renamed from: a */
    private void m125308a(CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        if (cutMultiVideoViewModel.f100404k) {
            for (MediaModel mediaModel : list) {
                mediaModel.f88159e = (long) cutMultiVideoViewModel.f100405l;
                mediaModel.f88163i = 720;
                mediaModel.f88164j = 1280;
            }
        }
        this.f101805d.mo97697a(list);
    }

    /* renamed from: a */
    public void mo97637b(VideoSegment videoSegment) {
        this.f101763E = 1;
        this.f101805d.mo97691a(1);
        if (this.f101767I != null) {
            this.f101767I.mo96925a();
        }
        if (this.f101766H != null) {
            this.f101766H.mo96923a();
        }
        this.f101805d.mo97703b(videoSegment.mo96908g());
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        mo97621a((float) this.f101772N, (float) ((this.f101803b - this.f101772N) - C38774k.f100746d), 0);
        mo97598a(videoSegment, 3);
    }

    /* renamed from: a */
    public final void mo97624a(C0902i<Float, Float> iVar, boolean z) {
        if (z) {
            this.f101766H.f100792a = ((Float) iVar.f3154a).floatValue();
            this.f101766H.f100793b = ((Float) iVar.f3155b).floatValue();
            this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
            mo97621a(this.f101766H.f100792a, this.f101766H.f100793b, this.f101766H.f100794c);
            return;
        }
        mo97621a(((Float) iVar.f3154a).floatValue(), ((Float) iVar.f3155b).floatValue(), 0);
        this.f101824w.postDelayed(new C39260k(this), 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97598a(VideoSegment videoSegment, int i) {
        this.f101823v.setVisibility(0);
        this.f101824w.setVisibility(8);
        this.f101827z.mo97588b();
        if (i == 2) {
            this.f101823v.mo5541b(0);
            this.f101826y.mo97582a((C0043i) this.f101804c, this.f101821t.f100783b, this.f101763E, false);
            this.f101805d.mo97718k();
        } else if (i == 3) {
            this.f101823v.mo5541b(0);
            this.f101826y.mo97581a((C0043i) this.f101804c, videoSegment, this.f101821t.f100783b);
            this.f101805d.mo97695a(videoSegment);
        } else {
            if (i == 1) {
                this.f101805d.mo97717j();
            }
        }
    }

    /* renamed from: a */
    public void mo97636b(C0902i<Integer, Integer> iVar) {
        this.f101763E = 2;
        this.f101805d.mo97691a(2);
        this.f101765G = ((Integer) iVar.f3154a).intValue();
        this.f101764F = ((Integer) iVar.f3155b).intValue();
        VideoSegment videoSegment = (VideoSegment) this.f101805d.mo97721n().get(this.f101764F);
        if (this.f101767I == null) {
            this.f101767I = new C38785d(videoSegment);
        } else {
            this.f101767I.mo96926a(videoSegment);
        }
        this.f101821t.mo96920a(videoSegment.f100761c, videoSegment.mo96908g(), this.f101805d.mo97711e(this.f101764F).mo96911j(), this.f101763E);
        this.f101823v.setVisibility(8);
        this.f101826y.mo97588b();
        this.f101824w.setVisibility(0);
        this.f101824w.mo5541b(0);
        this.f101827z.mo97583a((C0043i) this.f101804c, this.f101821t.f100783b, videoSegment, false);
        this.f101824w.mo5521a(this.f101805d.mo97699b(this.f101764F), 0);
        this.f101766H.mo96924a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        float a = C38774k.m123813a(this.f101821t, this.f101805d.mo97711e(this.f101764F), this.f101805d.mo97699b(this.f101764F), this.f101772N);
        mo97621a(a, C38774k.m123812a(this.f101804c, this.f101821t, a, this.f101805d.mo97711e(this.f101764F), this.f101772N), 0);
        this.f101805d.mo97694a(iVar);
    }

    /* renamed from: a */
    public final boolean mo97630a(int i, int i2, int i3) {
        float f;
        if (this.f101808g == null || VERSION.SDK_INT < 19 || !this.f101808g.isLaidOut() || this.f101808g.getLeft() == 0) {
            return false;
        }
        if (this.f101782a) {
            VideoSegment videoSegment = (VideoSegment) this.f101805d.mo97721n().get(this.f101764F);
            if (this.f101767I == null) {
                this.f101767I = new C38785d(videoSegment);
            } else {
                this.f101767I.mo96926a(videoSegment);
            }
            this.f101821t.mo96920a(videoSegment.f100761c, videoSegment.mo96908g(), this.f101805d.mo97711e(this.f101764F).mo96911j(), this.f101763E);
        }
        this.f101805d.mo97692a(this.f101764F, 0);
        this.f101824w.mo5541b(0);
        this.f101824w.mo5521a(0, 0);
        VideoSegment e = this.f101805d.mo97711e(this.f101764F);
        float j = (((((float) i) * 1.0f) / (e.mo96911j() * this.f101821t.f100786e)) + ((float) this.f101772N)) - 0.0f;
        int i4 = i2 - i;
        if (((long) i4) == e.f100761c) {
            f = (float) ((C23482j.m77098b(this.f101804c) - this.f101772N) - C38774k.f100746d);
        } else {
            f = ((float) C38774k.f100746d) + j + (((float) i4) / (e.mo96911j() * this.f101821t.f100786e));
        }
        mo97621a(j, f, 0);
        setCurPointerContainerStartX((float) (this.f101772N + C38774k.f100746d));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97621a(float f, float f2, int i) {
        this.f101808g.setStartX(f);
        this.f101807f.setStartX(f2);
        m125305a((int) this.f101808g.getStartX(), (int) this.f101807f.getStartX());
        this.f101762D = i;
        mo97635b();
        post(new C39261l(this));
    }

    /* renamed from: a */
    public final void mo97620a() {
        if (this.f101805d != null) {
            if (this.f101763E == 0) {
                if (this.f101827z != null) {
                    this.f101827z.mo97586a(this.f101805d.mo97721n());
                }
            } else if (this.f101826y != null) {
                this.f101826y.mo97586a(this.f101805d.mo97721n());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo97601a(String str) {
        if (str.equals("curPoint") || ((int) ((this.f101807f.getStartX() - this.f101808g.getStartX()) - ((float) C38774k.f100746d))) >= ((int) this.f101821t.f100788g) - 2) {
            return true;
        }
        m125298B();
        C38774k.m123816a((Context) this.f101804c);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97622a(float f, boolean z) {
        if (this.f101783aa == 2) {
            f = Math.min(Math.max((float) (this.f101772N + C38774k.f100746d), f), (float) (((this.f101803b - this.f101772N) - C38774k.f100746d) - C38774k.f100747e));
        } else {
            if (f < this.f101808g.getStartX() + ((float) C38774k.f100746d)) {
                f = this.f101808g.getStartX() + ((float) C38774k.f100746d);
            }
            if (f > this.f101807f.getStartX() - ((float) this.f101819r.getWidth())) {
                f = this.f101807f.getStartX() - ((float) this.f101819r.getWidth());
            }
        }
        setCurPointerContainerStartX(f);
        this.f101805d.mo97690a(this.f101761C);
        if (z) {
            if (this.f101763E == 2) {
                this.f101805d.mo97693a(getSinglePlayingPosition());
                return;
            }
            this.f101805d.mo97693a(getMultiPlayingPosition());
        }
    }

    /* renamed from: a */
    public final void mo97628a(boolean z, C0902i<Float, Float> iVar) {
        float floatValue = ((Float) iVar.f3154a).floatValue();
        if (floatValue <= 0.0f) {
            floatValue = (float) this.f101772N;
        }
        float floatValue2 = ((Float) iVar.f3155b).floatValue();
        if (floatValue2 <= 0.0f) {
            floatValue2 = (float) ((this.f101803b - this.f101772N) - C38774k.f100746d);
        }
        if (z) {
            mo97621a(floatValue, floatValue2, 0);
            return;
        }
        this.f101763E = 1;
        this.f101805d.mo97691a(1);
        if (this.f101767I != null) {
            this.f101767I.mo96925a();
        }
        if (this.f101766H != null) {
            this.f101766H.mo96923a();
        }
        for (VideoSegment videoSegment : this.f101805d.mo97721n()) {
            this.f101821t.mo96921a(videoSegment.mo96908g(), videoSegment.mo96911j());
        }
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        mo97621a(floatValue, floatValue2, 0);
        this.f101824w.setVisibility(8);
        this.f101827z.mo97588b();
        this.f101823v.setVisibility(0);
        this.f101823v.mo5541b(0);
        this.f101826y.mo97589b(this.f101804c, this.f101805d.mo97721n(), this.f101821t.f100783b);
    }

    /* renamed from: a */
    public final void mo97629a(final boolean z, boolean z2, final C6892b<Void> bVar) {
        AlphaAnimation alphaAnimation = z ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        if (this.f101808g != null) {
            this.f101808g.startAnimation(alphaAnimation);
        }
        if (this.f101807f != null) {
            this.f101807f.startAnimation(alphaAnimation);
        }
        if (this.f101813l != null) {
            this.f101813l.startAnimation(alphaAnimation);
        }
        if (this.f101814m != null) {
            this.f101814m.startAnimation(alphaAnimation);
        }
        if (this.f101817p != null) {
            this.f101817p.startAnimation(alphaAnimation);
        }
        alphaAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                if (z) {
                    VideoEditView.this.mo97639b(true);
                }
            }

            public final void onAnimationEnd(Animation animation) {
                if (!z) {
                    VideoEditView.this.mo97639b(false);
                }
                if (bVar != null) {
                    bVar.run(null);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo97623a(int i) {
        long j = (long) i;
        setMaxVideoLength(j);
        List n = this.f101805d.mo97721n();
        if (!C6311g.m19573a(n)) {
            VideoSegment videoSegment = (VideoSegment) n.get(0);
            videoSegment.f100761c = j;
            videoSegment.mo96901b(j);
        }
        this.f101821t.f100789h = j;
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        this.f101782a = true;
    }

    /* renamed from: y */
    private void m125321y() {
        m125297A();
        m125322z();
    }

    public float getEndSlideX() {
        return this.f101807f.getStartX();
    }

    public long getMaxCutDuration() {
        return this.f101821t.f100787f;
    }

    public float getStartSlideX() {
        return this.f101808g.getStartX();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo97669q() {
        mo97612h();
        mo97613i();
    }

    /* renamed from: C */
    private void m125299C() {
        if (!this.f101780V) {
            this.f101780V = true;
            C38774k.m123816a((Context) this.f101804c);
        }
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.f101763E == 0) {
            return this.f101824w;
        }
        return this.f101823v;
    }

    public C0902i<Long, Long> getPlayBoundary() {
        if (this.f101763E == 1) {
            return getMultiVideoPlayBoundary();
        }
        return getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        if (this.f101763E == 1) {
            return getMultiSeekTime();
        }
        return getSingleSeekTime();
    }

    public float getSelectedTime() {
        return (this.f101761C * this.f101821t.f100786e) / 1000.0f;
    }

    public long getSingleSeekTime() {
        return (long) ((this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e);
    }

    public int getCurrentRotate() {
        if (this.f101763E == 2 || this.f101763E == 0) {
            return this.f101767I.f100797c;
        }
        return 0;
    }

    public float getCurrentSpeed() {
        if (this.f101763E == 2 || this.f101763E == 0) {
            return this.f101767I.f100798d;
        }
        return this.f101805d.mo97722o();
    }

    public long getMultiSeekTime() {
        return C38783b.m123867a(this.f101805d.mo97721n(), (this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e, this.f101805d.mo97722o());
    }

    public long getSinglePlayingPosition() {
        return (long) (((this.f101760B + this.f101818q.getStartX()) - this.f101808g.getStartX()) * this.f101821t.f100786e * this.f101767I.f100798d);
    }

    public C0902i<Float, Float> getSlideX() {
        return new C0902i<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo97617m() {
        if (this.f101808g != null) {
            this.f101808g.setImageResource(R.drawable.co7);
        }
        if (this.f101807f != null) {
            this.f101807f.setImageResource(R.drawable.co6);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo97668p() {
        setCurPointerContainerStartX(this.f101808g.getStartX() + ((float) C38774k.f100746d));
        mo97612h();
        m125318v();
        mo97613i();
    }

    /* renamed from: r */
    private void m125314r() {
        this.f101803b = C23482j.m77098b(this.f101804c);
        this.f101765G = 0;
        this.f101764F = 0;
        this.f101821t = new C38783b(this.f101805d.mo97721n(), C38774k.m123820b(this.f101804c, this.f101772N));
        this.f101821t.f100789h = this.f101775Q;
        this.f101821t.f100790i = this.f101774P;
        m125315s();
        m125316t();
        m125320x();
        m125319w();
        mo97604g();
    }

    /* renamed from: v */
    private void m125318v() {
        if (this.f101817p != null) {
            int startX = (int) (this.f101808g.getStartX() + ((float) C38774k.f100746d));
            LayoutParams layoutParams = new LayoutParams((int) this.f101761C, this.f101768J);
            layoutParams.topMargin = this.f101771M;
            layoutParams.leftMargin = startX;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(startX);
            }
            this.f101817p.setLayoutParams(layoutParams);
        }
    }

    public List<String> getFinalPathes() {
        return this.f101821t.mo96919a(this.f101805d.mo97721n(), (this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e, (this.f101760B + ((float) C38774k.f100746d) + this.f101761C) * this.f101821t.f100786e, this.f101805d.mo97722o());
    }

    public long getMultiPlayingPosition() {
        return C38783b.m123867a(this.f101805d.mo97721n(), ((this.f101760B + this.f101818q.getStartX()) - this.f101808g.getStartX()) * this.f101821t.f100786e, this.f101805d.mo97722o());
    }

    public C0902i<Long, Long> getSingleVideoPlayBoundary() {
        return C0902i.m3837a(Long.valueOf((long) ((this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e * this.f101767I.f100798d)), Long.valueOf((long) ((this.f101760B + ((float) C38774k.f100746d) + this.f101761C) * this.f101821t.f100786e * this.f101767I.f100798d)));
    }

    /* renamed from: h */
    public void mo97612h() {
        if (this.f101815n != null) {
            float startX = this.f101808g.getStartX();
            int i = (this.f101772N + C38774k.f100746d) - this.f101762D;
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (startX - ((float) i));
            if (i2 < 0) {
                i2 = 0;
            }
            LayoutParams layoutParams = new LayoutParams(i2, this.f101768J);
            layoutParams.topMargin = this.f101771M;
            layoutParams.leftMargin = i;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i);
            }
            layoutParams.gravity = 8388611;
            this.f101815n.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    public void mo97614j() {
        this.f101763E = 1;
        this.f101805d.mo97691a(1);
        if (this.f101767I != null) {
            this.f101767I.mo96925a();
        }
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        mo97621a(this.f101766H.f100792a, this.f101766H.f100793b, this.f101766H.f100794c);
        mo97598a((VideoSegment) null, 1);
    }

    /* renamed from: k */
    public void mo97615k() {
        this.f101763E = 1;
        this.f101805d.mo97691a(1);
        mo97616l();
        if (this.f101766H != null) {
            this.f101766H.mo96923a();
        }
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        mo97621a((float) this.f101772N, (float) ((this.f101803b - this.f101772N) - C38774k.f100746d), 0);
        mo97598a((VideoSegment) null, 2);
    }

    /* renamed from: A */
    private void m125297A() {
        this.f101817p = new View(this.f101804c);
        this.f101817p.setTag("block");
        this.f101817p.setOnTouchListener(this);
        this.f101817p.setBackgroundColor(this.f101786ad);
        this.f101817p.setVisibility(4);
        LayoutParams layoutParams = new LayoutParams((int) this.f101761C, this.f101768J);
        layoutParams.topMargin = (int) C9738o.m28708b((Context) this.f101804c, 7.0f);
        layoutParams.leftMargin = this.f101772N + C38774k.f100746d;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f101772N + C38774k.f100746d);
        }
        this.f101817p.setLayoutParams(layoutParams);
        this.f101822u.addView(this.f101817p);
        this.f101818q.bringToFront();
    }

    /* renamed from: B */
    private void m125298B() {
        if (System.currentTimeMillis() - this.f101801as >= 2000) {
            if (this.f101763E == 2) {
                C10761a.m31403c((Context) this.f101804c, getResources().getString(R.string.fks, new Object[]{Float.valueOf(0.5f)})).mo25750a();
                this.f101801as = System.currentTimeMillis();
                return;
            }
            C10761a.m31403c((Context) this.f101804c, getResources().getString(R.string.fks, new Object[]{Float.valueOf(1.0f)})).mo25750a();
            this.f101801as = System.currentTimeMillis();
        }
    }

    /* renamed from: s */
    private void m125315s() {
        View inflate = View.inflate(this.f101804c, R.layout.b1u, this);
        this.f101818q = (RTLLinearLayout) inflate.findViewById(R.id.a5j);
        this.f101819r = (ImageView) inflate.findViewById(R.id.a5i);
        this.f101822u = (FrameLayout) inflate.findViewById(R.id.ap_);
        this.f101823v = (MVRecycleView) inflate.findViewById(R.id.apa);
        this.f101824w = (MVRecycleView) inflate.findViewById(R.id.d73);
        this.f101825x = inflate.findViewById(R.id.a24);
    }

    /* renamed from: t */
    private void m125316t() {
        if (this.f101763E == 1) {
            this.f101766H = new C38784c();
            this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        } else {
            VideoSegment videoSegment = (VideoSegment) this.f101805d.mo97721n().get(0);
            this.f101767I = new C38785d(videoSegment);
            this.f101821t.mo96920a(videoSegment.f100761c, videoSegment.mo96908g(), videoSegment.mo96911j(), this.f101763E);
        }
        this.f101761C = (float) ((this.f101803b - (this.f101772N * 2)) - (C38774k.f100746d * 2));
        this.f101760B = (float) (-C38774k.f100746d);
    }

    /* renamed from: u */
    private void m125317u() {
        if (this.f101792aj) {
            C0902i playBoundary = getPlayBoundary();
            long max = Math.max(0, ((Long) playBoundary.f3154a).longValue());
            Math.min(this.f101775Q, ((Long) playBoundary.f3155b).longValue());
            String a = C1642a.m8035a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) max) / 1000.0f)});
            String a2 = C1642a.m8035a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) ((Long) playBoundary.f3155b).longValue()) / 1000.0f)});
            C23487o.m77145a(this.f101810i, (CharSequence) a);
            C23487o.m77145a(this.f101809h, (CharSequence) a2);
            mo97665n();
        }
    }

    /* renamed from: f */
    public final boolean mo97642f() {
        VideoSegment videoSegment = (VideoSegment) this.f101805d.mo97721n().get(this.f101765G);
        boolean z = false;
        if (!(videoSegment == null || this.f101767I == null)) {
            if (Math.abs(videoSegment.mo96909h() - this.f101767I.f100795a) > 100 || Math.abs(videoSegment.mo96910i() - this.f101767I.f100796b) > 100) {
                return true;
            }
            if (videoSegment.mo96911j() != this.f101767I.f100798d) {
                z = true;
            }
            if (videoSegment.f100769k != this.f101767I.f100797c) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: g */
    public void mo97604g() {
        this.f101806e.f100395b.observe(this.f101804c, new C39253d(this));
        if (this.f101800ar) {
            this.f101806e.f100397d.observe(this.f101804c, new C39254e(this));
            this.f101806e.f100398e.observe(this.f101804c, new C39255f(this));
            this.f101806e.f100399f.observe(this.f101804c, new C39256g(this));
            this.f101806e.f100400g.observe(this.f101804c, new C39257h(this));
            this.f101806e.f100401h.observe(this.f101804c, new C39258i(this));
            this.f101806e.f100402i.observe(this.f101804c, new C39259j(this));
        }
    }

    public C0902i<Long, Long> getMultiVideoPlayBoundary() {
        return C0902i.m3837a(Long.valueOf(C38783b.m123867a(this.f101805d.mo97721n(), (this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e, this.f101805d.mo97722o())), Long.valueOf(C38783b.m123867a(this.f101805d.mo97721n(), (this.f101760B + ((float) C38774k.f100746d) + this.f101761C) * this.f101821t.f100786e, this.f101805d.mo97722o())));
    }

    /* renamed from: i */
    public void mo97613i() {
        if (this.f101816o != null) {
            int a = (int) ((((((float) this.f101821t.mo96918a(this.f101763E)) / this.f101821t.f100786e) - this.f101760B) - ((float) (C38774k.f100746d * 2))) - this.f101761C);
            int startX = (int) ((((float) this.f101803b) - this.f101807f.getStartX()) - ((float) C38774k.f100746d));
            if (a >= startX) {
                a = startX;
            }
            if (a < 0) {
                a = 0;
            }
            LayoutParams layoutParams = new LayoutParams(a, this.f101768J);
            int i = startX - a;
            layoutParams.rightMargin = i;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(i);
            }
            layoutParams.topMargin = this.f101771M;
            layoutParams.gravity = 8388613;
            this.f101816o.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo97616l() {
        this.f101805d.mo97696a(this.f101767I, this.f101764F);
        this.f101805d.mo97692a(this.f101764F, getOverXScroll());
        this.f101821t.mo96921a(((VideoSegment) this.f101805d.mo97721n().get(this.f101764F)).mo96908g(), this.f101767I.f100798d);
        this.f101806e.mo96669a(((VideoSegment) this.f101805d.mo97721n().get(this.f101764F)).mo96908g());
    }

    /* renamed from: n */
    public final void mo97665n() {
        boolean z;
        if (this.f101792aj) {
            this.f101810i.setX(m125301a((View) this.f101808g, (View) this.f101810i));
            this.f101809h.setX(m125301a((View) this.f101807f, (View) this.f101809h));
            float f = 0.0f;
            if (Math.abs(this.f101810i.getX() - this.f101809h.getX()) - (((float) (this.f101810i.getWidth() + this.f101809h.getWidth())) / 2.0f) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = 1.0f;
            }
            if (this.f101810i.getAlpha() != f) {
                this.f101810i.animate().alpha(f).setDuration(150).start();
                this.f101809h.animate().alpha(f).setDuration(150).start();
            }
        }
    }

    /* renamed from: o */
    public final void mo97666o() {
        this.f101808g.setStartX((float) this.f101772N);
        this.f101807f.setStartX((float) ((this.f101803b - this.f101772N) - C38774k.f100746d));
        m125305a((int) this.f101808g.getStartX(), (int) this.f101807f.getStartX());
        getCurrentFrameRecyclerView().scrollBy(-this.f101762D, 0);
        this.f101762D = 0;
        mo97635b();
        mo97612h();
        m125318v();
        mo97613i();
        this.f101805d.mo97715h();
        this.f101805d.mo97716i();
        this.f101805d.mo97709d();
        this.f101805d.mo97706c();
    }

    /* renamed from: D */
    private void m125300D() {
        String str;
        String a = C1642a.m8035a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.f101761C * this.f101821t.f100786e) / 1000.0f)});
        String str2 = "";
        if (!(this.f101818q == null || this.f101808g == null || this.f101806e.f100395b.getValue() == null)) {
            str2 = C1642a.m8035a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) ((Long) this.f101806e.f100395b.getValue()).longValue()) / 1000.0f)});
        }
        if (this.f101806e.f100394a.getValue() == null) {
            str = "";
        } else {
            str = ((C0902i) this.f101806e.f100394a.getValue()).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.cb0, new Object[]{a}));
        sb.append(";curPointer:");
        sb.append(str2);
        sb.append("s;Totalspeed:");
        sb.append(this.f101805d.mo97722o());
        sb.append(";mOneWidthDur:");
        sb.append(this.f101821t.f100786e);
        sb.append("\npair:");
        sb.append(str);
        sb.append(";curOriginIndex:");
        sb.append(this.f101764F);
        sb.append(";curEditIndex:");
        sb.append(this.f101765G);
        sb.append("\n");
    }

    /* renamed from: z */
    private void m125322z() {
        this.f101815n = new View(this.f101804c);
        this.f101816o = new View(this.f101804c);
        this.f101786ad = C42111b.f109618a.mo103542a(false, false, true, false, false);
        this.f101815n.setBackgroundColor(this.f101786ad);
        this.f101816o.setBackgroundColor(this.f101786ad);
        int i = this.f101762D - C38774k.f100746d;
        if (i < 0) {
            i = 0;
        }
        LayoutParams layoutParams = new LayoutParams(i, this.f101768J);
        layoutParams.topMargin = (int) C9738o.m28708b((Context) this.f101804c, 7.0f);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = this.f101772N - i;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f101772N - i);
        }
        this.f101815n.setLayoutParams(layoutParams);
        int a = (int) ((((((float) this.f101821t.mo96918a(this.f101763E)) / this.f101821t.f100786e) - ((float) this.f101762D)) - this.f101761C) - ((float) C38774k.f100746d));
        if (a < 0) {
            a = 0;
        }
        int i2 = this.f101772N;
        if (a >= i2) {
            a = i2;
        }
        LayoutParams layoutParams2 = new LayoutParams(a, this.f101768J);
        layoutParams2.topMargin = (int) C9738o.m28708b((Context) this.f101804c, 7.0f);
        int i3 = i2 - a;
        layoutParams2.rightMargin = i3;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd(i3);
        }
        layoutParams2.gravity = 8388613;
        this.f101816o.setLayoutParams(layoutParams2);
        this.f101822u.addView(this.f101815n);
        this.f101822u.addView(this.f101816o);
    }

    /* renamed from: c */
    public final void mo97640c() {
        this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
        mo97621a((float) this.f101772N, (float) ((this.f101803b - this.f101772N) - C38774k.f100746d), 0);
        this.f101823v.mo5541b(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f101805d.mo97721n()) {
            if (!videoSegment.f100768j) {
                arrayList.add(videoSegment);
            }
        }
        this.f101826y.mo97586a((List<VideoSegment>) arrayList);
    }

    /* renamed from: x */
    private void m125320x() {
        int i;
        View view = this.f101825x;
        if (this.f101799aq) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        int i2 = this.f101772N + C38774k.f100746d;
        this.f101825x.setBackground(C38501ax.m123066a(C42111b.f109618a.mo103546b(false), 0, (int) C9738o.m28708b(getContext(), 1.0f), 0));
        LayoutParams layoutParams = (LayoutParams) this.f101825x.getLayoutParams();
        layoutParams.topMargin = this.f101771M;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i2);
        }
        this.f101825x.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) this.f101824w.getLayoutParams();
        layoutParams2.topMargin = this.f101771M;
        this.f101824w.setLayoutParams(layoutParams2);
        this.f101824w.setPadding(this.f101772N + C38774k.f100746d, 0, this.f101772N + C38774k.f100746d, 0);
        LayoutParams layoutParams3 = (LayoutParams) this.f101823v.getLayoutParams();
        layoutParams3.topMargin = this.f101771M;
        this.f101823v.setLayoutParams(layoutParams3);
        this.f101823v.setPadding(this.f101772N + C38774k.f100746d, 0, this.f101772N + C38774k.f100746d, 0);
        if (this.f101759A != null) {
            FramesAdapter framesAdapter = new FramesAdapter(this.f101804c, new int[]{this.f101796an, this.f101768J}, this.f101805d.mo97721n(), this.f101821t.f100783b, 2, this.f101824w, this.f101759A);
            this.f101827z = framesAdapter;
        } else {
            FramesAdapter framesAdapter2 = new FramesAdapter(this.f101804c, new int[]{this.f101796an, this.f101768J}, this.f101805d.mo97721n(), this.f101821t.f100783b, 2, this.f101824w);
            this.f101827z = framesAdapter2;
        }
        this.f101827z.mo97587a(this.f101793ak);
        this.f101824w.setAdapter(this.f101827z);
        this.f101824w.setLayoutManager(new MVLinearLayoutManager(this.f101804c, 0, false));
        this.f101824w.mo5528a(this.f101802at);
        this.f101824w.setflingScale(0.12d);
        if (this.f101759A != null) {
            FramesAdapter framesAdapter3 = new FramesAdapter(this.f101804c, new int[]{this.f101796an, this.f101768J}, this.f101805d.mo97721n(), this.f101821t.f100783b, 1, this.f101823v, this.f101759A);
            this.f101826y = framesAdapter3;
        } else {
            FramesAdapter framesAdapter4 = new FramesAdapter(this.f101804c, new int[]{this.f101796an, this.f101768J}, this.f101805d.mo97721n(), this.f101821t.f100783b, 1, this.f101823v);
            this.f101826y = framesAdapter4;
        }
        this.f101826y.mo97587a(this.f101793ak);
        this.f101823v.setAdapter(this.f101826y);
        this.f101823v.setLayoutManager(new ScrollInterceptedLayoutManager(this.f101804c, 0, false));
        this.f101823v.setflingScale(0.12d);
        this.f101823v.mo5528a(this.f101802at);
        if (this.f101763E == 0) {
            this.f101824w.setVisibility(0);
            this.f101823v.setVisibility(8);
            if (this.f101806e.f100404k) {
                this.f101827z.f101744m = true;
                this.f101827z.f101745n = this.f101789ag;
            }
            this.f101827z.f101740i = this.f101791ai;
            this.f101827z.f101739h = this.f101790ah;
        } else {
            this.f101824w.setVisibility(8);
            this.f101823v.setVisibility(0);
        }
        if (this.f101788af) {
            mo97620a();
        }
        this.f101819r.setImageDrawable(C38501ax.m123066a(C42111b.f109618a.mo103547c(), -1, 1, this.f101794al / 2));
    }

    /* renamed from: b */
    public final void mo97635b() {
        this.f101761C = (this.f101807f.getStartX() - this.f101808g.getStartX()) - ((float) C38774k.f100746d);
        this.f101760B = (((float) (this.f101762D - C38774k.f100746d)) + this.f101808g.getStartX()) - ((float) this.f101772N);
        if (!(1 == this.f101763E || this.f101767I == null)) {
            C0902i singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.f101767I.f100795a = ((Long) singleVideoPlayBoundary.f3154a).longValue();
            this.f101767I.f100796b = ((Long) singleVideoPlayBoundary.f3155b).longValue();
            if (this.f101783aa != 2 && this.f101763E == 0) {
                this.f101805d.mo97696a(this.f101767I, 0);
            }
        }
        m125300D();
        m125317u();
    }

    /* renamed from: w */
    private void m125319w() {
        this.f101808g = new RTLImageView(this.f101804c);
        this.f101808g.setScaleType(ScaleType.FIT_XY);
        this.f101811j = new LayoutParams(C38774k.f100746d, this.f101769K);
        this.f101811j.topMargin = this.f101797ao;
        this.f101811j.leftMargin = this.f101772N;
        if (VERSION.SDK_INT >= 17) {
            this.f101811j.setMarginStart(this.f101772N);
        }
        this.f101808g.setLayoutParams(this.f101811j);
        if (C43127fh.m136806a(this.f101804c)) {
            this.f101808g.setLeft(this.f101803b - this.f101772N);
        } else {
            this.f101808g.setLeft(this.f101811j.leftMargin);
        }
        this.f101808g.setOnTouchListener(this);
        this.f101808g.setTag("startSlide");
        this.f101822u.addView(this.f101808g);
        this.f101810i = m125302a((Context) this.f101804c);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.topMargin = (int) (((float) (this.f101811j.topMargin + this.f101811j.height)) + C9738o.m28708b((Context) this.f101804c, 4.0f));
        layoutParams.leftMargin = this.f101772N;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f101772N);
        }
        this.f101810i.setLayoutParams(layoutParams);
        this.f101810i.setTag("startSlideTime");
        this.f101822u.addView(this.f101810i);
        this.f101810i.addTextChangedListener(new C23467g() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo97682a() {
                VideoEditView.this.mo97665n();
            }

            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f101810i.post(new C39262m(this));
            }
        });
        this.f101807f = new RTLImageView(this.f101804c);
        this.f101807f.setScaleType(ScaleType.FIT_XY);
        this.f101812k = new LayoutParams(C38774k.f100746d + C38774k.f100750h, this.f101769K);
        this.f101812k.topMargin = this.f101797ao;
        this.f101812k.leftMargin = (this.f101803b - this.f101772N) - C38774k.f100746d;
        if (VERSION.SDK_INT >= 17) {
            this.f101812k.setMarginStart((this.f101803b - this.f101772N) - C38774k.f100746d);
        }
        this.f101807f.setLayoutParams(this.f101812k);
        if (C43127fh.m136806a(this.f101804c)) {
            this.f101807f.setLeft(this.f101772N);
        } else {
            this.f101807f.setLeft(this.f101812k.leftMargin);
        }
        this.f101807f.setOnTouchListener(this);
        this.f101807f.setPadding(0, 0, C38774k.f100750h, 0);
        if (VERSION.SDK_INT >= 17) {
            this.f101807f.setPaddingRelative(0, 0, C38774k.f100750h, 0);
        }
        this.f101807f.setTag("endSlide");
        this.f101822u.addView(this.f101807f);
        this.f101809h = m125302a((Context) this.f101804c);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) (((float) (this.f101812k.topMargin + this.f101812k.height)) + C9738o.m28708b((Context) this.f101804c, 4.0f));
        layoutParams2.leftMargin = (this.f101803b - this.f101772N) - C38774k.f100746d;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(this.f101772N);
        }
        this.f101809h.setLayoutParams(layoutParams2);
        this.f101809h.setTag("endSlideTime");
        this.f101822u.addView(this.f101809h);
        this.f101809h.addTextChangedListener(new C23467g() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo97683a() {
                VideoEditView.this.mo97665n();
            }

            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f101809h.post(new C39263n(this));
            }
        });
        mo97617m();
        this.f101813l = new View(this.f101804c);
        this.f101814m = new View(this.f101804c);
        this.f101813l.setBackgroundColor(this.f101804c.getResources().getColor(R.color.a76));
        this.f101814m.setBackgroundColor(this.f101804c.getResources().getColor(R.color.a76));
        this.f101822u.addView(this.f101813l);
        this.f101822u.addView(this.f101814m);
        m125305a(this.f101772N, (this.f101803b - this.f101772N) - C38774k.f100746d);
        LayoutParams layoutParams3 = (LayoutParams) this.f101818q.getLayoutParams();
        layoutParams3.leftMargin = this.f101772N + C38774k.f100746d;
        layoutParams3.height = this.f101795am;
        if (VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(this.f101772N + C38774k.f100746d);
        }
        this.f101818q.setLayoutParams(layoutParams3);
        this.f101818q.setTag("curPoint");
        this.f101818q.setOnTouchListener(this);
        if (this.f101818q != null) {
            this.f101822u.removeView(this.f101818q);
            this.f101822u.addView(this.f101818q);
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f101819r.getLayoutParams();
        layoutParams4.width = this.f101794al;
        this.f101819r.setLayoutParams(layoutParams4);
        m125312c(this.f101792aj);
        m125321y();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97627a(Void voidR) {
        mo97615k();
    }

    public void setCanEdit(boolean z) {
        this.f101800ar = z;
    }

    public void setExtractFramesInRoughMode(boolean z) {
        this.f101793ak = z;
    }

    public void setFirstFrameBitmapLiveData(C0052o<Bitmap> oVar) {
        this.f101790ah = oVar;
    }

    public void setFirstFrameVisibleLiveData(C0052o<Boolean> oVar) {
        this.f101791ai = oVar;
    }

    public void setLoadThumbnailDirectly(boolean z) {
        this.f101788af = z;
    }

    public void setMaxVideoLength(long j) {
        this.f101775Q = j;
    }

    public void setMinVideoLength(long j) {
        this.f101774P = j;
    }

    public void setPointerScaleRatio(float f) {
        this.f101773O = f;
    }

    public void setPointerType(int i) {
        this.f101783aa = i;
    }

    public void setVeEditor(C15389d dVar) {
        this.f101789ag = dVar;
    }

    public VideoEditView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97625a(Float f) {
        m125304a(f.floatValue());
    }

    private void setCurPointerContainerStartX(float f) {
        this.f101818q.setStartX(m125309b(f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97626a(Long l) {
        this.f101781W = l.longValue();
        mo97595a(this.f101763E, this.f101781W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo97638b(Void voidR) {
        mo97614j();
    }

    public void setEnableBoundaryText(boolean z) {
        if (z != this.f101792aj) {
            m125312c(z);
        }
        this.f101792aj = z;
    }

    /* renamed from: c */
    private void m125312c(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f101810i.setVisibility(i);
        this.f101809h.setVisibility(i);
    }

    public void setEnabled(boolean z) {
        this.f101787ae = z;
        if (this.f101823v.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.f101823v.getLayoutManager()).f100758a = z;
        }
    }

    /* renamed from: a */
    private TextView m125302a(Context context) {
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context);
        aVDmtTextView.setTextColor(C42111b.f109618a.mo103546b(false));
        aVDmtTextView.setTextSize(11.0f);
        aVDmtTextView.setClickable(true);
        aVDmtTextView.mo103533b();
        aVDmtTextView.setOnTouchListener(this);
        return aVDmtTextView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo97641c(Void voidR) {
        this.f101767I.f100797c += 90;
        if (this.f101767I.f100797c >= 360) {
            this.f101767I.f100797c = 0;
        }
        if (this.f101763E == 0) {
            this.f101805d.mo97696a(this.f101767I, 0);
        }
    }

    /* renamed from: b */
    private float m125309b(float f) {
        if (f <= ((float) (this.f101772N + C38774k.f100746d))) {
            return (float) ((this.f101772N + C38774k.f100746d) - C38774k.f100749g);
        }
        if (f >= ((float) (((this.f101803b - this.f101772N) - C38774k.f100746d) - C38774k.f100747e))) {
            return (float) ((((this.f101803b - this.f101772N) - C38774k.f100746d) - C38774k.f100747e) + C38774k.f100749g);
        }
        return f + (((float) C38774k.f100749g) * (((2.0f * f) / ((float) ((this.f101803b - this.f101772N) - C38774k.f100746d))) - 4.0f));
    }

    /* renamed from: c */
    private void m125311c(float f) {
        if ((this.f101807f.getStartX() - f) - ((float) C38774k.f100746d) < this.f101821t.f100788g) {
            m125298B();
            m125299C();
            f = (this.f101807f.getStartX() - ((float) C38774k.f100746d)) - this.f101821t.f100788g;
        }
        if (f < ((float) this.f101772N)) {
            if (this.f101807f.getStartX() == ((float) ((this.f101803b - this.f101772N) - C38774k.f100746d))) {
                m125299C();
            }
            f = (float) this.f101772N;
        }
        this.f101808g.setStartX(f);
        setCurPointerContainerStartX(f + ((float) C38774k.f100746d));
        m125305a((int) this.f101808g.getStartX(), (int) this.f101807f.getStartX());
        mo97635b();
        this.f101805d.mo97689a();
        mo97612h();
        m125318v();
    }

    /* renamed from: a */
    private void m125304a(float f) {
        if (this.f101763E == 1) {
            this.f101805d.mo97707c(f);
        } else {
            this.f101767I.f100798d = f;
            if (this.f101763E == 0) {
                this.f101805d.mo97696a(this.f101767I, 0);
            }
        }
        if (this.f101763E == 1) {
            this.f101821t.mo96922a(this.f101805d.mo97721n(), this.f101805d.mo97722o());
            this.f101826y.mo97582a((C0043i) this.f101804c, this.f101821t.f100783b, this.f101763E, true);
            this.f101823v.mo5541b(0);
        } else {
            this.f101821t.mo96920a(((VideoSegment) this.f101805d.mo97721n().get(this.f101764F)).f100761c, ((VideoSegment) this.f101805d.mo97721n().get(this.f101764F)).mo96908g(), this.f101767I.f100798d, this.f101763E);
            this.f101827z.mo97583a((C0043i) this.f101804c, this.f101821t.f100783b, (VideoSegment) this.f101805d.mo97721n().get(this.f101764F), true);
            this.f101824w.mo5541b(0);
        }
        mo97621a((float) this.f101772N, (float) ((this.f101803b - this.f101772N) - C38774k.f100746d), 0);
        m125300D();
        if (this.f101763E == 0) {
            this.f101821t.mo96921a(((VideoSegment) this.f101805d.mo97721n().get(this.f101764F)).mo96908g(), this.f101767I.f100798d);
        }
        this.f101805d.mo97701b(f);
    }

    /* renamed from: d */
    private void m125313d(float f) {
        if (f > ((float) ((this.f101803b - this.f101772N) - C38774k.f100746d))) {
            f = (float) ((this.f101803b - this.f101772N) - C38774k.f100746d);
            if (this.f101808g.getStartX() == ((float) this.f101772N)) {
                m125299C();
            }
        }
        if ((f - this.f101808g.getStartX()) - ((float) C38774k.f100746d) < this.f101821t.f100788g) {
            m125298B();
            m125299C();
            f = this.f101808g.getStartX() + this.f101821t.f100788g + ((float) C38774k.f100746d);
        }
        this.f101807f.setStartX(f);
        setCurPointerContainerStartX(this.f101807f.getStartX() - ((float) this.f101819r.getWidth()));
        m125305a((int) this.f101808g.getStartX(), (int) this.f101807f.getStartX());
        mo97635b();
        this.f101805d.mo97700b();
        mo97613i();
        m125318v();
    }

    /* renamed from: b */
    public final void mo97639b(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 4;
        if (this.f101808g != null) {
            RTLImageView rTLImageView = this.f101808g;
            if (z) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            rTLImageView.setVisibility(i8);
        }
        if (this.f101810i != null && this.f101792aj) {
            TextView textView = this.f101810i;
            if (z) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            textView.setVisibility(i7);
        }
        if (this.f101807f != null) {
            RTLImageView rTLImageView2 = this.f101807f;
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            rTLImageView2.setVisibility(i6);
        }
        if (this.f101809h != null && this.f101792aj) {
            TextView textView2 = this.f101809h;
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            textView2.setVisibility(i5);
        }
        if (this.f101813l != null) {
            View view = this.f101813l;
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        if (this.f101814m != null) {
            View view2 = this.f101814m;
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
        if (this.f101815n != null) {
            View view3 = this.f101815n;
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
        if (this.f101816o != null) {
            View view4 = this.f101816o;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view4.setVisibility(i);
        }
        if (this.f101817p != null) {
            View view5 = this.f101817p;
            if (z) {
                i9 = 0;
            }
            view5.setVisibility(i9);
        }
    }

    public VideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m125301a(View view, View view2) {
        return (view.getX() + (((float) (view.getMeasuredWidth() - view.getPaddingRight())) / 2.0f)) - (((float) view2.getMeasuredWidth()) / 2.0f);
    }

    /* renamed from: a */
    private static MediaModel m125303a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        if (cutMultiVideoViewModel.f100404k) {
            MediaModel mediaModel = new MediaModel(-1);
            mediaModel.f88156b = str;
            mediaModel.f88163i = 720;
            mediaModel.f88164j = 1280;
            mediaModel.f88159e = (long) cutMultiVideoViewModel.f100405l;
            return mediaModel;
        }
        int[] iArr = new int[10];
        if (C42133c.m134093a(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel2 = new MediaModel(-1);
        mediaModel2.f88156b = str;
        mediaModel2.f88163i = iArr[0];
        mediaModel2.f88164j = iArr[1];
        mediaModel2.f88159e = (long) iArr[3];
        return mediaModel2;
    }

    /* renamed from: b */
    private void m125310b(float f, boolean z) {
        float f2;
        float f3;
        if (z) {
            f2 = this.f101808g.getStartX() + f;
            if (f2 < ((float) this.f101772N)) {
                m125299C();
                return;
            }
            f3 = this.f101807f.getStartX() + f;
        } else {
            f3 = f + this.f101807f.getStartX();
            if (f3 > ((float) ((this.f101803b - this.f101772N) - C38774k.f100746d))) {
                m125299C();
                return;
            }
            f2 = this.f101808g.getStartX() + f;
        }
        this.f101808g.setStartX(f2);
        this.f101807f.setStartX(f3);
        setCurPointerContainerStartX(f2 + ((float) C38774k.f100746d));
        m125305a((int) this.f101808g.getStartX(), (int) this.f101807f.getStartX());
        mo97635b();
        this.f101805d.mo97713f();
        mo97613i();
        mo97612h();
        m125318v();
    }

    /* renamed from: a */
    private void m125305a(int i, int i2) {
        if (this.f101813l != null && this.f101814m != null) {
            int i3 = C38774k.f100746d + i;
            int b = ((i2 - i) - C38774k.f100746d) + ((int) C9738o.m28708b((Context) this.f101804c, 1.0f));
            LayoutParams layoutParams = new LayoutParams(b, this.f101798ap);
            layoutParams.leftMargin = i3;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i3);
            }
            layoutParams.topMargin = this.f101797ao;
            this.f101813l.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(b, this.f101798ap);
            layoutParams2.leftMargin = i3;
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(i3);
            }
            layoutParams2.topMargin = (this.f101797ao + this.f101769K) - this.f101798ap;
            this.f101814m.setLayoutParams(layoutParams2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f101787ae) {
            return false;
        }
        String str = (String) view.getTag();
        if (str == null || !mo97601a(str)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f101820s = true;
                this.f101776R = motionEvent.getRawX();
                this.f101778T = this.f101776R;
                if (!str.equals("curPoint")) {
                    if (!str.equals("startSlide") && !str.equals("startSlideTime")) {
                        if (!str.equals("endSlide") && !str.equals("endSlideTime")) {
                            if (str.equals("block")) {
                                this.f101777S = (this.f101808g.getLeftX() + this.f101807f.getLeftX()) / 2.0f;
                                break;
                            }
                        } else {
                            this.f101777S = this.f101807f.getLeftX();
                            break;
                        }
                    } else {
                        this.f101777S = this.f101808g.getLeftX();
                        break;
                    }
                } else {
                    this.f101777S = this.f101818q.getLeftX();
                    this.f101779U = true;
                    this.f101805d.mo97698a(true);
                    break;
                }
                break;
            case 1:
                this.f101820s = false;
                this.f101780V = false;
                if (!str.equals("curPoint")) {
                    if (!str.equals("startSlide") && !str.equals("startSlideTime")) {
                        if (!str.equals("endSlide") && !str.equals("endSlideTime")) {
                            if (str.equals("block")) {
                                this.f101805d.mo97714g();
                                break;
                            }
                        } else {
                            this.f101805d.mo97709d();
                            break;
                        }
                    } else {
                        this.f101805d.mo97706c();
                        break;
                    }
                } else {
                    this.f101779U = false;
                    this.f101805d.mo97698a(false);
                    break;
                }
                break;
            case 2:
                this.f101820s = true;
                float rawX = motionEvent.getRawX();
                float f = this.f101777S + (rawX - this.f101776R);
                if (C43127fh.m136806a(this.f101804c)) {
                    f = ((float) this.f101803b) - f;
                }
                if (str.equals("curPoint")) {
                    this.f101779U = true;
                    this.f101805d.mo97698a(true);
                    mo97622a(f, true);
                } else if (str.equals("startSlide") || str.equals("startSlideTime")) {
                    m125311c(f);
                } else if (str.equals("endSlide") || str.equals("endSlideTime")) {
                    m125313d(f);
                } else if (str.equals("block")) {
                    float f2 = rawX - this.f101778T;
                    if (f2 < 0.0f) {
                        z = true;
                    }
                    if (C43127fh.m136806a(this.f101804c)) {
                        z = !z;
                        f2 = -f2;
                    }
                    m125310b(f2, z);
                }
                this.f101778T = rawX;
                break;
            case 3:
                C41543av.m132304a(this.f101819r, 1.0f);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private void mo97595a(int i, long j) {
        if (!this.f101820s && j != -1 && j != 1) {
            float f = 0.0f;
            if (i == 1) {
                f = this.f101821t.mo96917a(this.f101805d.mo97721n(), j, this.f101805d.mo97722o()) - this.f101760B;
            } else if (i == 2 || i == 0) {
                f = ((((float) j) * 1.0f) / (this.f101767I.f100798d * this.f101821t.f100786e)) - this.f101760B;
            }
            mo97622a(this.f101808g.getStartX() + f, false);
        }
    }

    /* renamed from: a */
    private void m125307a(Context context, AttributeSet attributeSet) {
        this.f101798ap = (int) C9738o.m28708b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.f101784ab = obtainStyledAttributes.getInt(1, 2);
            this.f101785ac = obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.vq));
            this.f101783aa = obtainStyledAttributes.getInt(7, 1);
            this.f101796an = Math.round(obtainStyledAttributes.getDimension(5, (float) C38774k.f100744b));
            this.f101768J = Math.round(obtainStyledAttributes.getDimension(4, (float) C38774k.f100743a));
            this.f101794al = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
            this.f101795am = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            this.f101770L = Math.round(obtainStyledAttributes.getDimension(6, 0.0f));
            this.f101799aq = obtainStyledAttributes.getBoolean(8, false);
            C38774k.f100745c = this.f101768J + (this.f101798ap * 2);
            this.f101769K = C38774k.f100745c;
            this.f101772N = this.f101770L - C38774k.f100746d;
            this.f101797ao = (this.f101795am - C38774k.f100745c) / 2;
            this.f101771M = (this.f101795am - this.f101768J) / 2;
            obtainStyledAttributes.recycle();
        }
    }

    public VideoEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f101773O = 1.0f;
        this.f101783aa = 1;
        this.f101784ab = 1;
        this.f101787ae = true;
        this.f101788af = true;
        this.f101796an = C38774k.f100744b;
        this.f101768J = C38774k.f100743a;
        this.f101772N = C23486n.m77122a(36.0d);
        this.f101800ar = true;
        this.f101802at = new C1281m() {

            /* renamed from: b */
            private boolean f101831b;

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    if (this.f101831b) {
                        VideoEditView.this.f101805d.mo97716i();
                        this.f101831b = false;
                    }
                    recyclerView.postDelayed(new Runnable() {
                        public final void run() {
                            VideoEditView.this.f101820s = false;
                        }
                    }, 100);
                } else {
                    VideoEditView.this.f101820s = true;
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i != 0) {
                    this.f101831b = true;
                    VideoEditView videoEditView = VideoEditView.this;
                    int i3 = videoEditView.f101762D;
                    if (C43127fh.m136806a(recyclerView.getContext())) {
                        i = -i;
                    }
                    videoEditView.f101762D = i3 + i;
                    VideoEditView.this.mo97635b();
                    VideoEditView.this.mo97612h();
                    VideoEditView.this.mo97613i();
                    VideoEditView.this.f101805d.mo97715h();
                }
            }
        };
        m125307a(context, attributeSet);
    }
}
