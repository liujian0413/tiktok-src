package com.p280ss.android.ugc.aweme.base.p1056b;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.base.b.b */
public final class C23277b implements OnClickListener {

    /* renamed from: a */
    private C23278c f61310a;

    /* renamed from: b */
    private C23275a f61311b;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f61310a != null && this.f61311b != null) {
            this.f61310a.mo57183a(this.f61311b);
        }
    }

    public C23277b(C23278c cVar, C23275a aVar) {
        this.f61310a = cVar;
        this.f61311b = aVar;
    }
}
