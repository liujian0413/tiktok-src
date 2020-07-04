package com.p280ss.android.ugc.aweme.audio;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.audio.e */
final /* synthetic */ class C23101e implements OnClickListener {

    /* renamed from: a */
    private final C23095b f61001a;

    C23101e(C23095b bVar) {
        this.f61001a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f61001a.mo60174a(view);
    }
}
