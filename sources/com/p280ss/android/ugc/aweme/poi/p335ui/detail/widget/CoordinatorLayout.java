package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.coreui.R$styleable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.p023a.C0534a;
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
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.utils.C43134fm;
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

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: a */
    static final String f92753a;

    /* renamed from: b */
    static final Class<?>[] f92754b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f92755c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f92756d;

    /* renamed from: f */
    private static final C0887a<Rect> f92757f = new SynchronizedPool(12);

    /* renamed from: e */
    OnHierarchyChangeListener f92758e;

    /* renamed from: g */
    private final List<View> f92759g;

    /* renamed from: h */
    private final C35373a<View> f92760h;

    /* renamed from: i */
    private final List<View> f92761i;

    /* renamed from: j */
    private final List<View> f92762j;

    /* renamed from: k */
    private final int[] f92763k;

    /* renamed from: l */
    private Paint f92764l;

    /* renamed from: m */
    private boolean f92765m;

    /* renamed from: n */
    private boolean f92766n;

    /* renamed from: o */
    private int[] f92767o;

    /* renamed from: p */
    private View f92768p;

    /* renamed from: q */
    private View f92769q;

    /* renamed from: r */
    private C35371e f92770r;

    /* renamed from: s */
    private boolean f92771s;

    /* renamed from: t */
    private C0954ab f92772t;

    /* renamed from: u */
    private boolean f92773u;

    /* renamed from: v */
    private Drawable f92774v;

    /* renamed from: w */
    private C0983o f92775w;

    /* renamed from: x */
    private final C0982n f92776x;

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b */
    public @interface C7192b {
        /* renamed from: a */
        Class<? extends Behavior> mo18670a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C0954ab onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C0954ab abVar) {
            return abVar;
        }

        public void onAttachedToLayoutParams(C35370d dVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void toggleAppBarLayout(CoordinatorLayout coordinatorLayout, V v, int i) {
        }

        public static Object getTag(View view) {
            return ((C35370d) view.getLayoutParams()).f92794o;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public static void setTag(View view, Object obj) {
            ((C35370d) view.getLayoutParams()).f92794o = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m114220a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m114218a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m114218a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m114220a(i);
            }

            /* renamed from: a */
            private static SavedState m114219a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m114219a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f92778a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f92778a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f92778a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            if (this.f92778a != null) {
                i2 = this.f92778a.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f92778a.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f92778a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$a */
    public interface C35368a {
        /* renamed from: a */
        Behavior mo90067a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$c */
    class C35369c implements OnHierarchyChangeListener {
        C35369c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f92758e != null) {
                CoordinatorLayout.this.f92758e.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo90012a(2);
            if (CoordinatorLayout.this.f92758e != null) {
                CoordinatorLayout.this.f92758e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d */
    public static class C35370d extends MarginLayoutParams {

        /* renamed from: a */
        public Behavior f92780a;

        /* renamed from: b */
        boolean f92781b;

        /* renamed from: c */
        public int f92782c;

        /* renamed from: d */
        public int f92783d;

        /* renamed from: e */
        public int f92784e = -1;

        /* renamed from: f */
        public int f92785f = -1;

        /* renamed from: g */
        public int f92786g;

        /* renamed from: h */
        public int f92787h;

        /* renamed from: i */
        int f92788i;

        /* renamed from: j */
        int f92789j;

        /* renamed from: k */
        View f92790k;

        /* renamed from: l */
        View f92791l;

        /* renamed from: m */
        public boolean f92792m;

        /* renamed from: n */
        public final Rect f92793n = new Rect();

        /* renamed from: o */
        Object f92794o;

        /* renamed from: p */
        private boolean f92795p;

        /* renamed from: q */
        private boolean f92796q;

        /* renamed from: r */
        private boolean f92797r;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo90079c() {
            this.f92795p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo90080d() {
            this.f92792m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo90078b() {
            if (this.f92780a == null) {
                this.f92795p = false;
            }
            return this.f92795p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo90074a() {
            if (this.f92790k != null || this.f92785f == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90070a(int i) {
            mo90071a(i, false);
        }

        public C35370d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90072a(Rect rect) {
            this.f92793n.set(rect);
        }

        public C35370d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public final void mo90073a(Behavior behavior) {
            if (this.f92780a != behavior) {
                if (this.f92780a != null) {
                    this.f92780a.onDetachedFromLayoutParams();
                }
                this.f92780a = behavior;
                this.f92794o = null;
                this.f92781b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public C35370d(C35370d dVar) {
            super(dVar);
        }

        public C35370d(int i, int i2) {
            super(-2, -2);
        }

        /* renamed from: a */
        private boolean m114223a(View view, int i) {
            int a = C0972e.m4109a(((C35370d) view.getLayoutParams()).f92786g, i);
            if (a == 0 || (C0972e.m4109a(this.f92787h, i) & a) != a) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final View mo90077b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f92785f == -1) {
                this.f92791l = null;
                this.f92790k = null;
                return null;
            }
            if (this.f92790k == null || !m114224b(view, coordinatorLayout)) {
                m114222a(view, coordinatorLayout);
            }
            return this.f92790k;
        }

        /* renamed from: b */
        private boolean m114224b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f92790k.getId() != this.f92785f) {
                return false;
            }
            View view2 = this.f92790k;
            for (ViewParent parent = this.f92790k.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f92791l = null;
                    this.f92790k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f92791l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90071a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f92796q = z;
                    return;
                case 1:
                    this.f92797r = z;
                    break;
            }
        }

        C35370d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.f92782c = obtainStyledAttributes.getInteger(0, 0);
            this.f92785f = obtainStyledAttributes.getResourceId(1, -1);
            this.f92783d = obtainStyledAttributes.getInteger(2, 0);
            this.f92784e = obtainStyledAttributes.getInteger(6, -1);
            this.f92786g = obtainStyledAttributes.getInt(5, 0);
            this.f92787h = obtainStyledAttributes.getInt(4, 0);
            this.f92781b = obtainStyledAttributes.hasValue(3);
            if (this.f92781b) {
                this.f92780a = CoordinatorLayout.m114167a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            if (this.f92780a != null) {
                this.f92780a.onAttachedToLayoutParams(this);
            }
        }

        /* renamed from: a */
        private void m114222a(View view, CoordinatorLayout coordinatorLayout) {
            this.f92790k = coordinatorLayout.findViewById(this.f92785f);
            if (this.f92790k != null) {
                if (this.f92790k != coordinatorLayout) {
                    View view2 = this.f92790k;
                    ViewParent parent = this.f92790k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f92791l = null;
                            this.f92790k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f92791l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f92791l = null;
                    this.f92790k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f92791l = null;
                this.f92790k = null;
            } else {
                StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f92785f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo90075a(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            if (this.f92795p) {
                return true;
            }
            boolean z2 = this.f92795p;
            if (this.f92780a != null) {
                z = this.f92780a.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f92795p = z3;
            return z3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo90076a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f92791l || m114223a(view2, C0991u.m4220h(coordinatorLayout)) || (this.f92780a != null && this.f92780a.layoutDependsOn(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e */
    class C35371e implements OnPreDrawListener {
        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo90012a(0);
            return true;
        }

        C35371e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$f */
    static class C35372f implements Comparator<View> {
        C35372f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m114236a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m114236a(View view, View view2) {
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
    private static int m114186c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m114190d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m114194e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public final C0954ab getLastWindowInsets() {
        return this.f92772t;
    }

    public Drawable getStatusBarBackground() {
        return this.f92774v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0954ab mo90010a(C0954ab abVar) {
        if (C0901h.m3836a(this.f92772t, abVar)) {
            return abVar;
        }
        this.f92772t = abVar;
        boolean z = true;
        this.f92773u = abVar != null && abVar.mo3719b() > 0;
        if (this.f92773u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0954ab b = m114183b(abVar);
        requestLayout();
        return b;
    }

    /* renamed from: a */
    private void m114179a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C35370d) getChildAt(i2).getLayoutParams()).mo90079c();
        }
        this.f92768p = null;
        this.f92765m = false;
    }

    /* renamed from: a */
    private void m114178a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f92756d != null) {
            Collections.sort(list, f92756d);
        }
    }

    /* renamed from: a */
    private boolean m114180a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f92761i;
        m114178a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C35370d dVar = (C35370d) view.getLayoutParams();
            Behavior behavior = dVar.f92780a;
            if ((z || z2) && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            behavior.onInterceptTouchEvent(this, view, motionEvent3);
                            break;
                        case 1:
                            behavior.onTouchEvent(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && behavior != null) {
                    switch (i) {
                        case 0:
                            z = behavior.onInterceptTouchEvent(this, view, motionEvent2);
                            break;
                        case 1:
                            z = behavior.onTouchEvent(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f92768p = view;
                    }
                }
                boolean b = dVar.mo90078b();
                boolean a = dVar.mo90075a(this, view);
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
    public final void mo90014a(View view, int i) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (dVar.mo90074a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (dVar.f92790k != null) {
            m114175a(view, dVar.f92790k, i);
        } else if (dVar.f92784e >= 0) {
            m114184b(view, dVar.f92784e, i);
        } else {
            m114188c(view, i);
        }
    }

    /* renamed from: a */
    private void m114176a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m114173a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m114177a(C35370d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90012a(int i) {
        boolean z;
        int i2 = i;
        int h = C0991u.m4220h(this);
        int size = this.f92759g.size();
        Rect b = m114182b();
        Rect b2 = m114182b();
        Rect b3 = m114182b();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f92759g.get(i3);
            C35370d dVar = (C35370d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (dVar.f92791l == ((View) this.f92759g.get(i4))) {
                        m114200f(view, h);
                    }
                }
                m114176a(view, true, b2);
                if (dVar.f92786g != 0 && !b2.isEmpty()) {
                    int a = C0972e.m4109a(dVar.f92786g, h);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        b.top = Math.max(b.top, b2.bottom);
                    } else if (i5 == 80) {
                        b.bottom = Math.max(b.bottom, getHeight() - b2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        b.left = Math.max(b.left, b2.right);
                    } else if (i6 == 5) {
                        b.right = Math.max(b.right, getWidth() - b2.left);
                    }
                }
                if (dVar.f92787h != 0 && view.getVisibility() == 0) {
                    m114174a(view, b, h);
                }
                if (i2 != 2) {
                    m114189c(view, b3);
                    if (!b3.equals(b2)) {
                        m114185b(view, b2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f92759g.get(i7);
                    C35370d dVar2 = (C35370d) view2.getLayoutParams();
                    Behavior behavior = dVar2.f92780a;
                    if (behavior != null && behavior.layoutDependsOn(this, view2, view)) {
                        if (i2 != 0 || !dVar2.f92792m) {
                            if (i2 != 2) {
                                z = behavior.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                dVar2.f92792m = z;
                            }
                        } else {
                            dVar2.mo90080d();
                        }
                    }
                }
            }
        }
        m114170a(b);
        m114170a(b2);
        m114170a(b3);
    }

    /* renamed from: a */
    public final void mo90013a(View view) {
        List c = this.f92760h.mo90088c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior behavior = ((C35370d) view2.getLayoutParams()).f92780a;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo90016a(View view, int i, int i2) {
        Rect b = m114182b();
        m114173a(view, b);
        try {
            return b.contains(i, i2);
        } finally {
            m114170a(b);
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
                C35370d dVar = (C35370d) childAt.getLayoutParams();
                Behavior behavior = dVar.f92780a;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    boolean z2 = z | onStartNestedScroll;
                    dVar.mo90071a(i3, onStartNestedScroll);
                    StringBuilder sb = new StringBuilder("CoordinatorLayout---onStartNestedScroll...");
                    sb.append(onStartNestedScroll);
                    sb.append("/");
                    sb.append(i);
                    z = z2;
                } else {
                    int i5 = i;
                    dVar.mo90071a(i3, false);
                }
            } else {
                int i6 = i;
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
                Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
                if (behavior != null) {
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo90012a(1);
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
                Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
                if (behavior != null) {
                    int[] iArr2 = this.f92763k;
                    this.f92763k[1] = 0;
                    iArr2[0] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, this.f92763k, i3);
                    if (i > 0) {
                        i4 = Math.max(i6, this.f92763k[0]);
                    } else {
                        i4 = Math.min(i6, this.f92763k[0]);
                    }
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.f92763k[1]);
                    } else {
                        i5 = Math.min(i7, this.f92763k[1]);
                    }
                    i6 = i4;
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo90012a(1);
        }
    }

    /* renamed from: a */
    public final void mo90011a() {
        mo1401b(this.f92769q, 1);
        m114199f(1);
    }

    /* renamed from: g */
    private static C35370d m114201g() {
        return new C35370d(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m114201g();
    }

    public int getNestedScrollAxes() {
        return this.f92776x.f3402a;
    }

    /* renamed from: b */
    private static Rect m114182b() {
        Rect rect = (Rect) f92757f.acquire();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m114187c();
        return Collections.unmodifiableList(this.f92759g);
    }

    /* renamed from: e */
    private void m114195e() {
        if (this.f92766n) {
            if (this.f92770r == null) {
                this.f92770r = new C35371e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f92770r);
        }
        this.f92771s = true;
    }

    /* renamed from: f */
    private void m114198f() {
        if (this.f92766n && this.f92770r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f92770r);
        }
        this.f92771s = false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f92774v;
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

    /* renamed from: d */
    private void m114192d() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m114197e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f92771s) {
            if (z) {
                m114195e();
                return;
            }
            m114198f();
        }
    }

    /* renamed from: h */
    private void m114202h() {
        if (VERSION.SDK_INT >= 21) {
            if (C0991u.m4244w(this)) {
                if (this.f92775w == null) {
                    this.f92775w = new C0983o() {
                        /* renamed from: a */
                        public final C0954ab mo1183a(View view, C0954ab abVar) {
                            return CoordinatorLayout.this.mo90010a(abVar);
                        }
                    };
                }
                C0991u.m4188a((View) this, this.f92775w);
                setSystemUiVisibility(1280);
                return;
            }
            C0991u.m4188a((View) this, (C0983o) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m114179a(false);
        if (this.f92771s) {
            if (this.f92770r == null) {
                this.f92770r = new C35371e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f92770r);
        }
        if (this.f92772t == null && C0991u.m4244w(this)) {
            C0991u.m4243v(this);
        }
        this.f92766n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m114179a(false);
        if (this.f92771s && this.f92770r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f92770r);
        }
        if (this.f92769q != null) {
            onStopNestedScroll(this.f92769q);
        }
        this.f92766n = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
            if (!(id == -1 || behavior == null)) {
                Parcelable onSaveInstanceState = behavior.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    sparseArray.append(id, onSaveInstanceState);
                }
            }
        }
        savedState.f92778a = sparseArray;
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
        f92753a = str;
        if (VERSION.SDK_INT >= 21) {
            f92756d = new C35372f();
        } else {
            f92756d = null;
        }
    }

    /* renamed from: c */
    private void m114187c() {
        this.f92759g.clear();
        this.f92760h.mo90083a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C35370d d = m114191d(childAt);
            d.mo90077b(this, childAt);
            this.f92760h.mo90084a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo90076a(this, childAt, childAt2)) {
                        if (!this.f92760h.mo90087b(childAt2)) {
                            this.f92760h.mo90084a(childAt2);
                        }
                        this.f92760h.mo90085a(childAt2, childAt);
                    }
                }
            }
        }
        this.f92759g.addAll(this.f92760h.mo90086b());
        Collections.reverse(this.f92759g);
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f92758e = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public void onStopNestedScroll(View view) {
        mo1401b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m114202h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C35370d generateLayoutParams(AttributeSet attributeSet) {
        return new C35370d(getContext(), attributeSet);
    }

    /* renamed from: e */
    private boolean m114197e(View view) {
        return this.f92760h.mo90090e(view);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        if (!(layoutParams instanceof C35370d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m114169a(layoutParams);
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
        if (super.verifyDrawable(drawable) || drawable == this.f92774v) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C35370d m114169a(LayoutParams layoutParams) {
        if (layoutParams instanceof C35370d) {
            return new C35370d((C35370d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C35370d((MarginLayoutParams) layoutParams);
        }
        return new C35370d(layoutParams);
    }

    /* renamed from: b */
    private int m114181b(int i) {
        if (this.f92767o != null && i >= 0 && i < this.f92767o.length) {
            return this.f92767o[i];
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m114179a(true);
        }
        boolean a = m114180a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m114179a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f92765m) {
            m114179a(false);
            this.f92765m = true;
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
        if (this.f92774v != null && this.f92774v.isVisible() != z) {
            this.f92774v.setVisible(z, false);
        }
    }

    /* renamed from: a */
    private static void m114170a(Rect rect) {
        rect.setEmpty();
        f92757f.release(rect);
    }

    /* renamed from: b */
    private C0954ab m114183b(C0954ab abVar) {
        if (abVar.mo3724f()) {
            return abVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0991u.m4244w(childAt)) {
                Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
                if (behavior != null) {
                    abVar = behavior.onApplyWindowInsets(this, childAt, abVar);
                    if (abVar.mo3724f()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return abVar;
    }

    /* renamed from: f */
    private void m114199f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C35370d) getChildAt(i2).getLayoutParams()).mo90071a(1, true);
        }
    }

    /* renamed from: c */
    public final List<View> mo90018c(View view) {
        List c = this.f92760h.mo90088c(view);
        this.f92762j.clear();
        if (c != null) {
            this.f92762j.addAll(c);
        }
        return this.f92762j;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f92773u && this.f92774v != null) {
            if (this.f92772t != null) {
                i = this.f92772t.mo3719b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f92774v.setBounds(0, 0, getWidth(), i);
                this.f92774v.draw(canvas);
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
        SparseArray<Parcelable> sparseArray = savedState.f92778a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m114191d(childAt).f92780a;
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    behavior.onRestoreInstanceState(this, childAt, parcelable2);
                }
            }
        }
    }

    /* renamed from: d */
    private static C35370d m114191d(View view) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (!dVar.f92781b) {
            if (view instanceof C35368a) {
                dVar.mo90073a(((C35368a) view).mo90067a());
                dVar.f92781b = true;
            } else {
                C7192b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C7192b) cls.getAnnotation(C7192b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo90073a((Behavior) bVar.mo18670a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                dVar.f92781b = true;
            }
        }
        return dVar;
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
            android.view.View r3 = r0.f92768p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m114180a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f92768p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r6 = (com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d) r6
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r6 = r6.f92780a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f92768p
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f92768p
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
            r0.m114179a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        if (this.f92774v != drawable) {
            Drawable drawable2 = null;
            if (this.f92774v != null) {
                this.f92774v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f92774v = drawable2;
            if (this.f92774v != null) {
                if (this.f92774v.isStateful()) {
                    this.f92774v.setState(getDrawableState());
                }
                C0727a.m3111b(this.f92774v, C0991u.m4220h(this));
                Drawable drawable3 = this.f92774v;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.f92774v.setCallback(this);
            }
            C0991u.m4212e(this);
        }
    }

    /* renamed from: b */
    public final List<View> mo90017b(View view) {
        List d = this.f92760h.mo90089d(view);
        this.f92762j.clear();
        if (d != null) {
            this.f92762j.addAll(d);
        }
        return this.f92762j;
    }

    /* renamed from: a */
    private void m114173a(View view, Rect rect) {
        C43134fm.m136821a((ViewGroup) this, view, rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hk);
    }

    /* renamed from: c */
    private static void m114189c(View view, Rect rect) {
        rect.set(((C35370d) view.getLayoutParams()).f92793n);
    }

    /* renamed from: d */
    private static void m114193d(View view, int i) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (dVar.f92788i != i) {
            C0991u.m4225i(view, i - dVar.f92788i);
            dVar.f92788i = i;
        }
    }

    /* renamed from: e */
    private static void m114196e(View view, int i) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (dVar.f92789j != i) {
            C0991u.m4222h(view, i - dVar.f92789j);
            dVar.f92789j = i;
        }
    }

    /* renamed from: f */
    private void m114200f(View view, int i) {
        View view2 = view;
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (dVar.f92790k != null) {
            Rect b = m114182b();
            Rect b2 = m114182b();
            Rect b3 = m114182b();
            m114173a(dVar.f92790k, b);
            boolean z = false;
            m114176a(view2, false, b2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m114172a(view, i, b, b3, dVar, measuredWidth, measuredHeight);
            if (!(b3.left == b2.left && b3.top == b2.top)) {
                z = true;
            }
            m114177a(dVar, b3, measuredWidth, measuredHeight);
            int i2 = b3.left - b2.left;
            int i3 = b3.top - b2.top;
            if (i2 != 0) {
                C0991u.m4225i(view2, i2);
            }
            if (i3 != 0) {
                C0991u.m4222h(view2, i3);
            }
            if (z) {
                Behavior behavior = dVar.f92780a;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, dVar.f92790k);
                }
            }
            m114170a(b);
            m114170a(b2);
            m114170a(b3);
        }
    }

    /* renamed from: b */
    private static void m114185b(View view, Rect rect) {
        ((C35370d) view.getLayoutParams()).mo90072a(rect);
    }

    /* renamed from: c */
    private void m114188c(View view, int i) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        Rect b = m114182b();
        b.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f92772t != null && C0991u.m4244w(this) && !C0991u.m4244w(view)) {
            b.left += this.f92772t.mo3717a();
            b.top += this.f92772t.mo3719b();
            b.right -= this.f92772t.mo3720c();
            b.bottom -= this.f92772t.mo3721d();
        }
        Rect b2 = m114182b();
        C0972e.m4110a(m114186c(dVar.f92782c), view.getMeasuredWidth(), view.getMeasuredHeight(), b, b2, i);
        view.layout(b2.left, b2.top, b2.right, b2.bottom);
        m114170a(b);
        m114170a(b2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m114187c()
            r30.m114192d()
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
            android.support.v4.view.ab r3 = r7.f92772t
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p022v4.view.C0991u.m4244w(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f92759g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016e
            java.util.List<android.view.View> r0 = r7.f92759g
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0160
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r1 = (com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d) r1
            int r0 = r1.f92784e
            if (r0 < 0) goto L_0x00b4
            if (r13 == 0) goto L_0x00b4
            int r0 = r1.f92784e
            int r0 = r7.m114181b(r0)
            int r11 = r1.f92782c
            int r11 = m114190d(r11)
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
            android.support.v4.view.ab r0 = r7.f92772t
            int r0 = r0.mo3717a()
            android.support.v4.view.ab r2 = r7.f92772t
            int r2 = r2.mo3720c()
            int r0 = r0 + r2
            android.support.v4.view.ab r2 = r7.f92772t
            int r2 = r2.mo3719b()
            android.support.v4.view.ab r11 = r7.f92772t
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
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r0 = r1.f92780a
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
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
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
            r0.mo90015a(r1, r2, r3, r4, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    public final void mo1401b(View view, int i) {
        this.f92776x.mo3775a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C35370d dVar = (C35370d) childAt.getLayoutParams();
            Behavior behavior = dVar.f92780a;
            if (behavior != null) {
                behavior.onStopNestedScroll(this, childAt, view, i);
            }
            dVar.mo90070a(i);
            dVar.mo90080d();
        }
        this.f92769q = null;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1402b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1399a(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C35370d) view.getLayoutParams()).f92780a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
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
                Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
                if (behavior != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f92759g = new ArrayList();
        this.f92760h = new C35373a<>();
        this.f92761i = new ArrayList();
        this.f92762j = new ArrayList();
        this.f92763k = new int[2];
        this.f92776x = new C0982n(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R.style.ri);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f92767o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f92767o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f92767o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f92774v = typedArray.getDrawable(1);
        typedArray.recycle();
        m114202h();
        super.setOnHierarchyChangeListener(new C35369c());
    }

    /* renamed from: b */
    private void m114184b(View view, int i, int i2) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        int a = C0972e.m4109a(m114190d(dVar.f92782c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m114181b(i) - measuredWidth;
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

    /* renamed from: a */
    static Behavior m114167a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f92753a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f92753a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f92755c.get();
            if (map == null) {
                map = new HashMap();
                f92755c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f92754b);
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

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        if (dVar.f92780a != null) {
            float scrimOpacity = dVar.f92780a.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f92764l == null) {
                    this.f92764l = new Paint();
                }
                this.f92764l.setColor(dVar.f92780a.getScrimColor(this, view));
                this.f92764l.setAlpha(C0534a.m2233a(Math.round(scrimOpacity * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f92764l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m114174a(android.view.View r9, android.graphics.Rect r10, int r11) {
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
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r0 = (com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d) r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r1 = r0.f92780a
            android.graphics.Rect r2 = m114182b()
            android.graphics.Rect r3 = m114182b()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006b
            boolean r1 = r1.getInsetDodgeRect(r8, r9, r2)
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
            m114170a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x007b
            m114170a(r2)
            return
        L_0x007b:
            int r1 = r0.f92787h
            int r11 = android.support.p022v4.view.C0972e.m4109a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x009d
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f92789j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x009d
            int r3 = r10.top
            int r3 = r3 - r1
            m114196e(r9, r3)
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
            int r6 = r0.f92789j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bc
            int r1 = r10.bottom
            int r3 = r3 - r1
            m114196e(r9, r3)
            r1 = 1
        L_0x00bc:
            if (r1 != 0) goto L_0x00c1
            m114196e(r9, r5)
        L_0x00c1:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00da
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f92788i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00da
            int r3 = r10.left
            int r3 = r3 - r1
            m114193d(r9, r3)
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
            int r0 = r0.f92788i
            int r11 = r11 + r0
            int r0 = r10.right
            if (r11 >= r0) goto L_0x00f7
            int r10 = r10.right
            int r11 = r11 - r10
            m114193d(r9, r11)
            r1 = 1
        L_0x00f7:
            if (r1 != 0) goto L_0x00fc
            m114193d(r9, r5)
        L_0x00fc:
            m114170a(r2)
            return
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.m114174a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    private void m114175a(View view, View view2, int i) {
        view.getLayoutParams();
        Rect b = m114182b();
        Rect b2 = m114182b();
        try {
            m114173a(view2, b);
            m114171a(view, i, b, b2);
            view.layout(b2.left, b2.top, b2.right, b2.bottom);
        } finally {
            m114170a(b);
            m114170a(b2);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1397a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
                if (behavior != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo90012a(1);
        }
        return z2;
    }

    /* renamed from: a */
    private void m114171a(View view, int i, Rect rect, Rect rect2) {
        C35370d dVar = (C35370d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m114172a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m114177a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: b */
    public final void mo1402b(View view, View view2, int i, int i2) {
        this.f92776x.mo3777a(view, view2, i, i2);
        this.f92769q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Behavior behavior = ((C35370d) childAt.getLayoutParams()).f92780a;
            if (behavior != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo90015a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1396a(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int h = C0991u.m4220h(this);
        int size = this.f92759g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f92759g.get(i5);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((C35370d) view.getLayoutParams()).f92780a;
                if (behavior == null || !behavior.onLayoutChild(this, view, h)) {
                    mo90014a(view, h);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m114172a(View view, int i, Rect rect, Rect rect2, C35370d dVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0972e.m4109a(m114194e(dVar.f92782c), i);
        int a2 = C0972e.m4109a(m114186c(dVar.f92783d), i);
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
