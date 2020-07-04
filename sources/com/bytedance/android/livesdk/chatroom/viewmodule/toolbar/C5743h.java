package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.C5567a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.C5573b;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.C5575d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.h */
public final class C5743h implements C5737c {

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.h$a */
    public static final class C5745a implements C9174b<C5737c> {
        /* renamed from: a */
        public final C9175a<C5737c> mo11528a(C9175a<C5737c> aVar) {
            return aVar.mo22388a(new C5743h()).mo22387a();
        }
    }

    private C5743h() {
    }

    /* renamed from: a */
    private static boolean m18089a(Room room, boolean z) {
        return ((IGiftService) C3596c.m13172a(IGiftService.class)).showGiftIcon(room, z);
    }

    /* renamed from: a */
    public final void mo14168a(DataCenter dataCenter, Context context) {
        C5738d a = C5747j.m18103a();
        a.mo14165a(ToolbarButton.MORE, (C5739a) new C5575d(context));
        a.mo14165a(ToolbarButton.CLOSE_ROOM, (C5739a) new C5567a());
        C5747j.m18104b().mo14165a(ToolbarButton.MANAGE, (C5739a) new C5573b(true));
    }

    /* renamed from: b */
    public final void mo14170b(DataCenter dataCenter, List<ToolbarButton> list) {
        list.clear();
        boolean booleanValue = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        boolean booleanValue2 = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        LiveMode liveMode = (LiveMode) dataCenter.get("data_live_mode");
        dataCenter.get("data_room");
        if (liveMode.isUsingCamera) {
            list.add(ToolbarButton.BEAUTY);
            list.add(ToolbarButton.FILTER);
            list.add(ToolbarButton.STICKER);
            list.add(ToolbarButton.REVERSE_CAMERA);
            list.add(ToolbarButton.REVERSE_MIRROR);
            list.add(ToolbarButton.MANAGE);
        }
        if (liveMode.equals(LiveMode.AUDIO) && booleanValue2) {
            list.add(ToolbarButton.MANAGE);
        }
        if (booleanValue || (liveMode.equals(LiveMode.AUDIO) && booleanValue2)) {
            list.add(ToolbarButton.SHARE);
        }
    }

    /* renamed from: a */
    public final void mo14169a(DataCenter dataCenter, List<ToolbarButton> list) {
        list.clear();
        boolean booleanValue = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        boolean booleanValue2 = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        LiveMode liveMode = (LiveMode) dataCenter.get("data_live_mode");
        Room room = (Room) dataCenter.get("data_room");
        if (booleanValue) {
            if (liveMode == LiveMode.AUDIO || liveMode == LiveMode.VIDEO) {
                list.add(ToolbarButton.INTERACTION);
                list.add(ToolbarButton.AUDIO_TOGGLE);
            }
            list.add(ToolbarButton.MORE);
            if (m18089a(room, true)) {
                list.add(ToolbarButton.GIFT);
            }
        } else {
            if (!booleanValue2) {
                if (room.getStreamUrl().mo23054e().size() > 1) {
                    list.add(ToolbarButton.SWITCH_VIDEO_QUALITY);
                }
                list.add(ToolbarButton.SWITCH_SCREEN_ORIENTATION);
                list.add(ToolbarButton.GIFT_ANIMATION);
            } else if (liveMode == LiveMode.AUDIO || liveMode == LiveMode.VIDEO) {
                list.add(ToolbarButton.INTERACTION);
                list.add(ToolbarButton.AUDIO_TOGGLE);
            }
            list.add(ToolbarButton.SHARE);
            if (m18089a(room, false)) {
                list.add(ToolbarButton.FAST_GIFT);
                list.add(ToolbarButton.GIFT);
            }
            list.add(0, ToolbarButton.MANAGE_UNFOLD);
        }
    }
}
