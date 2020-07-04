package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.R$styleable;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout */
public class CompoundDrawableAndTextLayout extends LinearLayout {

    /* renamed from: a */
    private RemoteImageView f93029a;

    /* renamed from: b */
    private TextView f93030b;

    /* renamed from: c */
    private int f93031c;

    /* renamed from: d */
    private boolean f93032d;

    /* renamed from: e */
    private int f93033e;

    /* renamed from: f */
    private int f93034f;

    public TextView getTextView() {
        return this.f93030b;
    }

    /* renamed from: a */
    private void m114586a() {
        if (VERSION.SDK_INT >= 17) {
            this.f93030b.setTextAlignment(5);
        }
    }

    public CompoundDrawableAndTextLayout(Context context) {
        this(context, null);
    }

    public void setImageResource(int i) {
        if (this.f93029a != null) {
            this.f93029a.setImageResource(i);
            requestLayout();
        }
    }

    public void setText(String str) {
        this.f93030b.setText(str);
        requestLayout();
    }

    public void setTextRes(int i) {
        this.f93030b.setText(i);
        requestLayout();
    }

    /* renamed from: a */
    public final void mo90198a(PoiStruct poiStruct, int i) {
        setImageResource(R.drawable.axt);
    }

    public CompoundDrawableAndTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompoundDrawableAndTextLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f93033e = 12;
        this.f93034f = -1;
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CompoundDrawableAndTextLayout);
        if (obtainStyledAttributes.hasValue(1)) {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f93029a = new RemoteImageView(context);
            if (dimensionPixelSize > 0) {
                i2 = dimensionPixelSize;
            } else {
                i2 = -2;
            }
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -2;
            }
            addView(this.f93029a, new LayoutParams(i2, dimensionPixelSize));
            this.f93029a.setImageResource(resourceId);
        }
        this.f93031c = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f93032d = obtainStyledAttributes.getBoolean(0, false);
        this.f93033e = obtainStyledAttributes.getDimensionPixelSize(6, 12);
        this.f93034f = obtainStyledAttributes.getColor(4, -1);
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        this.f93030b = new DmtTextView(context);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = this.f93031c;
        addView(this.f93030b, layoutParams);
        this.f93030b.setTextColor(this.f93034f);
        this.f93030b.setTextSize(0, (float) this.f93033e);
        if (z) {
            this.f93030b.setMaxLines(1);
            this.f93030b.setEllipsize(TruncateAt.END);
        }
        m114586a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.f93029a == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int i6 = ((i4 - i2) - paddingTop) - paddingBottom;
        int measuredWidth = this.f93029a.getMeasuredWidth();
        int measuredHeight = this.f93029a.getMeasuredHeight();
        int measuredHeight2 = this.f93030b.getMeasuredHeight();
        int measuredWidth2 = this.f93030b.getMeasuredWidth();
        if (this.f93032d) {
            i5 = ((i6 - measuredHeight) / 2) + paddingTop;
        } else {
            int lineHeight = this.f93030b.getLineHeight();
            i5 = ((measuredHeight2 - (this.f93030b.getLineCount() * lineHeight)) / 2) + ((lineHeight - measuredHeight) / 2) + paddingTop;
        }
        int i7 = measuredWidth + paddingLeft;
        this.f93029a.layout(paddingLeft, i5, i7, measuredHeight + i5);
        int i8 = i7 + ((LayoutParams) this.f93030b.getLayoutParams()).leftMargin;
        int i9 = ((i6 - measuredHeight2) / 2) + paddingTop;
        this.f93030b.layout(i8, i9, measuredWidth2 + i8, measuredHeight2 + i9);
    }
}
