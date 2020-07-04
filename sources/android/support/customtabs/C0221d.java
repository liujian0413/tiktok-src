package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.C0229h.C0230a;

/* renamed from: android.support.customtabs.d */
public abstract class C0221d implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo649a(ComponentName componentName, C0212b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo649a(componentName, new C0212b(C0230a.m819a(iBinder), componentName) {
        });
    }
}
