package com.p280ss.mediakit.medialoader;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoaderListener */
public interface AVMDLDataLoaderListener {
    String getCheckSumInfo(String str);

    String getStringValue(int i, long j, String str);

    void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo);
}
