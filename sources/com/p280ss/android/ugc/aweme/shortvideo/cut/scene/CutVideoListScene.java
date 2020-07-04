package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.helper.ItemTouchHelper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.ktx.C12637b;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.imported.C32068d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutMultiVideoSegmentTouchCallback;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.C38727a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39145b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39174d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentTouchCallback;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39170h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39172j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointSingleVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.C39249a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene */
public final class CutVideoListScene extends C12629j implements C44396a {

    /* renamed from: X */
    public static final C38813a f100842X = new C38813a(null);

    /* renamed from: A */
    public CutVideoEditViewModel f100843A;

    /* renamed from: B */
    public CutVideoListViewModel f100844B;

    /* renamed from: C */
    public CutVideoStickerPointMusicViewModel f100845C;

    /* renamed from: D */
    public CutVideoMultiModeViewModel f100846D;

    /* renamed from: E */
    public ValueAnimator f100847E;

    /* renamed from: F */
    public int f100848F;

    /* renamed from: G */
    public int f100849G;

    /* renamed from: H */
    public long f100850H;

    /* renamed from: I */
    public final C39054bn f100851I = new C39035be();

    /* renamed from: J */
    public boolean f100852J;

    /* renamed from: K */
    public boolean f100853K;

    /* renamed from: L */
    public float f100854L = 1.0f;

    /* renamed from: M */
    public float f100855M;

    /* renamed from: N */
    public float f100856N;

    /* renamed from: O */
    public View f100857O;

    /* renamed from: P */
    public C0902i<Integer, Integer> f100858P;

    /* renamed from: Q */
    public AnimatorSet f100859Q;

    /* renamed from: R */
    public boolean f100860R;

    /* renamed from: S */
    public int f100861S;

    /* renamed from: T */
    public boolean f100862T = true;

    /* renamed from: U */
    public boolean f100863U;

    /* renamed from: V */
    public boolean f100864V = true;

    /* renamed from: W */
    public C38971ar f100865W;

    /* renamed from: Y */
    private TextView f100866Y;

    /* renamed from: Z */
    private RemoteImageView f100867Z;

    /* renamed from: aa */
    private FrameLayout f100868aa;

    /* renamed from: ab */
    private CutVideoViewModel f100869ab;

    /* renamed from: ac */
    private CutVideoPreviewViewModel f100870ac;

    /* renamed from: i */
    public VideoSegmentAdapter f100871i;

    /* renamed from: j */
    public C38982av f100872j;

    /* renamed from: k */
    public C38916af f100873k;

    /* renamed from: l */
    public RecyclerView f100874l;

    /* renamed from: m */
    public C39052bl f100875m;

    /* renamed from: n */
    public View f100876n;

    /* renamed from: o */
    public StickPointVideoSegView f100877o;

    /* renamed from: p */
    public ImageView f100878p;

    /* renamed from: q */
    public ImageView f100879q;

    /* renamed from: r */
    public FrameLayout f100880r;

    /* renamed from: s */
    public FrameLayout f100881s;

    /* renamed from: t */
    public StickPointSingleVideoEditView f100882t;

    /* renamed from: u */
    public CutMultiVideoViewModel f100883u;

    /* renamed from: v */
    public VideoEditViewModel f100884v;

    /* renamed from: w */
    public VEVideoCutterViewModel f100885w;

    /* renamed from: x */
    public CutVideoSpeedViewModel f100886x;

    /* renamed from: y */
    public CutVideoBottomBarViewModel f100887y;

    /* renamed from: z */
    public CutVideoTitleBarViewModel f100888z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$VideoLayoutManager */
    final class VideoLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        public final VideoSmoothScroller f100889a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$VideoLayoutManager$VideoSmoothScroller */
        public final class VideoSmoothScroller extends LinearSmoothScroller {
            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                C7573i.m23587b(displayMetrics, "displayMetrics");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            public final int mo5472b(int i) {
                if (i > 2000) {
                    i = AdError.SERVER_ERROR_CODE;
                }
                return super.mo5472b(i);
            }

            public VideoSmoothScroller(Context context) {
                super(context);
            }
        }

        public VideoLayoutManager(Context context) {
            super(context, 0, false);
            this.f100889a = new VideoSmoothScroller(context);
        }

        /* renamed from: a */
        public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
            C7573i.m23587b(recyclerView, "recyclerView");
            VideoSmoothScroller videoSmoothScroller = this.f100889a;
            videoSmoothScroller.f4993g = i;
            mo5755a((C1287r) videoSmoothScroller);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$a */
    public static final class C38813a {
        private C38813a() {
        }

        public /* synthetic */ C38813a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$aa */
    public static final class C38814aa implements C39172j {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100892a;

        C38814aa(CutVideoListScene cutVideoListScene) {
            this.f100892a = cutVideoListScene;
        }

        /* renamed from: a */
        public final void mo96997a(View view) {
            CutVideoListScene.m123965b(this.f100892a).mo97053j(false);
            CutVideoListScene.m123977l(this.f100892a).mo97153e(true);
            CutVideoListScene.m123978m(this.f100892a).mo97072a(true);
            CutVideoListScene.m123979n(this.f100892a).mo97131b(true);
            CutVideoListScene.m123965b(this.f100892a).mo97047e(true);
        }

        /* renamed from: b */
        public final void mo96999b(View view) {
            C38982av avVar = this.f100892a.f100872j;
            if (avVar == null) {
                C7573i.m23580a();
            }
            C39174d dVar = avVar.f101221f;
            C38982av avVar2 = this.f100892a.f100872j;
            if (avVar2 == null) {
                C7573i.m23580a();
            }
            dVar.mo97456a(avVar2.mo97272c());
            C39193g.f101577a.mo97488d();
        }

        /* renamed from: a */
        public final void mo96998a(List<? extends MediaModel> list) {
            if (C6292i.m19525a(list)) {
                C38982av avVar = this.f100892a.f100872j;
                if (avVar == null) {
                    C7573i.m23580a();
                }
                if (avVar.f101230o) {
                    C38982av avVar2 = this.f100892a.f100872j;
                    if (avVar2 == null) {
                        C7573i.m23580a();
                    }
                    avVar2.f101218c.mo97503c();
                    C38982av avVar3 = this.f100892a.f100872j;
                    if (avVar3 == null) {
                        C7573i.m23580a();
                    }
                    avVar3.f101230o = false;
                }
                return;
            }
            this.f100892a.mo96993a(list);
        }

