package com.bytedance.opensdk.core.grant.web.p632a;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.opensdk.p619b.C12268c;
import com.bytedance.opensdk.p619b.C12273f;
import com.bytedance.opensdk.p619b.C12278i;
import com.facebook.internal.C13926o;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.core.grant.web.a.a */
public final class C12329a {

    /* renamed from: a */
    public static final C12329a f32724a;

    /* renamed from: b */
    private static final String f32725b;

    /* renamed from: com.bytedance.opensdk.core.grant.web.a.a$a */
    public static final class C12330a {

        /* renamed from: a */
        public String f32726a;

        /* renamed from: b */
        public String f32727b;

        /* renamed from: c */
        public String f32728c;

        /* renamed from: d */
        public C6711m f32729d;

        /* renamed from: e */
        public int f32730e;

        public C12330a() {
            this(null, null, null, null, 0, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C12330a) {
                    C12330a aVar = (C12330a) obj;
                    if (C7573i.m23585a((Object) this.f32726a, (Object) aVar.f32726a) && C7573i.m23585a((Object) this.f32727b, (Object) aVar.f32727b) && C7573i.m23585a((Object) this.f32728c, (Object) aVar.f32728c) && C7573i.m23585a((Object) this.f32729d, (Object) aVar.f32729d)) {
                        if (this.f32730e == aVar.f32730e) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f32726a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32727b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f32728c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C6711m mVar = this.f32729d;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.f32730e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JsMsg(type=");
            sb.append(this.f32726a);
            sb.append(", callback_id=");
            sb.append(this.f32727b);
            sb.append(", func=");
            sb.append(this.f32728c);
            sb.append(", params=");
            sb.append(this.f32729d);
            sb.append(", version=");
            sb.append(this.f32730e);
            sb.append(")");
            return sb.toString();
        }

        private C12330a(String str, String str2, String str3, C6711m mVar, int i) {
            this.f32726a = str;
            this.f32727b = str2;
            this.f32728c = str3;
            this.f32729d = mVar;
            this.f32730e = i;
        }

        public /* synthetic */ C12330a(String str, String str2, String str3, C6711m mVar, int i, int i2, C7571f fVar) {
            this(null, null, null, null, 0);
        }
    }

    private C12329a() {
    }

    static {
        C12329a aVar = new C12329a();
        f32724a = aVar;
        String simpleName = aVar.getClass().getSimpleName();
        C7573i.m23582a((Object) simpleName, "this::class.java.simpleName");
        f32725b = simpleName;
    }

    /* renamed from: a */
    public static void m35801a(WebView webView) {
        C7573i.m23587b(webView, C22912d.f60641a);
        C12273f.m35685a(webView, "javascript:ToutiaoJSBridge._fetchQueue()");
    }

    /* renamed from: a */
    public static boolean m35804a(String str) {
        C7573i.m23587b(str, "url");
        if (!C7634n.m23721b(str, "bytedance://", false)) {
            return false;
        }
        return C7573i.m23585a((Object) str, (Object) "bytedance://dispatch_message/");
    }

    /* renamed from: a */
    public static boolean m35803a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        if (C7573i.m23585a((Object) "bytedance", (Object) uri.getScheme()) || C7573i.m23585a((Object) C22909c.f60637a, (Object) uri.getScheme())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m35800a(String str, String str2) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(str2, "jsonStr");
        if (TextUtils.isEmpty(str)) {
            str = "RequestDidFinish";
        }
        StringBuilder sb = new StringBuilder("{ 'detail': ");
        sb.append(str2);
        sb.append('}');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("javascript: (function(){ var event = new CustomEvent('");
        sb3.append(str);
        sb3.append("', ");
        sb3.append(sb2);
        sb3.append(");document.dispatchEvent(event);}());");
        String sb4 = sb3.toString();
        C12278i.m35691a(f32725b, sb4);
        return sb4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0056 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35802a(java.lang.String r11, kotlin.jvm.p357a.C7562b<? super com.bytedance.opensdk.core.grant.web.p632a.C12329a.C12330a, kotlin.C7581n> r12) {
        /*
            java.lang.String r0 = "jsMsgQueue"
            kotlin.jvm.internal.C7573i.m23587b(r11, r0)
            java.lang.String r0 = "handleMsg"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            r0 = 2
            byte[] r11 = android.util.Base64.decode(r11, r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "Base64.decode(jsMsgQueue, Base64.NO_WRAP)"
            kotlin.jvm.internal.C7573i.m23582a(r11, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00c2 }
            java.nio.charset.Charset r2 = kotlin.text.C48038d.f122880a     // Catch:{ Exception -> 0x00c2 }
            r1.<init>(r11, r2)     // Catch:{ Exception -> 0x00c2 }
            com.google.gson.n r11 = new com.google.gson.n     // Catch:{ Exception -> 0x00c2 }
            r11.<init>()     // Catch:{ Exception -> 0x00c2 }
            com.google.gson.k r11 = r11.mo47346a(r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "JsonParser().parse(s)"
            kotlin.jvm.internal.C7573i.m23582a(r11, r1)     // Catch:{ Exception -> 0x00c2 }
            com.google.gson.h r11 = com.bytedance.opensdk.p619b.C12267b.m35669a(r11)     // Catch:{ Exception -> 0x00c2 }
            if (r11 == 0) goto L_0x00c1
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ Exception -> 0x00c2 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00c2 }
            r1.<init>()     // Catch:{ Exception -> 0x00c2 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x00c2 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x00c2 }
        L_0x003c:
            boolean r2 = r11.hasNext()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x00c2 }
            boolean r3 = r2 instanceof com.google.gson.C6711m     // Catch:{ Exception -> 0x00c2 }
            if (r3 == 0) goto L_0x003c
            r1.add(r2)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x003c
        L_0x004e:
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00c2 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00c2 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ Exception -> 0x00c2 }
        L_0x0056:
            boolean r1 = r11.hasNext()     // Catch:{ Exception -> 0x00c2 }
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r11.next()     // Catch:{ Exception -> 0x00c2 }
            com.google.gson.m r1 = (com.google.gson.C6711m) r1     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.opensdk.core.grant.web.a.a$a r10 = new com.bytedance.opensdk.core.grant.web.a.a$a     // Catch:{ Exception -> 0x00c2 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "__msg_type"
            r3 = 0
            java.lang.String r2 = com.bytedance.opensdk.p619b.C12267b.m35674a(r1, r2, r3)     // Catch:{ Exception -> 0x00c2 }
            r10.f32726a = r2     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "__callback_id"
            java.lang.String r2 = com.bytedance.opensdk.p619b.C12267b.m35674a(r1, r2, r3)     // Catch:{ Exception -> 0x00c2 }
            r10.f32727b = r2     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "func"
            java.lang.String r2 = com.bytedance.opensdk.p619b.C12267b.m35674a(r1, r2, (java.lang.String) null)     // Catch:{ Exception -> 0x00c2 }
            r10.f32728c = r2     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "params"
            com.google.gson.m r2 = com.bytedance.opensdk.p619b.C12267b.m35670a(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            r10.f32729d = r2     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "JSSDK"
            r3 = 0
            int r1 = com.bytedance.opensdk.p619b.C12267b.m35664a(r1, r2, r3)     // Catch:{ Exception -> 0x00c2 }
            r10.f32730e = r1     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = r10.f32726a     // Catch:{ Exception -> 0x00c2 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00c2 }
            r2 = 1
            if (r1 == 0) goto L_0x00aa
            int r1 = r1.length()     // Catch:{ Exception -> 0x00c2 }
            if (r1 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r1 = 0
            goto L_0x00ab
        L_0x00aa:
            r1 = 1
        L_0x00ab:
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = r10.f32728c     // Catch:{ Exception -> 0x00c2 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00c2 }
            if (r1 == 0) goto L_0x00bb
            int r1 = r1.length()     // Catch:{ Exception -> 0x00c2 }
            if (r1 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            if (r2 != 0) goto L_0x0056
            r12.invoke(r10)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x0056
        L_0x00c1:
            return
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.grant.web.p632a.C12329a.m35802a(java.lang.String, kotlin.jvm.a.b):void");
    }

    /* renamed from: a */
    public static boolean m35805a(String str, List<String> list) {
        boolean z;
        C7573i.m23587b(str, "url");
        C7573i.m23587b(list, "messageContainer");
        if (!C7634n.m23721b(str, "bytedance://", false)) {
            return false;
        }
        String str2 = "bytedance://private/setresult/";
        if (C7634n.m23721b(str, str2, false)) {
            int length = str2.length();
            int a = C7634n.m23726a((CharSequence) str, '&', length, false, 4, (Object) null);
            if (a <= 0) {
                return false;
            }
            String substring = str.substring(length, a);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = str.substring(a + 1);
            C7573i.m23582a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            if (C7573i.m23585a((Object) substring, (Object) "SCENE_FETCHQUEUE")) {
                if (substring2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list.add(substring2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo30164a(WebView webView, String str, C6711m mVar) {
        C7573i.m23587b(webView, C22912d.f60641a);
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(mVar, C13926o.f36856a);
        String mVar2 = mVar.toString();
        C7573i.m23582a((Object) mVar2, "o.toString()");
        C12268c.m35680a(webView, m35800a(str, mVar2));
    }
}
