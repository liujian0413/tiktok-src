package android.support.p022v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0980l;
import android.support.p022v4.view.C0982n;
import android.support.p022v4.view.C0988r;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.NestedScrollingChild2;
import android.support.p022v4.view.NestedScrollingParent2;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0952e;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements NestedScrollingChild2, NestedScrollingParent2, C0988r {

    /* renamed from: w */
    private static final C1016a f3496w = new C1016a();

    /* renamed from: x */
    private static final int[] f3497x = {16843130};

    /* renamed from: A */
    private float f3498A;

    /* renamed from: B */
    private C1017b f3499B;

    /* renamed from: a */
    public boolean f3500a;

    /* renamed from: b */
    public boolean f3501b;

    /* renamed from: c */
    private long f3502c;

    /* renamed from: d */
    private final Rect f3503d;

    /* renamed from: e */
    private OverScroller f3504e;

    /* renamed from: f */
    private EdgeEffect f3505f;

    /* renamed from: g */
    private EdgeEffect f3506g;

    /* renamed from: h */
    private int f3507h;

    /* renamed from: i */
    private boolean f3508i;

    /* renamed from: j */
    private boolean f3509j;

    /* renamed from: k */
    private View f3510k;

    /* renamed from: l */
    private boolean f3511l;

    /* renamed from: m */
    private VelocityTracker f3512m;

    /* renamed from: n */
    private int f3513n;

    /* renamed from: o */
    private int f3514o;

    /* renamed from: p */
    private int f3515p;

    /* renamed from: q */
    private int f3516q;

    /* renamed from: r */
    private final int[] f3517r;

    /* renamed from: s */
    private final int[] f3518s;

    /* renamed from: t */
    private int f3519t;

    /* renamed from: u */
    private int f3520u;

    /* renamed from: v */
    private SavedState f3521v;

    /* renamed from: y */
    private final C0982n f3522y;

    /* renamed from: z */
    private final C0980l f3523z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m4407a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m4406a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4406a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m4407a(i);
            }
        };

        /* renamed from: a */
        public int f3524a;

        public String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f3524a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3524a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3524a);
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C1016a extends C0939a {
        C1016a() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo3656b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    cVar.mo3687k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.mo3644a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo1390a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0952e.m4054a(accessibilityEvent, nestedScrollView.getScrollX());
            C0952e.m4056b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3924a(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3924a(0, max);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C1017b {
        /* renamed from: a */
        void mo3976a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m4380b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    public final boolean mo1399a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: a */
    public final void mo1396a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m4374a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    /* renamed from: a */
    public final void mo1397a(View view, int i, int i2, int[] iArr, int i3) {
        m4375a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public final boolean mo3925a(KeyEvent keyEvent) {
        this.f3503d.setEmpty();
        boolean z = false;
        int i = 130;
        if (m4382b()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed()) {
                                z = m4390d(33);
                                break;
                            } else {
                                z = m4392e(33);
                                break;
                            }
                        case 20:
                            if (keyEvent.isAltPressed()) {
                                z = m4390d(130);
                                break;
                            } else {
                                z = m4392e(130);
                                break;
                            }
                    }
                } else {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m4386c(i);
                }
            }
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m4377a(View view) {
        return !m4378a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m4378a(View view, int i, int i2) {
        view.getDrawingRect(this.f3503d);
        offsetDescendantRectToMyCoords(view, this.f3503d);
        return this.f3503d.bottom + i >= getScrollY() && this.f3503d.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo3924a(int i, int i2) {
        m4389d(0 - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: a */
    private boolean m4376a(Rect rect, boolean z) {
        int a = m4368a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m4389d(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private static boolean m4379a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m4379a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int getNestedScrollAxes() {
        return this.f3522y.f3402a;
    }

    public boolean hasNestedScrollingParent() {
        return m4383b(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3523z.f3397a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3509j = false;
    }

    public void requestLayout() {
        this.f3508i = true;
        super.requestLayout();
    }

    public void stopNestedScroll() {
        mo3524a(0);
    }

    /* renamed from: d */
    private void m4388d() {
        if (this.f3512m == null) {
            this.f3512m = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m4391e() {
        if (this.f3512m != null) {
            this.f3512m.recycle();
            this.f3512m = null;
        }
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3524a = getScrollY();
        return savedState;
    }

    /* renamed from: c */
    private void m4385c() {
        if (this.f3512m == null) {
            this.f3512m = VelocityTracker.obtain();
        } else {
            this.f3512m.clear();
        }
    }

    /* renamed from: f */
    private void m4393f() {
        this.f3511l = false;
        m4391e();
        mo3524a(0);
        if (this.f3505f != null) {
            this.f3505f.onRelease();
            this.f3506g.onRelease();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: a */
    private void m4370a() {
        this.f3504e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3513n = viewConfiguration.getScaledTouchSlop();
        this.f3514o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3515p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    private boolean m4382b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m4395g() {
        if (getOverScrollMode() == 2) {
            this.f3505f = null;
            this.f3506g = null;
        } else if (this.f3505f == null) {
            Context context = getContext();
            this.f3505f = new EdgeEffect(context);
            this.f3506g = new EdgeEffect(context);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3498A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3498A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3498A;
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public void computeScroll() {
        boolean z;
        if (this.f3504e.computeScrollOffset()) {
            this.f3504e.getCurrX();
            int currY = this.f3504e.getCurrY();
            int i = currY - this.f3520u;
            if (m4375a(0, i, this.f3518s, (int[]) null, 1)) {
                i -= this.f3518s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                m4373a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!m4374a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m4395g();
                        if (currY <= 0 && i3 > 0) {
                            this.f3505f.onAbsorb((int) this.f3504e.getCurrVelocity());
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            this.f3506g.onAbsorb((int) this.f3504e.getCurrVelocity());
                        }
                    }
                }
            }
            this.f3520u = currY;
            C0991u.m4212e(this);
            return;
        }
        if (m4383b(1)) {
            mo3524a(1);
        }
        this.f3520u = 0;
    }

    public void setOnScrollChangeListener(C1017b bVar) {
        this.f3499B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3501b = z;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private boolean m4383b(int i) {
        return this.f3523z.mo3764a(i);
    }

    /* renamed from: a */
    public final void mo3524a(int i) {
        this.f3523z.mo3773c(i);
    }

    public void onStopNestedScroll(View view) {
        mo1401b(view, 0);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3523z.mo3760a(z);
    }

    public boolean startNestedScroll(int i) {
        return m4384b(i, 0);
    }

    /* renamed from: f */
    private void m4394f(int i) {
        if (i != 0) {
            if (this.f3501b) {
                m4389d(0, i);
                return;
            }
            scrollBy(0, i);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m4391e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3500a) {
            this.f3500a = z;
            requestLayout();
        }
    }

    /* renamed from: b */
    private void m4381b(View view) {
        view.getDrawingRect(this.f3503d);
        offsetDescendantRectToMyCoords(view, this.f3503d);
        int a = m4368a(this.f3503d);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo3925a(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3521v = savedState;
        requestLayout();
    }

    /* renamed from: h */
    private void m4397h(int i) {
        boolean z;
        int scrollY = getScrollY();
        if ((scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0)) {
            z = true;
        } else {
            z = false;
        }
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m4396g(i);
        }
    }

    /* renamed from: a */
    private int m4368a(Rect rect) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i5 - verticalFadingEdgeLength;
        } else {
            i = i5;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = (rect.top - scrollY) + 0;
            } else {
                i3 = (rect.bottom - i) + 0;
            }
            i4 = Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top < scrollY && rect.bottom < i) {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i4 = Math.max(i2, -getScrollY());
        }
        return i4;
    }

    /* renamed from: c */
    private boolean m4386c(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f3503d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f3503d.top + height > bottom) {
                    this.f3503d.top = bottom - height;
                }
            }
        } else {
            this.f3503d.top = getScrollY() - height;
            if (this.f3503d.top < 0) {
                this.f3503d.top = 0;
            }
        }
        this.f3503d.bottom = this.f3503d.top + height;
        return m4372a(i, this.f3503d.top, this.f3503d.bottom);
    }

    /* renamed from: g */
    private void m4396g(int i) {
        if (getChildCount() > 0) {
            m4384b(2, 1);
            this.f3504e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f3520u = getScrollY();
            C0991u.m4212e(this);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3511l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m4390d(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        this.f3503d.top = 0;
        this.f3503d.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                this.f3503d.bottom = childAt.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
                this.f3503d.top = this.f3503d.bottom - height;
            }
        }
        return m4372a(i, this.f3503d.top, this.f3503d.bottom);
    }

    /* renamed from: e */
    private boolean m4392e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m4378a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m4394f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3503d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3503d);
            m4394f(m4368a(this.f3503d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m4377a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f3505f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f3505f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f3505f.setSize(width, height);
                if (this.f3505f.draw(canvas)) {
                    C0991u.m4212e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3506g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3506g.setSize(width2, height2);
                if (this.f3506g.draw(canvas)) {
                    C0991u.m4212e(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f3511l) {
            return true;
        }
        int i = action & NormalGiftView.ALPHA_255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (m4387c((int) motionEvent.getX(), y)) {
                        this.f3507h = y;
                        this.f3516q = motionEvent.getPointerId(0);
                        m4385c();
                        this.f3512m.addMovement(motionEvent);
                        this.f3504e.computeScrollOffset();
                        this.f3511l = !this.f3504e.isFinished();
                        m4384b(2, 0);
                        break;
                    } else {
                        this.f3511l = false;
                        m4391e();
                        break;
                    }
                case 1:
                case 3:
                    this.f3511l = false;
                    this.f3516q = -1;
                    m4391e();
                    if (this.f3504e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0991u.m4212e(this);
                    }
                    mo3524a(0);
                    break;
                case 2:
                    int i2 = this.f3516q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f3507h) > this.f3513n && (2 & getNestedScrollAxes()) == 0) {
                                this.f3511l = true;
                                this.f3507h = y2;
                                m4388d();
                                this.f3512m.addMovement(motionEvent);
                                this.f3519t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        } else {
            m4371a(motionEvent);
        }
        return this.f3511l;
    }

    /* renamed from: a */
    private void m4371a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3516q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3507h = (int) motionEvent.getY(i);
            this.f3516q = motionEvent.getPointerId(i);
            if (this.f3512m != null) {
                this.f3512m.clear();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        m4388d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3519t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f3519t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z2 = !this.f3504e.isFinished();
                    this.f3511l = z2;
                    if (z2) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f3504e.isFinished()) {
                        this.f3504e.abortAnimation();
                    }
                    this.f3507h = (int) motionEvent.getY();
                    this.f3516q = motionEvent2.getPointerId(0);
                    m4384b(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.f3512m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3515p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3516q);
                if (Math.abs(yVelocity) > this.f3514o) {
                    m4397h(-yVelocity);
                } else if (this.f3504e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0991u.m4212e(this);
                }
                this.f3516q = -1;
                m4393f();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f3516q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = this.f3507h - y;
                    if (m4375a(0, i, this.f3518s, this.f3517r, 0)) {
                        i -= this.f3518s[1];
                        obtain.offsetLocation(0.0f, (float) this.f3517r[1]);
                        this.f3519t += this.f3517r[1];
                    }
                    if (!this.f3511l && Math.abs(i) > this.f3513n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3511l = true;
                        if (i > 0) {
                            i -= this.f3513n;
                        } else {
                            i += this.f3513n;
                        }
                    }
                    int i2 = i;
                    if (this.f3511l) {
                        this.f3507h = y - this.f3517r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i3 = scrollRange;
                        int i4 = i2;
                        int i5 = findPointerIndex;
                        if (m4373a(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m4383b(0)) {
                            this.f3512m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!m4374a(0, scrollY2, 0, i4 - scrollY2, this.f3517r, 0)) {
                            if (z) {
                                m4395g();
                                int i6 = scrollY + i4;
                                if (i6 < 0) {
                                    C1047h.m4520a(this.f3505f, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (!this.f3506g.isFinished()) {
                                        this.f3506g.onRelease();
                                    }
                                } else {
                                    int i7 = i5;
                                    if (i6 > i3) {
                                        C1047h.m4520a(this.f3506g, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i7) / ((float) getWidth())));
                                        if (!this.f3505f.isFinished()) {
                                            this.f3505f.onRelease();
                                        }
                                    }
                                }
                                if (this.f3505f != null && (!this.f3505f.isFinished() || !this.f3506g.isFinished())) {
                                    C0991u.m4212e(this);
                                    break;
                                }
                            }
                        } else {
                            this.f3507h -= this.f3517r[1];
                            obtain.offsetLocation(0.0f, (float) this.f3517r[1]);
                            this.f3519t += this.f3517r[1];
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (this.f3511l && getChildCount() > 0 && this.f3504e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0991u.m4212e(this);
                }
                this.f3516q = -1;
                m4393f();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f3507h = (int) motionEvent2.getY(actionIndex);
                this.f3516q = motionEvent2.getPointerId(actionIndex);
                break;
            case 6:
                m4371a(motionEvent);
                this.f3507h = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f3516q));
                break;
        }
        if (this.f3512m != null) {
            this.f3512m.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3523z.mo3762a(f, f2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3508i) {
            m4381b(view2);
        } else {
            this.f3510k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: c */
    private boolean m4387c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m4377a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4384b(int i, int i2) {
        return this.f3523z.mo3765a(i, i2);
    }

    /* renamed from: d */
    private void m4389d(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3502c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
                this.f3520u = getScrollY();
                this.f3504e.startScroll(getScrollX(), scrollY, 0, max);
                C0991u.m4212e(this);
            } else {
                if (!this.f3504e.isFinished()) {
                    this.f3504e.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f3502c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3500a && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b = m4380b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b2 = m4380b(i2, height, height2);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo1401b(View view, int i) {
        this.f3522y.mo3775a(view, i);
        mo3524a(i);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3523z.mo3763a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1402b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1399a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4376a(rect, z);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3503d = new Rect();
        this.f3508i = true;
        this.f3509j = false;
        this.f3510k = null;
        this.f3511l = false;
        this.f3501b = true;
        this.f3516q = -1;
        this.f3517r = new int[2];
        this.f3518s = new int[2];
        m4370a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3497x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3522y = new C0982n(this);
        this.f3523z = new C0980l(this);
        setNestedScrollingEnabled(true);
        C0991u.m4187a((View) this, (C0939a) f3496w);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private View m4369a(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private boolean m4372a(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View a = m4369a(z, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m4394f(i4);
            z2 = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m4375a(i, i2, iArr, iArr2, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m4397h((int) f2);
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1397a(view, i, i2, iArr, 0);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f3499B != null) {
            this.f3499B.mo3976a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (!(findFocus == null || this == findFocus || !m4378a(findFocus, 0, i4))) {
            findFocus.getDrawingRect(this.f3503d);
            offsetDescendantRectToMyCoords(findFocus, this.f3503d);
            m4394f(m4368a(this.f3503d));
        }
    }

    /* renamed from: b */
    public final void mo1402b(View view, View view2, int i, int i2) {
        this.f3522y.mo3777a(view, view2, i, i2);
        m4384b(2, i2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m4374a(i, i2, i3, i4, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1396a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    private boolean m4375a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3523z.mo3769a(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3508i = false;
        if (this.f3510k != null && m4379a(this.f3510k, (View) this)) {
            m4381b(this.f3510k);
        }
        this.f3510k = null;
        if (!this.f3509j) {
            if (this.f3521v != null) {
                scrollTo(getScrollX(), this.f3521v.f3524a);
                this.f3521v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m4380b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3509j = true;
    }

    /* renamed from: a */
    private boolean m4374a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f3523z.mo3767a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    private boolean m4373a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i9 = i3 + 0;
        int i10 = i4 + i2;
        int i11 = i6 + 0;
        if (i9 <= 0 && i9 >= 0) {
            z2 = false;
        } else {
            i9 = 0;
            z2 = true;
        }
        if (i10 > i11) {
            z3 = true;
        } else if (i10 < 0) {
            z3 = true;
            i11 = 0;
        } else {
            i11 = i10;
            z3 = false;
        }
        if (z3 && !m4383b(1)) {
            this.f3504e.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        if (z2 || z3) {
            return true;
        }
        return false;
    }
}
