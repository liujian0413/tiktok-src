package com.bytedance.common.wschannel.channel.p486a.p487a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9770b;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9771c;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9773e;
import com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a;
import com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9783b;
import com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9784c;
import com.bytedance.common.wschannel.p484b.C9757a;
import com.bytedance.common.wschannel.p485c.C9762a;
import com.bytedance.common.wschannel.server.NetworkUtils;
import com.bytedance.common.wschannel.server.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.c */
final class C9790c implements C6310a, C9768a {

    /* renamed from: a */
    public final Context f26637a;

    /* renamed from: b */
    public C9806d f26638b;

    /* renamed from: c */
    public boolean f26639c;

    /* renamed from: d */
    public Handler f26640d;

    /* renamed from: e */
    public C9805d f26641e;

    /* renamed from: f */
    public C9765a f26642f;

    /* renamed from: g */
    public C9777a f26643g;

    /* renamed from: h */
    public boolean f26644h;

    /* renamed from: i */
    private final C9796b f26645i;

    /* renamed from: j */
    private OkHttpClient f26646j;

    /* renamed from: k */
    private int f26647k;

    /* renamed from: l */
    private Request f26648l;

    /* renamed from: m */
    private Map<String, Object> f26649m;

    /* renamed from: n */
    private C9784c f26650n;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.c$a */
    public static final class C9795a {

        /* renamed from: a */
        private Context f26659a;

        /* renamed from: b */
        private List<String> f26660b;

        /* renamed from: c */
        private OkHttpClient f26661c;

        /* renamed from: d */
        private C9773e f26662d;

        /* renamed from: e */
        private C9771c f26663e = new C9770b();

