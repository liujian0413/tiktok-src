package com.aweme.storage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class JobService extends Service {
    public void onCreate() {
        C1592h.m7855a((Callable<TResult>) new Callable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() throws Exception {
                C1913c.m8864e(JobService.this);
                return null;
            }
        }, (Executor) C7258h.m22730c()).mo6886c(new C1591g<String, String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String then(C1592h<String> hVar) throws Exception {
                C1913c.m8865f(JobService.this);
                JobService.this.stopSelf();
                return null;
            }
        }, C1592h.f5958b);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
