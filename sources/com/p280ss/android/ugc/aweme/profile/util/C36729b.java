package com.p280ss.android.ugc.aweme.profile.util;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.util.b */
public final class C36729b {
    /* renamed from: a */
    private static String m118405a(int i) {
        if (i == 0) {
            return "aweme/v1/aweme/post";
        }
        if (i == 1) {
            return "aweme/v1/aweme/favorite";
        }
        StringBuilder sb = new StringBuilder("urlTagByType/");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m118406a(int i, String str) {
        C1592h.m7855a((Callable<TResult>) new C36734g<TResult>(i, str), (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m118411b(int i, String str) throws Exception {
        try {
            C22984d a = C22984d.m75611a().mo59970a("request_type", i).mo59973a("to_user_id", str);
            C6907h.m21524a("aweme_profile_list_request_data", (Map) a.f60753a);
            StringBuilder sb = new StringBuilder("request:");
            sb.append(m118405a(i));
            C6921a.m21552a(4, sb.toString(), a.f60753a.toString());
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m118407a(int i, String str, FeedItemList feedItemList) {
        C1592h.m7855a((Callable<TResult>) new C36733f<TResult>(i, str, feedItemList), (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m118413b(int i, boolean z, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        C6877n.m21447a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    /* renamed from: a */
    public static void m118408a(int i, boolean z, int i2) {
        C1592h.m7855a((Callable<TResult>) new C36732e<TResult>(i, z, i2), (Executor) C6907h.m21516a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m118412b(int r4, java.lang.String r5, com.p280ss.android.ugc.aweme.feed.model.FeedItemList r6) throws java.lang.Exception {
        /*
            r0 = 0
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_type"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59970a(r2, r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "to_user_id"
            com.ss.android.ugc.aweme.app.g.d r5 = r1.mo59973a(r2, r5)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x003a
            java.util.List r1 = r6.getItems()     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            java.lang.String r1 = "size"
            java.util.List r2 = r6.getItems()     // Catch:{ Exception -> 0x0081 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0081 }
            com.ss.android.ugc.aweme.app.g.d r1 = r5.mo59970a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r6.logPb     // Catch:{ Exception -> 0x0081 }
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59972a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x0081 }
            r1.mo59973a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x005c
        L_0x003a:
            java.lang.String r1 = "is_empty"
            java.lang.String r2 = "true"
            com.ss.android.ugc.aweme.app.g.d r1 = r5.mo59973a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_id"
            if (r6 == 0) goto L_0x004b
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x0081 }
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = ""
        L_0x004d:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "log_pb"
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r6.logPb     // Catch:{ Exception -> 0x0081 }
            goto L_0x0059
        L_0x0058:
            r3 = r0
        L_0x0059:
            r1.mo59972a(r2, r3)     // Catch:{ Exception -> 0x0081 }
        L_0x005c:
            java.lang.String r1 = "aweme_profile_list_response_data"
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f60753a     // Catch:{ Exception -> 0x0081 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0081
            r6 = 4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "response:"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = m118405a(r4)     // Catch:{ Exception -> 0x0081 }
            r1.append(r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0081 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r6, r4, r5)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36729b.m118412b(int, java.lang.String, com.ss.android.ugc.aweme.feed.model.FeedItemList):java.lang.Object");
    }

    /* renamed from: b */
    static final /* synthetic */ Object m118414b(int i, boolean z, Exception exc) throws Exception {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            String str3 = "errorMsg";
            if (exc instanceof ApiServerException) {
                str2 = ((ApiServerException) exc).getResponse();
            } else {
                str2 = exc.toString();
            }
            jSONObject.put(str3, str2);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        C6877n.m21447a("aweme_favorite_list_data_log", jSONObject2);
        StringBuilder sb = new StringBuilder("response:fail:");
        sb.append(m118405a(i));
        String sb2 = sb.toString();
        C22984d a = C22984d.m75611a().mo59972a("loadMore", (Object) Boolean.valueOf(z));
        String str4 = "errorMsg";
        if (exc instanceof ApiServerException) {
            str = ((ApiServerException) exc).getResponse();
        } else {
            str = exc.toString();
        }
        C6921a.m21552a(4, sb2, a.mo59973a(str4, str).f60753a.toString());
        return null;
    }

    /* renamed from: a */
    public static void m118410a(int i, boolean z, Exception exc) {
        C1592h.m7855a((Callable<TResult>) new C36731d<TResult>(i, z, exc), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m118404a(int i, int i2, boolean z, int i3, long j, long j2, int i4) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("status_code", i);
            jSONObject.put("pageType", i2);
            jSONObject.put("loadMore", z);
            jSONObject.put("hasMore", String.valueOf(i3));
            jSONObject.put("maxCursor", String.valueOf(j));
            jSONObject.put("minCursor", String.valueOf(j2));
            jSONObject.put("listCount", String.valueOf(i4));
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject.toString());
        } catch (JSONException unused) {
        }
        C6877n.m21447a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    /* renamed from: a */
    public static void m118409a(int i, boolean z, int i2, int i3, long j, long j2, int i4) {
        C36730c cVar = new C36730c(0, i, z, i3, j, j2, i4);
        C1592h.m7855a((Callable<TResult>) cVar, (Executor) C6907h.m21516a());
    }
}
