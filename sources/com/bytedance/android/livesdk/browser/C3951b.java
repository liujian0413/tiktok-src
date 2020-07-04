package com.bytedance.android.livesdk.browser;

import android.webkit.WebResourceResponse;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.p109c.p112b.C2291e;
import com.bytedance.android.p109c.p112b.C2307i;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.p583b.C11108c;
import com.bytedance.ies.web.p583b.C11109d;
import com.bytedance.ies.web.p583b.C11110e;
import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.ies.web.p583b.C11110e.C11112b;
import com.bytedance.ies.web.p583b.C11146v;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;
import kotlin.text.C48038d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.browser.b */
public final class C3951b {

    /* renamed from: a */
    public static final C3951b f11798a = new C3951b();

    /* renamed from: b */
    private static boolean f11799b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2291e f11800c;

    /* renamed from: com.bytedance.android.livesdk.browser.b$a */
    static final class C3952a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C3952a f11801a = new C3952a();

        C3952a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m13879a((String) obj);
        }

        /* renamed from: a */
        private static LinkedList<String> m13879a(String str) {
            JSONArray jSONArray;
            Throwable th;
            C7573i.m23587b(str, "it");
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            LinkedList<String> linkedList = new LinkedList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (optString != null) {
                    WebResourceResponse c = TTLiveSDKContext.getHostService().mo22368i().mo23275c(optString);
                    if (c != null) {
                        C7573i.m23582a((Object) c, "response");
                        InputStream data = c.getData();
                        C7573i.m23582a((Object) data, "response.data");
                        Closeable bufferedReader = new BufferedReader(new InputStreamReader(data, C48038d.f122880a), VideoCacheReadBuffersizeExperiment.DEFAULT);
                        try {
                            String b = C47991m.m148954b((BufferedReader) bufferedReader);
                            C47973b.m148917a(bufferedReader, null);
                            if (b != null) {
                                linkedList.add(b);
                            }
                        } catch (Throwable th2) {
                            C47973b.m148917a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
            }
            return linkedList;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$b */
    static final class C3953b<T> implements C7328l<LinkedList<String>> {

        /* renamed from: a */
        public static final C3953b f11802a = new C3953b();

        C3953b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m13880a((LinkedList) obj);
        }

        /* renamed from: a */
        private static boolean m13880a(LinkedList<String> linkedList) {
            C7573i.m23587b(linkedList, "list");
            if (!linkedList.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$c */
    static final class C3954c<T> implements C7326g<LinkedList<String>> {

        /* renamed from: a */
        public static final C3954c f11803a = new C3954c();

        C3954c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m13882a((LinkedList) obj);
        }

        /* renamed from: a */
        private static void m13882a(LinkedList<String> linkedList) {
            C7573i.m23582a((Object) linkedList, "responseList");
            C3951b.m13878a((List<String>) linkedList);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$d */
    static final class C3955d implements Executor {

        /* renamed from: a */
        public static final C3955d f11804a = new C3955d();

        C3955d() {
        }

        public final void execute(Runnable runnable) {
            C7492s.m23301b(runnable).mo19304b(C7333a.m23044b()).mo19325f((C7326g<? super T>) C39561.f11805a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$e */
    public static final class C3957e implements C11109d {
        C3957e() {
        }

        /* renamed from: a */
        public final String mo11516a(String str) {
            C7573i.m23587b(str, "key");
            return C3951b.f11800c.mo8097a(str);
        }

        /* renamed from: c */
        public final void mo11520c(String str) {
            C7573i.m23587b(str, "key");
            C3951b.f11800c.mo8103c(str);
        }

        /* renamed from: b */
        public final Collection<String> mo11519b(String str) {
            C7573i.m23587b(str, "key");
            return C3951b.f11800c.mo8101b(str);
        }

        /* renamed from: a */
        public final void mo11517a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "value");
            C3951b.f11800c.mo8099a(str, str2);
        }

        /* renamed from: a */
        public final void mo11518a(String str, Collection<String> collection) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(collection, "collection");
            C3951b.f11800c.mo8100a(str, collection);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$f */
    public static final class C3958f implements C11108c {

        /* renamed from: a */
        final /* synthetic */ List f11806a;

        /* renamed from: a */
        public final List<String> mo11521a() {
            return this.f11806a;
        }

        C3958f(List list) {
            this.f11806a = list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$g */
    public static final class C3959g implements C11110e {

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$a */
        static final class C3960a<V> implements Callable<T> {

            /* renamed from: a */
            final /* synthetic */ String f11807a;

            /* renamed from: b */
            final /* synthetic */ Map f11808b;

            C3960a(String str, Map map) {
                this.f11807a = str;
                this.f11808b = map;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C11112b call() {
                Object a = ((INetworkService) C3596c.m13172a(INetworkService.class)).get(this.f11807a, C3951b.m13874a(this.f11808b)).mo23512a();
                C7573i.m23582a(a, "ServiceManager.getServic…               .execute()");
                return C3951b.m13873a((C9477e) a);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$b */
        static final class C3961b<T> implements C7326g<C11112b> {

            /* renamed from: a */
            final /* synthetic */ C11111a f11809a;

            C3961b(C11111a aVar) {
                this.f11809a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C11112b bVar) {
                C11111a aVar = this.f11809a;
                C7573i.m23582a((Object) bVar, "response");
                aVar.mo27089a(bVar);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$c */
        static final class C3962c<T> implements C7326g<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C11111a f11810a;

            C3962c(C11111a aVar) {
                this.f11810a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) {
                C11111a aVar = this.f11810a;
                C7573i.m23582a((Object) th, "throwable");
                aVar.mo27090a(th);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$d */
        static final class C3963d<V> implements Callable<T> {

            /* renamed from: a */
            final /* synthetic */ String f11811a;

            /* renamed from: b */
            final /* synthetic */ Map f11812b;

            /* renamed from: c */
            final /* synthetic */ JSONObject f11813c;

            C3963d(String str, Map map, JSONObject jSONObject) {
                this.f11811a = str;
                this.f11812b = map;
                this.f11813c = jSONObject;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C11112b call() {
                INetworkService iNetworkService = (INetworkService) C3596c.m13172a(INetworkService.class);
                String str = this.f11811a;
                List a = C3951b.m13874a(this.f11812b);
                String str2 = "application/x-www-form-urlencoded; charset=UTF-8";
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator keys = this.f11813c.keys();
                C7573i.m23582a((Object) keys, "body.keys()");
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    String string = this.f11813c.getString(str3);
                    if (byteArrayOutputStream.size() > 0) {
                        byteArrayOutputStream.write(38);
                    }
                    String encode = URLEncoder.encode(str3, "UTF-8");
                    C7573i.m23582a((Object) encode, "URLEncoder.encode(key, \"UTF-8\")");
                    Charset charset = C48038d.f122880a;
                    if (encode != null) {
                        byte[] bytes = encode.getBytes(charset);
                        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        byteArrayOutputStream.write(bytes);
                        byteArrayOutputStream.write(61);
                        String encode2 = URLEncoder.encode(string, "UTF-8");
                        C7573i.m23582a((Object) encode2, "URLEncoder.encode(value, \"UTF-8\")");
                        Charset charset2 = C48038d.f122880a;
                        if (encode2 != null) {
                            byte[] bytes2 = encode2.getBytes(charset2);
                            C7573i.m23582a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                            byteArrayOutputStream.write(bytes2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                Object a2 = iNetworkService.post(str, a, str2, byteArrayOutputStream.toByteArray()).mo23512a();
                C7573i.m23582a(a2, "ServiceManager.getServic…               .execute()");
                return C3951b.m13873a((C9477e) a2);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$e */
        static final class C3964e<T> implements C7326g<C11112b> {

            /* renamed from: a */
            final /* synthetic */ C11111a f11814a;

            C3964e(C11111a aVar) {
                this.f11814a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C11112b bVar) {
                C11111a aVar = this.f11814a;
                C7573i.m23582a((Object) bVar, "response");
                aVar.mo27089a(bVar);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.b$g$f */
        static final class C3965f<T> implements C7326g<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C11111a f11815a;

            C3965f(C11111a aVar) {
                this.f11815a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) {
                C11111a aVar = this.f11815a;
                C7573i.m23582a((Object) th, "throwable");
                aVar.mo27090a(th);
            }
        }

        C3959g() {
        }

        /* renamed from: a */
        public final void mo11522a(String str, Map<String, String> map, C11111a aVar) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(map, "headers");
            C7573i.m23587b(aVar, "callback");
            C7492s.m23290a((Callable<? extends T>) new C3960a<Object>(str, map)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3961b<Object>(aVar), (C7326g<? super Throwable>) new C3962c<Object>(aVar));
        }

        /* renamed from: a */
        public final void mo11523a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C11111a aVar) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(map, "headers");
            C7573i.m23587b(str2, "mimeType");
            C7573i.m23587b(jSONObject, "body");
            C7573i.m23587b(aVar, "callback");
            C7492s.m23290a((Callable<? extends T>) new C3963d<Object>(str, map, jSONObject)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3964e<Object>(aVar), (C7326g<? super Throwable>) new C3965f<Object>(aVar));
        }
    }

    private C3951b() {
    }

    static {
        C2291e a = C2307i.m9914a("web_prefetch");
        C7573i.m23582a((Object) a, "SuperKV.get(\"web_prefetch\")");
        f11800c = a;
    }

    /* renamed from: a */
    public static void m13875a() {
        C3338l<String> lVar = LiveConfigSettingKeys.WEB_PREFETCH_CONFIG_FILE_LIST;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.WE…PREFETCH_CONFIG_FILE_LIST");
        C7492s.m23301b(lVar.mo10240a()).mo19294a(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C3952a.f11801a).mo19291a((C7328l<? super T>) C3953b.f11802a).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) C3954c.f11803a);
    }

    /* renamed from: a */
    public static void m13876a(C11174p pVar) {
        C7573i.m23587b(pVar, "bridge");
        if (f11799b) {
            C11146v.m32629a(pVar);
        }
    }

    /* renamed from: a */
    public static void m13877a(String str) {
        C7573i.m23587b(str, "url");
        if (f11799b) {
            C11146v.f30261b.mo27137a(str);
        }
    }

    /* renamed from: a */
    public static C11112b m13873a(C9477e eVar) {
        C11112b bVar = new C11112b();
        byte[] bArr = eVar.f25947e;
        C7573i.m23582a((Object) bArr, "this@toPrefetchResponse.body");
        bVar.mo27093a(bArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NameValuePair nameValuePair : eVar.f25945c) {
            C7573i.m23582a((Object) nameValuePair, "p");
            linkedHashMap.put(nameValuePair.getName(), nameValuePair.getValue());
        }
        bVar.mo27092a((Map<String, String>) linkedHashMap);
        return bVar;
    }

    /* renamed from: a */
    public static LinkedList<NameValuePair> m13874a(Map<String, String> map) {
        LinkedList<NameValuePair> linkedList = new LinkedList<>();
        for (Entry entry : map.entrySet()) {
            linkedList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return linkedList;
    }

    /* renamed from: a */
    public static void m13878a(List<String> list) {
        C11146v.m32634b().mo27087a(false).mo27086a((Executor) C3955d.f11804a).mo27082a((C11109d) new C3957e()).mo27081a((C11108c) new C3958f(list)).mo27083a((C11110e) new C3959g()).mo27088a();
        f11799b = true;
    }
}
