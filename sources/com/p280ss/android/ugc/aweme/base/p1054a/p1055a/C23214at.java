package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.C43212e.C43213a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.at */
final class C23214at implements C43213a {

    /* renamed from: a */
    private Context f61203a;

    /* renamed from: b */
    private SharedPreferences f61204b = C7285c.m22838a(this.f61203a, "HashtagConfig", 0);

    /* renamed from: a */
    public final String mo60409a(String str) {
        return this.f61204b.getString("hash_tag_regex", str);
    }

    /* renamed from: b */
    public final void mo60410b(String str) {
        Editor edit = this.f61204b.edit();
        edit.putString("hash_tag_regex", str);
        edit.apply();
    }

    public C23214at(Context context) {
        this.f61203a = context;
    }
}
