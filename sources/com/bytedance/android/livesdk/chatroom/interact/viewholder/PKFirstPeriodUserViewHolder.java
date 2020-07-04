package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter.C4476a;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo.TextType;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6600e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class PKFirstPeriodUserViewHolder extends C1293v {

    /* renamed from: a */
    private final VHeadView f13794a;

    /* renamed from: b */
    private final VHeadView f13795b;

    /* renamed from: c */
    private final TextView f13796c;

    /* renamed from: d */
    private final TextView f13797d;

    /* renamed from: e */
    private final TextView f13798e;

    /* renamed from: f */
    private final Button f13799f;

    /* renamed from: g */
    private final TextView f13800g;

    /* renamed from: h */
    private final C4476a f13801h;

    /* renamed from: i */
    private final int f13802i;

    /* renamed from: j */
    private final View f13803j;

    /* renamed from: k */
    private final TextView f13804k;

    /* renamed from: l */
    private View f13805l;

    /* renamed from: m */
    private int f13806m = 1;

    /* renamed from: n */
    private View f13807n;

    /* renamed from: a */
    public final void mo12813a() {
        this.f13803j.setVisibility(8);
    }

    public PKFirstPeriodUserViewHolder(View view, C4476a aVar, int i) {
        super(view);
        this.f13794a = (VHeadView) view.findViewById(R.id.aum);
        this.f13796c = (TextView) view.findViewById(R.id.dyh);
        this.f13797d = (TextView) view.findViewById(R.id.duj);
        this.f13799f = (Button) view.findViewById(R.id.pe);
        this.f13803j = view.findViewById(R.id.a9q);
        this.f13798e = (TextView) view.findViewById(R.id.dns);
        this.f13800g = (TextView) view.findViewById(R.id.e46);
        this.f13795b = (VHeadView) view.findViewById(R.id.aq7);
        this.f13807n = view.findViewById(R.id.do8);
        this.f13805l = view.findViewById(R.id.doj);
        this.f13804k = (TextView) view.findViewById(R.id.dwg);
        this.f13801h = aVar;
        this.f13802i = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12815a(Room room, RivalExtraInfo rivalExtraInfo, int i, View view) {
        this.f13801h.mo12248a(room, this.f13802i, this.f13806m, rivalExtraInfo, i);
    }

    /* renamed from: a */
    public final void mo12814a(PKFirstPeriodUserViewHolder pKFirstPeriodUserViewHolder, int i, Room room, boolean z, int i2, RivalExtraInfo rivalExtraInfo, Boolean bool, int i3, int i4) {
        String str;
        String str2;
        String str3;
        int i5;
        int i6;
        PKFirstPeriodUserViewHolder pKFirstPeriodUserViewHolder2 = pKFirstPeriodUserViewHolder;
        Room room2 = room;
        int i7 = i2;
        RivalExtraInfo rivalExtraInfo2 = rivalExtraInfo;
        int i8 = i3;
        if (room2 != null) {
            User owner = room.getOwner();
            if (owner != null) {
                this.f13806m = i7;
                C5343e.m17045b(pKFirstPeriodUserViewHolder2.f13794a, owner.getAvatarThumb(), pKFirstPeriodUserViewHolder2.f13794a.getWidth(), pKFirstPeriodUserViewHolder2.f13794a.getHeight(), R.drawable.c4_);
                pKFirstPeriodUserViewHolder2.f13796c.setText(owner.getNickName());
                int i9 = 0;
                if (owner.getUserHonor() != null) {
                    pKFirstPeriodUserViewHolder2.f13797d.setVisibility(0);
                    pKFirstPeriodUserViewHolder2.f13797d.setText(pKFirstPeriodUserViewHolder2.f13797d.getContext().getResources().getString(R.string.enz, new Object[]{C3517a.m12958a(owner.getUserHonor().mo8703g())}));
                    pKFirstPeriodUserViewHolder2.f13797d.setTextColor(Color.parseColor("#808080"));
                }
                pKFirstPeriodUserViewHolder2.f13798e.setVisibility(0);
                pKFirstPeriodUserViewHolder2.f13798e.setText(pKFirstPeriodUserViewHolder2.f13798e.getContext().getResources().getString(R.string.eny, new Object[]{C3517a.m12958a((long) room.getUserCount())}));
                this.f13807n.setVisibility(8);
                HashMap hashMap = new HashMap();
                if (owner.getLinkMicStats() != 0) {
                    if (room.getLinkMicInfo() == null) {
                        pKFirstPeriodUserViewHolder2.f13799f.setBackgroundResource(R.drawable.btp);
                        pKFirstPeriodUserViewHolder2.f13799f.setText(R.string.eut);
                        pKFirstPeriodUserViewHolder2.f13799f.setTextColor(Color.parseColor("#ffffff"));
                        hashMap.put("invitee_status", "0");
                    } else {
                        pKFirstPeriodUserViewHolder2.f13799f.setBackgroundResource(R.drawable.bsv);
                        Button button = pKFirstPeriodUserViewHolder2.f13799f;
                        if (i8 == 2) {
                            i6 = R.string.eup;
                        } else {
                            i6 = R.string.euq;
                        }
                        button.setText(i6);
                        pKFirstPeriodUserViewHolder2.f13799f.setTextColor(Color.parseColor("#b0b0b0"));
                        hashMap.put("invitee_status", "1");
                    }
                    pKFirstPeriodUserViewHolder2.f13799f.setVisibility(0);
                    pKFirstPeriodUserViewHolder2.f13800g.setVisibility(8);
                } else {
                    pKFirstPeriodUserViewHolder2.f13799f.setVisibility(8);
                    pKFirstPeriodUserViewHolder2.f13800g.setVisibility(0);
                    TextView textView = pKFirstPeriodUserViewHolder2.f13800g;
                    if (i8 == 2) {
                        i5 = R.string.fee;
                    } else {
                        i5 = R.string.fef;
                    }
                    textView.setText(i5);
                    hashMap.put("invitee_status", "2");
                }
                pKFirstPeriodUserViewHolder2.f13795b.setVisibility(0);
                if (owner.getGender() == 1) {
                    pKFirstPeriodUserViewHolder2.f13795b.setImageResource(R.drawable.c1m);
                } else if (owner.getGender() == 2) {
                    pKFirstPeriodUserViewHolder2.f13795b.setImageResource(R.drawable.c1k);
                } else {
                    pKFirstPeriodUserViewHolder2.f13795b.setVisibility(8);
                }
                this.f13805l.setVisibility(8);
                pKFirstPeriodUserViewHolder2.f13804k.setVisibility(8);
                C8435g gVar = new C8435g();
                if (rivalExtraInfo2 != null) {
                    String str4 = "connection_type";
                    if (this.f13802i == 2) {
                        str = "anchor";
                    } else {
                        str = "manual_pk";
                    }
                    hashMap.put(str4, str);
                    if (room.getOwner() != null) {
                        gVar.mo21596c(room.getOwner().getId());
                    }
                    String str5 = "invitee_list";
                    if (i7 == 1) {
                        str2 = "mutual_follow";
                    } else {
                        str2 = "recommend";
                    }
                    hashMap.put(str5, str2);
                    if (rivalExtraInfo2.f13722b == TextType.Distance.ordinal()) {
                        str3 = "distance";
                    } else if (rivalExtraInfo2.f13722b == TextType.DistanceCity.ordinal()) {
                        str3 = "city";
                    } else {
                        str3 = "money";
                    }
                    hashMap.put("inviter_level", String.valueOf(i4));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(str3, rivalExtraInfo2.f13721a);
                    hashMap.put("anchor_info", new C6600e().mo15979b((Object) hashMap2));
                    C8443c.m25663a().mo21606a("livesdk_connection_invite_show", hashMap, gVar, Room.class);
                }
                pKFirstPeriodUserViewHolder2.f13799f.setOnClickListener(new C4841a(this, room2, rivalExtraInfo2, i4));
                View view = pKFirstPeriodUserViewHolder2.f13803j;
                if (!z) {
                    i9 = 8;
                }
                view.setVisibility(i9);
            }
        }
    }
}
