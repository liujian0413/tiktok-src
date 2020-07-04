package com.p280ss.ttm.player;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.p022v4.util.C0893e;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.ttm.utils.AVTime;
import com.p280ss.ttm.utils.PhoneInfo;
import com.p280ss.ttm.utils.app.ServiceUtil;
import java.util.HashMap;

/* renamed from: com.ss.ttm.player.TTPlayerFactory */
class TTPlayerFactory implements Callback {
    private static TTPlayerFactory mInstance;
    private Context mAppContext;
    private TTPlayerConnection mConnection;
    private Handler mHandler;
    private Object mLocker = new Object();
    public C0893e<TTPlayerIPCRef> mPlayers = new C0893e<>();

    protected static Context getContext() {
        return mInstance.mAppContext;
    }

    TTPlayerFactory() {
    }

    private boolean isConnectionTimeout() {
        int i = 0;
        while (!this.mConnection.isConnectioned()) {
            if (i > 2000) {
                return true;
            }
            try {
                Thread.sleep(10);
                i += 10;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void tryStopService() {
        synchronized (this.mLocker) {
            if (this.mPlayers.mo3330b() == 0) {
                stopService();
            }
        }
    }

    private void stopService() {
        StringBuilder sb = new StringBuilder("stop service.time:");
        sb.append(AVTime.getFormatNow());
        TTPlayerConfiger.setValue(12, sb.toString());
        try {
            this.mConnection.disConnection();
            this.mAppContext.unbindService(this.mConnection);
        } catch (Throwable unused) {
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mAppContext = null;
        mInstance = null;
        this.mHandler = null;
        this.mConnection = null;
    }

    public void onServiceDisconnected() {
        String str;
        int b = this.mPlayers.mo3330b();
        if (TTPlayerConfiger.getValue(18, 1) > 1) {
            str = "not find breakpad crash file";
            try {
                String existsCrashFilePath = TTCrashUtil.existsCrashFilePath(this.mAppContext);
                if (existsCrashFilePath != null) {
                    str = "find breakpad crash file";
                }
                if (b <= 0 && existsCrashFilePath != null) {
                    TTCrashUtil.deleteCrashFile(this.mAppContext, existsCrashFilePath);
                }
            } catch (Throwable unused) {
            }
        } else {
            str = "port version is old";
        }
        TTPlayerConfiger.setValue(21, PhoneInfo.isRunningForeground(this.mAppContext) ? 1 : 0);
        TTPlayerConfiger.setValue(22, PhoneInfo.isScreenOn(this.mAppContext) ? 1 : 0);
        TTPlayerConfiger.setValue(23, PhoneInfo.batteryPct(this.mAppContext));
        for (int i = 0; i < b; i++) {
            TTPlayerIPCRef tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.mo3334c(i);
            if (tTPlayerIPCRef != null) {
                StringBuilder sb = new StringBuilder("<");
                sb.append(TTPlayerFactory.class.getSimpleName());
                sb.append(",onServiceDisconnected,");
                sb.append(AVTime.getFormatNow());
                sb.append(">player is will null.activity player:");
                sb.append(b);
                sb.append(",");
                sb.append(str);
                sb.append("\r\n");
                tTPlayerIPCRef.onCrashedInfo(sb.toString());
                sendCrashedError(tTPlayerIPCRef, 20000);
            }
        }
        this.mPlayers.mo3335c();
        this.mConnection = null;
    }

    public boolean handleMessage(Message message) {
        if (10000 == message.what) {
            tryStopService();
        }
        return true;
    }

    private TTPlayerIPCRef getPlayer(long j) {
        TTPlayerIPCRef tTPlayerIPCRef;
        if (this.mPlayers.mo3330b() == 0) {
            return null;
        }
        if (j > 0) {
            try {
                tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.mo3327a(j);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.mo3334c(0);
        }
        return tTPlayerIPCRef;
    }

    private boolean startService(HashMap<Integer, Integer> hashMap) {
        this.mConnection = new TTPlayerConnection(this);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("will start service to start.time:");
        sb2.append(AVTime.getFormatNow());
        sb.append(sb2.toString());
        sb.append("\r\n");
        Intent intent = new Intent(this.mAppContext, TTPlayerService.class);
        intent.putExtra("real_package_name", "com.ss.ttm");
        if (!ServiceUtil.bindService((ContextWrapper) this.mAppContext, intent, this.mConnection, 1, null)) {
            StringBuilder sb3 = new StringBuilder("bindService fail.time:");
            sb3.append(AVTime.getFormatNow());
            sb.append(sb3.toString());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return false;
        } else if (isConnectionTimeout()) {
            if (hashMap == null || ((Integer) hashMap.get(Integer.valueOf(100))).intValue() != 1) {
                TTPlayerConfiger.setValue(10, TTPlayerConfiger.getValue(10, 0) + 1);
            } else {
                hashMap.put(Integer.valueOf(10), Integer.valueOf(((Integer) hashMap.get(Integer.valueOf(10))).intValue() + 1));
            }
            StringBuilder sb4 = new StringBuilder("start service timeout.time:");
            sb4.append(AVTime.getFormatNow());
            sb.append(sb4.toString());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return false;
        } else {
            if (this.mConnection.isConnectioned()) {
                this.mConnection.doConnectioned();
            }
            if (hashMap == null || ((Integer) hashMap.get(Integer.valueOf(100))).intValue() != 1) {
                TTPlayerConfiger.setValue(10, 0);
            } else {
                hashMap.put(Integer.valueOf(10), Integer.valueOf(0));
            }
            StringBuilder sb5 = new StringBuilder("start service is ok.time:");
            sb5.append(System.currentTimeMillis());
            sb.append(sb5.toString());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return true;
        }
    }

    private int sendCrashedError(TTPlayerIPCRef tTPlayerIPCRef, int i) {
        tTPlayerIPCRef.handleNotify(0, i, 0, null);
        return 0;
    }

    public int sendCrashedError(long j, int i) {
        TTPlayerIPCRef player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        sendCrashedError(player, i);
        return -1;
    }

    /* access modifiers changed from: protected */
    public void sendCrashedInfo(long j, String str) {
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.onCrashedInfo(str);
        }
    }

    public static synchronized void release(TTPlayerIPCRef tTPlayerIPCRef, long j) {
        synchronized (TTPlayerFactory.class) {
            if (mInstance != null) {
                mInstance.releasePlayer(tTPlayerIPCRef, j);
            }
        }
    }

    protected static synchronized TTPlayerIPCRef create(Context context, HashMap<Integer, Integer> hashMap) {
        TTPlayerIPCRef createPlayer;
        synchronized (TTPlayerFactory.class) {
            if (mInstance == null) {
                TTPlayerFactory tTPlayerFactory = new TTPlayerFactory();
                mInstance = tTPlayerFactory;
                tTPlayerFactory.mAppContext = context.getApplicationContext();
                mInstance.mHandler = new Handler(mInstance);
            }
            try {
                synchronized (mInstance.mLocker) {
                    createPlayer = mInstance.createPlayer(context, hashMap);
                }
            } catch (Exception e) {
                TTPlayerConfiger.setValue(16, e.getMessage());
                return null;
            }
        }
        return createPlayer;
    }

    private void releasePlayer(TTPlayerIPCRef tTPlayerIPCRef, long j) {
        this.mPlayers.mo3336c(j);
        if (this.mPlayers.mo3330b() <= 0) {
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
            this.mHandler.removeMessages(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            this.mHandler.sendMessageDelayed(obtainMessage, 600000);
        }
    }

    /* access modifiers changed from: protected */
    public TTPlayerIPCRef createPlayer(Context context, HashMap<Integer, Integer> hashMap) throws Exception {
        if (this.mConnection == null && !startService(hashMap)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TTPlayerConfiger.getValue(16, "not find"));
            sb.append("\r\nstart server is error.");
            TTPlayerConfiger.setValue(16, sb.toString());
            return null;
        } else if (this.mConnection == null || !this.mConnection.isConnectioned()) {
            TTPlayerConfiger.setValue(16, "connection is null or not connectioned.");
            return null;
        } else {
            TTPlayerIPCRef tTPlayerIPCRef = new TTPlayerIPCRef(this.mConnection, context);
            if (tTPlayerIPCRef.getId() == 0) {
                TTPlayerConfiger.setValue(16, "create player handle is zore");
                return null;
            }
            this.mPlayers.mo3330b();
            this.mPlayers.mo3333b(tTPlayerIPCRef.getId(), tTPlayerIPCRef);
            this.mHandler.removeMessages(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            return tTPlayerIPCRef;
        }
    }

    /* access modifiers changed from: protected */
    public void onPlayerLogInfo(long j, int i, int i2, String str) {
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.onPlayerLogInfo(i, i2, str);
        }
    }

    public void sendNotify(long j, int i, int i2, int i3, String str) {
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.handleNotify(i, i2, i3, str);
        }
    }
}
