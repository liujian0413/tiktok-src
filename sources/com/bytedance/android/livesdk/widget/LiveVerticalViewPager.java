package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0978j;
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
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LiveVerticalViewPager extends ViewGroup {

    /* renamed from: a */
    public static final int[] f25068a = {16842931};

    /* renamed from: al */
    private static final C9215g f25069al = new C9215g();

    /* renamed from: f */
    static Field f25070f;

    /* renamed from: h */
    private static final Comparator<C9210b> f25071h = new Comparator<C9210b>() {
        /* renamed from: a */
        private static int m27413a(C9210b bVar, C9210b bVar2) {
            return bVar.f25146b - bVar2.f25146b;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m27413a((C9210b) obj, (C9210b) obj2);
        }
    };

    /* renamed from: i */
    private static final Interpolator f25072i = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private boolean f25073A;

    /* renamed from: B */
    private boolean f25074B;

    /* renamed from: C */
    private boolean f25075C;

    /* renamed from: D */
    private int f25076D = 1;

    /* renamed from: E */
    private boolean f25077E;

    /* renamed from: F */
    private boolean f25078F;

    /* renamed from: G */
    private int f25079G;

    /* renamed from: H */
    private int f25080H;

    /* renamed from: I */
    private int f25081I;

    /* renamed from: J */
    private float f25082J;

    /* renamed from: K */
    private float f25083K;

    /* renamed from: L */
    private float f25084L;

    /* renamed from: M */
    private float f25085M;

    /* renamed from: N */
    private int f25086N = -1;

    /* renamed from: O */
    private VelocityTracker f25087O;

    /* renamed from: P */
    private int f25088P;

    /* renamed from: Q */
    private int f25089Q;

    /* renamed from: R */
    private int f25090R;

    /* renamed from: S */
    private int f25091S;

    /* renamed from: T */
    private C1047h f25092T;

    /* renamed from: U */
    private C1047h f25093U;

    /* renamed from: V */
    private boolean f25094V = false;

    /* renamed from: W */
    private boolean f25095W = false;

    /* renamed from: aa */
    private boolean f25096aa = true;

    /* renamed from: ab */
    private boolean f25097ab = false;

    /* renamed from: ac */
    private boolean f25098ac;

    /* renamed from: ad */
    private int f25099ad;

    /* renamed from: ae */
    private C0935e f25100ae;

    /* renamed from: af */
    private C0935e f25101af;

    /* renamed from: ag */
    private C9212d f25102ag;

    /* renamed from: ah */
    private C0936f f25103ah;

    /* renamed from: ai */
    private Method f25104ai;

    /* renamed from: aj */
    private int f25105aj;

    /* renamed from: ak */
    private ArrayList<View> f25106ak;

    /* renamed from: am */
    private final Runnable f25107am = new Runnable() {
        public final void run() {
            LiveVerticalViewPager.this.setScrollState(0);
            LiveVerticalViewPager.this.mo22514b();
        }
    };

    /* renamed from: an */
    private int f25108an = 0;

    /* renamed from: b */
    public PagerAdapter f25109b;

    /* renamed from: c */
    public int f25110c;

    /* renamed from: d */
    public boolean f25111d;

    /* renamed from: e */
    public C9213e f25112e = null;

    /* renamed from: g */
    private int f25113g;

    /* renamed from: j */
    private final ArrayList<C9210b> f25114j = new ArrayList<>();

    /* renamed from: k */
    private final C9210b f25115k = new C9210b();

    /* renamed from: l */
    private final Rect f25116l = new Rect();

    /* renamed from: m */
    private int f25117m = -1;

    /* renamed from: n */
    private Parcelable f25118n = null;

    /* renamed from: o */
    private ClassLoader f25119o = null;

    /* renamed from: p */
    private Scroller f25120p;

    /* renamed from: q */
    private boolean f25121q;

    /* renamed from: r */
    private C9214f f25122r;

    /* renamed from: s */
    private int f25123s;

    /* renamed from: t */
    private Drawable f25124t;

    /* renamed from: u */
    private int f25125u;

    /* renamed from: v */
    private int f25126v;

    /* renamed from: w */
    private float f25127w = -3.4028235E38f;

    /* renamed from: x */
    private float f25128x = Float.MAX_VALUE;

    /* renamed from: y */
    private int f25129y;

    /* renamed from: z */
    private int f25130z;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f25136a;

        /* renamed from: b */
        public int f25137b;

        /* renamed from: c */
        float f25138c;

        /* renamed from: d */
        boolean f25139d;

        /* renamed from: e */
        int f25140e;

        /* renamed from: f */
        int f25141f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveVerticalViewPager.f25068a);
            this.f25137b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m27416b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m27416b(i);
            }

            /* renamed from: b */
            private static SavedState m27415b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m27415b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        int f25142a;

        /* renamed from: b */
        Parcelable f25143b;

        /* renamed from: c */
        ClassLoader f25144c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f25142a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25142a);
            parcel.writeParcelable(this.f25143b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f25142a = parcel.readInt();
            this.f25143b = parcel.readParcelable(classLoader);
            this.f25144c = classLoader;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$a */
    interface C9209a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b */
    static class C9210b {

        /* renamed from: a */
        Object f25145a;

        /* renamed from: b */
        int f25146b;

        /* renamed from: c */
        boolean f25147c;

        /* renamed from: d */
        float f25148d;

        /* renamed from: e */
        float f25149e;

        C9210b() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c */
    class C9211c extends C0939a {
        /* renamed from: a */
        private boolean m27419a() {
            if (LiveVerticalViewPager.this.f25109b == null || LiveVerticalViewPager.this.f25109b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C9211c() {
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            cVar.mo3656b((CharSequence) ViewPager.class.getName());
            cVar.mo3687k(m27419a());
            if (LiveVerticalViewPager.this.canScrollVertically(1)) {
                cVar.mo3644a(4096);
            }
            if (LiveVerticalViewPager.this.canScrollVertically(-1)) {
                cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1390a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0952e a = C0952e.m4053a();
            a.mo3711a(m27419a());
            if (accessibilityEvent.getEventType() == 4096 && LiveVerticalViewPager.this.f25109b != null) {
                a.mo3710a(LiveVerticalViewPager.this.f25109b.getCount());
                a.mo3712b(LiveVerticalViewPager.this.f25110c);
                a.mo3713c(LiveVerticalViewPager.this.f25110c);
            }
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !LiveVerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f25110c - 1);
                return true;
            } else if (!LiveVerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f25110c + 1);
                return true;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$d */
    interface C9212d {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e */
    public interface C9213e {
        /* renamed from: a */
        void mo11387a();

        /* renamed from: b */
        void mo11388b();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$f */
    class C9214f extends DataSetObserver {
        public final void onChanged() {
            LiveVerticalViewPager.this.mo22509a();
        }

        public final void onInvalidated() {
            LiveVerticalViewPager.this.mo22509a();
        }

        private C9214f() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$g */
    static class C9215g implements Comparator<View> {
        C9215g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m27425a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        private static int m27425a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f25136a == layoutParams2.f25136a) {
                return layoutParams.f25140e - layoutParams2.f25140e;
            }
            if (layoutParams.f25136a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f25109b;
    }

    public int getCurrentItem() {
        return this.f25110c;
    }

    public int getOffscreenPageLimit() {
        return this.f25076D;
    }

    public int getPageMargin() {
        return this.f25123s;
    }

    /* renamed from: a */
    public final void mo22510a(int i, boolean z) {
        this.f25075C = false;
        m27386a(i, z, false);
    }

    /* renamed from: a */
    private void m27387a(int i, boolean z, boolean z2, int i2) {
        if (this.f25109b == null || this.f25109b.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f25110c != i || this.f25114j.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f25109b.getCount()) {
                i = this.f25109b.getCount() - 1;
            }
            int i3 = this.f25076D;
            if (i > this.f25110c + i3 || i < this.f25110c - i3) {
                for (int i4 = 0; i4 < this.f25114j.size(); i4++) {
                    ((C9210b) this.f25114j.get(i4)).f25147c = true;
                }
            }
            if (this.f25110c == i) {
                z3 = false;
            }
            if (this.f25096aa) {
                this.f25110c = i;
                if (z3 && this.f25100ae != null) {
                    this.f25100ae.onPageSelected(i);
                }
                if (z3 && this.f25101af != null) {
                    this.f25101af.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            m27381a(i);
            m27385a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m27385a(int i, boolean z, int i2, boolean z2) {
        C9210b b = m27395b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f25127w, Math.min(b.f25149e, this.f25128x))) : 0;
        if (z) {
            m27383a(0, clientHeight, i2);
            if (z2 && this.f25100ae != null) {
                this.f25100ae.onPageSelected(i);
            }
            if (z2 && this.f25101af != null) {
                this.f25101af.onPageSelected(i);
            }
        } else {
            if (z2 && this.f25100ae != null) {
                this.f25100ae.onPageSelected(i);
            }
            if (z2 && this.f25101af != null) {
                this.f25101af.onPageSelected(i);
            }
            m27391a(false);
            scrollTo(0, clientHeight);
            m27401c(clientHeight);
        }
    }

    /* renamed from: a */
    private void m27383a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f25120p != null && !this.f25120p.isFinished()) {
            i4 = this.f25121q ? this.f25120p.getCurrY() : this.f25120p.getStartY();
            this.f25120p.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollY();
        }
        int i6 = i4;
        int scrollX = getScrollX();
        int i7 = 0 - scrollX;
        int i8 = i2 - i6;
        if (i7 == 0 && i8 == 0) {
            m27391a(false);
            mo22514b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i9 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i9;
        float a = f2 + (m27376a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f25109b.getPageWidth(this.f25110c)) + ((float) this.f25123s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f25121q = false;
        this.f25120p.startScroll(scrollX, i6, i7, i8, min);
        C0991u.m4212e(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22509a() {
        int count = this.f25109b.getCount();
        this.f25113g = count;
        boolean z = this.f25114j.size() < (this.f25076D * 2) + 1 && this.f25114j.size() < count;
        int i = this.f25110c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f25114j.size()) {
            C9210b bVar = (C9210b) this.f25114j.get(i2);
            int itemPosition = this.f25109b.getItemPosition(bVar.f25145a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f25114j.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f25109b.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f25109b.destroyItem((ViewGroup) this, bVar.f25146b, bVar.f25145a);
                    if (this.f25110c == bVar.f25146b) {
                        i = Math.max(0, Math.min(this.f25110c, count - 1));
                    }
                } else if (bVar.f25146b != itemPosition) {
                    if (bVar.f25146b == this.f25110c) {
                        i = itemPosition;
                    }
                    bVar.f25146b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f25109b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f25114j, f25071h);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f25136a) {
                    layoutParams.f25138c = 0.0f;
                }
            }
            m27386a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m27390a(C9210b bVar, int i, C9210b bVar2) {
        C9210b bVar3;
        C9210b bVar4;
        int count = this.f25109b.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f25123s) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f25146b;
            if (i2 < bVar.f25146b) {
                float f2 = bVar2.f25149e + bVar2.f25148d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f25146b && i4 < this.f25114j.size()) {
                    Object obj = this.f25114j.get(i4);
                    while (true) {
                        bVar4 = (C9210b) obj;
                        if (i3 > bVar4.f25146b && i4 < this.f25114j.size() - 1) {
                            i4++;
                            obj = this.f25114j.get(i4);
                        }
                    }
                    while (i3 < bVar4.f25146b) {
                        f2 += this.f25109b.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f25149e = f2;
                    f2 += bVar4.f25148d + f;
                    i3++;
                }
            } else if (i2 > bVar.f25146b) {
                int size = this.f25114j.size() - 1;
                float f3 = bVar2.f25149e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f25146b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f25114j.get(size);
                    while (true) {
                        bVar3 = (C9210b) obj2;
                        if (i2 < bVar3.f25146b && size > 0) {
                            size--;
                            obj2 = this.f25114j.get(size);
                        }
                    }
                    while (i2 > bVar3.f25146b) {
                        f3 -= this.f25109b.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f25148d + f;
                    bVar3.f25149e = f3;
                }
            }
        }
        int size2 = this.f25114j.size();
        float f4 = bVar.f25149e;
        int i5 = bVar.f25146b - 1;
        this.f25127w = bVar.f25146b == 0 ? bVar.f25149e : -3.4028235E38f;
        int i6 = count - 1;
        this.f25128x = bVar.f25146b == i6 ? (bVar.f25149e + bVar.f25148d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C9210b bVar5 = (C9210b) this.f25114j.get(i7);
            while (i5 > bVar5.f25146b) {
                f4 -= this.f25109b.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f25148d + f;
            bVar5.f25149e = f4;
            if (bVar5.f25146b == 0) {
                this.f25127w = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f25149e + bVar.f25148d + f;
        int i8 = bVar.f25146b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C9210b bVar6 = (C9210b) this.f25114j.get(i9);
            while (i8 < bVar6.f25146b) {
                f5 += this.f25109b.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f25146b == i6) {
                this.f25128x = (bVar6.f25148d + f5) - 1.0f;
            }
            bVar6.f25149e = f5;
            f5 += bVar6.f25148d + f;
            i9++;
            i8++;
        }
        this.f25097ab = false;
    }

    /* renamed from: a */
    private void m27384a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f25114j.isEmpty()) {
            C9210b b = m27395b(this.f25110c);
            int min = (int) ((b != null ? Math.min(b.f25149e, this.f25128x) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m27391a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f25120p.isFinished()) {
            this.f25120p.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m27391a(boolean z) {
        boolean z2 = this.f25108an == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f25120p.isFinished()) {
                this.f25120p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f25120p.getCurrX();
                int currY = this.f25120p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m27401c(currY);
                    }
                }
            }
        }
        this.f25075C = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f25114j.size(); i++) {
            C9210b bVar = (C9210b) this.f25114j.get(i);
            if (bVar.f25147c) {
                bVar.f25147c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0991u.m4190a((View) this, this.f25107am);
                return;
            }
            this.f25107am.run();
        }
    }

    /* renamed from: a */
    private boolean m27392a(float f, float f2) {
        return (f < ((float) this.f25080H) && f2 > 0.0f) || (f > ((float) (getHeight() - this.f25080H)) && f2 < 0.0f);
    }

    /* renamed from: a */
    private void m27389a(MotionEvent motionEvent) {
        int b = C0978j.m4131b(motionEvent);
        if (C0978j.m4132b(motionEvent, b) == this.f25086N) {
            int i = b == 0 ? 1 : 0;
            this.f25083K = C0978j.m4134d(motionEvent, i);
            this.f25086N = C0978j.m4132b(motionEvent, i);
            if (this.f25087O != null) {
                this.f25087O.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m27394a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
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
                        if (m27394a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
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
    private boolean m27393a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return m27403d(17);
                    case 22:
                        return m27403d(66);
                }
            } else if (VERSION.SDK_INT >= 11) {
                if (keyEvent.hasNoModifiers()) {
                    return m27403d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m27403d(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo22514b() {
        m27381a(this.f25110c);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25096aa = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: i */
    private boolean m27408i() {
        if (this.f25110c <= 0) {
            return false;
        }
        mo22510a(this.f25110c - 1, true);
        return true;
    }

    /* renamed from: d */
    private void m27402d() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f25136a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: f */
    private boolean m27405f() {
        this.f25086N = -1;
        m27407h();
        return this.f25092T.mo4138c() | this.f25093U.mo4138c();
    }

    /* renamed from: h */
    private void m27407h() {
        this.f25077E = false;
        this.f25078F = false;
        if (this.f25087O != null) {
            this.f25087O.recycle();
            this.f25087O = null;
        }
    }

    /* renamed from: j */
    private boolean m27409j() {
        if (this.f25109b == null || this.f25110c >= this.f25109b.getCount() - 1) {
            return false;
        }
        mo22510a(this.f25110c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f25124t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f25107am);
        if (this.f25120p != null && !this.f25120p.isFinished()) {
            this.f25120p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25142a = this.f25110c;
        if (this.f25109b != null) {
            savedState.f25143b = this.f25109b.saveState();
        }
        return savedState;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f25070f = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    private void m27404e() {
        if (this.f25105aj != 0) {
            if (this.f25106ak == null) {
                this.f25106ak = new ArrayList<>();
            } else {
                this.f25106ak.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f25106ak.add(getChildAt(i));
            }
            Collections.sort(this.f25106ak, f25069al);
        }
    }

    /* renamed from: c */
    private void m27399c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f25120p = new Scroller(context, f25072i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f25081I = C0995v.m4257a(viewConfiguration);
        this.f25088P = (int) (400.0f * f);
        this.f25089Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f25092T = new C1047h(context);
        this.f25093U = new C1047h(context);
        this.f25090R = (int) (25.0f * f);
        this.f25091S = (int) (2.0f * f);
        this.f25079G = (int) (f * 16.0f);
        C0991u.m4187a((View) this, (C0939a) new C9211c());
        if (C0991u.m4214f(this) == 0) {
            C0991u.m4206c((View) this, 1);
        }
        C0991u.m4188a((View) this, (C0983o) new C0983o() {

            /* renamed from: b */
            private final Rect f25133b = new Rect();

            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                C0954ab a = C0991u.m4176a(view, abVar);
                if (a.mo3724f()) {
                    return a;
                }
                Rect rect = this.f25133b;
                rect.left = a.mo3717a();
                rect.top = a.mo3719b();
                rect.right = a.mo3720c();
                rect.bottom = a.mo3721d();
                int childCount = LiveVerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0954ab b = C0991u.m4199b(LiveVerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3717a(), rect.left);
                    rect.top = Math.min(b.mo3719b(), rect.top);
                    rect.right = Math.min(b.mo3720c(), rect.right);
                    rect.bottom = Math.min(b.mo3721d(), rect.bottom);
                }
                return a.mo3718a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: g */
    private C9210b m27406g() {
        float f;
        float f2;
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f = 0.0f;
        }
        if (clientHeight > 0) {
            f2 = ((float) this.f25123s) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        C9210b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f25114j.size()) {
            C9210b bVar2 = (C9210b) this.f25114j.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f25146b != i3) {
                    bVar2 = this.f25115k;
                    bVar2.f25149e = f3 + f4 + f2;
                    bVar2.f25146b = i3;
                    bVar2.f25148d = this.f25109b.getPageWidth(bVar2.f25146b);
                    i--;
                }
            }
            f3 = bVar2.f25149e;
            float f5 = bVar2.f25148d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f25114j.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f25146b;
            f4 = bVar2.f25148d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f25121q = true;
        if (this.f25120p.isFinished() || !this.f25120p.computeScrollOffset()) {
            m27391a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f25120p.getCurrX();
        int currY = this.f25120p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m27401c(currY)) {
                this.f25120p.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0991u.m4212e(this);
    }

    /* access modifiers changed from: 0000 */
    public void setOnAdapterChangeListener(C9212d dVar) {
        this.f25102ag = dVar;
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.f25100ae = eVar;
    }

    public void setOverScrollListener(C9213e eVar) {
        this.f25112e = eVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f25074B != z) {
            this.f25074B = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f25075C = false;
        m27387a(i, true, true, 1);
    }

    /* renamed from: c */
    private void m27400c(boolean z) {
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

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f25073A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f25075C = false;
        m27386a(i, !this.f25096aa, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f25076D) {
            this.f25076D = i;
            mo22514b();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f25123s;
        this.f25123s = i;
        int height = getHeight();
        m27384a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f25124t) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static float m27376a(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    /* renamed from: b */
    private C9210b m27395b(int i) {
        for (int i2 = 0; i2 < this.f25114j.size(); i2++) {
            C9210b bVar = (C9210b) this.f25114j.get(i2);
            if (bVar.f25146b == i) {
                return bVar;
            }
        }
        return null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || m27393a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f25124t = drawable;
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

    public void setScrollState(int i) {
        boolean z;
        if (this.f25108an != i) {
            this.f25108an = i;
            if (this.f25103ah != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                m27397b(z);
            }
            if (this.f25100ae != null) {
                this.f25100ae.onPageScrollStateChanged(i);
            }
        }
    }

    /* renamed from: b */
    private C9210b m27396b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m27380a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C9210b a = m27380a(childAt);
                if (a != null && a.f25146b == this.f25110c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f25109b == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f25127w))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f25128x))) {
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
                C9210b a = m27380a(childAt);
                if (a != null && a.f25146b == this.f25110c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (this.f25109b != null) {
            this.f25109b.restoreState(savedState.f25143b, savedState.f25144c);
            m27386a(savedState.f25142a, false, true);
            return;
        }
        this.f25117m = savedState.f25142a;
        this.f25118n = savedState.f25143b;
        this.f25119o = savedState.f25144c;
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
            java.lang.reflect.Method r0 = r6.f25104ai
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001b }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x001b }
            r6.f25104ai = r0     // Catch:{ NoSuchMethodException -> 0x001b }
        L_0x001b:
            java.lang.reflect.Method r0 = r6.f25104ai     // Catch:{ Exception -> 0x0029 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0029 }
            r2[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r0.invoke(r6, r2)     // Catch:{ Exception -> 0x0029 }
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public LiveVerticalViewPager(Context context) {
        super(context);
        m27399c();
    }

    /* renamed from: b */
    private void m27397b(boolean z) {
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

    /* renamed from: b */
    private boolean m27398b(float f) {
        boolean z;
        float f2 = this.f25083K - f;
        this.f25083K = f;
        float scrollY = ((float) getScrollY()) + f2;
        float clientHeight = (float) getClientHeight();
        float f3 = this.f25127w * clientHeight;
        float f4 = this.f25128x * clientHeight;
        boolean z2 = false;
        C9210b bVar = (C9210b) this.f25114j.get(0);
        boolean z3 = true;
        C9210b bVar2 = (C9210b) this.f25114j.get(this.f25114j.size() - 1);
        if (bVar.f25146b != 0) {
            f3 = bVar.f25149e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f25146b != this.f25109b.getCount() - 1) {
            f4 = bVar2.f25149e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z) {
                z2 = this.f25092T.mo4135a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z2 = this.f25093U.mo4135a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f25082J += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m27401c(i);
        return z2;
    }

    /* renamed from: c */
    private boolean m27401c(int i) {
        if (this.f25114j.size() != 0) {
            C9210b g = m27406g();
            int clientHeight = getClientHeight();
            int i2 = this.f25123s + clientHeight;
            float f = (float) clientHeight;
            float f2 = ((float) this.f25123s) / f;
            int i3 = g.f25146b;
            float f3 = ((((float) i) / f) - g.f25149e) / (g.f25148d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.f25098ac = false;
            m27382a(i3, f3, i4);
            if (this.f25098ac) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f25096aa) {
            return false;
        } else {
            this.f25098ac = false;
            m27382a(0, 0.0f, 0);
            if (this.f25098ac) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27403d(int r7) {
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
            android.graphics.Rect r1 = r6.f25116l
            android.graphics.Rect r1 = r6.m27378a(r1, r3)
            int r1 = r1.top
            android.graphics.Rect r2 = r6.f25116l
            android.graphics.Rect r2 = r6.m27378a(r2, r0)
            int r2 = r2.top
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m27408i()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f25116l
            android.graphics.Rect r1 = r6.m27378a(r1, r3)
            int r1 = r1.bottom
            android.graphics.Rect r2 = r6.f25116l
            android.graphics.Rect r2 = r6.m27378a(r2, r0)
            int r2 = r2.bottom
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m27409j()
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
            boolean r2 = r6.m27409j()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m27408i()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m27403d(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce A[Catch:{ Throwable -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2 A[Catch:{ Throwable -> 0x00df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            super.draw(r10)     // Catch:{ Throwable -> 0x00df }
            int r0 = android.support.p022v4.view.C0991u.m4174a(r9)     // Catch:{ Throwable -> 0x00df }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 != r1) goto L_0x001a
            android.support.v4.view.PagerAdapter r0 = r9.f25109b     // Catch:{ Throwable -> 0x00df }
            if (r0 == 0) goto L_0x001a
            android.support.v4.view.PagerAdapter r0 = r9.f25109b     // Catch:{ Throwable -> 0x00df }
            int r0 = r0.getCount()     // Catch:{ Throwable -> 0x00df }
            if (r0 <= r1) goto L_0x001a
            goto L_0x0027
        L_0x001a:
            android.support.v4.widget.h r10 = r9.f25092T     // Catch:{ Throwable -> 0x00df }
            r10.mo4137b()     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.h r10 = r9.f25093U     // Catch:{ Throwable -> 0x00df }
            r10.mo4137b()     // Catch:{ Throwable -> 0x00df }
            r3 = 0
            goto L_0x00cc
        L_0x0027:
            android.support.v4.widget.h r0 = r9.f25092T     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r0.mo4134a()     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x0074
            int r0 = r10.save()     // Catch:{ Throwable -> 0x00df }
            int r3 = r9.getHeight()     // Catch:{ Throwable -> 0x00df }
            int r4 = r9.getWidth()     // Catch:{ Throwable -> 0x00df }
            int r5 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r4 = r4 - r5
            int r5 = r9.getPaddingRight()     // Catch:{ Throwable -> 0x00df }
            int r4 = r4 - r5
            int r5 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x00df }
            float r6 = r9.f25127w     // Catch:{ Throwable -> 0x00df }
            float r7 = (float) r3     // Catch:{ Throwable -> 0x00df }
            float r6 = r6 * r7
            r10.translate(r5, r6)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.h r5 = r9.f25092T     // Catch:{ Throwable -> 0x00df }
            r5.mo4133a(r4, r3)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.h r3 = r9.f25092T     // Catch:{ Throwable -> 0x00df }
            boolean r3 = r3.mo4136a(r10)     // Catch:{ Throwable -> 0x00df }
            r3 = r3 | r2
            r10.restoreToCount(r0)     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r9.f25094V     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x0075
            r9.f25094V = r1     // Catch:{ Throwable -> 0x00df }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r0 = r9.f25112e     // Catch:{ Throwable -> 0x00df }
            if (r0 == 0) goto L_0x0075
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$5 r0 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$5     // Catch:{ Throwable -> 0x00df }
            r0.<init>()     // Catch:{ Throwable -> 0x00df }
            r9.post(r0)     // Catch:{ Throwable -> 0x00df }
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            android.support.v4.widget.h r0 = r9.f25093U     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r0.mo4134a()     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x00cc
            int r0 = r10.save()     // Catch:{ Throwable -> 0x00df }
            int r4 = r9.getHeight()     // Catch:{ Throwable -> 0x00df }
            int r5 = r9.getWidth()     // Catch:{ Throwable -> 0x00df }
            int r6 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r5 = r5 - r6
            int r6 = r9.getPaddingRight()     // Catch:{ Throwable -> 0x00df }
            int r5 = r5 - r6
            r6 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r6)     // Catch:{ Throwable -> 0x00df }
            int r6 = -r5
            int r7 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r6 = r6 - r7
            float r6 = (float) r6     // Catch:{ Throwable -> 0x00df }
            float r7 = r9.f25128x     // Catch:{ Throwable -> 0x00df }
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 + r8
            float r7 = -r7
            float r8 = (float) r4     // Catch:{ Throwable -> 0x00df }
            float r7 = r7 * r8
            r10.translate(r6, r7)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.h r6 = r9.f25093U     // Catch:{ Throwable -> 0x00df }
            r6.mo4133a(r5, r4)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.h r4 = r9.f25093U     // Catch:{ Throwable -> 0x00df }
            boolean r4 = r4.mo4136a(r10)     // Catch:{ Throwable -> 0x00df }
            r3 = r3 | r4
            r10.restoreToCount(r0)     // Catch:{ Throwable -> 0x00df }
            boolean r10 = r9.f25095W     // Catch:{ Throwable -> 0x00df }
            if (r10 != 0) goto L_0x00cc
            r9.f25095W = r1     // Catch:{ Throwable -> 0x00df }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r10 = r9.f25112e     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00cc
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6 r10 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6     // Catch:{ Throwable -> 0x00df }
            r10.<init>()     // Catch:{ Throwable -> 0x00df }
            r9.post(r10)     // Catch:{ Throwable -> 0x00df }
        L_0x00cc:
            if (r3 == 0) goto L_0x00d2
            android.support.p022v4.view.C0991u.m4212e(r9)     // Catch:{ Throwable -> 0x00df }
            goto L_0x00e5
        L_0x00d2:
            boolean r10 = r9.f25094V     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00d8
            r9.f25094V = r2     // Catch:{ Throwable -> 0x00df }
        L_0x00d8:
            boolean r10 = r9.f25095W     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00de
            r9.f25095W = r2     // Catch:{ Throwable -> 0x00df }
        L_0x00de:
            return
        L_0x00df:
            r10 = move-exception
            java.lang.String r0 = "LiveVerticalViewPager"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r0, r10)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f25123s > 0 && this.f25124t != null && this.f25114j.size() > 0 && this.f25109b != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f4 = (float) height;
            float f5 = ((float) this.f25123s) / f4;
            int i = 0;
            C9210b bVar = (C9210b) this.f25114j.get(0);
            float f6 = bVar.f25149e;
            int size = this.f25114j.size();
            int i2 = bVar.f25146b;
            int i3 = ((C9210b) this.f25114j.get(size - 1)).f25146b;
            while (i2 < i3) {
                while (i2 > bVar.f25146b && i < size) {
                    i++;
                    bVar = (C9210b) this.f25114j.get(i);
                }
                if (i2 == bVar.f25146b) {
                    f2 = (bVar.f25149e + bVar.f25148d) * f4;
                    f = bVar.f25149e + bVar.f25148d + f5;
                } else {
                    float pageWidth = this.f25109b.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f25123s) + f2 > ((float) scrollY)) {
                    f3 = f5;
                    this.f25124t.setBounds(this.f25125u, (int) f2, this.f25126v, (int) (((float) this.f25123s) + f2 + 0.5f));
                    this.f25124t.draw(canvas);
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
        if (this.f25109b != null) {
            m27388a(this.f25109b, (C9214f) null);
            this.f25109b.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f25114j.size(); i++) {
                C9210b bVar = (C9210b) this.f25114j.get(i);
                this.f25109b.destroyItem((ViewGroup) this, bVar.f25146b, bVar.f25145a);
            }
            this.f25109b.finishUpdate((ViewGroup) this);
            this.f25114j.clear();
            m27402d();
            this.f25110c = 0;
            scrollTo(0, 0);
        }
        this.f25109b = pagerAdapter;
        this.f25113g = 0;
        if (this.f25109b != null) {
            if (this.f25122r == null) {
                this.f25122r = new C9214f();
            }
            m27388a(this.f25109b, this.f25122r);
            this.f25075C = false;
            boolean z = this.f25096aa;
            this.f25096aa = true;
            this.f25113g = this.f25109b.getCount();
            if (this.f25117m >= 0) {
                this.f25109b.restoreState(this.f25118n, this.f25119o);
                m27386a(this.f25117m, false, true);
                this.f25117m = -1;
                this.f25118n = null;
                this.f25119o = null;
            } else if (!z) {
                mo22514b();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    private C9210b m27380a(View view) {
        for (int i = 0; i < this.f25114j.size(); i++) {
            C9210b bVar = (C9210b) this.f25114j.get(i);
            if (this.f25109b.isViewFromObject(view, bVar.f25145a)) {
                return bVar;
            }
        }
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f25111d) {
                return false;
            }
            int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f25077E) {
                            return true;
                        }
                        if (this.f25078F) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f25082J = motionEvent.getX();
                        this.f25084L = motionEvent.getX();
                        this.f25083K = motionEvent.getY();
                        this.f25085M = motionEvent.getY();
                        this.f25086N = C0978j.m4132b(motionEvent2, 0);
                        this.f25078F = false;
                        this.f25121q = true;
                        this.f25120p.computeScrollOffset();
                        if (this.f25108an != 2 || Math.abs(this.f25120p.getFinalY() - this.f25120p.getCurrY()) <= this.f25091S) {
                            m27391a(false);
                            this.f25077E = false;
                        } else {
                            this.f25120p.abortAnimation();
                            this.f25075C = false;
                            mo22514b();
                            this.f25077E = true;
                            m27400c(true);
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f25086N;
                        if (i != -1) {
                            int a = C0978j.m4130a(motionEvent2, i);
                            float d = C0978j.m4134d(motionEvent2, a);
                            float f2 = d - this.f25083K;
                            float abs = Math.abs(f2);
                            float c = C0978j.m4133c(motionEvent2, a);
                            float abs2 = Math.abs(c - this.f25084L);
                            if (f2 != 0.0f && !m27392a(this.f25083K, f2)) {
                                if (m27394a(this, false, (int) f2, (int) c, (int) d)) {
                                    this.f25082J = c;
                                    this.f25083K = d;
                                    this.f25078F = true;
                                    return false;
                                }
                            }
                            if (abs > ((float) this.f25081I) && abs * 0.5f > abs2) {
                                this.f25077E = true;
                                m27400c(true);
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f25085M + ((float) this.f25081I);
                                } else {
                                    f = this.f25085M - ((float) this.f25081I);
                                }
                                this.f25083K = f;
                                this.f25082J = c;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) this.f25081I)) {
                                this.f25078F = true;
                            }
                            if (this.f25077E && m27398b(d)) {
                                C0991u.m4212e(this);
                            }
                        }
                    } else if (action == 6) {
                        m27389a(motionEvent);
                    }
                    if (this.f25087O == null) {
                        this.f25087O = VelocityTracker.obtain();
                    }
                    this.f25087O.addMovement(motionEvent2);
                    return this.f25077E;
                }
            }
            m27405f();
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f25111d) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f25109b != null) {
                if (this.f25109b.getCount() != 0) {
                    if (this.f25087O == null) {
                        this.f25087O = VelocityTracker.obtain();
                    }
                    this.f25087O.addMovement(motionEvent);
                    switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                        case 0:
                            this.f25120p.abortAnimation();
                            this.f25075C = false;
                            mo22514b();
                            this.f25084L = motionEvent.getX();
                            this.f25082J = motionEvent.getX();
                            this.f25083K = motionEvent.getY();
                            this.f25085M = motionEvent.getY();
                            this.f25086N = C0978j.m4132b(motionEvent, 0);
                            break;
                        case 1:
                            if (this.f25077E) {
                                VelocityTracker velocityTracker = this.f25087O;
                                velocityTracker.computeCurrentVelocity(1000, (float) this.f25089Q);
                                int b = (int) C0990t.m4163b(velocityTracker, this.f25086N);
                                this.f25075C = true;
                                int clientHeight = getClientHeight();
                                int scrollY = getScrollY();
                                C9210b g = m27406g();
                                float f2 = (float) clientHeight;
                                m27387a(m27377a(g.f25146b, ((((float) scrollY) / f2) - g.f25149e) / (g.f25148d + (((float) this.f25123s) / f2)), b, (int) (C0978j.m4134d(motionEvent, C0978j.m4130a(motionEvent, this.f25086N)) - this.f25085M)), true, true, b);
                                z = m27405f();
                                break;
                            }
                            break;
                        case 2:
                            if (!this.f25077E) {
                                int a = C0978j.m4130a(motionEvent, this.f25086N);
                                if (a == -1) {
                                    z = m27405f();
                                    break;
                                } else {
                                    float d = C0978j.m4134d(motionEvent, a);
                                    float abs = Math.abs(d - this.f25083K);
                                    float c = C0978j.m4133c(motionEvent, a);
                                    float abs2 = Math.abs(c - this.f25082J);
                                    if (abs > ((float) this.f25081I) && abs > abs2) {
                                        this.f25077E = true;
                                        m27400c(true);
                                        if (d - this.f25085M > 0.0f) {
                                            f = this.f25085M + ((float) this.f25081I);
                                        } else {
                                            f = this.f25085M - ((float) this.f25081I);
                                        }
                                        this.f25083K = f;
                                        this.f25082J = c;
                                        setScrollState(1);
                                        setScrollingCacheEnabled(true);
                                        ViewParent parent = getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                }
                            }
                            if (this.f25077E) {
                                z = false | m27398b(C0978j.m4134d(motionEvent, C0978j.m4130a(motionEvent, this.f25086N)));
                                break;
                            }
                            break;
                        case 3:
                            if (this.f25077E) {
                                m27385a(this.f25110c, true, 0, false);
                                z = m27405f();
                                break;
                            }
                            break;
                        case 5:
                            int b2 = C0978j.m4131b(motionEvent);
                            this.f25083K = C0978j.m4134d(motionEvent, b2);
                            this.f25086N = C0978j.m4132b(motionEvent, b2);
                            break;
                        case 6:
                            m27389a(motionEvent);
                            this.f25083K = C0978j.m4134d(motionEvent, C0978j.m4130a(motionEvent, this.f25086N));
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
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9.f25146b == r0.f25110c) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27381a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f25110c
            if (r2 == r1) goto L_0x001a
            int r2 = r0.f25110c
            if (r2 >= r1) goto L_0x000f
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 33
        L_0x0011:
            int r4 = r0.f25110c
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m27395b(r4)
            r0.f25110c = r1
            goto L_0x001c
        L_0x001a:
            r2 = 2
            r4 = 0
        L_0x001c:
            android.support.v4.view.PagerAdapter r1 = r0.f25109b
            if (r1 != 0) goto L_0x0024
            r17.m27404e()
            return
        L_0x0024:
            boolean r1 = r0.f25075C
            if (r1 == 0) goto L_0x002c
            r17.m27404e()
            return
        L_0x002c:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0033
            return
        L_0x0033:
            android.support.v4.view.PagerAdapter r1 = r0.f25109b
            r1.startUpdate(r0)
            int r1 = r0.f25076D
            int r5 = r0.f25110c
            int r5 = r5 - r1
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            android.support.v4.view.PagerAdapter r7 = r0.f25109b
            int r7 = r7.getCount()
            int r8 = r7 + -1
            int r9 = r0.f25110c
            int r9 = r9 + r1
            int r1 = java.lang.Math.min(r8, r9)
            int r8 = r0.f25113g
            if (r7 != r8) goto L_0x0222
            r8 = 0
        L_0x0056:
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r0.f25114j
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0076
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r0.f25114j
            java.lang.Object r9 = r9.get(r8)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r9
            int r10 = r9.f25146b
            int r11 = r0.f25110c
            if (r10 < r11) goto L_0x0073
            int r10 = r9.f25146b
            int r11 = r0.f25110c
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
            int r9 = r0.f25110c
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = r0.m27379a(r9, r8)
        L_0x0081:
            if (r9 == 0) goto L_0x01a1
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0090
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r12 = r0.f25114j
            java.lang.Object r12 = r12.get(r11)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r12 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r12
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
            float r15 = r9.f25148d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r6 = (float) r13
            float r3 = r3 / r6
            float r3 = r3 + r15
        L_0x00a7:
            int r6 = r0.f25110c
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
            int r10 = r12.f25146b
            if (r6 != r10) goto L_0x0109
            boolean r10 = r12.f25147c
            if (r10 != 0) goto L_0x0109
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f25114j
            r10.remove(r15)
            android.support.v4.view.PagerAdapter r10 = r0.f25109b
            java.lang.Object r12 = r12.f25145a
            r10.destroyItem(r0, r6, r12)
            int r15 = r15 + -1
            int r11 = r11 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f25114j
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r10
            goto L_0x0108
        L_0x00db:
            if (r12 == 0) goto L_0x00f1
            int r10 = r12.f25146b
            if (r6 != r10) goto L_0x00f1
            float r10 = r12.f25148d
            float r8 = r8 + r10
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f25114j
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r10
            goto L_0x0108
        L_0x00f1:
            int r10 = r15 + 1
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = r0.m27379a(r6, r10)
            float r10 = r10.f25148d
            float r8 = r8 + r10
            int r11 = r11 + 1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f25114j
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r10
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r12 = r10
        L_0x0109:
            int r6 = r6 + -1
            goto L_0x00ae
        L_0x010c:
            float r3 = r9.f25148d
            int r5 = r11 + 1
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x019e
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0125
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r6
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
            int r8 = r0.f25110c
        L_0x0135:
            int r8 = r8 + 1
            if (r8 >= r7) goto L_0x019e
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0168
            if (r8 <= r1) goto L_0x0168
            if (r6 == 0) goto L_0x019e
            int r12 = r6.f25146b
            if (r8 != r12) goto L_0x019d
            boolean r12 = r6.f25147c
            if (r12 != 0) goto L_0x019d
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r12 = r0.f25114j
            r12.remove(r5)
            android.support.v4.view.PagerAdapter r12 = r0.f25109b
            java.lang.Object r6 = r6.f25145a
            r12.destroyItem(r0, r8, r6)
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r6
            goto L_0x019d
        L_0x0166:
            r6 = 0
            goto L_0x019d
        L_0x0168:
            if (r6 == 0) goto L_0x0184
            int r12 = r6.f25146b
            if (r8 != r12) goto L_0x0184
            float r6 = r6.f25148d
            float r3 = r3 + r6
            int r5 = r5 + 1
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r6
            goto L_0x019d
        L_0x0184:
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = r0.m27379a(r8, r5)
            int r5 = r5 + 1
            float r6 = r6.f25148d
            float r3 = r3 + r6
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f25114j
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9210b) r6
        L_0x019d:
            goto L_0x0135
        L_0x019e:
            r0.m27390a(r9, r11, r4)
        L_0x01a1:
            android.support.v4.view.PagerAdapter r1 = r0.f25109b
            int r3 = r0.f25110c
            if (r9 == 0) goto L_0x01aa
            java.lang.Object r4 = r9.f25145a
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            r1.setPrimaryItem(r0, r3, r4)
            android.support.v4.view.PagerAdapter r1 = r0.f25109b
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r3 = 0
        L_0x01b8:
            if (r3 >= r1) goto L_0x01e4
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r5 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r5
            r5.f25141f = r3
            boolean r6 = r5.f25136a
            if (r6 != 0) goto L_0x01e0
            float r6 = r5.f25138c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01e1
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m27380a(r4)
            if (r4 == 0) goto L_0x01e1
            float r6 = r4.f25148d
            r5.f25138c = r6
            int r4 = r4.f25146b
            r5.f25140e = r4
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            int r3 = r3 + 1
            goto L_0x01b8
        L_0x01e4:
            r17.m27404e()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0221
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01f8
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r3 = r0.m27396b(r1)
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            if (r3 == 0) goto L_0x0201
            int r1 = r3.f25146b
            int r3 = r0.f25110c
            if (r1 == r3) goto L_0x0221
        L_0x0201:
            r1 = 0
        L_0x0202:
            int r3 = r17.getChildCount()
            if (r1 >= r3) goto L_0x0221
            android.view.View r3 = r0.getChildAt(r1)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m27380a(r3)
            if (r4 == 0) goto L_0x021e
            int r4 = r4.f25146b
            int r5 = r0.f25110c
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
            int r4 = r0.f25113g
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
            android.support.v4.view.PagerAdapter r1 = r0.f25109b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m27381a(int):void");
    }

    /* renamed from: a */
    private static void m27388a(PagerAdapter pagerAdapter, C9214f fVar) {
        try {
            f25070f.set(pagerAdapter, fVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f25105aj == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f25106ak.get(i2)).getLayoutParams()).f25141f;
    }

    /* renamed from: a */
    private C9210b m27379a(int i, int i2) {
        C9210b bVar = new C9210b();
        bVar.f25146b = i;
        bVar.f25145a = this.f25109b.instantiateItem((ViewGroup) this, i);
        bVar.f25148d = this.f25109b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f25114j.size()) {
            this.f25114j.add(bVar);
        } else {
            this.f25114j.add(i2, bVar);
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
                C9210b a = m27380a(childAt);
                if (a != null && a.f25146b == this.f25110c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public LiveVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27399c();
    }

    /* renamed from: a */
    private Rect m27378a(Rect rect, View view) {
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
            int r4 = r0.f25079G
            int r3 = java.lang.Math.min(r3, r4)
            r0.f25080H = r3
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
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c0
            boolean r10 = r6.f25136a
            if (r10 == 0) goto L_0x00c0
            int r10 = r6.f25137b
            r10 = r10 & 7
            int r11 = r6.f25137b
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
            r0.f25129y = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f25130z = r1
            r0.f25073A = r7
            r16.mo22514b()
            r1 = 0
            r0.f25073A = r1
            int r2 = r16.getChildCount()
        L_0x00dd:
            if (r1 >= r2) goto L_0x0107
            android.view.View r3 = r0.getChildAt(r1)
            int r4 = r3.getVisibility()
            if (r4 == r6) goto L_0x0104
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r4 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r4
            if (r4 == 0) goto L_0x00f5
            boolean r7 = r4.f25136a
            if (r7 != 0) goto L_0x0104
        L_0x00f5:
            float r7 = (float) r5
            float r4 = r4.f25138c
            float r7 = r7 * r4
            int r4 = (int) r7
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            int r7 = r0.f25129y
            r3.measure(r7, r4)
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m27386a(int i, boolean z, boolean z2) {
        m27387a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f25136a |= view instanceof C9209a;
        if (!this.f25073A) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f25136a) {
            layoutParams2.f25139d = true;
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
                    C9210b a = m27380a(childAt);
                    if (a != null && a.f25146b == this.f25110c) {
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
    private void m27382a(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f25099ad
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
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r8 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r8
            boolean r9 = r8.f25136a
            if (r9 == 0) goto L_0x006c
            int r8 = r8.f25137b
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
            android.support.v4.view.ViewPager$e r0 = r11.f25100ae
            if (r0 == 0) goto L_0x0078
            android.support.v4.view.ViewPager$e r0 = r11.f25100ae
            r0.onPageScrolled(r12, r13, r14)
        L_0x0078:
            android.support.v4.view.ViewPager$e r0 = r11.f25101af
            if (r0 == 0) goto L_0x0081
            android.support.v4.view.ViewPager$e r0 = r11.f25101af
            r0.onPageScrolled(r12, r13, r14)
        L_0x0081:
            android.support.v4.view.ViewPager$f r12 = r11.f25103ah
            if (r12 == 0) goto L_0x00b1
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L_0x008d:
            if (r1 >= r13) goto L_0x00b1
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r0 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r0
            boolean r0 = r0.f25136a
            if (r0 != 0) goto L_0x00ae
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            android.support.v4.view.ViewPager$f r2 = r11.f25103ah
            r2.mo3622a(r14, r0)
        L_0x00ae:
            int r1 = r1 + 1
            goto L_0x008d
        L_0x00b1:
            r12 = 1
            r11.f25098ac = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m27382a(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            m27384a(i2, i4, this.f25123s, this.f25123s);
        }
    }

    /* renamed from: a */
    private int m27377a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f25090R || Math.abs(i2) <= this.f25088P) {
            if (i >= this.f25110c) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f25114j.size() <= 0) {
            return i;
        }
        return Math.max(((C9210b) this.f25114j.get(0)).f25146b, Math.min(i, ((C9210b) this.f25114j.get(this.f25114j.size() - 1)).f25146b));
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
                if (layoutParams.f25136a) {
                    int i13 = layoutParams.f25137b & 7;
                    int i14 = layoutParams.f25137b & 112;
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
                C9210b a = m27380a(childAt2);
                if (!layoutParams2.f25136a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f25149e * f)) + paddingTop;
                    if (layoutParams2.f25139d) {
                        layoutParams2.f25139d = false;
                        childAt2.measure(MeasureSpec.makeMeasureSpec((i7 - i11) - i9, 1073741824), MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f25138c), 1073741824));
                    }
                    childAt2.layout(i11, i18, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f25125u = i11;
        this.f25126v = i7 - i9;
        this.f25099ad = i10;
        if (this.f25096aa) {
            z2 = false;
            m27385a(this.f25110c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f25096aa = z2;
    }
}
