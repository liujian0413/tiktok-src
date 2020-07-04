package com.ttnet.org.chromium.net;

import java.util.Map;

public abstract class TTEventListener {
    public abstract void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4);

    public abstract Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    public abstract void onColdStartFinish();

    public abstract void onEffectiveConnectionTypeChanged(int i);

    public abstract void onServerConfigUpdated(String str);

    public abstract void onTNCUpdateFailed();

    public abstract void onTTNetDetectInfoChanged(String str);

    public abstract void onTTNetStateChanged(int i);
}
