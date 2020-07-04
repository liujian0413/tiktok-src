package com.bytedance.opensdk.core.p620a.p621a;

import com.bytedance.opensdk.core.p620a.C12288a;
import com.bytedance.opensdk.core.p620a.p622b.C12297c;
import com.bytedance.opensdk.core.p620a.p623c.C12300c;
import com.bytedance.opensdk.core.p620a.p623c.C12301d;
import com.bytedance.opensdk.p619b.C12267b;
import com.bytedance.opensdk.p619b.C12280k;
import com.bytedance.opensdk.p619b.C12285o;
import com.google.gson.C18373n;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.LinkedHashMap;
import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.core.a.a.c */
public final class C12293c extends C12289a<C12297c> {

    /* renamed from: com.bytedance.opensdk.core.a.a.c$a */
    static final class C12294a extends Lambda implements C7562b<String, C12288a> {

        /* renamed from: a */
        final /* synthetic */ C12293c f32646a;

        C12294a(C12293c cVar) {
            this.f32646a = cVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C12288a invoke(String str) {
            C7573i.m23587b(str, "ticket");
            return C12267b.m35666a(this.f32646a.mo30095a(((C12297c) this.f32646a.f32643a).f32656f, ((C12297c) this.f32646a.f32643a).f32654d, ((C12297c) this.f32646a.f32643a).f32653c, str));
        }
    }

    public C12293c(C12297c cVar) {
        C7573i.m23587b(cVar, "authConfig");
        super(cVar);
    }

    /* renamed from: a */
    public final Object mo30096a(C47919b<? super C12288a> bVar) {
        return C12267b.m35667a(m35727a(((C12297c) this.f32643a).f32655e), (C7562b<? super String, C12288a>) new C12294a<Object,C12288a>(this));
    }

