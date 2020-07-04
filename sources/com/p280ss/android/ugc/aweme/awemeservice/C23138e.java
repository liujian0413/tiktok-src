package com.p280ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.C23132a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.e */
public final class C23138e implements IRequestIdService {

    /* renamed from: a */
    private Map<String, C23132a> f61069a = new ConcurrentHashMap();

    public final C23132a getRequestIdAndIndex(String str) {
        C23132a aVar = (C23132a) this.f61069a.get(str);
        if (aVar == null) {
            return new C23132a();
        }
        return aVar;
    }

    public final String getRequestId(Aweme aweme, int i) {
        if (aweme == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append(i);
        C23132a requestIdAndIndex = getRequestIdAndIndex(sb.toString());
        if (requestIdAndIndex != null) {
            return requestIdAndIndex.f61058a;
        }
        return "";
    }

    public final JSONObject getRequestIdAndOrderJsonObject(Aweme aweme, int i) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append(i);
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            C23132a requestIdAndIndex = getRequestIdAndIndex(sb2);
            String str2 = requestIdAndIndex.f61058a;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("request_id", str2);
            }
            if (requestIdAndIndex.f61059b != null) {
                jSONObject.put(POIService.KEY_ORDER, requestIdAndIndex.f61059b);
            }
            String str3 = "is_photo";
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put(str3, str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public final void setRequestIdAndIndex(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f61069a.put(str, new C23132a(str2, i));
        }
    }
}
