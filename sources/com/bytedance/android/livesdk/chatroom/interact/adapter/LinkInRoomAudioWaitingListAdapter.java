package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class LinkInRoomAudioWaitingListAdapter extends C1262a<C4475b> {

    /* renamed from: a */
    public C4474a f13032a;

    /* renamed from: b */
    private OnClickListener f13033b = new OnClickListener() {
        public final void onClick(View view) {
            if (LinkInRoomAudioWaitingListAdapter.this.f13032a != null && view.getTag() != null) {
                LinkInRoomAudioWaitingListAdapter.this.f13032a.mo12243a(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: c */
    private OnClickListener f13034c = new OnClickListener() {
        public final void onClick(View view) {
            if (LinkInRoomAudioWaitingListAdapter.this.f13032a != null && view.getTag() != null) {
                LinkInRoomAudioWaitingListAdapter.this.f13032a.mo12244b(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: d */
    private OnClickListener f13035d = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null) {
                C9097a.m27146a().mo22267a((Object) new UserProfileEvent((User) view.getTag(R.id.at9), "guest_waiting_list"));
            }
        }
    };

    /* renamed from: e */
    private List<C4854e> f13036e;

    /* renamed from: f */
    private boolean f13037f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$a */
    public interface C4474a {
        /* renamed from: a */
        void mo12243a(long j);

        /* renamed from: b */
        void mo12244b(long j);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$b */
    static class C4475b extends C1293v {

        /* renamed from: a */
        HSImageView f13041a;

        /* renamed from: b */
        TextView f13042b;

        /* renamed from: c */
        TextView f13043c;

        /* renamed from: d */
        TextView f13044d;

        /* renamed from: e */
        TextView f13045e;

        C4475b(View view) {
            super(view);
            this.f13041a = (HSImageView) view.findViewById(R.id.at9);
            this.f13042b = (TextView) view.findViewById(R.id.ata);
            this.f13043c = (TextView) view.findViewById(R.id.a7m);
            this.f13044d = (TextView) view.findViewById(R.id.cah);
            this.f13045e = (TextView) view.findViewById(R.id.a9b);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
            if (r9.f13873f == 2) goto L_0x005b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo12245a(com.bytedance.android.livesdk.chatroom.model.p219a.C4854e r9, boolean r10) {
            /*
                r8 = this;
                com.bytedance.android.live.core.widget.HSImageView r0 = r8.f13041a
                com.bytedance.android.live.base.model.user.User r1 = r9.f13871d
                com.bytedance.android.live.base.model.ImageModel r1 = r1.getAvatarMedium()
                com.bytedance.android.livesdk.chatroom.utils.C5343e.m17038a(r0, r1)
                android.widget.TextView r0 = r8.f13042b
                com.bytedance.android.live.base.model.user.User r1 = r9.f13871d
                java.lang.String r1 = r1.getNickName()
                r0.setText(r1)
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                long r2 = r9.f13872e
                long r0 = r0 - r2
                int r0 = (int) r0
                int r0 = com.bytedance.android.livesdk.utils.C9048ao.m27014a(r0)
                int r1 = r9.f13873f
                r2 = 2
                if (r2 != r1) goto L_0x002e
                r1 = 2131825486(0x7f11134e, float:1.928383E38)
                goto L_0x0031
            L_0x002e:
                r1 = 2131825535(0x7f11137f, float:1.9283929E38)
            L_0x0031:
                android.widget.TextView r3 = r8.f13043c
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r7 = 0
                r5[r7] = r6
                java.lang.String r0 = com.bytedance.android.live.core.utils.C3358ac.m12516a(r1, r0, r5)
                r3.setText(r0)
                r0 = 8
                if (r10 == 0) goto L_0x005b
                int r10 = r9.f13873f
                if (r10 != r4) goto L_0x0057
                android.widget.TextView r10 = r8.f13044d
                r10.setVisibility(r7)
                android.widget.TextView r10 = r8.f13045e
                r10.setVisibility(r0)
                goto L_0x0065
            L_0x0057:
                int r10 = r9.f13873f
                if (r10 != r2) goto L_0x0065
            L_0x005b:
                android.widget.TextView r10 = r8.f13044d
                r10.setVisibility(r0)
                android.widget.TextView r10 = r8.f13045e
                r10.setVisibility(r7)
            L_0x0065:
                com.bytedance.android.live.core.widget.HSImageView r10 = r8.f13041a
                r0 = 2131298363(0x7f09083b, float:1.8214697E38)
                com.bytedance.android.live.base.model.user.User r1 = r9.f13871d
                r10.setTag(r0, r1)
                android.widget.TextView r10 = r8.f13044d
                com.bytedance.android.live.base.model.user.User r0 = r9.f13871d
                long r0 = r0.getId()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r10.setTag(r0)
                android.widget.TextView r10 = r8.f13045e
                com.bytedance.android.live.base.model.user.User r9 = r9.f13871d
                long r0 = r9.getId()
                java.lang.Long r9 = java.lang.Long.valueOf(r0)
                r10.setTag(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.C4475b.mo12245a(com.bytedance.android.livesdk.chatroom.model.a.e, boolean):void");
        }
    }

    public int getItemCount() {
        return this.f13036e.size();
    }

    /* renamed from: b */
    public final int mo12238b() {
        int i = 0;
        for (C4854e eVar : this.f13036e) {
            if (1 == eVar.f13873f) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final int mo12236a() {
        int i = 0;
        for (C4854e eVar : this.f13036e) {
            if (2 == eVar.f13873f) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final void mo12239b(long j) {
        int size = this.f13036e.size();
        if (size > 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C4854e eVar = (C4854e) this.f13036e.get(i2);
                if (eVar != null && eVar.f13871d != null && eVar.f13871d.getId() == j) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0 && i < size) {
                this.f13036e.remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo12237a(long j) {
        int size = this.f13036e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C4854e eVar = (C4854e) this.f13036e.get(i);
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
        return m14962a(viewGroup, i);
    }

    /* renamed from: a */
    private static C4475b m14962a(ViewGroup viewGroup, int i) {
        return new C4475b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at4, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C4475b bVar, int i) {
        bVar.mo12245a((C4854e) this.f13036e.get(i), this.f13037f);
        bVar.f13041a.setOnClickListener(this.f13035d);
        bVar.f13044d.setOnClickListener(this.f13033b);
        bVar.f13045e.setOnClickListener(this.f13034c);
    }

    public LinkInRoomAudioWaitingListAdapter(C4474a aVar, List<C4854e> list, boolean z) {
        this.f13037f = z;
        this.f13032a = aVar;
        if (list != null) {
            this.f13036e = list;
            return;
        }
        throw new RuntimeException("List can not be null.");
    }
}
