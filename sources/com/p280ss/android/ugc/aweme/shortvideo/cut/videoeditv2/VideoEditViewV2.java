package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.setting.AllowLongVideo;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38750f;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38785d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VideoEditViewV2 */
public abstract class VideoEditViewV2 extends AbstractVideoEditView implements OnTouchListener {

    /* renamed from: A */
    protected long f101934A = 0;

    /* renamed from: B */
    protected long f101935B = 0;

    /* renamed from: C */
    protected boolean f101936C;

    /* renamed from: D */
    protected boolean f101937D = false;

    /* renamed from: E */
    protected boolean f101938E = false;

    /* renamed from: F */
    protected long f101939F = 0;

    /* renamed from: G */
    protected Boolean f101940G = Boolean.valueOf(false);

    /* renamed from: H */
    protected float f101941H = 0.0f;

    /* renamed from: I */
    protected VEMediaParserProviderV2 f101942I;

    /* renamed from: J */
    public C38750f f101943J;

    /* renamed from: K */
    private DecelerateInterpolator f101944K = new DecelerateInterpolator();

    /* renamed from: L */
    private View f101945L;

    /* renamed from: M */
    private View f101946M;

    /* renamed from: N */
    private View f101947N;

    /* renamed from: O */
    private View f101948O;

    /* renamed from: P */
    private boolean f101949P;

    /* renamed from: Q */
    private SpeedyLinearLayoutManager f101950Q;

    /* renamed from: R */
    private SpeedyLinearLayoutManager f101951R;

    /* renamed from: S */
    private int f101952S;

    /* renamed from: T */
    private int f101953T;

    /* renamed from: U */
    private int f101954U;

    /* renamed from: V */
    private int f101955V = C39280c.f101999a;

    /* renamed from: W */
    private int f101956W;

    /* renamed from: a */
    protected ImageView f101957a;

    /* renamed from: aa */
    private int f101958aa;

    /* renamed from: ab */
    private int f101959ab;

    /* renamed from: ac */
    private int f101960ac;

    /* renamed from: ad */
    private int f101961ad = 0;

    /* renamed from: ae */
    private long f101962ae;

