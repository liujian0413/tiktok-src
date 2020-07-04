package com.google.firebase.iid;

import android.content.Intent;

public class FirebaseInstanceIdService extends zzb {
    public void onTokenRefresh() {
    }

    /* access modifiers changed from: protected */
    public final Intent zzb(Intent intent) {
        return (Intent) C18356z.m60489a().f49860a.poll();
    }

    public final void zzd(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            onTokenRefresh();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m60321a().mo47194h();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m60321a().mo47198l();
            }
        }
    }
}
