package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public final class C15009a implements ServiceConnection {

    /* renamed from: a */
    private boolean f38857a;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f38858b = new LinkedBlockingQueue();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f38858b.add(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo38181a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C15267r.m44397c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f38857a) {
            this.f38857a = true;
            IBinder iBinder = (IBinder) this.f38858b.poll(10000, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
}