        /* renamed from: a */
        public final C9790c mo24252a() {
            C9796b bVar = new C9796b(this.f26659a, this.f26660b, this.f26661c, this.f26662d, this.f26663e);
            return new C9790c(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C9795a mo24251a(C9773e eVar) {
            this.f26662d = eVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C9795a mo24250a(C9771c cVar) {
            if (cVar != null) {
                this.f26663e = cVar;
            }
            return this;
        }

        C9795a(Context context) {
            this.f26659a = context;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.c$b */
    static final class C9796b {

        /* renamed from: a */
        C9771c f26664a;

        /* renamed from: b */
        public Context f26665b;

        /* renamed from: c */
        public List<String> f26666c;

        /* renamed from: d */
        public OkHttpClient f26667d;

        /* renamed from: e */
        public C9773e f26668e;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config{heartBeatPolicy=");
            sb.append(this.f26664a);
            sb.append(", mContext=");
            sb.append(this.f26665b);
            sb.append(", wsUrls=");
            sb.append(this.f26666c);
            sb.append(", mOkHttpClient=");
            sb.append(this.f26667d);
            sb.append(", mRetryPolicy=");
            sb.append(this.f26668e);
            sb.append('}');
            return sb.toString();
        }

        C9796b(Context context, List<String> list, OkHttpClient okHttpClient, C9773e eVar, C9771c cVar) {
            this.f26665b = context;
            this.f26666c = list;
            this.f26667d = okHttpClient;
            this.f26668e = eVar;
            this.f26664a = cVar;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.c$c */
    class C9797c extends C9784c {
        /* renamed from: a */
        public static boolean m28901a(int i) {
            return i <= 0 || i == 414 || i == 511 || i == 512 || i == 513;
        }

        private C9797c() {
        }

        /* renamed from: b */
        public final void mo24222b(final C9783b bVar, final ByteString byteString) {
            C9790c.this.mo24231a((Runnable) new Runnable() {
                public final void run() {
                    C9790c.this.f26642f.mo24188a(bVar, byteString);
                }
            });
        }

        /* renamed from: a */
        public final void mo24217a(C9783b bVar, final String str) {
            C9790c.this.mo24231a((Runnable) new Runnable() {
                public final void run() {
                    if (C9790c.this.f26641e != null) {
                        C9790c.this.f26641e.mo24265b(str);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo24219a(final C9783b bVar, final Response response) {
            C9790c.this.mo24231a((Runnable) new Runnable() {
                public final void run() {
                    if (C9790c.this.f26643g == bVar) {
                        C9790c.this.mo24229a(4);
                        C9790c.this.mo24241d();
                        Bundle bundle = new Bundle();
                        bundle.putString("method", "onOpenInternal");
                        C9757a.m28773a(C9790c.this.f26637a, "WsChannelSdk_ok", bundle);
                        C9790c.this.f26642f.mo24187a(bVar, response);
                        if (C9790c.this.f26641e != null) {
                            C9790c.this.f26641e.mo24263a(response);
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo24220a(C9783b bVar, final ByteString byteString) {
            C9790c.this.mo24231a((Runnable) new Runnable() {
                public final void run() {
                    if (C9790c.this.f26641e != null) {
                        C9790c.this.f26641e.mo24264a(byteString);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo24216a(C9783b bVar, int i, String str) {
            super.mo24216a(bVar, i, str);
            C9790c.this.mo24231a((Runnable) new Runnable() {
                public final void run() {
                    C9790c.this.mo24229a(6);
                }
            });
        }

        /* renamed from: b */
        public final void mo24221b(C9783b bVar, int i, String str) {
            final String a = C9790c.m28869a((WebSocket) bVar);
            Bundle bundle = new Bundle();
            bundle.putString("url", a);
            bundle.putInt("error_code", i);
            bundle.putString("error_msg", str);
            bundle.putString("method", "onClosedInternal");
            C9757a.m28773a(C9790c.this.f26637a, "WsChannelSdk_ok", bundle);
            C9790c cVar = C9790c.this;
            final C9783b bVar2 = bVar;
            final int i2 = i;
            final String str2 = str;
            C98025 r0 = new Runnable() {
                public final void run() {
                    if (C9790c.this.f26643g == bVar2) {
                        C9790c.this.mo24229a(3);
                        C9790c.this.f26643g = null;
                        if (C9790c.this.f26642f != null) {
                            C9790c.this.f26642f.mo24190c();
                        }
                        if (C9790c.this.f26641e != null) {
                            C9790c.this.f26641e.mo24266b(a, i2, str2);
                        }
                        if (C9790c.this.f26644h) {
                            C9790c.this.f26644h = false;
                            C9790c.this.mo24232a(C9790c.this.f26638b.mo24269b());
                        } else if (!C9790c.this.f26639c) {
                            Pair a = C9790c.this.f26638b.mo24267a(null);
                            C9790c.this.mo24230a(((Long) a.second).longValue(), (String) a.first, true);
                        }
                    }
                }
            };
            cVar.mo24231a((Runnable) r0);
        }

        /* renamed from: a */
        public final void mo24218a(C9783b bVar, Throwable th, Response response) {
            final String str;
            String message;
            final String a = C9790c.m28869a((WebSocket) bVar);
            final int a2 = C9790c.m28867a(response);
            String c = C9790c.m28876c(a2);
            if (C6319n.m19593a(c)) {
                if (C6319n.m19593a(th.getMessage())) {
                    message = Log.getStackTraceString(th);
                } else {
                    message = th.getMessage();
                }
                str = message;
            } else {
                str = c;
            }
            final Pair a3 = C9790c.this.f26638b.mo24267a(response);
            C9790c.m28870a((Closeable) response);
            Bundle bundle = new Bundle();
            bundle.putString("url", a);
            bundle.putInt("error_code", a2);
            bundle.putString("error_msg", str);
            bundle.putString("method", "onFailureInternal");
            C9757a.m28773a(C9790c.this.f26637a, "WsChannelSdk_ok", bundle);
            C9790c cVar = C9790c.this;
            final C9783b bVar2 = bVar;
            C98036 r0 = new Runnable() {
                public final void run() {
                    if (C9790c.this.f26641e != null) {
                        C9790c.this.f26641e.mo24262a(a, a2, str);
                    }
                    if (C9790c.this.f26644h) {
                        C9790c.this.f26644h = false;
                        C9790c.this.mo24232a(C9790c.this.f26638b.mo24269b());
                    } else if (C9790c.this.f26643g == bVar2) {
                        if (C9797c.m28901a(a2)) {
                            if (C9790c.this.f26642f != null) {
                                C9790c.this.f26642f.mo24190c();
                            }
                            C9790c.this.mo24230a(((Long) a3.second).longValue(), (String) a3.first, false);
                            return;
                        }
                        C9790c.this.mo24229a(2);
                        C9790c.this.mo24242e();
                    }
                }
            };
            cVar.mo24231a((Runnable) r0);
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.c$d */
    interface C9805d {
        /* renamed from: a */
        void mo24261a(String str);

        /* renamed from: a */
        void mo24262a(String str, int i, String str2);

        /* renamed from: a */
        void mo24263a(Response response);

        /* renamed from: a */
        void mo24264a(ByteString byteString);

        /* renamed from: b */
        void mo24265b(String str);

        /* renamed from: b */
        void mo24266b(String str, int i, String str2);
    }

    /* renamed from: c */
    public static String m28876c(int i) {
        return i == 0 ? "成功" : i == 404 ? "uri不存在" : i == 409 ? "fpid没有注册" : i == 410 ? "非法的设备id" : i == 411 ? "appid还没有注册" : i == 412 ? "websocket子协议不支持" : i == 413 ? "该设备已经建立连接" : i == 414 ? "服务器不能接受更多连接，可重试" : i == 415 ? "设备被限时禁止连接" : i == 416 ? "参数不正确" : i == 417 ? "鉴权失败" : i == 510 ? "服务器内部错误" : i == 511 ? "服务器忙，可稍后重试" : i == 512 ? "服务器正在关机" : i == 513 ? "auth服务异常" : i == 514 ? "auth服务返回失败" : "";
    }

    /* renamed from: a */
    public final void mo24232a(String str) {
        if (!m28872a(this.f26637a)) {
            m28871a(str, 1, "网络错误", true);
            return;
        }
        int f = mo24243f();
        if (!(f == 4 || f == 1)) {
            try {
                m28875b(str);
            } catch (Throwable th) {
                if (this.f26641e != null) {
                    this.f26641e.mo24262a(str, 4, Log.getStackTraceString(th));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24230a(long j, String str, boolean z) {
        this.f26640d.removeMessages(1);
        if (!m28872a(this.f26637a)) {
            m28871a(str, 1, "网络错误", z);
        } else if (this.f26639c) {
            Bundle bundle = new Bundle();
            bundle.putString("method", "tryReconnect");
            bundle.putBoolean("isManualClose", true);
            C9757a.m28773a(this.f26637a, "WsChannelSdk_ok", bundle);
        } else {
            if (j == -1 || C6319n.m19593a(str)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("method", "tryReconnect");
                bundle2.putLong("interval", j);
                m28871a(str, 2, "重试失败", z);
                j = this.f26642f.f26547b;
                str = this.f26638b.mo24269b();
                bundle2.putLong("next_interval", j);
                bundle2.putString("nextUrl", str);
                bundle2.putString("event", "retry_finished");
                C9757a.m28773a(this.f26637a, "WsChannelSdk_ok", bundle2);
            } else {
                mo24229a(5);
            }
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f26640d.sendMessageDelayed(message, j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo24229a(int i) {
        this.f26647k = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24233a(Map<String, Object> map) {
        if (map != null) {
            map.remove("channel_id");
            this.f26649m.putAll(map);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24234a(final Map<String, Object> map, final List<String> list) {
        if (!list.isEmpty()) {
            mo24231a((Runnable) new Runnable() {
                public final void run() {
                    int f = C9790c.this.mo24243f();
                    if (f != 4 && f != 1 && f != 5) {
                        Bundle bundle = new Bundle();
                        bundle.putString("urls", list.toString());
                        bundle.putString("method", "openConnection");
                        C9757a.m28773a(C9790c.this.f26637a, "WsChannelSdk_ok", bundle);
                        C9790c.this.mo24233a(map);
                        C9790c.this.handleMsg(C9790c.this.f26640d.obtainMessage(2, list));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo24236a(byte[] bArr) {
        return m28874a(ByteString.m23795of(bArr));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24235a(boolean z) {
        this.f26640d.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo24231a(Runnable runnable) {
        this.f26640d.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final synchronized int mo24243f() {
        return this.f26647k;
    }

    /* renamed from: k */
    private void m28879k() {
        if (this.f26643g != null) {
            this.f26643g.mo24209b(1000, "normal close");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24237b() {
        mo24231a((Runnable) new Runnable() {
            public final void run() {
                C9790c.this.f26639c = true;
                C9790c.this.mo24240c();
            }
        });
    }

    /* renamed from: d */
    public final void mo24241d() {
        mo24242e();
        this.f26640d.removeMessages(1);
    }

    /* renamed from: e */
    public final void mo24242e() {
        if (this.f26638b != null) {
            this.f26638b.mo24268a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo24244g() {
        if (mo24243f() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo24240c() {
        this.f26640d.removeMessages(2);
        this.f26640d.removeMessages(1);
        this.f26640d.removeMessages(3);
        this.f26640d.removeMessages(5);
        mo24241d();
        m28877i();
    }

    /* renamed from: j */
    private int m28878j() {
        NetworkType a = NetworkUtils.m29011a(this.f26637a);
        if (a == null || a == NetworkType.NONE) {
            return 0;
        }
        if (a == NetworkType.WIFI) {
            return 1;
        }
        if (a == NetworkType.MOBILE_2G) {
            return 2;
        }
        if (a == NetworkType.MOBILE_3G) {
            return 3;
        }
        return 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo24245h() {
        this.f26640d.removeMessages(2);
        this.f26640d.removeMessages(1);
        this.f26640d.removeMessages(3);
        this.f26640d.removeMessages(5);
        mo24231a((Runnable) new Runnable() {
            public final void run() {
                C9790c.this.mo24237b();
            }
        });
    }

    /* renamed from: i */
    private boolean m28877i() {
        int f = mo24243f();
        if (f == 3 || f == 2 || f == 5) {
            return true;
        }
        if (this.f26642f != null) {
            this.f26642f.mo24190c();
        }
        if (this.f26643g == null) {
            return true;
        }
        this.f26640d.sendMessageDelayed(this.f26640d.obtainMessage(6, this.f26643g), 1000);
        if (f == 4) {
            this.f26643g.close(1000, "normal close");
            mo24229a(6);
            return false;
        }
        this.f26643g.cancel();
        mo24229a(3);
        if (f != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo24193a() {
        if (!(this.f26648l == null || this.f26641e == null)) {
            this.f26641e.mo24262a(this.f26648l.url.toString(), 3, "心跳超时");
        }
        Pair a = this.f26638b.mo24267a(null);
        mo24240c();
        m28879k();
        mo24230a(0, (String) a.first, true);
    }

    /* renamed from: a */
    public static void m28870a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m28867a(Response response) {
        if (response != null) {
            try {
                return Integer.parseInt(response.header("Handshake-Status"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m28869a(WebSocket webSocket) {
        if (webSocket != null) {
            Request request = webSocket.request();
            if (request != null) {
                HttpUrl httpUrl = request.url;
                if (httpUrl != null) {
                    return httpUrl.toString();
                }
            }
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24238b(int i) {
        this.f26640d.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    private C9790c(C9796b bVar) {
        this.f26647k = 3;
        this.f26649m = new ConcurrentHashMap();
        this.f26640d = new C6309f(Looper.myLooper(), this);
        this.f26650n = new C9797c();
        this.f26642f = null;
        this.f26645i = bVar;
        this.f26637a = bVar.f26665b;
        this.f26646j = bVar.f26667d;
        this.f26642f = new C9765a(this.f26640d, this);
        this.f26642f.f26549d = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
    }

    /* renamed from: a */
    private static boolean m28872a(Context context) {
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m28875b(String str) {
        if (this.f26646j == null) {
            this.f26646j = new Builder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        }
        String a = m28868a(str, this.f26649m);
        if (!C6319n.m19593a(a)) {
            m28879k();
            if (this.f26648l == null || !a.equals(this.f26648l.url.toString())) {
                this.f26648l = new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp").url(a).build();
            }
            mo24229a(1);
            this.f26643g = C9777a.m28820a(this.f26648l, C9817d.m28950a(this.f26637a).mo24289d(), this.f26650n);
            this.f26643g.mo24206a(this.f26646j);
            if (this.f26641e != null) {
                this.f26641e.mo24261a(a);
            }
        }
    }

    /* renamed from: a */
    private boolean m28873a(Object obj) {
        if (this.f26643g == null || !mo24244g() || !(obj instanceof ByteString)) {
            return false;
        }
        return this.f26643g.send((ByteString) obj);
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                if (!mo24244g()) {
                    this.f26640d.removeMessages(1);
                    this.f26640d.removeMessages(2);
                    mo24232a((String) message.obj);
                }
            } else if (i == 2) {
                try {
                    this.f26640d.removeMessages(2);
                    this.f26640d.removeMessages(1);
                    this.f26645i.f26666c = (List) message.obj;
                    this.f26639c = false;
                    this.f26638b = new C9806d(this.f26645i.f26666c, this.f26645i.f26668e, this.f26645i.f26664a);
                    mo24241d();
                    mo24232a(this.f26638b.mo24269b());
                } catch (Throwable unused) {
                }
            } else if (i == 3) {
                this.f26640d.removeMessages(2);
                this.f26640d.removeMessages(1);
                if (!mo24244g()) {
                    mo24241d();
                    if (!m28872a(this.f26637a)) {
                        return;
                    }
                    if (!m28877i()) {
                        this.f26644h = true;
                    } else if (this.f26638b == null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("method", "network_change_error");
                        bundle.putString("config", this.f26649m.toString());
                        bundle.putString("mConfig", this.f26645i.toString());
                        C9757a.m28773a(this.f26637a, "WsChannelSdk_ok", bundle);
                    } else {
                        mo24232a(this.f26638b.mo24269b());
                    }
                }
            } else if (i == 5) {
                ((Boolean) message.obj).booleanValue();
            } else {
                if (i == 7) {
                    try {
                        this.f26640d.removeMessages(2);
                        this.f26640d.removeMessages(1);
                        this.f26645i.f26666c = (List) message.obj;
                        this.f26639c = false;
                        this.f26638b = new C9806d(this.f26645i.f26666c, this.f26645i.f26668e, this.f26645i.f26664a);
                        mo24241d();
                        if (m28877i()) {
                            mo24232a(this.f26638b.mo24269b());
                        } else {
                            this.f26644h = true;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m28874a(ByteString byteString) {
        return m28873a((Object) byteString);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24239b(final Map<String, Object> map, final List<String> list) {
        if (!list.isEmpty()) {
            mo24231a((Runnable) new Runnable() {
                public final void run() {
                    C9790c.this.mo24233a(map);
                    C9790c.this.handleMsg(C9790c.this.f26640d.obtainMessage(7, list));
                }
            });
        }
    }

    /* renamed from: a */
    private String m28868a(String str, Map<String, Object> map) {
        String[] split;
        String str2;
        if (TextUtils.isEmpty(str) || map == null) {
            return "";
        }
        String valueOf = String.valueOf(map.get("fpid"));
        String valueOf2 = String.valueOf(map.get("app_key"));
        String valueOf3 = String.valueOf(map.get("device_id"));
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append(valueOf3);
        sb.append("f8a69f1719916z");
        String lowerCase = C9762a.m28789a(sb.toString()).toLowerCase();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                if (entry.getValue() == null) {
                    str2 = "";
                } else {
                    str2 = entry.getValue().toString();
                }
                String str3 = (String) entry.getKey();
                if (!C6319n.m19594a("app_key", str3) && !C6319n.m19594a(str3, "extra")) {
                    if (C6319n.m19594a("app_version", str3)) {
                        buildUpon.appendQueryParameter("version_code", str2);
                    } else {
                        buildUpon.appendQueryParameter(str3, str2);
                    }
                }
            }
        }
        String str4 = (String) map.get("extra");
        if (!C6319n.m19593a(str4)) {
            for (String str5 : str4.split("&")) {
                if (!TextUtils.isEmpty(str5)) {
                    String[] split2 = str5.split("=");
                    if (split2.length == 2) {
                        buildUpon.appendQueryParameter(split2[0], split2[1]);
                    }
                }
            }
        }
        buildUpon.appendQueryParameter("access_key", lowerCase);
        buildUpon.appendQueryParameter("ne", String.valueOf(m28878j()));
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    private void m28871a(String str, int i, String str2, boolean z) {
        mo24229a(2);
        mo24242e();
        if (this.f26641e != null && z) {
            this.f26641e.mo24262a(str, i, str2);
        }
    }
}
