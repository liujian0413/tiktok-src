package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.view.VolumeControlView;
import com.bytedance.android.livesdk.chatroom.view.VolumeControlView.C5370a;
import com.bytedance.android.livesdk.p393h.C8291a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class VolumeWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public VolumeControlView f16565a;

    /* renamed from: b */
    private AnimatorSet f16566b;

    /* renamed from: c */
    private C5370a f16567c;

    public int getLayoutId() {
        return R.layout.azp;
    }

    public void onClick(View view) {
    }

    public void onEvent(C8291a aVar) {
    }

    public void onUnload() {
    }

    /* renamed from: a */
    private void m17947a() {
        this.f16566b = new AnimatorSet();
        this.f16566b.play(this.f16565a.getHideVolumeAnim());
        this.f16566b.start();
    }

    public void onInit(Object[] objArr) {
        this.f16565a = (VolumeControlView) this.containerView.findViewById(R.id.hs);
        this.f16567c = new C5370a() {
        };
    }

    public void onLoad(Object[] objArr) {
        if (this.f16565a != null) {
            this.f16565a.setOnAudioControlViewHideListener(this.f16567c);
            m17947a();
            C9097a.m27146a().mo22266a(C8291a.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C8291a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C8291a aVar) throws Exception {
                    VolumeWidget.this.onEvent(aVar);
                }
            });
        }
    }
}
