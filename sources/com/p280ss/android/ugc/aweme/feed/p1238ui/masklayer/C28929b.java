package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.MaskLayerOption;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.b */
final /* synthetic */ class C28929b implements OnClickListener {

    /* renamed from: a */
    private final MaskLayerOptionsAdapter f76265a;

    /* renamed from: b */
    private final MaskLayerOption f76266b;

    C28929b(MaskLayerOptionsAdapter maskLayerOptionsAdapter, MaskLayerOption maskLayerOption) {
        this.f76265a = maskLayerOptionsAdapter;
        this.f76266b = maskLayerOption;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76265a.mo74219a(this.f76266b, view);
    }
}
