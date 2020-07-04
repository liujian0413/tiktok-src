package com.p280ss.android.ugc.aweme.utils.p1692a;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.reflect.C6322b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.a.b */
public final class C42911b {

    /* renamed from: com.ss.android.ugc.aweme.utils.a.b$a */
    static class C42912a implements Callback {

        /* renamed from: a */
        Handler f111441a;

        /* renamed from: b */
        Callback f111442b;

        /* renamed from: c */
        private List<Callback> f111443c = new ArrayList();

        /* renamed from: a */
        public final void mo104627a(Callback callback) {
            this.f111443c.add(callback);
        }

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (message == null) {
                if (this.f111442b != null) {
                    return this.f111442b.handleMessage(message);
                }
                return false;
            } else if (message.what == 131 && VERSION.SDK_INT == 19 && !C6319n.m19593a(Build.MODEL) && Build.MODEL.toLowerCase().trim().startsWith("vivo")) {
                try {
                    if (this.f111442b != null) {
                        z = this.f111442b.handleMessage(message);
                    }
                    if (!z && this.f111441a != null) {
                        this.f111441a.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else {
                for (Callback handleMessage : this.f111443c) {
                    if (handleMessage.handleMessage(message)) {
                        return true;
                    }
                }
                if (this.f111442b != null) {
                    return this.f111442b.handleMessage(message);
                }
                return false;
            }
        }

        C42912a(Handler handler, Callback callback) {
            this.f111441a = handler;
            this.f111442b = callback;
        }
    }

    /* renamed from: a */
    public static void m136240a() {
        try {
            C6322b b = C6322b.m19609a(Class.forName("android.app.ActivityThread")).mo15160b("currentActivityThread");
            if (b != null) {
                Handler handler = (Handler) b.mo15161b("mH", Class.forName("android.app.ActivityThread$H")).f18556a;
                if (handler != null) {
                    C6322b a = C6322b.m19610a((Object) handler);
                    C42912a aVar = new C42912a(handler, (Callback) a.mo15161b("mCallback", Callback.class).f18556a);
                    aVar.mo104627a(new C42910a());
                    a.mo15157a("mCallback", (Object) aVar);
                }
            }
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }
}
