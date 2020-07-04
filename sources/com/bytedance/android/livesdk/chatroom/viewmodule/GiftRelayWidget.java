package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.presenter.C4944ah;
import com.bytedance.android.livesdk.chatroom.presenter.C4944ah.C4945a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.GiftRelayDialogFragment;
import com.bytedance.android.livesdk.gift.relay.p392a.C8269a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8549ck;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.HashMap;

public class GiftRelayWidget extends LiveRecyclableWidget implements C0053p<KVData>, C4945a {

    /* renamed from: a */
    private Room f15928a;

    /* renamed from: b */
    private boolean f15929b;

    /* renamed from: c */
    private boolean f15930c;

    /* renamed from: d */
    private GiftRelayDialogFragment f15931d;

    /* renamed from: e */
    private C4944ah f15932e;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        m17315a();
        this.f15932e.mo8963a();
    }

    /* renamed from: a */
    private void m17315a() {
        if (this.f15931d != null && this.f15931d.f11448j) {
            this.f15931d.f22661a = false;
            this.f15931d.dismissAllowingStateLoss();
        }
    }

    public void onInit(Object[] objArr) {
        this.f15932e = new C4944ah();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -171438776 && key.equals("cmd_show_gift_relay_dialog")) {
                c = 0;
            }
            if (c == 0) {
                C8549ck ckVar = (C8549ck) kVData.getData();
                if (ckVar != null) {
                    String str = ckVar.f23549a;
                    m17316a(ckVar);
                    m17318a(str);
                }
            }
        }
    }

    /* renamed from: a */
    private void m17316a(C8549ck ckVar) {
        String str = ckVar.f23549a;
        if (this.f15931d != null && this.f15931d.mo11345g()) {
            this.f15931d.f22661a = false;
            this.f15931d.dismissAllowingStateLoss();
            this.f15931d = null;
        }
        this.f15931d = GiftRelayDialogFragment.m25265a((Activity) this.context, this.f15928a, this.f15929b, this.f15930c, str, ckVar.f23550b);
        this.f15931d.mo21414a(this.dataCenter);
        if (this.context instanceof FragmentActivity) {
            long j = 0;
            C8271c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
            C4944ah ahVar = this.f15932e;
            long id = this.f15928a.getId();
            long ownerUserId = this.f15928a.getOwnerUserId();
            if (giftRelayInfo != null) {
                j = giftRelayInfo.f22712c;
            }
            ahVar.mo12925a(id, ownerUserId, j);
            this.f15931d.show(((FragmentActivity) this.context).getSupportFragmentManager(), "");
        }
    }

    public void onLoad(Object[] objArr) {
        this.f15928a = (Room) this.dataCenter.get("data_room", null);
        this.f15929b = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f15930c = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.dataCenter.observe("cmd_show_gift_relay_dialog", this);
        this.f15932e.mo9142a((C4945a) this);
    }

    /* renamed from: a */
    private void m17318a(String str) {
        String str2;
        if (this.f15928a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f15928a.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(this.f15928a.getId()));
            hashMap.put("show_position", str);
            C8443c a = C8443c.m25663a();
            String str3 = "endless_gift_show";
            Object[] objArr = new Object[2];
            C8438j jVar = new C8438j();
            if (this.f15930c) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            objArr[0] = jVar.mo21598a(str2).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr[1] = Room.class;
            a.mo21606a(str3, hashMap, objArr);
        }
    }

    /* renamed from: a */
    public final void mo12928a(C8269a aVar) {
        if (this.f15931d != null && this.f15931d.mo11345g() && aVar != null) {
            this.f15931d.mo21410a(aVar.f22708m, aVar.f22707l);
        }
    }
}
