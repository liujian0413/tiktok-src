package com.ttnet.org.chromium.net1;

import android.content.Context;
import com.ttnet.org.chromium.net1.BidirectionalStream.Callback;
import com.ttnet.org.chromium.net1.CronetEngine.Builder.LibraryLoader;
import com.ttnet.org.chromium.net1.RequestFinishedInfo.Listener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class ExperimentalCronetEngine extends CronetEngine {

    public static class Builder extends com.ttnet.org.chromium.net1.CronetEngine.Builder {
        public Builder enableVerboseLog() {
            super.enableVerboseLog();
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder(Context context) {
            super(context);
        }

        public Builder enableBoeProxy(boolean z) {
            super.enableBoeProxy(z);
            return this;
        }

        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        public Builder enableHttpDns(boolean z) {
            super.enableHttpDns(z);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        public Builder enableSdch(boolean z) {
            super.enableSdch(z);
            return this;
        }

        public Builder setALogFuncAddr(long j) {
            super.setALogFuncAddr(j);
            return this;
        }

        public Builder setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
            super.setAppInfoProvider(tTAppInfoProvider);
            return this;
        }

        public Builder setAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
            super.setAppMonitorProvider(tTMonitorProvider);
            return this;
        }

        public Builder setBypassBOEJSON(String str) {
            super.setBypassBOEJSON(str);
            return this;
        }

        public Builder setEventListener(TTEventListener tTEventListener) {
            super.setEventListener(tTEventListener);
            return this;
        }

        public Builder setGetDomainDefaultJSON(String str) {
            super.setGetDomainDefaultJSON(str);
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setProxyConfig(String str) {
            super.setProxyConfig(str);
            return this;
        }

        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }

        public Builder enableDataReductionProxy(String str) {
            this.mBuilderDelegate.enableDataReductionProxy(str);
            return this;
        }

        public Builder enableLegacyMode(boolean z) {
            this.mBuilderDelegate.enableLegacyMode(z);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder setCertVerifierData(String str) {
            this.mBuilderDelegate.setCertVerifierData(str);
            return this;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        public Builder setDataReductionProxyOptions(String str, String str2, String str3) {
            this.mBuilderDelegate.setDataReductionProxyOptions(str, str2, str3);
            return this;
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }
    }

    public void addRequestFinishedListener(Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public List<InetAddress> dnsLookup(String str) throws IOException {
        return null;
    }

    public void doCommand(String str) {
    }

    public String getCertVerifierData(long j) {
        return "";
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract com.ttnet.org.chromium.net1.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, Callback callback, Executor executor);

    public abstract com.ttnet.org.chromium.net1.ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public void notifyTNCConfigUpdated(String str, String str2, String str3) {
    }

    public void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
    }

    public void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
    }

    public void registerEventListener(TTEventListener tTEventListener) {
    }

    public void removeRequestFinishedListener(Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void setAlogFuncAddr(long j) {
    }

    public void setEnableURLDispatcher(boolean z) {
    }

    public void setHostResolverRules(String str) {
    }

    public void setProxy(String str) {
    }

    public void setToken(String str) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }

    public void triggerGetDomain() {
    }

    public void tryStartNetDetect(String[] strArr, int i, int i2) {
    }

    public Map<String, int[]> getGroupRttEstimates() {
        return new HashMap();
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }
}
