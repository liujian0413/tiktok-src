package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.FitTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveFirstChargeView extends FrameLayout {

    /* renamed from: a */
    private LinearLayout f21425a;

    private ImageView getGuideIv() {
        return new ImageView(getContext());
    }

    /* renamed from: a */
    private void m24290a() {
        LayoutInflater.from(getContext()).inflate(R.layout.avl, this);
        this.f21425a = (LinearLayout) findViewById(R.id.bs7);
    }

    private TextView getGuideTv() {
        FitTextView fitTextView = new FitTextView(getContext());
        fitTextView.setTextSize(12.0f);
        fitTextView.setTextColor(C3358ac.m12521b((int) R.color.as5));
        fitTextView.setMaxLines(1);
        return fitTextView;
    }

    public LiveFirstChargeView(Context context) {
        this(context, null);
    }

    public LiveFirstChargeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFirstChargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24290a();
    }
}
