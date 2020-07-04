package android.support.p022v4.widget;

import android.content.Context;
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
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.SlidingPaneLayout */
public final class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    public boolean f3534a;

    /* renamed from: b */
    View f3535b;

    /* renamed from: c */
    float f3536c;

    /* renamed from: d */
    int f3537d;

    /* renamed from: e */
    boolean f3538e;

    /* renamed from: f */
    final C1060q f3539f;

    /* renamed from: g */
    boolean f3540g;

    /* renamed from: h */
    final ArrayList<C1021a> f3541h;

    /* renamed from: i */
    private int f3542i;

    /* renamed from: j */
    private int f3543j;

    /* renamed from: k */
    private Drawable f3544k;

    /* renamed from: l */
    private Drawable f3545l;

    /* renamed from: m */
    private final int f3546m;

    /* renamed from: n */
    private float f3547n;

    /* renamed from: o */
    private int f3548o;

    /* renamed from: p */
    private float f3549p;

    /* renamed from: q */
    private float f3550q;

    /* renamed from: r */
    private C1022b f3551r;

    /* renamed from: s */
    private boolean f3552s;

    /* renamed from: t */
    private final Rect f3553t;

    /* renamed from: u */
    private Method f3554u;

    /* renamed from: v */
    private Field f3555v;

    /* renamed from: w */
    private boolean f3556w;

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f3557e = {16843137};

        /* renamed from: a */
        public float f3558a;

        /* renamed from: b */
        boolean f3559b;

        /* renamed from: c */
        boolean f3560c;

        /* renamed from: d */
        Paint f3561d;

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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3557e);
            this.f3558a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m4438a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m4436a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4436a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m4438a(i);
            }

            /* renamed from: a */
            private static SavedState m4437a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m4437a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f3562a;

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
            this.f3562a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3562a ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SimplePanelSlideListener */
    public static class SimplePanelSlideListener implements C1022b {
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    class C1021a implements Runnable {

        /* renamed from: a */
        final View f3563a;

        public final void run() {
            if (this.f3563a.getParent() == SlidingPaneLayout.this) {
                this.f3563a.setLayerType(0, null);
                SlidingPaneLayout.this.mo3979a(this.f3563a);
            }
            SlidingPaneLayout.this.f3541h.remove(this);
        }

        C1021a(View view) {
            this.f3563a = view;
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    public interface C1022b {
    }

    public final int getCoveredFadeColor() {
        return this.f3543j;
    }

    public final int getParallaxDistance() {
        return this.f3548o;
    }

    public final int getSliderFadeColor() {
        return this.f3542i;
    }

    /* renamed from: b */
    private boolean m4428b() {
        return m4429b(this.f3535b, 0);
    }

    /* renamed from: c */
    private boolean m4430c() {
        return m4426a(this.f3535b, 0);
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3552s = true;
    }

    /* renamed from: e */
    private boolean m4434e() {
        if (C0991u.m4220h(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m4422a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: d */
    private boolean m4432d() {
        if (!this.f3534a || this.f3536c == 1.0f) {
            return true;
        }
        return false;
    }

    public final void computeScroll() {
        if (this.f3539f.mo4158a(true)) {
            if (!this.f3534a) {
                this.f3539f.mo4160b();
                return;
            }
            C0991u.m4212e(this);
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f3534a) {
            z = m4432d();
        } else {
            z = this.f3540g;
        }
        savedState.f3562a = z;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3552s = true;
        int size = this.f3541h.size();
        for (int i = 0; i < size; i++) {
            ((C1021a) this.f3541h.get(i)).run();
        }
        this.f3541h.clear();
    }

    public final void setCoveredFadeColor(int i) {
        this.f3543j = i;
    }

    public final void setPanelSlideListener(C1022b bVar) {
        this.f3551r = bVar;
    }

    public final void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public final void setShadowDrawableLeft(Drawable drawable) {
        this.f3544k = drawable;
    }

    public final void setShadowDrawableRight(Drawable drawable) {
        this.f3545l = drawable;
    }

    public final void setSliderFadeColor(int i) {
        this.f3542i = i;
    }

    public final void setParallaxDistance(int i) {
        this.f3548o = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public final void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0683b.m2903a(getContext(), i));
    }

    public final void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0683b.m2903a(getContext(), i));
    }

    /* renamed from: c */
    private static boolean m4431c(View view) {
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

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        if (savedState.f3562a) {
            m4428b();
        } else {
            m4430c();
        }
        this.f3540g = savedState.f3562a;
    }

    /* renamed from: d */
    private boolean m4433d(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f3534a || !layoutParams.f3560c || this.f3536c <= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4423a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m4434e()
            android.view.View r1 = r9.f3535b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r1 = (android.support.p022v4.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f3560c
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
            android.view.View r5 = r9.f3535b
            if (r4 == r5) goto L_0x0059
            float r5 = r9.f3547n
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f3548o
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.f3547n = r10
            float r7 = r6 - r10
            int r8 = r9.f3548o
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
            float r5 = r9.f3547n
            float r5 = r5 - r6
            goto L_0x0054
        L_0x0050:
            float r5 = r9.f3547n
            float r5 = r6 - r5
        L_0x0054:
            int r6 = r9.f3543j
            r9.m4424a(r4, r5, r6)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.widget.SlidingPaneLayout.m4423a(float):void");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (m4434e()) {
            drawable = this.f3545l;
        } else {
            drawable = this.f3544k;
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
            if (m4434e()) {
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

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3534a) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3539f.mo4161b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3549p = x;
                this.f3550q = y;
                break;
            case 1:
                if (m4433d(this.f3535b)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f3549p;
                    float f2 = y2 - this.f3550q;
                    int i = this.f3539f.f3674b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C1060q.m4601b(this.f3535b, (int) x2, (int) y2)) {
                        m4426a(this.f3535b, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: b */
    private void m4427b(View view) {
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
        boolean e = m4434e();
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
        if (view2 == null || !m4431c(view)) {
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

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f3534a && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f3540g = !C1060q.m4601b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f3534a || (this.f3538e && actionMasked != 0)) {
            this.f3539f.mo4152a();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f3539f.mo4152a();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f3538e = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3549p = x;
                this.f3550q = y;
                if (C1060q.m4601b(this.f3535b, (int) x, (int) y) && m4433d(this.f3535b)) {
                    z = true;
                    if (!this.f3539f.mo4156a(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f3549p);
                float abs2 = Math.abs(y2 - this.f3550q);
                if (abs > ((float) this.f3539f.f3674b) && abs2 > abs) {
                    this.f3539f.mo4152a();
                    this.f3538e = true;
                    return false;
                }
            }
            z = false;
            if (!this.f3539f.mo4156a(motionEvent)) {
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3979a(View view) {
        if (VERSION.SDK_INT >= 17) {
            C0991u.m4182a(view, ((LayoutParams) view.getLayoutParams()).f3561d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            if (!this.f3556w) {
                try {
                    this.f3554u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f3555v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f3555v.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f3556w = true;
            }
            if (this.f3554u == null || this.f3555v == null) {
                view.invalidate();
                return;
            } else {
                try {
                    this.f3555v.setBoolean(view, true);
                    this.f3554u.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        C0991u.m4179a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    private boolean m4429b(View view, int i) {
        if (!this.f3552s && !m4425a(1.0f, 0)) {
            return false;
        }
        this.f3540g = true;
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f3534a) {
            if (view == this.f3535b) {
                z = true;
            } else {
                z = false;
            }
            this.f3540g = z;
        }
    }

    /* renamed from: a */
    private boolean m4426a(View view, int i) {
        if (!this.f3552s && !m4425a(0.0f, 0)) {
            return false;
        }
        this.f3540g = false;
        return true;
    }

    /* renamed from: a */
    private boolean m4425a(float f, int i) {
        int i2;
        if (!this.f3534a) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f3535b.getLayoutParams();
        if (m4434e()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f3537d))) + ((float) this.f3535b.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f3537d)));
        }
        if (!this.f3539f.mo4157a(this.f3535b, i2, this.f3535b.getTop())) {
            return false;
        }
        m4422a();
        C0991u.m4212e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 == r6) goto L_0x0046
            if (r1 != 0) goto L_0x0046
            r2 = 300(0x12c, float:4.2E-43)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0046
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003e
            if (r3 != 0) goto L_0x0046
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            r1 = 0
            if (r3 == r6) goto L_0x005a
            if (r3 == r7) goto L_0x004e
            r4 = 0
            r5 = 0
            goto L_0x0066
        L_0x004e:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            goto L_0x0066
        L_0x005a:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = 0
        L_0x0066:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 0
            r0.f3535b = r10
            r13 = r4
            r14 = r8
            r4 = 0
            r11 = 0
            r12 = 0
        L_0x007d:
            r15 = 8
            r16 = 1
            if (r4 >= r9) goto L_0x0120
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r18 = r6.getLayoutParams()
            r7 = r18
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r7 = (android.support.p022v4.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0099
            r7.f3560c = r1
            goto L_0x0117
        L_0x0099:
            float r10 = r7.f3558a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a7
            float r10 = r7.f3558a
            float r12 = r12 + r10
            int r10 = r7.width
            if (r10 == 0) goto L_0x0117
        L_0x00a7:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00bc
            int r1 = r8 - r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x00d2
        L_0x00bc:
            int r1 = r7.width
            r15 = -1
            if (r1 != r15) goto L_0x00ca
            int r1 = r8 - r10
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            goto L_0x00d2
        L_0x00ca:
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.width
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x00d2:
            int r15 = r7.height
            r10 = -2
            if (r15 != r10) goto L_0x00de
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00f2
        L_0x00de:
            int r10 = r7.height
            r15 = -1
            if (r10 != r15) goto L_0x00ea
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00f2
        L_0x00ea:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00f2:
            r6.measure(r1, r15)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r15) goto L_0x0107
            if (r10 <= r13) goto L_0x0107
            int r13 = java.lang.Math.min(r10, r5)
        L_0x0107:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x010c
            r1 = 1
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            r7.f3559b = r1
            r1 = r1 | r11
            boolean r7 = r7.f3559b
            if (r7 == 0) goto L_0x0116
            r0.f3535b = r6
        L_0x0116:
            r11 = r1
        L_0x0117:
            int r4 = r4 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x007d
        L_0x0120:
            if (r11 != 0) goto L_0x0127
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x021e
        L_0x0127:
            int r1 = r0.f3546m
            int r1 = r8 - r1
            r3 = 0
        L_0x012c:
            if (r3 >= r9) goto L_0x021e
            android.view.View r4 = r0.getChildAt(r3)
            int r6 = r4.getVisibility()
            if (r6 == r15) goto L_0x0211
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r6 = (android.support.p022v4.widget.SlidingPaneLayout.LayoutParams) r6
            int r7 = r4.getVisibility()
            if (r7 == r15) goto L_0x0211
            int r7 = r6.width
            if (r7 != 0) goto L_0x0151
            float r7 = r6.f3558a
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0151
            r7 = 1
            goto L_0x0152
        L_0x0151:
            r7 = 0
        L_0x0152:
            if (r7 == 0) goto L_0x0156
            r10 = 0
            goto L_0x015a
        L_0x0156:
            int r10 = r4.getMeasuredWidth()
        L_0x015a:
            if (r11 == 0) goto L_0x01a5
            android.view.View r15 = r0.f3535b
            if (r4 == r15) goto L_0x01a5
            int r15 = r6.width
            if (r15 >= 0) goto L_0x0211
            if (r10 > r1) goto L_0x016d
            float r10 = r6.f3558a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0211
        L_0x016d:
            if (r7 == 0) goto L_0x0192
            int r7 = r6.height
            r10 = -2
            if (r7 != r10) goto L_0x017d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x019c
        L_0x017d:
            int r7 = r6.height
            r10 = -1
            if (r7 != r10) goto L_0x0189
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x019c
        L_0x0189:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r6.height
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L_0x019c
        L_0x0192:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r4.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x019c:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r4.measure(r10, r6)
            goto L_0x0211
        L_0x01a5:
            float r7 = r6.f3558a
            r15 = 0
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0211
            int r7 = r6.width
            if (r7 != 0) goto L_0x01d5
            int r7 = r6.height
            r15 = -2
            if (r7 != r15) goto L_0x01c0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r15 = r17
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e1
        L_0x01c0:
            int r7 = r6.height
            r15 = -1
            if (r7 != r15) goto L_0x01cc
            r7 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x01df
        L_0x01cc:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            goto L_0x01df
        L_0x01d5:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r4.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
        L_0x01df:
            r15 = r17
        L_0x01e1:
            if (r11 == 0) goto L_0x01f8
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r6 = r8 - r7
            r19 = r1
            r7 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            if (r10 == r6) goto L_0x0213
            r4.measure(r1, r15)
            goto L_0x0213
        L_0x01f8:
            r19 = r1
            r1 = 0
            int r7 = java.lang.Math.max(r1, r14)
            float r6 = r6.f3558a
            float r7 = (float) r7
            float r6 = r6 * r7
            float r6 = r6 / r12
            int r6 = (int) r6
            int r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r4.measure(r7, r15)
            goto L_0x0216
        L_0x0211:
            r19 = r1
        L_0x0213:
            r1 = 0
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x0216:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x012c
        L_0x021e:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r2, r13)
            r0.f3534a = r11
            android.support.v4.widget.q r1 = r0.f3539f
            int r1 = r1.f3673a
            if (r1 == 0) goto L_0x023a
            if (r11 != 0) goto L_0x023a
            android.support.v4.widget.q r1 = r0.f3539f
            r1.mo4160b()
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f3534a && !layoutParams.f3559b && this.f3535b != null) {
            canvas.getClipBounds(this.f3553t);
            if (m4434e()) {
                this.f3553t.left = Math.max(this.f3553t.left, this.f3535b.getRight());
            } else {
                this.f3553t.right = Math.min(this.f3553t.right, this.f3535b.getLeft());
            }
            canvas.clipRect(this.f3553t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: a */
    private void m4424a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                if (layoutParams.f3561d != null) {
                    layoutParams.f3561d.setColorFilter(null);
                }
                C1021a aVar = new C1021a(view);
                this.f3541h.add(aVar);
                C0991u.m4190a((View) this, (Runnable) aVar);
            }
            return;
        }
        int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
        if (layoutParams.f3561d == null) {
            layoutParams.f3561d = new Paint();
        }
        layoutParams.f3561d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f3561d);
        }
        mo3979a(view);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f3552s = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        boolean e = m4434e();
        if (e) {
            this.f3539f.f3678f = 2;
        } else {
            this.f3539f.f3678f = 1;
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
        if (this.f3552s) {
            if (!this.f3534a || !this.f3540g) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.f3536c = f;
        }
        int i14 = i5;
        int i15 = i14;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f3559b) {
                    int i17 = i13 - i6;
                    int min = (Math.min(i14, i17 - this.f3546m) - i15) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f3537d = min;
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
                    layoutParams.f3560c = z2;
                    int i18 = (int) (((float) min) * this.f3536c);
                    i8 = i12 + i18 + i15;
                    this.f3536c = ((float) i18) / ((float) this.f3537d);
                    i7 = 0;
                } else {
                    if (!this.f3534a || this.f3548o == 0) {
                        i11 = 0;
                    } else {
                        i11 = (int) ((1.0f - this.f3536c) * ((float) this.f3548o));
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
        if (this.f3552s) {
            if (this.f3534a) {
                if (this.f3548o != 0) {
                    m4423a(this.f3536c);
                }
                if (((LayoutParams) this.f3535b.getLayoutParams()).f3560c) {
                    m4424a(this.f3535b, this.f3536c, this.f3542i);
                }
            } else {
                for (int i19 = 0; i19 < childCount; i19++) {
                    m4424a(getChildAt(i19), 0.0f, this.f3542i);
                }
            }
            m4427b(this.f3535b);
        }
        this.f3552s = false;
    }
}
