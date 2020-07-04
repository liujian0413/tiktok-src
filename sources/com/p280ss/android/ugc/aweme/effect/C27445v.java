package com.p280ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.effect.VEEffectAdapter.ViewHolder;

/* renamed from: com.ss.android.ugc.aweme.effect.v */
final /* synthetic */ class C27445v implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f72366a;

    C27445v(ViewHolder viewHolder) {
        this.f72366a = viewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f72366a.mo70408a(view);
    }
}
