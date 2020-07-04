package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.Divider */
public class Divider extends LinearLayout {

    /* renamed from: a */
    private View f29137a;

    /* renamed from: b */
    private TextView f29138b;

    /* renamed from: c */
    private View f29139c;

    public TextView getTxtLeft() {
        return this.f29138b;
    }

    public Divider(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31675a(Context context) {
        this.f29137a = View.inflate(context, R.layout.b0v, this);
        this.f29138b = (TextView) this.f29137a.findViewById(R.id.dwq);
        this.f29139c = this.f29137a.findViewById(R.id.e7n);
        this.f29137a.setBackgroundColor(C10774c.m31446b(getContext()));
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31676a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Divider);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f29139c.setVisibility(8);
        }
        this.f29139c.setBackgroundColor(C10774c.m31448d(context));
        this.f29137a.setBackgroundColor(C10774c.m31446b(context));
        String string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            this.f29138b.setText(string);
        } else {
            this.f29138b.setVisibility(8);
            ((MarginLayoutParams) this.f29139c.getLayoutParams()).bottomMargin = (int) C9738o.m28708b(getContext(), 8.0f);
        }
        TextView textView = this.f29138b;
        Resources resources = context.getResources();
        if (C6394b.m19907b(context)) {
            i = R.color.auz;
        } else {
            i = R.color.ay7;
        }
        textView.setTextColor(resources.getColor(i));
        obtainStyledAttributes.recycle();
    }

    public Divider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31675a(context);
        m31676a(context, attributeSet);
    }
}
