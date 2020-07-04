package com.p1843tt.miniapphost.process.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p1843tt.miniapphost.AppBrandLogger;

/* renamed from: com.tt.miniapphost.process.base.HostCrossProcessCallService */
public class HostCrossProcessCallService extends Service {
    public IBinder onBind(Intent intent) {
        AppBrandLogger.m146384i("HostCrossProcessCallService", "onBind");
        IBinder hostProcessCrossProcessCallBinder = HostProcessSupport.inst().getHostProcessCrossProcessCallBinder();
        if (hostProcessCrossProcessCallBinder == null) {
            AppBrandLogger.m146383e("HostCrossProcessCallService", "未正确获取的跨进程通信 Binder");
            return new EmptyBinder();
        }
        AppBrandLogger.m146384i("HostCrossProcessCallService", "返回正确的跨进程通信 Binder");
        return hostProcessCrossProcessCallBinder;
    }
}
