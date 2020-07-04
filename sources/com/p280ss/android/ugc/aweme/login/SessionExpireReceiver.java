package com.p280ss.android.ugc.aweme.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;

/* renamed from: com.ss.android.ugc.aweme.login.SessionExpireReceiver */
public class SessionExpireReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C6861a.m21333b().logout("expired_logout", "sdk_expired_logout");
        C21558a.m72263a().mo57698a("session_expire", "", false, "user_login_out", C6861a.m21337f().isLogin());
        C6877n.m21407a("aweme_user_logout", "", C6869c.m21381a().mo16887a("errorDesc", "session_expire").mo16888b());
    }
}
