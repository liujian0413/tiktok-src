package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.TTWebsocketConnection;
import com.ttnet.org.chromium.net.TTWebsocketConnection.Builder;
import com.ttnet.org.chromium.net.TTWebsocketConnection.Callback;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class TTWebsocketConnectionBuilderImpl extends Builder {
    private static final String TAG = "TTWebsocketConnectionBuilderImpl";
    private int mAppId;
    private String mAppKey;
    private String mAppToken;
    private int mAppVersion;
    private final Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private long mDeviceId;
    private final Executor mExecutor;
    private int mFpid;
    private Map<String, String> mHeaders;
    private long mInstallId;
    private Map<String, String> mParams;
    private String mSessionId;
    private boolean mSharedConnection = true;
    private List<String> mUrlList;
    private boolean mUseFrontier = true;

    public TTWebsocketConnection build() {
        if (this.mUseFrontier) {
            return this.mCronetEngine.createWebsocketConnection(this.mCallback, this.mExecutor, this.mUrlList, this.mAppId, this.mAppKey, this.mDeviceId, this.mFpid, this.mInstallId, this.mSessionId, this.mAppVersion, this.mAppToken, this.mParams, this.mHeaders, this.mSharedConnection);
        }
        return this.mCronetEngine.createWebsocketConnection(this.mCallback, this.mExecutor, this.mUrlList, this.mParams, this.mHeaders, this.mSharedConnection);
    }

    public Builder setAppId(int i) {
        this.mAppId = i;
        return this;
    }

    public Builder setAppKey(String str) {
        this.mAppKey = str;
        return this;
    }

    public Builder setAppToken(String str) {
        this.mAppToken = str;
        return this;
    }

    public Builder setAppVersion(int i) {
        this.mAppVersion = i;
        return this;
    }

    public Builder setCustomizedHeaders(Map<String, String> map) {
        this.mHeaders = map;
        return this;
    }

    public Builder setCustomizedParams(Map<String, String> map) {
        this.mParams = map;
        return this;
    }

    public Builder setDeviceId(long j) {
        this.mDeviceId = j;
        return this;
    }

    public Builder setFpid(int i) {
        this.mFpid = i;
        return this;
    }

    public Builder setInstallId(long j) {
        this.mInstallId = j;
        return this;
    }

    public Builder setSessionId(String str) {
        this.mSessionId = str;
        return this;
    }

    public Builder setSharedConnection(boolean z) {
        this.mSharedConnection = z;
        return this;
    }

    public Builder setUrlList(List<String> list) {
        this.mUrlList = list;
        return this;
    }

    public Builder useFrontierProtocol(boolean z) {
        this.mUseFrontier = z;
        return this;
    }

    TTWebsocketConnectionBuilderImpl(Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
        this.mCronetEngine = cronetEngineBase;
        this.mCallback = callback;
        this.mExecutor = executor;
    }
}
