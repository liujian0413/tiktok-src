package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;

public class WrapLineFlowLayout extends ViewGroup {

    /* renamed from: a */
    protected int f10519a;

    /* renamed from: b */
    protected int f10520b;

    /* renamed from: c */
    protected final boolean f10521c;

    /* renamed from: d */
    final ArrayList<LayoutParams> f10522d;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f10523a;

        /* renamed from: b */
        public int f10524b;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: a */
    private static LayoutParams m13013a() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m13013a();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public WrapLineFlowLayout(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m13015a(layoutParams);
    }

    /* renamed from: a */
    private static LayoutParams m13015a(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams.width, layoutParams.height);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int i7 = 0;
        if (mode == 0) {
            size = 0;
        }
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f10522d.clear();
        int i8 = paddingLeft2;
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (paddingLeft2 <= 0) {
                i4 = paddingLeft;
                childAt.measure(MeasureSpec.makeMeasureSpec(i7, 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
                layoutParams.f10523a = i10;
                layoutParams.f10524b = i9;
                i3 = paddingLeft2;
            } else {
                i4 = paddingLeft;
                if (layoutParams.width == -2) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingLeft2, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i5 = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    i5 = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i6 = MeasureSpec.makeMeasureSpec(0, 0);
                    i3 = paddingLeft2;
                } else {
                    i3 = paddingLeft2;
                    if (layoutParams.height == -1) {
                        i6 = MeasureSpec.makeMeasureSpec(0, 1073741824);
                    } else {
                        i6 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                    }
                }
                childAt.measure(i5, i6);
                if (childAt.getMeasuredWidth() > i8) {
                    if (i12 > 0) {
                        i9 += i12 + this.f10520b;
                    }
                    if (this.f10521c && i8 > 1 && !this.f10522d.isEmpty()) {
                        int i13 = i8 / 2;
                        Iterator it = this.f10522d.iterator();
                        while (it.hasNext()) {
                            LayoutParams layoutParams2 = (LayoutParams) it.next();
                            layoutParams2.f10523a += i13;
                        }
                    }
                    this.f10522d.clear();
                    i10 = i4;
                    i8 = i3;
                    i12 = 0;
                }
                layoutParams.f10523a = i10;
                layoutParams.f10524b = i9;
                if (this.f10521c) {
                    this.f10522d.add(layoutParams);
                }
                int measuredWidth = childAt.getMeasuredWidth() + this.f10519a;
                i10 += measuredWidth;
                i8 -= measuredWidth;
                if (childAt.getMeasuredHeight() > i12) {
                    i12 = childAt.getMeasuredHeight();
                }
            }
            i11++;
            paddingLeft = i4;
            paddingLeft2 = i3;
            i7 = 0;
        }
        if (this.f10521c && i8 > 1 && !this.f10522d.isEmpty()) {
            int i14 = i8 / 2;
            Iterator it2 = this.f10522d.iterator();
            while (it2.hasNext()) {
                LayoutParams layoutParams3 = (LayoutParams) it2.next();
                layoutParams3.f10523a += i14;
            }
        }
        if (i12 > 0) {
            i9 += i12;
        }
        if (mode2 == 0) {
            size2 = i9 + getPaddingBottom();
        } else if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i9 + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10522d = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WrapLineFlowLayout, i, 0);
        this.f10519a = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f10520b = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f10521c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (this.f10519a < 0) {
            this.f10519a = 0;
        }
        if (this.f10520b < 0) {
            this.f10520b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            childAt.layout(layoutParams.f10523a, layoutParams.f10524b, layoutParams.f10523a + childAt.getMeasuredWidth(), layoutParams.f10524b + childAt.getMeasuredHeight());
        }
    }
}
