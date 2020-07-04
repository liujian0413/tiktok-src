package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.viewholder.b */
final /* synthetic */ class C4842b implements OnClickListener {

    /* renamed from: a */
    private final PKUserViewHolder f13824a;

    /* renamed from: b */
    private final Room f13825b;

    C4842b(PKUserViewHolder pKUserViewHolder, Room room) {
        this.f13824a = pKUserViewHolder;
        this.f13825b = room;
    }

    public final void onClick(View view) {
        this.f13824a.mo12819a(this.f13825b, view);
    }
}
