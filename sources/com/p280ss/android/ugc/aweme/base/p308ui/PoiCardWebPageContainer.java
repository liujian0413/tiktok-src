package com.p280ss.android.ugc.aweme.base.p308ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25548b;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25571p;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41544aw;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer */
public class PoiCardWebPageContainer extends FrameLayout {

    /* renamed from: g */
    private static final int f61762g = 2131300510;

    /* renamed from: a */
    private boolean f61763a;

    /* renamed from: b */
    private View[] f61764b;

    /* renamed from: c */
    private Aweme f61765c;

    /* renamed from: d */
    private C0608j f61766d;

    /* renamed from: e */
    private Fragment f61767e;

    /* renamed from: f */
    private boolean f61768f;

    private Fragment getFragment() {
        return this.f61766d.mo2642a(f61762g);
    }

    /* renamed from: a */
    public final void mo60983a() {
        if (this.f61765c != null) {
            C6903bc.m21496o().mo88910a(getContext(), this.f61765c);
        }
    }

    /* renamed from: b */
    public final void mo60988b() {
        C42961az.m136383d(this);
        this.f61763a = false;
        this.f61768f = false;
        if (this.f61766d == null || getFragment() == null) {
            removeAllViews();
            return;
        }
        C0633q a = this.f61766d.mo2645a();
        a.mo2587a(getFragment());
        a.mo2606d();
        if (this.f61766d.mo2657e() > 0 && !this.f61766d.mo2660h()) {
            this.f61766d.mo2655c();
        }
        removeAllViews();
    }

    /* renamed from: c */
    private void m76855c() {
        C6907h.m21524a("poi_ad_show", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_hot").mo59973a("group_id", this.f61765c.getAid()).mo59973a("author_id", this.f61765c.getAuthorUid()).mo59973a("poi_id", this.f61765c.getPoiStruct().poiId).mo59970a("poi_label_type", this.f61765c.getPoiStruct().getPoiSubTitleType()).f60753a);
    }

    public PoiCardWebPageContainer(Context context) {
        this(context, null);
    }

    @C7709l
    public void onEvent(C25548b bVar) {
        if (bVar.f67299a != 1) {
            this.f61763a = false;
        } else {
            this.f61763a = true;
        }
    }

    /* renamed from: a */
    public final void mo60984a(long j) {
        if (getTranslationX() < 0.0f || j == 0) {
            if (this.f61764b != null) {
                for (View translationX : this.f61764b) {
                    translationX.setTranslationX(0.0f);
                }
            }
            setTranslationX(C9738o.m28708b(getContext(), (float) (-(getWidth() + ((MarginLayoutParams) getLayoutParams()).leftMargin))));
            setAlpha(0.0f);
            mo60988b();
            return;
        }
        m76854a(j, getTranslationX(), C9738o.m28708b(getContext(), (float) (-(getWidth() + ((MarginLayoutParams) getLayoutParams()).leftMargin))), 0.0f, 0.0f, new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                PoiCardWebPageContainer.this.mo60988b();
            }

            public final void onAnimationEnd(Animator animator) {
                PoiCardWebPageContainer.this.mo60988b();
            }
        });
        animate().alpha(0.0f).setDuration(j).start();
        mo60987a(false, this.f61764b);
    }

    /* renamed from: b */
    public final void mo60989b(long j) {
        if (this.f61763a) {
            this.f61768f = true;
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            layoutParams.height = (int) C9738o.m28708b(getContext(), 130.0f);
            setLayoutParams(layoutParams);
            if (C32891b.m106468a().f85831a) {
                setAlpha(0.0f);
                setTranslationX(0.0f);
            } else {
                m76854a(400, C9738o.m28708b(getContext(), (float) (-(getWidth() + ((MarginLayoutParams) getLayoutParams()).leftMargin))), 0.0f, 0.0f, 0.0f, new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        PoiCardWebPageContainer.this.mo60986a(C32891b.m106468a().f85831a);
                    }
                });
                animate().alpha(1.0f).setDuration(400).start();
            }
            m76855c();
        }
    }

    /* renamed from: a */
    public final void mo60986a(boolean z) {
        if (this.f61768f) {
            if (z) {
                C41540at.m132301a(this, getAlpha(), 0.0f);
            } else {
                C41540at.m132301a(this, getAlpha(), 1.0f);
            }
        }
    }

    public PoiCardWebPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo60987a(boolean z, View... viewArr) {
        if (viewArr != null && viewArr.length != 0 && this.f61763a) {
            this.f61764b = viewArr;
            int i = 0;
            if (z) {
                int length = viewArr.length;
                while (i < length) {
                    View view = viewArr[i];
                    C41544aw.m132306a(view, 0.0f, (float) C41544aw.m132305a(getContext(), view), 400);
                    i++;
                }
                return;
            }
            int length2 = viewArr.length;
            while (i < length2) {
                View view2 = viewArr[i];
                C41544aw.m132306a(view2, view2.getTranslationX(), 0.0f, 400);
                i++;
            }
        }
    }

    public PoiCardWebPageContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo60985a(String str, Aweme aweme, C0608j jVar) {
        this.f61765c = aweme;
        this.f61766d = jVar;
        C42961az.m136382c(this);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("bundle_forbidden_jump", true);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        this.f61767e = C6903bc.m21496o().mo88906a(bundle, (C25571p) new C25571p() {
            /* renamed from: a */
            public final void mo60991a() {
                PoiCardWebPageContainer.this.mo60983a();
            }

            /* renamed from: b */
            public final void mo60992b() {
                PoiCardWebPageContainer.this.mo60984a(400);
            }
        });
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(f61762g);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        C0633q a = jVar.mo2645a();
        a.mo2585a(f61762g, this.f61767e);
        a.mo2610f();
    }

    /* renamed from: a */
    private void m76854a(long j, float f, float f2, float f3, float f4, AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{f, f2});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }
}
