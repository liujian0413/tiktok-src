package com.bytedance.android.livesdk.module;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.room.C3493j;
import com.bytedance.android.live.room.C3494k;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.C3497n;
import com.bytedance.android.live.room.p168a.C3482a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.p210c.C4300c;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdkapi.depend.live.C9326b;
import com.bytedance.android.livesdkapi.depend.live.EntryType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.p354j.C7486b;

public class RoomService implements C3495l {
    private static final String LIVING_ROOM = "https://hotsoon.snssdk.com/hotsoon/room/follow/ids/";
    private Room mCurRoom;
    private boolean mHasAddInteractObserve;
    private final C3915g<Integer> mInteractObserver = new C8702a(this);
    private final List<C9326b> mListeners = new ArrayList();
    private C3482a sCrossRoomGift;
    private C7486b<Long> watchLiveSubject;

    public Room getCurrentRoom() {
        return this.mCurRoom;
    }

    public boolean needHideShare(IUser iUser) {
        return iUser == null ? false : false;
    }

    public C3493j messageManagerHelper() {
        return new C3493j() {
            /* renamed from: a */
            public final IMessageManager mo10513a() {
                return C9038ag.m26996a();
            }
        };
    }

    public C3494k roomManager() {
        return C4275g.m14434a();
    }

    public C3497n toolbarManagerHelper() {
        return new C3497n() {
            /* renamed from: a */
            public final C5738d mo10530a() {
                return C5747j.m18103a();
            }

            /* renamed from: b */
            public final C5738d mo10531b() {
                return C5747j.m18105c();
            }
        };
    }

    public C3482a getCrossRoomGift() {
        if (this.sCrossRoomGift == null) {
            return null;
        }
        C3482a b = this.sCrossRoomGift.mo10466b();
        this.sCrossRoomGift = null;
        return b;
    }

    private void addInteractObserve() {
        TTLiveSDKContext.getLiveService().mo22017c().mo22026a(this.mInteractObserver);
        this.mHasAddInteractObserve = true;
    }

    public C7486b<Long> getLiveWatchTime() {
        if (this.watchLiveSubject == null) {
            synchronized (this) {
                if (this.watchLiveSubject == null) {
                    this.watchLiveSubject = C7486b.m23223a();
                }
            }
        }
        return this.watchLiveSubject;
    }

    public List<Long> getLivingRoomIds() throws Exception {
        return ((C3478c) ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getLivingRoomIds().execute().f33302b).f10296b;
    }

    public boolean isInteracting() {
        int a = TTLiveSDKContext.getLiveService().mo22017c().mo22025a();
        if (a == 2 || a == 1) {
            return true;
        }
        return false;
    }

    public C3482a setCrossRoomGift(C3482a aVar) {
        this.sCrossRoomGift = aVar;
        return aVar;
    }

    public void setCurrentRoom(Room room) {
        this.mCurRoom = room;
    }

    public void removeInteractStateChangeListener(C9326b bVar) {
        this.mListeners.remove(bVar);
    }

    public void recordEnterStart(EntryType entryType) {
        TTLiveSDKContext.getLiveService().mo22010a(entryType.typeName);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$RoomService(Integer num) {
        boolean isInteracting = isInteracting();
        for (C9326b a : this.mListeners) {
            a.mo14811a(isInteracting);
        }
    }

    public void registerInteractStateChangeListener(C9326b bVar) {
        if (!this.mHasAddInteractObserve) {
            addInteractObserve();
        }
        if (!this.mListeners.contains(bVar)) {
            this.mListeners.add(bVar);
        }
    }

    public String getLiveType(Room room) {
        if (room == null) {
            return "other";
        }
        if (room != null && room.isScreenshot) {
            return "game";
        }
        if (room != null && room.isThirdParty) {
            return "thirdparty";
        }
        if (room == null || !room.isLiveTypeAudio()) {
            return "video";
        }
        return "audio";
    }

    public void cacheEndTime(C3491h hVar, long j) {
        C4300c.m14490b(C4300c.m14481a((Object) hVar), j);
    }

    public Spannable parsePatternAndGetSpannable(C9505f fVar, String str) {
        return C4374z.m14749a(fVar, str);
    }

    public void cacheObj2Obj(C2261a aVar, C3491h hVar) {
        C4300c.m14483a(C4300c.m14481a((Object) aVar), C4300c.m14481a((Object) hVar));
    }

    public Spannable parsePatternAndGetSpannable(String str, C9505f fVar) {
        return C4374z.m14751a(str, fVar);
    }
}
