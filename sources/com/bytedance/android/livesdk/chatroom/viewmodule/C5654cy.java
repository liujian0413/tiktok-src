package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cy */
final /* synthetic */ class C5654cy implements OnClickListener {

    /* renamed from: a */
    private final LinkPKWidget f16728a;

    /* renamed from: b */
    private final PkState f16729b;

    C5654cy(LinkPKWidget linkPKWidget, PkState pkState) {
        this.f16728a = linkPKWidget;
        this.f16729b = pkState;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16728a.mo13881a(this.f16729b, dialogInterface, i);
    }
}
