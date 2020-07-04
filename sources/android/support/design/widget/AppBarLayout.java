package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.internal.C0296b;
import android.support.design.p015a.C0234a;
import android.support.design.widget.CoordinatorLayout.C0353b;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.util.C0901h;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0979k;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.List;

@C0353b(mo1448a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f1264a;

    /* renamed from: b */
    public boolean f1265b;

    /* renamed from: c */
    private int f1266c;

    /* renamed from: d */
    private int f1267d;

    /* renamed from: e */
    private int f1268e;

    /* renamed from: f */
    private int f1269f;

    /* renamed from: g */
    private C0954ab f1270g;

    /* renamed from: h */
    private List<Object> f1271h;

    /* renamed from: i */
    private boolean f1272i;

    /* renamed from: j */
    private boolean f1273j;

    /* renamed from: k */
    private boolean f1274k;

    /* renamed from: l */
    private int[] f1275l;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: a */
        public int f1277a;

        /* renamed from: c */
        private int f1278c;

        /* renamed from: d */
        private ValueAnimator f1279d;

        /* renamed from: e */
        private int f1280e = -1;

        /* renamed from: f */
        private boolean f1281f;

        /* renamed from: g */
        private float f1282g;

        /* renamed from: h */
        private WeakReference<View> f1283h;

        /* renamed from: i */
        private C0318a f1284i;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                private static SavedState[] m1295a(int i) {
                    return new SavedState[i];
                }

                /* renamed from: a */
                private static SavedState m1293a(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m1293a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m1295a(i);
                }

                /* renamed from: a */
                private static SavedState m1294a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m1294a(parcel, classLoader);
                }
            };

            /* renamed from: a */
            int f1288a;

            /* renamed from: b */
            float f1289b;

            /* renamed from: c */
            boolean f1290c;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z;
                super(parcel, classLoader);
                this.f1288a = parcel.readInt();
                this.f1289b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f1290c = z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f1288a);
                parcel.writeFloat(this.f1289b);
                parcel.writeByte(this.f1290c ? (byte) 1 : 0);
            }
        }

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$a */
        public static abstract class C0318a<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo1271a(T t);
        }

        /* renamed from: a */
        private static boolean m1261a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ int mo1249a(View view) {
            return m1267c((T) (AppBarLayout) view);
        }

        /* renamed from: a */
        public boolean mo718a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.f1265b || m1263a(coordinatorLayout, t, view));
            if (z && this.f1279d != null) {
                this.f1279d.cancel();
            }
            this.f1283h = null;
            this.f1278c = i2;
            return z;
        }

        /* renamed from: a */
        private static boolean m1263a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo1225a() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void mo1259a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo1532b(coordinatorLayout, t, i2, i5, i4);
                    m1257a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: a */
        public void mo1258a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo1532b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m1257a(i4, t, view, i5);
            }
            if (t.f1265b) {
                t.mo1226a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        public void mo1257a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f1278c == 0 || i == 1) {
                m1266b(coordinatorLayout, t);
            }
            this.f1283h = new WeakReference<>(view);
        }

        /* renamed from: a */
        public boolean mo1263a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0355d) t.getLayoutParams()).height != -2) {
                return super.mo1263a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo1395a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo684a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo684a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            if (this.f1280e >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(this.f1280e);
                int i3 = -childAt.getBottom();
                if (this.f1281f) {
                    i2 = i3 + C0991u.m4237p(childAt) + t.getTopInset();
                } else {
                    i2 = i3 + Math.round(((float) childAt.getHeight()) * this.f1282g);
                }
                mo1531a_(coordinatorLayout, t, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m1258a(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        mo1531a_(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1258a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo1531a_(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo1227b();
            this.f1280e = -1;
            mo1272a(C0534a.m2233a(mo1273b(), -t.getTotalScrollRange(), 0));
            m1260a(coordinatorLayout, t, mo1273b(), 0, true);
            t.mo1223a(mo1273b());
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo1266c(T t) {
            if (this.f1284i != null) {
                return this.f1284i.mo1271a(t);
            }
            if (this.f1283h == null) {
                return true;
            }
            View view = (View) this.f1283h.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public Parcelable mo1265b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable b = super.mo1265b(coordinatorLayout, t);
            int b2 = mo1273b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(b);
                    savedState.f1288a = i;
                    if (bottom == C0991u.m4237p(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f1290c = z;
                    savedState.f1289b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        /* renamed from: a */
        public void mo1256a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo1256a(coordinatorLayout, t, savedState.f3171e);
                this.f1280e = savedState.f1288a;
                this.f1282g = savedState.f1289b;
                this.f1281f = savedState.f1290c;
                return;
            }
            super.mo1256a(coordinatorLayout, t, parcelable);
            this.f1280e = -1;
        }

        public BaseBehavior() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo1247a() {
            return mo1273b() + this.f1277a;
        }

        /* renamed from: b */
        private static int m1264b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: c */
        private static int m1267c(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo1264b(View view) {
            return m1264b((T) (AppBarLayout) view);
        }

        /* renamed from: a */
        private static View m1256a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C0979k) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void mo1255a(CoordinatorLayout coordinatorLayout, T t) {
            m1266b(coordinatorLayout, t);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private static int m1254a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m1261a(layoutParams.f1291a, 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private static View m1268c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: d */
        private static boolean m1270d(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo1403c((View) t);
            int size = c.size();
            int i = 0;
            while (i < size) {
                android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0355d) ((View) c.get(i)).getLayoutParams()).f1407a;
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) behavior).f1460d != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        private static int m1265b(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolator = layoutParams.f1292b;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (interpolator != null) {
                    int i4 = layoutParams.f1291a;
                    if ((i4 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((i4 & 2) != 0) {
                            i2 -= C0991u.m4237p(childAt);
                        }
                    }
                    if (C0991u.m4244w(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: b */
        private void m1266b(CoordinatorLayout coordinatorLayout, T t) {
            int a = mo1247a();
            int a2 = m1254a(t, a);
            if (a2 >= 0) {
                View childAt = t.getChildAt(a2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i = layoutParams.f1291a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a2 == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (m1261a(i, 2)) {
                        i3 += C0991u.m4237p(childAt);
                    } else if (m1261a(i, 5)) {
                        int p = C0991u.m4237p(childAt) + i3;
                        if (a < p) {
                            i2 = p;
                        } else {
                            i3 = p;
                        }
                    }
                    if (m1261a(i, 32)) {
                        i2 += layoutParams.topMargin;
                        i3 -= layoutParams.bottomMargin;
                    }
                    if (a < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m1258a(coordinatorLayout, t, C0534a.m2233a(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        private void m1257a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int a = mo1247a();
                if ((i < 0 && a == 0) || (i > 0 && a == (-t.getDownNestedScrollRange()))) {
                    C0991u.m4219g(view, 1);
                }
            }
        }

        /* renamed from: a */
        private void m1258a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo1247a() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m1259a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m1259a(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int a = mo1247a();
            if (a == i) {
                if (this.f1279d != null && this.f1279d.isRunning()) {
                    this.f1279d.cancel();
                }
                return;
            }
            if (this.f1279d == null) {
                this.f1279d = new ValueAnimator();
                this.f1279d.setInterpolator(C0234a.f876e);
                this.f1279d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.mo1531a_(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f1279d.cancel();
            }
            this.f1279d.setDuration((long) Math.min(i2, 600));
            this.f1279d.setIntValues(new int[]{a, i});
            this.f1279d.start();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int mo1248a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int i5;
            int a = mo1247a();
            int i6 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f1277a = 0;
            } else {
                int a2 = C0534a.m2233a(i, i2, i3);
                if (a != a2) {
                    if (t.f1264a) {
                        i4 = m1265b(t, a2);
                    } else {
                        i4 = a2;
                    }
                    boolean a3 = mo1272a(i4);
                    i6 = a - a2;
                    this.f1277a = a2 - i4;
                    if (!a3 && t.f1264a) {
                        coordinatorLayout.mo1393a((View) t);
                    }
                    t.mo1223a(mo1273b());
                    if (a2 < a) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    m1260a(coordinatorLayout, t, a2, i5, false);
                }
            }
            return i6;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1260a(android.support.design.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m1268c(r7, r8)
                if (r0 == 0) goto L_0x006a
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                android.support.design.widget.AppBarLayout$LayoutParams r1 = (android.support.design.widget.AppBarLayout.LayoutParams) r1
                int r1 = r1.f1291a
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003f
                int r2 = android.support.p022v4.view.C0991u.m4237p(r0)
                if (r9 <= 0) goto L_0x002d
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002d
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
            L_0x002b:
                r8 = 1
                goto L_0x0040
            L_0x002d:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x003f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
                goto L_0x002b
            L_0x003f:
                r8 = 0
            L_0x0040:
                boolean r9 = r7.f1265b
                if (r9 == 0) goto L_0x0053
                android.view.View r9 = m1256a(r6)
                if (r9 == 0) goto L_0x0053
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0052
                r8 = 1
                goto L_0x0053
            L_0x0052:
                r8 = 0
            L_0x0053:
                boolean r8 = r7.mo1226a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006a
                if (r10 != 0) goto L_0x0067
                if (r8 == 0) goto L_0x006a
                boolean r6 = m1270d(r6, r7)
                if (r6 == 0) goto L_0x006a
            L_0x0067:
                r7.jumpDrawablesToCurrentState()
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.m1260a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo1273b() {
            return super.mo1273b();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1272a(int i) {
            return super.mo1272a(i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Parcelable mo1250a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1265b(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1251a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1256a(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1260a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo684a(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1252a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo1257a(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1261a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1263a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1262a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo718a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1254a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo1259a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1253a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.mo1258a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f1291a = 1;

        /* renamed from: b */
        public Interpolator f1292b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1274a() {
            if ((this.f1291a & 1) != 1 || (this.f1291a & 10) == 0) {
                return false;
            }
            return true;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.f1291a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f1292b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo1273b() {
            return super.mo1273b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ View mo1276a(List list) {
            return m1310b(list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1272a(int i) {
            return super.mo1272a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo1278b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo1278b(view);
        }

        /* renamed from: a */
        private static int m1308a(AppBarLayout appBarLayout) {
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0355d) appBarLayout.getLayoutParams()).f1407a;
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).mo1247a();
            }
            return 0;
        }

        /* renamed from: b */
        private static AppBarLayout m1310b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final float mo1275a(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m1308a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.f1460d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m1309a(View view, View view2) {
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0355d) view2.getLayoutParams()).f1407a;
            if (behavior instanceof BaseBehavior) {
                C0991u.m4222h(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f1277a) + this.f1459c) - mo1535c(view2));
            }
        }

        /* renamed from: b */
        private static void m1311b(View view, View view2) {
            boolean z;
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f1265b) {
                    if (view.getScrollY() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appBarLayout.mo1226a(z);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo1205a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public final boolean mo1207b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m1309a(view, view2);
            m1311b(view, view2);
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo684a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo684a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public final boolean mo1277a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m1310b(coordinatorLayout.mo1400b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1457a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.mo1224a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1263a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1263a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1227b() {
        this.f1269f = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f1269f;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    /* renamed from: d */
    private void m1245d() {
        this.f1266c = -1;
        this.f1267d = -1;
        this.f1268e = -1;
    }

    /* renamed from: e */
    private static LayoutParams m1246e() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        if (this.f1270g != null) {
            return this.f1270g.mo3719b();
        }
        return 0;
    }

    /* renamed from: c */
    private boolean m1244c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo1274a()) {
                return true;
            }
        }
        return false;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i;
        int topInset = getTopInset();
        int p = C0991u.m4237p(this);
        if (p != 0) {
            return (p * 2) + topInset;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            i = C0991u.m4237p(getChildAt(childCount - 1));
        } else {
            i = 0;
        }
        if (i != 0) {
            return (i * 2) + topInset;
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        if (this.f1267d != -1) {
            return this.f1267d;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f1291a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                int i3 = i + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i2 & 8) != 0) {
                    i = i3 + C0991u.m4237p(childAt);
                } else if ((i2 & 2) != 0) {
                    i = i3 + (measuredHeight - C0991u.m4237p(childAt));
                } else {
                    i = i3 + (measuredHeight - getTopInset());
                }
            }
        }
        int max = Math.max(0, i);
        this.f1267d = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        if (this.f1268e != -1) {
            return this.f1268e;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i3 = layoutParams.f1291a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C0991u.m4237p(childAt) + getTopInset();
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f1268e = max;
        return max;
    }

    public final int getTotalScrollRange() {
        if (this.f1266c != -1) {
            return this.f1266c;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f1291a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= C0991u.m4237p(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.f1266c = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1225a() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setLiftOnScroll(boolean z) {
        this.f1265b = z;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setExpanded(boolean z) {
        mo1224a(z, C0991u.m4167D(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: b */
    private boolean m1243b(boolean z) {
        if (this.f1273j == z) {
            return false;
        }
        this.f1273j = z;
        refreshDrawableState();
        return true;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0413p.m1843a(this, f);
        }
    }

    /* renamed from: a */
    private static LayoutParams m1241a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0954ab mo1222a(C0954ab abVar) {
        C0954ab abVar2;
        if (C0991u.m4244w(this)) {
            abVar2 = abVar;
        } else {
            abVar2 = null;
        }
        if (!C0901h.m3836a(this.f1270g, abVar2)) {
            this.f1270g = abVar2;
            m1245d();
        }
        return abVar;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f1275l == null) {
            this.f1275l = new int[4];
        }
        int[] iArr = this.f1275l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        if (this.f1273j) {
            i2 = R.attr.a36;
        } else {
            i2 = -2130969681;
        }
        iArr[0] = i2;
        if (!this.f1273j || !this.f1274k) {
            i3 = -2130969682;
        } else {
            i3 = R.attr.a37;
        }
        iArr[1] = i3;
        if (this.f1273j) {
            i4 = R.attr.a35;
        } else {
            i4 = -2130969680;
        }
        iArr[2] = i4;
        if (!this.f1273j || !this.f1274k) {
            i5 = -2130969679;
        } else {
            i5 = R.attr.a34;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1223a(int i) {
        if (this.f1271h != null) {
            int size = this.f1271h.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1271h.get(i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1226a(boolean z) {
        if (this.f1274k == z) {
            return false;
        }
        this.f1274k = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: a */
    public final void mo1224a(boolean z, boolean z2) {
        m1242a(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1245d();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1266c = -1;
        this.f1267d = -1;
        this.f1268e = -1;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C0413p.m1842a(this);
            C0413p.m1844a(this, attributeSet, 0, R.style.q9);
        }
        TypedArray a = C0296b.m1168a(context, attributeSet, R$styleable.AppBarLayout, 0, R.style.q9, new int[0]);
        C0991u.m4185a((View) this, a.getDrawable(0));
        if (a.hasValue(4)) {
            m1242a(a.getBoolean(4, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a.hasValue(3)) {
            C0413p.m1843a(this, (float) a.getDimensionPixelSize(3, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a.hasValue(2)) {
                setKeyboardNavigationCluster(a.getBoolean(2, false));
            }
            if (a.hasValue(1)) {
                setTouchscreenBlocksFocus(a.getBoolean(1, false));
            }
        }
        this.f1265b = a.getBoolean(5, false);
        a.recycle();
        C0991u.m4188a((View) this, (C0983o) new C0983o() {
            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                return AppBarLayout.this.mo1222a(abVar);
            }
        });
    }

    /* renamed from: a */
    private void m1242a(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f1269f = i4 | i3;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1245d();
        boolean z2 = false;
        this.f1264a = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).f1292b != null) {
                this.f1264a = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f1272i) {
            if (this.f1265b || m1244c()) {
                z2 = true;
            }
            m1243b(z2);
        }
    }
}