    /* renamed from: a */
    private final C12301d m35727a(int i) {
        C6711m mVar;
        String str;
        String str2;
        try {
            C6709k a = new C18373n().mo47346a(C12280k.f32621a.m35698a(new C12285o(C12280k.m35707c(((C12297c) this.f32643a).f32651a)).mo30087a("aid", i).mo30089a(), new LinkedHashMap(), new LinkedHashMap()));
            C7573i.m23582a((Object) a, "JsonParser().parse(SdkUt….get(urlBuilder.build()))");
            mVar = a.mo16136m();
        } catch (Exception e) {
            mVar = C12267b.m35671a(e, (int) BaseNotice.HASHTAG);
        }
        C7573i.m23582a((Object) mVar, "jsonResp");
        Integer num = null;
        String a2 = C12267b.m35674a(mVar, "message", (String) null);
        if (a2 == null) {
            a2 = "";
        }
        C6711m a3 = C12267b.m35670a(mVar, "data");
        if (a3 != null) {
            str = C12267b.m35674a(a3, "ticket", (String) null);
        } else {
            str = null;
        }
        if (a3 != null) {
            str2 = C12267b.m35674a(a3, "description", (String) null);
        } else {
            str2 = null;
        }
        if (a3 != null) {
            String a4 = C12267b.m35674a(a3, "error_code", (String) null);
            if (a4 != null) {
                Integer d = C7634n.m23706d(a4);
                if (d != null) {
                    num = d;
                    return new C12301d(a2, new C12300c(str2, num, str));
                }
            }
        }
        if (a3 != null) {
            num = Integer.valueOf(C12267b.m35664a(a3, "error_code", -1));
        }
        return new C12301d(a2, new C12300c(str2, num, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.opensdk.core.p620a.p623c.C12299b mo30095a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            T r0 = r6.f32643a
            com.bytedance.opensdk.core.a.b.c r0 = (com.bytedance.opensdk.core.p620a.p622b.C12297c) r0
            java.lang.String r0 = r0.f32652b
            java.lang.String r0 = com.bytedance.opensdk.p619b.C12280k.m35705b(r0)
            com.bytedance.opensdk.b.o r1 = new com.bytedance.opensdk.b.o
            r1.<init>(r0)
            java.lang.String r0 = "client_key"
            com.bytedance.opensdk.b.o r7 = r1.mo30088a(r0, r7)
            java.lang.String r0 = "scope"
            com.bytedance.opensdk.b.o r7 = r7.mo30088a(r0, r8)
            java.lang.String r8 = "response_type"
            com.bytedance.opensdk.b.o r7 = r7.mo30088a(r8, r9)
            java.lang.String r8 = "from"
            java.lang.String r9 = "opensdk"
            com.bytedance.opensdk.b.o r7 = r7.mo30088a(r8, r9)
            java.lang.String r8 = "ticket"
            com.bytedance.opensdk.b.o r7 = r7.mo30088a(r8, r10)
            com.google.gson.n r8 = new com.google.gson.n     // Catch:{ Exception -> 0x0050 }
            r8.<init>()     // Catch:{ Exception -> 0x0050 }
            com.bytedance.opensdk.b.k r0 = com.bytedance.opensdk.p619b.C12280k.f32621a     // Catch:{ Exception -> 0x0050 }
            java.lang.String r1 = r7.mo30089a()     // Catch:{ Exception -> 0x0050 }
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.lang.String r7 = r0.m35698a(r1, new java.util.LinkedHashMap(), new java.util.LinkedHashMap())     // Catch:{ Exception -> 0x0050 }
            com.google.gson.k r7 = r8.mo47346a(r7)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r8 = "JsonParser().parse(SdkUt….get(urlBuilder.build()))"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)     // Catch:{ Exception -> 0x0050 }
            com.google.gson.m r7 = r7.mo16136m()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r7 = move-exception
            r8 = 201(0xc9, float:2.82E-43)
            com.google.gson.m r7 = com.bytedance.opensdk.p619b.C12267b.m35671a(r7, r8)
        L_0x0057:
            java.lang.String r8 = "jsonResp"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.lang.String r8 = "message"
            r9 = 2
            r10 = 0
            java.lang.String r8 = com.bytedance.opensdk.p619b.C12267b.m35674a(r7, r8, (java.lang.String) null)
            if (r8 != 0) goto L_0x0068
            java.lang.String r8 = ""
        L_0x0068:
            java.lang.String r0 = "data"
            com.google.gson.m r7 = com.bytedance.opensdk.p619b.C12267b.m35670a(r7, r0)
            if (r7 == 0) goto L_0x0077
            java.lang.String r0 = "code"
            java.lang.String r0 = com.bytedance.opensdk.p619b.C12267b.m35674a(r7, r0, (java.lang.String) null)
            goto L_0x0078
        L_0x0077:
            r0 = r10
        L_0x0078:
            if (r7 == 0) goto L_0x0081
            java.lang.String r1 = "description"
            java.lang.String r1 = com.bytedance.opensdk.p619b.C12267b.m35674a(r7, r1, (java.lang.String) null)
            goto L_0x0082
        L_0x0081:
            r1 = r10
        L_0x0082:
            if (r7 == 0) goto L_0x0092
            java.lang.String r2 = "error_code"
            java.lang.String r2 = com.bytedance.opensdk.p619b.C12267b.m35674a(r7, r2, (java.lang.String) null)
            if (r2 == 0) goto L_0x0092
            java.lang.Integer r2 = kotlin.text.C7634n.m23706d(r2)
            if (r2 != 0) goto L_0x00a1
        L_0x0092:
            if (r7 == 0) goto L_0x00a0
            java.lang.String r2 = "error_code"
            r3 = -1
            int r2 = com.bytedance.opensdk.p619b.C12267b.m35664a(r7, r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00a1
        L_0x00a0:
            r2 = r10
        L_0x00a1:
            if (r7 == 0) goto L_0x00a9
            java.lang.String r3 = "state"
            java.lang.String r10 = com.bytedance.opensdk.p619b.C12267b.m35674a(r7, r3, (java.lang.String) null)
        L_0x00a9:
            com.bytedance.opensdk.core.a.c.a r7 = new com.bytedance.opensdk.core.a.c.a
            r7.<init>(r0, r10, r1, r2)
            com.bytedance.opensdk.core.a.c.b r9 = new com.bytedance.opensdk.core.a.c.b
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.p620a.p621a.C12293c.mo30095a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.bytedance.opensdk.core.a.c.b");
    }
}
