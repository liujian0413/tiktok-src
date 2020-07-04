package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {

    /* renamed from: ˊ */
    private int f6680;

    /* renamed from: ˋ */
    private KeyStore f6681;

    /* renamed from: ˎ */
    private String f6682;

    /* renamed from: ˏ */
    private Context f6683;

    /* renamed from: ॱ */
    private final Object f6684 = new Object();

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final int mo7386() {
        int i;
        synchronized (this.f6684) {
            i = this.f6680;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final String mo7388() {
        String str;
        synchronized (this.f6684) {
            str = this.f6682;
        }
        return str;
    }

    /* renamed from: ˏ */
    private String m8640() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f6684) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.f6682);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.f6680);
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final void mo7387() {
        String r0 = m8640();
        synchronized (this.f6684) {
            this.f6680++;
            AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(r0)));
            try {
                synchronized (this.f6684) {
                    this.f6681.deleteEntry(r0);
                }
            } catch (KeyStoreException e) {
                StringBuilder sb = new StringBuilder("Exception ");
                sb.append(e.getMessage());
                sb.append(" occurred");
                AFLogger.afErrorLog(sb.toString(), e);
            }
        }
        m8639(m8640());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1.length != 3) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r3.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r1.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r7.f6682 = r3[1].trim();
        r7.f6680 = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r1 = th;
     */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7385() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6684
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.f6681     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x008e
            java.security.KeyStore r1 = r7.f6681     // Catch:{ Throwable -> 0x0072 }
            java.util.Enumeration r1 = r1.aliases()     // Catch:{ Throwable -> 0x0072 }
        L_0x000f:
            boolean r4 = r1.hasMoreElements()     // Catch:{ Throwable -> 0x0072 }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r1.nextElement()     // Catch:{ Throwable -> 0x0072 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0072 }
            if (r4 == 0) goto L_0x000f
            java.lang.String r5 = "com.appsflyer"
            boolean r5 = r4.startsWith(r5)     // Catch:{ Throwable -> 0x0072 }
            if (r5 == 0) goto L_0x000f
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ Throwable -> 0x0072 }
            int r5 = r1.length     // Catch:{ Throwable -> 0x0072 }
            r6 = 3
            if (r5 != r6) goto L_0x008e
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0072 }
            java.lang.String r4 = r5.concat(r4)     // Catch:{ Throwable -> 0x0072 }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ Throwable -> 0x0072 }
            r3 = r1[r2]     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Throwable -> 0x0070 }
            r4 = 2
            r1 = r1[r4]     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ Throwable -> 0x0070 }
            int r5 = r3.length     // Catch:{ Throwable -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            int r5 = r1.length     // Catch:{ Throwable -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            r3 = r3[r2]     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ Throwable -> 0x0070 }
            r7.f6682 = r3     // Catch:{ Throwable -> 0x0070 }
            r1 = r1[r2]     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x0070 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x0070 }
            r7.f6680 = r1     // Catch:{ Throwable -> 0x0070 }
            goto L_0x008f
        L_0x0070:
            r1 = move-exception
            goto L_0x0074
        L_0x0072:
            r1 = move-exception
            r2 = 0
        L_0x0074:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch:{ all -> 0x0091 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0091 }
            r3.append(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0091 }
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.mo7385():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo7384(String str) {
        this.f6682 = str;
        this.f6680 = 0;
        m8639(m8640());
    }

    public AFKeystoreWrapper(Context context) {
        this.f6683 = context;
        this.f6682 = "";
        this.f6680 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            this.f6681 = KeyStore.getInstance("AndroidKeyStore");
            this.f6681.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* renamed from: ˋ */
    private void m8639(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f6684) {
                if (!this.f6681.containsAlias(str)) {
                    if (VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f6683).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
