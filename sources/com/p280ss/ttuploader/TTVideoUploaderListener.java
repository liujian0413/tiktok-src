package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTVideoUploaderListener */
public interface TTVideoUploaderListener {
    String getStringFromExtern(int i);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, TTVideoInfo tTVideoInfo);

    int videoUploadCheckNetState(int i, int i2);
}
