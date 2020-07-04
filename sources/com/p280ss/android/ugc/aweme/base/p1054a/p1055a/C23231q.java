package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.discover.presenter.C26815b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.q */
final class C23231q implements C26815b {

    /* renamed from: a */
    private Context f61226a;

    /* renamed from: b */
    private SharedPreferences f61227b = C7285c.m22838a(this.f61226a, "HotSearchCache", 0);

    /* renamed from: a */
    public final String mo60429a() {
        return this.f61227b.getString("hot_search_words", "");
    }

    public C23231q(Context context) {
        this.f61226a = context;
    }

    /* renamed from: a */
    public final void mo60430a(String str) {
        Editor edit = this.f61227b.edit();
        edit.putString("hot_search_words", str);
        edit.apply();
    }
}
