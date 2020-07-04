package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter.C4476a;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKExpandCollapseViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKExpandCollapseViewHolder.C4840a;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKFirstPeriodUserViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKNoMutualFollowedViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKTitleViewHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PKFirstPeriodUserAdapter extends C1262a<C1293v> implements C4840a {

    /* renamed from: a */
    private final int f13046a;

    /* renamed from: b */
    private List<Room> f13047b;

    /* renamed from: c */
    private List<Room> f13048c;

    /* renamed from: d */
    private HashMap<Long, RivalExtraInfo> f13049d;

    /* renamed from: e */
    private Context f13050e;

    /* renamed from: f */
    private C4476a f13051f;

    /* renamed from: g */
    private int f13052g;

    /* renamed from: h */
    private int f13053h;

    /* renamed from: i */
    private int f13054i = 1;

    /* renamed from: j */
    private C4840a f13055j;

    /* renamed from: k */
    private boolean f13056k;

    /* renamed from: l */
    private boolean f13057l;

    /* renamed from: m */
    private PKFirstPeriodUserViewHolder f13058m;

    /* renamed from: n */
    private int f13059n;

    /* renamed from: a */
    private void m14971a() {
        if (!C6311g.m19573a(this.f13048c)) {
            int i = 0;
            while (true) {
                if (i >= this.f13048c.size()) {
                    break;
                } else if (((Room) this.f13048c.get(i)).getOwner().getLinkMicStats() == 0 || ((Room) this.f13048c.get(i)).getLinkMicInfo() != null) {
                    this.f13054i = i;
                } else {
                    i++;
                }
            }
            this.f13054i = i;
            if (this.f13053h == 0) {
                this.f13054i = 1;
                this.f13057l = true;
            } else if (i == this.f13053h || i == this.f13053h - 1) {
                this.f13057l = true;
                this.f13054i = this.f13053h + 1;
            } else {
                this.f13057l = false;
                this.f13054i += 2;
            }
        } else {
            this.f13057l = true;
            this.f13054i = 1;
        }
    }

    public int getItemCount() {
        if (C6311g.m19573a(this.f13047b) && C6311g.m19573a(this.f13048c)) {
            return 1;
        }
        if (this.f13057l) {
            if (C6311g.m19573a(this.f13047b)) {
                return this.f13053h + this.f13052g + 1;
            }
            return this.f13053h + this.f13052g + 2;
        } else if (this.f13056k) {
            if (C6311g.m19573a(this.f13047b)) {
                return this.f13053h + this.f13052g + 2;
            }
            return this.f13053h + this.f13052g + 3;
        } else if (C6311g.m19573a(this.f13047b)) {
            return this.f13054i + this.f13052g + 1;
        } else {
            return this.f13054i + this.f13052g + 2;
        }
    }

    /* renamed from: a */
    public final void mo12246a(int i) {
        if (this.f13056k) {
            m14971a();
            this.f13056k = false;
        } else {
            this.f13054i = this.f13053h + 1;
            this.f13056k = true;
        }
        this.f13055j.mo12246a(i);
    }

    /* renamed from: b */
    private int m14972b(int i) {
        if (C6311g.m19573a(this.f13047b) && C6311g.m19573a(this.f13048c)) {
            return 0;
        }
        if (i < this.f13054i) {
            return i - 1;
        }
        if (i > this.f13054i + 1 && !this.f13057l) {
            return (i - this.f13054i) - 2;
        }
        if (i <= this.f13054i || !this.f13057l) {
            return 0;
        }
        return (i - this.f13054i) - 1;
    }

    public int getItemViewType(int i) {
        if (i == 0 && this.f13053h == 0) {
            return 7;
        }
        if (i == 0) {
            return 1;
        }
        if (i == this.f13054i && this.f13057l) {
            return 3;
        }
        if (i > this.f13054i && this.f13057l) {
            return 4;
        }
        if (i == this.f13054i) {
            return 5;
        }
        if (i == this.f13054i + 1) {
            return 3;
        }
        if (i > this.f13054i + 1) {
            return 4;
        }
        return 2;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3 || i == 1) {
            return new PKTitleViewHolder(LayoutInflater.from(this.f13050e).inflate(R.layout.as_, viewGroup, false), i);
        }
        if (i == 6) {
            return new PKExpandCollapseViewHolder(LayoutInflater.from(this.f13050e).inflate(R.layout.as8, viewGroup, false), this, 0);
        }
        if (i == 5) {
            return new PKExpandCollapseViewHolder(LayoutInflater.from(this.f13050e).inflate(R.layout.as8, viewGroup, false), this, 2);
        }
        if (i == 7) {
            return new PKNoMutualFollowedViewHolder(LayoutInflater.from(this.f13050e).inflate(R.layout.as9, viewGroup, false), 1);
        }
        return new PKFirstPeriodUserViewHolder(LayoutInflater.from(this.f13050e).inflate(R.layout.asa, viewGroup, false), this.f13051f, i);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        String str;
        String str2;
        RivalExtraInfo rivalExtraInfo;
        RivalExtraInfo rivalExtraInfo2;
        int i2 = i;
        long j = -1;
        boolean z = true;
        if (getItemViewType(i2) == 4 && this.f13047b != null) {
            int b = m14972b(i2);
            if (b >= 0 && b < this.f13047b.size()) {
                PKFirstPeriodUserViewHolder pKFirstPeriodUserViewHolder = (PKFirstPeriodUserViewHolder) vVar;
                Room room = (Room) this.f13047b.get(b);
                if (i2 >= getItemCount() - 1) {
                    z = false;
                }
                if (this.f13049d != null) {
                    HashMap<Long, RivalExtraInfo> hashMap = this.f13049d;
                    if (this.f13047b.get(b) != null) {
                        j = ((Room) this.f13047b.get(b)).getId();
                    }
                    rivalExtraInfo2 = (RivalExtraInfo) hashMap.get(Long.valueOf(j));
                } else {
                    rivalExtraInfo2 = null;
                }
                pKFirstPeriodUserViewHolder.mo12814a(pKFirstPeriodUserViewHolder, i, room, z, 2, rivalExtraInfo2, Boolean.valueOf(false), this.f13046a, this.f13059n);
            }
        } else if (getItemViewType(i2) == 2 && this.f13048c != null) {
            int b2 = m14972b(i2);
            if (b2 >= 0 && b2 < this.f13048c.size()) {
                PKFirstPeriodUserViewHolder pKFirstPeriodUserViewHolder2 = (PKFirstPeriodUserViewHolder) vVar;
                Room room2 = (Room) this.f13048c.get(b2);
                if (i2 >= this.f13053h) {
                    z = false;
                }
                if (this.f13049d != null) {
                    HashMap<Long, RivalExtraInfo> hashMap2 = this.f13049d;
                    if (this.f13048c.get(b2) != null) {
                        j = ((Room) this.f13048c.get(b2)).getId();
                    }
                    rivalExtraInfo = (RivalExtraInfo) hashMap2.get(Long.valueOf(j));
                } else {
                    rivalExtraInfo = null;
                }
                pKFirstPeriodUserViewHolder2.mo12814a(pKFirstPeriodUserViewHolder2, i, room2, z, 1, rivalExtraInfo, Boolean.valueOf(false), this.f13046a, this.f13059n);
                this.f13058m = pKFirstPeriodUserViewHolder2;
            }
        } else if (getItemViewType(i2) == 3) {
            ((PKTitleViewHolder) vVar).mo12817a(this.f13050e.getString(R.string.ez_));
        } else if (getItemViewType(i2) == 1) {
            ((PKTitleViewHolder) vVar).mo12817a(this.f13050e.getString(R.string.esa));
        } else {
            int itemViewType = getItemViewType(i2);
            int i3 = R.drawable.cfk;
            if (itemViewType == 6) {
                PKExpandCollapseViewHolder pKExpandCollapseViewHolder = (PKExpandCollapseViewHolder) vVar;
                if (this.f13056k) {
                    str2 = this.f13050e.getString(R.string.f5k);
                } else {
                    str2 = this.f13050e.getString(R.string.f5l);
                }
                if (this.f13056k) {
                    i3 = R.drawable.cfj;
                }
                pKExpandCollapseViewHolder.mo12811a(str2, i3);
                return;
            }
            if (getItemViewType(i2) == 5) {
                PKExpandCollapseViewHolder pKExpandCollapseViewHolder2 = (PKExpandCollapseViewHolder) vVar;
                if (this.f13056k) {
                    str = this.f13050e.getString(R.string.f5k);
                } else {
                    str = this.f13050e.getString(R.string.f5l);
                }
                if (this.f13056k) {
                    i3 = R.drawable.cfj;
                }
                pKExpandCollapseViewHolder2.mo12811a(str, i3);
                if (this.f13058m != null) {
                    this.f13058m.mo12813a();
                }
            } else if (getItemViewType(i2) == 7) {
                ((PKNoMutualFollowedViewHolder) vVar).mo12816a(this.f13050e.getString(R.string.eye));
            }
        }
    }

    public PKFirstPeriodUserAdapter(Context context, C4476a aVar, C4840a aVar2, int i) {
        this.f13050e = context;
        this.f13051f = aVar;
        this.f13055j = aVar2;
        this.f13047b = new LinkedList();
        this.f13048c = new LinkedList();
        this.f13046a = i;
    }
}
