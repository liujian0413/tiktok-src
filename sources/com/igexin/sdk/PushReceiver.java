package com.igexin.sdk;

import android.content.BroadcastReceiver;
import com.p280ss.android.pushmanager.setting.C20090b;

public class PushReceiver extends BroadcastReceiver {

    class _lancet {
        private _lancet() {
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isAllowNetwork(C20090b bVar) {
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|(1:11)|12|(1:14)|15|16|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
        /*
            r0 = this;
            com.ss.android.pushmanager.setting.b r2 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ Throwable -> 0x0028 }
            boolean r2 = r2.mo53788n()     // Catch:{ Throwable -> 0x0028 }
            if (r2 == 0) goto L_0x000f
            com.p280ss.android.message.p885a.C19813b.m65416a(r1)     // Catch:{ Throwable -> 0x000e }
            return
        L_0x000e:
            return
        L_0x000f:
            com.ss.android.pushmanager.app.c$a r2 = com.p280ss.android.pushmanager.app.C20044c.m66004a()     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0018
            r2.mo53663a(r1)     // Catch:{ Exception -> 0x0023 }
        L_0x0018:
            com.ss.android.pushmanager.setting.b r2 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ Exception -> 0x0023 }
            boolean r2 = com.igexin.sdk.PushReceiver._lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isAllowNetwork(r2)     // Catch:{ Exception -> 0x0023 }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            com.p280ss.android.message.C19841i.m65523e(r1)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.sdk.PushReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
