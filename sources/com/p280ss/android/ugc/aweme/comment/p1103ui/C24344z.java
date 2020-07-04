package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.z */
final /* synthetic */ class C24344z implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f64262a;

    C24344z(KeyboardDialogFragment keyboardDialogFragment) {
        this.f64262a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64262a.mo63166c(view);
    }
}
