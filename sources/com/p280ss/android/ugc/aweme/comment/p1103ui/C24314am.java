package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.am */
final /* synthetic */ class C24314am implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f64218a;

    C24314am(KeyboardDialogFragment keyboardDialogFragment) {
        this.f64218a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64218a.mo63168d(view);
    }
}
