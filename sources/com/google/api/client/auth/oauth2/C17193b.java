package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.C17196d.C17197a;
import com.google.api.client.http.C17261l;
import com.google.api.client.http.C17266o;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.api.client.auth.oauth2.b */
public final class C17193b {

    /* renamed from: a */
    static final Pattern f47897a = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    /* renamed from: com.google.api.client.auth.oauth2.b$a */
    static final class C17194a implements C17197a {
        C17194a() {
        }

        /* renamed from: a */
        public final String mo44478a(C17266o oVar) {
            List<String> list = oVar.f48097b.authorization;
            if (list != null) {
                for (String str : list) {
                    if (str.startsWith("Bearer ")) {
                        return str.substring(7);
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo44479a(C17266o oVar, String str) throws IOException {
            String str2;
            C17261l lVar = oVar.f48097b;
            String valueOf = String.valueOf("Bearer ");
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            lVar.mo44620b(str2);
        }
    }

    /* renamed from: a */
    public static C17197a m57053a() {
        return new C17194a();
    }
}
