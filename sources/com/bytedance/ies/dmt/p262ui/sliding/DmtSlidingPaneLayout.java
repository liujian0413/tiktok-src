package com.bytedance.ies.dmt.p262ui.sliding;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout */
public class DmtSlidingPaneLayout extends ViewGroup {

    /* renamed from: x */
    private static int f28940x = 1920;

    /* renamed from: a */
    public boolean f28941a;

    /* renamed from: b */
    View f28942b;

    /* renamed from: c */
    float f28943c;

    /* renamed from: d */
    int f28944d;

    /* renamed from: e */
    boolean f28945e;

    /* renamed from: f */
    public C10796d f28946f;

    /* renamed from: g */
    final C1060q f28947g;

    /* renamed from: h */
    boolean f28948h;

    /* renamed from: i */
    final ArrayList<C10794b> f28949i = new ArrayList<>();

    /* renamed from: j */
    private int f28950j = -858993460;

    /* renamed from: k */
    private int f28951k;

    /* renamed from: l */
    private Drawable f28952l;

    /* renamed from: m */
    private Drawable f28953m;

    /* renamed from: n */
    private final int f28954n;

    /* renamed from: o */
    private float f28955o;

    /* renamed from: p */
    private int f28956p;

    /* renamed from: q */
    private float f28957q;

    /* renamed from: r */
    private float f28958r;

    /* renamed from: s */
    private boolean f28959s = true;

    /* renamed from: t */
    private final Rect f28960t = new Rect();

    /* renamed from: u */
    private Method f28961u;

    /* renamed from: v */
    private Field f28962v;

    /* renamed from: w */
    private boolean f28963w;

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f28964e = {16843137};

        /* renamed from: a */
        public float f28965a;

        /* renamed from: b */
        boolean f28966b;

        /* renamed from: c */
        boolean f28967c;

