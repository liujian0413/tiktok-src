package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.HotListStruct;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.k */
final /* synthetic */ class C36543k implements OnClickListener {

    /* renamed from: a */
    private final C36481a f95932a;

    /* renamed from: b */
    private final HotListStruct f95933b;

    C36543k(C36481a aVar, HotListStruct hotListStruct) {
        this.f95932a = aVar;
        this.f95933b = hotListStruct;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95932a.mo92633a(this.f95933b, view);
    }
}
