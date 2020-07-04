package com.p280ss.caijing.globaliap.p1791d.p1792a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import java.util.concurrent.Executor;

/* renamed from: com.ss.caijing.globaliap.d.a.a */
public final class C45808a {

    /* renamed from: a */
    volatile IInAppBillingService f117166a;

    /* renamed from: b */
    public volatile boolean f117167b;

    /* renamed from: c */
    volatile boolean f117168c;

    /* renamed from: d */
    public volatile Context f117169d;

    /* renamed from: e */
    public final Executor f117170e = C45813b.m143801a();

    /* renamed from: f */
    final Handler f117171f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public C45812b f117172g;

    /* renamed from: h */
    ServiceConnection f117173h = new ServiceConnection() {

        /* renamed from: b */
        private int f117175b;

        public final void onServiceDisconnected(ComponentName componentName) {
            C45808a.this.f117168c = false;
            if (C45808a.this.f117167b) {
                this.f117175b++;
                if (this.f117175b < 3) {
                    C45808a.this.f117170e.execute(new C45810a(C45808a.this, 0));
                    return;
                }
            }
            this.f117175b = 0;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C45808a.this.f117168c = true;
            C45808a.this.f117166a = Stub.asInterface(iBinder);
            if (C45808a.this.f117172g != null) {
                C45808a.this.f117172g.mo111032a();
            }
            this.f117175b = 0;
        }
    };

    /* renamed from: com.ss.caijing.globaliap.d.a.a$a */
    public class C45810a implements Runnable {
        public final void run() {
            C45808a aVar = C45808a.this;
            Context context = C45808a.this.f117169d;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            aVar.f117168c = context.bindService(intent, C45808a.this.f117173h, 1);
            if (!C45808a.this.f117168c) {
                C45808a.this.f117171f.post(new Runnable() {
                    public final void run() {
                        if (C45808a.this.f117172g != null) {
                            C45808a.this.f117172g.mo111033b();
                        }
                    }
                });
            }
        }

        private C45810a() {
        }

        public /* synthetic */ C45810a(C45808a aVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.a.a$b */
    public interface C45812b {
        /* renamed from: a */
        void mo111032a();

        /* renamed from: b */
        void mo111033b();
    }

    /* renamed from: a */
    public final void mo111026a() {
        if (this.f117166a != null) {
            this.f117169d.unbindService(this.f117173h);
            this.f117166a = null;
        }
    }

    /* renamed from: b */
    public final boolean mo111027b() {
        if (!this.f117168c || this.f117166a == null || !this.f117166a.asBinder().pingBinder()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized int mo111024a(String str) {
        if (!mo111027b()) {
            return -1;
        }
        return this.f117166a.consumePurchase(3, this.f117169d.getPackageName(), str);
    }

    /* renamed from: a */
    public final synchronized Bundle mo111025a(String str, String str2) {
        if (!mo111027b()) {
            return null;
        }
        return this.f117166a.getPurchases(3, this.f117169d.getPackageName(), str, str2);
    }
}
