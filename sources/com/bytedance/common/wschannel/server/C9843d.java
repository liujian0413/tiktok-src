package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.C9764a;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p483a.C9750b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.server.d */
final class C9843d implements C9764a {

    /* renamed from: a */
    public static AtomicBoolean f26835a = new AtomicBoolean(true);

    /* renamed from: b */
    public BlockingQueue<C9828a> f26836b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final Context f26837c;

    /* renamed from: d */
    private final Map<Integer, SocketState> f26838d;

    /* renamed from: e */
    private final Map<Integer, IWsApp> f26839e;

    /* renamed from: f */
    private final C9832b f26840f;

    /* renamed from: g */
    private ExecutorService f26841g = C9845e.m29059a();

    /* renamed from: h */
    private Runnable f26842h = m29052d();

    /* renamed from: i */
    private Future<?> f26843i = null;

    /* renamed from: d */
    private Runnable m29052d() {
        return new Runnable() {
            public final void run() {
                try {
                    Thread.currentThread().setName("MessageDispatcher");
                    while (true) {
                        Thread.currentThread();
                        if (Thread.interrupted()) {
                            break;
                        }
                        C9843d.f26835a.getAndSet(true);
                        try {
                            C9843d.this.mo24404a((C9828a) C9843d.this.f26836b.take());
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                C9843d.f26835a.getAndSet(false);
            }
        };
    }

    /* renamed from: b */
    public final void mo24405b() {
        this.f26840f.mo24389a();
    }

    /* renamed from: c */
    private void m29051c() {
        if (this.f26842h == null) {
            this.f26842h = m29052d();
        }
        try {
            this.f26843i = this.f26841g.submit(this.f26842h);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24402a() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.f26837c, WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList(this.f26838d.values()));
            m29050a(intent);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m29050a(Intent intent) {
        this.f26840f.mo24390a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24403a(SocketState socketState) {
        if (socketState != null) {
            this.f26838d.put(Integer.valueOf(socketState.f26740d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.setComponent(new ComponentName(this.f26837c, WsClientService.class));
                intent.putExtra("connection", socketState);
                m29050a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24404a(C9828a aVar) {
        if (aVar != null && aVar.f26795b != null) {
            try {
                WsChannelMsg a = C9750b.m28754a().mo24139a(aVar.f26795b);
                if (a != WsChannelMsg.f26766a) {
                    a.f26776k = aVar.f26794a;
                    a.f26775j = new ComponentName(this.f26837c, WsChannelService.class);
                    if (this.f26839e != null) {
                        if (this.f26839e.size() > 0) {
                            for (Entry value : this.f26839e.entrySet()) {
                                IWsApp iWsApp = (IWsApp) value.getValue();
                                if (iWsApp != null && iWsApp.mo24145a() == a.f26776k) {
                                    try {
                                        Intent intent = new Intent();
                                        intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                        intent.setComponent(new ComponentName(this.f26837c, WsClientService.class));
                                        intent.putExtra("payload", a);
                                        m29050a(intent);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24184a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i);
            } catch (JSONException unused) {
            }
            mo24403a(SocketState.m28961a(jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo24185a(int i, byte[] bArr) {
        if (bArr != null) {
            try {
                C9828a aVar = new C9828a();
                aVar.f26794a = i;
                aVar.f26795b = bArr;
                this.f26836b.offer(aVar);
                f26835a.getAndSet(true);
                m29051c();
            } catch (Throwable unused) {
            }
        }
    }

    C9843d(Context context, Map<Integer, SocketState> map, Map<Integer, IWsApp> map2) {
        this.f26837c = context;
        this.f26838d = map;
        this.f26839e = map2;
        this.f26840f = new C9832b(context);
        m29051c();
    }
}
