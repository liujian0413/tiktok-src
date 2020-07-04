package com.p280ss.android.websocket.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.websocket.internal.proto.Frame;
import com.p280ss.android.websocket.internal.proto.Frame.Builder;
import com.p280ss.android.websocket.internal.proto.Frame.ExtendedEntry;
import com.p280ss.android.websocket.p1779a.C45405a;
import com.p280ss.android.websocket.p1779a.C45418b;
import com.p280ss.android.websocket.p1779a.C45421c;
import com.p280ss.android.websocket.p344ws.C45441a;
import com.p280ss.android.websocket.p344ws.WebSocketStatus;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45455a;
import com.p280ss.android.websocket.p344ws.output.C45456b;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.p280ss.android.websocket.p344ws.output.C45458d;
import com.p280ss.android.websocket.p344ws.output.C45459e;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.output.WSHandShakeState;
import com.p280ss.android.websocket.p344ws.p1781a.C45443a;
import com.p280ss.android.websocket.p344ws.p1781a.C45444b;
import com.p280ss.android.websocket.p344ws.p1781a.C45445c;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import com.p280ss.android.websocket.p344ws.p1781a.C45448f;
import com.p280ss.android.websocket.p344ws.p1782c.C45454e;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.ByteString;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.websocket.internal.WebSocketService */
public class WebSocketService extends Service {

    /* renamed from: a */
    public final Map<String, WebSocketStatus> f116976a = new HashMap();

    /* renamed from: b */
    public final Map<String, C45405a> f116977b = new HashMap();

    /* renamed from: c */
    public final Set<String> f116978c = new HashSet();

    /* renamed from: d */
    public final Map<String, Long> f116979d = new HashMap();

    /* renamed from: e */
    public Handler f116980e;

    /* renamed from: f */
    public Handler f116981f;

    /* renamed from: g */
    public Looper f116982g;

    /* renamed from: h */
    public C45441a f116983h;

