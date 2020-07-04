package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItem */
public class SettingItem extends SettingItemBase {

    /* renamed from: a */
    protected FrameLayout f29163a;

    /* renamed from: b */
    protected ImageView f29164b;

    /* renamed from: c */
    protected TextView f29165c;

    /* renamed from: d */
    protected ImageView f29166d;

    public View getRightLayout() {
        return this.f29163a;
    }

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return R.layout.b0z;
    }

    public TextView getTxtRight() {
        return this.f29165c;
    }

    public SettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f29165c.setText(this.f29168e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26011a(Context context) {
        super.mo26011a(context);
        this.f29164b = (ImageView) this.f29169f.findViewById(R.id.bbo);
        this.f29163a = (FrameLayout) this.f29169f.findViewById(R.id.cta);
        this.f29165c = (TextView) this.f29169f.findViewById(R.id.e0w);
        this.f29166d = (ImageView) this.f29169f.findViewById(R.id.baq);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26012a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItemNormal);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f29164b.setVisibility(8);
        }
        this.f29165c.setText(this.f29168e);
        if (C6394b.m19907b(context)) {
            i = R.drawable.cmk;
        } else {
            i = R.drawable.cml;
        }
        Drawable drawable = getResources().getDrawable(obtainStyledAttributes.getResourceId(0, i));
        if (drawable != null) {
            this.f29164b.setImageDrawable(drawable);
        }
        this.f29165c.setTextColor(this.f29179p);
        obtainStyledAttributes.recycle();
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
