package com.p280ss.android.ugc.aweme.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;

/* renamed from: com.ss.android.ugc.aweme.share.t */
final /* synthetic */ class C38258t implements OnClickListener {

    /* renamed from: a */
    private final CommerceStickerInfo f99425a;

    C38258t(CommerceStickerInfo commerceStickerInfo) {
        this.f99425a = commerceStickerInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PhotoUploadSuccessPopView.m121224a(this.f99425a, view);
    }
}
