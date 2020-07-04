package com.p280ss.android.ugc.aweme.services.cutvideo;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.ICutVideoListener */
public interface ICutVideoListener {
    void onCompileDone();

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);

    void onStart();
}
