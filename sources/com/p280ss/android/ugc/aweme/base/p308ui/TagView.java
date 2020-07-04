package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ies.dmt.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.TagView */
public class TagView extends BorderLayout {

    /* renamed from: e */
    private String f61844e;

    /* renamed from: f */
    private ImageView f61845f;

    /* renamed from: g */
    private AppCompatTextView f61846g;

    /* renamed from: h */
    private int f61847h;

    /* renamed from: a */
    private void m76933a() {
        setOrientation(0);
        inflate(getContext(), R.layout.aag, this);
        this.f61845f = (ImageView) findViewById(R.id.bcz);
        this.f61846g = (AppCompatTextView) findViewById(R.id.e30);
    }

    public TagView(Context context) {
        this(context, null);
    }

    public void setSelected(boolean z) {
        if (this.f61845f != null) {
            this.f61845f.setSelected(z);
        }
        if (this.f61846g != null) {
            if (z) {
                this.f61846g.setTextColor(this.f61665c);
            } else {
                this.f61846g.setTextColor(this.f61847h);
            }
        }
        super.setSelected(z);
    }

    public TagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m76934a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagView);
        this.f61663a = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) this.f61663a);
        this.f61664b = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f61664b);
        this.f61665c = obtainStyledAttributes.getColor(3, this.f61665c);
        this.f61666d = obtainStyledAttributes.getColor(6, this.f61666d);
        this.f61844e = obtainStyledAttributes.getString(4);
        this.f61847h = obtainStyledAttributes.getColor(5, this.f61666d);
        if (!TextUtils.isEmpty(this.f61844e) && this.f61846g != null) {
            this.f61846g.setText(this.f61844e);
            this.f61846g.setTextColor(this.f61847h);
        }
        mo60910a(this.f61665c, this.f61666d);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (!(drawable == null || this.f61845f == null)) {
            this.f61845f.setImageDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public TagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76933a();
        m76934a(getContext(), attributeSet);
    }
}
