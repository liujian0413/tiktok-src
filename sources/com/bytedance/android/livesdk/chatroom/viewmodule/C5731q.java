package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.message.model.C8541cc;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.q */
final /* synthetic */ class C5731q implements OnClickListener {

    /* renamed from: a */
    private final CommentPromotionWidget f16829a;

    /* renamed from: b */
    private final C8541cc f16830b;

    C5731q(CommentPromotionWidget commentPromotionWidget, C8541cc ccVar) {
        this.f16829a = commentPromotionWidget;
        this.f16830b = ccVar;
    }

    public final void onClick(View view) {
        this.f16829a.mo13688a(this.f16830b, view);
    }
}
