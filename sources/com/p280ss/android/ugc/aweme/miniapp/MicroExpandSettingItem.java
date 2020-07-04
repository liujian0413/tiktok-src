package com.p280ss.android.ugc.aweme.miniapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem */
public final class MicroExpandSettingItem extends SettingItem {

    /* renamed from: q */
    public View f86932q;

    /* renamed from: r */
    public View f86933r;

    /* renamed from: s */
    public int f86934s;

    /* renamed from: t */
    public boolean f86935t;

    /* renamed from: u */
    public OnClickListener f86936u;

    /* renamed from: v */
    public OnClickListener f86937v;

    /* renamed from: w */
    private final long f86938w;

    /* renamed from: x */
    private final long f86939x;

    /* renamed from: y */
    private ValueAnimator f86940y;

    /* renamed from: z */
    private C33285a f86941z;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$a */
    public interface C33285a {
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$b */
    static final class C33286b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MicroExpandSettingItem f86942a;

        C33286b(MicroExpandSettingItem microExpandSettingItem) {
            this.f86942a = microExpandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f86942a.f86932q;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setAlpha(floatValue);
                View view2 = this.f86942a.f86933r;
                if (view2 == null) {
                    C7573i.m23580a();
                }
                view2.setAlpha(1.0f - floatValue);
                View view3 = this.f86942a.f86932q;
                if (view3 == null) {
                    C7573i.m23580a();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f86942a.f86934s));
                View view4 = this.f86942a.f86932q;
                if (view4 == null) {
                    C7573i.m23580a();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$c */
    static final class C33287c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MicroExpandSettingItem f86943a;

        C33287c(MicroExpandSettingItem microExpandSettingItem) {
            this.f86943a = microExpandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f86943a.f86932q;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setAlpha(floatValue);
                View view2 = this.f86943a.f86933r;
                if (view2 == null) {
                    C7573i.m23580a();
                }
                view2.setAlpha(1.0f - floatValue);
                View view3 = this.f86943a.f86932q;
                if (view3 == null) {
                    C7573i.m23580a();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f86943a.f86934s));
                View view4 = this.f86943a.f86932q;
                if (view4 == null) {
                    C7573i.m23580a();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$d */
    public static final class C33288d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ MicroExpandSettingItem f86944a;

        C33288d(MicroExpandSettingItem microExpandSettingItem) {
            this.f86944a = microExpandSettingItem;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            View view = this.f86944a.f86932q;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$e */
    static final class C33289e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroExpandSettingItem f86945a;

        C33289e(MicroExpandSettingItem microExpandSettingItem) {
            this.f86945a = microExpandSettingItem;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f86945a.f86937v;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f86945a.f86935t) {
                this.f86945a.mo85396a(true);
            } else {
                this.f86945a.mo85394a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem$f */
    static final class C33290f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroExpandSettingItem f86946a;

        C33290f(MicroExpandSettingItem microExpandSettingItem) {
            this.f86946a = microExpandSettingItem;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f86946a.f86936u;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MicroExpandSettingItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public MicroExpandSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo85394a() {
        Context context;
        if (!this.f86935t) {
            ValueAnimator valueAnimator = this.f86940y;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.f86940y = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator2 = this.f86940y;
                if (valueAnimator2 == null) {
                    C7573i.m23580a();
                }
                valueAnimator2.setDuration(this.f86938w);
                View view = this.f86932q;
                if (view == null) {
                    C7573i.m23580a();
                }
                int i = 0;
                view.setVisibility(0);
                View view2 = this.f86932q;
                if (view2 != null) {
                    View view3 = this.f29169f;
                    if (view3 != null) {
                        context = view3.getContext();
                    } else {
                        context = null;
                    }
                    view2.measure(MeasureSpec.makeMeasureSpec(C9738o.m28691a(context), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
                }
                View view4 = this.f86932q;
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                this.f86934s = i;
                this.f29164b.animate().rotation(180.0f).setDuration(this.f86939x).start();
                ValueAnimator valueAnimator3 = this.f86940y;
                if (valueAnimator3 == null) {
                    C7573i.m23580a();
                }
                valueAnimator3.addUpdateListener(new C33286b(this));
                ValueAnimator valueAnimator4 = this.f86940y;
                if (valueAnimator4 == null) {
                    C7573i.m23580a();
                }
                valueAnimator4.start();
                this.f86935t = true;
            }
        }
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f86936u = onClickListener;
    }

    public final void setRightIconClickListener(OnClickListener onClickListener) {
        this.f86937v = onClickListener;
    }

    public final void setOnExpandListener(C33285a aVar) {
        C7573i.m23587b(aVar, "onExpandListener");
        this.f86941z = aVar;
    }

    /* renamed from: a */
    public final void mo85396a(boolean z) {
        int i;
        if (this.f86935t) {
            ValueAnimator valueAnimator = this.f86940y;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                View view = this.f86932q;
                if (view != null) {
                    i = view.getMeasuredHeight();
                } else {
                    i = 0;
                }
                this.f86934s = i;
                this.f86940y = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ValueAnimator valueAnimator2 = this.f86940y;
                if (valueAnimator2 == null) {
                    C7573i.m23580a();
                }
                valueAnimator2.setDuration(this.f86938w);
                this.f29164b.animate().rotation(0.0f).setDuration(this.f86939x).start();
                ValueAnimator valueAnimator3 = this.f86940y;
                if (valueAnimator3 == null) {
                    C7573i.m23580a();
                }
                valueAnimator3.addUpdateListener(new C33287c(this));
                ValueAnimator valueAnimator4 = this.f86940y;
                if (valueAnimator4 == null) {
                    C7573i.m23580a();
                }
                valueAnimator4.addListener(new C33288d(this));
                ValueAnimator valueAnimator5 = this.f86940y;
                if (valueAnimator5 == null) {
                    C7573i.m23580a();
                }
                valueAnimator5.start();
                this.f86935t = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo85395a(View view, View view2) {
        boolean z;
        float f;
        this.f86932q = view;
        this.f86933r = view2;
        View view3 = this.f86932q;
        if (view3 == null || view3.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f86935t = z;
        ImageView imageView = this.f29164b;
        C7573i.m23582a((Object) imageView, "ivRightIcon");
        if (this.f86935t) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        imageView.setRotation(f);
    }

    /* renamed from: a */
    public final void mo26012a(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super.mo26012a(context, attributeSet);
        FrameLayout frameLayout = this.f29163a;
        C7573i.m23582a((Object) frameLayout, "rightLayout");
        frameLayout.getLayoutParams().width = (int) C9738o.m28708b(context, 40.0f);
        this.f29163a.requestLayout();
        ImageView imageView = this.f29164b;
        C7573i.m23582a((Object) imageView, "ivRightIcon");
        imageView.getLayoutParams().height = (int) C9738o.m28708b(context, 10.0f);
        ImageView imageView2 = this.f29164b;
        C7573i.m23582a((Object) imageView2, "ivRightIcon");
        LayoutParams layoutParams = imageView2.getLayoutParams();
        ImageView imageView3 = this.f29164b;
        C7573i.m23582a((Object) imageView3, "ivRightIcon");
        layoutParams.width = imageView3.getLayoutParams().height;
        this.f29164b.setImageResource(R.drawable.ao7);
        this.f29163a.setOnClickListener(new C33289e(this));
        super.setOnClickListener(new C33290f(this));
    }

    public MicroExpandSettingItem(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f86938w = 300;
        this.f86939x = 100;
    }

    public /* synthetic */ MicroExpandSettingItem(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
