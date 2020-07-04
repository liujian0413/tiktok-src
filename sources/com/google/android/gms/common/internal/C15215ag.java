package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.internal.p761c.C16359d;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.ag */
final class C15215ag extends C15252j implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashMap<C15253a, C15216ah> f39352a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f39353b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f39354c;

    /* renamed from: d */
    private final C15307a f39355d;

    /* renamed from: e */
    private final long f39356e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f39357f;

    C15215ag(Context context) {
        this.f39353b = context.getApplicationContext();
        this.f39354c = new C16359d(context.getMainLooper(), this);
        this.f39355d = C15307a.m44540a();
        this.f39356e = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        this.f39357f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo38531a(C15253a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        C15267r.m44385a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f39352a) {
            C15216ah ahVar = (C15216ah) this.f39352a.get(aVar);
            if (ahVar == null) {
                ahVar = new C15216ah(this, aVar);
                ahVar.mo38534a(serviceConnection, str);
                ahVar.mo38535a(str);
                this.f39352a.put(aVar, ahVar);
            } else {
                this.f39354c.removeMessages(0, aVar);
                if (!ahVar.mo38537a(serviceConnection)) {
                    ahVar.mo38534a(serviceConnection, str);
                    switch (ahVar.f39358a) {
                        case 1:
                            serviceConnection.onServiceConnected(ahVar.f39361d, ahVar.f39360c);
                            break;
                        case 2:
                            ahVar.mo38535a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = ahVar.f39359b;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo38532b(C15253a aVar, ServiceConnection serviceConnection, String str) {
        C15267r.m44385a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f39352a) {
            C15216ah ahVar = (C15216ah) this.f39352a.get(aVar);
            if (ahVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (ahVar.mo38537a(serviceConnection)) {
                ahVar.mo38538b(serviceConnection, str);
                if (ahVar.mo38536a()) {
                    this.f39354c.sendMessageDelayed(this.f39354c.obtainMessage(0, aVar), this.f39356e);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f39352a) {
                    C15253a aVar = (C15253a) message.obj;
                    C15216ah ahVar = (C15216ah) this.f39352a.get(aVar);
                    if (ahVar != null && ahVar.mo38536a()) {
                        if (ahVar.f39359b) {
                            ahVar.mo38539b("GmsClientSupervisor");
                        }
                        this.f39352a.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f39352a) {
                    C15253a aVar2 = (C15253a) message.obj;
                    C15216ah ahVar2 = (C15216ah) this.f39352a.get(aVar2);
                    if (ahVar2 != null && ahVar2.f39358a == 3) {
                        String valueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentName = ahVar2.f39361d;
                        if (componentName == null) {
                            componentName = aVar2.f39454b;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(aVar2.f39453a, "unknown");
                        }
                        ahVar2.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
