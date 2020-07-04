package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0990t;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0995v;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.ViewPager.C0936f;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0952e;
import android.support.p022v4.widget.C1047h;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager */
public class VerticalViewPager extends BaseVerticalViewPager {

    /* renamed from: a */
    public static final int[] f67840a = {16842931};

    /* renamed from: ak */
    private static final C25754g f67841ak = new C25754g();

    /* renamed from: b */
    public static final Interpolator f67842b = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: e */
    static Field f67843e;

    /* renamed from: h */
    private static final Comparator<C25749b> f67844h = new Comparator<C25749b>() {
        /* renamed from: a */
        private static int m84594a(C25749b bVar, C25749b bVar2) {
            return bVar.f67918b - bVar2.f67918b;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m84594a((C25749b) obj, (C25749b) obj2);
        }
    };

    /* renamed from: A */
    private boolean f67845A;

    /* renamed from: B */
    private boolean f67846B;

    /* renamed from: C */
    private int f67847C = 1;

    /* renamed from: D */
    private boolean f67848D;

    /* renamed from: E */
    private boolean f67849E;

    /* renamed from: F */
    private int f67850F;

    /* renamed from: G */
    private int f67851G;

    /* renamed from: H */
    private int f67852H;

    /* renamed from: I */
    private float f67853I;

    /* renamed from: J */
    private float f67854J;

    /* renamed from: K */
    private float f67855K;

    /* renamed from: L */
    private float f67856L;

    /* renamed from: M */
    private int f67857M = -1;

    /* renamed from: N */
    private VelocityTracker f67858N;

    /* renamed from: O */
    private int f67859O;

    /* renamed from: P */
    private int f67860P;

    /* renamed from: Q */
    private int f67861Q;

    /* renamed from: R */
    private int f67862R;

    /* renamed from: S */
    private boolean f67863S;

    /* renamed from: T */
    private long f67864T;

    /* renamed from: U */
    private C1047h f67865U;

    /* renamed from: V */
    private C1047h f67866V;

    /* renamed from: W */
    private boolean f67867W = true;

    /* renamed from: aa */
    private boolean f67868aa = false;

    /* renamed from: ab */
    private boolean f67869ab;

    /* renamed from: ac */
    private int f67870ac;

    /* renamed from: ad */
    private List<C0935e> f67871ad = new ArrayList();

    /* renamed from: ae */
    private C0935e f67872ae;

    /* renamed from: af */
    private C25751d f67873af;

    /* renamed from: ag */
    private C0936f f67874ag;

    /* renamed from: ah */
    private Method f67875ah;

    /* renamed from: ai */
    private int f67876ai;

    /* renamed from: aj */
    private ArrayList<View> f67877aj;

    /* renamed from: al */
    private boolean f67878al = false;

