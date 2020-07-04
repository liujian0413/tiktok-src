package com.p280ss.mediakit.medialoader;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure */
public class AVMDLDataLoaderConfigure {
    public static int ALLOW_PRELOAD_WHEN_PLAY = 0;
    public static int DEFAULT_CHECK_SUM_LEVEL = 0;
    public static int DEFAULT_MAX_CACHE_AGE = 1209600;
    public static int DEFAULT_MAX_CACHE_SIZE = 314572800;
    public static int DEFAULT_MAX_FACTORY_CACHE_SIZE = 209715200;
    public static int DEFAULT_MAX_FACTORY_MEMORY_SIZE = 5242880;
    public static int DEFAULT_PRELOAD_PARALLEL_NUM = 1;
    public static int DEFAULT_SOCKET_IDLE_TIMEOUT = 120;
    public static int DISABLE_EXTERN_DNS = 0;
    public static int DISABLE_SOCKET_REUSE = 0;
    public static int ENABLE_EXTERN_DNS = 1;
    public static int ENABLE_SOCKET_REUSE = 1;
    public static int ENCRYPT_VERSION_0 = 0;
    public static int ENCRYPT_VERSION_1 = 1;
    public static int NOT_ALLOW_PLAY_TASK_KEY_PRELOAD = 1;
    public static int NOT_ALLOW_PRELOAD_WHEN_PLAY = 2;
    public static int TEST_SPEED_TYPE_VERSION_1 = 1;
    public static int TEST_SPEED_TYPE_VERSION_2 = 2;
    public static int WAIT_LIST_IS_QUEUE = 1;
    public static int WAIT_LIST_IS_STACK;
    public String mAppInfo;
    public String mCacheDir;
    public int mCheckSumLevel;
    public int mDNSBackType = 2;
    public int mDNSMainType;
    public int mDefaultExpiredTime = 60;
    public int mEnableBenchMarkIOSpeed;
    public int mEnableExternDNS;
    public int mEnableIpBucket;
    public int mEnablePreloadReUse;
    public int mEnableSocketReuse;
    public int mEncryptVersion;
    public int mErrorStateTrustTime;
    public int mIsCloseFileCache;
    public String mLoaderFactoryDir;
    public int mLoaderFactoryMaxCacheSize;
    public int mLoaderFactoryMaxMemorySize;
    public int mLoaderFactoryP2PLevel = 3;
    public int mLoaderType;
    public int mMainToBackUpDelayedTime;
    public int mMaxCacheAge;
    public int mMaxCacheSize;
    public int mMaxIpCountEachDomain;
    public int mOnlyUseCdn;
    public int mOpenTimeOut;
    public int mPreloadParallelNum;
    public int mPreloadStrategy;
    public int mPreloadWaitListType;
    public int mRWTimeOut;
    public int mSocketIdleTimeOut;
    public int mSpeedCoefficientValue;
    public int mTestSpeedTypeVersion;
    public int mTryCount;

    public static AVMDLDataLoaderConfigure getDefaultonfigure() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = new AVMDLDataLoaderConfigure(DEFAULT_MAX_CACHE_SIZE, 5, 5, 0, null);
        return aVMDLDataLoaderConfigure;
    }

    public AVMDLDataLoaderConfigure(int i, int i2, int i3, int i4, String str) {
        this.mMaxCacheSize = i;
        this.mOpenTimeOut = i2;
        this.mRWTimeOut = i3;
        this.mTryCount = i4;
        this.mCacheDir = str;
        this.mLoaderFactoryMaxCacheSize = DEFAULT_MAX_FACTORY_CACHE_SIZE;
        this.mLoaderFactoryMaxMemorySize = DEFAULT_MAX_FACTORY_MEMORY_SIZE;
        this.mPreloadParallelNum = DEFAULT_PRELOAD_PARALLEL_NUM;
        this.mMaxCacheAge = DEFAULT_MAX_CACHE_AGE;
        this.mPreloadStrategy = NOT_ALLOW_PLAY_TASK_KEY_PRELOAD;
        this.mPreloadWaitListType = WAIT_LIST_IS_QUEUE;
        this.mEnableExternDNS = DISABLE_EXTERN_DNS;
        this.mEnableSocketReuse = DISABLE_SOCKET_REUSE;
        this.mSocketIdleTimeOut = DEFAULT_SOCKET_IDLE_TIMEOUT;
        this.mDNSBackType = 2;
        this.mDefaultExpiredTime = 60;
        this.mLoaderFactoryP2PLevel = 3;
        this.mTestSpeedTypeVersion = TEST_SPEED_TYPE_VERSION_1;
        this.mCheckSumLevel = DEFAULT_CHECK_SUM_LEVEL;
        this.mDefaultExpiredTime = DEFAULT_SOCKET_IDLE_TIMEOUT;
        this.mEncryptVersion = ENCRYPT_VERSION_0;
    }
}
