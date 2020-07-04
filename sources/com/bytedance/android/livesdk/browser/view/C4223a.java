package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.browser.view.a */
public final class C4223a extends FrameLayout {

    /* renamed from: a */
    private HSImageView f12336a;

    /* renamed from: b */
    private HSImageView f12337b;

    /* renamed from: a */
    private void m14354a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ayj, this, true);
        this.f12336a = (HSImageView) inflate.findViewById(R.id.ga);
        this.f12337b = (HSImageView) inflate.findViewById(R.id.gc);
        this.f12336a.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_center.webp").mo32751c(true)).mo32730f());
        this.f12337b.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_point.webp").mo32751c(true)).mo32730f());
    }

    public C4223a(Context context) {
        super(context);
        m14354a();
    }
}
