package com.p280ss.android.pushmanager.thirdparty;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.pushmanager.C20073f;
import com.p280ss.android.pushmanager.monitor.C20084d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.thirdparty.PushManager */
public class PushManager implements IPushAdapter {
    private static volatile PushManager sPushManager;
    private Map<Integer, C20091a> mPush3rdTypeMap = new HashMap();
    private Map<Integer, IPushAdapter> mPushAdapterMap;

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    private PushManager() {
        this.mPush3rdTypeMap.put(Integer.valueOf(14), new C20091a(14, "com.adm.push.AdmPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(5), new C20091a(5, "com.fcm.FcmPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(1), new C20091a(1, "com.xiaomi.MiPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(6), new C20091a(6, "com.umeng.UmengPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(7), new C20091a(7, "com.huawei.HWPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(8), new C20091a(8, "com.meizu.MzPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(10), new C20091a(10, "com.coloros.OppoPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(11), new C20091a(11, "com.vivo.VivoPushAdapter"));
        this.mPushAdapterMap = new HashMap();
    }

    private void tryResolveImpl(int i) {
        if (!this.mPushAdapterMap.containsKey(Integer.valueOf(i))) {
            C20091a aVar = (C20091a) this.mPush3rdTypeMap.get(Integer.valueOf(i));
            String str = null;
            if (aVar != null) {
                str = aVar.f54336b;
            }
            if (!C6319n.m19593a(str)) {
                try {
                    Object newInstance = Class.forName(str).newInstance();
                    if (newInstance instanceof IPushAdapter) {
                        this.mPushAdapterMap.put(Integer.valueOf(i), (IPushAdapter) newInstance);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean isPushAvailable(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                return iPushAdapter.isPushAvailable(context, i);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void registerPush(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                C20084d.m66143a(i);
                iPushAdapter.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public void unregisterPush(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = true;
        for (Integer num : this.mPush3rdTypeMap.keySet()) {
            tryResolveImpl(num.intValue());
            IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(num);
            if (iPushAdapter != null) {
                try {
                    z &= iPushAdapter.checkThirdPushConfig(str, context);
                } catch (Throwable unused) {
                    z = false;
                }
            }
        }
        try {
            return z & C20073f.m66098a(context, str, this.mPushAdapterMap.keySet());
        } catch (NameNotFoundException unused2) {
            return false;
        }
    }

    public void setAlias(Context context, String str, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.setAlias(context, str, i);
            } catch (Throwable unused) {
            }
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }
}
