package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.NullValueException;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.main.guide.C33040a;
import com.p280ss.android.ugc.aweme.main.guide.C33040a.C33041a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView */
public final class FissionFeedPendantView extends FrameLayout {

    /* renamed from: d */
    public static final C28731a f75706d = new C28731a(null);

    /* renamed from: a */
    public final float f75707a;

    /* renamed from: b */
    public C7561a<C7581n> f75708b;

    /* renamed from: c */
    public C7561a<C7581n> f75709c;

    /* renamed from: e */
    private final View f75710e;

    /* renamed from: f */
    private final FrameLayout f75711f;

    /* renamed from: g */
    private final RemoteImageView f75712g;

    /* renamed from: h */
    private final RemoteImageView f75713h;

    /* renamed from: i */
    private final ImageView f75714i;

    /* renamed from: j */
    private final float f75715j;

    /* renamed from: k */
    private final float f75716k;

    /* renamed from: l */
    private boolean f75717l;

    /* renamed from: m */
    private boolean f75718m;

    /* renamed from: n */
    private boolean f75719n;

    /* renamed from: o */
    private C7321c f75720o;

    /* renamed from: p */
    private AnimatorSet f75721p;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$a */
    public static final class C28731a {
        private C28731a() {
        }

        public /* synthetic */ C28731a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$b */
    public static final class C28732b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75725a;

        public final void onAnimationEnd(Animator animator) {
        }

        C28732b(FissionFeedPendantView fissionFeedPendantView) {
            this.f75725a = fissionFeedPendantView;
        }