    /* renamed from: af */
    private C1281m f101963af = new C1281m() {
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                VideoEditViewV2.this.mo97777a(VideoEditViewV2.this.f101968c.getStartX() + ((float) C39280c.f102001c), false);
                VideoEditViewV2.this.f101938E = true;
                VideoEditViewV2.this.f101968c.setEnabled(false);
                VideoEditViewV2.this.f101967b.setEnabled(false);
            }
            if (i == 0) {
                VideoEditViewV2.this.f101968c.setEnabled(true);
                VideoEditViewV2.this.f101967b.setEnabled(true);
                if (VideoEditViewV2.this.f101938E) {
                    VideoEditViewV2.this.f101977l.mo97716i();
                    VideoEditViewV2.this.f101938E = false;
                    if (VideoEditViewV2.this.f101977l.mo97721n().size() > 8) {
                        VideoEditViewV2.this.f101942I.mo97758c();
                    }
                } else {
                    if (VideoEditViewV2.this.getLayoutManager().mo5446k() == 0) {
                        VideoEditViewV2.this.f101989x = 0;
                        VideoEditViewV2.this.f101991z = VideoEditViewV2.this.f101990y - VideoEditViewV2.this.f101989x;
                        VideoEditViewV2.this.f101977l.mo97690a(0.0f);
                    }
                    if (VideoEditViewV2.this.getLayoutManager().mo5448m() == VideoEditViewV2.this.getFrameAdapter().getItemCount() - 1) {
                        VideoEditViewV2.this.f101990y = VideoEditViewV2.this.f101988w;
                        VideoEditViewV2.this.f101991z = VideoEditViewV2.this.f101990y - VideoEditViewV2.this.f101989x;
                        VideoEditViewV2.this.f101977l.mo97690a(0.0f);
                    }
                }
            }
            super.onScrollStateChanged(recyclerView, i);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0) {
                if (VideoEditViewV2.this.f101940G.booleanValue()) {
                    VideoEditViewV2.this.mo97778a(i);
                } else {
                    VideoEditViewV2.this.mo97783b(i);
                }
                if (!VideoEditViewV2.this.f101938E) {
                    VideoEditViewV2.this.f101977l.mo97690a(VideoEditViewV2.this.f101982q);
                    if (VideoEditViewV2.this.f101943J != null) {
                        VideoEditViewV2.this.f101943J.mo96721b(VideoEditViewV2.this.getSelectedTime());
                    }
                }
            }
        }
    };

    /* renamed from: ag */
    private float f101964ag;

    /* renamed from: ah */
    private float f101965ah = 0.0f;

    /* renamed from: ai */
    private float f101966ai;

    /* renamed from: b */
    protected RTLImageView f101967b;

    /* renamed from: c */
    protected RTLImageView f101968c;

    /* renamed from: d */
    protected RTLLinearLayout f101969d;

    /* renamed from: e */
    protected AutoPollRecyclerView f101970e;

    /* renamed from: f */
    protected AutoPollRecyclerView f101971f;

    /* renamed from: g */
    protected InterceptFrameLayout f101972g;

    /* renamed from: h */
    protected int f101973h = 0;

    /* renamed from: i */
    protected long f101974i = C39280c.m125555c();

    /* renamed from: j */
    protected long f101975j = C39280c.m125551a();

    /* renamed from: k */
    protected FragmentActivity f101976k;

    /* renamed from: l */
    protected VideoEditViewModel f101977l;

    /* renamed from: m */
    protected CutMultiVideoViewModel f101978m;

    /* renamed from: n */
    protected C39278b f101979n;

    /* renamed from: o */
    protected FramesAdapterV2 f101980o;

    /* renamed from: p */
    protected FramesAdapterV2 f101981p;

    /* renamed from: q */
    protected float f101982q;

    /* renamed from: r */
    protected int f101983r;

    /* renamed from: s */
    protected int f101984s;

    /* renamed from: t */
    protected C38785d f101985t;

    /* renamed from: u */
    protected boolean f101986u = true;

    /* renamed from: v */
    protected int f101987v = C39280c.f102002d;

    /* renamed from: w */
    protected long f101988w = 0;

    /* renamed from: x */
    protected long f101989x = 0;

    /* renamed from: y */
    protected long f101990y = 0;

    /* renamed from: z */
    protected long f101991z = 0;

    /* renamed from: a */
    public final boolean mo97632a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.f101978m = cutMultiVideoViewModel;
        MediaModel a = C39280c.m125552a(str, cutMultiVideoViewModel);
        if (a == null) {
            return false;
        }
        return mo97633a(fragmentActivity, cutMultiVideoViewModel, Collections.singletonList(a));
    }

    /* renamed from: a */
    public final boolean mo97633a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        this.f101976k = fragmentActivity;
        this.f101983r = list.size() > 1 ? 1 : 0;
        this.f101978m = cutMultiVideoViewModel;
        this.f101977l = (VideoEditViewModel) C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        m125510a(cutMultiVideoViewModel, list);
        mo97773g();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97779a(int i, int i2) {
        if (this.f101945L != null && this.f101946M != null && i <= i2) {
            int i3 = C39280c.f102001c + i;
            int i4 = ((i2 - i) - C39280c.f102001c) + 1;
            LayoutParams layoutParams = (LayoutParams) this.f101945L.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            layoutParams.width = i4;
            layoutParams.height = this.f101960ac;
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = this.f101959ab;
            this.f101945L.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) this.f101946M.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LayoutParams(-2, -2);
            }
            layoutParams2.width = i4;
            layoutParams2.height = this.f101960ac;
            layoutParams2.leftMargin = i3;
            layoutParams2.topMargin = (this.f101959ab + this.f101956W) - this.f101960ac;
            this.f101946M.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97777a(float f, boolean z) {
        if (f < this.f101968c.getStartX() + ((float) C39280c.f102001c)) {
            f = this.f101968c.getStartX() + ((float) C39280c.f102001c);
        }
        if (f > this.f101967b.getStartX() - ((float) this.f101957a.getWidth())) {
            f = this.f101967b.getStartX() - ((float) this.f101957a.getWidth());
        }
        this.f101969d.setStartX(f);
        if (z) {
            if (this.f101983r == 2) {
                this.f101977l.mo97693a(getSinglePlayingPosition());
                return;
            }
            this.f101977l.mo97693a(getMultiPlayingPosition());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97781a(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            m125512b(floatValue);
        } else {
            m125516c(floatValue);
        }
    }

    /* renamed from: a */
    public final void mo97778a(int i) {
        float abs = ((float) Math.abs(i)) * this.f101979n.f101994a;
        if (i > 0) {
            this.f101990y = (long) (((float) this.f101990y) + abs);
            if (this.f101990y >= this.f101988w) {
                this.f101990y = this.f101988w;
            }
            this.f101989x = this.f101990y - this.f101939F;
        } else {
            this.f101989x = (long) (((float) this.f101989x) - abs);
            if (this.f101989x <= 0) {
                this.f101989x = 0;
            }
            this.f101990y = this.f101989x + this.f101939F;
        }
        m125520n();
        m125521o();
        mo97635b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97780a(long j, long j2, long j3) {
        this.f101991z = j2 - j;
        this.f101991z = Math.min(j3, this.f101991z);
        this.f101989x = j;
        this.f101990y = j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo97791l() {
        m125520n();
        m125521o();
    }

    /* renamed from: s */
    private void m125525s() {
        if (!this.f101949P) {
            this.f101949P = true;
            C39280c.m125553a(this.f101976k);
        }
    }

    public FramesAdapterV2 getFrameAdapter() {
        if (this.f101983r == 1) {
            return this.f101980o;
        }
        return this.f101981p;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        if (this.f101983r == 1) {
            return this.f101950Q;
        }
        return this.f101951R;
    }

    /* access modifiers changed from: protected */
    public AutoPollRecyclerView getRecyclerView() {
        if (this.f101983r == 1) {
            return this.f101970e;
        }
        return this.f101971f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo97789j() {
        postDelayed(new C39291n(this), 100);
    }

    private long getSelectedTimeV2() {
        return (long) Math.round(((this.f101967b.getStartX() - this.f101968c.getStartX()) - ((float) C39280c.f102001c)) * this.f101979n.f101994a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo97773g() {
        this.f101984s = 0;
        m125509a(View.inflate(this.f101976k, R.layout.b1v, this));
        m125519m();
        m125523q();
        m125522p();
        m125524r();
        this.f101968c.bringToFront();
        this.f101967b.bringToFront();
        this.f101969d.bringToFront();
    }

    /* renamed from: n */
    private void m125520n() {
        int i;
        if (this.f101947N != null) {
            LayoutParams layoutParams = (LayoutParams) this.f101947N.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            float startX = this.f101968c.getStartX() + (((float) C39280c.f102001c) / 2.0f);
            int i2 = 0;
            View c = getLayoutManager().mo5432c(0);
            if (c != null) {
                i = (int) (startX - c.getX());
            } else {
                i = (int) startX;
            }
            if (i > 0) {
                i2 = i + 1;
            }
            this.f101947N.setX(startX - ((float) i2));
            layoutParams.width = i2;
            layoutParams.height = this.f101955V;
            layoutParams.topMargin = this.f101958aa;
            this.f101947N.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: o */
    private void m125521o() {
        int i;
        int i2;
        if (this.f101948O != null) {
            LayoutParams layoutParams = (LayoutParams) this.f101948O.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            float startX = this.f101967b.getStartX() + (((float) C39280c.f102001c) / 2.0f);
            View c = getLayoutManager().mo5432c(getLayoutManager().mo5744A() - 1);
            if (c != null) {
                i = (int) ((c.getX() + ((float) c.getWidth())) - startX);
            } else {
                i = (int) (((float) this.f101973h) - startX);
            }
            if (i <= 0) {
                i2 = 0;
            } else {
                i2 = i + 1;
            }
            this.f101948O.setX(startX);
            layoutParams.width = i2;
            layoutParams.height = this.f101955V;
            layoutParams.topMargin = this.f101958aa;
            this.f101948O.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo97788i() {
        if (this.f101991z != 0 && (this.f101967b.getStartX() - this.f101968c.getStartX()) - ((float) C39280c.f102001c) != this.f101982q) {
            long j = this.f101991z / 6;
            if (this.f101983r == 1) {
                Pair a = C39278b.m125545a(this.f101989x, (float) j, this.f101954U, this.f101977l.mo97721n());
                this.f101970e.mo97737i(((Integer) a.component1()).intValue(), -Math.round(((Float) a.component2()).floatValue()));
            } else {
                int i = (int) (this.f101989x / j);
                this.f101971f.mo97737i(i, -Math.round((((float) (this.f101989x - (((long) i) * j))) / ((float) j)) * ((float) this.f101954U)));
            }
            mo97789j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo97790k() {
        this.f101969d.setOnTouchListener(this);
        getRecyclerView().mo61102n();
        if (this.f101983r == 1) {
            if (this.f101991z != this.f101979n.f101995b) {
                this.f101979n.f101995b = this.f101991z;
                this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
                this.f101980o.mo97740a(this.f101979n.f101994a);
            }
        } else if (this.f101991z != this.f101979n.f101995b) {
            this.f101979n.f101995b = this.f101991z;
            this.f101979n.mo97796a(this.f101988w);
            this.f101981p.mo97741a(this.f101979n.f101994a, this.f101985t.f100798d);
        }
        mo97788i();
        m125511a(this.f101967b, (float) ((this.f101973h - this.f101987v) - C39280c.f102001c), false);
        m125511a(this.f101968c, (float) this.f101987v, true);
    }

    /* renamed from: m */
    private void m125519m() {
        VideoSegment videoSegment = (VideoSegment) this.f101977l.mo97721n().get(this.f101984s);
        if (this.f101983r != 1) {
            VideoSegment videoSegment2 = (VideoSegment) this.f101977l.mo97721n().get(0);
            this.f101985t = new C38785d(videoSegment2);
            this.f101988w = (long) (((float) videoSegment2.f100761c) / videoSegment2.mo96911j());
        } else {
            this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
        }
        this.f101991z = m125505a(this.f101988w, true);
        this.f101979n = new C39278b(this.f101982q);
        this.f101979n.f101996c = this.f101975j;
        this.f101979n.f101997d = this.f101974i;
        this.f101979n.f101995b = this.f101991z;
        this.f101989x = 0;
        this.f101990y = this.f101989x + this.f101991z;
        this.f101977l.mo97690a(this.f101982q);
        if (this.f101983r == 1) {
            this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        } else {
            this.f101979n.mo97797a(videoSegment.f100761c, videoSegment.mo96911j());
        }
    }

    /* renamed from: q */
    private void m125523q() {
        LayoutParams layoutParams = (LayoutParams) this.f101971f.getLayoutParams();
        layoutParams.topMargin = this.f101958aa;
        this.f101971f.setLayoutParams(layoutParams);
        this.f101971f.setPadding(this.f101987v + C39280c.f102001c, 0, this.f101987v + C39280c.f102001c, 0);
        FramesAdapterV2 framesAdapterV2 = new FramesAdapterV2(this.f101976k, new int[]{this.f101954U, this.f101955V}, this.f101979n.f101994a, this.f101942I, 0);
        this.f101981p = framesAdapterV2;
        this.f101981p.mo97746a(this.f101936C);
        this.f101971f.setAdapter(this.f101981p);
        this.f101951R = new SpeedyLinearLayoutManager(this.f101976k, 0, false);
        this.f101971f.setLayoutManager(this.f101951R);
        this.f101971f.mo5528a(this.f101963af);
        LayoutParams layoutParams2 = (LayoutParams) this.f101970e.getLayoutParams();
        layoutParams2.topMargin = this.f101958aa;
        this.f101970e.setLayoutParams(layoutParams2);
        this.f101970e.setPadding(this.f101987v + C39280c.f102001c, 0, this.f101987v + C39280c.f102001c, 0);
        FramesAdapterV2 framesAdapterV22 = new FramesAdapterV2(this.f101976k, new int[]{this.f101954U, this.f101955V}, this.f101979n.f101994a, this.f101942I, 1);
        this.f101980o = framesAdapterV22;
        this.f101980o.mo97746a(this.f101936C);
        this.f101970e.setAdapter(this.f101980o);
        this.f101950Q = new SpeedyLinearLayoutManager(this.f101976k, 0, false);
        this.f101970e.setLayoutManager(this.f101950Q);
        this.f101970e.mo5528a(this.f101963af);
        if (this.f101983r == 0) {
            this.f101971f.setVisibility(0);
            this.f101970e.setVisibility(8);
        } else {
            this.f101971f.setVisibility(8);
            this.f101970e.setVisibility(0);
        }
        if (this.f101986u) {
            mo97620a();
        }
    }

    /* renamed from: r */
    private void m125524r() {
        this.f101947N = new View(this.f101976k);
        this.f101948O = new View(this.f101976k);
        int a = C42111b.f109618a.mo103542a(false, false, true, false, false);
        this.f101947N.setBackgroundColor(a);
        this.f101948O.setBackgroundColor(a);
        LayoutParams layoutParams = new LayoutParams(0, this.f101955V);
        layoutParams.topMargin = this.f101958aa;
        this.f101947N.setLayoutParams(layoutParams);
        int startX = (int) (this.f101967b.getStartX() + ((float) (C39280c.f102001c / 2)));
        int i = ((int) (((float) (this.f101988w - this.f101990y)) / this.f101979n.f101994a)) - (C39280c.f102001c / 2);
        if (i > this.f101973h - startX) {
            i = this.f101973h - startX;
        }
        LayoutParams layoutParams2 = new LayoutParams(i + 2, this.f101955V);
        layoutParams2.topMargin = this.f101958aa;
        this.f101948O.setX((float) startX);
        this.f101948O.setLayoutParams(layoutParams2);
        addView(this.f101947N);
        addView(this.f101948O);
    }

    /* renamed from: t */
    private void m125526t() {
        this.f101969d.setOnTouchListener(this);
        if (this.f101940G.booleanValue()) {
            if (this.f101962ae < 0) {
                this.f101989x += this.f101962ae;
                if (this.f101989x <= 0) {
                    this.f101989x = 0;
                }
                this.f101990y = this.f101989x + this.f101939F;
            } else {
                this.f101990y += this.f101962ae;
                if (this.f101990y >= this.f101988w) {
                    this.f101990y = this.f101988w;
                }
                this.f101989x = this.f101990y - this.f101939F;
            }
            this.f101977l.mo97716i();
            return;
        }
        getRecyclerView().mo61102n();
        if (this.f101983r == 1) {
            if (this.f101991z != this.f101979n.f101995b) {
                this.f101979n.f101995b = this.f101991z;
                this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
                this.f101980o.mo97740a(this.f101979n.f101994a);
            }
        } else if (this.f101991z != this.f101979n.f101995b) {
            this.f101979n.f101995b = this.f101991z;
            this.f101979n.mo97796a(this.f101988w);
            this.f101981p.mo97741a(this.f101979n.f101994a, this.f101985t.f100798d);
        }
        mo97788i();
        m125511a(this.f101967b, (float) ((this.f101973h - this.f101987v) - C39280c.f102001c), false);
        m125511a(this.f101968c, (float) this.f101987v, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo97787h() {
        if (this.f101991z != 0) {
            long j = this.f101991z / 6;
            if (this.f101983r == 1) {
                Pair a = C39278b.m125545a(this.f101989x, (float) j, this.f101954U, this.f101977l.mo97721n());
                this.f101970e.mo97737i(((Integer) a.component1()).intValue(), -Math.round(((Float) a.component2()).floatValue()));
            } else {
                int i = (int) (this.f101989x / j);
                this.f101971f.mo97737i(i, -Math.round((((float) (this.f101989x - (((long) i) * j))) / ((float) j)) * ((float) this.f101954U)));
            }
            if (this.f101940G.booleanValue() && this.f101939F < 1000) {
                VideoSegment videoSegment = (VideoSegment) this.f101977l.mo97721n().get(this.f101984s);
                if (this.f101989x > videoSegment.f100761c - this.f101991z) {
                    float f = ((float) (this.f101989x - (videoSegment.f100761c - this.f101991z))) / this.f101979n.f101994a;
                    this.f101968c.setStartX(this.f101968c.getStartX() + f);
                    this.f101967b.setStartX(this.f101967b.getStartX() + f);
                    mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
                }
            }
            mo97789j();
        }
    }

    /* renamed from: p */
    private void m125522p() {
        this.f101968c = new RTLImageView(this.f101976k);
        this.f101968c.setScaleType(ScaleType.FIT_XY);
        this.f101968c.setPadding(C39280c.f102001c / 2, 0, 0, 0);
        this.f101968c.setImageResource(R.drawable.co7);
        LayoutParams layoutParams = new LayoutParams(C39280c.f102001c, this.f101956W);
        layoutParams.topMargin = this.f101959ab;
        this.f101968c.setLayoutParams(layoutParams);
        this.f101968c.setOnTouchListener(this);
        this.f101968c.setTag("startSlide");
        this.f101968c.setStartX((float) this.f101987v);
        addView(this.f101968c);
        this.f101967b = new RTLImageView(this.f101976k);
        this.f101967b.setScaleType(ScaleType.FIT_XY);
        this.f101967b.setPadding(0, 0, C39280c.f102001c / 2, 0);
        this.f101967b.setImageResource(R.drawable.co6);
        LayoutParams layoutParams2 = new LayoutParams(C39280c.f102001c, this.f101956W);
        layoutParams2.topMargin = this.f101959ab;
        this.f101967b.setLayoutParams(layoutParams2);
        this.f101967b.setOnTouchListener(this);
        this.f101967b.setTag("endSlide");
        this.f101967b.setStartX((float) ((this.f101973h - this.f101987v) - C39280c.f102001c));
        addView(this.f101967b);
        this.f101945L = new View(this.f101976k);
        this.f101946M = new View(this.f101976k);
        this.f101945L.setBackgroundColor(this.f101976k.getResources().getColor(R.color.a76));
        this.f101946M.setBackgroundColor(this.f101976k.getResources().getColor(R.color.a76));
        addView(this.f101945L);
        addView(this.f101946M);
        mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
        LayoutParams layoutParams3 = (LayoutParams) this.f101969d.getLayoutParams();
        layoutParams3.leftMargin = this.f101987v + C39280c.f102001c;
        layoutParams3.height = this.f101953T;
        this.f101969d.setLayoutParams(layoutParams3);
        this.f101969d.setTag("curPoint");
        this.f101969d.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f101957a.getLayoutParams();
        layoutParams4.width = this.f101952S;
        this.f101957a.setLayoutParams(layoutParams4);
        this.f101957a.setImageDrawable(C38501ax.m123066a(C42111b.f109618a.mo103547c(), -1, 1, this.f101952S / 2));
    }

    /* renamed from: b */
    public final void mo97635b() {
        if (this.f101985t != null) {
            if (this.f101983r != 1) {
                this.f101985t.f100795a = (long) (((float) this.f101989x) * this.f101985t.f100798d);
                this.f101985t.f100796b = (long) (((float) this.f101990y) * this.f101985t.f100798d);
            }
            if (this.f101983r == 0) {
                this.f101977l.mo97696a(this.f101985t, this.f101984s);
            }
        }
    }

    public void setSelfAdaptiontoastAnimListener(C38750f fVar) {
        this.f101943J = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo97782b(long j) {
        return m125505a(j, false);
    }

    /* access modifiers changed from: protected */
    public void setFocusOnMode(boolean z) {
        this.f101977l.f101853r.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private void mo97766a(float f) {
        if (this.f101965ah == 0.0f) {
            this.f101965ah = f;
            return;
        }
        if (Math.abs(this.f101965ah - f) > 3.0f) {
            this.f101965ah = f;
            this.f101977l.mo97715h();
        }
    }

    /* renamed from: b */
    private void m125512b(float f) {
        if (this.f101991z < this.f101974i) {
            m125515b(false);
            this.f101991z = this.f101974i;
            this.f101989x = this.f101990y - this.f101991z;
        } else {
            m125514b(f, true);
        }
        mo97635b();
        if (this.f101961ad == 1) {
            this.f101977l.mo97689a();
        }
    }

    /* renamed from: c */
    private void m125516c(float f) {
        if (this.f101991z < this.f101974i) {
            m125515b(false);
            this.f101991z = this.f101974i;
            this.f101990y = this.f101989x + this.f101974i;
        } else {
            m125514b(f, false);
        }
        mo97635b();
        if (this.f101961ad == 2) {
            this.f101977l.mo97700b();
        }
    }

    public void setEnabled(boolean z) {
        this.f101972g.setIntercept(!z);
        if (z) {
            this.f101968c.setEnabled(true);
            this.f101967b.setEnabled(true);
            this.f101969d.setEnabled(true);
            return;
        }
        if (this.f101961ad == 0) {
            this.f101968c.setEnabled(false);
            this.f101967b.setEnabled(false);
            this.f101969d.setEnabled(false);
        }
    }

    /* renamed from: a */
    private void m125509a(View view) {
        this.f101957a = (ImageView) view.findViewById(R.id.a5i);
        this.f101969d = (RTLLinearLayout) view.findViewById(R.id.a5j);
        this.f101970e = (AutoPollRecyclerView) view.findViewById(R.id.apa);
        this.f101971f = (AutoPollRecyclerView) view.findViewById(R.id.d73);
        this.f101972g = (InterceptFrameLayout) view.findViewById(R.id.cqh);
    }

    /* renamed from: b */
    private void m125515b(boolean z) {
        String str;
        if (!this.f101949P) {
            this.f101949P = true;
            C39280c.m125553a(this.f101976k);
            if (!z) {
                str = getResources().getString(R.string.fks, new Object[]{Float.valueOf(((float) this.f101974i) / 1000.0f)});
            } else if (C39280c.m125554b()) {
                str = getResources().getString(R.string.fkv);
            } else {
                str = getResources().getString(R.string.fkr, new Object[]{Long.valueOf(this.f101975j / 1000)});
            }
            C10761a.m31403c((Context) this.f101976k, str).mo25750a();
        }
    }

    /* renamed from: b */
    public final void mo97783b(int i) {
        if (this.f101961ad != 0) {
            if (i < 0) {
                this.f101967b.setStartX(this.f101967b.getStartX() - ((float) i));
            } else {
                this.f101968c.setStartX(this.f101968c.getStartX() - ((float) i));
            }
            m125520n();
            m125521o();
            mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
            this.f101991z = getSelectedTimeV2();
            switch (this.f101961ad) {
                case 1:
                    this.f101989x = this.f101990y - this.f101991z;
                    if (this.f101989x <= 0) {
                        this.f101989x = 0;
                        break;
                    }
                    break;
                case 2:
                    this.f101990y = this.f101989x + this.f101991z;
                    if (this.f101990y >= this.f101988w) {
                        this.f101990y = this.f101988w;
                        break;
                    }
                    break;
            }
            this.f101991z = this.f101990y - this.f101989x;
            if (this.f101991z > this.f101975j) {
                this.f101991z = this.f101975j;
                m125515b(true);
                getRecyclerView().mo61102n();
            }
        } else {
            if (i > 0) {
                this.f101990y = (long) (((float) this.f101990y) + (((float) Math.abs(i)) * this.f101979n.f101994a));
                if (this.f101990y >= this.f101988w) {
                    this.f101990y = this.f101988w;
                }
                this.f101989x = this.f101990y - this.f101991z;
            } else {
                this.f101989x = (long) (((float) this.f101989x) - (((float) Math.abs(i)) * this.f101979n.f101994a));
                if (this.f101989x <= 0) {
                    this.f101989x = 0;
                }
                this.f101990y = this.f101989x + this.f101991z;
            }
            m125520n();
            m125521o();
        }
        mo97635b();
    }

    /* renamed from: a */
    private long m125505a(long j, boolean z) {
        long min = Math.min(j, this.f101975j);
        if (!z || !C10292j.m30480a().mo25016a(AllowLongVideo.class, "allow_long_video", C6384b.m19835a().mo15294c().getAllowLongVideo())) {
            return min;
        }
        return Math.min(min, 60000);
    }

    /* renamed from: a */
    private void m125507a(float f, float f2) {
        if (f >= ((float) this.f101987v)) {
            this.f101965ah = 0.0f;
            getRecyclerView().mo61102n();
            this.f101989x += this.f101991z - getSelectedTimeV2();
            if (this.f101989x <= 0) {
                this.f101989x = 0;
            }
            this.f101991z = this.f101990y - this.f101989x;
            m125512b(f);
            mo97777a(this.f101968c.getStartX() + ((float) C39280c.f102001c), false);
        } else if (this.f101991z < this.f101975j) {
            mo97766a(f2);
            getRecyclerView().mo97738j(-1);
            mo97777a(this.f101968c.getStartX() + ((float) C39280c.f102001c), false);
        } else {
            m125515b(true);
            this.f101991z = this.f101975j;
            this.f101989x = this.f101990y - this.f101991z;
        }
    }

    /* renamed from: b */
    private void m125514b(float f, boolean z) {
        if (z) {
            this.f101968c.setStartX(f);
        } else {
            this.f101967b.setStartX(f);
        }
        mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
        if (z) {
            m125520n();
        } else {
            m125521o();
        }
    }

    /* renamed from: c */
    private void m125517c(float f, float f2) {
        if (f < ((float) this.f101987v) || this.f101941H + f + ((float) C39280c.f102001c) > ((float) ((this.f101973h - this.f101987v) - C39280c.f102001c))) {
            m125525s();
            return;
        }
        this.f101962ae = (long) (f2 * this.f101979n.f101994a);
        this.f101968c.setStartX(f);
        this.f101967b.setStartX(f + this.f101941H + ((float) C39280c.f102001c));
        mo97777a(this.f101968c.getStartX() + ((float) C39280c.f102001c), false);
        mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
        m125520n();
        m125521o();
    }

    /* renamed from: d */
    private void m125518d(float f, float f2) {
        if (((float) C39280c.f102001c) + f > ((float) (this.f101973h - this.f101987v)) || (f - ((float) C39280c.f102001c)) - this.f101941H < ((float) this.f101987v)) {
            m125525s();
            return;
        }
        this.f101962ae = (long) (f2 * this.f101979n.f101994a);
        this.f101967b.setStartX(f);
        this.f101968c.setStartX((f - ((float) C39280c.f102001c)) - this.f101941H);
        mo97777a(this.f101967b.getStartX() - ((float) this.f101957a.getWidth()), false);
        mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
        m125520n();
        m125521o();
    }

    /* renamed from: a */
    private void m125508a(Context context, AttributeSet attributeSet) {
        this.f101973h = C23482j.m77098b(context);
        this.f101960ac = (int) C9738o.m28708b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.f101952S = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
            this.f101953T = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            this.f101956W = this.f101955V + (this.f101960ac * 2);
            this.f101982q = (float) ((this.f101973h - (C39280c.f102001c * 2)) - (this.f101987v * 2));
            this.f101954U = Math.round(this.f101982q / 6.0f);
            this.f101959ab = (this.f101953T - C39280c.f102000b) / 2;
            this.f101958aa = (this.f101953T - this.f101955V) / 2;
            obtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(!C35563c.f93231M.mo93305a(Property.VEExtractFramesAfterRender));
    }

    /* renamed from: b */
    private void m125513b(float f, float f2) {
        if (((float) C39280c.f102001c) + f <= ((float) (this.f101973h - this.f101987v))) {
            this.f101965ah = 0.0f;
            getRecyclerView().mo61102n();
            this.f101990y -= this.f101991z - getSelectedTimeV2();
            if (this.f101990y >= this.f101988w) {
                this.f101990y = this.f101988w;
            }
            this.f101991z = this.f101990y - this.f101989x;
            m125516c(f);
            mo97777a(this.f101967b.getStartX() - ((float) this.f101957a.getWidth()), false);
        } else if (this.f101991z < this.f101975j) {
            mo97766a(f2);
            getRecyclerView().mo97738j(1);
            mo97777a(this.f101967b.getStartX() - ((float) this.f101957a.getWidth()), false);
        } else {
            m125515b(true);
            this.f101991z = this.f101975j;
            this.f101990y = this.f101989x + this.f101991z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r11.equals("curPoint") != false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            java.lang.Object r11 = r11.getTag()
            java.lang.String r11 = (java.lang.String) r11
            r0 = 0
            if (r11 != 0) goto L_0x000a
            return r0
        L_0x000a:
            int r1 = r12.getAction()
            r2 = 1714230678(0x662d1596, float:2.043419E23)
            r3 = 544295728(0x20714b30, float:2.0438371E-19)
            r4 = -1584466321(0xffffffffa18ef66f, float:-9.687525E-19)
            r5 = -1
            r6 = 2
            r7 = 1
            switch(r1) {
                case 0: goto L_0x0144;
                case 1: goto L_0x00d3;
                case 2: goto L_0x0049;
                case 3: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x01cf
        L_0x001f:
            r10.setFocusOnMode(r0)
            r10.f101961ad = r0
            r10.m125526t()
            android.widget.ImageView r12 = r10.f101957a
            r0 = 1065353216(0x3f800000, float:1.0)
            com.p280ss.android.ugc.aweme.shortvideo.util.C41543av.m132304a(r12, r0)
            java.lang.String r12 = "startSlide"
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x003e
            java.lang.String r12 = "endSlide"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01cf
        L_0x003e:
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            if (r11 == 0) goto L_0x01cf
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            r11.mo96719a()
            goto L_0x01cf
        L_0x0049:
            float r12 = r12.getRawX()
            float r1 = r10.f101964ag
            float r1 = r12 - r1
            float r8 = r10.f101966ai
            float r8 = r8 + r1
            int r9 = r11.hashCode()
            if (r9 == r4) goto L_0x0072
            if (r9 == r3) goto L_0x0069
            if (r9 == r2) goto L_0x005f
            goto L_0x007c
        L_0x005f:
            java.lang.String r0 = "endSlide"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x007c
            r0 = 2
            goto L_0x007d
        L_0x0069:
            java.lang.String r2 = "curPoint"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "startSlide"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = -1
        L_0x007d:
            r2 = 0
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x0097;
                case 2: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00b4
        L_0x0082:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r0 = r10.f101969d
            r0.setOnTouchListener(r2)
            java.lang.Boolean r0 = r10.f101940G
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0093
            r10.m125518d(r8, r1)
            goto L_0x00b4
        L_0x0093:
            r10.m125513b(r8, r12)
            goto L_0x00b4
        L_0x0097:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r0 = r10.f101969d
            r0.setOnTouchListener(r2)
            java.lang.Boolean r0 = r10.f101940G
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a8
            r10.m125517c(r8, r1)
            goto L_0x00b4
        L_0x00a8:
            r10.m125507a(r8, r12)
            goto L_0x00b4
        L_0x00ac:
            r10.mo97777a(r8, r7)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97698a(r7)
        L_0x00b4:
            java.lang.String r12 = "startSlide"
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x00c4
            java.lang.String r12 = "endSlide"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01cf
        L_0x00c4:
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            if (r11 == 0) goto L_0x01cf
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            float r12 = r10.getSelectedTime()
            r11.mo96721b(r12)
            goto L_0x01cf
        L_0x00d3:
            r10.f101937D = r0
            r10.f101949P = r0
            r10.f101961ad = r0
            r10.setFocusOnMode(r0)
            int r12 = r11.hashCode()
            if (r12 == r4) goto L_0x00fb
            if (r12 == r3) goto L_0x00f1
            if (r12 == r2) goto L_0x00e7
            goto L_0x0104
        L_0x00e7:
            java.lang.String r12 = "endSlide"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0104
            r5 = 2
            goto L_0x0104
        L_0x00f1:
            java.lang.String r12 = "curPoint"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0104
            r5 = 0
            goto L_0x0104
        L_0x00fb:
            java.lang.String r12 = "startSlide"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0104
            r5 = 1
        L_0x0104:
            switch(r5) {
                case 0: goto L_0x0124;
                case 1: goto L_0x0116;
                case 2: goto L_0x0108;
                default: goto L_0x0107;
            }
        L_0x0107:
            goto L_0x0129
        L_0x0108:
            r10.m125526t()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97709d()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97712e()
            goto L_0x0129
        L_0x0116:
            r10.m125526t()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97706c()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97712e()
            goto L_0x0129
        L_0x0124:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97698a(r0)
        L_0x0129:
            java.lang.String r12 = "startSlide"
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x0139
            java.lang.String r12 = "endSlide"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01cf
        L_0x0139:
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            if (r11 == 0) goto L_0x01cf
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            r11.mo96719a()
            goto L_0x01cf
        L_0x0144:
            float r12 = r12.getRawX()
            r10.f101964ag = r12
            r10.f101937D = r7
            r12 = 0
            r10.f101965ah = r12
            r8 = 0
            r10.f101962ae = r8
            int r12 = r11.hashCode()
            if (r12 == r4) goto L_0x0172
            if (r12 == r3) goto L_0x0168
            if (r12 == r2) goto L_0x015e
            goto L_0x017b
        L_0x015e:
            java.lang.String r12 = "endSlide"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x017b
            r5 = 2
            goto L_0x017b
        L_0x0168:
            java.lang.String r12 = "curPoint"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x017b
            r5 = 0
            goto L_0x017b
        L_0x0172:
            java.lang.String r12 = "startSlide"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x017b
            r5 = 1
        L_0x017b:
            switch(r5) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x0192;
                case 2: goto L_0x017f;
                default: goto L_0x017e;
            }
        L_0x017e:
            goto L_0x01b2
        L_0x017f:
            r10.f101961ad = r6
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView r12 = r10.f101967b
            float r12 = r12.getStartX()
            r10.f101966ai = r12
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView r12 = r10.f101968c
            r12.setEnabled(r0)
            r10.setFocusOnMode(r7)
            goto L_0x01b2
        L_0x0192:
            r10.f101961ad = r7
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView r12 = r10.f101968c
            float r12 = r12.getStartX()
            r10.f101966ai = r12
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView r12 = r10.f101967b
            r12.setEnabled(r0)
            r10.setFocusOnMode(r7)
            goto L_0x01b2
        L_0x01a5:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r12 = r10.f101969d
            float r12 = r12.getLeftX()
            r10.f101966ai = r12
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r12 = r10.f101977l
            r12.mo97698a(r7)
        L_0x01b2:
            java.lang.String r12 = "startSlide"
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x01c2
            java.lang.String r12 = "endSlide"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01cf
        L_0x01c2:
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            if (r11 == 0) goto L_0x01cf
            com.ss.android.ugc.aweme.shortvideo.cut.f r11 = r10.f101943J
            float r12 = r10.getSelectedTime()
            r11.mo96720a(r12)
        L_0x01cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VideoEditViewV2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m125510a(CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        if (cutMultiVideoViewModel.f100404k) {
            for (MediaModel mediaModel : list) {
                mediaModel.f88159e = (long) cutMultiVideoViewModel.f100405l;
                mediaModel.f88163i = 720;
                mediaModel.f88164j = 1280;
            }
        }
        this.f101977l.mo97697a(list);
    }

    public VideoEditViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m125508a(context, attributeSet);
        this.f101942I = new VEMediaParserProviderV2(context);
    }

    /* renamed from: a */
    private void m125511a(RTLImageView rTLImageView, float f, boolean z) {
        if (rTLImageView != null && Math.abs(rTLImageView.getStartX() - f) > 1.0f) {
            if (z) {
                if (rTLImageView.getStartX() < ((float) (-C39280c.f102001c))) {
                    rTLImageView.setStartX((float) (-C39280c.f102001c));
                }
            } else if (rTLImageView.getStartX() > ((float) (this.f101973h + 1))) {
                rTLImageView.setStartX((float) (this.f101973h + 1));
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{rTLImageView.getStartX(), f});
            ofFloat.setDuration(250);
            ofFloat.setInterpolator(this.f101944K);
            ofFloat.addUpdateListener(new C39290m(this, z));
            ofFloat.start();
        }
    }
}
