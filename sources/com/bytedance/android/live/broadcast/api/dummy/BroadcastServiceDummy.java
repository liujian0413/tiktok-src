package com.bytedance.android.live.broadcast.api.dummy;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p125a.C2415a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2424d;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2432b.C2433a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.broadcast.api.p128d.C2435d;
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

public class BroadcastServiceDummy implements IBroadcastService {
    public C2421c composerManager() {
        return null;
    }

    public C9355c convertStickerBean(Effect effect) {
        return null;
    }

    public C9284a createBgBroadcastBinder() {
        return null;
    }

    public C9345a createBgBroadcastFragment(Bundle bundle) {
        return null;
    }

    public C2435d createCoverController(Fragment fragment, Room room) {
        return null;
    }

    public C2415a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter) {
        return null;
    }

    public Client createGuestClient(Context context, InteractConfig interactConfig) {
        return null;
    }

    public C2434c createLinkInRoomView(C2429a aVar, Context context, int i) {
        return null;
    }

    public C4486al createLinkVideoView(Context context, C2433a aVar) {
        return null;
    }

    public Fragment createLiveBroadcastFragment(C9348c cVar, Bundle bundle) {
        return null;
    }

    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        return null;
    }

    public C9350e createStartLiveFragment() {
        return null;
    }

    public <T> Class<T> getWidgetClass(int i) {
        return null;
    }

    public IXTBroadcastService getXTBroadcastService() {
        return null;
    }

    public boolean haveNewFilter() {
        return false;
    }

    public void init() {
    }

    public C7492s<Integer> loadShortVideoRes() {
        return null;
    }

    public C9351f startLiveManager() {
        return null;
    }

    public C2424d stickerPresenter() {
        return null;
    }

    public void updateGameMsgViewUserCount(int i) {
    }

    public BroadcastServiceDummy() {
        C3596c.m13174a(IBroadcastService.class, this);
    }
}
