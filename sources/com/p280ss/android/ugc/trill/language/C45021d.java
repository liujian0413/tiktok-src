package com.p280ss.android.ugc.trill.language;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;

/* renamed from: com.ss.android.ugc.trill.language.d */
final /* synthetic */ class C45021d implements OnClickListener {

    /* renamed from: a */
    private final ContentLanguageAdapter f115721a;

    /* renamed from: b */
    private final ContentLanguage f115722b;

    C45021d(ContentLanguageAdapter contentLanguageAdapter, ContentLanguage contentLanguage) {
        this.f115721a = contentLanguageAdapter;
        this.f115722b = contentLanguage;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f115721a.mo107517a(this.f115722b, dialogInterface, i);
    }
}
