package com.p280ss.android.ugc.aweme.profile.edit.api;

import com.p280ss.android.p281a.p282a.p283a.C6726a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a */
public final class C35750a {

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a$a */
    public interface C35752a {
        /* renamed from: a */
        String mo90618a() throws Exception;

        /* renamed from: b */
        void mo90619b();

        /* renamed from: c */
        void mo90620c();
    }

    /* renamed from: a */
    public static void m115489a(final C35752a aVar) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                boolean z = false;
                try {
                    String a = aVar.mo90618a();
                    if (a != null && a.length() > 0 && new JSONObject(a).getString("status_code").equals("0")) {
                        aVar.mo90619b();
                        z = true;
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    aVar.mo90620c();
                }
            }
        });
    }
}
