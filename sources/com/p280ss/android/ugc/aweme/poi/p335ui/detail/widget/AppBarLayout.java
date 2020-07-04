package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.util.C0901h;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C7192b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C7192b(mo18670a = Behavior.class)
/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout */
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f92682a;

    /* renamed from: b */
    public int f92683b;

    /* renamed from: c */
    public int f92684c;

    /* renamed from: d */
    public boolean f92685d;

    /* renamed from: e */
    private int f92686e;

    /* renamed from: f */
    private int f92687f;

    /* renamed from: g */
    private int f92688g;

    /* renamed from: h */
    private int f92689h;

    /* renamed from: i */
    private C0954ab f92690i;

    /* renamed from: j */
    private List<C35365a> f92691j;

    /* renamed from: k */
    private boolean f92692k;

    /* renamed from: l */
    private boolean f92693l;

    /* renamed from: m */
    private int[] f92694m;

    /* renamed from: n */
    private int f92695n;

    /* renamed from: o */
    private int f92696o;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior */
    public static class Behavior extends C35374b<AppBarLayout> {

        /* renamed from: a */
        public int f92698a;

        /* renamed from: b */
        public C35364a f92699b;

        /* renamed from: d */
        private ValueAnimator f92700d;

        /* renamed from: e */
        private int f92701e = -1;

        /* renamed from: f */
        private boolean f92702f;

        /* renamed from: g */
        private float f92703g;

        /* renamed from: h */
        private WeakReference<View> f92704h;

        /* renamed from: i */
        private HashMap<Integer, Object> f92705i = new HashMap<>();

        /* renamed from: j */
        private float f92706j = 0.0f;

        /* renamed from: k */
        private ValueAnimator f92707k;

        /* renamed from: l */
        private boolean f92708l = false;

        /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior$SavedState */
        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                private static SavedState[] m114156a(int i) {
                    return new SavedState[i];
                }

                /* renamed from: a */
                private static SavedState m114154a(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m114154a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m114156a(i);
                }

                /* renamed from: a */
                private static SavedState m114155a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m114155a(parcel, classLoader);
                }
            };

            /* renamed from: a */
            int f92721a;

            /* renamed from: b */
            float f92722b;

            /* renamed from: c */
            boolean f92723c;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z;
                super(parcel, classLoader);
                this.f92721a = parcel.readInt();
                this.f92722b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f92723c = z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f92721a);
                parcel.writeFloat(this.f92722b);
                parcel.writeByte(this.f92723c ? (byte) 1 : 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior$a */
        public static abstract class C35364a {
            /* renamed from: a */
            public abstract boolean mo89991a(AppBarLayout appBarLayout);
        }

        /* renamed from: a */
        private static boolean m114126a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo89966b() {
            this.f92704h = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ int mo89960a(View view) {
            return m114140c((AppBarLayout) view);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            new StringBuilder("+++AppBarLayoutTag...onStartNestedScroll...").append(i2);
            int i3 = i & 2;
            boolean z = true;
            boolean z2 = i3 != 0 && appBarLayout.mo89934a() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...nestedScrollAxes...").append(i3 != 0);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...hasScrollableChildren...").append(appBarLayout.mo89934a());
            StringBuilder sb = new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...height...");
            if (coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                z = false;
            }
            sb.append(z);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...child...").append(view.getClass().getName());
            if (z2 && this.f92700d != null) {
                this.f92700d.cancel();
            }
            this.f92704h = null;
            m114144d();
            if (z2) {
                this.f92705i.put(Integer.valueOf(i2), null);
                mo90093d(appBarLayout);
            }
            return z2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            int i6 = i2;
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedPreScroll...dy : ");
            sb.append(i2);
            sb.append(" type : ");
            sb.append(i3);
            if (i6 != 0) {
                if (this.f92708l) {
                    iArr[1] = i6;
                    return;
                }
                if (i6 < 0) {
                    int i7 = -appBarLayout.getTotalScrollRange();
                    i5 = i7;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i7;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo90092b(coordinatorLayout, appBarLayout, i2, i5, i4, i3, false);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            int i6 = i4;
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedScroll...dyUnconsumed : ");
            sb.append(i6);
            sb.append(" type : ");
            sb.append(i5);
            if (i6 < 0) {
                if (!this.f92708l) {
                    mo90092b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0, i5, false);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            new StringBuilder("+++AppBarLayoutTag...onStopNestedScroll...type : ").append(i);
            if (i == 0) {
                m114119a(coordinatorLayout, appBarLayout);
            }
            this.f92704h = new WeakReference<>(view);
            this.f92705i.remove(Integer.valueOf(i));
            int i2 = 1;
            if (i == 1) {
                if (getTopAndBottomOffset() != 0) {
                    i2 = 0;
                }
                appBarLayout.mo89938c(i2);
                return;
            }
            m114128a(appBarLayout, this.f92706j);
            this.f92706j = 0.0f;
        }

        /* renamed from: a */
        private boolean m114128a(AppBarLayout appBarLayout, float f) {
            int i = -appBarLayout.f92684c;
            int topAndBottomOffset = getTopAndBottomOffset();
            StringBuilder sb = new StringBuilder("+++AppBarLayoutTag...onNestedFling...");
            sb.append(topAndBottomOffset);
            sb.append("/velocityY:");
            sb.append(f);
            if (topAndBottomOffset > i) {
                if ((!appBarLayout.f92685d) || (topAndBottomOffset < 0)) {
                    if (f == 0.0f) {
                        if (appBarLayout.f92685d) {
                            if (topAndBottomOffset >= i / 2) {
                                i = 0;
                            }
                            m114118a(appBarLayout, topAndBottomOffset, i, f);
                        } else {
                            m114118a(appBarLayout, topAndBottomOffset, i, f);
                        }
                    } else if (topAndBottomOffset > i / 2) {
                        if (!appBarLayout.f92685d) {
                            m114118a(appBarLayout, topAndBottomOffset, i, f);
                        } else if (f > 2000.0f) {
                            m114118a(appBarLayout, topAndBottomOffset, i, f);
                        } else {
                            m114118a(appBarLayout, topAndBottomOffset, 0, 0.0f);
                        }
                    } else if (!appBarLayout.f92685d) {
                        m114118a(appBarLayout, topAndBottomOffset, i, 0.0f);
                    } else if (f < -2000.0f) {
                        m114118a(appBarLayout, topAndBottomOffset, 0, f);
                    } else {
                        m114118a(appBarLayout, topAndBottomOffset, i, 0.0f);
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo89963a() {
            return !this.f92705i.isEmpty();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
            this.f92706j = f2;
            return super.onNestedFling(coordinatorLayout, appBarLayout, view, f, f2, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((C35370d) appBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo90015a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f92701e >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f92701e);
                int i2 = -childAt.getBottom();
                if (this.f92702f) {
                    round = i2 + C0991u.m4237p(childAt) + appBarLayout.getTopInset();
                } else {
                    round = i2 + Math.round(((float) childAt.getHeight()) * this.f92703g);
                }
                mo90091a(coordinatorLayout, appBarLayout, round, 0, false);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m114120a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        mo90091a(coordinatorLayout, appBarLayout, i3, 0, false);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m114120a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo90091a(coordinatorLayout, appBarLayout, 0, 0, false);
                    }
                }
            }
            appBarLayout.mo89936b();
            this.f92701e = -1;
            setTopAndBottomOffset(C0534a.m2233a(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0));
            m114138b(coordinatorLayout, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.mo89937b(getTopAndBottomOffset());
            return onLayoutChild;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo89968c(AppBarLayout appBarLayout) {
            if (this.f92699b != null) {
                return this.f92699b.mo89991a(appBarLayout);
            }
            if (this.f92704h == null || this.f92704h.get() == null) {
                return true;
            }
            View view = (View) this.f92704h.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public final /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo89967c() {
            return getTopAndBottomOffset() + this.f92698a;
        }

        /* renamed from: d */
        private void m114144d() {
            this.f92708l = false;
            if (this.f92707k != null) {
                if (this.f92707k.isRunning()) {
                    this.f92707k.removeAllListeners();
                    this.f92707k.cancel();
                }
                this.f92707k = null;
            }
        }

        /* renamed from: b */
        private static int m114134b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: c */
        private static int m114140c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public final /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo89965b(View view) {
            return m114134b((AppBarLayout) view);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo89962a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m114119a(coordinatorLayout, appBarLayout);
            appBarLayout.mo89938c(2);
        }

        /* renamed from: a */
        private static int m114116a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean mo89964a(AppBarLayout appBarLayout, float f) {
            return m114128a(appBarLayout, -f);
        }

        /* renamed from: c */
        private static View m114141c(AppBarLayout appBarLayout, int i) {
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

        /* renamed from: a */
        private void m114119a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int c = mo89967c();
            int a = m114116a(appBarLayout, c);
            if (a >= 0) {
                View childAt = appBarLayout.getChildAt(a);
                int i = ((LayoutParams) childAt.getLayoutParams()).f92724a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a == appBarLayout.getChildCount() - 1) {
                        i3 += appBarLayout.getTopInset();
                    }
                    if (m114126a(i, 2)) {
                        i3 += C0991u.m4237p(childAt);
                    } else if (m114126a(i, 5)) {
                        int p = C0991u.m4237p(childAt) + i3;
                        if (c < p) {
                            i2 = p;
                        } else {
                            i3 = p;
                        }
                    }
                    int i4 = (i3 + i2) / 2;
                    m114120a(coordinatorLayout, appBarLayout, C0534a.m2233a(i4, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                    new StringBuilder("+++AppBarLayout...snapToChildIfNeeded___executed...").append(i4);
                }
            }
        }

        /* renamed from: b */
        private static int m114135b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolator = layoutParams.f92725b;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (interpolator != null) {
                    int i4 = layoutParams.f92724a;
                    if ((i4 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((i4 & 2) != 0) {
                            i2 -= C0991u.m4237p(childAt);
                        }
                    }
                    if (C0991u.m4244w(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private static boolean m114142c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List c = coordinatorLayout.mo90018c((View) appBarLayout);
            int size = c.size();
            int i = 0;
            while (i < size) {
                com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C35370d) ((View) c.get(i)).getLayoutParams()).f92780a;
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) behavior).mOverlayTop != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f92721a = i;
                    if (bottom == C0991u.m4237p(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f92723c = z;
                    savedState.f92722b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void toggleAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            m114121a(coordinatorLayout, appBarLayout, i, (int) C34943c.f91127w, true);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.f3171e);
                this.f92701e = savedState.f92721a;
                this.f92703g = savedState.f92722b;
                this.f92702f = savedState.f92723c;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.f92701e = -1;
        }

        /* renamed from: a */
        private void m114118a(final AppBarLayout appBarLayout, int i, final int i2, float f) {
            int i3;
            if (this.f92707k == null) {
                int abs = Math.abs(mo89967c() - i2);
                float abs2 = Math.abs(f);
                if (abs2 <= 0.0f || !appBarLayout.f92685d) {
                    i3 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
                } else {
                    i3 = Math.round((((float) abs) / abs2) * 1000.0f) * 1;
                }
                this.f92707k = new ValueAnimator();
                this.f92707k.setDuration((long) i3);
                this.f92707k.setInterpolator(new DecelerateInterpolator());
                this.f92707k.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.setTopAndBottomOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        appBarLayout.mo89937b(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else if (this.f92707k.isRunning()) {
                this.f92707k.removeAllListeners();
                this.f92707k.cancel();
            }
            this.f92708l = true;
            this.f92707k.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    int i;
                    if (i2 == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    appBarLayout.mo89938c(i);
                }
            });
            this.f92707k.setIntValues(new int[]{i, i2});
            this.f92707k.start();
        }

        /* renamed from: a */
        private void m114120a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int i2;
            int height;
            if (i == (-appBarLayout.getHeight())) {
                i2 = appBarLayout.f92683b + i;
            } else {
                i2 = i;
            }
            int abs = Math.abs(mo89967c() - i2);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            m114121a(coordinatorLayout, appBarLayout, i, height, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2) {
            return super.onNestedPreFling(coordinatorLayout, appBarLayout, view, f, f2);
        }

        /* renamed from: b */
        private void m114138b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View c = m114141c(appBarLayout, i);
            if (c != null) {
                int i3 = ((LayoutParams) c.getLayoutParams()).f92724a;
                boolean z2 = false;
                if ((i3 & 1) != 0) {
                    int p = C0991u.m4237p(c);
                    if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (c.getBottom() - p) - appBarLayout.getTopInset()) : (-i) >= (c.getBottom() - p) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a = appBarLayout.mo89935a(z2);
                if (VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a && m114142c(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private void m114121a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final int i, int i2, final boolean z) {
            int c = mo89967c();
            if (c == i) {
                if (this.f92700d != null && this.f92700d.isRunning()) {
                    this.f92700d.cancel();
                }
                return;
            }
            if (this.f92700d == null) {
                this.f92700d = new ValueAnimator();
                this.f92700d.setInterpolator(new DecelerateInterpolator());
                this.f92700d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        Behavior behavior = Behavior.this;
                        CoordinatorLayout coordinatorLayout = coordinatorLayout;
                        AppBarLayout appBarLayout = appBarLayout;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (z) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        behavior.mo90091a(coordinatorLayout, appBarLayout, intValue, i, false);
                        appBarLayout.mo89937b(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else {
                this.f92700d.removeAllListeners();
                this.f92700d.cancel();
            }
            this.f92700d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    int i;
                    if (i == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    appBarLayout.mo89938c(i);
                }
            });
            this.f92708l = false;
            this.f92700d.setDuration((long) Math.min(i2, 600));
            this.f92700d.setIntValues(new int[]{c, i});
            this.f92700d.start();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int mo89961a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            boolean z2;
            int i7;
            int c = mo89967c();
            int i8 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f92698a = 0;
            } else {
                int a = C0534a.m2233a(i, i2, i3);
                if (c != a) {
                    if (appBarLayout.f92682a) {
                        i5 = m114135b(appBarLayout, a);
                    } else {
                        i5 = a;
                    }
                    i8 = c - a;
                    this.f92698a = a - i5;
                    if (this.f92708l && !z) {
                        return i8;
                    }
                    StringBuilder sb = new StringBuilder("setHeaderTopBottomOffset+++++curOffset:");
                    sb.append(c);
                    sb.append("/newOffset:");
                    sb.append(a);
                    StringBuilder sb2 = new StringBuilder("setHeaderTopBottomOffset+++++getTopAndBottomOffset:");
                    sb2.append(getTopAndBottomOffset());
                    sb2.append("/");
                    sb2.append(mo89967c());
                    sb2.append("/");
                    sb2.append(appBarLayout.getHeight());
                    int i9 = -appBarLayout.f92684c;
                    StringBuilder sb3 = new StringBuilder("setHeaderTopBottomOffset+++++anchor : ");
                    sb3.append(i9);
                    sb3.append(" / interpolatedOffset : ");
                    sb3.append(i5);
                    sb3.append(" / touchType : ");
                    sb3.append(i4);
                    if (i9 > i5 || i4 != 1) {
                        z2 = setTopAndBottomOffset(i5);
                        i6 = 1;
                    } else if (i9 >= i5 || i4 != 1 || getTopAndBottomOffset() <= i9) {
                        z2 = setTopAndBottomOffset(i9);
                        i6 = 3;
                    } else {
                        z2 = setTopAndBottomOffset(i5);
                        i6 = 2;
                    }
                    StringBuilder sb4 = new StringBuilder("setHeaderTopBottomOffset+++++getTopAndBottomOffset:  interpolatedOffset : ");
                    sb4.append(i5);
                    sb4.append("****");
                    sb4.append(i6);
                    new StringBuilder("setHeaderTopBottomOffset+++++offsetChanged...").append(z2);
                    if (!z2 && appBarLayout.f92682a) {
                        coordinatorLayout.mo90013a((View) appBarLayout);
                    }
                    appBarLayout.mo89937b(getTopAndBottomOffset());
                    if (a < c) {
                        i7 = -1;
                    } else {
                        i7 = 1;
                    }
                    m114138b(coordinatorLayout, appBarLayout, a, i7, false);
                }
            }
            return i8;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$LayoutParams */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f92724a = 1;

        /* renamed from: b */
        public Interpolator f92725b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo89992a() {
            if ((this.f92724a & 1) != 1 || (this.f92724a & 10) == 0) {
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
            this.f92724a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f92725b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$ScrollingViewBehavior */
    public static class ScrollingViewBehavior extends C35376c {
        public ScrollingViewBehavior() {
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* access modifiers changed from: 0000 */
        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C35370d) appBarLayout.getLayoutParams()).f92780a;
            if (behavior instanceof Behavior) {
                return ((Behavior) behavior).mo89967c();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public AppBarLayout findFirstDependency(List<View> list) {
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
        public float getOverlapRatioForOffset(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + appBarLayoutOffset <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.mOverlayTop = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(coordinatorLayout, view, view2);
            return false;
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        private void offsetChildAsNeeded(CoordinatorLayout coordinatorLayout, View view, View view2) {
            com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C35370d) view2.getLayoutParams()).f92780a;
            if (behavior instanceof Behavior) {
                C0991u.m4222h(view, (((view2.getBottom() - view.getTop()) + ((Behavior) behavior).f92698a) + this.mVerticalLayoutGap) - getOverlapPixelsForOffset(view2));
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.mo90017b(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.mTempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.mo89933a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$a */
    public interface C35365a {
        /* renamed from: a */
        void mo89871a(AppBarLayout appBarLayout, int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo89936b() {
        this.f92689h = 0;
    }

    public int getAnchorHeight() {
        return this.f92684c;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f92689h;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    /* renamed from: d */
    private void m114104d() {
        this.f92686e = -1;
        this.f92687f = -1;
        this.f92688g = -1;
    }

    /* renamed from: e */
    private static LayoutParams m114105e() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final int getTopInset() {
        int i;
        if (this.f92690i != null) {
            i = this.f92690i.mo3719b();
        } else {
            i = 0;
        }
        return i + this.f92695n;
    }

    /* renamed from: c */
    private void m114103c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i).getLayoutParams()).mo89992a()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        m114102b(z);
    }

    /* access modifiers changed from: 0000 */
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
        if (this.f92687f != -1) {
            return this.f92687f;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f92724a;
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
        this.f92687f = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        if (this.f92688g != -1) {
            return this.f92688g;
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
            int i3 = layoutParams.f92724a;
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
        this.f92688g = max;
        return max;
    }

    public final int getTotalScrollRange() {
        if (this.f92686e != -1) {
            return this.f92686e;
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
            int i3 = layoutParams.f92724a;
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
        int max = Math.max(0, i2 - getTopInset()) - this.f92683b;
        this.f92686e = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo89934a() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setTopInset(int i) {
        this.f92695n = i;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setAnchorHeight(int i) {
        if (i > 0) {
            this.f92684c = i;
        }
    }

    public void setExpanded(boolean z) {
        mo89933a(z, C0991u.m4167D(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: b */
    private boolean m114102b(boolean z) {
        if (this.f92692k == z) {
            return false;
        }
        this.f92692k = z;
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
            C35380g.m114269a(this, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo89938c(int i) {
        if (this.f92691j != null) {
            int size = this.f92691j.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f92691j.get(i2);
            }
        }
    }

    /* renamed from: a */
    private static LayoutParams m114100a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo89937b(int i) {
        if (this.f92691j != null) {
            int size = this.f92691j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C35365a aVar = (C35365a) this.f92691j.get(i2);
                if (!(aVar == null || this.f92696o == i)) {
                    aVar.mo89871a(this, i);
                    this.f92696o = i;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f92694m == null) {
            this.f92694m = new int[2];
        }
        int[] iArr = this.f92694m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        if (this.f92692k) {
            i2 = R.attr.a35;
        } else {
            i2 = -2130969680;
        }
        iArr[0] = i2;
        if (!this.f92692k || !this.f92693l) {
            i3 = -2130969679;
        } else {
            i3 = R.attr.a34;
        }
        iArr[1] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0954ab mo89930a(C0954ab abVar) {
        C0954ab abVar2;
        if (C0991u.m4244w(this)) {
            abVar2 = abVar;
        } else {
            abVar2 = null;
        }
        if (!C0901h.m3836a(this.f92690i, abVar2)) {
            this.f92690i = abVar2;
            m114104d();
        }
        return abVar;
    }

    /* renamed from: a */
    public final void mo89931a(int i) {
        com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C35370d) getLayoutParams()).f92780a;
        if (behavior != null && (behavior instanceof C35374b)) {
            ((C35374b) behavior).mo90091a((CoordinatorLayout) getParent(), this, i, 0, false);
        }
    }

    /* renamed from: a */
    public final void mo89932a(C35365a aVar) {
        if (this.f92691j == null) {
            this.f92691j = new ArrayList();
        }
        if (!this.f92691j.contains(aVar)) {
            this.f92691j.add(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo89935a(boolean z) {
        if (this.f92693l == z) {
            return false;
        }
        this.f92693l = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: a */
    public final void mo89933a(boolean z, boolean z2) {
        m114101a(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m114104d();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92686e = -1;
        this.f92687f = -1;
        this.f92688g = -1;
        this.f92685d = true;
        setOrientation(1);
        C35377d.m114263a(context);
        if (VERSION.SDK_INT >= 21) {
            C35380g.m114268a(this);
            C35380g.m114270a(this, attributeSet, 0, R.style.q9);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout, 0, R.style.q9);
        C0991u.m4185a((View) this, obtainStyledAttributes.getDrawable(0));
        if (obtainStyledAttributes.hasValue(4)) {
            m114101a(obtainStyledAttributes.getBoolean(4, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(3)) {
            C35380g.m114269a(this, (float) obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(2, false));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(1, false));
            }
        }
        obtainStyledAttributes.recycle();
        C0991u.m4188a((View) this, (C0983o) new C0983o() {
            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                return AppBarLayout.this.mo89930a(abVar);
            }
        });
    }

    /* renamed from: a */
    private void m114101a(boolean z, boolean z2, boolean z3) {
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
        this.f92689h = i4 | i3;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m114104d();
        int i5 = 0;
        this.f92682a = false;
        int childCount = getChildCount();
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).f92725b != null) {
                this.f92682a = true;
                break;
            } else {
                i5++;
            }
        }
        m114103c();
    }
}
