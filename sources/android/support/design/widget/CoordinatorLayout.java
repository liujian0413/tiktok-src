package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.coordinatorlayout.R$styleable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.util.C0901h;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0982n;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.NestedScrollingParent2;
import android.support.p022v4.widget.C1046g;
import android.support.p022v4.widget.C1064r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: a */
    static final String f1381a;

    /* renamed from: b */
    static final Class<?>[] f1382b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f1383c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f1384d;

    /* renamed from: f */
    private static final C0887a<Rect> f1385f = new SynchronizedPool(12);

    /* renamed from: e */
    OnHierarchyChangeListener f1386e;

    /* renamed from: g */
    private final List<View> f1387g;

    /* renamed from: h */
    private final C1046g<View> f1388h;

    /* renamed from: i */
    private final List<View> f1389i;

    /* renamed from: j */
    private final List<View> f1390j;

    /* renamed from: k */
    private final int[] f1391k;

    /* renamed from: l */
    private boolean f1392l;

    /* renamed from: m */
    private boolean f1393m;

    /* renamed from: n */
    private int[] f1394n;

    /* renamed from: o */
    private View f1395o;

    /* renamed from: p */
    private View f1396p;

    /* renamed from: q */
    private C0356e f1397q;

    /* renamed from: r */
    private boolean f1398r;

    /* renamed from: s */
    private C0954ab f1399s;

    /* renamed from: t */
    private boolean f1400t;

    /* renamed from: u */
    private Drawable f1401u;

    /* renamed from: v */
    private C0983o f1402v;

    /* renamed from: w */
    private final C0982n f1403w;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: a */
        public static C0954ab m1460a(CoordinatorLayout coordinatorLayout, V v, C0954ab abVar) {
            return abVar;
        }

        /* renamed from: a */
        public void mo1212a(C0355d dVar) {
        }

        /* renamed from: a */
        public void mo1256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo682a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1263a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1442a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1277a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1205a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1354a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1207b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public void mo1443c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: c */
        public final boolean mo1444c(CoordinatorLayout coordinatorLayout, V v) {
            return false;
        }

        /* renamed from: a */
        public boolean mo718a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo685a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public Parcelable mo1265b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public void mo1257a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo1443c(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo1259a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo1441a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public void mo1258a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo682a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1484a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1482a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1482a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1484a(i);
            }

            /* renamed from: a */
            private static SavedState m1483a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1483a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f1405a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1405a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1405a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            if (this.f1405a != null) {
                i2 = this.f1405a.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f1405a.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f1405a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0352a {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public @interface C0353b {
        /* renamed from: a */
        Class<? extends Behavior> mo1448a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    class C0354c implements OnHierarchyChangeListener {
        C0354c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f1386e != null) {
                CoordinatorLayout.this.f1386e.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo1392a(2);
            if (CoordinatorLayout.this.f1386e != null) {
                CoordinatorLayout.this.f1386e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0355d extends MarginLayoutParams {

        /* renamed from: a */
        public Behavior f1407a;

        /* renamed from: b */
        boolean f1408b;

        /* renamed from: c */
        public int f1409c;

        /* renamed from: d */
        public int f1410d;

        /* renamed from: e */
        public int f1411e = -1;

        /* renamed from: f */
        public int f1412f = -1;

        /* renamed from: g */
        public int f1413g;

        /* renamed from: h */
        public int f1414h;

        /* renamed from: i */
        int f1415i;

        /* renamed from: j */
        int f1416j;

        /* renamed from: k */
        View f1417k;

        /* renamed from: l */
        View f1418l;

        /* renamed from: m */
        public boolean f1419m;

        /* renamed from: n */
        public final Rect f1420n = new Rect();

        /* renamed from: o */
        Object f1421o;

        /* renamed from: p */
        private boolean f1422p;

        /* renamed from: q */
        private boolean f1423q;

        /* renamed from: r */
        private boolean f1424r;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo1461c() {
            this.f1422p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo1462d() {
            this.f1419m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo1459b() {
            if (this.f1407a == null) {
                this.f1422p = false;
            }
            return this.f1422p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1455a() {
            if (this.f1417k != null || this.f1412f == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1451a(int i) {
            mo1452a(i, false);
        }

        public C0355d(C0355d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1453a(Rect rect) {
            this.f1420n.set(rect);
        }

        public C0355d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public final void mo1454a(Behavior behavior) {
            if (this.f1407a != behavior) {
                this.f1407a = behavior;
                this.f1421o = null;
                this.f1408b = true;
                if (behavior != null) {
                    behavior.mo1212a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo1460b(int i) {
            switch (i) {
                case 0:
                    return this.f1423q;
                case 1:
                    return this.f1424r;
                default:
                    return false;
            }
        }

        public C0355d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0355d(int i, int i2) {
            super(-2, -2);
        }

        /* renamed from: a */
        private boolean m1487a(View view, int i) {
            int a = C0972e.m4109a(((C0355d) view.getLayoutParams()).f1413g, i);
            if (a == 0 || (C0972e.m4109a(this.f1414h, i) & a) != a) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final View mo1458b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1412f == -1) {
                this.f1418l = null;
                this.f1417k = null;
                return null;
            }
            if (this.f1417k == null || !m1488b(view, coordinatorLayout)) {
                m1486a(view, coordinatorLayout);
            }
            return this.f1417k;
        }

        /* renamed from: b */
        private boolean m1488b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1417k.getId() != this.f1412f) {
                return false;
            }
            View view2 = this.f1417k;
            for (ViewParent parent = this.f1417k.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1418l = null;
                    this.f1417k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1418l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1452a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f1423q = z;
                    return;
                case 1:
                    this.f1424r = z;
                    break;
            }
        }

        C0355d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.f1409c = obtainStyledAttributes.getInteger(0, 0);
            this.f1412f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1410d = obtainStyledAttributes.getInteger(2, 0);
            this.f1411e = obtainStyledAttributes.getInteger(6, -1);
            this.f1413g = obtainStyledAttributes.getInt(5, 0);
            this.f1414h = obtainStyledAttributes.getInt(4, 0);
            this.f1408b = obtainStyledAttributes.hasValue(3);
            if (this.f1408b) {
                this.f1407a = CoordinatorLayout.m1412a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            if (this.f1407a != null) {
                this.f1407a.mo1212a(this);
            }
        }

        /* renamed from: a */
        private void m1486a(View view, CoordinatorLayout coordinatorLayout) {
            this.f1417k = coordinatorLayout.findViewById(this.f1412f);
            if (this.f1417k != null) {
                if (this.f1417k != coordinatorLayout) {
                    View view2 = this.f1417k;
                    ViewParent parent = this.f1417k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f1418l = null;
                            this.f1417k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1418l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f1418l = null;
                    this.f1417k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f1418l = null;
                this.f1417k = null;
            } else {
                StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f1412f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1456a(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            if (this.f1422p) {
                return true;
            }
            boolean z2 = this.f1422p;
            if (this.f1407a != null) {
                z = this.f1407a.mo1444c(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f1422p = z3;
            return z3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1457a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f1418l || m1487a(view2, C0991u.m4220h(coordinatorLayout)) || (this.f1407a != null && this.f1407a.mo1205a(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    class C0356e implements OnPreDrawListener {
        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo1392a(0);
            return true;
        }

        C0356e() {
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    static class C0357f implements Comparator<View> {
        C0357f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m1501a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m1501a(View view, View view2) {
            float E = C0991u.m4168E(view);
            float E2 = C0991u.m4168E(view2);
            if (E > E2) {
                return -1;
            }
            if (E < E2) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: c */
    private static int m1431c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m1435d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m1439e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public final C0954ab getLastWindowInsets() {
        return this.f1399s;
    }

    public Drawable getStatusBarBackground() {
        return this.f1401u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0954ab mo1391a(C0954ab abVar) {
        if (C0901h.m3836a(this.f1399s, abVar)) {
            return abVar;
        }
        this.f1399s = abVar;
        boolean z = true;
        this.f1400t = abVar != null && abVar.mo3719b() > 0;
        if (this.f1400t || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0954ab b = m1427b(abVar);
        requestLayout();
        return b;
    }

    /* renamed from: a */
    private void m1424a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C0355d) childAt.getLayoutParams()).f1407a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.mo1309b(this, childAt, obtain);
                } else {
                    behavior.mo1219a(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0355d) getChildAt(i2).getLayoutParams()).mo1461c();
        }
        this.f1395o = null;
        this.f1392l = false;
    }

    /* renamed from: a */
    private void m1423a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f1384d != null) {
            Collections.sort(list, f1384d);
        }
    }

    /* renamed from: a */
    private boolean m1425a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1389i;
        m1423a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0355d dVar = (C0355d) view.getLayoutParams();
            Behavior behavior = dVar.f1407a;
            if ((z || z2) && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            behavior.mo1309b(this, view, motionEvent3);
                            break;
                        case 1:
                            behavior.mo1219a(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && behavior != null) {
                    switch (i) {
                        case 0:
                            z = behavior.mo1309b(this, view, motionEvent2);
                            break;
                        case 1:
                            z = behavior.mo1219a(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f1395o = view;
                    }
                }
                boolean b = dVar.mo1459b();
                boolean a = dVar.mo1456a(this, view);
                z2 = a && !b;
                if (a && !z2) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: a */
    public final void mo1394a(View view, int i) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        if (dVar.mo1455a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (dVar.f1417k != null) {
            m1421a(view, dVar.f1417k, i);
        } else if (dVar.f1411e >= 0) {
            m1429b(view, dVar.f1411e, i);
        } else {
            m1433c(view, i);
        }
    }

    /* renamed from: a */
    private void m1422a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1419a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m1421a(View view, View view2, int i) {
        Rect a = mo1011a();
        Rect a2 = mo1011a();
        try {
            m1419a(view2, a);
            m1417a(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m1415a(a);
            m1415a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1392a(int i) {
        int i2 = i;
        int h = C0991u.m4220h(this);
        int size = this.f1387g.size();
        Rect a = mo1011a();
        Rect a2 = mo1011a();
        Rect a3 = mo1011a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f1387g.get(i3);
            C0355d dVar = (C0355d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (dVar.f1418l == ((View) this.f1387g.get(i4))) {
                        m1444f(view, h);
                    }
                }
                m1422a(view, true, a2);
                if (dVar.f1413g != 0 && !a2.isEmpty()) {
                    int a4 = C0972e.m4109a(dVar.f1413g, h);
                    int i5 = a4 & 112;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = a4 & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (dVar.f1414h != 0 && view.getVisibility() == 0) {
                    m1420a(view, a, h);
                }
                if (i2 != 2) {
                    m1434c(view, a3);
                    if (!a3.equals(a2)) {
                        m1430b(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f1387g.get(i7);
                    C0355d dVar2 = (C0355d) view2.getLayoutParams();
                    Behavior behavior = dVar2.f1407a;
                    if (behavior != null && behavior.mo1205a(this, view2, view)) {
                        if (i2 != 0 || !dVar2.f1419m) {
                            boolean b = i2 != 2 ? behavior.mo1207b(this, view2, view) : true;
                            if (i2 == 1) {
                                dVar2.f1419m = b;
                            }
                        } else {
                            dVar2.mo1462d();
                        }
                    }
                }
            }
        }
        m1415a(a);
        m1415a(a2);
        m1415a(a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1420a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = android.support.p022v4.view.C0991u.m4167D(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x0100
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x0100
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r0 = (android.support.design.widget.CoordinatorLayout.C0355d) r0
            android.support.design.widget.CoordinatorLayout$Behavior r1 = r0.f1407a
            android.graphics.Rect r2 = mo1011a()
            android.graphics.Rect r3 = mo1011a()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006b
            boolean r1 = r1.mo1442a(r8, r9, r2)
            if (r1 == 0) goto L_0x006b
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.<init>(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x006b:
            r2.set(r3)
        L_0x006e:
            m1415a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x007b
            m1415a(r2)
            return
        L_0x007b:
            int r1 = r0.f1414h
            int r11 = android.support.p022v4.view.C0972e.m4109a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x009d
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f1416j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x009d
            int r3 = r10.top
            int r3 = r3 - r1
            m1441e(r9, r3)
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bc
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f1416j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bc
            int r1 = r10.bottom
            int r3 = r3 - r1
            m1441e(r9, r3)
            r1 = 1
        L_0x00bc:
            if (r1 != 0) goto L_0x00c1
            m1441e(r9, r5)
        L_0x00c1:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00da
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f1415i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00da
            int r3 = r10.left
            int r3 = r3 - r1
            m1438d(r9, r3)
            r1 = 1
            goto L_0x00db
        L_0x00da:
            r1 = 0
        L_0x00db:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f7
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f1415i
            int r11 = r11 + r0
            int r0 = r10.right
            if (r11 >= r0) goto L_0x00f7
            int r10 = r10.right
            int r11 = r11 - r10
            m1438d(r9, r11)
            r1 = 1
        L_0x00f7:
            if (r1 != 0) goto L_0x00fc
            m1438d(r9, r5)
        L_0x00fc:
            m1415a(r2)
            return
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.m1420a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    public final void mo1393a(View view) {
        List c = this.f1388h.mo4130c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior behavior = ((C0355d) view2.getLayoutParams()).f1407a;
                if (behavior != null) {
                    behavior.mo1207b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1398a(View view, int i, int i2) {
        Rect a = mo1011a();
        m1419a(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1415a(a);
        }
    }

    /* renamed from: a */
    public final boolean mo1399a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0355d dVar = (C0355d) childAt.getLayoutParams();
                Behavior behavior = dVar.f1407a;
                if (behavior != null) {
                    boolean a = behavior.mo718a(this, childAt, view, view2, i, i2);
                    boolean z2 = z | a;
                    dVar.mo1452a(i3, a);
                    z = z2;
                } else {
                    dVar.mo1452a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1396a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0355d dVar = (C0355d) childAt.getLayoutParams();
                if (dVar.mo1460b(i5)) {
                    Behavior behavior = dVar.f1407a;
                    if (behavior != null) {
                        behavior.mo1258a(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    }
                }
            } else {
                int i7 = i5;
            }
        }
        if (z) {
            mo1392a(1);
        }
    }

    /* renamed from: a */
    public final void mo1397a(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0355d dVar = (C0355d) childAt.getLayoutParams();
                if (dVar.mo1460b(i3)) {
                    Behavior behavior = dVar.f1407a;
                    if (behavior != null) {
                        int[] iArr2 = this.f1391k;
                        this.f1391k[1] = 0;
                        iArr2[0] = 0;
                        behavior.mo1259a(this, childAt, view, i, i2, this.f1391k, i3);
                        if (i > 0) {
                            i4 = Math.max(i6, this.f1391k[0]);
                        } else {
                            i4 = Math.min(i6, this.f1391k[0]);
                        }
                        if (i2 > 0) {
                            i5 = Math.max(i7, this.f1391k[1]);
                        } else {
                            i5 = Math.min(i7, this.f1391k[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo1392a(1);
        }
    }

    /* renamed from: f */
    private static C0355d m1443f() {
        return new C0355d(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m1443f();
    }

    public int getNestedScrollAxes() {
        return this.f1403w.f3402a;
    }

    /* renamed from: a */
    private static Rect mo1011a() {
        Rect rect = (Rect) f1385f.acquire();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        mo1013b();
        return Collections.unmodifiableList(this.f1387g);
    }

    /* renamed from: d */
    private void mo66383d() {
        if (this.f1393m) {
            if (this.f1397q == null) {
                this.f1397q = new C0356e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1397q);
        }
        this.f1398r = true;
    }

    /* renamed from: e */
    private void m1440e() {
        if (this.f1393m && this.f1397q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1397q);
        }
        this.f1398r = false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1401u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: c */
    private void mo1014c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1442e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f1398r) {
            if (z) {
                mo66383d();
                return;
            }
            m1440e();
        }
    }

    /* renamed from: g */
    private void m1445g() {
        if (VERSION.SDK_INT >= 21) {
            if (C0991u.m4244w(this)) {
                if (this.f1402v == null) {
                    this.f1402v = new C0983o() {
                        /* renamed from: a */
                        public final C0954ab mo1183a(View view, C0954ab abVar) {
                            return CoordinatorLayout.this.mo1391a(abVar);
                        }
                    };
                }
                C0991u.m4188a((View) this, this.f1402v);
                setSystemUiVisibility(1280);
                return;
            }
            C0991u.m4188a((View) this, (C0983o) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1424a(false);
        if (this.f1398r) {
            if (this.f1397q == null) {
                this.f1397q = new C0356e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1397q);
        }
        if (this.f1399s == null && C0991u.m4244w(this)) {
            C0991u.m4243v(this);
        }
        this.f1393m = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1424a(false);
        if (this.f1398r && this.f1397q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1397q);
        }
        if (this.f1396p != null) {
            onStopNestedScroll(this.f1396p);
        }
        this.f1393m = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0355d) childAt.getLayoutParams()).f1407a;
            if (!(id == -1 || behavior == null)) {
                Parcelable b = behavior.mo1265b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        savedState.f1405a = sparseArray;
        return savedState;
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f1381a = str;
        if (VERSION.SDK_INT >= 21) {
            f1384d = new C0357f();
        } else {
            f1384d = null;
        }
    }

    /* renamed from: b */
    private void mo1013b() {
        this.f1387g.clear();
        this.f1388h.mo4125a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0355d d = mo65949d(childAt);
            d.mo1458b(this, childAt);
            this.f1388h.mo4126a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo1457a(this, childAt, childAt2)) {
                        if (!this.f1388h.mo4129b(childAt2)) {
                            this.f1388h.mo4126a(childAt2);
                        }
                        this.f1388h.mo4127a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1387g.addAll(this.f1388h.mo4128b());
        Collections.reverse(this.f1387g);
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1386e = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public void onStopNestedScroll(View view) {
        mo1401b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1445g();
    }

    /* renamed from: e */
    private boolean m1442e(View view) {
        return this.f1388h.mo4132e(view);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0355d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m1414a(layoutParams);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0683b.m2903a(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1401u) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0355d generateLayoutParams(AttributeSet attributeSet) {
        return new C0355d(getContext(), attributeSet);
    }

    /* renamed from: b */
    private int mo66382b(int i) {
        if (this.f1394n != null && i >= 0 && i < this.f1394n.length) {
            return this.f1394n[i];
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1424a(true);
        }
        boolean a = m1425a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1424a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1392l) {
            m1424a(false);
            this.f1392l = true;
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1401u != null && this.f1401u.isVisible() != z) {
            this.f1401u.setVisible(z, false);
        }
    }

    /* renamed from: a */
    private static C0355d m1414a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0355d) {
            return new C0355d((C0355d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0355d((MarginLayoutParams) layoutParams);
        }
        return new C0355d(layoutParams);
    }

    /* renamed from: b */
    private C0954ab m1427b(C0954ab abVar) {
        if (abVar.mo3724f()) {
            return abVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0991u.m4244w(childAt) && ((C0355d) childAt.getLayoutParams()).f1407a != null) {
                abVar = Behavior.m1460a(this, childAt, abVar);
                if (abVar.mo3724f()) {
                    break;
                }
            }
        }
        return abVar;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f1400t && this.f1401u != null) {
            if (this.f1399s != null) {
                i = this.f1399s.mo3719b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f1401u.setBounds(0, 0, getWidth(), i);
                this.f1401u.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        SparseArray<Parcelable> sparseArray = savedState.f1405a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = mo65949d(childAt).f1407a;
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    behavior.mo1256a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1415a(Rect rect) {
        rect.setEmpty();
        f1385f.release(rect);
    }

    /* renamed from: d */
    private static C0355d mo65949d(View view) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        if (!dVar.f1408b) {
            if (view instanceof C0352a) {
                dVar.mo1454a(((C0352a) view).getBehavior());
                dVar.f1408b = true;
            } else {
                C0353b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C0353b) cls.getAnnotation(C0353b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo1454a((Behavior) bVar.mo1448a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                dVar.f1408b = true;
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public final List<View> mo1403c(View view) {
        List c = this.f1388h.mo4130c(view);
        this.f1390j.clear();
        if (c != null) {
            this.f1390j.addAll(c);
        }
        return this.f1390j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1395o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m1425a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f1395o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r6 = (android.support.design.widget.CoordinatorLayout.C0355d) r6
            android.support.design.widget.CoordinatorLayout$Behavior r6 = r6.f1407a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f1395o
            boolean r6 = r6.mo1219a(r0, r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f1395o
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.m1424a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        if (this.f1401u != drawable) {
            Drawable drawable2 = null;
            if (this.f1401u != null) {
                this.f1401u.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f1401u = drawable2;
            if (this.f1401u != null) {
                if (this.f1401u.isStateful()) {
                    this.f1401u.setState(getDrawableState());
                }
                C0727a.m3111b(this.f1401u, C0991u.m4220h(this));
                Drawable drawable3 = this.f1401u;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.f1401u.setCallback(this);
            }
            C0991u.m4212e(this);
        }
    }

    /* renamed from: b */
    public final List<View> mo1400b(View view) {
        List d = this.f1388h.mo4131d(view);
        this.f1390j.clear();
        if (d != null) {
            this.f1390j.addAll(d);
        }
        return this.f1390j;
    }

    /* renamed from: a */
    private void m1419a(View view, Rect rect) {
        C1064r.m4635a((ViewGroup) this, view, rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hk);
    }

    /* renamed from: b */
    private static void m1430b(View view, Rect rect) {
        ((C0355d) view.getLayoutParams()).mo1453a(rect);
    }

    /* renamed from: c */
    private static void m1434c(View view, Rect rect) {
        rect.set(((C0355d) view.getLayoutParams()).f1420n);
    }

    /* renamed from: d */
    private static void m1438d(View view, int i) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        if (dVar.f1415i != i) {
            C0991u.m4225i(view, i - dVar.f1415i);
            dVar.f1415i = i;
        }
    }

    /* renamed from: e */
    private static void m1441e(View view, int i) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        if (dVar.f1416j != i) {
            C0991u.m4222h(view, i - dVar.f1416j);
            dVar.f1416j = i;
        }
    }

    /* renamed from: f */
    private void m1444f(View view, int i) {
        View view2 = view;
        C0355d dVar = (C0355d) view.getLayoutParams();
        if (dVar.f1417k != null) {
            Rect a = mo1011a();
            Rect a2 = mo1011a();
            Rect a3 = mo1011a();
            m1419a(dVar.f1417k, a);
            boolean z = false;
            m1422a(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m1418a(view, i, a, a3, dVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m1416a(dVar, a3, measuredWidth, measuredHeight);
            int i2 = a3.left - a2.left;
            int i3 = a3.top - a2.top;
            if (i2 != 0) {
                C0991u.m4225i(view2, i2);
            }
            if (i3 != 0) {
                C0991u.m4222h(view2, i3);
            }
            if (z) {
                Behavior behavior = dVar.f1407a;
                if (behavior != null) {
                    behavior.mo1207b(this, view2, dVar.f1417k);
                }
            }
            m1415a(a);
            m1415a(a2);
            m1415a(a3);
        }
    }

    /* renamed from: c */
    private void m1433c(View view, int i) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        Rect a = mo1011a();
        a.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f1399s != null && C0991u.m4244w(this) && !C0991u.m4244w(view)) {
            a.left += this.f1399s.mo3717a();
            a.top += this.f1399s.mo3719b();
            a.right -= this.f1399s.mo3720c();
            a.bottom -= this.f1399s.mo3721d();
        }
        Rect a2 = mo1011a();
        C0972e.m4110a(m1431c(dVar.f1409c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m1415a(a);
        m1415a(a2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        if (r0.mo1263a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo1013b()
            r30.mo1014c()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = android.support.p022v4.view.C0991u.m4220h(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.view.ab r3 = r7.f1399s
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p022v4.view.C0991u.m4244w(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1387g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016e
            java.util.List<android.view.View> r0 = r7.f1387g
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0160
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$d r1 = (android.support.design.widget.CoordinatorLayout.C0355d) r1
            int r0 = r1.f1411e
            if (r0 < 0) goto L_0x00b4
            if (r13 == 0) goto L_0x00b4
            int r0 = r1.f1411e
            int r0 = r7.mo66382b(r0)
            int r11 = r1.f1409c
            int r11 = m1435d(r11)
            int r11 = android.support.p022v4.view.C0972e.m4109a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0091
            if (r12 == 0) goto L_0x0096
        L_0x0091:
            r2 = 5
            if (r11 != r2) goto L_0x00a2
            if (r12 == 0) goto L_0x00a2
        L_0x0096:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00b9
        L_0x00a2:
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00ab
        L_0x00a6:
            r2 = 3
            if (r11 != r2) goto L_0x00b6
            if (r12 == 0) goto L_0x00b6
        L_0x00ab:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00b9
        L_0x00b4:
            r22 = r2
        L_0x00b6:
            r11 = 0
            r21 = 0
        L_0x00b9:
            if (r19 == 0) goto L_0x00eb
            boolean r0 = android.support.p022v4.view.C0991u.m4244w(r20)
            if (r0 != 0) goto L_0x00eb
            android.support.v4.view.ab r0 = r7.f1399s
            int r0 = r0.mo3717a()
            android.support.v4.view.ab r2 = r7.f1399s
            int r2 = r2.mo3720c()
            int r0 = r0 + r2
            android.support.v4.view.ab r2 = r7.f1399s
            int r2 = r2.mo3719b()
            android.support.v4.view.ab r11 = r7.f1399s
            int r11 = r11.mo3721d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00ef
        L_0x00eb:
            r11 = r31
            r23 = r32
        L_0x00ef:
            android.support.design.widget.CoordinatorLayout$Behavior r0 = r1.f1407a
            if (r0 == 0) goto L_0x0114
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo1263a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x012d
            goto L_0x0120
        L_0x0114:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0120:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo1395a(r1, r2, r3, r4, r5)
        L_0x012d:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            goto L_0x0167
        L_0x0160:
            r1 = r2
            r11 = r3
            r2 = r4
            r22 = r5
            r29 = r6
        L_0x0167:
            r2 = r1
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016e:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    public final void mo1401b(View view, int i) {
        this.f1403w.mo3775a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0355d dVar = (C0355d) childAt.getLayoutParams();
            if (dVar.mo1460b(i)) {
                Behavior behavior = dVar.f1407a;
                if (behavior != null) {
                    behavior.mo1257a(this, childAt, view, i);
                }
                dVar.mo1451a(i);
                dVar.mo1462d();
            }
        }
        this.f1396p = null;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1402b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1399a(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C0355d) view.getLayoutParams()).f1407a;
        if (behavior == null || !behavior.mo1277a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0355d dVar = (C0355d) childAt.getLayoutParams();
                if (dVar.mo1460b(0)) {
                    Behavior behavior = dVar.f1407a;
                    if (behavior != null) {
                        z |= behavior.mo1354a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f1387g = new ArrayList();
        this.f1388h = new C1046g<>();
        this.f1389i = new ArrayList();
        this.f1390j = new ArrayList();
        this.f1391k = new int[2];
        this.f1403w = new C0982n(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R.style.ri);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1394n = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1394n.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1394n;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1401u = typedArray.getDrawable(1);
        typedArray.recycle();
        m1445g();
        super.setOnHierarchyChangeListener(new C0354c());
    }

    /* renamed from: a */
    static Behavior m1412a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1381a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f1381a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f1383c.get();
            if (map == null) {
                map = new HashMap();
                f1383c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f1382b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: b */
    private void m1429b(View view, int i, int i2) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        int a = C0972e.m4109a(m1435d(dVar.f1409c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = mo66382b(i) - measuredWidth;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1397a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m1416a(C0355d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m1417a(View view, int i, Rect rect, Rect rect2) {
        C0355d dVar = (C0355d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1418a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m1416a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: b */
    public final void mo1402b(View view, View view2, int i, int i2) {
        this.f1403w.mo3777a(view, view2, i, i2);
        this.f1396p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    /* renamed from: a */
    public final void mo1395a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1396a(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int h = C0991u.m4220h(this);
        int size = this.f1387g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1387g.get(i5);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((C0355d) view.getLayoutParams()).f1407a;
                if (behavior == null || !behavior.mo684a(this, view, h)) {
                    mo1394a(view, h);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1418a(View view, int i, Rect rect, Rect rect2, C0355d dVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0972e.m4109a(m1439e(dVar.f1409c), i);
        int a2 = C0972e.m4109a(m1431c(dVar.f1410d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }
}
