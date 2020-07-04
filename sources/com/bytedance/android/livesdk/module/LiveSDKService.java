package com.bytedance.android.livesdk.module;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.base.model.p121b.C2336a;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.room.C3484c;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.bytedance.android.live.room.C3486d;
import com.bytedance.android.live.room.C3488e;
import com.bytedance.android.live.room.C3489f;
import com.bytedance.android.live.room.C3490g;
import com.bytedance.android.live.room.C3492i;
import com.bytedance.android.live.room.C3496m;
import com.bytedance.android.live.room.C3498o;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.chatroom.end.NewLiveBroadcastEndFragment;
import com.bytedance.android.livesdk.chatroom.p220ui.LandscapeInteractionFragment;
import com.bytedance.android.livesdk.chatroom.p220ui.PortraitInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.commerce.C5847d;
import com.bytedance.android.livesdk.livebuild.LottiePlayService;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdk.utils.C9080r;
import com.bytedance.android.livesdk.verify.C9101d;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p346io.reactivex.C7492s;

public class LiveSDKService implements ILiveSDKService {
    private C3488e mLinkCrossRoomWidget;
    private C3490g mLiveCommerceService;
    private C3492i mLottiePlayService;

    public LiveSDKService() {
        C3596c.m13174a(ILiveSDKService.class, this);
    }

    public C3483b dnsOptimizer() {
        return ((C3450b) C3596c.m13172a(C3450b.class)).getDnsOptimizer();
    }

    public C3492i getLottiePlayService() {
        if (this.mLottiePlayService == null) {
            this.mLottiePlayService = new LottiePlayService();
        }
        return this.mLottiePlayService;
    }

    public C3488e linkCrossRoomWidget() {
        if (this.mLinkCrossRoomWidget == null) {
            this.mLinkCrossRoomWidget = new C3488e() {
                /* renamed from: a */
                public final int mo10491a() {
                    return LinkCrossRoomWidget.m17465k();
                }

                /* renamed from: b */
                public final int mo10492b() {
                    return LinkCrossRoomWidget.m17466l();
                }

                /* renamed from: c */
                public final int mo10493c() {
                    return LinkCrossRoomWidget.m17464j();
                }
            };
        }
        return this.mLinkCrossRoomWidget;
    }

    public C3490g liveCommerceService() {
        if (this.mLiveCommerceService == null) {
            this.mLiveCommerceService = new C3490g() {
                /* renamed from: a */
                public final C7492s<Boolean> mo10499a(Long l) {
                    return C5847d.m18313b(l.longValue());
                }

                /* renamed from: b */
                public final C7492s<Boolean> mo10500b(Long l) {
                    return C5847d.m18312a(l.longValue());
                }

                /* renamed from: a */
                public final BaseDialogFragment mo10498a(Context context, Long l) {
                    return C5847d.m18311a(context, null);
                }
            };
        }
        return this.mLiveCommerceService;
    }

    public C3498o getXTSDKService() {
        return (C3498o) C9178j.m27302j().mo22378g().mo22355a(C3498o.class);
    }

    public C3496m hostStickerViewService() {
        return (C3496m) C9178j.m27302j().mo22378g().mo22355a(C3496m.class);
    }

    public C3486d createInteractionFragment(int i) {
        if (i == 0) {
            return new LandscapeInteractionFragment();
        }
        return new PortraitInteractionFragment();
    }

    public C3489f createLiveBroadcastEndFragment(boolean z) {
        if (z) {
            return new NewLiveBroadcastEndFragment();
        }
        return new LiveBroadcastEndFragment();
    }

    public IMessageManager getMessageManager(long j, boolean z, Context context) {
        return C9038ag.m26997a(j, z, context);
    }

    public void handleRealNameConflict(Activity activity, int i, C2336a aVar, Bundle bundle) {
        C9101d.m27157a(activity, i, aVar, bundle);
    }

    public C3484c createImagePicker(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C3485a aVar) {
        C9080r rVar = new C9080r(activity, fragment, str, i, i2, i3, i4, aVar);
        return rVar;
    }
}
