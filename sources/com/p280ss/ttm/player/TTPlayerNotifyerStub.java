package com.p280ss.ttm.player;

import android.os.RemoteException;
import com.p280ss.ttm.player.ITTNotifyer.Stub;

/* renamed from: com.ss.ttm.player.TTPlayerNotifyerStub */
class TTPlayerNotifyerStub extends Stub {
    TTPlayerConnection mConnection;

    TTPlayerNotifyerStub(TTPlayerConnection tTPlayerConnection) {
        this.mConnection = tTPlayerConnection;
    }

    public void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException {
        this.mConnection.handlePlayerError(j, i, i2, str);
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException {
        this.mConnection.recvNotify(j, i, i2, i3, str);
    }
}
