package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.p280ss.android.ugc.aweme.imported.C32068d;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutMultiVideoSegmentTouchCallback;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.C38727a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.adapter.MultiVideoEditSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39709b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c */
public final class C39763c extends C39762b {

    /* renamed from: h */
    public View f103358h;

    /* renamed from: i */
    public View f103359i;

    /* renamed from: j */
    public RecyclerView f103360j;

    /* renamed from: k */
    public int f103361k;

    /* renamed from: l */
    public int f103362l;

    /* renamed from: m */
    public ValueAnimator f103363m;

    /* renamed from: n */
    public float f103364n = 1.0f;

    /* renamed from: o */
    public float f103365o;

    /* renamed from: p */
    public float f103366p;

    /* renamed from: q */
    public C0902i<Integer, Integer> f103367q;

    /* renamed from: r */
    public AnimatorSet f103368r;

    /* renamed from: s */
    public View f103369s;

    /* renamed from: t */
    public MultiVideoEditSegmentAdapter f103370t;

    /* renamed from: u */
    private View f103371u;

    /* renamed from: v */
    private View f103372v;

    /* renamed from: w */
    private View f103373w;

    /* renamed from: x */
    private View f103374x;

    /* renamed from: y */
    private View f103375y;

    /* renamed from: z */
    private View f103376z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$a */
    static final class C39764a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39763c f103377a;

