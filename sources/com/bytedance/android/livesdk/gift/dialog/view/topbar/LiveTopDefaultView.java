package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveTopDefaultView extends FrameLayout {

    /* renamed from: a */
    private TextView f21454a;

    /* renamed from: b */
    private GiftViewModel f21455b;

    /* renamed from: a */
    private void m24309a() {
        LayoutInflater.from(getContext()).inflate(R.layout.avk, this);
        this.f21454a = (TextView) findViewById(R.id.a6x);
        this.f21454a.setOnClickListener(new C7934g(this));
    }

    public void setViewModel(GiftViewModel giftViewModel) {
        this.f21455b = giftViewModel;
    }

    public LiveTopDefaultView(Context context) {
        this(context, null);
    }

    public LiveTopDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTopDefaultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24309a();
    }
}
