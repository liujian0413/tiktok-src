package com.p280ss.mediakit.net;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.mediakit.medialoader.AVMDLLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.net.AVMDLDNSParserBridge */
public class AVMDLDNSParserBridge implements AVMDLDNSParserListener {
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    private static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    /* access modifiers changed from: 0000 */
    public boolean isFinish() {
        return this.isFinish;
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder sb = new StringBuilder("****get result:");
            sb.append(str);
            AVMDLLog.m143965d("AVMDLDNSParserBridge", sb.toString());
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("----start release:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("remove host:%s", new Object[]{this.host}));
            AVMDLDNSParser.getInstance().removeHost(this.host, this);
            AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str) {
        boolean z;
        int i;
        String str2 = str;
        StringBuilder sb = new StringBuilder("----start parse host:");
        sb.append(str2);
        AVMDLLog.m143965d("AVMDLDNSParserBridge", sb.toString());
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder("****end parse fail for host:");
            sb2.append(str2);
            AVMDLLog.m143965d("AVMDLDNSParserBridge", sb2.toString());
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        AVMDLDNSParserBridge aVMDLDNSParserBridge = null;
        try {
            this.host = str2;
            AVMDLDNSInfo aVMDLDNSInfo = IPCache.getInstance().get(str2);
            if (aVMDLDNSInfo != null) {
                this.ipList = aVMDLDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(aVMDLDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (aVMDLDNSInfo.mExpiredTime <= currentTimeMillis) {
                    AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("cache has expired need try call but not need listener", new Object[0]));
                    z = true;
                } else {
                    z = false;
                }
                if (this.handle != 0) {
                    _notifyParserResult(this.handle, str, this.ipList, aVMDLDNSInfo.mExpiredTime, null);
                }
                i = 1;
            } else {
                AVMDLLog.m143965d("AVMDLDNSParserBridge", "not get result from cache, need this listener");
                aVMDLDNSParserBridge = this;
                i = 0;
                z = true;
            }
            if (z) {
                AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("call add host to parser listener:%s", new Object[]{aVMDLDNSParserBridge}));
                AVMDLDNSParser.getInstance().addHost(str2, aVMDLDNSParserBridge);
            } else {
                AVMDLLog.m143965d("AVMDLDNSParserBridge", "not need call add host to parser");
            }
            AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("****call start end, listener:%s", new Object[]{aVMDLDNSParserBridge}));
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public void onCompletion(int i, String str, String str2, long j, String str3) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                if (this.handle != 0) {
                    _notifyParserResult(this.handle, str, str2, j, str3);
                }
            } else {
                AVMDLLog.m143965d("AVMDLDNSParserBridge", C1642a.m8034a("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
        } finally {
            this.lock.unlock();
        }
    }
}
