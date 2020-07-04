package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.d */
final /* synthetic */ class C33296d implements OnClickListener {

    /* renamed from: a */
    private final MicroAppInfo f86968a;

    /* renamed from: b */
    private final C33292a f86969b;

    C33296d(MicroAppInfo microAppInfo, C33292a aVar) {
        this.f86968a = microAppInfo;
        this.f86969b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        RecentlyMicroAppViewHolder.m107697a(this.f86968a, this.f86969b, view);
    }
}
