package com.p280ss.ttm.net;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttm.net.AVResolver */
public class AVResolver {
    public static int HOST_MAX_CACHE_TIME = 600000;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public String mError;
    private HostInfo mHostInfo;
    private String mHostName;
    public String[] mIPStr;
    public boolean mRet;
    private Thread mThread;

    /* renamed from: com.ss.ttm.net.AVResolver$HostInfo */
    static class HostInfo {

        /* renamed from: ip */
        public String f117545ip;
        public long time;

        HostInfo() {
        }
    }

    /* renamed from: com.ss.ttm.net.AVResolver$ParserHost */
    static class ParserHost implements Runnable {
        String mHostName;
        AVResolver mResolver;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                java.lang.String r1 = r4.mHostName     // Catch:{ Throwable -> 0x000f }
                java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ Throwable -> 0x000f }
                java.lang.String r2 = r1.getHostAddress()     // Catch:{ Throwable -> 0x000d }
                r0 = r2
                goto L_0x0019
            L_0x000d:
                r2 = move-exception
                goto L_0x0011
            L_0x000f:
                r2 = move-exception
                r1 = r0
            L_0x0011:
                com.ss.ttm.net.AVResolver r3 = r4.mResolver
                java.lang.String r2 = r2.getMessage()
                r3.mError = r2
            L_0x0019:
                com.ss.ttm.net.AVResolver r2 = r4.mResolver
                r3 = 1
                r2.mRet = r3
                if (r1 == 0) goto L_0x0049
                if (r0 != 0) goto L_0x0023
                goto L_0x0049
            L_0x0023:
                com.ss.ttm.net.AVResolver r1 = r4.mResolver
                java.lang.String[] r2 = new java.lang.String[r3]
                r1.mIPStr = r2
                com.ss.ttm.net.AVResolver r1 = r4.mResolver
                java.lang.String[] r1 = r1.mIPStr
                r2 = 0
                r1[r2] = r0
                com.ss.ttm.net.AVResolver$HostInfo r1 = new com.ss.ttm.net.AVResolver$HostInfo
                r1.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
                r1.f117545ip = r0
                java.lang.String r0 = r4.mHostName
                com.p280ss.ttm.net.AVResolver.putHostInfo(r0, r1)
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
                return
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.net.AVResolver.ParserHost.run():void");
        }

        public ParserHost(AVResolver aVResolver, String str) {
            this.mResolver = aVResolver;
            this.mHostName = str;
        }
    }

    public void freeAddress() {
        if (this.mThread != null) {
            try {
                this.mThread.interrupt();
            } catch (Exception unused) {
            }
        }
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        if (this.mIPStr == null || this.mIPStr[0] == null) {
            return -1;
        }
        return 1;
    }

    public String getAddress() {
        if (this.mRet && this.mIPStr != null && this.mIPStr[0] != null) {
            return this.mIPStr[0];
        }
        StringBuilder sb = new StringBuilder("parser host name: ");
        sb.append(this.mHostName);
        sb.append(" error.err msg:");
        sb.append(this.mError);
        return sb.toString();
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            return true;
        }
        return false;
    }

    public void getAddressInfo(String str) {
        this.mHostName = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.mRet = true;
        } else if (isIP(this.mHostName)) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = this.mHostName;
            this.mRet = true;
        } else {
            this.mHostInfo = (HostInfo) mCacheHosts.get(str);
            if (this.mHostInfo != null) {
                if (this.mHostInfo.f117545ip == null || System.currentTimeMillis() - this.mHostInfo.time >= ((long) HOST_MAX_CACHE_TIME)) {
                    mCacheHosts.remove(str);
                    this.mHostInfo = null;
                } else {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.f117545ip;
                    this.mRet = true;
                    return;
                }
            }
            try {
                this.mThread = new Thread(new ParserHost(this, this.mHostName));
                this.mThread.start();
            } catch (Exception e) {
                this.mRet = true;
                this.mError = e.getMessage();
            }
        }
    }

    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        HostInfo hostInfo2;
        synchronized (AVResolver.class) {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = null;
            if (mCacheHosts.size() > 128) {
                Iterator it = mCacheHosts.entrySet().iterator();
                long j = currentTimeMillis;
                hostInfo2 = null;
                while (it.hasNext()) {
                    HostInfo hostInfo3 = (HostInfo) ((Entry) it.next()).getValue();
                    str2 = (String) ((Entry) it.next()).getKey();
                    if (hostInfo3 != null && hostInfo3.time < j) {
                        j = hostInfo3.time;
                        hostInfo2 = hostInfo3;
                    }
                }
            } else {
                hostInfo2 = null;
            }
            if (!(hostInfo2 == null || str2 == null)) {
                mCacheHosts.remove(str2);
            }
            mCacheHosts.put(str, hostInfo);
        }
    }
}
