package com.p280ss.android.ugc.aweme.comment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.e */
final /* synthetic */ class C24100e implements OnClickListener {

    /* renamed from: a */
    private final C24093d f63729a;

    /* renamed from: b */
    private final String f63730b;

    /* renamed from: c */
    private final String f63731c;

    C24100e(C24093d dVar, String str, String str2) {
        this.f63729a = dVar;
        this.f63730b = str;
        this.f63731c = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63729a.mo62482a(this.f63730b, this.f63731c, view);
    }
}
