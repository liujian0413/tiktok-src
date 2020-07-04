package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior */
public class PageBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f83614a;

    /* renamed from: b */
    int f83615b;

    /* renamed from: c */
    int f83616c;

    /* renamed from: d */
    public boolean f83617d;

    /* renamed from: e */
    public boolean f83618e;

    /* renamed from: f */
    public int f83619f = 4;

    /* renamed from: g */
    C1060q f83620g;

    /* renamed from: h */
    int f83621h;

    /* renamed from: i */
    WeakReference<V> f83622i;

    /* renamed from: j */
    WeakReference<View> f83623j;

    /* renamed from: k */
    int f83624k;

    /* renamed from: l */
    boolean f83625l;

    /* renamed from: m */
    public boolean f83626m = true;

    /* renamed from: n */
    private float f83627n;

    /* renamed from: o */
    private int f83628o;

    /* renamed from: p */
    private boolean f83629p;

    /* renamed from: q */
    private boolean f83630q;

    /* renamed from: r */
    private int f83631r;

    /* renamed from: s */
    private boolean f83632s;

    /* renamed from: t */
    private VelocityTracker f83633t;

    /* renamed from: u */
    private int f83634u;

    /* renamed from: v */
    private final C1063a f83635v = new C1063a() {
        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                PageBottomSheetBehavior.this.mo82889a(1);
            }
        }

        /* renamed from: a */
        public final int mo1362a(View view) {
            if (PageBottomSheetBehavior.this.f83617d) {
                return PageBottomSheetBehavior.this.f83621h - PageBottomSheetBehavior.this.f83615b;
            }
            return PageBottomSheetBehavior.this.f83616c - PageBottomSheetBehavior.this.f83615b;
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (PageBottomSheetBehavior.this.f83619f == 1 || PageBottomSheetBehavior.this.f83625l) {
                return false;
            }
            if (PageBottomSheetBehavior.this.f83619f == 3 && PageBottomSheetBehavior.this.f83624k == i) {
                View view2 = (View) PageBottomSheetBehavior.this.f83623j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (PageBottomSheetBehavior.this.f83622i == null || PageBottomSheetBehavior.this.f83622i.get() != view) {
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
            int i4 = PageBottomSheetBehavior.this.f83615b;
            if (PageBottomSheetBehavior.this.f83617d) {
                i3 = PageBottomSheetBehavior.this.f83621h;
            } else {
                i3 = PageBottomSheetBehavior.this.f83616c;
            }
            return C0534a.m2233a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = PageBottomSheetBehavior.this.f83615b;
            } else if (!PageBottomSheetBehavior.this.f83617d || !PageBottomSheetBehavior.this.mo82890a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - PageBottomSheetBehavior.this.f83615b) < Math.abs(top - PageBottomSheetBehavior.this.f83616c)) {
                        i = PageBottomSheetBehavior.this.f83615b;
                    } else {
                        i2 = PageBottomSheetBehavior.this.f83616c;
                    }
                } else {
                    i2 = PageBottomSheetBehavior.this.f83616c;
                }
                i = i2;
                i3 = 4;
            } else {
                if (PageBottomSheetBehavior.this.f83626m) {
                    i = PageBottomSheetBehavior.this.f83621h;
                } else {
                    i = view.getTop();
                }
                i3 = 5;
            }
            if (PageBottomSheetBehavior.this.f83620g.mo4155a(view.getLeft(), i)) {
                PageBottomSheetBehavior.this.mo82889a(2);
                C0991u.m4190a(view, (Runnable) new C31983a(view, i3));
                return;
            }
            PageBottomSheetBehavior.this.mo82889a(i3);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            PageBottomSheetBehavior.this.mo82891b(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m103903a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m103901a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m103901a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m103903a(i);
            }

            /* renamed from: a */
            private static SavedState m103902a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m103902a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f83637a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f83637a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f83637a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f83637a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior$a */
    class C31983a implements Runnable {

        /* renamed from: b */
        private final View f83639b;

        /* renamed from: c */
        private final int f83640c;

        public final void run() {
            if (PageBottomSheetBehavior.this.f83620g == null || !PageBottomSheetBehavior.this.f83620g.mo4158a(true)) {
                PageBottomSheetBehavior.this.mo82889a(this.f83640c);
            } else {
                C0991u.m4190a(this.f83639b, (Runnable) this);
            }
        }

        C31983a(View view, int i) {
            this.f83639b = view;
            this.f83640c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f83631r = 0;
        this.f83632s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo82890a(View view, float f) {
        if (this.f83618e) {
            return true;
        }
        if (view.getTop() >= this.f83616c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f83616c)) / ((float) this.f83628o) > 0.25f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m103879a() {
        this.f83624k = -1;
        if (this.f83633t != null) {
            this.f83633t.recycle();
            this.f83633t = null;
        }
    }

    public PageBottomSheetBehavior() {
    }

    /* renamed from: b */
    private float m103880b() {
        this.f83633t.computeCurrentVelocity(1000, this.f83627n);
        return this.f83633t.getYVelocity(this.f83624k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo82891b(int i) {
        this.f83622i.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo82889a(int i) {
        if (this.f83619f != i) {
            this.f83619f = i;
            this.f83622i.get();
        }
    }

    /* renamed from: a */
    private View m103878a(View view) {
        if (C0991u.m4165B(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m103878a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m103881c(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f83629p
            if (r4 != 0) goto L_0x0015
            r3.f83629p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f83629p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f83628o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f83629p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f83628o = r1
            int r1 = r3.f83621h
            int r1 = r1 - r4
            r3.f83616c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f83619f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f83622i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f83622i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.widget.PageBottomSheetBehavior.m103881c(int):void");
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f83619f);
    }

    public PageBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m103881c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m103881c(peekValue.data);
        }
        this.f83617d = obtainStyledAttributes.getBoolean(1, false);
        this.f83618e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f83627n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f83637a == 1 || savedState.f83637a == 2) {
            this.f83619f = 4;
        } else {
            this.f83619f = savedState.f83637a;
        }
    }

    /* renamed from: c */
    public final void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f83615b) {
            mo82889a(3);
        } else if (this.f83623j != null && view == this.f83623j.get() && this.f83632s) {
            if (this.f83631r > 0) {
                i = this.f83615b;
            } else if (!this.f83617d || !mo82890a(v, m103880b())) {
                if (this.f83631r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f83615b) < Math.abs(top - this.f83616c)) {
                        i = this.f83615b;
                    } else {
                        i = this.f83616c;
                    }
                } else {
                    i = this.f83616c;
                }
                i2 = 4;
            } else {
                i = this.f83621h;
                i2 = 5;
            }
            if (this.f83620g.mo4157a((View) v, v.getLeft(), i)) {
                mo82889a(2);
                C0991u.m4190a((View) v, (Runnable) new C31983a(v, i2));
            } else {
                mo82889a(i2);
            }
            this.f83632s = false;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f83630q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m103879a();
        }
        if (this.f83633t == null) {
            this.f83633t = VelocityTracker.obtain();
        }
        this.f83633t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f83634u = (int) motionEvent.getY();
                    if (this.f83623j != null) {
                        view = (View) this.f83623j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f83634u)) {
                        this.f83624k = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f83625l = true;
                    }
                    if (this.f83624k != -1 || coordinatorLayout.mo1398a((View) v, x, this.f83634u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f83630q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f83625l = false;
        this.f83624k = -1;
        if (this.f83630q) {
            this.f83630q = false;
            return false;
        }
        if (!this.f83630q && this.f83620g.mo4156a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f83623j.get();
        if (actionMasked != 2 || view2 == null || this.f83630q || this.f83619f == 1 || coordinatorLayout.mo1398a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f83634u) - motionEvent.getY()) <= ((float) this.f83620g.f3674b)) {
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
        this.f83621h = coordinatorLayout.getHeight();
        if (this.f83629p) {
            if (this.f83614a == 0) {
                this.f83614a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            i2 = Math.max(this.f83614a, this.f83621h);
        } else {
            i2 = this.f83628o;
        }
        this.f83615b = Math.max(0, this.f83621h - v.getHeight());
        this.f83616c = Math.max(this.f83621h - i2, this.f83615b);
        if (this.f83619f == 3) {
            C0991u.m4222h((View) v, this.f83615b);
        } else if (this.f83617d && this.f83619f == 5) {
            C0991u.m4222h((View) v, this.f83621h);
        } else if (this.f83619f == 4) {
            C0991u.m4222h((View) v, this.f83616c);
        } else if (this.f83619f == 1 || this.f83619f == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f83620g == null) {
            this.f83620g = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f83635v);
        }
        this.f83622i = new WeakReference<>(v);
        this.f83623j = new WeakReference<>(m103878a((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f83619f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f83620g != null) {
            this.f83620g.mo4161b(motionEvent);
        }
        if (actionMasked == 0) {
            m103879a();
        }
        if (this.f83633t == null) {
            this.f83633t = VelocityTracker.obtain();
        }
        this.f83633t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f83630q && Math.abs(((float) this.f83634u) - motionEvent.getY()) > ((float) this.f83620g.f3674b)) {
            this.f83620g.mo4154a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f83630q) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.f83623j.get() || (this.f83619f == 3 && !super.mo1354a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f83623j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f83615b) {
                    iArr[1] = top - this.f83615b;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo82889a(3);
                } else {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo82889a(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f83616c || this.f83617d) {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo82889a(1);
                } else {
                    iArr[1] = top - this.f83616c;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo82889a(4);
                }
            }
            mo82891b(v.getTop());
            this.f83631r = i2;
            this.f83632s = true;
        }
    }
}
