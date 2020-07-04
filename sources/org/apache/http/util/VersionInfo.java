package org.apache.http.util;

import java.util.Map;

public class VersionInfo {
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    public final String getRelease() {
        return this.infoRelease;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.infoPackage);
        stringBuffer.append(':');
        stringBuffer.append(this.infoModule);
        if (!"UNAVAILABLE".equals(this.infoRelease)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoRelease);
        }
        if (!"UNAVAILABLE".equals(this.infoTimestamp)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoTimestamp);
        }
        stringBuffer.append(')');
        if (!"UNAVAILABLE".equals(this.infoClassloader)) {
            stringBuffer.append('@');
            stringBuffer.append(this.infoClassloader);
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            if (r4 == 0) goto L_0x0047
            if (r5 != 0) goto L_0x000c
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L_0x000c:
            r0 = 0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x003f }
            r1.<init>()     // Catch:{ IOException -> 0x003f }
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch:{ IOException -> 0x003f }
            r1.append(r2)     // Catch:{ IOException -> 0x003f }
            java.lang.String r2 = "/version.properties"
            r1.append(r2)     // Catch:{ IOException -> 0x003f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x003f }
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch:{ IOException -> 0x003f }
            if (r1 == 0) goto L_0x003f
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x003a }
            r2.<init>()     // Catch:{ all -> 0x003a }
            r2.load(r1)     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0040
        L_0x0038:
            goto L_0x0040
        L_0x003a:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x003f }
            throw r2     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r2 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0046
            org.apache.http.util.VersionInfo r0 = fromMap(r4, r2, r5)
        L_0x0046:
            return r0
        L_0x0047:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Package identifier must not be null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.loadVersionInfo(java.lang.String, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }

    protected static final VersionInfo fromMap(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            String str5 = null;
            if (map != null) {
                String str6 = (String) map.get("info.module");
                if (str6 != null && str6.length() <= 0) {
                    str6 = null;
                }
                String str7 = (String) map.get("info.release");
                if (str7 != null && (str7.length() <= 0 || str7.equals("${pom.version}"))) {
                    str7 = null;
                }
                String str8 = (String) map.get("info.timestamp");
                if (str8 == null || (str8.length() > 0 && !str8.equals("${mvn.timestamp}"))) {
                    str2 = str8;
                } else {
                    str2 = null;
                }
                str4 = str6;
                str3 = str7;
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (classLoader != null) {
                str5 = classLoader.toString();
            }
            VersionInfo versionInfo = new VersionInfo(str, str4, str3, str2, str5);
            return versionInfo;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    protected VersionInfo(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.infoPackage = str;
            if (str2 == null) {
                str2 = "UNAVAILABLE";
            }
            this.infoModule = str2;
            if (str3 == null) {
                str3 = "UNAVAILABLE";
            }
            this.infoRelease = str3;
            if (str4 == null) {
                str4 = "UNAVAILABLE";
            }
            this.infoTimestamp = str4;
            if (str5 == null) {
                str5 = "UNAVAILABLE";
            }
            this.infoClassloader = str5;
            return;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }
}
