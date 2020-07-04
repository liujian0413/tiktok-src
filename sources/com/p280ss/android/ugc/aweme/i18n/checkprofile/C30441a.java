package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.a */
final /* synthetic */ class C30441a implements OnClickListener {

    /* renamed from: a */
    private final CheckProfileActivity f79977a;

    C30441a(CheckProfileActivity checkProfileActivity) {
        this.f79977a = checkProfileActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f79977a.mo80111a(view);
    }
}
