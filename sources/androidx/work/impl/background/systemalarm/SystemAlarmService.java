package androidx.work.impl.background.systemalarm;

import android.arch.lifecycle.LifecycleService;
import android.content.Intent;

public class SystemAlarmService extends LifecycleService implements C1528b {

    /* renamed from: a */
    private C1525e f5782a;

    /* renamed from: a */
    public final void mo6778a() {
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        this.f5782a = new C1525e(this);
        this.f5782a.mo6785a((C1528b) this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5782a.mo6784a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            this.f5782a.mo6787a(intent, i2);
        }
        return 1;
    }
}
