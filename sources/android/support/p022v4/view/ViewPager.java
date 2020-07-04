package android.support.p022v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.p028a.C0945c;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {
    private static final Comparator<C0932b> COMPARATOR = new Comparator<C0932b>() {
        /* renamed from: a */
        private static int m3954a(C0932b bVar, C0932b bVar2) {
            return bVar.f3288b - bVar2.f3288b;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m3954a((C0932b) obj, (C0932b) obj2);
        }
    };
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Interpolator sInterpolator = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final C0938h sPositionComparator = new C0938h();
    private int mActivePointerId = -1;
    PagerAdapter mAdapter;
    private List<C0934d> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private C0935e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0932b> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C0937g mObserver;
    private int mOffscreenPageLimit = 1;
    private C0935e mOnPageChangeListener;
    private List<C0935e> mOnPageChangeListeners;
    private int mPageMargin;
    private C0936f mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    public Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0932b mTempItem = new C0932b();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: android.support.v4.view.ViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3279a;

        /* renamed from: b */
        public int f3280b;

        /* renamed from: c */
        float f3281c;

        /* renamed from: d */
        boolean f3282d;

        /* renamed from: e */
        int f3283e;
        public int position;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f3280b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m3958a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m3956a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3956a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3958a(i);
            }

            /* renamed from: a */
            private static SavedState m3957a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m3957a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f3284a;

        /* renamed from: b */
        Parcelable f3285b;

        /* renamed from: c */
        ClassLoader f3286c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f3284a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3284a);
            parcel.writeParcelable(this.f3285b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f3284a = parcel.readInt();
            this.f3285b = parcel.readParcelable(classLoader);
            this.f3286c = classLoader;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$SimpleOnPageChangeListener */
    public static class SimpleOnPageChangeListener implements C0935e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0931a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0932b {

        /* renamed from: a */
        Object f3287a;

        /* renamed from: b */
        int f3288b;

        /* renamed from: c */
        boolean f3289c;

        /* renamed from: d */
        float f3290d;

        /* renamed from: e */
        float f3291e;

        C0932b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    class C0933c extends C0939a {
        /* renamed from: a */
        private boolean m3959a() {
            if (ViewPager.this.mAdapter == null || ViewPager.this.mAdapter.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C0933c() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            cVar.mo3656b((CharSequence) ViewPager.class.getName());
            cVar.mo3687k(m3959a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo3644a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m3959a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager.this.setCurrentItem(ViewPager.this.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager.this.setCurrentItem(ViewPager.this.mCurItem + 1);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    public interface C0934d {
        /* renamed from: a */
        void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0935e {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0936f {
        /* renamed from: a */
        void mo3622a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    class C0937g extends DataSetObserver {
        public final void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public final void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }

        C0937g() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    static class C0938h implements Comparator<View> {
        C0938h() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m3965a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m3965a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f3279a == layoutParams2.f3279a) {
                return layoutParams.position - layoutParams2.position;
            }
            if (layoutParams.f3279a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: 0000 */
    public void populate() {
        populate(this.mCurItem);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void clearOnPageChangeListeners() {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean pageLeft() {
        if (this.mCurItem <= 0) {
            return false;
        }
        setCurrentItem(this.mCurItem - 1, true);
        return true;
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f3279a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        if (this.mScroller != null && !this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3284a = this.mCurItem;
        if (this.mAdapter != null) {
            savedState.f3285b = this.mAdapter.saveState();
        }
        return savedState;
    }

    /* access modifiers changed from: 0000 */
    public boolean pageRight() {
        if (this.mAdapter == null || this.mCurItem >= this.mAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                this.mDrawingOrderedChildren.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    private C0932b infoForCurrentScrollPosition() {
        float f;
        float f2;
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        C0932b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.mItems.size()) {
            C0932b bVar2 = (C0932b) this.mItems.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f3288b != i3) {
                    bVar2 = this.mTempItem;
                    bVar2.f3291e = f3 + f4 + f2;
                    bVar2.f3288b = i3;
                    bVar2.f3290d = this.mAdapter.getPageWidth(bVar2.f3288b);
                    i--;
                }
            }
            f3 = bVar2.f3291e;
            float f5 = bVar2.f3290d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.mItems.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f3288b;
            f4 = bVar2.f3290d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0991u.m4212e(this);
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0932b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f3288b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f3291e) / infoForCurrentScrollPosition.f3290d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: 0000 */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        C0991u.m4187a((View) this, (C0939a) new C0933c());
        if (C0991u.m4214f(this) == 0) {
            C0991u.m4206c((View) this, 1);
        }
        C0991u.m4188a((View) this, (C0983o) new C0983o() {

            /* renamed from: b */
            private final Rect f3278b = new Rect();

            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                C0954ab a = C0991u.m4176a(view, abVar);
                if (a.mo3724f()) {
                    return a;
                }
                Rect rect = this.f3278b;
                rect.left = a.mo3717a();
                rect.top = a.mo3719b();
                rect.right = a.mo3720c();
                rect.bottom = a.mo3721d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0954ab b = C0991u.m4199b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3717a(), rect.left);
                    rect.top = Math.min(b.mo3719b(), rect.top);
                    rect.right = Math.min(b.mo3720c(), rect.right);
                    rect.bottom = Math.min(b.mo3721d(), rect.bottom);
                }
                return a.mo3718a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.mItems.size()) {
            C0932b bVar = (C0932b) this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f3287a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z3) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.f3288b, bVar.f3287a);
                    if (this.mCurItem == bVar.f3288b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (bVar.f3288b != itemPosition) {
                    if (bVar.f3288b == this.mCurItem) {
                        i = itemPosition;
                    }
                    bVar.f3288b = itemPosition;
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f3279a) {
                    layoutParams.f3281c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.mOnPageChangeListener = eVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public C0935e setInternalPageChangeListener(C0935e eVar) {
        C0935e eVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = eVar;
        return eVar2;
    }

    private static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(C0931a.class) != null) {
            return true;
        }
        return false;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeOnAdapterChangeListener(C0934d dVar) {
        if (this.mAdapterChangeListeners != null) {
            this.mAdapterChangeListeners.remove(dVar);
        }
    }

    public void removeOnPageChangeListener(C0935e eVar) {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.remove(eVar);
        }
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0683b.m2903a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public void addOnAdapterChangeListener(C0934d dVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(dVar);
    }

    public void addOnPageChangeListener(C0935e eVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public C0932b infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0932b infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0932b bVar = (C0932b) this.mItems.get(i2);
            if (bVar.f3288b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                enableLayers(z);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    private void dispatchOnPageSelected(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageSelected(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0935e eVar = (C0935e) this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrollStateChanged(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0935e eVar = (C0935e) this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0932b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f3288b == this.mCurItem) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0932b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f3288b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public C0932b infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C0932b bVar = (C0932b) this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, bVar.f3287a)) {
                return bVar;
            }
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        if (this.mAdapter != null) {
            this.mAdapter.restoreState(savedState.f3285b, savedState.f3286c);
            setCurrentItemInternal(savedState.f3284a, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f3284a;
        this.mRestoredAdapterState = savedState.f3285b;
        this.mRestoredClassLoader = savedState.f3286c;
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        boolean z3 = z2;
        for (int i = 0; i < this.mItems.size(); i++) {
            C0932b bVar = (C0932b) this.mItems.get(i);
            if (bVar.f3289c) {
                bVar.f3289c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0991u.m4190a((View) this, this.mEndScrollRunnable);
                return;
            }
            this.mEndScrollRunnable.run();
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C0932b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.mPageMargin) / f;
            int i3 = infoForCurrentScrollPosition.f3288b;
            float f3 = ((((float) i) / f) - infoForCurrentScrollPosition.f3291e) / (infoForCurrentScrollPosition.f3290d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.mCalledSuper = false;
            onPageScrolled(i3, f3, i4);
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2)) {
                            return pageLeft();
                        }
                        return arrowScroll(17);
                    case 22:
                        if (keyEvent.hasModifiers(2)) {
                            return pageRight();
                        }
                        return arrowScroll(66);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return arrowScroll(2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C0932b bVar = (C0932b) this.mItems.get(0);
        C0932b bVar2 = (C0932b) this.mItems.get(this.mItems.size() - 1);
        if (bVar.f3288b != 0) {
            f3 = bVar.f3291e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f3288b != this.mAdapter.getCount() - 1) {
            f4 = bVar2.f3291e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            if (r0 == r6) goto L_0x004b
            if (r0 == 0) goto L_0x004c
            android.view.ViewParent r3 = r0.getParent()
        L_0x000e:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001b
            if (r3 != r6) goto L_0x0016
            r3 = 1
            goto L_0x001c
        L_0x0016:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000e
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 != 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0032:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004b
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0032
        L_0x004b:
            r0 = 0
        L_0x004c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x009c
            if (r3 == r0) goto L_0x009c
            if (r7 != r5) goto L_0x007c
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.pageLeft()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.pageRight()
            goto L_0x00af
        L_0x0097:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x009c:
            if (r7 == r5) goto L_0x00ab
            if (r7 != r1) goto L_0x00a1
            goto L_0x00ab
        L_0x00a1:
            if (r7 == r4) goto L_0x00a6
            r0 = 2
            if (r7 != r0) goto L_0x00af
        L_0x00a6:
            boolean r2 = r6.pageRight()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.pageLeft()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.ViewPager.arrowScroll(int):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.mAdapter != null && this.mAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            C0991u.m4212e(this);
        }
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C0932b bVar = (C0932b) this.mItems.get(0);
            C0932b bVar2 = (C0932b) this.mItems.get(this.mItems.size() - 1);
            if (bVar.f3288b != 0) {
                f2 = bVar.f3291e * clientWidth;
            }
            if (bVar2.f3288b != this.mAdapter.getCount() - 1) {
                f3 = bVar2.f3291e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.mPageMargin) / f4;
            int i = 0;
            C0932b bVar = (C0932b) this.mItems.get(0);
            float f6 = bVar.f3291e;
            int size = this.mItems.size();
            int i2 = bVar.f3288b;
            int i3 = ((C0932b) this.mItems.get(size - 1)).f3288b;
            while (i2 < i3) {
                while (i2 > bVar.f3288b && i < size) {
                    i++;
                    bVar = (C0932b) this.mItems.get(i);
                }
                if (i2 == bVar.f3288b) {
                    f2 = (bVar.f3291e + bVar.f3290d) * f4;
                    f = bVar.f3291e + bVar.f3290d + f5;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.mPageMargin) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.mMarginDrawable.setBounds(Math.round(f2), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f2), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.mAdapter != null) {
            this.mAdapter.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C0932b bVar = (C0932b) this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.f3288b, bVar.f3287a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0937g();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        if (this.mAdapterChangeListeners != null && !this.mAdapterChangeListeners.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0934d) this.mAdapterChangeListeners.get(i2)).mo1668a(this, pagerAdapter2, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.mLastMotionX;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f2 != 0.0f && !isGutterDrag(this.mLastMotionX, f2)) {
                    if (canScroll(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                if (abs > ((float) this.mTouchSlop) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    if (f2 > 0.0f) {
                        f = this.mInitialMotionX + ((float) this.mTouchSlop);
                    } else {
                        f = this.mInitialMotionX - ((float) this.mTouchSlop);
                    }
                    this.mLastMotionX = f;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.mTouchSlop)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    C0991u.m4212e(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.mAdapter == null || this.mAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
            case 0:
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.mIsBeingDragged) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                    this.mPopulatePending = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0932b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                    float f2 = (float) clientWidth;
                    setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f3288b, ((((float) scrollX) / f2) - infoForCurrentScrollPosition.f3291e) / (infoForCurrentScrollPosition.f3290d + (((float) this.mPageMargin) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                    z = resetTouch();
                    break;
                }
                break;
            case 2:
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            if (x2 - this.mInitialMotionX > 0.0f) {
                                f = this.mInitialMotionX + ((float) this.mTouchSlop);
                            } else {
                                f = this.mInitialMotionX - ((float) this.mTouchSlop);
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    break;
                }
                break;
            case 3:
                if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    z = resetTouch();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.mLastMotionX = motionEvent.getX(actionIndex);
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                break;
        }
        if (z) {
            C0991u.m4212e(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r8.f3288b == r0.mCurItem) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.mCurItem
            if (r2 == r1) goto L_0x0011
            int r2 = r0.mCurItem
            android.support.v4.view.ViewPager$b r2 = r0.infoForPosition(r2)
            r0.mCurItem = r1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.support.v4.view.PagerAdapter r1 = r0.mAdapter
            if (r1 != 0) goto L_0x001a
            r17.sortChildDrawingOrder()
            return
        L_0x001a:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L_0x0022
            r17.sortChildDrawingOrder()
            return
        L_0x0022:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            android.support.v4.view.PagerAdapter r1 = r0.mAdapter
            r1.startUpdate(r0)
            int r1 = r0.mOffscreenPageLimit
            int r4 = r0.mCurItem
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.PagerAdapter r6 = r0.mAdapter
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.mCurItem
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.mExpectedAdapterCount
            if (r6 != r7) goto L_0x0214
            r7 = 0
        L_0x004c:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.mItems
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006c
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.mItems
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.ViewPager$b r8 = (android.support.p022v4.view.ViewPager.C0932b) r8
            int r9 = r8.f3288b
            int r10 = r0.mCurItem
            if (r9 < r10) goto L_0x0069
            int r9 = r8.f3288b
            int r10 = r0.mCurItem
            if (r9 != r10) goto L_0x006c
            goto L_0x006d
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x004c
        L_0x006c:
            r8 = 0
        L_0x006d:
            if (r8 != 0) goto L_0x0077
            if (r6 <= 0) goto L_0x0077
            int r8 = r0.mCurItem
            android.support.v4.view.ViewPager$b r8 = r0.addNewItem(r8, r7)
        L_0x0077:
            r9 = 0
            if (r8 == 0) goto L_0x01a2
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0087
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.mItems
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.ViewPager$b r11 = (android.support.p022v4.view.ViewPager.C0932b) r11
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x0092
            r3 = 0
            goto L_0x009f
        L_0x0092:
            float r14 = r8.f3290d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x009f:
            int r14 = r0.mCurItem
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a6:
            if (r14 < 0) goto L_0x0105
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00d3
            if (r14 >= r4) goto L_0x00d3
            if (r11 == 0) goto L_0x0105
            int r5 = r11.f3288b
            if (r14 != r5) goto L_0x0101
            boolean r5 = r11.f3289c
            if (r5 != 0) goto L_0x0101
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            r5.remove(r15)
            android.support.v4.view.PagerAdapter r5 = r0.mAdapter
            java.lang.Object r11 = r11.f3287a
            r5.destroyItem(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x0100
        L_0x00d3:
            if (r11 == 0) goto L_0x00e9
            int r5 = r11.f3288b
            if (r14 != r5) goto L_0x00e9
            float r5 = r11.f3290d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x0100
        L_0x00e9:
            int r5 = r15 + 1
            android.support.v4.view.ViewPager$b r5 = r0.addNewItem(r14, r5)
            float r5 = r5.f3290d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            r11 = r5
        L_0x0101:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a6
        L_0x0105:
            float r3 = r8.f3290d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0196
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x011e
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            if (r12 > 0) goto L_0x0123
            r7 = 0
            goto L_0x012b
        L_0x0123:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x012b:
            int r11 = r0.mCurItem
        L_0x012d:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0196
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0160
            if (r11 <= r1) goto L_0x0160
            if (r5 == 0) goto L_0x0196
            int r12 = r5.f3288b
            if (r11 != r12) goto L_0x0195
            boolean r12 = r5.f3289c
            if (r12 != 0) goto L_0x0195
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r12 = r0.mItems
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r0.mAdapter
            java.lang.Object r5 = r5.f3287a
            r12.destroyItem(r0, r11, r5)
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x0195
        L_0x015e:
            r5 = 0
            goto L_0x0195
        L_0x0160:
            if (r5 == 0) goto L_0x017c
            int r12 = r5.f3288b
            if (r11 != r12) goto L_0x017c
            float r5 = r5.f3290d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
            goto L_0x0195
        L_0x017c:
            android.support.v4.view.ViewPager$b r5 = r0.addNewItem(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3290d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p022v4.view.ViewPager.C0932b) r5
        L_0x0195:
            goto L_0x012d
        L_0x0196:
            r0.calculatePageOffsets(r8, r10, r2)
            android.support.v4.view.PagerAdapter r1 = r0.mAdapter
            int r2 = r0.mCurItem
            java.lang.Object r3 = r8.f3287a
            r1.setPrimaryItem(r0, r2, r3)
        L_0x01a2:
            android.support.v4.view.PagerAdapter r1 = r0.mAdapter
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01ac:
            if (r2 >= r1) goto L_0x01d5
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r4 = (android.support.p022v4.view.ViewPager.LayoutParams) r4
            r4.f3283e = r2
            boolean r5 = r4.f3279a
            if (r5 != 0) goto L_0x01d2
            float r5 = r4.f3281c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01d2
            android.support.v4.view.ViewPager$b r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L_0x01d2
            float r5 = r3.f3290d
            r4.f3281c = r5
            int r3 = r3.f3288b
            r4.position = r3
        L_0x01d2:
            int r2 = r2 + 1
            goto L_0x01ac
        L_0x01d5:
            r17.sortChildDrawingOrder()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0213
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e9
            android.support.v4.view.ViewPager$b r3 = r0.infoForAnyChild(r1)
            goto L_0x01ea
        L_0x01e9:
            r3 = 0
        L_0x01ea:
            if (r3 == 0) goto L_0x01f2
            int r1 = r3.f3288b
            int r2 = r0.mCurItem
            if (r1 == r2) goto L_0x0213
        L_0x01f2:
            r1 = 0
        L_0x01f3:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0213
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.ViewPager$b r3 = r0.infoForChild(r2)
            if (r3 == 0) goto L_0x0210
            int r3 = r3.f3288b
            int r4 = r0.mCurItem
            if (r3 != r4) goto L_0x0210
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 != 0) goto L_0x0213
        L_0x0210:
            int r1 = r1 + 1
            goto L_0x01f3
        L_0x0213:
            return
        L_0x0214:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0221 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0221 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0221 }
            goto L_0x0229
        L_0x0221:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0229:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.mExpectedAdapterCount
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.PagerAdapter r1 = r0.mAdapter
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.ViewPager.populate(int):void");
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, C0936f fVar) {
        setPageTransformer(z, fVar, 2);
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    private boolean isGutterDrag(float f, float f2) {
        if ((f >= ((float) this.mGutterSize) || f2 <= 0.0f) && (f <= ((float) (getWidth() - this.mGutterSize)) || f2 >= 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).f3283e;
    }

    /* access modifiers changed from: 0000 */
    public C0932b addNewItem(int i, int i2) {
        C0932b bVar = new C0932b();
        bVar.f3288b = i;
        bVar.f3287a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        bVar.f3290d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(bVar);
        } else {
            this.mItems.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0932b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f3288b == this.mCurItem && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.mDefaultGutterSize
            int r3 = java.lang.Math.min(r3, r4)
            r0.mGutterSize = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x003f:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c6
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c1
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r6 = (android.support.p022v4.view.ViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c1
            boolean r10 = r6.f3279a
            if (r10 == 0) goto L_0x00c1
            int r10 = r6.f3280b
            r10 = r10 & 7
            int r11 = r6.f3280b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006f
            r12 = 80
            if (r11 != r12) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            r12 = 3
            if (r10 == r12) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0081
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x007e:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0085
        L_0x0081:
            if (r7 == 0) goto L_0x007e
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0085:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0097
            int r10 = r6.width
            if (r10 == r14) goto L_0x0093
            int r10 = r6.width
            r13 = r10
            goto L_0x0094
        L_0x0093:
            r13 = r3
        L_0x0094:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0098
        L_0x0097:
            r13 = r3
        L_0x0098:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a5
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a3
            int r1 = r6.height
            goto L_0x00a7
        L_0x00a3:
            r1 = r5
            goto L_0x00a7
        L_0x00a5:
            r1 = r5
            r8 = r12
        L_0x00a7:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00ba
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c1
        L_0x00ba:
            if (r7 == 0) goto L_0x00c1
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c1:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003f
        L_0x00c6:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.mChildWidthMeasureSpec = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.mChildHeightMeasureSpec = r1
            r0.mInLayout = r7
            r16.populate()
            r1 = 0
            r0.mInLayout = r1
            int r2 = r16.getChildCount()
        L_0x00de:
            if (r1 >= r2) goto L_0x0108
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0105
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r5 = (android.support.p022v4.view.ViewPager.LayoutParams) r5
            if (r5 == 0) goto L_0x00f6
            boolean r7 = r5.f3279a
            if (r7 != 0) goto L_0x0105
        L_0x00f6:
            float r7 = (float) r3
            float r5 = r5.f3281c
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.mChildHeightMeasureSpec
            r4.measure(r5, r7)
        L_0x0105:
            int r1 = r1 + 1
            goto L_0x00de
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(i, f, i2);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0935e eVar = (C0935e) this.mOnPageChangeListeners.get(i3);
                if (eVar != null) {
                    eVar.onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f3279a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f3279a) {
            layoutParams2.f3282d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void setPageTransformer(boolean z, C0936f fVar, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (fVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = fVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0932b infoForChild = infoForChild(childAt);
                    if (infoForChild != null && infoForChild.f3288b == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006c
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r9 = (android.support.p022v4.view.ViewPager.LayoutParams) r9
            boolean r10 = r9.f3279a
            if (r10 == 0) goto L_0x0069
            int r9 = r9.f3280b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004e
            r10 = 3
            if (r9 == r10) goto L_0x0048
            r10 = 5
            if (r9 == r10) goto L_0x003b
            r9 = r4
            goto L_0x005d
        L_0x003b:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005a
        L_0x0048:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005d
        L_0x004e:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005a:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005d:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0068
            r8.offsetLeftAndRight(r4)
        L_0x0068:
            r4 = r9
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006c:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            android.support.v4.view.ViewPager$f r13 = r12.mPageTransformer
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007b:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.p022v4.view.ViewPager.LayoutParams) r0
            boolean r0 = r0.f3279a
            if (r0 != 0) goto L_0x009c
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.view.ViewPager$f r3 = r12.mPageTransformer
            r3.mo3622a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007b
        L_0x009f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.ViewPager.onPageScrolled(int, float, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollTo(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.mScroller == null || this.mScroller.isFinished()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.mIsScrollStarted) {
                i4 = this.mScroller.getCurrX();
            } else {
                i4 = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i6, scrollY, i7, i8, min);
        C0991u.m4212e(this);
    }

    private void calculatePageOffsets(C0932b bVar, int i, C0932b bVar2) {
        float f;
        float f2;
        float f3;
        C0932b bVar3;
        C0932b bVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (bVar2 != null) {
            int i2 = bVar2.f3288b;
            if (i2 < bVar.f3288b) {
                float f4 = bVar2.f3291e + bVar2.f3290d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f3288b && i4 < this.mItems.size()) {
                    Object obj = this.mItems.get(i4);
                    while (true) {
                        bVar4 = (C0932b) obj;
                        if (i3 > bVar4.f3288b && i4 < this.mItems.size() - 1) {
                            i4++;
                            obj = this.mItems.get(i4);
                        }
                    }
                    while (i3 < bVar4.f3288b) {
                        f4 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f3291e = f4;
                    f4 += bVar4.f3290d + f;
                    i3++;
                }
            } else if (i2 > bVar.f3288b) {
                int size = this.mItems.size() - 1;
                float f5 = bVar2.f3291e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f3288b || size < 0) {
                        break;
                    }
                    Object obj2 = this.mItems.get(size);
                    while (true) {
                        bVar3 = (C0932b) obj2;
                        if (i2 < bVar3.f3288b && size > 0) {
                            size--;
                            obj2 = this.mItems.get(size);
                        }
                    }
                    while (i2 > bVar3.f3288b) {
                        f5 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    f5 -= bVar3.f3290d + f;
                    bVar3.f3291e = f5;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = bVar.f3291e;
        int i5 = bVar.f3288b - 1;
        if (bVar.f3288b == 0) {
            f2 = bVar.f3291e;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i6 = count - 1;
        if (bVar.f3288b == i6) {
            f3 = (bVar.f3291e + bVar.f3290d) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i7 = i - 1;
        while (i7 >= 0) {
            C0932b bVar5 = (C0932b) this.mItems.get(i7);
            while (i5 > bVar5.f3288b) {
                f6 -= this.mAdapter.getPageWidth(i5) + f;
                i5--;
            }
            f6 -= bVar5.f3290d + f;
            bVar5.f3291e = f6;
            if (bVar5.f3288b == 0) {
                this.mFirstOffset = f6;
            }
            i7--;
            i5--;
        }
        float f7 = bVar.f3291e + bVar.f3290d + f;
        int i8 = bVar.f3288b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C0932b bVar6 = (C0932b) this.mItems.get(i9);
            while (i8 < bVar6.f3288b) {
                f7 += this.mAdapter.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f3288b == i6) {
                this.mLastOffset = (bVar6.f3290d + f7) - 1.0f;
            }
            bVar6.f3291e = f7;
            f7 += bVar6.f3290d + f;
            i9++;
            i8++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0932b infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f3291e, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
            }
        } else {
            if (z2) {
                dispatchOnPageSelected(i);
            }
            completeScroll(false);
            scrollTo(i3, 0);
            pageScrolled(i3);
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        return Math.max(((C0932b) this.mItems.get(0)).f3288b, Math.min(i, ((C0932b) this.mItems.get(this.mItems.size() - 1)).f3288b));
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C0932b infoForPosition = infoForPosition(this.mCurItem);
            if (infoForPosition != null) {
                f = Math.min(infoForPosition.f3291e, this.mLastOffset);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            int paddingLeft2 = ((i2 - getPaddingLeft()) - getPaddingRight()) + i4;
            scrollTo((int) ((((float) getScrollX()) / ((float) paddingLeft2)) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            if (i > this.mCurItem + i3 || i < this.mCurItem - i3) {
                for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                    ((C0932b) this.mItems.get(i4)).f3289c = true;
                }
            }
            if (this.mCurItem == i) {
                z3 = false;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
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
                        if (canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3279a) {
                    int i14 = layoutParams.f3280b & 7;
                    int i15 = layoutParams.f3280b & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i14 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i14 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i15 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i15 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i16 = i5 + scrollX;
                    childAt.layout(i16, i6, childAt.getMeasuredWidth() + i16, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i17 = (i7 - i12) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f3279a) {
                    C0932b infoForChild = infoForChild(childAt2);
                    if (infoForChild != null) {
                        float f = (float) i17;
                        int i19 = ((int) (infoForChild.f3291e * f)) + i12;
                        if (layoutParams2.f3282d) {
                            layoutParams2.f3282d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f3281c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.mTopPageBounds = i11;
        this.mBottomPageBounds = i8 - i9;
        this.mDecorChildCount = i10;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }
}
