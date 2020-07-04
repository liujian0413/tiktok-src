package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout */
public final class AdDislikeLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f66264a;

    /* renamed from: b */
    private final float f66265b;

    /* renamed from: c */
    private int f66266c;

    /* renamed from: d */
    private int f66267d;

    /* renamed from: e */
    private int f66268e;

    /* renamed from: f */
    private C25109a f66269f;

    /* renamed from: g */
    private C25110b f66270g;

    /* renamed from: h */
    private int f66271h;

    /* renamed from: i */
    private HashMap f66272i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$a */
    public interface C25109a {
        /* renamed from: a */
        void mo65640a();

        /* renamed from: b */
        void mo65641b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b */
    public interface C25110b {
        /* renamed from: e */
        void mo65642e();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$c */
    public static final class C25111c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AdDislikeLayout f66277a;

        C25111c(AdDislikeLayout adDislikeLayout) {
            this.f66277a = adDislikeLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            LinearLayout linearLayout = (LinearLayout) this.f66277a.mo65625a(R.id.djq);
            C7573i.m23582a((Object) linearLayout, "titleAndOptions");
            linearLayout.setVisibility(8);
            View a = this.f66277a.mo65625a(R.id.alp);
            C7573i.m23582a((Object) a, "flDislikeBg");
            a.setVisibility(8);
            C25109a iDislike = this.f66277a.getIDislike();
            if (iDislike != null) {
                iDislike.mo65640a();
            }
            super.onAnimationEnd(animator);
        }
    }

    public AdDislikeLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdDislikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo65625a(int i) {
        if (this.f66272i == null) {
            this.f66272i = new HashMap();
        }
        View view = (View) this.f66272i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66272i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C25109a getIDislike() {
        return this.f66269f;
    }

    public final C25110b getIDislikeClick() {
        return this.f66270g;
    }

    public final int getLastY() {
        return this.f66271h;
    }

    /* renamed from: a */
    public final void mo65626a() {
        C10761a.m31400c(getContext(), (int) R.string.e3, 0).mo25750a();
    }

    /* renamed from: c */
    public final void mo65628c() {
        ObjectAnimator objectAnimator;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo65625a(R.id.alp), "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "fadeInBg");
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat2, "fadeInContent");
        ofFloat2.setDuration(200);
        if (this.f66264a) {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "translationY", new float[]{0.0f, this.f66265b});
            C7573i.m23582a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
        } else {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "translationY", new float[]{this.f66265b, 0.0f});
            C7573i.m23582a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
        }
        ObjectAnimator duration = objectAnimator.setDuration(250);
        C7573i.m23582a((Object) duration, "jumpContent.setDuration(…_CONTENT_DURATION_MEDIUM)");
        duration.setInterpolator(new C10743b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new C25111c(this));
    }

    /* renamed from: b */
    public final void mo65627b() {
        ObjectAnimator objectAnimator;
        LinearLayout linearLayout = (LinearLayout) mo65625a(R.id.djq);
        C7573i.m23582a((Object) linearLayout, "titleAndOptions");
        LayoutParams layoutParams = new LayoutParams(linearLayout.getLayoutParams());
        int i = this.f66271h - this.f66268e;
        if (i < this.f66266c) {
            i = this.f66271h;
            this.f66264a = false;
        } else {
            if (i > this.f66267d - this.f66268e) {
                i = this.f66267d - this.f66268e;
            }
            this.f66264a = true;
        }
        layoutParams.setMargins(0, i, 0, 0);
        LinearLayout linearLayout2 = (LinearLayout) mo65625a(R.id.djq);
        C7573i.m23582a((Object) linearLayout2, "titleAndOptions");
        linearLayout2.setLayoutParams(layoutParams);
        LinearLayout linearLayout3 = (LinearLayout) mo65625a(R.id.c99);
        C7573i.m23582a((Object) linearLayout3, "option");
        linearLayout3.setVisibility(0);
        LinearLayout linearLayout4 = (LinearLayout) mo65625a(R.id.djq);
        C7573i.m23582a((Object) linearLayout4, "titleAndOptions");
        linearLayout4.setVisibility(0);
        View a = mo65625a(R.id.alp);
        C7573i.m23582a((Object) a, "flDislikeBg");
        a.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo65625a(R.id.alp), "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "fadeInBg");
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "fadeInContent");
        ofFloat2.setDuration(300);
        if (this.f66264a) {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "translationY", new float[]{this.f66265b, 0.0f});
            C7573i.m23582a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
        } else {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo65625a(R.id.djq), "translationY", new float[]{0.0f, this.f66265b});
            C7573i.m23582a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
        }
        ObjectAnimator duration = objectAnimator.setDuration(300);
        C7573i.m23582a((Object) duration, "jumpContent.setDuration(…IN_CONTENT_DURATION_LONG)");
        duration.setInterpolator(new OvershootInterpolator(1.04f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(objectAnimator).with(ofFloat2);
        animatorSet.start();
        C25109a aVar = this.f66269f;
        if (aVar != null) {
            aVar.mo65641b();
        }
    }

    public final void setIDislike(C25109a aVar) {
        this.f66269f = aVar;
    }

    public final void setIDislikeClick(C25110b bVar) {
        this.f66270g = bVar;
    }

    public final void setLastY(int i) {
        this.f66271h = i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent != null) {
            i = (int) motionEvent.getY();
        } else {
            i = 0;
        }
        this.f66271h = i;
        return super.onTouchEvent(motionEvent);
    }

    public AdDislikeLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Resources resources;
        int i3;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f66264a = true;
        this.f66265b = (float) C23486n.m77122a(70.0d);
        this.f66266c = C23486n.m77122a(60.0d);
        Resources resources2 = context.getResources();
        C7573i.m23582a((Object) resources2, "context.resources");
        this.f66267d = resources2.getDisplayMetrics().heightPixels - this.f66266c;
        if (C6399b.m19944t()) {
            i2 = 230;
        } else {
            i2 = 210;
        }
        this.f66268e = C23486n.m77122a((double) i2);
        LayoutInflater.from(context).inflate(R.layout.fk, this, true);
        mo65625a(R.id.alp).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f66273a;

            {
                this.f66273a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f66273a.mo65628c();
            }
        });
        ((TextView) mo65625a(R.id.a9e)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f66274a;

            {
                this.f66274a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f66274a.mo65628c();
                C25110b iDislikeClick = this.f66274a.getIDislikeClick();
                if (iDislikeClick != null) {
                    iDislikeClick.mo65642e();
                }
            }
        });
        ((TextView) mo65625a(R.id.a9e)).setOnTouchListener(new C25150b());
        ((TextView) mo65625a(R.id.cy4)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f66275a;

            {
                this.f66275a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f66275a.mo65628c();
                this.f66275a.mo65626a();
            }
        });
        ((TextView) mo65625a(R.id.cy4)).setOnTouchListener(new C25150b());
        ((TextView) mo65625a(R.id.y0)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f66276a;

            {
                this.f66276a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f66276a.mo65628c();
                this.f66276a.mo65626a();
            }
        });
        ((TextView) mo65625a(R.id.y0)).setOnTouchListener(new C25150b());
        TextView textView = (TextView) mo65625a(R.id.y0);
        if (C6399b.m19946v()) {
            resources = getResources();
            i3 = R.drawable.ayh;
        } else {
            resources = getResources();
            i3 = R.drawable.ay_;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(null, resources.getDrawable(i3), null, null);
    }

    public /* synthetic */ AdDislikeLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
