package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.C4510a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.View;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4492a;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4499h.C4500a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4534af;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class InteractPKMatchFragment extends View implements OnClickListener {

    /* renamed from: e */
    private TextView f13632e;

    /* renamed from: f */
    private VHeadView f13633f;

    /* renamed from: g */
    private TextView f13634g;

    /* renamed from: h */
    private TextView f13635h;

    /* renamed from: i */
    private android.view.View f13636i;

    /* renamed from: j */
    private FrameLayout f13637j;

    /* renamed from: k */
    private FrameLayout f13638k;

    /* renamed from: l */
    private IPropertyCache f13639l;

    /* renamed from: m */
    private int f13640m;

    /* renamed from: q */
    private LinkAutoMatchModel f13641q;

    /* renamed from: r */
    private DataCenter f13642r;

    /* renamed from: s */
    private int f13643s;

    /* renamed from: t */
    private C4500a f13644t = new C4500a() {
        /* renamed from: a */
        public final boolean mo12268a() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo12273c() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo12271b() {
            InteractPKMatchFragment.this.mo12746a();
            return false;
        }

        /* renamed from: a */
        public final boolean mo12270a(LinkAutoMatchModel linkAutoMatchModel) {
            InteractPKMatchFragment.this.mo12748a(linkAutoMatchModel);
            return false;
        }

        /* renamed from: b */
        public final boolean mo12272b(LinkAutoMatchModel linkAutoMatchModel) {
            InteractPKMatchFragment.this.mo12750b(linkAutoMatchModel);
            return false;
        }

        /* renamed from: a */
        public final boolean mo12269a(ApiServerException apiServerException) {
            if (apiServerException != null) {
                String prompt = apiServerException.getPrompt();
                if (!TextUtils.isEmpty(prompt)) {
                    C3517a.m12962a(InteractPKMatchFragment.this.getContext(), prompt);
                }
            }
            return false;
        }
    };

    /* renamed from: c */
    public final float mo12280c() {
        return 216.0f;
    }

    /* renamed from: a */
    public final void mo12298a(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
        }
    }

    /* renamed from: a */
    public final void mo12296a(Room room, int i) {
        if (this.f10103o) {
            this.f13116a.mo12147a(InteractPKMatchInviteFragment.m15783a(this.f13116a, 0, (String) C8946b.f24396aU.mo22117a(), room.getOwner(), this.f13119d.f11665c, room.getId(), this.f13642r, i));
        }
    }

    /* renamed from: a */
    public final void mo12297a(String str) {
        C9049ap.m27028a(str);
        m15763b((int) R.string.ew8);
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ew7);
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        if (this.f13640m != 1) {
            return null;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3358ac.m12510a(32.0f), C3358ac.m12510a(32.0f)));
        autoRTLImageView.setImageDrawable(C3358ac.m12524c(R.drawable.c3l));
        autoRTLImageView.setOnClickListener(new C4801e(this));
        return autoRTLImageView;
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13640m == 2 || this.f13119d.f11680r == 2) {
            return null;
        }
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awx, (ViewGroup) getView(), false);
        inflate.setOnClickListener(new C4802f(this));
        return inflate;
    }

    public void onStop() {
        if (((C4510a) this.f13118c).mo12304e()) {
            ((C4510a) this.f13118c).mo12303d();
            C4492a.m15023a().mo12259a(this.f13116a.mo12151c().getId());
        }
        C4492a.m15023a().mo12266b(this.f13644t);
        super.onStop();
    }

    public void onStart() {
        super.onStart();
        C4492a.m15023a().mo12263a(this.f13644t, 0);
        switch (this.f13640m) {
            case 1:
                ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
                return;
            case 2:
                if (mo8989l()) {
                    if (this.f13641q != null) {
                        C5343e.m17045b(this.f13633f, this.f13641q.getDefaultAvatar(), this.f13633f.getWidth(), this.f13633f.getHeight(), R.drawable.c4_);
                    }
                    mo12746a();
                    return;
                }
                return;
            case 3:
                if (this.f13641q != null) {
                    if (this.f13641q.getRivalRoom() != null) {
                        mo12750b(this.f13641q);
                        break;
                    } else {
                        mo12748a(this.f13641q);
                        return;
                    }
                } else {
                    mo12746a();
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo12746a() {
        if (mo8989l()) {
            LinkCrossRoomDataHolder.m13782a().f11681s = 0;
            if (((Boolean) C8946b.f24394aS.mo22117a()).booleanValue()) {
                this.f13634g.setVisibility(0);
                this.f13636i.setVisibility(8);
                ((C4510a) this.f13118c).mo12299a(3);
                return;
            }
            this.f13632e.setText(R.string.evs);
            this.f13637j.setVisibility(8);
            this.f13638k.setVisibility(0);
            this.f13635h.setText(R.string.ew8);
        }
    }

    /* renamed from: b */
    private void m15763b(int i) {
        this.f13635h.setText(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12749b(android.view.View view) {
        C4492a.m15023a().mo12265b();
        this.f13116a.mo12143a();
    }

    /* renamed from: b */
    public final void mo12750b(LinkAutoMatchModel linkAutoMatchModel) {
        if (mo8989l()) {
            ((C4510a) this.f13118c).mo12301a(linkAutoMatchModel.getRivalRoom(), this.f13116a.mo12151c().getId(), (String) C8946b.f24396aU.mo22117a(), C34943c.f91128x, this.f13643s);
        }
    }

    /* renamed from: a */
    public final void mo12295a(int i) {
        if (mo8989l()) {
            if (this.f13634g.getVisibility() == 0) {
                this.f13634g.setText(String.valueOf(i));
                this.f13632e.setText(getString(R.string.evt, Integer.valueOf(i)));
            }
            if (i == 0) {
                this.f13634g.setVisibility(8);
                this.f13636i.setVisibility(0);
                ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
            }
        }
    }

    public void onClick(android.view.View view) {
        if (view.getId() == R.id.p9) {
            if (C4492a.m15023a().mo12267c()) {
                m15763b((int) R.string.ew8);
                ((C4510a) this.f13118c).mo12302c();
                C8443c.m25663a().mo21607a("match_cancel_click", LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            } else if (((C4510a) this.f13118c).mo12304e()) {
                m15763b((int) R.string.ew8);
                ((C4510a) this.f13118c).mo12303d();
                C4492a.m15023a().mo12265b();
                this.f13632e.setText("");
                this.f13634g.setText("");
                C8443c.m25663a().mo21607a("match_cancel_click", LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            } else {
                m15763b((int) R.string.eci);
                this.f13634g.setVisibility(8);
                this.f13636i.setVisibility(0);
                ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
                LinkCrossRoomDataHolder.m13782a().f11687y = true;
                C8443c.m25663a().mo21607a("connection_invite", new C8435g().mo21590a((int) C34943c.f91128x).mo21592a(Boolean.valueOf(true)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
        } else if (view.getId() == R.id.pa) {
            ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
        } else {
            if (view.getId() == R.id.pg) {
                C8946b.f24394aS.mo22118a(Boolean.valueOf(true));
                ((C4510a) this.f13118c).mo12300a(this.f13116a.mo12151c().getId());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12747a(android.view.View view) {
        m15763b((int) R.string.ew8);
        ((C4510a) this.f13118c).mo12303d();
        C4492a.m15023a().mo12265b();
        this.f13632e.setText("");
        this.f13634g.setText("");
        this.f13116a.mo12147a(InteractPKUserListFragment.m15811a(this.f13116a, 1, this.f13642r));
    }

    /* renamed from: a */
    public final void mo12748a(LinkAutoMatchModel linkAutoMatchModel) {
        if (mo8989l()) {
            this.f13637j.setVisibility(0);
            this.f13638k.setVisibility(8);
            this.f13632e.setText(linkAutoMatchModel.getDefaultContent());
            C5343e.m17045b(this.f13633f, linkAutoMatchModel.getDefaultAvatar(), this.f13633f.getWidth(), this.f13633f.getHeight(), R.drawable.c4_);
        }
    }

    /* renamed from: a */
    public static InteractPKMatchFragment m15761a(C4522b bVar, DataCenter dataCenter) {
        return m15758a(bVar, 1, dataCenter);
    }

    public void onViewCreated(android.view.View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f13639l = TTLiveSDKContext.getHostService().mo22361b().mo23190b();
        this.f13632e = (TextView) view.findViewById(R.id.dxm);
        VHeadView vHeadView = (VHeadView) view.findViewById(R.id.auo);
        TextView textView = (TextView) view.findViewById(R.id.dyj);
        this.f13633f = (VHeadView) view.findViewById(R.id.aun);
        this.f13637j = (FrameLayout) view.findViewById(R.id.bic);
        this.f13634g = (TextView) view.findViewById(R.id.dsu);
        this.f13635h = (TextView) view.findViewById(R.id.p9);
        this.f13636i = view.findViewById(R.id.bji);
        this.f13635h.setOnClickListener(this);
        this.f13634g.setVisibility(8);
        this.f13638k = (FrameLayout) view.findViewById(R.id.bid);
        TextView textView2 = (TextView) view.findViewById(R.id.pa);
        TextView textView3 = (TextView) view.findViewById(R.id.pg);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        this.f13638k.setVisibility(8);
        if (this.f13116a.mo12151c().getOwner() != null) {
            textView.setText(this.f13116a.mo12151c().getOwner().getNickName());
            C5343e.m17045b(vHeadView, this.f13116a.mo12151c().getOwner().getAvatarMedium(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.c4_);
        }
    }

    /* renamed from: a */
    private static InteractPKMatchFragment m15758a(C4522b bVar, int i, DataCenter dataCenter) {
        return m15759a(bVar, null, 1, dataCenter);
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aq8, viewGroup, false);
    }

    /* renamed from: a */
    public static InteractPKMatchFragment m15762a(C4522b bVar, DataCenter dataCenter, int i) {
        return m15760a(bVar, null, 1, dataCenter, i);
    }

    /* renamed from: a */
    public static InteractPKMatchFragment m15759a(C4522b bVar, LinkAutoMatchModel linkAutoMatchModel, int i, DataCenter dataCenter) {
        InteractPKMatchFragment interactPKMatchFragment = new InteractPKMatchFragment();
        interactPKMatchFragment.f13118c = new C4534af(interactPKMatchFragment);
        interactPKMatchFragment.f13116a = bVar;
        interactPKMatchFragment.f13641q = linkAutoMatchModel;
        interactPKMatchFragment.f13640m = i;
        interactPKMatchFragment.f13642r = dataCenter;
        return interactPKMatchFragment;
    }

    /* renamed from: a */
    private static InteractPKMatchFragment m15760a(C4522b bVar, LinkAutoMatchModel linkAutoMatchModel, int i, DataCenter dataCenter, int i2) {
        InteractPKMatchFragment interactPKMatchFragment = new InteractPKMatchFragment();
        interactPKMatchFragment.f13118c = new C4534af(interactPKMatchFragment);
        interactPKMatchFragment.f13116a = bVar;
        interactPKMatchFragment.f13641q = null;
        interactPKMatchFragment.f13640m = 1;
        interactPKMatchFragment.f13642r = dataCenter;
        interactPKMatchFragment.f13643s = i2;
        return interactPKMatchFragment;
    }
}
