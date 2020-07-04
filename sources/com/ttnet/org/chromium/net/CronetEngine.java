package com.ttnet.org.chromium.net;

import android.content.Context;
import com.ttnet.org.chromium.net.UrlRequest.Callback;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class CronetEngine {
    public static final String TAG = "CronetEngine";

    public static class Builder {
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder enableSdch(boolean z) {
            return this;
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

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder enableBoeProxy(boolean z) {
            this.mBuilderDelegate.enableBoeProxy(z);
            return this;
        }

        public Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
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

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            return ((CronetProvider) getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0)).createBuilder().mBuilderDelegate;
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.size() != 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((CronetProvider) it.next()).isEnabled()) {
                        it.remove();
                    }
                }
                if (list.size() != 0) {
                    Collections.sort(list, new Comparator<CronetProvider>() {
                        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                            if ("Fallback-Cronet-Provider".equals(cronetProvider.getName())) {
                                return 1;
                            }
                            if ("Fallback-Cronet-Provider".equals(cronetProvider2.getName())) {
                                return -1;
                            }
                            return -Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                        }
                    });
                    return list;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }

        static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i = 0;
            while (i < split.length && i < split2.length) {
                try {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert version segments into integers: ");
                    sb.append(split[i]);
                    sb.append(" & ");
                    sb.append(split2[i]);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
            return Integer.signum(split.length - split2.length);
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

    public abstract com.ttnet.org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(String str, Callback callback, Executor executor);

    public abstract com.ttnet.org.chromium.net.TTWebsocketConnection.Builder newWebsocketConnectionBuilder(TTWebsocketConnection.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public abstract void setAlogFuncAddr(long j);

    public abstract void setEnableURLDispatcher(boolean z);

    public abstract void setHostResolverRules(String str);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();
}
