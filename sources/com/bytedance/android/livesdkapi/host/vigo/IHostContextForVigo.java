package com.bytedance.android.livesdkapi.host.vigo;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bef.effectsdk.C1942b;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.p117a.C2323a;
import com.bytedance.android.livesdkapi.host.p453a.C9443d;
import com.p280ss.android.ugc.effectmanager.C43837h;
import java.util.Locale;

public interface IHostContextForVigo extends C2324b, C9443d {
    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    void enterRecorderActivity(Activity activity);

    String getChannel();

    <T> T getClientABTestValue(C2323a<T> aVar, boolean z);

    C43837h getEffectManager();

    Pair<String, String> getFreeFlowModel();

    int getLastVersionCode();

    String getPackageName();

    C1942b getResourceFinder();

    String getServerDeviceId();

    int getUpdateVersionCode();

    String getVersionCode();

    boolean isLocalTest();

    boolean isNeedProtectUnderage();

    int liveId();

    void refreshClientABTestValues();
}
