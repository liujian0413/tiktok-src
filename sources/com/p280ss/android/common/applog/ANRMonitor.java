package com.p280ss.android.common.applog;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.taobao.android.dexposed.ClassUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.ANRMonitor */
class ANRMonitor implements C6310a {
    private static ANRMonitor sInst;
    private volatile boolean mActive = true;
    private volatile int mGetMsgId;
    private long mGetMsgTime;
    private Handler mHandler = new C6309f(Looper.getMainLooper(), this);
    private long mLastEnsureForgroundTime;
    private long mLastLogTime;
    private int mLastMsgId = 0;
    private long mLastPauseTime;
    private final Object mLock = new Object();
    private boolean mPaused = true;
    private LogReaper mReaper;

    public void onActivityPause() {
        this.mActive = false;
        this.mLastPauseTime = System.currentTimeMillis();
    }

    public void onActivityResume() {
        this.mActive = true;
        if (this.mPaused) {
            this.mPaused = false;
            synchronized (this.mLock) {
                this.mLock.notify();
            }
        }
        if (this.mLastEnsureForgroundTime <= 0) {
            this.mLastEnsureForgroundTime = System.currentTimeMillis();
        }
    }

    private String getStackStr() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.getClassName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
        }
        return sb.toString();
    }

    public void checkANR() {
        while (true) {
            if (this.mPaused) {
                try {
                    synchronized (this.mLock) {
                        this.mLock.wait();
                    }
                } catch (Exception unused) {
                }
            } else {
                if (!this.mActive) {
                    if (System.currentTimeMillis() - this.mLastPauseTime > 3000) {
                        this.mPaused = true;
                    }
                }
                this.mLastMsgId++;
                long currentTimeMillis = System.currentTimeMillis();
                this.mHandler.obtainMessage(1, this.mLastMsgId, 0).sendToTarget();
                safeSleep(2000);
                int i = this.mGetMsgId;
                if (i != this.mLastMsgId) {
                    safeSleep(1000);
                    i = this.mGetMsgId;
                    if (i != this.mLastMsgId) {
                        safeSleep(500);
                        i = this.mGetMsgId;
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (i != this.mLastMsgId && currentTimeMillis2 - this.mLastLogTime >= 60000) {
                    this.mLastLogTime = currentTimeMillis2;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("send_msg_id", this.mLastMsgId);
                    jSONObject.put("get_msg_id", i);
                    jSONObject.put("send_msg_time", currentTimeMillis);
                    jSONObject.put("check_msg_time", currentTimeMillis2);
                    String stackStr = getStackStr();
                    if (stackStr != null) {
                        jSONObject.put("data", stackStr);
                    }
                    jSONObject.put("remote_process", 1);
                    jSONObject.put("is_anr", 1);
                    this.mReaper.insertCrashLog(jSONObject);
                }
            }
        }
    }

    private void safeSleep(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception unused) {
        }
    }

    public static synchronized ANRMonitor getInstance(LogReaper logReaper) {
        ANRMonitor aNRMonitor;
        synchronized (ANRMonitor.class) {
            if (sInst == null) {
                sInst = new ANRMonitor(logReaper);
            }
            aNRMonitor = sInst;
        }
        return aNRMonitor;
    }

    private ANRMonitor(LogReaper logReaper) {
        this.mReaper = logReaper;
        new Thread("ANRMonitor-Thread") {
            public void run() {
                ANRMonitor.this.checkANR();
            }
        }.start();
    }

    public void handleMsg(Message message) {
        long currentTimeMillis = System.currentTimeMillis();
        if (message != null && message.what == 1) {
            this.mGetMsgId = message.arg1;
            this.mGetMsgTime = currentTimeMillis;
        }
        if ((this.mLastEnsureForgroundTime <= 0 || currentTimeMillis - this.mLastEnsureForgroundTime > 60000) && !AppLog.isInForeground()) {
            this.mActive = false;
            this.mPaused = true;
        }
    }
}
