package com.p280ss.ttm.player;

import android.content.Context;
import android.os.RemoteException;
import android.support.p022v4.util.C0893e;
import android.view.Surface;
import com.p280ss.ttm.player.ITTPlayer.Stub;
import com.p280ss.ttm.utils.AVLogger;

/* renamed from: com.ss.ttm.player.TTPlayerStub */
public class TTPlayerStub extends Stub implements IPlayerNotifyer {
    private static final String TAG = "TTPlayerStub";
    private Context mContext;
    private ITTNotifyer mNotifyer;
    private C0893e<TTPlayer> mPlayers = new C0893e<>();
    private C0893e<Surface> mSurfaces = new C0893e<>();

    public void takeScreenshot() throws RemoteException {
    }

    public void unregisterNotifyer() throws RemoteException {
        this.mNotifyer = null;
        int b = this.mPlayers.mo3330b() - 1;
        for (int i = 0; i < b; i++) {
            TTPlayer tTPlayer = (TTPlayer) this.mPlayers.mo3334c(i);
            if (tTPlayer != null) {
                tTPlayer.setNotifyer(null);
            }
        }
    }

    public void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException {
        this.mNotifyer = iTTNotifyer;
    }

    public int close(long j) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.close();
    }

    public TTPlayer getPlayer(long j) {
        return (TTPlayer) this.mPlayers.mo3327a(j);
    }

    public int pause(long j) {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.pause();
    }

    public int prepare(long j) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.prepare();
    }

    public int prevClose(long j) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.prevClose();
    }

    public int reset(long j) {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.reset();
    }

    public int start(long j) {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.start();
    }

    public int stop(long j) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.stop();
    }

    public TTPlayerStub(Context context) throws Exception {
        this.mContext = context;
    }

    public long create(long j) {
        if (TTPlayer.isError() && TTPlayerService.isError()) {
            return 0;
        }
        try {
            TTPlayer tTPlayer = new TTPlayer(this.mContext, j);
            tTPlayer.setNotifyer(this);
            this.mPlayers.mo3333b(j, tTPlayer);
            return j;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void release(long j) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            this.mPlayers.mo3336c(j);
            player.release();
            Surface surface = (Surface) this.mSurfaces.mo3327a(j);
            if (surface != null) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("<release>surface:");
                sb.append(surface);
                sb.append(", id =");
                sb.append(j);
                AVLogger.m144197k(str, sb.toString());
                surface.release();
                this.mSurfaces.mo3336c(j);
            }
        }
    }

    public void seekTo(long j, int i) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.seekTo(i);
        }
    }

    public void setDataSource(long j, String str) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setDataSource(str);
        }
    }

    public void setLooping(long j, int i) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setLooping(i);
        }
    }

    public void setNotifyState(long j, long j2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setNotifyerState(j2);
        }
    }

    public String getStringOption(long j, int i) throws RemoteException {
        if (i == 27) {
            return TTPlayerService.getCrashPath();
        }
        if (i == 28) {
            return TTPlayerService.getAppFilesPath();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return null;
        }
        return player.getStringOption(i);
    }

    public int setSurface(long j, Surface surface) {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        Surface surface2 = (Surface) this.mSurfaces.mo3327a(j);
        this.mSurfaces.mo3336c(j);
        if (surface != null) {
            this.mSurfaces.mo3333b(j, surface);
        }
        int videoSurface = player.setVideoSurface(surface);
        if (surface2 != null) {
            surface2.release();
        }
        return videoSurface;
    }

    public double getDoubleOption(long j, int i, double d) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1.0d;
        }
        return player.getDoubleOption(i, d);
    }

    public float getFloatOption(long j, int i, float f) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1.0f;
        }
        return player.getFloatOption(i, f);
    }

    public int getIntOption(long j, int i, int i2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.getIntOption(i, i2);
    }

    public long getLongOption(long j, int i, long j2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.getLongOption(i, j2);
    }

    public void rotateCamera(long j, float f, float f2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(long j, String str, int i) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setCacheFile(str, i);
        }
    }

    public int setDoubleOption(long j, int i, double d) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setDoubleOption(i, d);
        return 0;
    }

    public int setFloatOption(long j, int i, float f) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setFloatOption(i, f);
        return 0;
    }

    public int setIntOption(long j, int i, int i2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setIntOption(i, i2);
        return 0;
    }

    public int setLongOption(long j, int i, long j2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setLongOption(i, j2);
        return 0;
    }

    public int setStringOption(long j, int i, String str) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.setStringOption(i, str);
    }

    public void setVolume(long j, float f, float f2) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setVolume(f, f2);
        }
    }

    public void switchStream(long j, int i, int i2) throws RemoteException {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.switchStream(i, i2);
        }
    }

    public void handleErrorNotify(long j, int i, int i2, String str) {
        if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handleErrorNotify(j, i, i2, str);
            } catch (RemoteException unused) {
            }
        }
    }

    public void mouseEvent(long j, int i, int i2, int i3) {
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.mouseEvent(i, i2, i3);
        }
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) {
        if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handlePlayerNotify(j, i, i2, i3, str);
            } catch (RemoteException unused) {
            }
        }
    }
}
