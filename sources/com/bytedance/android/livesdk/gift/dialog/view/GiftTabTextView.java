package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftTabTextView extends RelativeLayout {

    /* renamed from: a */
    private TextView f21312a;

    /* renamed from: b */
    private View f21313b;

    /* renamed from: a */
    public final boolean mo20704a() {
        if (this.f21313b == null || this.f21313b.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public GiftTabTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo20703a(boolean z) {
        int i;
        if (this.f21313b != null) {
            View view = this.f21313b;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setGravity(int i) {
        if (this.f21312a != null) {
            this.f21312a.setGravity(i);
        }
    }

    public void setText(String str) {
        if (this.f21312a != null) {
            this.f21312a.setText(str);
        }
    }

    public void setTextColor(int i) {
        if (this.f21312a != null) {
            this.f21312a.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (this.f21312a != null) {
            this.f21312a.setTextSize(f);
        }
    }

    /* renamed from: a */
    private void m24205a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.av6, this);
        this.f21312a = (TextView) inflate.findViewById(R.id.cln);
        this.f21313b = inflate.findViewById(R.id.clm);
    }

    public GiftTabTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24205a(context);
    }
}
