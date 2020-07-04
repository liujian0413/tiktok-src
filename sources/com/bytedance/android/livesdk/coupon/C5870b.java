package com.bytedance.android.livesdk.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.core.utils.C3387g;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.coupon.b */
public final class C5870b extends Dialog {

    /* renamed from: a */
    public View f17348a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() == null) {
            dismiss();
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        setContentView(this.f17348a);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.ahh);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(0.0f);
        }
        if (!C3387g.m12599a(getContext())) {
            Window window5 = getWindow();
            if (window5 != null) {
                window5.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    public C5870b(Context context, View view) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "view");
        super(context);
        this.f17348a = view;
    }
}
