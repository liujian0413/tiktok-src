package com.p280ss.android.ugc.aweme.notification.view.copy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.notification.view.copy.b */
final /* synthetic */ class C34649b implements OnClickListener {

    /* renamed from: a */
    private final RecommendAwemeViewHolder f90418a;

    /* renamed from: b */
    private final int f90419b;

    C34649b(RecommendAwemeViewHolder recommendAwemeViewHolder, int i) {
        this.f90418a = recommendAwemeViewHolder;
        this.f90419b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f90418a.mo87939a(this.f90419b, view);
    }
}
