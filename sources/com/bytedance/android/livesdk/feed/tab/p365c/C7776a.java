package com.bytedance.android.livesdk.feed.tab.p365c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.feed.tab.c.a */
public final class C7776a extends LinearLayout {

    /* renamed from: a */
    CheckedTextView f21004a = ((CheckedTextView) findViewById(R.id.doz));

    /* renamed from: b */
    ImageView f21005b = ((ImageView) findViewById(R.id.doy));

    public final void setText(String str) {
        this.f21004a.setText(str);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.f21004a.setTextColor(colorStateList);
    }

    public final void setIndicatorWidth(int i) {
        LayoutParams layoutParams = this.f21005b.getLayoutParams();
        layoutParams.width = i;
        this.f21005b.setLayoutParams(layoutParams);
    }

    public C7776a(Context context) {
        super(context);
        inflate(context, R.layout.atd, this);
    }

    public final void setChecked(boolean z) {
        this.f21004a.setChecked(z);
        if (z) {
            this.f21004a.setTypeface(Typeface.DEFAULT_BOLD);
            this.f21005b.setVisibility(0);
            return;
        }
        this.f21004a.setTypeface(Typeface.DEFAULT);
        this.f21005b.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo20453a(int i, float f) {
        this.f21004a.setTextSize(1, 16.0f);
    }
}
