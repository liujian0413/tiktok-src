package com.p280ss.android.push.daemon.p898a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.p280ss.android.push.daemon.C20017f;
import com.p280ss.android.push.daemon.C6839b;

/* renamed from: com.ss.android.push.daemon.a.a */
public class C20009a implements C20017f {

    /* renamed from: a */
    protected Context f54141a;

    /* renamed from: b */
    protected C6839b f54142b;

    /* renamed from: c */
    private ServiceConnection f54143c = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (C20009a.this.f54141a != null && C20009a.this.f54142b != null) {
                try {
                    C20009a.this.mo53591a();
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: a */
    public void mo53591a() {
    }
}
