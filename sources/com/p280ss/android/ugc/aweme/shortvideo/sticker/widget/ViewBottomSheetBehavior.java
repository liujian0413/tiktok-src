package com.p280ss.android.ugc.aweme.shortvideo.sticker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0990t;
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
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.C23373a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ViewBottomSheetBehavior */
public class ViewBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f106587a;

    /* renamed from: b */
    int f106588b;

    /* renamed from: c */
    int f106589c;

    /* renamed from: d */
    public boolean f106590d;

    /* renamed from: e */
    public boolean f106591e;

    /* renamed from: f */
    public int f106592f = 4;

    /* renamed from: g */
    C1060q f106593g;

    /* renamed from: h */
    int f106594h;

    /* renamed from: i */
    WeakReference<V> f106595i;

    /* renamed from: j */
    WeakReference<View> f106596j;

    /* renamed from: k */
    int f106597k;

    /* renamed from: l */
    boolean f106598l;

    /* renamed from: m */
    private float f106599m;

    /* renamed from: n */
    private int f106600n;

    /* renamed from: o */
    private boolean f106601o;

    /* renamed from: p */
    private boolean f106602p;

    /* renamed from: q */
    private int f106603q;

    /* renamed from: r */
    private boolean f106604r;

    /* renamed from: s */
    private VelocityTracker f106605s;

    /* renamed from: t */
    private int f106606t;

    /* renamed from: u */
    private boolean f106607u;

    /* renamed from: v */
    private final C1063a f106608v = new C1063a() {
        /* renamed from: a */
        private static int m130984a(int i, int i2, int i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }

        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                ViewBottomSheetBehavior.this.mo101325a(1);
            }
        }

        /* renamed from: a */
        public final int mo1362a(View view) {
            if (ViewBottomSheetBehavior.this.f106590d) {
                return ViewBottomSheetBehavior.this.f106594h - ViewBottomSheetBehavior.this.f106588b;
            }
            return ViewBottomSheetBehavior.this.f106589c - ViewBottomSheetBehavior.this.f106588b;
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (ViewBottomSheetBehavior.this.f106592f == 1 || ViewBottomSheetBehavior.this.f106598l) {
                return false;
            }
            if (ViewBottomSheetBehavior.this.f106592f == 3 && ViewBottomSheetBehavior.this.f106597k == i) {
                View view2 = (View) ViewBottomSheetBehavior.this.f106596j.get();
                if (view2 != null && C0991u.m4195a(view2, -1)) {
                    return false;
                }
            }
            if (ViewBottomSheetBehavior.this.f106595i == null || ViewBottomSheetBehavior.this.f106595i.get() != view) {
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
            int i4 = ViewBottomSheetBehavior.this.f106588b;
            if (ViewBottomSheetBehavior.this.f106590d) {
                i3 = ViewBottomSheetBehavior.this.f106594h;
            } else {
                i3 = ViewBottomSheetBehavior.this.f106589c;
            }
            return m130984a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewBottomSheetBehavior.this.f106588b;
            } else if (!ViewBottomSheetBehavior.this.f106590d || !ViewBottomSheetBehavior.this.mo101326a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewBottomSheetBehavior.this.f106588b) < Math.abs(top - ViewBottomSheetBehavior.this.f106589c)) {
                        i = ViewBottomSheetBehavior.this.f106588b;
                    } else {
                        i2 = ViewBottomSheetBehavior.this.f106589c;
                    }
                } else {
                    i2 = ViewBottomSheetBehavior.this.f106589c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewBottomSheetBehavior.this.f106594h;
                i3 = 5;
            }
            if (ViewBottomSheetBehavior.this.f106593g.mo4155a(view.getLeft(), i)) {
                ViewBottomSheetBehavior.this.mo101325a(2);
                C0991u.m4190a(view, (Runnable) new C41001a(view, i3));
                return;
            }
            ViewBottomSheetBehavior.this.mo101325a(i3);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            ViewBottomSheetBehavior.this.mo101327b(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ViewBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m130993b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m130993b(i);
            }

            /* renamed from: b */
            private static SavedState m130992b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m130992b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        final int f106610a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f106610a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f106610a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f106610a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ViewBottomSheetBehavior$a */
    class C41001a implements Runnable {

        /* renamed from: b */
        private final View f106612b;

        /* renamed from: c */
        private final int f106613c;

        public final void run() {
            if (ViewBottomSheetBehavior.this.f106593g == null || !ViewBottomSheetBehavior.this.f106593g.mo4158a(true)) {
                ViewBottomSheetBehavior.this.mo101325a(this.f106613c);
            } else {
                C0991u.m4190a(this.f106612b, (Runnable) this);
            }
        }

        C41001a(View view, int i) {
            this.f106612b = view;
            this.f106613c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f106603q = 0;
        this.f106604r = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo101326a(View view, float f) {
        if (this.f106591e) {
            return true;
        }
        if (view.getTop() >= this.f106589c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f106589c)) / ((float) this.f106600n) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m130969a() {
        this.f106597k = -1;
        if (this.f106605s != null) {
            this.f106605s.recycle();
            this.f106605s = null;
        }
    }

    /* renamed from: b */
    private float m130970b() {
        this.f106605s.computeCurrentVelocity(1000, this.f106599m);
        return C0990t.m4163b(this.f106605s, this.f106597k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo101327b(int i) {
        this.f106595i.get();
    }

    /* renamed from: a */
    private View m130968a(View view) {
        if (this.f106607u) {
            return (View) this.f106596j.get();
        }
        View a = C23373a.m76662a((ViewPager) view.findViewById(R.id.edt));
        if (a != null) {
            return a;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m130971c(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f106601o
            if (r4 != 0) goto L_0x0015
            r3.f106601o = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f106601o
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f106600n
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f106601o = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f106600n = r1
            int r1 = r3.f106594h
            int r1 = r1 - r4
            r3.f106589c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f106592f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f106595i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f106595i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.ViewBottomSheetBehavior.m130971c(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101325a(int i) {
        if (this.f106592f != i) {
            this.f106592f = i;
            this.f106595i.get();
        }
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f106592f);
    }

    public ViewBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m130971c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m130971c(peekValue.data);
        }
        this.f106590d = obtainStyledAttributes.getBoolean(1, false);
        this.f106591e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f106599m = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f106610a == 1 || savedState.f106610a == 2) {
            this.f106592f = 4;
        } else {
            this.f106592f = savedState.f106610a;
        }
    }

    /* renamed from: c */
    public final void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f106588b) {
            mo101325a(3);
        } else if (view == this.f106596j.get() && this.f106604r) {
            if (this.f106603q > 0) {
                i = this.f106588b;
            } else if (!this.f106590d || !mo101326a(v, m130970b())) {
                if (this.f106603q == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f106588b) < Math.abs(top - this.f106589c)) {
                        i = this.f106588b;
                    } else {
                        i = this.f106589c;
                    }
                } else {
                    i = this.f106589c;
                }
                i2 = 4;
            } else {
                i = this.f106594h;
                i2 = 5;
            }
            if (this.f106593g.mo4157a((View) v, v.getLeft(), i)) {
                mo101325a(2);
                C0991u.m4190a((View) v, (Runnable) new C41001a(v, i2));
            } else {
                mo101325a(i2);
            }
            this.f106604r = false;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = true;
        if (!v.isShown()) {
            this.f106602p = true;
            return false;
        }
        int a = C0978j.m4129a(motionEvent);
        if (a == 0) {
            m130969a();
        }
        if (this.f106605s == null) {
            this.f106605s = VelocityTracker.obtain();
        }
        this.f106605s.addMovement(motionEvent);
        if (a != 3) {
            switch (a) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f106606t = (int) motionEvent.getY();
                    View view = (View) this.f106596j.get();
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f106606t)) {
                        this.f106597k = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f106598l = true;
                    }
                    if (this.f106597k != -1 || coordinatorLayout.mo1398a((View) v, x, this.f106606t)) {
                        z = false;
                    }
                    this.f106602p = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f106598l = false;
        this.f106597k = -1;
        if (this.f106602p) {
            this.f106602p = false;
            return false;
        }
        if (!this.f106602p && this.f106593g.mo4156a(motionEvent)) {
            return false;
        }
        this.f106596j.get();
        return false;
    }

    /* renamed from: a */
    public final boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C0991u.m4244w(coordinatorLayout) && !C0991u.m4244w(v)) {
            C0991u.m4203b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1394a((View) v, i);
        this.f106594h = coordinatorLayout.getHeight();
        if (this.f106601o) {
            if (this.f106587a == 0) {
                this.f106587a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            i2 = Math.max(this.f106587a, this.f106594h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f106600n;
        }
        this.f106588b = Math.max(0, this.f106594h - v.getHeight());
        this.f106589c = Math.max(this.f106594h - i2, this.f106588b);
        if (this.f106592f == 3) {
            C0991u.m4222h((View) v, this.f106588b);
        } else if (this.f106590d && this.f106592f == 5) {
            C0991u.m4222h((View) v, this.f106594h);
        } else if (this.f106592f == 4) {
            C0991u.m4222h((View) v, this.f106589c);
        } else if (this.f106592f == 1 || this.f106592f == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f106593g == null) {
            this.f106593g = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f106608v);
        }
        this.f106595i = new WeakReference<>(v);
        this.f106596j = new WeakReference<>(m130968a((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = C0978j.m4129a(motionEvent);
        if (this.f106592f == 1 && a == 0) {
            return true;
        }
        this.f106593g.mo4161b(motionEvent);
        if (a == 0) {
            m130969a();
        }
        if (this.f106605s == null) {
            this.f106605s = VelocityTracker.obtain();
        }
        this.f106605s.addMovement(motionEvent);
        if (a == 2 && !this.f106602p && Math.abs(((float) this.f106606t) - motionEvent.getY()) > ((float) this.f106593g.f3674b)) {
            this.f106593g.mo4154a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f106602p) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.f106596j.get() || (this.f106592f == 3 && !super.mo1354a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f106596j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (Math.abs(i2) >= 10) {
                if (i2 > 0) {
                    if (i3 < this.f106588b) {
                        iArr[1] = top - this.f106588b;
                        C0991u.m4222h((View) v, -iArr[1]);
                        mo101325a(3);
                    } else {
                        iArr[1] = i2;
                        C0991u.m4222h((View) v, -i2);
                        mo101325a(1);
                    }
                } else if (i2 < 0 && !C0991u.m4195a(view, -1)) {
                    if (i3 <= this.f106589c || this.f106590d) {
                        iArr[1] = i2;
                        C0991u.m4222h((View) v, -i2);
                        mo101325a(1);
                    } else {
                        iArr[1] = top - this.f106589c;
                        C0991u.m4222h((View) v, -iArr[1]);
                        mo101325a(4);
                    }
                }
                mo101327b(v.getTop());
                this.f106603q = i2;
                this.f106604r = true;
            }
        }
    }
}
