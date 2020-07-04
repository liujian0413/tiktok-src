package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTImageInfo */
public class TTImageInfo {
    public String mAlgorithm;
    public String mEncryptionImageTosKey;
    public long mErrcode;
    public String mExtra;
    public int mFileIndex = -1;
    public String mImageToskey;
    public String mImageUri;
    public String mMetaInfo;
    public String mObjectId;
    public String mPlainObjectId;
    public long mProgress;
    public String mSecretKey;
    public String mSourceMd5;
    public String mVersion;

    public TTImageInfo(String str, long j, int i, String str2) {
        this.mImageUri = str;
        this.mImageToskey = str;
        this.mProgress = j;
        this.mErrcode = j;
        this.mFileIndex = i;
        this.mMetaInfo = str2;
    }

    public TTImageInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        this.mObjectId = str;
        this.mEncryptionImageTosKey = str;
        this.mSecretKey = str2;
        this.mAlgorithm = str3;
        this.mVersion = str4;
        this.mImageUri = str5;
        this.mProgress = j;
        this.mFileIndex = i;
        this.mSourceMd5 = str6;
        this.mExtra = str7;
        this.mPlainObjectId = str8;
        this.mImageToskey = str8;
    }
}
