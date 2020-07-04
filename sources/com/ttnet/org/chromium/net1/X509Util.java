package com.ttnet.org.chromium.net1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.util.Pair;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

@JNINamespace("net")
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sDisableNativeCodeForTest;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerImplementation sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;

    static final class TrustStorageListener extends BroadcastReceiver {
        private TrustStorageListener() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.security.STORAGE_CHANGED")) {
                try {
                    X509Util.reloadDefaultTrustManager();
                } catch (KeyStoreException | CertificateException unused) {
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
        }
    }

    static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        private final X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    interface X509TrustManagerImplementation {
        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException;
    }

    static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        private final X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    private static native void nativeNotifyKeyChainChanged();

    private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean z);

    private static void ensureInitialized() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void reloadTestTrustManager() throws KeyStoreException, NoSuchAlgorithmException {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException {
        /*
            ensureInitialized()
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            java.security.KeyStore r1 = sTestKeyStore     // Catch:{ IOException -> 0x0012 }
            r2 = 0
            r1.load(r2)     // Catch:{ IOException -> 0x0012 }
            reloadTestTrustManager()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0012
        L_0x0010:
            r1 = move-exception
            goto L_0x0014
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.X509Util.clearTestRootCertificates():void");
    }

    public static void reloadDefaultTrustManager() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        nativeNotifyKeyChainChanged();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|13|14|15|(3:18|(1:20)(1:21)|22)|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void ensureInitializedLocked() throws java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException {
        /*
            java.security.cert.CertificateFactory r0 = sCertificateFactory
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            sCertificateFactory = r0
        L_0x000c:
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r0 = sDefaultTrustManager
            r1 = 0
            if (r0 != 0) goto L_0x0017
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r1)
            sDefaultTrustManager = r0
        L_0x0017:
            boolean r0 = sLoadedSystemKeyStore
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ KeyStoreException -> 0x0046 }
            sSystemKeyStore = r0     // Catch:{ KeyStoreException -> 0x0046 }
            java.security.KeyStore r0 = sSystemKeyStore     // Catch:{ IOException -> 0x0028 }
            r0.load(r1)     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            java.io.File r0 = new java.io.File     // Catch:{ KeyStoreException -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ KeyStoreException -> 0x0046 }
            r2.<init>()     // Catch:{ KeyStoreException -> 0x0046 }
            java.lang.String r3 = "ANDROID_ROOT"
            java.lang.String r3 = java.lang.System.getenv(r3)     // Catch:{ KeyStoreException -> 0x0046 }
            r2.append(r3)     // Catch:{ KeyStoreException -> 0x0046 }
            java.lang.String r3 = "/etc/security/cacerts"
            r2.append(r3)     // Catch:{ KeyStoreException -> 0x0046 }
            java.lang.String r2 = r2.toString()     // Catch:{ KeyStoreException -> 0x0046 }
            r0.<init>(r2)     // Catch:{ KeyStoreException -> 0x0046 }
            sSystemCertificateDirectory = r0     // Catch:{ KeyStoreException -> 0x0046 }
        L_0x0046:
            boolean r0 = sDisableNativeCodeForTest
            r2 = 1
            if (r0 != 0) goto L_0x0055
            java.security.KeyStore r0 = sSystemKeyStore
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            nativeRecordCertVerifyCapabilitiesHistogram(r0)
        L_0x0055:
            sLoadedSystemKeyStore = r2
        L_0x0057:
            java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> r0 = sSystemTrustAnchorCache
            if (r0 != 0) goto L_0x0062
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            sSystemTrustAnchorCache = r0
        L_0x0062:
            java.security.KeyStore r0 = sTestKeyStore
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            sTestKeyStore = r0
            java.security.KeyStore r0 = sTestKeyStore     // Catch:{ IOException -> 0x0076 }
            r0.load(r1)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r0 = sTestTrustManager
            if (r0 != 0) goto L_0x0083
            java.security.KeyStore r0 = sTestKeyStore
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r0)
            sTestTrustManager = r0
        L_0x0083:
            boolean r0 = sDisableNativeCodeForTest
            if (r0 != 0) goto L_0x00a2
            com.ttnet.org.chromium.net1.X509Util$TrustStorageListener r0 = sTrustStorageListener
            if (r0 != 0) goto L_0x00a2
            com.ttnet.org.chromium.net1.X509Util$TrustStorageListener r0 = new com.ttnet.org.chromium.net1.X509Util$TrustStorageListener
            r0.<init>()
            sTrustStorageListener = r0
            android.content.Context r0 = com.ttnet.org.chromium.base1.ContextUtils.getApplicationContext()
            com.ttnet.org.chromium.net1.X509Util$TrustStorageListener r1 = sTrustStorageListener
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.security.STORAGE_CHANGED"
            r2.<init>(r3)
            r0.registerReceiver(r1, r2)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.X509Util.ensureInitializedLocked():void");
    }

    public static void setDisableNativeCodeForTest(boolean z) {
        sDisableNativeCodeForTest = z;
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            KeyStore keyStore = sTestKeyStore;
            StringBuilder sb = new StringBuilder("root_cert_");
            sb.append(Integer.toString(sTestKeyStore.size()));
            keyStore.setCertificateEntry(sb.toString(), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (i < length) {
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509TrustManager) {
                try {
                    if (VERSION.SDK_INT >= 17) {
                        return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                    }
                    return new X509TrustManagerIceCreamSandwich((X509TrustManager) trustManager);
                } catch (IllegalArgumentException unused) {
                    trustManager.getClass().getName();
                }
            } else {
                i++;
            }
        }
        return null;
    }

    private static String hashPrincipal(X500Principal x500Principal) throws NoSuchAlgorithmException {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            int i3 = 3 - i;
            cArr[i2] = HEX_DIGITS[(digest[i3] >> 4) & 15];
            cArr[i2 + 1] = HEX_DIGITS[digest[i3] & 15];
        }
        return new String(cArr);
    }

    static boolean verifyKeyUsage(X509Certificate x509Certificate) throws CertificateException {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1")) {
                    return true;
                }
                if (str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) throws NoSuchAlgorithmException, KeyStoreException {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(hashPrincipal);
            sb.append('.');
            sb.append(i);
            String sb2 = sb.toString();
            if (!new File(sSystemCertificateDirectory, sb2).exists()) {
                return false;
            }
            KeyStore keyStore = sSystemKeyStore;
            StringBuilder sb3 = new StringBuilder("system:");
            sb3.append(sb2);
            Certificate certificate = keyStore.getCertificate(sb3.toString());
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    certificate.getClass().getName();
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = sTestTrustManager.checkServerTrusted(r2, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0075, code lost:
        return new com.ttnet.org.chromium.net1.AndroidCertVerifyResult(-2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ttnet.org.chromium.net1.AndroidCertVerifyResult verifyServerCertificates(byte[][] r5, java.lang.String r6, java.lang.String r7) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException {
        /*
            if (r5 == 0) goto L_0x009a
            int r0 = r5.length
            if (r0 == 0) goto L_0x009a
            r0 = 0
            r1 = r5[r0]
            if (r1 == 0) goto L_0x009a
            r1 = -1
            ensureInitialized()     // Catch:{ CertificateException -> 0x0094 }
            int r2 = r5.length
            java.security.cert.X509Certificate[] r2 = new java.security.cert.X509Certificate[r2]
            r3 = 0
        L_0x0012:
            int r4 = r5.length     // Catch:{ CertificateException -> 0x008d }
            if (r3 >= r4) goto L_0x0020
            r4 = r5[r3]     // Catch:{ CertificateException -> 0x008d }
            java.security.cert.X509Certificate r4 = createCertificateFromBytes(r4)     // Catch:{ CertificateException -> 0x008d }
            r2[r3] = r4     // Catch:{ CertificateException -> 0x008d }
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0020:
            r5 = r2[r0]     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            r5.checkValidity()     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            r5 = r2[r0]     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            boolean r5 = verifyKeyUsage(r5)     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            if (r5 != 0) goto L_0x0034
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            r6 = -6
            r5.<init>(r6)     // Catch:{ CertificateExpiredException -> 0x0086, CertificateNotYetValidException -> 0x007f, CertificateException -> 0x0079 }
            return r5
        L_0x0034:
            java.lang.Object r5 = sLock
            monitor-enter(r5)
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r3 = sDefaultTrustManager     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0042
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult     // Catch:{ all -> 0x0076 }
            r6.<init>(r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r6
        L_0x0042:
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r1 = sDefaultTrustManager     // Catch:{ CertificateException -> 0x0049 }
            java.util.List r1 = r1.checkServerTrusted(r2, r6, r7)     // Catch:{ CertificateException -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            com.ttnet.org.chromium.net1.X509Util$X509TrustManagerImplementation r1 = sTestTrustManager     // Catch:{ CertificateException -> 0x006e }
            java.util.List r1 = r1.checkServerTrusted(r2, r6, r7)     // Catch:{ CertificateException -> 0x006e }
        L_0x004f:
            int r6 = r1.size()     // Catch:{ all -> 0x0076 }
            if (r6 <= 0) goto L_0x0066
            int r6 = r1.size()     // Catch:{ all -> 0x0076 }
            int r6 = r6 + -1
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x0076 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ all -> 0x0076 }
            boolean r6 = isKnownRoot(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r7 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult     // Catch:{ all -> 0x0076 }
            r7.<init>(r0, r6, r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r7
        L_0x006e:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult     // Catch:{ all -> 0x0076 }
            r7 = -2
            r6.<init>(r7)     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r6
        L_0x0076:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r6
        L_0x0079:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult
            r5.<init>(r1)
            return r5
        L_0x007f:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult
            r6 = -4
            r5.<init>(r6)
            return r5
        L_0x0086:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult
            r6 = -3
            r5.<init>(r6)
            return r5
        L_0x008d:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult
            r6 = -5
            r5.<init>(r6)
            return r5
        L_0x0094:
            com.ttnet.org.chromium.net1.AndroidCertVerifyResult r5 = new com.ttnet.org.chromium.net1.AndroidCertVerifyResult
            r5.<init>(r1)
            return r5
        L_0x009a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|="
            r7.<init>(r0)
            java.lang.String r5 = java.util.Arrays.deepToString(r5)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String):com.ttnet.org.chromium.net1.AndroidCertVerifyResult");
    }
}
