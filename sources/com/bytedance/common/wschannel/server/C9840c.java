package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

/* renamed from: com.bytedance.common.wschannel.server.c */
final class C9840c {

    /* renamed from: a */
    public boolean f26829a;

    /* renamed from: b */
    private final Handler f26830b;

    /* renamed from: c */
    private final Context f26831c;

    /* renamed from: d */
    private final C9842a f26832d;

    /* renamed from: e */
    private ContentObserver f26833e = new ContentObserver(this.f26830b) {
        public final void onChange(boolean z) {
            C9840c.this.mo24400a();
        }
    };

    /* renamed from: com.bytedance.common.wschannel.server.c$a */
    interface C9842a {
        /* renamed from: a */
        void mo24386a(boolean z);
    }

    /* renamed from: b */
    private void m29046b() {
        try {
            boolean a = C9817d.m28950a(this.f26831c).mo24286a();
            if (a != this.f26829a) {
                this.f26829a = a;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m29047c() {
        try {
            this.f26831c.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m28726a(this.f26831c, "frontier_enabled", "boolean"), true, this.f26833e);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24400a() {
        try {
            boolean z = this.f26829a;
            m29046b();
            if (!(z == this.f26829a || this.f26832d == null)) {
                this.f26832d.mo24386a(this.f26829a);
            }
        } catch (Exception unused) {
        }
    }

    C9840c(Context context, Handler handler, C9842a aVar) {
        this.f26830b = handler;
        this.f26831c = context;
        this.f26832d = aVar;
        m29046b();
        m29047c();
    }
}
