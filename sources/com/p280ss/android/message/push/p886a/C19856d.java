package com.p280ss.android.message.push.p886a;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.p280ss.android.message.push.connection.C19861a;
import com.p280ss.android.message.push.connection.C19891b;
import com.p280ss.android.message.push.connection.C19892c;
import com.p280ss.android.message.push.connection.ConnectionState;
import com.p280ss.android.message.push.connection.p887a.C19872e;
import com.p280ss.android.message.push.connection.p887a.p888a.C19864b;
import com.p280ss.android.message.push.connection.p887a.p888a.C19867e;
import com.p280ss.android.message.push.connection.p887a.p888a.C19867e.C19868a;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.message.push.a.d */
public final class C19856d implements C19861a {

    /* renamed from: a */
    public static ConnectionState f53844a = ConnectionState.SOCKET_DISCONNECTED;

    /* renamed from: b */
    static final Object f53845b = new Object();

    /* renamed from: c */
    final long f53846c;

    /* renamed from: d */
    private final Map<Long, C19853a> f53847d = new HashMap();

    /* renamed from: e */
    private C19892c f53848e = null;

    /* renamed from: f */
    private Context f53849f;

    /* renamed from: com.ss.android.message.push.a.d$a */
    public interface C19859a {
        /* renamed from: a */
        void mo53145a();
    }

    /* renamed from: a */
    public final void mo53224a() {
        if (this.f53848e != null) {
            this.f53848e.mo53259b();
            this.f53848e = null;
        }
    }

    /* renamed from: b */
    private void m65574b(final Context context) throws IOException {
        if (C20090b.m66187a().mo53789o()) {
            synchronized (f53845b) {
                if (this.f53848e == null) {
                    this.f53848e = new C19872e(context.getApplicationContext(), this);
                }
            }
            if (this.f53848e.mo53262d() != ConnectionState.SOCKET_DISCONNECTED || !C19860e.m65587a(context)) {
                if (this.f53848e.mo53262d() == ConnectionState.HANDSSHAKEED || this.f53848e.mo53262d() == ConnectionState.REGISTERED) {
                    mo53232c(context, new C19859a() {
                        /* renamed from: a */
                        public final void mo53145a() {
                            C19856d.this.mo53227a(context);
                        }
                    });
                }
                return;
            }
            this.f53848e.mo53252a();
            this.f53848e.mo53260b(ConnectionState.ALL, this);
            this.f53848e.mo53254a(ConnectionState.ALL, this);
        }
    }

    /* renamed from: a */
    public final void mo53227a(Context context) {
        if (context != null && C20090b.m66187a().mo53789o()) {
            if (this.f53848e == null || this.f53848e.mo53262d() == ConnectionState.SOCKET_DISCONNECTED) {
                try {
                    if (this.f53847d != null && !this.f53847d.isEmpty()) {
                        m65574b(context);
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53230a(C19891b bVar) {
        f53844a = bVar.f53951b;
        Iterator it = this.f53847d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C19856d(long j, Context context) {
        this.f53846c = j;
        this.f53849f = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo53226a(long j, byte[] bArr) {
        C19853a aVar = (C19853a) this.f53847d.get(Long.valueOf(j));
        if (aVar != null) {
            try {
                aVar.mo53216a(this.f53849f, bArr);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53225a(long j, final Context context) {
        this.f53847d.remove(Long.valueOf(j));
        if (this.f53847d == null || this.f53847d.isEmpty()) {
            mo53224a();
        } else {
            mo53232c(context, new C19859a() {
                /* renamed from: a */
                public final void mo53145a() {
                    C19856d.this.mo53227a(context);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo53232c(Context context, C19859a aVar) {
        if (context != null && C20090b.m66187a().mo53789o()) {
            try {
                if (this.f53848e == null || !(this.f53848e.mo53262d() == ConnectionState.HANDSSHAKEED || this.f53848e.mo53262d() == ConnectionState.REGISTERED)) {
                    if (aVar != null) {
                        aVar.mo53145a();
                    }
                    return;
                }
                C19867e eVar = new C19867e();
                for (C19853a aVar2 : this.f53847d.values()) {
                    eVar.getClass();
                    C19868a aVar3 = new C19868a();
                    aVar3.f53872a = Long.valueOf(aVar2.mo53219d());
                    aVar3.f53873b = aVar2.mo53218c();
                    aVar3.f53874c = aVar2.mo53220e();
                    eVar.f53871a.add(aVar3);
                }
                this.f53848e.mo53256a(eVar);
            } catch (NullPointerException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53228a(Context context, C19859a aVar) {
        if (context == null || !C20090b.m66187a().mo53789o()) {
            return;
        }
        if (this.f53848e == null || this.f53848e.mo53262d().getStateValue() < ConnectionState.SOCKET_CONNECTED.getStateValue() || this.f53848e.mo53262d().getStateValue() >= ConnectionState.SOCKET_DISCONNECTING.getStateValue()) {
            aVar.mo53145a();
        } else {
            try {
                this.f53848e.mo53261c();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo53231b(Context context, C19859a aVar) {
        double d;
        if (context != null && C20090b.m66187a().mo53789o() && this.f53848e != null && this.f53848e.mo53262d() == ConnectionState.SOCKET_CONNECTED) {
            C19853a aVar2 = (C19853a) this.f53847d.get(Long.valueOf(this.f53846c));
            if (aVar2 != null) {
                try {
                    C19864b bVar = new C19864b();
                    bVar.f53856a = 1;
                    bVar.f53857b = (byte) NetworkUtils.m19550d(context).getValue();
                    String a = aVar2.mo53215a();
                    String b = aVar2.mo53217b();
                    long d2 = aVar2.mo53219d();
                    long c = aVar2.mo53218c();
                    if (!C6319n.m19593a(a) && 0 != d2) {
                        if (0 != c) {
                            bVar.f53858c = Long.parseLong(b);
                            StringBuilder sb = new StringBuilder();
                            sb.append(a);
                            sb.append("_");
                            sb.append(d2);
                            bVar.f53862g = sb.toString();
                            bVar.f53859d = c;
                            Pair pair = null;
                            try {
                                pair = C20090b.m66187a().mo53772e();
                            } catch (Exception unused) {
                            }
                            double d3 = 0.0d;
                            if (pair == null) {
                                d = 0.0d;
                            } else {
                                d = ((Double) pair.first).doubleValue();
                            }
                            bVar.f53860e = d;
                            if (pair != null) {
                                d3 = ((Double) pair.second).doubleValue();
                            }
                            bVar.f53861f = d3;
                            this.f53848e.mo53255a(bVar);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53229a(C19853a aVar, Context context) {
        if (aVar != null && C20090b.m66187a().mo53789o()) {
            try {
                this.f53847d.put(Long.valueOf(aVar.mo53219d()), aVar);
                mo53227a(context);
            } catch (Exception unused) {
            }
        }
    }
}
