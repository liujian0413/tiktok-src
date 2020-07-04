package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38783b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView */
public final class VEVideoEditView extends VideoEditView {

    /* renamed from: O */
    private boolean f101754O;

    /* renamed from: P */
    private final float f101755P;

    /* renamed from: a */
    public long f101756a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$a */
    static final class C39242a<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f101757a;

        C39242a(VEVideoEditView vEVideoEditView) {
            this.f101757a = vEVideoEditView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (l != null) {
                VEVideoEditView vEVideoEditView = this.f101757a;
                C7573i.m23582a((Object) l, "it");
                vEVideoEditView.f101756a = l.longValue();
                this.f101757a.mo97595a(this.f101757a.f101763E, this.f101757a.f101756a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$b */
    static final class C39243b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f101758a;

        C39243b(VEVideoEditView vEVideoEditView) {
            this.f101758a = vEVideoEditView;
        }

        public final void run() {
            this.f101758a.mo97612h();
            this.f101758a.mo97613i();
        }
    }

    public VEVideoEditView(Context context) {
        this(context, null, 0, 6, null);
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo97601a(String str) {
        C7573i.m23587b(str, "tag");
        if (this.f101754O) {
            return true;
        }
        return super.mo97601a(str);
    }

    /* renamed from: e */
    public final void mo97603e() {
        this.f101805d.mo97719l();
    }

    public final long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    public final long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    public final long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    /* renamed from: j */
    public final void mo97614j() {
        super.mo97614j();
        m125279u();
    }

    /* renamed from: k */
    public final void mo97615k() {
        super.mo97615k();
        m125279u();
    }

    /* renamed from: u */
    private final void m125279u() {
        post(new C39243b(this));
    }

    public final long getLeftSeekingValue() {
        return (long) ((this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e);
    }

    /* renamed from: s */
    private final void m125277s() {
        this.f101808g.setOnTouchListener(null);
        this.f101807f.setOnTouchListener(null);
        this.f101818q.setOnTouchListener(null);
    }

    /* renamed from: g */
    public final void mo97604g() {
        super.mo97604g();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f101806e;
        C7573i.m23582a((Object) cutMultiVideoViewModel, "cutMultiVideoViewModel");
        cutMultiVideoViewModel.f100396c.observe(this.f101804c, new C39242a(this));
    }

    /* renamed from: r */
    private final void m125276r() {
        OnTouchListener onTouchListener = this;
        this.f101808g.setOnTouchListener(onTouchListener);
        RTLImageView rTLImageView = this.f101808g;
        C7573i.m23582a((Object) rTLImageView, "mStartSlide");
        rTLImageView.setTag("block");
        this.f101807f.setOnTouchListener(onTouchListener);
        RTLImageView rTLImageView2 = this.f101807f;
        C7573i.m23582a((Object) rTLImageView2, "mEndSlide");
        rTLImageView2.setTag("block");
        this.f101818q.setOnTouchListener(null);
    }

    /* renamed from: t */
    private final void m125278t() {
        OnTouchListener onTouchListener = this;
        this.f101808g.setOnTouchListener(onTouchListener);
        RTLImageView rTLImageView = this.f101808g;
        C7573i.m23582a((Object) rTLImageView, "mStartSlide");
        rTLImageView.setTag("startSlide");
        this.f101807f.setOnTouchListener(onTouchListener);
        RTLImageView rTLImageView2 = this.f101807f;
        C7573i.m23582a((Object) rTLImageView2, "mEndSlide");
        rTLImageView2.setTag("endSlide");
        this.f101818q.setOnTouchListener(onTouchListener);
    }

    /* renamed from: d */
    public final void mo97602d() {
        C38783b bVar = this.f101821t;
        VideoEditViewModel videoEditViewModel = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel, "videoEditViewModel");
        List n = videoEditViewModel.mo97721n();
        VideoEditViewModel videoEditViewModel2 = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel2, "videoEditViewModel");
        bVar.mo96922a(n, videoEditViewModel2.mo97722o());
        FramesAdapter framesAdapter = this.f101826y;
        C38783b bVar2 = this.f101821t;
        C7573i.m23582a((Object) bVar2, "frameParamState");
        framesAdapter.mo97585a(bVar2.f100783b);
    }

    public final long getPlayingPosition() {
        float f = this.f101760B;
        RTLLinearLayout rTLLinearLayout = this.f101818q;
        C7573i.m23582a((Object) rTLLinearLayout, "mCurPointerContainer");
        float startX = f + rTLLinearLayout.getStartX();
        RTLImageView rTLImageView = this.f101808g;
        C7573i.m23582a((Object) rTLImageView, "mStartSlide");
        return (long) ((startX - rTLImageView.getStartX()) * this.f101821t.f100786e);
    }

    public final long getRightSeekingValue() {
        float f = this.f101760B;
        RTLImageView rTLImageView = this.f101807f;
        C7573i.m23582a((Object) rTLImageView, "mEndSlide");
        float startX = f + rTLImageView.getStartX();
        RTLImageView rTLImageView2 = this.f101808g;
        C7573i.m23582a((Object) rTLImageView2, "mStartSlide");
        return (long) ((startX - rTLImageView2.getStartX()) * this.f101821t.f100786e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo97617m() {
        super.mo97617m();
        if (this.f101808g != null) {
            this.f101808g.setImageDrawable(m125275a(true, 3));
        }
        if (this.f101807f != null) {
            this.f101807f.setImageDrawable(m125275a(false, 3));
        }
    }

    public final C0902i<Long, Long> getMultiVideoPlayBoundary() {
        long j = (long) ((this.f101760B + ((float) C38774k.f100746d)) * this.f101821t.f100786e);
        long j2 = (long) ((this.f101760B + ((float) C38774k.f100746d) + this.f101761C) * this.f101821t.f100786e);
        VideoEditViewModel videoEditViewModel = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel, "videoEditViewModel");
        long a = m125274a(j, videoEditViewModel.mo97722o());
        VideoEditViewModel videoEditViewModel2 = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel2, "videoEditViewModel");
        return new C0902i<>(Long.valueOf(a), Long.valueOf(m125274a(j2, videoEditViewModel2.mo97722o())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo97616l() {
        this.f101805d.mo97696a(this.f101767I, this.f101764F);
        C38783b bVar = this.f101821t;
        VideoEditViewModel videoEditViewModel = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel, "videoEditViewModel");
        Object obj = videoEditViewModel.mo97721n().get(this.f101764F);
        C7573i.m23582a(obj, "videoEditViewModel.origi…t[currentEditOriginIndex]");
        bVar.mo96921a(((VideoSegment) obj).mo96908g(), this.f101767I.f100798d);
        VideoEditViewModel videoEditViewModel2 = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel2, "videoEditViewModel");
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo97721n().get(this.f101764F);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f101806e;
        C7573i.m23582a((Object) videoSegment, "video");
        cutMultiVideoViewModel.mo96669a(videoSegment.mo96908g());
        if (this.f101754O) {
            this.f101805d.mo97702b(this.f101764F, getOverXScroll());
        } else {
            this.f101805d.mo97692a(this.f101764F, getOverXScroll());
        }
    }

    /* renamed from: h */
    public final void mo97612h() {
        View view;
        float f;
        float f2;
        if (this.f101815n != null) {
            int i = 0;
            C1293v f3 = this.f101824w.mo5575f(0);
            if (this.f101763E == 1) {
                f3 = this.f101823v.mo5575f(0);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                RTLImageView rTLImageView = this.f101808g;
                C7573i.m23582a((Object) rTLImageView, "mStartSlide");
                float startX = rTLImageView.getStartX();
                if (this.f101754O) {
                    f4 = this.f101755P;
                }
                f = startX + f4;
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                if (iArr[0] < 0) {
                    RTLImageView rTLImageView2 = this.f101808g;
                    C7573i.m23582a((Object) rTLImageView2, "mStartSlide");
                    float startX2 = rTLImageView2.getStartX();
                    if (this.f101754O) {
                        f4 = this.f101755P;
                    }
                    f = startX2 + f4;
                } else {
                    RTLImageView rTLImageView3 = this.f101808g;
                    C7573i.m23582a((Object) rTLImageView3, "mStartSlide");
                    float startX3 = rTLImageView3.getStartX() - ((float) iArr[0]);
                    if (this.f101754O) {
                        f2 = this.f101755P;
                    } else {
                        f2 = 0.0f;
                    }
                    f = startX3 + f2;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    i = iArr[0];
                }
            }
            LayoutParams layoutParams = new LayoutParams((int) f, this.f101768J);
            layoutParams.topMargin = this.f101771M;
            layoutParams.leftMargin = i;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i);
            }
            View view2 = this.f101815n;
            C7573i.m23582a((Object) view2, "startCover");
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: i */
    public final void mo97613i() {
        View view;
        float f;
        float f2;
        if (this.f101816o != null) {
            MVRecycleView mVRecycleView = this.f101824w;
            FramesAdapter framesAdapter = this.f101827z;
            C7573i.m23582a((Object) framesAdapter, "singleFramesAdapter");
            C1293v f3 = mVRecycleView.mo5575f(framesAdapter.getItemCount() - 1);
            if (this.f101763E == 1) {
                MVRecycleView mVRecycleView2 = this.f101823v;
                FramesAdapter framesAdapter2 = this.f101826y;
                C7573i.m23582a((Object) framesAdapter2, "framesAdapter");
                f3 = mVRecycleView2.mo5575f(framesAdapter2.getItemCount() - 1);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                float f5 = (float) this.f101803b;
                RTLImageView rTLImageView = this.f101807f;
                C7573i.m23582a((Object) rTLImageView, "mEndSlide");
                float startX = (f5 - rTLImageView.getStartX()) - ((float) (C38774k.f100746d * 2));
                if (this.f101754O) {
                    f2 = this.f101755P;
                } else {
                    f2 = 0.0f;
                }
                f = startX + f2;
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                int i = iArr[0];
                View view2 = f3.itemView;
                C7573i.m23582a((Object) view2, "viewHolder.itemView");
                iArr[0] = i + view2.getWidth();
                float f6 = (float) iArr[0];
                RTLImageView rTLImageView2 = this.f101807f;
                C7573i.m23582a((Object) rTLImageView2, "mEndSlide");
                f = (f6 - rTLImageView2.getStartX()) - ((float) C38774k.f100746d);
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f7 = (float) this.f101803b;
                RTLImageView rTLImageView3 = this.f101807f;
                C7573i.m23582a((Object) rTLImageView3, "mEndSlide");
                float startX2 = ((f7 - rTLImageView3.getStartX()) - f) - ((float) C38774k.f100746d);
                if (this.f101754O) {
                    f4 = this.f101755P;
                }
                f4 += startX2;
            }
            LayoutParams layoutParams = new LayoutParams((int) f, this.f101768J);
            layoutParams.topMargin = this.f101771M;
            layoutParams.gravity = 5;
            int i2 = (int) f4;
            layoutParams.rightMargin = i2;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(i2);
                layoutParams.gravity = 8388613;
            }
            View view3 = this.f101816o;
            C7573i.m23582a((Object) view3, "endCover");
            view3.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo97597a(VideoSegment videoSegment) {
        C7573i.m23587b(videoSegment, "videoSegment");
        super.mo97637b(videoSegment);
        m125279u();
    }

    /* renamed from: a */
    public final void mo97600a(boolean z) {
        this.f101754O = z;
        mo97617m();
        if (z) {
            m125277s();
            MVRecycleView mVRecycleView = this.f101823v;
            C7573i.m23582a((Object) mVRecycleView, "frameRecyclerView");
            mVRecycleView.setVisibility(8);
            return;
        }
        m125278t();
        MVRecycleView mVRecycleView2 = this.f101823v;
        C7573i.m23582a((Object) mVRecycleView2, "frameRecyclerView");
        mVRecycleView2.setVisibility(0);
        m125279u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97596a(android.support.p022v4.util.C0902i<java.lang.Integer, java.lang.Integer> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            r0 = 2
            r12.f101763E = r0
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r12.f101805d
            r1.mo97691a(r0)
            F r0 = r13.f3154a
            if (r0 != 0) goto L_0x0014
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0014:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.f101765G = r0
            S r0 = r13.f3155b
            if (r0 != 0) goto L_0x0023
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0023:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.f101764F = r0
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f101805d
            java.lang.String r1 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.List r0 = r0.mo97721n()
            int r1 = r12.f101764F
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = r12.f101767I
            if (r1 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = new com.ss.android.ugc.aweme.shortvideo.cut.model.d
            r1.<init>(r0)
            r12.f101767I = r1
            goto L_0x004f
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.cut.model.d r1 = r12.f101767I
            r1.mo96926a(r0)
        L_0x004f:
            long r1 = r0.f100761c
            boolean r3 = r12.f101754O
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L_0x006e
            java.lang.String r1 = "curEditVideo"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            long r1 = r0.mo96910i()
            long r6 = r0.mo96909h()
            long r1 = r1 - r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x006e
            r12.m125276r()
            r7 = r4
            goto L_0x006f
        L_0x006e:
            r7 = r1
        L_0x006f:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r12.f101805d
            int r2 = r12.f101764F
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = r1.mo97711e(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r6 = r12.f101821t
            java.lang.String r2 = "curEditVideo"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r9 = r0.mo96908g()
            java.lang.String r2 = "curSingleideoSegment"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            float r10 = r1.mo96911j()
            int r11 = r12.f101763E
            r6.mo96920a(r7, r9, r10, r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f101823v
            java.lang.String r3 = "frameRecyclerView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.FramesAdapter r2 = r12.f101826y
            r2.mo97588b()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f101824w
            java.lang.String r3 = "singleFrameRecyclerView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r3 = 0
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f101824w
            r2.mo5541b(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.FramesAdapter r2 = r12.f101827z
            android.support.v4.app.FragmentActivity r4 = r12.f101804c
            android.arch.lifecycle.i r4 = (android.arch.lifecycle.C0043i) r4
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r5 = r12.f101821t
            java.lang.String r6 = "frameParamState"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Float> r5 = r5.f100783b
            r2.mo97583a(r4, r5, r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f101805d
            int r2 = r12.f101764F
            int r0 = r0.mo97699b(r2)
            boolean r2 = r12.f101754O
            if (r2 == 0) goto L_0x00ec
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f101805d
            int r2 = r12.f101764F
            int r0 = r0.mo97705c(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = r12.f101805d
            int r4 = r12.f101764F
            boolean r2 = r2.mo97710d(r4)
            if (r2 != 0) goto L_0x00ec
            long r4 = r1.mo96909h()
            float r0 = (float) r4
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r12.f101821t
            float r2 = r2.f100786e
            float r0 = r0 / r2
            int r0 = (int) r0
        L_0x00ec:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView r2 = r12.f101824w
            r2.mo5521a(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.c r2 = r12.f101766H
            if (r2 == 0) goto L_0x0104
            float r4 = r12.getStartSlideX()
            float r5 = r12.getEndSlideX()
            int r6 = r12.getOverXScroll()
            r2.mo96924a(r4, r5, r6)
        L_0x0104:
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r12.f101821t
            int r4 = r12.f101772N
            float r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k.m123813a(r2, r1, r0, r4)
            android.support.v4.app.FragmentActivity r2 = r12.f101804c
            android.content.Context r2 = (android.content.Context) r2
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r4 = r12.f101821t
            int r5 = r12.f101772N
            float r1 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k.m123812a(r2, r4, r0, r1, r5)
            r12.mo97621a(r0, r1, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r12.f101805d
            r0.mo97694a(r13)
            r12.m125279u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView.mo97596a(android.support.v4.util.i):void");
    }

    /* renamed from: a */
    public final void mo97599a(List<? extends VideoSegment> list) {
        C7573i.m23587b(list, "videoSegmentList");
        this.f101763E = 1;
        this.f101805d.mo97691a(1);
        if (this.f101767I != null) {
            this.f101767I.mo96925a();
        }
        if (this.f101766H != null) {
            this.f101766H.mo96923a();
        }
        for (VideoSegment videoSegment : list) {
            this.f101821t.mo96921a(videoSegment.mo96908g(), videoSegment.mo96911j());
        }
        this.f101805d.mo97704b(list);
        C38783b bVar = this.f101821t;
        VideoEditViewModel videoEditViewModel = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel, "videoEditViewModel");
        List n = videoEditViewModel.mo97721n();
        VideoEditViewModel videoEditViewModel2 = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel2, "videoEditViewModel");
        bVar.mo96922a(n, videoEditViewModel2.mo97722o());
        mo97621a((float) this.f101772N, (float) ((this.f101803b - this.f101772N) - C38774k.f100746d), 0);
        MVRecycleView mVRecycleView = this.f101824w;
        C7573i.m23582a((Object) mVRecycleView, "singleFrameRecyclerView");
        mVRecycleView.setVisibility(8);
        this.f101827z.mo97588b();
        MVRecycleView mVRecycleView2 = this.f101823v;
        C7573i.m23582a((Object) mVRecycleView2, "frameRecyclerView");
        mVRecycleView2.setVisibility(0);
        this.f101823v.mo5541b(0);
        FramesAdapter framesAdapter = this.f101826y;
        C0043i iVar = this.f101804c;
        C38783b bVar2 = this.f101821t;
        C7573i.m23582a((Object) bVar2, "frameParamState");
        framesAdapter.mo97584a(iVar, list, bVar2.f100783b);
    }

    /* renamed from: a */
    public final void mo97595a(int i, long j) {
        RTLImageView rTLImageView = this.f101808g;
        C7573i.m23582a((Object) rTLImageView, "mStartSlide");
        mo97622a((rTLImageView.getStartX() + (((float) j) / this.f101821t.f100786e)) - this.f101760B, false);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(motionEvent, "event");
        if (this.f101754O) {
            setEnabled(true);
        }
        return super.onTouch(view, motionEvent);
    }

    /* renamed from: a */
    private final long m125274a(long j, float f) {
        VideoEditViewModel videoEditViewModel = this.f101805d;
        C7573i.m23582a((Object) videoEditViewModel, "videoEditViewModel");
        if (videoEditViewModel.mo97721n() != null) {
            VideoEditViewModel videoEditViewModel2 = this.f101805d;
            C7573i.m23582a((Object) videoEditViewModel2, "videoEditViewModel");
            if (!videoEditViewModel2.mo97721n().isEmpty()) {
                VideoEditViewModel videoEditViewModel3 = this.f101805d;
                C7573i.m23582a((Object) videoEditViewModel3, "videoEditViewModel");
                List<VideoSegment> n = videoEditViewModel3.mo97721n();
                C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
                long j2 = 0;
                for (VideoSegment videoSegment : n) {
                    if (!videoSegment.f100768j) {
                        C7573i.m23582a((Object) videoSegment, "videoSegment");
                        float i = ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f);
                        float f2 = (float) j;
                        if (f2 <= i) {
                            return (long) ((((float) j2) + (f2 * videoSegment.mo96911j())) * f);
                        }
                        j2 += videoSegment.mo96910i() - videoSegment.mo96909h();
                        j = (long) (f2 - i);
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final Drawable m125275a(boolean z, int i) {
        boolean z2;
        Drawable drawable;
        FragmentActivity fragmentActivity = this.f101804c;
        C7573i.m23582a((Object) fragmentActivity, "context");
        int color = fragmentActivity.getResources().getColor(R.color.a76);
        int parseColor = Color.parseColor("#FFFFFF");
        float a = C20505c.m68010a(this.f101804c, 2.0f);
        if (C43127fh.m136806a(this.f101804c)) {
            z2 = !z;
        } else {
            z2 = z;
        }
        int i2 = 1;
        Drawable a2 = C38501ax.m123068a(color, color, 0, z2 ? new float[]{a, a, 0.0f, 0.0f, 0.0f, 0.0f, a, a} : new float[]{0.0f, 0.0f, a, a, a, a, 0.0f, 0.0f});
        if (this.f101754O) {
            Drawable[] drawableArr = new Drawable[1];
            for (int i3 = 0; i3 <= 0; i3++) {
                drawableArr[i3] = a2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            if (z2) {
                layerDrawable.setLayerInset(0, (int) this.f101755P, 0, 0, 0);
            } else {
                layerDrawable.setLayerInset(0, 0, 0, (int) this.f101755P, 0);
            }
            return layerDrawable;
        }
        Drawable[] drawableArr2 = new Drawable[4];
        for (int i4 = 0; i4 < 4; i4++) {
            if (i4 == 0) {
                C7573i.m23582a((Object) a2, "slideDrawable");
                drawable = a2;
            } else {
                drawable = C38501ax.m123066a(parseColor, parseColor, 0, 0);
                C7573i.m23582a((Object) drawable, "DmtDesignDrawableFactory…Color, handleColor, 0, 0)");
            }
            drawableArr2[i4] = drawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        int i5 = (int) (((float) this.f101769K) / 3.0f);
        while (true) {
            float f = ((float) i2) * 2.0f;
            layerDrawable2.setLayerInset(i2, (int) ((((float) C38774k.f100746d) / 3.0f) * (((f - 2.0f) / 5.0f) + 1.0f)), i5, (int) ((((float) C38774k.f100746d) / 3.0f) * (((6.0f - f) / 5.0f) + 1.0f)), i5);
            if (i2 == 3) {
                return layerDrawable2;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo97598a(VideoSegment videoSegment, int i) {
        if (!this.f101754O) {
            MVRecycleView mVRecycleView = this.f101823v;
            C7573i.m23582a((Object) mVRecycleView, "frameRecyclerView");
            mVRecycleView.setVisibility(0);
        }
        MVRecycleView mVRecycleView2 = this.f101824w;
        C7573i.m23582a((Object) mVRecycleView2, "singleFrameRecyclerView");
        mVRecycleView2.setVisibility(8);
        this.f101827z.mo97588b();
        if (i == 2) {
            this.f101823v.mo5541b(0);
            FramesAdapter framesAdapter = this.f101826y;
            C0043i iVar = this.f101804c;
            C38783b bVar = this.f101821t;
            C7573i.m23582a((Object) bVar, "frameParamState");
            framesAdapter.mo97582a(iVar, bVar.f100783b, this.f101763E, false);
            this.f101805d.mo97718k();
        } else if (i == 3) {
            this.f101823v.mo5541b(0);
            FramesAdapter framesAdapter2 = this.f101826y;
            C0043i iVar2 = this.f101804c;
            C38783b bVar2 = this.f101821t;
            C7573i.m23582a((Object) bVar2, "frameParamState");
            framesAdapter2.mo97581a(iVar2, videoSegment, bVar2.f100783b);
            this.f101805d.mo97695a(videoSegment);
        } else {
            if (i == 1) {
                this.f101805d.mo97717j();
            }
        }
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f101755P = C20505c.m68010a(context, 6.0f);
        setLoadThumbnailDirectly(!C35563c.f93231M.mo93305a(Property.VEExtractFramesAfterRender));
    }

    public /* synthetic */ VEVideoEditView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