        public final void onAnimationStart(Animator animator) {
            RemoteImageView bigImage = this.f75725a.getBigImage();
            C7573i.m23582a((Object) bigImage, "bigImage");
            bigImage.setVisibility(8);
            RemoteImageView smallImage = this.f75725a.getSmallImage();
            C7573i.m23582a((Object) smallImage, "smallImage");
            smallImage.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$c */
    static final class C28733c<T1, T2, R> implements C7324c<String, String, String> {

        /* renamed from: a */
        public static final C28733c f75726a = new C28733c();

        C28733c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return m94633a((String) obj, (String) obj2);
        }

        /* renamed from: a */
        private static String m94633a(String str, String str2) {
            C7573i.m23587b(str, "t1");
            C7573i.m23587b(str2, "t2");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$d */
    static final class C28734d<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75727a;

        C28734d(FissionFeedPendantView fissionFeedPendantView) {
            this.f75727a = fissionFeedPendantView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            this.f75727a.setImageLoaded(true);
            C7561a<C7581n> aVar = this.f75727a.f75709c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$e */
    static final class C28735e<T> implements C7495v<String> {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75728a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f75729b;

        C28735e(FissionFeedPendantView fissionFeedPendantView, UrlModel urlModel) {
            this.f75728a = fissionFeedPendantView;
            this.f75729b = urlModel;
        }

        public final void subscribe(final C47870u<String> uVar) {
            C7573i.m23587b(uVar, "emitter");
            C23323e.m76509a(this.f75728a.getBigImage(), this.f75729b, (C13401d<C13648f>) new C13400c<C13648f>() {
                public final void onFailure(String str, Throwable th) {
                    super.onFailure(str, th);
                    C47870u uVar = uVar;
                    if (th == null) {
                        C7573i.m23580a();
                    }
                    uVar.mo19240a(th);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    uVar.mo19239a((Object) "");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$f */
    static final class C28737f<T> implements C7495v<String> {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75731a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f75732b;

        C28737f(FissionFeedPendantView fissionFeedPendantView, UrlModel urlModel) {
            this.f75731a = fissionFeedPendantView;
            this.f75732b = urlModel;
        }

        public final void subscribe(final C47870u<String> uVar) {
            C7573i.m23587b(uVar, "emitter");
            C23323e.m76509a(this.f75731a.getSmallImage(), this.f75732b, (C13401d<C13648f>) new C13400c<C13648f>() {
                public final void onFailure(String str, Throwable th) {
                    super.onFailure(str, th);
                    C47870u uVar = uVar;
                    if (th == null) {
                        C7573i.m23580a();
                    }
                    uVar.mo19240a(th);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    uVar.mo19239a((Object) "");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$g */
    static final class C28739g implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75734a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f75735b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f75736c;

        C28739g(FissionFeedPendantView fissionFeedPendantView, FloatRef floatRef, FloatRef floatRef2) {
            this.f75734a = fissionFeedPendantView;
            this.f75735b = floatRef;
            this.f75736c = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout content = this.f75734a.getContent();
            C7573i.m23582a((Object) content, C38347c.f99553h);
            float f = this.f75735b.element;
            float f2 = this.f75736c.element;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f + (f2 * ((Float) animatedValue).floatValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$h */
    public static final class C28740h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75737a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f75738b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f75739c;

        public final void onAnimationStart(Animator animator) {
            this.f75738b.element = -this.f75737a.getSmallWidth();
            this.f75739c.element = this.f75737a.getSmallWidth();
        }

        C28740h(FissionFeedPendantView fissionFeedPendantView, FloatRef floatRef, FloatRef floatRef2) {
            this.f75737a = fissionFeedPendantView;
            this.f75738b = floatRef;
            this.f75739c = floatRef2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$i */
    static final class C28741i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75740a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f75741b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f75742c;

        C28741i(FissionFeedPendantView fissionFeedPendantView, FloatRef floatRef, FloatRef floatRef2) {
            this.f75740a = fissionFeedPendantView;
            this.f75741b = floatRef;
            this.f75742c = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout content = this.f75740a.getContent();
            C7573i.m23582a((Object) content, C38347c.f99553h);
            float f = this.f75741b.element;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f - (((Float) animatedValue).floatValue() * this.f75742c.element));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$j */
    public static final class C28742j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75743a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f75744b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f75745c;

        public final void onAnimationStart(Animator animator) {
            FloatRef floatRef = this.f75744b;
            FrameLayout content = this.f75743a.getContent();
            C7573i.m23582a((Object) content, C38347c.f99553h);
            floatRef.element = content.getTranslationX();
            this.f75745c.element = this.f75744b.element + this.f75743a.getBigWidth();
        }

        C28742j(FissionFeedPendantView fissionFeedPendantView, FloatRef floatRef, FloatRef floatRef2) {
            this.f75743a = fissionFeedPendantView;
            this.f75744b = floatRef;
            this.f75745c = floatRef2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView$k */
    static final class C28743k implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FissionFeedPendantView f75746a;

        /* renamed from: b */
        final /* synthetic */ float f75747b;

        C28743k(FissionFeedPendantView fissionFeedPendantView, float f) {
            this.f75746a = fissionFeedPendantView;
            this.f75747b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout content = this.f75746a.getContent();
            C7573i.m23582a((Object) content, C38347c.f99553h);
            float f = this.f75747b;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f + (((Float) animatedValue).floatValue() * this.f75746a.f75707a));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final RemoteImageView getBigImage() {
        return this.f75712g;
    }

    public final float getBigWidth() {
        return this.f75715j;
    }

    public final ImageView getCloseBtn() {
        return this.f75714i;
    }

    public final boolean getClosed() {
        return this.f75717l;
    }

    public final boolean getCollapsed() {
        return this.f75718m;
    }

    public final FrameLayout getContent() {
        return this.f75711f;
    }

    public final C7321c getDisposable() {
        return this.f75720o;
    }

    public final boolean getImageLoaded() {
        return this.f75719n;
    }

    public final View getRoot() {
        return this.f75710e;
    }

    public final AnimatorSet getSet() {
        return this.f75721p;
    }

    public final RemoteImageView getSmallImage() {
        return this.f75713h;
    }

    public final float getSmallWidth() {
        return this.f75716k;
    }

    /* renamed from: b */
    public final void mo73856b() {
        this.f75711f.setVisibility(8);
    }

    /* renamed from: f */
    private final ValueAnimator m94627f() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1});
        C7573i.m23582a((Object) ofInt, "valueAnimator");
        ofInt.setDuration(3);
        ofInt.addListener(new C28732b(this));
        return ofInt;
    }

    /* renamed from: a */
    public final void mo73854a() {
        if (this.f75719n) {
            C33040a a = C33041a.m106716a();
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            a.mo84732b(context);
            this.f75711f.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f75721p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C7321c cVar = this.f75720o;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: c */
    public final void mo73857c() {
        if (this.f75719n && !this.f75718m) {
            this.f75718m = true;
            this.f75721p = new AnimatorSet();
            AnimatorSet animatorSet = this.f75721p;
            if (animatorSet != null) {
                animatorSet.playSequentially(new Animator[]{m94625d(), m94626e(), m94627f(), m94628g()});
                animatorSet.start();
            }
        }
    }

    /* renamed from: d */
    private final Animator m94625d() {
        FrameLayout frameLayout = this.f75711f;
        C7573i.m23582a((Object) frameLayout, C38347c.f99553h);
        float translationX = frameLayout.getTranslationX();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C28743k(this, translationX));
        C7573i.m23582a((Object) ofFloat, "valueAnimator");
        ofFloat.setDuration(150);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75714i, "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat2, "closeBtnAnimator");
        ofFloat2.setDuration(150);
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
        return animatorSet;
    }

    /* renamed from: e */
    private final ValueAnimator m94626e() {
        FloatRef floatRef = new FloatRef();
        FrameLayout frameLayout = this.f75711f;
        C7573i.m23582a((Object) frameLayout, C38347c.f99553h);
        floatRef.element = frameLayout.getTranslationX();
        FloatRef floatRef2 = new FloatRef();
        floatRef2.element = floatRef.element + this.f75715j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C28741i(this, floatRef, floatRef2));
        ofFloat.addListener(new C28742j(this, floatRef, floatRef2));
        C7573i.m23582a((Object) ofFloat, "valueAnimator");
        ofFloat.setDuration(300);
        return ofFloat;
    }

    /* renamed from: g */
    private final Animator m94628g() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        FloatRef floatRef = new FloatRef();
        floatRef.element = -this.f75716k;
        FloatRef floatRef2 = new FloatRef();
        floatRef2.element = 0.0f;
        ofFloat.addListener(new C28740h(this, floatRef, floatRef2));
        ofFloat.addUpdateListener(new C28739g(this, floatRef, floatRef2));
        C7573i.m23582a((Object) ofFloat, "valueAnimator");
        ofFloat.setDuration(200);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75714i, "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "closeBtnAnimator");
        ofFloat2.setDuration(150);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    public final void setClosed(boolean z) {
        this.f75717l = z;
    }

    public final void setCollapsed(boolean z) {
        this.f75718m = z;
    }

    public final void setDisposable(C7321c cVar) {
        this.f75720o = cVar;
    }

    public final void setImageLoaded(boolean z) {
        this.f75719n = z;
    }

    public final void setSet(AnimatorSet animatorSet) {
        this.f75721p = animatorSet;
    }

    public final void setOnImageClickListener(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "onclick");
        this.f75708b = aVar;
    }

    public final void setOnImageLoadedListener(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "loaded");
        this.f75709c = aVar;
    }

    /* renamed from: a */
    public final void mo73855a(com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel, com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel2) {
        if (!(urlModel == null || urlModel2 == null)) {
            try {
                UrlModel urlModel3 = new UrlModel();
                urlModel3.setUri(urlModel.getUri());
                urlModel3.setUrlList(urlModel.getUrlList());
                UrlModel urlModel4 = new UrlModel();
                urlModel4.setUri(urlModel2.getUri());
                urlModel4.setUrlList(urlModel2.getUrlList());
                C7492s a = C7492s.m23282a((C7495v<T>) new C28735e<T>(this, urlModel3)).mo19284a(3);
                C7573i.m23582a((Object) a, "Observable.create(Observ…              }).retry(3)");
                C7492s a2 = C7492s.m23282a((C7495v<T>) new C28737f<T>(this, urlModel4)).mo19284a(3);
                C7573i.m23582a((Object) a2, "Observable.create(Observ…              }).retry(3)");
                this.f75720o = C7492s.m23298b((C7496w<? extends T1>) a, (C7496w<? extends T2>) a2, (C7324c<? super T1, ? super T2, ? extends R>) C28733c.f75726a).mo19325f((C7326g<? super T>) new C28734d<Object>(this));
                this.f75712g.getDrawable().setVisible(true, false);
                RemoteImageView remoteImageView = this.f75713h;
                C7573i.m23582a((Object) remoteImageView, "smallImage");
                remoteImageView.getDrawable().setVisible(true, false);
            } catch (NullValueException unused) {
            }
        }
    }

    public FissionFeedPendantView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f75710e = LayoutInflater.from(context).inflate(R.layout.mq, this, true);
        this.f75711f = (FrameLayout) this.f75710e.findViewById(R.id.ca6);
        this.f75712g = (RemoteImageView) this.f75711f.findViewById(R.id.md);
        this.f75713h = (RemoteImageView) this.f75711f.findViewById(R.id.d83);
        this.f75714i = (ImageView) this.f75711f.findViewById(R.id.xd);
        this.f75707a = C20505c.m68010a(context, 10.0f);
        this.f75715j = C20505c.m68010a(context, 100.0f);
        this.f75716k = C20505c.m68010a(context, 36.0f);
        this.f75714i.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FissionFeedPendantView f75722a;

            {
                this.f75722a = r1;
            }

            public final void onClick(View view) {
                this.f75722a.mo73856b();
                this.f75722a.setClosed(true);
            }
        });
        this.f75712g.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FissionFeedPendantView f75723a;

            {
                this.f75723a = r1;
            }

            public final void onClick(View view) {
                C7561a<C7581n> aVar = this.f75723a.f75708b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        this.f75713h.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FissionFeedPendantView f75724a;

            {
                this.f75724a = r1;
            }

            public final void onClick(View view) {
                C7561a<C7581n> aVar = this.f75724a.f75708b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
    }

    public /* synthetic */ FissionFeedPendantView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
