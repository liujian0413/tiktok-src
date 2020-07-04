package com.p280ss.ttuploader;

import com.C1642a;
import com.p280ss.ttuploader.net.IPCache;
import com.p280ss.ttuploader.net.TTUploadDNSInfo;
import com.p280ss.ttuploader.net.TTUploadDNSParser;
import com.p280ss.ttuploader.net.TTUploadDNSParserListener;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttuploader.TTUploadResolver */
public class TTUploadResolver implements TTUploadDNSParserListener {
    public static int HOST_MAX_CACHE_TIME = 60000;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static volatile int mDNSVersion = 1;
    public static volatile int mIsUseTTnetDNS;
    public String mError;
    private HostInfo mHostInfo;
    private volatile String mHostName;
    public volatile String[] mIPStr;
    public volatile boolean mRet;
    private Thread mThread;
    private int mUseDNSType = mDNSVersion;

    /* renamed from: com.ss.ttuploader.TTUploadResolver$HostInfo */
    static class HostInfo {

        /* renamed from: ip */
        public String f117550ip;
        public long time;

        HostInfo() {
        }
    }

    /* renamed from: com.ss.ttuploader.TTUploadResolver$ParserHost */
    static class ParserHost implements Runnable {
        String mHostName;
        TTUploadResolver mResolver;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[SYNTHETIC, Splitter:B:12:0x0021] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                int r0 = com.p280ss.ttuploader.TTUploadResolver.mIsUseTTnetDNS
                r1 = 1
                r2 = 0
                r3 = 0
                if (r0 != r1) goto L_0x001e
                java.lang.String r0 = r5.mHostName     // Catch:{ Throwable -> 0x001e }
                java.util.List r0 = com.bytedance.ttnet.C12961d.m37773a(r0)     // Catch:{ Throwable -> 0x001e }
                if (r0 == 0) goto L_0x001e
                java.lang.Object r4 = r0.get(r2)     // Catch:{ Throwable -> 0x001e }
                if (r4 == 0) goto L_0x001e
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x001e }
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Throwable -> 0x001e }
                r3 = r0
                r0 = 1
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                if (r0 != 0) goto L_0x0031
                java.lang.String r0 = r5.mHostName     // Catch:{ UnknownHostException -> 0x0028 }
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x0028 }
                goto L_0x0032
            L_0x0028:
                r0 = move-exception
                com.ss.ttuploader.TTUploadResolver r4 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                r4.mError = r0
            L_0x0031:
                r0 = r3
            L_0x0032:
                if (r0 == 0) goto L_0x005c
                java.lang.String r0 = r0.getHostAddress()
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                java.lang.String[] r4 = new java.lang.String[r1]
                r3.mIPStr = r4
                com.ss.ttuploader.TTUploadResolver r3 = r5.mResolver
                java.lang.String[] r3 = r3.mIPStr
                r3[r2] = r0
                com.ss.ttuploader.TTUploadResolver$HostInfo r2 = new com.ss.ttuploader.TTUploadResolver$HostInfo
                r2.<init>()
                long r3 = java.lang.System.currentTimeMillis()
                r2.time = r3
                r2.f117550ip = r0
                java.lang.String r0 = r5.mHostName
                com.p280ss.ttuploader.TTUploadResolver.putHostInfo(r0, r2)
                long r3 = java.lang.System.currentTimeMillis()
                r2.time = r3
            L_0x005c:
                com.ss.ttuploader.TTUploadResolver r0 = r5.mResolver
                r0.mRet = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttuploader.TTUploadResolver.ParserHost.run():void");
        }

        public ParserHost(TTUploadResolver tTUploadResolver, String str) {
            this.mResolver = tTUploadResolver;
            this.mHostName = str;
        }
    }

    public void freeAddress() {
        if (this.mUseDNSType == 1 && this.mThread != null) {
            try {
                this.mThread.interrupt();
            } catch (Exception unused) {
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                TTUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception unused2) {
            }
        }
    }

    public String getAddress() {
        if (!this.mRet || this.mIPStr == null || this.mIPStr[0] == null) {
            return null;
        }
        return this.mIPStr[0];
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

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public void getAddressInfo(String str) {
        switch (this.mUseDNSType) {
            case 1:
                getAddressInfoVersion_1(str);
                return;
            case 2:
                getAddressInfoVersion_2(str);
                return;
            default:
                getAddressInfoVersion_1(str);
                return;
        }
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

    private void getAddressInfoVersion_1(String str) {
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
                if (this.mHostInfo.f117550ip == null || System.currentTimeMillis() - this.mHostInfo.time >= ((long) HOST_MAX_CACHE_TIME)) {
                    mCacheHosts.remove(str);
                    this.mHostInfo = null;
                } else {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.f117550ip;
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

    private void getAddressInfoVersion_2(String str) {
        TTUploadLog.m144200d("TTUploadResolver", "----add host to parser");
        this.mHostName = str;
        TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
        if (!(tTUploadDNSInfo == null || tTUploadDNSInfo.mIpList == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            TTUploadLog.m144200d("TTUploadResolver", C1642a.m8034a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
            if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                TTUploadLog.m144200d("TTUploadResolver", C1642a.m8034a("has expired try call parse:", new Object[0]));
                TTUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] split = tTUploadDNSInfo.mIpList.split(",");
            if (split != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
                this.mRet = true;
                TTUploadLog.m144200d("TTUploadResolver", C1642a.m8034a("get result from cache suc, ip:%s ", new Object[]{split[0]}));
            }
        }
        if (!this.mRet) {
            TTUploadLog.m144200d("TTUploadResolver", "****add host to parser");
            TTUploadDNSParser.getInstance().addHost(str, this);
        }
    }

    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        HostInfo hostInfo2;
        synchronized (TTUploadResolver.class) {
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

    public static void setDNSType(int i, int i2, int i3, int i4, int i5) {
        if (i == 1 || i == 2) {
            TTUploadDNSParser.setIntValue(0, i2);
            TTUploadDNSParser.setIntValue(1, i3);
            TTUploadDNSParser.setIntValue(3, i4);
            TTUploadDNSParser.setIntValue(2, i5);
            mDNSVersion = i;
        }
    }

    public void onCompletion(int i, String str, String str2, long j, String str3) {
        TTUploadLog.m144200d("TTUploadResolver", C1642a.m8034a("notify result host:%s iplist:%s ", new Object[]{str, str2}));
        if (!this.mRet) {
            if (!(str2 == null || str == null || !str.equals(this.mHostName))) {
                String[] split = str2.split(",");
                if (split != null && split.length > 0) {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = split[0];
                }
            }
            this.mRet = true;
        }
    }
}
