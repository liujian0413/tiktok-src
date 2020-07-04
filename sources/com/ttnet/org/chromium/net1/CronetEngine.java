package com.ttnet.org.chromium.net1;

import android.content.Context;
import com.ttnet.org.chromium.net1.UrlRequest.Callback;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class CronetEngine {

    public static class Builder {
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableVerboseLog() {
            this.mBuilderDelegate.enableVerboseLog();
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder enableBoeProxy(boolean z) {
            this.mBuilderDelegate.enableBoeProxy(z);
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpDns(boolean z) {
            this.mBuilderDelegate.enableHttpDns(z);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        public Builder enableSdch(boolean z) {
            this.mBuilderDelegate.enableSdch(z);
            return this;
        }

        public Builder setALogFuncAddr(long j) {
            this.mBuilderDelegate.setALogFuncAddr(j);
            return this;
        }

        public Builder setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
            this.mBuilderDelegate.setAppInfoProvider(tTAppInfoProvider);
            return this;
        }

        public Builder setAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
            this.mBuilderDelegate.setAppMonitorProvider(tTMonitorProvider);
            return this;
        }

        public Builder setBypassBOEJSON(String str) {
            this.mBuilderDelegate.setBypassBOEJSON(str);
            return this;
        }

        public Builder setCronetSoPath(String str) {
            this.mBuilderDelegate.setCronetSoPath(str);
            return this;
        }

        public Builder setEventListener(TTEventListener tTEventListener) {
            this.mBuilderDelegate.setEventListener(tTEventListener);
            return this;
        }

        public Builder setGetDomainDefaultJSON(String str) {
            this.mBuilderDelegate.setGetDomainDefaultJSON(str);
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setProxyConfig(String str) {
            this.mBuilderDelegate.setProxyConfig(str);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(Context context) {
            this.mBuilderDelegate = ImplLoader.load(context);
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract List<InetAddress> dnsLookup(String str) throws IOException;

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract com.ttnet.org.chromium.net1.UrlRequest.Builder newUrlRequestBuilder(String str, Callback callback, Executor executor);

    public abstract com.ttnet.org.chromium.net1.TTWebsocketConnection.Builder newWebsocketConnectionBuilder(TTWebsocketConnection.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public abstract void setAlogFuncAddr(long j);

    public abstract void setEnableURLDispatcher(boolean z);

    public abstract void setHostResolverRules(String str);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();
}
