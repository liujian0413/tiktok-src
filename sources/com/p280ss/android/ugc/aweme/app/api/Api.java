package com.p280ss.android.ugc.aweme.app.api;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.ApiException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.EmptyResponseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.ResponseWrongFormatException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.services.ApiMonitorService;
import com.p280ss.android.ugc.aweme.utils.C43010ce;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.Api */
public final class Api {

    /* renamed from: a */
    public static final String f60501a = C6399b.m19926b().f18690a;

    /* renamed from: b */
    public static final String f60502b;

    /* renamed from: c */
    public static final String f60503c;

    /* renamed from: d */
    public static final String f60504d;

    /* renamed from: e */
    public static final String f60505e;

    /* renamed from: f */
    public static final String f60506f;

    /* renamed from: g */
    private static NetApi f60507g;

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$NetApi */
    interface NetApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str, @C6461l List<C12461b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$a */
    static class C22797a<T> implements C22799c<List<T>> {

        /* renamed from: a */
        public Class<T> f60508a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<T> mo59831a(Object obj) throws Exception {
            if (obj instanceof JSONArray) {
                try {
                    return JSON.parseArray(obj.toString(), this.f60508a);
                } catch (Throwable th) {
                    throw new JSONParseException(th);
                }
            } else {
                throw new ResponseWrongFormatException();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$b */
    public static class C22798b<T> implements C22799c<T> {

        /* renamed from: b */
        static final C6600e f60509b;

        /* renamed from: a */
        Class<T> f60510a;

        static {
            C6607f createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.mo15985a((C6717s) new MusicTypeAdapterFactory());
            createAdapterGsonBuilder.mo15985a((C6717s) new UserTypeAdapterFactory());
            f60509b = createAdapterGsonBuilder.mo15992f();
        }

        public C22798b(Class<T> cls) {
            this.f60510a = cls;
        }

        /* renamed from: a */
        public final T mo59831a(Object obj) throws Exception {
            BaseResponse.class.isAssignableFrom(this.f60510a);
            try {
                T a = f60509b.mo15974a(obj.toString(), this.f60510a);
                if (!(a instanceof BaseResponse)) {
                    return a;
                }
                try {
                    return ((BaseResponse) a).checkValid();
                } catch (ApiServerException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new ApiException(-1, th);
                }
            } catch (Throwable th2) {
                throw new JSONParseException(th2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$c */
    public interface C22799c<T> {
        /* renamed from: a */
        T mo59831a(Object obj) throws Exception;
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$d */
    public static class C22800d implements C22799c<String> {

        /* renamed from: a */
        static final C22800d f60511a = new C22800d();

        private C22800d() {
        }

        /* renamed from: a */
        public static C22800d m75221a() {
            return f60511a;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo59831a(Object obj) throws Exception {
            return m75222b(obj);
        }

        /* renamed from: b */
        private static String m75222b(Object obj) throws Exception {
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m75216a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
                return true;
            }
            if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
                return true;
            }
            if (jSONObject.has("message") && TextUtils.equals("success", jSONObject.optString("message"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m75214a(String str, String str2) throws Exception {
        if (!C6319n.m19593a(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (!m75216a(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        throw new ApiServerException(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
                    }
                }
                ApiServerException url = new ApiServerException(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            return;
        }
        throw new EmptyResponseException();
    }

    /* renamed from: a */
    public static void m75215a(JSONObject jSONObject, String str, String str2) throws Exception {
        if (C6319n.m19593a(str)) {
            throw new EmptyResponseException();
        } else if (!m75216a(jSONObject)) {
            if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    throw new ApiServerException(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
                }
            }
            ApiServerException url = new ApiServerException(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
            url.setBlockCode(jSONObject.optInt("block_code"));
            throw url;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f60501a);
        f60502b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f60502b);
        sb2.append("/aweme/v1/upload/image/");
        f60503c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f60502b);
        sb3.append("/aweme/v1/upload/image/");
        f60504d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f60502b);
        sb4.append("/aweme/v1/weibo/bind/");
        f60505e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f60502b);
        sb5.append("/aweme/v1/friend/register/notice/");
        f60506f = sb5.toString();
    }

    /* renamed from: a */
    public static <T> T m75212a(String str, C22799c<T> cVar, String str2, String str3) throws Exception {
        if (cVar == null) {
            throw new IllegalArgumentException("Parser can't be null");
        } else if (!C6319n.m19593a(str)) {
            T jSONObject = new JSONObject(str);
            if (!m75216a(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                        throw new ApiServerException(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str3);
                    }
                }
                ApiServerException url = new ApiServerException(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str3);
                url.setBlockCode(jSONObject.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw url;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return cVar.mo59831a(jSONObject.opt(str2));
                }
                if ((cVar instanceof C22798b) && ((C22798b) cVar).f60510a == null) {
                    return jSONObject;
                }
                if (!(cVar instanceof C22797a) || ((C22797a) cVar).f60508a != null) {
                    return cVar.mo59831a(str);
                }
                return jSONObject;
            } catch (Exception e) {
                C43010ce.m136511a((Throwable) e, str3, str);
                return null;
            }
        } else {
            throw new EmptyResponseException();
        }
    }

    /* renamed from: a */
    public static <T> T m75213a(String str, Class<T> cls, String str2, boolean z, String str3) throws Exception {
        return m75206a(0, str, cls, str2, (C6810f) null);
    }

    /* renamed from: a */
    public static <T> T m75206a(int i, String str, Class<T> cls, String str2, C6810f fVar) throws Exception {
        if (String.class.equals(cls)) {
            return m75205a(i, str, (C22799c<T>) C22800d.m75221a(), str2, fVar);
        }
        return m75205a(i, str, (C22799c<T>) new C22798b<T>(cls), str2, fVar);
    }

    /* renamed from: a */
    private static <T> T m75208a(String str, int i, String str2, C22799c<T> cVar, String str3) throws Exception {
        if (C22805a.m75224a(C6399b.m19921a())) {
            return m75212a(NetworkUtils.postFile(i, str, "file", str2), cVar, str3, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    private static <T> T m75205a(int i, String str, C22799c<T> cVar, String str2, C6810f fVar) throws Exception {
        C6809a[] a;
        if (C22805a.m75224a(C6399b.m19921a()) || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (f60507g == null) {
                f60507g = (NetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (fVar != null) {
                for (C6809a aVar : fVar.mo16639a()) {
                    arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
                }
            }
            try {
                return m75212a((String) f60507g.doGet(str, arrayList).get(), cVar, str2, str);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static <T> T m75210a(String str, int i, String str2, Class<T> cls, String str3) throws Exception {
        if (String.class.equals(cls)) {
            return m75208a(str, i, str2, (C22799c<T>) C22800d.m75221a(), str3);
        }
        return m75208a(str, i, str2, (C22799c<T>) new C22798b<T>(cls), str3);
    }

    /* renamed from: a */
    private static <T> T m75209a(String str, int i, String str2, C22799c<T> cVar, String str3, List<C19565e> list) throws Exception {
        if (C22805a.m75224a(C6399b.m19921a())) {
            return m75212a(NetworkUtils.postFile(i, str, "file", str2, list), cVar, str3, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    public static <T> T m75211a(String str, int i, String str2, Class<T> cls, String str3, List<C19565e> list) throws Exception {
        if (String.class.equals(cls)) {
            return m75208a(str, i, str2, (C22799c<T>) C22800d.m75221a(), str3);
        }
        return m75209a(str, i, str2, (C22799c<T>) new C22798b<T>(cls), str3, list);
    }

    /* renamed from: a */
    public static <T> T m75207a(int i, String str, Class<T> cls, String str2, C6810f fVar, boolean z, String str3) throws Exception {
        return m75206a(i, str, cls, str2, fVar);
    }
}
