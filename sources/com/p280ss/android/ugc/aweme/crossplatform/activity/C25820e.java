package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.e */
final /* synthetic */ class C25820e implements OnClickListener {

    /* renamed from: a */
    private final C25818c f68284a;

    /* renamed from: b */
    private final EditText f68285b;

    C25820e(C25818c cVar, EditText editText) {
        this.f68284a = cVar;
        this.f68285b = editText;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68284a.mo67135a(this.f68285b, view);
    }
}
