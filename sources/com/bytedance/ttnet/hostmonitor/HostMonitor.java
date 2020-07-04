package com.bytedance.ttnet.hostmonitor;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class HostMonitor extends IntentService {
    public HostMonitor() {
        super("HostMonitor");
    }

    public void onCreate() {
        try {
            super.onCreate();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static Intent m37848a(Context context) {
        Intent intent = new Intent(context, HostMonitor.class);
        intent.setAction("com.bytedance.ttnet.hostmonitor.check");
        return intent;
    }

    /* renamed from: a */
    private ConnectionType m37849a(Intent intent) {
        int intExtra = intent.getIntExtra("com.bytedance.ttnet.hostmonitor.connection_type", -1);
        if (intExtra < 0) {
            return m37854b(this);
        }
        return ConnectionType.values()[intExtra];
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.bytedance.ttnet.hostmonitor.check".equals(intent.getAction())) {
                    C12988c cVar = new C12988c(this);
                    if (cVar.mo31523a().isEmpty()) {
                        Logger.m37870c("HostMonitor", "No hosts to check at this moment");
                    } else {
                        ConnectionType a = m37849a(intent);
                        if (a == ConnectionType.NONE) {
                            m37850a(a, cVar);
                        } else {
                            m37855b(a, cVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    static ConnectionType m37854b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectionType.NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return ConnectionType.MOBILE;
        }
        if (type == 1) {
            return ConnectionType.WIFI;
        }
        StringBuilder sb = new StringBuilder("Unsupported connection type: ");
        sb.append(type);
        sb.append(". Returning NONE");
        Logger.m37867a("HostMonitor", sb.toString());
        return ConnectionType.NONE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022 A[SYNTHETIC, Splitter:B:16:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0031 A[SYNTHETIC, Splitter:B:24:0x0031] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m37852a(com.bytedance.ttnet.hostmonitor.C12987b r2, int r3) {
        /*
            r0 = 0
            java.net.Socket r1 = new java.net.Socket     // Catch:{ Exception -> 0x002e, all -> 0x001f }
            r1.<init>()     // Catch:{ Exception -> 0x002e, all -> 0x001f }
            java.net.InetSocketAddress r2 = r2.mo31519a()     // Catch:{ Exception -> 0x001d, all -> 0x001a }
            r1.connect(r2, r3)     // Catch:{ Exception -> 0x001d, all -> 0x001a }
            r2 = 1
            r1.close()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0034
        L_0x0012:
            java.lang.String r3 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.Logger.m37870c(r3, r0)
            goto L_0x0034
        L_0x001a:
            r2 = move-exception
            r0 = r1
            goto L_0x0020
        L_0x001d:
            r0 = r1
            goto L_0x002e
        L_0x001f:
            r2 = move-exception
        L_0x0020:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ Exception -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            java.lang.String r3 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.Logger.m37870c(r3, r0)
        L_0x002d:
            throw r2
        L_0x002e:
            r2 = 0
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ Exception -> 0x0012 }
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.hostmonitor.HostMonitor.m37852a(com.bytedance.ttnet.hostmonitor.b, int):boolean");
    }

    /* renamed from: a */
    private void m37850a(ConnectionType connectionType, C12988c cVar) {
        Logger.m37870c("HostMonitor", "No active connection. Notifying that all the hosts are unreachable");
        for (C12987b bVar : cVar.mo31523a().keySet()) {
            C12989d dVar = (C12989d) cVar.mo31523a().get(bVar);
            C12989d dVar2 = new C12989d(false, connectionType);
            if (!dVar2.equals(dVar)) {
                StringBuilder sb = new StringBuilder("Host ");
                sb.append(bVar.f34389a);
                sb.append(" is currently unreachable on port ");
                sb.append(bVar.f34390b);
                Logger.m37870c("HostMonitor", sb.toString());
                cVar.mo31523a().put(bVar, dVar2);
                m37851a(cVar.mo31526b(), bVar, dVar, dVar2);
            }
        }
        cVar.mo31529e();
    }

    /* renamed from: b */
    private void m37855b(ConnectionType connectionType, C12988c cVar) {
        String str;
        Logger.m37870c("HostMonitor", "Starting reachability check");
        for (C12987b bVar : cVar.mo31523a().keySet()) {
            C12989d dVar = (C12989d) cVar.mo31523a().get(bVar);
            boolean a = m37853a(bVar, cVar.mo31527c(), cVar.mo31528d());
            C12989d dVar2 = new C12989d(a, connectionType);
            if (!dVar2.equals(dVar)) {
                String str2 = "HostMonitor";
                StringBuilder sb = new StringBuilder("Host ");
                sb.append(bVar.f34389a);
                sb.append(" is currently ");
                if (a) {
                    str = "reachable";
                } else {
                    str = "unreachable";
                }
                sb.append(str);
                sb.append(" on port ");
                sb.append(bVar.f34390b);
                sb.append(" via ");
                sb.append(connectionType);
                Logger.m37870c(str2, sb.toString());
                cVar.mo31523a().put(bVar, dVar2);
                m37851a(cVar.mo31526b(), bVar, dVar, dVar2);
            }
        }
        cVar.mo31529e();
        Logger.m37870c("HostMonitor", "Reachability check finished!");
    }

    /* renamed from: a */
    private boolean m37853a(C12987b bVar, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            z = m37852a(bVar, i);
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m37851a(String str, C12987b bVar, C12989d dVar, C12989d dVar2) {
        HostStatus a = new HostStatus().mo31509a(bVar.f34389a).mo31507a(bVar.f34390b).mo31510a(dVar.f34398a).mo31512b(dVar.f34399b).mo31513b(dVar2.f34398a).mo31508a(dVar2.f34399b);
        StringBuilder sb = new StringBuilder("Broadcast with action: ");
        sb.append(str);
        sb.append(" and status: ");
        sb.append(a);
        Logger.m37870c("HostMonitor", sb.toString());
        Intent intent = new Intent(str);
        intent.putExtra("HostStatus", a);
        sendBroadcast(intent);
    }
}
