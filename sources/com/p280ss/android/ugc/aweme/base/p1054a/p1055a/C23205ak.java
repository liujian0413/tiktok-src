package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.model.IVerifyActionCache;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ak */
final class C23205ak implements IVerifyActionCache {

    /* renamed from: a */
    private Context f61185a;

    /* renamed from: b */
    private SharedPreferences f61186b = C7285c.m22838a(this.f61185a, "VerifyActionManager", 0);

    public final String getVerifyAction() {
        return this.f61186b.getString("verify_action", "");
    }

    public final void setVerifyAction(String str) {
        Editor edit = this.f61186b.edit();
        edit.putString("verify_action", str);
        edit.apply();
    }

    public C23205ak(Context context) {
        this.f61185a = context;
    }
}
