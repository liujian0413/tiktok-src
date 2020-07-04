package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p029v7.view.menu.ActionMenuItemView;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.view.menu.MenuBuilder.C1167b;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends LinearLayoutCompat implements C1167b, C1190j {

    /* renamed from: a */
    public MenuBuilder f4540a;

    /* renamed from: b */
    public boolean f4541b;

    /* renamed from: c */
    C1166a f4542c;

    /* renamed from: d */
    C1215d f4543d;

    /* renamed from: g */
    private Context f4544g;

    /* renamed from: h */
    private int f4545h;

    /* renamed from: i */
    private ActionMenuPresenter f4546i;

    /* renamed from: j */
    private C1189a f4547j;

    /* renamed from: k */
    private boolean f4548k;

    /* renamed from: l */
    private int f4549l;

    /* renamed from: m */
    private int f4550m;

    /* renamed from: n */
    private int f4551n;

    /* renamed from: android.support.v7.widget.ActionMenuView$LayoutParams */
    public static class LayoutParams extends android.support.p029v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty

        /* renamed from: a */
        public boolean f4552a;
        @ExportedProperty

        /* renamed from: b */
        public int f4553b;
        @ExportedProperty

        /* renamed from: c */
        public int f4554c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f4555d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f4556e;

        /* renamed from: f */
        boolean f4557f;

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f4552a = layoutParams.f4552a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C1212a {
        /* renamed from: c */
        boolean mo4651c();

        /* renamed from: d */
        boolean mo4652d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    static class C1213b implements C1189a {
        C1213b() {
        }

        /* renamed from: a */
        public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
        }

        /* renamed from: a */
        public final boolean mo4339a(MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    class C1214c implements C1166a {
        C1214c() {
        }

        /* renamed from: a */
        public final void mo1345a(MenuBuilder menuBuilder) {
            if (ActionMenuView.this.f4542c != null) {
                ActionMenuView.this.f4542c.mo1345a(menuBuilder);
            }
        }

        /* renamed from: a */
        public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
            if (ActionMenuView.this.f4543d == null || !ActionMenuView.this.f4543d.mo5101a(menuItem)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    public interface C1215d {
        /* renamed from: a */
        boolean mo5101a(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getPopupTheme() {
        return this.f4545h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: a */
    public final LayoutParams mo5072a() {
        LayoutParams h = m5528h();
        h.f4552a = true;
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ android.support.p029v7.widget.LinearLayoutCompat.LayoutParams mo5084g() {
        return m5528h();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m5528h();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5083f();
    }

    /* renamed from: h */
    private static LayoutParams m5528h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f4743h = 16;
        return layoutParams;
    }

    /* renamed from: c */
    public final boolean mo5078c() {
        if (this.f4546i == null || !this.f4546i.mo5059f()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo5080d() {
        if (this.f4546i == null || !this.f4546i.mo5062i()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo5082e() {
        if (this.f4546i == null || !this.f4546i.mo5063j()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo5083f() {
        if (this.f4546i != null) {
            this.f4546i.mo5060g();
        }
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f4546i.mo5057d();
    }

    /* renamed from: b */
    public final boolean mo5077b() {
        if (this.f4546i == null || !this.f4546i.mo5058e()) {
            return false;
        }
        return true;
    }

    public Menu getMenu() {
        C1189a aVar;
        if (this.f4540a == null) {
            Context context = getContext();
            this.f4540a = new MenuBuilder(context);
            this.f4540a.mo4702a((C1166a) new C1214c());
            this.f4546i = new ActionMenuPresenter(context);
            this.f4546i.mo5056c(true);
            ActionMenuPresenter actionMenuPresenter = this.f4546i;
            if (this.f4547j != null) {
                aVar = this.f4547j;
            } else {
                aVar = new C1213b();
            }
            actionMenuPresenter.mo1113a(aVar);
            this.f4540a.mo4705a((C1188i) this.f4546i, this.f4544g);
            this.f4546i.mo5055a(this);
        }
        return this.f4540a;
    }

    /* renamed from: a */
    public final void mo1084a(MenuBuilder menuBuilder) {
        this.f4540a = menuBuilder;
    }

    public void setOnMenuItemClickListener(C1215d dVar) {
        this.f4543d = dVar;
    }

    public void setOverflowReserved(boolean z) {
        this.f4541b = z;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f4546i.f4513k = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f4546i = actionMenuPresenter;
        this.f4546i.mo5055a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f4546i.mo5054a(drawable);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4546i != null) {
            this.f4546i.mo1114a(false);
            if (this.f4546i.mo5062i()) {
                this.f4546i.mo5059f();
                this.f4546i.mo5058e();
            }
        }
    }

    public void setPopupTheme(int i) {
        if (this.f4545h != i) {
            this.f4545h = i;
            if (i == 0) {
                this.f4544g = getContext();
                return;
            }
            this.f4544g = new ContextThemeWrapper(getContext(), i);
        }
    }

    /* renamed from: b */
    private boolean m5527b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C1212a)) {
            z = false | ((C1212a) childAt).mo4652d();
        }
        if (i > 0 && (childAt2 instanceof C1212a)) {
            z |= ((C1212a) childAt2).mo4651c();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return m5528h();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.f4743h <= 0) {
            layoutParams2.f4743h = 16;
        }
        return layoutParams2;
    }

    /* renamed from: a */
    public final boolean mo4674a(MenuItemImpl menuItemImpl) {
        return this.f4540a.mo4708a((MenuItem) menuItemImpl, 0);
    }

    /* renamed from: a */
    public final void mo5075a(C1189a aVar, C1166a aVar2) {
        this.f4547j = aVar;
        this.f4542c = aVar2;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4550m = (int) (56.0f * f);
        this.f4551n = (int) (f * 4.0f);
        this.f4544g = context;
        this.f4545h = 0;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = this.f4548k;
        if (MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f4548k = z;
        if (z2 != this.f4548k) {
            this.f4549l = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f4548k || this.f4540a == null || size == this.f4549l)) {
            this.f4549l = size;
            this.f4540a.mo1173a(true);
        }
        int childCount = getChildCount();
        if (!this.f4548k || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m5525a(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x024b A[LOOP:5: B:136:0x024b->B:141:0x026e, LOOP_START, PHI: r3 r32 
      PHI: (r3v5 int) = (r3v4 int), (r3v6 int) binds: [B:135:0x0249, B:141:0x026e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r32v1 int) = (r32v0 int), (r32v2 int) binds: [B:135:0x0249, B:141:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5525a(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            int r1 = android.view.View.MeasureSpec.getMode(r36)
            int r2 = android.view.View.MeasureSpec.getSize(r35)
            int r3 = android.view.View.MeasureSpec.getSize(r36)
            int r4 = r34.getPaddingLeft()
            int r5 = r34.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r34.getPaddingTop()
            int r6 = r34.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r36
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f4550m
            int r4 = r2 / r4
            int r7 = r0.f4550m
            int r7 = r2 % r7
            r8 = 0
            if (r4 != 0) goto L_0x0037
            r0.setMeasuredDimension(r2, r8)
            return
        L_0x0037:
            int r9 = r0.f4550m
            int r7 = r7 / r4
            int r9 = r9 + r7
            int r7 = r34.getChildCount()
            r14 = r4
            r4 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r19 = 0
        L_0x0049:
            if (r4 >= r7) goto L_0x00d5
            android.view.View r11 = r0.getChildAt(r4)
            int r8 = r11.getVisibility()
            r21 = r3
            r3 = 8
            if (r8 == r3) goto L_0x00ca
            boolean r3 = r11 instanceof android.support.p029v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x006c
            int r8 = r0.f4551n
            r22 = r13
            int r13 = r0.f4551n
            r23 = r2
            r2 = 0
            r11.setPadding(r8, r2, r13, r2)
            goto L_0x0071
        L_0x006c:
            r23 = r2
            r22 = r13
            r2 = 0
        L_0x0071:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r8 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r8
            r8.f4557f = r2
            r8.f4554c = r2
            r8.f4553b = r2
            r8.f4555d = r2
            r8.leftMargin = r2
            r8.rightMargin = r2
            if (r3 == 0) goto L_0x0090
            r2 = r11
            android.support.v7.view.menu.ActionMenuItemView r2 = (android.support.p029v7.view.menu.ActionMenuItemView) r2
            boolean r2 = r2.mo4650b()
            if (r2 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            r8.f4556e = r2
            boolean r2 = r8.f4552a
            if (r2 == 0) goto L_0x0099
            r2 = 1
            goto L_0x009a
        L_0x0099:
            r2 = r14
        L_0x009a:
            int r2 = m5524a(r11, r9, r2, r6, r5)
            int r3 = java.lang.Math.max(r15, r2)
            boolean r13 = r8.f4555d
            if (r13 == 0) goto L_0x00a8
            int r16 = r16 + 1
        L_0x00a8:
            boolean r8 = r8.f4552a
            if (r8 == 0) goto L_0x00ad
            r12 = 1
        L_0x00ad:
            int r14 = r14 - r2
            int r8 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r8)
            r8 = 1
            if (r2 != r8) goto L_0x00c3
            int r2 = r8 << r4
            r24 = r3
            long r2 = (long) r2
            long r2 = r19 | r2
            r19 = r2
            goto L_0x00c5
        L_0x00c3:
            r24 = r3
        L_0x00c5:
            r13 = r22
            r15 = r24
            goto L_0x00cc
        L_0x00ca:
            r23 = r2
        L_0x00cc:
            int r4 = r4 + 1
            r3 = r21
            r2 = r23
            r8 = 0
            goto L_0x0049
        L_0x00d5:
            r23 = r2
            r21 = r3
            r2 = 2
            if (r12 == 0) goto L_0x00e0
            if (r13 != r2) goto L_0x00e0
            r3 = 1
            goto L_0x00e1
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            r24 = 1
            if (r16 <= 0) goto L_0x0180
            if (r14 <= 0) goto L_0x0180
            r5 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r8 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r26 = 0
        L_0x00f2:
            if (r5 >= r7) goto L_0x0121
            android.view.View r22 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r22 = r22.getLayoutParams()
            r2 = r22
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r2
            r28 = r4
            boolean r4 = r2.f4555d
            if (r4 == 0) goto L_0x011b
            int r4 = r2.f4553b
            if (r4 >= r11) goto L_0x0111
            int r2 = r2.f4553b
            long r26 = r24 << r5
            r11 = r2
            r8 = 1
            goto L_0x011b
        L_0x0111:
            int r2 = r2.f4553b
            if (r2 != r11) goto L_0x011b
            long r29 = r24 << r5
            long r26 = r26 | r29
            int r8 = r8 + 1
        L_0x011b:
            int r5 = r5 + 1
            r4 = r28
            r2 = 2
            goto L_0x00f2
        L_0x0121:
            r28 = r4
            long r19 = r19 | r26
            if (r8 > r14) goto L_0x0179
            int r11 = r11 + 1
            r2 = 0
        L_0x012a:
            if (r2 >= r7) goto L_0x0175
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r5 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r5
            r31 = r10
            r8 = 1
            int r10 = r8 << r2
            r32 = r6
            r33 = r7
            long r6 = (long) r10
            long r24 = r26 & r6
            r17 = 0
            int r8 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x014f
            int r4 = r5.f4553b
            if (r4 != r11) goto L_0x016c
            long r19 = r19 | r6
            goto L_0x016c
        L_0x014f:
            if (r3 == 0) goto L_0x0162
            boolean r6 = r5.f4556e
            if (r6 == 0) goto L_0x0162
            r6 = 1
            if (r14 != r6) goto L_0x0163
            int r7 = r0.f4551n
            int r7 = r7 + r9
            int r8 = r0.f4551n
            r10 = 0
            r4.setPadding(r7, r10, r8, r10)
            goto L_0x0163
        L_0x0162:
            r6 = 1
        L_0x0163:
            int r4 = r5.f4553b
            int r4 = r4 + r6
            r5.f4553b = r4
            r5.f4557f = r6
            int r14 = r14 + -1
        L_0x016c:
            int r2 = r2 + 1
            r10 = r31
            r6 = r32
            r7 = r33
            goto L_0x012a
        L_0x0175:
            r2 = 2
            r4 = 1
            goto L_0x00e2
        L_0x0179:
            r32 = r6
            r33 = r7
            r31 = r10
            goto L_0x0183
        L_0x0180:
            r28 = r4
            goto L_0x0179
        L_0x0183:
            if (r12 != 0) goto L_0x018a
            r2 = 1
            if (r13 != r2) goto L_0x018b
            r3 = 1
            goto L_0x018c
        L_0x018a:
            r2 = 1
        L_0x018b:
            r3 = 0
        L_0x018c:
            if (r14 <= 0) goto L_0x0244
            r4 = 0
            int r6 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0244
            int r13 = r13 - r2
            if (r14 < r13) goto L_0x019b
            if (r3 != 0) goto L_0x019b
            if (r15 <= r2) goto L_0x0244
        L_0x019b:
            int r2 = java.lang.Long.bitCount(r19)
            float r2 = (float) r2
            if (r3 != 0) goto L_0x01dc
            long r3 = r19 & r24
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01bd
            r3 = 0
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r4 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r4
            boolean r4 = r4.f4556e
            if (r4 != 0) goto L_0x01be
            float r2 = r2 - r5
            goto L_0x01be
        L_0x01bd:
            r3 = 0
        L_0x01be:
            int r7 = r33 + -1
            r4 = 1
            int r6 = r4 << r7
            long r10 = (long) r6
            long r10 = r19 & r10
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x01dd
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r4 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r4
            boolean r4 = r4.f4556e
            if (r4 != 0) goto L_0x01dd
            float r2 = r2 - r5
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01e8
            int r14 = r14 * r9
            float r4 = (float) r14
            float r4 = r4 / r2
            int r8 = (int) r4
            goto L_0x01e9
        L_0x01e8:
            r8 = 0
        L_0x01e9:
            r11 = r28
            r2 = r33
            r4 = 0
        L_0x01ee:
            if (r4 >= r2) goto L_0x0241
            r5 = 1
            int r6 = r5 << r4
            long r6 = (long) r6
            long r6 = r19 & r6
            r12 = 0
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x023d
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r7 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r7
            boolean r6 = r6 instanceof android.support.p029v7.view.menu.ActionMenuItemView
            if (r6 == 0) goto L_0x021e
            r7.f4554c = r8
            r7.f4557f = r5
            if (r4 != 0) goto L_0x021a
            boolean r5 = r7.f4556e
            if (r5 != 0) goto L_0x021a
            int r5 = -r8
            r6 = 2
            int r5 = r5 / r6
            r7.leftMargin = r5
            goto L_0x021b
        L_0x021a:
            r6 = 2
        L_0x021b:
            r5 = 1
        L_0x021c:
            r11 = 1
            goto L_0x023e
        L_0x021e:
            r6 = 2
            boolean r5 = r7.f4552a
            if (r5 == 0) goto L_0x022d
            r7.f4554c = r8
            r5 = 1
            r7.f4557f = r5
            int r10 = -r8
            int r10 = r10 / r6
            r7.rightMargin = r10
            goto L_0x021c
        L_0x022d:
            r5 = 1
            if (r4 == 0) goto L_0x0234
            int r10 = r8 / 2
            r7.leftMargin = r10
        L_0x0234:
            int r10 = r2 + -1
            if (r4 == r10) goto L_0x023e
            int r10 = r8 / 2
            r7.rightMargin = r10
            goto L_0x023e
        L_0x023d:
            r6 = 2
        L_0x023e:
            int r4 = r4 + 1
            goto L_0x01ee
        L_0x0241:
            r28 = r11
            goto L_0x0247
        L_0x0244:
            r2 = r33
            r3 = 0
        L_0x0247:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r28 == 0) goto L_0x0273
        L_0x024b:
            if (r3 >= r2) goto L_0x0273
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r6 = (android.support.p029v7.widget.ActionMenuView.LayoutParams) r6
            boolean r7 = r6.f4557f
            if (r7 == 0) goto L_0x026c
            int r7 = r6.f4553b
            int r7 = r7 * r9
            int r6 = r6.f4554c
            int r7 = r7 + r6
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r7 = r32
            r5.measure(r6, r7)
            goto L_0x026e
        L_0x026c:
            r7 = r32
        L_0x026e:
            int r3 = r3 + 1
            r32 = r7
            goto L_0x024b
        L_0x0273:
            if (r1 == r4) goto L_0x027a
            r2 = r23
            r1 = r31
            goto L_0x027e
        L_0x027a:
            r1 = r21
            r2 = r23
        L_0x027e:
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.ActionMenuView.m5525a(int, int):void");
    }

    /* renamed from: a */
    static int m5524a(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo4650b()) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f4552a || !z) {
            z2 = false;
        }
        layoutParams.f4555d = z2;
        layoutParams.f4553b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f4548k) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C1385bc.m6839a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4552a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m5527b(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    m5527b(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f4552a) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f4552a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
            i6++;
        }
    }
}
