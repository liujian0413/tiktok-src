package com.p280ss.android.ugc.aweme.awemeservice.api;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService */
public interface IRequestIdService {

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService$a */
    public static class C23132a {

        /* renamed from: a */
        public final String f61058a;

        /* renamed from: b */
        public final Integer f61059b;

        public C23132a() {
        }

        public C23132a(String str, int i) {
            this.f61058a = str;
            this.f61059b = Integer.valueOf(i);
        }
    }

    String getRequestId(Aweme aweme, int i);

    C23132a getRequestIdAndIndex(String str);

    JSONObject getRequestIdAndOrderJsonObject(Aweme aweme, int i);

    void setRequestIdAndIndex(String str, String str2, int i);
}
