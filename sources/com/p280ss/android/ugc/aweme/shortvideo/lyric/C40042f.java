package com.p280ss.android.ugc.aweme.shortvideo.lyric;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.transition.C0476c;
import android.support.transition.C0488d;
import android.support.transition.C0508m;
import android.support.transition.C0508m.C0514c;
import android.support.transition.C0515n;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.filter.C29231b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout.C42064a;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.editor.C44297cs;
import com.p280ss.android.ugc.gamora.editor.EditLyricStickerState;
import com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f */
public class C40042f extends C12629j implements OnClickListener {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f103979i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40042f.class), "lyricEffectView", "getLyricEffectView()Lcom/ss/android/ugc/aweme/shortvideo/lyric/LyricEffectView;"))};

    /* renamed from: A */
    private C29231b f103980A;

    /* renamed from: B */
    private final C7541d f103981B = C7546e.m23569a(C40046d.f104004a);

    /* renamed from: C */
    private EditViewModel f103982C;

    /* renamed from: D */
    private final C23254a f103983D = new C40047e(this);

    /* renamed from: j */
    public boolean f103984j;

    /* renamed from: k */
    public boolean f103985k;

    /* renamed from: l */
    public View f103986l;

    /* renamed from: m */
    public LinearLayout f103987m;

    /* renamed from: n */
    public TextView f103988n;

    /* renamed from: o */
    public ImageView f103989o;

    /* renamed from: p */
    public ColorSelectLayout f103990p;

    /* renamed from: q */
    public boolean f103991q;

    /* renamed from: r */
    public C34860g f103992r;

    /* renamed from: s */
    public EditLyricStickerViewModel f103993s;

    /* renamed from: t */
    public C44297cs f103994t;

    /* renamed from: u */
    public int f103995u;

    /* renamed from: v */
    private AppCompatActivity f103996v;

    /* renamed from: w */
    private C23258e f103997w;

    /* renamed from: x */
    private FrameLayout f103998x;

    /* renamed from: y */
    private ImageView f103999y;

    /* renamed from: z */
    private FrameLayout f104000z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$a */
    public static final class C40043a extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C40042f f104001a;

        /* renamed from: a */
        public final void mo74767a() {
            this.f104001a.f103991q = true;
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74767a();
            }
        }

        /* renamed from: b */
        public final void mo74847b() {
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74847b();
            }
            this.f104001a.f103991q = false;
        }

        /* renamed from: c */
        public final void mo74769c() {
            this.f104001a.f103991q = true;
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74769c();
            }
        }

        /* renamed from: d */
        public final void mo74768d() {
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74768d();
            }
            this.f104001a.f103991q = false;
        }

        C40043a(C40042f fVar) {
            this.f104001a = fVar;
        }

        /* renamed from: a */
        public final void mo74844a(float f, int i, int i2) {
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74844a(f, i, i2);
            }
        }

        /* renamed from: b */
        public final void mo74848b(float f, int i, int i2) {
            C34860g gVar = this.f104001a.f103992r;
            if (gVar != null) {
                gVar.mo74848b(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$b */
    static final class C40044b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40042f f104002a;

        C40044b(C40042f fVar) {
            this.f104002a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f104002a.mo30921H();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$c */
    static final class C40045c implements C42064a {

        /* renamed from: a */
        final /* synthetic */ C40042f f104003a;

        C40045c(C40042f fVar) {
            this.f104003a = fVar;
        }

        /* renamed from: a */
        public final void mo99488a(int i) {
            C40042f.m127991a(this.f104003a).mo106273a(Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$d */
    static final class C40046d extends Lambda implements C7561a<C40035d> {

        /* renamed from: a */
        public static final C40046d f104004a = new C40046d();

        C40046d() {
            super(0);
        }

        /* renamed from: a */
        private static C40035d m128012a() {
            return new C40035d();
        }

        public final /* synthetic */ Object invoke() {
            return m128012a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$e */
    static final class C40047e implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C40042f f104005a;

        C40047e(C40042f fVar) {
            this.f104005a = fVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f104005a.mo30921H();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$f */
    public static final class C40048f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C40042f f104006a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C40048f(C40042f fVar) {
            this.f104006a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f104006a.f103995u == 0) {
                TextView textView = this.f104006a.f103988n;
                if (textView == null) {
                    C7573i.m23580a();
                }
                textView.setVisibility(8);
                ImageView imageView = this.f104006a.f103989o;
                if (imageView == null) {
                    C7573i.m23580a();
                }
                imageView.setVisibility(8);
                LinearLayout linearLayout = this.f104006a.f103987m;
                if (linearLayout == null) {
                    C7573i.m23580a();
                }
                View findViewById = linearLayout.findViewById(R.id.bm2);
                C7573i.m23582a((Object) findViewById, "mBottomSheetLayout!!.findViewById<View>(R.id.line)");
                findViewById.setVisibility(0);
                return;
            }
            TextView textView2 = this.f104006a.f103988n;
            if (textView2 == null) {
                C7573i.m23580a();
            }
            textView2.setVisibility(0);
            ImageView imageView2 = this.f104006a.f103989o;
            if (imageView2 == null) {
                C7573i.m23580a();
            }
            imageView2.setVisibility(0);
            LinearLayout linearLayout2 = this.f104006a.f103987m;
            if (linearLayout2 == null) {
                C7573i.m23580a();
            }
            View findViewById2 = linearLayout2.findViewById(R.id.bm2);
            C7573i.m23582a((Object) findViewById2, "mBottomSheetLayout!!.findViewById<View>(R.id.line)");
            findViewById2.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$g */
    public static final class C40049g extends C0515n {

        /* renamed from: a */
        final /* synthetic */ C40042f f104007a;

        /* renamed from: b */
        final /* synthetic */ ValueAnimator f104008b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f104009c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$g$a */
        static final class C40050a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C40049g f104010a;

            C40050a(C40049g gVar) {
                this.f104010a = gVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StringBuilder sb = new StringBuilder("update ");
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    sb.append(((Integer) animatedValue).intValue());
                    ColorSelectLayout colorSelectLayout = this.f104010a.f104007a.f103990p;
                    if (colorSelectLayout == null) {
                        C7573i.m23580a();
                    }
                    ViewParent parent = colorSelectLayout.getParent();
                    if (parent != null) {
                        LayoutParams layoutParams = ((View) parent).getLayoutParams();
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        if (animatedValue2 != null) {
                            layoutParams.width = ((Integer) animatedValue2).intValue();
                            ColorSelectLayout colorSelectLayout2 = this.f104010a.f104007a.f103990p;
                            if (colorSelectLayout2 == null) {
                                C7573i.m23580a();
                            }
                            ViewParent parent2 = colorSelectLayout2.getParent();
                            if (parent2 != null) {
                                ((View) parent2).getParent().requestLayout();
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        /* renamed from: d */
        public final void mo2045d(C0508m mVar) {
            C7573i.m23587b(mVar, "p0");
            ValueAnimator valueAnimator = this.f104008b;
            C7573i.m23582a((Object) valueAnimator, "valueAnimator");
            valueAnimator.setInterpolator((C40025a) this.f104009c.element);
            this.f104008b.addUpdateListener(new C40050a(this));
            this.f104008b.start();
        }

        C40049g(C40042f fVar, ValueAnimator valueAnimator, ObjectRef objectRef) {
            this.f104007a = fVar;
            this.f104008b = valueAnimator;
            this.f104009c = objectRef;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$h */
    public static final class C40051h extends C40582c {

        /* renamed from: a */
        final /* synthetic */ C40042f f104011a;

        /* renamed from: a */
        public final void mo74767a() {
            View view = this.f104011a.f103986l;
            if (view != null) {
                view.setVisibility(0);
            }
            super.mo74767a();
        }

        C40051h(C40042f fVar) {
            this.f104011a = fVar;
        }
    }

    /* renamed from: a */
    private final C40035d mo29060a() {
        return (C40035d) this.f103981B.getValue();
    }

    /* renamed from: a */
    public final void mo99484a(String str) {
        mo29060a().mo99475a(str);
    }

    /* renamed from: I */
    public final Effect mo30922I() {
        return mo29060a().mo99478c();
    }

    /* renamed from: H */
    public final void mo30921H() {
        if (!this.f103991q) {
            EditLyricStickerViewModel editLyricStickerViewModel = this.f103993s;
            if (editLyricStickerViewModel == null) {
                C7573i.m23583a("editLyricViewModel");
            }
            editLyricStickerViewModel.mo106272a(Boolean.valueOf(false));
            C29231b bVar = this.f103980A;
            if (bVar != null) {
                bVar.mo74849b(new C40582c());
            }
            C23258e eVar = this.f103997w;
            if (eVar != null) {
                eVar.mo60526b(this.f103983D);
            }
        }
    }

    /* renamed from: G */
    public final void mo30920G() {
        if (!this.f103991q) {
            FrameLayout frameLayout = this.f103998x;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                AppCompatActivity appCompatActivity = this.f103996v;
                if (appCompatActivity == null) {
                    C7573i.m23583a("mActivity");
                }
                m127992a(appCompatActivity, frameLayout);
                mo29060a().mo99477b();
                View view = this.f103986l;
                if (view != null) {
                    view.setVisibility(4);
                }
                C29231b bVar = this.f103980A;
                if (bVar != null) {
                    bVar.mo74845a((C34856c) new C40051h(this));
                }
                C23258e eVar = this.f103997w;
                if (eVar != null) {
                    eVar.mo60525a(this.f103983D);
                }
                EditLyricStickerViewModel editLyricStickerViewModel = this.f103993s;
                if (editLyricStickerViewModel == null) {
                    C7573i.m23583a("editLyricViewModel");
                }
                editLyricStickerViewModel.mo106272a(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: b */
    private final void mo29067b() {
        int i;
        View view = this.f103986l;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f103987m = (LinearLayout) view.findViewById(R.id.bw8);
        View view2 = this.f103986l;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.findViewById(R.id.bwd).setOnClickListener(new C40044b(this));
        View view3 = this.f103986l;
        if (view3 == null) {
            C7573i.m23580a();
        }
        this.f103988n = (TextView) view3.findViewById(R.id.bwc);
        TextView textView = this.f103988n;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f103988n;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View view4 = this.f103986l;
        if (view4 == null) {
            C7573i.m23580a();
        }
        this.f103999y = (ImageView) view4.findViewById(R.id.b7m);
        ImageView imageView = this.f103999y;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        View view5 = this.f103986l;
        if (view5 == null) {
            C7573i.m23580a();
        }
        this.f103989o = (ImageView) view5.findViewById(R.id.b89);
        ImageView imageView2 = this.f103989o;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        View view6 = this.f103986l;
        if (view6 == null) {
            C7573i.m23580a();
        }
        this.f104000z = (FrameLayout) view6.findViewById(R.id.bw_);
        C40035d a = mo29060a();
        AppCompatActivity appCompatActivity = this.f103996v;
        if (appCompatActivity == null) {
            C7573i.m23583a("mActivity");
        }
        a.mo99473a(appCompatActivity, this.f104000z);
        View view7 = this.f103986l;
        if (view7 == null) {
            C7573i.m23580a();
        }
        this.f103990p = (ColorSelectLayout) view7.findViewById(R.id.y9);
        ColorSelectLayout colorSelectLayout = this.f103990p;
        if (colorSelectLayout != null) {
            EditLyricStickerViewModel editLyricStickerViewModel = this.f103993s;
            if (editLyricStickerViewModel == null) {
                C7573i.m23583a("editLyricViewModel");
            }
            AppCompatActivity appCompatActivity2 = this.f103996v;
            if (appCompatActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            Integer defaultColor = ((EditLyricStickerState) editLyricStickerViewModel.mo106825a(appCompatActivity2)).getDefaultColor();
            if (defaultColor != null) {
                i = defaultColor.intValue();
            } else {
                i = -1;
            }
            colorSelectLayout.setSelectColorView(i);
        }
        ColorSelectLayout colorSelectLayout2 = this.f103990p;
        if (colorSelectLayout2 != null) {
            colorSelectLayout2.setColorChangeListener(new C40045c(this));
        }
        this.f103995u = 1;
    }

    /* renamed from: a */
    public final void mo99482a(C34860g gVar) {
        C7573i.m23587b(gVar, "transitionListener");
        this.f103992r = gVar;
    }

    /* renamed from: d */
    public final void mo99485d(int i) {
        ColorSelectLayout colorSelectLayout = this.f103990p;
        if (colorSelectLayout != null) {
            colorSelectLayout.setSelectColorView(i);
        }
        ColorSelectLayout colorSelectLayout2 = this.f103990p;
        if (colorSelectLayout2 != null) {
            colorSelectLayout2.mo103311a(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditLyricStickerViewModel m127991a(C40042f fVar) {
        EditLyricStickerViewModel editLyricStickerViewModel = fVar.f103993s;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("editLyricViewModel");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: a */
    public final Effect mo99480a(Effect effect) {
        C7573i.m23587b(effect, "lyricEffect");
        return mo29060a().mo99476b(effect);
    }

    public void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        boolean z = true;
        if (num != null && num.intValue() == R.id.b89) {
            EditViewModel editViewModel = this.f103982C;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            if (!editViewModel.mo106438M()) {
                this.f103984j = true;
                mo30921H();
                EditLyricStickerViewModel editLyricStickerViewModel = this.f103993s;
                if (editLyricStickerViewModel == null) {
                    C7573i.m23583a("editLyricViewModel");
                }
                editLyricStickerViewModel.mo106278j();
            }
        } else if (num != null && num.intValue() == R.id.b7m) {
            if (this.f103995u == 0) {
                z = false;
            }
            m127993a(z);
        } else {
            if (num != null && num.intValue() == R.id.bwc) {
                this.f103985k = true;
                mo30921H();
                EditLyricStickerViewModel editLyricStickerViewModel2 = this.f103993s;
                if (editLyricStickerViewModel2 == null) {
                    C7573i.m23583a("editLyricViewModel");
                }
                editLyricStickerViewModel2.mo29069f().setValue(this.f103994t);
            }
        }
    }

    /* renamed from: a */
    private final void m127993a(boolean z) {
        int i;
        this.f103995u = z ^ true ? 1 : 0;
        ColorSelectLayout colorSelectLayout = this.f103990p;
        if (colorSelectLayout == null) {
            C7573i.m23580a();
        }
        ViewParent parent = colorSelectLayout.getParent();
        if (parent != null) {
            LayoutParams layoutParams = ((View) parent).getLayoutParams();
            if (layoutParams != null) {
                int i2 = ((MarginLayoutParams) layoutParams).width;
                if (this.f103995u == 0) {
                    AppCompatActivity appCompatActivity = this.f103996v;
                    if (appCompatActivity == null) {
                        C7573i.m23583a("mActivity");
                    }
                    int b = C39805en.m127447b(appCompatActivity);
                    AppCompatActivity appCompatActivity2 = this.f103996v;
                    if (appCompatActivity2 == null) {
                        C7573i.m23583a("mActivity");
                    }
                    i = b - ((int) C9738o.m28708b((Context) appCompatActivity2, 64.0f));
                } else {
                    i = 0;
                }
                ObjectRef objectRef = new ObjectRef();
                objectRef.element = new C40025a();
                C0520q qVar = new C0520q();
                qVar.mo2115a(250);
                qVar.mo2116a((TimeInterpolator) (C40025a) objectRef.element);
                qVar.mo2150a(0);
                C0488d dVar = new C0488d();
                TextView textView = this.f103988n;
                if (textView == null) {
                    C7573i.m23580a();
                }
                C0508m b2 = dVar.mo2131b((View) textView);
                ImageView imageView = this.f103989o;
                if (imageView == null) {
                    C7573i.m23580a();
                }
                C0508m b3 = b2.mo2131b((View) imageView);
                LinearLayout linearLayout = this.f103987m;
                if (linearLayout == null) {
                    C7573i.m23580a();
                }
                qVar.mo2151a(b3.mo2131b(linearLayout.findViewById(R.id.bm2)));
                C0476c cVar = new C0476c();
                ImageView imageView2 = this.f103999y;
                if (imageView2 == null) {
                    C7573i.m23580a();
                }
                qVar.mo2151a(cVar.mo2131b((View) imageView2));
                ValueAnimator duration = ValueAnimator.ofInt(new int[]{i2, i}).setDuration(250);
                duration.addListener(new C40048f(this));
                qVar.mo2117a((C0514c) new C40049g(this, duration, objectRef));
                LinearLayout linearLayout2 = this.f103987m;
                if (linearLayout2 == null) {
                    C7573i.m23580a();
                }
                C0516o.m2171a(linearLayout2, qVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    public final void mo99481a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "context");
        mo29060a().mo99472a(fragmentActivity);
    }

    /* renamed from: a */
    private final void m127992a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        if (this.f103986l == null) {
            this.f103986l = LayoutInflater.from(appCompatActivity).inflate(R.layout.h4, frameLayout, false);
            AppCompatActivity appCompatActivity2 = this.f103996v;
            if (appCompatActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            JediViewModel a = C36113b.m116288a(appCompatActivity2).mo91871a(EditLyricStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f103993s = (EditLyricStickerViewModel) a;
            AppCompatActivity appCompatActivity3 = this.f103996v;
            if (appCompatActivity3 == null) {
                C7573i.m23583a("mActivity");
            }
            JediViewModel a2 = C36113b.m116288a(appCompatActivity3).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f103982C = (EditViewModel) a2;
            mo29067b();
            View view = this.f103986l;
            if (view == null) {
                C7573i.m23580a();
            }
            LinearLayout linearLayout = this.f103987m;
            if (linearLayout == null) {
                C7573i.m23580a();
            }
            this.f103980A = new C29231b(frameLayout, view, linearLayout);
            C29231b bVar = this.f103980A;
            if (bVar == null) {
                C7573i.m23580a();
            }
            bVar.mo74846a((C34860g) new C40043a(this));
        }
        EditViewModel editViewModel = this.f103982C;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel.mo106438M()) {
            ImageView imageView = this.f103989o;
            if (imageView != null) {
                imageView.setAlpha(0.5f);
            }
        } else {
            ImageView imageView2 = this.f103989o;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            }
        }
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b != null) {
            if (this.f103995u == 0) {
                TextView textView = this.f103988n;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                TextView textView2 = this.f103988n;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            TextView textView3 = this.f103988n;
            if (textView3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(b.musicName);
                sb.append(" - ");
                sb.append(b.authorName);
                textView3.setText(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo99483a(Effect effect, String str) {
        this.f103994t = new C44297cs(effect, str, false);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        Activity activity = this.f33526d_;
        if (activity != null) {
            this.f103996v = (AppCompatActivity) activity;
            Activity activity2 = this.f33526d_;
            if (!(activity2 instanceof C23258e)) {
                activity2 = null;
            }
            this.f103997w = (C23258e) activity2;
            View inflate = layoutInflater.inflate(R.layout.ain, viewGroup, false);
            if (inflate != null) {
                this.f103998x = (FrameLayout) inflate;
                FrameLayout frameLayout = this.f103998x;
                if (frameLayout == null) {
                    C7573i.m23580a();
                }
                return frameLayout;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }
}
