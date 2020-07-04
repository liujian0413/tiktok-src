package com.bytedance.android.livesdkapi.host.p456xt;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.p117a.C2323a;
import com.bytedance.android.livesdkapi.host.p453a.C9443d;
import com.p280ss.android.ugc.effectmanager.C43837h;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostContextForXT */
public interface IHostContextForXT extends C2324b, C9443d {
    int appId();

    String appName();

    Context context();

    String getChannel();

    <T> T getClientABTestValue(C2323a<T> aVar, boolean z);

    C43837h getEffectManager();

    int getLastVersionCode();

    String getPackageName();

    String getServerDeviceId();

    int getUpdateVersionCode();

    String getVersionCode();

    boolean isLocalTest();

    boolean isNeedProtectUnderage();

    int liveId();

    void refreshClientABTestValues();
}
