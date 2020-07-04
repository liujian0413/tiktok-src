package com.bytedance.android.live.broadcast.dutygift;

import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p125a.C2415a.C2416a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.dutygift.C2543a.C2544a;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p209bl.C4267a;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5295a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8156k;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

public class DutyGiftControlWidget extends LiveWidget implements C0053p<KVData>, C2425a, C2544a {

    /* renamed from: a */
    public C9355c f8177a;

    /* renamed from: b */
    public DutyGiftInfo f8178b;

    /* renamed from: c */
    private C2542a f8179c;

    /* renamed from: d */
    private C2557n f8180d;

    /* renamed from: e */
    private C2543a f8181e;

    /* renamed from: f */
    private Room f8182f;

    /* renamed from: g */
    private String f8183g;

    /* renamed from: h */
    private long f8184h;

    /* renamed from: i */
    private int f8185i;

    /* renamed from: j */
    private C5290du f8186j;

    /* renamed from: com.bytedance.android.live.broadcast.dutygift.DutyGiftControlWidget$a */
    class C2542a implements OnClickListener, C5739a {

        /* renamed from: a */
        final /* synthetic */ DutyGiftControlWidget f8191a;

        /* renamed from: b */
        private View f8192b;

        /* renamed from: c */
        private C2555l f8193c;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo9131a() {
            if (this.f8193c != null && this.f8193c.isShowing()) {
                this.f8193c.dismiss();
            }
        }

        /* renamed from: b */
        private boolean m10493b() {
            if (((Integer) LinkCrossRoomDataHolder.m13782a().get("data_link_model", Integer.valueOf(0))).intValue() == 0) {
                return true;
            }
            C3517a.m12960a(this.f8191a.context, (int) R.string.et4);
            return false;
        }

