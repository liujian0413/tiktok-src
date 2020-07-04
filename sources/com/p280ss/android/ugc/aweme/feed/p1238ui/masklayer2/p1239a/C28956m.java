package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28965d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28967f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28969h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28970i;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28978b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28985f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28986g;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.shortvideo.C38457aq;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m */
public final class C28956m extends C28955l {

    /* renamed from: d */
    public static final C28957a f76299d = new C28957a(null);

    /* renamed from: i */
    private static final int f76300i = ((int) C20505c.m68010a(C6399b.m19921a(), 8.0f));

    /* renamed from: j */
    private static final C38457aq f76301j = new C38457aq(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a */
    public ViewGroup f76302a;

    /* renamed from: b */
    public ViewGroup f76303b;

    /* renamed from: c */
    public final C28933a f76304c;

    /* renamed from: g */
    private C28970i f76305g;

    /* renamed from: h */
    private AnimatorSet f76306h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$a */
    public static final class C28957a {
        private C28957a() {
        }

        public /* synthetic */ C28957a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$b */
    static final class C28958b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28956m f76307a;

        C28958b(C28956m mVar) {
            this.f76307a = mVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f76307a.f76302a;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue <= 0.0f) {
                    ViewGroup viewGroup2 = this.f76307a.f76302a;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(4);
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$c */
    static final class C28959c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28956m f76308a;

        C28959c(C28956m mVar) {
            this.f76308a = mVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f76308a.f76303b;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue > 0.0f) {
                    ViewGroup viewGroup2 = this.f76308a.f76303b;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$d */
    static final class C28960d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28956m f76309a;

        C28960d(C28956m mVar) {
            this.f76309a = mVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76309a.f76302a;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$e */
    static final class C28961e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28956m f76310a;

        C28961e(C28956m mVar) {
            this.f76310a = mVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76310a.f76303b;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.m$f */
    static final class C28962f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28956m f76311a;

        C28962f(C28956m mVar) {
            this.f76311a = mVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76311a.f76303b;
                if (viewGroup != null) {
                    LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                    }
                }
                ViewGroup viewGroup2 = this.f76311a.f76303b;
                if (viewGroup2 != null) {
                    viewGroup2.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    private final void m95195b() {
        String str;
        String str2 = "click_block_videos";
        C22984d a = new C22984d().mo59973a("enter_from", this.f76304c.f76272c);
        String str3 = "group_id";
        Aweme aweme = this.f76304c.f76271b;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f76304c.f76271b;
        if (aweme2 != null) {
            str4 = aweme2.getAuthorUid();
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76304c.f76271b))).mo59973a("enter_method", "long_press").f60753a);
    }

    /* renamed from: a */
    private final void m95194a() {
        AnimatorSet animatorSet = this.f76306h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "ValueAnimator.ofFloat(1f, 0f)");
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C28958b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "ValueAnimator.ofFloat(0f, 1f)");
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new C28959c(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, f76300i});
        C7573i.m23582a((Object) ofInt, "ValueAnimator.ofInt(0, XOFFSET)");
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C28960d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{-f76300i, 0});
        C7573i.m23582a((Object) ofInt2, "ValueAnimator.ofInt(-XOFFSET, 0)");
        ofInt2.setDuration(300);
        ofInt2.addUpdateListener(new C28961e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f76302a;
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        iArr[0] = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f76303b;
        if (viewGroup2 == null) {
            C7573i.m23580a();
        }
        iArr[1] = viewGroup2.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        C7573i.m23582a((Object) ofInt3, "ValueAnimator.ofInt(mOpt…yLayout!!.measuredHeight)");
        ofInt3.setDuration(300);
        ofInt3.addUpdateListener(new C28962f(this));
        this.f76306h = new AnimatorSet();
        AnimatorSet animatorSet2 = this.f76306h;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(f76301j);
            animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt, ofInt2, ofInt3});
            animatorSet2.start();
        }
    }

    /* renamed from: b */
    public final void mo74232b(View view) {
        C7573i.m23587b(view, "v");
        mo74231a(view);
    }

    public C28956m(C28933a aVar) {
        ViewGroup viewGroup;
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
        this.f76304c = aVar;
        C28967f fVar = this.f76304c.f76270a;
        if (fVar != null) {
            this.f76305g = (C28970i) fVar;
            C28970i iVar = this.f76305g;
            ViewGroup viewGroup2 = null;
            if (iVar != null) {
                viewGroup = iVar.mo71376b();
            } else {
                viewGroup = null;
            }
            this.f76302a = viewGroup;
            C28970i iVar2 = this.f76305g;
            if (iVar2 != null) {
                viewGroup2 = iVar2.mo71375a();
            }
            this.f76303b = viewGroup2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsDialog");
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        Context context;
        Context context2;
        C7573i.m23587b(view, "v");
        ViewGroup viewGroup = this.f76302a;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            int i = ((MarginLayoutParams) layoutParams).topMargin;
            ViewGroup viewGroup2 = this.f76303b;
            if (viewGroup2 != null) {
                layoutParams2 = viewGroup2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = i;
                ViewGroup viewGroup3 = this.f76303b;
                if (viewGroup3 != null) {
                    viewGroup3.setLayoutParams(marginLayoutParams);
                }
                ViewGroup viewGroup4 = this.f76303b;
                if (viewGroup4 != null && viewGroup4.getChildCount() == 0) {
                    C28970i iVar = this.f76305g;
                    if (iVar != null) {
                        context = iVar.getContext();
                    } else {
                        context = null;
                    }
                    C28986g gVar = new C28986g(context);
                    gVar.mo74274a(new C28969h(new C28985f(0, 0), new C28935a(this.f76304c)));
                    ViewGroup viewGroup5 = this.f76303b;
                    if (viewGroup5 != null) {
                        viewGroup5.addView(gVar);
                    }
                    for (C28965d dVar : this.f76304c.mo74229c()) {
                        C28970i iVar2 = this.f76305g;
                        if (iVar2 != null) {
                            context2 = iVar2.getContext();
                        } else {
                            context2 = null;
                        }
                        C28978b bVar = new C28978b(context2);
                        bVar.mo74262a(dVar.f76316a, dVar.f76317b);
                        ViewGroup viewGroup6 = this.f76303b;
                        if (viewGroup6 != null) {
                            viewGroup6.addView(bVar);
                        }
                    }
                }
                ViewGroup viewGroup7 = this.f76303b;
                if (viewGroup7 != null) {
                    ViewGroup viewGroup8 = this.f76303b;
                    if (viewGroup8 == null) {
                        C7573i.m23580a();
                    }
                    viewGroup7.measure(MeasureSpec.makeMeasureSpec(viewGroup8.getWidth(), Integer.MIN_VALUE), 0);
                }
                m95194a();
                m95195b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
