package com.p280ss.android.ugc.aweme.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;

/* renamed from: com.ss.android.ugc.aweme.share.f */
final /* synthetic */ class C38036f implements OnClickListener {

    /* renamed from: a */
    private final CommerceStickerInfo f99022a;

    C38036f(CommerceStickerInfo commerceStickerInfo) {
        this.f99022a = commerceStickerInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38028e.m121383a(this.f99022a, view);
    }
}