        C39764a(C39763c cVar) {
            this.f103377a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float f;
            int a = C39763c.m127314a(this.f103377a).mo96796a(C39763c.m127315b(this.f103377a), this.f103377a.f103361k);
            int a2 = C39763c.m127314a(this.f103377a).mo96796a(C39763c.m127315b(this.f103377a), this.f103377a.f103362l);
            if (a == -1 && a2 == -1) {
                C39763c.m127316c(this.f103377a).setTranslationX(0.0f);
                C39763c.m127316c(this.f103377a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                C39763c.m127316c(this.f103377a).setVisibility(0);
                view = C39763c.m127316c(this.f103377a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                C39763c.m127316c(this.f103377a).setVisibility(0);
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                    f = floatValue;
                    view = C39763c.m127316c(this.f103377a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            view.setX(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$b */
    static final class C39765b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39763c f103378a;

        C39765b(C39763c cVar) {
            this.f103378a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C39763c.m127316c(this.f103378a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$c */
    static final class C39766c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39763c f103379a;

        C39766c(C39763c cVar) {
            this.f103379a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C39763c.m127316c(this.f103379a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$d */
    static final class C39767d implements C38727a {

        /* renamed from: a */
        final /* synthetic */ C39763c f103380a;

        C39767d(C39763c cVar) {
            this.f103380a = cVar;
        }

        /* renamed from: a */
        public final void mo96785a(View view, int i, String str) {
            C39709b bVar = this.f103380a.f103355g;
            if (bVar != null) {
                bVar.mo99083a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$e */
    static final class C39768e implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C39763c f103381a;

        C39768e(C39763c cVar) {
            this.f103381a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f103381a.f103363m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a = C39763c.m127314a(this.f103381a).mo96796a(C39763c.m127315b(this.f103381a), C39763c.m127314a(this.f103381a).f100640b);
                if (a == -1) {
                    C39763c.m127316c(this.f103381a).setVisibility(8);
                } else {
                    if (C39763c.m127316c(this.f103381a).getVisibility() == 8) {
                        C39763c.m127316c(this.f103381a).setVisibility(0);
                    }
                    C39763c.m127316c(this.f103381a).setX((float) a);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f */
    public static final class C39769f implements OnPreDrawListener {

        /* renamed from: a */
        public final int f103382a;

        /* renamed from: b */
        final /* synthetic */ C39763c f103383b;

        /* renamed from: c */
        final /* synthetic */ int f103384c;

        /* renamed from: d */
        final /* synthetic */ boolean f103385d;

        /* renamed from: e */
        final /* synthetic */ FragmentActivity f103386e;

        /* renamed from: f */
        final /* synthetic */ AnimatorListenerAdapter f103387f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f$a */
        public static final class C39770a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C39769f f103388a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f103389b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                if (this.f103388a.f103386e != null && !this.f103388a.f103386e.isFinishing()) {
                    AnimatorListenerAdapter animatorListenerAdapter = this.f103388a.f103387f;
                    if (animatorListenerAdapter != null) {
                        animatorListenerAdapter.onAnimationEnd(animator);
                    }
                }
            }

            C39770a(C39769f fVar, ArrayList arrayList) {
                this.f103388a = fVar;
                this.f103389b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            float f;
            float f2;
            View rootView = C39763c.m127318e(this.f103383b).getRootView();
            C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            C1293v f3 = C39763c.m127315b(this.f103383b).mo5575f(this.f103384c);
            Rect a = C39763c.m127313a(C39763c.m127315b(this.f103383b), this.f103384c);
            if (a == null || f3 == null) {
                return false;
            }
            C39763c cVar = this.f103383b;
            View view = f3.itemView;
            C7573i.m23582a((Object) view, "viewHolder.itemView");
            cVar.f103369s = view;
            this.f103383b.f103367q = C32068d.m104096a(C39763c.m127315b(this.f103383b));
            View d = C39763c.m127317d(this.f103383b);
            ArrayList arrayList = new ArrayList();
            C0902i<Integer, Integer> iVar = this.f103383b.f103367q;
            int i = 2;
            if (iVar != null) {
                F f4 = iVar.f3154a;
                if (f4 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f4, "range.first!!");
                int intValue = ((Number) f4).intValue();
                int i2 = this.f103384c;
                while (intValue < i2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    C1293v f5 = C39763c.m127315b(this.f103383b).mo5575f(intValue);
                    if (f5 != null) {
                        C7573i.m23582a((Object) f5, "videoRecyclerView.findVi…              ?: continue");
                        if (this.f103385d) {
                            View view2 = f5.itemView;
                            C7573i.m23582a((Object) view2, "viewHolder.itemView");
                            f2 = view2.getTranslationX() + ((float) (this.f103382a - a.right));
                        } else {
                            View view3 = f5.itemView;
                            C7573i.m23582a((Object) view3, "viewHolder.itemView");
                            f2 = view3.getTranslationX() - ((float) a.left);
                        }
                        float[] fArr = new float[i];
                        View view4 = f5.itemView;
                        C7573i.m23582a((Object) view4, "viewHolder.itemView");
                        fArr[0] = view4.getTranslationX();
                        fArr[1] = f2;
                        animatorSet.play(ObjectAnimator.ofFloat(f5.itemView, "translationX", fArr));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                    i = 2;
                }
                int i3 = this.f103384c + 1;
                S s = iVar.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "range.second!!");
                int intValue2 = ((Number) s).intValue();
                if (i3 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        C1293v f6 = C39763c.m127315b(this.f103383b).mo5575f(i3);
                        if (f6 != null) {
                            C7573i.m23582a((Object) f6, "videoRecyclerView.findVi…              ?: continue");
                            if (this.f103385d) {
                                View view5 = f6.itemView;
                                C7573i.m23582a((Object) view5, "viewHolder.itemView");
                                f = view5.getTranslationX() - ((float) a.left);
                            } else {
                                View view6 = f6.itemView;
                                C7573i.m23582a((Object) view6, "viewHolder.itemView");
                                f = view6.getTranslationX() + ((float) (this.f103382a - a.right));
                            }
                            View view7 = f6.itemView;
                            C7573i.m23582a((Object) view7, "viewHolder.itemView");
                            animatorSet2.play(ObjectAnimator.ofFloat(f6.itemView, "translationX", new float[]{view7.getTranslationX(), f}));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i3 == intValue2) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            int width = C39763c.m127318e(this.f103383b).getWidth();
            int width2 = a.width();
            int[] iArr = new int[2];
            C39763c.m127318e(this.f103383b).getLocationInWindow(iArr);
            this.f103383b.f103364n = (((float) width) * 1.0f) / ((float) width2);
            float width3 = (float) (iArr[0] + (C39763c.m127318e(this.f103383b).getWidth() / 2));
            float height = (float) (iArr[1] + (C39763c.m127318e(this.f103383b).getHeight() / 2));
            this.f103383b.f103365o = width3 - ((float) a.centerX());
            this.f103383b.f103366p = height - ((float) a.centerY());
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(300);
            animatorSet3.play(ObjectAnimator.ofFloat(d, "translationX", new float[]{0.0f, this.f103383b.f103365o})).with(ObjectAnimator.ofFloat(d, "translationY", new float[]{0.0f, this.f103383b.f103366p})).with(ObjectAnimator.ofFloat(d, "scaleX", new float[]{1.0f, this.f103383b.f103364n})).with(ObjectAnimator.ofFloat(d, "scaleY", new float[]{1.0f, this.f103383b.f103364n}));
            arrayList.add(animatorSet3);
            C39763c cVar2 = this.f103383b;
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList);
            animatorSet4.addListener(new C39770a(this, arrayList));
            cVar2.f103368r = animatorSet4;
            AnimatorSet animatorSet5 = this.f103383b.f103368r;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
            return false;
        }

        C39769f(C39763c cVar, int i, boolean z, FragmentActivity fragmentActivity, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f103383b = cVar;
            this.f103384c = i;
            this.f103385d = z;
            this.f103386e = fragmentActivity;
            this.f103387f = animatorListenerAdapter;
            this.f103382a = C39805en.m127447b(fragmentActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g */
    public static final class C39771g implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C39763c f103390a;

        /* renamed from: b */
        final /* synthetic */ int f103391b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f103392c;

        /* renamed from: d */
        final /* synthetic */ AnimatorListenerAdapter f103393d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g$a */
        public static final class C39772a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C39771g f103394a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f103395b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                if (this.f103394a.f103392c != null && !this.f103394a.f103392c.isFinishing()) {
                    AnimatorListenerAdapter animatorListenerAdapter = this.f103394a.f103393d;
                    if (animatorListenerAdapter != null) {
                        animatorListenerAdapter.onAnimationEnd(animator);
                    }
                }
            }

            C39772a(C39771g gVar, ArrayList arrayList) {
                this.f103394a = gVar;
                this.f103395b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            View rootView = C39763c.m127315b(this.f103390a).getRootView();
            C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f103390a.f103367q == null) {
                return false;
            }
            View d = C39763c.m127317d(this.f103390a);
            ArrayList arrayList = new ArrayList();
            C0902i<Integer, Integer> iVar = this.f103390a.f103367q;
            if (iVar == null) {
                C7573i.m23580a();
            }
            F f = iVar.f3154a;
            if (f == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) f, "visibleRage!!.first!!");
            int intValue = ((Number) f).intValue();
            int i2 = this.f103391b;
            while (true) {
                i = 2;
                if (intValue >= i2) {
                    break;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                C1293v f2 = C39763c.m127315b(this.f103390a).mo5575f(intValue);
                if (f2 != null) {
                    C7573i.m23582a((Object) f2, "videoRecyclerView.findVi…              ?: continue");
                    View view = f2.itemView;
                    C7573i.m23582a((Object) view, "viewHolder.itemView");
                    animatorSet.play(ObjectAnimator.ofFloat(f2.itemView, "translationX", new float[]{view.getTranslationX(), 0.0f}));
                    animatorSet.setDuration(300);
                    arrayList.add(animatorSet);
                }
                intValue++;
            }
            int i3 = this.f103391b + 1;
            C0902i<Integer, Integer> iVar2 = this.f103390a.f103367q;
            if (iVar2 == null) {
                C7573i.m23580a();
            }
            S s = iVar2.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s, "visibleRage!!.second!!");
            int intValue2 = ((Number) s).intValue();
            if (i3 <= intValue2) {
                while (true) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    C1293v f3 = C39763c.m127315b(this.f103390a).mo5575f(i3);
                    if (f3 != null) {
                        C7573i.m23582a((Object) f3, "videoRecyclerView.findVi…              ?: continue");
                        float[] fArr = new float[i];
                        View view2 = f3.itemView;
                        C7573i.m23582a((Object) view2, "viewHolder.itemView");
                        fArr[0] = view2.getTranslationX();
                        fArr[1] = 0.0f;
                        animatorSet2.play(ObjectAnimator.ofFloat(f3.itemView, "translationX", fArr));
                        animatorSet2.setDuration(300);
                        arrayList.add(animatorSet2);
                    }
                    if (i3 == intValue2) {
                        break;
                    }
                    i3++;
                    i = 2;
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(300);
            animatorSet3.play(ObjectAnimator.ofFloat(d, "translationX", new float[]{d.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(d, "translationY", new float[]{d.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(d, "scaleX", new float[]{d.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(d, "scaleY", new float[]{d.getScaleY(), 1.0f}));
            arrayList.add(animatorSet3);
            C39763c cVar = this.f103390a;
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList);
            animatorSet4.addListener(new C39772a(this, arrayList));
            cVar.f103368r = animatorSet4;
            AnimatorSet animatorSet5 = this.f103390a.f103368r;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
            C39763c.m127314a(this.f103390a).f100640b = this.f103391b;
            return false;
        }

        C39771g(C39763c cVar, int i, FragmentActivity fragmentActivity, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f103390a = cVar;
            this.f103391b = i;
            this.f103392c = fragmentActivity;
            this.f103393d = animatorListenerAdapter;
        }
    }

    /* renamed from: q */
    public final boolean mo99214q() {
        return true;
    }

    /* renamed from: a */
    public final void mo99190a(OnClickListener onClickListener) {
        super.mo99190a(onClickListener);
        View view = this.f103371u;
        if (view == null) {
            C7573i.m23583a("ivDelete");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f103373w;
        if (view2 == null) {
            C7573i.m23583a("ivSave");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f103374x;
        if (view3 == null) {
            C7573i.m23583a("ivCancel");
        }
        view3.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo99191a(VideoSegment videoSegment) {
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter.mo96804a(videoSegment);
    }

    /* renamed from: a */
    public final void mo99195a(boolean z, int i) {
        ValueAnimator valueAnimator = this.f103363m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(100);
            ofFloat.addUpdateListener(new C39765b(this));
            this.f103363m = ofFloat;
        } else {
            MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
            if (multiVideoEditSegmentAdapter == null) {
                C7573i.m23583a("videoSegmentAdapter");
            }
            RecyclerView recyclerView = this.f103360j;
            if (recyclerView == null) {
                C7573i.m23583a("videoRecyclerView");
            }
            int a = multiVideoEditSegmentAdapter.mo96796a(recyclerView, i);
            View view = this.f103358h;
            if (view == null) {
                C7573i.m23583a("animTabDot");
            }
            view.setX((float) a);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(100);
            ofFloat2.addUpdateListener(new C39766c(this));
            this.f103363m = ofFloat2;
            MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter2 = this.f103370t;
            if (multiVideoEditSegmentAdapter2 == null) {
                C7573i.m23583a("videoSegmentAdapter");
            }
            multiVideoEditSegmentAdapter2.f100640b = i;
        }
        ValueAnimator valueAnimator2 = this.f103363m;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    /* renamed from: a */
    public final void mo99193a(List<? extends VideoSegment> list) {
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter.mo99078c(list);
    }

    /* renamed from: f */
    public final void mo99203f() {
        mo99209l().mo97640c();
    }

    /* renamed from: k */
    public final View mo99208k() {
        View view = this.f103375y;
        if (view == null) {
            C7573i.m23583a("ivEditVideo");
        }
        return view;
    }

    /* renamed from: h */
    public final void mo99205h() {
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter.f100642d = true;
        View view = this.f103359i;
        if (view == null) {
            C7573i.m23583a("flEditVideo");
        }
        view.setVisibility(8);
        mo99200c();
    }

    /* renamed from: r */
    private final void m127319r() {
        View view = this.f103376z;
        if (view == null) {
            C7573i.m23583a("singleEditLayout");
        }
        view.setVisibility(0);
        View view2 = this.f103373w;
        if (view2 == null) {
            C7573i.m23583a("ivSave");
        }
        view2.setVisibility(8);
        View view3 = this.f103374x;
        if (view3 == null) {
            C7573i.m23583a("ivCancel");
        }
        view3.setVisibility(8);
        View view4 = this.f103359i;
        if (view4 == null) {
            C7573i.m23583a("flEditVideo");
        }
        view4.setVisibility(4);
    }

    /* renamed from: i */
    public final void mo99206i() {
        View view = this.f103358h;
        if (view == null) {
            C7573i.m23583a("animTabDot");
        }
        view.setVisibility(0);
        mo99210m().setVisibility(0);
        mo99211n().setVisibility(0);
        View view2 = this.f103371u;
        if (view2 == null) {
            C7573i.m23583a("ivDelete");
        }
        view2.setVisibility(8);
        View view3 = this.f103372v;
        if (view3 == null) {
            C7573i.m23583a("tvVideoSegmentDes");
        }
        view3.setVisibility(0);
        mo99213p().setVisibility(8);
    }

    /* renamed from: s */
    private final void m127320s() {
        View view = this.f103373w;
        if (view == null) {
            C7573i.m23583a("ivSave");
        }
        view.setVisibility(8);
        View view2 = this.f103374x;
        if (view2 == null) {
            C7573i.m23583a("ivCancel");
        }
        view2.setVisibility(8);
        View view3 = this.f103376z;
        if (view3 == null) {
            C7573i.m23583a("singleEditLayout");
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView.setVisibility(0);
        View view4 = this.f103359i;
        if (view4 == null) {
            C7573i.m23583a("flEditVideo");
        }
        view4.setVisibility(4);
    }

    /* renamed from: g */
    public final void mo99204g() {
        RecyclerView recyclerView = this.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView.setVisibility(8);
        View view = this.f103373w;
        if (view == null) {
            C7573i.m23583a("ivSave");
        }
        view.setVisibility(0);
        View view2 = this.f103374x;
        if (view2 == null) {
            C7573i.m23583a("ivCancel");
        }
        view2.setVisibility(0);
        View view3 = this.f103359i;
        if (view3 == null) {
            C7573i.m23583a("flEditVideo");
        }
        view3.setVisibility(0);
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter.f100642d = false;
        View view4 = this.f103376z;
        if (view4 == null) {
            C7573i.m23583a("singleEditLayout");
        }
        view4.setVisibility(0);
        mo99200c();
    }

    /* renamed from: j */
    public final void mo99207j() {
        View view = this.f103358h;
        if (view == null) {
            C7573i.m23583a("animTabDot");
        }
        view.setVisibility(4);
        mo99210m().setVisibility(4);
        mo99211n().setVisibility(4);
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        if (multiVideoEditSegmentAdapter.mo96795a() == 1) {
            View view2 = this.f103371u;
            if (view2 == null) {
                C7573i.m23583a("ivDelete");
            }
            view2.setAlpha(0.5f);
        } else {
            View view3 = this.f103371u;
            if (view3 == null) {
                C7573i.m23583a("ivDelete");
            }
            view3.setAlpha(1.0f);
        }
        View view4 = this.f103371u;
        if (view4 == null) {
            C7573i.m23583a("ivDelete");
        }
        view4.setVisibility(0);
        mo99213p().setVisibility(0);
        View view5 = this.f103372v;
        if (view5 == null) {
            C7573i.m23583a("tvVideoSegmentDes");
        }
        view5.setVisibility(4);
    }

    /* renamed from: a */
    public static final /* synthetic */ MultiVideoEditSegmentAdapter m127314a(C39763c cVar) {
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = cVar.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        return multiVideoEditSegmentAdapter;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m127315b(C39763c cVar) {
        RecyclerView recyclerView = cVar.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m127316c(C39763c cVar) {
        View view = cVar.f103358h;
        if (view == null) {
            C7573i.m23583a("animTabDot");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m127317d(C39763c cVar) {
        View view = cVar.f103369s;
        if (view == null) {
            C7573i.m23583a("curItemView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m127318e(C39763c cVar) {
        View view = cVar.f103359i;
        if (view == null) {
            C7573i.m23583a("flEditVideo");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo99189a(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
        mo99209l().mo97628a(false, iVar);
    }

    /* renamed from: b */
    public final void mo99196b(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
        mo99209l().mo97624a(iVar, true);
    }

    /* renamed from: b */
    public final void mo99197b(VideoSegment videoSegment) {
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter.mo96808b(videoSegment);
    }

    /* renamed from: a */
    public final void mo99183a(int i, int i2) {
        if (i != i2) {
            RecyclerView recyclerView = this.f103360j;
            if (recyclerView == null) {
                C7573i.m23583a("videoRecyclerView");
            }
            recyclerView.mo5561d(i2);
            MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
            if (multiVideoEditSegmentAdapter == null) {
                C7573i.m23583a("videoSegmentAdapter");
            }
            if (i == multiVideoEditSegmentAdapter.f100640b) {
                this.f103361k = i;
                this.f103362l = i2;
                ValueAnimator valueAnimator = this.f103363m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(500);
                ofFloat.addUpdateListener(new C39764a(this));
                this.f103363m = ofFloat;
                ValueAnimator valueAnimator2 = this.f103363m;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            } else {
                return;
            }
        }
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter2 = this.f103370t;
        if (multiVideoEditSegmentAdapter2 == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter2.f100640b = i2;
    }

    /* renamed from: a */
    public static Rect m127313a(RecyclerView recyclerView, int i) {
        Integer num;
        View view;
        C0902i a = C32068d.m104096a(recyclerView);
        F f = a.f3154a;
        if (f == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) f, "ret.first!!");
        if (C7573i.m23576a(i, ((Number) f).intValue()) >= 0) {
            S s = a.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s, "ret.second!!");
            if (C7573i.m23576a(i, ((Number) s).intValue()) <= 0) {
                C1262a adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    num = Integer.valueOf(adapter.getItemCount());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                if (i < num.intValue() && i >= 0) {
                    C1293v f2 = recyclerView.mo5575f(i);
                    if (f2 != null) {
                        view = f2.itemView;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        int[] iArr = new int[2];
                        f2.itemView.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        int i3 = iArr[1];
                        int i4 = iArr[0];
                        View view2 = f2.itemView;
                        C7573i.m23582a((Object) view2, "viewHolder.itemView");
                        int width = i4 + view2.getWidth();
                        int i5 = iArr[1];
                        View view3 = f2.itemView;
                        C7573i.m23582a((Object) view3, "viewHolder.itemView");
                        return new Rect(i2, i3, width, i5 + view3.getHeight());
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo99186a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            super.mo99186a(fragmentActivity, view);
            View findViewById = view.findViewById(R.id.b5i);
            C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.ivDelete)");
            this.f103371u = findViewById;
            View findViewById2 = view.findViewById(R.id.dq_);
            C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.tvVideoSegmentDes)");
            this.f103372v = findViewById2;
            View findViewById3 = view.findViewById(R.id.g_);
            C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.animTabDot)");
            this.f103358h = findViewById3;
            View findViewById4 = view.findViewById(R.id.ea5);
            C7573i.m23582a((Object) findViewById4, "rootView.findViewById(R.id.videoRecyclerView)");
            this.f103360j = (RecyclerView) findViewById4;
            View findViewById5 = view.findViewById(R.id.alq);
            C7573i.m23582a((Object) findViewById5, "rootView.findViewById(R.id.flEditVideo)");
            this.f103359i = findViewById5;
            View findViewById6 = view.findViewById(R.id.d6z);
            C7573i.m23582a((Object) findViewById6, "rootView.findViewById(R.id.singleEditLayout)");
            this.f103376z = findViewById6;
            View findViewById7 = view.findViewById(R.id.b5j);
            C7573i.m23582a((Object) findViewById7, "rootView.findViewById(R.id.ivEditVideo)");
            this.f103375y = findViewById7;
            View findViewById8 = view.findViewById(R.id.b5o);
            C7573i.m23582a((Object) findViewById8, "rootView.findViewById(R.id.ivSave)");
            this.f103373w = findViewById8;
            View findViewById9 = view.findViewById(R.id.b5h);
            C7573i.m23582a((Object) findViewById9, "rootView.findViewById(R.id.ivCancel)");
            this.f103374x = findViewById9;
            View findViewById10 = view.findViewById(R.id.ea5);
            C7573i.m23582a((Object) findViewById10, "rootView.findViewById(R.id.videoRecyclerView)");
            this.f103360j = (RecyclerView) findViewById10;
        }
    }

    /* renamed from: a */
    public final void mo99184a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        boolean z;
        this.f103364n = 1.0f;
        this.f103365o = 0.0f;
        this.f103366p = 0.0f;
        RecyclerView recyclerView = this.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView.mo5541b(i);
        RecyclerView recyclerView2 = this.f103360j;
        if (recyclerView2 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        if (C0991u.m4220h(recyclerView2) == 1) {
            z = true;
        } else {
            z = false;
        }
        m127319r();
        View view = this.f103359i;
        if (view == null) {
            C7573i.m23583a("flEditVideo");
        }
        View rootView = view.getRootView();
        C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        C39769f fVar = new C39769f(this, i, z, fragmentActivity, animatorListenerAdapter);
        viewTreeObserver.addOnPreDrawListener(fVar);
    }

    /* renamed from: a */
    public final void mo99188a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        if (videoEditViewModel == null) {
            C7573i.m23580a();
        }
        if (cutMultiVideoViewModel == null) {
            C7573i.m23580a();
        }
        if (list == null) {
            C7573i.m23580a();
        }
        this.f103370t = new MultiVideoEditSegmentAdapter(videoEditViewModel, cutMultiVideoViewModel, list);
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter = this.f103370t;
        if (multiVideoEditSegmentAdapter == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new VECutMultiVideoSegmentTouchCallback(multiVideoEditSegmentAdapter));
        RecyclerView recyclerView = this.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        itemTouchHelper.mo6500a(recyclerView);
        RecyclerView recyclerView2 = this.f103360j;
        if (recyclerView2 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView2.setLayoutManager(new MultiEditRecyleViewLayoutManager(fragmentActivity));
        RecyclerView recyclerView3 = this.f103360j;
        if (recyclerView3 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter2 = this.f103370t;
        if (multiVideoEditSegmentAdapter2 == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        recyclerView3.setAdapter(multiVideoEditSegmentAdapter2);
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter3 = this.f103370t;
        if (multiVideoEditSegmentAdapter3 == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter3.f100641c = new C39767d(this);
        RecyclerView recyclerView4 = this.f103360j;
        if (recyclerView4 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.f4941j = 300;
        defaultItemAnimator.f4943l = 300;
        defaultItemAnimator.f4942k = 300;
        defaultItemAnimator.f4940i = 300;
        recyclerView4.setItemAnimator(defaultItemAnimator);
        RecyclerView recyclerView5 = this.f103360j;
        if (recyclerView5 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView5.getViewTreeObserver().addOnPreDrawListener(new C39768e(this));
        RecyclerView recyclerView6 = this.f103360j;
        if (recyclerView6 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter4 = this.f103370t;
        if (multiVideoEditSegmentAdapter4 == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        recyclerView6.setAdapter(multiVideoEditSegmentAdapter4);
        MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter5 = this.f103370t;
        if (multiVideoEditSegmentAdapter5 == null) {
            C7573i.m23583a("videoSegmentAdapter");
        }
        multiVideoEditSegmentAdapter5.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo99185a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        m127320s();
        if (this.f103367q == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        RecyclerView recyclerView = this.f103360j;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        View rootView = recyclerView.getRootView();
        C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
        rootView.getViewTreeObserver().addOnPreDrawListener(new C39771g(this, i, fragmentActivity, animatorListenerAdapter));
    }
}
