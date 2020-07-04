package com.p280ss.android.ugc.aweme.p759ac;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.retrofit2.p637a.C12462c;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.util.ArrayList;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ac.a */
public final class C15458a {

    /* renamed from: a */
    public static final C15458a f39771a = new C15458a();

    /* renamed from: b */
    private static final String f39772b = f39772b;

    /* renamed from: c */
    private static final C6600e f39773c = new C6600e();

    /* renamed from: d */
    private static final String f39774d = f39774d;

    /* renamed from: e */
    private static ArrayList<Integer> f39775e;

    /* renamed from: f */
    private static final ArrayList<String> f39776f = C7525m.m23468d("/service/1/update_token/", "/aweme/v1/aweme/detail/", "/aweme/v1/user/", "/aweme/v1/abtest/param/", "/aweme/v1/commerce/settings", "/aweme/v1/feed/", "/aweme/v1/settings/", "/aweme/v1/story/", "/aweme/v1/user/settings/", "/aweme/v1/im/cloud/token/", "/aweme/v1/upload/contacts/", "/aweme/v1/aweme/post/", "/aweme/v1/poi/search/", "/aweme/v1/user/", "/aweme/v1/commit/follow/user/", "/aweme/v1/multi/aweme/detail/", "/aweme/v1/comment/publish/", "/aweme/v1/general/search/", "/passport/user/logout/", "/aweme/v1/commit/item/digg/", "/aweme/v1/poi/vertical/aweme/", "/user/mobile/reset_password/", "/passport/auth/login/", "/aweme/v1/create/aweme/", "/aweme/v1/recommend/user/", "/aweme/v2/comment/list/", "/passport/mobile/login/", "/aweme/v1/user/follower/list/", "/aweme/v1/notice/count/", "/aweme/v1/friend/feed/", "/aweme/v1/aweme/stats/", "/aweme/v1/hot/search/list/", "/aweme/v1/recommend/challenge/");

    private C15458a() {
    }

    /* renamed from: a */
    private static ArrayList<Integer> m45264a() {
        if (f39775e == null) {
            synchronized (f39771a) {
                if (f39775e != null) {
                    ArrayList<Integer> arrayList = f39775e;
                    return arrayList;
                }
                f39775e = new ArrayList<>();
                for (String str : f39776f) {
                    ArrayList<Integer> arrayList2 = f39775e;
                    if (arrayList2 == null) {
                        C7573i.m23580a();
                    }
                    arrayList2.add(Integer.valueOf(str.hashCode()));
                }
            }
        }
        return f39775e;
    }

    /* renamed from: a */
    public final void mo39010a(C12462c cVar, Exception exc) {
        String str;
        C7573i.m23587b(cVar, "request");
        C7573i.m23587b(exc, "ex");
        ArrayList a = m45264a();
        int hashCode = cVar.mo30444b().hashCode();
        if (a != null && a.contains(Integer.valueOf(hashCode))) {
            try {
                if (exc instanceof HttpResponseException) {
                    StringBuilder sb = new StringBuilder("status_code=");
                    sb.append(((HttpResponseException) exc).getStatusCode());
                    sb.append(",message=");
                    sb.append(exc.getMessage());
                    str = sb.toString();
                } else if (exc instanceof CronetIOException) {
                    StringBuilder sb2 = new StringBuilder("status_code=");
                    sb2.append(((CronetIOException) exc).getStatusCode());
                    sb2.append(",message=");
                    sb2.append(exc.getMessage());
                    sb2.append(",traceCode=");
                    sb2.append(((CronetIOException) exc).getTraceCode());
                    sb2.append(",requestLog=");
                    sb2.append(((CronetIOException) exc).getRequestLog());
                    sb2.append(",requestInfo=");
                    sb2.append(f39773c.mo15979b((Object) ((CronetIOException) exc).getRequestInfo()));
                    str = sb2.toString();
                } else {
                    str = exc.getMessage();
                }
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", cVar.mo30444b());
                jSONObject.put("response", str);
                jSONObject.put("request", f39773c.mo15979b((Object) cVar));
                C6893q.m21452b(f39774d, "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
