package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.web.p583b.C11110e;
import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a */
public final class C25980a implements C11110e {

    /* renamed from: a */
    public static final C25980a f68692a = new C25980a();

    /* renamed from: b */
    private static C43470b f68693b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final CommonApi f68694c = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$a */
    static final class C25981a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f68695a;

        /* renamed from: b */
        final /* synthetic */ Map f68696b;

        C25981a(String str, Map map) {
            this.f68695a = str;
            this.f68696b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C25998e call() {
            String a = C25980a.f68692a.mo67430a(this.f68695a, null);
            C43469a aVar = new C43469a("get", C25980a.f68692a.mo67430a(this.f68695a, null), null);
            try {
                ArrayList arrayList = new ArrayList();
                for (Entry entry : this.f68696b.entrySet()) {
                    arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                }
                String str = (String) C25980a.f68694c.doGet(a, null, (List<C12461b>) arrayList).execute().f33302b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("_raw", str);
                jSONObject.put("response", new JSONObject(str));
                Api.m75214a(str, a);
                return new C25998e(aVar, new C43471c(jSONObject, null));
            } catch (HttpResponseException e) {
                JSONObject jSONObject2 = new JSONObject();
                C25980a.f68692a.mo67431a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
                return new C25998e(aVar, new C43471c(jSONObject2, e));
            } catch (ApiServerException e2) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e2.getResponse());
                } catch (JSONException unused) {
                }
                C25980a aVar2 = C25980a.f68692a;
                int errorCode = e2.getErrorCode();
                String errorMsg = e2.getErrorMsg();
                String prompt = e2.getPrompt();
                C7573i.m23582a((Object) prompt, "apiReturnWrong.prompt");
                aVar2.mo67431a(jSONObject3, 0, errorCode, errorMsg, prompt, "");
                return new C25998e(aVar, new C43471c(jSONObject3, e2));
            } catch (Exception e3) {
                JSONObject jSONObject4 = new JSONObject();
                C25980a.f68692a.mo67431a(jSONObject4, 0, -408, e3.getMessage(), "", "");
                return new C25998e(aVar, new C43471c(jSONObject4, e3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$b */
    static final class C25982b<TTaskResult, TContinuationResult> implements C1591g<C25998e, Void> {

        /* renamed from: a */
        final /* synthetic */ C11111a f68697a;

        C25982b(C11111a aVar) {
            this.f68697a = aVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e> r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.web.jsbridge.a.a$b r0 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.m85344a()
                r1 = 0
                if (r0 == 0) goto L_0x002d
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r2)
                boolean r2 = r5.mo6882b()
                if (r2 == 0) goto L_0x002d
                java.lang.Object r2 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r2 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r2
                if (r2 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.web.jsbridge.a.a$a r2 = r2.f68723a
                goto L_0x001e
            L_0x001d:
                r2 = r1
            L_0x001e:
                java.lang.Object r3 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r3 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r3
                if (r3 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r3 = r3.f68724b
                goto L_0x002a
            L_0x0029:
                r3 = r1
            L_0x002a:
                r0.mo61496a(r2, r3)
            L_0x002d:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Object r5 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r5 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r5
                if (r5 == 0) goto L_0x0041
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r5 = r5.f68724b
                if (r5 == 0) goto L_0x0041
                org.json.JSONObject r5 = r5.f112577a
                goto L_0x0042
            L_0x0041:
                r5 = r1
            L_0x0042:
                if (r5 == 0) goto L_0x008f
                java.lang.String r0 = "code"
                java.lang.Object r0 = r5.opt(r0)
                r2 = 1
                boolean r3 = r0 instanceof java.lang.Integer
                if (r3 != 0) goto L_0x0050
                goto L_0x008f
            L_0x0050:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r2 != r0) goto L_0x008f
                com.bytedance.ies.web.b.e$a r0 = r4.f68697a
                com.bytedance.ies.web.b.e$b r2 = new com.bytedance.ies.web.b.e$b
                r2.<init>()
                java.lang.String r3 = "response"
                java.lang.Object r5 = r5.opt(r3)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r3 = kotlin.text.C48038d.f122880a
                if (r5 == 0) goto L_0x0087
                byte[] r5 = r5.getBytes(r3)
                java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.C7573i.m23582a(r5, r3)
                r2.mo27093a(r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Map r5 = (java.util.Map) r5
                r2.mo27092a(r5)
                r0.mo27089a(r2)
                goto L_0x008f
            L_0x0087:
                kotlin.TypeCastException r5 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x008f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.C25982b.then(bolts.h):java.lang.Void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$c */
    static final class C25983c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f68698a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f68699b;

        /* renamed from: c */
        final /* synthetic */ String f68700c;

        /* renamed from: d */
        final /* synthetic */ Map f68701d;

        C25983c(String str, JSONObject jSONObject, String str2, Map map) {
            this.f68698a = str;
            this.f68699b = jSONObject;
            this.f68700c = str2;
            this.f68701d = map;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f1, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0116, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0117, code lost:
            r2 = new org.json.JSONObject();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r2.put("code", 0);
            r3 = new org.json.JSONObject();
            r3.put("errCode", r0.getStatusCode());
            r3.put("message", r0.getMessage());
            r2.put("error", r3);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0116 A[ExcHandler: HttpResponseException (r0v2 'e' com.ss.android.http.legacy.client.HttpResponseException A[CUSTOM_DECLARE]), Splitter:B:1:0x001d] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e call() {
            /*
                r14 = this;
                com.ss.android.ugc.aweme.crossplatform.prefetch.a r0 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.f68692a
                java.lang.String r1 = r14.f68698a
                r2 = 0
                java.lang.String r0 = r0.mo67430a(r1, r2)
                com.ss.android.ugc.aweme.web.jsbridge.a.a$a r1 = new com.ss.android.ugc.aweme.web.jsbridge.a.a$a
                java.lang.String r3 = "post"
                com.ss.android.ugc.aweme.crossplatform.prefetch.a r4 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.f68692a
                java.lang.String r5 = r14.f68698a
                java.lang.String r4 = r4.mo67430a(r5, r2)
                org.json.JSONObject r5 = r14.f68699b
                r1.<init>(r3, r4, r5)
                java.lang.String r3 = ""
                r4 = 0
                java.lang.String r5 = r14.f68700c     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r6 = 1
                if (r5 == 0) goto L_0x0071
                com.ss.android.ugc.aweme.utils.cr r5 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                org.json.JSONObject r7 = r14.f68699b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r8 = r14.f68700c     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Map r9 = r14.f68701d     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                if (r9 == 0) goto L_0x0064
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                int r11 = r9.size()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r10.<init>(r11)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Set r9 = r9.entrySet()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
            L_0x003f:
                boolean r11 = r9.hasNext()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                if (r11 == 0) goto L_0x0060
                java.lang.Object r11 = r9.next()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.bytedance.retrofit2.a.b r12 = new com.bytedance.retrofit2.a.b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.Object r13 = r11.getKey()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.Object r11 = r11.getValue()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r12.<init>(r13, r11)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r10.add(r12)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                goto L_0x003f
            L_0x0060:
                r9 = r10
                java.util.List r9 = (java.util.List) r9     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                goto L_0x0065
            L_0x0064:
                r9 = r2
            L_0x0065:
                java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.List r9 = kotlin.collections.C7525m.m23509d(r9)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r0 = r5.mo104700b(r0, r7, r8, r9)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r3 = r0
                goto L_0x00ca
            L_0x0071:
                java.util.HashMap r5 = new java.util.HashMap     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r5.<init>()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                org.json.JSONObject r7 = r14.f68699b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                if (r7 == 0) goto L_0x00a5
                org.json.JSONObject r7 = r14.f68699b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Iterator r7 = r7.keys()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
            L_0x0080:
                boolean r8 = r7.hasNext()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                if (r8 == 0) goto L_0x00a5
                java.lang.Object r8 = r7.next()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                org.json.JSONObject r9 = r14.f68699b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r10 = ""
                java.lang.String r9 = r9.optString(r8, r10)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r10 = r5
                java.util.Map r10 = (java.util.Map) r10     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r11 = "key"
                kotlin.jvm.internal.C7573i.m23582a(r8, r11)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r11 = "value"
                kotlin.jvm.internal.C7573i.m23582a(r9, r11)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r10.put(r8, r9)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                goto L_0x0080
            L_0x00a5:
                r7 = r5
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.p280ss.android.common.applog.NetUtil.putCommonParams(r7, r6)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.ss.android.ugc.aweme.crossplatform.prefetch.a r7 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.f68692a     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.ss.android.ugc.aweme.net.CommonApi r7 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.f68694c     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r8 = r14.f68698a     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.bytedance.retrofit2.b r5 = r7.doPost(r8, r5)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.bytedance.retrofit2.t r5 = r5.execute()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                T r5 = r5.f33302b     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r7 = "JS_API.doPost(url, map).execute().body()"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.p280ss.android.ugc.aweme.app.api.Api.m75214a(r5, r0)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00ee }
                r3 = r5
            L_0x00ca:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r0.<init>()     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r5 = "code"
                r0.put(r5, r6)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r5 = "response"
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r6.<init>(r3)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r0.put(r5, r6)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                java.lang.String r5 = "_raw"
                r0.put(r5, r3)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r5 = new com.ss.android.ugc.aweme.crossplatform.prefetch.e     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r6 = new com.ss.android.ugc.aweme.web.jsbridge.a.a$c     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r6.<init>(r0, r2)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                r5.<init>(r1, r6)     // Catch:{ HttpResponseException -> 0x0116, Exception -> 0x00f1 }
                goto L_0x0149
            L_0x00ee:
                r0 = move-exception
                r3 = r5
                goto L_0x00f2
            L_0x00f1:
                r0 = move-exception
            L_0x00f2:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r5 = "code"
                r2.put(r5, r4)     // Catch:{ JSONException -> 0x010b }
                java.lang.String r4 = "response"
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010b }
                r5.<init>(r3)     // Catch:{ JSONException -> 0x010b }
                r2.put(r4, r5)     // Catch:{ JSONException -> 0x010b }
                java.lang.String r4 = "_raw"
                r2.put(r4, r3)     // Catch:{ JSONException -> 0x010b }
            L_0x010b:
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r5 = new com.ss.android.ugc.aweme.crossplatform.prefetch.e
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r3 = new com.ss.android.ugc.aweme.web.jsbridge.a.a$c
                r3.<init>(r2, r0)
                r5.<init>(r1, r3)
                goto L_0x0149
            L_0x0116:
                r0 = move-exception
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "code"
                r2.put(r3, r4)     // Catch:{ JSONException -> 0x013d }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013d }
                r3.<init>()     // Catch:{ JSONException -> 0x013d }
                java.lang.String r4 = "errCode"
                int r5 = r0.getStatusCode()     // Catch:{ JSONException -> 0x013d }
                r3.put(r4, r5)     // Catch:{ JSONException -> 0x013d }
                java.lang.String r4 = "message"
                java.lang.String r5 = r0.getMessage()     // Catch:{ JSONException -> 0x013d }
                r3.put(r4, r5)     // Catch:{ JSONException -> 0x013d }
                java.lang.String r4 = "error"
                r2.put(r4, r3)     // Catch:{ JSONException -> 0x013d }
            L_0x013d:
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r5 = new com.ss.android.ugc.aweme.crossplatform.prefetch.e
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r3 = new com.ss.android.ugc.aweme.web.jsbridge.a.a$c
                java.lang.Exception r0 = (java.lang.Exception) r0
                r3.<init>(r2, r0)
                r5.<init>(r1, r3)
            L_0x0149:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.C25983c.call():com.ss.android.ugc.aweme.crossplatform.prefetch.e");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$d */
    static final class C25984d<TTaskResult, TContinuationResult> implements C1591g<C25998e, Void> {

        /* renamed from: a */
        final /* synthetic */ C11111a f68702a;

        C25984d(C11111a aVar) {
            this.f68702a = aVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e> r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.web.jsbridge.a.a$b r0 = com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.m85344a()
                r1 = 0
                if (r0 == 0) goto L_0x0027
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r2)
                java.lang.Object r2 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r2 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r2
                if (r2 == 0) goto L_0x0017
                com.ss.android.ugc.aweme.web.jsbridge.a.a$a r2 = r2.f68723a
                goto L_0x0018
            L_0x0017:
                r2 = r1
            L_0x0018:
                java.lang.Object r3 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r3 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r3
                if (r3 == 0) goto L_0x0023
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r3 = r3.f68724b
                goto L_0x0024
            L_0x0023:
                r3 = r1
            L_0x0024:
                r0.mo61496a(r2, r3)
            L_0x0027:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Object r5 = r5.mo6890e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.e r5 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r5
                if (r5 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r5 = r5.f68724b
                if (r5 == 0) goto L_0x003b
                org.json.JSONObject r5 = r5.f112577a
                goto L_0x003c
            L_0x003b:
                r5 = r1
            L_0x003c:
                if (r5 == 0) goto L_0x0089
                java.lang.String r0 = "code"
                java.lang.Object r0 = r5.opt(r0)
                r2 = 1
                boolean r3 = r0 instanceof java.lang.Integer
                if (r3 != 0) goto L_0x004a
                goto L_0x0089
            L_0x004a:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r2 != r0) goto L_0x0089
                com.bytedance.ies.web.b.e$a r0 = r4.f68702a
                com.bytedance.ies.web.b.e$b r2 = new com.bytedance.ies.web.b.e$b
                r2.<init>()
                java.lang.String r3 = "response"
                java.lang.Object r5 = r5.opt(r3)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r3 = kotlin.text.C48038d.f122880a
                if (r5 == 0) goto L_0x0081
                byte[] r5 = r5.getBytes(r3)
                java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.C7573i.m23582a(r5, r3)
                r2.mo27093a(r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Map r5 = (java.util.Map) r5
                r2.mo27092a(r5)
                r0.mo27089a(r2)
                goto L_0x0089
            L_0x0081:
                kotlin.TypeCastException r5 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x0089:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.C25984d.then(bolts.h):java.lang.Void");
        }
    }

    private C25980a() {
    }

    /* renamed from: a */
    public static C43470b m85344a() {
        return f68693b;
    }

    /* renamed from: a */
    public final String mo67430a(String str, JSONObject jSONObject) {
        C19290j jVar = new C19290j(str);
        m85345a(jVar, "request_tag_from", "h5");
        String a = jVar.mo51184a();
        C7573i.m23582a((Object) a, "urlBuilder.build()");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m85345a(com.p280ss.android.common.util.C19290j r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.util.List<com.ss.android.http.legacy.a.e> r0 = r4.f52191a
            r1 = 1
            if (r0 == 0) goto L_0x002f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x002f
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            com.ss.android.http.legacy.a.e r2 = (com.p280ss.android.http.legacy.p296a.C19565e) r2
            java.lang.String r3 = "pair"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.mo51722a()
            boolean r2 = kotlin.text.C7634n.m23717a(r5, r2, r1)
            if (r2 == 0) goto L_0x0013
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x0035
            r4.mo51188a(r5, r6)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25980a.m85345a(com.ss.android.common.util.j, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo11522a(String str, Map<String, String> map, C11111a aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "headers");
        C7573i.m23587b(aVar, "callback");
        C1592h.m7853a((Callable<TResult>) new C25981a<TResult>(str, map)).mo6876a((C1591g<TResult, TContinuationResult>) new C25982b<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    private static void m85346a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("prompts", str2);
            if (str != null) {
                jSONObject.put("message", str);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo11523a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C11111a aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "headers");
        C7573i.m23587b(str2, "mimeType");
        C7573i.m23587b(jSONObject, "postData");
        C7573i.m23587b(aVar, "callback");
        C1592h.m7853a((Callable<TResult>) new C25983c<TResult>(str, jSONObject, str2, map)).mo6876a((C1591g<TResult, TContinuationResult>) new C25984d<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo67431a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m85346a(jSONObject2, i2, str, str2, str3);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
