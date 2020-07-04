package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.LinearLayoutCompat */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private int f4727a;

    /* renamed from: b */
    private int f4728b;

    /* renamed from: c */
    private int f4729c;

    /* renamed from: d */
    private int f4730d;

    /* renamed from: e */
    public boolean f4731e;

    /* renamed from: f */
    public boolean f4732f;

    /* renamed from: g */
    private int f4733g;

    /* renamed from: h */
    private float f4734h;

    /* renamed from: i */
    private int[] f4735i;

    /* renamed from: j */
    private int[] f4736j;

    /* renamed from: k */
    private Drawable f4737k;

    /* renamed from: l */
    private int f4738l;

    /* renamed from: m */
    private int f4739m;

    /* renamed from: n */
    private int f4740n;

    /* renamed from: o */
    private int f4741o;

    /* renamed from: android.support.v7.widget.LinearLayoutCompat$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: g */
        public float f4742g;

        /* renamed from: h */
        public int f4743h = -1;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearLayoutCompat_Layout);
            this.f4742g = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f4743h = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4727a;
    }

    public Drawable getDividerDrawable() {
        return this.f4737k;
    }

    public int getDividerPadding() {
        return this.f4741o;
    }

    public int getDividerWidth() {
        return this.f4738l;
    }

    public int getGravity() {
        return this.f4730d;
    }

    public int getOrientation() {
        return this.f4729c;
    }

    public int getShowDividers() {
        return this.f4740n;
    }

    public float getWeightSum() {
        return this.f4734h;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f4729c == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.f4729c == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        if (this.f4727a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.f4727a) {
            View childAt = getChildAt(this.f4727a);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i = this.f4728b;
                if (this.f4729c == 1) {
                    int i2 = this.f4730d & 112;
                    if (i2 != 48) {
                        if (i2 == 16) {
                            i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4733g) / 2;
                        } else if (i2 == 80) {
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4733g;
                        }
                    }
                }
                return i + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f4727a == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setBaselineAligned(boolean z) {
        this.f4731e = z;
    }

    public void setDividerPadding(int i) {
        this.f4741o = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4732f = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View mo5923b(int i) {
        return getChildAt(i);
    }

    public void setWeightSum(float f) {
        this.f4734h = Math.max(0.0f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void setOrientation(int i) {
        if (this.f4729c != i) {
            this.f4729c = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4740n) {
            requestLayout();
        }
        this.f4740n = i;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f4737k != null) {
            if (this.f4729c == 1) {
                m5667a(canvas);
            } else {
                m5674b(canvas);
            }
        }
    }

    public void setGravity(int i) {
        if (this.f4730d != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4730d = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f4730d) != i2) {
            this.f4730d = i2 | (this.f4730d & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f4730d & 112) != i2) {
            this.f4730d = i2 | (this.f4730d & -113);
            requestLayout();
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4727a = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f4737k) {
            this.f4737k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f4738l = drawable.getIntrinsicWidth();
                this.f4739m = drawable.getIntrinsicHeight();
            } else {
                this.f4738l = 0;
                this.f4739m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m5667a(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View b = mo5923b(i2);
            if (!(b == null || b.getVisibility() == 8 || !mo5391a(i2))) {
                m5668a(canvas, (b.getTop() - ((LayoutParams) b.getLayoutParams()).topMargin) - this.f4739m);
            }
        }
        if (mo5391a(virtualChildCount)) {
            View b2 = mo5923b(virtualChildCount - 1);
            if (b2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f4739m;
            } else {
                i = b2.getBottom() + ((LayoutParams) b2.getLayoutParams()).bottomMargin;
            }
            m5668a(canvas, i);
        }
    }

    /* renamed from: b */
    private void m5674b(Canvas canvas) {
        int i;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C1385bc.m6839a(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View b = mo5923b(i3);
            if (!(b == null || b.getVisibility() == 8 || !mo5391a(i3))) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (a) {
                    i2 = b.getRight() + layoutParams.rightMargin;
                } else {
                    i2 = (b.getLeft() - layoutParams.leftMargin) - this.f4738l;
                }
                m5675b(canvas, i2);
            }
        }
        if (mo5391a(virtualChildCount)) {
            View b2 = mo5923b(virtualChildCount - 1);
            if (b2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) b2.getLayoutParams();
                if (a) {
                    i = (b2.getLeft() - layoutParams2.leftMargin) - this.f4738l;
                } else {
                    i = b2.getRight() + layoutParams2.rightMargin;
                }
            } else if (a) {
                i = getPaddingLeft();
            } else {
                i = (getWidth() - getPaddingRight()) - this.f4738l;
            }
            m5675b(canvas, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5391a(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f4740n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f4740n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f4740n & 2) == 0) {
            return false;
        } else {
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                } else if (getChildAt(i2).getVisibility() != 8) {
                    z = true;
                    break;
                } else {
                    i2--;
                }
            }
            return z;
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4729c == 1) {
            m5665a(i, i2);
        } else {
            m5676c(i, i2);
        }
    }

    /* renamed from: a */
    private void m5668a(Canvas canvas, int i) {
        this.f4737k.setBounds(getPaddingLeft() + this.f4741o, i, (getWidth() - getPaddingRight()) - this.f4741o, this.f4739m + i);
        this.f4737k.draw(canvas);
    }

    /* renamed from: b */
    private void m5672b(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo5923b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m5677d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo5923b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* renamed from: b */
    private void m5675b(Canvas canvas, int i) {
        this.f4737k.setBounds(i, getPaddingTop() + this.f4741o, this.f4738l + i, (getHeight() - getPaddingBottom()) - this.f4741o);
        this.f4737k.draw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b9, code lost:
        if (r14 > 0) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c3, code lost:
        if (r14 < 0) goto L_0x02bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5665a(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f4733g = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int r14 = r7.f4727a
            boolean r15 = r7.f4732f
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
        L_0x002b:
            if (r6 >= r11) goto L_0x0190
            android.view.View r23 = r7.mo5923b(r6)
            if (r23 != 0) goto L_0x0041
            int r4 = r7.f4733g
            int r4 = r4 + r10
            r7.f4733g = r4
            r22 = r0
            r0 = r6
            r30 = r11
            r29 = r13
            goto L_0x0181
        L_0x0041:
            int r10 = r23.getVisibility()
            r4 = 8
            if (r10 == r4) goto L_0x0169
            boolean r4 = r7.mo5391a(r6)
            if (r4 == 0) goto L_0x0056
            int r4 = r7.f4733g
            int r10 = r7.f4739m
            int r4 = r4 + r10
            r7.f4733g = r4
        L_0x0056:
            android.view.ViewGroup$LayoutParams r4 = r23.getLayoutParams()
            r10 = r4
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r4 = r10.f4742g
            float r22 = r0 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 != r4) goto L_0x0091
            int r0 = r10.height
            if (r0 != 0) goto L_0x0091
            float r0 = r10.f4742g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            int r0 = r7.f4733g
            int r4 = r10.topMargin
            int r4 = r4 + r0
            r25 = r1
            int r1 = r10.bottomMargin
            int r4 = r4 + r1
            int r0 = java.lang.Math.max(r0, r4)
            r7.f4733g = r0
            r28 = r2
            r31 = r5
            r32 = r6
            r30 = r11
            r29 = r13
            r9 = r21
            r27 = r25
            r18 = 1
            goto L_0x00f6
        L_0x0091:
            r25 = r1
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a2
            float r0 = r10.f4742g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            r0 = -2
            r10.height = r0
            r4 = 0
            goto L_0x00a4
        L_0x00a2:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a4:
            r24 = 0
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            int r0 = r7.f4733g
            r26 = r0
            goto L_0x00b1
        L_0x00af:
            r26 = 0
        L_0x00b1:
            r0 = r38
            r27 = r25
            r1 = r23
            r28 = r2
            r2 = r6
            r8 = r3
            r3 = r39
            r30 = r11
            r29 = r13
            r9 = r21
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r4
            r4 = r24
            r31 = r5
            r5 = r40
            r32 = r6
            r6 = r26
            r0.m5670a(r1, r2, r3, r4, r5, r6)
            if (r13 == r11) goto L_0x00d7
            r10.height = r13
        L_0x00d7:
            int r0 = r23.getMeasuredHeight()
            int r1 = r7.f4733g
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4733g = r1
            if (r15 == 0) goto L_0x00f5
            int r0 = java.lang.Math.max(r0, r8)
            r3 = r0
            goto L_0x00f6
        L_0x00f5:
            r3 = r8
        L_0x00f6:
            if (r14 < 0) goto L_0x0103
            r1 = r32
            int r6 = r1 + 1
            if (r14 != r6) goto L_0x0105
            int r0 = r7.f4733g
            r7.f4728b = r0
            goto L_0x0105
        L_0x0103:
            r1 = r32
        L_0x0105:
            if (r1 >= r14) goto L_0x0116
            float r0 = r10.f4742g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x010e
            goto L_0x0116
        L_0x010e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0116:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0123
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x0124
            r0 = 1
            r20 = 1
            goto L_0x0125
        L_0x0123:
            r2 = -1
        L_0x0124:
            r0 = 0
        L_0x0125:
            int r4 = r10.leftMargin
            int r5 = r10.rightMargin
            int r4 = r4 + r5
            int r5 = r23.getMeasuredWidth()
            int r5 = r5 + r4
            r6 = r28
            int r6 = java.lang.Math.max(r6, r5)
            int r8 = r23.getMeasuredState()
            r13 = r27
            int r8 = android.view.View.combineMeasuredStates(r13, r8)
            if (r19 == 0) goto L_0x0148
            int r11 = r10.width
            if (r11 != r2) goto L_0x0148
            r19 = 1
            goto L_0x014a
        L_0x0148:
            r19 = 0
        L_0x014a:
            float r2 = r10.f4742g
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x015b
            if (r0 == 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r4 = r5
        L_0x0154:
            int r21 = java.lang.Math.max(r9, r4)
            r9 = r21
            goto L_0x0179
        L_0x015b:
            if (r0 == 0) goto L_0x0160
        L_0x015d:
            r10 = r31
            goto L_0x0162
        L_0x0160:
            r4 = r5
            goto L_0x015d
        L_0x0162:
            int r5 = java.lang.Math.max(r10, r4)
            r31 = r5
            goto L_0x0179
        L_0x0169:
            r8 = r3
            r10 = r5
            r30 = r11
            r29 = r13
            r9 = r21
            r13 = r1
            r1 = r6
            r6 = r2
            r22 = r0
            r31 = r10
            r8 = r13
        L_0x0179:
            int r0 = r1 + 0
            r2 = r6
            r1 = r8
            r21 = r9
            r5 = r31
        L_0x0181:
            int r6 = r0 + 1
            r0 = r22
            r13 = r29
            r11 = r30
            r8 = r39
            r9 = r40
            r10 = 0
            goto L_0x002b
        L_0x0190:
            r6 = r2
            r8 = r3
            r10 = r5
            r30 = r11
            r29 = r13
            r9 = r21
            r2 = -1
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r1
            int r1 = r7.f4733g
            if (r1 <= 0) goto L_0x01b1
            r1 = r30
            boolean r3 = r7.mo5391a(r1)
            if (r3 == 0) goto L_0x01b3
            int r3 = r7.f4733g
            int r4 = r7.f4739m
            int r3 = r3 + r4
            r7.f4733g = r3
            goto L_0x01b3
        L_0x01b1:
            r1 = r30
        L_0x01b3:
            if (r15 == 0) goto L_0x01f5
            r3 = r29
            if (r3 == r11) goto L_0x01bb
            if (r3 != 0) goto L_0x01f7
        L_0x01bb:
            r4 = 0
            r7.f4733g = r4
            r5 = 0
        L_0x01bf:
            if (r5 >= r1) goto L_0x01f7
            android.view.View r11 = r7.mo5923b(r5)
            if (r11 != 0) goto L_0x01cd
            int r11 = r7.f4733g
            int r11 = r11 + r4
            r7.f4733g = r11
            goto L_0x01f0
        L_0x01cd:
            int r4 = r11.getVisibility()
            r14 = 8
            if (r4 != r14) goto L_0x01d8
            int r5 = r5 + 0
            goto L_0x01f0
        L_0x01d8:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r4
            int r11 = r7.f4733g
            int r14 = r11 + r8
            int r2 = r4.topMargin
            int r14 = r14 + r2
            int r2 = r4.bottomMargin
            int r14 = r14 + r2
            r2 = 0
            int r14 = r14 + r2
            int r2 = java.lang.Math.max(r11, r14)
            r7.f4733g = r2
        L_0x01f0:
            int r5 = r5 + 1
            r2 = -1
            r4 = 0
            goto L_0x01bf
        L_0x01f5:
            r3 = r29
        L_0x01f7:
            int r2 = r7.f4733g
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r4 = r4 + r5
            int r2 = r2 + r4
            r7.f4733g = r2
            int r2 = r7.f4733g
            int r4 = r38.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r2, r4)
            r5 = r9
            r4 = r40
            r9 = 0
            int r2 = android.view.View.resolveSizeAndState(r2, r4, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r2
            int r11 = r7.f4733g
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0266
            if (r9 == 0) goto L_0x0227
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0227
            goto L_0x0266
        L_0x0227:
            int r0 = java.lang.Math.max(r10, r5)
            if (r15 == 0) goto L_0x0262
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L_0x0262
            r3 = 0
        L_0x0232:
            if (r3 >= r1) goto L_0x0262
            android.view.View r5 = r7.mo5923b(r3)
            if (r5 == 0) goto L_0x025f
            int r9 = r5.getVisibility()
            r10 = 8
            if (r9 == r10) goto L_0x025f
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r9 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r9
            float r9 = r9.f4742g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x025f
            int r9 = r5.getMeasuredWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            r5.measure(r9, r11)
        L_0x025f:
            int r3 = r3 + 1
            goto L_0x0232
        L_0x0262:
            r9 = r39
            goto L_0x0352
        L_0x0266:
            float r5 = r7.f4734h
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x026e
            float r0 = r7.f4734h
        L_0x026e:
            r5 = 0
            r7.f4733g = r5
            r5 = r0
            r0 = 0
        L_0x0273:
            if (r0 >= r1) goto L_0x0341
            android.view.View r8 = r7.mo5923b(r0)
            int r11 = r8.getVisibility()
            r14 = 8
            if (r11 == r14) goto L_0x032f
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r11 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r11
            float r15 = r11.f4742g
            int r18 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02de
            float r14 = (float) r9
            float r14 = r14 * r15
            float r14 = r14 / r5
            int r14 = (int) r14
            float r5 = r5 - r15
            int r9 = r9 - r14
            int r15 = r38.getPaddingLeft()
            int r18 = r38.getPaddingRight()
            int r15 = r15 + r18
            r33 = r5
            int r5 = r11.leftMargin
            int r15 = r15 + r5
            int r5 = r11.rightMargin
            int r15 = r15 + r5
            int r5 = r11.width
            r34 = r9
            r9 = r39
            int r5 = getChildMeasureSpec(r9, r15, r5)
            int r15 = r11.height
            if (r15 != 0) goto L_0x02be
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x02b9
            goto L_0x02be
        L_0x02b9:
            if (r14 <= 0) goto L_0x02bc
            goto L_0x02c6
        L_0x02bc:
            r14 = 0
            goto L_0x02c6
        L_0x02be:
            int r15 = r8.getMeasuredHeight()
            int r14 = r14 + r15
            if (r14 >= 0) goto L_0x02c6
            goto L_0x02bc
        L_0x02c6:
            r15 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r15)
            r8.measure(r5, r14)
            int r5 = r8.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r13 = android.view.View.combineMeasuredStates(r13, r5)
            r5 = r33
            r14 = r34
            goto L_0x02e1
        L_0x02de:
            r14 = r9
            r9 = r39
        L_0x02e1:
            int r15 = r11.leftMargin
            r35 = r3
            int r3 = r11.rightMargin
            int r15 = r15 + r3
            int r3 = r8.getMeasuredWidth()
            int r3 = r3 + r15
            int r6 = java.lang.Math.max(r6, r3)
            r36 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0300
            int r3 = r11.width
            r37 = r5
            r5 = -1
            if (r3 != r5) goto L_0x0303
            r3 = 1
            goto L_0x0304
        L_0x0300:
            r37 = r5
            r5 = -1
        L_0x0303:
            r3 = 0
        L_0x0304:
            if (r3 == 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r15 = r36
        L_0x0309:
            int r3 = java.lang.Math.max(r10, r15)
            if (r19 == 0) goto L_0x0315
            int r10 = r11.width
            if (r10 != r5) goto L_0x0315
            r10 = 1
            goto L_0x0316
        L_0x0315:
            r10 = 0
        L_0x0316:
            int r15 = r7.f4733g
            int r8 = r8.getMeasuredHeight()
            int r8 = r8 + r15
            int r5 = r11.topMargin
            int r8 = r8 + r5
            int r5 = r11.bottomMargin
            int r8 = r8 + r5
            r5 = 0
            int r8 = r8 + r5
            int r8 = java.lang.Math.max(r15, r8)
            r7.f4733g = r8
            r19 = r10
            r10 = r3
            goto L_0x0338
        L_0x032f:
            r35 = r3
            r3 = r5
            r14 = r9
            r5 = 0
            r9 = r39
            r37 = r3
        L_0x0338:
            int r0 = r0 + 1
            r9 = r14
            r3 = r35
            r5 = r37
            goto L_0x0273
        L_0x0341:
            r9 = r39
            int r0 = r7.f4733g
            int r3 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.f4733g = r0
            r0 = r10
        L_0x0352:
            if (r19 != 0) goto L_0x0359
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0359
            goto L_0x035a
        L_0x0359:
            r0 = r6
        L_0x035a:
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r9, r13)
            r7.setMeasuredDimension(r0, r2)
            if (r20 == 0) goto L_0x0378
            r7.m5672b(r1, r4)
        L_0x0378:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.LinearLayoutCompat.m5665a(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a8, code lost:
        if (r5 < 0) goto L_0x03a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cf  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5676c(int r42, int r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = 0
            r7.f4733g = r10
            int r11 = r41.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getMode(r43)
            int[] r0 = r7.f4735i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f4736j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f4735i = r0
            int[] r0 = new int[r14]
            r7.f4736j = r0
        L_0x0026:
            int[] r15 = r7.f4735i
            int[] r6 = r7.f4736j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f4731e
            boolean r3 = r7.f4732f
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0204
            android.view.View r6 = r7.mo5923b(r1)
            if (r6 != 0) goto L_0x007d
            int r5 = r7.f4733g
            int r5 = r5 + r10
            r7.f4733g = r5
            r31 = r0
            r0 = r1
            r32 = r3
            r36 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f1
        L_0x007d:
            int r10 = r6.getVisibility()
            if (r10 == r5) goto L_0x01db
            boolean r5 = r7.mo5391a(r1)
            if (r5 == 0) goto L_0x0090
            int r5 = r7.f4733g
            int r10 = r7.f4738l
            int r5 = r5 + r10
            r7.f4733g = r5
        L_0x0090:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r5 = r10.f4742g
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00e8
            int r0 = r10.width
            if (r0 != 0) goto L_0x00e8
            float r0 = r10.f4742g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e8
            if (r19 == 0) goto L_0x00b4
            int r0 = r7.f4733g
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f4733g = r0
            goto L_0x00c2
        L_0x00b4:
            int r0 = r7.f4733g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f4733g = r0
        L_0x00c2:
            if (r4 == 0) goto L_0x00d8
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r29 = r6
            r30 = -2
            goto L_0x015b
        L_0x00d8:
            r34 = r1
            r32 = r3
            r36 = r4
            r29 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = 1
            r30 = -2
            goto L_0x015d
        L_0x00e8:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f7
            float r0 = r10.f4742g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f7
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fa
        L_0x00f7:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fa:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0103
            int r0 = r7.f4733g
            r29 = r0
            goto L_0x0105
        L_0x0103:
            r29 = 0
        L_0x0105:
            r33 = 0
            r0 = r41
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r42
            r36 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r43
            r29 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            r6 = r33
            r0.m5670a(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012e
            r10.width = r0
        L_0x012e:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0142
            int r1 = r7.f4733g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f4733g = r1
            goto L_0x0154
        L_0x0142:
            r3 = 0
            int r1 = r7.f4733g
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4733g = r1
        L_0x0154:
            if (r32 == 0) goto L_0x015b
            int r0 = java.lang.Math.max(r0, r14)
            r14 = r0
        L_0x015b:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x015d:
            if (r13 == r1) goto L_0x0168
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0168
            r0 = 1
            r27 = 1
            goto L_0x0169
        L_0x0168:
            r0 = 0
        L_0x0169:
            int r2 = r10.topMargin
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            int r3 = r29.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r29.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r4)
            if (r36 == 0) goto L_0x01a9
            int r4 = r29.getBaseline()
            r5 = -1
            if (r4 == r5) goto L_0x01a9
            int r5 = r10.f4743h
            if (r5 >= 0) goto L_0x018d
            int r5 = r7.f4730d
            goto L_0x018f
        L_0x018d:
            int r5 = r10.f4743h
        L_0x018f:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 4
            int r5 = r5 >> r6
            r5 = r5 & -2
            int r5 = r5 >> 1
            r6 = r15[r5]
            int r6 = java.lang.Math.max(r6, r4)
            r15[r5] = r6
            r6 = r28[r5]
            int r4 = r3 - r4
            int r4 = java.lang.Math.max(r6, r4)
            r28[r5] = r4
        L_0x01a9:
            r4 = r21
            int r21 = java.lang.Math.max(r4, r3)
            if (r26 == 0) goto L_0x01b9
            int r4 = r10.height
            r5 = -1
            if (r4 != r5) goto L_0x01b9
            r26 = 1
            goto L_0x01bb
        L_0x01b9:
            r26 = 0
        L_0x01bb:
            float r4 = r10.f4742g
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cf
            if (r0 == 0) goto L_0x01c6
        L_0x01c3:
            r10 = r24
            goto L_0x01c8
        L_0x01c6:
            r2 = r3
            goto L_0x01c3
        L_0x01c8:
            int r24 = java.lang.Math.max(r10, r2)
            r10 = r24
            goto L_0x01ed
        L_0x01cf:
            r10 = r24
            if (r0 == 0) goto L_0x01d4
            r3 = r2
        L_0x01d4:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r3)
            goto L_0x01ed
        L_0x01db:
            r34 = r1
            r32 = r3
            r36 = r4
            r4 = r21
            r2 = r23
            r10 = r24
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r31 = r0
        L_0x01ed:
            int r0 = r34 + 0
            r24 = r10
        L_0x01f1:
            int r0 = r0 + 1
            r1 = r0
            r6 = r28
            r0 = r31
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r9 = r43
            r10 = 0
            goto L_0x0061
        L_0x0204:
            r32 = r3
            r36 = r4
            r4 = r21
            r2 = r23
            r10 = r24
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f4733g
            if (r3 <= 0) goto L_0x0227
            boolean r3 = r7.mo5391a(r11)
            if (r3 == 0) goto L_0x0227
            int r3 = r7.f4733g
            int r1 = r7.f4738l
            int r3 = r3 + r1
            r7.f4733g = r3
        L_0x0227:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x023d
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L_0x023d
            r1 = r15[r17]
            if (r1 != r3) goto L_0x023d
            r1 = r15[r16]
            if (r1 == r3) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r37 = r6
            goto L_0x0270
        L_0x023d:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r37 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r21 = java.lang.Math.max(r4, r1)
            r4 = r21
        L_0x0270:
            if (r32 == 0) goto L_0x02c2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r1) goto L_0x0278
            if (r12 != 0) goto L_0x02c2
        L_0x0278:
            r1 = 0
            r7.f4733g = r1
            r3 = 0
        L_0x027c:
            if (r3 >= r11) goto L_0x02c2
            android.view.View r5 = r7.mo5923b(r3)
            if (r5 != 0) goto L_0x028a
            int r5 = r7.f4733g
            int r5 = r5 + r1
            r7.f4733g = r5
            goto L_0x02be
        L_0x028a:
            int r1 = r5.getVisibility()
            r6 = 8
            if (r1 != r6) goto L_0x0295
            int r3 = r3 + 0
            goto L_0x02be
        L_0x0295:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r1 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r1
            if (r19 == 0) goto L_0x02ab
            int r5 = r7.f4733g
            int r6 = r1.leftMargin
            int r6 = r6 + r14
            int r1 = r1.rightMargin
            int r6 = r6 + r1
            r9 = 0
            int r6 = r6 + r9
            int r5 = r5 + r6
            r7.f4733g = r5
            goto L_0x02be
        L_0x02ab:
            r9 = 0
            int r5 = r7.f4733g
            int r6 = r5 + r14
            int r9 = r1.leftMargin
            int r6 = r6 + r9
            int r1 = r1.rightMargin
            int r6 = r6 + r1
            r1 = 0
            int r6 = r6 + r1
            int r1 = java.lang.Math.max(r5, r6)
            r7.f4733g = r1
        L_0x02be:
            int r3 = r3 + 1
            r1 = 0
            goto L_0x027c
        L_0x02c2:
            int r1 = r7.f4733g
            int r3 = r41.getPaddingLeft()
            int r5 = r41.getPaddingRight()
            int r3 = r3 + r5
            int r1 = r1 + r3
            r7.f4733g = r1
            int r1 = r7.f4733g
            int r3 = r41.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r5 = r7.f4733g
            int r3 = r3 - r5
            if (r22 != 0) goto L_0x0330
            if (r3 == 0) goto L_0x02ef
            int r6 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x02ef
            goto L_0x0330
        L_0x02ef:
            int r0 = java.lang.Math.max(r2, r10)
            if (r32 == 0) goto L_0x032a
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x032a
            r2 = 0
        L_0x02fa:
            if (r2 >= r11) goto L_0x032a
            android.view.View r3 = r7.mo5923b(r2)
            if (r3 == 0) goto L_0x0327
            int r6 = r3.getVisibility()
            r9 = 8
            if (r6 == r9) goto L_0x0327
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r6 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r6
            float r6 = r6.f4742g
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0327
            r6 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r6)
            int r10 = r3.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r3.measure(r9, r10)
        L_0x0327:
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x032a:
            r40 = r11
            r3 = r43
            goto L_0x04c2
        L_0x0330:
            float r4 = r7.f4734h
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0338
            float r0 = r7.f4734h
        L_0x0338:
            r4 = -1
            r15[r16] = r4
            r15[r17] = r4
            r15[r18] = r4
            r6 = 0
            r15[r6] = r4
            r28[r16] = r4
            r28[r17] = r4
            r28[r18] = r4
            r28[r6] = r4
            r7.f4733g = r6
            r10 = r2
            r9 = r37
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0352:
            if (r0 >= r11) goto L_0x0469
            android.view.View r14 = r7.mo5923b(r0)
            if (r14 == 0) goto L_0x0455
            int r4 = r14.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x0455
            android.view.ViewGroup$LayoutParams r4 = r14.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r4
            float r5 = r4.f4742g
            int r21 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x03c2
            float r8 = (float) r3
            float r8 = r8 * r5
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r5
            int r3 = r3 - r8
            int r5 = r41.getPaddingTop()
            int r21 = r41.getPaddingBottom()
            int r5 = r5 + r21
            r38 = r2
            int r2 = r4.topMargin
            int r5 = r5 + r2
            int r2 = r4.bottomMargin
            int r5 = r5 + r2
            int r2 = r4.height
            r39 = r3
            r40 = r11
            r3 = r43
            r11 = -1
            int r2 = getChildMeasureSpec(r3, r5, r2)
            int r5 = r4.width
            if (r5 != 0) goto L_0x03a3
            r5 = 1073741824(0x40000000, float:2.0)
            if (r12 == r5) goto L_0x039d
            goto L_0x03a3
        L_0x039d:
            if (r8 <= 0) goto L_0x03a1
            r5 = r8
            goto L_0x03ab
        L_0x03a1:
            r5 = 0
            goto L_0x03ab
        L_0x03a3:
            int r5 = r14.getMeasuredWidth()
            int r5 = r5 + r8
            if (r5 >= 0) goto L_0x03ab
            goto L_0x03a1
        L_0x03ab:
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r14.measure(r5, r2)
            int r2 = r14.getMeasuredState()
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r5
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r38
            goto L_0x03ca
        L_0x03c2:
            r5 = r3
            r40 = r11
            r3 = r43
            r11 = -1
            r39 = r5
        L_0x03ca:
            if (r19 == 0) goto L_0x03e0
            int r5 = r7.f4733g
            int r8 = r14.getMeasuredWidth()
            int r11 = r4.leftMargin
            int r8 = r8 + r11
            int r11 = r4.rightMargin
            int r8 = r8 + r11
            r11 = 0
            int r8 = r8 + r11
            int r5 = r5 + r8
            r7.f4733g = r5
        L_0x03dd:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x03f7
        L_0x03e0:
            r11 = 0
            int r5 = r7.f4733g
            int r8 = r14.getMeasuredWidth()
            int r8 = r8 + r5
            int r11 = r4.leftMargin
            int r8 = r8 + r11
            int r11 = r4.rightMargin
            int r8 = r8 + r11
            r11 = 0
            int r8 = r8 + r11
            int r5 = java.lang.Math.max(r5, r8)
            r7.f4733g = r5
            goto L_0x03dd
        L_0x03f7:
            if (r13 == r5) goto L_0x0400
            int r5 = r4.height
            r8 = -1
            if (r5 != r8) goto L_0x0400
            r5 = 1
            goto L_0x0401
        L_0x0400:
            r5 = 0
        L_0x0401:
            int r8 = r4.topMargin
            int r11 = r4.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r5 == 0) goto L_0x0412
            goto L_0x0413
        L_0x0412:
            r8 = r11
        L_0x0413:
            int r5 = java.lang.Math.max(r10, r8)
            if (r26 == 0) goto L_0x0420
            int r8 = r4.height
            r10 = -1
            if (r8 != r10) goto L_0x0421
            r8 = 1
            goto L_0x0422
        L_0x0420:
            r10 = -1
        L_0x0421:
            r8 = 0
        L_0x0422:
            if (r36 == 0) goto L_0x044f
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x044f
            int r10 = r4.f4743h
            if (r10 >= 0) goto L_0x0431
            int r4 = r7.f4730d
            goto L_0x0433
        L_0x0431:
            int r4 = r4.f4743h
        L_0x0433:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r4 = r4 >> 4
            r4 = r4 & -2
            int r4 = r4 >> 1
            r10 = r15[r4]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r4] = r10
            r10 = r28[r4]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r28[r4] = r10
            goto L_0x0451
        L_0x044f:
            r21 = 4
        L_0x0451:
            r10 = r5
            r26 = r8
            goto L_0x045e
        L_0x0455:
            r5 = r3
            r40 = r11
            r3 = r43
            r21 = 4
            r39 = r5
        L_0x045e:
            int r0 = r0 + 1
            r3 = r39
            r11 = r40
            r4 = -1
            r8 = r42
            goto L_0x0352
        L_0x0469:
            r40 = r11
            r3 = r43
            int r0 = r7.f4733g
            int r2 = r41.getPaddingLeft()
            int r4 = r41.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f4733g = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x0490
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x0490
            r0 = r15[r17]
            if (r0 != r2) goto L_0x0490
            r0 = r15[r16]
            if (r0 == r2) goto L_0x048e
            goto L_0x0490
        L_0x048e:
            r4 = r6
            goto L_0x04bf
        L_0x0490:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r28[r16]
            r2 = r28[r2]
            r5 = r28[r18]
            r8 = r28[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
            r4 = r0
        L_0x04bf:
            r37 = r9
            r0 = r10
        L_0x04c2:
            if (r26 != 0) goto L_0x04c9
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04c9
            goto L_0x04ca
        L_0x04c9:
            r0 = r4
        L_0x04ca:
            int r2 = r41.getPaddingTop()
            int r4 = r41.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r41.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r37 & r2
            r1 = r1 | r2
            int r2 = r37 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x04f3
            r1 = r40
            r0 = r42
            r7.m5677d(r1, r0)
        L_0x04f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.LinearLayoutCompat.m5676c(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4731e = true;
        this.f4727a = -1;
        this.f4730d = 8388659;
        C1365av a = C1365av.m6744a(context, attributeSet, R$styleable.LinearLayoutCompat, i, 0);
        int a2 = a.mo6390a(1, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo6390a(0, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo6394a(2, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f4734h = a.mo6389a(4, -1.0f);
        this.f4727a = a.mo6390a(3, -1);
        this.f4732f = a.mo6394a(7, false);
        setDividerDrawable(a.mo6392a(5));
        this.f4740n = a.mo6390a(8, 0);
        this.f4741o = a.mo6401e(6, 0);
        a.mo6393a();
    }

    /* renamed from: a */
    private void m5666a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f4730d & 112;
        int i9 = this.f4730d & 8388615;
        if (i8 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f4733g) / 2);
        } else if (i8 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f4733g;
        }
        int i10 = i5;
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View b = mo5923b(i11);
            if (b == null) {
                i10 += 0;
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                int i12 = layoutParams.f4743h;
                if (i12 < 0) {
                    i12 = i9;
                }
                int a = C0972e.m4109a(i12, C0991u.m4220h(this)) & 7;
                if (a == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (a != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                }
                if (mo5391a(i11)) {
                    i10 += this.f4739m;
                }
                int i13 = i10 + layoutParams.topMargin;
                m5669a(b, i6, i13 + 0, measuredWidth, measuredHeight);
                i10 = i13 + measuredHeight + layoutParams.bottomMargin + 0;
                i11 += 0;
            }
            i11++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ff  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5673b(int r24, int r25, int r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            boolean r3 = android.support.p029v7.widget.C1385bc.m6839a(r23)
            int r4 = r23.getPaddingTop()
            int r5 = r27 - r25
            int r6 = r23.getPaddingBottom()
            int r6 = r5 - r6
            int r5 = r5 - r4
            int r7 = r23.getPaddingBottom()
            int r5 = r5 - r7
            int r7 = r23.getVirtualChildCount()
            int r8 = r0.f4730d
            r9 = 8388615(0x800007, float:1.1754953E-38)
            r8 = r8 & r9
            int r9 = r0.f4730d
            r9 = r9 & 112(0x70, float:1.57E-43)
            boolean r10 = r0.f4731e
            int[] r11 = r0.f4735i
            int[] r12 = r0.f4736j
            int r13 = android.support.p022v4.view.C0991u.m4220h(r23)
            int r8 = android.support.p022v4.view.C0972e.m4109a(r8, r13)
            r13 = 2
            r14 = 1
            if (r8 == r14) goto L_0x004d
            r15 = 5
            if (r8 == r15) goto L_0x0040
            int r1 = r23.getPaddingLeft()
            goto L_0x0058
        L_0x0040:
            int r8 = r23.getPaddingLeft()
            int r8 = r8 + r26
            int r8 = r8 - r24
            int r1 = r0.f4733g
            int r1 = r8 - r1
            goto L_0x0058
        L_0x004d:
            int r8 = r23.getPaddingLeft()
            int r1 = r26 - r24
            int r2 = r0.f4733g
            int r1 = r1 - r2
            int r1 = r1 / r13
            int r1 = r1 + r8
        L_0x0058:
            if (r3 == 0) goto L_0x005e
            int r3 = r7 + -1
            r15 = -1
            goto L_0x0060
        L_0x005e:
            r3 = 0
            r15 = 1
        L_0x0060:
            r16 = r1
            r1 = 0
        L_0x0063:
            if (r1 >= r7) goto L_0x012e
            int r17 = r15 * r1
            int r8 = r3 + r17
            android.view.View r14 = r0.mo5923b(r8)
            if (r14 != 0) goto L_0x007e
            int r16 = r16 + 0
            r19 = r3
            r20 = r7
            r21 = r9
            r22 = r10
            r2 = 1
            r3 = 0
            r10 = -1
            goto L_0x0121
        L_0x007e:
            int r13 = r14.getVisibility()
            r2 = 8
            if (r13 == r2) goto L_0x0116
            int r2 = r14.getMeasuredWidth()
            int r13 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r17 = r14.getLayoutParams()
            r19 = r3
            r3 = r17
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r3 = (android.support.p029v7.widget.LinearLayoutCompat.LayoutParams) r3
            if (r10 == 0) goto L_0x00a8
            r20 = r7
            int r7 = r3.height
            r21 = r9
            r9 = -1
            if (r7 == r9) goto L_0x00ac
            int r7 = r14.getBaseline()
            goto L_0x00ad
        L_0x00a8:
            r20 = r7
            r21 = r9
        L_0x00ac:
            r7 = -1
        L_0x00ad:
            int r9 = r3.f4743h
            if (r9 >= 0) goto L_0x00b3
            r9 = r21
        L_0x00b3:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r9 == r10) goto L_0x00ed
            r10 = 48
            if (r9 == r10) goto L_0x00dc
            r10 = 80
            if (r9 == r10) goto L_0x00c6
            r7 = r4
            r10 = -1
            goto L_0x00f9
        L_0x00c6:
            int r9 = r6 - r13
            int r10 = r3.bottomMargin
            int r9 = r9 - r10
            r10 = -1
            if (r7 == r10) goto L_0x00eb
            int r17 = r14.getMeasuredHeight()
            int r17 = r17 - r7
            r7 = 2
            r18 = r12[r7]
            int r18 = r18 - r17
            int r7 = r9 - r18
            goto L_0x00f9
        L_0x00dc:
            r10 = -1
            int r9 = r3.topMargin
            int r9 = r9 + r4
            if (r7 == r10) goto L_0x00eb
            r17 = 1
            r18 = r11[r17]
            int r18 = r18 - r7
            int r7 = r9 + r18
            goto L_0x00f9
        L_0x00eb:
            r7 = r9
            goto L_0x00f9
        L_0x00ed:
            r10 = -1
            int r7 = r5 - r13
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r4
            int r9 = r3.topMargin
            int r7 = r7 + r9
            int r9 = r3.bottomMargin
            int r7 = r7 - r9
        L_0x00f9:
            boolean r8 = r0.mo5391a(r8)
            if (r8 == 0) goto L_0x0103
            int r8 = r0.f4738l
            int r16 = r16 + r8
        L_0x0103:
            int r8 = r3.leftMargin
            int r16 = r16 + r8
            int r8 = r16 + 0
            m5669a(r14, r8, r7, r2, r13)
            int r3 = r3.rightMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r16 = r16 + r2
            int r1 = r1 + 0
            goto L_0x0120
        L_0x0116:
            r19 = r3
            r20 = r7
            r21 = r9
            r22 = r10
            r3 = 0
            r10 = -1
        L_0x0120:
            r2 = 1
        L_0x0121:
            int r1 = r1 + r2
            r3 = r19
            r7 = r20
            r9 = r21
            r10 = r22
            r13 = 2
            r14 = 1
            goto L_0x0063
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.LinearLayoutCompat.m5673b(int, int, int, int):void");
    }

    /* renamed from: a */
    private static void m5669a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4729c == 1) {
            m5666a(i, i2, i3, i4);
        } else {
            m5673b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private void m5670a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
