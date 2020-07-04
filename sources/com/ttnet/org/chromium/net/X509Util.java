package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.util.Pair;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
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
            boolean z = true;
            if (VERSION.SDK_INT < 26) {
                z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
            } else if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                z = false;
            }
            if (z) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.clearTestRootCertificates():void");
    }

    public static void reloadDefaultTrustManager() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        nativeNotifyKeyChainChanged();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|10|11|12|13|14|15) */
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
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r0 = sDefaultTrustManager
            r1 = 0
            if (r0 != 0) goto L_0x0017
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r1)
            sDefaultTrustManager = r0
        L_0x0017:
            boolean r0 = sLoadedSystemKeyStore
            if (r0 != 0) goto L_0x0049
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
            r0 = 1
            sLoadedSystemKeyStore = r0
        L_0x0049:
            java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> r0 = sSystemTrustAnchorCache
            if (r0 != 0) goto L_0x0054
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            sSystemTrustAnchorCache = r0
        L_0x0054:
            java.security.KeyStore r0 = sTestKeyStore
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            sTestKeyStore = r0
            java.security.KeyStore r0 = sTestKeyStore     // Catch:{ IOException -> 0x0068 }
            r0.load(r1)     // Catch:{ IOException -> 0x0068 }
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r0 = sTestTrustManager
            if (r0 != 0) goto L_0x0075
            java.security.KeyStore r0 = sTestKeyStore
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r0)
            sTestTrustManager = r0
        L_0x0075:
            com.ttnet.org.chromium.net.X509Util$TrustStorageListener r0 = sTrustStorageListener
            if (r0 != 0) goto L_0x00a9
            com.ttnet.org.chromium.net.X509Util$TrustStorageListener r0 = new com.ttnet.org.chromium.net.X509Util$TrustStorageListener
            r0.<init>()
            sTrustStorageListener = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x009b
            java.lang.String r1 = "android.security.action.KEYCHAIN_CHANGED"
            r0.addAction(r1)
            java.lang.String r1 = "android.security.action.KEY_ACCESS_CHANGED"
            r0.addAction(r1)
            java.lang.String r1 = "android.security.action.TRUST_STORE_CHANGED"
            r0.addAction(r1)
            goto L_0x00a0
        L_0x009b:
            java.lang.String r1 = "android.security.STORAGE_CHANGED"
            r0.addAction(r1)
        L_0x00a0:
            android.content.Context r1 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            com.ttnet.org.chromium.net.X509Util$TrustStorageListener r2 = sTrustStorageListener
            r1.registerReceiver(r2, r0)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.ensureInitializedLocked():void");
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

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = sTestTrustManager.checkServerTrusted(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        return new com.ttnet.org.chromium.net.AndroidCertVerifyResult(-2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ttnet.org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] r6, java.lang.String r7, java.lang.String r8) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException {
        /*
            if (r6 == 0) goto L_0x00b2
            int r0 = r6.length
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            r1 = r6[r0]
            if (r1 == 0) goto L_0x00b2
            r1 = -1
            ensureInitialized()     // Catch:{ CertificateException -> 0x00ac }
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r6[r0]     // Catch:{ CertificateException -> 0x00a5 }
            java.security.cert.X509Certificate r3 = createCertificateFromBytes(r3)     // Catch:{ CertificateException -> 0x00a5 }
            r2.add(r3)     // Catch:{ CertificateException -> 0x00a5 }
            r3 = 1
            r4 = 1
        L_0x001e:
            int r5 = r6.length
            if (r4 >= r5) goto L_0x002d
            r5 = r6[r4]     // Catch:{ CertificateException -> 0x002a }
            java.security.cert.X509Certificate r5 = createCertificateFromBytes(r5)     // Catch:{ CertificateException -> 0x002a }
            r2.add(r5)     // Catch:{ CertificateException -> 0x002a }
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002d:
            int r6 = r2.size()
            java.security.cert.X509Certificate[] r6 = new java.security.cert.X509Certificate[r6]
            java.lang.Object[] r6 = r2.toArray(r6)
            java.security.cert.X509Certificate[] r6 = (java.security.cert.X509Certificate[]) r6
            r2 = r6[r0]     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            r2.checkValidity()     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            r2 = r6[r0]     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            boolean r2 = verifyKeyUsage(r2)     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            if (r2 != 0) goto L_0x004d
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            r7 = -6
            r6.<init>(r7)     // Catch:{ CertificateExpiredException -> 0x009e, CertificateNotYetValidException -> 0x0097, CertificateException -> 0x0091 }
            return r6
        L_0x004d:
            java.lang.Object r2 = sLock
            monitor-enter(r2)
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r4 = sDefaultTrustManager     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x005b
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult     // Catch:{ all -> 0x008e }
            r6.<init>(r1)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return r6
        L_0x005b:
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r1 = sDefaultTrustManager     // Catch:{ CertificateException -> 0x0062 }
            java.util.List r1 = r1.checkServerTrusted(r6, r7, r8)     // Catch:{ CertificateException -> 0x0062 }
            goto L_0x0068
        L_0x0062:
            com.ttnet.org.chromium.net.X509Util$X509TrustManagerImplementation r1 = sTestTrustManager     // Catch:{ CertificateException -> 0x0086 }
            java.util.List r1 = r1.checkServerTrusted(r6, r7, r8)     // Catch:{ CertificateException -> 0x0086 }
        L_0x0068:
            int r6 = r1.size()     // Catch:{ all -> 0x008e }
            if (r6 <= 0) goto L_0x007e
            int r6 = r1.size()     // Catch:{ all -> 0x008e }
            int r6 = r6 - r3
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x008e }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ all -> 0x008e }
            boolean r6 = isKnownRoot(r6)     // Catch:{ all -> 0x008e }
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r7 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult     // Catch:{ all -> 0x008e }
            r7.<init>(r0, r6, r1)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return r7
        L_0x0086:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult     // Catch:{ all -> 0x008e }
            r7 = -2
            r6.<init>(r7)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return r6
        L_0x008e:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r6
        L_0x0091:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult
            r6.<init>(r1)
            return r6
        L_0x0097:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult
            r7 = -4
            r6.<init>(r7)
            return r6
        L_0x009e:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult
            r7 = -3
            r6.<init>(r7)
            return r6
        L_0x00a5:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult
            r7 = -5
            r6.<init>(r7)
            return r6
        L_0x00ac:
            com.ttnet.org.chromium.net.AndroidCertVerifyResult r6 = new com.ttnet.org.chromium.net.AndroidCertVerifyResult
            r6.<init>(r1)
            return r6
        L_0x00b2:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|="
            r8.<init>(r0)
            java.lang.String r6 = java.util.Arrays.deepToString(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String):com.ttnet.org.chromium.net.AndroidCertVerifyResult");
    }
}
