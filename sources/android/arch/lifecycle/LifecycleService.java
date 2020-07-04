package android.arch.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements C0043i {

    /* renamed from: a */
    private final C0061t f42a = new C0061t(this);

    public Lifecycle getLifecycle() {
        return this.f42a.f107a;
    }

    public void onCreate() {
        this.f42a.mo141a();
        super.onCreate();
    }

    public void onDestroy() {
        this.f42a.mo144d();
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        this.f42a.mo142b();
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.f42a.mo143c();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
