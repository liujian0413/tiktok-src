package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import com.bytedance.android.live.broadcast.bgbroadcast.p130a.C2461a;
import com.bytedance.android.live.broadcast.bgbroadcast.p131b.C2486a;
import com.bytedance.android.live.broadcast.p133d.C2518b;
import com.bytedance.android.live.broadcast.stream.p144c.C2976b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.C9284a;
import com.bytedance.android.livesdkapi.C9284a.C9285a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;

public class BgBroadcastServiceImpl extends C9284a {
    private static final String TAG = "BgBroadcastService";
    private static MediaProjection sProjection;
    private C2458a mLiveStatus;
    private Room mRoom;
    private C2518b mStatusReport;
    private C2976b mStatusService;
    private C2459a mStrategy;
    private Service mStub;
    private C9285a mUiListener;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl$a */
    enum C2458a {
        IDLE,
        LIVING,
        FINISHED
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void startAudio() {
        this.mStrategy.mo9017e();
    }

    public void stopAudio() {
        this.mStrategy.mo9018f();
    }

    public void stopService() {
        this.mStub.stopSelf();
    }

    public boolean isLiveFinished() {
        if (this.mLiveStatus == C2458a.FINISHED) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        if (this.mStatusReport != null) {
            this.mStatusReport.mo9084a();
        }
        stopStream(1, true);
        this.mRoom = null;
        if (C3596c.m13172a(C3495l.class) != null) {
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(null);
        }
        this.mStatusService = null;
        this.mLiveStatus = C2458a.IDLE;
        if (this.mStrategy != null) {
            this.mStrategy.mo9019g();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
    }

    public void startBgActivity() {
        if (this.mStub != null) {
            Intent intent = new Intent(this.mStub, ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(6));
            intent.addFlags(268435456);
            C3358ac.m12528e().startActivity(intent);
        }
    }

    public void onCreate() {
        if (C3596c.m13172a(C3495l.class) == null) {
            this.mStub.stopSelf();
            return;
        }
        this.mRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (!Room.isValid(this.mRoom)) {
            this.mStub.stopSelf();
            return;
        }
        this.mStatusReport = new C2518b(this.mRoom);
        this.mStatusReport.f8105a = new C2499k(this);
        this.mStatusService = new C2976b(this.mStatusReport);
        this.mLiveStatus = C2458a.IDLE;
        if (this.mRoom.isScreenshot) {
            this.mStrategy = new C2461a(this.mStub, this.mRoom, sProjection);
            sProjection = null;
        } else {
            this.mStrategy = new C2486a();
        }
        this.mStrategy.f8022a = new C2500l(this);
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public void bindService(Service service) {
        this.mStub = service;
    }

    public void setLiveStatusListener(C9285a aVar) {
        this.mUiListener = aVar;
    }

    public void unBindService(Service service) {
        this.mStub = null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(int i) {
        stopStream(i, false);
    }

    public void stopStream(int i) {
        stopStream(i, false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            stopStream(1, false);
            if (this.mUiListener != null) {
                this.mUiListener.mo9070a();
            }
        }
    }

    public boolean startStream(boolean z) {
        if (this.mLiveStatus == C2458a.LIVING) {
            return true;
        }
        if (this.mStrategy == null || !this.mStrategy.mo9016a(z)) {
            return false;
        }
        this.mStatusService.mo9745a();
        this.mLiveStatus = C2458a.LIVING;
        return true;
    }

    public void setData(Intent intent, boolean z) {
        super.setData(intent, z);
        this.mStrategy.mo9014a(intent, z);
    }

    private void stopStream(int i, boolean z) {
        if (this.mLiveStatus == C2458a.LIVING) {
            this.mStrategy.mo9015a();
            this.mStatusService.mo9746a(i);
            this.mLiveStatus = C2458a.FINISHED;
        }
    }
}
