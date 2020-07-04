package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.C9808b;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.C9826a;
import com.bytedance.common.wschannel.p483a.C9750b;
import com.bytedance.common.wschannel.p484b.C9757a;
import com.p280ss.android.common.util.C6776h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.common.wschannel.server.a */
public class C9829a implements C6310a, C9842a {

    /* renamed from: f */
    private static C9829a f26796f;

    /* renamed from: a */
    public final HandlerThread f26797a = new HandlerThread("wschannel");

    /* renamed from: b */
    public final C6309f f26798b;

    /* renamed from: c */
    public final Context f26799c;

    /* renamed from: d */
    public final C9846f f26800d;

    /* renamed from: e */
    public C9840c f26801e;

    /* renamed from: g */
    private final Object f26802g = new Object();

    /* renamed from: h */
    private final C9843d f26803h;

    /* renamed from: i */
    private AtomicLong f26804i = new AtomicLong(0);

    /* renamed from: j */
    private Map<Integer, IWsApp> f26805j = new ConcurrentHashMap();

    /* renamed from: k */
    private Map<Integer, IWsChannelClient> f26806k = new ConcurrentHashMap();

    /* renamed from: l */
    private Map<Integer, SocketState> f26807l = new ConcurrentHashMap();

    /* renamed from: m */
    private boolean f26808m = false;

    /* renamed from: b */
    private boolean m29024b() {
        return this.f26801e.f26829a;
    }

    /* renamed from: a */
    private boolean m29022a() {
        try {
            return C6776h.m20951c(this.f26799c, this.f26799c.getPackageName());
        } catch (Exception unused) {
            return this.f26808m;
        }
    }

    /* renamed from: c */
    private void m29025c() {
        try {
            synchronized (this.f26802g) {
                for (Entry value : this.f26806k.entrySet()) {
                    IWsChannelClient iWsChannelClient = (IWsChannelClient) value.getValue();
                    if (iWsChannelClient != null) {
                        iWsChannelClient.destroy();
                    }
                }
                this.f26806k.clear();
            }
            this.f26805j.clear();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m29019a(Runnable runnable) {
        this.f26798b.post(runnable);
    }

    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        m29019a((Runnable) new Runnable() {
            public final void run() {
                C9829a.this.mo24384a(obtain);
            }
        });
    }

    /* renamed from: a */
    public static C9829a m29017a(Context context) {
        if (f26796f == null) {
            synchronized (C9829a.class) {
                if (f26796f == null) {
                    f26796f = new C9829a(context);
                }
            }
        }
        return f26796f;
    }

    /* renamed from: a */
    private void m29020a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        C9757a.m28773a(this.f26799c, "wschannel_param_null", bundle);
    }

    private C9829a(Context context) {
        this.f26799c = context.getApplicationContext();
        this.f26797a.start();
        this.f26798b = new C6309f(this.f26797a.getLooper(), this);
        this.f26800d = new C9846f(this.f26799c);
        this.f26803h = new C9843d(this.f26799c, this.f26807l, this.f26805j);
        m29019a((Runnable) new Runnable() {
            public final void run() {
                C9829a.this.f26801e = new C9840c(C9829a.this.f26799c, C9829a.this.f26798b, C9829a.this);
                C9829a.this.mo24385a(C9829a.this.f26800d.mo24407a());
            }
        });
    }

