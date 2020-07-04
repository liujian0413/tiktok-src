package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.share.C8940a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.depend.share.C9389b.C9391a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveShareWidget extends LiveWidget {

    /* renamed from: a */
    public final C47562b f16215a = new C47562b();

    /* renamed from: b */
    public Room f16216b;

    /* renamed from: c */
    private boolean f16217c;

    /* renamed from: d */
    private User f16218d;

    /* renamed from: e */
    private C0053p<KVData> f16219e = new C5671do(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget$a */
    class C5460a implements C5739a {

        /* renamed from: b */
        private C8791d f16222b;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5460a() {
        }

        public final void onClick(View view) {
            LiveShareWidget.this.mo13918a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13926a(Long l) throws Exception {
            if (this.f16222b != null && this.f16222b.mo21856c()) {
                this.f16222b.dismiss();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13927a(Throwable th) throws Exception {
            if (this.f16222b != null && this.f16222b.mo21856c()) {
                this.f16222b.dismiss();
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            if (C9290a.f25466a && ((Boolean) C8946b.f24406ae.mo22117a()).booleanValue()) {
                LiveShareWidget.this.f16215a.mo119661a(C7492s.m23295b((long) ((Integer) LiveSettingKeys.LIVE_SHARE_GET_DIAMONDS_TIME.mo10240a()).intValue(), TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5673dq<Object>(this, view), C5674dr.f16760a));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13924a(View view, Long l) throws Exception {
            C8946b.f24406ae.mo22118a(Boolean.valueOf(false));
            this.f16222b = (C8791d) ((C8791d) ((C8791d) ((C8791d) C8791d.m26348b(LiveShareWidget.this.getContext()).mo21843a((int) R.layout.ayr)).mo21854c(C3358ac.m12510a(38.0f))).mo21855c(true)).mo21862a(new C5675ds(this, view)).mo21842a();
            this.f16222b.mo21849a(view, 1, 4, C3358ac.m12510a(16.0f), C3358ac.m12510a(-4.0f));
            LiveShareWidget.this.f16215a.mo119661a(C7492s.m23295b(3, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5676dt<Object>(this), (C7326g<? super Throwable>) new C5677du<Object>(this)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13925a(C8791d dVar, View view, View view2) {
            dVar.dismiss();
            onClick(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13923a(View view, View view2, C8791d dVar) {
            view2.setOnClickListener(new C5678dv(this, dVar, view));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.dataCenter.removeObserver(this.f16219e);
        this.f16215a.mo119660a();
    }

    public void onCreate() {
        super.onCreate();
        ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f16217c = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f16216b = (Room) this.dataCenter.get("data_room");
        this.f16218d = (User) this.dataCenter.get("data_user_in_room");
        C5747j.m18105c().mo14165a(ToolbarButton.SHARE, (C5739a) new C5460a());
        this.dataCenter.observe("cmd_wanna_share_live", this.f16219e);
    }

    /* renamed from: a */
    public final void mo13918a() {
        String str;
        String str2 = (String) this.dataCenter.get("log_action_type");
        C8940a e = TTLiveSDKContext.getHostService().mo22364e();
        FragmentActivity fragmentActivity = (FragmentActivity) this.context;
        C9391a a = C9389b.m27848a(this.f16216b);
        if (this.f16217c) {
            str = this.f16216b.getAnchorShareText();
        } else {
            str = this.f16216b.getUserShareText();
        }
        e.mo22110a((Activity) fragmentActivity, a.mo23104b(str).mo23101a(this.f16217c).mo23098a(C9074l.m27081a(this.dataCenter)).mo23107e(str2).mo23102a(), (C9388a) new C9388a() {
            /* renamed from: a */
            public final void mo11627a(Throwable th) {
            }

            /* renamed from: a */
            public final void mo11626a(String str, String str2) {
                LiveShareWidget.this.mo13919a(LiveShareWidget.this.f16216b.getId(), str2, 1, LiveShareWidget.this.f16216b.getLabels());
                LiveShareWidget.this.mo13922a(str, str2);
                if (C9074l.m27086b(LiveShareWidget.this.dataCenter) && LiveShareWidget.this.f16216b.author() != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("anchor_id", String.valueOf(LiveShareWidget.this.f16216b.author().getId()));
                        jSONObject.put("room_id", String.valueOf(LiveShareWidget.this.f16216b.getId()));
                    } catch (JSONException unused) {
                    }
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(LiveShareWidget.this.dataCenter));
                }
                if (C9074l.m27089d(LiveShareWidget.this.dataCenter) && LiveShareWidget.this.f16216b.author() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("anchor_id", String.valueOf(LiveShareWidget.this.f16216b.author().getId()));
                        jSONObject2.put("room_id", String.valueOf(LiveShareWidget.this.f16216b.getId()));
                    } catch (JSONException unused2) {
                    }
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(LiveShareWidget.this.dataCenter));
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13920a(C3479d dVar) throws Exception {
        m17666a((ShareReportResult) dVar.data);
    }

    /* renamed from: a */
    private void m17666a(ShareReportResult shareReportResult) {
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && this.f16216b != null) {
            IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(C4270b.m14424a(this.f16216b.getId(), shareReportResult.getDisplayText(), this.f16218d), true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17665a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r1) goto L_0x004a
            r1 = 3616(0xe20, float:5.067E-42)
            if (r0 == r1) goto L_0x0040
            r1 = 108102557(0x671839d, float:4.5423756E-35)
            if (r0 == r1) goto L_0x0036
            r1 = 113011944(0x6bc6ce8, float:7.0877763E-35)
            if (r0 == r1) goto L_0x002c
            r1 = 1355475581(0x50caea7d, float:2.72349204E10)
            if (r0 == r1) goto L_0x0022
            goto L_0x0054
        L_0x0022:
            java.lang.String r0 = "weixin_moment"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 3
            goto L_0x0055
        L_0x002c:
            java.lang.String r0 = "weibo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 4
            goto L_0x0055
        L_0x0036:
            java.lang.String r0 = "qzone"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 1
            goto L_0x0055
        L_0x0040:
            java.lang.String r0 = "qq"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 0
            goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "weixin"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 2
            goto L_0x0055
        L_0x0054:
            r7 = -1
        L_0x0055:
            switch(r7) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005d;
                case 2: goto L_0x005c;
                case 3: goto L_0x005b;
                case 4: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r6
        L_0x0059:
            r7 = 5
            return r7
        L_0x005b:
            return r2
        L_0x005c:
            return r3
        L_0x005d:
            return r4
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.m17665a(java.lang.String):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13921a(KVData kVData) {
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1741164106) {
                if (hashCode == 239745881 && key.equals("cmd_wanna_share_live")) {
                    c = 0;
                }
            } else if (key.equals("data_user_in_room")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo13918a();
                    return;
                case 1:
                    Object data = kVData.getData();
                    if (data instanceof User) {
                        this.f16218d = (User) data;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo13922a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", str);
        hashMap.put("is_pyramid_sale", "0");
        hashMap.put("type", str2);
        hashMap.put("log_pb", this.f16216b.getLog_pb());
        C8443c.m25663a().mo21606a("share", hashMap, new C8438j().mo21604g("click"), Room.class);
    }

    /* renamed from: a */
    public final void mo13919a(long j, String str, int i, String str2) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendShare(j, new C9079q().mo22259a("target_id", String.valueOf(m17665a(str))).mo22259a("share_type", "1").mo22259a("common_label_list", String.valueOf(str2)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5672dp<Object>(this), C3303k.m12377b());
    }
}
