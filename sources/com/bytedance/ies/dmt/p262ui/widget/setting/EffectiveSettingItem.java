package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem */
public class EffectiveSettingItem extends EffectiveSettingItemBase {

    /* renamed from: g */
    protected ImageView f29140g;

    /* renamed from: h */
    protected TextView f29141h;

    /* renamed from: i */
    protected ImageView f29142i;

    /* renamed from: j */
    boolean f29143j;

    /* renamed from: k */
    int f29144k;

    public TextView getTxtRight() {
        return this.f29141h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20984b() {
        this.f29140g = (ImageView) findViewById(R.id.bbo);
        this.f29141h = (TextView) findViewById(R.id.e0w);
        this.f29142i = (ImageView) findViewById(R.id.baq);
        if (this.f29143j) {
            this.f29140g.setVisibility(8);
        }
        this.f29141h.setText(this.f29147l);
        Drawable drawable = getResources().getDrawable(this.f29144k);
        if (drawable != null) {
            this.f29140g.setImageDrawable(drawable);
        }
        this.f29141h.setTextColor(this.f29153r);
    }

    public EffectiveSettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f29141h.setText(this.f29147l);
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25996a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItemNormal);
        this.f29143j = obtainStyledAttributes.getBoolean(3, false);
        if (C6394b.m19907b(context)) {
            i = R.drawable.cmk;
        } else {
            i = R.drawable.cml;
        }
        this.f29144k = obtainStyledAttributes.getResourceId(0, i);
        obtainStyledAttributes.recycle();
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
