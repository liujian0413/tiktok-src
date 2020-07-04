package com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson;

import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6712o;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.gson.BooleanDefaultFalseAdapter */
public class BooleanDefaultFalseAdapter implements C6708j<Boolean>, C6714q<Boolean> {
    /* renamed from: a */
    private static C6709k m103645a(Boolean bool, Type type, C6713p pVar) {
        return new C6712o(bool);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6709k mo10404a(Object obj, Type type, C6713p pVar) {
        return m103645a((Boolean) obj, type, pVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        return m103646b(kVar, type, iVar);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m103646b(com.google.gson.C6709k r1, java.lang.reflect.Type r2, com.google.gson.C6610i r3) throws com.google.gson.JsonParseException {
        /*
            java.lang.String r2 = r1.mo15998c()     // Catch:{ Exception -> 0x004b }
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x004b }
            r3 = 0
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.mo15998c()     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = "null"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x004b }
            if (r2 == 0) goto L_0x001a
            goto L_0x0046
        L_0x001a:
            java.lang.Number r2 = r1.mo15997b()     // Catch:{ Exception -> 0x004b }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x004b }
            if (r2 == 0) goto L_0x0041
            int r2 = r1.mo16003g()     // Catch:{ Exception -> 0x004b }
            if (r2 != 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            java.lang.Number r2 = r1.mo15997b()     // Catch:{ Exception -> 0x004b }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x004b }
            r3 = 1
            if (r2 == r3) goto L_0x003c
            int r2 = r1.mo16003g()     // Catch:{ Exception -> 0x004b }
            if (r2 != r3) goto L_0x004b
        L_0x003c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004b }
            return r2
        L_0x0041:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004b }
            return r2
        L_0x0046:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004b }
            return r2
        L_0x004b:
            boolean r1 = r1.mo16004h()     // Catch:{ UnsupportedOperationException -> 0x0054 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0054 }
            return r1
        L_0x0054:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson.BooleanDefaultFalseAdapter.m103646b(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Boolean");
    }
}
