package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0043i;
import android.text.TextUtils;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.utils.C5339b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.gift.effect.video.VideoGiftView;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdk.message.C8468c;
import com.bytedance.android.livesdk.message.C8470e;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9039ah;
import com.bytedance.android.livesdk.utils.C9039ah.C9040a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9324c;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9325d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b.C32449b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoGiftWidget extends LiveRecyclableWidget implements C8468c {

    /* renamed from: h */
    private static final int f16542h = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo10240a()).intValue();

    /* renamed from: a */
    public Room f16543a;

    /* renamed from: b */
    public VideoGiftView f16544b;

    /* renamed from: c */
    public List<C7963a> f16545c;

    /* renamed from: d */
    public boolean f16546d;

    /* renamed from: e */
    public C5555a f16547e = new C5555a();

    /* renamed from: f */
    public C7963a f16548f;

    /* renamed from: g */
    public boolean f16549g = ((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo10240a()).booleanValue();

    /* renamed from: i */
    private final C7874h f16550i = C7872f.m24128a("effects");

    /* renamed from: j */
    private C9039ah<C7963a> f16551j;

    /* renamed from: k */
    private long f16552k;

    /* renamed from: l */
    private long f16553l;

    /* renamed from: m */
    private C9040a f16554m = new C9040a<C7963a>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo14040a(C7963a aVar, C7963a aVar2) {
            if (aVar.f21553c == aVar2.f21553c) {
                if (VideoGiftWidget.this.f16545c.indexOf(aVar) > VideoGiftWidget.this.f16545c.indexOf(aVar2)) {
                    return true;
                }
                return false;
            } else if (aVar.f21553c < aVar2.f21553c) {
                return true;
            } else {
                return false;
            }
        }
    };

    /* renamed from: n */
    private C9324c f16555n = new C9324c() {
        /* renamed from: a */
        public final void mo14041a() {
            if (VideoGiftWidget.this.f16544b != null) {
                VideoGiftWidget.this.f16544b.setVisibility(0);
                VideoGiftWidget.this.f16544b.mo21059b();
                VideoGiftWidget.this.f16544b.mo21054a();
                m17940a(true, false);
                C3222b.m12218a().mo10147c(Tag.ShowVideoGift.name(), VideoGiftWidget.this.getLifecycle(), VideoGiftWidget.this.getContext());
            }
        }

        /* renamed from: b */
        public final void mo14043b() {
            if (VideoGiftWidget.this.f16544b != null) {
                VideoGiftWidget.this.f16544b.mo21061c();
            }
            VideoGiftWidget.this.f16546d = false;
            m17940a(false, true);
            if (VideoGiftWidget.this.f16549g) {
                C8470e.m25735a().mo21644b();
            } else {
                VideoGiftWidget.this.mo14032a();
            }
            C3222b.m12218a().mo10140a(Tag.ShowVideoGift.name(), TimeCostUtil.m12198a("isAnchor", String.valueOf(((Boolean) VideoGiftWidget.this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue())));
        }

        /* renamed from: a */
        private void m17940a(boolean z, boolean z2) {
            if (VideoGiftWidget.this.f16548f != null && VideoGiftWidget.this.f16548f.f21557g != null && VideoGiftWidget.this.f16548f.f21557g.getId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
                PlatformMessageHelper.INSTANCE.setBigGiftPlayStateEvent(z, z2, VideoGiftWidget.this.f16548f);
            }
        }

        /* renamed from: a */
        public final void mo14042a(float f, float f2, float f3, float f4) {
            if (VideoGiftWidget.this.f16544b != null) {
                VideoGiftWidget.this.f16544b.mo21055a(f, f2, f3, f4);
            }
        }
    };

    /* renamed from: o */
    private C9325d f16556o = new C9325d() {
        /* renamed from: a */
        public final void mo14044a(boolean z, String str, int i, int i2, String str2) {
            if (!z && C32449b.class.getSimpleName().equals(str)) {
                C8946b.f24435bG.mo22118a(Boolean.valueOf(true));
            }
            VideoGiftWidget.this.f16547e.mo14046a(z, str, i, i2, str2);
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget$a */
    class C5555a {

        /* renamed from: a */
        AssetsModel f16563a;

        private C5555a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14045a(long j) {
            this.f16563a = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssets("effects", j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14046a(boolean z, String str, int i, int i2, String str2) {
            long j;
            String str3 = "";
            if (this.f16563a != null) {
                j = this.f16563a.getId();
                if (this.f16563a.getResourceModel() != null && !C3409v.m12670a(this.f16563a.getResourceModel().f21274b)) {
                    str3 = (String) this.f16563a.getResourceModel().f21274b.get(0);
                }
            } else {
                j = -1;
            }
            String str4 = str3;
            new C8449h().mo21613a("gift_id", (Object) Long.valueOf(j)).mo21613a("gift_resource", (Object) str4).mo21613a("extra", (Object) Integer.valueOf(i2)).mo21613a("code", (Object) Integer.valueOf(i)).mo21613a("error_info", (Object) str2).mo21616a("hotsoon_live_video_gift_play_success_rate", z ^ true ? 1 : 0);
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "VIDEO_GIFT_PLAY_SUCCESS_RATE");
            hashMap.put("gift_id", Long.valueOf(j));
            hashMap.put("gift_resource", str4);
            hashMap.put("extra", Integer.valueOf(i2));
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("error_info", str2);
            C8444d.m25673b().mo9999a("ttlive_gift", (Map<String, ?>) hashMap);
            C8282s.m25320a(z, j, str4, i, str2, i2, str);
        }
    }

    public int getLayoutId() {
        return R.layout.ays;
    }

    public void onInit(Object[] objArr) {
    }

    /* renamed from: a */
    public final boolean mo14038a(C8455b bVar) {
        if (bVar instanceof C8489ao) {
            return m17923b(C8163o.m24996a((C8489ao) bVar, this.f16543a.getOwner()));
        }
        if (bVar instanceof C8472a) {
            return m17923b(C8163o.m24995a((C8472a) bVar));
        }
        return false;
    }

    /* renamed from: b */
    public final void mo14039b() {
        this.f16545c.clear();
        this.f16551j.mo22237b();
    }

    /* renamed from: d */
    private void m17925d() {
        if (this.f16545c.size() > f16542h) {
            C7963a aVar = (C7963a) this.f16551j.mo22235a();
            if (aVar != null) {
                this.f16545c.remove(aVar);
            }
        }
    }

    public void onUnload() {
        this.f16550i.mo20652a();
        this.f16546d = false;
        this.f16552k = 0;
        this.f16553l = 0;
        if (this.f16549g) {
            C8470e.m25735a().mo21645b(this);
        }
    }

    /* renamed from: c */
    private void m17924c() {
        this.f16544b = (VideoGiftView) this.contentView;
        this.f16544b.setPortrait(((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue());
        this.f16544b.mo21056a(this.context, (C0043i) this, this.f16555n, this.f16556o);
        this.f16544b.setUserEventListener(new C3436f() {
            /* renamed from: a */
            public final void mo10403a(long j) {
                if (j != 0 && VideoGiftWidget.this.dataCenter != null && (VideoGiftWidget.this.f16543a == null || !VideoGiftWidget.this.f16543a.isKoiRoom())) {
                    if (VideoGiftWidget.this.f16543a == null || !VideoGiftWidget.this.f16543a.isStar()) {
                        VideoGiftWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
                    }
                }
            }
        });
        mo14033a(((C3440a) C3596c.m13172a(C3440a.class)).getCurrentPkState());
    }

    /* renamed from: a */
    public final void mo14032a() {
        if (!this.f16545c.isEmpty() && !this.f16546d) {
            C7963a aVar = (C7963a) this.f16545c.remove(0);
            this.f16548f = aVar;
            this.f16551j.mo22238b(aVar);
            AssetsModel c = this.f16550i.mo20662c(aVar.f21552b);
            if (c == null) {
                m17922a("特效列表找不到该Id", String.valueOf(aVar.f21560j), String.valueOf(aVar.f21551a), null);
                if (this.f16549g) {
                    C8470e.m25735a().mo21644b();
                }
                return;
            }
            if (c.getResourceType() != 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "特效资源类型有误");
                hashMap.put("asset_type", Integer.valueOf(c.getResourceType()));
                hashMap.put("asset_id", Long.valueOf(aVar.f21552b));
                hashMap.put("gift_id", Long.valueOf(aVar.f21560j));
                hashMap.put("msg_id", Long.valueOf(aVar.f21551a));
                C8444d.m25673b().mo10003c("ttlive_gift", (Map<String, ?>) hashMap);
                if (this.f16549g) {
                    C8470e.m25735a().mo21644b();
                }
            } else if (!TextUtils.isEmpty(aVar.f21554d)) {
                this.f16546d = true;
                this.f16547e.mo14045a(aVar.f21552b);
                this.f16544b.mo21057a(aVar, this.f16543a.getOwner());
                m17922a("播放视频礼物", String.valueOf(aVar.f21560j), String.valueOf(aVar.f21551a), null);
            } else {
                m17922a("临时下载该特效失败", String.valueOf(aVar.f21560j), String.valueOf(aVar.f21551a), null);
                m17921a((int) R.string.f5v);
                if (this.f16549g) {
                    C8470e.m25735a().mo21644b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14037a(boolean z) {
        this.f16544b.mo21060b(z);
    }

    /* renamed from: a */
    private void m17921a(int i) {
        if (System.currentTimeMillis() - this.f16552k > 30000) {
            this.f16552k = System.currentTimeMillis();
            C9049ap.m27022a((int) R.string.f5v);
        }
    }

    /* renamed from: b */
    private boolean m17923b(final C7963a aVar) {
        if (aVar == null) {
            return false;
        }
        C55523 r1 = new C7877j() {
            /* renamed from: a */
            public final void mo9344a(long j) {
                VideoGiftWidget.m17922a("特效资源下载任务被取消", String.valueOf(aVar.f21560j), String.valueOf(aVar.f21551a), String.valueOf(aVar.f21552b));
                if (VideoGiftWidget.this.f16549g) {
                    C8470e.m25735a().mo21644b();
                }
            }

            /* renamed from: a */
            public final void mo9346a(Throwable th) {
                VideoGiftWidget.m17922a("获取特效资源本地路径失败", String.valueOf(aVar.f21560j), String.valueOf(aVar.f21551a), String.valueOf(aVar.f21552b));
                aVar.mo20830a("");
                VideoGiftWidget.this.mo14034a(aVar);
            }

            /* renamed from: a */
            public final void mo9345a(long j, String str) {
                aVar.mo20830a(str);
                VideoGiftWidget.this.mo14034a(aVar);
            }
        };
        if (this.f16549g && C5339b.m17016a(this.f16550i.mo20662c(aVar.f21552b), 4) == null) {
            return false;
        }
        this.f16550i.mo20656a(aVar.f21552b, r1, 4);
        return true;
    }

    public void onLoad(Object[] objArr) {
        this.f16543a = (Room) this.dataCenter.get("data_room");
        this.f16545c = new ArrayList();
        this.f16551j = new C9039ah<>(f16542h + 1, this.f16554m);
        m17924c();
        if (this.f16549g) {
            C8470e.m25735a().mo21643a((C8468c) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14033a(PkState pkState) {
        if (pkState == PkState.PK || pkState == PkState.PENAL) {
            this.f16544b.mo21058a(true);
        } else {
            this.f16544b.mo21058a(false);
        }
    }

    /* renamed from: a */
    public final void mo14034a(C7963a aVar) {
        if (isViewValid() && aVar != null) {
            if (aVar.f21555e) {
                this.f16545c.add(0, aVar);
            } else {
                this.f16545c.add(aVar);
                this.f16551j.mo22236a(aVar);
            }
            if (!this.f16549g) {
                m17925d();
            }
            mo14032a();
        }
    }

    /* renamed from: a */
    public final void mo14035a(C8472a aVar) {
        if (!isViewValid() || this.f16550i.mo20662c(aVar.f23186a) == null) {
            return;
        }
        if (this.f16549g) {
            C8470e.m25735a().mo21642a((C8455b) aVar);
        } else {
            m17923b(C8163o.m24995a(aVar));
        }
    }

    /* renamed from: a */
    public final void mo14036a(C8489ao aoVar) {
        if (isViewValid()) {
            C8149d findGiftById = GiftManager.inst().findGiftById(aoVar.f23254c);
            if (findGiftById != null) {
                if ((findGiftById.f22234e != 2 && findGiftById.f22234e != 8) || aoVar.f23258g == 1) {
                    return;
                }
                if (this.f16549g) {
                    C8470e.m25735a().mo21642a((C8455b) aoVar);
                    return;
                }
                m17923b(C8163o.m24996a(aoVar, this.f16543a.getOwner()));
            }
        }
    }

    /* renamed from: a */
    public static void m17922a(String str, String str2, String str3, String str4) {
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
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("asset_id", str4);
        }
        C8444d.m25673b().mo10003c("ttlive_gift", (Map<String, ?>) hashMap);
    }
}
