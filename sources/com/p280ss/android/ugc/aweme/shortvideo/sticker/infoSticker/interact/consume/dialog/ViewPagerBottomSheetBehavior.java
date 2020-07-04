package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f105913a;

    /* renamed from: b */
    int f105914b;

    /* renamed from: c */
    int f105915c;

    /* renamed from: d */
    public boolean f105916d;

    /* renamed from: e */
    public boolean f105917e;

    /* renamed from: f */
    public int f105918f = 4;

    /* renamed from: g */
    C1060q f105919g;

    /* renamed from: h */
    int f105920h;

    /* renamed from: i */
    WeakReference<V> f105921i;

    /* renamed from: j */
    WeakReference<View> f105922j;

    /* renamed from: k */
    public C40738a f105923k;

    /* renamed from: l */
    int f105924l;

    /* renamed from: m */
    boolean f105925m;

    /* renamed from: n */
    private float f105926n;

    /* renamed from: o */
    private int f105927o;

    /* renamed from: p */
    private boolean f105928p;

    /* renamed from: q */
    private boolean f105929q;

    /* renamed from: r */
    private int f105930r;

    /* renamed from: s */
    private boolean f105931s;

    /* renamed from: t */
    private VelocityTracker f105932t;

    /* renamed from: u */
    private int f105933u;

    /* renamed from: v */
    private final C1063a f105934v = new C1063a() {
        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo100958b(1);
            }
        }

        /* renamed from: a */
        public final int mo1362a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f105916d) {
                return ViewPagerBottomSheetBehavior.this.f105920h - ViewPagerBottomSheetBehavior.this.f105914b;
            }
            return ViewPagerBottomSheetBehavior.this.f105915c - ViewPagerBottomSheetBehavior.this.f105914b;
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f105918f == 1 || ViewPagerBottomSheetBehavior.this.f105925m) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f105918f == 3 && ViewPagerBottomSheetBehavior.this.f105924l == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f105922j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f105921i == null || ViewPagerBottomSheetBehavior.this.f105921i.get() != view) {
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
            int i4 = ViewPagerBottomSheetBehavior.this.f105914b;
            if (ViewPagerBottomSheetBehavior.this.f105916d) {
                i3 = ViewPagerBottomSheetBehavior.this.f105920h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f105915c;
            }
            return C0534a.m2233a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f105914b;
            } else if (!ViewPagerBottomSheetBehavior.this.f105916d || !ViewPagerBottomSheetBehavior.this.mo100957a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f105914b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f105915c)) {
                        i = ViewPagerBottomSheetBehavior.this.f105914b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f105915c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f105915c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f105920h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f105919g.mo4155a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo100958b(2);
                C0991u.m4190a(view, (Runnable) new C40739b(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo100958b(i3);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo100959c(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m130251a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m130249a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m130249a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m130251a(i);
            }

            /* renamed from: a */
            private static SavedState m130250a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m130250a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f105939a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f105939a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f105939a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f105939a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$a */
    public static abstract class C40738a {
        /* renamed from: a */
        public abstract void mo100964a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$b */
    class C40739b implements Runnable {

        /* renamed from: b */
        private final View f105941b;

        /* renamed from: c */
        private final int f105942c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f105919g == null || !ViewPagerBottomSheetBehavior.this.f105919g.mo4158a(true)) {
                ViewPagerBottomSheetBehavior.this.mo100958b(this.f105942c);
            } else {
                C0991u.m4190a(this.f105941b, (Runnable) this);
            }
        }

        C40739b(View view, int i) {
            this.f105941b = view;
            this.f105942c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f105918f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f105919g != null) {
            this.f105919g.mo4161b(motionEvent);
        }
        if (actionMasked == 0) {
            m130224b();
        }
        if (this.f105932t == null) {
            this.f105932t = VelocityTracker.obtain();
        }
        this.f105932t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f105929q && Math.abs(((float) this.f105933u) - motionEvent.getY()) > ((float) this.f105919g.f3674b)) {
            this.f105919g.mo4154a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f105929q) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f105922j.get() && (this.f105918f != 3 || super.mo1354a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo100957a(View view, float f) {
        if (this.f105917e) {
            return true;
        }
        if (view.getTop() >= this.f105915c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f105915c)) / ((float) this.f105927o) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: b */
    private void m130224b() {
        this.f105924l = -1;
        if (this.f105932t != null) {
            this.f105932t.recycle();
            this.f105932t = null;
        }
    }

    /* renamed from: c */
    private float m130225c() {
        this.f105932t.computeCurrentVelocity(1000, this.f105926n);
        return this.f105932t.getYVelocity(this.f105924l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100954a() {
        this.f105922j = new WeakReference<>(m130223b((View) this.f105921i.get()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo100959c(int i) {
        this.f105921i.get();
    }

    /* renamed from: a */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m130222a(V v) {
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

    /* renamed from: b */
    private View m130223b(View view) {
        if (C0991u.m4165B(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View focusedChild = ((ViewPager) view).getFocusedChild();
            if (focusedChild == null) {
                return null;
            }
            View b = m130223b(focusedChild);
            if (b != null) {
                return b;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b2 = m130223b(viewGroup.getChildAt(i));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m130226d(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f105928p
            if (r4 != 0) goto L_0x0015
            r3.f105928p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f105928p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f105927o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f105928p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f105927o = r1
            int r1 = r3.f105920h
            int r1 = r1 - r4
            r3.f105915c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f105918f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f105921i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f105921i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.m130226d(int):void");
    }

    /* renamed from: a */
    public final void mo100955a(int i) {
        if (4 != this.f105918f) {
            if (this.f105921i == null) {
                this.f105918f = 4;
                return;
            }
            final View view = (View) this.f105921i.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0991u.m4170G(view)) {
                    mo100956a(view, 4);
                } else {
                    view.post(new Runnable(4) {
                        public final void run() {
                            ViewPagerBottomSheetBehavior.this.mo100956a(view, 4);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo100958b(int i) {
        if (this.f105918f != i) {
            this.f105918f = i;
            View view = (View) this.f105921i.get();
            if (!(view == null || this.f105923k == null)) {
                this.f105923k.mo100964a(view, i);
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f105918f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m130226d(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m130226d(peekValue.data);
        }
        this.f105916d = obtainStyledAttributes.getBoolean(1, false);
        this.f105917e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f105926n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100956a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f105915c;
        } else if (i == 3) {
            i2 = this.f105914b;
        } else if (!this.f105916d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f105920h;
        }
        if (this.f105919g.mo4157a(view, view.getLeft(), i2)) {
            mo100958b(2);
            C0991u.m4190a(view, (Runnable) new C40739b(view, i));
            return;
        }
        mo100958b(i);
    }

    /* renamed from: c */
    public final void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f105914b) {
            mo100958b(3);
        } else if (this.f105922j != null && view == this.f105922j.get() && this.f105931s) {
            if (this.f105930r > 0) {
                i = this.f105914b;
            } else if (!this.f105916d || !mo100957a((View) v, m130225c())) {
                if (this.f105930r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f105914b) < Math.abs(top - this.f105915c)) {
                        i = this.f105914b;
                    } else {
                        i = this.f105915c;
                    }
                } else {
                    i = this.f105915c;
                }
                i2 = 4;
            } else {
                i = this.f105920h;
                i2 = 5;
            }
            if (this.f105919g.mo4157a((View) v, v.getLeft(), i)) {
                mo100958b(2);
                C0991u.m4190a((View) v, (Runnable) new C40739b(v, i2));
            } else {
                mo100958b(i2);
            }
            this.f105931s = false;
        }
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f105939a == 1 || savedState.f105939a == 2) {
            this.f105918f = 4;
        } else {
            this.f105918f = savedState.f105939a;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f105929q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m130224b();
        }
        if (this.f105932t == null) {
            this.f105932t = VelocityTracker.obtain();
        }
        this.f105932t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f105933u = (int) motionEvent.getY();
                    if (this.f105922j != null) {
                        view = (View) this.f105922j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f105933u)) {
                        this.f105924l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f105925m = true;
                    }
                    if (this.f105924l != -1 || coordinatorLayout.mo1398a((View) v, x, this.f105933u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f105929q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f105925m = false;
        this.f105924l = -1;
        if (this.f105929q) {
            this.f105929q = false;
            return false;
        }
        if (!this.f105929q && this.f105919g.mo4156a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f105922j.get();
        if (actionMasked != 2 || view2 == null || this.f105929q || this.f105918f == 1 || coordinatorLayout.mo1398a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f105933u) - motionEvent.getY()) <= ((float) this.f105919g.f3674b)) {
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
        this.f105920h = coordinatorLayout.getHeight();
        if (this.f105928p) {
            if (this.f105913a == 0) {
                this.f105913a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            i2 = Math.max(this.f105913a, this.f105920h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f105927o;
        }
        this.f105914b = Math.max(0, this.f105920h - v.getHeight());
        this.f105915c = Math.max(this.f105920h - i2, this.f105914b);
        if (this.f105918f == 3) {
            C0991u.m4222h((View) v, this.f105914b);
        } else if (this.f105916d && this.f105918f == 5) {
            C0991u.m4222h((View) v, this.f105920h);
        } else if (this.f105918f == 4) {
            C0991u.m4222h((View) v, this.f105915c);
        } else if (this.f105918f == 1 || this.f105918f == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f105919g == null) {
            this.f105919g = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f105934v);
        }
        this.f105921i = new WeakReference<>(v);
        this.f105922j = new WeakReference<>(m130223b((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f105930r = 0;
        this.f105931s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f105922j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f105914b) {
                    iArr[1] = top - this.f105914b;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo100958b(3);
                } else {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo100958b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f105915c || this.f105916d) {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo100958b(1);
                } else {
                    iArr[1] = top - this.f105915c;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo100958b(4);
                }
            }
            mo100959c(v.getTop());
            this.f105930r = i2;
            this.f105931s = true;
        }
    }
}
