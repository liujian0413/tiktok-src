package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.channel.p486a.p487a.C9775b;
import com.bytedance.common.wschannel.p484b.C9757a;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.b */
public final class C9808b implements IWsChannelClient {

    /* renamed from: a */
    private static String f26700a = "";

    /* renamed from: i */
    private static boolean f26701i = true;

    /* renamed from: b */
    private final int f26702b;

    /* renamed from: c */
    private final Handler f26703c;

    /* renamed from: d */
    private boolean f26704d;

    /* renamed from: e */
    private List<String> f26705e;

    /* renamed from: f */
    private boolean f26706f = true;

    /* renamed from: g */
    private IWsChannelClient f26707g;

    /* renamed from: h */
    private C9764a f26708h;

    /* renamed from: a */
    private static boolean m28928a() {
        return f26701i;
    }

    public final boolean isConnected() {
        if (this.f26707g != null) {
            return this.f26707g.isConnected();
        }
        return false;
    }

    public final void stopConnection() {
        if (this.f26707g != null) {
            this.f26707g.stopConnection();
        }
    }

    /* renamed from: b */
    private void m28929b() throws Exception {
        if (this.f26707g == null) {
            Class cls = null;
            if (!C6319n.m19593a(f26700a)) {
                cls = m28926a(f26700a);
            }
            if (cls == null) {
                cls = m28926a("org.chromium.wschannel.MySelfChannelImpl");
                this.f26706f = true;
            }
            if (cls == null) {
                cls = m28926a("com.b.c.ws.MySelfChannelImpl");
                this.f26706f = false;
            }
            if (cls != null) {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof IWsChannelClient) {
                    this.f26707g = (IWsChannelClient) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("plugin class not found");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|(2:5|(5:7|(1:12)(1:11)|13|14|15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            r5.f26704d = r0     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f26707g     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f26707g     // Catch:{ all -> 0x004a }
            r1.destroy()     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f26707g     // Catch:{ all -> 0x004a }
            boolean r1 = r1 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.C9775b     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0048
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.util.List<java.lang.String> r2 = r5.f26705e     // Catch:{ all -> 0x004a }
            r3 = 0
            if (r2 == 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.f26705e     // Catch:{ all -> 0x004a }
            int r2 = r2.size()     // Catch:{ all -> 0x004a }
            if (r2 <= 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.f26705e     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x004a }
            goto L_0x0030
        L_0x002e:
            java.lang.String r2 = ""
        L_0x0030:
            java.lang.String r4 = "type"
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "state"
            r4 = 3
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "url"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = "channel_type"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0048 }
            r5.m28927a(r1)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.C9808b.destroy():void");
    }

    /* renamed from: a */
    private static Class<?> m28926a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void onAppStateChanged(int i) {
        if (this.f26707g != null) {
            this.f26707g.onAppStateChanged(i);
        }
    }

    public final void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            if (!this.f26704d) {
                m28927a(jSONObject);
            }
        }
    }

    public final void onMessage(byte[] bArr) {
        if (this.f26708h != null) {
            this.f26708h.mo24185a(this.f26702b, bArr);
        }
    }

    public final void onNetworkStateChanged(int i) {
        if (this.f26707g != null) {
            this.f26707g.onNetworkStateChanged(i);
        }
    }

    public final boolean sendMessage(byte[] bArr) {
        if (this.f26707g != null) {
            return this.f26707g.sendMessage(bArr);
        }
        return false;
    }

    /* renamed from: a */
    private void m28927a(JSONObject jSONObject) {
        if (this.f26708h != null) {
            this.f26708h.mo24184a(this.f26702b, jSONObject);
        }
    }

    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (this.f26707g != null) {
            this.f26707g.onParameterChange(map, list);
        }
        this.f26705e = list;
    }

    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (this.f26707g != null) {
            this.f26707g.openConnection(map, list);
        }
        this.f26705e = list;
    }

    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (this.f26707g != null) {
            try {
                this.f26707g.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.f26707g instanceof C9775b)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("stackTrace", Log.getStackTraceString(th));
                    C9757a.m28773a(context, "cronet_ws_error", bundle);
                    this.f26707g = new C9775b(this.f26702b, this.f26703c);
                    this.f26707g.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C9808b m28925a(int i, C9764a aVar, Handler handler) {
        return new C9808b(i, aVar, handler);
    }

    private C9808b(int i, C9764a aVar, Handler handler) {
        this.f26702b = i;
        this.f26708h = aVar;
        this.f26703c = handler;
        if (m28928a()) {
            try {
                m28929b();
                if (!this.f26706f) {
                    f26701i = false;
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f26707g == null) {
            this.f26707g = new C9775b(i, handler);
        }
    }
}
