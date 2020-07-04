package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30489i;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.u */
final class C23235u implements C30489i {

    /* renamed from: a */
    private Context f61234a;

    /* renamed from: b */
    private SharedPreferences f61235b = C7285c.m22838a(this.f61234a, "InitialChooseLanguagePreferences", 0);

    /* renamed from: a */
    public final int mo60441a(int i) {
        return this.f61235b.getInt("languageDialogShowState", 0);
    }

    /* renamed from: b */
    public final void mo60442b(int i) {
        Editor edit = this.f61235b.edit();
        edit.putInt("languageDialogShowState", i);
        edit.apply();
    }

    public C23235u(Context context) {
        this.f61234a = context;
    }
}
