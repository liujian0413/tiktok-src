package com.p280ss.android.ugc.aweme.setting.model;

import com.p280ss.android.ugc.aweme.setting.C7208as.C7209a;

/* renamed from: com.ss.android.ugc.aweme.setting.model.RetryPolicyItem */
public class RetryPolicyItem {
    public boolean isLoadSuccess;
    public long lastResponseTime;
    public int retryCount;
    public C7209a retryListener;

    public RetryPolicyItem(boolean z, long j, C7209a aVar) {
        this.isLoadSuccess = z;
        this.lastResponseTime = j;
        this.retryListener = aVar;
    }
}
