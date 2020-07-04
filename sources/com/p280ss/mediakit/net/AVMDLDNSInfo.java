package com.p280ss.mediakit.net;

/* renamed from: com.ss.mediakit.net.AVMDLDNSInfo */
public class AVMDLDNSInfo {
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String mId;
    public String mIpList;
    public int mType;

    public AVMDLDNSInfo(int i, String str, String str2, long j, String str3) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
    }

    public AVMDLDNSInfo(int i, String str, String str2, long j, String str3, String str4) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
