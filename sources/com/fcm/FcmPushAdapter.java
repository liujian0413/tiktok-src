package com.fcm;

import android.content.Context;
import com.fcm.p738a.C14685a;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import com.google.firebase.messaging.C18359a;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.monitor.C20084d;
import com.p280ss.android.pushmanager.thirdparty.IPushAdapter;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

public class FcmPushAdapter implements IPushAdapter {
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return C14684a.m42497a(str, context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 5 && PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("FcmPush", "unregisterPush");
        }
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 5) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 5) {
                str = "通道注册错误";
            }
            C20084d.m66144a(i, BaseNotice.HASHTAG, "0", str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("registerPush:");
            sb.append(i);
            PushDependManager.inst().loggerD("FcmPush", sb.toString());
        }
        C14685a.m42499a(context, 1);
    }

    public void setAlias(Context context, String str, int i) {
        if (context != null && i == 5) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("FcmPush", "setAlias");
            }
            C18359a.m60499a().mo47293a(str).mo44285a((C17054c<TResult>) new C17054c<Void>() {
                /* renamed from: a */
                public final void mo37270a(C17057f<Void> fVar) {
                }
            });
        }
    }
}
