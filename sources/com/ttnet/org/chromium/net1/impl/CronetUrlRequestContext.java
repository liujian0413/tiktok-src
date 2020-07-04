package com.ttnet.org.chromium.net1.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.ObserverList;
import com.ttnet.org.chromium.base1.PowerMonitor;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net1.BidirectionalStream.Callback;
import com.ttnet.org.chromium.net1.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net1.ExperimentalBidirectionalStream.Builder;
import com.ttnet.org.chromium.net1.NetworkQualityRttListener;
import com.ttnet.org.chromium.net1.NetworkQualityThroughputListener;
import com.ttnet.org.chromium.net1.RequestFinishedInfo;
import com.ttnet.org.chromium.net1.RequestFinishedInfo.Listener;
import com.ttnet.org.chromium.net1.TTAppInfoProvider;
import com.ttnet.org.chromium.net1.TTAppInfoProvider.AppInfo;
import com.ttnet.org.chromium.net1.TTEventListener;
import com.ttnet.org.chromium.net1.TTMonitorProvider;
import com.ttnet.org.chromium.net1.TTWebsocketConnection;
import com.ttnet.org.chromium.net1.UrlRequest;
import com.ttnet.org.chromium.net1.WebViewProxySettings;
import com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl.Pkp;
import com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl.QuicHint;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.RequestFinishedInfoListener;
import com.ttnet.org.chromium.net1.urlconnection.CronetHttpURLConnection;
import com.ttnet.org.chromium.net1.urlconnection.CronetURLStreamHandlerFactory;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("cronet")
public class CronetUrlRequestContext extends CronetEngineBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String LOG_TAG = "CronetUrlRequestContext";
    private final AtomicInteger mActiveRequestCount = new AtomicInteger(0);
    private TTAppInfoProvider mAppInfoProvider;
    private TTMonitorProvider mAppMonitorProvider;
    private String mCertVerifierData;
    public Context mContext;
    private int mDownstreamThroughputKbps = -1;
    private int mEffectiveConnectionType = 0;
    private TTEventListener mEventListener;
    private final Object mFinishedListenerLock = new Object();
    private final Map<Listener, RequestFinishedInfoListener> mFinishedListenerMap = new HashMap();
    private int[] mGroupHttpRttMs;
    private int[] mGroupTransportRttMs;
    private int mHttpRttMs = -1;
    private final ConditionVariable mInitCompleted = new ConditionVariable(false);
    private boolean mIsLogging;
    public final Object mLock = new Object();
    private boolean mNetLogToDisk;
    private boolean mNetworkQualityEstimatorEnabled;
    private final Object mNetworkQualityLock = new Object();
    private Thread mNetworkThread;
    private final ObserverList<NetworkQualityRttListenerWrapper> mRttListenerList = new ObserverList<>();
    private ConditionVariable mStopNetLogCompleted;
    private final ObserverList<NetworkQualityThroughputListenerWrapper> mThroughputListenerList = new ObserverList<>();
    private int mTransportRttMs = -1;
    public long mUrlRequestContextAdapter = 0;
    private ConditionVariable mWaitGetCertVerifierDataComplete = new ConditionVariable();
    private String[] mWatchingGroups;

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, String str4, String str5, String str6, String str7, boolean z4, int i, long j, String str8, long j2, boolean z5, boolean z6, String str9, boolean z7, boolean z8, String str10);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeDnsLookup(long j, DnsQuery dnsQuery);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeDoCommand(long j, String str);

    private static native void nativeEnableBoeProxy(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeGetCertVerifierData(long j);

    private static native byte[] nativeGetHistogramDeltas();

    private static native void nativeInitALogFuncAddr(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeNotifyTNCConfigUpdated(long j, String str, String str2, String str3);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeProvideRTTObservations(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeProvideThroughputObservations(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetAlogFuncAddr(long j, long j2);

    private static native void nativeSetBypassBOEJSON(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetEnableURLDispatcherByAppControl(long j, boolean z);

    private static native void nativeSetGetDomainDefaultJSON(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetHostResolverRules(long j, String str);

    private static native int nativeSetMinLogLevel(int i);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetProxy(long j, String str);

    private static native void nativeSetProxyConfig(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetToken(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeStopNetLog(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTriggerGetDomain(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTryStartNetDetect(long j, String[] strArr, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    public native void nativeInitRequestContextOnInitThread(long j);

    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new CronetURLStreamHandlerFactory(this);
    }

    public byte[] getGlobalMetricsDeltas() {
        return nativeGetHistogramDeltas();
    }

    /* access modifiers changed from: 0000 */
    public void onRequestDestroyed() {
        this.mActiveRequestCount.decrementAndGet();
    }

    /* access modifiers changed from: 0000 */
    public void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
    }

    private void checkHaveAdapter() throws IllegalStateException {
        if (!haveRequestContextAdapter()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean haveRequestContextAdapter() {
        if (this.mUrlRequestContextAdapter != 0) {
            return true;
        }
        return false;
    }

    private void onColdStartFinish() {
        if (this.mEventListener != null) {
            this.mEventListener.onColdStartFinish();
        }
    }

    private AppInfo onGetAppInfo() {
        if (this.mAppInfoProvider != null) {
            return this.mAppInfoProvider.getAppInfo();
        }
        return null;
    }

    private void onProxyServerInitFailed() {
        WebViewProxySettings.inst().setProxyServerStarted(Boolean.valueOf(false));
    }

    private void onTNCUpdateFailed() {
        if (this.mEventListener != null) {
            this.mEventListener.onTNCUpdateFailed();
        }
    }

    private void revertProxyConfig() {
        if (this.mContext != null) {
            postDelayedTaskToMainThread(new Runnable() {
                public void run() {
                    WebViewProxySettings.inst().revertBackProxy(CronetUrlRequestContext.this.mContext);
                }
            }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    private void setProxyConfig() {
        if (this.mContext != null) {
            postDelayedTaskToMainThread(new Runnable() {
                public void run() {
                    WebViewProxySettings.inst().setProxy(CronetUrlRequestContext.this.mContext);
                }
            }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    public long getUrlRequestContextAdapter() {
        long j;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j = this.mUrlRequestContextAdapter;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasRequestFinishedListener() {
        boolean z;
        synchronized (this.mFinishedListenerLock) {
            z = !this.mFinishedListenerMap.isEmpty();
        }
        return z;
    }

    public void stopNetLogCompleted() {
        synchronized (this.mLock) {
            this.mNetLogToDisk = false;
        }
        this.mStopNetLogCompleted.open();
    }

    public void triggerGetDomain() {
        synchronized (this.mLock) {
            nativeTriggerGetDomain(this.mUrlRequestContextAdapter);
        }
    }

    private int getLoggingLevel() {
        if (Log.isLoggable(LOG_TAG, 2)) {
            return -2;
        }
        if (Log.isLoggable(LOG_TAG, 3)) {
            return -1;
        }
        return 3;
    }

    public int getDownstreamThroughputKbps() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = -1;
                if (this.mDownstreamThroughputKbps != -1) {
                    i = this.mDownstreamThroughputKbps;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public int getEffectiveConnectionType() {
        int convertConnectionTypeToApiValue;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                convertConnectionTypeToApiValue = convertConnectionTypeToApiValue(this.mEffectiveConnectionType);
            }
            return convertConnectionTypeToApiValue;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public int getHttpRttMs() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = -1;
                if (this.mHttpRttMs != -1) {
                    i = this.mHttpRttMs;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public int getTransportRttMs() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = -1;
                if (this.mTransportRttMs != -1) {
                    i = this.mTransportRttMs;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public String getVersionString() {
        StringBuilder sb = new StringBuilder("Cronet/");
        sb.append(ImplVersion.getVersion());
        return sb.toString();
    }

    public Map<String, int[]> getGroupRttEstimates() {
        if (this.mNetworkQualityEstimatorEnabled) {
            HashMap hashMap = new HashMap();
            synchronized (this.mNetworkQualityLock) {
                for (int i = 0; i < this.mWatchingGroups.length; i++) {
                    hashMap.put(this.mWatchingGroups[i], new int[]{this.mGroupTransportRttMs[i], this.mGroupHttpRttMs[i]});
                }
            }
            return hashMap;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public void stopNetLog() {
        synchronized (this.mLock) {
            if (this.mIsLogging) {
                checkHaveAdapter();
                nativeStopNetLog(this.mUrlRequestContextAdapter);
                this.mIsLogging = false;
                if (this.mNetLogToDisk) {
                    this.mStopNetLogCompleted = new ConditionVariable();
                    this.mStopNetLogCompleted.block();
                }
            }
        }
    }

    public void shutdown() {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mActiveRequestCount.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            } else if (Thread.currentThread() == this.mNetworkThread) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.mInitCompleted.block();
        stopNetLog();
        synchronized (this.mLock) {
            if (haveRequestContextAdapter()) {
                nativeDestroy(this.mUrlRequestContextAdapter);
                this.mUrlRequestContextAdapter = 0;
            }
        }
    }

    public void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
        this.mAppInfoProvider = tTAppInfoProvider;
    }

    public void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
        this.mAppMonitorProvider = tTMonitorProvider;
    }

    public void registerEventListener(TTEventListener tTEventListener) {
        this.mEventListener = tTEventListener;
    }

    private void onGetCertVerifierData(String str) {
        this.mCertVerifierData = str;
        this.mWaitGetCertVerifierDataComplete.open();
    }

    public boolean isNetworkThread(Thread thread) {
        if (thread == this.mNetworkThread) {
            return true;
        }
        return false;
    }

    public URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    private void onServerConfigUpdated(String str) {
        if (this.mEventListener != null) {
            this.mEventListener.onServerConfigUpdated(str);
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        if (this.mEventListener != null) {
            this.mEventListener.onTTNetDetectInfoChanged(str);
        }
    }

    private void onTTNetStateChanged(int i) {
        if (this.mEventListener != null) {
            this.mEventListener.onTTNetStateChanged(i);
        }
    }

    public void doCommand(String str) {
        synchronized (this.mLock) {
            nativeDoCommand(this.mUrlRequestContextAdapter, str);
        }
    }

    public void removeRequestFinishedListener(Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    public void setEnableURLDispatcher(boolean z) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeSetEnableURLDispatcherByAppControl(this.mUrlRequestContextAdapter, z);
        }
    }

    public void setHostResolverRules(String str) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeSetHostResolverRules(this.mUrlRequestContextAdapter, str);
        }
    }

    public void setProxy(String str) {
        synchronized (this.mLock) {
            nativeSetProxy(this.mUrlRequestContextAdapter, str);
        }
    }

    public void setToken(String str) {
        synchronized (this.mLock) {
            nativeSetToken(this.mUrlRequestContextAdapter, str);
        }
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = i;
            if (this.mEventListener != null) {
                this.mEventListener.onEffectiveConnectionTypeChanged(this.mEffectiveConnectionType);
            }
        }
    }

    public void addRequestFinishedListener(Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new RequestFinishedInfoListener(listener));
        }
    }

    public List<InetAddress> dnsLookup(String str) throws IOException {
        DnsQuery dnsQuery = new DnsQuery(str);
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeDnsLookup(this.mUrlRequestContextAdapter, dnsQuery);
        }
        dnsQuery.waitResult();
        return dnsQuery.getResult();
    }

    private static int convertConnectionTypeToApiValue(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                StringBuilder sb = new StringBuilder("Internal Error: Illegal EffectiveConnectionType value ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideRTTObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mRttListenerList.addObserver(new NetworkQualityRttListenerWrapper(networkQualityRttListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideThroughputObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mThroughputListenerList.addObserver(new NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public String getCertVerifierData(long j) {
        if (j >= 0) {
            if (j == 0) {
                j = 100;
            }
            this.mWaitGetCertVerifierDataComplete.close();
            synchronized (this.mLock) {
                checkHaveAdapter();
                nativeGetCertVerifierData(this.mUrlRequestContextAdapter);
            }
            this.mWaitGetCertVerifierDataComplete.block(j);
            return this.mCertVerifierData;
        }
        throw new IllegalArgumentException("timeout must be a positive value");
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mRttListenerList.removeObserver(new NetworkQualityRttListenerWrapper(networkQualityRttListener)) && this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideRTTObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mThroughputListenerList.removeObserver(new NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener)) && this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideThroughputObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    /* access modifiers changed from: 0000 */
    public void reportFinished(final RequestFinishedInfo requestFinishedInfo) {
        ArrayList arrayList;
        synchronized (this.mFinishedListenerLock) {
            arrayList = new ArrayList(this.mFinishedListenerMap.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final RequestFinishedInfoListener requestFinishedInfoListener = (RequestFinishedInfoListener) it.next();
            postObservationTaskToExecutor(requestFinishedInfoListener.getExecutor(), new Runnable() {
                public void run() {
                    requestFinishedInfoListener.onRequestFinished(requestFinishedInfo);
                }
            });
        }
    }

    public void setAlogFuncAddr(long j) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("Set alog func addr: ");
            sb.append(j);
            Log.m22891e(str, sb.toString(), new Object[0]);
            nativeSetAlogFuncAddr(this.mUrlRequestContextAdapter, j);
        }
    }

    public CronetUrlRequestContext(final CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        CronetLibraryLoader.ensureInitialized(cronetEngineBuilderImpl.getContext(), cronetEngineBuilderImpl);
        nativeSetMinLogLevel(getLoggingLevel());
        synchronized (this.mLock) {
            this.mUrlRequestContextAdapter = nativeCreateRequestContextAdapter(createNativeUrlRequestContextConfig(cronetEngineBuilderImpl));
            if (this.mUrlRequestContextAdapter != 0) {
                this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
            } else {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        this.mAppInfoProvider = cronetEngineBuilderImpl.getAppInfoProvider();
        this.mAppMonitorProvider = cronetEngineBuilderImpl.getAppMonitorProvider();
        this.mEventListener = cronetEngineBuilderImpl.getEventListener();
        this.mContext = cronetEngineBuilderImpl.getContext();
        CronetLibraryLoader.postToInitThread(new Runnable() {
            public void run() {
                try {
                    CronetLibraryLoader.ensureInitializedOnInitThread(cronetEngineBuilderImpl.getContext());
                    PowerMonitor.create(cronetEngineBuilderImpl.getContext());
                    synchronized (CronetUrlRequestContext.this.mLock) {
                        CronetUrlRequestContext.this.nativeInitRequestContextOnInitThread(CronetUrlRequestContext.this.mUrlRequestContextAdapter);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static long createNativeUrlRequestContextConfig(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str = "";
        try {
            File filesDir = cronetEngineBuilderImpl.getContext().getFilesDir();
            if (filesDir != null) {
                str = filesDir.getAbsolutePath();
            }
        } catch (Throwable unused) {
        }
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(cronetEngineBuilderImpl.getUserAgent(), cronetEngineBuilderImpl.storagePath(), cronetEngineBuilderImpl.quicEnabled(), cronetEngineBuilderImpl.getDefaultQuicUserAgentId(), cronetEngineBuilderImpl.http2Enabled(), cronetEngineBuilderImpl.sdchEnabled(), cronetEngineBuilderImpl.dataReductionProxyKey(), cronetEngineBuilderImpl.dataReductionProxyPrimaryProxy(), cronetEngineBuilderImpl.dataReductionProxyFallbackProxy(), cronetEngineBuilderImpl.dataReductionProxySecureProxyCheckUrl(), cronetEngineBuilderImpl.cacheDisabled(), cronetEngineBuilderImpl.httpCacheMode(), cronetEngineBuilderImpl.httpCacheMaxSize(), cronetEngineBuilderImpl.experimentalOptions(), cronetEngineBuilderImpl.mockCertVerifier(), cronetEngineBuilderImpl.networkQualityEstimatorEnabled(), cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled(), cronetEngineBuilderImpl.certVerifierData(), cronetEngineBuilderImpl.httpDnsEnabled(), cronetEngineBuilderImpl.verboseLogEnabled(), str);
        for (QuicHint quicHint : cronetEngineBuilderImpl.quicHints()) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (Pkp pkp : cronetEngineBuilderImpl.publicKeyPins()) {
            String str2 = pkp.mHost;
            byte[][] bArr = pkp.mHashes;
            nativeAddPkp(nativeCreateRequestContextConfig, str2, bArr, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        String getDomainDefaultJSON = cronetEngineBuilderImpl.getGetDomainDefaultJSON();
        if (getDomainDefaultJSON != null) {
            nativeSetGetDomainDefaultJSON(nativeCreateRequestContextConfig, getDomainDefaultJSON);
        }
        String bypassBOEJSON = cronetEngineBuilderImpl.getBypassBOEJSON();
        if (bypassBOEJSON != null) {
            nativeSetBypassBOEJSON(nativeCreateRequestContextConfig, bypassBOEJSON);
        }
        String proxyConfig = cronetEngineBuilderImpl.getProxyConfig();
        if (proxyConfig != null) {
            nativeSetProxyConfig(nativeCreateRequestContextConfig, proxyConfig);
        }
        nativeEnableBoeProxy(nativeCreateRequestContextConfig, cronetEngineBuilderImpl.boeProxyEnabled());
        nativeInitALogFuncAddr(cronetEngineBuilderImpl.aLogFuncAddr());
        return nativeCreateRequestContextConfig;
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        if (this.mAppMonitorProvider != null) {
            this.mAppMonitorProvider.sendAppMonitorEvent(str, str2);
        }
    }

    private void postDelayedTaskToMainThread(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        if (this.mEventListener == null) {
            return null;
        }
        return this.mEventListener.onCallToAddSecurityFactor(str, map);
    }

    private static void postObservationTaskToExecutor(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m22891e(LOG_TAG, "Exception posting task to executor", e);
        }
    }

    public void startNetLogToFile(String str, boolean z) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (nativeStartNetLogToFile(this.mUrlRequestContextAdapter, str, z)) {
                this.mIsLogging = true;
            } else {
                throw new RuntimeException("Unable to start NetLog");
            }
        }
    }

    private void onProxyServerInitSuccess(String str, int i) {
        if (this.mContext != null) {
            WebViewProxySettings.inst().setProxyHostAndPort(str, i);
            WebViewProxySettings.inst().setProxyServerStarted(Boolean.valueOf(true));
            postDelayedTaskToMainThread(new Runnable() {
                public void run() {
                    WebViewProxySettings.inst().setProxy(CronetUrlRequestContext.this.mContext);
                }
            }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    public URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() == Type.DIRECT) {
            String protocol = url.getProtocol();
            if (WebKitApi.SCHEME_HTTP.equals(protocol) || WebKitApi.SCHEME_HTTPS.equals(protocol)) {
                return new CronetHttpURLConnection(url, this);
            }
            StringBuilder sb = new StringBuilder("Unexpected protocol:");
            sb.append(protocol);
            throw new UnsupportedOperationException(sb.toString());
        }
        throw new UnsupportedOperationException();
    }

    private void initNetworkThread(boolean z, int i) {
        Thread currentThread = Thread.currentThread();
        this.mNetworkThread = currentThread;
        if (currentThread == null) {
            Log.m22891e(LOG_TAG, "get phread error!", new Object[0]);
        } else if (this.mInitCompleted == null) {
            Log.m22891e(LOG_TAG, "mInitCompleted is null", new Object[0]);
        } else {
            this.mInitCompleted.open();
            if (!z || i < -20 || i > 19) {
                Log.m22883d(LOG_TAG, "set net phread priority to background");
                Thread.currentThread().setName("ChromiumNet");
                Process.setThreadPriority(10);
                return;
            }
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("set net phread priority to ");
            sb.append(i);
            Log.m22883d(str, sb.toString());
            Thread currentThread2 = Thread.currentThread();
            StringBuilder sb2 = new StringBuilder("ChromiumNet_");
            sb2.append(i);
            currentThread2.setName(sb2.toString());
            Process.setThreadPriority(i);
        }
    }

    public Builder newBidirectionalStreamBuilder(String str, Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    private void onDnsLookupComplete(final DnsQuery dnsQuery, int i, String[] strArr) {
        dnsQuery.setResult(i, strArr);
        dnsQuery.resume(new Runnable() {
            public void run() {
                dnsQuery.done();
            }
        });
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mLock) {
                checkHaveAdapter();
                nativeConfigureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, z, z2, z3);
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public void notifyTNCConfigUpdated(String str, String str2, String str3) {
        synchronized (this.mLock) {
            nativeNotifyTNCConfigUpdated(this.mUrlRequestContextAdapter, str, str2, str3);
        }
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeStartNetLogToDisk(this.mUrlRequestContextAdapter, str, z, i);
            this.mIsLogging = true;
            this.mNetLogToDisk = true;
        }
    }

    public void tryStartNetDetect(String[] strArr, int i, int i2) {
        synchronized (this.mLock) {
            nativeTryStartNetDetect(this.mUrlRequestContextAdapter, strArr, i, i2);
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator it = this.mRttListenerList.iterator();
            while (it.hasNext()) {
                NetworkQualityRttListenerWrapper networkQualityRttListenerWrapper = (NetworkQualityRttListenerWrapper) it.next();
                final NetworkQualityRttListenerWrapper networkQualityRttListenerWrapper2 = networkQualityRttListenerWrapper;
                final int i3 = i;
                final long j2 = j;
                final int i4 = i2;
                C467682 r3 = new Runnable() {
                    public void run() {
                        networkQualityRttListenerWrapper2.onRttObservation(i3, j2, i4);
                    }
                };
                postObservationTaskToExecutor(networkQualityRttListenerWrapper.getExecutor(), r3);
            }
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator it = this.mThroughputListenerList.iterator();
            while (it.hasNext()) {
                NetworkQualityThroughputListenerWrapper networkQualityThroughputListenerWrapper = (NetworkQualityThroughputListenerWrapper) it.next();
                final NetworkQualityThroughputListenerWrapper networkQualityThroughputListenerWrapper2 = networkQualityThroughputListenerWrapper;
                final int i3 = i;
                final long j2 = j;
                final int i4 = i2;
                C467704 r3 = new Runnable() {
                    public void run() {
                        networkQualityThroughputListenerWrapper2.onThroughputObservation(i3, j2, i4);
                    }
                };
                postObservationTaskToExecutor(networkQualityThroughputListenerWrapper.getExecutor(), r3);
            }
        }
    }

    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        CronetWebsocketConnection cronetWebsocketConnection = new CronetWebsocketConnection(this, callback, executor, list, map, map2, z);
        return cronetWebsocketConnection;
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3, String[] strArr, int[] iArr, int[] iArr2) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = i;
            this.mTransportRttMs = i2;
            this.mDownstreamThroughputKbps = i3;
            this.mWatchingGroups = strArr;
            this.mGroupTransportRttMs = iArr;
            this.mGroupHttpRttMs = iArr2;
        }
    }

    /* access modifiers changed from: protected */
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, Callback callback, Executor executor, String str2, List<Entry<String, String>> list, int i, boolean z, Collection<Object> collection) {
        CronetBidirectionalStream cronetBidirectionalStream;
        synchronized (this.mLock) {
            checkHaveAdapter();
            cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection);
        }
        return cronetBidirectionalStream;
    }

    public UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3) {
        CronetUrlRequest cronetUrlRequest;
        synchronized (this.mLock) {
            checkHaveAdapter();
            cronetUrlRequest = new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3);
        }
        return cronetUrlRequest;
    }

    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        CronetWebsocketConnection cronetWebsocketConnection = new CronetWebsocketConnection(this, callback, executor, list, i, str, j, i2, j2, str2, i3, str3, map, map2, z);
        return cronetWebsocketConnection;
    }

    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        if (this.mAppMonitorProvider != null) {
            this.mAppMonitorProvider.handleApiResult(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4);
        }
    }
}
