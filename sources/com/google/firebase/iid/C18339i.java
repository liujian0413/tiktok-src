package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.internal.p762d.C16360a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.i */
final class C18339i implements ServiceConnection {

    /* renamed from: a */
    int f49822a;

    /* renamed from: b */
    final Messenger f49823b;

    /* renamed from: c */
    C18344n f49824c;

    /* renamed from: d */
    final Queue<C18346p<?>> f49825d;

    /* renamed from: e */
    final SparseArray<C18346p<?>> f49826e;

    /* renamed from: f */
    final /* synthetic */ C18336f f49827f;

    private C18339i(C18336f fVar) {
        this.f49827f = fVar;
        this.f49823b = new Messenger(new C16360a(Looper.getMainLooper(), new C18340j(this)));
        this.f49825d = new ArrayDeque();
        this.f49826e = new SparseArray<>();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo47253a(com.google.firebase.iid.C18346p r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f49822a     // Catch:{ all -> 0x007e }
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0017;
                case 2: goto L_0x000d;
                case 3: goto L_0x000b;
                case 4: goto L_0x000b;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x007e }
        L_0x0008:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007e }
            goto L_0x0065
        L_0x000b:
            monitor-exit(r5)
            return r1
        L_0x000d:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f49825d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            r5.m60450c()     // Catch:{ all -> 0x007e }
            monitor-exit(r5)
            return r2
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f49825d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            monitor-exit(r5)
            return r2
        L_0x001e:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f49825d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            int r6 = r5.f49822a     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            com.google.android.gms.common.internal.C15267r.m44390a(r6)     // Catch:{ all -> 0x007e }
            r5.f49822a = r2     // Catch:{ all -> 0x007e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C15307a.m44540a()     // Catch:{ all -> 0x007e }
            com.google.firebase.iid.f r3 = r5.f49827f     // Catch:{ all -> 0x007e }
            android.content.Context r3 = r3.f49818b     // Catch:{ all -> 0x007e }
            boolean r6 = r0.mo38676a(r3, r6, r5, r2)     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "Unable to bind to service"
            r5.mo47251a(r1, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0063
        L_0x0051:
            com.google.firebase.iid.f r6 = r5.f49827f     // Catch:{ all -> 0x007e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f49819c     // Catch:{ all -> 0x007e }
            com.google.firebase.iid.k r0 = new com.google.firebase.iid.k     // Catch:{ all -> 0x007e }
            r0.<init>(r5)     // Catch:{ all -> 0x007e }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007e }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x007e }
        L_0x0063:
            monitor-exit(r5)
            return r2
        L_0x0065:
            int r0 = r5.f49822a     // Catch:{ all -> 0x007e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>(r1)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x007e }
            r2.append(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x007e }
            r6.<init>(r0)     // Catch:{ all -> 0x007e }
            throw r6     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18339i.mo47253a(com.google.firebase.iid.p):boolean");
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.p.a(com.google.firebase.iid.zzal):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.p.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1.mo47264a(new com.google.firebase.iid.zzal(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r1.mo47262a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r5 = r5.getData();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47252a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.p<?>> r1 = r4.f49826e     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0036 }
            com.google.firebase.iid.p r1 = (com.google.firebase.iid.C18346p) r1     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != 0) goto L_0x0010
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return r2
        L_0x0010:
            android.util.SparseArray<com.google.firebase.iid.p<?>> r3 = r4.f49826e     // Catch:{ all -> 0x0036 }
            r3.remove(r0)     // Catch:{ all -> 0x0036 }
            r4.mo47249a()     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0032
            com.google.firebase.iid.zzal r5 = new com.google.firebase.iid.zzal
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo47264a(r5)
            goto L_0x0035
        L_0x0032:
            r1.mo47262a(r5)
        L_0x0035:
            return r2
        L_0x0036:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18339i.mo47252a(android.os.Message):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            mo47251a(0, "Null service connection");
            return;
        }
        try {
            this.f49824c = new C18344n(iBinder);
            this.f49822a = 2;
            m60450c();
        } catch (RemoteException e) {
            mo47251a(0, e.getMessage());
        }
    }

    /* renamed from: c */
    private final void m60450c() {
        this.f49827f.f49819c.execute(new C18342l(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        mo47251a(2, "Service disconnected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47251a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        switch (this.f49822a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                this.f49822a = 4;
                C15307a.m44540a();
                C15307a.m44541a(this.f49827f.f49818b, this);
                zzal zzal = new zzal(i, str);
                for (C18346p a : this.f49825d) {
                    a.mo47264a(zzal);
                }
                this.f49825d.clear();
                for (int i2 = 0; i2 < this.f49826e.size(); i2++) {
                    ((C18346p) this.f49826e.valueAt(i2)).mo47264a(zzal);
                }
                this.f49826e.clear();
                return;
            case 3:
                this.f49822a = 4;
                return;
            case 4:
                return;
            default:
                int i3 = this.f49822a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47249a() {
        if (this.f49822a == 2 && this.f49825d.isEmpty() && this.f49826e.size() == 0) {
            this.f49822a = 3;
            C15307a.m44540a();
            C15307a.m44541a(this.f49827f.f49818b, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo47254b() {
        if (this.f49822a == 1) {
            mo47251a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47250a(int i) {
        C18346p pVar = (C18346p) this.f49826e.get(i);
        if (pVar != null) {
            this.f49826e.remove(i);
            pVar.mo47264a(new zzal(3, "Timed out waiting for response"));
            mo47249a();
        }
    }
}
