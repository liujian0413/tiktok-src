package com.p280ss.android.ugc.aweme.commercialize.link.micro;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24804a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.micro.a */
final class C24800a extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private C24804a f65302a;

    /* renamed from: a */
    public final void mo64830a() {
        if (this.f65302a != null) {
            this.f65302a.mo64610a();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f65302a != null) {
            this.f65302a.mo64611b();
        }
    }
}
