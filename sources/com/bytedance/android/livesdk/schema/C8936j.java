package com.bytedance.android.livesdk.schema;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.schema.j */
final /* synthetic */ class C8936j implements OnClickListener {

    /* renamed from: a */
    private final RoomActionHandler f24331a;

    /* renamed from: b */
    private final Room f24332b;

    /* renamed from: c */
    private final C8933a f24333c;

    C8936j(RoomActionHandler roomActionHandler, Room room, C8933a aVar) {
        this.f24331a = roomActionHandler;
        this.f24332b = room;
        this.f24333c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f24331a.lambda$handleEnterRoom$3$RoomActionHandler(this.f24332b, this.f24333c, dialogInterface, i);
    }
}
