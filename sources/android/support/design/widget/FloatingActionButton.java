package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.R$styleable;
import android.support.design.p015a.C0241h;
import android.support.design.p018d.C0269a;
import android.support.design.p018d.C0271c;
import android.support.design.stateful.ExtendableSavedState;
import android.support.design.widget.CoordinatorLayout.C0353b;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1059p;
import android.support.p029v7.widget.C1393g;
import android.support.p029v7.widget.C1414i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

@C0353b(mo1448a = Behavior.class)
public class FloatingActionButton extends C0415r implements C0269a, C0989s, C1059p {

    /* renamed from: a */
    public int f1426a;

    /* renamed from: b */
    boolean f1427b;

    /* renamed from: c */
    final Rect f1428c;

    /* renamed from: d */
    private ColorStateList f1429d;

    /* renamed from: e */
    private Mode f1430e;

    /* renamed from: f */
    private ColorStateList f1431f;

    /* renamed from: g */
    private Mode f1432g;

    /* renamed from: h */
    private ColorStateList f1433h;

    /* renamed from: i */
    private int f1434i;

    /* renamed from: j */
    private int f1435j;

    /* renamed from: k */
    private int f1436k;

    /* renamed from: l */
    private final Rect f1437l;

    /* renamed from: m */
    private final C1414i f1438m;

    /* renamed from: n */
    private final C0271c f1439n;

    /* renamed from: o */
    private C0389g f1440o;

    protected static class BaseBehavior<T extends FloatingActionButton> extends android.support.design.widget.CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f1443a;

        /* renamed from: b */
        private C0359a f1444b;

        /* renamed from: c */
        private boolean f1445c;

        public BaseBehavior() {
            this.f1445c = true;
        }

        /* renamed from: a */
        public void mo1212a(C0355d dVar) {
            if (dVar.f1414h == 0) {
                dVar.f1414h = 80;
            }
        }

