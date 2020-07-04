package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1454c;
import androidx.work.NetworkType;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    public void onReceive(Context context, Intent intent) {
        C1642a.m8034a("onReceive : %s", new Object[]{intent});
        context.startService(C1522b.m7517a(context));
    }

    /* renamed from: a */
    static void m7510a(Context context, List<C1501g> list) {
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (C1501g gVar : list) {
            C1454c cVar = gVar.f5743j;
            z2 |= cVar.f5660e;
            z3 |= cVar.f5658c;
            z4 |= cVar.f5661f;
            if (cVar.f5657b != NetworkType.NOT_REQUIRED) {
                z = true;
            } else {
                z = false;
            }
            z5 |= z;
            if (z2 && z3 && z4 && z5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m7511a(context, z2, z3, z4, z5));
    }
}
