package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class UserEnterRankView extends LinearLayout {

    /* renamed from: a */
    private View f21859a;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        this.f21859a = new View(context);
        int a = C3358ac.m12510a(16.0f);
        LayoutParams layoutParams = new LayoutParams(a, a);
        layoutParams.gravity = 16;
        ImageView imageView = new ImageView(context);
        LayoutParams layoutParams2 = new LayoutParams(C3358ac.m12510a(30.0f), C3358ac.m12510a(14.0f));
        layoutParams.gravity = 16;
        imageView.setImageResource(R.drawable.c_u);
        if (C3519c.m12965a(context)) {
            addView(imageView, 0, layoutParams2);
            addView(this.f21859a, layoutParams);
            return;
        }
        addView(this.f21859a, 0, layoutParams);
        addView(imageView, layoutParams2);
    }

    public UserEnterRankView(Context context) {
        super(context);
    }

    public void setupUI(C8026a aVar) {
        TextView textView = (TextView) findViewById(R.id.dsf);
        if (aVar.f21788l != 0) {
            if (aVar.f21788l == 1) {
                this.f21859a.setBackgroundResource(R.drawable.cc6);
                textView.setText(R.string.eq8);
                return;
            } else if (aVar.f21788l == 2) {
                this.f21859a.setBackgroundResource(R.drawable.cc7);
                textView.setText(R.string.eq_);
                return;
            } else if (aVar.f21788l == 3) {
                this.f21859a.setBackgroundResource(R.drawable.cc8);
                textView.setText(R.string.eqa);
                return;
            } else if (aVar.f21788l == 4) {
                this.f21859a.setVisibility(8);
                textView.setText(R.string.eq9);
                return;
            }
        }
        setVisibility(8);
    }

    public UserEnterRankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserEnterRankView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
