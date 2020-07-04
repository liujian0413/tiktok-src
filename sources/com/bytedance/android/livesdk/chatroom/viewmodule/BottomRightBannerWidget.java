package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.base.model.user.C2379k;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.autodispose.C3242aa;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3408u;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C3924b;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.chatroom.event.C4428at;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdk.chatroom.presenter.C4934a;
import com.bytedance.android.livesdk.chatroom.presenter.C4934a.C4935a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8495au;
import com.bytedance.android.livesdk.message.model.C8527bq;
import com.bytedance.android.livesdk.p393h.C8292b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C47579f;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

public class BottomRightBannerWidget extends LiveRecyclableWidget implements C0053p<KVData>, C4935a {

    /* renamed from: a */
    public boolean f15713a;

    /* renamed from: b */
    public C5594as f15714b;

    /* renamed from: c */
    public boolean f15715c;

    /* renamed from: d */
    private C4934a f15716d;

    /* renamed from: e */
    private C3978e f15717e;

    /* renamed from: f */
    private Room f15718f;

    /* renamed from: g */
    private boolean f15719g;

    /* renamed from: h */
    private C3972b f15720h;

    /* renamed from: i */
    private C4899c f15721i;

    /* renamed from: j */
    private C47562b f15722j = new C47562b();

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.azy;
    }

    /* renamed from: a */
    public final void mo12918a(C8495au auVar) {
        if (isViewValid() && auVar != null && this.f15717e != null) {
            ((C3247af) C7319aa.m22930a(auVar.f23281a).mo19127a(C7333a.m23044b()).mo19134b(C5726l.f16825a).mo19134b((C7327h<? super T, ? extends R>) new C5727m<Object,Object>(this)).mo19127a(C47549a.m148327a()).mo19131a((C47555ab<T, ? extends R>) autoDispose())).mo10186a(new C5728n(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13685a(JSONObject jSONObject) throws Exception {
        this.f15720h.mo11541a(this.f15717e, "H5_roomStatusChange", jSONObject);
    }

    /* renamed from: a */
    public final void mo12919a(C8527bq bqVar) {
        if (!this.f15713a) {
            C9738o.m28712b((View) this.containerView, 0);
            if (this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C4428at(0, true));
            }
            if (this.f15717e != null) {
                this.f15717e.f11853a.setVisibility(4);
                this.containerView.setVisibility(4);
                if (this.f15714b != null) {
                    this.f15714b.mo14067h();
                }
            }
            this.f15713a = true;
        }
        Uri parse = Uri.parse(bqVar.f23440b);
        if (this.f15720h != null && this.f15717e != null && parse != null) {
            this.f15720h.mo11540a(this.f15717e, parse.buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f15718f.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f15718f.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b())).toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13684a(Object obj) throws Exception {
        if (obj instanceof C8292b) {
            m17136a((C8292b) obj);
        }
    }

    public void onClear() {
        super.onClear();
        this.f15720h.mo11539a(this.f15717e);
        this.f15717e = null;
    }

    public void onUnload() {
        this.f15716d.mo8963a();
        this.dataCenter.removeObserver(this);
        if (this.f15722j != null) {
            this.f15722j.mo119660a();
        }
        this.f15713a = false;
        this.f15714b = null;
    }

    public void onPause() {
        super.onPause();
        if (this.f15720h != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", false);
                jSONObject.put("type", "app");
                jSONObject.put("args", jSONObject2);
                this.f15720h.mo11541a(this.f15717e, "H5_appStateChange", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f15720h != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", true);
                jSONObject.put("type", "app");
                jSONObject.put("args", jSONObject2);
                this.f15720h.mo11541a(this.f15717e, "H5_appStateChange", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13683a(C3924b bVar) throws Exception {
        mo12917a(bVar.f11750b);
    }

    /* renamed from: a */
    private <T> void m17138a(Class<T> cls) {
        this.f15722j.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C5729o<Object>(this)));
    }

    /* renamed from: a */
    private void m17136a(C8292b bVar) {
        if (bVar != null && bVar.f22772a == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", bVar.f22773b);
                jSONObject.put("data", bVar.f22774c.toString());
                if (this.f15720h != null) {
                    this.f15720h.mo11541a(this.f15717e, "H5_roomStatusChange", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m17139a(C2379k kVar) throws Exception {
        if (kVar.f7832a == Status.Login) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo13686b(C2379k kVar) {
        if (kVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "0";
            switch (kVar.f7832a) {
                case Login:
                    str = "1";
                    break;
                case Logout:
                    str = "2";
                    break;
                case Update:
                    str = "3";
                    break;
            }
            try {
                jSONObject2.put("code", str);
                jSONObject.put("args", jSONObject2);
                if (!(this.f15717e == null || this.f15717e.f11854b == null || this.f15717e.f11854b.mo11529a() == null)) {
                    this.f15717e.f11854b.mo11529a().mo27206a("H5_loginStatus", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f15720h = C9178j.m27302j().mo22374c();
        try {
            this.f15717e = this.f15720h.mo11534a((Activity) this.context, (C3977d) new C5721g(this));
        } catch (Throwable th) {
            C3166a.m11963b("BottomRightBannerWidget", th);
        }
        if (this.f15717e != null) {
            if (VERSION.SDK_INT <= 19) {
                this.f15717e.f11853a.setLayerType(1, null);
            }
            this.f15717e.f11853a.setBackgroundColor(0);
            this.f15717e.f11853a.setLayoutParams(new LayoutParams(-1, -1));
            ((ViewGroup) this.contentView).addView(this.f15717e.f11853a);
        }
    }

    /* renamed from: a */
    private void m17135a(WebView webView) {
        String str;
        if (isViewValid() && webView != null) {
            webView.setVisibility(0);
            this.containerView.setVisibility(0);
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f15721i != null) {
                    jSONObject.put("data", C3408u.m12669a((Object) this.f15721i.f14009a.f14014b));
                    jSONObject.put("type", "init");
                    this.f15720h.mo11541a(this.f15717e, "H5_roomStatusChange", jSONObject);
                    HashMap hashMap = new HashMap();
                    for (C9357a aVar : this.f15721i.f14009a.f14014b) {
                        hashMap.put("banner_id", String.valueOf(aVar.f25623a));
                        hashMap.put("request_page", "bottomright");
                        C8443c a = C8443c.m25663a();
                        String str2 = "livesdk_live_banner_show";
                        Object[] objArr = new Object[2];
                        C8438j jVar = new C8438j();
                        if (this.f15719g) {
                            str = "live_take_detail";
                        } else {
                            str = "live_detail";
                        }
                        objArr[0] = jVar.mo21598a(str);
                        objArr[1] = Room.class;
                        a.mo21606a(str2, hashMap, objArr);
                    }
                    if (this.f15714b != null) {
                        this.f15714b.mo14066g();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void onLoad(Object... objArr) {
        ViewGroup.LayoutParams layoutParams = this.contentView.getLayoutParams();
        if (this.f15715c) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = C3358ac.m12526d(R.dimen.tf);
            layoutParams.height = C3358ac.m12526d(R.dimen.te);
        }
        this.contentView.setLayoutParams(layoutParams);
        if (this.f15717e != null) {
            this.f15717e.f11853a.setVisibility(4);
        }
        this.containerView.setVisibility(4);
        if (this.dataCenter.get("data_is_anchor") != null) {
            this.f15719g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        }
        if (this.dataCenter.get("data_room") != null) {
            this.f15718f = (Room) this.dataCenter.get("data_room");
            if (this.f15722j != null) {
                this.f15722j.mo119660a();
            }
            this.f15716d = new C4934a(this.f15718f, this.f15719g);
            this.f15716d.mo9142a((C4935a) this);
            InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
            if (inRoomBannerManager != null) {
                ((C3245ad) inRoomBannerManager.mo11475a(Long.valueOf(this.f15718f.getId())).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C5722h(this), new C5723i(this));
            }
            this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_xt_landscape_tab_change", this).observe("data_keyboard_status", this);
            m17138a(C8292b.class);
            ((C3242aa) TTLiveSDKContext.getHostService().mo22367h().mo22183d().mo19164d().mo19150a(C5724j.f16823a).mo19153a((C47579f<T, ? extends R>) C3255e.m12293a((C0043i) this))).mo10179a(new C5725k(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode != -1357019912) {
                    if (hashCode == 1060055221 && key.equals("data_keyboard_status")) {
                        c = 1;
                    }
                } else if (key.equals("data_pre_show_keyboard")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 2;
            }
            switch (c) {
                case 0:
                case 1:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    if (!(this.f15717e == null || this.f15717e.f11853a == null)) {
                        if (booleanValue) {
                            this.f15717e.f11853a.setFocusable(false);
                            return;
                        } else {
                            this.f15717e.f11853a.setFocusable(true);
                            return;
                        }
                    }
                case 2:
                    if (kVData.getData() != null) {
                        if (((Integer) kVData.getData()).intValue() == 0) {
                            this.contentView.setVisibility(0);
                            break;
                        } else {
                            this.contentView.setVisibility(8);
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ JSONObject mo13681a(String str) throws Exception {
        String str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "refresh");
        jSONObject.put("data", str);
        JSONObject jSONObject2 = new JSONObject();
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        String str3 = "";
        String str4 = "";
        if (a instanceof C8420k) {
            C8420k kVar = (C8420k) a;
            if (kVar.mo21568a().containsKey("enter_from")) {
                kVar.mo21568a().get("enter_from");
            }
            if (kVar.mo21568a().containsKey("source")) {
                kVar.mo21568a().get("source");
            }
            HashMap hashMap = new HashMap();
            str3 = (String) hashMap.get("enter_from_merge");
            str4 = (String) hashMap.get("enter_method");
        }
        JSONObject put = jSONObject2.put("enter_from_merge", str3).put("enter_method", str4);
        String str5 = "event_page";
        if (this.f15719g) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        put.put(str5, str2).put("room_id", String.valueOf(this.f15718f.getId())).put("anchor_id", String.valueOf(this.f15718f.getOwnerUserId())).put("request_id", this.f15718f.getRequestId()).put("log_pb", this.f15718f.getLog_pb());
        jSONObject.put("log", jSONObject2);
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo12917a(C4899c cVar) {
        if (!isViewValid() || cVar == null || cVar.f14009a == null || C6311g.m19573a(cVar.f14009a.f14014b)) {
            this.f15713a = false;
            if (this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C4428at(0, false));
            }
            C9738o.m28712b((View) this.containerView, 8);
            return;
        }
        this.f15713a = true;
        C9738o.m28712b((View) this.containerView, 0);
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C4428at(0, true));
        }
        if (this.f15717e != null) {
            this.f15717e.f11853a.setVisibility(4);
            this.containerView.setVisibility(4);
        }
        this.f15721i = cVar;
        this.f15720h.mo11540a(this.f15717e, Uri.parse(this.f15716d.mo12915a(cVar.f14009a.f14013a)).buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f15718f.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f15718f.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b())).toString());
        if (this.f15714b != null) {
            this.f15714b.mo14067h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13682a(WebView webView, String str) {
        m17135a(webView);
    }
}
