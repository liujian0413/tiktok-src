package com.bytedance.android.livesdk.chatroom.p220ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3389i;
import com.bytedance.android.live.core.utils.p158a.C3353i;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter */
public class LinkInRoomVideoListAdapter extends C1262a<C5092c> {

    /* renamed from: a */
    public C5091b f14623a;

    /* renamed from: b */
    private OnClickListener f14624b = new OnClickListener() {
        public final void onClick(View view) {
            if (LinkInRoomVideoListAdapter.this.f14623a != null && view.getTag() != null) {
                LinkInRoomVideoListAdapter.this.f14623a.mo13231c(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: c */
    private OnClickListener f14625c = new OnClickListener() {
        public final void onClick(View view) {
            if (LinkInRoomVideoListAdapter.this.f14623a != null && view.getTag() != null) {
                LinkInRoomVideoListAdapter.this.f14623a.mo13232d(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: d */
    private OnClickListener f14626d = C5219bm.f15315a;

    /* renamed from: e */
    private List<C4854e> f14627e;

    /* renamed from: f */
    private int f14628f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter$a */
    static class C5090a extends C5092c {

        /* renamed from: a */
        View f14631a;

        /* renamed from: b */
        View f14632b;

        C5090a(View view) {
            super(view);
            this.f14631a = view.findViewById(R.id.a14);
            this.f14632b = view.findViewById(R.id.a9a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter$b */
    public interface C5091b {
        /* renamed from: c */
        void mo13231c(long j);

        /* renamed from: d */
        void mo13232d(long j);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter$c */
    static class C5092c extends C1293v {

        /* renamed from: c */
        AvatarIconView f14633c;

        /* renamed from: d */
        ImageView f14634d;

        /* renamed from: e */
        TextView f14635e;

        /* renamed from: f */
        TextView f14636f;

        C5092c(View view) {
            super(view);
            this.f14633c = (AvatarIconView) view.findViewById(R.id.j5);
            this.f14634d = (ImageView) view.findViewById(R.id.avv);
            this.f14635e = (TextView) view.findViewById(R.id.c33);
            this.f14636f = (TextView) view.findViewById(R.id.a7m);
        }
    }

    public int getItemCount() {
        return this.f14627e.size();
    }

    /* renamed from: b */
    public final int mo13227b() {
        int i = 0;
        for (C4854e eVar : this.f14627e) {
            if (1 == eVar.f13873f) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final int mo13225a() {
        int i = 0;
        for (C4854e eVar : this.f14627e) {
            if (2 == eVar.f13873f) {
                i++;
            }
        }
        return i;
    }

    public int getItemViewType(int i) {
        return this.f14628f;
    }

    /* renamed from: a */
    static final /* synthetic */ void m16426a(View view) {
        Object a = C3353i.m12502a(view, String.valueOf(view.getId()));
        if (a != null) {
            C9097a.m27146a().mo22267a((Object) new UserProfileEvent((User) a, "guest_waiting_list"));
        }
    }

    /* renamed from: b */
    public final void mo13228b(long j) {
        int size = this.f14627e.size();
        if (size > 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C4854e eVar = (C4854e) this.f14627e.get(i2);
                if (eVar != null && eVar.f13871d != null && eVar.f13871d.getId() == j) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0 && i < size) {
                this.f14627e.remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo13226a(long j) {
        int size = this.f14627e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C4854e eVar = (C4854e) this.f14627e.get(i);
            if (eVar != null && eVar.f13871d != null && eVar.f13871d.getId() == j) {
                eVar.f13873f = 2;
                eVar.f13872e = System.currentTimeMillis() / 1000;
                break;
            }
            i++;
        }
        notifyItemChanged(i);
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16425a(viewGroup, i);
    }

    /* renamed from: a */
    private static C5092c m16425a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C5090a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.as6, null));
        }
        return new C5092c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.as5, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5092c cVar, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        C4854e eVar = (C4854e) this.f14627e.get(i);
        if (eVar != null && eVar.f13871d != null) {
            User user = eVar.f13871d;
            cVar.f14633c.setAvatar(user.getAvatarMedium());
            if (user.getUserHonor() != null) {
                cVar.f14633c.setIcon(user.getUserHonor().mo8708l());
            }
            C3353i.m12504a(cVar.f14633c, String.valueOf(cVar.f14633c.getId()), user);
            cVar.f14633c.setOnClickListener(this.f14626d);
            cVar.f14635e.setText(user.getNickName());
            boolean z2 = true;
            if (eVar.f13876i > 0) {
                str = C3358ac.m12517a((int) R.string.exq, Integer.valueOf(eVar.f13876i));
            } else {
                int a = C9048ao.m27014a((int) ((System.currentTimeMillis() / 1000) - eVar.f13872e));
                if (2 == eVar.f13873f) {
                    i3 = R.string.cvs;
                } else {
                    i3 = R.string.cx3;
                }
                str = C3389i.m12608a(i3, Integer.valueOf(a), Integer.valueOf(a));
            }
            cVar.f14636f.setText(str);
            if (cVar instanceof C5090a) {
                C5090a aVar = (C5090a) cVar;
                if (1 == eVar.f13873f) {
                    z = false;
                } else {
                    if (2 == eVar.f13873f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = false;
                }
                View view = aVar.f14631a;
                int i4 = 8;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                View view2 = aVar.f14632b;
                if (z) {
                    i4 = 0;
                }
                view2.setVisibility(i4);
                aVar.f14631a.setTag(Long.valueOf(user.getId()));
                aVar.f14631a.setOnClickListener(this.f14624b);
                aVar.f14632b.setTag(Long.valueOf(user.getId()));
                aVar.f14632b.setOnClickListener(this.f14625c);
            }
        }
    }

    public LinkInRoomVideoListAdapter(C5091b bVar, List<C4854e> list, int i) {
        this.f14623a = bVar;
        if (list != null) {
            this.f14627e = list;
            if (i == 0 || i == 1) {
                this.f14628f = i;
                return;
            }
            throw new IllegalArgumentException("Type must be 1 for anchor or 2 for audience.");
        }
        throw new RuntimeException("List can not be null.");
    }
}
