package com.p280ss.android.common.applog;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.common.applog.TrafficGuard */
public class TrafficGuard implements C6310a {
    private final ITrafficWarningCallback mCallback;
    private int mCheckCnt;
    private long mCheckInterval;
    private final Context mContext;
    private final Handler mHandler;
    private long mInitTime;
    private long[] mInitTraffic = new long[2];
    private long mLastTime;
    private long[] mLastTraffic = new long[2];
    private long[] mTmpTraffic = new long[2];

    /* renamed from: com.ss.android.common.applog.TrafficGuard$ITrafficWarningCallback */
    public interface ITrafficWarningCallback {
        void onTrafficWarning(TrafficWarningInfo trafficWarningInfo);
    }

    /* renamed from: com.ss.android.common.applog.TrafficGuard$TrafficWarningInfo */
    static class TrafficWarningInfo {
        public long costBytes;
        public long curBytes;
        public long initTime;
        public boolean isAccumulate;
        public long lastBytes;
        public long lastTime;

        /* renamed from: tx */
        public boolean f19229tx;

        TrafficWarningInfo() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TrafficWarningInfo (tx:: ");
            sb.append(this.f19229tx);
            sb.append(", cost: ");
            sb.append(this.costBytes);
            sb.append(", last: ");
            sb.append(this.lastBytes);
            sb.append(", current:");
            sb.append(this.curBytes);
            sb.append(", lastTime:");
            sb.append(this.lastTime);
            sb.append(", initTime:");
            sb.append(this.initTime);
            sb.append(", isAccumulate:");
            sb.append(this.isAccumulate);
            sb.append(")");
            return sb.toString();
        }
    }

    public void reset() {
        this.mHandler.sendEmptyMessage(3);
    }

    public void start() {
        this.mHandler.removeMessages(2);
        this.mHandler.sendEmptyMessageDelayed(2, 180000);
    }

    private void checkTraffic() {
        boolean z;
        boolean z2;
        long[] jArr = this.mTmpTraffic;
        getAppTraffic(jArr);
        this.mLastTime = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j >= 0) {
                if (this.mLastTraffic[i] >= 0) {
                    long j2 = j - this.mLastTraffic[i];
                    if (j2 > 5242880) {
                        TrafficWarningInfo trafficWarningInfo = new TrafficWarningInfo();
                        if (i == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        trafficWarningInfo.f19229tx = z2;
                        trafficWarningInfo.costBytes = j2;
                        trafficWarningInfo.lastBytes = this.mLastTraffic[i];
                        trafficWarningInfo.curBytes = j;
                        trafficWarningInfo.lastTime = this.mLastTime;
                        trafficWarningInfo.initTime = this.mInitTime;
                        trafficWarningInfo.isAccumulate = false;
                        if (this.mCallback != null) {
                            this.mCallback.onTrafficWarning(trafficWarningInfo);
                        }
                    }
                }
                this.mLastTraffic[i] = j;
                if (this.mInitTraffic[i] >= 0) {
                    long j3 = j - this.mInitTraffic[i];
                    if (j3 > 20971520) {
                        TrafficWarningInfo trafficWarningInfo2 = new TrafficWarningInfo();
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        trafficWarningInfo2.f19229tx = z;
                        trafficWarningInfo2.costBytes = j3;
                        trafficWarningInfo2.lastBytes = this.mInitTraffic[i];
                        trafficWarningInfo2.curBytes = j;
                        trafficWarningInfo2.lastTime = this.mLastTime;
                        trafficWarningInfo2.initTime = this.mInitTime;
                        trafficWarningInfo2.isAccumulate = true;
                        if (this.mCallback != null) {
                            this.mCallback.onTrafficWarning(trafficWarningInfo2);
                        }
                    }
                } else {
                    this.mInitTraffic[i] = j;
                }
            }
        }
        if (this.mCheckCnt <= 0) {
            this.mCheckCnt = 0;
        }
        if (this.mCheckInterval <= 0) {
            this.mCheckInterval = 300000;
        }
        this.mCheckCnt++;
        if (this.mCheckCnt > 0 && this.mCheckCnt <= 5) {
            this.mCheckInterval *= 2;
        }
        this.mHandler.sendEmptyMessageDelayed(1, this.mCheckInterval);
    }

    private void getAppTraffic(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            try {
                jArr[0] = -1;
                jArr[1] = -1;
                ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
                if (applicationInfo != null) {
                    if (applicationInfo.uid > 0) {
                        jArr[0] = TrafficStats.getUidTxBytes(applicationInfo.uid);
                        jArr[1] = TrafficStats.getUidRxBytes(applicationInfo.uid);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case 1:
                try {
                    checkTraffic();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                this.mHandler.removeMessages(1);
                this.mHandler.removeMessages(3);
                this.mCheckCnt = 0;
                this.mCheckInterval = 300000;
                getAppTraffic(this.mInitTraffic);
                this.mLastTraffic[0] = this.mInitTraffic[0];
                this.mLastTraffic[1] = this.mInitTraffic[1];
                this.mInitTime = System.currentTimeMillis();
                this.mLastTime = this.mInitTime;
                this.mHandler.sendEmptyMessageDelayed(1, 300000);
                break;
            case 3:
                this.mHandler.removeMessages(1);
                this.mHandler.removeMessages(2);
                this.mCheckCnt = 0;
                this.mCheckInterval = 0;
                return;
        }
    }

    public TrafficGuard(Context context, ITrafficWarningCallback iTrafficWarningCallback) {
        this.mContext = context.getApplicationContext();
        this.mHandler = new C6309f(Looper.getMainLooper(), this);
        this.mCallback = iTrafficWarningCallback;
    }
}
