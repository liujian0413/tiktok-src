package com.p280ss.android.message;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.message.C19828b.C19829a;
import com.p280ss.android.message.C19831c.C19832a;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.pushmanager.C20077j;
import com.p280ss.android.pushmanager.app.C20047d;
import com.p280ss.android.pushmanager.client.C20059a;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.message.j */
public class C19842j implements C6310a {

    /* renamed from: b */
    public static C20059a f53801b;

    /* renamed from: d */
    private static volatile C19842j f53802d;

    /* renamed from: a */
    public C19828b f53803a;

    /* renamed from: c */
    protected C19832a f53804c = new C19832a() {
        /* renamed from: a */
        public final boolean mo53175a() throws RemoteException {
            if (C19842j.f53801b != null) {
                return true;
            }
            throw C19821g.m65439a(" pushapp enable is null");
        }

        /* renamed from: b */
        public final int mo53176b() throws RemoteException {
            if (C19842j.f53801b == null) {
                throw C19821g.m65439a(" pushapp push enable is null");
            } else if (C20090b.m66187a().mo53789o()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: c */
        public final long mo53177c() throws RemoteException {
            if (C19842j.f53801b != null) {
                return C19842j.f53801b.mo53199a();
            }
            throw C19821g.m65439a(" pushapp appId is null");
        }

        /* renamed from: d */
        public final String mo53178d() throws RemoteException {
            if (C19842j.f53801b != null) {
                return C19842j.f53801b.mo53200b();
            }
            throw C19821g.m65439a(" pushapp clientId is null");
        }

        /* renamed from: e */
        public final String mo53179e() throws RemoteException {
            if (C19842j.f53801b != null) {
                return C19842j.f53801b.mo53201c();
            }
            throw C19821g.m65439a(" pushapp devicedId is null");
        }

        /* renamed from: f */
        public final String mo53180f() throws RemoteException {
            if (C19842j.f53801b != null) {
                return C19842j.f53801b.mo53202d();
            }
            throw C19821g.m65439a(" pushapp installId is null");
        }

        /* renamed from: g */
        public final String mo53181g() throws RemoteException {
            if (C19842j.f53801b != null) {
                return C19842j.f53801b.mo53203e();
            }
            throw C19821g.m65439a(" pushapp package is null");
        }
    };

    /* renamed from: e */
    private Context f53805e;

    /* renamed from: f */
    private ServiceConnection f53806f = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            C19842j.this.f53803a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C19842j.this.f53803a = C19829a.m65484a(iBinder);
            try {
                C19842j.this.f53803a.mo53131a(C19842j.this.f53804c);
                C19842j.this.mo53196b();
            } catch (RemoteException unused) {
            } catch (Exception unused2) {
            }
        }
    };

    /* renamed from: com.ss.android.message.j$a */
    static class C19845a implements C20059a {

        /* renamed from: c */
        private static volatile C19845a f53809c;

        /* renamed from: a */
        private Map<String, String> f53810a = new HashMap();

        /* renamed from: b */
        private Context f53811b;

        /* renamed from: e */
        public final String mo53203e() {
            return this.f53811b.getPackageName();
        }

        /* renamed from: a */
        public final long mo53199a() {
            return (long) C20047d.m66018a().mo53673b().mo53702c();
        }

        /* renamed from: b */
        public final String mo53200b() {
            return (String) this.f53810a.get(C20077j.f54297e);
        }

        /* renamed from: c */
        public final String mo53201c() {
            return (String) this.f53810a.get(C20077j.f54293a);
        }

        /* renamed from: d */
        public final String mo53202d() {
            return (String) this.f53810a.get(C20077j.f54294b);
        }

        private C19845a(Context context) {
            this.f53811b = context.getApplicationContext();
            C20090b.m66187a();
            C20090b.m66189b(this.f53810a);
        }

        /* renamed from: a */
        public static C19845a m65536a(Context context) {
            if (f53809c == null) {
                synchronized (C19845a.class) {
                    if (f53809c == null) {
                        f53809c = new C19845a(context);
                    }
                }
            }
            return f53809c;
        }
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: b */
    public final void mo53196b() {
        try {
            if (this.f53803a != null) {
                this.f53805e.unbindService(this.f53806f);
                this.f53803a = null;
            }
        } catch (Exception unused) {
        }
    }

    private C19842j() {
    }

    /* renamed from: a */
    public static C19842j m65524a() {
        if (f53802d == null) {
            synchronized (C19842j.class) {
                if (f53802d == null) {
                    f53802d = new C19842j();
                }
            }
        }
        return f53802d;
    }

    /* renamed from: a */
    public final boolean mo53195a(Context context) {
        return m65526a(context, (C20059a) C19845a.m65536a(context));
    }

    /* renamed from: a */
    private boolean m65525a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        try {
            if (this.f53803a != null) {
                return true;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.startService(intent);
            return applicationContext.bindService(intent, this.f53806f, 1);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m65526a(Context context, C20059a aVar) {
        this.f53805e = context.getApplicationContext();
        f53801b = aVar;
        return m65525a(this.f53805e, C19841i.m65516a(this.f53805e));
    }
}