    /* renamed from: am */
    private final Runnable f67879am = new Runnable() {
        public final void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.mo66770g();
        }
    };

    /* renamed from: an */
    private int f67880an = 0;

    /* renamed from: ao */
    private C25752e f67881ao;

    /* renamed from: ap */
    private boolean f67882ap = false;

    /* renamed from: c */
    public PagerAdapter f67883c;

    /* renamed from: d */
    public int f67884d;

    /* renamed from: f */
    private boolean f67885f;

    /* renamed from: g */
    private int f67886g;

    /* renamed from: i */
    private final ArrayList<C25749b> f67887i = new ArrayList<>();

    /* renamed from: j */
    private final C25749b f67888j = new C25749b();

    /* renamed from: k */
    private final Rect f67889k = new Rect();

    /* renamed from: l */
    private int f67890l = -1;

    /* renamed from: m */
    private Parcelable f67891m = null;

    /* renamed from: n */
    private ClassLoader f67892n = null;

    /* renamed from: o */
    private Scroller f67893o;

    /* renamed from: p */
    private boolean f67894p;

    /* renamed from: q */
    private C25753f f67895q;

    /* renamed from: r */
    private int f67896r;

    /* renamed from: s */
    private Drawable f67897s;

    /* renamed from: t */
    private int f67898t;

    /* renamed from: u */
    private int f67899u;

    /* renamed from: v */
    private float f67900v = -3.4028235E38f;

    /* renamed from: w */
    private float f67901w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f67902x;

    /* renamed from: y */
    private int f67903y;

    /* renamed from: z */
    private boolean f67904z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f67908a;

        /* renamed from: b */
        public int f67909b;

        /* renamed from: c */
        float f67910c;

        /* renamed from: d */
        boolean f67911d;

        /* renamed from: e */
        int f67912e;

        /* renamed from: f */
        int f67913f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f67840a);
            this.f67909b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$SavedState */
    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m84597b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m84597b(i);
            }

            /* renamed from: b */
            private static SavedState m84596b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m84596b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        int f67914a;

        /* renamed from: b */
        Parcelable f67915b;

        /* renamed from: c */
        ClassLoader f67916c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f67914a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f67914a);
            parcel.writeParcelable(this.f67915b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f67914a = parcel.readInt();
            this.f67915b = parcel.readParcelable(classLoader);
            this.f67916c = classLoader;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$a */
    interface C25748a {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b */
    static class C25749b {

        /* renamed from: a */
        Object f67917a;

        /* renamed from: b */
        int f67918b;

        /* renamed from: c */
        boolean f67919c;

        /* renamed from: d */
        float f67920d;

        /* renamed from: e */
        float f67921e;

        C25749b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c */
    class C25750c extends C0939a {
        /* renamed from: a */
        private boolean m84600a() {
            if (VerticalViewPager.this.f67883c == null || VerticalViewPager.this.f67883c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C25750c() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            cVar.mo3656b((CharSequence) ViewPager.class.getName());
            cVar.mo3687k(m84600a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                cVar.mo3644a(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0952e a = C0952e.m4053a();
            a.mo3711a(m84600a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f67883c != null) {
                a.mo3710a(VerticalViewPager.this.f67883c.getCount());
                a.mo3712b(VerticalViewPager.this.f67884d);
                a.mo3713c(VerticalViewPager.this.f67884d);
            }
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f67884d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f67884d + 1);
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d */
    public interface C25751d {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$e */
    public interface C25752e {
        /* renamed from: a */
        void mo66812a();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$f */
    class C25753f extends DataSetObserver {
        public final void onChanged() {
            VerticalViewPager.this.mo66769f();
        }

        public final void onInvalidated() {
            VerticalViewPager.this.mo66769f();
        }

        private C25753f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$g */
    static class C25754g implements Comparator<View> {
        C25754g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m84605a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m84605a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f67908a == layoutParams2.f67908a) {
                return layoutParams.f67912e - layoutParams2.f67912e;
            }
            if (layoutParams.f67908a) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: b */
    public final boolean mo66757b() {
        return this.f67863S;
    }

    public PagerAdapter getAdapter() {
        return this.f67883c;
    }

    public int getCurrentItem() {
        return this.f67884d;
    }

    public int getExpectedAdapterCount() {
        return this.f67886g;
    }

    public int getOffscreenPageLimit() {
        return this.f67847C;
    }

    public int getPageMargin() {
        return this.f67896r;
    }

    public int getScrollState() {
        return this.f67880an;
    }

    /* renamed from: a */
    private void m84559a(int i, boolean z, boolean z2, int i2) {
        if (this.f67883c == null || this.f67883c.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f67884d != i || this.f67887i.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f67883c.getCount()) {
                i = this.f67883c.getCount() - 1;
            }
            int i3 = this.f67847C;
            if (i > this.f67884d + i3 || i < this.f67884d - i3) {
                for (int i4 = 0; i4 < this.f67887i.size(); i4++) {
                    ((C25749b) this.f67887i.get(i4)).f67919c = true;
                }
            }
            if (this.f67884d == i) {
                z3 = false;
            }
            if (this.f67867W) {
                this.f67884d = i;
                if (z3 && this.f67871ad != null && !this.f67871ad.isEmpty()) {
                    for (C0935e onPageSelected : this.f67871ad) {
                        onPageSelected.onPageSelected(i);
                    }
                }
                if (z3 && this.f67872ae != null) {
                    this.f67872ae.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            m84553a(i);
            m84557a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m84557a(int i, boolean z, int i2, boolean z2) {
        C25749b b = m84569b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f67900v, Math.min(b.f67921e, this.f67901w))) : 0;
        if (z) {
            m84555a(0, clientHeight, i2);
            if (z2 && this.f67871ad != null && !this.f67871ad.isEmpty()) {
                for (C0935e onPageSelected : this.f67871ad) {
                    onPageSelected.onPageSelected(i);
                }
            }
            if (z2 && this.f67872ae != null) {
                this.f67872ae.onPageSelected(i);
            }
        } else {
            if (z2 && this.f67871ad != null && !this.f67871ad.isEmpty()) {
                for (C0935e onPageSelected2 : this.f67871ad) {
                    onPageSelected2.onPageSelected(i);
                }
            }
            if (z2 && this.f67872ae != null) {
                this.f67872ae.onPageSelected(i);
            }
            m84564a(false);
            scrollTo(0, clientHeight);
            m84574c(clientHeight);
        }
    }

    /* renamed from: a */
    public final void mo66629a(C0935e eVar) {
        if (eVar != null) {
            if (C7163a.m22363a() && Looper.getMainLooper() != Looper.myLooper()) {
                new Handler(Looper.getMainLooper()).post(new C25757c(new RuntimeException("should be mainThread")));
            }
            this.f67871ad.add(eVar);
        }
    }

    /* renamed from: a */
    private void m84555a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f67893o != null && !this.f67893o.isFinished()) {
            i4 = this.f67894p ? this.f67893o.getCurrY() : this.f67893o.getStartY();
            this.f67893o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollY();
        }
        int i6 = i4;
        int scrollX = getScrollX();
        int i7 = 0 - scrollX;
        int i8 = i2 - i6;
        if (i7 == 0 && i8 == 0) {
            m84564a(false);
            mo66770g();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i9 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i9;
        float b = f2 + (m84568b(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f67883c.getPageWidth(this.f67884d)) + ((float) this.f67896r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f67894p = false;
        this.f67893o.startScroll(scrollX, i6, i7, i8, min);
        C0991u.m4212e(this);
    }

    /* renamed from: a */
    private void m84562a(C25749b bVar, int i, C25749b bVar2) {
        C25749b bVar3;
        C25749b bVar4;
        int count = this.f67883c.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f67896r) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f67918b;
            if (i2 < bVar.f67918b) {
                float f2 = bVar2.f67921e + bVar2.f67920d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f67918b && i4 < this.f67887i.size()) {
                    Object obj = this.f67887i.get(i4);
                    while (true) {
                        bVar4 = (C25749b) obj;
                        if (i3 > bVar4.f67918b && i4 < this.f67887i.size() - 1) {
                            i4++;
                            obj = this.f67887i.get(i4);
                        }
                    }
                    while (i3 < bVar4.f67918b) {
                        f2 += this.f67883c.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f67921e = f2;
                    f2 += bVar4.f67920d + f;
                    i3++;
                }
            } else if (i2 > bVar.f67918b) {
                int size = this.f67887i.size() - 1;
                float f3 = bVar2.f67921e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f67918b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f67887i.get(size);
                    while (true) {
                        bVar3 = (C25749b) obj2;
                        if (i2 < bVar3.f67918b && size > 0) {
                            size--;
                            obj2 = this.f67887i.get(size);
                        }
                    }
                    while (i2 > bVar3.f67918b) {
                        f3 -= this.f67883c.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f67920d + f;
                    bVar3.f67921e = f3;
                }
            }
        }
        int size2 = this.f67887i.size();
        float f4 = bVar.f67921e;
        int i5 = bVar.f67918b - 1;
        this.f67900v = bVar.f67918b == 0 ? bVar.f67921e : -3.4028235E38f;
        int i6 = count - 1;
        this.f67901w = bVar.f67918b == i6 ? (bVar.f67921e + bVar.f67920d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C25749b bVar5 = (C25749b) this.f67887i.get(i7);
            while (i5 > bVar5.f67918b) {
                f4 -= this.f67883c.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f67920d + f;
            bVar5.f67921e = f4;
            if (bVar5.f67918b == 0) {
                this.f67900v = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f67921e + bVar.f67920d + f;
        int i8 = bVar.f67918b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C25749b bVar6 = (C25749b) this.f67887i.get(i9);
            while (i8 < bVar6.f67918b) {
                f5 += this.f67883c.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f67918b == i6) {
                this.f67901w = (bVar6.f67920d + f5) - 1.0f;
            }
            bVar6.f67921e = f5;
            f5 += bVar6.f67920d + f;
            i9++;
            i8++;
        }
        this.f67868aa = false;
    }

    /* renamed from: a */
    private void m84556a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f67887i.isEmpty()) {
            C25749b b = m84569b(this.f67884d);
            int min = (int) ((b != null ? Math.min(b.f67921e, this.f67901w) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m84564a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f67893o.isFinished()) {
            int clientHeight = getClientHeight();
            int currentItem = getCurrentItem() * clientHeight;
            if (this.f67878al) {
                int startY = currentItem - this.f67893o.getStartY();
                double a = C25758d.m84610a();
                double d = (double) clientHeight;
                Double.isNaN(d);
                if (((double) startY) <= a * d) {
                    this.f67893o.setFinalY(currentItem);
                }
            } else {
                this.f67893o.setFinalY(currentItem);
            }
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m84564a(boolean z) {
        boolean z2 = this.f67880an == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f67893o.isFinished()) {
                this.f67893o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f67893o.getCurrX();
                int currY = this.f67893o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m84574c(currY);
                    }
                }
            }
        }
        this.f67846B = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f67887i.size(); i++) {
            C25749b bVar = (C25749b) this.f67887i.get(i);
            if (bVar.f67919c) {
                bVar.f67919c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0991u.m4190a((View) this, this.f67879am);
                return;
            }
            this.f67879am.run();
        }
    }

    /* renamed from: a */
    private boolean m84565a(float f, float f2) {
        return (f < ((float) this.f67851G) && f2 > 0.0f) || (f > ((float) (getHeight() - this.f67851G)) && f2 < 0.0f);
    }

    /* renamed from: a */
    public final void mo66752a(float f) {
        if (!this.f67863S) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f67883c != null) {
            try {
                this.f67854J += f;
                float scrollY = ((float) getScrollY()) - f;
                float clientHeight = (float) getClientHeight();
                float f2 = this.f67900v * clientHeight;
                float f3 = this.f67901w * clientHeight;
                C25749b bVar = (C25749b) this.f67887i.get(0);
                C25749b bVar2 = (C25749b) this.f67887i.get(this.f67887i.size() - 1);
                if (bVar.f67918b != 0) {
                    f2 = bVar.f67921e * clientHeight;
                }
                if (bVar2.f67918b != this.f67883c.getCount() - 1) {
                    f3 = bVar2.f67921e * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.f67854J += scrollY - ((float) i);
                scrollTo(getScrollX(), i);
                m84574c(i);
                MotionEvent obtain = MotionEvent.obtain(this.f67864T, SystemClock.uptimeMillis(), 2, 0.0f, this.f67854J, 0);
                if (this.f67858N == null) {
                    this.f67858N = VelocityTracker.obtain();
                }
                if (this.f67858N != null) {
                    this.f67858N.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
                C2077a.m9161a((Throwable) e, "VerticalViewPager");
            }
        }
    }

    /* renamed from: a */
    private void m84561a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f67857M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f67854J = motionEvent.getY(i);
            this.f67857M = motionEvent.getPointerId(i);
            if (this.f67858N != null) {
                this.f67858N.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m84567a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof C25756b) {
            return false;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i3 + scrollY;
                if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                    int i5 = i2 + scrollX;
                    if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                        if (m84567a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !C0991u.m4195a(view, -i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m84566a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return m84575d(17);
                    case 22:
                        return m84575d(66);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m84575d(2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return m84575d(1);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo66632a() {
        return this.f67882ap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo66770g() {
        m84553a(this.f67884d);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f67867W = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: n */
    private boolean m84582n() {
        if (this.f67884d <= 0) {
            return false;
        }
        mo66753a(this.f67884d - 1, true);
        return true;
    }

    /* renamed from: e */
    public final void mo66768e() {
        if (this.f67871ad != null) {
            this.f67871ad.clear();
        }
    }

    /* renamed from: i */
    private void m84577i() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f67908a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: k */
    private boolean m84579k() {
        this.f67857M = -1;
        m84581m();
        return this.f67865U.mo4138c() | this.f67866V.mo4138c();
    }

    /* renamed from: m */
    private void m84581m() {
        this.f67848D = false;
        this.f67849E = false;
        if (this.f67858N != null) {
            this.f67858N.recycle();
            this.f67858N = null;
        }
    }

    /* renamed from: o */
    private boolean m84583o() {
        if (this.f67883c == null || this.f67884d >= this.f67883c.getCount() - 1) {
            return false;
        }
        mo66753a(this.f67884d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f67897s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f67879am);
        if (this.f67893o != null && !this.f67893o.isFinished()) {
            this.f67893o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f67914a = this.f67884d;
        if (this.f67883c != null) {
            savedState.f67915b = this.f67883c.saveState();
        }
        return savedState;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f67843e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            if (C7163a.m22363a()) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: j */
    private void m84578j() {
        if (this.f67876ai != 0) {
            if (this.f67877aj == null) {
                this.f67877aj = new ArrayList<>();
            } else {
                this.f67877aj.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f67877aj.add(getChildAt(i));
            }
            Collections.sort(this.f67877aj, f67841ak);
        }
    }

    /* renamed from: c */
    public final boolean mo66758c() {
        if (this.f67848D) {
            return false;
        }
        this.f67863S = true;
        setScrollState(1);
        this.f67856L = 0.0f;
        this.f67854J = 0.0f;
        if (this.f67858N == null) {
            this.f67858N = VelocityTracker.obtain();
        } else {
            this.f67858N.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f67858N.addMovement(obtain);
        obtain.recycle();
        this.f67864T = uptimeMillis;
        return true;
    }

    /* renamed from: h */
    private void m84576h() {
        this.f67885f = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f67893o = new Scroller(context, f67842b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f67852H = C0995v.m4257a(viewConfiguration);
        this.f67859O = (int) (400.0f * f);
        this.f67860P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f67865U = new C1047h(context);
        this.f67866V = new C1047h(context);
        this.f67861Q = (int) (25.0f * f);
        this.f67862R = (int) (2.0f * f);
        this.f67850F = (int) (f * 16.0f);
        C0991u.m4187a((View) this, (C0939a) new C25750c());
        if (C0991u.m4214f(this) == 0) {
            C0991u.m4206c((View) this, 1);
        }
        C0991u.m4188a((View) this, (C0983o) new C0983o() {

            /* renamed from: b */
            private final Rect f67907b = new Rect();

            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                C0954ab a = C0991u.m4176a(view, abVar);
                if (a.mo3724f()) {
                    return a;
                }
                Rect rect = this.f67907b;
                rect.left = a.mo3717a();
                rect.top = a.mo3719b();
                rect.right = a.mo3720c();
                rect.bottom = a.mo3721d();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0954ab b = C0991u.m4199b(VerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3717a(), rect.left);
                    rect.top = Math.min(b.mo3719b(), rect.top);
                    rect.right = Math.min(b.mo3720c(), rect.right);
                    rect.bottom = Math.min(b.mo3721d(), rect.bottom);
                }
                return a.mo3718a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: l */
    private C25749b m84580l() {
        float f;
        float f2;
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f = 0.0f;
        }
        if (clientHeight > 0) {
            f2 = ((float) this.f67896r) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        C25749b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f67887i.size()) {
            C25749b bVar2 = (C25749b) this.f67887i.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f67918b != i3) {
                    bVar2 = this.f67888j;
                    bVar2.f67921e = f3 + f4 + f2;
                    bVar2.f67918b = i3;
                    bVar2.f67920d = this.f67883c.getPageWidth(bVar2.f67918b);
                    i--;
                }
            }
            f3 = bVar2.f67921e;
            float f5 = bVar2.f67920d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f67887i.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f67918b;
            f4 = bVar2.f67920d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f67894p = true;
        if (this.f67893o.isFinished() || !this.f67893o.computeScrollOffset()) {
            m84564a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f67893o.getCurrX();
        int currY = this.f67893o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m84574c(currY)) {
                this.f67893o.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0991u.m4212e(this);
    }

    /* renamed from: d */
    public final void mo66762d() {
        if (this.f67863S) {
            this.f67863S = false;
            if (this.f67883c != null) {
                VelocityTracker velocityTracker = this.f67858N;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f67860P);
                int b = (int) C0990t.m4163b(velocityTracker, this.f67857M);
                this.f67846B = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C25749b l = m84580l();
                if (l != null) {
                    m84559a(m84549a(l.f67918b, ((((float) scrollY) / ((float) clientHeight)) - l.f67921e) / l.f67920d, b, (int) (this.f67854J - this.f67856L)), true, true, b);
                }
            }
            m84581m();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo66769f() {
        boolean z;
        int count = this.f67883c.getCount();
        this.f67886g = count;
        if (this.f67887i.size() >= (this.f67847C * 2) + 1 || this.f67887i.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        int i = this.f67884d;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f67887i.size()) {
            C25749b bVar = (C25749b) this.f67887i.get(i2);
            int itemPosition = this.f67883c.getItemPosition(bVar.f67917a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f67887i.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f67883c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f67883c.destroyItem((ViewGroup) this, bVar.f67918b, bVar.f67917a);
                    if (this.f67884d == bVar.f67918b) {
                        i = Math.max(0, Math.min(this.f67884d, count - 1));
                    }
                } else if (bVar.f67918b != itemPosition) {
                    if (bVar.f67918b == this.f67884d) {
                        i = itemPosition;
                    }
                    bVar.f67918b = itemPosition;
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f67883c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f67887i, f67844h);
        if (z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f67908a) {
                    layoutParams.f67910c = 0.0f;
                }
            }
            m84558a(i, false, true);
            requestLayout();
        }
    }

    public void setCanTouch(boolean z) {
        this.f67885f = z;
    }

    public void setDisableScroll(boolean z) {
        this.f67882ap = z;
    }

    public void setNeedRestrictDeltaY(boolean z) {
        this.f67878al = z;
    }

    public void setOnAdapterChangeListener(C25751d dVar) {
        this.f67873af = dVar;
    }

    public void setOnUserSwipeUpListener(C25752e eVar) {
        this.f67881ao = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.f67893o = scroller;
    }

    /* renamed from: a */
    static final /* synthetic */ void m84563a(RuntimeException runtimeException) {
        throw runtimeException;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f67845A != z) {
            this.f67845A = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f67846B = false;
        m84559a(i, true, true, 1);
    }

    /* renamed from: c */
    private void m84572c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f67885f || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f67904z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f67846B = false;
        m84558a(i, !this.f67867W, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f67847C) {
            this.f67847C = i;
            mo66770g();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f67896r;
        this.f67896r = i;
        int height = getHeight();
        m84556a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f67897s) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static float m84568b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || m84566a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f67897s = drawable;
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

    /* renamed from: b */
    private C25749b m84569b(int i) {
        for (int i2 = 0; i2 < this.f67887i.size(); i2++) {
            C25749b bVar = (C25749b) this.f67887i.get(i2);
            if (bVar.f67918b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C25749b a = m84552a(childAt);
                if (a != null && a.f67918b == this.f67884d) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f67883c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f67900v))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f67901w))) {
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
                C25749b a = m84552a(childAt);
                if (a != null && a.f67918b == this.f67884d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f67883c != null) {
            this.f67883c.restoreState(savedState.f67915b, savedState.f67916c);
            m84558a(savedState.f67914a, false, true);
            return;
        }
        this.f67890l = savedState.f67914a;
        this.f67891m = savedState.f67915b;
        this.f67892n = savedState.f67916c;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r0 < r1) goto L_0x0029
            java.lang.reflect.Method r0 = r6.f67875ah
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001b }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x001b }
            r6.f67875ah = r0     // Catch:{ NoSuchMethodException -> 0x001b }
        L_0x001b:
            java.lang.reflect.Method r0 = r6.f67875ah     // Catch:{ Exception -> 0x0029 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0029 }
            r2[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r0.invoke(r6, r2)     // Catch:{ Exception -> 0x0029 }
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.f67880an != i) {
            this.f67880an = i;
            if (this.f67874ag != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                m84571b(z);
            }
            if (this.f67871ad != null && !this.f67871ad.isEmpty()) {
                for (C0935e onPageScrollStateChanged : this.f67871ad) {
                    onPageScrollStateChanged.onPageScrollStateChanged(i);
                }
            }
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        m84576h();
    }

    /* renamed from: b */
    private C25749b m84570b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m84552a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m84574c(int i) {
        if (this.f67887i.size() != 0) {
            C25749b l = m84580l();
            int clientHeight = getClientHeight();
            int i2 = this.f67896r + clientHeight;
            float f = (float) clientHeight;
            float f2 = ((float) this.f67896r) / f;
            int i3 = l.f67918b;
            float f3 = ((((float) i) / f) - l.f67921e) / (l.f67920d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.f67869ab = false;
            m84554a(i3, f3, i4);
            if (this.f67869ab) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f67867W) {
            return false;
        } else {
            this.f67869ab = false;
            m84554a(0, 0.0f, 0);
            if (this.f67869ab) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: b */
    private void m84571b(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            C0991u.m4180a(getChildAt(i2), i, (Paint) null);
        }
    }

    /* renamed from: c */
    private boolean m84573c(float f) {
        boolean z;
        float f2 = this.f67854J - f;
        this.f67854J = f;
        float scrollY = ((float) getScrollY()) + f2;
        float clientHeight = (float) getClientHeight();
        float f3 = this.f67900v * clientHeight;
        float f4 = this.f67901w * clientHeight;
        boolean z2 = false;
        if (this.f67887i.size() <= 0) {
            return false;
        }
        C25749b bVar = (C25749b) this.f67887i.get(0);
        boolean z3 = true;
        C25749b bVar2 = (C25749b) this.f67887i.get(this.f67887i.size() - 1);
        if (bVar.f67918b != 0) {
            f3 = bVar.f67921e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f67918b != this.f67883c.getCount() - 1) {
            f4 = bVar2.f67921e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z) {
                z2 = this.f67865U.mo4135a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z2 = this.f67866V.mo4135a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f67853I += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m84574c(i);
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m84575d(int r7) {
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
            r4 = 130(0x82, float:1.82E-43)
            r5 = 33
            if (r3 == 0) goto L_0x009c
            if (r3 == r0) goto L_0x009c
            if (r7 != r5) goto L_0x007c
            android.graphics.Rect r1 = r6.f67889k
            android.graphics.Rect r1 = r6.m84550a(r1, r3)
            int r1 = r1.top
            android.graphics.Rect r2 = r6.f67889k
            android.graphics.Rect r2 = r6.m84550a(r2, r0)
            int r2 = r2.top
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m84582n()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f67889k
            android.graphics.Rect r1 = r6.m84550a(r1, r3)
            int r1 = r1.bottom
            android.graphics.Rect r2 = r6.f67889k
            android.graphics.Rect r2 = r6.m84550a(r2, r0)
            int r2 = r2.bottom
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m84583o()
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
            boolean r2 = r6.m84583o()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m84582n()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.m84575d(int):boolean");
    }

    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            C2077a.m9161a((Throwable) e, "VerticalViewPager");
        }
        int a = C0991u.m4174a(this);
        boolean z = false;
        if (a == 0 || (a == 1 && this.f67883c != null && this.f67883c.getCount() > 1)) {
            if (!this.f67865U.mo4134a()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f67900v * ((float) height));
                this.f67865U.mo4133a(width, height);
                z = false | this.f67865U.mo4136a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f67866V.mo4134a()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f67901w + 1.0f)) * ((float) height2));
                this.f67866V.mo4133a(width2, height2);
                z |= this.f67866V.mo4136a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f67865U.mo4137b();
            this.f67866V.mo4137b();
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
        if (this.f67896r > 0 && this.f67897s != null && this.f67887i.size() > 0 && this.f67883c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f4 = (float) height;
            float f5 = ((float) this.f67896r) / f4;
            int i = 0;
            C25749b bVar = (C25749b) this.f67887i.get(0);
            float f6 = bVar.f67921e;
            int size = this.f67887i.size();
            int i2 = bVar.f67918b;
            int i3 = ((C25749b) this.f67887i.get(size - 1)).f67918b;
            while (i2 < i3) {
                while (i2 > bVar.f67918b && i < size) {
                    i++;
                    bVar = (C25749b) this.f67887i.get(i);
                }
                if (i2 == bVar.f67918b) {
                    f2 = (bVar.f67921e + bVar.f67920d) * f4;
                    f = bVar.f67921e + bVar.f67920d + f5;
                } else {
                    float pageWidth = this.f67883c.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f67896r) + f2 > ((float) scrollY)) {
                    f3 = f5;
                    this.f67897s.setBounds(this.f67898t, (int) f2, this.f67899u, (int) (((float) this.f67896r) + f2 + 0.5f));
                    this.f67897s.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollY + height))) {
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
        if (this.f67883c != null) {
            m84560a(this.f67883c, (C25753f) null);
            this.f67883c.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f67887i.size(); i++) {
                C25749b bVar = (C25749b) this.f67887i.get(i);
                this.f67883c.destroyItem((ViewGroup) this, bVar.f67918b, bVar.f67917a);
            }
            this.f67883c.finishUpdate((ViewGroup) this);
            this.f67887i.clear();
            m84577i();
            this.f67884d = 0;
            scrollTo(0, 0);
        }
        this.f67883c = pagerAdapter;
        this.f67886g = 0;
        if (this.f67883c != null) {
            if (this.f67895q == null) {
                this.f67895q = new C25753f();
            }
            m84560a(this.f67883c, this.f67895q);
            this.f67846B = false;
            boolean z = this.f67867W;
            this.f67867W = true;
            this.f67886g = this.f67883c.getCount();
            if (this.f67890l >= 0) {
                this.f67883c.restoreState(this.f67891m, this.f67892n);
                m84558a(this.f67890l, false, true);
                this.f67890l = -1;
                this.f67891m = null;
                this.f67892n = null;
            } else if (!z) {
                mo66770g();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    private C25749b m84552a(View view) {
        for (int i = 0; i < this.f67887i.size(); i++) {
            C25749b bVar = (C25749b) this.f67887i.get(i);
            if (this.f67883c.isViewFromObject(view, bVar.f67917a)) {
                return bVar;
            }
        }
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f67882ap) {
            return false;
        }
        try {
            if (this.f67863S) {
                return false;
            }
            int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f67848D) {
                            return true;
                        }
                        if (this.f67849E) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f67853I = motionEvent.getX();
                        this.f67855K = motionEvent.getX();
                        this.f67854J = motionEvent.getY();
                        this.f67856L = motionEvent.getY();
                        this.f67857M = motionEvent2.getPointerId(0);
                        this.f67849E = false;
                        this.f67894p = true;
                        this.f67893o.computeScrollOffset();
                        if (this.f67880an != 2 || Math.abs(this.f67893o.getFinalY() - this.f67893o.getCurrY()) <= this.f67862R) {
                            m84564a(false);
                            this.f67848D = false;
                        } else {
                            this.f67893o.abortAnimation();
                            this.f67846B = false;
                            mo66770g();
                            this.f67848D = true;
                            m84572c(true);
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f67857M;
                        if (i != -1) {
                            int findPointerIndex = motionEvent2.findPointerIndex(i);
                            float y = motionEvent2.getY(findPointerIndex);
                            float f2 = y - this.f67854J;
                            float abs = Math.abs(f2);
                            float x = motionEvent2.getX(findPointerIndex);
                            float abs2 = Math.abs(x - this.f67855K);
                            if (f2 != 0.0f && !m84565a(this.f67854J, f2)) {
                                if (m84567a(this, false, (int) f2, (int) x, (int) y)) {
                                    this.f67853I = x;
                                    this.f67854J = y;
                                    this.f67849E = true;
                                    return false;
                                }
                            }
                            if (abs > ((float) this.f67852H) && abs > abs2) {
                                this.f67848D = true;
                                m84572c(true);
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f67856L + ((float) this.f67852H);
                                } else {
                                    f = this.f67856L - ((float) this.f67852H);
                                }
                                this.f67854J = f;
                                this.f67853I = x;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) this.f67852H)) {
                                this.f67849E = true;
                            }
                            if (this.f67848D && m84573c(y)) {
                                C0991u.m4212e(this);
                            }
                        }
                    } else if (action == 6) {
                        m84561a(motionEvent);
                    }
                    if (this.f67858N == null) {
                        this.f67858N = VelocityTracker.obtain();
                    }
                    this.f67858N.addMovement(motionEvent2);
                    return this.f67848D;
                }
            }
            m84579k();
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z = false;
        if (this.f67882ap) {
            return false;
        }
        try {
            if (this.f67863S) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f67883c != null) {
                if (this.f67883c.getCount() != 0) {
                    if (this.f67858N == null) {
                        this.f67858N = VelocityTracker.obtain();
                    }
                    this.f67858N.addMovement(motionEvent);
                    switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                        case 0:
                            this.f67893o.abortAnimation();
                            this.f67846B = false;
                            mo66770g();
                            this.f67853I = motionEvent.getX();
                            this.f67855K = motionEvent.getX();
                            this.f67854J = motionEvent.getY();
                            this.f67856L = motionEvent.getY();
                            this.f67857M = motionEvent.getPointerId(0);
                            break;
                        case 1:
                            if (this.f67848D) {
                                VelocityTracker velocityTracker = this.f67858N;
                                velocityTracker.computeCurrentVelocity(1000, (float) this.f67860P);
                                int b = (int) C0990t.m4163b(velocityTracker, this.f67857M);
                                this.f67846B = true;
                                int clientHeight = getClientHeight();
                                int scrollY = getScrollY();
                                C25749b l = m84580l();
                                if (l != null) {
                                    float f2 = (float) clientHeight;
                                    float f3 = ((float) this.f67896r) / f2;
                                    int i = l.f67918b;
                                    int a = m84549a(i, ((((float) scrollY) / f2) - l.f67921e) / (l.f67920d + f3), b, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.f67857M)) - this.f67856L));
                                    if (a > i && this.f67881ao != null) {
                                        this.f67881ao.mo66812a();
                                    }
                                    m84559a(a, true, true, b);
                                }
                                z = m84579k();
                                break;
                            }
                            break;
                        case 2:
                            if (!this.f67848D) {
                                int findPointerIndex = motionEvent.findPointerIndex(this.f67857M);
                                if (findPointerIndex == -1) {
                                    z = m84579k();
                                    break;
                                } else {
                                    float y = motionEvent.getY(findPointerIndex);
                                    float abs = Math.abs(y - this.f67854J);
                                    float x = motionEvent.getX(findPointerIndex);
                                    float abs2 = Math.abs(x - this.f67853I);
                                    if (abs > ((float) this.f67852H) && abs > abs2) {
                                        this.f67848D = true;
                                        m84572c(true);
                                        if (y - this.f67856L > 0.0f) {
                                            f = this.f67856L + ((float) this.f67852H);
                                        } else {
                                            f = this.f67856L - ((float) this.f67852H);
                                        }
                                        this.f67854J = f;
                                        this.f67853I = x;
                                        setScrollState(1);
                                        setScrollingCacheEnabled(true);
                                        ViewParent parent = getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                }
                            }
                            if (this.f67848D) {
                                z = false | m84573c(motionEvent.getY(motionEvent.findPointerIndex(this.f67857M)));
                                break;
                            }
                            break;
                        case 3:
                            if (this.f67848D) {
                                m84557a(this.f67884d, true, 0, false);
                                z = m84579k();
                                break;
                            }
                            break;
                        case 5:
                            int actionIndex = motionEvent.getActionIndex();
                            this.f67854J = motionEvent.getY(actionIndex);
                            this.f67857M = motionEvent.getPointerId(actionIndex);
                            break;
                        case 6:
                            m84561a(motionEvent);
                            this.f67854J = motionEvent.getY(motionEvent.findPointerIndex(this.f67857M));
                            break;
                    }
                    if (z) {
                        C0991u.m4212e(this);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
        } catch (IllegalStateException unused2) {
            if (this.f67883c.getCount() != this.f67886g) {
                this.f67883c.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9.f67918b == r0.f67884d) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84553a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f67884d
            if (r2 == r1) goto L_0x001a
            int r2 = r0.f67884d
            if (r2 >= r1) goto L_0x000f
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 33
        L_0x0011:
            int r4 = r0.f67884d
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m84569b(r4)
            r0.f67884d = r1
            goto L_0x001c
        L_0x001a:
            r2 = 2
            r4 = 0
        L_0x001c:
            android.support.v4.view.PagerAdapter r1 = r0.f67883c
            if (r1 != 0) goto L_0x0024
            r17.m84578j()
            return
        L_0x0024:
            boolean r1 = r0.f67846B
            if (r1 == 0) goto L_0x002c
            r17.m84578j()
            return
        L_0x002c:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0033
            return
        L_0x0033:
            android.support.v4.view.PagerAdapter r1 = r0.f67883c
            r1.startUpdate(r0)
            int r1 = r0.f67847C
            int r5 = r0.f67884d
            int r5 = r5 - r1
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            android.support.v4.view.PagerAdapter r7 = r0.f67883c
            int r7 = r7.getCount()
            int r8 = r7 + -1
            int r9 = r0.f67884d
            int r9 = r9 + r1
            int r1 = java.lang.Math.min(r8, r9)
            int r8 = r0.f67886g
            if (r7 != r8) goto L_0x0222
            r8 = 0
        L_0x0056:
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r9 = r0.f67887i
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0076
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r9 = r0.f67887i
            java.lang.Object r9 = r9.get(r8)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r9 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r9
            int r10 = r9.f67918b
            int r11 = r0.f67884d
            if (r10 < r11) goto L_0x0073
            int r10 = r9.f67918b
            int r11 = r0.f67884d
            if (r10 != r11) goto L_0x0076
            goto L_0x0077
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x0056
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 != 0) goto L_0x0081
            if (r7 <= 0) goto L_0x0081
            int r9 = r0.f67884d
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r9 = r0.m84551a(r9, r8)
        L_0x0081:
            if (r9 == 0) goto L_0x01a1
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0090
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r12 = r0.f67887i
            java.lang.Object r12 = r12.get(r11)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r12 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r12
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            int r13 = r17.getClientHeight()
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 > 0) goto L_0x009b
            r3 = 0
            goto L_0x00a7
        L_0x009b:
            float r15 = r9.f67920d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r6 = (float) r13
            float r3 = r3 / r6
            float r3 = r3 + r15
        L_0x00a7:
            int r6 = r0.f67884d
            int r6 = r6 + -1
            r15 = r11
            r11 = r8
            r8 = 0
        L_0x00ae:
            if (r6 < 0) goto L_0x010c
            int r16 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00db
            if (r6 >= r5) goto L_0x00db
            if (r12 == 0) goto L_0x010c
            int r10 = r12.f67918b
            if (r6 != r10) goto L_0x0109
            boolean r10 = r12.f67919c
            if (r10 != 0) goto L_0x0109
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f67887i
            r10.remove(r15)
            android.support.v4.view.PagerAdapter r10 = r0.f67883c
            java.lang.Object r12 = r12.f67917a
            r10.destroyItem(r0, r6, r12)
            int r15 = r15 + -1
            int r11 = r11 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f67887i
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r10
            goto L_0x0108
        L_0x00db:
            if (r12 == 0) goto L_0x00f1
            int r10 = r12.f67918b
            if (r6 != r10) goto L_0x00f1
            float r10 = r12.f67920d
            float r8 = r8 + r10
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f67887i
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r10
            goto L_0x0108
        L_0x00f1:
            int r10 = r15 + 1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = r0.m84551a(r6, r10)
            float r10 = r10.f67920d
            float r8 = r8 + r10
            int r11 = r11 + 1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f67887i
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r10
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r12 = r10
        L_0x0109:
            int r6 = r6 + -1
            goto L_0x00ae
        L_0x010c:
            float r3 = r9.f67920d
            int r5 = r11 + 1
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x019e
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0125
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r6
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r13 > 0) goto L_0x012a
            r10 = 0
            goto L_0x0133
        L_0x012a:
            int r8 = r17.getPaddingRight()
            float r8 = (float) r8
            float r10 = (float) r13
            float r8 = r8 / r10
            float r10 = r8 + r14
        L_0x0133:
            int r8 = r0.f67884d
        L_0x0135:
            int r8 = r8 + 1
            if (r8 >= r7) goto L_0x019e
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0168
            if (r8 <= r1) goto L_0x0168
            if (r6 == 0) goto L_0x019e
            int r12 = r6.f67918b
            if (r8 != r12) goto L_0x019d
            boolean r12 = r6.f67919c
            if (r12 != 0) goto L_0x019d
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r12 = r0.f67887i
            r12.remove(r5)
            android.support.v4.view.PagerAdapter r12 = r0.f67883c
            java.lang.Object r6 = r6.f67917a
            r12.destroyItem(r0, r8, r6)
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r6
            goto L_0x019d
        L_0x0166:
            r6 = 0
            goto L_0x019d
        L_0x0168:
            if (r6 == 0) goto L_0x0184
            int r12 = r6.f67918b
            if (r8 != r12) goto L_0x0184
            float r6 = r6.f67920d
            float r3 = r3 + r6
            int r5 = r5 + 1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r6
            goto L_0x019d
        L_0x0184:
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = r0.m84551a(r8, r5)
            int r5 = r5 + 1
            float r6 = r6.f67920d
            float r3 = r3 + r6
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f67887i
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25749b) r6
        L_0x019d:
            goto L_0x0135
        L_0x019e:
            r0.m84562a(r9, r11, r4)
        L_0x01a1:
            android.support.v4.view.PagerAdapter r1 = r0.f67883c
            int r3 = r0.f67884d
            if (r9 == 0) goto L_0x01aa
            java.lang.Object r4 = r9.f67917a
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            r1.setPrimaryItem(r0, r3, r4)
            android.support.v4.view.PagerAdapter r1 = r0.f67883c
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r3 = 0
        L_0x01b8:
            if (r3 >= r1) goto L_0x01e4
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r5 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r5
            r5.f67913f = r3
            boolean r6 = r5.f67908a
            if (r6 != 0) goto L_0x01e0
            float r6 = r5.f67910c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01e1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m84552a(r4)
            if (r4 == 0) goto L_0x01e1
            float r6 = r4.f67920d
            r5.f67910c = r6
            int r4 = r4.f67918b
            r5.f67912e = r4
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            int r3 = r3 + 1
            goto L_0x01b8
        L_0x01e4:
            r17.m84578j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0221
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01f8
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r3 = r0.m84570b(r1)
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            if (r3 == 0) goto L_0x0201
            int r1 = r3.f67918b
            int r3 = r0.f67884d
            if (r1 == r3) goto L_0x0221
        L_0x0201:
            r1 = 0
        L_0x0202:
            int r3 = r17.getChildCount()
            if (r1 >= r3) goto L_0x0221
            android.view.View r3 = r0.getChildAt(r1)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m84552a(r3)
            if (r4 == 0) goto L_0x021e
            int r4 = r4.f67918b
            int r5 = r0.f67884d
            if (r4 != r5) goto L_0x021e
            boolean r3 = r3.requestFocus(r2)
            if (r3 != 0) goto L_0x0221
        L_0x021e:
            int r1 = r1 + 1
            goto L_0x0202
        L_0x0221:
            return
        L_0x0222:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x022f }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x022f }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x022f }
            goto L_0x0237
        L_0x022f:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0237:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f67886g
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.PagerAdapter r1 = r0.f67883c
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.m84553a(int):void");
    }

    /* renamed from: a */
    public final void mo66753a(int i, boolean z) {
        this.f67846B = false;
        m84558a(i, z, false);
    }

    /* renamed from: a */
    private static void m84560a(PagerAdapter pagerAdapter, C25753f fVar) {
        try {
            if (f67843e != null) {
                f67843e.set(pagerAdapter, fVar);
            }
        } catch (IllegalAccessException e) {
            if (C7163a.m22363a()) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f67876ai == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f67877aj.get(i2)).getLayoutParams()).f67913f;
    }

    /* renamed from: a */
    private C25749b m84551a(int i, int i2) {
        C25749b bVar = new C25749b();
        bVar.f67918b = i;
        bVar.f67917a = this.f67883c.instantiateItem((ViewGroup) this, i);
        bVar.f67920d = this.f67883c.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f67887i.size()) {
            this.f67887i.add(bVar);
        } else {
            this.f67887i.add(i2, bVar);
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
                C25749b a = m84552a(childAt);
                if (a != null && a.f67918b == this.f67884d && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m84576h();
    }

    /* renamed from: a */
    private Rect m84550a(Rect rect, View view) {
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
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
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
            int r2 = r16.getMeasuredHeight()
            int r3 = r2 / 10
            int r4 = r0.f67850F
            int r3 = java.lang.Math.min(r3, r4)
            r0.f67851G = r3
            int r3 = r16.getMeasuredWidth()
            int r4 = r16.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r16.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r16.getPaddingTop()
            int r2 = r2 - r4
            int r4 = r16.getPaddingBottom()
            int r2 = r2 - r4
            int r4 = r16.getChildCount()
            r5 = r2
            r2 = 0
        L_0x003e:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c5
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c0
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r6 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c0
            boolean r10 = r6.f67908a
            if (r10 == 0) goto L_0x00c0
            int r10 = r6.f67909b
            r10 = r10 & 7
            int r11 = r6.f67909b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006e
            r12 = 80
            if (r11 != r12) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r11 = 0
            goto L_0x006f
        L_0x006e:
            r11 = 1
        L_0x006f:
            r12 = 3
            if (r10 == r12) goto L_0x0077
            r12 = 5
            if (r10 != r12) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0080
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x007d:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0084
        L_0x0080:
            if (r7 == 0) goto L_0x007d
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0084:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0096
            int r10 = r6.width
            if (r10 == r14) goto L_0x0092
            int r10 = r6.width
            r13 = r10
            goto L_0x0093
        L_0x0092:
            r13 = r3
        L_0x0093:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0097
        L_0x0096:
            r13 = r3
        L_0x0097:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a4
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a2
            int r1 = r6.height
            goto L_0x00a6
        L_0x00a2:
            r1 = r5
            goto L_0x00a6
        L_0x00a4:
            r1 = r5
            r8 = r12
        L_0x00a6:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00b9
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c0
        L_0x00b9:
            if (r7 == 0) goto L_0x00c0
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c0:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003e
        L_0x00c5:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f67902x = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f67903y = r1
            r0.f67904z = r7
            r16.mo66770g()
            r1 = 0
            r0.f67904z = r1
            int r2 = r16.getChildCount()
        L_0x00dd:
            if (r1 >= r2) goto L_0x0107
            android.view.View r3 = r0.getChildAt(r1)
            int r4 = r3.getVisibility()
            if (r4 == r6) goto L_0x0104
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r4 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r4
            if (r4 == 0) goto L_0x00f5
            boolean r7 = r4.f67908a
            if (r7 != 0) goto L_0x0104
        L_0x00f5:
            float r7 = (float) r5
            float r4 = r4.f67910c
            float r7 = r7 * r4
            int r4 = (int) r7
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            int r7 = r0.f67902x
            r3.measure(r7, r4)
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m84558a(int i, boolean z, boolean z2) {
        m84559a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f67908a |= view instanceof C25748a;
        if (!this.f67904z) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f67908a) {
            layoutParams2.f67911d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C25749b a = m84552a(childAt);
                    if (a != null && a.f67918b == this.f67884d) {
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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84554a(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f67870ac
            r1 = 0
            if (r0 <= 0) goto L_0x006f
            int r0 = r11.getScrollY()
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getHeight()
            int r5 = r11.getChildCount()
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x001c:
            if (r2 >= r5) goto L_0x006f
            android.view.View r7 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r8 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r8
            boolean r9 = r8.f67908a
            if (r9 == 0) goto L_0x006c
            int r8 = r8.f67909b
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r8 == r9) goto L_0x0051
            r9 = 48
            if (r8 == r9) goto L_0x004b
            r9 = 80
            if (r8 == r9) goto L_0x003e
            r8 = r3
            goto L_0x0060
        L_0x003e:
            int r8 = r4 - r6
            int r9 = r7.getMeasuredHeight()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredHeight()
            int r6 = r6 + r9
            goto L_0x005d
        L_0x004b:
            int r8 = r7.getHeight()
            int r8 = r8 + r3
            goto L_0x0060
        L_0x0051:
            int r8 = r7.getMeasuredHeight()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r3)
        L_0x005d:
            r10 = r8
            r8 = r3
            r3 = r10
        L_0x0060:
            int r3 = r3 + r0
            int r9 = r7.getTop()
            int r3 = r3 - r9
            if (r3 == 0) goto L_0x006b
            r7.offsetTopAndBottom(r3)
        L_0x006b:
            r3 = r8
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x006f:
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f67871ad
            if (r0 == 0) goto L_0x0091
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f67871ad
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0091
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f67871ad
            java.util.Iterator r0 = r0.iterator()
        L_0x0081:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()
            android.support.v4.view.ViewPager$e r2 = (android.support.p022v4.view.ViewPager.C0935e) r2
            r2.onPageScrolled(r12, r13, r14)
            goto L_0x0081
        L_0x0091:
            android.support.v4.view.ViewPager$e r0 = r11.f67872ae
            if (r0 == 0) goto L_0x009a
            android.support.v4.view.ViewPager$e r0 = r11.f67872ae
            r0.onPageScrolled(r12, r13, r14)
        L_0x009a:
            android.support.v4.view.ViewPager$f r12 = r11.f67874ag
            if (r12 == 0) goto L_0x00ca
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L_0x00a6:
            if (r1 >= r13) goto L_0x00ca
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r0 = (com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r0
            boolean r0 = r0.f67908a
            if (r0 != 0) goto L_0x00c7
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            android.support.v4.view.ViewPager$f r2 = r11.f67874ag
            r2.mo3622a(r14, r0)
        L_0x00c7:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00ca:
            r12 = 1
            r11.f67869ab = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.m84554a(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            m84556a(i2, i4, this.f67896r, this.f67896r);
        }
    }

    /* renamed from: a */
    private int m84549a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f67861Q || Math.abs(i2) <= this.f67859O) {
            if (i >= this.f67884d) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f67887i.size() <= 0) {
            return i;
        }
        return Math.max(((C25749b) this.f67887i.get(0)).f67918b, Math.min(i, ((C25749b) this.f67887i.get(this.f67887i.size() - 1)).f67918b));
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
        int scrollY = getScrollY();
        int i9 = paddingRight;
        int i10 = 0;
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f67908a) {
                    int i13 = layoutParams.f67909b & 7;
                    int i14 = layoutParams.f67909b & 112;
                    if (i13 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i11);
                    } else if (i13 == 3) {
                        i5 = i11;
                        i11 = childAt.getMeasuredWidth() + i11;
                    } else if (i13 != 5) {
                        i5 = i11;
                    } else {
                        i5 = (i7 - i9) - childAt.getMeasuredWidth();
                        i9 += childAt.getMeasuredWidth();
                    }
                    if (i14 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else if (i14 == 48) {
                        i6 = paddingTop;
                        paddingTop = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i14 != 80) {
                        i6 = paddingTop;
                    } else {
                        i6 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                    }
                    int i15 = i6 + scrollY;
                    childAt.layout(i5, i15, childAt.getMeasuredWidth() + i5, i15 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i16 = (i8 - paddingTop) - paddingBottom;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                C25749b a = m84552a(childAt2);
                if (!layoutParams2.f67908a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f67921e * f)) + paddingTop;
                    if (layoutParams2.f67911d) {
                        layoutParams2.f67911d = false;
                        childAt2.measure(MeasureSpec.makeMeasureSpec((i7 - i11) - i9, 1073741824), MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f67910c), 1073741824));
                    }
                    childAt2.layout(i11, i18, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f67898t = i11;
        this.f67899u = i7 - i9;
        this.f67870ac = i10;
        if (this.f67867W) {
            z2 = false;
            m84557a(this.f67884d, false, 0, false);
        } else {
            z2 = false;
        }
        this.f67867W = z2;
    }
}
