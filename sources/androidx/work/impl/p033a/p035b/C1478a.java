package androidx.work.impl.p033a.p035b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

/* renamed from: androidx.work.impl.a.b.a */
public final class C1478a extends C1480c<Boolean> {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public Boolean mo6722b() {
        Intent registerReceiver = this.f5692a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Boolean.valueOf(m7388a(registerReceiver));
    }

    /* renamed from: a */
    public final IntentFilter mo6720a() {
        IntentFilter intentFilter = new IntentFilter();
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    public C1478a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static boolean m7388a(Intent intent) {
        if (VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6721a(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            if (r5 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r6 = "Received %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            com.C1642a.m8034a(r6, r1)
            r6 = -1
            int r1 = r5.hashCode()
            r3 = -1886648615(0xffffffff8f8c06d9, float:-1.3807703E-29)
            if (r1 == r3) goto L_0x004a
            r3 = -54942926(0xfffffffffcb9a332, float:-7.711079E36)
            if (r1 == r3) goto L_0x0040
            r3 = 948344062(0x388694fe, float:6.41737E-5)
            if (r1 == r3) goto L_0x0036
            r3 = 1019184907(0x3cbf870b, float:0.023379823)
            if (r1 == r3) goto L_0x002c
            goto L_0x0054
        L_0x002c:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0054
            r5 = 2
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0054
            r5 = 0
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0054
            r5 = 3
            goto L_0x0055
        L_0x0054:
            r5 = -1
        L_0x0055:
            switch(r5) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0069;
                case 2: goto L_0x0061;
                case 3: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0079
        L_0x0059:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r4.mo6727a(r5)
            goto L_0x0079
        L_0x0061:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4.mo6727a(r5)
            return
        L_0x0069:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r4.mo6727a(r5)
            return
        L_0x0071:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4.mo6727a(r5)
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p033a.p035b.C1478a.mo6721a(android.content.Context, android.content.Intent):void");
    }
}
