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
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.ViewPager.C0935e;
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

/* renamed from: android.support.v4.view.DmtViewPager */
public class DmtViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f3181a = {16842931};

    /* renamed from: ai */
    private static final C0925g f3182ai = new C0925g();

    /* renamed from: g */
    private static final Comparator<C0920b> f3183g = new Comparator<C0920b>() {
        /* renamed from: a */
        private static int m3936a(C0920b bVar, C0920b bVar2) {
            return bVar.f3254b - bVar2.f3254b;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m3936a((C0920b) obj, (C0920b) obj2);
        }
    };

    /* renamed from: h */
    private static final Interpolator f3184h = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private boolean f3185A;

    /* renamed from: B */
    private int f3186B = 1;

    /* renamed from: C */
    private boolean f3187C;

    /* renamed from: D */
    private boolean f3188D;

    /* renamed from: E */
    private int f3189E;

    /* renamed from: F */
    private int f3190F;

    /* renamed from: G */
    private int f3191G;

    /* renamed from: H */
    private float f3192H;

    /* renamed from: I */
    private float f3193I;

    /* renamed from: J */
    private float f3194J;

    /* renamed from: K */
    private float f3195K;

    /* renamed from: L */
    private int f3196L = -1;

    /* renamed from: M */
    private VelocityTracker f3197M;

    /* renamed from: N */
    private int f3198N;

    /* renamed from: O */
    private int f3199O;

    /* renamed from: P */
    private int f3200P;

    /* renamed from: Q */
    private int f3201Q;

    /* renamed from: R */
    private EdgeEffect f3202R;

    /* renamed from: S */
    private EdgeEffect f3203S;

    /* renamed from: T */
    private boolean f3204T = true;

    /* renamed from: U */
    private boolean f3205U = false;

    /* renamed from: V */
    private boolean f3206V;

    /* renamed from: W */
    private int f3207W;

    /* renamed from: aa */
    private List<C0935e> f3208aa;

    /* renamed from: ab */
    private C0935e f3209ab;

    /* renamed from: ac */
    private C0935e f3210ac;

    /* renamed from: ad */
    private List<C0922d> f3211ad;

    /* renamed from: ae */
    private C0923e f3212ae;

    /* renamed from: af */
    private int f3213af;

    /* renamed from: ag */
    private int f3214ag;

    /* renamed from: ah */
    private ArrayList<View> f3215ah;

    /* renamed from: aj */
    private final Runnable f3216aj = new Runnable() {
        public final void run() {
            DmtViewPager.this.setScrollState(0);
            DmtViewPager.this.mo3485c();
        }
    };

    /* renamed from: ak */
    private int f3217ak = 0;

    /* renamed from: b */
    PagerAdapter f3218b;

    /* renamed from: c */
    int f3219c;

    /* renamed from: d */
    public boolean f3220d;

    /* renamed from: e */
    public boolean f3221e;

    /* renamed from: f */
    private int f3222f;

    /* renamed from: i */
    private final ArrayList<C0920b> f3223i = new ArrayList<>();

    /* renamed from: j */
    private final C0920b f3224j = new C0920b();

    /* renamed from: k */
    private final Rect f3225k = new Rect();

    /* renamed from: l */
    private int f3226l = -1;

    /* renamed from: m */
    private Parcelable f3227m = null;

    /* renamed from: n */
    private ClassLoader f3228n = null;

    /* renamed from: o */
    private Scroller f3229o;

    /* renamed from: p */
    private boolean f3230p;

    /* renamed from: q */
    private C0924f f3231q;

    /* renamed from: r */
    private int f3232r;

    /* renamed from: s */
    private Drawable f3233s;

    /* renamed from: t */
    private int f3234t;

    /* renamed from: u */
    private int f3235u;

    /* renamed from: v */
    private float f3236v = -3.4028235E38f;

    /* renamed from: w */
    private float f3237w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f3238x;

    /* renamed from: y */
    private int f3239y;

    /* renamed from: z */
    private boolean f3240z;

    /* renamed from: android.support.v4.view.DmtViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3244a;

        /* renamed from: b */
        public int f3245b;

        /* renamed from: c */
        float f3246c;

        /* renamed from: d */
        boolean f3247d;

        /* renamed from: e */
        int f3248e;

        /* renamed from: f */
        int f3249f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DmtViewPager.f3181a);
            this.f3245b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m3940a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m3938a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3938a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3940a(i);
            }

            /* renamed from: a */
            private static SavedState m3939a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m3939a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f3250a;

        /* renamed from: b */
        Parcelable f3251b;

        /* renamed from: c */
        ClassLoader f3252c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f3250a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3250a);
            parcel.writeParcelable(this.f3251b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f3250a = parcel.readInt();
            this.f3251b = parcel.readParcelable(classLoader);
            this.f3252c = classLoader;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.DmtViewPager$a */
    public @interface C0919a {
    }

    /* renamed from: android.support.v4.view.DmtViewPager$b */
    static class C0920b {

        /* renamed from: a */
        Object f3253a;

        /* renamed from: b */
        int f3254b;

        /* renamed from: c */
        boolean f3255c;

        /* renamed from: d */
        float f3256d;

        /* renamed from: e */
        float f3257e;

        C0920b() {
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$c */
    class C0921c extends C0939a {
        /* renamed from: a */
        private boolean m3941a() {
            if (DmtViewPager.this.f3218b == null || DmtViewPager.this.f3218b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C0921c() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            cVar.mo3656b((CharSequence) getClass().getName());
            cVar.mo3687k(m3941a());
            if (DmtViewPager.this.canScrollHorizontally(1)) {
                cVar.mo3644a(4096);
            }
            if (DmtViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setScrollable(m3941a());
            if (accessibilityEvent.getEventType() == 4096 && DmtViewPager.this.f3218b != null) {
                accessibilityEvent.setItemCount(DmtViewPager.this.f3218b.getCount());
                accessibilityEvent.setFromIndex(DmtViewPager.this.f3219c);
                accessibilityEvent.setToIndex(DmtViewPager.this.f3219c);
            }
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !DmtViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                DmtViewPager.this.setCurrentItem(DmtViewPager.this.f3219c - 1);
                return true;
            } else if (!DmtViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                DmtViewPager.this.setCurrentItem(DmtViewPager.this.f3219c + 1);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$d */
    public interface C0922d {
        /* renamed from: a */
        void mo3520a(DmtViewPager dmtViewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: android.support.v4.view.DmtViewPager$e */
    public interface C0923e {
    }

    /* renamed from: android.support.v4.view.DmtViewPager$f */
    class C0924f extends DataSetObserver {
        public final void onChanged() {
            DmtViewPager.this.mo3483b();
        }

        public final void onInvalidated() {
            DmtViewPager.this.mo3483b();
        }

        C0924f() {
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$g */
    static class C0925g implements Comparator<View> {
        C0925g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m3946a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m3946a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f3244a == layoutParams2.f3244a) {
                return layoutParams.f3248e - layoutParams2.f3248e;
            }
            if (layoutParams.f3244a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f3218b;
    }

    public int getCurrentItem() {
        return this.f3219c;
    }

    public int getOffscreenPageLimit() {
        return this.f3186B;
    }

    public int getPageMargin() {
        return this.f3232r;
    }

    /* renamed from: a */
    public final void mo3478a(C0922d dVar) {
        if (this.f3211ad == null) {
            this.f3211ad = new ArrayList();
        }
        this.f3211ad.add(dVar);
    }

    /* renamed from: a */
    public void mo3450a(int i, boolean z) {
        this.f3220d = false;
        m3902a(i, z, false);
    }

    /* renamed from: a */
    private void m3903a(int i, boolean z, boolean z2, int i2) {
        if (this.f3218b == null || this.f3218b.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3219c != i || this.f3223i.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3218b.getCount()) {
                i = this.f3218b.getCount() - 1;
            }
            int i3 = this.f3186B;
            if (i > this.f3219c + i3 || i < this.f3219c - i3) {
                for (int i4 = 0; i4 < this.f3223i.size(); i4++) {
                    ((C0920b) this.f3223i.get(i4)).f3255c = true;
                }
            }
            if (this.f3219c == i) {
                z3 = false;
            }
            if (this.f3204T) {
                this.f3219c = i;
                if (z3) {
                    m3919d(i);
                }
                requestLayout();
                return;
            }
            m3897a(i);
            m3901a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m3901a(int i, boolean z, int i2, boolean z2) {
        C0920b b = m3910b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f3236v, Math.min(b.f3257e, this.f3237w))) : 0;
        if (z) {
            m3899a(clientWidth, 0, i2);
            if (z2) {
                m3919d(i);
            }
        } else {
            if (z2) {
                m3919d(i);
            }
            m3906a(false);
            scrollTo(clientWidth, 0);
            m3917c(clientWidth);
        }
    }

    /* renamed from: a */
    public void mo3451a(C0935e eVar) {
        if (this.f3208aa == null) {
            this.f3208aa = new ArrayList();
        }
        this.f3208aa.add(eVar);
    }

    /* renamed from: a */
    private void m3899a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f3229o != null && !this.f3229o.isFinished()) {
            i4 = this.f3230p ? this.f3229o.getCurrX() : this.f3229o.getStartX();
            this.f3229o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = 0 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m3906a(false);
            mo3485c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float a = f2 + (m3892a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f3218b.getPageWidth(this.f3219c)) + ((float) this.f3232r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f3230p = false;
        this.f3229o.startScroll(i6, scrollY, i7, i8, min);
        C0991u.m4212e(this);
    }

    /* renamed from: a */
    private void m3904a(C0920b bVar, int i, C0920b bVar2) {
        C0920b bVar3;
        C0920b bVar4;
        int count = this.f3218b.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3232r) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f3254b;
            if (i2 < bVar.f3254b) {
                float f2 = bVar2.f3257e + bVar2.f3256d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f3254b && i4 < this.f3223i.size()) {
                    Object obj = this.f3223i.get(i4);
                    while (true) {
                        bVar4 = (C0920b) obj;
                        if (i3 > bVar4.f3254b && i4 < this.f3223i.size() - 1) {
                            i4++;
                            obj = this.f3223i.get(i4);
                        }
                    }
                    while (i3 < bVar4.f3254b) {
                        f2 += this.f3218b.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f3257e = f2;
                    f2 += bVar4.f3256d + f;
                    i3++;
                }
            } else if (i2 > bVar.f3254b) {
                int size = this.f3223i.size() - 1;
                float f3 = bVar2.f3257e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f3254b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f3223i.get(size);
                    while (true) {
                        bVar3 = (C0920b) obj2;
                        if (i2 < bVar3.f3254b && size > 0) {
                            size--;
                            obj2 = this.f3223i.get(size);
                        }
                    }
                    while (i2 > bVar3.f3254b) {
                        f3 -= this.f3218b.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f3256d + f;
                    bVar3.f3257e = f3;
                }
            }
        }
        int size2 = this.f3223i.size();
        float f4 = bVar.f3257e;
        int i5 = bVar.f3254b - 1;
        this.f3236v = bVar.f3254b == 0 ? bVar.f3257e : -3.4028235E38f;
        int i6 = count - 1;
        this.f3237w = bVar.f3254b == i6 ? (bVar.f3257e + bVar.f3256d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C0920b bVar5 = (C0920b) this.f3223i.get(i7);
            while (i5 > bVar5.f3254b) {
                f4 -= this.f3218b.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f3256d + f;
            bVar5.f3257e = f4;
            if (bVar5.f3254b == 0) {
                this.f3236v = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f3257e + bVar.f3256d + f;
        int i8 = bVar.f3254b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C0920b bVar6 = (C0920b) this.f3223i.get(i9);
            while (i8 < bVar6.f3254b) {
                f5 += this.f3218b.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f3254b == i6) {
                this.f3237w = (bVar6.f3256d + f5) - 1.0f;
            }
            bVar6.f3257e = f5;
            f5 += bVar6.f3256d + f;
            i9++;
            i8++;
        }
        this.f3205U = false;
    }

    /* renamed from: a */
    private static boolean m3909a(View view) {
        return view.getClass().getAnnotation(C0919a.class) != null;
    }

    /* renamed from: a */
    private void m3900a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3223i.isEmpty()) {
            C0920b b = m3910b(this.f3219c);
            int min = (int) ((b != null ? Math.min(b.f3257e, this.f3237w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m3906a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3229o.isFinished()) {
            this.f3229o.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: a */
    private void m3906a(boolean z) {
        boolean z2 = this.f3217ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3229o.isFinished()) {
                this.f3229o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3229o.getCurrX();
                int currY = this.f3229o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m3917c(currX);
                    }
                }
            } else if (this.f3229o.getCurrX() != getScrollX()) {
                scrollTo(this.f3229o.getCurrX(), this.f3229o.getCurrY());
            }
        }
        this.f3220d = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f3223i.size(); i++) {
            C0920b bVar = (C0920b) this.f3223i.get(i);
            if (bVar.f3255c) {
                bVar.f3255c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0991u.m4190a((View) this, this.f3216aj);
                return;
            }
            this.f3216aj.run();
        }
    }

    /* renamed from: a */
    private void m3905a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3196L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3192H = motionEvent.getX(i);
            this.f3196L = motionEvent.getPointerId(i);
            if (this.f3197M != null) {
                this.f3197M.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3479a(View view, boolean z, int i, int i2, int i3) {
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
                        if (mo3479a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
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

    /* renamed from: a */
    private boolean m3908a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2)) {
                            return m3926i();
                        }
                        return m3923f(17);
                    case 22:
                        if (keyEvent.hasModifiers(2)) {
                            return m3927j();
                        }
                        return m3923f(66);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m3923f(2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return m3923f(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo3485c() {
        m3897a(this.f3219c);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3204T = true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private boolean m3926i() {
        if (this.f3219c <= 0) {
            return false;
        }
        mo3450a(this.f3219c - 1, true);
        return true;
    }

    /* renamed from: d */
    private void m3918d() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f3244a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: h */
    private void m3925h() {
        this.f3187C = false;
        this.f3188D = false;
        if (this.f3197M != null) {
            this.f3197M.recycle();
            this.f3197M = null;
        }
    }

    /* renamed from: j */
    private boolean m3927j() {
        if (this.f3218b == null || this.f3219c >= this.f3218b.getCount() - 1) {
            return false;
        }
        mo3450a(this.f3219c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3233s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3216aj);
        if (this.f3229o != null && !this.f3229o.isFinished()) {
            this.f3229o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3250a = this.f3219c;
        if (this.f3218b != null) {
            savedState.f3251b = this.f3218b.saveState();
        }
        return savedState;
    }

    /* renamed from: e */
    private void m3920e() {
        if (this.f3214ag != 0) {
            if (this.f3215ah == null) {
                this.f3215ah = new ArrayList<>();
            } else {
                this.f3215ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3215ah.add(getChildAt(i));
            }
            Collections.sort(this.f3215ah, f3182ai);
        }
    }

    /* renamed from: f */
    private boolean m3922f() {
        this.f3196L = -1;
        m3925h();
        this.f3202R.onRelease();
        this.f3203S.onRelease();
        if (this.f3202R.isFinished() || this.f3203S.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private C0920b m3924g() {
        float f;
        float f2;
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.f3232r) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        C0920b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f3223i.size()) {
            C0920b bVar2 = (C0920b) this.f3223i.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f3254b != i3) {
                    bVar2 = this.f3224j;
                    bVar2.f3257e = f3 + f4 + f2;
                    bVar2.f3254b = i3;
                    bVar2.f3256d = this.f3218b.getPageWidth(bVar2.f3254b);
                    i--;
                }
            }
            f3 = bVar2.f3257e;
            float f5 = bVar2.f3256d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f3223i.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f3254b;
            f4 = bVar2.f3256d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f3230p = true;
        if (this.f3229o.isFinished() || !this.f3229o.computeScrollOffset()) {
            m3906a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3229o.getCurrX();
        int currY = this.f3229o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m3917c(currX)) {
                this.f3229o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0991u.m4212e(this);
    }

    /* renamed from: a */
    private void mo3452a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3229o = new Scroller(context, f3184h);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3191G = viewConfiguration.getScaledPagingTouchSlop();
        this.f3198N = (int) (400.0f * f);
        this.f3199O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3202R = new EdgeEffect(context);
        this.f3203S = new EdgeEffect(context);
        this.f3200P = (int) (25.0f * f);
        this.f3201Q = (int) (2.0f * f);
        this.f3189E = (int) (f * 16.0f);
        C0991u.m4187a((View) this, (C0939a) new C0921c());
        if (C0991u.m4214f(this) == 0) {
            C0991u.m4206c((View) this, 1);
        }
        C0991u.m4188a((View) this, (C0983o) new C0983o() {

            /* renamed from: b */
            private final Rect f3243b = new Rect();

            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                C0954ab a = C0991u.m4176a(view, abVar);
                if (a.mo3724f()) {
                    return a;
                }
                Rect rect = this.f3243b;
                rect.left = a.mo3717a();
                rect.top = a.mo3719b();
                rect.right = a.mo3720c();
                rect.bottom = a.mo3721d();
                int childCount = DmtViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0954ab b = C0991u.m4199b(DmtViewPager.this.getChildAt(i), a);
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
    /* renamed from: b */
    public final void mo3483b() {
        boolean z;
        int count = this.f3218b.getCount();
        this.f3222f = count;
        if (this.f3223i.size() >= (this.f3186B * 2) + 1 || this.f3223i.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        int i = this.f3219c;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f3223i.size()) {
            C0920b bVar = (C0920b) this.f3223i.get(i2);
            int itemPosition = this.f3218b.getItemPosition(bVar.f3253a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3223i.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f3218b.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f3218b.destroyItem((ViewGroup) this, bVar.f3254b, bVar.f3253a);
                    if (this.f3219c == bVar.f3254b) {
                        i = Math.max(0, Math.min(this.f3219c, count - 1));
                    }
                } else if (bVar.f3254b != itemPosition) {
                    if (bVar.f3254b == this.f3219c) {
                        i = itemPosition;
                    }
                    bVar.f3254b = itemPosition;
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f3218b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3223i, f3183g);
        if (z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f3244a) {
                    layoutParams.f3246c = 0.0f;
                }
            }
            m3902a(i, false, true);
            requestLayout();
        }
    }

    public void setDefaultGutterSize(int i) {
        this.f3189E = i;
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.f3209ab = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.f3229o = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3185A != z) {
            this.f3185A = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: a */
    private static float m3892a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    private void m3916c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: b */
    public final void mo3484b(C0922d dVar) {
        if (this.f3211ad != null) {
            this.f3211ad.remove(dVar);
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

    public void removeView(View view) {
        if (this.f3240z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f3220d = false;
        m3902a(i, !this.f3204T, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f3186B) {
            this.f3186B = i;
            mo3485c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f3232r;
        this.f3232r = i;
        int width = getWidth();
        m3900a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0683b.m2903a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f3233s) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C0920b m3910b(int i) {
        for (int i2 = 0; i2 < this.f3223i.size(); i2++) {
            C0920b bVar = (C0920b) this.f3223i.get(i2);
            if (bVar.f3254b == i) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private C0920b m3915c(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m3911b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || m3908a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f3233s = drawable;
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
        if (this.f3217ak != i) {
            this.f3217ak = i;
            if (this.f3212ae != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                m3913b(z);
            }
            m3921e(i);
        }
    }

    /* renamed from: b */
    private C0920b m3911b(View view) {
        for (int i = 0; i < this.f3223i.size(); i++) {
            C0920b bVar = (C0920b) this.f3223i.get(i);
            if (this.f3218b.isViewFromObject(view, bVar.f3253a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m3919d(int i) {
        if (this.f3209ab != null) {
            this.f3209ab.onPageSelected(i);
        }
        if (this.f3208aa != null) {
            int size = this.f3208aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0935e eVar = (C0935e) this.f3208aa.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
        if (this.f3210ac != null) {
            this.f3210ac.onPageSelected(i);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0920b b = m3911b(childAt);
                if (b != null && b.f3254b == this.f3219c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f3218b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3236v))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f3237w))) {
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
                C0920b b = m3911b(childAt);
                if (b != null && b.f3254b == this.f3219c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        if (this.f3218b != null) {
            this.f3218b.restoreState(savedState.f3251b, savedState.f3252c);
            m3902a(savedState.f3250a, false, true);
            return;
        }
        this.f3226l = savedState.f3250a;
        this.f3227m = savedState.f3251b;
        this.f3228n = savedState.f3252c;
    }

    public DmtViewPager(Context context) {
        super(context);
        mo3452a();
    }

    /* renamed from: c */
    private boolean m3917c(int i) {
        if (this.f3223i.size() != 0) {
            C0920b g = m3924g();
            int clientWidth = getClientWidth();
            int i2 = this.f3232r + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.f3232r) / f;
            int i3 = g.f3254b;
            float f3 = ((((float) i) / f) - g.f3257e) / (g.f3256d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.f3206V = false;
            m3898a(i3, f3, i4);
            if (this.f3206V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f3204T) {
            return false;
        } else {
            this.f3206V = false;
            m3898a(0, 0.0f, 0);
            if (this.f3206V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: e */
    private void m3921e(int i) {
        if (this.f3209ab != null) {
            this.f3209ab.onPageScrollStateChanged(i);
        }
        if (this.f3208aa != null) {
            int size = this.f3208aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0935e eVar = (C0935e) this.f3208aa.get(i2);
                if (eVar != null) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
        if (this.f3210ac != null) {
            this.f3210ac.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: b */
    private void m3913b(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.f3213af;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3923f(int r7) {
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
            android.graphics.Rect r1 = r6.f3225k
            android.graphics.Rect r1 = r6.m3894a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3225k
            android.graphics.Rect r2 = r6.m3894a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m3926i()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f3225k
            android.graphics.Rect r1 = r6.m3894a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3225k
            android.graphics.Rect r2 = r6.m3894a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m3927j()
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
            boolean r2 = r6.m3927j()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m3926i()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.DmtViewPager.m3923f(int):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f3218b != null && this.f3218b.getCount() > 1)) {
            if (!this.f3202R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f3236v * ((float) width));
                this.f3202R.setSize(height, width);
                z = false | this.f3202R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3203S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3237w + 1.0f)) * ((float) width2));
                this.f3203S.setSize(height2, width2);
                z |= this.f3203S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3202R.finish();
            this.f3203S.finish();
        }
        if (z) {
            C0991u.m4212e(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f3232r > 0 && this.f3233s != null && this.f3223i.size() > 0 && this.f3218b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f3232r) / f4;
            int i = 0;
            C0920b bVar = (C0920b) this.f3223i.get(0);
            float f6 = bVar.f3257e;
            int size = this.f3223i.size();
            int i2 = bVar.f3254b;
            int i3 = ((C0920b) this.f3223i.get(size - 1)).f3254b;
            while (i2 < i3) {
                while (i2 > bVar.f3254b && i < size) {
                    i++;
                    bVar = (C0920b) this.f3223i.get(i);
                }
                if (i2 == bVar.f3254b) {
                    f2 = (bVar.f3257e + bVar.f3256d) * f4;
                    f = bVar.f3257e + bVar.f3256d + f5;
                } else {
                    float pageWidth = this.f3218b.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f3232r) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.f3233s.setBounds(Math.round(f2), this.f3234t, Math.round(((float) this.f3232r) + f2), this.f3235u);
                    this.f3233s.draw(canvas);
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
        if (this.f3218b != null) {
            this.f3218b.setViewPagerObserver(null);
            this.f3218b.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f3223i.size(); i++) {
                C0920b bVar = (C0920b) this.f3223i.get(i);
                this.f3218b.destroyItem((ViewGroup) this, bVar.f3254b, bVar.f3253a);
            }
            this.f3218b.finishUpdate((ViewGroup) this);
            this.f3223i.clear();
            m3918d();
            this.f3219c = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f3218b;
        this.f3218b = pagerAdapter;
        this.f3222f = 0;
        if (this.f3218b != null) {
            if (this.f3231q == null) {
                this.f3231q = new C0924f();
            }
            this.f3218b.setViewPagerObserver(this.f3231q);
            this.f3220d = false;
            boolean z = this.f3204T;
            this.f3204T = true;
            this.f3222f = this.f3218b.getCount();
            if (this.f3226l >= 0) {
                this.f3218b.restoreState(this.f3227m, this.f3228n);
                m3902a(this.f3226l, false, true);
                this.f3226l = -1;
                this.f3227m = null;
                this.f3228n = null;
            } else if (!z) {
                mo3485c();
            } else {
                requestLayout();
            }
        }
        if (this.f3211ad != null && !this.f3211ad.isEmpty()) {
            int size = this.f3211ad.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0922d) this.f3211ad.get(i2)).mo3520a(this, pagerAdapter2, pagerAdapter);
            }
        }
    }

    /* renamed from: b */
    private boolean m3914b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3192H - f;
        this.f3192H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f3236v * clientWidth;
        float f4 = this.f3237w * clientWidth;
        boolean z3 = false;
        C0920b bVar = (C0920b) this.f3223i.get(0);
        C0920b bVar2 = (C0920b) this.f3223i.get(this.f3223i.size() - 1);
        if (bVar.f3254b != 0) {
            f3 = bVar.f3257e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f3254b != this.f3218b.getCount() - 1) {
            f4 = bVar2.f3257e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3202R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3203S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3192H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m3917c(i);
        return z3;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1) {
            m3922f();
            return false;
        }
        if (action != 0) {
            if (this.f3187C) {
                return true;
            }
            if (this.f3188D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3194J = x;
            this.f3192H = x;
            float y = motionEvent.getY();
            this.f3195K = y;
            this.f3193I = y;
            this.f3196L = motionEvent2.getPointerId(0);
            this.f3188D = false;
            this.f3230p = true;
            this.f3229o.computeScrollOffset();
            if (this.f3217ak != 2 || Math.abs(this.f3229o.getFinalX() - this.f3229o.getCurrX()) <= this.f3201Q) {
                m3906a(false);
                this.f3187C = false;
            } else {
                this.f3229o.abortAnimation();
                this.f3220d = false;
                mo3485c();
                this.f3187C = true;
                m3916c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3196L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.f3192H;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f3195K);
                if (f2 != 0.0f && !m3907a(this.f3192H, f2)) {
                    if (mo3479a(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f3192H = x2;
                        this.f3193I = y2;
                        this.f3188D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f3191G) && abs * 0.5f > abs2) {
                    this.f3187C = true;
                    m3916c(true);
                    setScrollState(1);
                    if (f2 > 0.0f) {
                        f = this.f3194J + ((float) this.f3191G);
                    } else {
                        f = this.f3194J - ((float) this.f3191G);
                    }
                    this.f3192H = f;
                    this.f3193I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f3191G)) {
                    this.f3188D = true;
                }
                if (this.f3187C && m3914b(x2)) {
                    C0991u.m4212e(this);
                }
            }
        } else if (action == 6) {
            m3905a(motionEvent);
        }
        if (this.f3197M == null) {
            this.f3197M = VelocityTracker.obtain();
        }
        this.f3197M.addMovement(motionEvent2);
        return this.f3187C;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.f3221e) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.f3218b == null || this.f3218b.getCount() == 0) {
            return false;
        }
        if (this.f3197M == null) {
            this.f3197M = VelocityTracker.obtain();
        }
        this.f3197M.addMovement(motionEvent);
        switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
            case 0:
                this.f3229o.abortAnimation();
                this.f3220d = false;
                mo3485c();
                float x = motionEvent.getX();
                this.f3194J = x;
                this.f3192H = x;
                float y = motionEvent.getY();
                this.f3195K = y;
                this.f3193I = y;
                this.f3196L = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f3187C) {
                    VelocityTracker velocityTracker = this.f3197M;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f3199O);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f3196L);
                    this.f3220d = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0920b g = m3924g();
                    float f2 = (float) clientWidth;
                    m3903a(m3893a(g.f3254b, ((((float) scrollX) / f2) - g.f3257e) / (g.f3256d + (((float) this.f3232r) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3196L)) - this.f3194J)), true, true, xVelocity);
                    z = m3922f();
                    break;
                }
                break;
            case 2:
                if (!this.f3187C) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3196L);
                    if (findPointerIndex == -1) {
                        z = m3922f();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f3192H);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f3193I);
                        if (abs > ((float) this.f3191G) && abs > abs2) {
                            this.f3187C = true;
                            m3916c(true);
                            if (x2 - this.f3194J > 0.0f) {
                                f = this.f3194J + ((float) this.f3191G);
                            } else {
                                f = this.f3194J - ((float) this.f3191G);
                            }
                            this.f3192H = f;
                            this.f3193I = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3187C) {
                    z = false | m3914b(motionEvent.getX(motionEvent.findPointerIndex(this.f3196L)));
                    break;
                }
                break;
            case 3:
                if (this.f3187C) {
                    m3901a(this.f3219c, true, 0, false);
                    z = m3922f();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f3192H = motionEvent.getX(actionIndex);
                this.f3196L = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m3905a(motionEvent);
                this.f3192H = motionEvent.getX(motionEvent.findPointerIndex(this.f3196L));
                break;
        }
        if (z) {
            C0991u.m4212e(this);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r8.f3254b == r0.f3219c) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3897a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3219c
            if (r2 == r1) goto L_0x0011
            int r2 = r0.f3219c
            android.support.v4.view.DmtViewPager$b r2 = r0.m3910b(r2)
            r0.f3219c = r1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.support.v4.view.PagerAdapter r1 = r0.f3218b
            if (r1 != 0) goto L_0x001a
            r17.m3920e()
            return
        L_0x001a:
            boolean r1 = r0.f3220d
            if (r1 == 0) goto L_0x0022
            r17.m3920e()
            return
        L_0x0022:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            android.support.v4.view.PagerAdapter r1 = r0.f3218b
            r1.startUpdate(r0)
            int r1 = r0.f3186B
            int r4 = r0.f3219c
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.PagerAdapter r6 = r0.f3218b
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.f3219c
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f3222f
            if (r6 != r7) goto L_0x0218
            r7 = 0
        L_0x004c:
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r8 = r0.f3223i
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006c
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r8 = r0.f3223i
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.DmtViewPager$b r8 = (android.support.p022v4.view.DmtViewPager.C0920b) r8
            int r9 = r8.f3254b
            int r10 = r0.f3219c
            if (r9 < r10) goto L_0x0069
            int r9 = r8.f3254b
            int r10 = r0.f3219c
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
            int r8 = r0.f3219c
            android.support.v4.view.DmtViewPager$b r8 = r0.m3895a(r8, r7)
        L_0x0077:
            r9 = 0
            if (r8 == 0) goto L_0x0199
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0087
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r11 = r0.f3223i
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.DmtViewPager$b r11 = (android.support.p022v4.view.DmtViewPager.C0920b) r11
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
            float r14 = r8.f3256d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x009f:
            int r14 = r0.f3219c
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
            int r5 = r11.f3254b
            if (r14 != r5) goto L_0x0101
            boolean r5 = r11.f3255c
            if (r5 != 0) goto L_0x0101
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            r5.remove(r15)
            android.support.v4.view.PagerAdapter r5 = r0.f3218b
            java.lang.Object r11 = r11.f3253a
            r5.destroyItem(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
            goto L_0x0100
        L_0x00d3:
            if (r11 == 0) goto L_0x00e9
            int r5 = r11.f3254b
            if (r14 != r5) goto L_0x00e9
            float r5 = r11.f3256d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
            goto L_0x0100
        L_0x00e9:
            int r5 = r15 + 1
            android.support.v4.view.DmtViewPager$b r5 = r0.m3895a(r14, r5)
            float r5 = r5.f3256d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
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
            float r3 = r8.f3256d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0196
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x011e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
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
            int r11 = r0.f3219c
        L_0x012d:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0196
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0160
            if (r11 <= r1) goto L_0x0160
            if (r5 == 0) goto L_0x0196
            int r12 = r5.f3254b
            if (r11 != r12) goto L_0x0195
            boolean r12 = r5.f3255c
            if (r12 != 0) goto L_0x0195
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r12 = r0.f3223i
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r0.f3218b
            java.lang.Object r5 = r5.f3253a
            r12.destroyItem(r0, r11, r5)
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
            goto L_0x0195
        L_0x015e:
            r5 = 0
            goto L_0x0195
        L_0x0160:
            if (r5 == 0) goto L_0x017c
            int r12 = r5.f3254b
            if (r11 != r12) goto L_0x017c
            float r5 = r5.f3256d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
            goto L_0x0195
        L_0x017c:
            android.support.v4.view.DmtViewPager$b r5 = r0.m3895a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3256d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3223i
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p022v4.view.DmtViewPager.C0920b) r5
        L_0x0195:
            goto L_0x012d
        L_0x0196:
            r0.m3904a(r8, r10, r2)
        L_0x0199:
            android.support.v4.view.PagerAdapter r1 = r0.f3218b
            int r2 = r0.f3219c
            if (r8 == 0) goto L_0x01a2
            java.lang.Object r3 = r8.f3253a
            goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            r1.setPrimaryItem(r0, r2, r3)
            android.support.v4.view.PagerAdapter r1 = r0.f3218b
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01b0:
            if (r2 >= r1) goto L_0x01d9
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r4 = (android.support.p022v4.view.DmtViewPager.LayoutParams) r4
            r4.f3249f = r2
            boolean r5 = r4.f3244a
            if (r5 != 0) goto L_0x01d6
            float r5 = r4.f3246c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01d6
            android.support.v4.view.DmtViewPager$b r3 = r0.m3911b(r3)
            if (r3 == 0) goto L_0x01d6
            float r5 = r3.f3256d
            r4.f3246c = r5
            int r3 = r3.f3254b
            r4.f3248e = r3
        L_0x01d6:
            int r2 = r2 + 1
            goto L_0x01b0
        L_0x01d9:
            r17.m3920e()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0217
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01ed
            android.support.v4.view.DmtViewPager$b r3 = r0.m3915c(r1)
            goto L_0x01ee
        L_0x01ed:
            r3 = 0
        L_0x01ee:
            if (r3 == 0) goto L_0x01f6
            int r1 = r3.f3254b
            int r2 = r0.f3219c
            if (r1 == r2) goto L_0x0217
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0217
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.DmtViewPager$b r3 = r0.m3911b(r2)
            if (r3 == 0) goto L_0x0214
            int r3 = r3.f3254b
            int r4 = r0.f3219c
            if (r3 != r4) goto L_0x0214
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 != 0) goto L_0x0217
        L_0x0214:
            int r1 = r1 + 1
            goto L_0x01f7
        L_0x0217:
            return
        L_0x0218:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0225 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0225 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0225 }
            goto L_0x022d
        L_0x0225:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x022d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f3222f
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
            android.support.v4.view.PagerAdapter r1 = r0.f3218b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.DmtViewPager.m3897a(int):void");
    }

    /* renamed from: b */
    public void mo3453b(C0935e eVar) {
        if (this.f3208aa != null) {
            this.f3208aa.remove(eVar);
        }
    }

    /* renamed from: a */
    private boolean m3907a(float f, float f2) {
        if ((f >= ((float) this.f3190F) || f2 <= 0.0f) && (f <= ((float) (getWidth() - this.f3190F)) || f2 >= 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3214ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f3215ah.get(i2)).getLayoutParams()).f3249f;
    }

    /* renamed from: a */
    private C0920b m3895a(int i, int i2) {
        C0920b bVar = new C0920b();
        bVar.f3254b = i;
        bVar.f3253a = this.f3218b.instantiateItem((ViewGroup) this, i);
        bVar.f3256d = this.f3218b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f3223i.size()) {
            this.f3223i.add(bVar);
        } else {
            this.f3223i.add(i2, bVar);
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
                C0920b b = m3911b(childAt);
                if (b != null && b.f3254b == this.f3219c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public DmtViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3452a();
    }

    /* renamed from: a */
    private Rect m3894a(Rect rect, View view) {
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
            int r4 = r0.f3189E
            int r3 = java.lang.Math.min(r3, r4)
            r0.f3190F = r3
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
            android.support.v4.view.DmtViewPager$LayoutParams r6 = (android.support.p022v4.view.DmtViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c1
            boolean r10 = r6.f3244a
            if (r10 == 0) goto L_0x00c1
            int r10 = r6.f3245b
            r10 = r10 & 7
            int r11 = r6.f3245b
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
            r0.f3238x = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f3239y = r1
            r0.f3240z = r7
            r16.mo3485c()
            r1 = 0
            r0.f3240z = r1
            int r2 = r16.getChildCount()
        L_0x00de:
            if (r1 >= r2) goto L_0x0108
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0105
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r5 = (android.support.p022v4.view.DmtViewPager.LayoutParams) r5
            if (r5 == 0) goto L_0x00f6
            boolean r7 = r5.f3244a
            if (r7 != 0) goto L_0x0105
        L_0x00f6:
            float r7 = (float) r3
            float r5 = r5.f3246c
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.f3239y
            r4.measure(r5, r7)
        L_0x0105:
            int r1 = r1 + 1
            goto L_0x00de
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.DmtViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m3902a(int i, boolean z, boolean z2) {
        m3903a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f3244a |= m3909a(view);
        if (!this.f3240z) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f3244a) {
            layoutParams2.f3247d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    private void m3912b(int i, float f, int i2) {
        if (this.f3209ab != null) {
            this.f3209ab.onPageScrolled(i, f, i2);
        }
        if (this.f3208aa != null) {
            int size = this.f3208aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0935e eVar = (C0935e) this.f3208aa.get(i3);
                if (eVar != null) {
                    eVar.onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.f3210ac != null) {
            this.f3210ac.onPageScrolled(i, f, i2);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0920b b = m3911b(childAt);
                    if (b != null && b.f3254b == this.f3219c) {
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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3898a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3207W
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
            android.support.v4.view.DmtViewPager$LayoutParams r9 = (android.support.p022v4.view.DmtViewPager.LayoutParams) r9
            boolean r10 = r9.f3244a
            if (r10 == 0) goto L_0x0069
            int r9 = r9.f3245b
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
            r12.m3912b(r13, r14, r15)
            android.support.v4.view.DmtViewPager$e r13 = r12.f3212ae
            if (r13 == 0) goto L_0x0093
            r12.getScrollX()
            int r13 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r13) goto L_0x0093
            android.view.View r14 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r15 = (android.support.p022v4.view.DmtViewPager.LayoutParams) r15
            boolean r15 = r15.f3244a
            if (r15 != 0) goto L_0x0090
            r14.getLeft()
            r12.getClientWidth()
        L_0x0090:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x0093:
            r12.f3206V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.DmtViewPager.m3898a(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m3900a(i, i3, this.f3232r, this.f3232r);
        }
    }

    /* renamed from: a */
    private int m3893a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f3200P || Math.abs(i2) <= this.f3198N) {
            if (i >= this.f3219c) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3223i.size() <= 0) {
            return i;
        }
        return Math.max(((C0920b) this.f3223i.get(0)).f3254b, Math.min(i, ((C0920b) this.f3223i.get(this.f3223i.size() - 1)).f3254b));
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
                if (layoutParams.f3244a) {
                    int i14 = layoutParams.f3245b & 7;
                    int i15 = layoutParams.f3245b & 112;
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
                if (!layoutParams2.f3244a) {
                    C0920b b = m3911b(childAt2);
                    if (b != null) {
                        float f = (float) i17;
                        int i19 = ((int) (b.f3257e * f)) + i12;
                        if (layoutParams2.f3247d) {
                            layoutParams2.f3247d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f3246c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f3234t = i11;
        this.f3235u = i8 - i9;
        this.f3207W = i10;
        if (this.f3204T) {
            z2 = false;
            m3901a(this.f3219c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f3204T = z2;
    }
}
