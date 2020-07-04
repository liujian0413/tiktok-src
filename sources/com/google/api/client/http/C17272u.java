package com.google.api.client.http;

import com.p280ss.android.ugc.aweme.policy.Policy;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.http.u */
public abstract class C17272u {

    /* renamed from: a */
    static final Logger f48133a = Logger.getLogger(C17272u.class.getName());

    /* renamed from: b */
    private static final String[] f48134b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C17275x mo44581a(String str, String str2) throws IOException;

    /* renamed from: a */
    public final C17267p mo44664a() {
        return mo44665a((C17268q) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17266o mo44666b() {
        return new C17266o(this, null);
    }

    static {
        String[] strArr = {Policy.ACTION_DELETE, "GET", "POST", "PUT"};
        f48134b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final C17267p mo44665a(C17268q qVar) {
        return new C17267p(this, qVar);
    }

    /* renamed from: a */
    public boolean mo44582a(String str) throws IOException {
        if (Arrays.binarySearch(f48134b, str) >= 0) {
            return true;
        }
        return false;
    }
}
