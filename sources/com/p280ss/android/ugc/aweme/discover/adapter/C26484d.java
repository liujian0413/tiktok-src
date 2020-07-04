package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.C23685d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.d */
final /* synthetic */ class C26484d implements OnClickListener {

    /* renamed from: a */
    private final CoverViewHolder f69856a;

    /* renamed from: b */
    private final C23685d f69857b;

    C26484d(CoverViewHolder coverViewHolder, C23685d dVar) {
        this.f69856a = coverViewHolder;
        this.f69857b = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69856a.mo67946a(this.f69857b, view);
    }
}
