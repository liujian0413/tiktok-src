package com.bytedance.android.live.broadcast.viewmodel;

import android.arch.lifecycle.C0052o;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class StartLiveBannerViewModel extends RxViewModel {

    /* renamed from: a */
    public final C0052o<C4900a> f9321a = new C0052o<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9783a(C3479d dVar) throws Exception {
        this.f9321a.postValue(dVar.data);
    }

    /* renamed from: a */
    public final void mo9784a(String str) {
        if (((Boolean) LiveSettingKeys.LIVE_PAGE_SHOW_BANNER.mo10240a()).booleanValue()) {
            mo10158a(C2515f.m10417f().mo9076c().mo9173h().queryStartLiveBanner(str, 2).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2984a<Object>(this), C2985b.f9323a));
        }
    }
}
