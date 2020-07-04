package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.poi.R$styleable;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout */
public final class TextAppendViewLayout extends ViewGroup {

    /* renamed from: a */
    public static final C35478a f93071a = new C35478a(null);

    /* renamed from: b */
    private int f93072b;

    /* renamed from: c */
    private int f93073c;

    /* renamed from: d */
    private float f93074d;

    /* renamed from: e */
    private TextView f93075e;

    /* renamed from: f */
    private View f93076f;

    /* renamed from: g */
    private int f93077g;

    /* renamed from: h */
    private int f93078h;

    /* renamed from: i */
    private int f93079i;

    /* renamed from: j */
    private int f93080j;

    /* renamed from: k */
    private LayoutParams f93081k;

    /* renamed from: l */
    private LayoutParams f93082l;

    /* renamed from: m */
    private int f93083m;

    /* renamed from: n */
    private int f93084n;

    /* renamed from: o */
    private int f93085o;

    /* renamed from: p */
    private int f93086p;

    /* renamed from: q */
    private int f93087q;

    /* renamed from: r */
    private int f93088r;

    /* renamed from: s */
    private int f93089s;

    /* renamed from: t */
    private HashMap f93090t;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout$LayoutParams */
    public static final class LayoutParams extends MarginLayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            C7573i.m23587b(context, "context");
            super(context, attributeSet);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout$a */
    public static final class C35478a {
        private C35478a() {
        }

        public /* synthetic */ C35478a(C7571f fVar) {
            this();
        }
    }

