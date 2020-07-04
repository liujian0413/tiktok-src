package com.p280ss.android.ugc.aweme.account.login.sms;

import android.arch.lifecycle.C0052o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.SmsBroadcastReceiver */
public class SmsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Context f57944a;

    /* renamed from: b */
    private C0052o<String> f57945b;

    /* renamed from: b */
    public final void mo57768b() {
        try {
            this.f57944a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo57767a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        try {
            this.f57944a.registerReceiver(this, intentFilter);
        } catch (Exception unused) {
        }
    }

    public SmsBroadcastReceiver(Context context, C0052o<String> oVar) {
        this.f57944a = context;
        this.f57945b = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            java.lang.String r0 = r6.getAction()
            boolean r5 = android.text.TextUtils.equals(r5, r0)
            if (r5 == 0) goto L_0x007b
            android.os.Bundle r5 = r6.getExtras()
            r6 = 0
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.String r2 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
            java.lang.Object r2 = r5.get(r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            if (r2 == 0) goto L_0x0055
            int r6 = r2.f38874g
            if (r6 == 0) goto L_0x0024
            goto L_0x004d
        L_0x0024:
            java.lang.String r6 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "[0-9]{4,}"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x004d
            java.lang.String r5 = r5.group(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x004d
            android.arch.lifecycle.o<java.lang.String> r6 = r4.f57945b
            r6.setValue(r5)
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            int r6 = r2.f38874g
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            android.content.Context r2 = r4.f57944a
            boolean r2 = com.p280ss.android.ugc.aweme.account.util.C22339p.m73948a(r2)
            android.content.Context r3 = r4.f57944a
            int r3 = com.p280ss.android.ugc.aweme.account.p951l.C21241d.m71498b(r3)
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = ""
            m72325a(r0, r5, r2, r3)
            return
        L_0x006a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to get SMS data from Broadcast Receiver, status code = "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            m72325a(r1, r5, r2, r3)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.sms.SmsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    private static void m72325a(boolean z, String str, boolean z2, int i) {
        AccountLoginAlogHelper.m71523b(z, str, z2, i);
        C21225a.m71441b(z, str, z2, i);
        C6907h.m21524a("sms_auto_fill", (Map) new C21102b().mo56944a("is_successful", z ? 1 : 0).mo56946a("error_desc", str).mo56944a("has_sim_card", z2 ? 1 : 0).mo56944a("google_availability", i).f56672a);
    }
}
