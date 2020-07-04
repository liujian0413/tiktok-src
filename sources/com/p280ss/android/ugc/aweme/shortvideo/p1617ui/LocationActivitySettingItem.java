package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationActivitySettingItem */
public class LocationActivitySettingItem extends FrameLayout {

    /* renamed from: a */
    TextView f107075a;

    /* renamed from: b */
    TextView f107076b;

    /* renamed from: c */
    private PoiContext f107077c;

    public LocationActivitySettingItem(Context context) {
        this(context, null);
    }

    public void setPoiActivity(PoiContext poiContext) {
        this.f107077c = poiContext;
        this.f107075a.setText(poiContext.mShootPoiName);
        this.f107076b.setText(this.f107077c.mPoiActivity.getTitle());
    }

    public void setSingleLine(boolean z) {
        if (z) {
            ((LayoutParams) this.f107075a.getLayoutParams()).weight = 1.0f;
            this.f107075a.setSingleLine(true);
            this.f107075a.setEllipsize(TruncateAt.END);
        }
    }

    public LocationActivitySettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m131341a(TextView textView, boolean z) {
        int i;
        if (z) {
            i = C0683b.m2912c(getContext(), R.color.a5d);
        } else {
            i = C0683b.m2912c(getContext(), R.color.a5h);
        }
        textView.setTextColor(i);
    }

    public LocationActivitySettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a17, this);
        this.f107075a = (TextView) findViewById(R.id.cjx);
        this.f107076b = (TextView) findViewById(R.id.cjy);
        m131341a(this.f107075a, true);
        m131341a(this.f107076b, false);
    }
}
