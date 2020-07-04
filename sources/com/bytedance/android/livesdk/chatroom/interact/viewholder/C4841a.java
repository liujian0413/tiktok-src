package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.viewholder.a */
final /* synthetic */ class C4841a implements OnClickListener {

    /* renamed from: a */
    private final PKFirstPeriodUserViewHolder f13820a;

    /* renamed from: b */
    private final Room f13821b;

    /* renamed from: c */
    private final RivalExtraInfo f13822c;

    /* renamed from: d */
    private final int f13823d;

    C4841a(PKFirstPeriodUserViewHolder pKFirstPeriodUserViewHolder, Room room, RivalExtraInfo rivalExtraInfo, int i) {
        this.f13820a = pKFirstPeriodUserViewHolder;
        this.f13821b = room;
        this.f13822c = rivalExtraInfo;
        this.f13823d = i;
    }

    public final void onClick(View view) {
        this.f13820a.mo12815a(this.f13821b, this.f13822c, this.f13823d, view);
    }
}
