package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C13499h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.e */
public class C13176e {

    /* renamed from: a */
    public static Boolean f34899a = null;

    /* renamed from: b */
    public static Object f34900b;

    /* renamed from: c */
    private static final String f34901c = C13176e.class.getCanonicalName();

    /* renamed from: d */
    private static final AtomicBoolean f34902d = new AtomicBoolean(false);

    /* renamed from: e */
    private static Boolean f34903e = null;

    /* renamed from: f */
    private static ServiceConnection f34904f;

    /* renamed from: g */
    private static ActivityLifecycleCallbacks f34905g;

    /* renamed from: h */
    private static Intent f34906h;

    /* renamed from: a */
    public static void m38502a() {
        m38504b();
        if (f34903e.booleanValue() && C13174d.m38501b()) {
            m38505c();
        }
    }

    /* renamed from: c */
    private static void m38505c() {
        if (f34902d.compareAndSet(false, true)) {
            Context g = C13499h.m39721g();
            if (g instanceof Application) {
                ((Application) g).registerActivityLifecycleCallbacks(f34905g);
                g.bindService(f34906h, f34904f, 1);
            }
        }
    }

    /* renamed from: b */
    private static void m38504b() {
        if (f34903e == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                f34903e = Boolean.valueOf(true);
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    f34899a = Boolean.valueOf(true);
                } catch (ClassNotFoundException unused) {
                    f34899a = Boolean.valueOf(false);
                }
                C13181f.m38514a();
                f34906h = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                f34904f = new ServiceConnection() {
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        C13176e.f34900b = C13181f.m38508a(C13499h.m39721g(), iBinder);
                    }
                };
                f34905g = new ActivityLifecycleCallbacks() {
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                        try {
                            C13499h.m39719e().execute(new Runnable() {
                                public final void run() {
                                    Context g = C13499h.m39721g();
                                    C13176e.m38503a(g, C13181f.m38511a(g, C13176e.f34900b), false);
                                    C13176e.m38503a(g, C13181f.m38517b(g, C13176e.f34900b), true);
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }

                    public final void onActivityStopped(Activity activity) {
                        try {
                            if (C13176e.f34899a.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                                C13499h.m39719e().execute(new Runnable() {
                                    public final void run() {
                                        Context g = C13499h.m39721g();
                                        ArrayList a = C13181f.m38511a(g, C13176e.f34900b);
                                        if (a.isEmpty()) {
                                            a = C13181f.m38521c(g, C13176e.f34900b);
                                        }
                                        C13176e.m38503a(g, a, false);
                                    }
                                });
                            }
                        } catch (Exception unused) {
                        }
                    }
                };
            } catch (ClassNotFoundException unused2) {
                f34903e = Boolean.valueOf(false);
            }
        }
    }

    /* renamed from: a */
    public static void m38503a(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            for (Entry entry : C13181f.m38512a(context, arrayList2, f34900b, z).entrySet()) {
                C13174d.m38500a((String) hashMap.get(entry.getKey()), (String) entry.getValue(), z);
            }
        }
    }
}
