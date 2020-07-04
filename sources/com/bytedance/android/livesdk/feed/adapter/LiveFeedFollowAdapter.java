package com.bytedance.android.livesdk.feed.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveFeedFollowAdapter extends C1262a<C5930a> {

    /* renamed from: a */
    private final List<Room> f17578a;

    /* renamed from: b */
    private final OnClickListener f17579b;

    /* renamed from: c */
    private int f17580c;

    /* renamed from: d */
    private int f17581d;

    /* renamed from: com.bytedance.android.livesdk.feed.adapter.LiveFeedFollowAdapter$a */
    static class C5930a extends C1293v {

        /* renamed from: a */
        View f17582a;

        /* renamed from: b */
        View f17583b;

        /* renamed from: c */
        View f17584c;

        /* renamed from: d */
        HSImageView f17585d;

        /* renamed from: e */
        TextView f17586e;

        C5930a(View view) {
            super(view);
            this.f17582a = view.findViewById(R.id.blb);
            this.f17583b = view.findViewById(R.id.ctg);
            this.f17584c = view.findViewById(R.id.ii);
            this.f17585d = (HSImageView) view.findViewById(R.id.ic);
            this.f17586e = (TextView) view.findViewById(R.id.c33);
        }
    }

    public int getItemCount() {
        return this.f17578a.size();
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m18570a(viewGroup, i);
    }

    /* renamed from: a */
    private static C5930a m18570a(ViewGroup viewGroup, int i) {
        return new C5930a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ax9, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5930a aVar, int i) {
        int i2;
        int i3;
        String str;
        long j;
        String str2;
        Room room = (Room) this.f17578a.get(i);
        if (room.getOwner() != null) {
            User owner = room.getOwner();
            C3393m.m12620a(aVar.f17585d, owner.getAvatarThumb(), aVar.f17585d.getMeasuredWidth(), aVar.f17585d.getMeasuredHeight());
            aVar.f17586e.setText(owner.getNickName());
        }
        aVar.itemView.setTag(R.id.do6, room);
        aVar.itemView.setOnClickListener(this.f17579b);
        if (this.f17580c <= 0) {
            this.f17580c = (int) C9738o.m28708b(aVar.itemView.getContext(), 12.0f);
            this.f17581d = (int) C9738o.m28708b(aVar.itemView.getContext(), 8.0f);
        }
        LayoutParams layoutParams = aVar.f17582a.getLayoutParams();
        if (i == 0) {
            i2 = this.f17580c;
        } else {
            i2 = this.f17581d;
        }
        layoutParams.width = i2;
        aVar.f17582a.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = aVar.f17583b.getLayoutParams();
        if (i == this.f17578a.size() - 1) {
            i3 = this.f17580c;
        } else {
            i3 = this.f17581d;
        }
        layoutParams2.width = i3;
        aVar.f17583b.setLayoutParams(layoutParams2);
        HashMap hashMap = new HashMap();
        String str3 = "streaming_type";
        if (room.isThirdParty) {
            str = "thirdparty";
        } else {
            str = "general";
        }
        hashMap.put(str3, str);
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live");
        hashMap.put("event_module", "top_follow_shortcut");
        hashMap.put("log_pb", room.getLog_pb());
        String str4 = "anchor_id";
        if (room.getOwner() == null) {
            j = 0;
        } else {
            j = room.getOwner().getId();
        }
        hashMap.put(str4, String.valueOf(j));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("action_type", "click");
        String str5 = "live_type";
        if (room.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap.put(str5, str2);
        C5982b.m18722a("live_show", (Map<String, String>) hashMap);
    }
}
