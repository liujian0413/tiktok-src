package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import com.bef.effectsdk.C1942b;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.p117a.C2323a;
import com.bytedance.android.livesdkapi.host.p453a.C9443d;
import com.bytedance.android.livesdkapi.p457i.C9485l;
import com.p280ss.android.ugc.effectmanager.C43837h;
import java.util.Locale;

public interface IHostContextForDouyin extends C2324b, C9443d {
    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    String getChannel();

    <T> T getClientABTestValue(C2323a<T> aVar, boolean z);

    C9485l getCurrentLocation();

    C43837h getEffectManager();

    int getLastVersionCode();

    String getPackageName();

    C1942b getResourceFinder();

    String getServerDeviceId();

    int getUpdateVersionCode();

    String getVersionCode();

    boolean hasLocation();

    boolean isLocalTest();

    boolean isNeedProtectUnderage();

    int liveId();

    void refreshClientABTestValues();
}
