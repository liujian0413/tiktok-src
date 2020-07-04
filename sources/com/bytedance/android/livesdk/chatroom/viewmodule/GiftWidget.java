package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.gift.C3425a;
import com.bytedance.android.live.gift.C3429b;
import com.bytedance.android.live.gift.GiftType;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.p116b.C2321a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.p168a.C3482a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.event.C4437g;
import com.bytedance.android.livesdk.chatroom.event.C4441k;
import com.bytedance.android.livesdk.chatroom.event.C4442l;
import com.bytedance.android.livesdk.chatroom.model.C4886as;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.p220ui.C5311ee;
import com.bytedance.android.livesdk.chatroom.p220ui.FastGiftView;
import com.bytedance.android.livesdk.chatroom.presenter.C5048y;
import com.bytedance.android.livesdk.chatroom.presenter.C5048y.C5050a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5569b;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5571d;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8262q;
import com.bytedance.android.livesdk.gift.C8263r.C8264a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.GiftDialogFragmentV2;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.impl.C8117c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.p371a.C7862c;
import com.bytedance.android.livesdk.gift.p372b.C7879a;
import com.bytedance.android.livesdk.gift.panel.GiftDialogFragment;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.C8470e;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.p417q.C8784a;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9165b;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class GiftWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5050a {

    /* renamed from: c */
    private static final String f15933c = "com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget";

    /* renamed from: a */
    public boolean f15934a;

    /* renamed from: b */
    public Room f15935b;

    /* renamed from: d */
    private C5048y f15936d;

    /* renamed from: e */
    private boolean f15937e;

    /* renamed from: f */
    private User f15938f;

    /* renamed from: g */
    private JSONObject f15939g;

    /* renamed from: h */
    private C7879a f15940h;

    /* renamed from: i */
    private VideoGiftWidget f15941i;

    /* renamed from: j */
    private DoodleWidget f15942j;

    /* renamed from: k */
    private NormalGiftAnimWidget f15943k;

    /* renamed from: l */
    private GiftDialogFragment f15944l;

    /* renamed from: m */
    private GiftDialogFragmentV2 f15945m;

    /* renamed from: n */
    private boolean f15946n;

    /* renamed from: o */
    private C8117c f15947o;

    /* renamed from: p */
    private long f15948p;

    /* renamed from: q */
    private C5429c f15949q;

    /* renamed from: r */
    private C5427a f15950r;

    /* renamed from: s */
    private C5428b f15951s;

    /* renamed from: t */
    private C5738d f15952t;

    /* renamed from: u */
    private boolean f15953u;

    /* renamed from: v */
    private int f15954v;

    /* renamed from: w */
    private C7321c f15955w;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$a */
    class C5427a implements C5739a {

        /* renamed from: b */
        private View f15963b;

        /* renamed from: c */
        private C8791d f15964c;

        public final void onClick(View view) {
        }

        private C5427a() {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
            if (aVar instanceof C5572e) {
                if (this.f15963b != null) {
                    this.f15963b.setVisibility(((C5572e) aVar).f16625a);
                }
                if (((C5572e) aVar).f16625a == 8 && this.f15964c != null) {
                    this.f15964c.dismiss();
                }
            } else if (aVar instanceof C5571d) {
                if (this.f15963b != null && this.f15963b.getVisibility() == 0 && this.f15963b.getParent() != null) {
                    C5571d dVar = (C5571d) aVar;
                    if (this.f15964c == null) {
                        this.f15964c = (C8791d) ((C8791d) C8791d.m26348b(GiftWidget.this.context).mo21843a((int) R.layout.auy)).mo21842a();
                        PopupWindow popupWindow = this.f15964c.f23856a;
                        if (popupWindow != null) {
                            popupWindow.setFocusable(false);
                            popupWindow.setOutsideTouchable(false);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C3358ac.m12517a((int) R.string.f_o, Integer.valueOf(dVar.f16623a), Integer.valueOf(dVar.f16624b)));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffc95c")), 0, String.valueOf(dVar.f16623a).length(), 33);
                    ((TextView) this.f15964c.mo21851b().findViewById(R.id.dsf)).setText(spannableStringBuilder);
                    if (!this.f15964c.mo21856c()) {
                        this.f15964c.mo21849a(this.f15963b, 1, 0, 0, C3358ac.m12510a(-2.0f));
                    }
                }
            } else if ((aVar instanceof C5569b) && this.f15964c != null) {
                this.f15964c.dismiss();
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            if (this.f15964c != null) {
                this.f15964c.dismiss();
                this.f15964c = null;
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            boolean z;
            this.f15963b = view;
            FastGiftView fastGiftView = new FastGiftView(GiftWidget.this.getContext());
            ((FrameLayout) view).addView(fastGiftView);
            fastGiftView.mo13192a(dataCenter, (Activity) GiftWidget.this.context, (String) dataCenter.get("log_enter_live_source"));
            Room room = (Room) dataCenter.get("data_room", null);
            if (room == null || room.mRoomAuthStatus == null || room.mRoomAuthStatus.enableGift) {
                z = false;
            } else {
                z = true;
            }
            if (GiftManager.inst().getFastGift() == null || z) {
                this.f15963b.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$b */
    class C5428b implements C5739a {

        /* renamed from: b */
        private boolean f15966b;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5428b() {
            this.f15966b = true;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            int i3;
            String str;
            if (this.f15966b) {
                i = R.drawable.cg9;
            } else {
                i = R.drawable.cg_;
            }
            view.setBackgroundResource(i);
            C9097a a = C9097a.m27146a();
            if (this.f15966b) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            a.mo22267a((Object) new C9409a(i2));
            if (this.f15966b) {
                i3 = R.string.est;
            } else {
                i3 = R.string.esu;
            }
            C9049ap.m27022a(i3);
            this.f15966b = !this.f15966b;
            GiftWidget giftWidget = GiftWidget.this;
            StringBuilder sb = new StringBuilder("更新礼物特效开启状态，是否开启: ");
            sb.append(this.f15966b);
            giftWidget.mo13785a(sb.toString());
            C8946b.f24355G.mo22118a(Boolean.valueOf(this.f15966b));
            C8443c a2 = C8443c.m25663a();
            String str2 = "gift_hide";
            Object[] objArr = new Object[2];
            objArr[0] = Room.class;
            C8438j f = new C8438j().mo21599b("live").mo21603f("click");
            if (GiftWidget.this.f15934a) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[1] = f.mo21598a(str);
            a2.mo21607a(str2, objArr);
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            int i;
            int i2;
            this.f15966b = ((Boolean) C8946b.f24355G.mo22117a()).booleanValue();
            if (this.f15966b) {
                i = R.drawable.cg_;
            } else {
                i = R.drawable.cg9;
            }
            view.setBackgroundResource(i);
            C9097a a = C9097a.m27146a();
            if (this.f15966b) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            a.mo22267a((Object) new C9409a(i2));
            GiftWidget giftWidget = GiftWidget.this;
            StringBuilder sb = new StringBuilder("是否开启礼物特效: ");
            sb.append(this.f15966b);
            giftWidget.mo13785a(sb.toString());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$c */
    class C5429c implements C5739a {

        /* renamed from: b */
        private C8784a f15968b;

        /* renamed from: c */
        private View f15969c;

        /* renamed from: d */
        private C7321c f15970d;

        /* renamed from: a */
        private void m17368a() {
            if (GiftWidget.this.dataCenter != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "bottom_tab");
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", PanelType.GIFT);
                GiftWidget.this.mo13781a((User) null);
            }
            if (this.f15968b != null && this.f15968b.mo21856c()) {
                this.f15968b.dismiss();
            }
        }

        private C5429c() {
        }

        public final void onClick(View view) {
            if (!(GiftWidget.this.f15935b == null || !GiftWidget.this.f15935b.isOfficial() || GiftWidget.this.dataCenter == null)) {
                GiftWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_official_hide", Boolean.valueOf(true));
            }
            m17368a();
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
            String str;
            if (aVar instanceof C5572e) {
                if (this.f15969c != null) {
                    this.f15969c.setVisibility(((C5572e) aVar).f16625a);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
                String str2 = "view_status";
                if (this.f15969c.getVisibility() == 0) {
                    str = "VISIBLE";
                } else {
                    str = "GONE";
                }
                hashMap.put(str2, str);
                C8444d.m25673b().mo10001b("ttlive_gift", (Map<String, ?>) hashMap);
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            if (this.f15970d != null && !this.f15970d.isDisposed()) {
                this.f15970d.dispose();
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f15969c = view;
            Room room = (Room) dataCenter.get("data_enter_room");
            if (room == null) {
                room = (Room) dataCenter.get("data_room");
            }
            if (room != null && room.isOfficial()) {
                view.setBackgroundResource(R.drawable.c8h);
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
        return R.layout.b03;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(final KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -2034855137:
                    if (key.equals("cmd_normal_gift_layout_bottom_margin_update")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1357019912:
                    if (key.equals("data_pre_show_keyboard")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1328547149:
                    if (key.equals("cmd_show_special_group_gift")) {
                        c = 3;
                        break;
                    }
                    break;
                case -763908145:
                    if (key.equals("cmd_clear_gift_message")) {
                        c = 0;
                        break;
                    }
                    break;
                case -708170936:
                    if (key.equals("cmd_normal_gift_layout_height_update")) {
                        c = 9;
                        break;
                    }
                    break;
                case -171438776:
                    if (key.equals("cmd_show_gift_relay_dialog")) {
                        c = 11;
                        break;
                    }
                    break;
                case 279172201:
                    if (key.equals("cmd_show_screen")) {
                        c = 12;
                        break;
                    }
                    break;
                case 333436001:
                    if (key.equals("cmd_gift_dialog_switch")) {
                        c = 10;
                        break;
                    }
                    break;
                case 908414801:
                    if (key.equals("cmd_gift_entry_click")) {
                        c = 7;
                        break;
                    }
                    break;
                case 948744782:
                    if (key.equals("cmd_stop_special_gift")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1055337807:
                    if (key.equals("cmd_show_notify_special_gift")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1433895618:
                    if (key.equals("cmd_send_gift")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1954026424:
                    if (key.equals("cmd_do_send_gift")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m17341i();
                    return;
                case 1:
                    return;
                case 2:
                    User user = (User) kVData.getData();
                    if (isViewValid()) {
                        mo13781a(user);
                        return;
                    }
                    break;
                case 3:
                    C8489ao aoVar = (C8489ao) kVData.getData();
                    if (isViewValid()) {
                        m17330a("处理小礼物的连发特效", String.valueOf(aoVar.f23254c), (String) null);
                        mo13784a(aoVar);
                        return;
                    }
                    break;
                case 4:
                    this.containerView.post(new Runnable() {
                        public final void run() {
                            C8489ao aoVar = (C8489ao) kVData.getData();
                            if (GiftWidget.this.isViewValid()) {
                                GiftWidget.m17330a("处理直播间跳转mock的礼物动画", String.valueOf(aoVar.f23254c), String.valueOf(aoVar.getMessageId()));
                                GiftWidget.this.mo13784a(aoVar);
                            }
                        }
                    });
                    return;
                case 5:
                    C4437g gVar = (C4437g) kVData.getData();
                    m17324a(gVar.f12882b, gVar.f12883c, gVar.f12881a);
                    return;
                case 6:
                    this.containerView.requestFocus();
                    return;
                case 7:
                    if (this.f15949q != null) {
                        this.f15949q.onClick(null);
                        return;
                    }
                    break;
                case 8:
                    m17323a(((Integer) kVData.getData()).intValue());
                    return;
                case 9:
                    m17333b(((Integer) kVData.getData()).intValue());
                    return;
                case 10:
                    m17327a((C4441k) kVData.getData());
                    return;
                case 11:
                    m17337d();
                    return;
                case 12:
                    this.f15941i.mo14037a(((Boolean) kVData.getData(Boolean.valueOf(true))).booleanValue());
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13782a(PkState pkState) throws Exception {
        if (this.f15941i != null) {
            this.f15941i.mo14033a(pkState);
        }
    }

    /* renamed from: a */
    public final void mo13783a(C8158m mVar, int i) {
        if (isViewValid()) {
            if (this.f15947o == null || !this.f15947o.isShowing()) {
                C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
                if (findGiftById != null && (findGiftById.f22234e == 2 || findGiftById.f22234e == 8 || findGiftById.f22234e == 4)) {
                    String str = (String) this.dataCenter.get("log_enter_live_source");
                    C8117c cVar = new C8117c((Activity) this.context, this.f15935b, this.f15938f, this.f15934a, ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue(), mVar, str, i);
                    this.f15947o = cVar;
                    this.f15947o.f22149d = this.f15948p;
                    this.f15947o.f22146a = this.dataCenter;
                    this.f15947o.f22147b = new C5589an(this);
                    this.f15947o.setCanceledOnTouchOutside(true);
                    this.f15947o.show();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13788b(java.lang.Throwable r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            boolean r0 = r6.isViewValid()
            if (r0 == 0) goto L_0x015d
            android.content.Context r0 = r6.context
            if (r0 != 0) goto L_0x000c
            goto L_0x015d
        L_0x000c:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r6.dataCenter
            java.lang.String r1 = "data_is_portrait"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r1 = r7 instanceof com.bytedance.android.livesdk.gift.mvp.SendGiftFailException
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00fe
            boolean r1 = r7 instanceof com.bytedance.android.live.api.exceptions.server.ApiServerException
            if (r1 == 0) goto L_0x0032
            r4 = r7
            com.bytedance.android.live.api.exceptions.server.ApiServerException r4 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r4
            int r4 = r4.getErrorCode()
            r5 = 40001(0x9c41, float:5.6053E-41)
            if (r4 != r5) goto L_0x0032
            goto L_0x00fe
        L_0x0032:
            if (r1 == 0) goto L_0x0070
            r0 = r7
            com.bytedance.android.live.api.exceptions.server.ApiServerException r0 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r0
            int r0 = r0.getErrorCode()
            r4 = 90501(0x16185, float:1.26819E-40)
            if (r0 != r4) goto L_0x0070
            com.bytedance.android.livesdk.gift.u r7 = com.bytedance.android.livesdk.gift.C8284u.m25332a()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.f15935b
            long r0 = r0.getId()
            r7.mo21438b(r0)
            com.bytedance.android.livesdk.widget.h$a r7 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r0 = r6.context
            r7.<init>(r0)
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22716a(r3)
            r0 = 2131828435(0x7f111ed3, float:1.928981E38)
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22710a(r0)
            r0 = 2131827979(0x7f111d0b, float:1.9288886E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4 r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget$4
            r1.<init>()
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22722b(r2, r0, r1)
            r7.mo22729d()
            goto L_0x0157
        L_0x0070:
            if (r1 == 0) goto L_0x00c0
            com.bytedance.android.live.api.exceptions.server.ApiServerException r7 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r7
            int r0 = r7.getErrorCode()
            r1 = 43011(0xa803, float:6.0271E-41)
            if (r0 != r1) goto L_0x00a1
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.SEND_GIFT_NOTFANS_DIALOG_ISOPEN
            java.lang.Object r1 = r1.mo10240a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a1
            boolean r1 = r6.f15934a
            if (r1 != 0) goto L_0x00a1
            com.bytedance.android.live.core.setting.l<java.lang.String> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.SEND_GIFT_FAIL_DIALOG_URL
            java.lang.Object r1 = r1.mo10240a()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a1
            r6.m17340h()
            goto L_0x00b1
        L_0x00a1:
            r1 = 40032(0x9c60, float:5.6097E-41)
            if (r0 != r1) goto L_0x00aa
            r6.m17335c()
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r7 = r7.getPrompt()
            com.bytedance.android.livesdk.utils.C9049ap.m27028a(r7)
        L_0x00b1:
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r6.f15935b
            r7.getId()
            goto L_0x0157
        L_0x00c0:
            boolean r0 = r7 instanceof com.bytedance.android.live.api.exceptions.local.EmptyResponseException
            if (r0 == 0) goto L_0x00cf
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r6.f15935b
            r7.getId()
            goto L_0x00f7
        L_0x00cf:
            boolean r0 = r7 instanceof com.bytedance.android.live.api.exceptions.local.ResponseNoDataException
            if (r0 == 0) goto L_0x00de
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r6.f15935b
            r7.getId()
            goto L_0x00f7
        L_0x00de:
            boolean r7 = r7 instanceof com.bytedance.android.live.api.exceptions.local.ResponseWrongFormatException
            if (r7 == 0) goto L_0x00ed
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r6.f15935b
            r7.getId()
            goto L_0x00f7
        L_0x00ed:
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r6.f15935b
            r7.getId()
        L_0x00f7:
            r7 = 2131828921(0x7f1120b9, float:1.9290797E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r7)
            goto L_0x0157
        L_0x00fe:
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r7 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE
            java.lang.Object r7 = r7.mo10240a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r1 = com.bytedance.android.livesdkapi.p435b.C9290a.f25466a
            if (r1 == 0) goto L_0x014a
            if (r7 == r3) goto L_0x014a
            boolean r7 = r6.f15934a
            if (r7 == 0) goto L_0x0115
            goto L_0x014a
        L_0x0115:
            com.bytedance.android.livesdk.widget.h$a r7 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r0 = r6.context
            r7.<init>(r0, r2)
            android.content.Context r0 = r6.context
            r1 = 2131828732(0x7f111ffc, float:1.9290413E38)
            java.lang.String r0 = r0.getString(r1)
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22727c(r0)
            r0 = 2131828766(0x7f11201e, float:1.9290482E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.ao r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.ao
            r1.<init>(r6)
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22722b(r2, r0, r1)
            r0 = 2131827526(0x7f111b46, float:1.9287967E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.ap r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.ap
            r1.<init>(r6)
            com.bytedance.android.livesdk.widget.h$a r7 = r7.mo22722b(r3, r0, r1)
            r7.mo22729d()
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdk.log.C8448g.m25682a(r7)
            goto L_0x0157
        L_0x014a:
            r7 = 2131828916(0x7f1120b4, float:1.9290786E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r7)
            android.content.Context r7 = r6.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r6.f15935b
            r6.m17325a(r7, r1, r0)
        L_0x0157:
            if (r8 == 0) goto L_0x015c
            r8.run()
        L_0x015c:
            return
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget.mo13788b(java.lang.Throwable, java.lang.Runnable):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13780a(DialogInterface dialogInterface, int i) {
        C8448g.m25682a(this.context);
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public final void mo13099a(C8489ao aoVar, boolean z) {
        if (isViewValid()) {
            long j = (long) aoVar.f23256e;
            if (!(this.f15935b == null || this.f15935b.getOwner() == null || ((aoVar.f23253b != null && 0 != aoVar.f23253b.getId() && aoVar.f23253b.getId() != this.f15935b.getOwner().getId()) || (aoVar.f23265n && j == 0)))) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(j));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(aoVar.f23257f));
            }
            if (!z || aoVar.f23265n || aoVar.f23258g == 1) {
                C8149d findGiftById = GiftManager.inst().findGiftById(aoVar.f23254c);
                if (findGiftById == null) {
                    String str = f15933c;
                    StringBuilder sb = new StringBuilder("用户本地没有该礼物， giftMessageId = ");
                    sb.append(aoVar.getMessageId());
                    sb.append(",  giftId = ");
                    sb.append(aoVar.f23254c);
                    C3166a.m11966e(str, sb.toString());
                    return;
                }
                GiftType giftType = GiftManager.inst().getGiftType(findGiftById);
                if (!m17331a(aoVar, giftType)) {
                    switch (giftType) {
                        case GOLDEN_BEAN_CELL:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case FREE_CELL:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case NORMAL_GIFT:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case TASK_GIFT:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case STICKER_GIFT:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case GAME:
                            this.f15943k.mo13963a(aoVar);
                            return;
                        case MIDDLE_GIFT:
                            this.f15941i.mo14036a(aoVar);
                            return;
                        case SPECIAL_GIFT:
                            this.f15941i.mo14036a(aoVar);
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13100a(C8696z zVar, boolean z) {
        if (isViewValid() && zVar != null) {
            if (zVar.f23701b == null || 0 == zVar.f23701b.getId() || zVar.f23701b.getId() == this.f15935b.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(zVar.f23704e));
            }
            if (this.f15937e || !z) {
                this.f15942j.mo13748a(zVar);
                return;
            }
            if (zVar.f23700a != null && zVar.f23700a.getId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
                this.f15942j.mo13748a(zVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo13097a(C8158m mVar) {
        if (mVar != null) {
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
            if (((C3495l) C3596c.m13172a(C3495l.class)).messageManagerHelper().mo10513a() != null && isViewValid()) {
                ((C3495l) C3596c.m13172a(C3495l.class)).messageManagerHelper().mo10513a().insertMessage(C8163o.m24998a(this.f15935b.getId(), mVar, (User) this.dataCenter.get("data_user_in_room")));
            }
            m17334b(mVar);
        }
    }

    /* renamed from: a */
    public final void mo13098a(C8472a aVar) {
        this.f15941i.mo14035a(aVar);
    }

    /* renamed from: a */
    public final void mo13101a(List<TaskGiftEvent> list) {
        if (isViewValid()) {
            new C5311ee(this.context, this.f15935b, list, null).show();
        }
    }

    /* renamed from: a */
    public final void mo13784a(C8489ao aoVar) {
        if (aoVar != null) {
            aoVar.f23264m = true;
            mo13099a(aoVar, false);
        }
    }

    /* renamed from: a */
    public final void mo13785a(String str) {
        m17330a(str, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m17330a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str3);
        }
        C8444d.m25673b().mo9999a("ttlive_gift", (Map<String, ?>) hashMap);
    }

    /* renamed from: f */
    private void m17338f() {
        if (this.f15947o != null && this.f15947o.isShowing()) {
            this.f15947o.dismiss();
            this.f15947o = null;
        }
    }

    /* renamed from: g */
    private static void m17339g() {
        C9097a.m27146a().mo22267a((Object) new C4442l(1, 2));
        C8946b.f24470bx.mo22118a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    private void m17322a() {
        enableSubWidgetManager();
        this.f15943k = new NormalGiftAnimWidget();
        this.f15942j = new DoodleWidget();
        this.f15941i = new VideoGiftWidget();
        this.subWidgetManager.load(R.id.c51, this.f15943k);
        this.subWidgetManager.load(R.id.ea7, this.f15941i, false);
    }

    /* renamed from: d */
    private void m17337d() {
        if (!this.f15946n || this.f15945m == null || !this.f15945m.f11448j) {
            if (this.f15944l != null && this.f15944l.f11448j) {
                this.f15944l.dismissAllowingStateLoss();
                this.f15944l = null;
            }
            return;
        }
        this.f15945m.dismissAllowingStateLoss();
        this.f15945m = null;
    }

    /* renamed from: i */
    private void m17341i() {
        C3425a.m12724a().mo10391b();
        this.f15943k.mo13960a();
        if (((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo10240a()).booleanValue()) {
            C8470e.m25735a().mo21646c();
            return;
        }
        this.f15942j.mo13747a();
        this.f15941i.mo14039b();
    }

    /* renamed from: c */
    private void m17335c() {
        new C9249a(getContext(), 0).mo22716a(true).mo22727c((CharSequence) C1642a.m8034a(getContext().getResources().getString(R.string.edu), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_ANCHOR_LIMIT.mo10240a()})).mo22722b(0, (int) R.string.ehy, (OnClickListener) new C5587al(this)).mo22722b(1, (int) R.string.ehz, C5588am.f16657a).mo22720b().show();
    }

    public void onUnload() {
        C9165b.m27243a().mo22359c();
        this.f15952t.mo14167b(ToolbarButton.GIFT, this.f15949q);
        this.f15952t.mo14167b(ToolbarButton.FAST_GIFT, this.f15950r);
        this.f15952t.mo14167b(ToolbarButton.GIFT_ANIMATION, this.f15951s);
        m17341i();
        m17337d();
        m17338f();
        if (this.f15955w != null && !this.f15955w.isDisposed()) {
            this.f15955w.dispose();
        }
        this.dataCenter.removeObserver(this);
        ((C3440a) C3596c.m13172a(C3440a.class)).removeObserve();
        this.f15936d.mo8963a();
        mo13785a("GiftWidget unLoad");
        if (this.f15940h != null) {
            this.f15940h.mo20668a();
        }
        this.f15944l = null;
        this.f15945m = null;
        this.f15947o = null;
    }

    /* renamed from: b */
    private void m17332b() {
        C3482a crossRoomGift = ((C3495l) C3596c.m13172a(C3495l.class)).getCrossRoomGift();
        if (crossRoomGift != null) {
            Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
            if (currentRoom != null && !crossRoomGift.mo10465a() && !TextUtils.isEmpty(crossRoomGift.f10310a) && crossRoomGift.f10311b != null && crossRoomGift.f10312c > 0) {
                try {
                    String queryParameter = Uri.parse(crossRoomGift.f10310a).getQueryParameter("room_id");
                    if (!C6319n.m19593a(queryParameter)) {
                        if (currentRoom.getId() == Long.parseLong(queryParameter)) {
                            try {
                                String queryParameter2 = Uri.parse(crossRoomGift.f10310a).getQueryParameter("gift_id");
                                if (!C6319n.m19593a(queryParameter2)) {
                                    long parseLong = Long.parseLong(queryParameter2);
                                    User user = crossRoomGift.f10311b;
                                    if (GiftManager.inst().findGiftById(parseLong) != null) {
                                        C8489ao aoVar = new C8489ao();
                                        C9500b bVar = new C9500b();
                                        bVar.f25994d = crossRoomGift.f10312c;
                                        aoVar.baseMessage = bVar;
                                        aoVar.f23254c = parseLong;
                                        aoVar.f23252a = user;
                                        this.dataCenter.lambda$put$1$DataCenter("cmd_show_notify_special_gift", aoVar);
                                        return;
                                    }
                                    return;
                                }
                                throw new IllegalStateException("schema not contain enableGift id");
                            } catch (Exception e) {
                                C3166a.m11955a(6, f15933c, e.getStackTrace());
                            }
                        }
                    } else {
                        throw new IllegalStateException("schema not contain room id");
                    }
                } catch (Exception e2) {
                    C3166a.m11955a(6, f15933c, e2.getStackTrace());
                }
            }
        }
    }

    /* renamed from: h */
    private void m17340h() {
        String str;
        String str2;
        Map map;
        if (C3596c.m13172a(C2321a.class) != null) {
            String str3 = (String) this.dataCenter.get("log_action_type");
            if (C9074l.m27086b(this.dataCenter) || C9074l.m27089d(this.dataCenter)) {
                if (C9074l.m27086b(this.dataCenter)) {
                    map = C9074l.m27087c(this.dataCenter);
                } else {
                    map = C9074l.m27090e(this.dataCenter);
                }
                JSONObject jSONObject = new JSONObject(map);
                HashMap hashMap = new HashMap();
                hashMap.put("live_ad", jSONObject.toString());
                ((C2321a) C3596c.m13172a(C2321a.class)).showJoinFansDialog(getContext(), this.f15935b, str3, "fans_gift", this.f15937e, hashMap);
            } else {
                ((C2321a) C3596c.m13172a(C2321a.class)).showJoinFansDialog(getContext(), this.f15935b, str3, "fans_gift", this.f15937e, null);
            }
        }
        HashMap hashMap2 = new HashMap();
        String str4 = "anchor_id";
        if (this.f15935b != null) {
            str = String.valueOf(this.f15935b.getOwnerUserId());
        } else {
            str = "0";
        }
        hashMap2.put(str4, str);
        String str5 = "room_id";
        if (this.f15935b != null) {
            str2 = String.valueOf(this.f15935b.getId());
        } else {
            str2 = "0";
        }
        hashMap2.put(str5, str2);
        C8443c.m25663a().mo21606a("livesdk_fans_club_gift_notfan_click", hashMap2, new Object[0]);
    }

    /* renamed from: a */
    public final void mo13781a(User user) {
        m17326a(user, false);
    }

    /* renamed from: b */
    public final void mo13102b(Throwable th) {
        mo13788b(th, (Runnable) null);
    }

    public void onInit(Object... objArr) {
        this.f15936d = new C5048y();
    }

    public void onEvent(C4886as asVar) {
        if (isViewValid()) {
            this.f15936d.mo13095b();
        }
    }

    /* renamed from: a */
    private <T> void m17329a(Class<T> cls) {
        C9097a.m27146a().mo22266a(cls).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4430av) {
                    GiftWidget.this.onEvent((C4430av) t);
                } else if (t instanceof C4886as) {
                    GiftWidget.this.onEvent((C4886as) t);
                } else if (t instanceof C7862c) {
                    GiftWidget.this.onEvent((C7862c) t);
                } else {
                    if (t instanceof C4442l) {
                        GiftWidget.this.onEvent((C4442l) t);
                    }
                }
            }
        });
    }

    public void onEvent(C7862c cVar) {
        if (this.isViewValid && cVar.f21247a == 1) {
            m17326a((User) null, true);
        }
    }

    /* renamed from: b */
    private void m17333b(int i) {
        if (isViewValid() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.c51);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            layoutParams.height = i;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public void onEvent(C4430av avVar) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_gift_panel_type", avVar.f12866c);
            this.dataCenter.lambda$put$1$DataCenter("data_gift_log_extra", avVar.f12865b);
            this.f15948p = avVar.f12867d;
            mo13781a(avVar.f12864a);
        }
    }

    /* renamed from: a */
    private void m17323a(int i) {
        if (isViewValid() && getContext() != null) {
            this.f15954v = i;
            if (!this.f15953u) {
                ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.c51);
                LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
                layoutParams.bottomMargin = i;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: b */
    private void m17334b(C8158m mVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(mVar.f22320x)) {
            hashMap.put("request_page", mVar.f22320x);
        }
        hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
        hashMap.put("growth_deepevent", "1");
        C8443c a = C8443c.m25663a();
        String str2 = "send_gift";
        Object[] objArr = new Object[3];
        C8438j jVar = new C8438j();
        if (this.f15934a) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = jVar.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
        objArr[1] = Room.class;
        objArr[2] = C8163o.m24997a(mVar);
        a.mo21606a(str2, hashMap, objArr);
    }

    public void onEvent(C4442l lVar) {
        if (lVar != null && lVar.f12894a == 2 && lVar.f12895b == 1) {
            C8946b.f24471by.mo22118a(Boolean.valueOf(true));
            return;
        }
        if (lVar != null && lVar.f12894a == 2 && lVar.f12895b == 2) {
            C8946b.f24471by.mo22118a(Boolean.valueOf(false));
        }
    }

    public void onLoad(Object... objArr) {
        boolean z;
        long j;
        long j2;
        C9165b.m27243a().mo22358b();
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f15946n = z;
        this.f15937e = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f15936d.mo9142a((C5050a) this);
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        m17322a();
        this.f15952t = ((C3495l) C3596c.m13172a(C3495l.class)).toolbarManagerHelper().mo10530a();
        this.f15949q = new C5429c();
        this.f15950r = new C5427a();
        this.f15951s = new C5428b();
        this.f15952t.mo14165a(ToolbarButton.GIFT, (C5739a) this.f15949q);
        this.f15952t.mo14165a(ToolbarButton.FAST_GIFT, (C5739a) this.f15950r);
        this.f15952t.mo14165a(ToolbarButton.GIFT_ANIMATION, (C5739a) this.f15951s);
        mo13785a("Load GiftWidget,ToolbarManager load Gift and FastGift behavior");
        m17329a(C4430av.class);
        m17329a(C4886as.class);
        m17329a(C7862c.class);
        m17329a(C4442l.class);
        this.f15934a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15935b = (Room) this.dataCenter.get("data_room");
        if (this.f15935b != null) {
            j = this.f15935b.getId();
        } else {
            j = 0;
        }
        if (this.f15935b == null || this.f15935b.getOwner() == null) {
            j2 = 0;
        } else {
            j2 = this.f15935b.getOwner().getId();
        }
        C7879a aVar = new C7879a(j, j2, this.context);
        this.f15940h = aVar;
        this.dataCenter.observeForever("cmd_clear_gift_message", this).observe("cmd_stop_special_gift", this).observe("cmd_send_gift", this).observe("cmd_show_special_group_gift", this).observe("cmd_show_notify_special_gift", this).observe("cmd_do_send_gift", this).observe("cmd_show_gift_relay_dialog", this).observe("cmd_gift_entry_click", this).observe("data_pre_show_keyboard", this).observe("cmd_normal_gift_layout_bottom_margin_update", this, true).observe("cmd_normal_gift_layout_height_update", this, true).observe("cmd_gift_dialog_switch", this).observe("cmd_show_screen", this);
        ((C3440a) C3596c.m13172a(C3440a.class)).registerObserve();
        this.f15955w = ((C3440a) C3596c.m13172a(C3440a.class)).observePkState().mo19280a((C7326g<? super T>) new C5586ak<Object>(this), C3303k.m12377b());
        this.f15939g = new JSONObject();
        try {
            this.f15939g.put("source", this.f15935b.getUserFrom());
            this.f15939g.put("live_source", this.dataCenter.get("log_live_feed_layout"));
            this.f15939g.put("request_id", this.f15935b.getRequestId());
            this.f15939g.put("log_pb", this.f15935b.getLog_pb());
            this.f15939g.put("enter_from", this.dataCenter.get("log_enter_live_source"));
        } catch (Exception unused) {
        }
        m17332b();
    }

    /* renamed from: a */
    private void m17327a(C4441k kVar) {
        if (isViewValid() && getContext() != null) {
            this.f15953u = kVar.f12892a;
            ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.c51);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            int i = kVar.f12893b;
            if (kVar.f12892a) {
                if (layoutParams.bottomMargin >= i) {
                    return;
                }
            } else if (this.f15954v != 0) {
                i = this.f15954v;
            } else {
                i = (int) getContext().getResources().getDimension(R.dimen.pq);
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "translationY", new float[]{(float) (layoutParams.bottomMargin - i)}).setDuration(300);
            ViewGroup viewGroup2 = (ViewGroup) this.contentView.findViewById(R.id.arl);
            if (viewGroup2 != null) {
                ObjectAnimator.ofFloat(viewGroup2, "translationY", new float[]{(float) (layoutParams.bottomMargin - i)}).setDuration(300).start();
            }
            duration.start();
        }
    }

    /* renamed from: a */
    private static boolean m17331a(C8489ao aoVar, GiftType giftType) {
        C3429b a = C3425a.m12724a().mo10389a(giftType);
        if (a == null) {
            return false;
        }
        a.mo9341a(aoVar);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13787b(DialogInterface dialogInterface, int i) {
        C8448g.m25682a(this.context);
        C8448g.m25682a(this.context);
        ((IHostApp) C3596c.m13172a(IHostApp.class)).openWallet((Activity) this.context);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13789d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String str = (String) LiveSettingKeys.LIVE_MT_LOW_AGE_REPORT_URL.mo10240a();
        if (TextUtils.isEmpty(str)) {
            str = C8262q.m25252b();
        }
        ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, str);
        if (C3596c.m13172a(C3592a.class) != null && ((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
            C8443c.m25663a().mo21606a("livesdk_anchor_click_contact_us", hashMap, Room.class, new C8438j());
        }
    }

    /* renamed from: a */
    private void m17326a(User user, boolean z) {
        if (isViewValid() && this.f15935b != null) {
            if ((!this.f15946n || this.f15945m == null || !this.f15945m.mo11345g()) && (this.f15944l == null || !this.f15944l.mo11345g())) {
                IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
                if (a != null && a.childrenManagerForbidWalletFunctions()) {
                    C3517a.m12960a(this.context, (int) R.string.edf);
                } else if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
                    C9049ap.m27022a((int) R.string.f0i);
                } else if ((user == null || this.f15935b.getOwner().getId() == user.getId()) && C8262q.m25250a(this.f15935b, this.f15934a) == 2) {
                    m17335c();
                } else {
                    this.f15938f = user;
                    boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                    PanelType panelType = PanelType.GIFT;
                    if (this.dataCenter.has("data_gift_panel_type")) {
                        panelType = (PanelType) this.dataCenter.get("data_gift_panel_type");
                    }
                    PanelType panelType2 = panelType;
                    Bundle bundle = (Bundle) this.dataCenter.get("data_gift_log_extra");
                    String str = (String) this.dataCenter.get("log_enter_live_source");
                    C54243 r11 = new C8264a() {
                        /* renamed from: a */
                        public final boolean mo13796a(Exception exc, Runnable runnable) {
                            GiftWidget.this.mo13788b((Throwable) exc, runnable);
                            return GiftWidget.this.isViewValid();
                        }

                        /* renamed from: a */
                        public final boolean mo13795a(C8158m mVar, int i, boolean z) {
                            int i2;
                            if (z) {
                                GiftWidget.this.mo13783a(mVar, i);
                            }
                            int i3 = 0;
                            if (C9074l.m27086b(GiftWidget.this.dataCenter) && GiftWidget.this.f15935b.author() != null) {
                                C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
                                JSONObject jSONObject = new JSONObject();
                                String str = "amount";
                                if (findGiftById == null) {
                                    i2 = 0;
                                } else {
                                    try {
                                        i2 = findGiftById.f22235f;
                                    } catch (JSONException unused) {
                                    }
                                }
                                jSONObject.put(str, String.valueOf(i2));
                                jSONObject.put("anchor_id", String.valueOf(GiftWidget.this.f15935b.author().getId()));
                                jSONObject.put("room_id", String.valueOf(GiftWidget.this.f15935b.getId()));
                                C3596c.m13172a(C9295a.class);
                                C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(GiftWidget.this.dataCenter));
                            }
                            if (C9074l.m27089d(GiftWidget.this.dataCenter) && GiftWidget.this.f15935b.author() != null) {
                                C8149d findGiftById2 = GiftManager.inst().findGiftById(mVar.f22301e);
                                JSONObject jSONObject2 = new JSONObject();
                                String str2 = "amount";
                                if (findGiftById2 != null) {
                                    try {
                                        i3 = findGiftById2.f22235f;
                                    } catch (JSONException unused2) {
                                    }
                                }
                                jSONObject2.put(str2, String.valueOf(i3));
                                jSONObject2.put("anchor_id", String.valueOf(GiftWidget.this.f15935b.author().getId()));
                                jSONObject2.put("room_id", String.valueOf(GiftWidget.this.f15935b.getId()));
                                C3596c.m13172a(C9295a.class);
                                C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(GiftWidget.this.dataCenter));
                            }
                            return GiftWidget.this.isViewValid();
                        }
                    };
                    this.dataCenter.lambda$put$1$DataCenter("data_gift_group_id", Long.valueOf(this.f15948p));
                    if (!this.f15946n || !(this.context instanceof FragmentActivity)) {
                        Activity activity = (Activity) this.context;
                        Room room = this.f15935b;
                        if (user == null) {
                            user = this.f15935b.getOwner();
                        }
                        this.f15944l = GiftDialogFragment.m25004a(activity, room, user, panelType2, this.f15934a, booleanValue, str, z, this.f15940h);
                        this.f15944l.f22332d = this.dataCenter;
                        this.f15944l.f22333e = r11;
                    } else {
                        GiftViewModel giftViewModel = (GiftViewModel) C0069x.m159a((FragmentActivity) this.context).mo147a(GiftViewModel.class);
                        giftViewModel.mo20785a(this.context);
                        Context context = this.context;
                        boolean z2 = this.f15934a;
                        if (user == null) {
                            user = this.f15935b.getOwner();
                        }
                        this.f15945m = GiftDialogFragmentV2.m24191a(context, booleanValue, panelType2, z2, user, str, this.dataCenter, r11, giftViewModel);
                    }
                    if (this.context instanceof FragmentActivity) {
                        if (this.f15946n) {
                            this.f15945m.show(((FragmentActivity) this.context).getSupportFragmentManager(), "GiftDialogFragmentV2");
                        } else {
                            this.f15944l.show(((FragmentActivity) this.context).getSupportFragmentManager(), "GiftDialogFragment");
                        }
                        m17339g();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("live_source", this.f15939g.opt("live_source"));
                            jSONObject.put("request_id", this.f15935b.getRequestId());
                            jSONObject.put("log_pb", this.f15935b.getLog_pb());
                        } catch (Exception unused) {
                        }
                        C8448g.m25682a(this.context);
                        this.f15935b.getId();
                        HashMap hashMap = new HashMap();
                        if (bundle != null) {
                            for (String str2 : bundle.keySet()) {
                                Object obj = bundle.get(str2);
                                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                    hashMap.put(str2, String.valueOf(obj));
                                }
                            }
                        }
                        C8443c.m25663a().mo21606a("gift_show", hashMap, Room.class, new C8438j().mo21599b("live_interact").mo21598a("live_detail"), new C8439k());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m17324a(long j, int i, String str) {
        if (isViewValid()) {
            if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
                C9049ap.m27022a((int) R.string.f0i);
            } else {
                this.f15936d.mo13093a((String) this.dataCenter.get("log_enter_live_source"), j, null, i, str);
            }
        }
    }

    /* renamed from: a */
    private void m17325a(Context context, Room room, boolean z) {
        if (context instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f15934a);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "gift");
            ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog((FragmentActivity) context, bundle, this.dataCenter, null);
        }
    }
}
