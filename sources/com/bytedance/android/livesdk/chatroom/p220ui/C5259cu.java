package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5730p;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C8397a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.viewmodel.C9140c;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryReviewPending;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cu */
public final class C5259cu implements C5739a {

    /* renamed from: a */
    public final Context f15375a;

    /* renamed from: b */
    public final DataCenter f15376b;

    /* renamed from: a */
    public final void mo8811a(View view, DataCenter dataCenter) {
    }

    /* renamed from: a */
    public final void mo8812a(C5735a aVar) {
    }

    /* renamed from: b */
    public final void mo8813b(View view, DataCenter dataCenter) {
    }

    public final void onClick(View view) {
        C8443c.m25663a().mo21607a("lottery_icon_click", Room.class);
        C9140c cVar = (C9140c) this.f15376b.get("data_lottery_data_model", null);
        if (cVar != null) {
            ILotteryState iLotteryState = (ILotteryState) cVar.mo22344a();
            if (iLotteryState instanceof LotteryReviewPending) {
                C9049ap.m27022a((int) R.string.f6i);
            } else if (iLotteryState instanceof LotteryWaiting) {
                C9097a.m27146a().mo22267a((Object) new C5730p());
            } else {
                try {
                    C3338l<C8397a> lVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
                    C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LOTTERY_CONFIG");
                    C9178j.m27302j().mo22380i().handle(this.f15375a, Uri.parse(((C8397a) lVar.mo10240a()).f23013b));
                } catch (Throwable th) {
                    C8444d.m25673b();
                    C8444d.m11969a(5, th.getStackTrace());
                }
            }
        }
    }

    public C5259cu(Context context, DataCenter dataCenter) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(dataCenter, "dataCenter");
        this.f15375a = context;
        this.f15376b = dataCenter;
    }
}
