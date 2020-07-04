package com.p280ss.android.ugc.aweme.share.gif.p1537ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.sharer.C38343b;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.a */
final /* synthetic */ class C38060a implements OnClickListener {

    /* renamed from: a */
    private final VideoShare2GifPreviewActivity f99102a;

    /* renamed from: b */
    private final C38343b f99103b;

    /* renamed from: c */
    private final String f99104c;

    C38060a(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, C38343b bVar, String str) {
        this.f99102a = videoShare2GifPreviewActivity;
        this.f99103b = bVar;
        this.f99104c = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f99102a.mo95701a(this.f99103b, this.f99104c, view);
    }
}
