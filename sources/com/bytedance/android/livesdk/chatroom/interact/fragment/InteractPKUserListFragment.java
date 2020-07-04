package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKFirstPeriodUserAdapter;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter.C4476a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract.C4515a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract.View;
import com.bytedance.android.livesdk.chatroom.interact.model.C4817b;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo.TextType;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4549au;
import com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout;
import com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.C4833b;
import com.bytedance.android.livesdk.chatroom.interact.viewholder.PKExpandCollapseViewHolder.C4840a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.google.gson.C6600e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class InteractPKUserListFragment extends View implements C4476a, C4840a {

    /* renamed from: e */
    public int f13676e;

    /* renamed from: f */
    public PkInviteUserListRefreshLayout f13677f;

    /* renamed from: g */
    public TextView f13678g;

    /* renamed from: h */
    public android.view.View f13679h;

    /* renamed from: i */
    public Boolean f13680i;

    /* renamed from: j */
    public Boolean f13681j;

    /* renamed from: k */
    private RecyclerView f13682k;

    /* renamed from: l */
    private C1262a<C1293v> f13683l;

    /* renamed from: m */
    private DataCenter f13684m;

    /* renamed from: q */
    private boolean f13685q;

    /* renamed from: r */
    private android.view.View f13686r;

    /* renamed from: s */
    private android.view.View f13687s;

    /* renamed from: t */
    private int f13688t;

    /* renamed from: c */
    public final float mo12280c() {
        return 432.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ewp);
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        if (this.f13676e == 1) {
            return this.f13116a.mo12148b();
        }
        return null;
    }

    public void onResume() {
        super.onResume();
        C4515a aVar = (C4515a) this.f13118c;
        int i = 2;
        if (this.f13676e == 2) {
            i = 1;
        }
        aVar.mo12328a(i);
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13676e == 1) {
            return null;
        }
        if (!this.f13685q) {
            return super.mo12282e();
        }
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        inflate.setOnClickListener(new C4807k(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo12246a(int i) {
        if (this.f13683l != null) {
            this.f13683l.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12761a(android.view.View view) {
        this.f13116a.mo12147a(InteractSettingsFragment.m15828a(this.f13116a));
    }

    /* renamed from: a */
    public final void mo12324a(C4817b bVar) {
        if (this.f10103o) {
            if (this.f13116a.mo12151c() != null) {
                long id = this.f13116a.mo12151c().getId();
                if (bVar.f13730d != null) {
                    bVar.f13730d.get(Long.valueOf(id));
                }
            }
            if (bVar == null || (C6311g.m19573a(bVar.f13727a) && C6311g.m19573a(bVar.f13728b))) {
                this.f13682k.setVisibility(8);
            } else {
                ((PKUserAdapter) this.f13683l).mo12247a(bVar.f13727a, bVar.f13728b);
                this.f13683l.notifyDataSetChanged();
            }
            this.f13677f.setVisibility(0);
            this.f13686r.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo12327a(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
        }
    }

    /* renamed from: a */
    public static InteractPKUserListFragment m15811a(C4522b bVar, int i, DataCenter dataCenter) {
        return m15812a(bVar, i, dataCenter, false);
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13687s = layoutInflater.inflate(R.layout.aqc, viewGroup, false);
        this.f13682k = (RecyclerView) this.f13687s.findViewById(R.id.cqp);
        this.f13677f = (PkInviteUserListRefreshLayout) this.f13687s.findViewById(R.id.cc0);
        this.f13678g = (TextView) this.f13687s.findViewById(R.id.e0g);
        this.f13679h = this.f13687s.findViewById(R.id.cbz);
        this.f13686r = this.f13687s.findViewById(R.id.cir);
        this.f13680i = Boolean.valueOf(true);
        this.f13681j = Boolean.valueOf(false);
        this.f13677f.setOnRefreshListener(new C4833b() {
            /* renamed from: c */
            public final void mo12764c() {
                InteractPKUserListFragment.this.f13680i = Boolean.valueOf(true);
            }

            /* renamed from: a */
            public final void mo12762a() {
                if (InteractPKUserListFragment.this.f13680i.booleanValue()) {
                    InteractPKUserListFragment.this.f13679h.setVisibility(0);
                    InteractPKUserListFragment.this.f13678g.setVisibility(8);
                    InteractPKUserListFragment.this.f13680i = Boolean.valueOf(false);
                }
            }

            /* renamed from: b */
            public final void mo12763b() {
                int i = 1;
                InteractPKUserListFragment.this.f13681j = Boolean.valueOf(true);
                C4515a aVar = (C4515a) InteractPKUserListFragment.this.f13118c;
                if (InteractPKUserListFragment.this.f13676e != 2) {
                    i = 2;
                }
                aVar.mo12328a(i);
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        if (InteractPKUserListFragment.this.f13681j.booleanValue()) {
                            InteractPKUserListFragment.this.f13677f.mo12785a();
                            InteractPKUserListFragment.this.f13681j = Boolean.valueOf(false);
                        }
                    }
                }, 6000);
            }
        });
        this.f13682k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f13688t = ((Integer) LiveSettingKeys.PK_RECOMMEND_AND_LINEKMIC_OPTMIZE.mo10240a()).intValue();
        if ((this.f13676e == 1 && (this.f13688t == 2 || this.f13688t == 3)) || (this.f13676e == 2 && (this.f13688t == 1 || this.f13688t == 3))) {
            this.f13683l = new PKFirstPeriodUserAdapter(getContext(), this, this, this.f13676e);
            this.f13677f.setmIsDisable(false);
        } else {
            this.f13686r.setVisibility(8);
            this.f13683l = new PKUserAdapter(getContext(), this);
            this.f13677f.setmIsDisable(true);
        }
        this.f13682k.setAdapter(this.f13683l);
        return this.f13687s;
    }

    /* renamed from: a */
    public final void mo12325a(Room room, RivalExtraInfo rivalExtraInfo, int i) {
        String str;
        if (this.f10103o) {
            this.f13119d.f11680r = 0;
            C4522b bVar = this.f13116a;
            C4522b bVar2 = this.f13116a;
            if (this.f13676e == 1) {
                str = (String) C8946b.f24396aU.mo22117a();
            } else {
                str = getString(R.string.eou);
            }
            bVar.mo12147a(InteractPKInviteFragment.m15748a(bVar2, 0, str, room.getOwner(), this.f13119d.f11665c, room.getId(), this.f13684m));
            m15813b(room, null, rivalExtraInfo, i);
        }
    }

    /* renamed from: a */
    public static InteractPKUserListFragment m15812a(C4522b bVar, int i, DataCenter dataCenter, boolean z) {
        InteractPKUserListFragment interactPKUserListFragment = new InteractPKUserListFragment();
        interactPKUserListFragment.f13118c = new C4549au(interactPKUserListFragment);
        interactPKUserListFragment.f13116a = bVar;
        interactPKUserListFragment.f13676e = i;
        interactPKUserListFragment.f13684m = dataCenter;
        interactPKUserListFragment.f13685q = z;
        return interactPKUserListFragment;
    }

    /* renamed from: b */
    private void m15813b(Room room, Throwable th, RivalExtraInfo rivalExtraInfo, int i) {
        String str;
        HashMap hashMap = new HashMap();
        C8435g gVar = new C8435g();
        if (th == null) {
            hashMap.put("invitee_status", "0");
        } else {
            if ((th instanceof ApiServerException) && ((ApiServerException) th).getErrorCode() == 31002) {
                hashMap.put("invitee_status", "1");
            }
            hashMap.put("invitee_status", "2");
        }
        if (!(room == null || room.getOwner() == null)) {
            gVar.mo21596c(room.getOwner().getId());
        }
        hashMap.put("is_oncemore", "0");
        hashMap.put("pk_time", String.valueOf(C8946b.f24390aO.mo22117a()));
        if (rivalExtraInfo != null) {
            if (rivalExtraInfo.f13722b == TextType.Distance.ordinal()) {
                str = "distance";
            } else if (rivalExtraInfo.f13722b == TextType.DistanceCity.ordinal()) {
                str = "city";
            } else {
                str = "money";
            }
            hashMap.put("inviter_level", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, rivalExtraInfo.f13721a);
            hashMap.put("anchor_info", new C6600e().mo15979b((Object) hashMap2));
        }
        C8443c.m25663a().mo21606a("connection_invite", hashMap, new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), gVar.mo21594b(this.f13116a.mo12151c().getOwner().getId()).mo21595b((String) C8946b.f24396aU.mo22117a()).mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
    }

    /* renamed from: a */
    public final void mo12326a(Room room, Throwable th, RivalExtraInfo rivalExtraInfo, int i) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            m15813b(room, th, rivalExtraInfo, i);
        }
    }

    /* renamed from: a */
    public final void mo12248a(Room room, int i, int i2, RivalExtraInfo rivalExtraInfo, int i3) {
        if (this.f13116a.mo12151c() != null) {
            LinkCrossRoomDataHolder.m13782a().f11669g = (long) i2;
            TTLiveSDKContext.getHostService().mo22361b();
            if (this.f13676e == 2) {
                ((C4515a) this.f13118c).mo12329a(room, this.f13116a.mo12151c().getId(), rivalExtraInfo, i2, i3);
                return;
            }
            ((C4515a) this.f13118c).mo12330a(room, this.f13116a.mo12151c().getId(), (String) C8946b.f24396aU.mo22117a(), ((Integer) C8946b.f24390aO.mo22117a()).intValue(), i2, rivalExtraInfo, i3);
        }
    }
}
