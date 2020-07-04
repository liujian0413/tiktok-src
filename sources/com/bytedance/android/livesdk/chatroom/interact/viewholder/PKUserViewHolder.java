package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter.C4476a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class PKUserViewHolder extends C1293v {

    /* renamed from: a */
    private final VHeadView f13812a;

    /* renamed from: b */
    private final TextView f13813b;

    /* renamed from: c */
    private final TextView f13814c;

    /* renamed from: d */
    private final Button f13815d;

    /* renamed from: e */
    private final C4476a f13816e;

    /* renamed from: f */
    private final int f13817f;

    /* renamed from: g */
    private final View f13818g;

    /* renamed from: h */
    private int f13819h = 3;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12819a(Room room, View view) {
        this.f13816e.mo12248a(room, this.f13817f, this.f13819h, null, 0);
    }

    public PKUserViewHolder(View view, C4476a aVar, int i) {
        super(view);
        this.f13812a = (VHeadView) view.findViewById(R.id.aum);
        this.f13813b = (TextView) view.findViewById(R.id.dyh);
        this.f13814c = (TextView) view.findViewById(R.id.duj);
        this.f13815d = (Button) view.findViewById(R.id.pe);
        this.f13818g = view.findViewById(R.id.a9q);
        this.f13816e = aVar;
        this.f13817f = i;
    }

    /* renamed from: a */
    public final void mo12818a(PKUserViewHolder pKUserViewHolder, int i, Room room, boolean z, int i2) {
        User owner = room.getOwner();
        if (owner != null) {
            this.f13819h = i2;
            C5343e.m17045b(pKUserViewHolder.f13812a, owner.getAvatarThumb(), pKUserViewHolder.f13812a.getWidth(), pKUserViewHolder.f13812a.getHeight(), R.drawable.c4_);
            pKUserViewHolder.f13813b.setText(owner.getNickName());
            int i3 = 8;
            if (owner.getUserHonor() == null || owner.getUserHonor().mo8703g() == 0) {
                pKUserViewHolder.f13814c.setVisibility(8);
            } else {
                pKUserViewHolder.f13814c.setVisibility(0);
                pKUserViewHolder.f13814c.setText(pKUserViewHolder.f13814c.getContext().getResources().getString(R.string.enz, new Object[]{C3385e.m12591a(owner.getFanTicketCount())}));
            }
            if (room.isWithLinkMic() || !(owner.getLinkMicStats() == 1 || (owner.getLinkMicStats() == 2 && owner.getFollowInfo() != null && owner.getFollowInfo().getFollowStatus() == 2))) {
                pKUserViewHolder.f13815d.setBackgroundResource(R.drawable.bsv);
                pKUserViewHolder.f13815d.setTextColor(Color.parseColor("#b0b0b0"));
            } else {
                pKUserViewHolder.f13815d.setBackgroundResource(R.drawable.btp);
                pKUserViewHolder.f13815d.setTextColor(Color.parseColor("#ffffff"));
            }
            pKUserViewHolder.f13815d.setOnClickListener(new C4842b(this, room));
            View view = pKUserViewHolder.f13818g;
            if (z) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
    }
}
