package com.p280ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p022v4.p026d.C0720f;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    protected List<List<View>> f112764a;

    /* renamed from: b */
    protected List<Integer> f112765b;

    /* renamed from: c */
    protected List<Integer> f112766c;

    /* renamed from: d */
    private int f112767d;

    /* renamed from: e */
    private List<View> f112768e;

    /* renamed from: f */
    private int f112769f;

    /* renamed from: g */
    private int f112770g;

    /* renamed from: h */
    private int f112771h;

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-2, -2);
    }

    public int getVisibleViewCount() {
        int i = 0;
        for (List size : this.f112764a) {
            i += size.size();
        }
        return i;
    }

    public void setMaxLine(int i) {
        this.f112771h = i;
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            if (i5 >= childCount) {
                i3 = i9;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                if (i5 == childCount - 1) {
                    i7 = Math.max(i6, i7);
                    i8 += i9;
                }
                int i11 = i;
                int i12 = i2;
            } else {
                measureChild(childAt, i, i2);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i3 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    i7 = Math.max(i7, i6);
                    i4 = measuredWidth + this.f112770g;
                    i8 += i9;
                    i10++;
                    if (this.f112771h > 0 && i10 > this.f112771h) {
                        break;
                    }
                } else {
                    i4 = i6 + measuredWidth + this.f112770g;
                    i3 = Math.max(i9, i3);
                }
                int i13 = i3;
                int i14 = i4;
                if (i5 == childCount - 1) {
                    i7 = Math.max(i14, i7);
                    i8 += i13;
                }
                i9 = i13;
                i6 = i14;
            }
            i5++;
        }
        if (i3 > 0) {
            i8 += ((i8 / i3) - 1) * this.f112769f;
        }
        if (mode != 1073741824) {
            size2 = getPaddingBottom() + i8 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112764a = new ArrayList();
        this.f112765b = new ArrayList();
        this.f112766c = new ArrayList();
        this.f112768e = new ArrayList();
        this.f112769f = 0;
        this.f112770g = 0;
        this.f112771h = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagFlowLayout);
        this.f112767d = obtainStyledAttributes.getInt(1, -1);
        this.f112770g = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f112769f = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f112771h = obtainStyledAttributes.getInteger(2, 0);
        if (C0720f.m3043a(Locale.getDefault()) == 1) {
            if (this.f112767d == -1) {
                this.f112767d = 1;
            } else {
                this.f112767d = -1;
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f112764a.clear();
        this.f112765b.clear();
        this.f112766c.clear();
        this.f112768e.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = marginLayoutParams.bottomMargin + childAt.getMeasuredHeight() + marginLayoutParams.topMargin;
                if (measuredWidth + i5 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i6++;
                    if (this.f112771h > 0 && i6 > this.f112771h) {
                        break;
                    }
                    this.f112765b.add(Integer.valueOf(i7));
                    this.f112764a.add(this.f112768e);
                    this.f112766c.add(Integer.valueOf(i5));
                    this.f112768e = new ArrayList();
                    i7 = measuredHeight;
                    i5 = 0;
                }
                i5 += measuredWidth + this.f112770g;
                i7 = Math.max(i7, measuredHeight);
                this.f112768e.add(childAt);
            }
        }
        this.f112765b.add(Integer.valueOf(i7));
        this.f112766c.add(Integer.valueOf(i5));
        this.f112764a.add(this.f112768e);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f112764a.size();
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        while (i11 < size) {
            this.f112768e = (List) this.f112764a.get(i11);
            int size2 = this.f112768e.size();
            int intValue = ((Integer) this.f112765b.get(i11)).intValue() + this.f112769f;
            int intValue2 = ((Integer) this.f112766c.get(i11)).intValue();
            switch (this.f112767d) {
                case -1:
                    i10 = getPaddingLeft();
                    break;
                case 0:
                    i10 = ((width - intValue2) / 2) + getPaddingLeft();
                    break;
                case 1:
                    i10 = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                    Collections.reverse(this.f112768e);
                    break;
            }
            int i12 = i10;
            for (int i13 = 0; i13 < size2; i13++) {
                View view = (View) this.f112768e.get(i13);
                if (view.getVisibility() != 8) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) view.getLayoutParams();
                    int i14 = marginLayoutParams2.leftMargin + i12;
                    int i15 = marginLayoutParams2.topMargin + i9;
                    view.layout(i14, i15, view.getMeasuredWidth() + i14, i15 + view.getMeasuredHeight());
                    i12 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.f112770g;
                }
            }
            i9 += intValue;
            i11++;
            i10 = i12;
        }
    }
}
