package android.support.p022v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0945c.C0946a;
import android.support.p022v4.widget.C1060q.C1063a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {
    static final boolean CAN_HIDE_DESCENDANTS;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    private static final int[] THEME_ATTRS = {16843828};
    private final C1008b mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final C1010d mLeftCallback;
    private final C1060q mLeftDragger;
    private C1009c mListener;
    private List<C1009c> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final C1010d mRightCallback;
    private final C1060q mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    /* renamed from: android.support.v4.widget.DrawerLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f3465a;

        /* renamed from: b */
        float f3466b;

        /* renamed from: c */
        boolean f3467c;

        /* renamed from: d */
        int f3468d;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3465a = layoutParams.f3465a;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f3465a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m4303a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m4301a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4301a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m4303a(i);
            }

            /* renamed from: a */
            private static SavedState m4302a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m4302a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f3469a;

        /* renamed from: b */
        int f3470b;

        /* renamed from: c */
        int f3471c;

        /* renamed from: f */
        int f3472f;

        /* renamed from: g */
        int f3473g;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3469a);
            parcel.writeInt(this.f3470b);
            parcel.writeInt(this.f3471c);
            parcel.writeInt(this.f3472f);
            parcel.writeInt(this.f3473g);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3469a = parcel.readInt();
            this.f3470b = parcel.readInt();
            this.f3471c = parcel.readInt();
            this.f3472f = parcel.readInt();
            this.f3473g = parcel.readInt();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$SimpleDrawerListener */
    public static abstract class SimpleDrawerListener implements C1009c {
        public void onDrawerClosed(View view) {
        }

        public void onDrawerOpened(View view) {
        }

        public void onDrawerSlide(View view, float f) {
        }

        public void onDrawerStateChanged(int i) {
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C1007a extends C0939a {

        /* renamed from: c */
        private final Rect f3475c = new Rect();

        C1007a() {
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: a */
        private static void m4305a(C0945c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    cVar.mo3662c(childAt);
                }
            }
        }

        /* renamed from: d */
        public final boolean mo3631d(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3631d(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer != null) {
                CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer));
                if (drawerTitle != null) {
                    text.add(drawerTitle);
                }
            }
            return true;
        }

        /* renamed from: a */
        private void m4304a(C0945c cVar, C0945c cVar2) {
            Rect rect = this.f3475c;
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
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.mo1148a(view, cVar);
            } else {
                C0945c a = C0945c.m3984a(cVar);
                super.mo1148a(view, a);
                cVar.mo3654b(view);
                ViewParent i = C0991u.m4223i(view);
                if (i instanceof View) {
                    cVar.mo3668d((View) i);
                }
                m4304a(cVar, a);
                a.mo3701t();
                m4305a(cVar, (ViewGroup) view);
            }
            cVar.mo3656b((CharSequence) DrawerLayout.class.getName());
            cVar.mo3665c(false);
            cVar.mo3670d(false);
            cVar.mo3659b(C0946a.f3307a);
            cVar.mo3659b(C0946a.f3308b);
        }

        /* renamed from: a */
        public final boolean mo3630a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.mo3630a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C1008b extends C0939a {
        C1008b() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                cVar.mo3668d((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C1009c {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    class C1010d extends C1063a {

        /* renamed from: a */
        public C1060q f3476a;

        /* renamed from: c */
        private final int f3478c;

        /* renamed from: d */
        private final Runnable f3479d = new Runnable() {
            public final void run() {
                C1010d.this.mo3909b();
            }
        };

        /* renamed from: a */
        public final void mo3907a() {
            DrawerLayout.this.removeCallbacks(this.f3479d);
        }

        /* renamed from: c */
        private void m4311c() {
            int i = 3;
            if (this.f3478c == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3909b() {
            boolean z;
            View view;
            int i;
            int i2 = this.f3476a.f3677e;
            int i3 = 0;
            if (this.f3478c == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
                if (view != null) {
                    i3 = -view.getWidth();
                }
                i = i3 + i2;
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
                i = DrawerLayout.this.getWidth() - i2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                this.f3476a.mo4157a(view, i, view.getTop());
                layoutParams.f3467c = true;
                DrawerLayout.this.invalidate();
                m4311c();
                DrawerLayout.this.cancelChildViewTouch();
            }
        }

        /* renamed from: b */
        public final int mo1578b(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo1364a(int i) {
            DrawerLayout.this.updateDrawerState(this.f3478c, i, this.f3476a.f3679g);
        }

        C1010d(int i) {
            this.f3478c = i;
        }

        /* renamed from: b */
        public final void mo1579b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3467c = false;
            m4311c();
        }

        /* renamed from: a */
        public final void mo3908a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3479d, 160);
        }

        /* renamed from: b */
        public final void mo3910b(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (view != null && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                this.f3476a.mo4154a(view, i2);
            }
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (!DrawerLayout.this.isDrawerView(view) || !DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f3478c) || DrawerLayout.this.getDrawerLockMode(view) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final int mo1363a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public final int mo1368b(View view, int i, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (!DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            } else if (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                i = 0;
            } else {
                i = -width;
            }
            this.f3476a.mo4155a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            float f;
            int i5;
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                f = ((float) (i + width)) / ((float) width);
            } else {
                f = ((float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            }
            DrawerLayout.this.setDrawerViewOffset(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    private boolean hasVisibleDrawer() {
        if (findVisibleDrawer() != null) {
            return true;
        }
        return false;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3467c) {
                return true;
            }
        }
        return false;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    /* access modifiers changed from: 0000 */
    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3468d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        CAN_HIDE_DESCENDANTS = z;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = z2;
    }

    private Drawable resolveLeftShadow() {
        int h = C0991u.m4220h(this);
        if (h == 0) {
            if (this.mShadowStart != null) {
                mirror(this.mShadowStart, h);
                return this.mShadowStart;
            }
        } else if (this.mShadowEnd != null) {
            mirror(this.mShadowEnd, h);
            return this.mShadowEnd;
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int h = C0991u.m4220h(this);
        if (h == 0) {
            if (this.mShadowEnd != null) {
                mirror(this.mShadowEnd, h);
                return this.mShadowEnd;
            }
        } else if (this.mShadowStart != null) {
            mirror(this.mShadowStart, h);
            return this.mShadowStart;
        }
        return this.mShadowRight;
    }

    /* access modifiers changed from: 0000 */
    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3466b);
        }
        this.mScrimOpacity = f;
        boolean a = this.mLeftDragger.mo4158a(true);
        boolean a2 = this.mRightDragger.mo4158a(true);
        if (a || a2) {
            C0991u.m4212e(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z2 = true;
            if (layoutParams.f3468d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (layoutParams.f3468d != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3469a = layoutParams.f3465a;
            } else {
                i++;
            }
        }
        savedState.f3470b = this.mLockModeLeft;
        savedState.f3471c = this.mLockModeRight;
        savedState.f3472f = this.mLockModeStart;
        savedState.f3473g = this.mLockModeEnd;
        return savedState;
    }

    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3466b;
    }

    /* access modifiers changed from: 0000 */
    public boolean isContentView(View view) {
        if (((LayoutParams) view.getLayoutParams()).f3465a == 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(C1009c cVar) {
        if (cVar != null && this.mListeners != null) {
            this.mListeners.remove(cVar);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    static boolean includeChildForAccessibility(View view) {
        if (C0991u.m4214f(view) == 4 || C0991u.m4214f(view) == 2) {
            return false;
        }
        return true;
    }

    public void addDrawerListener(C1009c cVar) {
        if (cVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public CharSequence getDrawerTitle(int i) {
        int a = C0972e.m4109a(i, C0991u.m4220h(this));
        if (a == 3) {
            return this.mTitleLeft;
        }
        if (a == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int getDrawerViewAbsoluteGravity(View view) {
        return C0972e.m4109a(((LayoutParams) view.getLayoutParams()).f3465a, C0991u.m4220h(this));
    }

    /* access modifiers changed from: 0000 */
    public boolean isDrawerView(View view) {
        int a = C0972e.m4109a(((LayoutParams) view.getLayoutParams()).f3465a, C0991u.m4220h(view));
        if ((a & 3) == 0 && (a & 5) == 0) {
            return false;
        }
        return true;
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                C0991u.m4230k(childAt, this.mDrawerElevation);
            }
        }
    }

    public void setDrawerListener(C1009c cVar) {
        if (this.mListener != null) {
            removeDrawerListener(this.mListener);
        }
        if (cVar != null) {
            addDrawerListener(cVar);
        }
        this.mListener = cVar;
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0683b.m2903a(getContext(), i);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerClosed(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3468d & 1) == 1) {
            layoutParams.f3468d = 0;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1009c) this.mListeners.get(size)).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3468d & 1) == 0) {
            layoutParams.f3468d = 1;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1009c) this.mListeners.get(size)).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public View findDrawerWithGravity(int i) {
        int a = C0972e.m4109a(i, C0991u.m4220h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).f3465a);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerOpen(View view) {
        if (!isDrawerView(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        } else if ((((LayoutParams) view.getLayoutParams()).f3468d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawerVisible(View view) {
        if (!isDrawerView(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        } else if (((LayoutParams) view.getLayoutParams()).f3466b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            if (VERSION.SDK_INT < 21 || this.mLastInsets == null) {
                i = 0;
            } else {
                i = ((WindowInsets) this.mLastInsets).getSystemWindowInsetTop();
            }
            if (i > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void closeDrawers(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || layoutParams.f3467c)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    z2 |= this.mLeftDragger.mo4157a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.mRightDragger.mo4157a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.f3467c = false;
            }
        }
        this.mLeftCallback.mo3907a();
        this.mRightCallback.mo3907a();
        if (z2) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getDrawerLockMode(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int h = C0991u.m4220h(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.mLockModeEnd != 3) {
                            return this.mLockModeEnd;
                        }
                        if (h == 0) {
                            i5 = this.mLockModeRight;
                        } else {
                            i5 = this.mLockModeLeft;
                        }
                        if (i5 != 3) {
                            return i5;
                        }
                    }
                } else if (this.mLockModeStart != 3) {
                    return this.mLockModeStart;
                } else {
                    if (h == 0) {
                        i4 = this.mLockModeLeft;
                    } else {
                        i4 = this.mLockModeRight;
                    }
                    if (i4 != 3) {
                        return i4;
                    }
                }
            } else if (this.mLockModeRight != 3) {
                return this.mLockModeRight;
            } else {
                if (h == 0) {
                    i3 = this.mLockModeEnd;
                } else {
                    i3 = this.mLockModeStart;
                }
                if (i3 != 3) {
                    return i3;
                }
            }
        } else if (this.mLockModeLeft != 3) {
            return this.mLockModeLeft;
        } else {
            if (h == 0) {
                i2 = this.mLockModeStart;
            } else {
                i2 = this.mLockModeEnd;
            }
            if (i2 != 3) {
                return i2;
            }
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean a = this.mLeftDragger.mo4156a(motionEvent) | this.mRightDragger.mo4156a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.mInitialMotionX = x;
                this.mInitialMotionY = y;
                if (this.mScrimOpacity > 0.0f) {
                    View b = this.mLeftDragger.mo4159b((int) x, (int) y);
                    if (b != null && isContentView(b)) {
                        z = true;
                        this.mDisallowInterceptRequested = false;
                        this.mChildrenCanceledTouch = false;
                        break;
                    }
                }
                z = false;
                this.mDisallowInterceptRequested = false;
                this.mChildrenCanceledTouch = false;
            case 1:
            case 3:
                closeDrawers(true);
                this.mDisallowInterceptRequested = false;
                this.mChildrenCanceledTouch = false;
                break;
            case 2:
                if (this.mLeftDragger.mo4162b(3)) {
                    this.mLeftCallback.mo3907a();
                    this.mRightCallback.mo3907a();
                    break;
                }
                break;
        }
        z = false;
        if (a || z || hasPeekingDrawer() || this.mChildrenCanceledTouch) {
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
        super.onRestoreInstanceState(savedState.f3171e);
        if (savedState.f3469a != 0) {
            View findDrawerWithGravity = findDrawerWithGravity(savedState.f3469a);
            if (findDrawerWithGravity != null) {
                openDrawer(findDrawerWithGravity);
            }
        }
        if (savedState.f3470b != 3) {
            setDrawerLockMode(savedState.f3470b, 3);
        }
        if (savedState.f3471c != 3) {
            setDrawerLockMode(savedState.f3471c, 5);
        }
        if (savedState.f3472f != 3) {
            setDrawerLockMode(savedState.f3472f, 8388611);
        }
        if (savedState.f3473g != 3) {
            setDrawerLockMode(savedState.f3473g, 8388613);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.mLeftDragger.mo4161b(motionEvent);
        this.mRightDragger.mo4161b(motionEvent);
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.mInitialMotionX = x;
                    this.mInitialMotionY = y;
                    this.mDisallowInterceptRequested = false;
                    this.mChildrenCanceledTouch = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View b = this.mLeftDragger.mo4159b((int) x2, (int) y2);
                    if (b != null && isContentView(b)) {
                        float f = x2 - this.mInitialMotionX;
                        float f2 = y2 - this.mInitialMotionY;
                        int i = this.mLeftDragger.f3674b;
                        if ((f * f) + (f2 * f2) < ((float) (i * i))) {
                            View findOpenDrawer = findOpenDrawer();
                            if (!(findOpenDrawer == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                                z = false;
                                closeDrawers(z);
                                this.mDisallowInterceptRequested = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    closeDrawers(z);
                    this.mDisallowInterceptRequested = false;
            }
        } else {
            closeDrawers(true);
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean mirror(Drawable drawable, int i) {
        if (drawable == null || !C0727a.m3110b(drawable)) {
            return false;
        }
        C0727a.m3111b(drawable, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        if ((getDrawerViewAbsoluteGravity(view) & i) == i) {
            return true;
        }
        return false;
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0683b.m2903a(getContext(), i), i2);
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerSlide(View view, float f) {
        if (this.mListeners != null) {
            for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                ((C1009c) this.mListeners.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void moveDrawerToOffset(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int drawerViewOffset = i - ((int) (getDrawerViewOffset(view) * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            drawerViewOffset = -drawerViewOffset;
        }
        view.offsetLeftAndRight(drawerViewOffset);
        setDrawerViewOffset(view, f);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        if (findVisibleDrawer != null) {
            return true;
        }
        return false;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int a = C0972e.m4109a(i, C0991u.m4220h(this));
        if (a == 3) {
            this.mTitleLeft = charSequence;
            return;
        }
        if (a == 5) {
            this.mTitleRight = charSequence;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setDrawerViewOffset(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3466b) {
            layoutParams.f3466b = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || isDrawerView(childAt)) && (!z || childAt != view)) {
                C0991u.m4206c(childAt, 4);
            } else {
                C0991u.m4206c(childAt, 1);
            }
        }
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f3465a);
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.f3466b = 0.0f;
                layoutParams.f3468d = 0;
            } else if (z) {
                layoutParams.f3468d |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo4157a(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.mo4157a(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(layoutParams.f3465a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.f3466b = 1.0f;
                layoutParams.f3468d = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                layoutParams.f3468d |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo4157a(view, 0, view.getTop());
                } else {
                    this.mRightDragger.mo4157a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(layoutParams.f3465a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerLockMode(int i, int i2) {
        C1060q qVar;
        int a = C0972e.m4109a(i2, C0991u.m4220h(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            if (a == 3) {
                qVar = this.mLeftDragger;
            } else {
                qVar = this.mRightDragger;
            }
            qVar.mo4152a();
        }
        switch (i) {
            case 1:
                View findDrawerWithGravity = findDrawerWithGravity(a);
                if (findDrawerWithGravity != null) {
                    closeDrawer(findDrawerWithGravity);
                    break;
                }
                break;
            case 2:
                View findDrawerWithGravity2 = findDrawerWithGravity(a);
                if (findDrawerWithGravity2 != null) {
                    openDrawer(findDrawerWithGravity2);
                    return;
                }
                break;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = C34943c.f91128x;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = C34943c.f91128x;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.mLastInsets == null || !C0991u.m4244w(this)) {
            z = false;
        } else {
            z = true;
        }
        int h = C0991u.m4220h(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int a = C0972e.m4109a(layoutParams.f3465a, h);
                    if (C0991u.m4244w(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION && C0991u.m4240s(childAt) != this.mDrawerElevation) {
                        C0991u.m4230k(childAt, this.mDrawerElevation);
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    if (drawerViewAbsoluteGravity == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((!z2 || !z3) && (z2 || !z4)) {
                        if (z2) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.mMinDrawerMargin + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        sb.append(gravityToString(drawerViewAbsoluteGravity));
                        sb.append(" but this DrawerLayout");
                        sb.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            C0991u.m4206c(view, 4);
        } else {
            C0991u.m4206c(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            C0991u.m4187a(view, (C0939a) this.mChildAccessibilityDelegate);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.mNonDrawerViews.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public void updateDrawerState(int i, int i2, View view) {
        int i3 = this.mLeftDragger.f3673a;
        int i4 = this.mRightDragger.f3673a;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (!(i3 == 2 || i4 == 2)) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f3466b == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (layoutParams.f3466b == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i5 != this.mDrawerState) {
            this.mDrawerState = i5;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1009c) this.mListeners.get(size)).onDrawerStateChanged(i5);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new C1008b();
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.mLeftCallback = new C1010d(3);
        this.mRightCallback = new C1010d(5);
        this.mLeftDragger = C1060q.m4590a((ViewGroup) this, 1.0f, (C1063a) this.mLeftCallback);
        this.mLeftDragger.f3678f = 1;
        this.mLeftDragger.f3676d = f2;
        this.mLeftCallback.f3476a = this.mLeftDragger;
        this.mRightDragger = C1060q.m4590a((ViewGroup) this, 1.0f, (C1063a) this.mRightCallback);
        this.mRightDragger.f3678f = 2;
        this.mRightDragger.f3676d = f2;
        this.mRightCallback.f3476a = this.mRightDragger;
        setFocusableInTouchMode(true);
        C0991u.m4206c((View) this, 1);
        C0991u.m4187a((View) this, (C0939a) new C1007a());
        setMotionEventSplittingEnabled(false);
        if (C0991u.m4244w(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        boolean z;
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        if (windowInsets.getSystemWindowInsetTop() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        drawerLayout.setChildInsets(windowInsets, z);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
                try {
                    this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.mStatusBarBackground = null;
            }
        }
        this.mDrawerElevation = f * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean isContentView = isContentView(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (isContentView) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.mScrimOpacity > 0.0f && isContentView) {
            this.mScrimPaint.setColor((((int) (((float) ((this.mScrimColor & -16777216) >>> 24)) * this.mScrimOpacity)) << 24) | (this.mScrimColor & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view2, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.f3677e), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view2, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.f3677e), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2;
        int i6;
        this.mInLayout = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3466b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i7 - ((int) (layoutParams.f3466b * f3));
                        f = ((float) (i7 - i9)) / f3;
                        i5 = i9;
                    }
                    if (f != layoutParams.f3466b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = layoutParams.f3465a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < layoutParams.topMargin) {
                            i12 = layoutParams.topMargin;
                        } else if (i12 + measuredHeight > i11 - layoutParams.bottomMargin) {
                            i12 = (i11 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i13 = i4 - i2;
                        childAt.layout(i5, (i13 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i13 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    if (layoutParams.f3466b > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }
}
