package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p263im.core.model.Message;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.c */
final /* synthetic */ class C31023c implements OnClickListener {

    /* renamed from: a */
    private final BaseViewHolder f81436a;

    /* renamed from: b */
    private final Message f81437b;

    C31023c(BaseViewHolder baseViewHolder, Message message) {
        this.f81436a = baseViewHolder;
        this.f81437b = message;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81436a.mo81429a(this.f81437b, view);
    }
}
