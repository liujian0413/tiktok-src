package com.p280ss.android.ugc.aweme.account.login.viewmodel;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a.C22164a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;

/* renamed from: com.ss.android.ugc.aweme.account.login.viewmodel.b */
final /* synthetic */ class C22171b implements OnClickListener {

    /* renamed from: a */
    private final C23278c f59224a;

    C22171b(C23278c cVar) {
        this.f59224a = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f59224a.mo57183a(C22164a.m73599a("vk"));
    }
}
