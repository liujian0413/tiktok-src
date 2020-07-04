package com.p280ss.android.ugc.aweme.i18n.language.initial;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.language.C7120e;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.c */
final /* synthetic */ class C30481c implements OnClickListener {

    /* renamed from: a */
    private final InitialChooseLanguageDialogAdapter f80085a;

    /* renamed from: b */
    private final C7120e f80086b;

    C30481c(InitialChooseLanguageDialogAdapter initialChooseLanguageDialogAdapter, C7120e eVar) {
        this.f80085a = initialChooseLanguageDialogAdapter;
        this.f80086b = eVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f80085a.mo80156a(this.f80086b, view);
    }
}
