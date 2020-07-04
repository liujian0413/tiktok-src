package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0996w;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.widget.AbsListView;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.R$styleable;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

public class TTLiveResolverDrawerLayout extends ViewGroup implements C0981m {

    /* renamed from: A */
    private final OnTouchModeChangeListener f25201A;

    /* renamed from: a */
    public boolean f25202a;

    /* renamed from: b */
    private int f25203b;

    /* renamed from: c */
    private int f25204c;

    /* renamed from: d */
    private int f25205d;

    /* renamed from: e */
    private float f25206e;

    /* renamed from: f */
    private int f25207f;

    /* renamed from: g */
    private int f25208g;

    /* renamed from: h */
    private int f25209h;

    /* renamed from: i */
    private int f25210i;

    /* renamed from: j */
    private int f25211j;

    /* renamed from: k */
    private boolean f25212k;

    /* renamed from: l */
    private boolean f25213l;

    /* renamed from: m */
    private boolean f25214m;

    /* renamed from: n */
    private boolean f25215n;

    /* renamed from: o */
    private final int f25216o;

    /* renamed from: p */
    private final float f25217p;

    /* renamed from: q */
    private final OverScroller f25218q;

    /* renamed from: r */
    private VelocityTracker f25219r;

    /* renamed from: s */
    private Drawable f25220s;

    /* renamed from: t */
    private C9220a f25221t;

    /* renamed from: u */
    private C9221b f25222u;

    /* renamed from: v */
    private float f25223v;

    /* renamed from: w */
    private float f25224w;

    /* renamed from: x */
    private float f25225x;

    /* renamed from: y */
    private int f25226y;

    /* renamed from: z */
    private final Rect f25227z;

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$1 */
    class C92181 implements OnTouchModeChangeListener {

        /* renamed from: a */
        final /* synthetic */ TTLiveResolverDrawerLayout f25228a;

        public final void onTouchModeChanged(boolean z) {
            if (!z && this.f25228a.hasFocus() && this.f25228a.mo22602a(this.f25228a.getFocusedChild())) {
                this.f25228a.mo22601a(0, 0.0f);
            }
        }
    }

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public boolean f25229a;

        /* renamed from: b */
        public boolean f25230b;

