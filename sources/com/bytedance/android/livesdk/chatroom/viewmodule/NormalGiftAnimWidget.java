package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C4412ad;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.entry.p382d.C8025a;
import com.bytedance.android.livesdk.gift.effect.normal.p385a.C8047a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NormalGiftAnimWidget extends LiveRecyclableWidget implements C0053p<KVData>, C8025a {

    /* renamed from: a */
    private NormalGiftAnimationView f16298a;

    /* renamed from: b */
    private C8047a f16299b = new C8047a();

    /* renamed from: c */
    private Room f16300c;

    public int getLayoutId() {
        return R.layout.b06;
    }

    /* renamed from: a */
    public final void mo13960a() {
        if (isViewValid() && this.f16298a != null) {
            this.f16298a.mo21023c();
        }
    }

    public void onUnload() {
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    public void onInit(Object... objArr) {
        this.f16298a = (NormalGiftAnimationView) this.contentView;
    }

    /* renamed from: b */
    public final void mo13964b(C8489ao aoVar) {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_special_group_gift", aoVar);
        }
    }

    /* renamed from: a */
    public final void mo13961a(long j) {
        if (j != 0 && this.dataCenter != null) {
            if (this.f16300c != null && this.f16300c.isStar()) {
                return;
            }
            if (this.f16300c == null || !this.f16300c.isKoiRoom()) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f16298a.setNormalGiftEventListener(this);
        this.f16298a.mo21020a();
        this.f16300c = (Room) this.dataCenter.get("data_room");
        if (this.f16300c != null) {
            this.f16298a.setOrientation(this.f16300c.getOrientation());
        }
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -763908145 && key.equals("cmd_clear_gift_message")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (isViewValid() && this.f16298a != null) {
                        this.f16298a.mo21023c();
                        return;
                    }
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        C9738o.m28712b(this.contentView, 0);
                        break;
                    } else {
                        C9738o.m28712b(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo13963a(C8489ao aoVar) {
        C8149d findGiftById = GiftManager.inst().findGiftById(aoVar.f23254c);
        if (!(findGiftById == null || this.f16298a == null || this.f16300c == null)) {
            this.f16298a.mo21021a(this.f16299b, aoVar, findGiftById, this.f16300c.getOwner());
        }
    }

    /* renamed from: a */
    public final void mo13962a(User user, String str, long j, C8489ao aoVar) {
        C4412ad adVar = new C4412ad(user, str, j);
        if (aoVar != null) {
            adVar.f12823d = aoVar.baseMessage;
        }
        C8149d findGiftById = GiftManager.inst().findGiftById(j);
        if ((findGiftById == null || findGiftById.f22234e != 8) && this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_normal_gift_end_event", adVar);
        }
    }
}
