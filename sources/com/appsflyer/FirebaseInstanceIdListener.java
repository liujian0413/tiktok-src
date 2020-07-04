package com.appsflyer;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIdListener extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        String str;
        super.onTokenRefresh();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str = FirebaseInstanceId.m60321a().mo47191d();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", th);
            str = null;
        }
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C1870c r3 = C1870c.m8745(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C1870c cVar = new C1870c(currentTimeMillis, str);
            if (r3.mo7463(cVar)) {
                C1901u.m8832(getApplicationContext(), cVar);
            }
        }
    }
}
