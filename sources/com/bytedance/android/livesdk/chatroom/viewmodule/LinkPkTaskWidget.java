package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4052g;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4052g.C4053a;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4052g.C4054b;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.chatroom.event.C4428at;
import com.bytedance.android.livesdk.chatroom.interact.C4485ak;
import com.bytedance.android.livesdk.chatroom.interact.C4812j;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4732gx;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4732gx.C4733a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkPkTaskWidget extends LiveWidget implements C0053p<KVData>, C4054b, C4733a {

    /* renamed from: a */
    public boolean f16145a = false;

    /* renamed from: b */
    public C3972b f16146b;

    /* renamed from: c */
    public C3978e f16147c;

    /* renamed from: d */
    public boolean f16148d;

    /* renamed from: e */
    public LinkCrossRoomDataHolder f16149e;

    /* renamed from: f */
    public C5594as f16150f;

    /* renamed from: g */
    private ViewGroup f16151g;

    /* renamed from: h */
    private C4732gx f16152h;

    /* renamed from: i */
    private long f16153i;

    /* renamed from: j */
    private Room f16154j;

    /* renamed from: k */
    private C5447a f16155k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget$a */
    final class C5447a implements C0053p<KVData>, C3977d {
        /* renamed from: a */
        public final void mo13890a() {
            LinkPkTaskWidget.this.f16149e.removeObserver(this);
        }

        private C5447a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(KVData kVData) {
            if (kVData != null && kVData.getData() != null) {
                List<String> list = (List) kVData.getData();
                for (String a : list) {
                    m17621a(a);
                }
                list.clear();
            }
        }

        /* renamed from: a */
        private void m17621a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", str);
                jSONObject.put("type", "json");
            } catch (JSONException e) {
                LinkPkTaskWidget.this.mo9118a((Throwable) e);
            }
            LinkPkTaskWidget.this.f16146b.mo11541a(LinkPkTaskWidget.this.f16147c, "H5_commonMessage", jSONObject);
        }

        /* renamed from: a */
        public final void mo9661a(WebView webView, String str) {
            if (LinkPkTaskWidget.this.f16145a) {
                LinkPkTaskWidget.this.f16149e.observeForever("data_banner_pending_data", this, true);
            } else {
                LinkPkTaskWidget.this.f16149e.observeForever("data_inroom_banner_pending_data", this, true);
                LinkPkTaskWidget.this.f16147c.f11853a.setVisibility(0);
            }
            if (LinkPkTaskWidget.this.f16150f != null) {
                LinkPkTaskWidget.this.f16150f.mo14066g();
            }
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.b07;
    }

    /* renamed from: b */
    public final void mo13889b() {
        if (this.f16150f != null) {
            this.f16150f.mo14068i();
        }
    }

    /* renamed from: f */
    private int m17613f() {
        String str = this.f16149e.f11660B;
        if (str != null) {
            try {
                return Integer.parseInt(Uri.parse(str).getQueryParameter("banner_height"));
            } catch (Exception unused) {
                C3166a.m11964c("webview height translate", "translate wrong");
            }
        }
        return 105;
    }

    /* renamed from: d */
    private void m17612d() {
        if (this.dataCenter != null) {
            this.f16151g.removeAllViews();
            this.f16146b.mo11539a(this.f16147c);
            this.f16148d = false;
            if (!this.f16145a) {
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(4));
            }
            if (this.f16150f != null) {
                this.f16150f.mo14067h();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f16146b.mo11539a(this.f16147c);
        if (this.f16152h != null) {
            this.f16152h.mo8963a();
        }
        if (this.f16155k != null) {
            this.f16155k.mo13890a();
        }
        if (this.f16149e != null) {
            this.f16149e.removeObserver(this);
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    /* renamed from: c */
    private void m17611c() {
        if (!this.f16148d) {
            this.f16148d = true;
            if (this.f16155k != null) {
                this.f16155k.mo13890a();
            }
            this.f16155k = new C5447a();
            this.f16147c = this.f16146b.mo11534a((Activity) this.context, (C3977d) this.f16155k);
            if (VERSION.SDK_INT <= 19) {
                this.f16147c.f11853a.setLayerType(1, null);
            }
            this.f16147c.f11853a.setBackgroundColor(0);
            this.f16147c.f11853a.setLayoutParams(new LayoutParams(-1, -1));
            if (!this.f16145a) {
                LayoutParams layoutParams = this.f16151g.getLayoutParams();
                layoutParams.height = C3358ac.m12510a((float) m17613f());
                this.f16151g.setLayoutParams(layoutParams);
            }
            this.f16151g.addView(this.f16147c.f11853a);
            this.f16147c.f11853a.setVisibility(4);
            if (this.f16150f != null) {
                this.f16150f.mo14067h();
            }
            if (!this.f16145a) {
                this.f16147c.f11854b.mo11529a().mo27204a("sendInRoomPkStatus", (C11155d<?, ?>) new C4052g<Object,Object>(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo12656a() {
        String str;
        if (this.dataCenter != null) {
            if (this.f16145a) {
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
            }
            m17611c();
            if (this.f16145a) {
                str = (String) LiveConfigSettingKeys.PKTASK_BANNER_URL.mo10240a();
                if (TextUtils.isEmpty(str)) {
                    str = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/pk_task/banner/index.html";
                }
            } else {
                str = this.f16149e.f11660B;
            }
            if (!TextUtils.isEmpty(str) && str != null) {
                this.f16146b.mo11540a(this.f16147c, Uri.parse(str).buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f16149e.f11665c)).appendQueryParameter("battle_id", String.valueOf(this.f16149e.f11666d)).appendQueryParameter("anchor_id", String.valueOf(this.f16154j.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(this.f16153i)).toString());
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f16149e = LinkCrossRoomDataHolder.m13782a();
        this.f16154j = (Room) this.dataCenter.get("data_room", null);
        this.f16153i = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        this.f16151g = (ViewGroup) this.contentView;
        this.f16146b = C9178j.m27302j().mo22374c();
        this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_keyboard_status", this);
        if (!this.f16145a) {
            this.dataCenter.observe("data_right_bottom_banner_show", this, true).observe("data_pk_chiji_stage", this);
            if (this.dataCenter.get("data_right_bottom_banner_show") instanceof C4428at) {
                m17609a((C4428at) this.dataCenter.get("data_right_bottom_banner_show"));
            }
        } else {
            this.f16152h = new C4732gx();
            this.f16152h.mo9142a((C4733a) this);
            this.f16149e.observeForever("data_pk_state", this);
        }
        mo12656a();
    }

    public LinkPkTaskWidget(boolean z) {
    }

    /* renamed from: a */
    private void m17609a(C4428at atVar) {
        if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo10240a()).intValue() != 1 && atVar.f12863b == 0) {
            if (atVar.f12862a) {
                C9738o.m28702a((View) this.containerView, -3, -3, -3, (int) C9738o.m28708b(getContext(), 132.0f));
                return;
            }
            C9738o.m28702a((View) this.containerView, -3, -3, -3, (int) C9738o.m28708b(getContext(), 86.0f));
        }
    }

    /* renamed from: a */
    public final void mo12657a(int i) {
        if (i == 0) {
            this.f16147c.f11853a.setVisibility(4);
            if (this.f16150f != null) {
                this.f16150f.mo14067h();
            }
        } else {
            this.f16147c.f11853a.setVisibility(0);
            if (this.f16150f != null) {
                this.f16150f.mo14066g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null && this.dataCenter != null) {
            String key = kVData.getKey();
            char c = 65535;
            int i = 0;
            switch (key.hashCode()) {
                case -1931352685:
                    if (key.equals("data_pk_chiji_stage")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1357019912:
                    if (key.equals("data_pre_show_keyboard")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1446063636:
                    if (key.equals("data_right_bottom_banner_show")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    if (!(this.f16147c == null || this.f16147c.f11853a == null)) {
                        if (booleanValue) {
                            this.f16147c.f11853a.setFocusable(false);
                        } else {
                            this.f16147c.f11853a.setFocusable(true);
                        }
                    }
                    if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo10240a()).intValue() == 1) {
                        ViewGroup viewGroup = this.f16151g;
                        if (booleanValue) {
                            i = 8;
                        }
                        viewGroup.setVisibility(i);
                        return;
                    }
                    break;
                case 2:
                    if (kVData.getData().equals(PkState.PENAL)) {
                        m17612d();
                        return;
                    }
                    break;
                case 3:
                    if (kVData.getData() instanceof C4428at) {
                        m17609a((C4428at) kVData.getData());
                        return;
                    } else {
                        C9738o.m28702a((View) this.f16151g, -3, -3, -3, (int) C9738o.m28708b(getContext(), 86.0f));
                        return;
                    }
                case 4:
                    int intValue = ((Integer) kVData.getData()).intValue();
                    if (!(intValue == 5 || intValue == 4)) {
                        if (this.dataCenter.get("data_right_bottom_banner_show") instanceof C4428at) {
                            m17609a((C4428at) this.dataCenter.get("data_right_bottom_banner_show"));
                        } else {
                            C9738o.m28702a((View) this.f16151g, -3, -3, -3, (int) C9738o.m28708b(getContext(), 86.0f));
                        }
                        mo12656a();
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo11665a(C4053a aVar) {
        if (aVar != null && aVar.f12044a != 0 && this.dataCenter != null) {
            if (!((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue()) {
                C4485ak.m15002b();
            } else if (LinkCrossRoomDataHolder.m13782a().f11680r == 2) {
                C8443c.m25663a().mo21607a("connection_over", new C8435g().mo21593a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11686x) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
            if (aVar.f12044a == 1) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(2));
                this.f16149e.mo11450c();
                return;
            }
            if (aVar.f12044a == 2) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(3));
                this.f16149e.mo11450c();
            }
        }
    }
}
