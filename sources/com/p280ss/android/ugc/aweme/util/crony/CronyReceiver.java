package com.p280ss.android.ugc.aweme.util.crony;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.util.crony.CronyReceiver */
public class CronyReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private void m136135a() {
        ClipData primaryClip = ((ClipboardManager) C42871a.f111370a.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            StringBuilder sb = new StringBuilder("\n1\n");
            sb.append(charSequence);
            setResultData(sb.toString());
            return;
        }
        setResultData("\n0\n");
    }

    /* renamed from: b */
    private void m136137b() {
        String className = ((RunningTaskInfo) ((ActivityManager) C42871a.f111370a.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
        StringBuilder sb = new StringBuilder("\n1\n");
        sb.append(className);
        setResultData(sb.toString());
    }

    /* renamed from: a */
    private void m136136a(Intent intent) {
        ((ClipboardManager) C42871a.f111370a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Crony", intent.getStringExtra(C38347c.f99553h)));
        setResultData("\n1\n");
    }

    /* renamed from: b */
    private void m136138b(Intent intent) {
        if (C42871a.f111372c != null) {
            String stringExtra = intent.getStringExtra("key");
            if ("default".equals(stringExtra)) {
                stringExtra = "";
            }
            StringBuilder sb = new StringBuilder("\n1\n");
            sb.append(C42871a.f111372c.mo104582a(stringExtra));
            setResultData(sb.toString());
            return;
        }
        setResultData("\n2\n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r4 = r5.getAction()
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r4 = r5.getAction()
            int r0 = r4.hashCode()
            r1 = -2002725875(0xffffffff88a0d40d, float:-9.679503E-34)
            r2 = -1
            if (r0 == r1) goto L_0x0043
            r1 = -290818900(0xffffffffeeaa74ac, float:-2.637675E28)
            if (r0 == r1) goto L_0x0039
            r1 = 100274856(0x5fa12a8, float:2.351674E-35)
            if (r0 == r1) goto L_0x002f
            r1 = 534977624(0x1fe31c58, float:9.618513E-20)
            if (r0 == r1) goto L_0x0025
            goto L_0x004d
        L_0x0025:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_clipboard"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x004d
            r4 = 0
            goto L_0x004e
        L_0x002f:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_clipboard_put"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_info"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x004d
            r4 = 3
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_activity"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x004d
            r4 = 2
            goto L_0x004e
        L_0x004d:
            r4 = -1
        L_0x004e:
            switch(r4) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005a;
                case 2: goto L_0x0056;
                case 3: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0061
        L_0x0052:
            r3.m136138b(r5)
            goto L_0x0061
        L_0x0056:
            r3.m136137b()
            goto L_0x0061
        L_0x005a:
            r3.m136136a(r5)
            goto L_0x0061
        L_0x005e:
            r3.m136135a()
        L_0x0061:
            r3.setResultCode(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.util.crony.CronyReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
