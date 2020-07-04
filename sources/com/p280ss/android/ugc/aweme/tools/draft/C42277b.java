package com.p280ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b */
final /* synthetic */ class C42277b implements OnClickListener {

    /* renamed from: a */
    private final AwemeDraftMusicHolder f110027a;

    /* renamed from: b */
    private final C27311c f110028b;

    C42277b(AwemeDraftMusicHolder awemeDraftMusicHolder, C27311c cVar) {
        this.f110027a = awemeDraftMusicHolder;
        this.f110028b = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f110027a.mo103724a(this.f110028b, view);
    }
}
