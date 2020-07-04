package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.CheckableImageButton;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39209j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b */
public final class C39012b extends C12629j implements C44396a {

    /* renamed from: t */
    public static final C39013a f101281t = new C39013a(null);

    /* renamed from: i */
    public C38982av f101282i;

    /* renamed from: j */
    public C38916af f101283j;

    /* renamed from: k */
    public C39052bl f101284k;

    /* renamed from: l */
    public ImageView f101285l;

    /* renamed from: m */
    public CheckableImageButton f101286m;

    /* renamed from: n */
    public ImageView f101287n;

    /* renamed from: o */
    public CutVideoBottomBarViewModel f101288o;

    /* renamed from: p */
    public CutVideoViewModel f101289p;

    /* renamed from: q */
    public CutVideoListViewModel f101290q;

    /* renamed from: r */
    public CutVideoSpeedViewModel f101291r;

    /* renamed from: s */
    public CutMultiVideoViewModel f101292s;

    /* renamed from: u */
    private TextView f101293u;

    /* renamed from: v */
    private VideoEditViewModel f101294v;

    /* renamed from: w */
    private CutVideoEditViewModel f101295w;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$a */
    public static final class C39013a {
        private C39013a() {
        }

        public /* synthetic */ C39013a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$b */
    static final class C39014b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39012b f101296a;

