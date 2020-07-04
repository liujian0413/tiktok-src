package com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson;

import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6712o;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.gson.IntegerDefaultZeroAdater */
public class IntegerDefaultZeroAdater implements C6708j<Integer>, C6714q<Integer> {
    /* renamed from: a */
    private static C6709k m103649a(Integer num, Type type, C6713p pVar) {
        return new C6712o((Number) num);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6709k mo10404a(Object obj, Type type, C6713p pVar) {
        return m103649a((Integer) obj, type, pVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        return m103650b(kVar, type, iVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:5|6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer m103650b(com.google.gson.C6709k r0, java.lang.reflect.Type r1, com.google.gson.C6610i r2) throws com.google.gson.JsonParseException {
        /*
            java.lang.String r1 = r0.mo15998c()     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x001e }
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = r0.mo15998c()     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = "null"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x001e
        L_0x0018:
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x001e }
            return r1
        L_0x001e:
            int r0 = r0.mo16003g()     // Catch:{ NumberFormatException -> 0x0027 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson.IntegerDefaultZeroAdater.m103650b(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Integer");
    }
}
