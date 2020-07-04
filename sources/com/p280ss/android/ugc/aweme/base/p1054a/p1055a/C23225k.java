package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.account.login.C21639w;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.k */
public final class C23225k implements C21639w {

    /* renamed from: a */
    private Context f61214a;

    public C23225k(Context context) {
        this.f61214a = context;
    }

    /* renamed from: a */
    public final void mo57856a(String str) {
        C23220f.m76239a(null, C7285c.m22838a(this.f61214a, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", new Object[]{str});
    }

    /* renamed from: b */
    public final String mo57858b(String str) {
        return (String) C23220f.m76240a(null, null, C7285c.m22838a(this.f61214a, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", "java.lang.String", new Object[]{str});
    }

    /* renamed from: a */
    public final void mo57857a(boolean z) {
        C23220f.m76239a(null, C7285c.m22838a(this.f61214a, "LoginSharePreferences", 0), "save_login_info", "boolean", new Object[]{Boolean.valueOf(z)});
    }

    /* renamed from: b */
    public final boolean mo57859b(boolean z) {
        return ((Boolean) C23220f.m76240a(null, null, C7285c.m22838a(this.f61214a, "LoginSharePreferences", 0), "save_login_info", "boolean", "boolean", new Object[]{Boolean.valueOf(true)})).booleanValue();
    }
}
