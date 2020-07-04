package com.bytedance.android.livesdk;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.k */
final /* synthetic */ class C6132k implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomFragment f18081a;

    /* renamed from: b */
    private final Room f18082b;

    C6132k(LiveRoomFragment liveRoomFragment, Room room) {
        this.f18081a = liveRoomFragment;
        this.f18082b = room;
    }

    public final void onClick(View view) {
        this.f18081a.mo11351a(this.f18082b, view);
    }
}
