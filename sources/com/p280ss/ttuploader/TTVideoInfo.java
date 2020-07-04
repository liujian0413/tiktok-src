package com.p280ss.ttuploader;

import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTVideoInfo */
public class TTVideoInfo {
    public String mAlgorithm;
    public String mCoverUri;
    public String mCoverUrl;
    public String mEncryptionVideoTosKey;
    public long mErrcode;
    public String mExtra;
    public JSONObject mLog;
    public String mObjectId;
    public String mPlainObjectId;
    public long mProgress;
    public String mSecretKey;
    public String mSourceMd5;
    public String mTosKey;
    public String mVersion;
    public String mVideoId;
    public String mVideoMediaInfo;

    public TTVideoInfo(String str, String str2, String str3, long j, String str4, String str5) {
        this.mVideoId = str;
        this.mCoverUrl = str2;
        this.mCoverUri = str3;
        this.mProgress = j;
        this.mErrcode = j;
        this.mTosKey = str4;
        this.mVideoMediaInfo = str5;
    }

    public TTVideoInfo(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7) {
        this.mObjectId = str;
        this.mEncryptionVideoTosKey = str;
        this.mSecretKey = str2;
        this.mAlgorithm = str3;
        this.mVersion = str4;
        this.mProgress = j;
        this.mSourceMd5 = str5;
        this.mExtra = str6;
        this.mPlainObjectId = str7;
        this.mTosKey = str7;
    }
}
