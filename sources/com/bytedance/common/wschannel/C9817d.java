package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.C9746b;

/* renamed from: com.bytedance.common.wschannel.d */
public class C9817d {

    /* renamed from: a */
    private static C9817d f26730a;

    /* renamed from: b */
    private final Context f26731b;

    /* renamed from: c */
    private final C9746b f26732c = WsChannelMultiProcessSharedProvider.m28727a(this.f26731b);

    /* renamed from: b */
    public final String mo24287b() {
        return this.f26732c.mo24127a("ws_apps", "");
    }

    /* renamed from: c */
    public final boolean mo24288c() {
        return this.f26732c.mo24128a("key_ok_impl_enable", true);
    }

    /* renamed from: d */
    public final long mo24289d() {
        return this.f26732c.mo24125a("key_io_limit_size", 10485760);
    }

    /* renamed from: e */
    public final long mo24290e() {
        return this.f26732c.mo24125a("key_retry_send_msg_delay", 0);
    }

    /* renamed from: f */
    public final boolean mo24291f() {
        return this.f26732c.mo24128a("enableAppStateChangeReport", false);
    }

    /* renamed from: a */
    public final boolean mo24286a() {
        return this.f26732c.mo24128a("frontier_enabled", true);
    }

    /* renamed from: a */
    public final void mo24285a(String str) {
        this.f26732c.mo24126a().mo24123a("ws_apps", str).mo24124a();
    }

    private C9817d(Context context) {
        this.f26731b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C9817d m28950a(Context context) {
        if (f26730a == null) {
            synchronized (C9817d.class) {
                if (f26730a == null) {
                    f26730a = new C9817d(context);
                }
            }
        }
        return f26730a;
    }
}