        /* renamed from: a */
        public final void mo9132a(int i) {
            if (this.f8192b != null) {
                this.f8192b.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            if (view.getId() == R.id.aqt) {
                this.f8191a.mo9116a();
                this.f8193c.dismiss();
                return;
            }
            if (m10493b()) {
                if (this.f8193c == null) {
                    this.f8193c = new C2555l(this.f8191a.context, this);
                    this.f8193c.setOnDismissListener(C2554k.f8208a);
                }
                if (!this.f8193c.isShowing()) {
                    this.f8193c.show();
                    this.f8191a.mo9123d();
                }
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f8192b = view;
            mo9132a(8);
        }
    }

    /* renamed from: a */
    public final void mo8907a(String str, C9355c cVar) {
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: b */
    public final void mo8908b(String str, C9355c cVar) {
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.awu;
    }

    /* renamed from: a */
    public final void mo9119a(boolean z) {
        if (this.f8178b != null && this.f8178b.getStatus() > 0) {
            mo9120b();
            m10465b(true);
            m10475n();
            this.f8178b = null;
        }
    }

    /* renamed from: h */
    private void m10469h() {
        m10462a(m10471j());
    }

    /* renamed from: j */
    private static C2556m m10471j() {
        C2556m mVar = new C2556m();
        mVar.f8210a = MessageCenter.MSG_CLINET_TO_SDK_FINISH_GAME;
        mVar.f8211b = 2;
        return mVar;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f8181e.mo8963a();
    }

    /* renamed from: f */
    private void m10467f() {
        final C2653a a = this.f8180d.mo9149a();
        if (a != null) {
            a.mo8904a("livegame", new C2426b() {
                /* renamed from: a */
                public final void mo8910a() {
                    C3166a.m11966e("DutyGiftControlWidget", "onSyncStickersFailed() ");
                }

                /* renamed from: a */
                public final void mo8911a(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null) {
                        List<Effect> list = effectChannelResponse.allCategoryEffects;
                        if (!C6311g.m19573a(list)) {
                            C9355c a = C2663f.m10852a((Effect) list.get(0));
                            a.f25582u = a.mo8906a(a);
                            if (!a.f25582u) {
                                a.mo8905a("livegame", a, (C2425a) DutyGiftControlWidget.this);
                            } else {
                                DutyGiftControlWidget.this.f8177a = a;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo9120b() {
        if (this.f8180d != null && this.f8177a != null) {
            this.f8180d.mo9154b(this.f8177a);
        }
    }

    /* renamed from: c */
    public final void mo9121c() {
        if (this.f8186j != null && this.f8186j.isShowing()) {
            this.f8186j.dismiss();
        }
        this.f8179c.mo9131a();
    }

    /* renamed from: i */
    private C2556m m10470i() {
        if (this.f8178b == null) {
            return null;
        }
        C2556m mVar = new C2556m();
        mVar.f8210a = 4097;
        mVar.f8211b = ((Integer) C8946b.f24458bl.mo22117a()).intValue();
        mVar.f8212c = (int) this.f8178b.getStageCount();
        return mVar;
    }

    public void onCreate() {
        super.onCreate();
        C5747j.m18103a().mo14165a(ToolbarButton.DUTY_GIFT, (C5739a) this.f8179c);
        this.f8182f = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observeForever("receiver_effect_message", this).observe("cmd_stop_duty_gift", this);
        this.f8181e = new C2543a(this.f8182f, this.dataCenter);
        this.f8181e.mo9142a((C2416a) this);
    }

    /* renamed from: g */
    private void m10468g() {
        StringBuilder sb = new StringBuilder("startGame mSticker: ");
        sb.append(this.f8177a);
        sb.append(", mDutyGiftInfo: ");
        sb.append(this.f8178b);
        sb.append(", mGiftPath: ");
        sb.append(this.f8183g);
        C3166a.m11966e("DutyGiftControlWidget", sb.toString());
        if (this.f8177a != null && this.f8178b != null && !TextUtils.isEmpty(this.f8183g)) {
            if (this.f8180d != null) {
                this.f8180d.mo9152a("gift_icon", this.f8183g, false);
                this.f8180d.mo9150a(m10470i());
            }
            m10462a(m10459a((int) this.f8178b.getTargetScore(), 0));
            m10474m();
            this.f8184h = System.currentTimeMillis();
            this.f8185i = 0;
        }
    }

    /* renamed from: k */
    private void m10472k() {
        if (this.f8186j == null || !this.f8186j.isShowing()) {
            if (this.f8186j == null) {
                this.f8186j = new C5295a(getContext(), 2).mo13568a((int) R.layout.an9).mo13572a(false).mo13578c(R.string.et0).mo13571a(C3358ac.m12515a((int) R.string.esz), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (DutyGiftControlWidget.this.f8178b != null) {
                            DutyGiftControlWidget.this.mo9119a(true);
                        } else {
                            DutyGiftControlWidget.this.mo9120b();
                        }
                    }
                }).mo13576b(C3358ac.m12515a((int) R.string.esy), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).mo13573a();
            }
            this.f8186j.show();
        }
    }

    /* renamed from: l */
    private String m10473l() {
        File externalCacheDir = this.context.getExternalCacheDir();
        if (externalCacheDir != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append("/dutyGift");
            return sb.toString();
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        sb2.append("/Android/data/");
        sb2.append(this.context.getPackageName());
        sb2.append("/cache/dutyGift");
        return sb2.toString();
    }

    /* renamed from: m */
    private void m10474m() {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f8182f.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f8182f.getOwner().getId()));
        if (this.f8178b != null) {
            hashMap.put("effectgame_id", String.valueOf(this.f8178b.getDutyId()));
            hashMap.put("effectgame_gift_id", String.valueOf(this.f8178b.getGiftId()));
        }
        C8443c.m25663a().mo21606a("effect_game_start", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
    }

    /* renamed from: d */
    public final void mo9123d() {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f8182f.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f8182f.getOwner().getId()));
        C8443c.m25663a().mo21606a("effect_game_click", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
    }

    /* renamed from: n */
    private void m10475n() {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f8182f.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f8182f.getOwner().getId()));
        if (this.f8178b != null) {
            hashMap.put("effectgame_id", String.valueOf(this.f8178b.getDutyId()));
            hashMap.put("effectgame_gift_id", String.valueOf(this.f8178b.getGiftId()));
            hashMap.put("effectgame_gift_cnt", String.valueOf(this.f8185i));
            C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(this.f8178b.getGiftId());
            if (findGiftById != null) {
                hashMap.put("effectgame_gift_money", String.valueOf(this.f8185i * findGiftById.f22235f));
            }
            hashMap.put("time", String.valueOf((int) ((System.currentTimeMillis() - this.f8184h) / 1000)));
            hashMap.put("is_success", String.valueOf(this.f8178b.isSuccess()));
        }
        C8443c.m25663a().mo21606a("effect_game_end", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
    }

    /* renamed from: a */
    public final void mo9116a() {
        StringBuilder sb = new StringBuilder("onStartGameClick mSticker: ");
        sb.append(this.f8177a);
        C3166a.m11966e("DutyGiftControlWidget", sb.toString());
        if (this.f8177a != null) {
            this.f8180d.mo9151a(this.f8177a);
        } else {
            C3517a.m12960a(this.context, (int) R.string.et1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9117a(String str) throws Exception {
        this.f8183g = str;
        m10468g();
    }

    /* renamed from: b */
    public final void mo8874b(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            m10466e(dutyGiftInfo);
        }
    }

    /* renamed from: b */
    private void m10465b(boolean z) {
        if (this.f8181e != null) {
            this.f8181e.mo9136a(z);
        }
    }

    /* renamed from: a */
    private void m10462a(C2556m mVar) {
        if (mVar != null && this.f8180d != null) {
            this.f8180d.mo9153b(mVar);
        }
    }

    /* renamed from: e */
    private void m10466e(DutyGiftInfo dutyGiftInfo) {
        this.f8185i = (int) dutyGiftInfo.getScore();
        m10462a(m10459a((int) dutyGiftInfo.getTargetScore(), this.f8185i));
    }

    /* renamed from: d */
    public final void mo9124d(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            dutyGiftInfo.setSuccess(this.f8178b.isSuccess());
            if (dutyGiftInfo.isSuccess() == 1 && dutyGiftInfo.getMvpUser() != null) {
                m10464b(dutyGiftInfo.getMvpUser().getNickName());
            }
        } else {
            mo9120b();
        }
        this.f8178b = null;
    }

    /* renamed from: c */
    public final void mo9122c(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            long giftId = dutyGiftInfo.getGiftId();
            C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(giftId);
            StringBuilder sb = new StringBuilder("downloadGiftImage giftId: ");
            sb.append(giftId);
            sb.append(", gift: ");
            sb.append(findGiftById);
            C3166a.m11966e("DutyGiftControlWidget", sb.toString());
            if (findGiftById != null) {
                this.f8178b = dutyGiftInfo;
                m10461a(findGiftById.f22231b, m10473l(), String.valueOf(giftId));
            }
            return;
        }
        this.f8178b = null;
        mo9120b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getData() != null) {
            if ("receiver_effect_message".equals(kVData.getKey())) {
                C2556m mVar = (C2556m) kVData.getData();
                StringBuilder sb = new StringBuilder("onChanged message.what: ");
                sb.append(mVar.f8210a);
                C3166a.m11966e("DutyGiftControlWidget", sb.toString());
                if (mVar.f8210a == 4099) {
                    if (mVar.f8211b != 0 && mVar.f8211b != 1) {
                        C8946b.f24458bl.mo22118a(Integer.valueOf(mVar.f8212c));
                        mo9120b();
                    } else if (this.f8178b != null) {
                        this.f8178b.setSuccess(mVar.f8211b);
                        m10465b(false);
                        m10475n();
                    }
                } else if (mVar.f8210a == 4104) {
                    this.f8181e.mo9139b();
                }
            } else if ("cmd_stop_duty_gift".equals(kVData.getKey())) {
                m10472k();
            }
        }
    }

    /* renamed from: b */
    private void m10464b(String str) {
        C8156k kVar = new C8156k();
        if (TextUtils.isEmpty(str)) {
            str = C3358ac.m12515a((int) R.string.eqc);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2663f.m10855a(C3358ac.m12528e()));
        sb.append(File.separator);
        sb.append(C6306c.m19561a(str));
        sb.append(".png");
        String sb2 = sb.toString();
        if (!C3388h.m12606a(sb2)) {
            if (str.length() > 6) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str.substring(0, 6));
                sb3.append("...");
                str = sb3.toString();
            }
            kVar.f22289d = str;
            kVar.f22287b = 119;
            kVar.f22288c = 16;
            kVar.f22294i = sb2;
            kVar.f22291f = "#ff7452";
            kVar.f22290e = 14;
            kVar.f22293h = "center";
            C4267a.m14417a(kVar);
        }
        if (C3388h.m12606a(sb2)) {
            if (this.f8180d != null) {
                this.f8180d.mo9152a("user_name_icon", sb2, false);
            }
            m10469h();
        }
    }

    /* renamed from: a */
    public final void mo8873a(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo == null || dutyGiftInfo.getStatus() <= 0) {
            this.f8179c.mo9132a(8);
            return;
        }
        this.f8179c.mo9132a(0);
        m10467f();
    }

    /* renamed from: a */
    private static C2556m m10459a(int i, int i2) {
        C2556m mVar = new C2556m();
        mVar.f8210a = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
        mVar.f8211b = i2;
        mVar.f8212c = i;
        return mVar;
    }

    /* renamed from: c */
    public final void mo8909c(String str, C9355c cVar) {
        StringBuilder sb = new StringBuilder("onDownloadSuccess panel: ");
        sb.append(str);
        sb.append(", sticker: ");
        sb.append(cVar);
        C3166a.m11966e("DutyGiftControlWidget", sb.toString());
        if (str == "livegame") {
            this.f8177a = cVar;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m10460a(String str, String str2, Bitmap bitmap) throws Exception {
        if (bitmap == null) {
            return "";
        }
        if (bitmap.getWidth() > 32 || bitmap.getHeight() > 32) {
            bitmap = BitmapUtils.resizeBitmap(bitmap, 32, 32);
        }
        BitmapUtils.saveBitmapToSD(bitmap, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private void m10461a(ImageModel imageModel, String str, String str2) {
        C5343e.m17028a(imageModel).mo19317d((C7327h<? super T, ? extends R>) new C2552i<Object,Object>(str, str2)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C2553j<Object>(this));
    }
}
