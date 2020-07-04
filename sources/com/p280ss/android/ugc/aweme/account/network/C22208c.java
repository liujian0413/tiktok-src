package com.p280ss.android.ugc.aweme.account.network;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONException;
import org.json.JSONObject;
import org.p361a.C48293c;
import org.p361a.C7704b;
import p346io.reactivex.C7329e;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.account.network.c */
public final class C22208c implements C22203a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59305a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22208c.class), "RETROFIT_API", "getRETROFIT_API()Lcom/ss/android/ugc/aweme/account/network/IAccountNetworkApi;"))};

    /* renamed from: b */
    public static final C22208c f59306b = new C22208c();

    /* renamed from: c */
    private static final boolean f59307c = C7163a.m22363a();

    /* renamed from: d */
    private static final C7541d f59308d = C7546e.m23569a(C22209a.f59309a);

    /* renamed from: com.ss.android.ugc.aweme.account.network.c$a */
    static final class C22209a extends Lambda implements C7561a<IAccountNetworkApi> {

        /* renamed from: a */
        public static final C22209a f59309a = new C22209a();

        C22209a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m73685a();
        }

        /* renamed from: a */
        private static IAccountNetworkApi m73685a() {
            return (IAccountNetworkApi) ((IRetrofitService) C21084a.m71113a(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(IAccountNetworkApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.c$b */
    static final class C22210b<T, R> implements C7327h<String, C7704b<String>> {

        /* renamed from: a */
        public static final C22210b f59310a = new C22210b();

        C22210b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m73686a((String) obj);
        }

        /* renamed from: a */
        private static C7704b<String> m73686a(final String str) {
            C7573i.m23587b(str, "url");
            return new C7704b<String>() {
                /* renamed from: a */
                public final void mo19155a(C48293c<? super String> cVar) {
                    try {
                        C22208c cVar2 = C22208c.f59306b;
                        String str = str;
                        C7573i.m23582a((Object) str, "url");
                        cVar.onNext(cVar2.mo58583a(Integer.MAX_VALUE, str));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.c$c */
    static final class C22212c<T, R> implements C7327h<String, C7704b<String>> {

        /* renamed from: a */
        final /* synthetic */ Map f59312a;

        C22212c(Map map) {
            this.f59312a = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7704b<String> apply(final String str) {
            C7573i.m23587b(str, "url");
            return new C7704b<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C22212c f59313a;

                {
                    this.f59313a = r1;
                }

                /* renamed from: a */
                public final void mo19155a(C48293c<? super String> cVar) {
                    try {
                        C22208c cVar2 = C22208c.f59306b;
                        String str = str;
                        C7573i.m23582a((Object) str, "url");
                        cVar.onNext(cVar2.mo58584a(Integer.MAX_VALUE, str, this.f59313a.f59312a));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    private C22208c() {
    }

    /* renamed from: b */
    private final IAccountNetworkApi m73676b() {
        return (IAccountNetworkApi) f59308d.getValue();
    }

    /* renamed from: a */
    public final C6600e mo58581a() {
        return C21084a.m71115b().mo57916a();
    }

    /* renamed from: a */
    private static int m73673a(String str) {
        try {
            return new JSONObject(str).getJSONObject("data").optInt("error_code");
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private final ArrayMap<String, String> m73674a(String str, String str2) {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        if (C22207b.m73672a(str)) {
            arrayMap.putAll(C22207b.m73671a(m73673a(str2), str, str2));
        }
        return arrayMap;
    }

    /* renamed from: b */
    public static C7329e<String> m73677b(String str, Map<String, String> map) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(map, "params");
        StringBuilder sb = new StringBuilder(TutorialVideoApiManager.f89507a);
        sb.append(str);
        C7329e<String> b = C7329e.m22973a(new C19290j(sb.toString()).mo51184a()).mo19149a((C7327h<? super T, ? extends C7704b<? extends R>>) new C22212c<Object,Object>(map)).mo19159b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Flowable.just(UrlBuilder…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public static C7329e<String> m73675a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "path");
        StringBuilder sb = new StringBuilder(TutorialVideoApiManager.f89507a);
        sb.append(str);
        C7329e<String> b = C7329e.m22973a(C22215e.m73691a(new C19290j(sb.toString()), map)).mo19149a((C7327h<? super T, ? extends C7704b<? extends R>>) C22210b.f59310a).mo19159b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Flowable.just(UrlBuilder…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: b */
    public final String mo58585b(int i, String str) throws Exception {
        C7573i.m23587b(str, "url");
        try {
            return ((String) m73676b().getResponse(str, Integer.MAX_VALUE).execute().f33302b).toString();
        } catch (ApiServerException e) {
            String response = e.getResponse();
            C7573i.m23582a((Object) response, "e.response");
            return response;
        }
    }

    /* renamed from: c */
    private static String m73678c(String str, Map<String, String> map) {
        Uri parse = Uri.parse(str);
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (Entry entry : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri build = clearQuery.build();
        C7573i.m23582a((Object) parse, "requestUri");
        for (String str2 : parse.getQueryParameterNames()) {
            if (TextUtils.isEmpty(build.getQueryParameter(str2))) {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        String uri = clearQuery.build().toString();
        C7573i.m23582a((Object) uri, "newUriBuilder.build().toString()");
        return uri;
    }

    /* renamed from: a */
    public final String mo58583a(int i, String str) throws Exception {
        C7573i.m23587b(str, "url");
        try {
            String str2 = ((String) m73676b().getResponse(str, i).execute().f33302b).toString();
            ArrayMap a = m73674a(str, str2);
            if (!a.isEmpty()) {
                return mo58583a(i, m73678c(str, a));
            }
            return str2;
        } catch (ApiServerException e) {
            String response = e.getResponse();
            C7573i.m23582a((Object) response, "e.response");
            return response;
        }
    }

    /* renamed from: b */
    public final String mo58586b(int i, String str, Map<String, String> map) throws Exception {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "postParams");
        try {
            return ((String) m73676b().getResponse(str, map, Integer.MAX_VALUE).execute().f33302b).toString();
        } catch (ApiServerException e) {
            String response = e.getResponse();
            C7573i.m23582a((Object) response, "e.response");
            return response;
        }
    }

    /* renamed from: a */
    public final String mo58584a(int i, String str, Map<String, String> map) throws Exception {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "postParams");
        try {
            String str2 = ((String) m73676b().getResponse(str, map, i).execute().f33302b).toString();
            ArrayMap a = m73674a(str, str2);
            if (!a.isEmpty()) {
                HashMap hashMap = new HashMap(map);
                hashMap.putAll(a);
                str2 = mo58584a(i, str, hashMap);
            }
            return str2;
        } catch (ApiServerException e) {
            String response = e.getResponse();
            C7573i.m23582a((Object) response, "e.response");
            return response;
        }
    }

    /* renamed from: a */
    public final <T> T mo58582a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C19565e> list) throws Exception {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "path");
        C7573i.m23587b(cls, "cls");
        C7573i.m23587b(str3, "key");
        return C21084a.m71115b().mo57917a(str, i, str2, cls, str3, list);
    }
}
