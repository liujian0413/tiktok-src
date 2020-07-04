package com.ttnet.org.chromium.net1.impl;

import android.content.Context;
import com.ttnet.org.chromium.net1.CronetEngine.Builder;
import com.ttnet.org.chromium.net1.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net1.ICronetEngineBuilder;
import com.ttnet.org.chromium.net1.TTAppInfoProvider;
import com.ttnet.org.chromium.net1.TTEventListener;
import com.ttnet.org.chromium.net1.TTMonitorProvider;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.LibraryLoader;
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

public class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");
    private static final String TAG = "CronetEngineBuilderImpl";
    private long mALogFuncAddr;
    private TTAppInfoProvider mAppInfoProvider;
    private TTMonitorProvider mAppMonitorProvider;
    private final Context mApplicationContext;
    private String mBoeJson;
    private boolean mBoeProxyEnabled = false;
    private String mCertVerifierData;
    private String mCronetSoPath;
    private String mDataReductionProxyFallbackProxy;
    private String mDataReductionProxyKey;
    private String mDataReductionProxyPrimaryProxy;
    private String mDataReductionProxySecureProxyCheckUrl;
    private boolean mDisableCache;
    private TTEventListener mEventListener;
    private String mExperimentalOptions;
    private String mGetDomainDefaultJSON;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private int mHttpCacheMode;
    private boolean mHttpDnsEnabled;
    private boolean mLegacyModeEnabled;
    private LibraryLoader mLibraryLoader;
    private long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private final List<Pkp> mPkps = new LinkedList();
    private String mProxyConfig;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private final List<QuicHint> mQuicHints = new LinkedList();
    private boolean mSdchEnabled;
    private String mStoragePath;
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

    private boolean legacyMode() {
        return this.mLegacyModeEnabled;
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
    public boolean cacheDisabled() {
        return this.mDisableCache;
    }

    /* access modifiers changed from: 0000 */
    public String certVerifierData() {
        return this.mCertVerifierData;
    }

    /* access modifiers changed from: 0000 */
    public String dataReductionProxyFallbackProxy() {
        return this.mDataReductionProxyFallbackProxy;
    }

    /* access modifiers changed from: 0000 */
    public String dataReductionProxyKey() {
        return this.mDataReductionProxyKey;
    }

    /* access modifiers changed from: 0000 */
    public String dataReductionProxyPrimaryProxy() {
        return this.mDataReductionProxyPrimaryProxy;
    }

    /* access modifiers changed from: 0000 */
    public String dataReductionProxySecureProxyCheckUrl() {
        return this.mDataReductionProxySecureProxyCheckUrl;
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
        return this.mLibraryLoader;
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

    /* access modifiers changed from: 0000 */
    public boolean sdchEnabled() {
        return this.mSdchEnabled;
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

    public ExperimentalCronetEngine build() {
        ClassLoader classLoader = getClass().getClassLoader();
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        ExperimentalCronetEngine experimentalCronetEngine = null;
        if (!legacyMode()) {
            experimentalCronetEngine = createNativeCronetEngine(classLoader);
        }
        if (experimentalCronetEngine == null) {
            experimentalCronetEngine = createJavaCronetEngine(classLoader);
        }
        if (experimentalCronetEngine != null) {
            this.mMockCertVerifier = 0;
        }
        return experimentalCronetEngine;
    }

    public CronetEngineBuilderImpl enableBoeProxy(boolean z) {
        this.mBoeProxyEnabled = z;
        return this;
    }

    public CronetEngineBuilderImpl enableDataReductionProxy(String str) {
        this.mDataReductionProxyKey = str;
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

    public CronetEngineBuilderImpl enableLegacyMode(boolean z) {
        this.mLegacyModeEnabled = z;
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

    public CronetEngineBuilderImpl enableSdch(boolean z) {
        this.mSdchEnabled = z;
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

    public CronetEngineBuilderImpl setCertVerifierData(String str) {
        this.mCertVerifierData = str;
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

    private ExperimentalCronetEngine createNativeCronetEngine(ClassLoader classLoader) {
        return createCronetEngine(classLoader, "com.ttnet.org.chromium.net1.impl.CronetUrlRequestContext", this);
    }

    private ExperimentalCronetEngine createJavaCronetEngine(ClassLoader classLoader) {
        return createCronetEngine(classLoader, "com.ttnet.org.chromium.net1.impl.JavaCronetEngine", getUserAgent());
    }

    public CronetEngineBuilderImpl setLibraryLoader(Builder.LibraryLoader libraryLoader) {
        this.mLibraryLoader = new LibraryLoader(libraryLoader);
        return this;
    }

    public CronetEngineBuilderImpl setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.mStoragePath = str;
            return this;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public CronetEngineBuilderImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
        enableLegacyMode(false);
        enableQuic(false);
        enableHttp2(true);
        enableSdch(false);
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

    private ExperimentalCronetEngine createCronetEngine(ClassLoader classLoader, String str, Object obj) {
        try {
            return (ExperimentalCronetEngine) classLoader.loadClass(str).asSubclass(ExperimentalCronetEngine.class).getConstructor(new Class[]{obj.getClass()}).newInstance(new Object[]{obj});
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Cannot instantiate: ");
            sb.append(str);
            throw new IllegalStateException(sb.toString(), e);
        }
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

    public CronetEngineBuilderImpl setDataReductionProxyOptions(String str, String str2, String str3) {
        if (str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            throw new IllegalArgumentException("Primary and fallback proxies and check url must be set");
        }
        this.mDataReductionProxyPrimaryProxy = str;
        this.mDataReductionProxyFallbackProxy = str2;
        this.mDataReductionProxySecureProxyCheckUrl = str3;
        return this;
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
