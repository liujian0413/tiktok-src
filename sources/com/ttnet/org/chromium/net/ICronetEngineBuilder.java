package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.CronetEngine.Builder.LibraryLoader;
import java.util.Date;
import java.util.Set;

public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i, int i2);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableBoeProxy(boolean z);

    public ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public abstract ICronetEngineBuilder enableHttp2(boolean z);

    public abstract ICronetEngineBuilder enableHttpCache(int i, long j);

    public abstract ICronetEngineBuilder enableHttpDns(boolean z);

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract ICronetEngineBuilder enableQuic(boolean z);

    public abstract ICronetEngineBuilder enableSdch(boolean z);

    public abstract ICronetEngineBuilder enableVerboseLog();

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setALogFuncAddr(long j);

    public abstract ICronetEngineBuilder setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider);

    public abstract ICronetEngineBuilder setAppMonitorProvider(TTMonitorProvider tTMonitorProvider);

    public abstract ICronetEngineBuilder setBypassBOEJSON(String str);

    public abstract ICronetEngineBuilder setCronetSoPath(String str);

    public abstract ICronetEngineBuilder setEventListener(TTEventListener tTEventListener);

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setGetDomainDefaultJSON(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setProxyConfig(String str);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }

    public abstract ICronetEngineBuilder setUserAgent(String str);
}
