package com.p280ss.android.ugc.aweme.search.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.search.widget.c */
final /* synthetic */ class C37395c implements OnClickListener {

    /* renamed from: a */
    private final C37392b f97651a;

    /* renamed from: b */
    private final int f97652b;

    /* renamed from: c */
    private final PoiOptionStruct f97653c;

    C37395c(C37392b bVar, int i, PoiOptionStruct poiOptionStruct) {
        this.f97651a = bVar;
        this.f97652b = i;
        this.f97653c = poiOptionStruct;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }
}
