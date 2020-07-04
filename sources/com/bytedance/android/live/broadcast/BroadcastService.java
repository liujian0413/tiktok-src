package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p125a.C2415a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2424d;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2432b.C2433a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.broadcast.api.p128d.C2435d;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastFragment;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.dutygift.C2549f;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.preview.C2882b;
import com.bytedance.android.live.broadcast.preview.C2904bv;
import com.bytedance.android.live.broadcast.stream.C2964b;
import com.bytedance.android.live.broadcast.widget.BroadcastInfoWidget;
import com.bytedance.android.live.broadcast.widget.C3103d;
import com.bytedance.android.live.broadcast.widget.C3112h;
import com.bytedance.android.live.broadcast.widget.C3120o;
import com.bytedance.android.live.broadcast.widget.LinkInRoomAudioView;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.broadcast.widget.StickerTipWidget;
import com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.interact.C4486al;
import com.bytedance.android.livesdkapi.C9284a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9345a;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import p346io.reactivex.C7492s;

public class BroadcastService implements IBroadcastService {
    private C2904bv startLiveManager;

    public C9284a createBgBroadcastBinder() {
        return new BgBroadcastServiceImpl();
    }

    public void init() {
        C2404a.m10120a().mo8841b();
    }

    public C7492s<Integer> loadShortVideoRes() {
        C2404a.m10120a();
        return C2404a.m10122c();
    }

    public BroadcastService() {
        C3596c.m13174a(IBroadcastService.class, this);
    }

    public C2421c composerManager() {
        return C2515f.m10417f().mo9074a();
    }

    public boolean haveNewFilter() {
        return C2624k.m10736a().mo9270c();
    }

    public C9351f startLiveManager() {
        if (this.startLiveManager == null) {
            this.startLiveManager = new C2904bv();
        }
        return this.startLiveManager;
    }

    public C2424d stickerPresenter() {
        return C2515f.m10417f().mo9075b().mo9212a();
    }

    public C9350e createStartLiveFragment() {
        C2882b bVar = (C2882b) C2515f.m10417f().mo9077d().mo9072a(C2882b.class);
        if (bVar == null) {
            return null;
        }
        return bVar.mo9612a();
    }

    public IXTBroadcastService getXTBroadcastService() {
        IXTBroadcastService iXTBroadcastService = (IXTBroadcastService) C2515f.m10417f().mo9077d().mo9072a(IXTBroadcastService.class);
        if (iXTBroadcastService == null) {
            return null;
        }
        return iXTBroadcastService;
    }

    public void updateGameMsgViewUserCount(int i) {
        C3103d.m11786a(i);
    }

    public C9355c convertStickerBean(Effect effect) {
        return C2663f.m10852a(effect);
    }

    public C9345a createBgBroadcastFragment(Bundle bundle) {
        return BgBroadcastFragment.m10239a(bundle);
    }

    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        return new StartLiveActivityProxy(fragmentActivity);
    }

    public <T> Class<T> getWidgetClass(int i) {
        switch (i) {
            case 0:
                return BroadcastInfoWidget.class;
            case 1:
                return StickerTipWidget.class;
            case 2:
                return TaskFinishAnimationWidget.class;
            default:
                return null;
        }
    }

    public C2435d createCoverController(Fragment fragment, Room room) {
        return new C3120o(fragment, room);
    }

    public C2415a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter) {
        return new C2549f(room, dataCenter);
    }

    public Client createGuestClient(Context context, InteractConfig interactConfig) {
        return C2964b.m11508a(context, interactConfig);
    }

    public C4486al createLinkVideoView(Context context, C2433a aVar) {
        return new LinkVideo2View(context, aVar);
    }

    public Fragment createLiveBroadcastFragment(C9348c cVar, Bundle bundle) {
        return LiveBroadcastFragment.m10046a(cVar, bundle);
    }

    public C2434c createLinkInRoomView(C2429a aVar, Context context, int i) {
        if (i == 1) {
            return new LinkInRoomAudioView(context);
        }
        if (i == 0) {
            return new C3112h(aVar, context);
        }
        return null;
    }
}
