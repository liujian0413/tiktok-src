package com.p280ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.commercialize.model.C25001j;
import com.p280ss.android.ugc.aweme.commercialize.star.C25088b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;

/* renamed from: com.ss.android.ugc.aweme.app.services.m */
public final class C23044m implements C33022h {

    /* renamed from: com.ss.android.ugc.aweme.app.services.m$a */
    static class C23045a {

        /* renamed from: a */
        public static final C23044m f60811a = new C23044m();
    }

    /* renamed from: a */
    public static C23044m m75725a() {
        return C23045a.f60811a;
    }

    /* renamed from: b */
    public final boolean mo60018b() {
        return C25088b.m82631c();
    }

    /* renamed from: a */
    public final C25001j mo60015a(String str) {
        return CommerceSettingsApi.m80551a(str);
    }

    /* renamed from: a */
    public final boolean mo60016a(Context context, String str, String str2) {
        return C25371n.m83459a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo60017a(Context context, String str, boolean z) {
        return C25371n.m83463a(context, str, false);
    }
}
