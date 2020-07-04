package com.p280ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttuploader.TTUploadLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.ttuploader.net.LocalDNS */
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    /* renamed from: com.ss.ttuploader.net.LocalDNS$MyRunnable */
    static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public void run() {
            TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = (LocalDNS) this.mLocalDNSRef.get();
            if (localDNS == null) {
                TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end implement delayed check for local dns, dns object null", new Object[0]));
                return;
            }
            if (!localDNS.mRet) {
                localDNS.cancel();
                TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end implement delayed check cancel local dns,", new Object[0]));
                TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(0, localDNS.mHostname, null, 0, localDNS.mId);
                localDNS.notifyError(tTUploadDNSInfo);
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    public boolean isRunning() {
        return this.mRet;
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            if (this.mFuture != null) {
                this.mFuture.cancel(true);
                this.mFuture = null;
            }
        }
    }

    public void close() {
        super.close();
        if (this.mFuture != null) {
            this.mFuture.cancel(true);
            this.mFuture = null;
        }
    }

    public void start() {
        try {
            this.mFuture = TTUploadThreadPool.addExecuteTask(new Runnable() {
                public void run() {
                    String sb;
                    TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        LocalDNS.this.mAddress = InetAddress.getAllByName(LocalDNS.this.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end call local dns, not get address host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS = LocalDNS.this;
                            TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId);
                            localDNS.notifyError(tTUploadDNSInfo);
                            return;
                        }
                        String str = "";
                        for (InetAddress hostAddress : LocalDNS.this.mAddress) {
                            String hostAddress2 = hostAddress.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress2)) {
                                if (TextUtils.isEmpty(str)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append(hostAddress2);
                                    sb = sb2.toString();
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str);
                                    sb3.append(",");
                                    sb3.append(hostAddress2);
                                    sb = sb3.toString();
                                }
                                str = sb;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS2 = LocalDNS.this;
                            TTUploadDNSInfo tTUploadDNSInfo2 = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId);
                            localDNS2.notifyError(tTUploadDNSInfo2);
                            return;
                        }
                        TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                        TTUploadDNSInfo tTUploadDNSInfo3 = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + ((long) (TTUploadDNSParser.mGlobalDefaultExpiredTime * 1000)), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, tTUploadDNSInfo3);
                        LocalDNS.this.notifySuccess(tTUploadDNSInfo3);
                    } catch (Throwable th) {
                        LocalDNS.this.mRet = true;
                        TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end call local dns, end exception:%s host:%s", new Object[]{th, LocalDNS.this.mHostname}));
                        LocalDNS localDNS3 = LocalDNS.this;
                        TTUploadDNSInfo tTUploadDNSInfo4 = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId);
                        localDNS3.notifyError(tTUploadDNSInfo4);
                    }
                }
            });
        } catch (Exception e) {
            TTUploadLog.m144200d("LocalDNS", C1642a.m8034a("****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(0, this.mHostname, null, 0, this.mId);
            notifyError(tTUploadDNSInfo);
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