        /* renamed from: a */
        private static boolean m1521a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0355d) {
                return ((C0355d) layoutParams).f1407a instanceof BottomSheetBehavior;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.f1445c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private boolean m1523b(View view, FloatingActionButton floatingActionButton) {
            if (!m1522a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0355d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo1470b(this.f1444b, false);
            } else {
                floatingActionButton.mo1466a(this.f1444b, false);
            }
            return true;
        }

        /* renamed from: a */
        private static void m1519a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f1428c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0355d dVar = (C0355d) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= dVar.leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C0991u.m4222h((View) floatingActionButton, i2);
                }
                if (i != 0) {
                    C0991u.m4225i((View) floatingActionButton, i);
                }
            }
        }

        /* renamed from: a */
        private boolean m1522a(View view, FloatingActionButton floatingActionButton) {
            C0355d dVar = (C0355d) floatingActionButton.getLayoutParams();
            if (this.f1445c && dVar.f1412f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m1520a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m1522a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1443a == null) {
                this.f1443a = new Rect();
            }
            Rect rect = this.f1443a;
            C0387e.m1721a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo1470b(this.f1444b, false);
            } else {
                floatingActionButton.mo1466a(this.f1444b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo684a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b = coordinatorLayout.mo1400b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m1521a(view) && m1523b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m1520a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1394a((View) floatingActionButton, i);
            m1519a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo1442a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f1428c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo1207b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m1520a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m1521a(view)) {
                m1523b(view, floatingActionButton);
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1212a(C0355d dVar) {
            super.mo1212a(dVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1524a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo684a(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1525a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo1442a(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1526a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo1207b(coordinatorLayout, floatingActionButton, view);
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0359a {
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    class C0360b implements C0403k {
        /* renamed from: b */
        public final boolean mo1530b() {
            return FloatingActionButton.this.f1427b;
        }

        /* renamed from: a */
        public final float mo1527a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        C0360b() {
        }

        /* renamed from: a */
        public final void mo1529a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public final void mo1528a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f1428c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f1426a, i2 + FloatingActionButton.this.f1426a, i3 + FloatingActionButton.this.f1426a, i4 + FloatingActionButton.this.f1426a);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1429d;
    }

    public Mode getBackgroundTintMode() {
        return this.f1430e;
    }

    public int getCustomSize() {
        return this.f1435j;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1433h;
    }

    public int getSize() {
        return this.f1434i;
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1431f;
    }

    public Mode getSupportImageTintMode() {
        return this.f1432g;
    }

    public boolean getUseCompatPadding() {
        return this.f1427b;
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1700l;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1701m;
    }

    public Drawable getContentBackground() {
        return getImpl().f1698j;
    }

    public int getExpandedComponentIdHint() {
        return this.f1439n.f1057b;
    }

    public C0241h getHideMotionSpec() {
        return getImpl().f1693e;
    }

    public C0241h getShowMotionSpec() {
        return getImpl().f1692d;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m1502a(this.f1434i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    private C0389g getImpl() {
        if (this.f1440o == null) {
            this.f1440o = m1508d();
        }
        return this.f1440o;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo1813a(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().mo1805a();
    }

    public int getRippleColor() {
        if (this.f1433h != null) {
            return this.f1433h.getDefaultColor();
        }
        return 0;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo1820c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo1826f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo1827g();
    }

    /* renamed from: d */
    private C0389g m1508d() {
        if (VERSION.SDK_INT >= 21) {
            return new C0399h(this, new C0360b());
        }
        return new C0389g(this, new C0360b());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        extendableSavedState.f1233a.put("expandableWidgetHelper", this.f1439n.mo1047a());
        return extendableSavedState;
    }

    /* renamed from: c */
    private void m1506c() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (this.f1431f == null) {
                C0727a.m3115f(drawable);
                return;
            }
            int colorForState = this.f1431f.getColorForState(getDrawableState(), 0);
            Mode mode = this.f1432g;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1393g.m6897a(colorForState, mode));
        }
    }

    /* renamed from: b */
    public final boolean mo1471b() {
        return getImpl().mo1830j();
    }

    /* renamed from: a */
    public final boolean mo1046a() {
        return this.f1439n.f1056a;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    /* renamed from: a */
    public final void mo1465a(AnimatorListener animatorListener) {
        getImpl().mo1808a(animatorListener);
    }

    /* renamed from: b */
    public final void mo1468b(AnimatorListener animatorListener) {
        getImpl().mo1816b(animatorListener);
    }

    /* renamed from: c */
    public final void mo1472c(AnimatorListener animatorListener) {
        getImpl().mo1822c(animatorListener);
    }

    /* renamed from: d */
    public final void mo1473d(AnimatorListener animatorListener) {
        getImpl().mo1824d(animatorListener);
    }

    public void setCompatElevation(float f) {
        getImpl().mo1806a(f);
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo1815b(f);
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo1821c(f);
    }

    public void setExpandedComponentIdHint(int i) {
        this.f1439n.f1057b = i;
    }

    public void setHideMotionSpec(C0241h hVar) {
        getImpl().f1693e = hVar;
    }

    public void setImageResource(int i) {
        this.f1438m.mo6537a(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setShowMotionSpec(C0241h hVar) {
        getImpl().f1692d = hVar;
    }

    /* renamed from: a */
    private C0396d m1504a(final C0359a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0396d() {
        };
    }

    /* renamed from: b */
    public final void mo1469b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m1507c(rect);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1429d != colorStateList) {
            this.f1429d = colorStateList;
            getImpl().mo1809a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f1430e != mode) {
            this.f1430e = mode;
            getImpl().mo1810a(mode);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f1435j = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0241h.m842a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().mo1814b();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1433h != colorStateList) {
            this.f1433h = colorStateList;
            getImpl().mo1817b(this.f1433h);
        }
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0241h.m842a(getContext(), i));
    }

    public void setSize(int i) {
        this.f1435j = 0;
        if (i != this.f1434i) {
            this.f1434i = i;
            requestLayout();
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1431f != colorStateList) {
            this.f1431f = colorStateList;
            m1506c();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f1432g != mode) {
            this.f1432g = mode;
            m1506c();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1427b != z) {
            this.f1427b = z;
            getImpl().mo1823d();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f3171e);
        this.f1439n.mo1048a((Bundle) extendableSavedState.f1233a.get("expandableWidgetHelper"));
    }

    /* renamed from: a */
    private int m1502a(int i) {
        while (this.f1435j == 0) {
            Resources resources = getResources();
            if (i != -1) {
                if (i != 1) {
                    return resources.getDimensionPixelSize(R.dimen.fb);
                }
                return resources.getDimensionPixelSize(R.dimen.fa);
            } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                return m1502a(1);
            } else {
                i = 0;
            }
        }
        return this.f1435j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo1467a(this.f1437l) || this.f1437l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: c */
    private void m1507c(Rect rect) {
        rect.left += this.f1428c.left;
        rect.top += this.f1428c.top;
        rect.right -= this.f1428c.right;
        rect.bottom -= this.f1428c.bottom;
    }

    /* renamed from: a */
    public final boolean mo1467a(Rect rect) {
        if (!C0991u.m4167D(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m1507c(rect);
        return true;
    }

    /* renamed from: a */
    private static int m1503a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1470b(C0359a aVar, boolean z) {
        getImpl().mo1812a(m1504a(aVar), false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f1426a = (sizeDimension - this.f1436k) / 2;
        getImpl().mo1825e();
        int min = Math.min(m1503a(sizeDimension, i), m1503a(sizeDimension, i2));
        setMeasuredDimension(this.f1428c.left + min + this.f1428c.right, min + this.f1428c.top + this.f1428c.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1466a(C0359a aVar, boolean z) {
        getImpl().mo1819b(m1504a(aVar), false);
    }
}
