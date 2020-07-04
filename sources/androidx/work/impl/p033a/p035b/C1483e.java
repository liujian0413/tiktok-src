package androidx.work.impl.p033a.p035b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.support.p022v4.p024b.C0656a;
import androidx.work.impl.p033a.C1477b;
import com.C1642a;

/* renamed from: androidx.work.impl.a.b.e */
public final class C1483e extends C1482d<C1477b> {

    /* renamed from: b */
    private final ConnectivityManager f5696b = ((ConnectivityManager) this.f5692a.getSystemService("connectivity"));

    /* renamed from: c */
    private C1485b f5697c;

    /* renamed from: d */
    private C1484a f5698d;

    /* renamed from: androidx.work.impl.a.b.e$a */
    class C1484a extends BroadcastReceiver {
        C1484a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
                C1483e.this.mo6727a(C1483e.this.mo6729a());
            }
        }
    }

    /* renamed from: androidx.work.impl.a.b.e$b */
    class C1485b extends NetworkCallback {
        C1485b() {
        }

        public final void onLost(Network network) {
            C1483e.this.mo6727a(C1483e.this.mo6729a());
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C1642a.m8034a("Network capabilities changed: %s", new Object[]{networkCapabilities});
            C1483e.this.mo6727a(C1483e.this.mo6729a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C1477b mo6722b() {
        return mo6729a();
    }

    /* renamed from: f */
    private static boolean m7408f() {
        if (VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo6723c() {
        if (m7408f()) {
            this.f5696b.registerDefaultNetworkCallback(this.f5697c);
        } else {
            this.f5692a.registerReceiver(this.f5698d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    public final void mo6724d() {
        if (m7408f()) {
            this.f5696b.unregisterNetworkCallback(this.f5697c);
        } else {
            this.f5692a.unregisterReceiver(this.f5698d);
        }
    }

    /* renamed from: g */
    private boolean m7409g() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.f5696b.getNetworkCapabilities(this.f5696b.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1477b mo6729a() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f5696b.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        boolean g = m7409g();
        boolean a = C0656a.m2837a(this.f5696b);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new C1477b(z, g, a, z2);
    }

    public C1483e(Context context) {
        super(context);
        if (m7408f()) {
            this.f5697c = new C1485b();
        } else {
            this.f5698d = new C1484a();
        }
    }
}
