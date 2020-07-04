package com.bytedance.android.live.broadcast.api;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.broadcast.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.p125a.C2415a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2424d;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2432b.C2433a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.broadcast.api.p128d.C2435d;
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

public interface IBroadcastService extends C2324b {
    public static final int COPYING = 1;
    public static final String LIVE_HEALTH_SCORE_URL = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/health_score/main/index.html?showHeader=1";
    public static final int REC_COPY_DONE = 2;
    public static final String TAG_MSG_VIEW = "msg_view";
    public static final int TYPE_LINK_IN_ROOM_VIEW_AUDIO = 1;
    public static final int TYPE_LINK_IN_ROOM_VIEW_RADIO = 0;
    public static final int WIDGET_TYPE_BROADCAST_INFO = 0;
    public static final int WIDGET_TYPE_STICKER_TIP = 1;
    public static final int WIDGET_TYPE_TASK_FINISH_ANIM = 2;

    C2421c composerManager();

    C9355c convertStickerBean(Effect effect);

    C9284a createBgBroadcastBinder();

    C9345a createBgBroadcastFragment(Bundle bundle);

    C2435d createCoverController(Fragment fragment, Room room);

    C2415a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter);

    Client createGuestClient(Context context, InteractConfig interactConfig);

    C2434c createLinkInRoomView(C2429a aVar, Context context, int i);

    C4486al createLinkVideoView(Context context, C2433a aVar);

    Fragment createLiveBroadcastFragment(C9348c cVar, Bundle bundle);

    LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity);

    C9350e createStartLiveFragment();

    <T> Class<T> getWidgetClass(int i);

    IXTBroadcastService getXTBroadcastService();

    boolean haveNewFilter();

    void init();

    C7492s<Integer> loadShortVideoRes();

    C9351f startLiveManager();

    C2424d stickerPresenter();

    void updateGameMsgViewUserCount(int i);
}
