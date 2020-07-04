package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract.C4514a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract.View;
import com.bytedance.android.livesdk.chatroom.interact.model.ChiJiPermissionData;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4546ar;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class InteractPKTypeFragment extends View implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: e */
    private DataCenter f13665e;

    /* renamed from: f */
    private TextView f13666f;

    /* renamed from: g */
    private TextView f13667g;

    /* renamed from: h */
    private android.view.View f13668h;

    /* renamed from: i */
    private ChiJiPermissionData f13669i;

    /* renamed from: j */
    private ApiServerException f13670j;

    /* renamed from: k */
    private TextView f13671k;

    /* renamed from: l */
    private CountDownTimer f13672l;

    /* renamed from: m */
    private TextView f13673m;

    /* renamed from: q */
    private ImageView f13674q;

    /* renamed from: r */
    private int f13675r;

    /* renamed from: c */
    public final float mo12280c() {
        return 176.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ex_);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f13672l != null) {
            this.f13672l.cancel();
            this.f13672l = null;
        }
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        int i = 0;
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        android.view.View findViewById = inflate.findViewById(R.id.bc5);
        if (!((Boolean) C8946b.f24392aQ.mo22117a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C4806j(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12758a(android.view.View view) {
        C8946b.f24392aQ.mo22118a(Boolean.valueOf(false));
        this.f13116a.mo12147a(InteractPKSettingFragment.m15789a(this.f13116a));
    }

    public void onClick(android.view.View view) {
        if (view.getId() == R.id.ba6 || view.getId() == R.id.dxl) {
            LinkCrossRoomDataHolder.m13782a().f11680r = 1;
            this.f13116a.mo12147a(InteractPKMatchFragment.m15762a(this.f13116a, this.f13665e, 0));
            HashMap hashMap = new HashMap();
            hashMap.put("is_rematch", "0");
            hashMap.put("is_oncemore", "0");
            hashMap.put("connection_type", "random_pk");
            C8443c.m25663a().mo21606a("connection_invite", hashMap, new C8435g().mo21590a((int) C34943c.f91128x), Room.class);
        } else if (view.getId() == R.id.ba5 || view.getId() == R.id.dxj) {
            HashMap hashMap2 = new HashMap();
            Room room = (Room) this.f13665e.get("data_room", null);
            if (room != null) {
                long id = room.getOwner().getId();
                long id2 = room.getId();
                hashMap2.put("anchor_id", String.valueOf(id));
                hashMap2.put("room_id", String.valueOf(id2));
            }
            hashMap2.put("connection_type", "manual_pk");
            C8443c.m25663a().mo21606a("livesdk_manual_icon_click", hashMap2, new Object[0]);
            this.f13116a.mo12147a(InteractPKUserListFragment.m15811a(this.f13116a, 1, this.f13665e));
        } else {
            view.getId();
            if (view.getId() == R.id.ba4 || view.getId() == R.id.dxh) {
                this.f13119d.f11680r = 2;
                this.f13119d.f11681s = (long) this.f13675r;
                this.f13119d.f11672j = C34943c.f91128x;
                this.f13116a.mo12147a(InteractPKMatchFragment.m15762a(this.f13116a, this.f13665e, this.f13675r));
                C8443c.m25663a().mo21607a("connection_invite", new C8435g().mo21592a(Boolean.valueOf(false)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getId();
    }

    public void onViewCreated(android.view.View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.ba6).setOnClickListener(this);
        view.findViewById(R.id.dxl).setOnClickListener(this);
        view.findViewById(R.id.ba5).setOnClickListener(this);
        view.findViewById(R.id.dxj).setOnClickListener(this);
        this.f13671k = (TextView) view.findViewById(R.id.dxi);
        this.f13673m = (TextView) view.findViewById(R.id.dxh);
        this.f13674q = (ImageView) view.findViewById(R.id.ba4);
        this.f13666f = (TextView) view.findViewById(R.id.dsl);
        this.f13667g = (TextView) view.findViewById(R.id.dsm);
        this.f13668h = view.findViewById(R.id.ln);
        if (!C9290a.f25466a) {
            ((C4514a) this.f13118c).mo12323a(((Room) this.f13665e.get("data_room")).getOwner().getId());
        }
        this.f13675r = 0;
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aqa, viewGroup, false);
    }

    /* renamed from: a */
    public static InteractPKTypeFragment m15806a(C4522b bVar, DataCenter dataCenter, ChiJiPermissionData chiJiPermissionData, ApiServerException apiServerException) {
        InteractPKTypeFragment interactPKTypeFragment = new InteractPKTypeFragment();
        interactPKTypeFragment.f13118c = new C4546ar(interactPKTypeFragment);
        interactPKTypeFragment.f13116a = bVar;
        interactPKTypeFragment.f13665e = dataCenter;
        interactPKTypeFragment.f13669i = chiJiPermissionData;
        interactPKTypeFragment.f13670j = apiServerException;
        return interactPKTypeFragment;
    }
}
