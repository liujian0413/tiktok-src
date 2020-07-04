package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.ac */
final class C18305ac implements Runnable {

    /* renamed from: a */
    private final long f49758a;

    /* renamed from: b */
    private final WakeLock f49759b = ((PowerManager) mo47211a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f49760c;

    /* renamed from: d */
    private final C18348r f49761d;

    /* renamed from: e */
    private final C18308af f49762e;

    C18305ac(FirebaseInstanceId firebaseInstanceId, C18348r rVar, C18308af afVar, long j) {
        this.f49760c = firebaseInstanceId;
        this.f49761d = rVar;
        this.f49762e = afVar;
        this.f49758a = j;
        this.f49759b.setReferenceCounted(false);
    }

    public final void run() {
        this.f49759b.acquire();
        try {
            this.f49760c.mo47186a(true);
            if (!this.f49760c.mo47195i()) {
                this.f49760c.mo47186a(false);
            } else if (!mo47212b()) {
                new C18306ad(this).mo47214a();
                this.f49759b.release();
            } else {
                if (!m60372c() || !m60373d() || !this.f49762e.mo47218a(this.f49760c)) {
                    this.f49760c.mo47183a(this.f49758a);
                } else {
                    this.f49760c.mo47186a(false);
                }
                this.f49759b.release();
            }
        } finally {
            this.f49759b.release();
        }
    }

    /* renamed from: c */
    private final boolean m60372c() {
        try {
            if (!this.f49760c.mo47196j()) {
                this.f49760c.mo47197k();
            }
            return true;
        } catch (IOException e) {
            String str = "Build channel failed: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m60373d() {
        C18304ab e = this.f49760c.mo47192e();
        if (e != null && !e.mo47210b(this.f49761d.mo47268b())) {
            return true;
        }
        try {
            String f = this.f49760c.mo47193f();
            if (f == null) {
                return false;
            }
            if (e == null || (e != null && !f.equals(e.f49755a))) {
                Context a = mo47211a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", f);
                C18356z.m60492b(a, intent);
                C18356z.m60490a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String str = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo47211a() {
        return this.f49760c.f49734a.mo47140a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo47212b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo47211a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