    /* renamed from: a */
    private void m29021a(Collection<IWsChannelClient> collection) {
        String str;
        if (C9817d.m28950a(this.f26799c).mo24291f()) {
            C9826a a = C9826a.m28999a(Integer.MAX_VALUE).mo24376c(4).mo24373b(9000).mo24368a(1008601).mo24371a(new byte[0]).mo24375b("pb").mo24369a("pb");
            String str2 = "IsBackground";
            if (m29022a()) {
                str = "0";
            } else {
                str = "1";
            }
            byte[] a2 = C9750b.m28754a().mo24140a(a.mo24370a(str2, str).mo24372a());
            for (IWsChannelClient sendMessage : collection) {
                try {
                    sendMessage.sendMessage(a2);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m29023b(IWsApp iWsApp) {
        int a = WsChannelService.m29015a(iWsApp);
        if (m29024b()) {
            try {
                IWsChannelClient iWsChannelClient = (IWsChannelClient) this.f26806k.get(Integer.valueOf(iWsApp.mo24145a()));
                synchronized (WsChannelService.class) {
                    IWsApp iWsApp2 = (IWsApp) this.f26805j.get(Integer.valueOf(a));
                    if (iWsChannelClient != null) {
                        if (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected()) {
                            this.f26805j.put(Integer.valueOf(a), iWsApp);
                            this.f26800d.mo24408a(this.f26805j);
                            iWsChannelClient.onParameterChange(m29018a(iWsApp), iWsApp.mo24155k());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29026c(com.bytedance.common.wschannel.app.IWsApp r8) {
        /*
            r7 = this;
            int r0 = com.bytedance.common.wschannel.server.WsChannelService.m29015a(r8)
            boolean r1 = r7.m29024b()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r1 = com.bytedance.common.wschannel.server.WsChannelService.class
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.f26805j     // Catch:{ all -> 0x0055 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.app.IWsApp r2 = (com.bytedance.common.wschannel.app.IWsApp) r2     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.channel.IWsChannelClient> r3 = r7.f26806k     // Catch:{ all -> 0x0055 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.channel.IWsChannelClient r3 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r3     // Catch:{ all -> 0x0055 }
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            boolean r6 = r8.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r5 = 0
            goto L_0x0048
        L_0x0035:
            if (r2 != 0) goto L_0x0048
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.f26805j     // Catch:{ all -> 0x0055 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r2.put(r0, r8)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.server.f r0 = r7.f26800d     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.f26805j     // Catch:{ all -> 0x0055 }
            r0.mo24408a(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0032
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x004f
            r7.m29027d(r8)
            return
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r7.m29023b(r8)
        L_0x0054:
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9829a.m29026c(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    /* renamed from: d */
    private void m29027d(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        synchronized (this.f26802g) {
            iWsChannelClient = (IWsChannelClient) this.f26806k.get(Integer.valueOf(iWsApp.mo24145a()));
            if (iWsChannelClient == null) {
                iWsChannelClient = C9808b.m28925a(iWsApp.mo24145a(), this.f26803h, this.f26798b);
                iWsChannelClient.init(this.f26799c, iWsChannelClient);
                this.f26806k.put(Integer.valueOf(iWsApp.mo24145a()), iWsChannelClient);
            }
        }
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = (SocketState) this.f26807l.get(Integer.valueOf(iWsApp.mo24145a()));
            if (socketState != null) {
                try {
                    this.f26803h.mo24403a(socketState);
                } catch (Throwable unused) {
                }
            }
        } else {
            try {
                iWsChannelClient.openConnection(m29018a(iWsApp), iWsApp.mo24155k());
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private Map<String, Object> m29018a(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.mo24152h());
        hashMap.put("fpid", Integer.valueOf(iWsApp.mo24153i()));
        hashMap.put("sdk_version", Integer.valueOf(2));
        hashMap.put("platform", Integer.valueOf(0));
        hashMap.put("app_version", Integer.valueOf(iWsApp.mo24149e()));
        hashMap.put("aid", Integer.valueOf(iWsApp.mo24146b()));
        hashMap.put("device_id", iWsApp.mo24147c());
        hashMap.put("iid", iWsApp.mo24148d());
        hashMap.put("channel_id", Integer.valueOf(iWsApp.mo24145a()));
        String j = iWsApp.mo24154j();
        if (j == null) {
            m29020a("extra");
            j = "";
        }
        if (C9817d.m28950a(this.f26799c).mo24291f()) {
            String[] split = j.split("&");
            StringBuilder sb = new StringBuilder("is_background=");
            if (m29022a()) {
                str = "0";
            } else {
                str = "1";
            }
            sb.append(str);
            String sb2 = sb.toString();
            if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
                j = sb2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(j);
                sb3.append("&");
                sb3.append(sb2);
                j = sb3.toString();
            }
        }
        hashMap.put("extra", j);
        if (iWsApp.mo24147c() == null) {
            m29020a("device_id");
        }
        if (iWsApp.mo24148d() == null) {
            m29020a("install_id");
        }
        if (C6319n.m19593a(iWsApp.mo24152h())) {
            m29020a("app_key");
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo24384a(Message message) {
        boolean z;
        IWsChannelClient iWsChannelClient;
        try {
            int i = message.what;
            if (i == 0) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable = message.getData().getParcelable("ws_app");
                if (parcelable instanceof IWsApp) {
                    m29026c((IWsApp) parcelable);
                }
            } else {
                boolean z2 = true;
                if (i == 1) {
                    message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                    Parcelable parcelable2 = message.getData().getParcelable("ws_app");
                    if (parcelable2 instanceof IntegerParcelable) {
                        int i2 = ((IntegerParcelable) parcelable2).f26736a;
                        synchronized (WsChannelService.class) {
                            this.f26805j.remove(Integer.valueOf(i2));
                            this.f26800d.mo24408a(this.f26805j);
                        }
                        synchronized (this.f26802g) {
                            iWsChannelClient = (IWsChannelClient) this.f26806k.remove(Integer.valueOf(i2));
                        }
                        if (iWsChannelClient != null) {
                            iWsChannelClient.destroy();
                        }
                        this.f26807l.remove(Integer.valueOf(i2));
                        this.f26798b.sendMessageDelayed(this.f26798b.obtainMessage(8, iWsChannelClient), 1000);
                    }
                } else {
                    boolean z3 = false;
                    if (i == 2) {
                        int i3 = message.arg1;
                        if (i3 != 1) {
                            z2 = false;
                        }
                        this.f26808m = z2;
                        this.f26803h.mo24405b();
                        if (m29024b()) {
                            m29021a(this.f26806k.values());
                            for (IWsChannelClient iWsChannelClient2 : this.f26806k.values()) {
                                if (iWsChannelClient2 != null) {
                                    iWsChannelClient2.onAppStateChanged(i3);
                                }
                            }
                        }
                    } else if (i == 3) {
                        int i4 = message.arg1;
                        this.f26803h.mo24405b();
                        if (m29024b()) {
                            for (IWsChannelClient iWsChannelClient3 : this.f26806k.values()) {
                                if (iWsChannelClient3 != null) {
                                    iWsChannelClient3.onNetworkStateChanged(i4);
                                }
                            }
                        }
                    } else if (i == 4) {
                        message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                        Parcelable parcelable3 = message.getData().getParcelable("ws_app");
                        if (parcelable3 instanceof IWsApp) {
                            m29023b((IWsApp) parcelable3);
                        }
                    } else {
                        if (i != 5) {
                            if (i != 10) {
                                if (i == 9) {
                                    this.f26803h.mo24402a();
                                }
                            }
                        }
                        if (i == 10) {
                            z = true;
                        } else {
                            z = false;
                        }
                        message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                        Parcelable parcelable4 = message.getData().getParcelable("payload");
                        if (parcelable4 instanceof WsChannelMsg) {
                            WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable4;
                            if (wsChannelMsg.f26767b <= 0) {
                                wsChannelMsg.f26767b = this.f26804i.incrementAndGet();
                            }
                            IWsChannelClient iWsChannelClient4 = (IWsChannelClient) this.f26806k.get(Integer.valueOf(wsChannelMsg.f26776k));
                            if (iWsChannelClient4 != null) {
                                z3 = iWsChannelClient4.sendMessage(C9750b.m28754a().mo24140a(wsChannelMsg));
                                if (!z3 && !z) {
                                    long e = C9817d.m28950a(this.f26799c).mo24290e();
                                    if (e > 0) {
                                        Message obtain = Message.obtain(message);
                                        obtain.what = 10;
                                        this.f26798b.sendMessageDelayed(obtain, e);
                                    }
                                }
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putString("method", "sendPayload");
                                bundle.putInt("success", 0);
                                bundle.putString("reason", "client is null");
                                C9757a.m28773a(this.f26799c, "WsChannelSdk", bundle);
                            }
                            ComponentName componentName = wsChannelMsg.f26775j;
                            if (componentName != null) {
                                byte[] a = wsChannelMsg.mo24357a();
                                if (a == null) {
                                    a = new byte[1];
                                }
                                Intent intent = new Intent();
                                intent.setAction("com.bytedance.article.wschannel.send.payload");
                                intent.setComponent(componentName);
                                intent.putExtra("send_result", z3);
                                intent.putExtra("payload_md5", C6306c.m19564b(a));
                                this.f26799c.startService(intent);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24385a(Map<Integer, IWsApp> map) {
        if (this.f26801e.f26829a && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    m29026c(iWsApp);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24386a(boolean z) {
        if (z) {
            mo24385a(this.f26800d.mo24407a());
        } else {
            m29025c();
        }
    }
}
