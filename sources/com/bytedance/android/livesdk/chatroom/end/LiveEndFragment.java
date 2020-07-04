package com.bytedance.android.livesdk.chatroom.end;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

public class LiveEndFragment extends BaseFragment {

    /* renamed from: A */
    protected boolean f12760A;

    /* renamed from: B */
    protected String f12761B;

    /* renamed from: y */
    protected Room f12762y;

    /* renamed from: z */
    protected boolean f12763z;

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12107d() {
        if (!this.f12763z) {
            C8448g.m25682a((Context) getActivity());
        }
        C9097a.m27146a().mo22267a((Object) new C4452v(5));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12106c() {
        if (this.f12762y != null && this.f12762y.getOwner() != null) {
            User owner = this.f12762y.getOwner();
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.f12761B);
            hashMap.put("sec_user_id", owner.getSecUid());
            C9178j.m27302j().mo22380i().showUserProfile(owner.getId(), null, hashMap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo12105a(int i) {
        if (getView() == null) {
            return null;
        }
        return getView().findViewById(i);
    }
}
