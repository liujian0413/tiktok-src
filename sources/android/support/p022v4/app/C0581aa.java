package android.support.p022v4.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.p022v4.app.INotificationSideChannel.Stub;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.app.aa */
public final class C0581aa {

    /* renamed from: a */
    private static final Object f2311a = new Object();

    /* renamed from: b */
    private static String f2312b;

    /* renamed from: c */
    private static Set<String> f2313c = new HashSet();

    /* renamed from: f */
    private static final Object f2314f = new Object();

    /* renamed from: g */
    private static C0584c f2315g;

    /* renamed from: d */
    private final Context f2316d;

    /* renamed from: e */
    private final NotificationManager f2317e = ((NotificationManager) this.f2316d.getSystemService("notification"));

    /* renamed from: android.support.v4.app.aa$a */
    static class C0582a implements C0586d {

        /* renamed from: a */
        final String f2318a;

        /* renamed from: b */
        final int f2319b;

        /* renamed from: c */
        final String f2320c;

        /* renamed from: d */
        final boolean f2321d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f2318a);
            sb.append(", id:");
            sb.append(this.f2319b);
            sb.append(", tag:");
            sb.append(this.f2320c);
            sb.append(", all:");
            sb.append(this.f2321d);
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo2562a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f2321d) {
                iNotificationSideChannel.mo2450a(this.f2318a);
            } else {
                iNotificationSideChannel.mo2451a(this.f2318a, this.f2319b, this.f2320c);
            }
        }

        C0582a(String str, int i, String str2) {
            this.f2318a = str;
            this.f2319b = i;
            this.f2320c = str2;
        }
    }

    /* renamed from: android.support.v4.app.aa$b */
    static class C0583b {

        /* renamed from: a */
        final ComponentName f2322a;

        /* renamed from: b */
        final IBinder f2323b;

        C0583b(ComponentName componentName, IBinder iBinder) {
            this.f2322a = componentName;
            this.f2323b = iBinder;
        }
    }

    /* renamed from: android.support.v4.app.aa$c */
    static class C0584c implements ServiceConnection, Callback {

        /* renamed from: a */
        private final Context f2324a;

        /* renamed from: b */
        private final HandlerThread f2325b;

        /* renamed from: c */
        private final Handler f2326c;

        /* renamed from: d */
        private final Map<ComponentName, C0585a> f2327d = new HashMap();

        /* renamed from: e */
        private Set<String> f2328e = new HashSet();

        /* renamed from: android.support.v4.app.aa$c$a */
        static class C0585a {

            /* renamed from: a */
            final ComponentName f2329a;

            /* renamed from: b */
            boolean f2330b;

            /* renamed from: c */
            INotificationSideChannel f2331c;

            /* renamed from: d */
            ArrayDeque<C0586d> f2332d = new ArrayDeque<>();

            /* renamed from: e */
            int f2333e = 0;

            C0585a(ComponentName componentName) {
                this.f2329a = componentName;
            }
        }

        /* renamed from: a */
        private void m2450a() {
            Set<String> b = C0581aa.m2446b(this.f2324a);
            if (!b.equals(this.f2328e)) {
                this.f2328e = b;
                List<ResolveInfo> queryIntentServices = this.f2324a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission == null) {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2327d.containsKey(componentName2)) {
                        this.f2327d.put(componentName2, new C0585a(componentName2));
                    }
                }
                Iterator it = this.f2327d.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        m2455b((C0585a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private void m2451a(ComponentName componentName) {
            C0585a aVar = (C0585a) this.f2327d.get(componentName);
            if (aVar != null) {
                m2455b(aVar);
            }
        }

        /* renamed from: b */
        private void m2454b(ComponentName componentName) {
            C0585a aVar = (C0585a) this.f2327d.get(componentName);
            if (aVar != null) {
                m2458d(aVar);
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f2326c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: b */
        private void m2455b(C0585a aVar) {
            if (aVar.f2330b) {
                this.f2324a.unbindService(this);
                aVar.f2330b = false;
            }
            aVar.f2331c = null;
        }

        C0584c(Context context) {
            this.f2324a = context;
            this.f2325b = new HandlerThread("NotificationManagerCompat");
            this.f2325b.start();
            this.f2326c = new Handler(this.f2325b.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m2453a(C0585a aVar) {
            if (aVar.f2330b) {
                return true;
            }
            aVar.f2330b = this.f2324a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2329a), this, 33);
            if (aVar.f2330b) {
                aVar.f2333e = 0;
            } else {
                this.f2324a.unbindService(this);
            }
            return aVar.f2330b;
        }

        /* renamed from: b */
        private void m2456b(C0586d dVar) {
            m2450a();
            for (C0585a aVar : this.f2327d.values()) {
                aVar.f2332d.add(dVar);
                m2458d(aVar);
            }
        }

        /* renamed from: c */
        private void m2457c(C0585a aVar) {
            if (!this.f2326c.hasMessages(3, aVar.f2329a)) {
                aVar.f2333e++;
                if (aVar.f2333e > 6) {
                    aVar.f2332d.clear();
                    return;
                }
                int i = (1 << (aVar.f2333e - 1)) * 1000;
                this.f2326c.sendMessageDelayed(this.f2326c.obtainMessage(3, aVar.f2329a), (long) i);
            }
        }

        /* renamed from: d */
        private void m2458d(C0585a aVar) {
            if (!aVar.f2332d.isEmpty()) {
                if (!m2453a(aVar) || aVar.f2331c == null) {
                    m2457c(aVar);
                    return;
                }
                while (true) {
                    C0586d dVar = (C0586d) aVar.f2332d.peek();
                    if (dVar == null) {
                        break;
                    }
                    try {
                        dVar.mo2562a(aVar.f2331c);
                        aVar.f2332d.remove();
                    } catch (DeadObjectException | RemoteException unused) {
                    }
                }
                if (!aVar.f2332d.isEmpty()) {
                    m2457c(aVar);
                }
            }
        }

        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m2456b((C0586d) message.obj);
                    return true;
                case 1:
                    C0583b bVar = (C0583b) message.obj;
                    m2452a(bVar.f2322a, bVar.f2323b);
                    return true;
                case 2:
                    m2451a((ComponentName) message.obj);
                    return true;
                case 3:
                    m2454b((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        public final void mo2564a(C0586d dVar) {
            this.f2326c.obtainMessage(0, dVar).sendToTarget();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f2326c.obtainMessage(1, new C0583b(componentName, iBinder)).sendToTarget();
        }

        /* renamed from: a */
        private void m2452a(ComponentName componentName, IBinder iBinder) {
            C0585a aVar = (C0585a) this.f2327d.get(componentName);
            if (aVar != null) {
                aVar.f2331c = Stub.m2307a(iBinder);
                aVar.f2333e = 0;
                m2458d(aVar);
            }
        }
    }

    /* renamed from: android.support.v4.app.aa$d */
    interface C0586d {
        /* renamed from: a */
        void mo2562a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    /* renamed from: a */
    public final boolean mo2561a() {
        if (VERSION.SDK_INT >= 24) {
            return this.f2317e.areNotificationsEnabled();
        }
        if (VERSION.SDK_INT < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2316d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2316d.getApplicationInfo();
        String packageName = this.f2316d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static C0581aa m2444a(Context context) {
        return new C0581aa(context);
    }

    private C0581aa(Context context) {
        this.f2316d = context;
    }

    /* renamed from: a */
    private void m2445a(C0586d dVar) {
        synchronized (f2314f) {
            if (f2315g == null) {
                f2315g = new C0584c(this.f2316d.getApplicationContext());
            }
            f2315g.mo2564a(dVar);
        }
    }

    /* renamed from: b */
    public static Set<String> m2446b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2311a) {
            if (string != null) {
                try {
                    if (!string.equals(f2312b)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f2313c = hashSet;
                        f2312b = string;
                    }
                } finally {
                }
            }
            set = f2313c;
        }
        return set;
    }

    /* renamed from: a */
    public final void mo2560a(String str, int i) {
        this.f2317e.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            m2445a((C0586d) new C0582a(this.f2316d.getPackageName(), i, str));
        }
    }
}
