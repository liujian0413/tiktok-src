package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.applinks.a */
public class C13193a {

    /* renamed from: e */
    private static final String f34944e = C13193a.class.getCanonicalName();

    /* renamed from: a */
    public String f34945a;

    /* renamed from: b */
    public Uri f34946b;

    /* renamed from: c */
    public Bundle f34947c;

    /* renamed from: d */
    public String f34948d;

    /* renamed from: f */
    private JSONObject f34949f;

    /* renamed from: com.facebook.applinks.a$a */
    public interface C13195a {
        /* renamed from: a */
        void mo32382a(C13193a aVar);
    }

    private C13193a() {
    }

    /* renamed from: a */
    private static Bundle m38568a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, m38568a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(str, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = m38568a(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(str, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(str, strArr);
                    } else {
                        throw new FacebookException("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private static C13193a m38569a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C38347c.f99551f);
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                C13193a aVar = new C13193a();
                aVar.f34949f = jSONObject.getJSONObject("method_args");
                if (aVar.f34949f.has("ref")) {
                    aVar.f34945a = aVar.f34949f.getString("ref");
                } else if (aVar.f34949f.has("referer_data")) {
                    JSONObject jSONObject2 = aVar.f34949f.getJSONObject("referer_data");
                    if (jSONObject2.has("fb_ref")) {
                        aVar.f34945a = jSONObject2.getString("fb_ref");
                    }
                }
                if (aVar.f34949f.has("target_url")) {
                    aVar.f34946b = Uri.parse(aVar.f34949f.getString("target_url"));
                }
                if (aVar.f34949f.has("extras")) {
                    JSONObject jSONObject3 = aVar.f34949f.getJSONObject("extras");
                    if (jSONObject3.has("deeplink_context")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("deeplink_context");
                        if (jSONObject4.has("promo_code")) {
                            aVar.f34948d = jSONObject4.getString("promo_code");
                        }
                    }
                }
                aVar.f34947c = m38568a(aVar.f34949f);
                return aVar;
            }
        } catch (JSONException e) {
            C13967z.m41242a(f34944e, "Unable to parse AppLink JSON", (Throwable) e);
        } catch (FacebookException e2) {
            C13967z.m41242a(f34944e, "Unable to parse AppLink JSON", (Throwable) e2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m38570a(Context context, C13195a aVar) {
        m38572b(context, null, aVar);
    }

    /* renamed from: b */
    private static void m38572b(Context context, String str, final C13195a aVar) {
        C13876aa.m40978a((Object) context, "context");
        C13876aa.m40978a((Object) aVar, "completionHandler");
        final String a = C13967z.m41219a(context);
        C13876aa.m40978a((Object) a, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        C13499h.m39719e().execute(new Runnable() {
            public final void run() {
                C13193a.m38571a(applicationContext, a, aVar);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:30:0x00a4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m38571a(android.content.Context r7, java.lang.String r8, com.facebook.applinks.C13193a.C13195a r9) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "DEFERRED_APP_LINK"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00c0 }
            com.facebook.internal.b r1 = com.facebook.internal.C13892b.m41018a(r7)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r2 = com.facebook.appevents.AppEventsLogger.m38360b(r7)     // Catch:{ JSONException -> 0x00c0 }
            boolean r3 = com.facebook.C13499h.m39714b(r7)     // Catch:{ JSONException -> 0x00c0 }
            com.facebook.internal.C13967z.m41245a(r0, r1, r2, r3)     // Catch:{ JSONException -> 0x00c0 }
            android.content.Context r1 = com.facebook.C13499h.m39721g()     // Catch:{ JSONException -> 0x00c0 }
            com.facebook.internal.C13967z.m41244a(r0, r1)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r1 = "application_package_name"
            java.lang.String r7 = r7.getPackageName()     // Catch:{ JSONException -> 0x00c0 }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r7 = "%s/activities"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.String r7 = com.C1642a.m8034a(r7, r1)
            r8 = 0
            com.facebook.GraphRequest r7 = com.facebook.GraphRequest.m38253a(r8, r7, r0, r8)     // Catch:{ Exception -> 0x00bb }
            com.facebook.GraphResponse r7 = r7.mo31788a()     // Catch:{ Exception -> 0x00bb }
            org.json.JSONObject r7 = r7.f34702b     // Catch:{ Exception -> 0x00bb }
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "applink_args"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = "click_time"
            r2 = -1
            long r4 = r7.optLong(r1, r2)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = "applink_class"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r6 = "applink_url"
            java.lang.String r7 = r7.optString(r6)     // Catch:{ Exception -> 0x00bb }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00bb }
            if (r6 != 0) goto L_0x00bb
            com.facebook.applinks.a r0 = m38569a(r0)     // Catch:{ Exception -> 0x00bb }
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0088
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ JSONException -> 0x0087 }
            if (r8 == 0) goto L_0x0077
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
            r8.put(r2, r4)     // Catch:{ JSONException -> 0x0087 }
        L_0x0077:
            android.os.Bundle r8 = r0.f34947c     // Catch:{ JSONException -> 0x0087 }
            if (r8 == 0) goto L_0x0088
            android.os.Bundle r8 = r0.f34947c     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
            java.lang.String r3 = java.lang.Long.toString(r4)     // Catch:{ JSONException -> 0x0087 }
            r8.putString(r2, r3)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            if (r1 == 0) goto L_0x00a2
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ JSONException -> 0x00a1 }
            if (r8 == 0) goto L_0x0095
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
            r8.put(r2, r1)     // Catch:{ JSONException -> 0x00a1 }
        L_0x0095:
            android.os.Bundle r8 = r0.f34947c     // Catch:{ JSONException -> 0x00a1 }
            if (r8 == 0) goto L_0x00a2
            android.os.Bundle r8 = r0.f34947c     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
            r8.putString(r2, r1)     // Catch:{ JSONException -> 0x00a1 }
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            if (r7 == 0) goto L_0x00bc
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
            if (r8 == 0) goto L_0x00af
            org.json.JSONObject r8 = r0.f34949f     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
            java.lang.String r1 = "com.facebook.platform.APPLINK_NATIVE_URL"
            r8.put(r1, r7)     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
        L_0x00af:
            android.os.Bundle r8 = r0.f34947c     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
            if (r8 == 0) goto L_0x00bc
            android.os.Bundle r8 = r0.f34947c     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
            java.lang.String r1 = "com.facebook.platform.APPLINK_NATIVE_URL"
            r8.putString(r1, r7)     // Catch:{ Exception -> 0x00bc, Exception -> 0x00bc }
            goto L_0x00bc
        L_0x00bb:
            r0 = r8
        L_0x00bc:
            r9.mo32382a(r0)
            return
        L_0x00c0:
            r7 = move-exception
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "An error occurred while preparing deferred app link"
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.applinks.C13193a.m38571a(android.content.Context, java.lang.String, com.facebook.applinks.a$a):void");
    }
}