        /* renamed from: c */
        public boolean f25231c;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f25229a = layoutParams.f25229a;
            this.f25230b = layoutParams.f25230b;
            this.f25231c = layoutParams.f25231c;
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TTLiveResolverDrawerLayout_LayoutParams);
            this.f25229a = obtainStyledAttributes.getBoolean(0, false);
            this.f25230b = obtainStyledAttributes.getBoolean(2, false);
            this.f25231c = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m27457a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m27456a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m27456a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m27457a(i);
            }
        };

        /* renamed from: a */
        boolean f25232a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f25232a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, C92181 r2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25232a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a */
    public interface C9220a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$b */
    class C9221b implements Runnable {
        public final void run() {
            TTLiveResolverDrawerLayout.this.mo22600a();
        }

        private C9221b() {
        }

        /* synthetic */ C9221b(TTLiveResolverDrawerLayout tTLiveResolverDrawerLayout, C92181 r2) {
            this();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22600a() {
        if (this.f25222u != null) {
            removeCallbacks(this.f25222u);
            this.f25222u = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22601a(int i, float f) {
        int i2;
        m27452g();
        int i3 = (int) this.f25206e;
        int i4 = i - i3;
        int height = getHeight();
        int i5 = height / 2;
        float f2 = (float) height;
        float f3 = (float) i5;
        float a = f3 + (m27435a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        float abs = Math.abs(f);
        if (abs > 0.0f) {
            i2 = Math.round(Math.abs(a / abs) * 1000.0f) * 4;
        } else {
            i2 = (int) (((((float) Math.abs(i4)) / f2) + 1.0f) * 100.0f);
        }
        this.f25218q.startScroll(0, i3, 0, i4, Math.min(i2, C34943c.f91128x));
        C0991u.m4212e(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo22602a(View view) {
        if (view == null) {
            return false;
        }
        this.f25227z.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRectToMyCoords(view, this.f25227z);
        if (view.getParent() != this) {
            ViewParent parent = view.getParent();
            while (parent != this) {
                view = (View) parent;
                parent = view.getParent();
            }
        }
        int height = getHeight() - getPaddingBottom();
        int childCount = getChildCount();
        for (int indexOfChild = indexOfChild(view) + 1; indexOfChild < childCount; indexOfChild++) {
            View childAt = getChildAt(indexOfChild);
            if (childAt.getVisibility() != 8) {
                height = Math.min(height, childAt.getTop());
            }
        }
        if (this.f25227z.bottom > height) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: b */
    private boolean m27446b() {
        if (this.f25206e > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m27447c() {
        if (this.f25212k || C0996w.m4264b(this) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m27449d() {
        if (this.f25219r == null) {
            this.f25219r = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m27450e() {
        if (this.f25219r != null) {
            this.f25219r.recycle();
            this.f25219r = null;
        }
    }

    /* renamed from: g */
    private void m27452g() {
        this.f25218q.abortAnimation();
        this.f25222u = null;
        this.f25215n = false;
    }

    private int getMaxCollapsedHeight() {
        int i;
        if (this.f25202a) {
            i = this.f25205d;
        } else {
            i = this.f25204c;
        }
        return i + this.f25209h;
    }

    public int getNestedScrollAxes() {
        if (!C9051ar.m27034a()) {
            return this.f25211j;
        }
        return super.getNestedScrollAxes();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this.f25201A);
    }

    /* renamed from: f */
    private void m27451f() {
        this.f25226y = -1;
        this.f25212k = false;
        this.f25213l = false;
        this.f25225x = 0.0f;
        this.f25224w = 0.0f;
        this.f25223v = 0.0f;
        if (this.f25219r != null) {
            this.f25219r.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f25201A);
        m27452g();
        m27450e();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f25207f <= 0 || this.f25206e != 0.0f) {
            z = false;
        } else {
            z = true;
        }
        savedState.f25232a = z;
        return savedState;
    }

    public void computeScroll() {
        boolean z;
        super.computeScroll();
        if (this.f25218q.computeScrollOffset()) {
            z = !this.f25218q.isFinished();
            m27436a((int) (((float) this.f25218q.getCurrY()) - this.f25206e));
            if (z) {
                C0991u.m4212e(this);
            }
        } else {
            z = !this.f25218q.isFinished();
        }
        if (!z && this.f25215n && this.f25221t != null) {
            this.f25222u = new C9221b(this, null);
            post(this.f25222u);
        }
    }

    public void setOnDismissedListener(C9220a aVar) {
        this.f25221t = aVar;
    }

    public void setSmallCollapsed(boolean z) {
        this.f25202a = z;
        requestLayout();
    }

    /* renamed from: a */
    private void m27440a(boolean z) {
        if (this.f25220s != null) {
            setWillNotDraw(!z);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onDrawForeground(Canvas canvas) {
        if (this.f25220s != null) {
            this.f25220s.draw(canvas);
        }
        super.onDrawForeground(canvas);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f25214m = savedState.f25232a;
    }

    /* renamed from: a */
    private static float m27435a(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
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

    public void setCollapsed(boolean z) {
        int i;
        if (!C0991u.m4167D(this)) {
            this.f25214m = z;
            return;
        }
        if (z) {
            i = this.f25207f;
        } else {
            i = 0;
        }
        mo22601a(i, 0.0f);
    }

    /* renamed from: b */
    private static int m27444b(View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            int paddingBottom = absListView.getPaddingBottom();
            int childCount = absListView.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                int bottom = absListView.getChildAt(i2).getBottom() + paddingBottom;
                if (bottom > i) {
                    i = bottom;
                }
            }
            if (i < measuredHeight) {
                measuredHeight = i;
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.topMargin + measuredHeight + layoutParams.bottomMargin;
    }

    public void onStopNestedScroll(View view) {
        if (C9051ar.m27034a()) {
            super.onStopNestedScroll(view);
        }
        int i = 0;
        this.f25211j = 0;
        if (this.f25218q.isFinished()) {
            if (this.f25206e >= ((float) (this.f25207f / 2))) {
                i = this.f25207f;
            }
            mo22601a(i, 0.0f);
        }
    }

    public void setCollapsibleHeightReserved(int i) {
        int i2 = this.f25209h;
        this.f25209h = i;
        int i3 = this.f25209h - i2;
        if (i3 != 0 && this.f25212k) {
            this.f25225x -= (float) i3;
        }
        int i4 = this.f25207f;
        this.f25207f = Math.max(this.f25207f, getMaxCollapsedHeight());
        if (!m27441a(i4, !m27447c())) {
            invalidate();
        }
    }

    /* renamed from: a */
    private float m27436a(int i) {
        boolean z;
        float max = Math.max(0.0f, Math.min(this.f25206e + ((float) i), (float) (this.f25207f + this.f25208g)));
        if (max == this.f25206e) {
            return 0.0f;
        }
        int i2 = (int) (max - this.f25206e);
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!((LayoutParams) childAt.getLayoutParams()).f25230b) {
                childAt.offsetTopAndBottom(i2);
            }
        }
        if (this.f25206e != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f25206e = max;
        this.f25210i += i2;
        if (max != 0.0f) {
            z2 = true;
        }
        if (z != z2) {
            m27440a(z2);
        }
        C0991u.m4212e(this);
        return (float) i2;
    }

    /* renamed from: a */
    private void m27439a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f25226y) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f25223v = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.f25225x = y;
            this.f25224w = y;
            this.f25226y = motionEvent.getPointerId(i);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        m27449d();
        if (actionMasked == 0) {
            this.f25219r.clear();
        }
        this.f25219r.addMovement(motionEvent);
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f25223v = x;
                    this.f25225x = y;
                    this.f25224w = y;
                    if (!m27448c(x, y) || this.f25207f <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f25213l = z;
                    this.f25211j = 0;
                    break;
                case 1:
                case 3:
                    m27451f();
                    break;
                case 2:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = y2 - this.f25224w;
                    if (Math.abs(f) > ((float) this.f25216o) && m27437a(x2, y2) != null && (C0996w.m4264b(this) & 2) == 0) {
                        this.f25226y = motionEvent.getPointerId(0);
                        this.f25212k = true;
                        this.f25225x = Math.max(this.f25225x - ((float) this.f25216o), Math.min(this.f25225x + f, this.f25225x + ((float) this.f25216o)));
                        break;
                    }
            }
        } else {
            m27439a(motionEvent);
        }
        if (this.f25212k) {
            m27452g();
        }
        if (this.f25212k || this.f25213l) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v10, types: [int] */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r0v62 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[boolean, int, float, short, byte, char], int]
      uses: [boolean, int]
      mth insns count: 179
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r6.m27449d()
            android.view.VelocityTracker r1 = r6.f25219r
            r1.addMovement(r7)
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x00b6;
                case 2: goto L_0x004c;
                case 3: goto L_0x0033;
                case 4: goto L_0x0012;
                case 5: goto L_0x0019;
                case 6: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x019b
        L_0x0014:
            r6.m27439a(r7)
            goto L_0x019b
        L_0x0019:
            int r0 = r7.getActionIndex()
            int r1 = r7.getPointerId(r0)
            r6.f25226y = r1
            float r1 = r7.getX(r0)
            r6.f25223v = r1
            float r7 = r7.getY(r0)
            r6.f25225x = r7
            r6.f25224w = r7
            goto L_0x019b
        L_0x0033:
            boolean r7 = r6.f25212k
            if (r7 == 0) goto L_0x0048
            float r7 = r6.f25206e
            int r0 = r6.f25207f
            int r0 = r0 / 2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            int r3 = r6.f25207f
        L_0x0045:
            r6.mo22601a(r3, r1)
        L_0x0048:
            r6.m27451f()
            return r2
        L_0x004c:
            int r0 = r6.f25226y
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0069
            int r0 = r7.getPointerId(r3)
            r6.f25226y = r0
            float r0 = r7.getX()
            r6.f25223v = r0
            float r0 = r7.getY()
            r6.f25225x = r0
            r6.f25224w = r0
            r0 = 0
        L_0x0069:
            float r1 = r7.getX(r0)
            float r7 = r7.getY(r0)
            boolean r0 = r6.f25212k
            if (r0 != 0) goto L_0x00a6
            float r0 = r6.f25224w
            float r0 = r7 - r0
            float r4 = java.lang.Math.abs(r0)
            int r5 = r6.f25216o
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            android.view.View r1 = r6.m27437a(r1, r7)
            if (r1 == 0) goto L_0x00a6
            r6.f25212k = r2
            float r1 = r6.f25225x
            int r3 = r6.f25216o
            float r3 = (float) r3
            float r1 = r1 - r3
            float r3 = r6.f25225x
            float r3 = r3 + r0
            float r0 = r6.f25225x
            int r4 = r6.f25216o
            float r4 = (float) r4
            float r0 = r0 + r4
            float r0 = java.lang.Math.min(r3, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r6.f25225x = r0
            r3 = 1
        L_0x00a6:
            boolean r0 = r6.f25212k
            if (r0 == 0) goto L_0x00b2
            float r0 = r6.f25225x
            float r0 = r7 - r0
            int r0 = (int) r0
            r6.m27436a(r0)
        L_0x00b2:
            r6.f25225x = r7
            goto L_0x019b
        L_0x00b6:
            boolean r0 = r6.f25212k
            r6.f25212k = r3
            if (r0 != 0) goto L_0x00df
            float r0 = r6.f25223v
            float r4 = r6.f25224w
            android.view.View r0 = r6.m27437a(r0, r4)
            if (r0 != 0) goto L_0x00df
            float r0 = r7.getX()
            float r4 = r7.getY()
            android.view.View r0 = r6.m27437a(r0, r4)
            if (r0 != 0) goto L_0x00df
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f25221t
            if (r0 == 0) goto L_0x00df
            r6.mo22600a()
            r6.m27451f()
            return r2
        L_0x00df:
            boolean r0 = r6.f25213l
            if (r0 == 0) goto L_0x010b
            float r0 = r7.getX()
            float r4 = r6.f25223v
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f25216o
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            float r7 = r7.getY()
            float r0 = r6.f25224w
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r0 = r6.f25216o
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            r6.mo22601a(r3, r1)
            return r2
        L_0x010b:
            android.view.VelocityTracker r7 = r6.f25219r
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f25219r
            int r0 = r6.f25226y
            float r7 = r7.getYVelocity(r0)
            float r0 = java.lang.Math.abs(r7)
            float r4 = r6.f25217p
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f25221t
            if (r0 == 0) goto L_0x0140
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            float r0 = r6.f25206e
            int r4 = r6.f25207f
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            int r0 = r6.f25207f
            int r1 = r6.f25208g
            int r0 = r0 + r1
            r6.mo22601a(r0, r7)
            r6.f25215n = r2
            goto L_0x015e
        L_0x0140:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0146
            r0 = 0
            goto L_0x0148
        L_0x0146:
            int r0 = r6.f25207f
        L_0x0148:
            r6.mo22601a(r0, r7)
            goto L_0x015e
        L_0x014c:
            float r7 = r6.f25206e
            int r0 = r6.f25207f
            int r0 = r0 / 2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0159
            r7 = 0
            goto L_0x015b
        L_0x0159:
            int r7 = r6.f25207f
        L_0x015b:
            r6.mo22601a(r7, r1)
        L_0x015e:
            r6.m27451f()
            goto L_0x019b
        L_0x0162:
            float r0 = r7.getX()
            float r1 = r7.getY()
            r6.f25223v = r0
            r6.f25225x = r1
            r6.f25224w = r1
            int r7 = r7.getPointerId(r3)
            r6.f25226y = r7
            float r7 = r6.f25223v
            float r0 = r6.f25224w
            android.view.View r7 = r6.m27437a(r7, r0)
            if (r7 == 0) goto L_0x0182
            r7 = 1
            goto L_0x0183
        L_0x0182:
            r7 = 0
        L_0x0183:
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f25221t
            if (r0 != 0) goto L_0x018e
            int r0 = r6.f25207f
            if (r0 <= 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r0 = 0
            goto L_0x018f
        L_0x018e:
            r0 = 1
        L_0x018f:
            if (r7 == 0) goto L_0x0194
            if (r0 == 0) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            r6.f25212k = r2
            r6.m27452g()
            r3 = r0
        L_0x019b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private View m27437a(float f, float f2) {
        return m27438a((ViewGroup) this, f, f2);
    }

    /* renamed from: c */
    private boolean m27448c(float f, float f2) {
        View b = m27445b(f, f2);
        if (b == null || !mo22602a(b)) {
            return false;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && mo22602a(view2)) {
            mo22601a(0, 0.0f);
        }
    }

    /* renamed from: b */
    private View m27445b(float f, float f2) {
        View a = m27437a(f, f2);
        while (a != null) {
            f -= a.getX();
            f2 -= a.getY();
            if (a instanceof AbsListView) {
                return m27438a((ViewGroup) a, f, f2);
            }
            if (a instanceof ViewGroup) {
                a = m27438a((ViewGroup) a, f, f2);
            } else {
                a = null;
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f25203b >= 0) {
            i3 = Math.min(size, this.f25203b);
        } else {
            i3 = size;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        int i5 = paddingTop;
        int i6 = 0;
        while (true) {
            i4 = 8;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (((LayoutParams) childAt.getLayoutParams()).f25229a && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i5);
                i5 += m27444b(childAt);
            }
            i6++;
        }
        int i7 = i5;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (!((LayoutParams) childAt2.getLayoutParams()).f25229a && childAt2.getVisibility() != i4) {
                measureChildWithMargins(childAt2, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i7);
                i7 += m27444b(childAt2);
            }
            i8++;
            i4 = 8;
        }
        int i9 = this.f25207f;
        this.f25207f = Math.max(0, (i7 - i5) - getMaxCollapsedHeight());
        this.f25208g = i7 - this.f25207f;
        m27441a(i9, !m27447c());
        this.f25210i = Math.max(0, size2 - i7) + ((int) this.f25206e);
        setMeasuredDimension(size, size2);
    }

    /* renamed from: a */
    private boolean m27441a(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (i == this.f25207f) {
            return false;
        }
        float f = 0.0f;
        if (C0991u.m4167D(this)) {
            if (this.f25206e != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || i >= this.f25207f || this.f25206e != ((float) i)) {
                this.f25206e = Math.min(this.f25206e, (float) this.f25207f);
            } else {
                this.f25206e = (float) this.f25207f;
            }
            if (this.f25206e != 0.0f) {
                z3 = true;
            }
            if (z2 != z3) {
                m27440a(z3);
            }
        } else {
            if (!this.f25214m) {
                f = (float) this.f25207f;
            }
            this.f25206e = f;
        }
        return true;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        if (C9051ar.m27034a()) {
            super.onNestedScrollAccepted(view, view2, i);
        }
        this.f25211j = i;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        if (f2 <= this.f25217p || this.f25206e == 0.0f) {
            return false;
        }
        mo22601a(0, f2);
        return true;
    }

    /* renamed from: a */
    private static View m27438a(ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (m27442a(childAt, f, f2)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m27442a(View view, float f, float f2) {
        float x = view.getX();
        float y = view.getY();
        float width = ((float) view.getWidth()) + x;
        float height = ((float) view.getHeight()) + y;
        if (f < x || f2 < y || f >= width || f2 >= height) {
            return false;
        }
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            iArr[1] = (int) (-m27436a(-i2));
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean a = m27443a(view, f, f2, z);
        int i = 0;
        if (a || Math.abs(f2) <= this.f25217p) {
            return false;
        }
        if (this.f25221t == null || f2 >= 0.0f || this.f25206e <= ((float) this.f25207f)) {
            if (f2 <= 0.0f) {
                i = this.f25207f;
            }
            mo22601a(i, f2);
        } else {
            mo22601a(this.f25207f + this.f25208g, f2);
            this.f25215n = true;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m27443a(View view, float f, float f2, boolean z) {
        int i;
        if (!(view instanceof RecyclerView) || !z || f2 == 0.0f) {
            return z;
        }
        if (f2 < 0.0f) {
            i = -1;
        } else {
            i = 1;
        }
        return C0991u.m4195a(view, i);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (i4 < 0) {
            m27436a(-i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int i5 = this.f25210i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = width - getPaddingRight();
        int childCount = getChildCount();
        int i6 = i5;
        View view = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f25231c) {
                view = childAt;
            }
            if (childAt.getVisibility() != 8) {
                int i8 = i6 + layoutParams.topMargin;
                if (layoutParams.f25230b) {
                    i8 = (int) (((float) i8) - this.f25206e);
                }
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                int measuredWidth = childAt.getMeasuredWidth();
                int i9 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft;
                childAt.layout(i9, i8, measuredWidth + i9, measuredHeight);
                i6 = measuredHeight + layoutParams.bottomMargin;
            }
        }
        if (this.f25220s != null) {
            if (view != null) {
                int left = view.getLeft();
                int right = view.getRight();
                int top = view.getTop();
                this.f25220s.setBounds(left, top - this.f25220s.getIntrinsicHeight(), right, top);
                setWillNotDraw(true ^ m27446b());
                return;
            }
            this.f25220s = null;
            setWillNotDraw(true);
        }
    }
}
