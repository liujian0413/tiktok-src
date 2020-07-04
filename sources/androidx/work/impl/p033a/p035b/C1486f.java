package androidx.work.impl.p033a.p035b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.C1642a;

/* renamed from: androidx.work.impl.a.b.f */
public final class C1486f extends C1480c<Boolean> {
    /* renamed from: a */
    public final IntentFilter mo6720a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Boolean mo6722b() {
        Intent registerReceiver = this.f5692a.registerReceiver(null, mo6720a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.valueOf(true);
        }
        String action = registerReceiver.getAction();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c = 1;
        }
        switch (c) {
            case 0:
                return Boolean.valueOf(true);
            case 1:
                return Boolean.valueOf(false);
            default:
                return null;
        }
    }

    public C1486f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo6721a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1642a.m8034a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
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
