package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10122c;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.ttuploader.TTExternNetLoader;
import com.p280ss.ttuploader.TTExternNetLoaderListener;
import com.p280ss.ttuploader.TTExternRequestInfo;
import com.p280ss.ttuploader.TTExternResponseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gc */
public final class C39937gc implements TTExternNetLoader {

    /* renamed from: a */
    private C12466b<String> f103724a;

    public final void cancelTask() {
        if (this.f103724a != null) {
            this.f103724a.cancel();
        }
    }

    /* renamed from: a */
    private static List<C12461b> m127753a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            arrayList.add(new C12461b(str, jSONObject.optString(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m127754a(List<C12461b> list) {
        if (list == null && list.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < list.size(); i++) {
            C12461b bVar = (C12461b) list.get(i);
            try {
                jSONObject.put(bVar.f33095a, bVar.f33096b);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static String m127752a(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            optString = jSONObject.optString(str.toLowerCase(), null);
        }
        return optString;
    }

    public final int sendRequest(TTExternRequestInfo tTExternRequestInfo, final TTExternNetLoaderListener tTExternNetLoaderListener) {
        TypedOutput typedOutput;
        TypedOutput typedOutput2;
        String url = tTExternRequestInfo.getUrl();
        if (!C6319n.m19593a(url)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Pair a = C10191k.m30270a(url, (Map<String, String>) linkedHashMap);
                String str = (String) a.second;
                IUploadFileApi iUploadFileApi = (IUploadFileApi) RetrofitUtils.m37904b((String) a.first).mo30492a(IUploadFileApi.class);
                JSONObject requestHeader = tTExternRequestInfo.getRequestHeader();
                String a2 = m127752a(requestHeader, "Content-Type");
                List a3 = m127753a(requestHeader);
                C10122c extraInfo = tTExternRequestInfo.getExtraInfo();
                String lowerCase = tTExternRequestInfo.getMethod().toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != 102230) {
                    if (hashCode != 111375) {
                        if (hashCode == 3446944 && lowerCase.equals("post")) {
                            c = 1;
                        }
                    } else if (lowerCase.equals("put")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("get")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        this.f103724a = iUploadFileApi.doGet(false, -1, str, linkedHashMap, a3, extraInfo);
                        break;
                    case 1:
                        byte[] data = tTExternRequestInfo.getData();
                        if (data != null) {
                            typedOutput = new TypedByteArray(a2, data, new String[0]);
                        } else {
                            TypedByteArray typedByteArray = new TypedByteArray(a2, TEVideoRecorder.FACE_BEAUTY_NULL.getBytes(), new String[0]);
                            if (TextUtils.isEmpty(a2)) {
                                a3.add(new C12461b("Content-Type", "application/unknown"));
                            }
                            typedOutput = typedByteArray;
                        }
                        this.f103724a = iUploadFileApi.postBody(-1, typedOutput, str, linkedHashMap, a3, extraInfo);
                        break;
                    case 2:
                        byte[] data2 = tTExternRequestInfo.getData();
                        if (data2 != null) {
                            typedOutput2 = new TypedByteArray(a2, data2, new String[0]);
                        } else {
                            TypedByteArray typedByteArray2 = new TypedByteArray(a2, TEVideoRecorder.FACE_BEAUTY_NULL.getBytes(), new String[0]);
                            if (TextUtils.isEmpty(a2)) {
                                a3.add(new C12461b("Content-Type", "application/unknown"));
                            }
                            typedOutput2 = typedByteArray2;
                        }
                        this.f103724a = iUploadFileApi.doPut(-1, typedOutput2, str, linkedHashMap, a3, extraInfo);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Method(");
                        sb.append(lowerCase);
                        sb.append(") is unsupported.");
                        throw new IllegalArgumentException(sb.toString());
                }
                this.f103724a.enqueue(new C12474e<String>() {
                    /* renamed from: a */
                    public final void mo26464a(C12466b<String> bVar, Throwable th) {
                        tTExternNetLoaderListener.onFailed(bVar.request().f33098b, th);
                    }

                    /* renamed from: a */
                    public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                        TTExternResponseInfo tTExternResponseInfo = new TTExternResponseInfo();
                        tTExternResponseInfo.setStatusCode(tVar.mo30510a());
                        tTExternResponseInfo.setResponseBody(((String) tVar.f33302b).getBytes());
                        tTExternResponseInfo.setResponseHeader(C39937gc.m127754a(tVar.mo30511b()));
                        tTExternResponseInfo.setUrl(bVar.request().f33098b);
                        tTExternNetLoaderListener.onComplete(tTExternResponseInfo);
                    }
                });
                return 0;
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder("Request url(");
                sb2.append(url);
                sb2.append(") is invalid.");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Request url(");
            sb3.append(url);
            sb3.append(") is null or empty.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
