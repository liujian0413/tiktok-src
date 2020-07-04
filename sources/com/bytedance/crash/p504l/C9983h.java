package com.bytedance.crash.p504l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.crash.l.h */
public final class C9983h {

    /* renamed from: a */
    private static final Set<String> f27219a;

    /* renamed from: a */
    public static Set<String> m29563a() {
        return f27219a;
    }

    static {
        HashSet hashSet = new HashSet();
        f27219a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f27219a.add("ThreadPlus");
        f27219a.add("ApiDispatcher");
        f27219a.add("ApiLocalDispatcher");
        f27219a.add("AsyncLoader");
        f27219a.add("AsyncTask");
        f27219a.add("Binder");
        f27219a.add("PackageProcessor");
        f27219a.add("SettingsObserver");
        f27219a.add("WifiManager");
        f27219a.add("JavaBridge");
        f27219a.add("Compiler");
        f27219a.add("Signal Catcher");
        f27219a.add("GC");
        f27219a.add("ReferenceQueueDaemon");
        f27219a.add("FinalizerDaemon");
        f27219a.add("FinalizerWatchdogDaemon");
        f27219a.add("CookieSyncManager");
        f27219a.add("RefQueueWorker");
        f27219a.add("CleanupReference");
        f27219a.add("VideoManager");
        f27219a.add("DBHelper-AsyncOp");
        f27219a.add("InstalledAppTracker2");
        f27219a.add("AppData-AsyncOp");
        f27219a.add("IdleConnectionMonitor");
        f27219a.add("LogReaper");
        f27219a.add("ActionReaper");
        f27219a.add("Okio Watchdog");
        f27219a.add("CheckWaitingQueue");
        f27219a.add("NPTH-CrashTimer");
        f27219a.add("NPTH-JavaCallback");
        f27219a.add("NPTH-LocalParser");
        f27219a.add("ANR_FILE_MODIFY");
    }

    /* renamed from: a */
    public static boolean m29564a(Throwable th) {
        if (th != null && !(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException)) {
            return false;
        }
        return true;
    }
}
