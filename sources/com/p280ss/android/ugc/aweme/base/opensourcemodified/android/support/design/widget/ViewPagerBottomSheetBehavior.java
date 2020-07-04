package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f61450a;

    /* renamed from: b */
    int f61451b;

    /* renamed from: c */
    int f61452c;

    /* renamed from: d */
    public boolean f61453d;

    /* renamed from: e */
    public boolean f61454e;

    /* renamed from: f */
    public int f61455f = 4;

    /* renamed from: g */
    C1060q f61456g;

    /* renamed from: h */
    int f61457h;

    /* renamed from: i */
    WeakReference<V> f61458i;

    /* renamed from: j */
    WeakReference<View> f61459j;

    /* renamed from: k */
    public C23369a f61460k;

    /* renamed from: l */
    int f61461l;

    /* renamed from: m */
    boolean f61462m;

    /* renamed from: n */
    private float f61463n;

    /* renamed from: o */
    private int f61464o;

    /* renamed from: p */
    private boolean f61465p;

    /* renamed from: q */
    private boolean f61466q;

    /* renamed from: r */
    private int f61467r;

    /* renamed from: s */
    private boolean f61468s;

    /* renamed from: t */
    private VelocityTracker f61469t;

    /* renamed from: u */
    private int f61470u;

    /* renamed from: v */
    private boolean f61471v;

    /* renamed from: w */
    private final C1063a f61472w = new C1063a() {
        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo60685c(1);
            }
        }

        /* renamed from: a */
        public final int mo1362a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f61453d) {
                return ViewPagerBottomSheetBehavior.this.f61457h - ViewPagerBottomSheetBehavior.this.f61451b;
            }
            return ViewPagerBottomSheetBehavior.this.f61452c - ViewPagerBottomSheetBehavior.this.f61451b;
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f61455f == 1 || ViewPagerBottomSheetBehavior.this.f61462m) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f61455f == 3 && ViewPagerBottomSheetBehavior.this.f61461l == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f61459j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f61458i == null || ViewPagerBottomSheetBehavior.this.f61458i.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int mo1368b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public final int mo1363a(View view, int i, int i2) {
            int i3;
            int i4 = ViewPagerBottomSheetBehavior.this.f61451b;
            if (ViewPagerBottomSheetBehavior.this.f61453d) {
                i3 = ViewPagerBottomSheetBehavior.this.f61457h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f61452c;
            }
            return C0534a.m2233a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f61451b;
            } else if (!ViewPagerBottomSheetBehavior.this.f61453d || !ViewPagerBottomSheetBehavior.this.mo60682a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f61451b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f61452c)) {
                        i = ViewPagerBottomSheetBehavior.this.f61451b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f61452c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f61452c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f61457h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f61456g.mo4155a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo60685c(2);
                C0991u.m4190a(view, (Runnable) new C23372c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo60685c(i3);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo60686d(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m76659a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m76657a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m76657a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m76659a(i);
            }

            /* renamed from: a */
            private static SavedState m76658a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m76658a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f61477a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f61477a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f61477a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f61477a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$a */
    public static abstract class C23369a {
        /* renamed from: a */
        public abstract void mo60691a(View view, float f);

        /* renamed from: a */
        public abstract void mo60692a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$b */
    static class C23370b extends SimpleOnPageChangeListener {

        /* renamed from: a */
        public final ViewPagerBottomSheetBehavior f61478a;

        /* renamed from: b */
        private final ViewPager f61479b;

        public final void onPageSelected(int i) {
            this.f61479b.post(new Runnable() {
                public final void run() {
                    if (C23370b.this.f61478a.f61458i != null) {
                        C23370b.this.f61478a.mo60678a();
                    }
                }
            });
        }

        private C23370b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f61479b = viewPager;
            this.f61478a = viewPagerBottomSheetBehavior;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$c */
    class C23372c implements Runnable {

        /* renamed from: b */
        private final View f61482b;

        /* renamed from: c */
        private final int f61483c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f61456g == null || !ViewPagerBottomSheetBehavior.this.f61456g.mo4158a(true)) {
                ViewPagerBottomSheetBehavior.this.mo60685c(this.f61483c);
            } else {
                C0991u.m4190a(this.f61482b, (Runnable) this);
            }
        }

        C23372c(View view, int i) {
            this.f61482b = view;
            this.f61483c = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1219a(android.support.design.widget.CoordinatorLayout r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            boolean r6 = r7.isShown()
            r0 = 0
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r6 = r8.getActionMasked()
            int r1 = r5.f61455f
            r2 = 1
            if (r1 != r2) goto L_0x0014
            if (r6 != 0) goto L_0x0014
            return r2
        L_0x0014:
            int r1 = r8.getAction()
            r3 = 2
            if (r1 == r3) goto L_0x0022
            int r1 = r8.getAction()
            r4 = 6
            if (r1 != r4) goto L_0x0038
        L_0x0022:
            android.support.v4.widget.q r1 = r5.f61456g
            int r1 = r1.f3675c
            int r1 = r8.findPointerIndex(r1)
            android.support.v4.widget.q r4 = r5.f61456g
            if (r4 == 0) goto L_0x0038
            android.support.v4.widget.q r4 = r5.f61456g
            int r4 = r4.f3673a
            if (r4 != r2) goto L_0x0038
            if (r1 >= 0) goto L_0x0038
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            android.support.v4.widget.q r4 = r5.f61456g
            if (r4 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            android.support.v4.widget.q r1 = r5.f61456g
            r1.mo4161b(r8)
        L_0x0044:
            if (r6 != 0) goto L_0x0049
            r5.m76629b()
        L_0x0049:
            android.view.VelocityTracker r1 = r5.f61469t
            if (r1 != 0) goto L_0x0053
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.f61469t = r1
        L_0x0053:
            android.view.VelocityTracker r1 = r5.f61469t
            r1.addMovement(r8)
            if (r6 != r3) goto L_0x0080
            boolean r6 = r5.f61466q
            if (r6 != 0) goto L_0x0080
            int r6 = r5.f61470u
            float r6 = (float) r6
            float r1 = r8.getY()
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            android.support.v4.widget.q r1 = r5.f61456g
            int r1 = r1.f3674b
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            android.support.v4.widget.q r6 = r5.f61456g
            int r1 = r8.getActionIndex()
            int r8 = r8.getPointerId(r1)
            r6.mo4154a(r7, r8)
        L_0x0080:
            boolean r6 = r5.f61466q
            if (r6 != 0) goto L_0x0085
            return r2
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.mo1219a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f61467r = 0;
        this.f61468s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f61459j.get() && (this.f61455f != 3 || super.mo1354a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo60682a(View view, float f) {
        if (this.f61454e) {
            return true;
        }
        if (view.getTop() >= this.f61452c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f61452c)) / ((float) this.f61464o) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: b */
    private void m76629b() {
        this.f61461l = -1;
        if (this.f61469t != null) {
            this.f61469t.recycle();
            this.f61469t = null;
        }
    }

    /* renamed from: c */
    private float m76630c() {
        this.f61469t.computeCurrentVelocity(1000, this.f61463n);
        return this.f61469t.getYVelocity(this.f61461l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60678a() {
        this.f61459j = new WeakReference<>(m76631c((View) this.f61458i.get()));
    }

    /* renamed from: a */
    public final void mo60680a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C23370b(viewPager, this));
    }

    /* renamed from: a */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m76628a(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0355d) {
            Behavior behavior = ((C0355d) layoutParams).f1407a;
            if (behavior instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo60685c(int i) {
        if (this.f61455f != i) {
            this.f61455f = i;
            View view = (View) this.f61458i.get();
            if (!(view == null || this.f61460k == null)) {
                this.f61460k.mo60692a(view, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo60686d(int i) {
        View view = (View) this.f61458i.get();
        if (!(view == null || this.f61460k == null)) {
            if (i > this.f61452c) {
                this.f61460k.mo60691a(view, ((float) (this.f61452c - i)) / ((float) (this.f61457h - this.f61452c)));
                return;
            }
            this.f61460k.mo60691a(view, ((float) (this.f61452c - i)) / ((float) (this.f61452c - this.f61451b)));
        }
    }

    /* renamed from: c */
    private View m76631c(View view) {
        if (view == null) {
            return null;
        }
        if (this.f61471v) {
            return (View) this.f61459j.get();
        }
        if (C0991u.m4165B(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View c = m76631c(C23373a.m76662a((ViewPager) view));
            if (c != null) {
                return c;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View c2 = m76631c(viewGroup.getChildAt(i));
                    if (c2 != null) {
                        return c2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60679a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f61465p
            if (r4 != 0) goto L_0x0015
            r3.f61465p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f61465p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f61464o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f61465p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f61464o = r1
            int r1 = r3.f61457h
            int r1 = r1 - r4
            r3.f61452c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f61455f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f61458i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f61458i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.mo60679a(int):void");
    }

    /* renamed from: b */
    public final void mo60683b(final int i) {
        if (i != this.f61455f) {
            if (this.f61458i == null) {
                if (i == 4 || i == 3 || (this.f61453d && i == 5)) {
                    this.f61455f = i;
                }
                return;
            }
            final View view = (View) this.f61458i.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0991u.m4170G(view)) {
                    mo60681a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            ViewPagerBottomSheetBehavior.this.mo60681a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo60684b(View view) {
        View view2 = (View) this.f61458i.get();
        if (view2 != null) {
            if (view != null) {
                ViewParent parent = view.getParent();
                while (parent != null && parent != view2) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    view = m76631c(view);
                } else {
                    throw new IllegalArgumentException("child is not a child of current View.");
                }
            }
            if (view != null) {
                this.f61459j = new WeakReference<>(view);
                this.f61471v = true;
                return;
            }
            if (this.f61471v) {
                this.f61471v = false;
                mo60678a();
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f61455f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo60679a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo60679a(peekValue.data);
        }
        this.f61453d = obtainStyledAttributes.getBoolean(1, false);
        this.f61454e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f61463n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60681a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f61452c;
        } else if (i == 3) {
            i2 = this.f61451b;
        } else if (!this.f61453d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f61457h;
        }
        if (this.f61456g.mo4157a(view, view.getLeft(), i2)) {
            mo60685c(2);
            C0991u.m4190a(view, (Runnable) new C23372c(view, i));
            return;
        }
        mo60685c(i);
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f61477a == 1 || savedState.f61477a == 2) {
            this.f61455f = 4;
        } else {
            this.f61455f = savedState.f61477a;
        }
    }

    /* renamed from: c */
    public final void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f61451b) {
            mo60685c(3);
        } else if (this.f61459j != null && view == this.f61459j.get() && this.f61468s) {
            if (this.f61467r > 0) {
                i = this.f61451b;
            } else if (!this.f61453d || !mo60682a((View) v, m76630c())) {
                if (this.f61467r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f61451b) < Math.abs(top - this.f61452c)) {
                        i = this.f61451b;
                    } else {
                        i = this.f61452c;
                    }
                } else {
                    i = this.f61452c;
                }
                i2 = 4;
            } else {
                i = this.f61457h;
                i2 = 5;
            }
            if (this.f61456g.mo4157a((View) v, v.getLeft(), i)) {
                mo60685c(2);
                C0991u.m4190a((View) v, (Runnable) new C23372c(v, i2));
            } else {
                mo60685c(i2);
            }
            this.f61468s = false;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f61466q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m76629b();
        }
        if (this.f61469t == null) {
            this.f61469t = VelocityTracker.obtain();
        }
        this.f61469t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f61470u = (int) motionEvent.getY();
                    if (this.f61459j != null) {
                        view = (View) this.f61459j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f61470u)) {
                        this.f61461l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f61462m = true;
                    }
                    if (this.f61461l != -1 || coordinatorLayout.mo1398a((View) v, x, this.f61470u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f61466q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f61462m = false;
        this.f61461l = -1;
        if (this.f61466q) {
            this.f61466q = false;
            return false;
        }
        if (!this.f61466q && this.f61456g.mo4156a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f61459j.get();
        if (actionMasked != 2 || view2 == null || this.f61466q || this.f61455f == 1 || coordinatorLayout.mo1398a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f61470u) - motionEvent.getY()) <= ((float) this.f61456g.f3674b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C0991u.m4244w(coordinatorLayout) && !C0991u.m4244w(v)) {
            C0991u.m4203b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1394a((View) v, i);
        this.f61457h = coordinatorLayout.getHeight();
        if (this.f61465p) {
            if (this.f61450a == 0) {
                this.f61450a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            i2 = Math.max(this.f61450a, this.f61457h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f61464o;
        }
        this.f61451b = Math.max(0, this.f61457h - v.getHeight());
        this.f61452c = Math.max(this.f61457h - i2, this.f61451b);
        if (this.f61455f == 3) {
            C0991u.m4222h((View) v, this.f61451b);
        } else if (this.f61453d && this.f61455f == 5) {
            C0991u.m4222h((View) v, this.f61457h);
        } else if (this.f61455f == 4) {
            C0991u.m4222h((View) v, this.f61452c);
        } else if (this.f61455f == 1 || this.f61455f == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f61456g == null) {
            this.f61456g = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f61472w);
        }
        this.f61458i = new WeakReference<>(v);
        this.f61459j = new WeakReference<>(m76631c((View) v));
        return true;
    }

    /* renamed from: a */
    public void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f61459j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f61451b) {
                    iArr[1] = top - this.f61451b;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo60685c(3);
                } else {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo60685c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f61452c || this.f61453d) {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo60685c(1);
                } else {
                    iArr[1] = top - this.f61452c;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo60685c(4);
                }
            }
            mo60686d(v.getTop());
            this.f61467r = i2;
            this.f61468s = true;
        }
    }
}
