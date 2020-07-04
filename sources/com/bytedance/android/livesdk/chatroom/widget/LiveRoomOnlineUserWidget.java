package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.C0053p;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.livesdk.chatroom.presenter.C5015ch;
import com.bytedance.android.livesdk.chatroom.view.C5373c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;

public class LiveRoomOnlineUserWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5373c {

    /* renamed from: a */
    private TextView f16908a;

    /* renamed from: b */
    private C5015ch f16909b;

    /* renamed from: c */
    private Room f16910c;

    /* renamed from: d */
    private UserRankDialog2 f16911d;

    /* renamed from: e */
    private boolean f16912e = true;

    /* renamed from: f */
    private String f16913f;

    /* renamed from: g */
    private boolean f16914g;

    /* renamed from: h */
    private AppCompatActivity f16915h;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: a */
    public final void mo13664a(List<C8857f> list, List<C8857f> list2) {
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.b05;
    }

    public void onResume() {
        super.onResume();
        m18139b();
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
    }

    /* renamed from: b */
    private void m18139b() {
        if (!(!isViewValid() || this.f16910c == null || this.f16910c.getOwner() == null)) {
            this.f16909b.mo13029a(this.f16910c.getId(), this.f16910c.getOwner().getId(), 18);
        }
    }

    /* renamed from: a */
    private void m18137a() {
        if (this.f16911d != null) {
            this.f16911d.dismiss();
        }
        this.f16911d = UserRankDialog2.m26382a(this.f16915h, this.f16910c, this.f16914g, this.f16912e, this.f16913f, this.dataCenter);
        this.f16911d.f23927a = true;
        this.f16911d.show(this.f16915h.getSupportFragmentManager(), "dialog2");
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "top_tab");
        C8443c.m25663a().mo21607a("audience_list_click", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail").mo21600c("top_tab"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14224a(View view) {
        m18137a();
    }

    /* renamed from: b */
    private void m18140b(int i) {
        if (isViewValid()) {
            this.f16908a.setText(C3385e.m12593c((long) i));
        }
    }

    /* renamed from: a */
    public final void mo13663a(int i) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i));
            m18140b(i);
        }
    }

    public void onInit(Object... objArr) {
        this.f16908a = (TextView) this.contentView.findViewById(R.id.c8k);
        this.f16908a.setOnClickListener(new C5808g(this));
        this.f16909b = new C5015ch();
        this.f16909b.mo9142a((C5373c) this);
    }

    public void onLoad(Object... objArr) {
        this.f16910c = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("data_member_message", this);
        this.f16912e = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16913f = (String) this.dataCenter.get("log_enter_live_source");
        this.f16914g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16915h = (AppCompatActivity) this.context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -407049065 && key.equals("data_member_message")) {
                c = 0;
            }
            if (c == 0) {
                C8514bj bjVar = (C8514bj) kVData.getData();
                int i = bjVar.f23389a;
                m18140b(i);
                if (i < 15) {
                    m18139b();
                }
                if (bjVar.mo21658a() == 8) {
                    m18139b();
                }
            }
        }
    }
}
