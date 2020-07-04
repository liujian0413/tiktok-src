package com.p280ss.android.ugc.aweme.setting.p337ui;

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

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem */
public final class ExpandSettingItem extends SettingItem {

    /* renamed from: v */
    public static final C37776a f98430v = new C37776a(null);

    /* renamed from: q */
    public View f98431q;

    /* renamed from: r */
    public View f98432r;

    /* renamed from: s */
    public int f98433s;

    /* renamed from: t */
    public boolean f98434t;

    /* renamed from: u */
    public OnClickListener f98435u;

    /* renamed from: w */
    private ValueAnimator f98436w;

    /* renamed from: x */
    private C37777b f98437x;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$a */
    public static final class C37776a {
        private C37776a() {
        }

        public /* synthetic */ C37776a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$b */
    public interface C37777b {
        /* renamed from: a */
        void mo90485a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$c */
    static final class C37778c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ExpandSettingItem f98438a;

        C37778c(ExpandSettingItem expandSettingItem) {
            this.f98438a = expandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f98438a.f98431q;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setAlpha(floatValue);
                View view2 = this.f98438a.f98432r;
                if (view2 != null) {
                    view2.setAlpha(1.0f - floatValue);
                }
                View view3 = this.f98438a.f98431q;
                if (view3 == null) {
                    C7573i.m23580a();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f98438a.f98433s));
                View view4 = this.f98438a.f98431q;
                if (view4 == null) {
                    C7573i.m23580a();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$d */
    static final class C37779d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ExpandSettingItem f98439a;

        C37779d(ExpandSettingItem expandSettingItem) {
            this.f98439a = expandSettingItem;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f98439a.f98431q;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setAlpha(floatValue);
                View view2 = this.f98439a.f98432r;
                if (view2 != null) {
                    view2.setAlpha(1.0f - floatValue);
                }
                View view3 = this.f98439a.f98431q;
                if (view3 == null) {
                    C7573i.m23580a();
                }
                view3.getLayoutParams().height = (int) (floatValue * ((float) this.f98439a.f98433s));
                View view4 = this.f98439a.f98431q;
                if (view4 == null) {
                    C7573i.m23580a();
                }
                view4.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$e */
    public static final class C37780e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ExpandSettingItem f98440a;

        C37780e(ExpandSettingItem expandSettingItem) {
            this.f98440a = expandSettingItem;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            View view = this.f98440a.f98431q;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem$f */
    static final class C37781f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExpandSettingItem f98441a;

        C37781f(ExpandSettingItem expandSettingItem) {
            this.f98441a = expandSettingItem;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f98441a.f98435u;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f98441a.f98434t) {
                this.f98441a.mo95154a(true);
            } else {
                this.f98441a.mo95152a();
            }
        }
    }

    public ExpandSettingItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public ExpandSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo95152a() {
        Context context;
        if (!this.f98434t) {
            ValueAnimator valueAnimator = this.f98436w;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.f98436w = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator2 = this.f98436w;
                if (valueAnimator2 == null) {
                    C7573i.m23580a();
                }
                valueAnimator2.setDuration(300);
                View view = this.f98431q;
                if (view == null) {
                    C7573i.m23580a();
                }
                int i = 0;
                view.setVisibility(0);
                View view2 = this.f98431q;
                if (view2 != null) {
                    View view3 = this.f29169f;
                    if (view3 != null) {
                        context = view3.getContext();
                    } else {
                        context = null;
                    }
                    view2.measure(MeasureSpec.makeMeasureSpec(C9738o.m28691a(context), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
                }
                View view4 = this.f98431q;
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                this.f98433s = i;
                this.f29164b.animate().rotation(180.0f).setDuration(100).start();
                ValueAnimator valueAnimator3 = this.f98436w;
                if (valueAnimator3 == null) {
                    C7573i.m23580a();
                }
                valueAnimator3.addUpdateListener(new C37778c(this));
                ValueAnimator valueAnimator4 = this.f98436w;
                if (valueAnimator4 == null) {
                    C7573i.m23580a();
                }
                valueAnimator4.start();
                this.f98434t = true;
                C37777b bVar = this.f98437x;
                if (bVar != null) {
                    bVar.mo90485a(true);
                }
            }
        }
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f98435u = onClickListener;
    }

    public final void setOnExpandListener(C37777b bVar) {
        C7573i.m23587b(bVar, "onExpandListener");
        this.f98437x = bVar;
    }

    /* renamed from: a */
    public final void mo95154a(boolean z) {
        int i;
        if (this.f98434t) {
            ValueAnimator valueAnimator = this.f98436w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            if (!z) {
                View view = this.f98432r;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                ImageView imageView = this.f29164b;
                C7573i.m23582a((Object) imageView, "ivRightIcon");
                imageView.setRotation(0.0f);
                View view2 = this.f98431q;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.f98434t = false;
                return;
            }
            View view3 = this.f98431q;
            if (view3 != null) {
                i = view3.getMeasuredHeight();
            } else {
                i = 0;
            }
            this.f98433s = i;
            this.f98436w = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ValueAnimator valueAnimator2 = this.f98436w;
            if (valueAnimator2 == null) {
                C7573i.m23580a();
            }
            valueAnimator2.setDuration(300);
            this.f29164b.animate().rotation(0.0f).setDuration(100).start();
            ValueAnimator valueAnimator3 = this.f98436w;
            if (valueAnimator3 == null) {
                C7573i.m23580a();
            }
            valueAnimator3.addUpdateListener(new C37779d(this));
            ValueAnimator valueAnimator4 = this.f98436w;
            if (valueAnimator4 == null) {
                C7573i.m23580a();
            }
            valueAnimator4.addListener(new C37780e(this));
            ValueAnimator valueAnimator5 = this.f98436w;
            if (valueAnimator5 == null) {
                C7573i.m23580a();
            }
            valueAnimator5.start();
            this.f98434t = false;
            C37777b bVar = this.f98437x;
            if (bVar != null) {
                bVar.mo90485a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo95153a(View view, View view2) {
        boolean z;
        float f;
        this.f98431q = view;
        this.f98432r = view2;
        View view3 = this.f98431q;
        if (view3 == null || view3.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f98434t = z;
        ImageView imageView = this.f29164b;
        C7573i.m23582a((Object) imageView, "ivRightIcon");
        if (this.f98434t) {
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
        frameLayout.getLayoutParams().width = -2;
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
        super.setOnClickListener(new C37781f(this));
    }

    public ExpandSettingItem(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ ExpandSettingItem(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
