package com.ttnet.org.chromium.net.impl;

import com.C1642a;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import com.ttnet.org.chromium.net.UrlResponseInfo.HeaderBlock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public final class UrlResponseInfoImpl extends UrlResponseInfo {
    private final HeaderBlockImpl mHeaders;
    private final int mHttpStatusCode;
    private final String mHttpStatusText;
    private final String mNegotiatedProtocol;
    private final String mProxyServer;
    private final AtomicLong mReceivedByteCount;
    private final List<String> mResponseInfoUrlChain;
    private final boolean mWasCached;

    public static final class HeaderBlockImpl extends HeaderBlock {
        private final List<Entry<String, String>> mAllHeadersList;
        private Map<String, List<String>> mHeadersMap;

        public final List<Entry<String, String>> getAsList() {
            return this.mAllHeadersList;
        }

        public final Map<String, List<String>> getAsMap() {
            if (this.mHeadersMap != null) {
                return this.mHeadersMap;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Entry entry : this.mAllHeadersList) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add((String) entry.getValue());
                treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            this.mHeadersMap = Collections.unmodifiableMap(treeMap);
            return this.mHeadersMap;
        }

        HeaderBlockImpl(List<Entry<String, String>> list) {
            this.mAllHeadersList = list;
        }
    }

    public final int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    public final String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    public final String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    public final String getProxyServer() {
        return this.mProxyServer;
    }

    public final List<String> getUrlChain() {
        return this.mResponseInfoUrlChain;
    }

    public final boolean wasCached() {
        return this.mWasCached;
    }

    public final Map<String, List<String>> getAllHeaders() {
        return this.mHeaders.getAsMap();
    }

    public final List<Entry<String, String>> getAllHeadersAsList() {
        return this.mHeaders.getAsList();
    }

    public final long getReceivedByteCount() {
        return this.mReceivedByteCount.get();
    }

    public final String getUrl() {
        return (String) this.mResponseInfoUrlChain.get(this.mResponseInfoUrlChain.size() - 1);
    }

    public final String toString() {
        return C1642a.m8035a(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), getUrl(), getUrlChain().toString(), Integer.valueOf(getHttpStatusCode()), getHttpStatusText(), getAllHeadersAsList().toString(), Boolean.valueOf(wasCached()), getNegotiatedProtocol(), getProxyServer(), Long.valueOf(getReceivedByteCount())});
    }

    public final void setReceivedByteCount(long j) {
        this.mReceivedByteCount.set(j);
    }

    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Entry<String, String>> list2, boolean z, String str2, String str3) {
        this(list, i, str, list2, z, str2, str3, 0);
    }

    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.mResponseInfoUrlChain = Collections.unmodifiableList(list);
        this.mHttpStatusCode = i;
        this.mHttpStatusText = str;
        this.mHeaders = new HeaderBlockImpl(Collections.unmodifiableList(list2));
        this.mWasCached = z;
        this.mNegotiatedProtocol = str2;
        this.mProxyServer = str3;
        this.mReceivedByteCount = new AtomicLong(j);
    }
}
