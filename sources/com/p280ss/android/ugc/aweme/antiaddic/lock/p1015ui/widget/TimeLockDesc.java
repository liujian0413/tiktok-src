package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc */
public class TimeLockDesc extends FrameLayout {

    /* renamed from: a */
    private TextView f60311a;

    /* renamed from: b */
    private ImageView f60312b;

    public void setImageDrawable(Drawable drawable) {
        this.f60312b.setImageDrawable(drawable);
    }

    public void setText(String str) {
        this.f60311a.setText(str);
    }

    public TimeLockDesc(Context context) {
        super(context);
        m74887a(null, 0);
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m74887a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m74887a(AttributeSet attributeSet, int i) {
        inflate(getContext(), R.layout.akk, this);
        this.f60312b = (ImageView) findViewById(R.id.d_z);
        this.f60311a = (TextView) findViewById(R.id.djf);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.TimeLockDesc, i, 0);
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f60312b.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        }
        this.f60311a.setText(string);
        obtainStyledAttributes.recycle();
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74887a(attributeSet, i);
    }
}