        C39014b(C39012b bVar) {
            this.f101296a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101296a.mo97335a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C39014b f101297a;

                {
                    this.f101297a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m124673a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m124673a() {
                    C39012b.m124644d(this.f101297a.f101296a).mo29069f();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$c */
    static final class C39016c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39012b f101298a;

        C39016c(C39012b bVar) {
            this.f101298a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            boolean isChecked = C39012b.m124641a(this.f101298a).isChecked();
            C39012b.m124641a(this.f101298a).toggle();
            C39012b.m124645e(this.f101298a).mo96958b(!isChecked);
            if (C39012b.m124646f(this.f101298a).mo97157i()) {
                C39012b.m124644d(this.f101298a).mo97043a(!isChecked);
            } else if (!isChecked) {
                CutVideoSpeedViewModel g = C39012b.m124647g(this.f101298a);
                RecordingSpeed d = C38774k.m123824d(this.f101298a.mo30921H().mo97241P().getCurrentSpeed());
                C7573i.m23582a((Object) d, "MVConfig.fromValue(previ…oEditView().currentSpeed)");
                g.mo97104a(d);
                C39012b.m124647g(this.f101298a).mo97106b(true);
            } else {
                C39012b.m124647g(this.f101298a).mo97106b(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$d */
    static final class C39017d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39012b f101299a;

        C39017d(C39012b bVar) {
            this.f101299a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C38774k.m123815a();
            C39012b bVar = this.f101299a;
            C7573i.m23582a((Object) view, "it");
            bVar.mo97332a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$e */
    static final class C39018e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101300a;

        C39018e(C39012b bVar) {
            this.f101300a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124674a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124674a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            ImageView c = C39012b.m124643c(this.f101300a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$f */
    static final class C39019f extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101301a;

        C39019f(C39012b bVar) {
            this.f101301a = bVar;
            super(2);
        }

        /* renamed from: a */
        private void m124675a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39012b.m124641a(this.f101301a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124675a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$g */
    static final class C39020g extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101302a;

        C39020g(C39012b bVar) {
            this.f101302a = bVar;
            super(2);
        }

        /* renamed from: a */
        private void m124676a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39012b.m124642b(this.f101302a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124676a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$h */
    static final class C39021h extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101303a;

        C39021h(C39012b bVar) {
            this.f101303a = bVar;
            super(2);
        }

        /* renamed from: a */
        private void m124677a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39012b.m124643c(this.f101303a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124677a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$i */
    static final class C39022i<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101304a;

        C39022i(C39012b bVar) {
            this.f101304a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                View view = this.f101304a.f33523b;
                C7573i.m23582a((Object) view, "view");
                C7573i.m23582a((Object) f, "it");
                view.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$j */
    static final class C39023j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101305a;

        C39023j(C39012b bVar) {
            this.f101305a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                View view = this.f101305a.f33523b;
                C7573i.m23582a((Object) view, "view");
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$k */
    static final class C39024k extends Lambda implements C7563m<C44396a, Float, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101306a;

        C39024k(C39012b bVar) {
            this.f101306a = bVar;
            super(2);
        }

        /* renamed from: a */
        private void m124680a(C44396a aVar, float f) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101306a.mo97331a(f);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124680a((C44396a) obj, ((Number) obj2).floatValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$l */
    static final class C39025l extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101307a;

        C39025l(C39012b bVar) {
            this.f101307a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124681a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124681a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            CheckableImageButton a = C39012b.m124641a(this.f101307a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$m */
    static final class C39026m extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101308a;

        C39026m(C39012b bVar) {
            this.f101308a = bVar;
            super(2);
        }

        /* renamed from: a */
        private void m124682a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39012b.m124641a(this.f101308a).setChecked(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124682a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$n */
    static final class C39027n extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39012b f101309a;

        C39027n(C39012b bVar) {
            this.f101309a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124683a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124683a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            ImageView b = C39012b.m124642b(this.f101309a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$o */
    static final class C39028o implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39012b f101310a;

        /* renamed from: b */
        final /* synthetic */ IntRef f101311b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f101312c;

        /* renamed from: d */
        final /* synthetic */ FloatRef f101313d;

        /* renamed from: e */
        final /* synthetic */ IntRef f101314e;

        /* renamed from: f */
        final /* synthetic */ IntRef f101315f;

        /* renamed from: g */
        final /* synthetic */ View f101316g;

        C39028o(C39012b bVar, IntRef intRef, FloatRef floatRef, FloatRef floatRef2, IntRef intRef2, IntRef intRef3, View view) {
            this.f101310a = bVar;
            this.f101311b = intRef;
            this.f101312c = floatRef;
            this.f101313d = floatRef2;
            this.f101314e = intRef2;
            this.f101315f = intRef3;
            this.f101316g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            C38916af.m124272a(this.f101310a.mo30920G(), C39012b.m124644d(this.f101310a).f100940e, (90.0f * animatedFraction) + ((float) this.f101311b.element), false, this.f101312c.element + (this.f101313d.element * animatedFraction), this.f101312c.element + (this.f101313d.element * animatedFraction), this.f101314e.element, this.f101315f.element, 4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$p */
    public static final class C39029p extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39012b f101317a;

        /* renamed from: b */
        final /* synthetic */ IntRef f101318b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f101319c;

        /* renamed from: d */
        final /* synthetic */ FloatRef f101320d;

        /* renamed from: e */
        final /* synthetic */ IntRef f101321e;

        /* renamed from: f */
        final /* synthetic */ IntRef f101322f;

        /* renamed from: g */
        final /* synthetic */ View f101323g;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f101323g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f101323g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f101323g.setEnabled(true);
            C39012b.m124648h(this.f101317a).mo96670b();
        }

        C39029p(C39012b bVar, IntRef intRef, FloatRef floatRef, FloatRef floatRef2, IntRef intRef2, IntRef intRef3, View view) {
            this.f101317a = bVar;
            this.f101318b = intRef;
            this.f101319c = floatRef;
            this.f101320d = floatRef2;
            this.f101321e = intRef2;
            this.f101322f = intRef3;
            this.f101323g = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b$q */
    static final class C39030q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f101324a;

        C39030q(C7561a aVar) {
            this.f101324a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101324a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo97333a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f101283j = afVar;
    }

    /* renamed from: a */
    public final void mo97334a(C39052bl blVar) {
        C7573i.m23587b(blVar, "<set-?>");
        this.f101284k = blVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.dq5);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.tvTime)");
        this.f101293u = (TextView) h_;
        View h_2 = mo31004h_(R.id.b5n);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.ivRotate)");
        this.f101285l = (ImageView) h_2;
        View h_3 = mo31004h_(R.id.b5p);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.ivSpeed)");
        this.f101286m = (CheckableImageButton) h_3;
        View h_4 = mo31004h_(R.id.b5i);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.ivDelete)");
        this.f101287n = (ImageView) h_4;
    }

    /* renamed from: a */
    public final void mo97335a(C7561a<C7581n> aVar) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            new C10741a(activity).mo25657b((int) R.string.ao5).mo25658b((int) R.string.cas, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.anl, (DialogInterface.OnClickListener) new C39030q(aVar)).mo25656a().mo25637a().show();
        }
    }

    /* renamed from: a */
    public final void mo97331a(float f) {
        Locale locale = Locale.getDefault();
        C7573i.m23582a((Object) locale, "Locale.getDefault()");
        String a = C1642a.m8035a(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        String string = mo31017x().getString(R.string.cb0, new Object[]{a});
        TextView textView = this.f101293u;
        if (textView == null) {
            C7573i.m23583a("tvTime");
        }
        textView.setText(string);
    }

    /* renamed from: a */
    public final void mo97332a(View view) {
        int i;
        int i2;
        C7573i.m23587b(view, "view");
        C39052bl blVar = this.f101284k;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        int currentRotate = blVar.mo97241P().getCurrentRotate();
        FloatRef floatRef = new FloatRef();
        floatRef.element = 0.0f;
        CutVideoEditViewModel cutVideoEditViewModel = this.f101295w;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        if (cutVideoEditViewModel.f100834d == 0) {
            VideoEditViewModel videoEditViewModel = this.f101294v;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            List n = videoEditViewModel.mo97721n();
            CutVideoListViewModel cutVideoListViewModel = this.f101290q;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            i2 = ((VideoSegment) n.get(cutVideoListViewModel.f100940e)).f100765g;
            VideoEditViewModel videoEditViewModel2 = this.f101294v;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            List n2 = videoEditViewModel2.mo97721n();
            CutVideoListViewModel cutVideoListViewModel2 = this.f101290q;
            if (cutVideoListViewModel2 == null) {
                C7573i.m23583a("cutVideoListViewModel");
            }
            i = ((VideoSegment) n2.get(cutVideoListViewModel2.f100940e)).f100766h;
        } else {
            C39052bl blVar2 = this.f101284k;
            if (blVar2 == null) {
                C7573i.m23583a("previewEditCallback");
            }
            i2 = blVar2.mo97238M();
            C39052bl blVar3 = this.f101284k;
            if (blVar3 == null) {
                C7573i.m23583a("previewEditCallback");
            }
            i = blVar3.mo97239N();
        }
        C39052bl blVar4 = this.f101284k;
        if (blVar4 == null) {
            C7573i.m23583a("previewEditCallback");
        }
        float f = 1.0f;
        if (blVar4.mo97241P().getCurrentRotate() % NormalGiftView.ALPHA_180 == 0) {
            floatRef.element = 1.0f;
            f = (((float) i2) * 1.0f) / ((float) i);
        } else {
            floatRef.element = (((float) i2) * 1.0f) / ((float) i);
        }
        VideoEditViewModel videoEditViewModel3 = this.f101294v;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n3 = videoEditViewModel3.mo97721n();
        CutVideoListViewModel cutVideoListViewModel3 = this.f101290q;
        if (cutVideoListViewModel3 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        ((VideoSegment) n3.get(cutVideoListViewModel3.f100940e)).f100770l = f;
        VideoEditViewModel videoEditViewModel4 = this.f101294v;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n4 = videoEditViewModel4.mo97721n();
        CutVideoListViewModel cutVideoListViewModel4 = this.f101290q;
        if (cutVideoListViewModel4 == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        ((VideoSegment) n4.get(cutVideoListViewModel4.f100940e)).f100771m = f;
        FloatRef floatRef2 = new FloatRef();
        floatRef2.element = f - floatRef.element;
        IntRef intRef = new IntRef();
        intRef.element = currentRotate % 360;
        IntRef intRef2 = new IntRef();
        intRef2.element = 0;
        IntRef intRef3 = new IntRef();
        intRef3.element = 0;
        CutVideoViewModel cutVideoViewModel = this.f101289p;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            C38982av avVar = this.f101282i;
            C39209j jVar = null;
            if ((avVar != null ? avVar.mo97281l() : null) != null) {
                floatRef2.element = 0.0f;
                C38982av avVar2 = this.f101282i;
                C39209j l = avVar2 != null ? avVar2.mo97281l() : null;
                if (l == null) {
                    C7573i.m23580a();
                }
                floatRef.element = l.f101619a;
                C38982av avVar3 = this.f101282i;
                C39209j l2 = avVar3 != null ? avVar3.mo97281l() : null;
                if (l2 == null) {
                    C7573i.m23580a();
                }
                intRef2.element = l2.f101621c;
                C38982av avVar4 = this.f101282i;
                if (avVar4 != null) {
                    jVar = avVar4.mo97281l();
                }
                if (jVar == null) {
                    C7573i.m23580a();
                }
                intRef3.element = jVar.f101622d;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        IntRef intRef4 = intRef;
        FloatRef floatRef3 = floatRef;
        FloatRef floatRef4 = floatRef2;
        IntRef intRef5 = intRef2;
        IntRef intRef6 = intRef3;
        View view2 = view;
        C39028o oVar = new C39028o(this, intRef4, floatRef3, floatRef4, intRef5, intRef6, view2);
        ofFloat.addUpdateListener(oVar);
        C39029p pVar = new C39029p(this, intRef4, floatRef3, floatRef4, intRef5, intRef6, view2);
        ofFloat.addListener(pVar);
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
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
    public final C38916af mo30920G() {
        C38916af afVar = this.f101283j;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        return afVar;
    }

    /* renamed from: H */
    public final C39052bl mo30921H() {
        C39052bl blVar = this.f101284k;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        return blVar;
    }

    /* renamed from: K */
    private final void m124638K() {
        ImageView imageView = this.f101287n;
        if (imageView == null) {
            C7573i.m23583a("ivDelete");
        }
        imageView.setOnClickListener(new C39014b(this));
        CheckableImageButton checkableImageButton = this.f101286m;
        if (checkableImageButton == null) {
            C7573i.m23583a("ivSpeed");
        }
        checkableImageButton.setOnClickListener(new C39016c(this));
        ImageView imageView2 = this.f101285l;
        if (imageView2 == null) {
            C7573i.m23583a("ivRotate");
        }
        imageView2.setOnClickListener(new C39017d(this));
    }

    /* renamed from: L */
    private final void m124639L() {
        ImageView imageView = this.f101285l;
        if (imageView == null) {
            C7573i.m23583a("ivRotate");
        }
        boolean z = false;
        imageView.setVisibility(0);
        VideoEditViewModel videoEditViewModel = this.f101294v;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        if (videoEditViewModel.mo97724q()) {
            VideoEditViewModel videoEditViewModel2 = this.f101294v;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo97721n().get(0);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f101288o;
            if (cutVideoBottomBarViewModel == null) {
                C7573i.m23583a("bottomBarViewModel");
            }
            CutVideoViewModel cutVideoViewModel = this.f101289p;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97158j()) {
                C38916af afVar = this.f101283j;
                if (afVar == null) {
                    C7573i.m23583a("presenter");
                }
                if (afVar.mo97217a(videoSegment)) {
                    z = true;
                }
            }
            cutVideoBottomBarViewModel.mo96956a(z);
        }
    }

    /* renamed from: I */
    private final void m124636I() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoBottomBarViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…BarViewModel::class.java)");
            this.f101288o = (CutVideoBottomBarViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…deoViewModel::class.java)");
                this.f101289p = (CutVideoViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    C0063u a3 = C0069x.m159a((FragmentActivity) activity3).mo147a(VideoEditViewModel.class);
                    C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                    this.f101294v = (VideoEditViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoListViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…istViewModel::class.java)");
                        this.f101290q = (CutVideoListViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoSpeedViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…eedViewModel::class.java)");
                            this.f101291r = (CutVideoSpeedViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                C0063u a6 = C0069x.m159a((FragmentActivity) activity6).mo147a(CutMultiVideoViewModel.class);
                                C7573i.m23582a((Object) a6, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                                this.f101292s = (CutMultiVideoViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(CutVideoEditViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…ditViewModel::class.java)");
                                    this.f101295w = (CutVideoEditViewModel) a7;
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

    /* renamed from: J */
    private final void m124637J() {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f101288o;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel, C39056c.f101351a, new C11672v(), new C39024k(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f101288o;
        if (cutVideoBottomBarViewModel2 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel2, C39060g.f101355a, new C11672v(), new C39025l(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f101288o;
        if (cutVideoBottomBarViewModel3 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel3, C39061h.f101356a, new C11672v(), new C39026m(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f101288o;
        if (cutVideoBottomBarViewModel4 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel4, C39062i.f101357a, new C11672v(), new C39027n(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.f101288o;
        if (cutVideoBottomBarViewModel5 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel5, C39063j.f101358a, new C11672v(), new C39018e(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.f101288o;
        if (cutVideoBottomBarViewModel6 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel6, C39057d.f101352a, new C11672v(), new C39019f(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.f101288o;
        if (cutVideoBottomBarViewModel7 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel7, C39058e.f101353a, new C11672v(), new C39020g(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.f101288o;
        if (cutVideoBottomBarViewModel8 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        mo91868b(cutVideoBottomBarViewModel8, C39059f.f101354a, new C11672v(), new C39021h(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.f101288o;
        if (cutVideoBottomBarViewModel9 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        C0043i iVar = this;
        cutVideoBottomBarViewModel9.mo29069f().observe(iVar, new C39022i(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.f101288o;
        if (cutVideoBottomBarViewModel10 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel10.mo96963g().observe(iVar, new C39023j(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ CheckableImageButton m124641a(C39012b bVar) {
        CheckableImageButton checkableImageButton = bVar.f101286m;
        if (checkableImageButton == null) {
            C7573i.m23583a("ivSpeed");
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m124642b(C39012b bVar) {
        ImageView imageView = bVar.f101285l;
        if (imageView == null) {
            C7573i.m23583a("ivRotate");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m124643c(C39012b bVar) {
        ImageView imageView = bVar.f101287n;
        if (imageView == null) {
            C7573i.m23583a("ivDelete");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoListViewModel m124644d(C39012b bVar) {
        CutVideoListViewModel cutVideoListViewModel = bVar.f101290q;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoBottomBarViewModel m124645e(C39012b bVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = bVar.f101288o;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ CutVideoViewModel m124646f(C39012b bVar) {
        CutVideoViewModel cutVideoViewModel = bVar.f101289p;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutVideoSpeedViewModel m124647g(C39012b bVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = bVar.f101291r;
        if (cutVideoSpeedViewModel == null) {
            C7573i.m23583a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ CutMultiVideoViewModel m124648h(C39012b bVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = bVar.f101292s;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124636I();
        m124637J();
        CutVideoViewModel cutVideoViewModel = this.f101289p;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo97157i()) {
            m124639L();
        }
        m124638K();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ahz, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…om_bar, container, false)");
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