        /* renamed from: c */
        public final void mo97000c(View view) {
            if (C39182e.f101552a.mo97468a(this.f100892a.f33526d_, this.f100892a.f100851I.mo97344a(), this.f100892a.f100851I.mo97350b())) {
                C38982av avVar = this.f100892a.f100872j;
                if (avVar == null) {
                    C7573i.m23580a();
                }
                avVar.f101231p = true;
                C38982av avVar2 = this.f100892a.f100872j;
                if (avVar2 == null) {
                    C7573i.m23580a();
                }
                if (avVar2.f101218c.mo97500a()) {
                    C38982av avVar3 = this.f100892a.f100872j;
                    if (avVar3 == null) {
                        C7573i.m23580a();
                    }
                    avVar3.f101230o = true;
                }
                C38982av avVar4 = this.f100892a.f100872j;
                if (avVar4 == null) {
                    C7573i.m23580a();
                }
                avVar4.f101218c.mo97502b();
            }
            C39193g.f101577a.mo97490e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$ab */
    static final class C38815ab implements C38727a {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100893a;

        C38815ab(CutVideoListScene cutVideoListScene) {
            this.f100893a = cutVideoListScene;
        }

        /* renamed from: a */
        public final void mo96785a(View view, int i, String str) {
            ArrayList arrayList;
            if (CutVideoListScene.m123970e(this.f100893a).f100834d != 2 && !this.f100893a.f100863U) {
                if (i == 10003) {
                    C39182e eVar = C39182e.f101552a;
                    Activity activity = this.f100893a.f33526d_;
                    VideoSegmentAdapter videoSegmentAdapter = this.f100893a.f100871i;
                    Long l = null;
                    if (videoSegmentAdapter != null) {
                        arrayList = videoSegmentAdapter.mo96807b();
                    } else {
                        arrayList = null;
                    }
                    VideoSegmentAdapter videoSegmentAdapter2 = this.f100893a.f100871i;
                    if (videoSegmentAdapter2 != null) {
                        l = Long.valueOf(videoSegmentAdapter2.mo96810c());
                    }
                    if (l == null) {
                        C7573i.m23580a();
                    }
                    eVar.mo97468a(activity, arrayList, l.longValue());
                    return;
                }
                CutVideoListScene.m123965b(this.f100893a).f100939d = i;
                CutVideoListScene.m123965b(this.f100893a).f100940e = CutVideoListScene.m123967c(this.f100893a).mo97688a(str);
                if (CutVideoListScene.m123965b(this.f100893a).f100940e < 0) {
                    StringBuilder sb = new StringBuilder("edit index:");
                    sb.append(CutVideoListScene.m123965b(this.f100893a).f100939d);
                    sb.append(", origin_index:");
                    sb.append(CutVideoListScene.m123965b(this.f100893a).f100940e);
                    sb.append(", path:");
                    sb.append(str);
                    C41530am.m132284c(sb.toString());
                    return;
                }
                CutVideoListScene.m123968d(this.f100893a).mo96664a(CutVideoListScene.m123965b(this.f100893a).f100939d, CutVideoListScene.m123965b(this.f100893a).f100940e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$ac */
    static final class C38816ac implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100894a;

        C38816ac(CutVideoListScene cutVideoListScene) {
            this.f100894a = cutVideoListScene;
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            ValueAnimator valueAnimator = this.f100894a.f100847E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                VideoSegmentAdapter videoSegmentAdapter = this.f100894a.f100871i;
                if (videoSegmentAdapter != null) {
                    RecyclerView G = this.f100894a.mo30920G();
                    VideoSegmentAdapter videoSegmentAdapter2 = this.f100894a.f100871i;
                    if (videoSegmentAdapter2 != null) {
                        i2 = videoSegmentAdapter2.f100640b;
                    } else {
                        i2 = 0;
                    }
                    i = videoSegmentAdapter.mo96796a(G, i2);
                } else {
                    i = -1;
                }
                if (i == -1) {
                    CutVideoListScene.m123980o(this.f100894a).setVisibility(4);
                } else {
                    CutVideoListScene.m123980o(this.f100894a).setVisibility(0);
                    CutVideoListScene.m123980o(this.f100894a).setX((float) i);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$ad */
    static final class C38817ad implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100895a;

        C38817ad(CutVideoListScene cutVideoListScene) {
            this.f100895a = cutVideoListScene;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1))) {
                this.f100895a.f100850H = System.currentTimeMillis();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$ae */
    public static final class C38818ae implements OnPreDrawListener {

        /* renamed from: a */
        public final int f100896a;

        /* renamed from: b */
        final /* synthetic */ CutVideoListScene f100897b;

        /* renamed from: c */
        final /* synthetic */ int f100898c;

        /* renamed from: d */
        final /* synthetic */ Rect f100899d;

        /* renamed from: e */
        final /* synthetic */ boolean f100900e;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$ae$a */
        public static final class C38819a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C38818ae f100901a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f100902b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                Activity activity = this.f100901a.f100897b.f33526d_;
                if (activity == null || !activity.isFinishing()) {
                    CutVideoListScene.m123971f(this.f100901a.f100897b).mo97105a(true);
                    if (this.f100901a.f100897b.mo96988L()) {
                        CutVideoListScene.m123965b(this.f100901a.f100897b).mo97052i(false);
                    } else {
                        this.f100901a.f100897b.mo30920G().setVisibility(8);
                    }
                    CutVideoListScene.m123972g(this.f100901a.f100897b).setVisibility(0);
                    CutVideoListScene.m123973h(this.f100901a.f100897b).setVisibility(0);
                    CutVideoListScene.m123981p(this.f100901a.f100897b).setVisibility(0);
                    VideoSegmentAdapter videoSegmentAdapter = this.f100901a.f100897b.f100871i;
                    if (videoSegmentAdapter == null) {
                        C7573i.m23580a();
                    }
                    videoSegmentAdapter.f100642d = false;
                    CutVideoListScene.m123982q(this.f100901a.f100897b).mo96955a(this.f100901a.f100897b.mo30921H().mo97241P().getSelectedTime());
                }
            }

            C38819a(C38818ae aeVar, ArrayList arrayList) {
                this.f100901a = aeVar;
                this.f100902b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            View view;
            float f;
            float f2;
            View rootView = CutVideoListScene.m123981p(this.f100897b).getRootView();
            C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            CutVideoListScene cutVideoListScene = this.f100897b;
            C1293v f3 = this.f100897b.mo30920G().mo5575f(this.f100898c);
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            cutVideoListScene.f100857O = view;
            this.f100897b.f100858P = C32068d.m104096a(this.f100897b.mo30920G());
            if (this.f100899d == null || this.f100897b.f100857O == null) {
                return false;
            }
            View view2 = this.f100897b.f100857O;
            if (view2 != null) {
                ArrayList arrayList = new ArrayList();
                C0902i<Integer, Integer> iVar = this.f100897b.f100858P;
                if (iVar != null) {
                    F f4 = iVar.f3154a;
                    if (f4 == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) f4, "range.first!!");
                    int i = this.f100898c;
                    for (int intValue = ((Number) f4).intValue(); intValue < i; intValue++) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        RecyclerView G = this.f100897b.mo30920G();
                        if (G == null) {
                            C7573i.m23580a();
                        }
                        C1293v f5 = G.mo5575f(intValue);
                        if (f5 != null) {
                            C7573i.m23582a((Object) f5, "videoRecyclerView!!.find…              ?: continue");
                            if (this.f100900e) {
                                View view3 = f5.itemView;
                                C7573i.m23582a((Object) view3, "viewHolder.itemView");
                                f2 = view3.getTranslationX() + ((float) (this.f100896a - this.f100899d.right));
                            } else {
                                View view4 = f5.itemView;
                                C7573i.m23582a((Object) view4, "viewHolder.itemView");
                                f2 = view4.getTranslationX() - ((float) this.f100899d.left);
                            }
                            View view5 = f5.itemView;
                            C7573i.m23582a((Object) view5, "viewHolder.itemView");
                            animatorSet.play(ObjectAnimator.ofFloat(f5.itemView, "translationX", new float[]{view5.getTranslationX(), f2}));
                            animatorSet.setDuration(300);
                            arrayList.add(animatorSet);
                        }
                    }
                    int i2 = this.f100898c + 1;
                    S s = iVar.f3155b;
                    if (s == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) s, "range.second!!");
                    int intValue2 = ((Number) s).intValue();
                    if (i2 <= intValue2) {
                        while (true) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            C1293v f6 = this.f100897b.mo30920G().mo5575f(i2);
                            if (f6 != null) {
                                C7573i.m23582a((Object) f6, "videoRecyclerView.findVi…              ?: continue");
                                if (this.f100900e) {
                                    View view6 = f6.itemView;
                                    C7573i.m23582a((Object) view6, "viewHolder.itemView");
                                    f = view6.getTranslationX() - ((float) this.f100899d.left);
                                } else {
                                    View view7 = f6.itemView;
                                    C7573i.m23582a((Object) view7, "viewHolder.itemView");
                                    f = view7.getTranslationX() + ((float) (this.f100896a - this.f100899d.right));
                                }
                                View view8 = f6.itemView;
                                C7573i.m23582a((Object) view8, "viewHolder.itemView");
                                animatorSet2.play(ObjectAnimator.ofFloat(f6.itemView, "translationX", new float[]{view8.getTranslationX(), f}));
                                animatorSet2.setDuration(300);
                                arrayList.add(animatorSet2);
                            }
                            if (i2 == intValue2) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                int width = CutVideoListScene.m123981p(this.f100897b).getWidth();
                int width2 = this.f100899d.width();
                int[] iArr = new int[2];
                FrameLayout p = CutVideoListScene.m123981p(this.f100897b);
                if (p == null) {
                    C7573i.m23580a();
                }
                p.getLocationInWindow(iArr);
                this.f100897b.f100854L = (((float) width) * 1.0f) / ((float) width2);
                float width3 = (float) (iArr[0] + (CutVideoListScene.m123981p(this.f100897b).getWidth() / 2));
                float height = (float) (iArr[1] + (CutVideoListScene.m123981p(this.f100897b).getHeight() / 2));
                this.f100897b.f100855M = width3 - ((float) this.f100899d.centerX());
                this.f100897b.f100856N = height - ((float) this.f100899d.centerY());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, this.f100897b.f100855M})).with(ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, this.f100897b.f100856N})).with(ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, this.f100897b.f100854L})).with(ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, this.f100897b.f100854L}));
                arrayList.add(animatorSet3);
                CutVideoListScene cutVideoListScene2 = this.f100897b;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C38819a(this, arrayList));
                cutVideoListScene2.f100859Q = animatorSet4;
                AnimatorSet animatorSet5 = this.f100897b.f100859Q;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        C38818ae(CutVideoListScene cutVideoListScene, int i, Rect rect, boolean z) {
            this.f100897b = cutVideoListScene;
            this.f100898c = i;
            this.f100899d = rect;
            this.f100900e = z;
            this.f100896a = C39805en.m127447b(cutVideoListScene.f33526d_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$af */
    public static final class C38820af implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100903a;

        /* renamed from: b */
        final /* synthetic */ int f100904b;

        /* renamed from: c */
        final /* synthetic */ boolean f100905c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$af$a */
        public static final class C38821a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C38820af f100906a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f100907b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                Activity activity = this.f100906a.f100903a.f33526d_;
                if (activity == null || !activity.isFinishing()) {
                    CutVideoListScene.m123971f(this.f100906a.f100903a).mo97105a(true);
                    CutVideoListScene.m123981p(this.f100906a.f100903a).setVisibility(8);
                    if (this.f100906a.f100905c) {
                        CutVideoListScene.m123967c(this.f100906a.f100903a).mo97708c(((VideoSegment) CutVideoListScene.m123967c(this.f100906a.f100903a).mo97721n().get(CutVideoListScene.m123965b(this.f100906a.f100903a).f100940e)).mo96908g());
                    }
                    VideoSegmentAdapter videoSegmentAdapter = this.f100906a.f100903a.f100871i;
                    if (videoSegmentAdapter == null) {
                        C7573i.m23580a();
                    }
                    videoSegmentAdapter.f100642d = true;
                    CutVideoListScene.m123982q(this.f100906a.f100903a).mo96955a(this.f100906a.f100903a.mo30921H().mo97241P().getSelectedTime());
                    this.f100906a.f100903a.f100860R = false;
                }
            }

            C38821a(C38820af afVar, ArrayList arrayList) {
                this.f100906a = afVar;
                this.f100907b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            View rootView = this.f100903a.mo30920G().getRootView();
            C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f100903a.f100857O == null || this.f100903a.f100858P == null) {
                return false;
            }
            View view = this.f100903a.f100857O;
            if (view != null) {
                ArrayList arrayList = new ArrayList();
                C0902i<Integer, Integer> iVar = this.f100903a.f100858P;
                if (iVar == null) {
                    C7573i.m23580a();
                }
                F f = iVar.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "visibleRage!!.first!!");
                int intValue = ((Number) f).intValue();
                int i3 = this.f100904b;
                while (true) {
                    i = 2;
                    if (intValue >= i3) {
                        break;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    RecyclerView G = this.f100903a.mo30920G();
                    if (G == null) {
                        C7573i.m23580a();
                    }
                    C1293v f2 = G.mo5575f(intValue);
                    if (f2 != null) {
                        C7573i.m23582a((Object) f2, "videoRecyclerView!!.find…              ?: continue");
                        View view2 = f2.itemView;
                        C7573i.m23582a((Object) view2, "viewHolder.itemView");
                        animatorSet.play(ObjectAnimator.ofFloat(f2.itemView, "translationX", new float[]{view2.getTranslationX(), 0.0f}));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                }
                int i4 = this.f100904b + 1;
                C0902i<Integer, Integer> iVar2 = this.f100903a.f100858P;
                if (iVar2 == null) {
                    C7573i.m23580a();
                }
                S s = iVar2.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "visibleRage!!.second!!");
                int intValue2 = ((Number) s).intValue();
                if (i4 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        RecyclerView G2 = this.f100903a.mo30920G();
                        if (G2 == null) {
                            C7573i.m23580a();
                        }
                        C1293v f3 = G2.mo5575f(i4);
                        if (f3 != null) {
                            C7573i.m23582a((Object) f3, "videoRecyclerView!!.find…              ?: continue");
                            float[] fArr = new float[i];
                            View view3 = f3.itemView;
                            C7573i.m23582a((Object) view3, "viewHolder.itemView");
                            fArr[0] = view3.getTranslationX();
                            fArr[1] = 0.0f;
                            animatorSet2.play(ObjectAnimator.ofFloat(f3.itemView, "translationX", fArr));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i4 == intValue2) {
                            break;
                        }
                        i4++;
                        i = 2;
                    }
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f}));
                arrayList.add(animatorSet3);
                CutVideoListScene cutVideoListScene = this.f100903a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C38821a(this, arrayList));
                cutVideoListScene.f100859Q = animatorSet4;
                AnimatorSet animatorSet5 = this.f100903a.f100859Q;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                VideoSegmentAdapter videoSegmentAdapter = this.f100903a.f100871i;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                if (this.f100903a.mo96988L()) {
                    i2 = CutVideoListScene.m123965b(this.f100903a).f100939d;
                } else {
                    i2 = 0;
                }
                videoSegmentAdapter.f100640b = i2;
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        C38820af(CutVideoListScene cutVideoListScene, int i, boolean z) {
            this.f100903a = cutVideoListScene;
            this.f100904b = i;
            this.f100905c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$b */
    public static final class C38822b implements C39170h {
        C38822b() {
        }

        /* renamed from: a */
        public final void mo97007a() {
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$c */
    static final class C38823c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100908a;

        /* renamed from: b */
        final /* synthetic */ boolean f100909b;

        /* renamed from: c */
        final /* synthetic */ float f100910c;

        C38823c(CutVideoListScene cutVideoListScene, boolean z, float f) {
            this.f100908a = cutVideoListScene;
            this.f100909b = z;
            this.f100910c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f100909b) {
                    CutVideoListScene.m123976k(this.f100908a).setAlpha(floatValue);
                    CutVideoListScene.m123976k(this.f100908a).setTranslationY(this.f100910c * (1.0f - floatValue));
                    return;
                }
                CutVideoListScene.m123976k(this.f100908a).setAlpha(1.0f - floatValue);
                CutVideoListScene.m123976k(this.f100908a).setTranslationY(this.f100910c * floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$d */
    public static final class C38824d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100911a;

        C38824d(CutVideoListScene cutVideoListScene) {
            this.f100911a = cutVideoListScene;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            CutVideoListScene.m123976k(this.f100911a).setVisibility(8);
            CutVideoListScene.m123976k(this.f100911a).setTranslationY(0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$e */
    static final class C38825e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100912a;

        C38825e(CutVideoListScene cutVideoListScene) {
            this.f100912a = cutVideoListScene;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float f;
            VideoSegmentAdapter videoSegmentAdapter = this.f100912a.f100871i;
            if (videoSegmentAdapter == null) {
                C7573i.m23580a();
            }
            int a = videoSegmentAdapter.mo96796a(this.f100912a.mo30920G(), this.f100912a.f100848F);
            VideoSegmentAdapter videoSegmentAdapter2 = this.f100912a.f100871i;
            if (videoSegmentAdapter2 == null) {
                C7573i.m23580a();
            }
            int a2 = videoSegmentAdapter2.mo96796a(this.f100912a.mo30920G(), this.f100912a.f100849G);
            if (a == -1 && a2 == -1) {
                CutVideoListScene.m123980o(this.f100912a).setTranslationX(0.0f);
                CutVideoListScene.m123980o(this.f100912a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                CutVideoListScene.m123980o(this.f100912a).setVisibility(0);
                view = CutVideoListScene.m123980o(this.f100912a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                CutVideoListScene.m123980o(this.f100912a).setVisibility(0);
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                    f = floatValue;
                    view = CutVideoListScene.m123980o(this.f100912a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            view.setX(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$f */
    static final class C38826f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100913a;

        C38826f(CutVideoListScene cutVideoListScene) {
            this.f100913a = cutVideoListScene;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f100913a.f100860R) {
                this.f100913a.f100860R = true;
                C38774k.m123823c();
                CutVideoListScene.m123968d(this.f100913a).mo96672d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$g */
    static final class C38827g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100914a;

        C38827g(CutVideoListScene cutVideoListScene) {
            this.f100914a = cutVideoListScene;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f100914a.f100860R) {
                this.f100914a.f100860R = true;
                C38774k.m123821b();
                CutVideoListScene.m123968d(this.f100914a).mo96671c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$h */
    static final class C38828h<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100915a;

        C38828h(CutVideoListScene cutVideoListScene) {
            this.f100915a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            if (iVar != null) {
                CutVideoListScene cutVideoListScene = this.f100915a;
                F f = iVar.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "pair.first!!");
                int intValue = ((Number) f).intValue();
                S s = iVar.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "pair.second!!");
                cutVideoListScene.mo96989a(intValue, ((Number) s).intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$i */
    static final class C38829i extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100916a;

        C38829i(CutVideoListScene cutVideoListScene) {
            this.f100916a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124026a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124026a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (CutVideoListScene.m123970e(this.f100916a).f100834d == 2) {
                this.f100916a.f100853K = z;
            } else {
                this.f100916a.f100852J = z;
            }
            if (z) {
                C38982av avVar = this.f100916a.f100872j;
                if (avVar == null || !avVar.mo97280k()) {
                    CutVideoSpeedViewModel f = CutVideoListScene.m123971f(this.f100916a);
                    RecordingSpeed d = C38774k.m123824d(this.f100916a.mo30921H().mo97241P().getCurrentSpeed());
                    C7573i.m23582a((Object) d, "MVConfig.fromValue(previ…oEditView().currentSpeed)");
                    f.mo97104a(d);
                    CutVideoListScene.m123971f(this.f100916a).mo97106b(true);
                    return;
                }
            }
            CutVideoListScene.m123971f(this.f100916a).mo97106b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$j */
    static final class C38830j extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100917a;

        C38830j(CutVideoListScene cutVideoListScene) {
            this.f100917a = cutVideoListScene;
            super(2);
        }

        /* renamed from: a */
        private void m124027a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            CutVideoListScene.m123972g(this.f100917a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124027a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$k */
    static final class C38831k extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100918a;

        C38831k(CutVideoListScene cutVideoListScene) {
            this.f100918a = cutVideoListScene;
            super(2);
        }

        /* renamed from: a */
        private void m124028a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            CutVideoListScene.m123973h(this.f100918a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124028a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$l */
    static final class C38832l extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100919a;

        C38832l(CutVideoListScene cutVideoListScene) {
            this.f100919a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124029a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124029a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                CutVideoListScene.m123974i(this.f100919a).setButtonClickable(false);
            }
            C38889a.m124163a(CutVideoListScene.m123974i(this.f100919a), z, new C7562b<Boolean, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C38832l f100920a;

                {
                    this.f100920a = r1;
                }

                /* renamed from: a */
                private void m124030a(boolean z) {
                    CutVideoListScene.m123974i(this.f100920a.f100919a).setButtonClickable(z);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m124030a(((Boolean) obj).booleanValue());
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$m */
    static final class C38834m extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100921a;

        C38834m(CutVideoListScene cutVideoListScene) {
            this.f100921a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124031a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124031a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                CutVideoListScene.m123974i(this.f100921a).setButtonClickable(false);
            }
            C38889a.m124164b(CutVideoListScene.m123974i(this.f100921a), z, new C7562b<Boolean, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C38834m f100922a;

                {
                    this.f100922a = r1;
                }

                /* renamed from: a */
                private void m124032a(boolean z) {
                    CutVideoListScene.m123974i(this.f100922a.f100921a).setButtonClickable(z);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m124032a(((Boolean) obj).booleanValue());
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$n */
    public static final class C38836n implements C39249a {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100923a;

        C38836n(CutVideoListScene cutVideoListScene) {
            this.f100923a = cutVideoListScene;
        }

        /* renamed from: a */
        public final void mo96777a(VideoSegment videoSegment) {
            VideoSegmentAdapter videoSegmentAdapter = this.f100923a.f100871i;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96804a(videoSegment);
            }
        }

        /* renamed from: b */
        public final void mo96778b(VideoSegment videoSegment) {
            this.f100923a.f100850H = System.currentTimeMillis();
            VideoSegmentAdapter videoSegmentAdapter = this.f100923a.f100871i;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96808b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$o */
    static final class C38837o extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100924a;

        C38837o(CutVideoListScene cutVideoListScene) {
            this.f100924a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124035a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124035a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C38889a.m124163a(CutVideoListScene.m123975j(this.f100924a), true, C388381.f100925a);
            } else {
                C39145b.m124991a(CutVideoListScene.m123975j(this.f100924a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$p */
    static final class C38839p extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100926a;

        C38839p(CutVideoListScene cutVideoListScene) {
            this.f100926a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124036a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124036a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C38889a.m124164b(CutVideoListScene.m123975j(this.f100926a), true, C388401.f100927a);
            } else {
                C39145b.m124992a(CutVideoListScene.m123975j(this.f100926a), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$q */
    static final class C38841q extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100928a;

        C38841q(CutVideoListScene cutVideoListScene) {
            this.f100928a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124037a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124037a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            StickPointSingleVideoEditView j = CutVideoListScene.m123975j(this.f100928a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            j.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$r */
    static final class C38842r<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100929a;

        C38842r(CutVideoListScene cutVideoListScene) {
            this.f100929a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                CutVideoListScene.m123976k(this.f100929a).setAlpha(1.0f);
                FrameLayout k = CutVideoListScene.m123976k(this.f100929a);
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                k.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$s */
    static final class C38843s extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100930a;

        C38843s(CutVideoListScene cutVideoListScene) {
            this.f100930a = cutVideoListScene;
            super(2);
        }

        /* renamed from: a */
        private void m124039a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f100930a.mo96994a(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124039a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$t */
    static final class C38844t<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100931a;

        C38844t(CutVideoListScene cutVideoListScene) {
            this.f100931a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            this.f100931a.mo30922I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$u */
    static final class C38845u<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100932a;

        C38845u(CutVideoListScene cutVideoListScene) {
            this.f100932a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100932a.mo96995a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$v */
    static final class C38846v<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100933a;

        C38846v(CutVideoListScene cutVideoListScene) {
            this.f100933a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100933a.mo96995a(true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$w */
    static final class C38847w<T> implements C0053p<VideoSegment> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100934a;

        C38847w(CutVideoListScene cutVideoListScene) {
            this.f100934a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(VideoSegment videoSegment) {
            this.f100934a.mo96995a(false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$x */
    static final class C38848x<T> implements C0053p<C38786e> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100935a;

        C38848x(CutVideoListScene cutVideoListScene) {
            this.f100935a = cutVideoListScene;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C38786e eVar) {
            Integer num;
            if (eVar != null) {
                num = Integer.valueOf(eVar.f100800b);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f100935a.f100862T) {
                    this.f100935a.f100861S = eVar.f100801c;
                    this.f100935a.mo96996b(true);
                    CutVideoListScene.m123963a(this.f100935a).mo97802a(new C39293a(2, false));
                }
                this.f100935a.f100862T = false;
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f100935a.mo96996b(false);
                this.f100935a.mo96990a(eVar.f100802d, this.f100935a.f100861S, eVar.f100799a);
                if (this.f100935a.f100872j != null) {
                    CutVideoListViewModel b = CutVideoListScene.m123965b(this.f100935a);
                    Activity activity = this.f100935a.f33526d_;
                    if (activity != null) {
                        b.mo97039a((FragmentActivity) activity, this.f100935a.f100861S, eVar.f100802d);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
                this.f100935a.f100862T = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$y */
    static final class C38849y extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100936a;

        C38849y(CutVideoListScene cutVideoListScene) {
            this.f100936a = cutVideoListScene;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124045a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124045a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            CutVideoListScene.m123968d(this.f100936a).mo96667a((VideoSegment) CutVideoListScene.m123967c(this.f100936a).mo97721n().get(CutVideoListScene.m123965b(this.f100936a).f100940e));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene$z */
    static final class C38850z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CutVideoListScene f100937a;

        C38850z(CutVideoListScene cutVideoListScene) {
            this.f100937a = cutVideoListScene;
        }

        public final void run() {
            int i;
            Context context = this.f100937a.f33526d_;
            Resources x = this.f100937a.mo31017x();
            if (C40173d.m128359d()) {
                i = R.string.alm;
            } else {
                i = R.string.e29;
            }
            C10761a.m31387a(context, x.getString(i)).mo25750a();
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo96991a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f100873k = afVar;
    }

    /* renamed from: a */
    public final void mo96992a(C39052bl blVar) {
        C7573i.m23587b(blVar, "<set-?>");
        this.f100875m = blVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.dq_);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.tvVideoSegmentDes)");
        this.f100866Y = (TextView) h_;
        View h_2 = mo31004h_(R.id.ea5);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.videoRecyclerView)");
        this.f100874l = (RecyclerView) h_2;
        View h_3 = mo31004h_(R.id.g_);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.animTabDot)");
        this.f100876n = h_3;
        View h_4 = mo31004h_(R.id.ebj);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.video_seg_view)");
        this.f100877o = (StickPointVideoSegView) h_4;
        View h_5 = mo31004h_(R.id.b5j);
        C7573i.m23582a((Object) h_5, "requireViewById(R.id.ivEditVideo)");
        this.f100867Z = (RemoteImageView) h_5;
        View h_6 = mo31004h_(R.id.d6z);
        C7573i.m23582a((Object) h_6, "requireViewById(R.id.singleEditLayout)");
        this.f100868aa = (FrameLayout) h_6;
        View h_7 = mo31004h_(R.id.b5o);
        C7573i.m23582a((Object) h_7, "requireViewById(R.id.ivSave)");
        this.f100878p = (ImageView) h_7;
        View h_8 = mo31004h_(R.id.b5h);
        C7573i.m23582a((Object) h_8, "requireViewById(R.id.ivCancel)");
        this.f100879q = (ImageView) h_8;
        View h_9 = mo31004h_(R.id.alq);
        C7573i.m23582a((Object) h_9, "requireViewById(R.id.flEditVideo)");
        this.f100880r = (FrameLayout) h_9;
        View h_10 = mo31004h_(R.id.o5);
        C7573i.m23582a((Object) h_10, "requireViewById(R.id.bottom_recyle_view)");
        this.f100881s = (FrameLayout) h_10;
        TextView textView = this.f100866Y;
        if (textView == null) {
            C7573i.m23583a("tvVideoSegmentDes");
        }
        textView.setShadowLayer(2.0f, 0.0f, 0.0f, mo31017x().getColor(R.color.a7s));
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            view.setLayoutParams(layoutParams2);
            m123955M();
            CutVideoViewModel cutVideoViewModel = this.f100869ab;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97162o()) {
                C12629j jVar = this.f33524c;
                if (jVar == null) {
                    C7573i.m23580a();
                }
                View h_11 = jVar.mo31004h_(R.id.d72);
                C7573i.m23582a((Object) h_11, "parentScene!!.requireVie…(R.id.single_edit_layout)");
                this.f100882t = (StickPointSingleVideoEditView) h_11;
                C38982av avVar = this.f100872j;
                if (avVar != null) {
                    avVar.mo97262a(this.f100851I);
                }
            } else {
                FrameLayout frameLayout = this.f100881s;
                if (frameLayout == null) {
                    C7573i.m23583a("recyclerViewLayout");
                }
                frameLayout.setVisibility(0);
            }
            m123959Q();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo96993a(List<? extends MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        C38982av avVar = this.f100872j;
        if (avVar == null) {
            C7573i.m23580a();
        }
        C39171i iVar = avVar.f101220e;
        if (iVar == null) {
            C7573i.m23580a();
        }
        int size = iVar.mo96784c().size();
        if (list == null) {
            C7573i.m23580a();
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i));
            videoSegment.f100759a = size;
            arrayList.add(videoSegment);
            size++;
        }
        List list2 = arrayList;
        this.f100851I.mo97348a(list2);
        this.f100851I.mo97352c();
        C38982av avVar2 = this.f100872j;
        if (avVar2 == null) {
            C7573i.m23580a();
        }
        avVar2.mo97269b().mo97599a(list2);
        C38982av avVar3 = this.f100872j;
        if (avVar3 == null) {
            C7573i.m23580a();
        }
        if (avVar3.f101220e != null) {
            C38982av avVar4 = this.f100872j;
            if (avVar4 == null) {
                C7573i.m23580a();
            }
            C39171i iVar2 = avVar4.f101220e;
            if (iVar2 == null) {
                C7573i.m23580a();
            }
            iVar2.mo96781a(list2);
        }
        if (mo96988L()) {
            C38982av avVar5 = this.f100872j;
            if (avVar5 == null) {
                C7573i.m23580a();
            }
            avVar5.f101218c.mo97498a(list2, size, (C39170h) new C38822b());
        }
    }

    /* renamed from: a */
    public final void mo96989a(int i, int i2) {
        CutVideoEditViewModel cutVideoEditViewModel = this.f100843A;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        if (cutVideoEditViewModel.f100834d != 2) {
            if (i != i2) {
                m123969d(i2);
                VideoSegmentAdapter videoSegmentAdapter = this.f100871i;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                if (i == videoSegmentAdapter.f100640b) {
                    this.f100848F = i;
                    this.f100849G = i2;
                    ValueAnimator valueAnimator = this.f100847E;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(500);
                    ofFloat.addUpdateListener(new C38825e(this));
                    this.f100847E = ofFloat;
                    ValueAnimator valueAnimator2 = this.f100847E;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                } else {
                    return;
                }
            }
            VideoSegmentAdapter videoSegmentAdapter2 = this.f100871i;
            if (videoSegmentAdapter2 == null) {
                C7573i.m23580a();
            }
            videoSegmentAdapter2.f100640b = i2;
        }
    }

    /* renamed from: a */
    public final void mo96995a(boolean z, boolean z2) {
        if (z2) {
            VideoSegmentAdapter videoSegmentAdapter = this.f100871i;
            if (videoSegmentAdapter != null && videoSegmentAdapter.mo96795a() == 0) {
                CutVideoViewModel cutVideoViewModel = this.f100869ab;
                if (cutVideoViewModel == null) {
                    C7573i.m23583a("cutVideoViewModel");
                }
                cutVideoViewModel.mo29069f();
                return;
            }
        }
        m123961S();
        if (this.f100872j != null) {
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f100870ac;
            if (cutVideoPreviewViewModel == null) {
                C7573i.m23583a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo97092g();
            C38971ar arVar = this.f100865W;
            if (arVar != null) {
                arVar.mo97194a();
            }
            CutVideoListViewModel cutVideoListViewModel = this.f100844B;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            Activity activity = this.f33526d_;
            if (activity != null) {
                cutVideoListViewModel.mo97041a((FragmentActivity) activity, z, z2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        C38916af afVar = this.f100873k;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        afVar.mo97216a(z, z2);
        CutVideoEditViewModel cutVideoEditViewModel = this.f100843A;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        cutVideoEditViewModel.mo29069f();
        if (z2) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f100883u;
            if (cutMultiVideoViewModel == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo96662a();
        }
        m123966b(z, z2);
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f100870ac;
        if (cutVideoPreviewViewModel2 == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel2.mo29069f();
        C39193g.f101577a.mo97482a(mo96988L(), false, z, !z, z2, false);
    }

    /* renamed from: a */
    public final void mo96994a(boolean z) {
        FrameLayout frameLayout = this.f100881s;
        if (frameLayout == null) {
            C7573i.m23583a("recyclerViewLayout");
        }
        frameLayout.setVisibility(0);
        float b = C9738o.m28708b((Context) this.f33526d_, 16.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C38823c(this, z, b));
        if (!z) {
            ofFloat.addListener(new C38824d(this));
        }
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: a */
    public final void mo96990a(int i, int i2, boolean z) {
        if (z) {
            C39052bl blVar = this.f100875m;
            if (blVar == null) {
                C7573i.m23583a("previewEditCallback");
            }
            C39252c P = blVar.mo97241P();
            P.mo97640c();
            C38916af afVar = this.f100873k;
            if (afVar == null) {
                C7573i.m23583a("presenter");
            }
            afVar.mo97206a(i2, i);
            long j = 0;
            for (int i3 = 0; i3 < i; i3++) {
                VideoEditViewModel videoEditViewModel = this.f100884v;
                if (videoEditViewModel == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo97721n().get(i3);
                if (!videoSegment.f100768j) {
                    C7573i.m23582a((Object) videoSegment, "videoSegment");
                    float i4 = (float) (videoSegment.mo96910i() - videoSegment.mo96909h());
                    VideoEditViewModel videoEditViewModel2 = this.f100884v;
                    if (videoEditViewModel2 == null) {
                        C7573i.m23583a("videoEditViewModel");
                    }
                    j += (long) (i4 / (videoEditViewModel2.mo97722o() * videoSegment.mo96911j()));
                }
            }
            if (j >= P.getMaxCutDuration()) {
                j = 0;
            }
            if (j != 0) {
                j += 30;
            }
            C38916af afVar2 = this.f100873k;
            if (afVar2 == null) {
                C7573i.m23583a("presenter");
            }
            C0902i playBoundary = P.getPlayBoundary();
            C7573i.m23582a((Object) playBoundary, "videoEditView.playBoundary");
            afVar2.mo97210a(playBoundary, P.getMaxCutDuration());
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f100885w;
            if (vEVideoCutterViewModel == null) {
                C7573i.m23583a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            C38916af afVar3 = this.f100873k;
            if (afVar3 == null) {
                C7573i.m23583a("presenter");
            }
            if (!afVar3.mo97219c()) {
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f100883u;
                if (cutMultiVideoViewModel == null) {
                    C7573i.m23583a("cutMultiVideoViewModel");
                }
                VideoEditViewModel videoEditViewModel3 = this.f100884v;
                if (videoEditViewModel3 == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                List m = videoEditViewModel3.mo97720m();
                VideoEditViewModel videoEditViewModel4 = this.f100884v;
                if (videoEditViewModel4 == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                cutMultiVideoViewModel.mo96666a(j, m, videoEditViewModel4.mo97722o());
            }
            C39193g.f101577a.mo97482a(mo96988L(), false, false, false, false, true);
            return;
        }
        VEVideoCutterViewModel vEVideoCutterViewModel2 = this.f100885w;
        if (vEVideoCutterViewModel2 == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel2.mo97802a(new C39293a(1, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: G */
    public final RecyclerView mo30920G() {
        RecyclerView recyclerView = this.f100874l;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: H */
    public final C39052bl mo30921H() {
        C39052bl blVar = this.f100875m;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        return blVar;
    }

    /* renamed from: J */
    public final void mo96986J() {
        StickPointVideoSegView stickPointVideoSegView = this.f100877o;
        if (stickPointVideoSegView == null) {
            C7573i.m23583a("stickPointVideoTitleView");
        }
        stickPointVideoSegView.setVisibility(0);
    }

    /* renamed from: K */
    public final void mo96987K() {
        StickPointVideoSegView stickPointVideoSegView = this.f100877o;
        if (stickPointVideoSegView == null) {
            C7573i.m23583a("stickPointVideoTitleView");
        }
        stickPointVideoSegView.setVisibility(8);
    }

    /* renamed from: L */
    public final boolean mo96988L() {
        if (this.f100872j == null) {
            return false;
        }
        C38982av avVar = this.f100872j;
        if (avVar == null) {
            C7573i.m23580a();
        }
        return avVar.mo97280k();
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        ValueAnimator valueAnimator = this.f100847E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.f100859Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: O */
    private final void m123957O() {
        ImageView imageView = this.f100878p;
        if (imageView == null) {
            C7573i.m23583a("ivSave");
        }
        imageView.setOnClickListener(new C38826f(this));
        ImageView imageView2 = this.f100879q;
        if (imageView2 == null) {
            C7573i.m23583a("ivCancel");
        }
        imageView2.setOnClickListener(new C38827g(this));
    }

    /* renamed from: P */
    private final void m123958P() {
        C38814aa aaVar = new C38814aa(this);
        StickPointVideoSegView stickPointVideoSegView = this.f100877o;
        if (stickPointVideoSegView == null) {
            C7573i.m23583a("stickPointVideoTitleView");
        }
        C39172j jVar = aaVar;
        stickPointVideoSegView.setStickPointVideoSegListener(jVar);
        this.f100851I.mo97347a(jVar);
        C39054bn bnVar = this.f100851I;
        RecyclerView recyclerView = this.f100874l;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        bnVar.mo97346a((StickPointVideoSegmentAdapter) recyclerView.getAdapter());
        ArrayList a = this.f100851I.mo97344a();
        if (a == null) {
            C7573i.m23580a();
        }
        if (a.size() < 8) {
            C12637b.m36715a(this, new C38850z(this), 200);
        }
    }

    /* renamed from: R */
    private final void m123960R() {
        int i;
        this.f100854L = 1.0f;
        this.f100855M = 0.0f;
        this.f100856N = 0.0f;
        boolean z = true;
        if (!mo96988L() || !C39182e.m125102e()) {
            CutVideoListViewModel cutVideoListViewModel = this.f100844B;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            i = cutVideoListViewModel.f100939d;
        } else {
            CutVideoListViewModel cutVideoListViewModel2 = this.f100844B;
            if (cutVideoListViewModel2 == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            i = cutVideoListViewModel2.f100939d + 1;
        }
        VideoSegmentAdapter videoSegmentAdapter = this.f100871i;
        if (videoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        RecyclerView recyclerView = this.f100874l;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        Rect b = videoSegmentAdapter.mo96806b(recyclerView, i);
        RecyclerView recyclerView2 = this.f100874l;
        if (recyclerView2 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        if (C0991u.m4220h(recyclerView2) != 1) {
            z = false;
        }
        FrameLayout frameLayout = this.f100868aa;
        if (frameLayout == null) {
            C7573i.m23583a("singleEditLayout");
        }
        frameLayout.setVisibility(0);
        ImageView imageView = this.f100878p;
        if (imageView == null) {
            C7573i.m23583a("ivSave");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.f100879q;
        if (imageView2 == null) {
            C7573i.m23583a("ivCancel");
        }
        imageView2.setVisibility(8);
        FrameLayout frameLayout2 = this.f100880r;
        if (frameLayout2 == null) {
            C7573i.m23583a("flEditVideo");
        }
        frameLayout2.setVisibility(4);
        FrameLayout frameLayout3 = this.f100880r;
        if (frameLayout3 == null) {
            C7573i.m23583a("flEditVideo");
        }
        View rootView = frameLayout3.getRootView();
        C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
        rootView.getViewTreeObserver().addOnPreDrawListener(new C38818ae(this, i, b, z));
    }

    /* renamed from: S */
    private final void m123961S() {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f100888z;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo97149a(true);
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f100888z;
        if (cutVideoTitleBarViewModel2 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel2.mo97150b(true);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f100887y;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel.mo96959c(false);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f100887y;
        if (cutVideoBottomBarViewModel2 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel2.mo96960d(false);
        TextView textView = this.f100866Y;
        if (textView == null) {
            C7573i.m23583a("tvVideoSegmentDes");
        }
        textView.setVisibility(0);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f100887y;
        if (cutVideoBottomBarViewModel3 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel3.mo96956a(false);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f100887y;
        if (cutVideoBottomBarViewModel4 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel4.mo96958b(this.f100852J);
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f100886x;
        if (cutVideoSpeedViewModel == null) {
            C7573i.m23583a("speedViewModel");
        }
        cutVideoSpeedViewModel.mo97105a(false);
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f100886x;
        if (cutVideoSpeedViewModel2 == null) {
            C7573i.m23583a("speedViewModel");
        }
        cutVideoSpeedViewModel2.mo97106b(this.f100852J);
        if (this.f100852J) {
            CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f100886x;
            if (cutVideoSpeedViewModel3 == null) {
                C7573i.m23583a("speedViewModel");
            }
            VideoEditViewModel videoEditViewModel = this.f100884v;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            RecordingSpeed d = C38774k.m123824d(videoEditViewModel.mo97722o());
            C7573i.m23582a((Object) d, "MVConfig.fromValue(videoEditViewModel.totalSpeed)");
            cutVideoSpeedViewModel3.mo97104a(d);
        }
    }

    /* renamed from: I */
    public final void mo30922I() {
        float f;
        VideoEditViewModel videoEditViewModel = this.f100884v;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n = videoEditViewModel.mo97721n();
        CutVideoListViewModel cutVideoListViewModel = this.f100844B;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) n.get(cutVideoListViewModel.f100940e);
        C7573i.m23582a((Object) videoSegment, "curEditVideo");
        m123964a(videoSegment);
        C38916af afVar = this.f100873k;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        CutVideoListViewModel cutVideoListViewModel2 = this.f100844B;
        if (cutVideoListViewModel2 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        afVar.mo97204a(cutVideoListViewModel2.f100940e);
        if (this.f100872j != null) {
            C38971ar arVar = this.f100865W;
            if (arVar != null) {
                arVar.mo97195b();
            }
            CutVideoListViewModel cutVideoListViewModel3 = this.f100844B;
            if (cutVideoListViewModel3 == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            Activity activity = this.f33526d_;
            if (activity != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                CutVideoListViewModel cutVideoListViewModel4 = this.f100844B;
                if (cutVideoListViewModel4 == null) {
                    C7573i.m23583a("cutVideoListViewModel");
                }
                cutVideoListViewModel3.mo97040a(fragmentActivity, cutVideoListViewModel4.f100940e, videoSegment);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        if (videoSegment.mo96911j() == 0.0f) {
            f = 1.0f;
        } else {
            f = videoSegment.mo96911j();
        }
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100885w;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97802a(new C39293a(3, (long) (((float) videoSegment.mo96909h()) / f), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
        m123960R();
        C39193g.f101577a.mo97482a(mo96988L(), true, false, false, false, false);
    }

    /* renamed from: M */
    private final void m123955M() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(CutMultiVideoViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f100883u = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VideoEditViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java]");
                this.f100884v = (VideoEditViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…deoViewModel::class.java]");
                    this.f100869ab = (CutVideoViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        C0063u a4 = C0069x.m159a((FragmentActivity) activity4).mo147a(VEVideoCutterViewModel.class);
                        C7573i.m23582a((Object) a4, "ViewModelProviders.of(ac…terViewModel::class.java]");
                        this.f100885w = (VEVideoCutterViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoSpeedViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…eedViewModel::class.java)");
                            this.f100886x = (CutVideoSpeedViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(CutVideoBottomBarViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…BarViewModel::class.java)");
                                this.f100887y = (CutVideoBottomBarViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(CutVideoTitleBarViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…BarViewModel::class.java)");
                                    this.f100888z = (CutVideoTitleBarViewModel) a7;
                                    Activity activity8 = this.f33526d_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C36113b.m116288a((FragmentActivity) activity8).mo91871a(CutVideoEditViewModel.class);
                                        C7573i.m23582a((Object) a8, "JediViewModelProviders.o…ditViewModel::class.java)");
                                        this.f100843A = (CutVideoEditViewModel) a8;
                                        Activity activity9 = this.f33526d_;
                                        if (activity9 != null) {
                                            JediViewModel a9 = C36113b.m116288a((FragmentActivity) activity9).mo91871a(CutVideoPreviewViewModel.class);
                                            C7573i.m23582a((Object) a9, "JediViewModelProviders.o…iewViewModel::class.java)");
                                            this.f100870ac = (CutVideoPreviewViewModel) a9;
                                            Activity activity10 = this.f33526d_;
                                            if (activity10 != null) {
                                                JediViewModel a10 = C36113b.m116288a((FragmentActivity) activity10).mo91871a(CutVideoListViewModel.class);
                                                C7573i.m23582a((Object) a10, "JediViewModelProviders.o…istViewModel::class.java)");
                                                this.f100844B = (CutVideoListViewModel) a10;
                                                Activity activity11 = this.f33526d_;
                                                if (activity11 != null) {
                                                    JediViewModel a11 = C36113b.m116288a((FragmentActivity) activity11).mo91871a(CutVideoStickerPointMusicViewModel.class);
                                                    C7573i.m23582a((Object) a11, "JediViewModelProviders.o…sicViewModel::class.java)");
                                                    this.f100845C = (CutVideoStickerPointMusicViewModel) a11;
                                                    Activity activity12 = this.f33526d_;
                                                    if (activity12 != null) {
                                                        JediViewModel a12 = C36113b.m116288a((FragmentActivity) activity12).mo91871a(CutVideoMultiModeViewModel.class);
                                                        C7573i.m23582a((Object) a12, "JediViewModelProviders.o…odeViewModel::class.java)");
                                                        this.f100846D = (CutVideoMultiModeViewModel) a12;
                                                        return;
                                                    }
                                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: N */
    private final void m123956N() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f100883u;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        C0043i iVar = this;
        cutMultiVideoViewModel.f100394a.observe(iVar, new C38828h(this));
        VideoEditViewModel videoEditViewModel = this.f100884v;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel.f101856u = new C38836n(this);
        VideoEditViewModel videoEditViewModel2 = this.f100884v;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel2.f101849n.observe(iVar, new C38844t(this));
        VideoEditViewModel videoEditViewModel3 = this.f100884v;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel3.f101850o.observe(iVar, new C38845u(this));
        VideoEditViewModel videoEditViewModel4 = this.f100884v;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel4.f101851p.observe(iVar, new C38846v(this));
        VideoEditViewModel videoEditViewModel5 = this.f100884v;
        if (videoEditViewModel5 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel5.f101852q.observe(iVar, new C38847w(this));
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f100883u;
        if (cutMultiVideoViewModel2 == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel2.f100403j.observe(iVar, new C38848x(this));
        CutVideoListViewModel cutVideoListViewModel = this.f100844B;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel, C39103z.f101414a, new C11672v(), new C38849y(this));
        CutVideoListViewModel cutVideoListViewModel2 = this.f100844B;
        if (cutVideoListViewModel2 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel2, C39094q.f101405a, new C11672v(), new C38829i(this));
        CutVideoListViewModel cutVideoListViewModel3 = this.f100844B;
        if (cutVideoListViewModel3 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91868b(cutVideoListViewModel3, C39095r.f101406a, new C11672v(), new C38830j(this));
        CutVideoListViewModel cutVideoListViewModel4 = this.f100844B;
        if (cutVideoListViewModel4 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91868b(cutVideoListViewModel4, C39096s.f101407a, new C11672v(), new C38831k(this));
        CutVideoListViewModel cutVideoListViewModel5 = this.f100844B;
        if (cutVideoListViewModel5 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel5, C39097t.f101408a, new C11672v(), new C38832l(this));
        CutVideoListViewModel cutVideoListViewModel6 = this.f100844B;
        if (cutVideoListViewModel6 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel6, C39098u.f101409a, new C11672v(), new C38834m(this));
        CutVideoListViewModel cutVideoListViewModel7 = this.f100844B;
        if (cutVideoListViewModel7 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel7, C39099v.f101410a, new C11672v(), new C38837o(this));
        CutVideoListViewModel cutVideoListViewModel8 = this.f100844B;
        if (cutVideoListViewModel8 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel8, C39100w.f101411a, new C11672v(), new C38839p(this));
        CutVideoListViewModel cutVideoListViewModel9 = this.f100844B;
        if (cutVideoListViewModel9 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91868b(cutVideoListViewModel9, C39101x.f101412a, new C11672v(), new C38841q(this));
        CutVideoListViewModel cutVideoListViewModel10 = this.f100844B;
        if (cutVideoListViewModel10 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        cutVideoListViewModel10.mo97049g().observe(iVar, new C38842r(this));
        CutVideoListViewModel cutVideoListViewModel11 = this.f100844B;
        if (cutVideoListViewModel11 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        mo91869c(cutVideoListViewModel11, C39102y.f101413a, new C11672v(), new C38843s(this));
    }

    /* renamed from: Q */
    private final void m123959Q() {
        VideoSegmentAdapter videoSegmentAdapter;
        VECutMultiVideoSegmentTouchCallback vECutMultiVideoSegmentTouchCallback;
        CutVideoViewModel cutVideoViewModel = this.f100869ab;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o()) {
            VideoEditViewModel videoEditViewModel = this.f100884v;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f100883u;
            if (cutMultiVideoViewModel == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            VideoEditViewModel videoEditViewModel2 = this.f100884v;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            List m = videoEditViewModel2.mo97720m();
            C7573i.m23582a((Object) m, "videoEditViewModel.videoEditedList");
            videoSegmentAdapter = new StickPointVideoSegmentAdapter(videoEditViewModel, cutMultiVideoViewModel, m);
        } else {
            VideoEditViewModel videoEditViewModel3 = this.f100884v;
            if (videoEditViewModel3 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f100883u;
            if (cutMultiVideoViewModel2 == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            VideoEditViewModel videoEditViewModel4 = this.f100884v;
            if (videoEditViewModel4 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            videoSegmentAdapter = new VideoSegmentAdapter(videoEditViewModel3, cutMultiVideoViewModel2, videoEditViewModel4.mo97720m());
        }
        this.f100871i = videoSegmentAdapter;
        VideoSegmentAdapter videoSegmentAdapter2 = this.f100871i;
        if (videoSegmentAdapter2 == null) {
            C7573i.m23580a();
        }
        videoSegmentAdapter2.f100641c = new C38815ab(this);
        if (this.f100871i instanceof StickPointVideoSegmentAdapter) {
            VideoSegmentAdapter videoSegmentAdapter3 = this.f100871i;
            if (videoSegmentAdapter3 != null) {
                ((StickPointVideoSegmentAdapter) videoSegmentAdapter3).mo97429a(C39182e.m125105i());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter");
            }
        }
        CutVideoViewModel cutVideoViewModel2 = this.f100869ab;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo97162o()) {
            VideoSegmentAdapter videoSegmentAdapter4 = this.f100871i;
            if (videoSegmentAdapter4 == null) {
                C7573i.m23580a();
            }
            vECutMultiVideoSegmentTouchCallback = new StickPointVideoSegmentTouchCallback(videoSegmentAdapter4);
        } else {
            VideoSegmentAdapter videoSegmentAdapter5 = this.f100871i;
            if (videoSegmentAdapter5 == null) {
                C7573i.m23580a();
            }
            vECutMultiVideoSegmentTouchCallback = new VECutMultiVideoSegmentTouchCallback(videoSegmentAdapter5);
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(vECutMultiVideoSegmentTouchCallback);
        RecyclerView recyclerView = this.f100874l;
        if (recyclerView == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        itemTouchHelper.mo6500a(recyclerView);
        RecyclerView recyclerView2 = this.f100874l;
        if (recyclerView2 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView2.setLayoutManager(new VideoLayoutManager(mo31015v()));
        RecyclerView recyclerView3 = this.f100874l;
        if (recyclerView3 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView3.setAdapter(this.f100871i);
        RecyclerView recyclerView4 = this.f100874l;
        if (recyclerView4 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.f4941j = 300;
        defaultItemAnimator.f4943l = 300;
        defaultItemAnimator.f4942k = 300;
        defaultItemAnimator.f4940i = 300;
        recyclerView4.setItemAnimator(defaultItemAnimator);
        RecyclerView recyclerView5 = this.f100874l;
        if (recyclerView5 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView5.getViewTreeObserver().addOnPreDrawListener(new C38816ac(this));
        RecyclerView recyclerView6 = this.f100874l;
        if (recyclerView6 == null) {
            C7573i.m23583a("videoRecyclerView");
        }
        recyclerView6.setOnTouchListener(new C38817ad(this));
        VideoSegmentAdapter videoSegmentAdapter6 = this.f100871i;
        if (videoSegmentAdapter6 != null) {
            videoSegmentAdapter6.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m123963a(CutVideoListScene cutVideoListScene) {
        VEVideoCutterViewModel vEVideoCutterViewModel = cutVideoListScene.f100885w;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoListViewModel m123965b(CutVideoListScene cutVideoListScene) {
        CutVideoListViewModel cutVideoListViewModel = cutVideoListScene.f100844B;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ VideoEditViewModel m123967c(CutVideoListScene cutVideoListScene) {
        VideoEditViewModel videoEditViewModel = cutVideoListScene.f100884v;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutMultiVideoViewModel m123968d(CutVideoListScene cutVideoListScene) {
        CutMultiVideoViewModel cutMultiVideoViewModel = cutVideoListScene.f100883u;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoEditViewModel m123970e(CutVideoListScene cutVideoListScene) {
        CutVideoEditViewModel cutVideoEditViewModel = cutVideoListScene.f100843A;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ CutVideoSpeedViewModel m123971f(CutVideoListScene cutVideoListScene) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = cutVideoListScene.f100886x;
        if (cutVideoSpeedViewModel == null) {
            C7573i.m23583a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ ImageView m123972g(CutVideoListScene cutVideoListScene) {
        ImageView imageView = cutVideoListScene.f100878p;
        if (imageView == null) {
            C7573i.m23583a("ivSave");
        }
        return imageView;
    }

    /* renamed from: h */
    public static final /* synthetic */ ImageView m123973h(CutVideoListScene cutVideoListScene) {
        ImageView imageView = cutVideoListScene.f100879q;
        if (imageView == null) {
            C7573i.m23583a("ivCancel");
        }
        return imageView;
    }

    /* renamed from: i */
    public static final /* synthetic */ StickPointVideoSegView m123974i(CutVideoListScene cutVideoListScene) {
        StickPointVideoSegView stickPointVideoSegView = cutVideoListScene.f100877o;
        if (stickPointVideoSegView == null) {
            C7573i.m23583a("stickPointVideoTitleView");
        }
        return stickPointVideoSegView;
    }

    /* renamed from: j */
    public static final /* synthetic */ StickPointSingleVideoEditView m123975j(CutVideoListScene cutVideoListScene) {
        StickPointSingleVideoEditView stickPointSingleVideoEditView = cutVideoListScene.f100882t;
        if (stickPointSingleVideoEditView == null) {
            C7573i.m23583a("singleVideoEditView");
        }
        return stickPointSingleVideoEditView;
    }

    /* renamed from: k */
    public static final /* synthetic */ FrameLayout m123976k(CutVideoListScene cutVideoListScene) {
        FrameLayout frameLayout = cutVideoListScene.f100881s;
        if (frameLayout == null) {
            C7573i.m23583a("recyclerViewLayout");
        }
        return frameLayout;
    }

    /* renamed from: l */
    public static final /* synthetic */ CutVideoTitleBarViewModel m123977l(CutVideoListScene cutVideoListScene) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = cutVideoListScene.f100888z;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    /* renamed from: m */
    public static final /* synthetic */ CutVideoMultiModeViewModel m123978m(CutVideoListScene cutVideoListScene) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = cutVideoListScene.f100846D;
        if (cutVideoMultiModeViewModel == null) {
            C7573i.m23583a("videoMultiModeViewModel");
        }
        return cutVideoMultiModeViewModel;
    }

    /* renamed from: n */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m123979n(CutVideoListScene cutVideoListScene) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = cutVideoListScene.f100845C;
        if (cutVideoStickerPointMusicViewModel == null) {
            C7573i.m23583a("stickPointMusicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: o */
    public static final /* synthetic */ View m123980o(CutVideoListScene cutVideoListScene) {
        View view = cutVideoListScene.f100876n;
        if (view == null) {
            C7573i.m23583a("animTabDot");
        }
        return view;
    }

    /* renamed from: p */
    public static final /* synthetic */ FrameLayout m123981p(CutVideoListScene cutVideoListScene) {
        FrameLayout frameLayout = cutVideoListScene.f100880r;
        if (frameLayout == null) {
            C7573i.m23583a("flEditVideo");
        }
        return frameLayout;
    }

    /* renamed from: q */
    public static final /* synthetic */ CutVideoBottomBarViewModel m123982q(CutVideoListScene cutVideoListScene) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = cutVideoListScene.f100887y;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        CutVideoViewModel cutVideoViewModel = this.f100869ab;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o()) {
            m123958P();
        }
        m123956N();
        m123957O();
    }

    /* renamed from: d */
    private final void m123969d(int i) {
        if (System.currentTimeMillis() - this.f100850H >= 3000) {
            if (i == 0) {
                i = 0;
            } else if (mo96988L() && C39182e.m125102e()) {
                i++;
            }
            RecyclerView recyclerView = this.f100874l;
            if (recyclerView == null) {
                C7573i.m23583a("videoRecyclerView");
            }
            recyclerView.mo5561d(i);
        }
    }

    /* renamed from: b */
    public final void mo96996b(boolean z) {
        if (!this.f100863U) {
            CutVideoEditViewModel cutVideoEditViewModel = this.f100843A;
            if (cutVideoEditViewModel == null) {
                C7573i.m23583a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel.mo96981a(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f100888z;
            if (cutVideoTitleBarViewModel == null) {
                C7573i.m23583a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo97152d(!z);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f100888z;
            if (cutVideoTitleBarViewModel2 == null) {
                C7573i.m23583a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo97151c(!z);
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f100870ac;
            if (cutVideoPreviewViewModel == null) {
                C7573i.m23583a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo97091a(!z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123964a(com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f100876n
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "animTabDot"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 4
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel r0 = r5.f100888z
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "titleBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0016:
            r2 = 0
            r0.mo97149a(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel r0 = r5.f100888z
            if (r0 != 0) goto L_0x0023
            java.lang.String r3 = "titleBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0023:
            r0.mo97150b(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r0 = r5.f100887y
            if (r0 != 0) goto L_0x002f
            java.lang.String r3 = "bottomBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x002f:
            r3 = 1
            r0.mo96959c(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r0 = r5.f100887y
            if (r0 != 0) goto L_0x003c
            java.lang.String r4 = "bottomBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x003c:
            r0.mo96960d(r3)
            android.widget.TextView r0 = r5.f100866Y
            if (r0 != 0) goto L_0x0048
            java.lang.String r4 = "tvVideoSegmentDes"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0048:
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r0 = r5.f100887y
            if (r0 != 0) goto L_0x0054
            java.lang.String r1 = "bottomBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0054:
            boolean r1 = r5.f100864V
            if (r1 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r1 = r5.f100873k
            if (r1 != 0) goto L_0x0061
            java.lang.String r4 = "presenter"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0061:
            boolean r1 = r1.mo97217a(r6)
            if (r1 == 0) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            r0.mo96956a(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel r0 = r5.f100887y
            if (r0 != 0) goto L_0x0076
            java.lang.String r1 = "bottomBarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0076:
            boolean r1 = r5.f100853K
            r0.mo96958b(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r0 = r5.f100886x
            if (r0 != 0) goto L_0x0084
            java.lang.String r1 = "speedViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0084:
            r0.mo97105a(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r0 = r5.f100886x
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = "speedViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0090:
            boolean r1 = r5.f100853K
            if (r1 == 0) goto L_0x009b
            boolean r1 = r5.mo96988L()
            if (r1 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            r0.mo97106b(r3)
            boolean r0 = r5.f100853K
            if (r0 == 0) goto L_0x00bc
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel r0 = r5.f100886x
            if (r0 != 0) goto L_0x00ac
            java.lang.String r1 = "speedViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00ac:
            float r1 = r6.mo96911j()
            com.ss.android.ugc.aweme.tools.RecordingSpeed r1 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k.m123824d(r1)
            java.lang.String r3 = "MVConfig.fromValue(video.speed)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.mo97104a(r1)
        L_0x00bc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file://"
            r0.<init>(r1)
            java.lang.String r6 = r6.mo96896a(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            com.facebook.imagepipeline.request.ImageRequestBuilder r6 = com.facebook.imagepipeline.request.ImageRequestBuilder.m40865a(r6)
            com.facebook.imagepipeline.common.d r0 = new com.facebook.imagepipeline.common.d
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r1)
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r1)
            r0.<init>(r3, r1)
            com.facebook.imagepipeline.request.ImageRequestBuilder r6 = r6.mo33468a(r0)
            com.facebook.imagepipeline.request.ImageRequest r6 = r6.mo33476b()
            com.facebook.drawee.backends.pipeline.e r0 = com.facebook.drawee.backends.pipeline.C13380c.m39166a()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r5.f100867Z
            if (r1 != 0) goto L_0x00fa
            java.lang.String r2 = "ivEditVideo"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00fa:
            com.facebook.drawee.c.a r1 = r1.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.mo32729b(r1)
            com.facebook.drawee.backends.pipeline.e r0 = (com.facebook.drawee.backends.pipeline.C13382e) r0
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r6 = r0.mo32748b(r6)
            com.facebook.drawee.backends.pipeline.e r6 = (com.facebook.drawee.backends.pipeline.C13382e) r6
            com.facebook.drawee.controller.a r6 = r6.mo32730f()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r5.f100867Z
            if (r0 != 0) goto L_0x0117
            java.lang.String r1 = "ivEditVideo"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0117:
            com.facebook.drawee.c.a r6 = (com.facebook.drawee.p698c.C13386a) r6
            r0.setController(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene.m123964a(com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment):void");
    }

    /* renamed from: b */
    private final void m123966b(boolean z, boolean z2) {
        int i;
        ImageView imageView = this.f100878p;
        if (imageView == null) {
            C7573i.m23583a("ivSave");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.f100879q;
        if (imageView2 == null) {
            C7573i.m23583a("ivCancel");
        }
        imageView2.setVisibility(8);
        FrameLayout frameLayout = this.f100868aa;
        if (frameLayout == null) {
            C7573i.m23583a("singleEditLayout");
        }
        frameLayout.setVisibility(8);
        if (mo96988L()) {
            CutVideoListViewModel cutVideoListViewModel = this.f100844B;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            cutVideoListViewModel.mo97052i(true);
        } else {
            RecyclerView recyclerView = this.f100874l;
            if (recyclerView == null) {
                C7573i.m23583a("videoRecyclerView");
            }
            recyclerView.setVisibility(0);
        }
        FrameLayout frameLayout2 = this.f100880r;
        if (frameLayout2 == null) {
            C7573i.m23583a("flEditVideo");
        }
        frameLayout2.setVisibility(4);
        if (this.f100857O != null && this.f100858P != null) {
            if (!mo96988L() || !C39182e.m125102e()) {
                CutVideoListViewModel cutVideoListViewModel2 = this.f100844B;
                if (cutVideoListViewModel2 == null) {
                    C7573i.m23583a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel2.f100939d;
            } else {
                CutVideoListViewModel cutVideoListViewModel3 = this.f100844B;
                if (cutVideoListViewModel3 == null) {
                    C7573i.m23583a("cutVideoListViewModel");
                }
                i = cutVideoListViewModel3.f100939d + 1;
            }
            RecyclerView recyclerView2 = this.f100874l;
            if (recyclerView2 == null) {
                C7573i.m23583a("videoRecyclerView");
            }
            View rootView = recyclerView2.getRootView();
            C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().addOnPreDrawListener(new C38820af(this, i, z2));
        }
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ai3, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…o_list, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
