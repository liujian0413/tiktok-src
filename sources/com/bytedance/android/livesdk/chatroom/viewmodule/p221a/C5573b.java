package com.bytedance.android.livesdk.chatroom.viewmodule.p221a;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p220ui.C5246cm;
import com.bytedance.android.livesdk.chatroom.p220ui.C5247cn;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.b */
public final class C5573b implements C0053p<KVData>, C5739a {

    /* renamed from: a */
    private Room f16626a;

    /* renamed from: b */
    private boolean f16627b = true;

    /* renamed from: c */
    private View f16628c;

    /* renamed from: d */
    private DataCenter f16629d;

    /* renamed from: e */
    private boolean f16630e = true;

    /* renamed from: f */
    private View f16631f;

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public C5573b(boolean z) {
    }

    /* renamed from: a */
    public final void mo8812a(C5735a aVar) {
        if (!this.f16630e && (aVar instanceof C5572e) && this.f16628c != null) {
            this.f16628c.setVisibility(((C5572e) aVar).f16625a);
        }
    }

    public final void onClick(View view) {
        if (!C5574c.m17995a(view.getContext())) {
            C9049ap.m27022a((int) R.string.efp);
            return;
        }
        if (this.f16626a != null) {
            if (((Integer) LiveSettingKeys.LIVE_PROFILE_MANAGE_DIALOG_STYLE.mo10240a()).intValue() == 0) {
                C5246cm cmVar = new C5246cm(view.getContext(), this.f16626a, this.f16626a.getOwner(), true, this.f16627b);
                cmVar.show();
            } else {
                C5247cn cnVar = new C5247cn(view.getContext(), this.f16626a, this.f16626a.getOwner(), true, this.f16627b);
                cnVar.show();
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(this.f16626a.getOwnerUserId()));
                hashMap.put("room_id", this.f16626a.getIdStr());
                C8443c.m25663a().mo21606a("livesdk_anchor_set_page_click", hashMap, new Object[0]);
            }
        }
        if (!this.f16630e) {
            C8946b.f24441bM.mo22118a(Boolean.valueOf(false));
            if (this.f16631f != null) {
                this.f16631f.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo8813b(View view, DataCenter dataCenter) {
        this.f16629d.removeObserver(this);
    }

    /* renamed from: a */
    public final void mo8811a(View view, DataCenter dataCenter) {
        this.f16629d = dataCenter;
        this.f16626a = (Room) this.f16629d.get("data_room");
        this.f16627b = ((Boolean) this.f16629d.get("data_is_portrait")).booleanValue();
        if (!this.f16630e) {
            this.f16628c = view;
            this.f16631f = view.findViewById(R.id.ed_);
            int i = 8;
            this.f16628c.setVisibility(8);
            boolean booleanValue = ((Boolean) C8946b.f24441bM.mo22117a()).booleanValue();
            if (this.f16631f != null) {
                View view2 = this.f16631f;
                if (booleanValue) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            this.f16629d.observe("data_user_in_room", this);
        }
    }
}
