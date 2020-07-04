package com.p280ss.ttm.player;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import com.p280ss.ttm.player.ITTPlayer.Stub;
import com.p280ss.ttm.utils.AVTime;

/* renamed from: com.ss.ttm.player.TTPlayerConnection */
class TTPlayerConnection implements ServiceConnection {
    private static final String TAG = "TTPlayerConnection";
    private TTPlayerFactory mFactory;
    private ITTNotifyer mNotifyer = new TTPlayerNotifyerStub(this);
    protected ITTPlayer mPlayer;

    public void disConnection() {
    }

    public boolean isConnectioned() {
        if (this.mPlayer != null) {
            return true;
        }
        return false;
    }

    public void doConnectioned() {
        if (this.mPlayer != null) {
            try {
                TTPlayerConfiger.setValue(19, this.mPlayer.getStringOption(0, 27));
                TTPlayerConfiger.setValue(20, this.mPlayer.getStringOption(0, 28));
                this.mPlayer.registerNotifyer(this.mNotifyer);
            } catch (RemoteException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    TTPlayerConnection(TTPlayerFactory tTPlayerFactory) {
        this.mFactory = tTPlayerFactory;
    }

    public long create(long j) {
        if (this.mPlayer == null) {
            return -1;
        }
        try {
            return this.mPlayer.create(j);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void prevClose(long j) {
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prevClose(j);
            } catch (Throwable unused) {
            }
        }
    }

    public void pause(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.pause(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "pause";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void prepare(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "prepare";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void prepareAsync(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "prepareAsync";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void reset(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.reset(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "reset";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void start(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.start(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "start";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void stop(long j) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.stop(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "stop";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void close(long j) throws Exception {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.close(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            throw new Exception(getError(j, "close", str));
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.mPlayer = null;
        TTPlayerFactory tTPlayerFactory = this.mFactory;
        StringBuilder sb = new StringBuilder("<onServiceDisconnected,");
        sb.append(AVTime.getFormatNow());
        sb.append(">player is will null");
        tTPlayerFactory.sendCrashedInfo(0, sb.toString());
        this.mFactory.onServiceDisconnected();
    }

    public void release(long j) throws Exception {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.release(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            throw new Exception(getError(j, "release", str));
        }
    }

    private int sendError(long j, String str) {
        if (str != null) {
            this.mFactory.sendCrashedInfo(j, str);
        }
        return this.mFactory.sendCrashedError(j, 20000);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ITTPlayer asInterface = Stub.asInterface(iBinder);
        try {
            asInterface.registerNotifyer(this.mNotifyer);
            this.mPlayer = asInterface;
        } catch (Throwable unused) {
        }
    }

    public void seekTo(long j, int i) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.seekTo(j, i);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "seekTo";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void setDataSource(long j, String str) {
        Throwable th;
        String str2;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setDataSource(j, str);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str3 = "setDataSource";
            if (th == null) {
                str2 = "player is null";
            } else {
                str2 = th.getMessage();
            }
            sendError(j, getError(j, str3, str2));
        }
    }

    public void setLooping(long j, int i) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setLooping(j, i);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "setLooping";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void setNotifyState(long j, long j2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setNotifyState(j, j2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "setNotifyState";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public String getStringOption(long j, int i) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getStringOption(j, i);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("getStringOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return null;
        }
    }

    public int setVideoSurface(long j, Surface surface) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setSurface(j, surface);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "setVideoSurface";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            return sendError(j, getError(j, str2, str));
        }
    }

    public void rotateCamera(long j, float f, float f2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.rotateCamera(j, f, f2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "rotateCamera";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void setCacheFile(long j, String str, int i) {
        Throwable th;
        String str2;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setCacheFile(j, str, i);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str3 = "setLocalPath";
            if (th == null) {
                str2 = "player is null";
            } else {
                str2 = th.getMessage();
            }
            sendError(j, getError(j, str3, str2));
        }
    }

    public void setVolume(long j, float f, float f2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setVolume(j, f, f2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "setVolume";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void switchStream(long j, int i, int i2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.switchStream(j, i, i2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "switch stream";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public double getDoubleOption(long j, int i, double d) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getDoubleOption(j, i, d);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("getLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return d;
        }
    }

    public float getFloatOption(long j, int i, float f) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getFloatOption(j, i, f);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("getLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return f;
        }
    }

    public long getLongOption(long j, int i, long j2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getLongOption(j, i, j2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("getLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return j2;
        }
    }

    public int setDoubleOption(long j, int i, double d) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setDoubleOption(j, i, d);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("setLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return -1;
        }
    }

    public int setFloatOption(long j, int i, float f) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setFloatOption(j, i, f);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("setLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return -1;
        }
    }

    public int setIntOption(long j, int i, int i2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setIntOption(j, i, i2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("setIntOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            return sendError(j, getError(j, sb2, str));
        }
    }

    public int setLongOption(long j, int i, long j2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setLongOption(j, i, j2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("setLongOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, sb2, str));
            return -1;
        }
    }

    public int setStringOption(long j, int i, String str) {
        Throwable th;
        String str2;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setStringOption(j, i, str);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("setStringOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str2 = "player is null";
            } else {
                str2 = th.getMessage();
            }
            sendError(j, getError(j, sb2, str2));
            return -1;
        }
    }

    private static final String getError(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        sb.append('<');
        sb.append(Thread.currentThread().getId());
        sb.append(',');
        sb.append(TAG);
        sb.append(',');
        sb.append(str);
        sb.append(',');
        sb.append(AVTime.getFormatNow());
        sb.append('>');
        sb.append("player:");
        sb.append(j);
        sb.append(",info:");
        sb.append(str2);
        return sb.toString();
    }

    public int getIntOption(long j, int i, int i2) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getIntOption(j, i, i2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            StringBuilder sb = new StringBuilder("getIntOption,key:");
            sb.append(i);
            String sb2 = sb.toString();
            if (th == null) {
                str = "player is null";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(th.getClass().getSimpleName());
                sb3.append(":");
                sb3.append(th.getMessage());
                str = sb3.toString();
            }
            sendError(j, getError(j, sb2, str));
            return i2;
        }
    }

    public void handlePlayerError(long j, int i, int i2, String str) {
        this.mFactory.onPlayerLogInfo(j, i, i2, str);
    }

    public void mouseEvent(long j, int i, int i2, int i3) {
        Throwable th;
        String str;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.mouseEvent(j, i, i2, i3);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "mouseEvent";
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j, getError(j, str2, str));
        }
    }

    public void recvNotify(long j, int i, int i2, int i3, String str) {
        this.mFactory.sendNotify(j, i, i2, i3, str);
    }
}
