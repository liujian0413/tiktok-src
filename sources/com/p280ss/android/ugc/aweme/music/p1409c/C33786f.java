package com.p280ss.android.ugc.aweme.music.p1409c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.c.f */
public final class C33786f {

    /* renamed from: a */
    public static final C33786f f88149a = new C33786f();

    /* renamed from: com.ss.android.ugc.aweme.music.c.f$a */
    public static final class C33787a {

        /* renamed from: a */
        private final HashMap<String, String> f88150a;

        /* renamed from: b */
        private final Builder f88151b;

        /* renamed from: a */
        public final Uri mo86194a() {
            for (Entry entry : this.f88150a.entrySet()) {
                this.f88151b.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = this.f88151b.build();
            C7573i.m23582a((Object) build, "uriBuilder.build()");
            return build;
        }

        public C33787a(HashMap<String, String> hashMap, Builder builder) {
            C7573i.m23587b(hashMap, "paramsMap");
            C7573i.m23587b(builder, "uriBuilder");
            this.f88150a = hashMap;
            this.f88151b = builder;
        }

        /* renamed from: a */
        public final C33787a mo86195a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "value");
            if (!TextUtils.isEmpty((CharSequence) this.f88150a.get("rn_schema"))) {
                String uri = Uri.parse((String) this.f88150a.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C7573i.m23582a((Object) uri, "Uri.parse(rnScheme).buil…              .toString()");
                this.f88150a.put("rn_schema", uri);
            }
            if (!TextUtils.isEmpty((CharSequence) this.f88150a.get("url"))) {
                String uri2 = Uri.parse((String) this.f88150a.get("url")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C7573i.m23582a((Object) uri2, "Uri.parse(urlParam).buil…              .toString()");
                this.f88150a.put("url", uri2);
            }
            return this;
        }
    }

    private C33786f() {
    }

    /* renamed from: a */
    public static final C33787a m108941a(String str) {
        C7573i.m23587b(str, "uriString");
        HashMap b = m108942b(str);
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        C7573i.m23582a((Object) clearQuery, "uriBuilder");
        return new C33787a(b, clearQuery);
    }

    /* renamed from: b */
    private static HashMap<String, String> m108942b(String str) {
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
