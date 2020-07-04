package com.p280ss.android.ugc.aweme.p1355k.p1357b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.k.b.c */
public final class C32267c {

    /* renamed from: a */
    public static final C32267c f84323a = new C32267c();

    /* renamed from: com.ss.android.ugc.aweme.k.b.c$a */
    public static final class C32268a {

        /* renamed from: a */
        private final HashMap<String, String> f84324a;

        /* renamed from: b */
        private final Builder f84325b;

        /* renamed from: a */
        public final Uri mo83488a() {
            for (Entry entry : this.f84324a.entrySet()) {
                this.f84325b.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = this.f84325b.build();
            C7573i.m23582a((Object) build, "uriBuilder.build()");
            return build;
        }

        public C32268a(HashMap<String, String> hashMap, Builder builder) {
            C7573i.m23587b(hashMap, "paramsMap");
            C7573i.m23587b(builder, "uriBuilder");
            this.f84324a = hashMap;
            this.f84325b = builder;
        }
    }

    private C32267c() {
    }

    /* renamed from: a */
    public static final C32268a m104784a(String str) {
        C7573i.m23587b(str, "uriString");
        HashMap b = m104785b(str);
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        C7573i.m23582a((Object) clearQuery, "uriBuilder");
        return new C32268a(b, clearQuery);
    }

    /* renamed from: b */
    private static HashMap<String, String> m104785b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        Uri parse = Uri.parse(str);
        HashMap<String, String> hashMap = new HashMap<>();
        C7573i.m23582a((Object) parse, "uri");
        for (String str2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                Map map = hashMap;
                C7573i.m23582a((Object) str2, "queryName");
                if (queryParameter == null) {
                    C7573i.m23580a();
                }
                map.put(str2, queryParameter);
            }
        }
        return hashMap;
    }
}
