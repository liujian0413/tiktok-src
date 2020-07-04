package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32303g.C32304a;
import com.p280ss.android.ugc.aweme.sec.C37411e;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser */
public final class ResponseExtraParser {

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel */
    static class OldErrorModel {
        Data data;

        /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data */
        static class Data {
            String description;
            int error_code;

            Data() {
            }
        }

        OldErrorModel() {
        }
    }

    /* renamed from: a */
    public static C32303g m104815a(ApiServerException apiServerException) {
        return new C32303g(m104819b(apiServerException), -1);
    }

    /* renamed from: b */
    private static C32304a m104819b(ApiServerException apiServerException) {
        C32304a aVar = new C32304a();
        aVar.f84382a = apiServerException.getErrorCode();
        aVar.f84383b = apiServerException.getErrorMsg();
        aVar.f84384c = apiServerException.getPrompt();
        return aVar;
    }

    /* renamed from: a */
    private static C32303g m104814a(BaseResponse baseResponse) {
        long j;
        if (baseResponse == null) {
            return null;
        }
        C32304a aVar = new C32304a();
        aVar.f84382a = baseResponse.status_code;
        aVar.f84383b = baseResponse.status_msg;
        if (baseResponse.extra != null) {
            j = baseResponse.extra.now;
        } else {
            j = -1;
        }
        return new C32303g(aVar, j);
    }

    /* renamed from: a */
    public static C32303g m104813a(C12534t tVar) {
        C32303g gVar;
        if (tVar == null) {
            return null;
        }
        T t = tVar.f33302b;
        if (t != null) {
            if (t instanceof BaseResponse) {
                return m104814a((BaseResponse) t);
            }
            if (t instanceof String) {
                return m104817a(t.toString());
            }
            if (t instanceof FeedItemList) {
                return m104816a((FeedItemList) t);
            }
        }
        if (tVar.f33301a == null || tVar.f33301a.f33122e == null) {
            return null;
        }
        C12461b a = tVar.f33301a.mo30450a("Transfer-Encoding");
        if (a != null && "chunked".equalsIgnoreCase(a.f33096b)) {
            return null;
        }
        try {
            System.currentTimeMillis();
            gVar = m104817a(C37411e.m120037a(tVar.f33301a));
        } catch (Throwable unused) {
            gVar = null;
        }
        return gVar;
    }

    /* renamed from: a */
    private static C32303g m104816a(FeedItemList feedItemList) {
        long j;
        if (feedItemList == null) {
            return null;
        }
        C32304a aVar = new C32304a();
        int i = feedItemList.status_code;
        if (i == 0) {
            i = feedItemList.error_code;
        }
        aVar.f84382a = i;
        aVar.f84383b = feedItemList.status_msg;
        if (feedItemList.extra != null) {
            j = feedItemList.extra.now;
        } else {
            j = -1;
        }
        return new C32303g(aVar, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e4 A[SYNTHETIC, Splitter:B:67:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb A[SYNTHETIC, Splitter:B:75:0x00eb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32303g m104817a(java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.gson.stream.a r0 = new com.google.gson.stream.a     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            r2.<init>(r12)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            com.google.gson.stream.JsonToken r2 = r0.mo16088f()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r2 != r3) goto L_0x0021
            r0.mo16092j()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return r1
        L_0x0021:
            r2 = 1
            r0.f19170a = r2     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a r3 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r3.<init>()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r4 = -1
            r0.mo16084c()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r6 = 3
            r7 = 0
            r8 = r4
            r4 = 3
            r5 = 0
        L_0x0033:
            boolean r10 = r0.mo16087e()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x00d0
            if (r4 <= 0) goto L_0x00d0
            java.lang.String r10 = r0.mo16089g()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            int r11 = r10.hashCode()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            switch(r11) {
                case -891699686: goto L_0x006f;
                case 96965648: goto L_0x0065;
                case 248339892: goto L_0x005b;
                case 954925063: goto L_0x0051;
                case 1635686852: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
        L_0x0046:
            goto L_0x0079
        L_0x0047:
            java.lang.String r11 = "error_code"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0079
            r10 = 0
            goto L_0x007a
        L_0x0051:
            java.lang.String r11 = "message"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0079
            r10 = 4
            goto L_0x007a
        L_0x005b:
            java.lang.String r11 = "status_msg"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0079
            r10 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r11 = "extra"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0079
            r10 = 3
            goto L_0x007a
        L_0x006f:
            java.lang.String r11 = "status_code"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0079
            r10 = 1
            goto L_0x007a
        L_0x0079:
            r10 = -1
        L_0x007a:
            switch(r10) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b3;
                case 3: goto L_0x008f;
                case 4: goto L_0x0081;
                default: goto L_0x007d;
            }     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
        L_0x007d:
            r0.mo16096n()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            goto L_0x0033
        L_0x0081:
            java.lang.String r10 = r0.mo16090h()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            java.lang.String r11 = "error"
            boolean r10 = r11.equals(r10)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0033
        L_0x008f:
            r0.mo16084c()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
        L_0x0092:
            boolean r10 = r0.mo16087e()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x00af
            java.lang.String r10 = "now"
            java.lang.String r11 = r0.mo16089g()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 == 0) goto L_0x00ab
            long r8 = r0.mo16094l()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            int r4 = r4 + -1
            goto L_0x0092
        L_0x00ab:
            r0.mo16096n()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            goto L_0x0092
        L_0x00af:
            r0.mo16086d()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            goto L_0x0033
        L_0x00b3:
            java.lang.String r10 = r0.mo16090h()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r3.f84383b = r10     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            int r4 = r4 + -1
            goto L_0x0033
        L_0x00bd:
            int r10 = r3.f84382a     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            if (r10 > 0) goto L_0x00cb
            int r10 = r0.mo16095m()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r3.f84382a = r10     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            int r4 = r4 + -1
            goto L_0x0033
        L_0x00cb:
            r0.mo16096n()     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            goto L_0x0033
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            m104818a(r12, r3)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
        L_0x00d5:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g r12 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.g     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r12.<init>(r3, r8)     // Catch:{ Throwable -> 0x00e9, all -> 0x00de }
            r0.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            return r12
        L_0x00de:
            r12 = move-exception
            goto L_0x00e2
        L_0x00e0:
            r12 = move-exception
            r0 = r1
        L_0x00e2:
            if (r0 == 0) goto L_0x00e7
            r0.close()     // Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            throw r12
        L_0x00e8:
            r0 = r1
        L_0x00e9:
            if (r0 == 0) goto L_0x00ee
            r0.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m104817a(java.lang.String):com.ss.android.ugc.aweme.lancet.ssretrofitchain.g");
    }

    /* renamed from: a */
    private static void m104818a(String str, C32304a aVar) {
        int i;
        String str2;
        OldErrorModel oldErrorModel = (OldErrorModel) new C6600e().mo15974a(str, OldErrorModel.class);
        if (oldErrorModel.data == null) {
            i = 0;
        } else {
            i = oldErrorModel.data.error_code;
        }
        aVar.f84382a = i;
        if (oldErrorModel.data == null) {
            str2 = null;
        } else {
            str2 = oldErrorModel.data.description;
        }
        aVar.f84383b = str2;
    }
}
