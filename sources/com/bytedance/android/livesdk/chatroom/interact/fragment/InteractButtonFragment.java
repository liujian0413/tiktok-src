package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract.C4507a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4743k;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class InteractButtonFragment extends View implements OnClickListener {

    /* renamed from: e */
    private int f13599e;

    /* renamed from: f */
    private DataCenter f13600f;

    /* renamed from: c */
    public final float mo12280c() {
        return 160.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ex7);
    }

    /* renamed from: h */
    private static boolean m15732h() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        C9049ap.m27022a((int) R.string.ex5);
        return false;
    }

    /* renamed from: a */
    public final void mo12276a() {
        if (this.f10103o) {
            if ((this.f13599e == R.id.b5y || this.f13599e == R.id.dqj) && m15732h()) {
                this.f13116a.mo12147a(InteractPKUserListFragment.m15811a(this.f13116a, 2, this.f13600f));
            }
            this.f13599e = 0;
        }
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        int i = 0;
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        android.view.View findViewById = inflate.findViewById(R.id.bc5);
        if (!((Boolean) C8946b.f24393aR.mo22117a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C4797a(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo12277a(Throwable th) {
        if (this.f10103o) {
            this.f13599e = 0;
            C9076n.m27095a(getContext(), th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12738a(android.view.View view) {
        C8946b.f24393aR.mo22118a(Boolean.valueOf(false));
        this.f13116a.mo12147a(InteractSettingsFragment.m15828a(this.f13116a));
    }

    public void onClick(android.view.View view) {
        if (this.f13599e == 0) {
            this.f13599e = view.getId();
            new HashMap();
            if (this.f13599e == R.id.dqm || this.f13599e == R.id.b62) {
                LinkCrossRoomDataHolder.m13782a().f11683u = true;
                HashMap hashMap = new HashMap();
                hashMap.put("connection_type", "audience");
                C8443c.m25663a().mo21606a("connection_invite", hashMap, Room.class);
            } else if (this.f13599e == R.id.dqj || this.f13599e == R.id.b5y) {
                LinkCrossRoomDataHolder.m13782a().f11683u = false;
                HashMap hashMap2 = new HashMap();
                Room room = (Room) this.f13600f.get("data_room", null);
                if (room != null) {
                    long id = room.getOwner().getId();
                    long id2 = room.getId();
                    hashMap2.put("anchor_id", String.valueOf(id));
                    hashMap2.put("room_id", String.valueOf(id2));
                }
                hashMap2.put("connection_type", "anchor");
                C8443c.m25663a().mo21606a("livesdk_manual_icon_click", hashMap2, new Object[0]);
            }
            if (this.f13599e == R.id.dqm || this.f13599e == R.id.b62) {
                this.f13599e = 0;
                this.f13600f.lambda$put$1$DataCenter("cmd_audience_turn_on_link", new Object());
                return;
            }
            if (!(this.f13116a == null || this.f13116a.mo12151c() == null)) {
                ((C4507a) this.f13118c).mo12278a(this.f13116a.mo12151c().getId());
            }
        }
    }

    /* renamed from: a */
    public static InteractButtonFragment m15731a(C4522b bVar, DataCenter dataCenter) {
        InteractButtonFragment interactButtonFragment = new InteractButtonFragment();
        interactButtonFragment.f13118c = new C4743k(interactButtonFragment);
        interactButtonFragment.f13116a = bVar;
        interactButtonFragment.f13600f = dataCenter;
        return interactButtonFragment;
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(R.layout.aq4, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.dqj);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dqm);
        android.view.View findViewById = inflate.findViewById(R.id.b5y);
        android.view.View findViewById2 = inflate.findViewById(R.id.b62);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        return inflate;
    }
}
