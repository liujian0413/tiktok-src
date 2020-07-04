package com.adm.push;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.monitor.C20084d;
import com.p280ss.android.pushmanager.thirdparty.IPushAdapter;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

public class AdmPushAdapter implements IPushAdapter {
    private static boolean sSupport = true;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
        } catch (ClassNotFoundException unused) {
        }
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport || !C1654b.m8056a(context).mo7052a()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) throws NameNotFoundException {
        return C1655c.m8061a(str, context);
    }

    public boolean isPushAvailable(Context context, int i) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("isPushAvailable: ");
            sb.append(isSupport(context));
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        return isSupport(context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 14 && isSupport(context)) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("unregisterPush: ");
                sb.append(i);
                PushDependManager.inst().loggerD("AdmPush", sb.toString());
            }
            C1654b.m8056a(context).mo7054c();
        }
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 14 || !isSupport(context)) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 14) {
                str = "通道注册错误";
            } else if (!isSupport(context)) {
                str = "不支持的系统";
            }
            C20084d.m66144a(i, BaseNotice.HASHTAG, "0", str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("registerPush: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        C1654b.m8056a(context).mo7053b();
    }

    public void setAlias(Context context, String str, int i) {
        if (context != null && i == 14 && isSupport(context) && PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("setAlias: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        if (context != null && i == 14 && isSupport(context) && PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("trackPush: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }
}
