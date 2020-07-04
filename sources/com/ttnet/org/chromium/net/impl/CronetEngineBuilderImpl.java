package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine.Builder;
import com.ttnet.org.chromium.net.ICronetEngineBuilder;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.TTMonitorProvider;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.IDN;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");
    private static final String TAG = "CronetEngineBuilderImpl";
    private long mALogFuncAddr;
    private TTAppInfoProvider mAppInfoProvider;
    private TTMonitorProvider mAppMonitorProvider;
    private final Context mApplicationContext;
    private String mBoeJson;
    private boolean mBoeProxyEnabled;
    private boolean mBrotiEnabled;
    private String mCronetSoPath;
    private boolean mDisableCache;
    private TTEventListener mEventListener;
    private String mExperimentalOptions;
    private String mGetDomainDefaultJSON;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private int mHttpCacheMode;
    private boolean mHttpDnsEnabled;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private final List<Pkp> mPkps = new LinkedList();
    private String mProxyConfig;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private final List<QuicHint> mQuicHints = new LinkedList();
    private String mStoragePath;
    private int mThreadPriority = 20;
    private String mUserAgent;
    private boolean mVerboseLogEnabled;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpCacheSetting {
    }

    public static class Pkp {
        final Date mExpirationDate;
        final byte[][] mHashes;
        final String mHost;
        final boolean mIncludeSubdomains;

        Pkp(String str, byte[][] bArr, boolean z, Date date) {
            this.mHost = str;
            this.mHashes = bArr;
            this.mIncludeSubdomains = z;
            this.mExpirationDate = date;
        }
    }

    public static class QuicHint {
        final int mAlternatePort;
        final String mHost;
        final int mPort;

        QuicHint(String str, int i, int i2) {
            this.mHost = str;
            this.mPort = i;
            this.mAlternatePort = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public long aLogFuncAddr() {
        return this.mALogFuncAddr;
    }

    /* access modifiers changed from: 0000 */
    public boolean boeProxyEnabled() {
        return this.mBoeProxyEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean cacheDisabled() {
        return this.mDisableCache;
    }

    public CronetEngineBuilderImpl enableSdch(boolean z) {
        return this;
    }

    public CronetEngineBuilderImpl enableVerboseLog() {
        this.mVerboseLogEnabled = true;
        return this;
    }

    public String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    /* access modifiers changed from: 0000 */
    public TTAppInfoProvider getAppInfoProvider() {
        return this.mAppInfoProvider;
    }

    /* access modifiers changed from: 0000 */
    public TTMonitorProvider getAppMonitorProvider() {
        return this.mAppMonitorProvider;
    }

    /* access modifiers changed from: 0000 */
    public String getBypassBOEJSON() {
        return this.mBoeJson;
    }

    /* access modifiers changed from: 0000 */
    public Context getContext() {
        return this.mApplicationContext;
    }

    public String getCronetSoPath() {
        return this.mCronetSoPath;
    }

    /* access modifiers changed from: 0000 */
    public TTEventListener getEventListener() {
        return this.mEventListener;
    }

    /* access modifiers changed from: 0000 */
    public String getGetDomainDefaultJSON() {
        return this.mGetDomainDefaultJSON;
    }

    /* access modifiers changed from: 0000 */
    public String getProxyConfig() {
        return this.mProxyConfig;
    }

    /* access modifiers changed from: 0000 */
    public String getUserAgent() {
        return this.mUserAgent;
    }

    /* access modifiers changed from: 0000 */
    public boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    /* access modifiers changed from: 0000 */
    public long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    /* access modifiers changed from: 0000 */
    public int httpCacheMode() {
        return this.mHttpCacheMode;
    }

    /* access modifiers changed from: 0000 */
    public boolean httpDnsEnabled() {
        return this.mHttpDnsEnabled;
    }

    /* access modifiers changed from: 0000 */
    public LibraryLoader libraryLoader() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    /* access modifiers changed from: 0000 */
    public boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    /* access modifiers changed from: 0000 */
    public List<Pkp> publicKeyPins() {
        return this.mPkps;
    }

    /* access modifiers changed from: 0000 */
    public boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    /* access modifiers changed from: 0000 */
    public List<QuicHint> quicHints() {
        return this.mQuicHints;
    }

    public CronetEngineBuilderImpl setLibraryLoader(Builder.LibraryLoader libraryLoader) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public String storagePath() {
        return this.mStoragePath;
    }

    /* access modifiers changed from: 0000 */
    public boolean verboseLogEnabled() {
        return this.mVerboseLogEnabled;
    }

    public String getDefaultUserAgent() {
        return UserAgent.from(this.mApplicationContext);
    }

    /* access modifiers changed from: 0000 */
    public String getDefaultQuicUserAgentId() {
        if (this.mQuicEnabled) {
            return UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext);
        }
        return "";
    }

    public CronetEngineBuilderImpl enableBoeProxy(boolean z) {
        this.mBoeProxyEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableBrotli(boolean z) {
        this.mBrotiEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableHttp2(boolean z) {
        this.mHttp2Enabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableHttpDns(boolean z) {
        this.mHttpDnsEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean z) {
        this.mNetworkQualityEstimatorEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableQuic(boolean z) {
        this.mQuicEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl setALogFuncAddr(long j) {
        this.mALogFuncAddr = j;
        return this;
    }

    public CronetEngineBuilderImpl setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
        this.mAppInfoProvider = tTAppInfoProvider;
        return this;
    }

    public CronetEngineBuilderImpl setAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
        this.mAppMonitorProvider = tTMonitorProvider;
        return this;
    }

    public CronetEngineBuilderImpl setBypassBOEJSON(String str) {
        this.mBoeJson = str;
        return this;
    }

    public ICronetEngineBuilder setCronetSoPath(String str) {
        this.mCronetSoPath = str;
        return this;
    }

    public CronetEngineBuilderImpl setEventListener(TTEventListener tTEventListener) {
        this.mEventListener = tTEventListener;
        return this;
    }

    public CronetEngineBuilderImpl setExperimentalOptions(String str) {
        this.mExperimentalOptions = str;
        return this;
    }

    public CronetEngineBuilderImpl setGetDomainDefaultJSON(String str) {
        this.mGetDomainDefaultJSON = str;
        return this;
    }

    public CronetEngineBuilderImpl setMockCertVerifierForTesting(long j) {
        this.mMockCertVerifier = j;
        return this;
    }

    public CronetEngineBuilderImpl setProxyConfig(String str) {
        this.mProxyConfig = str;
        return this;
    }

    public CronetEngineBuilderImpl setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public int threadPriority(int i) {
        if (this.mThreadPriority == 20) {
            return i;
        }
        return this.mThreadPriority;
    }

    public CronetEngineBuilderImpl setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.mStoragePath = str;
            return this;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public CronetEngineBuilderImpl setThreadPriority(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.mThreadPriority = i;
        return this;
    }

    public CronetEngineBuilderImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
        enableQuic(false);
        enableHttp2(true);
        enableBrotli(false);
        enableHttpCache(0, 0);
        enableNetworkQualityEstimator(false);
        enablePublicKeyPinningBypassForLocalTrustAnchors(true);
        enableHttpDns(false);
    }

    private static String validateHostNameForPinningAndConvert(String str) throws IllegalArgumentException {
        if (INVALID_PKP_HOST_NAME.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("Hostname ");
            sb.append(str);
            sb.append(" is illegal. A hostname should not consist of digits and/or dots only.");
            throw new IllegalArgumentException(sb.toString());
        } else if (str.length() <= 255) {
            try {
                return IDN.toASCII(str, 2);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder("Hostname ");
                sb2.append(str);
                sb2.append(" is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Hostname ");
            sb3.append(str);
            sb3.append(" is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public CronetEngineBuilderImpl enableHttpCache(int i, long j) {
        boolean z;
        if (i == 3 || i == 2) {
            if (storagePath() == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (storagePath() != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i == 0 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.mDisableCache = z;
        this.mHttpCacheMaxSize = j;
        switch (i) {
            case 0:
                this.mHttpCacheMode = 0;
                break;
            case 1:
                this.mHttpCacheMode = 2;
                break;
            case 2:
            case 3:
                this.mHttpCacheMode = 1;
                break;
            default:
                throw new IllegalArgumentException("Unknown cache mode");
        }
        return this;
    }

    public CronetEngineBuilderImpl addQuicHint(String str, int i, int i2) {
        if (!str.contains("/")) {
            this.mQuicHints.add(new QuicHint(str, i, i2));
            return this;
        }
        StringBuilder sb = new StringBuilder("Illegal QUIC Hint Host: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public CronetEngineBuilderImpl addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        } else if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        } else if (date != null) {
            String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(str);
            HashSet hashSet = new HashSet(set.size());
            for (byte[] bArr : set) {
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                hashSet.add(bArr);
            }
            this.mPkps.add(new Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashSet.toArray(new byte[hashSet.size()][]), z, date));
            return this;
        } else {
            throw new NullPointerException("The pin expiration date cannot be null");
        }
    }
}
