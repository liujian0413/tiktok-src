package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ah */
final /* synthetic */ class C24309ah implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f64213a;

    C24309ah(KeyboardDialogFragment keyboardDialogFragment) {
        this.f64213a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64213a.mo63177h(view);
    }
}
