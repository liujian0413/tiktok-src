package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.av */
final /* synthetic */ class C32886av implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f85824a;

    /* renamed from: b */
    private final TextView f85825b;

    C32886av(MainFragment mainFragment, TextView textView) {
        this.f85824a = mainFragment;
        this.f85825b = textView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85824a.mo84441a(this.f85825b, view);
    }
}
