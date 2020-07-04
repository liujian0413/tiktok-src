package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.entry.p379a.C8004c;
import com.bytedance.android.livesdk.gift.effect.entry.p380b.C8006a.C8007a;
import com.bytedance.android.livesdk.gift.effect.entry.p380b.C8006a.C8009c;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.message.model.C8510bf;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class EnterAnimWidget extends LiveRecyclableWidget implements C0053p<KVData>, C3436f {

    /* renamed from: a */
    public EnterAnimationView f15874a;

    /* renamed from: b */
    private int f15875b;

    /* renamed from: c */
    private C8004c f15876c;

    public int getLayoutId() {
        return R.layout.b02;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
    }

    /* renamed from: a */
    public final void mo13751a(C4448r rVar) {
        if (this.f15874a != null) {
            this.f15874a.mo20953a();
        }
    }

    /* renamed from: a */
    private void m17277a(final C8026a aVar) {
        ImageModel imageModel = aVar.f21789m.f23407e;
        if (imageModel != null) {
            if (TextUtils.isEmpty(C8007a.m24542a(imageModel))) {
                C8007a.m24543a(imageModel, new C8009c() {
                    /* renamed from: a */
                    public final void mo13752a(ImageModel imageModel) {
                        if (EnterAnimWidget.this.isViewValid()) {
                            EnterAnimWidget.this.f15874a.mo20954a(aVar);
                        }
                    }
                });
                return;
            }
            this.f15874a.mo20954a(aVar);
        }
    }

    /* renamed from: a */
    private void m17278a(C8510bf bfVar) {
        if (bfVar != null && isViewValid() && this.f15874a != null && bfVar.f23347a == 0 && bfVar.f23349c > 0 && !TextUtils.isEmpty(bfVar.f23348b)) {
            this.f15874a.mo20955a(bfVar);
        }
    }

    public void onInit(Object... objArr) {
        this.f15876c = new C8004c();
        this.f15874a = (EnterAnimationView) this.contentView.findViewById(R.id.aex);
        if (objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f15874a.setChildMarginBottom(objArr[0].intValue());
        }
        this.f15874a.setUserEventListener(this);
    }

    public void onLoad(Object... objArr) {
        this.dataCenter.observe("data_member_message", this);
        this.dataCenter.observe("data_live_ecom_message", this);
        if (this.f15874a != null && objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f15874a.setChildMarginBottom(objArr[0].intValue());
        }
    }

    /* renamed from: a */
    private void m17279a(C8514bj bjVar) {
        if (bjVar != null && isViewValid() && this.f15874a != null && bjVar.mo21658a() == 1) {
            User user = bjVar.f23390b;
            if (user != null) {
                NobleLevelInfo nobleLevelInfo = user.getNobleLevelInfo();
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
                this.dataCenter.get("data_room", null);
                if (nobleLevelInfo == null || nobleLevelInfo.getNobleLevel() == 0) {
                    C8026a a = C8004c.m24540a(bjVar);
                    if (!(bjVar.f23399k == null && bjVar.f23397i == 0)) {
                        if (a.mo20933a()) {
                            m17277a(a);
                            return;
                        }
                        this.f15874a.mo20954a(a);
                    }
                    return;
                }
                this.f15874a.mo20956a(bjVar, booleanValue);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -970251873) {
                if (hashCode != -407049065) {
                    if (hashCode == 771158242 && key.equals("data_live_ecom_message")) {
                        c = 2;
                    }
                } else if (key.equals("data_member_message")) {
                    c = 0;
                }
            } else if (key.equals("data_member_count")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m17279a((C8514bj) kVData.getData());
                    return;
                case 1:
                    if (isViewValid()) {
                        this.f15875b = ((Integer) kVData.getData()).intValue();
                        return;
                    }
                    return;
                case 2:
                    if (kVData.getData() instanceof C8510bf) {
                        m17278a((C8510bf) kVData.getData());
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo10403a(long j) {
        if (j != 0) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
        }
    }
}
