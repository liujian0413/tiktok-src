package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.SmartRouter;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.c */
public final class C37007c extends C37004a {

    /* renamed from: c */
    public static final C37008a f96940c = new C37008a(null);

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$a */
    public static final class C37008a {
        private C37008a() {
        }

        public /* synthetic */ C37008a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$b */
    public static final class C37009b extends WebSocketListener {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f96941a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37009b.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        /* renamed from: b */
        public final String f96942b;

        /* renamed from: c */
        private final C7541d f96943c = C7546e.m23569a(C37010a.f96944a);

        /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$b$a */
        static final class C37010a extends Lambda implements C7561a<C6600e> {

            /* renamed from: a */
            public static final C37010a f96944a = new C37010a();

            C37010a() {
                super(0);
            }

            /* renamed from: a */
            private static C6600e m119038a() {
                return new C6600e();
            }

            public final /* synthetic */ Object invoke() {
                return m119038a();
            }
        }

        /* renamed from: a */
        private final C6600e m119037a() {
            return (C6600e) this.f96943c.getValue();
        }

        public C37009b(String str) {
            C7573i.m23587b(str, "wsUrl");
            this.f96942b = str;
        }

        public final void onMessage(WebSocket webSocket, ByteString byteString) {
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(byteString, "bytes");
            super.onMessage(webSocket, byteString);
        }

        public final void onOpen(WebSocket webSocket, Response response) {
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(response, "response");
            super.onOpen(webSocket, response);
        }

        public final void onMessage(WebSocket webSocket, String str) {
            Object obj;
            Context context;
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(str, "text");
            super.onMessage(webSocket, str);
            C37011c cVar = (C37011c) m119037a().mo15974a(str, C37011c.class);
            Intent intent = new Intent();
            Uri parse = Uri.parse(cVar.f96945a);
            CharSequence charSequence = "aweme";
            C7573i.m23582a((Object) parse, "uri");
            if (TextUtils.equals(charSequence, parse.getScheme())) {
                Activity g = C6405d.m19984g();
                if (g != null) {
                    context = g;
                } else {
                    context = C6399b.m19921a();
                }
                SmartRouter.buildRoute(context, cVar.f96945a).open();
                return;
            }
            Boolean bool = null;
            if (TextUtils.equals(WebKitApi.SCHEME_HTTP, parse.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, parse.getScheme())) {
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
            } else {
                intent.setData(parse.buildUpon().scheme("snssdk1233").build());
                if (cVar != null) {
                    obj = cVar.f96949e;
                } else {
                    obj = null;
                }
                if (C7573i.m23585a(obj, (Object) Boolean.valueOf(true))) {
                    intent.putExtra("ws", this.f96942b);
                }
            }
            intent.setFlags(268435456);
            C6399b.m19921a().startActivity(intent);
            if (cVar != null) {
                bool = cVar.f96949e;
            }
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                Process.killProcess(Process.myPid());
            }
        }

        public final void onClosed(WebSocket webSocket, int i, String str) {
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(str, "reason");
            super.onClosed(webSocket, i, str);
        }

        public final void onClosing(WebSocket webSocket, int i, String str) {
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(str, "reason");
            super.onClosing(webSocket, i, str);
        }

        public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
            C7573i.m23587b(webSocket, "webSocket");
            C7573i.m23587b(th, "t");
            super.onFailure(webSocket, th, response);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.a.c$c */
    public static final class C37011c {
        @C6593c(mo15949a = "o_url")

        /* renamed from: a */
        public String f96945a;
        @C6593c(mo15949a = "scene_name")

        /* renamed from: b */
        public String f96946b;
        @C6593c(mo15949a = "from_type")

        /* renamed from: c */
        public Integer f96947c;
        @C6593c(mo15949a = "stage")

        /* renamed from: d */
        public Integer f96948d;
        @C6593c(mo15949a = "is_cold_launch")

        /* renamed from: e */
        public Boolean f96949e;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f96949e, (java.lang.Object) r3.f96949e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c.C37011c
                if (r0 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.qrcode.a.c$c r3 = (com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c.C37011c) r3
                java.lang.String r0 = r2.f96945a
                java.lang.String r1 = r3.f96945a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f96946b
                java.lang.String r1 = r3.f96946b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Integer r0 = r2.f96947c
                java.lang.Integer r1 = r3.f96947c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Integer r0 = r2.f96948d
                java.lang.Integer r1 = r3.f96948d
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Boolean r0 = r2.f96949e
                java.lang.Boolean r3 = r3.f96949e
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c.C37011c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f96945a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f96946b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.f96947c;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f96948d;
            int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Boolean bool = this.f96949e;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeeplinkData(url=");
            sb.append(this.f96945a);
            sb.append(", scene_name=");
            sb.append(this.f96946b);
            sb.append(", from_type=");
            sb.append(this.f96947c);
            sb.append(", stage=");
            sb.append(this.f96948d);
            sb.append(", is_cold_launch=");
            sb.append(this.f96949e);
            sb.append(")");
            return sb.toString();
        }
    }

    public C37007c(C37005a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public static void m119035a(String str) {
        C7573i.m23587b(str, "url");
        Request build = new Builder().url(str).build();
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newWebSocket(build, new C37009b(str));
        okHttpClient.dispatcher.executorService().shutdown();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0088, code lost:
        if (r0 == null) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59069a(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x009e
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x009e
        L_0x000e:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "dptower.bytedance.net"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r3, r1)
            java.lang.String r1 = r3.getHost()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x009d
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "app_name"
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r1 = 2131820918(0x7f110176, float:1.9274565E38)
            java.lang.String r0 = r0.getString(r1)
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "device_id"
            java.lang.String r0 = com.p280ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "app_id"
            java.lang.String r0 = "1233"
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "app_version"
            java.lang.String r0 = "14.7.4"
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "ios_version"
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "device_name"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Android "
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.BRAND
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.appendQueryParameter(r4, r0)
            java.lang.String r4 = "user_id"
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L_0x008c
        L_0x008a:
            java.lang.String r0 = "null"
        L_0x008c:
            r3.appendQueryParameter(r4, r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "uri.buildUpon().apply {\n…\n            }.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            m119035a(r3)
            r3 = 1
            return r3
        L_0x009d:
            return r4
        L_0x009e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c.mo59069a(java.lang.String, int):boolean");
    }
}
