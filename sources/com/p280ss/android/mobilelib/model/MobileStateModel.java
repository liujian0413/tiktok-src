package com.p280ss.android.mobilelib.model;

/* renamed from: com.ss.android.mobilelib.model.MobileStateModel */
public enum MobileStateModel {
    INSTANCE;
    
    private long mLastSendTime;
    private String mMobile;
    private int mRetryTime;

    public final long getLastSendTime() {
        return this.mLastSendTime;
    }

    public final String getMobile() {
        return this.mMobile;
    }

    public final int getRetryTime() {
        return this.mRetryTime;
    }

    public final void setLastSendTime(long j) {
        this.mLastSendTime = j;
    }

    public final void setMobile(String str) {
        this.mMobile = str;
    }

    public final void setRetryTime(int i) {
        this.mRetryTime = i;
    }
}
