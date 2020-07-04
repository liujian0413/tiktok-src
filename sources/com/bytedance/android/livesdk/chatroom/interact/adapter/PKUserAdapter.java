package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKTitleViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKUserViewHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class PKUserAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    private List<Room> f13060a;

    /* renamed from: b */
    private List<Room> f13061b;

    /* renamed from: c */
    private Context f13062c;

    /* renamed from: d */
    private C4476a f13063d;

    /* renamed from: e */
    private int f13064e;

    /* renamed from: f */
    private int f13065f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter$a */
    public interface C4476a {
        /* renamed from: a */
        void mo12248a(Room room, int i, int i2, RivalExtraInfo rivalExtraInfo, int i3);
    }

    public int getItemCount() {
        if (C6311g.m19573a(this.f13060a) && C6311g.m19573a(this.f13061b)) {
            return 0;
        }
        if (this.f13065f == 0) {
            return this.f13064e;
        }
        if (this.f13064e == 0) {
            return this.f13065f + 1;
        }
        return this.f13065f + this.f13064e + 2;
    }

    public int getItemViewType(int i) {
        if (this.f13065f == 0) {
            return 4;
        }
        if (i == 0) {
            return 1;
        }
        if (i <= this.f13065f) {
            return 2;
        }
        if (i == this.f13065f + 1) {
            return 3;
        }
        return 4;
    }

    /* renamed from: a */
    private int m14974a(int i) {
        if (C6311g.m19573a(this.f13060a) && C6311g.m19573a(this.f13061b)) {
            return 0;
        }
        if (this.f13065f == 0) {
            return i;
        }
        if (this.f13064e == 0) {
            return i - 1;
        }
        if (i <= this.f13065f) {
            return i - 1;
        }
        return (i - this.f13065f) - 2;
    }

    public PKUserAdapter(Context context, C4476a aVar) {
        this.f13062c = context;
        this.f13063d = aVar;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3 || i == 1) {
            return new PKTitleViewHolder(LayoutInflater.from(this.f13062c).inflate(R.layout.as_, viewGroup, false), i);
        }
        return new PKUserViewHolder(LayoutInflater.from(this.f13062c).inflate(R.layout.asa, viewGroup, false), this.f13063d, i);
    }

    /* renamed from: a */
    public final void mo12247a(List<Room> list, List<Room> list2) {
        this.f13060a = list;
        this.f13061b = list2;
        if (!C6311g.m19573a(this.f13060a)) {
            this.f13064e = this.f13060a.size();
        }
        if (!C6311g.m19573a(this.f13061b)) {
            this.f13065f = this.f13061b.size();
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        boolean z;
        boolean z2;
        if (getItemViewType(i) == 4) {
            if (m14974a(i) >= 0 && m14974a(i) < this.f13060a.size()) {
                PKUserViewHolder pKUserViewHolder = (PKUserViewHolder) vVar;
                Room room = (Room) this.f13060a.get(m14974a(i));
                if (i < getItemCount() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                pKUserViewHolder.mo12818a(pKUserViewHolder, i, room, z2, 4);
            }
        } else if (getItemViewType(i) == 2) {
            if (m14974a(i) >= 0 && m14974a(i) < this.f13061b.size()) {
                PKUserViewHolder pKUserViewHolder2 = (PKUserViewHolder) vVar;
                Room room2 = (Room) this.f13061b.get(m14974a(i));
                if (i < this.f13065f) {
                    z = true;
                } else {
                    z = false;
                }
                pKUserViewHolder2.mo12818a(pKUserViewHolder2, i, room2, z, 3);
            }
        } else if (getItemViewType(i) == 3) {
            ((PKTitleViewHolder) vVar).mo12817a(this.f13062c.getString(R.string.eva));
        } else if (getItemViewType(i) == 1) {
            ((PKTitleViewHolder) vVar).mo12817a(this.f13062c.getString(R.string.ewo));
        }
    }
}
