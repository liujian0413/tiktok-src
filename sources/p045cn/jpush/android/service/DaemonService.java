package p045cn.jpush.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p280ss.android.message.NotifyService;

/* renamed from: cn.jpush.android.service.DaemonService */
public class DaemonService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            Intent intent2 = new Intent(this, NotifyService.class);
            intent2.setAction("com.ss.android.message.action.PUSH_SERVICE");
            intent2.setPackage(getPackageName());
            startService(intent2);
        } catch (Throwable unused) {
        }
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }
}
