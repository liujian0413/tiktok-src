package com.bytedance.android.livesdk.banner.p189ad;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C3924b;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p346io.reactivex.C7494t;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.banner.ad.GameBannerWidget */
public class GameBannerWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private boolean f11764a;

    /* renamed from: b */
    private Room f11765b;

    /* renamed from: c */
    private BannerAdView f11766c;

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        this.f11766c = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11485a(C3924b bVar) throws Exception {
        m13839a(bVar.f11750b);
    }

    /* renamed from: a */
    private void m13839a(C4899c cVar) {
        if (cVar == null || cVar.f14012d == null || cVar.f14012d.f14014b == null || cVar.f14012d.f14014b.isEmpty()) {
            if (this.containerView != null) {
                this.containerView.removeAllViews();
            }
            return;
        }
        C9357a aVar = (C9357a) cVar.f14012d.f14014b.get(0);
        if (!(aVar == null || this.containerView == null || getContext() == null)) {
            this.containerView.removeAllViews();
            if (this.f11766c == null) {
                this.f11766c = new BannerAdView(getContext());
            }
            this.containerView.addView(this.f11766c, new LayoutParams(-1, C3358ac.m12510a(58.0f)));
            this.f11766c.mo11483a(aVar);
        }
    }

    public void onLoad(Object... objArr) {
        this.f11765b = (Room) this.dataCenter.get("data_room");
        this.f11764a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            ((C3245ad) inRoomBannerManager.mo11475a(Long.valueOf(this.f11765b.getId())).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C3934d<Object>(this));
        }
    }
}
