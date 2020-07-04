package com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.SwitchCompat;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$onViewCreated$6 */
public final class LiveGestureMagicDialogFragment$onViewCreated$6 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ LiveGestureMagicDialogFragment f8589a;

    /* renamed from: e */
    public final boolean mo5438e() {
        SwitchCompat switchCompat = (SwitchCompat) this.f8589a.mo9380b(R.id.aq9);
        C7573i.m23582a((Object) switchCompat, "gesture_magic_switch");
        return switchCompat.isChecked();
    }

    LiveGestureMagicDialogFragment$onViewCreated$6(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment, Context context, int i, boolean z) {
        this.f8589a = liveGestureMagicDialogFragment;
        super(context, 0, false);
    }
}
