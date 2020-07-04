package androidx.work.impl.p033a.p035b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.C1642a;

/* renamed from: androidx.work.impl.a.b.b */
public final class C1479b extends C1480c<Boolean> {
    /* renamed from: a */
    public final IntentFilter mo6720a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Boolean mo6722b() {
        Intent registerReceiver = this.f5692a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra == 0 && intExtra2 != 1 && intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C1479b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo6721a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1642a.m8034a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    mo6727a(Boolean.valueOf(true));
                    return;
                case 1:
                    mo6727a(Boolean.valueOf(false));
                    break;
            }
        }
    }
}