        /* renamed from: d */
        Paint f28968d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f28964e);
            this.f28965a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m31533a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m31531a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m31531a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m31533a(i);
            }

            /* renamed from: a */
            private static SavedState m31532a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m31532a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f28969a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, null);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f28969a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f28969a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$a */
    class C10793a extends C0939a {

        /* renamed from: c */
        private final Rect f28971c = new Rect();

        /* renamed from: b */
        private boolean m31535b(View view) {
            return DmtSlidingPaneLayout.this.mo25824e(view);
        }

        C10793a() {
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DmtSlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        private void m31534a(C0945c cVar, C0945c cVar2) {
            Rect rect = this.f28971c;
            cVar2.mo3645a(rect);
            cVar.mo3653b(rect);
            cVar2.mo3661c(rect);
            cVar.mo3667d(rect);
            cVar.mo3672e(cVar2.mo3681h());
            cVar.mo3648a(cVar2.mo3697p());
            cVar.mo3656b(cVar2.mo3698q());
            cVar.mo3669d(cVar2.mo3700s());
            cVar.mo3685j(cVar2.mo3692m());
            cVar.mo3680h(cVar2.mo3688k());
            cVar.mo3665c(cVar2.mo3677f());
            cVar.mo3670d(cVar2.mo3679g());
            cVar.mo3676f(cVar2.mo3684i());
            cVar.mo3678g(cVar2.mo3686j());
            cVar.mo3683i(cVar2.mo3690l());
            cVar.mo3644a(cVar2.mo3660c());
            cVar.mo3652b(cVar2.mo3666d());
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            C0945c a = C0945c.m3984a(cVar);
            super.mo1148a(view, a);
            m31534a(cVar, a);
            a.mo3701t();
            cVar.mo3656b((CharSequence) DmtSlidingPaneLayout.class.getName());
            cVar.mo3654b(view);
            ViewParent i = C0991u.m4223i(view);
            if (i instanceof View) {
                cVar.mo3668d((View) i);
            }
            int childCount = DmtSlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = DmtSlidingPaneLayout.this.getChildAt(i2);
                if (!m31535b(childAt) && childAt.getVisibility() == 0) {
                    C0991u.m4206c(childAt, 1);
                    cVar.mo3662c(childAt);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo3630a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!m31535b(view)) {
                return super.mo3630a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$b */
    class C10794b implements Runnable {

        /* renamed from: a */
        final View f28972a;

        public final void run() {
            if (this.f28972a.getParent() == DmtSlidingPaneLayout.this) {
                this.f28972a.setLayerType(0, null);
                DmtSlidingPaneLayout.this.mo25819d(this.f28972a);
            }
            DmtSlidingPaneLayout.this.f28949i.remove(this);
        }

        C10794b(View view) {
            this.f28972a = view;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$c */
    class C10795c extends C1063a {
        C10795c() {
        }

        /* renamed from: b */
        public final int mo1578b(View view) {
            return DmtSlidingPaneLayout.this.f28944d;
        }

        /* renamed from: a */
        public final void mo1364a(int i) {
            if (DmtSlidingPaneLayout.this.f28947g.f3673a == 0) {
                if (DmtSlidingPaneLayout.this.f28943c == 0.0f) {
                    DmtSlidingPaneLayout.this.mo25816c(DmtSlidingPaneLayout.this.f28942b);
                    DmtSlidingPaneLayout.this.mo25814b(DmtSlidingPaneLayout.this.f28942b);
                    DmtSlidingPaneLayout.this.f28948h = false;
                    return;
                }
                DmtSlidingPaneLayout.this.mo25812a(DmtSlidingPaneLayout.this.f28942b);
                DmtSlidingPaneLayout.this.f28948h = true;
            }
        }

        /* renamed from: b */
        public final void mo3910b(int i, int i2) {
            DmtSlidingPaneLayout.this.f28947g.mo4154a(DmtSlidingPaneLayout.this.f28942b, i2);
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (DmtSlidingPaneLayout.this.f28945e) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f28966b;
        }

        /* renamed from: b */
        public final void mo1579b(View view, int i) {
            DmtSlidingPaneLayout.this.mo25815c();
            DmtSlidingPaneLayout.this.f28946f.mo25856c(view);
        }

        /* renamed from: a */
        public final int mo1363a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (DmtSlidingPaneLayout.this.mo25823e()) {
                int paddingRight = DmtSlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && DmtSlidingPaneLayout.this.f28943c > 0.5f)) {
                    paddingRight += DmtSlidingPaneLayout.this.f28944d;
                }
                i = (DmtSlidingPaneLayout.this.getWidth() - paddingRight) - DmtSlidingPaneLayout.this.f28942b.getWidth();
            } else {
                i = layoutParams.leftMargin + DmtSlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && DmtSlidingPaneLayout.this.f28943c > 0.5f)) {
                    i += DmtSlidingPaneLayout.this.f28944d;
                }
            }
            DmtSlidingPaneLayout.this.f28947g.mo4155a(i, view.getTop());
            DmtSlidingPaneLayout.this.invalidate();
        }

        /* renamed from: b */
        public final int mo1368b(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) DmtSlidingPaneLayout.this.f28942b.getLayoutParams();
            if (DmtSlidingPaneLayout.this.mo25823e()) {
                int width = DmtSlidingPaneLayout.this.getWidth() - ((DmtSlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + DmtSlidingPaneLayout.this.f28942b.getWidth());
                return Math.max(Math.min(i, width), width - DmtSlidingPaneLayout.this.f28944d);
            }
            int paddingLeft = DmtSlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), DmtSlidingPaneLayout.this.f28944d + paddingLeft);
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            DmtSlidingPaneLayout.this.mo25811a(i);
            DmtSlidingPaneLayout.this.invalidate();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$d */
    public interface C10796d {
        /* renamed from: a */
        void mo25853a(View view);

        /* renamed from: a */
        void mo25854a(View view, float f);

        /* renamed from: b */
        void mo25855b(View view);

        /* renamed from: c */
        void mo25856c(View view);
    }

    public int getCoveredFadeColor() {
        return this.f28951k;
    }

    public int getParallaxDistance() {
        return this.f28956p;
    }

    public int getSliderFadeColor() {
        return this.f28950j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25812a(View view) {
        if (!(this.f28946f == null || view == null)) {
            this.f28946f.mo25853a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25813a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo25813a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(mo25823e() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean mo25807a() {
        return m31518b(this.f28942b, 0);
    }

    /* renamed from: b */
    private boolean mo25808b() {
        return m31515a(this.f28942b, 0);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28959s = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo25823e() {
        if (C0991u.m4220h(this) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo25815c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void computeScroll() {
        if (this.f28947g.mo4158a(true)) {
            if (!this.f28941a) {
                this.f28947g.mo4160b();
                return;
            }
            C0991u.m4212e(this);
        }
    }

    /* renamed from: d */
    public final boolean mo25820d() {
        if (!this.f28941a || this.f28943c == 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f28941a) {
            z = mo25820d();
        } else {
            z = this.f28948h;
        }
        savedState.f28969a = z;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28959s = true;
        int size = this.f28949i.size();
        for (int i = 0; i < size; i++) {
            ((C10794b) this.f28949i.get(i)).run();
        }
        this.f28949i.clear();
    }

    public static void setHeight(int i) {
        f28940x = i;
    }

    public void setCoveredFadeColor(int i) {
        this.f28951k = i;
    }

    public void setPanelSlideListener(C10796d dVar) {
        this.f28946f = dVar;
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f28952l = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f28953m = drawable;
    }

    public void setSliderFadeColor(int i) {
        this.f28950j = i;
    }

    public void setParallaxDistance(int i) {
        this.f28956p = i;
        requestLayout();
    }

    /* renamed from: f */
    private void m31519f(View view) {
        if (this.f28946f != null && view != null) {
            this.f28946f.mo25854a(view, this.f28943c);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0683b.m2903a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0683b.m2903a(getContext(), i));
    }

    /* renamed from: a */
    public static int m31509a(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: b */
    private static Activity m31516b(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: g */
    private static boolean m31520g(View view) {
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo25824e(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f28941a || !layoutParams.f28967c || this.f28943c <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        if (savedState.f28969a) {
            mo25807a();
        } else {
            mo25808b();
        }
        this.f28948h = savedState.f28969a;
    }

    /* renamed from: a */
    private static int m31510a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31511a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo25823e()
            android.view.View r1 = r9.f28942b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r1 = (com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f28967c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x005c
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f28942b
            if (r4 == r5) goto L_0x0059
            float r5 = r9.f28955o
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f28956p
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.f28955o = r10
            float r7 = r6 - r10
            int r8 = r9.f28956p
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0045
            int r5 = -r5
        L_0x0045:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0050
            float r5 = r9.f28955o
            float r5 = r5 - r6
            goto L_0x0054
        L_0x0050:
            float r5 = r9.f28955o
            float r5 = r6 - r5
        L_0x0054:
            int r6 = r9.f28951k
            r9.m31512a(r4, r5, r6)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.m31511a(float):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25814b(View view) {
        if (!(this.f28946f == null || view == null)) {
            this.f28946f.mo25855b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo25819d(View view) {
        if (VERSION.SDK_INT >= 17) {
            C0991u.m4182a(view, ((LayoutParams) view.getLayoutParams()).f28968d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            if (!this.f28963w) {
                try {
                    this.f28961u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f28962v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f28962v.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f28963w = true;
            }
            if (this.f28961u == null || this.f28962v == null) {
                view.invalidate();
                return;
            } else {
                try {
                    this.f28962v.setBoolean(view, true);
                    this.f28961u.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        C0991u.m4179a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo25823e()) {
            drawable = this.f28953m;
        } else {
            drawable = this.f28952l;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo25823e()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28941a) {
            return super.onTouchEvent(motionEvent);
        }
        this.f28947g.mo4161b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f28957q = x;
                this.f28958r = y;
                break;
            case 1:
                if (mo25824e(this.f28942b)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f28957q;
                    float f2 = y2 - this.f28958r;
                    int i = this.f28947g.f3674b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C1060q.m4601b(this.f28942b, (int) x2, (int) y2)) {
                        m31515a(this.f28942b, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo25816c(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        View view2 = view;
        boolean e = mo25823e();
        if (e) {
            i = getWidth() - getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        if (e) {
            i2 = getPaddingLeft();
        } else {
            i2 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m31520g(view)) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i6 = view.getLeft();
            i5 = view.getRight();
            i4 = view.getTop();
            i3 = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt != view2) {
                if (childAt.getVisibility() != 8) {
                    if (e) {
                        i7 = i2;
                    } else {
                        i7 = i;
                    }
                    int max = Math.max(i7, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (e) {
                        z = e;
                        i8 = i;
                    } else {
                        z = e;
                        i8 = i2;
                    }
                    int min = Math.min(i8, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max < i6 || max2 < i4 || min > i5 || min2 > i3) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    childAt.setVisibility(i9);
                } else {
                    z = e;
                }
                i10++;
                e = z;
                view2 = view;
            } else {
                return;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f28941a && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f28948h = !C1060q.m4601b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f28941a || (this.f28945e && actionMasked != 0)) {
            this.f28947g.mo4152a();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f28947g.mo4152a();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f28945e = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f28957q = x;
                this.f28958r = y;
                if (C1060q.m4601b(this.f28942b, (int) x, (int) y) && mo25824e(this.f28942b)) {
                    z = true;
                    if (!this.f28947g.mo4156a(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f28957q);
                float abs2 = Math.abs(y2 - this.f28958r);
                if (abs > ((float) this.f28947g.f3674b) && abs2 > abs) {
                    this.f28947g.mo4152a();
                    this.f28945e = true;
                    return false;
                }
            }
            z = false;
            if (!this.f28947g.mo4156a(motionEvent)) {
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25811a(int i) {
        int i2;
        int i3;
        if (this.f28942b == null) {
            this.f28943c = 0.0f;
            return;
        }
        boolean e = mo25823e();
        LayoutParams layoutParams = (LayoutParams) this.f28942b.getLayoutParams();
        int width = this.f28942b.getWidth();
        if (e) {
            i = (getWidth() - i) - width;
        }
        if (e) {
            i2 = getPaddingRight();
        } else {
            i2 = getPaddingLeft();
        }
        if (e) {
            i3 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.leftMargin;
        }
        this.f28943c = ((float) (i - (i2 + i3))) / ((float) this.f28944d);
        if (this.f28956p != 0) {
            m31511a(this.f28943c);
        }
        if (layoutParams.f28967c) {
            m31512a(this.f28942b, this.f28943c, this.f28950j);
        }
        m31519f(this.f28942b);
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f28941a) {
            if (view == this.f28942b) {
                z = true;
            } else {
                z = false;
            }
            this.f28948h = z;
        }
    }

    /* renamed from: b */
    private boolean m31518b(View view, int i) {
        if (!this.f28959s && !m31514a(1.0f, 0)) {
            return false;
        }
        this.f28948h = true;
        return true;
    }

    /* renamed from: a */
    private boolean m31514a(float f, int i) {
        int i2;
        if (!this.f28941a) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f28942b.getLayoutParams();
        if (mo25823e()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f28944d))) + ((float) this.f28942b.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f28944d)));
        }
        if (!this.f28947g.mo4157a(this.f28942b, i2, this.f28942b.getTop())) {
            return false;
        }
        mo25815c();
        C0991u.m4212e(this);
        return true;
    }

    /* renamed from: a */
    private boolean m31515a(View view, int i) {
        if (!this.f28959s && !m31514a(0.0f, 0)) {
            return false;
        }
        this.f28948h = false;
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            android.content.Context r1 = r20.getContext()
            android.app.Activity r1 = m31516b(r1)
            int r2 = m31509a(r1)
            if (r2 != 0) goto L_0x0013
            int r2 = f28940x
            goto L_0x0017
        L_0x0013:
            int r2 = m31509a(r1)
        L_0x0017:
            int r3 = android.view.View.MeasureSpec.getMode(r21)
            int r4 = android.view.View.MeasureSpec.getSize(r21)
            int r5 = android.view.View.MeasureSpec.getMode(r22)
            int r1 = m31510a(r1)
            int r2 = r2 + r1
            r1 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 == r7) goto L_0x0045
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x003d
            if (r3 == r6) goto L_0x005c
            if (r3 != 0) goto L_0x005c
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x005c
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            if (r5 != 0) goto L_0x005c
            boolean r3 = r20.isInEditMode()
            if (r3 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x005c
            r2 = 300(0x12c, float:4.2E-43)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005c
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x005c:
            r1 = 0
            if (r5 == r6) goto L_0x0070
            if (r5 == r7) goto L_0x0064
            r2 = 0
            r3 = 0
            goto L_0x007c
        L_0x0064:
            int r3 = r20.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r20.getPaddingBottom()
            int r2 = r2 - r3
            r3 = r2
            goto L_0x007c
        L_0x0070:
            int r3 = r20.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r20.getPaddingBottom()
            int r2 = r2 - r3
            r3 = r2
            r2 = 0
        L_0x007c:
            int r8 = r20.getPaddingLeft()
            int r8 = r4 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 0
            r0.f28942b = r10
            r13 = r2
            r14 = r8
            r2 = 0
            r11 = 0
            r12 = 0
        L_0x0093:
            r15 = 8
            r16 = 1
            if (r2 >= r9) goto L_0x0136
            android.view.View r6 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r18 = r6.getLayoutParams()
            r7 = r18
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r7 = (com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x00af
            r7.f28967c = r1
            goto L_0x012d
        L_0x00af:
            float r10 = r7.f28965a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00bd
            float r10 = r7.f28965a
            float r12 = r12 + r10
            int r10 = r7.width
            if (r10 == 0) goto L_0x012d
        L_0x00bd:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00d2
            int r1 = r8 - r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x00e8
        L_0x00d2:
            int r1 = r7.width
            r15 = -1
            if (r1 != r15) goto L_0x00e0
            int r1 = r8 - r10
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            goto L_0x00e8
        L_0x00e0:
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.width
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x00e8:
            int r15 = r7.height
            r10 = -2
            if (r15 != r10) goto L_0x00f4
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10)
            goto L_0x0108
        L_0x00f4:
            int r10 = r7.height
            r15 = -1
            if (r10 != r15) goto L_0x0100
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10)
            goto L_0x0108
        L_0x0100:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x0108:
            r6.measure(r1, r15)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r15) goto L_0x011d
            if (r10 <= r13) goto L_0x011d
            int r13 = java.lang.Math.min(r10, r3)
        L_0x011d:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x0122
            r1 = 1
            goto L_0x0123
        L_0x0122:
            r1 = 0
        L_0x0123:
            r7.f28966b = r1
            r1 = r1 | r11
            boolean r7 = r7.f28966b
            if (r7 == 0) goto L_0x012c
            r0.f28942b = r6
        L_0x012c:
            r11 = r1
        L_0x012d:
            int r2 = r2 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0093
        L_0x0136:
            if (r11 != 0) goto L_0x013d
            r1 = 0
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0234
        L_0x013d:
            int r1 = r0.f28954n
            int r1 = r8 - r1
            r2 = 0
        L_0x0142:
            if (r2 >= r9) goto L_0x0234
            android.view.View r5 = r0.getChildAt(r2)
            int r6 = r5.getVisibility()
            if (r6 == r15) goto L_0x0227
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r6 = (com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.LayoutParams) r6
            int r7 = r5.getVisibility()
            if (r7 == r15) goto L_0x0227
            int r7 = r6.width
            if (r7 != 0) goto L_0x0167
            float r7 = r6.f28965a
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0167
            r7 = 1
            goto L_0x0168
        L_0x0167:
            r7 = 0
        L_0x0168:
            if (r7 == 0) goto L_0x016c
            r10 = 0
            goto L_0x0170
        L_0x016c:
            int r10 = r5.getMeasuredWidth()
        L_0x0170:
            if (r11 == 0) goto L_0x01bb
            android.view.View r15 = r0.f28942b
            if (r5 == r15) goto L_0x01bb
            int r15 = r6.width
            if (r15 >= 0) goto L_0x0227
            if (r10 > r1) goto L_0x0183
            float r10 = r6.f28965a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0227
        L_0x0183:
            if (r7 == 0) goto L_0x01a8
            int r7 = r6.height
            r10 = -2
            if (r7 != r10) goto L_0x0193
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01b2
        L_0x0193:
            int r7 = r6.height
            r10 = -1
            if (r7 != r10) goto L_0x019f
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            goto L_0x01b2
        L_0x019f:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r6.height
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L_0x01b2
        L_0x01a8:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r5.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x01b2:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r5.measure(r10, r6)
            goto L_0x0227
        L_0x01bb:
            float r7 = r6.f28965a
            r15 = 0
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0227
            int r7 = r6.width
            if (r7 != 0) goto L_0x01eb
            int r7 = r6.height
            r15 = -2
            if (r7 != r15) goto L_0x01d6
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            r15 = r17
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f7
        L_0x01d6:
            int r7 = r6.height
            r15 = -1
            if (r7 != r15) goto L_0x01e2
            r7 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            goto L_0x01f5
        L_0x01e2:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            goto L_0x01f5
        L_0x01eb:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r5.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
        L_0x01f5:
            r15 = r17
        L_0x01f7:
            if (r11 == 0) goto L_0x020e
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r6 = r8 - r7
            r19 = r1
            r7 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            if (r10 == r6) goto L_0x0229
            r5.measure(r1, r15)
            goto L_0x0229
        L_0x020e:
            r19 = r1
            r1 = 0
            int r7 = java.lang.Math.max(r1, r14)
            float r6 = r6.f28965a
            float r7 = (float) r7
            float r6 = r6 * r7
            float r6 = r6 / r12
            int r6 = (int) r6
            int r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r5.measure(r7, r15)
            goto L_0x022c
        L_0x0227:
            r19 = r1
        L_0x0229:
            r1 = 0
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x022c:
            int r2 = r2 + 1
            r1 = r19
            r15 = 8
            goto L_0x0142
        L_0x0234:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r4, r13)
            r0.f28941a = r11
            android.support.v4.widget.q r1 = r0.f28947g
            int r1 = r1.f3673a
            if (r1 == 0) goto L_0x0250
            if (r11 != 0) goto L_0x0250
            android.support.v4.widget.q r1 = r0.f28947g
            r1.mo4160b()
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.onMeasure(int, int):void");
    }

    public DmtSlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f28954n = 0;
        setWillNotDraw(false);
        C0991u.m4187a((View) this, (C0939a) new C10793a());
        C0991u.m4206c((View) this, 1);
        this.f28947g = C1060q.m4590a((ViewGroup) this, 0.5f, (C1063a) new C10795c());
        this.f28947g.f3676d = f * 400.0f;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f28941a && !layoutParams.f28966b && this.f28942b != null) {
            canvas.getClipBounds(this.f28960t);
            if (mo25823e()) {
                this.f28960t.left = Math.max(this.f28960t.left, this.f28942b.getRight());
            } else {
                this.f28960t.right = Math.min(this.f28960t.right, this.f28942b.getLeft());
            }
            canvas.clipRect(this.f28960t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: a */
    private void m31512a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                if (layoutParams.f28968d != null) {
                    layoutParams.f28968d.setColorFilter(null);
                }
                C10794b bVar = new C10794b(view);
                this.f28949i.add(bVar);
                C0991u.m4190a((View) this, (Runnable) bVar);
            }
            return;
        }
        int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
        if (layoutParams.f28968d == null) {
            layoutParams.f28968d = new Paint();
        }
        layoutParams.f28968d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f28968d);
        }
        mo25819d(view);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f28959s = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        float f;
        boolean e = mo25823e();
        if (e) {
            this.f28947g.f3678f = 2;
        } else {
            this.f28947g.f3678f = 1;
        }
        int i13 = i3 - i;
        if (e) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (e) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f28959s) {
            if (!this.f28941a || !this.f28948h) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.f28943c = f;
        }
        int i14 = i5;
        int i15 = i14;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f28966b) {
                    int i17 = i13 - i6;
                    int min = (Math.min(i14, i17 - this.f28954n) - i15) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f28944d = min;
                    if (e) {
                        i12 = layoutParams.rightMargin;
                    } else {
                        i12 = layoutParams.leftMargin;
                    }
                    if (i15 + i12 + min + (measuredWidth / 2) > i17) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f28967c = z2;
                    int i18 = (int) (((float) min) * this.f28943c);
                    i8 = i12 + i18 + i15;
                    this.f28943c = ((float) i18) / ((float) this.f28944d);
                    i7 = 0;
                } else {
                    if (!this.f28941a || this.f28956p == 0) {
                        i11 = 0;
                    } else {
                        i11 = (int) ((1.0f - this.f28943c) * ((float) this.f28956p));
                    }
                    i7 = i11;
                    i8 = i14;
                }
                if (e) {
                    i9 = (i13 - i8) + i7;
                    i10 = i9 - measuredWidth;
                } else {
                    i10 = i8 - i7;
                    i9 = i10 + measuredWidth;
                }
                childAt.layout(i10, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i14 += childAt.getWidth();
                i15 = i8;
            }
        }
        if (this.f28959s) {
            if (this.f28941a) {
                if (this.f28956p != 0) {
                    m31511a(this.f28943c);
                }
                if (((LayoutParams) this.f28942b.getLayoutParams()).f28967c) {
                    m31512a(this.f28942b, this.f28943c, this.f28950j);
                }
            } else {
                for (int i19 = 0; i19 < childCount; i19++) {
                    m31512a(getChildAt(i19), 0.0f, this.f28950j);
                }
            }
            mo25816c(this.f28942b);
        }
        this.f28959s = false;
    }
}
