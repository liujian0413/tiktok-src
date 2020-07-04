package com.p280ss.android.ugc.aweme.effectplatform;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.q */
public final class C27499q implements C43720b {
    /* renamed from: a */
    public final InputStream mo70656a(C43707b bVar) {
        C12534t tVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InputStream inputStream = null;
        try {
            Pair a = C10191k.m30270a(bVar.f113169a, (Map<String, String>) linkedHashMap);
            String str = (String) a.first;
            String str2 = (String) a.second;
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str).create(EffectNetworkAPI.class);
            linkedHashMap.put("game_version", "1.0");
            if ("POST".equals(bVar.f113170b)) {
                tVar = effectNetworkAPI.doPost(true, Integer.MAX_VALUE, str2, bVar.f113173e).execute();
            } else {
                tVar = effectNetworkAPI.doGet(true, Integer.MAX_VALUE, str2, linkedHashMap).execute();
            }
            if (!tVar.mo30512c()) {
                return null;
            }
            InputStream in = ((TypedInput) tVar.f33302b).mo10444in();
            try {
                bVar.f113171c = ((TypedInput) tVar.f33302b).length();
                return in;
            } catch (IOException e) {
                e = e;
                inputStream = in;
                bVar.f113175g = e.getMessage();
                return inputStream;
            } catch (Exception e2) {
                e = e2;
                inputStream = in;
                bVar.f113175g = e.getMessage();
                return inputStream;
            }
        } catch (IOException e3) {
            e = e3;
            bVar.f113175g = e.getMessage();
            return inputStream;
        } catch (Exception e4) {
            e = e4;
            bVar.f113175g = e.getMessage();
            return inputStream;
        }
    }
}