    /* renamed from: com.ss.android.websocket.internal.WebSocketService$a */
    class C45438a extends Handler {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    WebSocketService.this.mo108778a((C45444b) message.obj);
                    return;
                case 1:
                    WebSocketService.this.mo108780a(((C45443a) message.obj).f117039a);
                    return;
                case 2:
                    WebSocketService.this.f116982g.quit();
                    break;
                case 3:
                    WebSocketService.this.mo108779a((C45447e) message.obj);
                    return;
            }
        }

        public C45438a(Looper looper) {
            super(looper);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: a */
    public final boolean mo108782a(C45447e eVar, WSHandShakeState wSHandShakeState) {
        long a = this.f116983h.mo108836c().mo108842a(wSHandShakeState);
        if (a == -1) {
            return false;
        }
        this.f116980e.sendMessageDelayed(this.f116980e.obtainMessage(3, eVar), a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo108784a(final String str, final C7305b bVar, final C45445c cVar, WSHandShakeState wSHandShakeState) {
        long a = this.f116983h.mo108835b().mo108842a(wSHandShakeState);
        if (a == -1) {
            return false;
        }
        this.f116980e.postDelayed(new Runnable() {
            public final void run() {
                WebSocketService.this.mo108781a(str, bVar, cVar);
            }
        }, a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo108783a(String str, C45439a aVar) {
        if (aVar == null) {
            return false;
        }
        long seqId = aVar.getSeqId();
        if (this.f116979d.get(str) == null) {
            this.f116979d.put(str, Long.valueOf(seqId));
            return true;
        }
        long longValue = ((Long) this.f116979d.get(str)).longValue();
        if (seqId <= longValue) {
            return false;
        }
        this.f116979d.put(str, Long.valueOf(longValue));
        return true;
    }

    public void onDestroy() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f116980e = new Handler(getMainLooper());
        HandlerThread handlerThread = new HandlerThread("web_socket_service");
        handlerThread.start();
        this.f116982g = handlerThread.getLooper();
        this.f116981f = new C45438a(this.f116982g);
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        this.f116983h = C45441a.m143654a(this);
    }

    /* renamed from: b */
    public static String m143637b(Response response) {
        if (response != null) {
            try {
                if (response.body != null) {
                    return response.body.string();
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }

    /* renamed from: a */
    private static boolean m143636a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @C7709l
    public void onEvent(C45444b bVar) {
        if (!m143636a((Context) this)) {
            C7705c.m23799a().mo20394d(new C45458d(bVar.f117040a, WSHandShakeState.INTERNAL_ERROR));
            return;
        }
        String str = bVar.f117040a;
        WebSocketStatus webSocketStatus = (WebSocketStatus) this.f116976a.get(str);
        if (webSocketStatus == null || webSocketStatus.f117029a == ConnectState.CLOSED) {
            m143638b(str, bVar.f117041b, bVar.f117042c);
        }
    }

    /* renamed from: a */
    public static long m143634a(Response response) {
        String str;
        StringBuilder sb = new StringBuilder("open websocket headers: ");
        if (response == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = response.headers.toString();
        }
        sb.append(str);
        if (response == null || response.headers == null) {
            return -1;
        }
        String str2 = response.headers.get("Handshake-Options");
        if (C6319n.m19593a(str2)) {
            return -1;
        }
        String str3 = "";
        String trim = str2.trim();
        String[] split = trim.split(";");
        if (split.length == 0) {
            str3 = trim.replace("ping-interval=", "");
        } else {
            int length = split.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str4 = split[i];
                    if (str4.contains("ping-interval=")) {
                        str3 = str4.replace("ping-interval=", "");
                        break;
                    }
                    i++;
                }
            }
        }
        try {
            return 1000 * Long.valueOf(str3).longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @C7709l
    public void onEvent(C45443a aVar) {
        String str = aVar.f117039a;
        WebSocketStatus webSocketStatus = (WebSocketStatus) this.f116976a.get(str);
        if (webSocketStatus != null) {
            if (webSocketStatus.f117029a == ConnectState.CONNECTED) {
                this.f116981f.obtainMessage(1, aVar).sendToTarget();
                this.f116976a.put(str, webSocketStatus.mo108833a(ConnectState.CLOSING));
                C7705c.m23799a().mo20394d(new C45460f(str, ConnectState.CLOSING));
                return;
            }
            if (webSocketStatus.f117029a == ConnectState.RETRY_WAITING) {
                this.f116976a.remove(str);
                C7705c.m23799a().mo20394d(new C45460f(str, null));
            }
        }
    }

    /* renamed from: a */
    public final void mo108778a(C45444b bVar) {
        final String str = bVar.f117040a;
        final C7305b bVar2 = bVar.f117041b;
        final C45445c cVar = bVar.f117042c;
        if (this.f116978c.contains(str) && (this.f116976a.get(str) == null || ((WebSocketStatus) this.f116976a.get(str)).f117029a == ConnectState.CONNECTED)) {
            C45405a aVar = (C45405a) this.f116977b.get(str);
            if (aVar != null) {
                try {
                    aVar.mo108755a(new Buffer().writeUtf8("ping"));
                } catch (Exception unused) {
                    this.f116980e.post(new Runnable() {
                        public final void run() {
                            C7705c.m23799a().mo20394d(new C45458d(str, WSHandShakeState.INTERNAL_ERROR));
                            if (WebSocketService.this.mo108784a(str, bVar2, cVar, WSHandShakeState.INTERNAL_ERROR)) {
                                WebSocketStatus webSocketStatus = (WebSocketStatus) WebSocketService.this.f116976a.get(str);
                                if (webSocketStatus != null) {
                                    WebSocketService.this.f116976a.put(str, webSocketStatus.mo108833a(ConnectState.RETRY_WAITING));
                                }
                                C7705c.m23799a().mo20394d(new C45460f(str, ConnectState.RETRY_WAITING));
                                return;
                            }
                            WebSocketService.this.f116976a.remove(str);
                            C7705c.m23799a().mo20394d(new C45460f(str, null));
                            WebSocketService.this.f116977b.remove(str);
                        }
                    });
                }
            }
            this.f116978c.remove(str);
        }
    }

    @C7709l
    public void onEvent(C45446d dVar) {
        if (!m143636a((Context) this)) {
            C7705c.m23799a().mo20394d(new C45459e(dVar.f117043a, dVar.f117044b, 3));
            return;
        }
        String str = dVar.f117043a;
        if (!TextUtils.isEmpty(str) && dVar.f117044b != null) {
            WebSocketStatus webSocketStatus = (WebSocketStatus) this.f116976a.get(str);
            if (webSocketStatus == null || webSocketStatus.f117029a != ConnectState.CONNECTED) {
                C7705c.m23799a().mo20394d(new C45459e(str, dVar.f117044b, 0));
            } else {
                this.f116981f.obtainMessage(3, dVar.f117044b).sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final void mo108779a(final C45447e eVar) {
        final String str = eVar.f117045a;
        if (this.f116976a.get(str) == null || ((WebSocketStatus) this.f116976a.get(str)).f117029a != ConnectState.CONNECTED) {
            C7705c.m23799a().mo20394d(new C45459e(str, eVar, 0));
            return;
        }
        C45405a aVar = (C45405a) this.f116977b.get(str);
        if (aVar != null) {
            try {
                byte[] bArr = eVar.f117046b;
                Map a = eVar.mo108841a();
                ArrayList arrayList = new ArrayList();
                for (String str2 : a.keySet()) {
                    arrayList.add(new ExtendedEntry(str2, (String) a.get(str2)));
                }
                aVar.mo108754a(RequestBody.create(C45405a.f116919b, Frame.ADAPTER.encode(new Builder().service(Integer.valueOf(eVar.f117049e)).seqid(Long.valueOf(eVar.f117047c)).logid(Long.valueOf(eVar.f117048d)).method(Integer.valueOf(eVar.f117050f)).payload(ByteString.m23795of(bArr)).headers(arrayList).payload_type(eVar.f117051g).payload_encoding(eVar.f117052h).build())));
            } catch (Exception unused) {
                this.f116980e.post(new Runnable() {
                    public final void run() {
                        if (!WebSocketService.this.mo108782a(eVar, WSHandShakeState.INTERNAL_ERROR)) {
                            C7705c.m23799a().mo20394d(new C45459e(str, eVar, 1));
                        }
                    }
                });
            }
        } else {
            this.f116980e.post(new Runnable() {
                public final void run() {
                    C7705c.m23799a().mo20394d(new C45459e(str, eVar, 2));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo108780a(final String str) {
        if (!m143636a((Context) this)) {
            this.f116980e.post(new Runnable() {
                public final void run() {
                    WebSocketService.this.f116978c.remove(str);
                    WebSocketService.this.f116980e.post(new Runnable() {
                        public final void run() {
                            C7705c.m23799a().mo20394d(new C45455a(1000, str, "no network"));
                            WebSocketService.this.f116976a.remove(str);
                            C7705c.m23799a().mo20394d(new C45460f(str, null));
                            WebSocketService.this.f116977b.remove(str);
                            WebSocketService.this.f116979d.remove(str);
                        }
                    });
                }
            });
            return;
        }
        C45405a aVar = (C45405a) this.f116977b.get(str);
        if (aVar != null) {
            try {
                aVar.mo108753a(1000, "Bye!");
            } catch (Exception e) {
                this.f116980e.post(new Runnable() {
                    public final void run() {
                        WebSocketService.this.f116978c.remove(str);
                        WebSocketService.this.f116980e.post(new Runnable() {
                            public final void run() {
                                C7705c.m23799a().mo20394d(new C45455a(1000, str, e.getMessage()));
                                WebSocketService.this.f116976a.remove(str);
                                C7705c.m23799a().mo20394d(new C45460f(str, null));
                                WebSocketService.this.f116977b.remove(str);
                                WebSocketService.this.f116979d.remove(str);
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m143635a(Exception exc, Response response) {
        if (response != null && response.headers != null) {
            Headers headers = response.headers;
            String str = headers.get("Handshake-Msg");
            String str2 = headers.get("Handshake-Status");
            C6319n.m19593a(str);
            C6319n.m19593a(str2);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f116980e.postDelayed(new Runnable() {
            public final void run() {
                C7705c.m23799a().mo20394d(new C45448f());
            }
        }, 300);
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: b */
    private void m143638b(final String str, final C7305b bVar, final C45445c cVar) {
        this.f116976a.put(str, new WebSocketStatus(ConnectState.OPENING, 0));
        C7705c.m23799a().mo20394d(new C45460f(str, ConnectState.OPENING));
        this.f116977b.remove(str);
        this.f116979d.remove(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(cVar.mo87187a());
        C45418b.m143622a(new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).build(), new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp2").url(sb.toString()).build()).mo108771a((C45421c) new C45421c() {
            /* renamed from: a */
            public final void mo108776a(ResponseBody responseBody) throws IOException {
                final Object obj;
                byte[] bytes = responseBody.bytes();
                if (!C6319n.m19593a(String.valueOf(bytes))) {
                    final Frame frame = (Frame) Frame.ADAPTER.decode(bytes);
                    if (WebSocketService.this.mo108783a(str, (C45439a) frame)) {
                        final byte[] payload = frame.getPayload();
                        if (bVar != null) {
                            obj = bVar.mo18093a(frame);
                        } else {
                            obj = null;
                        }
                        WebSocketService.this.f116980e.post(new Runnable() {
                            public final void run() {
                                C45457c cVar = new C45457c(str, payload, obj);
                                cVar.f117067d = frame.getMethod();
                                cVar.mo108845a(frame.service);
                                C7705c.m23799a().mo20394d(cVar);
                            }
                        });
                    }
                }
            }

            /* renamed from: a */
            public final void mo108777a(Buffer buffer) {
                String str;
                long j;
                StringBuilder sb = new StringBuilder("websocket pong: ");
                if (buffer == null) {
                    str = "";
                } else {
                    str = buffer.readUtf8();
                }
                sb.append(str);
                WebSocketService.this.f116978c.remove(str);
                C45454e d = WebSocketService.this.f116983h.mo108837d();
                WebSocketStatus webSocketStatus = (WebSocketStatus) WebSocketService.this.f116976a.get(str);
                if (webSocketStatus != null) {
                    j = d.mo108844a(webSocketStatus.f117030b);
                } else {
                    j = 0;
                }
                if (j > 0) {
                    WebSocketService.this.f116981f.postDelayed(new Runnable() {
                        public final void run() {
                            if (WebSocketService.this.f116977b.get(str) != null) {
                                WebSocketService.this.f116981f.obtainMessage(0, new C45444b(str, bVar, cVar)).sendToTarget();
                            }
                        }
                    }, j);
                    WebSocketService.this.f116978c.add(str);
                }
            }

            /* renamed from: a */
            public final void mo108773a(final int i, final String str) {
                WebSocketService.this.f116978c.remove(str);
                WebSocketService.this.f116980e.post(new Runnable() {
                    public final void run() {
                        C7705c.m23799a().mo20394d(new C45455a(i, str, str));
                        WebSocketService.this.f116976a.remove(str);
                        C7705c.m23799a().mo20394d(new C45460f(str, null));
                        WebSocketService.this.f116977b.remove(str);
                    }
                });
            }

            /* renamed from: a */
            public final void mo108774a(C45405a aVar, Response response) {
                WebSocketService.this.f116978c.add(str);
                final String b = WebSocketService.m143637b(response);
                final long a = WebSocketService.m143634a(response);
                Handler handler = WebSocketService.this.f116980e;
                final C45405a aVar2 = aVar;
                C454241 r2 = new Runnable() {
                    public final void run() {
                        C45441a.m143654a(WebSocketService.this).mo108835b().mo108843a();
                        C7705c.m23799a().mo20394d(new C45456b(str, b));
                        WebSocketService.this.f116977b.put(str, aVar2);
                        WebSocketService.this.f116976a.put(str, new WebSocketStatus(ConnectState.CONNECTED, a));
                        C7705c.m23799a().mo20394d(new C45460f(str, ConnectState.CONNECTED));
                        WebSocketService.this.f116981f.obtainMessage(0, new C45444b(str, bVar, cVar)).sendToTarget();
                    }
                };
                handler.post(r2);
            }

            /* renamed from: a */
            public final void mo108775a(final IOException iOException, Response response) {
                final WSHandShakeState wSHandShakeState;
                WebSocketService.m143635a((Exception) iOException, response);
                WebSocketService.this.f116978c.remove(str);
                final WebSocketStatus webSocketStatus = (WebSocketStatus) WebSocketService.this.f116976a.get(str);
                if (webSocketStatus == null || webSocketStatus.f117029a != ConnectState.CLOSING) {
                    if (response == null || response.headers == null) {
                        wSHandShakeState = WSHandShakeState.INTERNAL_ERROR;
                    } else {
                        Headers headers = response.headers;
                        String str = response.headers.get("Handshake-Msg");
                        if (C6319n.m19593a(str)) {
                            wSHandShakeState = WSHandShakeState.INTERNAL_ERROR;
                        } else {
                            try {
                                wSHandShakeState = WSHandShakeState.valueOf(str);
                            } catch (Exception unused) {
                                wSHandShakeState = WSHandShakeState.INTERNAL_ERROR;
                            }
                        }
                    }
                    WebSocketService.this.f116980e.post(new Runnable() {
                        public final void run() {
                            C7705c.m23799a().mo20394d(new C45458d(str, wSHandShakeState));
                            if (WebSocketService.this.mo108784a(str, bVar, cVar, wSHandShakeState)) {
                                if (webSocketStatus != null) {
                                    WebSocketService.this.f116976a.put(str, webSocketStatus.mo108833a(ConnectState.RETRY_WAITING));
                                } else {
                                    WebSocketService.this.f116976a.put(str, new WebSocketStatus(ConnectState.RETRY_WAITING, 0));
                                }
                                C7705c.m23799a().mo20394d(new C45460f(str, ConnectState.RETRY_WAITING));
                                return;
                            }
                            WebSocketService.this.f116976a.remove(str);
                            C7705c.m23799a().mo20394d(new C45460f(str, null));
                            WebSocketService.this.f116977b.remove(str);
                        }
                    });
                    return;
                }
                WebSocketService.this.f116980e.post(new Runnable() {
                    public final void run() {
                        C7705c.m23799a().mo20394d(new C45455a(-1, str, iOException.toString()));
                        WebSocketService.this.f116976a.remove(str);
                        C7705c.m23799a().mo20394d(new C45460f(str, null));
                        WebSocketService.this.f116977b.remove(str);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo108781a(String str, C7305b bVar, C45445c cVar) {
        WebSocketStatus webSocketStatus = (WebSocketStatus) this.f116976a.get(str);
        if (webSocketStatus != null && webSocketStatus.f117029a == ConnectState.RETRY_WAITING) {
            m143638b(str, bVar, cVar);
        }
    }
}
