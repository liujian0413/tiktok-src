package com.p280ss.android.ugc.trill.language;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;

/* renamed from: com.ss.android.ugc.trill.language.c */
final /* synthetic */ class C45020c implements OnClickListener {

    /* renamed from: a */
    private final ContentLanguageAdapter f115718a;

    /* renamed from: b */
    private final ContentLanguage f115719b;

    /* renamed from: c */
    private final int f115720c;

    C45020c(ContentLanguageAdapter contentLanguageAdapter, ContentLanguage contentLanguage, int i) {
        this.f115718a = contentLanguageAdapter;
        this.f115719b = contentLanguage;
        this.f115720c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115718a.mo107516a(this.f115719b, this.f115720c, view);
    }
}
