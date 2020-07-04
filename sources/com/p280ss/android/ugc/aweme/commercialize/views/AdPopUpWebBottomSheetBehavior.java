package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.C23373a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior */
public class AdPopUpWebBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f66931a;

    /* renamed from: b */
    int f66932b;

    /* renamed from: c */
    int f66933c;

    /* renamed from: d */
    public boolean f66934d;

    /* renamed from: e */
    public boolean f66935e;

    /* renamed from: f */
    public int f66936f = 4;

    /* renamed from: g */
    C1060q f66937g;

    /* renamed from: h */
    int f66938h;

    /* renamed from: i */
    WeakReference<V> f66939i;

    /* renamed from: j */
    WeakReference<View> f66940j;

    /* renamed from: k */
    public C25442a f66941k;

    /* renamed from: l */
    int f66942l;

    /* renamed from: m */
    boolean f66943m;

    /* renamed from: n */
    private float f66944n;

    /* renamed from: o */
    private int f66945o;

    /* renamed from: p */
    private boolean f66946p;

    /* renamed from: q */
    private boolean f66947q;

    /* renamed from: r */
    private int f66948r;

    /* renamed from: s */
    private boolean f66949s;

    /* renamed from: t */
    private VelocityTracker f66950t;

    /* renamed from: u */
    private int f66951u;

    /* renamed from: v */
    private boolean f66952v;

    /* renamed from: w */
    private final C1063a f66953w = new C1063a() {
        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                AdPopUpWebBottomSheetBehavior.this.mo66057c(1);
            }
        }

        /* renamed from: a */
        public final int mo1362a(View view) {
            if (AdPopUpWebBottomSheetBehavior.this.f66934d) {
                return AdPopUpWebBottomSheetBehavior.this.f66938h - AdPopUpWebBottomSheetBehavior.this.f66932b;
            }
            return AdPopUpWebBottomSheetBehavior.this.f66933c - AdPopUpWebBottomSheetBehavior.this.f66932b;
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (AdPopUpWebBottomSheetBehavior.this.f66936f == 1 || AdPopUpWebBottomSheetBehavior.this.f66943m) {
                return false;
            }
            if (AdPopUpWebBottomSheetBehavior.this.f66936f == 3 && AdPopUpWebBottomSheetBehavior.this.f66942l == i) {
                View view2 = (View) AdPopUpWebBottomSheetBehavior.this.f66940j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (AdPopUpWebBottomSheetBehavior.this.f66939i == null || AdPopUpWebBottomSheetBehavior.this.f66939i.get() != view) {
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
            int i4 = AdPopUpWebBottomSheetBehavior.this.f66932b;
            if (AdPopUpWebBottomSheetBehavior.this.f66934d) {
                i3 = AdPopUpWebBottomSheetBehavior.this.f66938h;
            } else {
                i3 = AdPopUpWebBottomSheetBehavior.this.f66933c;
            }
            return C0534a.m2233a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = AdPopUpWebBottomSheetBehavior.this.f66932b;
            } else if (!AdPopUpWebBottomSheetBehavior.this.f66934d || !AdPopUpWebBottomSheetBehavior.this.mo66055a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - AdPopUpWebBottomSheetBehavior.this.f66932b) < Math.abs(top - AdPopUpWebBottomSheetBehavior.this.f66933c)) {
                        i = AdPopUpWebBottomSheetBehavior.this.f66932b;
                    } else {
                        i2 = AdPopUpWebBottomSheetBehavior.this.f66933c;
                    }
                } else {
                    i2 = AdPopUpWebBottomSheetBehavior.this.f66933c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = AdPopUpWebBottomSheetBehavior.this.f66938h;
                i3 = 5;
            }
            if (AdPopUpWebBottomSheetBehavior.this.f66937g.mo4155a(view.getLeft(), i)) {
                AdPopUpWebBottomSheetBehavior.this.mo66057c(2);
                C0991u.m4190a(view, (Runnable) new C25443b(view, i3));
                return;
            }
            AdPopUpWebBottomSheetBehavior.this.mo66057c(i3);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            AdPopUpWebBottomSheetBehavior.this.mo66058d(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m83663a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m83661a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m83661a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m83663a(i);
            }

            /* renamed from: a */
            private static SavedState m83662a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m83662a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f66958a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f66958a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f66958a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f66958a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$a */
    public static abstract class C25442a {
        /* renamed from: a */
        public abstract void mo66063a(View view, float f);

        /* renamed from: a */
        public abstract void mo66064a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$b */
    class C25443b implements Runnable {

        /* renamed from: b */
        private final View f66960b;

        /* renamed from: c */
        private final int f66961c;

        public final void run() {
            if (AdPopUpWebBottomSheetBehavior.this.f66937g == null || !AdPopUpWebBottomSheetBehavior.this.f66937g.mo4158a(true)) {
                AdPopUpWebBottomSheetBehavior.this.mo66057c(this.f66961c);
            } else {
                C0991u.m4190a(this.f66960b, (Runnable) this);
            }
        }

        C25443b(View view, int i) {
            this.f66960b = view;
            this.f66961c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f66948r = 0;
        this.f66949s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f66940j.get() && (this.f66936f != 3 || super.mo1354a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo66055a(View view, float f) {
        if (this.f66935e) {
            return true;
        }
        if (view.getTop() >= this.f66933c && Math.abs((((float) view.getTop()) + (f * 0.3f)) - ((float) this.f66933c)) / ((float) this.f66945o) > 0.5f) {
            return true;
        }
        return false;
    }

    public AdPopUpWebBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m83637a() {
        this.f66942l = -1;
        if (this.f66950t != null) {
            this.f66950t.recycle();
            this.f66950t = null;
        }
    }

    /* renamed from: b */
    private float m83638b() {
        this.f66950t.computeCurrentVelocity(1000, this.f66944n);
        return this.f66950t.getYVelocity(this.f66942l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo66057c(int i) {
        if (this.f66936f != i) {
            this.f66936f = i;
            View view = (View) this.f66939i.get();
            if (!(view == null || this.f66941k == null)) {
                this.f66941k.mo66064a(view, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66053a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f66946p
            if (r4 != 0) goto L_0x0015
            r3.f66946p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f66946p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f66945o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f66946p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f66945o = r1
            int r1 = r3.f66938h
            int r1 = r1 - r4
            r3.f66933c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f66936f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f66939i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f66939i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.mo66053a(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo66058d(int i) {
        View view = (View) this.f66939i.get();
        if (!(view == null || this.f66941k == null)) {
            if (i > this.f66933c) {
                this.f66941k.mo66063a(view, ((float) (this.f66933c - i)) / ((float) (this.f66938h - this.f66933c)));
                return;
            }
            this.f66941k.mo66063a(view, ((float) (this.f66933c - i)) / ((float) (this.f66933c - this.f66932b)));
        }
    }

    /* renamed from: a */
    private View m83636a(View view) {
        if (view == null) {
            return null;
        }
        if (this.f66952v) {
            return (View) this.f66940j.get();
        }
        if (C0991u.m4165B(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View a = m83636a(C23373a.m76662a((ViewPager) view));
            if (a != null) {
                return a;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View a2 = m83636a(viewGroup.getChildAt(i));
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo66056b(final int i) {
        if (i != this.f66936f) {
            if (this.f66939i == null) {
                if (i == 4 || i == 3 || (this.f66934d && i == 5)) {
                    this.f66936f = i;
                }
                return;
            }
            final View view = (View) this.f66939i.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0991u.m4170G(view)) {
                    mo66054a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            AdPopUpWebBottomSheetBehavior.this.mo66054a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f66936f);
    }

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo66053a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo66053a(peekValue.data);
        }
        this.f66934d = obtainStyledAttributes.getBoolean(1, false);
        this.f66935e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f66944n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66054a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f66933c;
        } else if (i == 3) {
            i2 = this.f66932b;
        } else if (!this.f66934d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f66938h;
        }
        if (this.f66937g.mo4157a(view, view.getLeft(), i2)) {
            mo66057c(2);
            C0991u.m4190a(view, (Runnable) new C25443b(view, i));
            return;
        }
        mo66057c(i);
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f66958a == 1 || savedState.f66958a == 2) {
            this.f66936f = 4;
        } else {
            this.f66936f = savedState.f66958a;
        }
    }

    /* renamed from: c */
    public final void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f66932b) {
            mo66057c(3);
        } else if (this.f66940j != null && view == this.f66940j.get() && this.f66949s) {
            if (this.f66948r > 0) {
                i = this.f66932b;
            } else if (!this.f66934d || !mo66055a((View) v, m83638b())) {
                if (this.f66948r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f66932b) < Math.abs(top - this.f66933c)) {
                        i = this.f66932b;
                    } else {
                        i = this.f66933c;
                    }
                } else {
                    i = this.f66933c;
                }
                i2 = 4;
            } else {
                i = this.f66938h;
                i2 = 5;
            }
            if (this.f66937g.mo4157a((View) v, v.getLeft(), i)) {
                mo66057c(2);
                C0991u.m4190a((View) v, (Runnable) new C25443b(v, i2));
            } else {
                mo66057c(i2);
            }
            this.f66949s = false;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f66947q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m83637a();
        }
        if (this.f66950t == null) {
            this.f66950t = VelocityTracker.obtain();
        }
        this.f66950t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f66951u = (int) motionEvent.getY();
                    if (this.f66940j != null) {
                        view = (View) this.f66940j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f66951u)) {
                        this.f66942l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f66943m = true;
                    }
                    if (this.f66942l != -1 || coordinatorLayout.mo1398a((View) v, x, this.f66951u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f66947q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f66943m = false;
        this.f66942l = -1;
        if (this.f66947q) {
            this.f66947q = false;
            return false;
        }
        if (!this.f66947q && this.f66937g.mo4156a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f66940j.get();
        if (actionMasked != 2 || view2 == null || this.f66947q || this.f66936f == 1 || coordinatorLayout.mo1398a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f66951u) - motionEvent.getY()) <= ((float) this.f66937g.f3674b)) {
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
        this.f66938h = coordinatorLayout.getHeight();
        if (this.f66946p) {
            if (this.f66931a == 0) {
                this.f66931a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            i2 = Math.max(this.f66931a, this.f66938h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f66945o;
        }
        this.f66932b = Math.max(0, this.f66938h - v.getHeight());
        this.f66933c = Math.max(this.f66938h - i2, this.f66932b);
        if (this.f66936f == 3) {
            C0991u.m4222h((View) v, this.f66932b);
        } else if (this.f66934d && this.f66936f == 5) {
            C0991u.m4222h((View) v, this.f66938h);
        } else if (this.f66936f == 4) {
            C0991u.m4222h((View) v, this.f66933c);
        } else if (this.f66936f == 1 || this.f66936f == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f66937g == null) {
            this.f66937g = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f66953w);
        }
        this.f66939i = new WeakReference<>(v);
        this.f66940j = new WeakReference<>(m83636a((View) v));
        return true;
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
            int r1 = r5.f66936f
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
            android.support.v4.widget.q r1 = r5.f66937g
            int r1 = r1.f3675c
            int r1 = r8.findPointerIndex(r1)
            android.support.v4.widget.q r4 = r5.f66937g
            if (r4 == 0) goto L_0x0038
            android.support.v4.widget.q r4 = r5.f66937g
            int r4 = r4.f3673a
            if (r4 != r2) goto L_0x0038
            if (r1 >= 0) goto L_0x0038
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            android.support.v4.widget.q r4 = r5.f66937g
            if (r4 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            android.support.v4.widget.q r1 = r5.f66937g
            r1.mo4161b(r8)
        L_0x0044:
            if (r6 != 0) goto L_0x0049
            r5.m83637a()
        L_0x0049:
            android.view.VelocityTracker r1 = r5.f66950t
            if (r1 != 0) goto L_0x0053
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.f66950t = r1
        L_0x0053:
            android.view.VelocityTracker r1 = r5.f66950t
            r1.addMovement(r8)
            if (r6 != r3) goto L_0x0080
            boolean r6 = r5.f66947q
            if (r6 != 0) goto L_0x0080
            int r6 = r5.f66951u
            float r6 = (float) r6
            float r1 = r8.getY()
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            android.support.v4.widget.q r1 = r5.f66937g
            int r1 = r1.f3674b
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            android.support.v4.widget.q r6 = r5.f66937g
            int r1 = r8.getActionIndex()
            int r8 = r8.getPointerId(r1)
            r6.mo4154a(r7, r8)
        L_0x0080:
            boolean r6 = r5.f66947q
            if (r6 != 0) goto L_0x0085
            return r2
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.mo1219a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f66940j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f66932b) {
                    iArr[1] = top - this.f66932b;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo66057c(3);
                } else {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo66057c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f66933c || this.f66934d) {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo66057c(1);
                } else {
                    iArr[1] = top - this.f66933c;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo66057c(4);
                }
            }
            mo66058d(v.getTop());
            this.f66948r = i2;
            this.f66949s = true;
        }
    }
}
