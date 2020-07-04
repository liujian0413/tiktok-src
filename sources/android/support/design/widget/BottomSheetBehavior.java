package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
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
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public boolean f1335a = true;

    /* renamed from: b */
    public int f1336b;

    /* renamed from: c */
    int f1337c;

    /* renamed from: d */
    int f1338d;

    /* renamed from: e */
    int f1339e;

    /* renamed from: f */
    public boolean f1340f;

    /* renamed from: g */
    public boolean f1341g;

    /* renamed from: h */
    public int f1342h = 4;

    /* renamed from: i */
    C1060q f1343i;

    /* renamed from: j */
    int f1344j;

    /* renamed from: k */
    WeakReference<V> f1345k;

    /* renamed from: l */
    WeakReference<View> f1346l;

    /* renamed from: m */
    public C0343a f1347m;

    /* renamed from: n */
    int f1348n;

    /* renamed from: o */
    boolean f1349o;

    /* renamed from: p */
    private float f1350p;

    /* renamed from: q */
    private int f1351q;

    /* renamed from: r */
    private boolean f1352r;

    /* renamed from: s */
    private int f1353s;

    /* renamed from: t */
    private boolean f1354t;

    /* renamed from: u */
    private int f1355u;

    /* renamed from: v */
    private boolean f1356v;

    /* renamed from: w */
    private VelocityTracker f1357w;

    /* renamed from: x */
    private int f1358x;

    /* renamed from: y */
    private Map<View, Integer> f1359y;

    /* renamed from: z */
    private final C1063a f1360z = new C1063a() {
        /* renamed from: a */
        public final int mo1362a(View view) {
            if (BottomSheetBehavior.this.f1340f) {
                return BottomSheetBehavior.this.f1344j;
            }
            return BottomSheetBehavior.this.f1339e;
        }

        /* renamed from: a */
        public final void mo1364a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo1358c(1);
            }
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (BottomSheetBehavior.this.f1342h == 1 || BottomSheetBehavior.this.f1349o) {
                return false;
            }
            if (BottomSheetBehavior.this.f1342h == 3 && BottomSheetBehavior.this.f1348n == i) {
                View view2 = (View) BottomSheetBehavior.this.f1346l.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.f1345k == null || BottomSheetBehavior.this.f1345k.get() != view) {
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
            int b = BottomSheetBehavior.this.mo1356b();
            if (BottomSheetBehavior.this.f1340f) {
                i3 = BottomSheetBehavior.this.f1344j;
            } else {
                i3 = BottomSheetBehavior.this.f1339e;
            }
            return C0534a.m2233a(i, b, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1365a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0027
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                boolean r9 = r9.f1335a
                if (r9 == 0) goto L_0x0016
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1337c
            L_0x0013:
                r2 = 3
                goto L_0x00ca
            L_0x0016:
                int r9 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1338d
                if (r9 <= r10) goto L_0x0013
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1338d
            L_0x0024:
                r2 = 6
                goto L_0x00ca
            L_0x0027:
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                boolean r5 = r5.f1340f
                if (r5 == 0) goto L_0x0052
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                boolean r5 = r5.mo1355a(r8, r10)
                if (r5 == 0) goto L_0x0052
                int r5 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                int r6 = r6.f1339e
                if (r5 > r6) goto L_0x004b
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0052
            L_0x004b:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1344j
                r2 = 5
                goto L_0x00ca
            L_0x0052:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0068
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0063
                goto L_0x0068
            L_0x0063:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1339e
                goto L_0x00ca
            L_0x0068:
                int r9 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                boolean r10 = r10.f1335a
                if (r10 == 0) goto L_0x0091
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1337c
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f1339e
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008c
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1337c
                goto L_0x0013
            L_0x008c:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1339e
                goto L_0x00ca
            L_0x0091:
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1338d
                if (r9 >= r10) goto L_0x00ab
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1339e
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a5
                goto L_0x0013
            L_0x00a5:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1338d
                goto L_0x0024
            L_0x00ab:
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1338d
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f1339e
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c6
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1338d
                goto L_0x0024
            L_0x00c6:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1339e
            L_0x00ca:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                android.support.v4.widget.q r9 = r9.f1343i
                int r10 = r8.getLeft()
                boolean r9 = r9.mo4155a(r10, r0)
                if (r9 == 0) goto L_0x00e9
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                r10 = 2
                r9.mo1358c(r10)
                android.support.design.widget.BottomSheetBehavior$b r9 = new android.support.design.widget.BottomSheetBehavior$b
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                android.support.p022v4.view.C0991u.m4190a(r8, r9)
                return
            L_0x00e9:
                android.support.design.widget.BottomSheetBehavior r8 = android.support.design.widget.BottomSheetBehavior.this
                r8.mo1358c(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C03412.mo1365a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo1360d(i2);
        }
    };

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1399a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1397a(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1397a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1399a(i);
            }

            /* renamed from: a */
            private static SavedState m1398a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1398a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f1365a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1365a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1365a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1365a);
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0343a {
        /* renamed from: a */
        public abstract void mo1372a(View view, float f);

        /* renamed from: a */
        public abstract void mo1373a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    class C0344b implements Runnable {

        /* renamed from: b */
        private final View f1367b;

        /* renamed from: c */
        private final int f1368c;

        public final void run() {
            if (BottomSheetBehavior.this.f1343i == null || !BottomSheetBehavior.this.f1343i.mo4158a(true)) {
                BottomSheetBehavior.this.mo1358c(this.f1368c);
            } else {
                C0991u.m4190a(this.f1367b, (Runnable) this);
            }
        }

        C0344b(View view, int i) {
            this.f1367b = view;
            this.f1368c = i;
        }
    }

    /* renamed from: e */
    private float m1371e() {
        return C0382a.m1671a(this);
    }

    /* renamed from: a */
    public boolean mo1219a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return C0382a.m1672a(this, coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    public final boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0991u.m4244w(coordinatorLayout) && !C0991u.m4244w(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1394a((View) v, i);
        this.f1344j = coordinatorLayout.getHeight();
        if (this.f1352r) {
            if (this.f1336b == 0) {
                this.f1336b = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f7);
            }
            this.f1353s = Math.max(this.f1336b, this.f1344j - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f1353s = this.f1351q;
        }
        this.f1337c = Math.max(0, this.f1344j - v.getHeight());
        this.f1338d = this.f1344j / 2;
        m1369c();
        if (this.f1342h == 3) {
            C0991u.m4222h((View) v, mo1356b());
        } else if (this.f1342h == 6) {
            C0991u.m4222h((View) v, this.f1338d);
        } else if (this.f1340f && this.f1342h == 5) {
            C0991u.m4222h((View) v, this.f1344j);
        } else if (this.f1342h == 4) {
            C0991u.m4222h((View) v, this.f1339e);
        } else if (this.f1342h == 1 || this.f1342h == 2) {
            C0991u.m4222h((View) v, top - v.getTop());
        }
        if (this.f1343i == null) {
            this.f1343i = C1060q.m4591a((ViewGroup) coordinatorLayout, this.f1360z);
        }
        this.f1345k = new WeakReference<>(v);
        this.f1346l = new WeakReference<>(m1367b((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f1346l.get() && (this.f1342h != 3 || super.mo1354a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1355a(View view, float f) {
        if (this.f1341g) {
            return true;
        }
        if (view.getTop() >= this.f1339e && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f1339e)) / ((float) this.f1351q) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1353a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f1339e;
        } else if (i == 6) {
            int i3 = this.f1338d;
            if (!this.f1335a || i3 > this.f1337c) {
                i2 = i3;
            } else {
                i2 = this.f1337c;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo1356b();
        } else if (!this.f1340f || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f1344j;
        }
        if (this.f1343i.mo4157a(view, view.getLeft(), i2)) {
            mo1358c(2);
            C0991u.m4190a(view, (Runnable) new C0344b(view, i));
            return;
        }
        mo1358c(i);
    }

    /* renamed from: d */
    private void m1370d() {
        this.f1348n = -1;
        if (this.f1357w != null) {
            this.f1357w.recycle();
            this.f1357w = null;
        }
    }

    /* renamed from: b */
    public final int mo1356b() {
        if (this.f1335a) {
            return this.f1337c;
        }
        return 0;
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m1369c() {
        if (this.f1335a) {
            this.f1339e = Math.max(this.f1344j - this.f1353s, this.f1337c);
        } else {
            this.f1339e = this.f1344j - this.f1353s;
        }
    }

    /* renamed from: a */
    public final float mo1351a() {
        if (this.f1357w == null) {
            return 0.0f;
        }
        this.f1357w.computeCurrentVelocity(1000, this.f1350p);
        return this.f1357w.getYVelocity(this.f1348n);
    }

    /* renamed from: a */
    private void m1366a(boolean z) {
        int i;
        if (this.f1335a != z) {
            this.f1335a = z;
            if (this.f1345k != null) {
                m1369c();
            }
            if (!this.f1335a || this.f1342h != 6) {
                i = this.f1342h;
            } else {
                i = 3;
            }
            mo1358c(i);
        }
    }

    /* renamed from: a */
    public static <V extends View> BottomSheetBehavior<V> m1365a(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0355d) {
            Behavior behavior = ((C0355d) layoutParams).f1407a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: b */
    private View m1367b(View view) {
        if (C0991u.m4165B(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = m1367b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1358c(int i) {
        if (this.f1342h != i) {
            this.f1342h = i;
            if (i == 6 || i == 3) {
                m1368b(true);
            } else if (i == 5 || i == 4) {
                m1368b(false);
            }
            View view = (View) this.f1345k.get();
            if (!(view == null || this.f1347m == null)) {
                this.f1347m.mo1373a(view, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1360d(int i) {
        View view = (View) this.f1345k.get();
        if (!(view == null || this.f1347m == null)) {
            if (i > this.f1339e) {
                this.f1347m.mo1372a(view, ((float) (this.f1339e - i)) / ((float) (this.f1344j - this.f1339e)));
                return;
            }
            this.f1347m.mo1372a(view, ((float) (this.f1339e - i)) / ((float) (this.f1339e - mo1356b())));
        }
    }

    /* renamed from: b */
    private void m1368b(boolean z) {
        if (this.f1345k != null) {
            ViewParent parent = ((View) this.f1345k.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f1359y == null) {
                        this.f1359y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f1345k.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f1359y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C0991u.m4206c(childAt, 4);
                        } else if (this.f1359y != null && this.f1359y.containsKey(childAt)) {
                            C0991u.m4206c(childAt, ((Integer) this.f1359y.get(childAt)).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f1359y = null;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1352a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f1352r
            if (r4 != 0) goto L_0x0015
            r3.f1352r = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f1352r
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f1351q
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f1352r = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f1351q = r1
            int r1 = r3.f1344j
            int r1 = r1 - r4
            r3.f1339e = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f1342h
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f1345k
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f1345k
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo1352a(int):void");
    }

    /* renamed from: b */
    public final void mo1357b(final int i) {
        if (i != this.f1342h) {
            if (this.f1345k == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f1340f && i == 5)) {
                    this.f1342h = i;
                }
                return;
            }
            final View view = (View) this.f1345k.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0991u.m4170G(view)) {
                    mo1353a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            BottomSheetBehavior.this.mo1353a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1265b(coordinatorLayout, v), this.f1342h);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo1352a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo1352a(peekValue.data);
        }
        this.f1340f = obtainStyledAttributes.getBoolean(1, false);
        m1366a(obtainStyledAttributes.getBoolean(0, true));
        this.f1341g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f1350p = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: c */
    public final boolean mo1359c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1342h == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f1343i != null) {
            this.f1343i.mo4161b(motionEvent);
        }
        if (actionMasked == 0) {
            m1370d();
        }
        if (this.f1357w == null) {
            this.f1357w = VelocityTracker.obtain();
        }
        this.f1357w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f1354t && Math.abs(((float) this.f1358x) - motionEvent.getY()) > ((float) this.f1343i.f3674b)) {
            this.f1343i.mo4154a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f1354t) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1256a(coordinatorLayout, v, savedState.f3171e);
        if (savedState.f1365a == 1 || savedState.f1365a == 2) {
            this.f1342h = 4;
        } else {
            this.f1342h = savedState.f1365a;
        }
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f1354t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1370d();
        }
        if (this.f1357w == null) {
            this.f1357w = VelocityTracker.obtain();
        }
        this.f1357w.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f1358x = (int) motionEvent.getY();
                    if (this.f1346l != null) {
                        view = (View) this.f1346l.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1398a(view, x, this.f1358x)) {
                        this.f1348n = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f1349o = true;
                    }
                    if (this.f1348n != -1 || coordinatorLayout.mo1398a((View) v, x, this.f1358x)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f1354t = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f1349o = false;
        this.f1348n = -1;
        if (this.f1354t) {
            this.f1354t = false;
            return false;
        }
        if (!this.f1354t && this.f1343i != null && this.f1343i.mo4156a(motionEvent)) {
            return true;
        }
        if (this.f1346l != null) {
            view2 = (View) this.f1346l.get();
        }
        if (actionMasked != 2 || view2 == null || this.f1354t || this.f1342h == 1 || coordinatorLayout.mo1398a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1343i == null || Math.abs(((float) this.f1358x) - motionEvent.getY()) <= ((float) this.f1343i.f3674b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1257a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo1356b()) {
            mo1358c(3);
        } else if (view == this.f1346l.get() && this.f1356v) {
            if (this.f1355u > 0) {
                i2 = mo1356b();
            } else if (!this.f1340f || !mo1355a((View) v, m1371e())) {
                if (this.f1355u == 0) {
                    int top = v.getTop();
                    if (!this.f1335a) {
                        if (top < this.f1338d) {
                            if (top < Math.abs(top - this.f1339e)) {
                                i2 = 0;
                            } else {
                                i2 = this.f1338d;
                            }
                        } else if (Math.abs(top - this.f1338d) < Math.abs(top - this.f1339e)) {
                            i2 = this.f1338d;
                        } else {
                            i3 = this.f1339e;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f1337c) < Math.abs(top - this.f1339e)) {
                        i2 = this.f1337c;
                    } else {
                        i3 = this.f1339e;
                    }
                } else {
                    i3 = this.f1339e;
                }
                i4 = 4;
            } else {
                i2 = this.f1344j;
                i4 = 5;
            }
            if (this.f1343i.mo4157a((View) v, v.getLeft(), i2)) {
                mo1358c(2);
                C0991u.m4190a((View) v, (Runnable) new C0344b(v, i4));
            } else {
                mo1358c(i4);
            }
            this.f1356v = false;
        }
    }

    /* renamed from: a */
    public final boolean mo718a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1355u = 0;
        this.f1356v = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1259a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f1346l.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < mo1356b()) {
                    iArr[1] = top - mo1356b();
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo1358c(3);
                } else {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo1358c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i4 <= this.f1339e || this.f1340f) {
                    iArr[1] = i2;
                    C0991u.m4222h((View) v, -i2);
                    mo1358c(1);
                } else {
                    iArr[1] = top - this.f1339e;
                    C0991u.m4222h((View) v, -iArr[1]);
                    mo1358c(4);
                }
            }
            mo1360d(v.getTop());
            this.f1355u = i2;
            this.f1356v = true;
        }
    }
}
