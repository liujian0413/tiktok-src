package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p848c.p849a.p850a.C19226a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.d */
final /* synthetic */ class C25857d implements OnClickListener {

    /* renamed from: a */
    private final DownloadBusiness f68387a;

    /* renamed from: b */
    private final C19226a f68388b;

    C25857d(DownloadBusiness downloadBusiness, C19226a aVar) {
        this.f68387a = downloadBusiness;
        this.f68388b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68387a.mo67182a(this.f68388b, view);
    }
}
