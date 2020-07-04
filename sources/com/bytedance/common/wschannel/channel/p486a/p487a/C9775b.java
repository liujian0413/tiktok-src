package com.bytedance.common.wschannel.channel.p486a.p487a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.p486a.p487a.C9790c.C9795a;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9769a;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9771c;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9773e;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9774f;
import com.bytedance.common.wschannel.p484b.C9757a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b */
public final class C9775b implements C6310a, IWsChannelClient {

    /* renamed from: a */
    public Context f26565a;

    /* renamed from: b */
    public Map<String, Object> f26566b = new HashMap();

    /* renamed from: c */
    public List<String> f26567c;

    /* renamed from: d */
    private final int f26568d;

    /* renamed from: e */
    private Handler f26569e;

    /* renamed from: f */
    private C9769a f26570f = new C9769a();

    /* renamed from: g */
    private C9790c f26571g;

    /* renamed from: h */
    private boolean f26572h;

    /* renamed from: i */
    private ContentObserver f26573i = new ContentObserver(this.f26569e) {
        public final void onChange(boolean z) {
            super.onChange(z);
            if (C9775b.m28818a(C9775b.this.f26565a)) {
                C9775b.this.openConnection(C9775b.this.f26566b, C9775b.this.f26567c);
            } else {
                C9775b.this.stopConnection();
            }
        }
    };

    public final void handleMsg(Message message) {
    }

    public final void onConnection(JSONObject jSONObject) {
    }

    public final void onMessage(byte[] bArr) {
    }

    public final boolean isConnected() {
        return this.f26571g.mo24244g();
    }

    /* renamed from: a */
    private void m28817a() {
        try {
            if (this.f26565a != null) {
                this.f26565a.getContentResolver().unregisterContentObserver(this.f26573i);
            }
        } catch (Throwable unused) {
        }
    }

    public final void stopConnection() {
        Bundle bundle = new Bundle();
        bundle.putString("method", "stopConnection");
        C9757a.m28773a(this.f26565a, "WsChannelSdk_ok", bundle);
        this.f26571g.mo24237b();
    }

    public final void destroy() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder("destroy, channelId = ");
        sb.append(this.f26568d);
        bundle.putString("method", sb.toString());
        C9757a.m28773a(this.f26565a, "WsChannelSdk_ok", bundle);
        this.f26571g.mo24245h();
        m28817a();
    }

    /* renamed from: a */
    public static boolean m28818a(Context context) {
        return C9817d.m28950a(context).mo24288c();
    }

    /* renamed from: b */
    private void m28819b(Context context) {
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m28726a(context, "key_ok_impl_enable", "boolean"), true, this.f26573i);
        } catch (Throwable unused) {
        }
    }

    public final boolean sendMessage(byte[] bArr) {
        if (!m28818a(this.f26565a)) {
            return false;
        }
        return this.f26571g.mo24236a(bArr);
    }

    public final void onAppStateChanged(int i) {
        if (m28818a(this.f26565a)) {
            Bundle bundle = new Bundle();
            bundle.putInt("appState", i);
            bundle.putString("method", "onAppStateChanged");
            C9757a.m28773a(this.f26565a, "WsChannelSdk_ok", bundle);
            C9790c cVar = this.f26571g;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            cVar.mo24235a(z);
            this.f26570f.mo24194a(i);
        }
    }

    public final void onNetworkStateChanged(int i) {
        if (m28818a(this.f26565a)) {
            Bundle bundle = new Bundle();
            bundle.putInt("networkState", i);
            bundle.putString("method", "onNetworkStateChanged");
            C9757a.m28773a(this.f26565a, "WsChannelSdk_ok", bundle);
            this.f26571g.mo24238b(i);
        }
    }

    public C9775b(int i, Handler handler) {
        this.f26568d = i;
        this.f26569e = handler;
    }

    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f26566b.putAll(map);
        }
        this.f26567c = list;
        if (m28818a(this.f26565a)) {
            this.f26571g.mo24234a(map, list);
        }
    }

    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (!this.f26572h) {
            this.f26572h = true;
            this.f26565a = context.getApplicationContext();
            this.f26571g = new C9795a(context).mo24251a((C9773e) new C9774f(context)).mo24250a((C9771c) this.f26570f).mo24252a();
            this.f26571g.f26641e = new C9807e(this.f26565a, this.f26571g, iWsChannelClient);
            m28819b(context);
        }
    }

    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f26566b.putAll(map);
        }
        this.f26567c = list;
        if (m28818a(this.f26565a)) {
            Bundle bundle = new Bundle();
            bundle.putString("urls", list.toString());
            bundle.putString("method", "onParameterChange");
            C9757a.m28773a(this.f26565a, "WsChannelSdk_ok", bundle);
            this.f26571g.mo24239b(map, list);
        }
    }
}