    public TextAppendViewLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TextAppendViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo90237a(int i) {
        if (this.f93090t == null) {
            this.f93090t = new HashMap();
        }
        View view = (View) this.f93090t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93090t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getNewLineMarginStart() {
        return this.f93089s;
    }

    public final int getNewLineMarginTop() {
        return this.f93088r;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: b */
    private final void m114607b() {
        m114610c(this.f93077g + this.f93079i, Math.max(this.f93078h, this.f93080j));
        this.f93072b = 1;
    }

    /* renamed from: c */
    private final void m114609c() {
        m114610c(this.f93077g, this.f93078h + this.f93080j + this.f93088r);
        this.f93072b = 3;
    }

    /* renamed from: d */
    private final void m114611d() {
        int i = this.f93073c;
        LayoutParams layoutParams = this.f93081k;
        if (layoutParams == null) {
            C7573i.m23583a("tvParams");
        }
        m114610c(this.f93077g, Math.max(this.f93078h, i + layoutParams.topMargin + this.f93080j));
        this.f93072b = 2;
    }

    /* renamed from: a */
    private final void m114603a() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f93075e = (TextView) childAt;
            TextView textView = this.f93075e;
            if (textView == null) {
                C7573i.m23583a("textView");
            }
            this.f93083m = textView.getMaxLines();
            View childAt2 = getChildAt(1);
            C7573i.m23582a((Object) childAt2, "getChildAt(1)");
            this.f93076f = childAt2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: f */
    private final void m114613f() {
        int paddingLeft = getPaddingLeft();
        LayoutParams layoutParams = this.f93081k;
        if (layoutParams == null) {
            C7573i.m23583a("tvParams");
        }
        int marginStart = paddingLeft + layoutParams.getMarginStart();
        TextView textView = this.f93075e;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        View view = textView;
        int paddingTop = getPaddingTop();
        LayoutParams layoutParams2 = this.f93081k;
        if (layoutParams2 == null) {
            C7573i.m23583a("tvParams");
        }
        int i = paddingTop + layoutParams2.topMargin;
        TextView textView2 = this.f93075e;
        if (textView2 == null) {
            C7573i.m23583a("textView");
        }
        int measuredWidth = textView2.getMeasuredWidth();
        TextView textView3 = this.f93075e;
        if (textView3 == null) {
            C7573i.m23583a("textView");
        }
        m114605a(view, marginStart, i, measuredWidth, textView3.getMeasuredHeight());
        View view2 = this.f93076f;
        if (view2 == null) {
            C7573i.m23583a("view");
        }
        int i2 = marginStart + this.f93089s;
        int paddingTop2 = this.f93078h + getPaddingTop() + this.f93088r;
        View view3 = this.f93076f;
        if (view3 == null) {
            C7573i.m23583a("view");
        }
        int measuredWidth2 = view3.getMeasuredWidth();
        View view4 = this.f93076f;
        if (view4 == null) {
            C7573i.m23583a("view");
        }
        m114605a(view2, i2, paddingTop2, measuredWidth2, view4.getMeasuredHeight());
    }

    /* renamed from: e */
    private final void m114612e() {
        TextView textView = this.f93075e;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        View view = textView;
        int paddingLeft = getPaddingLeft();
        LayoutParams layoutParams = this.f93081k;
        if (layoutParams == null) {
            C7573i.m23583a("tvParams");
        }
        int marginStart = paddingLeft + layoutParams.getMarginStart();
        int paddingTop = getPaddingTop();
        LayoutParams layoutParams2 = this.f93081k;
        if (layoutParams2 == null) {
            C7573i.m23583a("tvParams");
        }
        int i = paddingTop + layoutParams2.topMargin;
        TextView textView2 = this.f93075e;
        if (textView2 == null) {
            C7573i.m23583a("textView");
        }
        int measuredWidth = textView2.getMeasuredWidth();
        TextView textView3 = this.f93075e;
        if (textView3 == null) {
            C7573i.m23583a("textView");
        }
        m114605a(view, marginStart, i, measuredWidth, textView3.getMeasuredHeight());
        int paddingLeft2 = getPaddingLeft() + ((int) this.f93074d);
        LayoutParams layoutParams3 = this.f93081k;
        if (layoutParams3 == null) {
            C7573i.m23583a("tvParams");
        }
        int marginStart2 = paddingLeft2 + layoutParams3.getMarginStart();
        LayoutParams layoutParams4 = this.f93082l;
        if (layoutParams4 == null) {
            C7573i.m23583a("ivParams");
        }
        int marginStart3 = marginStart2 + layoutParams4.getMarginStart();
        int i2 = this.f93073c;
        LayoutParams layoutParams5 = this.f93081k;
        if (layoutParams5 == null) {
            C7573i.m23583a("tvParams");
        }
        int i3 = i2 + layoutParams5.topMargin;
        LayoutParams layoutParams6 = this.f93082l;
        if (layoutParams6 == null) {
            C7573i.m23583a("ivParams");
        }
        int i4 = i3 + layoutParams6.topMargin;
        TextView textView4 = this.f93075e;
        if (textView4 == null) {
            C7573i.m23583a("textView");
        }
        int bottom = textView4.getBottom();
        TextView textView5 = this.f93075e;
        if (textView5 == null) {
            C7573i.m23583a("textView");
        }
        int paddingBottom = (bottom - textView5.getPaddingBottom()) - this.f93073c;
        if (this.f93080j < paddingBottom) {
            i4 += (paddingBottom - this.f93080j) / 2;
        }
        View view2 = this.f93076f;
        if (view2 == null) {
            C7573i.m23583a("view");
        }
        View view3 = this.f93076f;
        if (view3 == null) {
            C7573i.m23583a("view");
        }
        int measuredWidth2 = view3.getMeasuredWidth();
        View view4 = this.f93076f;
        if (view4 == null) {
            C7573i.m23583a("view");
        }
        m114605a(view2, marginStart3, i4, measuredWidth2, view4.getMeasuredHeight());
    }

    public final void setNewLineMarginStart(int i) {
        this.f93089s = i;
    }

    public final void setNewLineMarginTop(int i) {
        this.f93088r = i;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        C7573i.m23587b(layoutParams, "p");
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: b */
    private final void m114608b(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
            }
        }
    }

    /* renamed from: c */
    private final void m114610c(int i, int i2) {
        if (this.f93084n == Integer.MIN_VALUE && this.f93086p == Integer.MIN_VALUE) {
            setMeasuredDimension(i, i2);
        } else if (this.f93084n == Integer.MIN_VALUE) {
            setMeasuredDimension(i, this.f93087q);
        } else {
            setMeasuredDimension(this.f93085o, i2);
        }
    }

    /* renamed from: a */
    private final void m114604a(int i, int i2) {
        TextView textView = this.f93075e;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            this.f93081k = (LayoutParams) layoutParams;
            View view = this.f93076f;
            if (view == null) {
                C7573i.m23583a("view");
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                this.f93082l = (LayoutParams) layoutParams2;
                TextView textView2 = this.f93075e;
                if (textView2 == null) {
                    C7573i.m23583a("textView");
                }
                int measuredWidth = textView2.getMeasuredWidth();
                LayoutParams layoutParams3 = this.f93081k;
                if (layoutParams3 == null) {
                    C7573i.m23583a("tvParams");
                }
                int marginStart = measuredWidth + layoutParams3.getMarginStart();
                LayoutParams layoutParams4 = this.f93081k;
                if (layoutParams4 == null) {
                    C7573i.m23583a("tvParams");
                }
                this.f93077g = marginStart + layoutParams4.getMarginEnd();
                TextView textView3 = this.f93075e;
                if (textView3 == null) {
                    C7573i.m23583a("textView");
                }
                int measuredHeight = textView3.getMeasuredHeight();
                LayoutParams layoutParams5 = this.f93081k;
                if (layoutParams5 == null) {
                    C7573i.m23583a("tvParams");
                }
                int i3 = measuredHeight + layoutParams5.topMargin;
                LayoutParams layoutParams6 = this.f93081k;
                if (layoutParams6 == null) {
                    C7573i.m23583a("tvParams");
                }
                this.f93078h = i3 + layoutParams6.bottomMargin;
                View view2 = this.f93076f;
                if (view2 == null) {
                    C7573i.m23583a("view");
                }
                int measuredWidth2 = view2.getMeasuredWidth();
                LayoutParams layoutParams7 = this.f93082l;
                if (layoutParams7 == null) {
                    C7573i.m23583a("ivParams");
                }
                int marginStart2 = measuredWidth2 + layoutParams7.getMarginStart();
                LayoutParams layoutParams8 = this.f93082l;
                if (layoutParams8 == null) {
                    C7573i.m23583a("ivParams");
                }
                this.f93079i = marginStart2 + layoutParams8.getMarginEnd();
                View view3 = this.f93076f;
                if (view3 == null) {
                    C7573i.m23583a("view");
                }
                int measuredHeight2 = view3.getMeasuredHeight();
                LayoutParams layoutParams9 = this.f93082l;
                if (layoutParams9 == null) {
                    C7573i.m23583a("ivParams");
                }
                int i4 = measuredHeight2 + layoutParams9.topMargin;
                LayoutParams layoutParams10 = this.f93082l;
                if (layoutParams10 == null) {
                    C7573i.m23583a("ivParams");
                }
                this.f93080j = i4 + layoutParams10.bottomMargin;
                this.f93084n = MeasureSpec.getMode(i);
                this.f93085o = MeasureSpec.getSize(i);
                this.f93086p = MeasureSpec.getMode(i2);
                this.f93087q = MeasureSpec.getSize(i2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 2) {
            m114603a();
            m114608b(i, i2);
            m114604a(i, i2);
            View view = this.f93076f;
            if (view == null) {
                C7573i.m23583a("view");
            }
            if (view.getVisibility() == 8) {
                m114610c(this.f93077g, this.f93078h);
                this.f93072b = 1;
                return;
            }
            int paddingStart = (this.f93085o - getPaddingStart()) - getPaddingEnd();
            TextView textView = this.f93075e;
            if (textView == null) {
                C7573i.m23583a("textView");
            }
            CharSequence text = textView.getText();
            C7573i.m23582a((Object) text, "textView.text");
            TextView textView2 = this.f93075e;
            if (textView2 == null) {
                C7573i.m23583a("textView");
            }
            int measuredWidth = textView2.getMeasuredWidth();
            TextView textView3 = this.f93075e;
            if (textView3 == null) {
                C7573i.m23583a("textView");
            }
            TextPaint paint = textView3.getPaint();
            C7573i.m23582a((Object) paint, "textView.paint");
            m114606a(text, measuredWidth, paint);
            if (this.f93077g + this.f93079i <= paddingStart) {
                m114607b();
            } else if (this.f93074d + ((float) this.f93079i) > ((float) paddingStart)) {
                m114609c();
            } else {
                m114611d();
            }
        } else {
            throw new RuntimeException("TextAppendViewLayout child count must be 2");
        }
    }

    public TextAppendViewLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        setWillNotDraw(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextAppendViewLayout);
        if (obtainStyledAttributes != null) {
            this.f93088r = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f93089s = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private final void m114606a(CharSequence charSequence, int i, TextPaint textPaint) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount > this.f93083m) {
            lineCount = this.f93083m;
        }
        int i2 = lineCount - 1;
        this.f93073c = staticLayout.getLineTop(i2);
        this.f93074d = staticLayout.getLineRight(i2);
    }

    /* renamed from: a */
    private static void m114605a(View view, int i, int i2, int i3, int i4) {
        if (view.getVisibility() != 8) {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f93072b) {
            case 1:
            case 2:
                m114612e();
                return;
            case 3:
                m114613f();
                break;
        }
    }

    public /* synthetic */ TextAppendViewLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
