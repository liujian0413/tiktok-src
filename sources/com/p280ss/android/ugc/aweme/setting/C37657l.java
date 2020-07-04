package com.p280ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.common.util.C19290j;

/* renamed from: com.ss.android.ugc.aweme.setting.l */
final /* synthetic */ class C37657l implements OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f98124a;

    /* renamed from: b */
    private final C19290j f98125b;

    C37657l(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C19290j jVar) {
        this.f98124a = i18nSettingManageMyAccountActivity;
        this.f98125b = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f98124a.mo94802a(this.f98125b, dialogInterface, i);
    }
}
