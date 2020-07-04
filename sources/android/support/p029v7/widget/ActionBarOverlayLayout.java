package android.support.p029v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0982n;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0981m, C1431u {

    /* renamed from: g */
    static final int[] f4477g = {R.attr.f, 16842841};

    /* renamed from: A */
    private final Runnable f4478A;

    /* renamed from: B */
    private final C0982n f4479B;

    /* renamed from: a */
    ActionBarContainer f4480a;

    /* renamed from: b */
    public boolean f4481b;

    /* renamed from: c */
    public boolean f4482c;

    /* renamed from: d */
    boolean f4483d;

    /* renamed from: e */
    ViewPropertyAnimator f4484e;

    /* renamed from: f */
    final AnimatorListenerAdapter f4485f;

    /* renamed from: h */
    private int f4486h;

    /* renamed from: i */
    private int f4487i;

    /* renamed from: j */
    private ContentFrameLayout f4488j;

    /* renamed from: k */
    private C1432v f4489k;

    /* renamed from: l */
    private Drawable f4490l;

    /* renamed from: m */
    private boolean f4491m;

    /* renamed from: n */
    private boolean f4492n;

    /* renamed from: o */
    private int f4493o;

    /* renamed from: p */
    private int f4494p;

    /* renamed from: q */
    private final Rect f4495q;

    /* renamed from: r */
    private final Rect f4496r;

    /* renamed from: s */
    private final Rect f4497s;

    /* renamed from: t */
    private final Rect f4498t;

    /* renamed from: u */
    private final Rect f4499u;

    /* renamed from: v */
    private final Rect f4500v;

    /* renamed from: w */
    private final Rect f4501w;

    /* renamed from: x */
    private C1203a f4502x;

    /* renamed from: y */
    private OverScroller f4503y;

    /* renamed from: z */
    private final Runnable f4504z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C1203a {
        /* renamed from: b */
        void mo4387b(int i);

        /* renamed from: g */
        void mo4388g(boolean z);

        /* renamed from: i */
        void mo4391i();

        /* renamed from: j */
        void mo4392j();

        /* renamed from: k */
        void mo4393k();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: i */
    private static LayoutParams m5466i() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m5466i();
    }

    public int getNestedScrollAxes() {
        return this.f4479B.f3402a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5012a();
    }

    /* renamed from: k */
    private void m5468k() {
        mo5012a();
        postDelayed(this.f4504z, 600);
    }

    /* renamed from: l */
    private void m5469l() {
        mo5012a();
        postDelayed(this.f4478A, 600);
    }

    /* renamed from: m */
    private void m5470m() {
        mo5012a();
        this.f4504z.run();
    }

    /* renamed from: n */
    private void m5471n() {
        mo5012a();
        this.f4478A.run();
    }

    /* renamed from: b */
    public final boolean mo5015b() {
        m5467j();
        return this.f4489k.mo6213f();
    }

    /* renamed from: c */
    public final boolean mo5016c() {
        m5467j();
        return this.f4489k.mo6214g();
    }

    /* renamed from: d */
    public final boolean mo5018d() {
        m5467j();
        return this.f4489k.mo6215h();
    }

    /* renamed from: e */
    public final boolean mo5020e() {
        m5467j();
        return this.f4489k.mo6216i();
    }

    /* renamed from: f */
    public final boolean mo5021f() {
        m5467j();
        return this.f4489k.mo6217j();
    }

    /* renamed from: g */
    public final void mo5023g() {
        m5467j();
        this.f4489k.mo6218k();
    }

    public int getActionBarHideOffset() {
        if (this.f4480a != null) {
            return -((int) this.f4480a.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        m5467j();
        return this.f4489k.mo6211e();
    }

    /* renamed from: h */
    public final void mo5029h() {
        m5467j();
        this.f4489k.mo6219l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5012a() {
        removeCallbacks(this.f4504z);
        removeCallbacks(this.f4478A);
        if (this.f4484e != null) {
            this.f4484e.cancel();
        }
    }

    /* renamed from: j */
    private void m5467j() {
        if (this.f4488j == null) {
            this.f4488j = (ContentFrameLayout) findViewById(R.id.a5);
            this.f4480a = (ActionBarContainer) findViewById(R.id.a6);
            this.f4489k = m5462a(findViewById(R.id.a4));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4492n = z;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5463a(getContext());
        C0991u.m4243v(this);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4487i = i;
        if (this.f4502x != null) {
            this.f4502x.mo4387b(i);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4482c) {
            this.f4482c = z;
            if (!z) {
                mo5012a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m5467j();
        this.f4489k.mo6197a(i);
    }

    public void setLogo(int i) {
        m5467j();
        this.f4489k.mo6206b(i);
    }

    public void setWindowCallback(Callback callback) {
        m5467j();
        this.f4489k.mo6202a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m5467j();
        this.f4489k.mo6203a(charSequence);
    }

    public void onStopNestedScroll(View view) {
        if (this.f4482c && !this.f4483d) {
            if (this.f4493o <= this.f4480a.getHeight()) {
                m5468k();
                return;
            }
            m5469l();
        }
    }

    public void setActionBarHideOffset(int i) {
        mo5012a();
        this.f4480a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f4480a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C1203a aVar) {
        this.f4502x = aVar;
        if (getWindowToken() != null) {
            this.f4502x.mo4387b(this.f4487i);
            if (this.f4494p != 0) {
                onWindowSystemUiVisibilityChanged(this.f4494p);
                C0991u.m4243v(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        m5467j();
        this.f4489k.mo6198a(drawable);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f4481b = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f4491m = z2;
    }

    /* renamed from: a */
    private static C1432v m5462a(View view) {
        if (view instanceof C1432v) {
            return (C1432v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4490l != null && !this.f4491m) {
            if (this.f4480a.getVisibility() == 0) {
                i = (int) (((float) this.f4480a.getBottom()) + this.f4480a.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f4490l.setBounds(0, i, getWidth(), this.f4490l.getIntrinsicHeight() + i);
            this.f4490l.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m5463a(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4477g);
        boolean z2 = false;
        this.f4486h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4490l = obtainStyledAttributes.getDrawable(1);
        if (this.f4490l == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f4491m = z2;
        this.f4503y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        m5467j();
        C0991u.m4242u(this);
        boolean a = m5465a(this.f4480a, rect, true, true, false, true);
        this.f4498t.set(rect);
        C1385bc.m6838a(this, this.f4498t, this.f4495q);
        if (!this.f4499u.equals(this.f4498t)) {
            this.f4499u.set(this.f4498t);
            a = true;
        }
        if (!this.f4496r.equals(this.f4495q)) {
            this.f4496r.set(this.f4495q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m5467j();
        int i2 = this.f4494p ^ i;
        this.f4494p = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        if (this.f4502x != null) {
            this.f4502x.mo4388g(!z2);
            if (z || !z2) {
                this.f4502x.mo4391i();
            } else {
                this.f4502x.mo4392j();
            }
        }
        if ((i2 & 256) != 0 && this.f4502x != null) {
            C0991u.m4243v(this);
        }
    }

    /* renamed from: a */
    public final void mo5013a(int i) {
        m5467j();
        if (!(i == 2 || i == 5 || i != 109)) {
            setOverlayMode(true);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4495q = new Rect();
        this.f4496r = new Rect();
        this.f4497s = new Rect();
        this.f4498t = new Rect();
        this.f4499u = new Rect();
        this.f4500v = new Rect();
        this.f4501w = new Rect();
        this.f4485f = new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f4484e = null;
                ActionBarOverlayLayout.this.f4483d = false;
            }

            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f4484e = null;
                ActionBarOverlayLayout.this.f4483d = false;
            }
        };
        this.f4504z = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo5012a();
                ActionBarOverlayLayout.this.f4484e = ActionBarOverlayLayout.this.f4480a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f4485f);
            }
        };
        this.f4478A = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo5012a();
                ActionBarOverlayLayout.this.f4484e = ActionBarOverlayLayout.this.f4480a.animate().translationY((float) (-ActionBarOverlayLayout.this.f4480a.getHeight())).setListener(ActionBarOverlayLayout.this.f4485f);
            }
        };
        m5463a(context);
        this.f4479B = new C0982n(this);
    }

    /* renamed from: a */
    private boolean m5464a(float f, float f2) {
        this.f4503y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4503y.getFinalY() > this.f4480a.getHeight()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        m5467j();
        measureChildWithMargins(this.f4480a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f4480a.getLayoutParams();
        int max = Math.max(0, this.f4480a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f4480a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4480a.getMeasuredState());
        if ((C0991u.m4242u(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f4486h;
            if (this.f4492n && this.f4480a.getTabContainer() != null) {
                i3 += this.f4486h;
            }
        } else {
            i3 = this.f4480a.getVisibility() != 8 ? this.f4480a.getMeasuredHeight() : 0;
        }
        this.f4497s.set(this.f4495q);
        this.f4500v.set(this.f4498t);
        if (this.f4481b || z) {
            this.f4500v.top += i3;
            this.f4500v.bottom += 0;
        } else {
            this.f4497s.top += i3;
            this.f4497s.bottom += 0;
        }
        m5465a(this.f4488j, this.f4497s, true, true, true, true);
        if (!this.f4501w.equals(this.f4500v)) {
            this.f4501w.set(this.f4500v);
            this.f4488j.mo5313a(this.f4500v);
        }
        measureChildWithMargins(this.f4488j, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f4488j.getLayoutParams();
        int max3 = Math.max(max, this.f4488j.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f4488j.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4488j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* renamed from: a */
    public final void mo5014a(Menu menu, C1189a aVar) {
        m5467j();
        this.f4489k.mo6201a(menu, aVar);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4479B.mo3776a(view, view2, i);
        this.f4493o = getActionBarHideOffset();
        mo5012a();
        if (this.f4502x != null) {
            this.f4502x.mo4393k();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4480a.getVisibility() != 0) {
            return false;
        }
        return this.f4482c;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f4482c || !z) {
            return false;
        }
        if (m5464a(f, f2)) {
            m5471n();
        } else {
            m5470m();
        }
        this.f4483d = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f4493o += i2;
        setActionBarHideOffset(this.f4493o);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* renamed from: a */
    private static boolean m5465a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z5 = true;
        } else {
            z5 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z5 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z5;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }
}
