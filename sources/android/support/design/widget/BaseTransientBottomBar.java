package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.R$styleable;
import android.support.design.internal.C0296b;
import android.support.design.p015a.C0234a;
import android.support.design.p021g.C0277a;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.design.widget.SwipeDismissBehavior.C0366a;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0942b;
import android.support.p022v4.view.p028a.C0942b.C0943a;
import android.support.p022v4.view.p028a.C0945c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f1293a = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((BaseTransientBottomBar) message.obj).mo1288e();
                    return true;
                case 1:
                    ((BaseTransientBottomBar) message.obj).mo1283c(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });

    /* renamed from: b */
    public static final boolean f1294b;

    /* renamed from: h */
    private static final int[] f1295h = {R.attr.a2e};

    /* renamed from: c */
    public final Context f1296c;

    /* renamed from: d */
    public final C0334d f1297d;

    /* renamed from: e */
    public final C0277a f1298e;

    /* renamed from: f */
    public Behavior f1299f;

    /* renamed from: g */
    final C0406a f1300g = new C0406a() {
        /* renamed from: a */
        public final void mo1300a() {
            Handler handler = BaseTransientBottomBar.f1293a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void dismiss(int i) {
            Handler handler = BaseTransientBottomBar.f1293a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: i */
    private final ViewGroup f1301i;

    /* renamed from: j */
    private int f1302j;

    /* renamed from: k */
    private List<Object<B>> f1303k;

    /* renamed from: l */
    private final AccessibilityManager f1304l;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g */
        private final C0331a f1320g = new C0331a(this);

        /* renamed from: a */
        public final void mo1307a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1320g.mo1310a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public final boolean mo1308a(View view) {
            return C0331a.m1350a(view);
        }

        /* renamed from: b */
        public final boolean mo1309b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f1320g.mo1311a(coordinatorLayout, view, motionEvent);
            return super.mo1309b(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$a */
    public static class C0331a {

        /* renamed from: a */
        private C0406a f1321a;

        /* renamed from: a */
        public static boolean m1350a(View view) {
            return view instanceof C0334d;
        }

        /* renamed from: a */
        public final void mo1310a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1321a = baseTransientBottomBar.f1300g;
        }

        public C0331a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo1576a(0.1f);
            swipeDismissBehavior.mo1577b(0.6f);
        }

        /* renamed from: a */
        public final void mo1311a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.mo1398a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0404l.m1817a().mo1863c(this.f1321a);
                            return;
                        }
                        break;
                    case 1:
                        break;
                }
            }
            C0404l.m1817a().mo1864d(this.f1321a);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$b */
    protected interface C0332b {
        /* renamed from: a */
        void mo1304a(View view);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$c */
    protected interface C0333c {
        /* renamed from: a */
        void mo1306a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$d */
    public static class C0334d extends FrameLayout {

        /* renamed from: a */
        private final AccessibilityManager f1322a;

        /* renamed from: b */
        private final C0943a f1323b;

        /* renamed from: c */
        private C0333c f1324c;

        /* renamed from: d */
        private C0332b f1325d;

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0991u.m4243v(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f1325d != null) {
                this.f1325d.mo1304a(this);
            }
            C0942b.m3981b(this.f1322a, this.f1323b);
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(C0332b bVar) {
            this.f1325d = bVar;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(C0333c cVar) {
            this.f1324c = cVar;
        }

        protected C0334d(Context context) {
            this(context, null);
        }

        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        protected C0334d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(1)) {
                C0991u.m4230k((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            this.f1322a = (AccessibilityManager) context.getSystemService("accessibility");
            this.f1323b = new C0943a() {
                /* renamed from: a */
                public final void mo1318a(boolean z) {
                    C0334d.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            C0942b.m3980a(this.f1322a, this.f1323b);
            setClickableOrFocusableBasedOnAccessibility(this.f1322a.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1324c != null) {
                this.f1324c.mo1306a(this, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public int mo1279a() {
        return this.f1302j;
    }

    /* renamed from: k */
    private static SwipeDismissBehavior<? extends View> m1325k() {
        return new Behavior();
    }

    public void dismiss() {
        mo1282b(3);
    }

    /* renamed from: i */
    private int m1323i() {
        if (m1324j()) {
            return R.layout.adz;
        }
        return R.layout.jb;
    }

    /* renamed from: b */
    public void mo1281b() {
        C0404l.m1817a().mo1859a(mo1279a(), this.f1300g);
    }

    /* renamed from: c */
    public boolean mo1284c() {
        return C0404l.m1817a().mo1866e(this.f1300g);
    }

    /* renamed from: d */
    public final boolean mo1286d() {
        return C0404l.m1817a().mo1867f(this.f1300g);
    }

    /* renamed from: j */
    private boolean m1324j() {
        TypedArray obtainStyledAttributes = this.f1296c.obtainStyledAttributes(f1295h);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private int m1326l() {
        int height = this.f1297d.getHeight();
        LayoutParams layoutParams = this.f1297d.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            return height + ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo1290g() {
        C0404l.m1817a().mo1862b(this.f1300g);
        if (this.f1303k != null) {
            for (int size = this.f1303k.size() - 1; size >= 0; size--) {
                this.f1303k.get(size);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo1291h() {
        List enabledAccessibilityServiceList = this.f1304l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 19) {
            z = false;
        } else {
            z = true;
        }
        f1294b = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo1288e() {
        SwipeDismissBehavior swipeDismissBehavior;
        if (this.f1297d.getParent() == null) {
            LayoutParams layoutParams = this.f1297d.getLayoutParams();
            if (layoutParams instanceof C0355d) {
                C0355d dVar = (C0355d) layoutParams;
                if (this.f1299f == null) {
                    swipeDismissBehavior = m1325k();
                } else {
                    swipeDismissBehavior = this.f1299f;
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).mo1307a(this);
                }
                swipeDismissBehavior.f1495b = new C0366a() {
                    /* renamed from: a */
                    public final void mo1303a(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.mo1282b(0);
                    }

                    /* renamed from: a */
                    public final void mo1302a(int i) {
                        switch (i) {
                            case 0:
                                C0404l.m1817a().mo1864d(BaseTransientBottomBar.this.f1300g);
                                break;
                            case 1:
                            case 2:
                                C0404l.m1817a().mo1863c(BaseTransientBottomBar.this.f1300g);
                                return;
                        }
                    }
                };
                dVar.mo1454a((android.support.design.widget.CoordinatorLayout.Behavior) swipeDismissBehavior);
                dVar.f1413g = 80;
            }
            this.f1301i.addView(this.f1297d);
        }
        this.f1297d.setOnAttachStateChangeListener(new C0332b() {
            /* renamed from: a */
            public final void mo1304a(View view) {
                if (BaseTransientBottomBar.this.mo1286d()) {
                    BaseTransientBottomBar.f1293a.post(new Runnable() {
                        public final void run() {
                            BaseTransientBottomBar.this.mo1285d(3);
                        }
                    });
                }
            }
        });
        if (!C0991u.m4167D(this.f1297d)) {
            this.f1297d.setOnLayoutChangeListener(new C0333c() {
                /* renamed from: a */
                public final void mo1306a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.f1297d.setOnLayoutChangeListener(null);
                    if (BaseTransientBottomBar.this.mo1291h()) {
                        BaseTransientBottomBar.this.mo1289f();
                    } else {
                        BaseTransientBottomBar.this.mo1290g();
                    }
                }
            });
        } else if (mo1291h()) {
            mo1289f();
        } else {
            mo1290g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo1289f() {
        final int l = m1326l();
        if (f1294b) {
            C0991u.m4222h((View) this.f1297d, l);
        } else {
            this.f1297d.setTranslationY((float) l);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{l, 0});
        valueAnimator.setInterpolator(C0234a.f873b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo1290g();
            }

            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f1298e.mo1055a(70, NormalGiftView.ALPHA_180);
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

            /* renamed from: c */
            private int f1308c = l;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f1294b) {
                    C0991u.m4222h((View) BaseTransientBottomBar.this.f1297d, intValue - this.f1308c);
                } else {
                    BaseTransientBottomBar.this.f1297d.setTranslationY((float) intValue);
                }
                this.f1308c = intValue;
            }
        });
        valueAnimator.start();
    }

    /* renamed from: a */
    public final B mo1280a(int i) {
        this.f1302j = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1282b(int i) {
        C0404l.m1817a().dismiss(this.f1300g, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1283c(int i) {
        if (!mo1291h() || this.f1297d.getVisibility() != 0) {
            mo1285d(i);
        } else {
            m1322e(i);
        }
    }

    /* renamed from: e */
    private void m1322e(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m1326l()});
        valueAnimator.setInterpolator(C0234a.f873b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo1285d(i);
            }

            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f1298e.mo1056b(0, NormalGiftView.ALPHA_180);
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

            /* renamed from: b */
            private int f1312b;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f1294b) {
                    C0991u.m4222h((View) BaseTransientBottomBar.this.f1297d, intValue - this.f1312b);
                } else {
                    BaseTransientBottomBar.this.f1297d.setTranslationY((float) intValue);
                }
                this.f1312b = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1285d(int i) {
        C0404l.m1817a().mo1860a(this.f1300g);
        if (this.f1303k != null) {
            for (int size = this.f1303k.size() - 1; size >= 0; size--) {
                this.f1303k.get(size);
            }
        }
        ViewParent parent = this.f1297d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1297d);
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C0277a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f1301i = viewGroup;
            this.f1298e = aVar;
            this.f1296c = viewGroup.getContext();
            C0296b.m1169a(this.f1296c);
            this.f1297d = (C0334d) LayoutInflater.from(this.f1296c).inflate(m1323i(), this.f1301i, false);
            this.f1297d.addView(view);
            C0991u.m4216f((View) this.f1297d, 1);
            C0991u.m4206c((View) this.f1297d, 1);
            C0991u.m4203b((View) this.f1297d, true);
            C0991u.m4188a((View) this.f1297d, (C0983o) new C0983o() {
                /* renamed from: a */
                public final C0954ab mo1183a(View view, C0954ab abVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), abVar.mo3721d());
                    return abVar;
                }
            });
            C0991u.m4187a((View) this.f1297d, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    cVar.mo3644a(1048576);
                    cVar.mo3693n(true);
                }

                /* renamed from: a */
                public final boolean mo1299a(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.mo1299a(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.dismiss();
                    return true;
                }
            });
            this.f1304l = (AccessibilityManager) this.f1296c.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }
}
