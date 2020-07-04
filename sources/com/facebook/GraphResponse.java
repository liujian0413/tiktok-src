package com.facebook;

import com.C1642a;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13967z;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GraphResponse {

    /* renamed from: g */
    private static final String f34700g = "GraphResponse";

    /* renamed from: a */
    public final HttpURLConnection f34701a;

    /* renamed from: b */
    public final JSONObject f34702b;

    /* renamed from: c */
    public final JSONArray f34703c;

    /* renamed from: d */
    public final FacebookRequestError f34704d;

    /* renamed from: e */
    public final String f34705e;

    /* renamed from: f */
    public final GraphRequest f34706f;

    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    public String toString() {
        String str;
        int i;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            if (this.f34701a != null) {
                i = this.f34701a.getResponseCode();
            } else {
                i = C34943c.f91127w;
            }
            objArr[0] = Integer.valueOf(i);
            str = C1642a.m8035a(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.f34702b);
        sb.append(", error: ");
        sb.append(this.f34704d);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static List<GraphResponse> m38316a(HttpURLConnection httpURLConnection, C14064l lVar) {
        InputStream a;
        InputStream inputStream = null;
        try {
            if (C13499h.m39713b()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    a = httpURLConnection.getErrorStream();
                } else {
                    a = C14117m.m41686a(httpURLConnection);
                }
                inputStream = a;
                return m38314a(inputStream, httpURLConnection, lVar);
            }
            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (FacebookException e) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
            return m38318a((List<GraphRequest>) lVar, httpURLConnection, e);
        } catch (Exception e2) {
            C13949t.m41131a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m38318a((List<GraphRequest>) lVar, httpURLConnection, new FacebookException((Throwable) e2));
        } finally {
            C13967z.m41239a(inputStream);
        }
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    /* renamed from: a */
    private static List<GraphResponse> m38314a(InputStream inputStream, HttpURLConnection httpURLConnection, C14064l lVar) throws FacebookException, JSONException, IOException {
        String a = C13967z.m41221a(inputStream);
        C13949t.m41131a(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m38315a(a, httpURLConnection, lVar);
    }

    /* renamed from: a */
    private static List<GraphResponse> m38315a(String str, HttpURLConnection httpURLConnection, C14064l lVar) throws FacebookException, JSONException, IOException {
        List<GraphResponse> a = m38317a(httpURLConnection, (List<GraphRequest>) lVar, new JSONTokener(str).nextValue());
        C13949t.m41131a(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", lVar.f37145d, Integer.valueOf(str.length()), a);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.GraphResponse> m38317a(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) throws com.facebook.FacebookException, org.json.JSONException {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0051
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r4 = move-exception
            com.facebook.GraphResponse r5 = new com.facebook.GraphResponse
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
            goto L_0x0051
        L_0x0043:
            r4 = move-exception
            com.facebook.GraphResponse r5 = new com.facebook.GraphResponse
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
        L_0x0051:
            r5 = r9
        L_0x0052:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0097
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0097
        L_0x005e:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0096
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            com.facebook.GraphResponse r3 = m38313a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            goto L_0x0093
        L_0x0076:
            r3 = move-exception
            com.facebook.GraphResponse r4 = new com.facebook.GraphResponse
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L_0x0093
        L_0x0085:
            r3 = move-exception
            com.facebook.GraphResponse r4 = new com.facebook.GraphResponse
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0096:
            return r1
        L_0x0097:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.m38317a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    static List<GraphResponse> m38318a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new GraphResponse((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    /* renamed from: a */
    private static GraphResponse m38313a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m38246a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                if (a.f34654d == 190 && C13967z.m41247a(graphRequest.f34673c)) {
                    if (a.f34655e != 493) {
                        AccessToken.m38229a((AccessToken) null);
                    } else if (!AccessToken.m38225a().mo31748d()) {
                        AccessToken.m38233c();
                    }
                }
                return new GraphResponse(graphRequest, httpURLConnection, a);
            }
            Object a2 = C13967z.m41216a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new GraphResponse(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new GraphResponse(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder("Got unexpected object type in response, class: ");
        sb.append(obj.getClass().getSimpleName());
        throw new FacebookException(sb.toString());
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f34706f = graphRequest;
        this.f34701a = httpURLConnection;
        this.f34705e = str;
        this.f34702b = jSONObject;
        this.f34703c = jSONArray;
        this.f34704d = facebookRequestError;
    }
}
