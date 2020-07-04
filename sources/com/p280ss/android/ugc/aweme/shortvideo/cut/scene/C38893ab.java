package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
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
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39165c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab */
public final class C38893ab extends C12604b implements C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f101012j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38893ab.class), "multiModeScene", "getMultiModeScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoMultiModeScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38893ab.class), "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoEditScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38893ab.class), "videoListScene", "getVideoListScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoListScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38893ab.class), "stickPointMusicScene", "getStickPointMusicScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoStickPointMusicScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38893ab.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoBottomBarScene;"))};

    /* renamed from: y */
    public static final C38894a f101013y = new C38894a(null);

    /* renamed from: A */
    private CutVideoListViewModel f101014A;

    /* renamed from: B */
    private ObjectAnimator f101015B;

    /* renamed from: C */
    private final C7541d f101016C = C7546e.m23569a(new C38900g(this));

    /* renamed from: D */
    private final C7541d f101017D = C7546e.m23569a(new C38907n(this));

    /* renamed from: E */
    private final C7541d f101018E = C7546e.m23569a(new C38908o(this));

    /* renamed from: F */
    private final C7541d f101019F = C7546e.m23569a(new C38906m(this));

    /* renamed from: G */
    private final C7541d f101020G = C7546e.m23569a(new C38897d(this));

    /* renamed from: k */
    public C38982av f101021k;

    /* renamed from: l */
    public C38916af f101022l;

    /* renamed from: m */
    public C39052bl f101023m;

    /* renamed from: n */
    public CutVideoViewModel f101024n;

    /* renamed from: o */
    public VideoEditViewModel f101025o;

    /* renamed from: p */
    public VEVideoCutterViewModel f101026p;

    /* renamed from: q */
    public CutVideoPreviewViewModel f101027q;

    /* renamed from: r */
    public CutVideoStickerPointMusicViewModel f101028r;

    /* renamed from: s */
    public CutVideoMultiBottomViewModel f101029s;

    /* renamed from: t */
    public CutVideoEditViewModel f101030t;

    /* renamed from: u */
    public View f101031u;

    /* renamed from: v */
    public View f101032v;

    /* renamed from: w */
    public View f101033w;

    /* renamed from: x */
    public View f101034x;

    /* renamed from: z */
    private CutVideoMultiModeViewModel f101035z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$a */
    public static final class C38894a {
        private C38894a() {
        }

        public /* synthetic */ C38894a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$b */
    public static final class C38895b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101036a;

        /* renamed from: b */
        final /* synthetic */ boolean f101037b;

        public final void onAnimationRepeat(Animator animator) {
            C7573i.m23587b(animator, "animator");
        }

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animator");
            onAnimationEnd(animator);
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animator");
            C38893ab.m124179e(this.f101036a).setVisibility(0);
            C38893ab.m124180f(this.f101036a).setVisibility(0);
            C38893ab.m124181g(this.f101036a).mo97134e(true);
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animator");
            if (this.f101037b) {
                C38893ab.m124181g(this.f101036a).mo97134e(false);
            } else {
                C38893ab.m124179e(this.f101036a).setVisibility(8);
                C38893ab.m124180f(this.f101036a).setVisibility(8);
                C38893ab.m124182h(this.f101036a).setTranslationY(0.0f);
            }
            C38893ab.m124183i(this.f101036a).mo97094i().setValue(Boolean.valueOf(this.f101037b));
            if (!this.f101037b) {
                C38893ab.m124181g(this.f101036a).mo97133d(true);
                C38982av avVar = this.f101036a.f101021k;
                if (avVar != null) {
                    avVar.mo97279j();
                }
            }
        }

        C38895b(C38893ab abVar, boolean z) {
            this.f101036a = abVar;
            this.f101037b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$c */
    static final class C38896c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101038a;

        /* renamed from: b */
        final /* synthetic */ boolean f101039b;

        /* renamed from: c */
        final /* synthetic */ float f101040c;

        C38896c(C38893ab abVar, boolean z, float f) {
            this.f101038a = abVar;
            this.f101039b = z;
            this.f101040c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f101039b) {
                    float f = 1.0f - (floatValue / this.f101040c);
                    C38893ab.m124179e(this.f101038a).setAlpha(f);
                    C38893ab.m124180f(this.f101038a).setAlpha(f);
                } else {
                    float f2 = 1.0f - (floatValue / this.f101040c);
                    C38893ab.m124179e(this.f101038a).setAlpha(f2);
                    C38893ab.m124180f(this.f101038a).setAlpha(f2);
                }
                C38893ab.m124184j(this.f101038a).mo29069f().setValue(new Pair(Boolean.valueOf(this.f101039b), Float.valueOf(floatValue)));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$d */
    static final class C38897d extends Lambda implements C7561a<C39012b> {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101041a;

        C38897d(C38893ab abVar) {
            this.f101041a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39012b invoke() {
            C39012b bVar = new C39012b();
            bVar.mo97333a(this.f101041a.mo97168J());
            bVar.f101282i = this.f101041a.f101021k;
            bVar.mo97334a(this.f101041a.mo96987K());
            this.f101041a.mo30925a((int) R.id.dn1, (C12629j) bVar, "CutVideoBottomBarScene");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$e */
    public static final class C38898e implements C39171i {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101042a;

        /* renamed from: c */
        public final List<VideoSegment> mo96784c() {
            List<VideoSegment> n = C38893ab.m124167a(this.f101042a).mo97721n();
            C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
            return n;
        }

        /* renamed from: a */
        public final void mo96780a() {
            C38893ab.m124174b(this.f101042a).mo97802a(new C39293a(1, false, 2, null));
        }

        /* renamed from: b */
        public final void mo96783b() {
            this.f101042a.mo97168J().mo97214a(C38893ab.m124167a(this.f101042a).mo97721n(), false);
        }

        C38898e(C38893ab abVar) {
            this.f101042a = abVar;
        }

        /* renamed from: a */
        public final void mo96781a(List<? extends VideoSegment> list) {
            C38916af J = this.f101042a.mo97168J();
            int size = C38893ab.m124167a(this.f101042a).mo97721n().size();
            C0902i playBoundary = this.f101042a.mo96987K().mo97241P().getPlayBoundary();
            C7573i.m23582a((Object) playBoundary, "previewEditCallback.getV…eoEditView().playBoundary");
            J.mo97213a(list, size, playBoundary, this.f101042a.mo96987K().mo97241P().getMaxCutDuration());
        }

        /* renamed from: a */
        public final void mo96782a(boolean z, boolean z2) {
            this.f101042a.mo97168J().mo97215a(z);
            if (z2) {
                this.f101042a.mo97168J().mo97214a(C38893ab.m124167a(this.f101042a).mo97721n(), !z);
            }
            if (z) {
                this.f101042a.mo97170M().f100864V = false;
                VideoSegmentAdapter videoSegmentAdapter = this.f101042a.mo97170M().f100871i;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                videoSegmentAdapter.f100640b = 0;
                this.f101042a.mo97170M().mo96986J();
                this.f101042a.mo30945d((C12629j) this.f101042a.mo97171N());
                this.f101042a.mo30940c((C12629j) this.f101042a.mo97172O());
                this.f101042a.mo30940c((C12629j) this.f101042a.mo97169L());
                this.f101042a.mo30940c((C12629j) this.f101042a.mo97170M());
                return;
            }
            if (z2) {
                C38916af J = this.f101042a.mo97168J();
                C0902i playBoundary = this.f101042a.mo97169L().mo30921H().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "videoEditScene.videoEditView.playBoundary");
                J.mo97210a(playBoundary, this.f101042a.mo97169L().mo30921H().getMaxCutDuration());
                VEVideoCutterViewModel b = C38893ab.m124174b(this.f101042a);
                F f = this.f101042a.mo97169L().mo30921H().getPlayBoundary().f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "videoEditScene.videoEditView.playBoundary.first!!");
                b.mo97802a(new C39293a(3, ((Number) f).longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            } else {
                C38893ab.m124174b(this.f101042a).mo97802a(new C39293a(1, false));
            }
            this.f101042a.mo97170M().f100864V = C38893ab.m124175c(this.f101042a).mo97158j();
            this.f101042a.mo97170M().mo96987K();
            this.f101042a.mo30945d((C12629j) this.f101042a.mo97172O());
            this.f101042a.mo30945d((C12629j) this.f101042a.mo97169L());
            this.f101042a.mo30945d((C12629j) this.f101042a.mo97170M());
            this.f101042a.mo30940c((C12629j) this.f101042a.mo97171N());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$f */
    public static final class C38899f implements C38971ar {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101043a;

        /* renamed from: a */
        public final void mo97194a() {
            C38893ab.m124177d(this.f101043a).mo96983c(false);
            this.f101043a.mo97187a(false);
        }

        /* renamed from: b */
        public final void mo97195b() {
            C38982av avVar = this.f101043a.f101021k;
            if (avVar == null) {
                C7573i.m23580a();
            }
            if (avVar.mo97280k()) {
                C38893ab.m124177d(this.f101043a).mo96983c(true);
            }
            this.f101043a.mo97187a(true);
        }

        C38899f(C38893ab abVar) {
            this.f101043a = abVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$g */
    static final class C38900g extends Lambda implements C7561a<C38909ac> {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101044a;

        C38900g(C38893ab abVar) {
            this.f101044a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38909ac invoke() {
            C38909ac acVar = new C38909ac();
            C38982av avVar = this.f101044a.f101021k;
            if (avVar == null) {
                C7573i.m23580a();
            }
            acVar.mo97201a(avVar);
            this.f101044a.mo30925a((int) R.id.bzn, (C12629j) acVar, "CutVideoMultiModeScene");
            return acVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$h */
    public static final class C38901h implements C39165c {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101045a;

        C38901h(C38893ab abVar) {
            this.f101045a = abVar;
        }

        /* renamed from: a */
        public final void mo97196a(int i) {
            if (i == 1) {
                this.f101045a.mo97179V();
            } else {
                this.f101045a.mo97180W();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$i */
    public static final class C38902i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101046a;

        C38902i(C38893ab abVar) {
            this.f101046a = abVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39193g.f101577a.mo97487c(C38893ab.m124167a(this.f101046a).mo97721n(), this.f101046a.mo97177T());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$j */
    static final class C38903j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101047a;

        C38903j(C38893ab abVar) {
            this.f101047a = abVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101047a.mo97175R();
            C39193g.f101577a.mo97484b(C38893ab.m124167a(this.f101047a).mo97721n(), this.f101047a.mo97177T());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$k */
    static final class C38904k implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101048a;

        /* renamed from: b */
        final /* synthetic */ int f101049b;

        /* renamed from: c */
        final /* synthetic */ float f101050c;

        /* renamed from: d */
        final /* synthetic */ LayoutParams f101051d;

        /* renamed from: e */
        final /* synthetic */ boolean f101052e;

        C38904k(C38893ab abVar, int i, float f, LayoutParams layoutParams, boolean z) {
            this.f101048a = abVar;
            this.f101049b = i;
            this.f101050c = f;
            this.f101051d = layoutParams;
            this.f101052e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator1");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = (floatValue - ((float) this.f101049b)) / (this.f101050c - ((float) this.f101049b));
                this.f101051d.height = (int) floatValue;
                C38893ab.m124185k(this.f101048a).setLayoutParams(this.f101051d);
                if (this.f101052e) {
                    C38893ab.m124180f(this.f101048a).setAlpha(f);
                    C38893ab.m124177d(this.f101048a).mo96980a(f);
                    return;
                }
                float f2 = 1.0f - f;
                C38893ab.m124180f(this.f101048a).setAlpha(f2);
                C38893ab.m124177d(this.f101048a).mo96980a(f2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$l */
    public static final class C38905l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101053a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f101054b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            C38893ab.m124180f(this.f101053a).setVisibility(8);
            C38893ab.m124177d(this.f101053a).mo96983c(false);
            this.f101054b.height = -2;
            C38893ab.m124185k(this.f101053a).setLayoutParams(this.f101054b);
        }

        C38905l(C38893ab abVar, LayoutParams layoutParams) {
            this.f101053a = abVar;
            this.f101054b = layoutParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$m */
    static final class C38906m extends Lambda implements C7561a<C38998ay> {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101055a;

        C38906m(C38893ab abVar) {
            this.f101055a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38998ay invoke() {
            C38998ay ayVar = new C38998ay();
            C38982av avVar = this.f101055a.f101021k;
            if (avVar == null) {
                C7573i.m23580a();
            }
            ayVar.mo97322a(avVar);
            this.f101055a.mo30925a((int) R.id.acb, (C12629j) ayVar, "CutVideoStickerPointScene");
            return ayVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$n */
    static final class C38907n extends Lambda implements C7561a<C39064k> {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101056a;

        C38907n(C38893ab abVar) {
            this.f101056a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39064k invoke() {
            C39064k kVar = new C39064k();
            kVar.mo97356a(this.f101056a.mo97168J());
            kVar.f101360i = this.f101056a.f101021k;
            this.f101056a.mo30925a((int) R.id.dn1, (C12629j) kVar, "CutVideoEditScene");
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$o */
    static final class C38908o extends Lambda implements C7561a<CutVideoListScene> {

        /* renamed from: a */
        final /* synthetic */ C38893ab f101057a;

        C38908o(C38893ab abVar) {
            this.f101057a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListScene invoke() {
            CutVideoListScene cutVideoListScene = new CutVideoListScene();
            cutVideoListScene.mo96991a(this.f101057a.mo97168J());
            cutVideoListScene.mo96992a(this.f101057a.mo96987K());
            cutVideoListScene.f100872j = this.f101057a.f101021k;
            this.f101057a.mo30925a((int) R.id.acb, (C12629j) cutVideoListScene, "CutVideoListScene");
            return cutVideoListScene;
        }
    }

    /* renamed from: Z */
    private final C38909ac m124166Z() {
        return (C38909ac) this.f101016C.getValue();
    }

    /* renamed from: L */
    public final C39064k mo97169L() {
        return (C39064k) this.f101017D.getValue();
    }

    /* renamed from: M */
    public final CutVideoListScene mo97170M() {
        return (CutVideoListScene) this.f101018E.getValue();
    }

    /* renamed from: N */
    public final C38998ay mo97171N() {
        return (C38998ay) this.f101019F.getValue();
    }

    /* renamed from: O */
    public final C39012b mo97172O() {
        return (C39012b) this.f101020G.getValue();
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

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97185a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f101022l = afVar;
    }

    /* renamed from: a */
    public final void mo97186a(C39052bl blVar) {
        C7573i.m23587b(blVar, "<set-?>");
        this.f101023m = blVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        CutVideoViewModel cutVideoViewModel = this.f101024n;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o()) {
            this.f101021k = new C38982av();
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f101035z;
            if (cutVideoMultiModeViewModel == null) {
                C7573i.m23583a("videoMultiModeViewModel");
            }
            C38982av avVar = this.f101021k;
            if (avVar == null) {
                C7573i.m23580a();
            }
            cutVideoMultiModeViewModel.mo97071a((C39053bm) avVar);
            CutVideoListViewModel cutVideoListViewModel = this.f101014A;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("videoListViewModel");
            }
            C38982av avVar2 = this.f101021k;
            if (avVar2 == null) {
                C7573i.m23580a();
            }
            cutVideoListViewModel.mo97042a((C39053bm) avVar2);
        }
        CutVideoViewModel cutVideoViewModel2 = this.f101024n;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo97162o()) {
            mo30940c((C12629j) m124166Z());
            mo30940c((C12629j) mo97171N());
            mo30940c((C12629j) mo97172O());
            mo30940c((C12629j) mo97169L());
            mo30940c((C12629j) mo97170M());
            return;
        }
        mo30945d((C12629j) mo97172O());
        mo30945d((C12629j) mo97169L());
        mo30945d((C12629j) mo97170M());
    }

    /* renamed from: a */
    public final void mo97184a(C15389d dVar) {
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97261a(dVar);
        }
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f101027q;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel.mo97092g();
    }

    /* renamed from: a */
    public final void mo97183a(int i, int i2, Intent intent) {
        CutVideoViewModel cutVideoViewModel = this.f101024n;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o()) {
            C38982av avVar = this.f101021k;
            if (avVar != null) {
                avVar.mo97257a(i, i2, intent);
            }
        } else if (i == 1001 && i2 == -1 && intent != null) {
            m124168a((List<? extends MediaModel>) intent.getParcelableArrayListExtra("key_choose_media_data"));
        }
    }

    /* renamed from: a */
    public final void mo97187a(boolean z) {
        C38982av avVar = this.f101021k;
        if (avVar == null) {
            C7573i.m23580a();
        }
        boolean k = avVar.mo97280k();
        m124169a(k, z);
        if (k) {
            if (z) {
                CutVideoListViewModel cutVideoListViewModel = this.f101014A;
                if (cutVideoListViewModel == null) {
                    C7573i.m23583a("videoListViewModel");
                }
                cutVideoListViewModel.mo97047e(true);
                CutVideoListViewModel cutVideoListViewModel2 = this.f101014A;
                if (cutVideoListViewModel2 == null) {
                    C7573i.m23583a("videoListViewModel");
                }
                cutVideoListViewModel2.mo97048f(k);
                return;
            }
            CutVideoListViewModel cutVideoListViewModel3 = this.f101014A;
            if (cutVideoListViewModel3 == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel3.mo97046d(true);
            CutVideoListViewModel cutVideoListViewModel4 = this.f101014A;
            if (cutVideoListViewModel4 == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel4.mo97050g(k);
        } else if (z) {
            CutVideoListViewModel cutVideoListViewModel5 = this.f101014A;
            if (cutVideoListViewModel5 == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel5.mo97051h(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f101035z;
            if (cutVideoMultiModeViewModel == null) {
                C7573i.m23583a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo97074b(true);
        } else {
            CutVideoListViewModel cutVideoListViewModel6 = this.f101014A;
            if (cutVideoListViewModel6 == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel6.mo97051h(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f101035z;
            if (cutVideoMultiModeViewModel2 == null) {
                C7573i.m23583a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel2.mo97072a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ad */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: V */
    public final void mo97179V() {
        m124176c(false);
    }

    /* renamed from: W */
    public final void mo97180W() {
        m124176c(true);
    }

    /* renamed from: Y */
    public final void mo97182Y() {
        mo97169L().mo30922I();
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

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97276g();
        }
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97275f();
        }
    }

    /* renamed from: J */
    public final C38916af mo97168J() {
        C38916af afVar = this.f101022l;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        return afVar;
    }

    /* renamed from: K */
    public final C39052bl mo96987K() {
        C39052bl blVar = this.f101023m;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        return blVar;
    }

    /* renamed from: P */
    public final void mo97173P() {
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97274e();
        }
    }

    /* renamed from: R */
    public final void mo97175R() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            activity.finish();
        }
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97277h();
        }
    }

    /* renamed from: S */
    public final void mo97176S() {
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            avVar.mo97283n();
        }
        C38982av avVar2 = this.f101021k;
        if (avVar2 != null) {
            avVar2.mo97278i();
        }
    }

    /* renamed from: X */
    public final C39252c mo97181X() {
        return mo97169L().mo30921H();
    }

    /* renamed from: Q */
    public final void mo97174Q() {
        VideoSegmentAdapter videoSegmentAdapter = mo97170M().f100871i;
        if (videoSegmentAdapter == null || videoSegmentAdapter.mo96795a() != 0) {
            m124172ac();
        } else {
            mo97175R();
        }
    }

    /* renamed from: T */
    public final boolean mo97177T() {
        if (this.f101021k == null) {
            return false;
        }
        C38982av avVar = this.f101021k;
        if (avVar == null) {
            C7573i.m23580a();
        }
        return avVar.mo97280k();
    }

    /* renamed from: U */
    public final AVMusic mo97178U() {
        if (!mo97177T()) {
            return null;
        }
        C38982av avVar = this.f101021k;
        if (avVar != null) {
            return avVar.mo97282m();
        }
        return null;
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: ac */
    private final void m124172ac() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            new C10741a(activity).mo25657b((int) R.string.dau).mo25658b((int) R.string.cay, (OnClickListener) new C38902i(this)).mo25650a((int) R.string.bbe, (OnClickListener) new C38903j(this)).mo25656a().mo25637a().show();
            C39193g gVar = C39193g.f101577a;
            VideoEditViewModel videoEditViewModel = this.f101025o;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            gVar.mo97480a(videoEditViewModel.mo97721n(), mo97177T());
        }
    }

    /* renamed from: aa */
    private final void m124170aa() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f101025o = (VideoEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VEVideoCutterViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
                this.f101026p = (VEVideoCutterViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoPreviewViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
                    this.f101027q = (CutVideoPreviewViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoStickerPointMusicViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…sicViewModel::class.java)");
                        this.f101028r = (CutVideoStickerPointMusicViewModel) a4;
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

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0137  */
    /* renamed from: ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m124171ab() {
        /*
            r4 = this;
            r0 = 2131296801(0x7f090221, float:1.8211529E38)
            android.view.View r0 = r4.mo31004h_(r0)
            java.lang.String r1 = "requireViewById(R.id.bottom_menu)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r4.f101031u = r0
            r0 = 2131300171(0x7f090f4b, float:1.8218364E38)
            android.view.View r0 = r4.mo31004h_(r0)
            java.lang.String r1 = "requireViewById(R.id.normal_mode_view)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r4.f101032v = r0
            r0 = 2131302241(0x7f091761, float:1.8222563E38)
            android.view.View r0 = r4.mo31004h_(r0)
            java.lang.String r1 = "requireViewById(R.id.top_videoedit_view)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r4.f101033w = r0
            r0 = 2131297737(0x7f0905c9, float:1.8213427E38)
            android.view.View r0 = r4.mo31004h_(r0)
            java.lang.String r1 = "requireViewById(R.id.edit_panel_view)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r4.f101034x = r0
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r0 = r4.f101021k
            if (r0 == 0) goto L_0x0050
            android.app.Activity r1 = r4.mo31015v()
            if (r1 == 0) goto L_0x0048
            android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
            r0.mo97260a(r1)
            goto L_0x0050
        L_0x0048:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r0 = r4.f101021k
            if (r0 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.shortvideo.cut.scene.k r1 = r4.mo97169L()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView r1 = r1.mo30921H()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c) r1
            r0.mo97265a(r1)
        L_0x0061:
            android.app.Activity r0 = r4.f33526d_
            r1 = 0
            if (r0 == 0) goto L_0x0073
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = "extra_stickpoint_music_list"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto L_0x0074
        L_0x0073:
            r0 = r1
        L_0x0074:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r2 = r4.f101021k
            if (r2 == 0) goto L_0x0086
            if (r0 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r1 = kotlin.collections.C7525m.m23509d(r0)
        L_0x0083:
            r2.mo97266a(r1)
        L_0x0086:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r0 = r4.f101021k
            if (r0 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$e r1 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$e
            r1.<init>(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i) r1
            r0.mo97264a(r1)
        L_0x0094:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.bl r0 = r4.f101023m
            if (r0 != 0) goto L_0x009d
            java.lang.String r1 = "previewEditCallback"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x009d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r1 = r4.f101021k
            if (r1 != 0) goto L_0x00a4
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a4:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.bm r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C39053bm) r1
            r0.mo97244a(r1)
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125105i()
            r1 = 1
            if (r0 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel r0 = r4.f101035z
            if (r0 != 0) goto L_0x00b9
            java.lang.String r2 = "videoMultiModeViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00b9:
            android.app.Activity r2 = r4.f33526d_
            if (r2 == 0) goto L_0x012f
            android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
            r0.mo97073b(r2, r1)
            android.view.View r0 = r4.f101032v
            if (r0 != 0) goto L_0x00cb
            java.lang.String r2 = "normalModeView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00cb:
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r4.f101033w
            if (r0 != 0) goto L_0x00d9
            java.lang.String r3 = "topVideoEditView"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00d9:
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r0 = r4.f101028r
            if (r0 != 0) goto L_0x00e5
            java.lang.String r2 = "musicViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00e5:
            r0.mo97134e(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r0 = r4.f101028r
            if (r0 != 0) goto L_0x00f1
            java.lang.String r2 = "musicViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00f1:
            r0.mo97133d(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.av r0 = r4.f101021k
            if (r0 == 0) goto L_0x00fb
            r0.mo97279j()
        L_0x00fb:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ac r0 = r4.m124166Z()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r0 = r0.mo30920G()
            android.app.Activity r1 = r4.f33526d_
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127447b(r1)
            android.app.Activity r2 = r4.f33526d_
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127443a(r2)
            r0.measure(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r0 = r4.f101027q
            if (r0 != 0) goto L_0x011f
            java.lang.String r1 = "previewViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x011f:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ac r1 = r4.m124166Z()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r1 = r1.mo30920G()
            int r1 = r1.getMeasuredHeight()
            r0.mo97089a(r1)
            goto L_0x017f
        L_0x012f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x0137:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel r0 = r4.f101035z
            if (r0 != 0) goto L_0x0140
            java.lang.String r2 = "videoMultiModeViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0140:
            android.app.Activity r2 = r4.f33526d_
            if (r2 == 0) goto L_0x018d
            android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
            r0.mo97070a(r2, r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ac r0 = r4.m124166Z()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r0 = r0.mo30920G()
            android.app.Activity r1 = r4.f33526d_
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127447b(r1)
            android.app.Activity r2 = r4.f33526d_
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127443a(r2)
            r0.measure(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r0 = r4.f101027q
            if (r0 != 0) goto L_0x016d
            java.lang.String r1 = "previewViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x016d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ac r1 = r4.m124166Z()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r1 = r1.mo30920G()
            int r1 = r1.getMeasuredHeight()
            r0.mo97089a(r1)
            r4.mo97180W()
        L_0x017f:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListScene r0 = r4.mo97170M()
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$f r1 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ab$f
            r1.<init>(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ar r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38971ar) r1
            r0.f100865W = r1
            return
        L_0x018d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38893ab.m124171ab():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m124167a(C38893ab abVar) {
        VideoEditViewModel videoEditViewModel = abVar.f101025o;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoCutterViewModel m124174b(C38893ab abVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = abVar.f101026p;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoViewModel m124175c(C38893ab abVar) {
        CutVideoViewModel cutVideoViewModel = abVar.f101024n;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoEditViewModel m124177d(C38893ab abVar) {
        CutVideoEditViewModel cutVideoEditViewModel = abVar.f101030t;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m124179e(C38893ab abVar) {
        View view = abVar.f101032v;
        if (view == null) {
            C7573i.m23583a("normalModeView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m124180f(C38893ab abVar) {
        View view = abVar.f101033w;
        if (view == null) {
            C7573i.m23583a("topVideoEditView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m124181g(C38893ab abVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = abVar.f101028r;
        if (cutVideoStickerPointMusicViewModel == null) {
            C7573i.m23583a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ View m124182h(C38893ab abVar) {
        View view = abVar.f101031u;
        if (view == null) {
            C7573i.m23583a("layoutBottom");
        }
        return view;
    }

    /* renamed from: i */
    public static final /* synthetic */ CutVideoPreviewViewModel m124183i(C38893ab abVar) {
        CutVideoPreviewViewModel cutVideoPreviewViewModel = abVar.f101027q;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        return cutVideoPreviewViewModel;
    }

    /* renamed from: j */
    public static final /* synthetic */ CutVideoMultiBottomViewModel m124184j(C38893ab abVar) {
        CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = abVar.f101029s;
        if (cutVideoMultiBottomViewModel == null) {
            C7573i.m23583a("multiBottomViewModel");
        }
        return cutVideoMultiBottomViewModel;
    }

    /* renamed from: k */
    public static final /* synthetic */ View m124185k(C38893ab abVar) {
        View view = abVar.f101034x;
        if (view == null) {
            C7573i.m23583a("editPanelView");
        }
        return view;
    }

    /* renamed from: b */
    public final void mo97188b(boolean z) {
        mo97170M().f100863U = z;
    }

    /* renamed from: a */
    private final void m124168a(List<? extends MediaModel> list) {
        Collection collection = list;
        if (!C23477d.m77081a(collection)) {
            ArrayList arrayList = new ArrayList();
            VideoEditViewModel videoEditViewModel = this.f101025o;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            int size = videoEditViewModel.mo97721n().size();
            if (list == null) {
                C7573i.m23580a();
            }
            int size2 = collection.size();
            for (int i = 0; i < size2; i++) {
                VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i));
                videoSegment.f100759a = size;
                arrayList.add(videoSegment);
                size++;
            }
            VideoSegmentAdapter videoSegmentAdapter = mo97170M().f100871i;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96809b((List<VideoSegment>) arrayList);
            }
            List list2 = arrayList;
            mo97169L().mo30921H().mo97599a(list2);
            C38916af afVar = this.f101022l;
            if (afVar == null) {
                C7573i.m23583a("presenter");
            }
            VideoEditViewModel videoEditViewModel2 = this.f101025o;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            int size3 = videoEditViewModel2.mo97721n().size();
            C39052bl blVar = this.f101023m;
            if (blVar == null) {
                C7573i.m23583a("previewEditCallback");
            }
            C0902i playBoundary = blVar.mo97241P().getPlayBoundary();
            C7573i.m23582a((Object) playBoundary, "previewEditCallback.getV…eoEditView().playBoundary");
            C39052bl blVar2 = this.f101023m;
            if (blVar2 == null) {
                C7573i.m23583a("previewEditCallback");
            }
            afVar.mo97213a(list2, size3, playBoundary, blVar2.mo97241P().getMaxCutDuration());
        }
    }

    /* renamed from: c */
    private final void m124176c(boolean z) {
        ObjectAnimator objectAnimator = this.f101015B;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f101015B;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        float dimension = mo31017x().getDimension(R.dimen.kg) - mo31017x().getDimension(R.dimen.mm);
        if (z) {
            View view = this.f101031u;
            if (view == null) {
                C7573i.m23583a("layoutBottom");
            }
            this.f101015B = ObjectAnimator.ofFloat(view, "translationY", new float[]{dimension, 0.0f});
        } else {
            View view2 = this.f101031u;
            if (view2 == null) {
                C7573i.m23583a("layoutBottom");
            }
            this.f101015B = ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, dimension});
        }
        ObjectAnimator objectAnimator3 = this.f101015B;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(200);
        }
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f101027q;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel.mo97093h().setValue(Boolean.valueOf(z));
        ObjectAnimator objectAnimator4 = this.f101015B;
        if (objectAnimator4 != null) {
            objectAnimator4.addListener(new C38895b(this, z));
        }
        ObjectAnimator objectAnimator5 = this.f101015B;
        if (objectAnimator5 != null) {
            objectAnimator5.addUpdateListener(new C38896c(this, z, dimension));
        }
        ObjectAnimator objectAnimator6 = this.f101015B;
        if (objectAnimator6 != null) {
            objectAnimator6.start();
        }
    }

    /* renamed from: d */
    private final void m124178d(boolean z) {
        float f;
        View view = this.f101034x;
        if (view == null) {
            C7573i.m23583a("editPanelView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            View view2 = this.f101034x;
            if (view2 == null) {
                C7573i.m23583a("editPanelView");
            }
            int height = view2.getHeight();
            if (z) {
                View view3 = this.f101033w;
                if (view3 == null) {
                    C7573i.m23583a("topVideoEditView");
                }
                view3.setAlpha(0.0f);
                CutVideoEditViewModel cutVideoEditViewModel = this.f101030t;
                if (cutVideoEditViewModel == null) {
                    C7573i.m23583a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.mo96980a(0.0f);
                View view4 = this.f101033w;
                if (view4 == null) {
                    C7573i.m23583a("topVideoEditView");
                }
                view4.setVisibility(0);
                CutVideoEditViewModel cutVideoEditViewModel2 = this.f101030t;
                if (cutVideoEditViewModel2 == null) {
                    C7573i.m23583a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel2.mo96983c(true);
                f = mo31017x().getDimension(R.dimen.kg);
            } else {
                f = mo31017x().getDimension(R.dimen.mm);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) height, f});
            C7573i.m23582a((Object) ofFloat, "ValueAnimator.ofFloat(in….toFloat(), targetHeight)");
            ofFloat.setDuration(200);
            C38904k kVar = new C38904k(this, height, f, layoutParams2, z);
            ofFloat.addUpdateListener(kVar);
            if (!z) {
                ofFloat.addListener(new C38905l(this, layoutParams2));
            }
            ofFloat.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124170aa();
        CutVideoViewModel cutVideoViewModel = this.f101024n;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o()) {
            mo30945d((C12629j) m124166Z());
            m124166Z().f101060j = new C38901h(this);
            if (this.f101024n == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (CutVideoViewModel.m124146n()) {
                mo30945d((C12629j) mo97171N());
            } else if (C39182e.m125105i()) {
                mo30945d((C12629j) mo97171N());
            } else {
                mo30945d((C12629j) mo97172O());
                mo30945d((C12629j) mo97169L());
                mo30945d((C12629j) mo97170M());
            }
        } else {
            mo30945d((C12629j) mo97172O());
            mo30945d((C12629j) mo97169L());
            mo30945d((C12629j) mo97170M());
        }
        CutVideoViewModel cutVideoViewModel2 = this.f101024n;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo97162o()) {
            m124171ab();
            return;
        }
        C39193g gVar = C39193g.f101577a;
        VideoEditViewModel videoEditViewModel = this.f101025o;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        gVar.mo97483b(videoEditViewModel.mo97721n());
    }

    /* renamed from: a */
    private final void m124169a(boolean z, boolean z2) {
        if (z) {
            m124178d(z2);
            return;
        }
        CutVideoEditViewModel cutVideoEditViewModel = this.f101030t;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        int i = 0;
        cutVideoEditViewModel.mo96983c(false);
        View view = this.f101032v;
        if (view == null) {
            C7573i.m23583a("normalModeView");
        }
        if (z2) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java]");
            this.f101024n = (CutVideoViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoMultiModeViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…odeViewModel::class.java)");
                this.f101035z = (CutVideoMultiModeViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoListViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…istViewModel::class.java)");
                    this.f101014A = (CutVideoListViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoMultiBottomViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…tomViewModel::class.java)");
                        this.f101029s = (CutVideoMultiBottomViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoEditViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…ditViewModel::class.java)");
                            this.f101030t = (CutVideoEditViewModel) a5;
                            CutVideoViewModel cutVideoViewModel = this.f101024n;
                            if (cutVideoViewModel == null) {
                                C7573i.m23583a("cutVideoViewModel");
                            }
                            if (cutVideoViewModel.mo97162o()) {
                                View inflate = layoutInflater.inflate(R.layout.ai5, viewGroup, false);
                                if (inflate != null) {
                                    return (ViewGroup) inflate;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                            View inflate2 = layoutInflater.inflate(R.layout.ai4, viewGroup, false);
                            if (inflate2 != null) {
                                return (ViewGroup) inflate2;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
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
}
