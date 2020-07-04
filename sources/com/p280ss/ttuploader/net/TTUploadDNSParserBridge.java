package com.p280ss.ttuploader.net;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttuploader.TTUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSParserBridge */
public class TTUploadDNSParserBridge implements TTUploadDNSParserListener {
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

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0;
            TTUploadDNSParser.getInstance().removeHost(this.host, this);
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder sb = new StringBuilder("****get result:");
            sb.append(str);
            TTUploadLog.m144200d("TTUploadDNSParserBridge", sb.toString());
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str) {
        StringBuilder sb = new StringBuilder("----start parse host:");
        sb.append(str);
        TTUploadLog.m144200d("TTUploadDNSParserBridge", sb.toString());
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder("****end parse fail for host:");
            sb2.append(str);
            TTUploadLog.m144200d("TTUploadDNSParserBridge", sb2.toString());
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 1;
            if (tTUploadDNSInfo != null) {
                this.ipList = tTUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                TTUploadLog.m144200d("TTUploadDNSParserBridge", C1642a.m8034a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    TTUploadLog.m144200d("TTUploadDNSParserBridge", C1642a.m8034a("has expired try call parse:", new Object[0]));
                    TTUploadDNSParser.getInstance().addHost(str, null);
                }
                if (this.handle != 0) {
                    _notifyParserResult(this.handle, str, this.ipList, tTUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                TTUploadLog.m144200d("TTUploadDNSParserBridge", "****add host to parser");
                TTUploadDNSParser.getInstance().addHost(str, this);
                i = 0;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public void onCompletion(int i, String str, String str2, long j, String str3) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                TTUploadLog.m144200d("TTUploadDNSParserBridge", C1642a.m8034a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                if (this.handle != 0) {
                    _notifyParserResult(this.handle, str, str2, j, str3);
                }
            } else {
                TTUploadLog.m144200d("TTUploadDNSParserBridge", C1642a.m8034a("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
        } finally {
            this.lock.unlock();
        }
    }
}
