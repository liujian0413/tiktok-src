package com.bytedance.crash.p501j.p502a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.p501j.C9954g;

/* renamed from: com.bytedance.crash.j.a.d */
final class C9926d {

    /* renamed from: a */
    public int f27102a;

    /* renamed from: com.bytedance.crash.j.a.d$a */
    class C9928a extends BroadcastReceiver {
        private C9928a() {
        }

        public final void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    C9926d.this.f27102a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    C9926d(final Context context) {
        C9954g.m29460b().mo24596a(new Runnable() {
            public final void run() {
                try {
                    C9926d.this.mo24551a(context);
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo24551a(Context context) {
        context.registerReceiver(new C9928a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
