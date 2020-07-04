package com.p280ss.android.ugc.aweme.p1664t;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.ies.geckoclient.p570d.C10853b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.t.b */
public final class C42105b implements C10853b {
    /* renamed from: b */
    public final boolean mo26181b(String str, String str2) {
        File file = new File(str2);
        return RetrofitUtils.m37903a(-1, str, file.getParent(), null, file.getName(), null, null, null, null, null, null);
    }

    /* renamed from: a */
    public final String mo26179a(String str, String str2) {
        byte[] bArr;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C10191k.m30270a(str, (Map<String, String>) linkedHashMap);
            String str3 = (String) a.first;
            String str4 = (String) a.second;
            String str5 = "application/json";
            if (str2 != null) {
                Charset forName = Charset.forName("UTF-8");
                C7573i.m23582a((Object) forName, "Charset.forName(charsetName)");
                if (str2 != null) {
                    bArr = str2.getBytes(forName);
                    C7573i.m23582a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                bArr = null;
            }
            T t = ((INetworkApi) RetrofitUtils.m37898a(str3, INetworkApi.class)).postBody(-1, str4, linkedHashMap, new TypedByteArray(str5, bArr, new String[0]), null).execute().f33302b;
            C7573i.m23582a((Object) t, "netWorkApi\n             …                  .body()");
            return (String) t;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo26180a(String str, List<Pair<String, String>> list) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C10191k.m30270a(str, (Map<String, String>) linkedHashMap);
            String str2 = (String) a.first;
            String str3 = (String) a.second;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Pair pair : list) {
                Map map = linkedHashMap2;
                Object obj = pair.first;
                C7573i.m23582a(obj, "it.first");
                Object obj2 = pair.second;
                C7573i.m23582a(obj2, "it.second");
                map.put(obj, obj2);
            }
            T t = ((INetworkApi) RetrofitUtils.m37898a(str2, INetworkApi.class)).doPost(-1, str3, linkedHashMap, linkedHashMap2, null, null).execute().f33302b;
            C7573i.m23582a((Object) t, "netWorkApi\n             …                  .body()");
            return (String) t;
        } catch (Exception unused) {
            return "";
        }
    }
}
