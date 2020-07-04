package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.newfollow.model.C34149f;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.t */
final /* synthetic */ class C34291t implements OnClickListener {

    /* renamed from: a */
    private final UpLoadRecoverItemViewHolder f89432a;

    /* renamed from: b */
    private final C34149f f89433b;

    C34291t(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, C34149f fVar) {
        this.f89432a = upLoadRecoverItemViewHolder;
        this.f89433b = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f89432a.mo87026a(this.f89433b, view);
    }
}
