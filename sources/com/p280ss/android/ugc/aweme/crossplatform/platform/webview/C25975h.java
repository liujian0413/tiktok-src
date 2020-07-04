package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.net.cronet.IIESNetworkApi;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h */
public final class C25975h {

    /* renamed from: a */
    public static final C25976a f68683a = new C25976a(null);

    /* renamed from: b */
    private static final IIESNetworkApi f68684b = ((IIESNetworkApi) C22838j.m75278b(Api.f60502b).mo30492a(IIESNetworkApi.class));

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$a */
    public static final class C25976a {
        private C25976a() {
        }

        public /* synthetic */ C25976a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static String m85327a(List<C12461b> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            for (C12461b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f33095a) && !TextUtils.isEmpty(bVar.f33096b)) {
                    String str = bVar.f33095a;
                    C7573i.m23582a((Object) str, "header.name");
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C7573i.m23585a((Object) lowerCase, (Object) "content-type")) {
                            String str2 = bVar.f33096b;
                            C7573i.m23582a((Object) str2, "header.value");
                            return str2;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private final WebResourceResponse m85325a(C12534t<TypedInput> tVar) {
        WebResourceResponse webResourceResponse;
        if (tVar != null) {
            List b = tVar.mo30511b();
            C7573i.m23582a((Object) b, "ssResponse.headers()");
            String a = m85327a(b);
            new StringBuilder("contentType:").append(a);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            String a2 = m85326a(a);
            new StringBuilder("mime:").append(a2);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            String str = "";
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !C7573i.m23585a((Object) "font/ttf", (Object) a)) {
                    webResourceResponse = new WebResourceResponse(a2, str, ((TypedInput) tVar.f33302b).mo10444in());
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            C7573i.m23582a((Object) field, "headerField");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(a2, str, C34943c.f91127w, "OK", hashMap, ((TypedInput) tVar.f33302b).mo10444in());
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m85326a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            CharSequence charSequence = lowerCase;
            if (C7634n.m23776c(charSequence, (CharSequence) "js", false) || C7634n.m23776c(charSequence, (CharSequence) "application/javascript", false) || C7634n.m23776c(charSequence, (CharSequence) "javascript", false)) {
                lowerCase = "application/x-javascript";
            } else if (C7634n.m23723c(lowerCase, "text/css", false) || C7634n.m23723c(lowerCase, "css", false)) {
                lowerCase = "text/css";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "test/html", false) || C7634n.m23776c(charSequence, (CharSequence) "html", false)) {
                lowerCase = "text/html";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "image", false)) {
                int a = C7634n.m23730a(charSequence, ";", 0, false, 6, (Object) null);
                if (a >= 0) {
                    if (lowerCase != null) {
                        lowerCase = lowerCase.substring(0, a);
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else if (C7634n.m23776c(charSequence, (CharSequence) "jpeg", false) || C7634n.m23776c(charSequence, (CharSequence) "jpg", false)) {
                lowerCase = "image/jpeg";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "png", false)) {
                lowerCase = "image/png";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "gif", false)) {
                lowerCase = "image/gif";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "woff", false)) {
                lowerCase = "font/woff";
            } else if (C7634n.m23776c(charSequence, (CharSequence) "svg", false)) {
                lowerCase = "image/svg+xml";
            } else if (C7634n.m23776c(charSequence, (CharSequence) ".ttf", false)) {
                lowerCase = "font/ttf";
            } else {
                int a2 = C7634n.m23730a(charSequence, ";", 0, false, 6, (Object) null);
                if (a2 >= 0) {
                    if (lowerCase != null) {
                        lowerCase = lowerCase.substring(0, a2);
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final WebResourceResponse mo67427a(String str, String str2) {
        C7573i.m23587b(str, "ref");
        C7573i.m23587b(str2, "url");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        return m85325a(m85328b(str, str2));
    }

    /* renamed from: b */
    private static C12534t<TypedInput> m85328b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12461b("accept", "*/*"));
        arrayList.add(new C12461b("accept-encoding", "gzip, deflate, br"));
        arrayList.add(new C12461b("accept-language", "en-GB,en;q=0.9,zh-CN;q=0.8,zh-TW;q=0.7,zh;q=0.6,en-US;q=0.5"));
        arrayList.add(new C12461b("x-requested-with", "com.ss.android.ugc.aweme"));
        arrayList.add(new C12461b("ttnet", "1"));
        if (!C7573i.m23585a((Object) str, (Object) str2)) {
            arrayList.add(new C12461b("referer", str));
        }
        try {
            C12534t<TypedInput> execute = f68684b.downloadFile(false, -1, str2, null, arrayList).execute();
            C7573i.m23582a((Object) execute, "response");
            if (execute.mo30512c()) {
                return execute;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
