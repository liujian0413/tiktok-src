package com.bytedance.android.livesdk.chatroom.p220ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.support.p022v4.widget.DrawerLayout.SimpleDrawerListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3169b;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3486d.C3487a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.detail.C4319b.C4320a;
import com.bytedance.android.livesdk.chatroom.detail.C4323e;
import com.bytedance.android.livesdk.chatroom.detail.C4323e.C4325a;
import com.bytedance.android.livesdk.chatroom.detail.C4326f;
import com.bytedance.android.livesdk.chatroom.detail.C4327g;
import com.bytedance.android.livesdk.chatroom.detail.C4327g.C4328a;
import com.bytedance.android.livesdk.chatroom.detail.C4329h;
import com.bytedance.android.livesdk.chatroom.detail.C4331i;
import com.bytedance.android.livesdk.chatroom.detail.C4338m;
import com.bytedance.android.livesdk.chatroom.detail.C4339n;
import com.bytedance.android.livesdk.chatroom.end.LiveAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.event.C4409aa;
import com.bytedance.android.livesdk.chatroom.event.C4427as;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.event.C4453w;
import com.bytedance.android.livesdk.chatroom.event.C4455y;
import com.bytedance.android.livesdk.chatroom.model.C4904f;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.p210c.C4300c;
import com.bytedance.android.livesdk.chatroom.p211d.C4308a;
import com.bytedance.android.livesdk.chatroom.p211d.C4308a.C4310a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.chatroom.utils.C5367t;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.fans.C5894a;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdk.p223d.C5886a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.player.C8773k;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.utils.C9096z;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.C9289b;
import com.bytedance.android.livesdkapi.depend.live.C9328d;
import com.bytedance.android.livesdkapi.depend.live.C9328d.C9329a;
import com.bytedance.android.livesdkapi.depend.live.C9330e;
import com.bytedance.android.livesdkapi.depend.live.C9330e.C9331a;
import com.bytedance.android.livesdkapi.depend.live.C9336j;
import com.bytedance.android.livesdkapi.depend.live.LiveRoomState;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.android.livesdkapi.p452h.C9420h;
import com.bytedance.android.livesdkapi.view.C9519c;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.p534b.C10296b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.request.C13842b;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.p1783b.p1784a.C45771a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment */
public class LivePlayFragment extends BaseFragment implements C0053p<KVData>, C9297a, C9330e {

    /* renamed from: P */
    private static final Boolean f14722P = Boolean.valueOf(false);

    /* renamed from: A */
    public String f14723A;

    /* renamed from: B */
    public String f14724B;

    /* renamed from: C */
    public String f14725C = "other";

    /* renamed from: D */
    public boolean f14726D;

    /* renamed from: E */
    public String f14727E;

    /* renamed from: F */
    public HashMap<String, String> f14728F;

    /* renamed from: G */
    public long f14729G;

    /* renamed from: H */
    public C8773k f14730H;

    /* renamed from: I */
    public C4300c f14731I;

    /* renamed from: J */
    public C4331i f14732J;

    /* renamed from: K */
    public boolean f14733K = false;

    /* renamed from: L */
    public boolean f14734L = true;

    /* renamed from: M */
    public boolean f14735M;

    /* renamed from: N */
    public boolean f14736N = true;

    /* renamed from: O */
    public C2261a f14737O = new C2261a() {

        /* renamed from: b */
        private Queue<Long> f14807b = new LinkedList();

        /* renamed from: l */
        public final void mo8031l() {
            m16543a();
        }

        /* renamed from: m */
        public final void mo8032m() {
            m16543a();
        }

        /* renamed from: a */
        private boolean m16543a() {
            if (LivePlayFragment.this.f14782d) {
                TextUtils.equals(LivePlayFragment.this.f14785g, LivePlayFragment.this.f14784f);
            }
            return false;
        }

        /* renamed from: j */
        public final void mo8029j() {
            if (!LivePlayFragment.this.f14794s && LivePlayFragment.this.f14798w.getVisibility() == 0) {
                LivePlayFragment.this.mo13282k();
                LivePlayFragment.this.f14732J.mo12045b();
            }
        }

        /* renamed from: n */
        public final void mo8033n() {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_player_detached");
            C8444d.m25673b().mo10001b("ttlive_pullstream", (Map<String, ?>) hashMap);
            LivePlayFragment.this.mo13275d();
            LivePlayFragment.this.f14735M = true;
        }

        /* renamed from: k */
        public final void mo8030k() {
            LivePlayFragment.this.f14731I.f12493c = C4300c.m14481a((Object) LivePlayFragment.this.f14737O);
            LivePlayFragment.this.f14731I.mo11975b("pullDuration");
            LivePlayFragment.this.f14731I.mo11975b("duration");
            LivePlayFragment.this.f14731I.mo11975b("innerDuration");
            LivePlayFragment.this.f14731I.mo11972a();
            LivePlayFragment.this.f14728F.put("time", String.valueOf(System.currentTimeMillis() - LivePlayFragment.this.f14729G));
            LivePlayFragment.this.f14728F.put("location", " after onPlayDisplayed");
            TTLiveSDKContext.getHostService().mo22363d().mo23269a("feed_enter_room", LivePlayFragment.this.f14728F);
            LivePlayFragment.this.f14790l.mo12033g();
            LivePlayFragment.this.f14790l.mo12026a(true, false);
            int[] iArr = new int[2];
            LivePlayFragment.this.f14792q.getVideoSize(iArr);
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                LivePlayFragment.this.mo13259a(iArr[0], iArr[1], C9738o.m28691a(LivePlayFragment.this.getContext()));
                if (LivePlayFragment.this.f14799x != null) {
                    LivePlayFragment.this.f14787i.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(LivePlayFragment.this.f14783e, LivePlayFragment.this.f14788j));
                }
            }
            LivePlayFragment.this.mo13283m();
            LivePlayFragment.this.f14732J.mo12046c();
            LivePlayFragment.this.mo13281j();
            if (!LivePlayFragment.this.f14796u) {
                if (LivePlayFragment.this.f14781c != LiveMode.AUDIO) {
                    LivePlayFragment.this.mo13267a("first frame");
                }
                if (LivePlayFragment.this.f14790l != null) {
                    LivePlayFragment.this.f14790l.mo12042p();
                }
            } else {
                LivePlayFragment.this.mo13272b("first frame but in illegal status");
                LivePlayFragment.this.f14792q.setMute(true);
            }
            LivePlayFragment.this.mo13277f();
            if (LivePlayFragment.this.f14797v) {
                LivePlayFragment.this.f14797v = false;
                C9049ap.m27028a(LivePlayFragment.this.getString(R.string.f4k));
            }
            if (LivePlayFragment.this.mo13295s().mo11366e() != null) {
                LivePlayFragment.this.mo13295s();
            }
            TimeCostUtil.m12200a(Tag.StartLivePlay, TimeCostUtil.m12198a("hasDefaultUrl", String.valueOf(LivePlayFragment.this.f14733K)));
            TimeCostUtil.m12200a(Tag.ScrollWatchLivePlay, TimeCostUtil.m12198a("hasDefaultUrl", String.valueOf(LivePlayFragment.this.f14733K)));
            C3222b.m12218a().mo10140a(Tag.StartLivePlay.name(), TimeCostUtil.m12198a("hasDefaultUrl", String.valueOf(LivePlayFragment.this.f14733K)));
            C3222b.m12218a().mo10140a(Tag.ScrollWatchLivePlay.name(), TimeCostUtil.m12198a("hasDefaultUrl", String.valueOf(LivePlayFragment.this.f14733K)));
        }

        /* renamed from: a */
        public final void mo8027a(Exception exc) {
            LivePlayFragment.this.f14790l.mo12025a(false, 105, "ttplayer init failed");
            LivePlayFragment.this.f14730H.mo21818a(105, "ttplayer init failed", LivePlayFragment.this.f14748a, LivePlayFragment.this.f14725C, LivePlayFragment.this.f14780b);
            LivePlayFragment.this.mo13260a(105, "ttplayer init failed", LivePlayFragment.this.f14748a);
            LivePlayFragment.this.mo13274c("pull_stream_error");
            LivePlayFragment.this.mo13263a(C5120a.PLAYER_ERROR);
            TimeCostUtil.m12200a(Tag.StartLivePlay, TimeCostUtil.m12198a("error", "ttplayer init failed"));
            TimeCostUtil.m12200a(Tag.ScrollWatchLivePlay, TimeCostUtil.m12198a("error", "ttplayer init failed"));
            C3222b.m12218a().mo10143b(Tag.StartLivePlay.name());
            C3222b.m12218a().mo10143b(Tag.ScrollWatchLivePlay.name());
        }

        /* renamed from: a */
        public final void mo8028a(Object obj) {
            boolean z;
            if (LivePlayFragment.this.f14799x != null && (LivePlayFragment.this.f14799x instanceof PortraitInteractionFragment) && (obj instanceof String)) {
                if (!((Boolean) C3912d.m13795a().f11699b).booleanValue() || 2 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = LinkCrossRoomDataHolder.m13782a().f11664b;
                if (z || z2) {
                    ((PortraitInteractionFragment) LivePlayFragment.this.f14799x).mo13399a((String) obj);
                }
            }
        }

        /* renamed from: a */
        public final void mo8026a(int i, String str) {
            Map map = (Map) C2317a.m9933b().mo15975a(str, new C6597a<Map<String, String>>() {
            }.type);
            if (map.containsKey("error_code")) {
                String str2 = (String) map.get("error_code");
                if (str2 != null) {
                    LivePlayFragment.this.f14730H.mo21823b(Integer.valueOf(str2).intValue(), str, LivePlayFragment.this.f14748a, LivePlayFragment.this.f14725C, LivePlayFragment.this.f14780b);
                }
            }
        }

        /* renamed from: a */
        public final void mo8025a(int i, int i2) {
            boolean z;
            LivePlayFragment livePlayFragment = LivePlayFragment.this;
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            livePlayFragment.f14783e = z;
            if (LivePlayFragment.this.f14783e || LivePlayFragment.this.f14786h != 0) {
                if (!(i == 0 || i2 == 0)) {
                    LivePlayFragment.this.mo13259a(i, i2, C9738o.m28691a(LivePlayFragment.this.getContext()));
                }
                if (LivePlayFragment.this.f14799x != null) {
                    LivePlayFragment.this.f14787i.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(LivePlayFragment.this.f14783e, LivePlayFragment.this.f14788j));
                }
            } else if (LivePlayFragment.this.f14799x != null) {
                LivePlayFragment.this.onEvent(new C9409a(1));
            } else {
                LivePlayFragment.this.getActivity().setRequestedOrientation(1);
                LivePlayFragment.this.f14786h = 1;
                LivePlayFragment.this.f14792q.setScreenOrientation(true);
            }
        }
    };

    /* renamed from: Q */
    private long f14738Q;

    /* renamed from: R */
    private List<String> f14739R;

    /* renamed from: S */
    private String f14740S;

    /* renamed from: T */
    private String f14741T;

    /* renamed from: U */
    private String f14742U;

    /* renamed from: V */
    private C9384a f14743V;

    /* renamed from: W */
    private boolean f14744W;

    /* renamed from: X */
    private String f14745X;

    /* renamed from: Y */
    private boolean f14746Y;

    /* renamed from: Z */
    private boolean f14747Z;

    /* renamed from: a */
    public long f14748a;

    /* renamed from: aA */
    private boolean f14749aA = false;

    /* renamed from: aB */
    private boolean f14750aB = false;

    /* renamed from: aC */
    private List<C4450t> f14751aC = new ArrayList();

    /* renamed from: aD */
    private C47562b f14752aD = new C47562b();

    /* renamed from: aE */
    private C9331a f14753aE;

    /* renamed from: aa */
    private boolean f14754aa;

    /* renamed from: ab */
    private boolean f14755ab;

    /* renamed from: ac */
    private C4327g f14756ac;

    /* renamed from: ad */
    private C4339n f14757ad;

    /* renamed from: ae */
    private C4326f f14758ae = new C4326f();

    /* renamed from: af */
    private C5367t f14759af;

    /* renamed from: ag */
    private boolean f14760ag = false;

    /* renamed from: ah */
    private boolean f14761ah = false;

    /* renamed from: ai */
    private boolean f14762ai = false;

    /* renamed from: aj */
    private HSImageView f14763aj;

    /* renamed from: ak */
    private HSImageView f14764ak;

    /* renamed from: al */
    private ViewGroup f14765al;

    /* renamed from: am */
    private CircularProgressView f14766am;

    /* renamed from: an */
    private LoadingAnimView f14767an;

    /* renamed from: ao */
    private TextView f14768ao;

    /* renamed from: ap */
    private HSImageView f14769ap;

    /* renamed from: aq */
    private View f14770aq;

    /* renamed from: ar */
    private ViewStub f14771ar;

    /* renamed from: as */
    private boolean f14772as = false;

    /* renamed from: at */
    private C1009c f14773at;

    /* renamed from: au */
    private DrawerLayout f14774au;

    /* renamed from: av */
    private long f14775av;

    /* renamed from: aw */
    private String f14776aw;

    /* renamed from: ax */
    private boolean f14777ax = ((Boolean) LiveSettingKeys.SHOW_BACKGROUND_BELOW_VIDEO.mo10240a()).booleanValue();

    /* renamed from: ay */
    private final Handler f14778ay = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 28) {
                LivePlayFragment.this.mo13266a((Room) message.obj);
            }
        }
    };

    /* renamed from: az */
    private View f14779az;

    /* renamed from: b */
    public String f14780b;

    /* renamed from: c */
    public LiveMode f14781c;

    /* renamed from: d */
    public boolean f14782d;

    /* renamed from: e */
    public boolean f14783e;

    /* renamed from: f */
    public String f14784f;

    /* renamed from: g */
    public String f14785g;

    /* renamed from: h */
    public int f14786h = 1;

    /* renamed from: i */
    public DataCenter f14787i;

    /* renamed from: j */
    public int f14788j;

    /* renamed from: k */
    public LiveRoomState f14789k = LiveRoomState.IDLE;

    /* renamed from: l */
    public C4329h f14790l;

    /* renamed from: m */
    public C4323e f14791m;

    /* renamed from: q */
    public C2260a f14792q;

    /* renamed from: r */
    public C4338m f14793r;

    /* renamed from: s */
    public boolean f14794s = false;

    /* renamed from: t */
    public boolean f14795t = false;

    /* renamed from: u */
    public boolean f14796u = false;

    /* renamed from: v */
    public boolean f14797v = false;

    /* renamed from: w */
    public TextureView f14798w;

    /* renamed from: x */
    public AbsInteractionFragment f14799x;

    /* renamed from: y */
    public C9245h f14800y;

    /* renamed from: z */
    public LiveAudienceEndFragment f14801z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$a */
    enum C5120a {
        ENTER_FAILED,
        FETCH_FAILED,
        ROOM_FETCH_FINISHED,
        EMPTY_URL,
        ROOM_PLAY_FINISHED,
        PING_KICK_OUT,
        USER_CLOSE,
        USER_KICK_OUT,
        WATCHER_KIT_OUT,
        JUMP_TO_OTHER,
        PLAYER_ERROR,
        ENTER_LIVE_END
    }

    /* renamed from: I */
    private C9331a m16471I() {
        return this.f14753aE;
    }

    /* renamed from: g */
    public final Fragment mo13278g() {
        return this;
    }

    /* renamed from: a */
    public final void mo13261a(Bundle bundle) {
        m16483a(this.f14724B, this.f14723A, bundle != null ? bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA") : null);
    }

    /* renamed from: a */
    private void m16483a(String str, String str2, Bundle bundle) {
        if (bundle != null) {
            C8416g a = C8443c.m25663a().mo21605a(Room.class);
            if (a != null) {
                a.mo21569a("request_id");
                a.mo21569a("live_window_mode");
                a.mo21569a("log_pb");
                a.mo21569a("starlight_rank");
                if (TextUtils.isEmpty(str)) {
                    str = bundle.getString("log_pb");
                }
                a.mo21570a("log_pb", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = bundle.getString("request_id");
                }
                a.mo21570a("request_id", str2);
                if (TextUtils.isEmpty(str2)) {
                    str2 = ((C8423n) a).mo21576c(String.valueOf(this.f14748a));
                }
                if (TextUtils.isEmpty(str)) {
                    str = ((C8423n) a).mo21575b(String.valueOf(this.f14748a));
                }
                if (a instanceof C8423n) {
                    ((C8423n) a).mo21574a(String.valueOf(this.f14748a), str, str2);
                }
                int i = C7285c.m22838a(getActivity(), "feed_live_span", 0).getInt("span_count", 0);
                if (i > 0) {
                    a.mo21570a("live_window_mode", i > 1 ? "live_small_picture" : "live_big_picture");
                }
                a.mo21570a("gd_label", bundle.getString("gd_label", ""));
                a.mo21569a("card_id");
                a.mo21569a("card_position");
                String string = bundle.getString("card_id");
                if (!TextUtils.isEmpty(string)) {
                    a.mo21570a("card_id", string);
                }
                String string2 = bundle.getString("card_position");
                if (!TextUtils.isEmpty(string2)) {
                    a.mo21570a("card_position", string2);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13269a(Room room, boolean z) {
        this.f14790l.mo12022a(room);
        C8416g a = C8443c.m25663a().mo21605a(Room.class);
        if (a instanceof C8423n) {
            ((C8423n) a).mo21573a(room);
        }
        LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.m13783a(room.getId(), C0069x.m157a((Fragment) this), this);
        if (room.getLinkMicInfo() != null) {
            a2.mo11448a(room.getLinkMicInfo(), room);
        }
        this.f14748a = room.getId();
        if (room.getOwner() != null) {
            this.f14738Q = room.getOwner().getId();
            if (room.getOwner().getAvatarThumb() != null && !C6311g.m19573a(room.getOwner().getAvatarThumb().getUrls())) {
                this.f14739R = room.getOwner().getAvatarThumb().getUrls();
            }
            TTLiveSDKContext.getHostService().mo22367h().mo22174a((IUser) room.getOwner());
            C4310a aVar = new C4310a(room.getId(), room.getOwner().getId(), System.currentTimeMillis());
            C4308a.m14513a().f12525a = aVar;
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("live.intent.extra.USER_ID", this.f14738Q);
            getActivity().getIntent().putExtra("current_room_id", this.f14748a);
        }
        this.f14780b = room.buildPullUrl();
        this.f14740S = room.getSdkParams();
        this.f14741T = room.getMultiStreamData();
        this.f14742U = room.getMultiStreamDefaultQualitySdkKey();
        this.f14781c = room.getStreamType();
        this.f14743V = room.getStreamSrConfig();
        this.f14790l.mo12021a(this.f14748a, room.isLiveTypeAudio(), room.isThirdParty, this.f14738Q, room.getLinkMicInfo());
        if (!(this.f14781c != LiveMode.OFFICIAL_ACTIVITY || room.background == null || this.f14779az == null)) {
            HSImageView hSImageView = (HSImageView) this.f14779az.findViewById(R.id.ea8);
            if (VERSION.SDK_INT >= 23) {
                hSImageView.setForeground(null);
            }
            C5343e.m17038a(hSImageView, room.background);
        }
        boolean z2 = false;
        if (!(!room.isOfficial() || getArguments() == null || this.f14787i == null)) {
            this.f14787i.lambda$put$1$DataCenter("data_live_new_feed_style", Boolean.valueOf(false));
            Bundle bundle = getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle != null) {
                bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", false);
            }
            getArguments().putBoolean("live.intent.extra.FROM_NEW_STYLE", false);
        }
        if (this.f14748a != 0) {
            getArguments().putLong("live.intent.extra.ROOM_ID", this.f14748a);
        }
        if (this.f14738Q != 0) {
            getArguments().putLong("live.intent.extra.USER_ID", this.f14738Q);
        }
        if (room.getStatus() == 4) {
            C8443c.m25663a().mo21607a("rd_enter_room_live_end", C8438j.class, Room.class);
            mo13260a(107, "room finish", this.f14748a);
            mo13263a(z ? C5120a.ROOM_FETCH_FINISHED : C5120a.FETCH_FAILED);
            return false;
        } else if (!room.isPullUrlValid()) {
            mo13260a(108, "fetch failed because the pull_url isn't valid", this.f14748a);
            mo13263a(C5120a.FETCH_FAILED);
            return false;
        } else {
            if (room.getMultiStreamData() != null) {
                if (room.getStreamUrl().qualityList.size() > 1) {
                    z2 = true;
                }
                this.f14782d = z2;
                this.f14784f = room.getStreamUrl().mo23056g();
                this.f14785g = room.getStreamUrl().mo23057h();
            } else {
                if (room.getStreamUrl().mo23054e().size() > 1) {
                    z2 = true;
                }
                this.f14782d = z2;
                this.f14784f = room.getStreamUrl().f25619r;
                this.f14785g = room.getStreamUrl().f25620s;
            }
            return true;
        }
    }

    /* renamed from: a */
    private void m16482a(String str, LiveMode liveMode, C9384a aVar, String str2) {
        if (this.f14792q == null) {
            if (this.f14798w == null) {
                C45771a.m143712e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            f14722P.booleanValue();
            boolean z = false;
            this.f14798w.setVisibility(0);
            if (!this.f14797v && !this.f14777ax) {
                m16496e("start player");
            }
            this.f14731I.mo11973a("pullDuration");
            this.f14792q = ((C3450b) C3596c.m13172a(C3450b.class)).ensureRoomPlayer(this.f14748a, str, liveMode, aVar, this.f14798w, this.f14737O, getContext(), str2);
            this.f14731I.f12492b = this.f14792q.hasWarmedUp();
            this.f14792q.start();
            this.f14792q.setAnchorInteractMode(this.f14755ab);
            C2260a aVar2 = this.f14792q;
            if (this.f14786h == 1) {
                z = true;
            }
            aVar2.setScreenOrientation(z);
            if (m16463A()) {
                mo13282k();
            } else {
                mo13283m();
            }
            this.f14732J.mo12044a();
        }
    }

    /* renamed from: a */
    private void m16484a(String str, String str2, LiveMode liveMode, C9384a aVar) {
        if (this.f14792q == null) {
            if (this.f14798w == null) {
                C45771a.m143712e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            f14722P.booleanValue();
            boolean z = false;
            this.f14798w.setVisibility(0);
            if (!this.f14797v && !this.f14777ax) {
                m16496e("start player");
            }
            this.f14731I.mo11973a("pullDuration");
            this.f14792q = ((C3450b) C3596c.m13172a(C3450b.class)).ensureRoomPlayer(this.f14748a, str, str2, liveMode, aVar, this.f14798w, this.f14737O, getContext());
            this.f14731I.f12492b = this.f14792q.hasWarmedUp();
            if (this.f14790l != null) {
                this.f14790l.mo12041o();
            }
            this.f14792q.start();
            this.f14792q.setAnchorInteractMode(this.f14755ab);
            C2260a aVar2 = this.f14792q;
            if (this.f14786h == 1) {
                z = true;
            }
            aVar2.setScreenOrientation(z);
            if (m16463A()) {
                mo13282k();
            } else {
                mo13283m();
            }
            this.f14732J.mo12044a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13259a(int r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x014c
            if (r8 != 0) goto L_0x0006
            goto L_0x014c
        L_0x0006:
            r9 = 2
            int[] r0 = new int[r9]
            com.bytedance.android.b.a r1 = r6.f14792q
            if (r1 == 0) goto L_0x0012
            com.bytedance.android.b.a r1 = r6.f14792q
            r1.getVideoSize(r0)
        L_0x0012:
            android.view.TextureView r1 = r6.f14798w
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 1
            r3 = 0
            if (r7 <= r8) goto L_0x004e
            int r4 = r6.f14786h
            if (r4 != r2) goto L_0x004e
            r4 = 1119879168(0x42c00000, float:96.0)
            int r4 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r4)
            r1.topMargin = r4
            int r4 = com.bytedance.android.live.core.utils.C3358ac.m12523c()
            int r4 = r4 * r8
            int r4 = r4 / r7
            int r5 = r1.topMargin
            int r4 = r4 + r5
            r6.f14788j = r4
            r6.m16464B()
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            if (r4 == 0) goto L_0x004b
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            boolean r4 = r4 instanceof com.bytedance.android.livesdk.chatroom.p220ui.PortraitInteractionFragment
            if (r4 == 0) goto L_0x0067
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            com.bytedance.android.livesdk.chatroom.ui.PortraitInteractionFragment r4 = (com.bytedance.android.livesdk.chatroom.p220ui.PortraitInteractionFragment) r4
            r4.mo13400x()
            goto L_0x0067
        L_0x004b:
            r6.f14749aA = r3
            goto L_0x0067
        L_0x004e:
            r1.topMargin = r3
            r6.m16465C()
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            if (r4 == 0) goto L_0x0065
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            boolean r4 = r4 instanceof com.bytedance.android.livesdk.chatroom.p220ui.PortraitInteractionFragment
            if (r4 == 0) goto L_0x0067
            com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment r4 = r6.f14799x
            com.bytedance.android.livesdk.chatroom.ui.PortraitInteractionFragment r4 = (com.bytedance.android.livesdk.chatroom.p220ui.PortraitInteractionFragment) r4
            r4.mo13220w()
            goto L_0x0067
        L_0x0065:
            r6.f14749aA = r2
        L_0x0067:
            android.view.TextureView r4 = r6.f14798w
            r4.setLayoutParams(r1)
            android.view.TextureView r1 = r6.f14798w
            boolean r1 = r1 instanceof com.bytedance.android.livesdkapi.view.C9519c
            if (r1 == 0) goto L_0x014b
            r1 = 0
            android.view.TextureView r4 = r6.f14798w
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x008d
            android.view.TextureView r4 = r6.f14798w
            android.view.ViewParent r4 = r4.getParent()
            boolean r4 = r4 instanceof android.widget.RelativeLayout
            if (r4 == 0) goto L_0x008d
            android.view.TextureView r1 = r6.f14798w
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
        L_0x008d:
            int r4 = r6.f14786h
            r5 = 13
            if (r4 != r2) goto L_0x0113
            if (r7 <= r8) goto L_0x00a4
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r7.setScaleType(r3)
            if (r1 == 0) goto L_0x00a1
            r1.addRule(r5, r3)
        L_0x00a1:
            r7 = 1
            goto L_0x0120
        L_0x00a4:
            boolean r4 = com.bytedance.android.live.core.utils.p159b.C3377b.m12564b()
            if (r4 == 0) goto L_0x00bd
            int r4 = com.bytedance.android.live.core.utils.p159b.C3377b.m12562a()
            if (r4 != 0) goto L_0x00bd
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r7.setScaleType(r3)
            if (r1 == 0) goto L_0x011f
            r1.addRule(r5)
            goto L_0x011f
        L_0x00bd:
            boolean r4 = r6.f14755ab
            if (r4 == 0) goto L_0x0106
            android.view.View r4 = r6.getView()
            if (r4 == 0) goto L_0x00f8
            android.view.View r4 = r6.getView()
            int r4 = r4.getWidth()
            if (r4 <= 0) goto L_0x00f8
            android.view.View r4 = r6.getView()
            int r4 = r4.getHeight()
            if (r4 <= 0) goto L_0x00f8
            android.view.View r4 = r6.getView()
            int r4 = r4.getHeight()
            int r4 = r4 * r7
            android.view.View r7 = r6.getView()
            int r7 = r7.getWidth()
            int r4 = r4 / r7
            if (r4 >= r8) goto L_0x00f8
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r7.setScaleType(r9)
            goto L_0x0100
        L_0x00f8:
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r8 = 3
            r7.setScaleType(r8)
        L_0x0100:
            if (r1 == 0) goto L_0x00a1
            r1.addRule(r5, r3)
            goto L_0x00a1
        L_0x0106:
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r7.setScaleType(r9)
            if (r1 == 0) goto L_0x011f
            r1.addRule(r5)
            goto L_0x011f
        L_0x0113:
            android.view.TextureView r7 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r7 = (com.bytedance.android.livesdkapi.view.C9519c) r7
            r7.setScaleType(r3)
            if (r1 == 0) goto L_0x011f
            r1.addRule(r5)
        L_0x011f:
            r7 = 0
        L_0x0120:
            android.view.TextureView r8 = r6.f14798w
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C9519c) r8
            r9 = r0[r3]
            r0 = r0[r2]
            r8.mo23565a(r9, r0)
            if (r1 == 0) goto L_0x014b
            if (r7 == 0) goto L_0x0146
            com.bytedance.ies.sdk.widgets.DataCenter r7 = r6.f14787i
            java.lang.String r8 = "interaction_layer_margin_top"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r7.get(r8, r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r1.topMargin
            int r8 = r8 + r7
            r1.topMargin = r8
        L_0x0146:
            android.view.TextureView r7 = r6.f14798w
            r7.setLayoutParams(r1)
        L_0x014b:
            return
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.LivePlayFragment.mo13259a(int, int, int):void");
    }

    /* renamed from: a */
    public final void mo13268a(boolean z) {
        if (this.f14792q != null) {
            if (this.f14792q.getDecodeStatus() == 2) {
                this.f14790l.mo12025a(false, 104, this.f14792q.getMediaErrorMessage());
                mo13260a(104, this.f14792q.getMediaErrorMessage(), this.f14748a);
            } else if (this.f14792q.getDecodeStatus() == 1) {
                this.f14790l.mo12025a(true, 0, (String) null);
                this.f14790l.mo12034h();
            } else {
                this.f14730H.mo21819a(this.f14748a);
                mo13260a(113, "room cancel", this.f14748a);
                this.f14790l.mo12034h();
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f14792q.stop(z);
            this.f14792q.recycle();
            this.f14792q = null;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = "";
            if (getArguments() != null) {
                str = getArguments().getString("live.intent.extra.EXTRA_ENTER_ROOM_STOP_KEY_TYPE", "");
            }
            C4300c.m14482a(str, currentTimeMillis2);
            mo13283m();
            m16496e("reset player");
            this.f14798w.setVisibility(8);
            this.f14797v = false;
            f14722P.booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo13266a(Room room) {
        TimeCostUtil.m12208b(Tag.ShowCInteractionFirstWidget);
        C3222b.m12218a().mo10137a(Tag.ShowCInteractionFirstWidget.name(), (C0043i) this, getContext());
        C3222b.m12218a().mo10146b(Tag.ShowCInteractionFirstWidget.name(), (C0043i) this, getContext());
        this.f14725C = ((C3495l) C3596c.m13172a(C3495l.class)).getLiveType(room);
        if (this.f14789k == LiveRoomState.PREPARED) {
            this.f14789k = LiveRoomState.LIVE_STARTED;
            this.f14794s = false;
            this.f14778ay.removeMessages(28);
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(room);
            C3912d.m13795a().mo11456b();
            C3913e.m13800a().mo11460c();
            C4327g gVar = new C4327g(room.getId(), room.getStreamId(), room.getLabels(), false, new C4328a() {
                /* renamed from: b */
                public final void mo12018b() {
                    LivePlayFragment.this.mo13263a(C5120a.ROOM_PLAY_FINISHED);
                }

                /* renamed from: c */
                public final void mo12019c() {
                    LivePlayFragment.this.mo13284n();
                }

                /* renamed from: a */
                public final boolean mo12017a() {
                    if (LivePlayFragment.this.f14792q == null) {
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("send play ping room. id:");
                    sb.append(LivePlayFragment.this.f14748a);
                    sb.append(",mActivityPause:");
                    sb.append(!LivePlayFragment.this.isResumed());
                    sb.append(",mAudioLostFocusTime:");
                    sb.append(LivePlayFragment.this.f14792q.getAudioLostFocusTime());
                    if (LivePlayFragment.this.isResumed() || LivePlayFragment.this.f14792q.getAudioLostFocusTime() == -1 || System.currentTimeMillis() - LivePlayFragment.this.f14792q.getAudioLostFocusTime() <= 10000) {
                        return true;
                    }
                    LivePlayFragment.this.mo13280i();
                    LivePlayFragment.this.mo13260a(120, "isn't resumed and lost audio", LivePlayFragment.this.f14748a);
                    LivePlayFragment.this.mo13268a(true);
                    LivePlayFragment.this.f14795t = true;
                    return false;
                }

                /* renamed from: a */
                public final void mo12016a(int i) {
                    if (30004 == i) {
                        LivePlayFragment.this.mo13263a(C5120a.PING_KICK_OUT);
                    } else {
                        LivePlayFragment.this.mo13263a(C5120a.ROOM_PLAY_FINISHED);
                    }
                }
            });
            this.f14756ac = gVar;
            this.f14756ac.mo12014a();
            m16491c(room);
            if (room.isLiveTypeAudio()) {
                this.f14769ap.setVisibility(0);
                this.f14770aq.setVisibility(0);
                C5343e.m17039a(this.f14769ap, room.getOwner().getAvatarLarge(), (C13842b) new C9092w(5, (float) (C9738o.m28691a(getContext()) / C9738o.m28709b(getContext())), null));
            }
            if (room.getMosaicStatus() != 0) {
                C8540cb cbVar = new C8540cb();
                cbVar.f23495b = 2;
                String mosaicTip = room.getMosaicTip();
                if (TextUtils.isEmpty(mosaicTip)) {
                    mosaicTip = getString(R.string.eyq);
                }
                cbVar.f23494a = mosaicTip;
                mo13264a(cbVar);
            }
            if (m16471I() != null) {
                m16471I().mo11371j();
            }
            f14722P.booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo13267a(String str) {
        if (this.f14763aj.getVisibility() != 8) {
            this.f14763aj.setVisibility(8);
        }
        if (this.f14764ak.getVisibility() != 8) {
            this.f14764ak.setVisibility(8);
        }
        new StringBuilder("hide Background, reason: ").append(str);
        m16486a(false, str);
    }

    /* renamed from: a */
    private void m16486a(boolean z, String str) {
        if (mo13278g().mUserVisibleHint || !mo13278g().mHidden) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_background_status");
            hashMap.put("view_status", z ? "show" : "hide");
            hashMap.put("view_bg_reason", str);
            C8444d.m25673b().mo10001b("ttlive_room", (Map<String, ?>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_status", z ? "show" : "hide");
        hashMap2.put("bg_reason", str);
        hashMap2.put("bg_illegal", String.valueOf(this.f14796u));
        C8443c.m25663a().mo21606a("liveplay_background_monitor", hashMap2, new Object[0]);
    }

    /* renamed from: a */
    public final void mo13264a(C8540cb cbVar) {
        if (isAdded()) {
            boolean z = cbVar.f23495b == 2;
            if (z != this.f14796u) {
                this.f14796u = z;
                if (this.f14796u) {
                    m16496e("illegal Status");
                    m16498f(cbVar.f23494a);
                    return;
                }
                if (this.f14792q != null && this.f14792q.getDecodeStatus() == 1) {
                    mo13267a("recover from illegal status");
                }
                m16470H();
            }
        }
    }

    /* renamed from: a */
    private void m16485a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            this.f14784f = str3;
            this.f14797v = true;
            this.f14792q.stop(false);
            this.f14792q.recycle();
            this.f14792q = null;
            m16482a(str, this.f14781c, this.f14743V, str2);
            C9049ap.m27028a(getString(R.string.f4m));
        }
    }

    /* renamed from: a */
    public final boolean mo9067a() {
        List<Fragment> f = getChildFragmentManager().mo2658f();
        if (f != null) {
            for (Fragment fragment : f) {
                if ((fragment instanceof C9297a) && ((C9297a) fragment).mo9067a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13262a(C4445o oVar) {
        mo13263a(C5120a.JUMP_TO_OTHER);
        if (m16471I() != null) {
            m16471I().mo11349a(oVar.f12898a, oVar.f12899b, oVar.f12900c, oVar.f12901d);
        }
    }

    /* renamed from: a */
    public final void mo13263a(C5120a aVar) {
        boolean z = true;
        switch (aVar) {
            case PLAYER_ERROR:
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.er8, 0));
                mo13294r();
                return;
            case ENTER_FAILED:
                if (this.f14734L) {
                    C5228bv.m16885a(Toast.makeText(getContext(), R.string.er8, 0));
                }
                this.f14734L = true;
                mo13294r();
                return;
            case FETCH_FAILED:
                if (getArguments() == null || !getArguments().getBoolean("from_notification", false)) {
                    C5228bv.m16885a(Toast.makeText(getContext(), R.string.er1, 0));
                    m16497e(true);
                    mo13294r();
                    return;
                }
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.er0, 0));
                m16497e(true);
                if (m16471I() != null) {
                    m16471I().mo11348a(this.f14738Q);
                    return;
                } else {
                    mo13294r();
                    return;
                }
            case EMPTY_URL:
                mo13260a(109, "empty url", this.f14748a);
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.er8, 0));
                mo13294r();
                return;
            case ENTER_LIVE_END:
                mo13260a(121, "enter live end", this.f14748a);
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.er1, 0));
                m16497e(true);
                mo13294r();
                return;
            case ROOM_FETCH_FINISHED:
                mo13260a(116, "fetch finished", this.f14748a);
                mo13292p();
                m16497e(true);
                m16500w();
                this.f14789k = LiveRoomState.LIVE_FINISHED;
                return;
            case ROOM_PLAY_FINISHED:
                mo13260a(117, "fetch finished", this.f14748a);
                mo13292p();
                m16497e(true);
                m16500w();
                this.f14789k = LiveRoomState.LIVE_FINISHED;
                return;
            case PING_KICK_OUT:
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.ey6, 1));
                mo13260a(118, "fetch finished", this.f14748a);
                mo13292p();
                m16500w();
                return;
            case USER_CLOSE:
                mo13260a(114, "user close", this.f14748a);
                m16468F();
                if (this.f14789k != LiveRoomState.LIVE_FINISHED) {
                    z = false;
                }
                m16497e(z);
                if (this.f14790l != null) {
                    this.f14790l.mo12032f();
                }
                m16467E();
                mo13294r();
                return;
            case USER_KICK_OUT:
                mo13260a((int) OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, "this user is kicked out by other device", this.f14748a);
                C5228bv.m16885a(Toast.makeText(getContext(), R.string.f5g, 1));
                m16500w();
                mo13294r();
                return;
            case WATCHER_KIT_OUT:
                final C5177ac acVar = new C5177ac(getContext());
                if (isAdded() && !acVar.isShowing()) {
                    acVar.show();
                }
                this.f14778ay.postDelayed(new Runnable() {
                    public final void run() {
                        if (acVar.isShowing()) {
                            acVar.dismiss();
                        }
                        LivePlayFragment.this.mo13260a(111, "watcher kit out", LivePlayFragment.this.f14748a);
                        LivePlayFragment.this.mo13294r();
                    }
                }, 2500);
                return;
            case JUMP_TO_OTHER:
                m16500w();
                m16489b(false);
                mo13260a(112, "jump to other room", this.f14748a);
                return;
            default:
                mo13260a(119, "jump to other room", this.f14748a);
                m16500w();
                return;
        }
    }

    /* renamed from: a */
    public final void mo13260a(int i, String str, long j) {
        if (this.f14730H != null) {
            this.f14730H.mo21817a(i, str, j);
        }
        mo13296t();
    }

    /* renamed from: B */
    private void m16464B() {
        m16474a((int) R.id.ea8, 0);
    }

    /* renamed from: w */
    private void m16500w() {
        m16489b(true);
    }

    /* renamed from: A */
    private static boolean m16463A() {
        if (VERSION.SDK_INT > 19) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m16465C() {
        m16474a((int) R.id.ea8, 8);
    }

    /* renamed from: E */
    private void m16467E() {
        if (getContext() != null) {
            C10296b.m30493a(getContext());
        }
    }

    /* renamed from: H */
    private void m16470H() {
        if (mo8989l()) {
            this.f14792q.setMute(false);
        }
    }

    /* renamed from: e */
    public final LiveRoomState mo13276e() {
        if (this.f14735M) {
            return LiveRoomState.DETACHED;
        }
        return this.f14789k;
    }

    public void onStart() {
        f14722P.booleanValue();
        super.onStart();
    }

    public void onStop() {
        f14722P.booleanValue();
        super.onStop();
    }

    /* renamed from: q */
    public final void mo13293q() {
        if (this.f14799x != null) {
            this.f14799x.mo13136m();
        }
    }

    /* renamed from: s */
    public final C9328d mo13295s() {
        Fragment fragment = this.mParentFragment;
        if (fragment instanceof LiveRoomFragment) {
            return (C9328d) fragment;
        }
        return new C9329a();
    }

    /* renamed from: t */
    public final void mo13296t() {
        if (this.f14732J != null) {
            this.f14732J.mo12046c();
        }
    }

    /* renamed from: G */
    private void m16469G() {
        if (this.f14801z != null) {
            if (!this.f10104p) {
                getChildFragmentManager().mo2645a().mo2587a((Fragment) this.f14801z).mo2606d();
            }
            this.f14801z = null;
        }
    }

    /* renamed from: x */
    private void m16501x() {
        if (this.f14791m != null) {
            this.f14791m.mo12005b();
            this.f14791m = null;
            f14722P.booleanValue();
        }
    }

    /* renamed from: y */
    private void m16502y() {
        if (this.f14757ad != null) {
            this.f14757ad.mo12000b();
            this.f14757ad = null;
            f14722P.booleanValue();
        }
    }

    /* renamed from: z */
    private void m16503z() {
        if (this.f14793r != null) {
            this.f14793r.mo12000b();
            this.f14793r = null;
            f14722P.booleanValue();
        }
    }

    /* renamed from: h */
    public final void mo13279h() {
        if (this.f14800y != null && this.f14800y.isShowing()) {
            this.f14800y.dismiss();
        }
    }

    public void onPause() {
        f14722P.booleanValue();
        if (this.f14792q != null) {
            this.f14792q.onBackground();
        }
        this.f14790l.mo12029c();
        this.f14759af.mo13639b();
        super.onPause();
    }

    /* renamed from: r */
    public final void mo13294r() {
        if (mo13295s().mo11365d() != null) {
            mo13295s().mo11365d().mo11383a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ void mo13297u() {
        if (this.f14790l != null && this.f14789k == LiveRoomState.LIVE_STARTED) {
            this.f14790l.mo12032f();
        }
        mo13263a(C5120a.USER_CLOSE);
    }

    /* renamed from: D */
    private void m16466D() {
        if (this.f14799x != null) {
            this.f14799x.mo10482d();
            if (!this.f10104p) {
                getChildFragmentManager().mo2645a().mo2587a((Fragment) this.f14799x).mo2610f();
            }
            this.f14799x = null;
        }
    }

    /* renamed from: J */
    private void m16472J() {
        if (getActivity() instanceof C9289b) {
            this.f14773at = new SimpleDrawerListener() {
                public final void onDrawerClosed(View view) {
                    super.onDrawerClosed(view);
                    LivePlayFragment.this.f14787i.lambda$put$1$DataCenter("DATA_DRAWER_LAYOUT_IS_OPEN", Boolean.valueOf(true));
                    if (LivePlayFragment.this.mUserVisibleHint && LivePlayFragment.this.f14790l != null) {
                        LivePlayFragment.this.f14790l.mo12030d();
                        LivePlayFragment.this.f14790l.mo12028b(LivePlayFragment.this.f14727E);
                        LivePlayFragment.this.f14727E = "";
                    }
                }

                public final void onDrawerOpened(View view) {
                    super.onDrawerOpened(view);
                    LivePlayFragment.this.f14787i.lambda$put$1$DataCenter("DATA_DRAWER_LAYOUT_IS_OPEN", Boolean.valueOf(true));
                    if (LivePlayFragment.this.mUserVisibleHint && LivePlayFragment.this.f14790l != null) {
                        LivePlayFragment.this.f14790l.mo12029c();
                        LivePlayFragment.this.f14790l.mo12023a(LivePlayFragment.this.f14727E);
                    }
                    if (LivePlayFragment.this.getContext() != null) {
                        C10296b.m30493a(LivePlayFragment.this.getContext()).mo25021a("live.pref.SHOW_ENTRANCE_GUIDE", (Object) Integer.valueOf(3)).mo25023a();
                    }
                }
            };
            if (C9420h.m27939a(getActivity())) {
                ((C9289b) getActivity()).mo22776a(this.f14773at);
                return;
            }
            this.f14774au = ((C9289b) getActivity()).mo22775a();
            if (this.f14774au != null) {
                this.f14774au.addDrawerListener(this.f14773at);
            }
        }
    }

    /* renamed from: k */
    public final void mo13282k() {
        if (this.f14765al.getVisibility() != 0) {
            this.f14765al.setVisibility(0);
        }
        if (m16463A()) {
            if (this.f14767an.getVisibility() != 0) {
                this.f14767an.setVisibility(0);
                this.f14767an.mo13376b();
            }
        } else if (this.f14766am.getVisibility() != 0) {
            this.f14766am.setVisibility(0);
        }
    }

    /* renamed from: m */
    public final void mo13283m() {
        if (m16463A()) {
            if (this.f14767an.getVisibility() != 4) {
                this.f14767an.setVisibility(4);
                this.f14767an.mo13377c();
            }
        } else if (this.f14766am.getVisibility() != 4) {
            this.f14766am.setVisibility(4);
        }
        if (this.f14765al.getVisibility() != 8) {
            this.f14765al.setVisibility(8);
        }
    }

    /* renamed from: n */
    public final void mo13284n() {
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c() && this.f14748a != 0) {
            m16501x();
            m16487b(this.f14748a);
        }
    }

    /* renamed from: F */
    private void m16468F() {
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c() && this.f14791m != null && this.f14791m.f12552c != null && this.f14791m.f12552c.f14022a != null && this.f14791m.f12552c.f14022a.getOwner() != null && this.f14791m.f12552c.f14022a.getOwner().isFollowing()) {
            C9097a.m27146a().mo22267a((Object) new C5886a());
        }
    }

    /* renamed from: c */
    public final void mo13273c() {
        f14722P.booleanValue();
        this.f14752aD.mo119660a();
        this.f14761ah = false;
        this.f14787i.removeObserver(this);
        this.f14778ay.removeCallbacksAndMessages(null);
        m16500w();
        C3912d.m13795a().mo11456b();
        C3913e.m13800a().mo11460c();
        C9038ag.m26999a(this.f14748a);
        LinkCrossRoomDataHolder.m13784a(this.f14748a);
        this.f14758ae.mo12012a(false);
    }

    /* renamed from: i */
    public final void mo13280i() {
        if (this.f14789k == LiveRoomState.LIVE_STARTED) {
            this.f14778ay.removeMessages(28);
            m16466D();
            m16470H();
            if (this.f14756ac != null) {
                this.f14756ac.mo12015b();
                this.f14756ac = null;
            }
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(null);
            C4275g.m14457b((Handler) null, this.f14748a);
            this.f14790l.mo12032f();
            this.f14794s = false;
            this.f14796u = false;
            this.f14789k = LiveRoomState.PREPARED;
            f14722P.booleanValue();
        }
    }

    /* renamed from: j */
    public final void mo13281j() {
        boolean z;
        if (!this.f14762ai) {
            boolean z2 = false;
            if (this.f14791m == null || this.f14791m.f12552c == null) {
                z = false;
            } else {
                z = true;
            }
            if (this.f14792q != null && this.f14792q.getDecodeStatus() == 1) {
                z2 = true;
            }
            if (z && (z2 || !((Boolean) LiveSettingKeys.IS_LOAD_GIFT_RESOURCE_AFTER_FIRST_FRAME.mo10240a()).booleanValue())) {
                this.f14762ai = true;
                ((IGiftService) C3596c.m13172a(IGiftService.class)).syncGiftList(null, this.f14748a, 2, false);
            }
        }
    }

    /* renamed from: o */
    public final void mo13285o() {
        if (!(this.f14796u || ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom() == null || TTLiveSDKContext.getHostService().mo22369j() == null)) {
            getActivity();
        }
        if (this.f14789k != LiveRoomState.LIVE_STARTED || this.f14796u) {
            if (this.f14790l != null && this.f14789k == LiveRoomState.LIVE_STARTED) {
                this.f14790l.mo12032f();
            }
            mo13263a(C5120a.USER_CLOSE);
        } else if (m16471I() == null || !m16471I().mo11370i()) {
            C5225bs bsVar = new C5225bs(this);
            if (!this.f14799x.mo13120a((Runnable) bsVar, false)) {
                bsVar.run();
            }
        }
    }

    /* renamed from: K */
    private void m16473K() {
        if (!(this.f14790l == null || getArguments() == null)) {
            if (getArguments().getBoolean("enter_from_dou_plus", false)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", String.valueOf(this.f14790l.mo12031e()));
                    jSONObject.put("room_id", String.valueOf(this.f14748a));
                    jSONObject.put("anchor_id", String.valueOf(this.f14738Q));
                } catch (JSONException unused) {
                }
                Serializable serializable = getArguments().getSerializable("live_douplus_log_extra");
                if (serializable instanceof HashMap) {
                    HashMap hashMap = (HashMap) serializable;
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject).mo21610a((Map<String, String>) hashMap);
                }
            }
            if (getArguments().getBoolean("enter_from_effect_ad", false)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", String.valueOf(this.f14790l.mo12031e()));
                    jSONObject2.put("room_id", String.valueOf(this.f14748a));
                    jSONObject2.put("anchor_id", String.valueOf(this.f14738Q));
                } catch (JSONException unused2) {
                }
                Serializable serializable2 = getArguments().getSerializable("live_effect_ad_log_extra_map");
                if (serializable2 instanceof HashMap) {
                    HashMap hashMap2 = (HashMap) serializable2;
                    C3596c.m13172a(C9295a.class);
                    C8446a.m25675a().mo21611a(jSONObject2).mo21610a((Map<String, String>) hashMap2);
                }
            }
        }
        C9074l.m27088c(this.f14787i, getArguments());
    }

    /* renamed from: d */
    public final void mo13275d() {
        f14722P.booleanValue();
        this.f14778ay.removeCallbacksAndMessages(null);
        mo13260a(115, "change page", this.f14748a);
        if (this.f14732J != null) {
            this.f14732J.mo12046c();
        }
        m16489b(false);
        C3912d.m13795a().mo11456b();
        C3913e.m13800a().mo11460c();
        this.f14758ae.mo12012a(false);
    }

    /* renamed from: f */
    public final void mo13277f() {
        boolean z;
        boolean z2 = false;
        if (this.f14791m == null || this.f14791m.f12552c == null) {
            z = false;
        } else {
            z = true;
        }
        if (this.f14792q != null && this.f14792q.getDecodeStatus() == 1) {
            z2 = true;
        }
        f14722P.booleanValue();
        if (z) {
            if (z2) {
                this.f14778ay.removeMessages(28);
                this.f14778ay.sendMessage(Message.obtain(this.f14778ay, 28, this.f14791m.f12552c.f14022a));
                return;
            } else if (!this.f14778ay.hasMessages(28)) {
                this.f14778ay.sendMessageDelayed(Message.obtain(this.f14778ay, 28, this.f14791m.f12552c.f14022a), Math.min(0, (2000 - SystemClock.elapsedRealtime()) + this.f14790l.f12608e));
            }
        }
        if (this.f14748a != 0) {
            m16475a(this.f14748a);
        } else {
            try {
                if (this.f14738Q <= 0 && this.f14730H != null) {
                    this.f14730H.mo21818a(106, "roomId is 0L", this.f14748a, this.f14725C, this.f14780b);
                    mo13260a(106, "roomId is 0L", this.f14748a);
                }
            } catch (Exception unused) {
            }
            m16490c(this.f14738Q);
        }
        if (!TextUtils.isEmpty(this.f14741T)) {
            m16484a(this.f14741T, this.f14742U, this.f14781c, this.f14743V);
            return;
        }
        if (!TextUtils.isEmpty(this.f14780b)) {
            m16482a(this.f14780b, this.f14781c, this.f14743V, this.f14740S);
        }
    }

    public void onDestroy() {
        f14722P.booleanValue();
        super.onDestroy();
        TTLiveSDKContext.getHostService().mo22369j();
        mo13273c();
        C9178j.m27302j().mo22374c().mo11546b();
        if (this.f14790l != null) {
            this.f14790l.mo12020a();
        }
        if (this.f14774au != null) {
            this.f14774au.removeDrawerListener(this.f14773at);
            this.f14774au = null;
            this.f14773at = null;
        }
        if ((getActivity() instanceof C9289b) && C9420h.m27939a(getActivity())) {
            ((C9289b) getActivity()).mo22778b(this.f14773at);
            this.f14773at = null;
        }
        if (this.f14732J != null) {
            this.f14732J.mo12047d();
            this.f14732J = null;
        }
        if (this.f14759af != null) {
            this.f14759af.mo13642e();
            this.f14759af = null;
        }
        this.f14748a = 0;
        this.f14738Q = 0;
        this.f14739R = null;
        this.f14780b = null;
        this.f14740S = null;
        this.f14741T = null;
        this.f14742U = null;
        this.f14781c = LiveMode.VIDEO;
        this.f14743V = null;
        this.f14789k = LiveRoomState.IDLE;
        this.f14790l = null;
        this.f14782d = false;
        this.f14784f = null;
        this.f14785g = null;
        this.f14795t = false;
        this.f14744W = false;
        this.f14746Y = false;
        this.f14761ah = false;
    }

    public void onResume() {
        super.onResume();
        this.f14790l.mo12030d();
        this.f14759af.mo13640c();
        if (this.f14735M) {
            C3166a.m11964c("LivePlayFragment.onResume", "restarting detached live room");
            mo13295s().mo11352a("");
        }
        if (this.f14792q != null) {
            if (!this.f14796u) {
                this.f14792q.onForeground();
            }
            this.f14792q.tryResumePlay();
            if (!this.f14751aC.isEmpty()) {
                for (C4450t a : this.f14751aC) {
                    m16477a(a);
                }
                this.f14751aC.clear();
            }
        }
        f14722P.booleanValue();
        if (this.f14795t) {
            this.f14795t = false;
            if (this.f14789k == LiveRoomState.PREPARED) {
                if (!TextUtils.isEmpty(this.f14741T)) {
                    m16484a(this.f14741T, this.f14742U, this.f14781c, this.f14743V);
                    return;
                }
                m16482a(this.f14780b, this.f14781c, this.f14743V, this.f14740S);
            }
        }
    }

    /* renamed from: p */
    public final void mo13292p() {
        if (isAdded() && mo8989l()) {
            if (this.f14799x != null) {
                this.f14799x.mo10482d();
            }
            if (m16471I() != null) {
                m16471I().mo11372k();
            }
            TTLiveSDKContext.getHostService().mo22369j();
            if (this.f14786h == 0) {
                this.f14786h = 1;
                getActivity().setRequestedOrientation(1);
            }
            if (this.f14801z == null) {
                C0608j childFragmentManager = getChildFragmentManager();
                Fragment a = childFragmentManager.mo2644a("LiveEndFragment");
                if (a == null) {
                    Room room = null;
                    if (this.f14791m != null && this.f14791m.f12552c != null && this.f14791m.f12552c.f14022a != null) {
                        room = this.f14791m.f12552c.f14022a;
                    } else if (!(this.f14793r == null || this.f14793r.f12545b == null)) {
                        room = this.f14793r.f12545b;
                    }
                    if (room != null) {
                        this.f14801z = new LiveAudienceEndFragment();
                        this.f14801z.mo12084a(getActivity(), room, new C9297a() {
                            /* renamed from: a */
                            public final boolean mo9067a() {
                                C8448g.m25682a((Context) LivePlayFragment.this.getActivity());
                                LivePlayFragment.this.mo13285o();
                                return true;
                            }
                        }, this.f14790l.f12612i);
                        childFragmentManager.mo2645a().mo2586a(R.id.aoy, this.f14801z, "LiveEndFragment").mo2606d();
                        this.f14801z.getLifecycle().mo55a(new GenericLifecycleObserver() {
                            /* renamed from: a */
                            public final void mo44a(C0043i iVar, Event event) {
                                if (event.equals(Event.ON_START) && LivePlayFragment.this.mo13295s().mo11366e() != null) {
                                    LivePlayFragment.this.mo13295s().mo11366e().mo11384a(LivePlayFragment.this.f14801z.getView(), LivePlayFragment.this.f14801z.f12669a);
                                }
                            }
                        });
                    } else if (this.f14793r == null || !this.f14793r.f12544a) {
                        if (this.f14789k != LiveRoomState.LIVE_FINISHED) {
                            mo13263a(C5120a.ENTER_LIVE_END);
                        }
                        return;
                    } else {
                        this.f14726D = true;
                        return;
                    }
                } else {
                    this.f14801z = (LiveAudienceEndFragment) a;
                }
                this.f14801z.mo12086a(this.f14787i, getArguments());
            }
        }
    }

    /* renamed from: v */
    private void m16499v() {
        Bundle bundle;
        String str;
        if (this.f14789k != LiveRoomState.INITIALIZED) {
            C9178j.m27302j().mo22376e().f23036a = null;
            return;
        }
        this.f14790l.mo12035i();
        this.f14730H.mo21821a(this.f14790l.f12609f);
        C3169b.m11987b();
        if (this.f14789k == LiveRoomState.LIVE_FINISHED) {
            if (this.f14801z == null) {
                this.f14801z = (LiveAudienceEndFragment) getChildFragmentManager().mo2644a("LiveEndFragment");
            }
            if (this.f14801z == null) {
                this.f14789k = LiveRoomState.INITIALIZED;
            } else {
                return;
            }
        }
        m16469G();
        C8804a.m26398b(this.f14787i, getArguments());
        this.f14789k = LiveRoomState.PREPARING;
        if (getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = getArguments();
        }
        long j = bundle.getLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", 0);
        long j2 = bundle.getLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_INNER_TIME", 0);
        String string = bundle.getString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", null);
        String string2 = bundle.getString("enter_from_merge", null);
        String string3 = bundle.getString("enter_method", null);
        if (this.f14790l.f12609f != null) {
            str = this.f14790l.f12609f.f22984a;
        } else {
            str = "";
        }
        String str2 = str;
        String string4 = bundle.getString("previous_page", null);
        bundle.remove("previous_page");
        String str3 = string4;
        this.f14731I.mo11974a(C4300c.m14481a((Object) this), string, string2, string3, str2, j, j2, this.f14748a, this.f14780b, this.f14741T);
        String string5 = bundle.getString("live.intent.extra.ENTER_TYPE");
        bundle.remove("live.intent.extra.ENTER_TYPE");
        String string6 = bundle.getString("live.intent.extra.PAGE_DELAY_TYPE");
        bundle.remove("live.intent.extra.PAGE_DELAY_TYPE");
        String string7 = bundle.getString("live.intent.extra.EXTRA_ENTER_FEED_STYLE");
        this.f14787i.lambda$put$1$DataCenter("log_action_type", string5);
        this.f14790l.mo12024a(string5, string6, string7);
        this.f14790l.f12617n = this.f14787i;
        this.f14790l.f12622s = str3;
        this.f14790l.mo12027b();
        this.f14790l.f12621r = bundle.getString("enter_from_merge_recommend", "");
        this.f14759af.mo13638a();
        C5894a.m18413a().f17443a = SystemClock.elapsedRealtime();
        mo13277f();
    }

    /* renamed from: b */
    public final void mo13270b() {
        f14722P.booleanValue();
        if (!this.f14761ah) {
            m16481a(C9409a.class);
            m16481a(C4452v.class);
            m16481a(C4453w.class);
            m16481a(C4445o.class);
            m16481a(C4455y.class);
            m16481a(C4409aa.class);
            this.f14761ah = true;
        }
        this.f14787i.observeForever("cmd_interact_state_change", this).observeForever("cmd_pk_state_change", this).observeForever("cmd_pk_state_change", this);
        m16499v();
        this.f14758ae.mo12012a(true);
    }

    /* renamed from: a */
    public final void mo13265a(C9331a aVar) {
        this.f14753aE = aVar;
    }

    /* renamed from: a */
    private void m16475a(long j) {
        m16487b(j);
        m16493d(j);
    }

    /* renamed from: b */
    public final void mo13272b(String str) {
        m16486a(true, str);
    }

    public void onEvent(C4409aa aaVar) {
        if (aaVar != null) {
            this.f14727E = aaVar.f12818a;
        }
    }

    /* renamed from: f */
    private void m16498f(String str) {
        if (mo8989l()) {
            this.f14792q.setMute(true);
        }
    }

    /* renamed from: a */
    public final void mo13258a(int i) {
        if (this.f14799x != null) {
            this.f14799x.mo13108a(i);
        }
    }

    public void onEvent(C4453w wVar) {
        if (m16471I() != null) {
            m16471I().mo11357a(wVar.f12916b);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f14801z != null) {
            this.f14801z.setUserVisibleHint(z);
        }
    }

    /* renamed from: c */
    private void m16490c(long j) {
        if (this.f14757ad == null) {
            this.f14757ad = new C4339n(new C4320a() {
                /* renamed from: a */
                public final void mo12003a(Room room) {
                    if (room == null) {
                        C8443c.m25663a().mo21607a("rd_enter_room_live_end", C8438j.class, Room.class);
                        LivePlayFragment.this.mo13263a(C5120a.ENTER_LIVE_END);
                        return;
                    }
                    if (LivePlayFragment.this.mo13269a(room, false)) {
                        LivePlayFragment.this.mo13277f();
                    }
                }

                /* renamed from: a */
                public final void mo12002a(int i, String str) {
                    int i2;
                    if (!(i == 30003 || i == 30001)) {
                        if (i != 0) {
                            i2 = i;
                        } else {
                            i2 = 103;
                        }
                        LivePlayFragment.this.f14790l.mo12025a(false, i2, str);
                        LivePlayFragment.this.f14730H.mo21818a(i2, str, LivePlayFragment.this.f14748a, LivePlayFragment.this.f14725C, LivePlayFragment.this.f14780b);
                        LivePlayFragment.this.mo13260a(i2, str, LivePlayFragment.this.f14748a);
                    }
                    LivePlayFragment.this.mo13263a(C5120a.FETCH_FAILED);
                    if (i != 30003) {
                        C8443c.m25663a().mo21607a("rd_info_by_user_failed", C8438j.class, Room.class);
                        return;
                    }
                    C8443c.m25663a().mo21607a("rd_enter_room_live_end", C8438j.class, Room.class);
                }
            }, j);
            this.f14757ad.mo11997a();
            f14722P.booleanValue();
        }
    }

    /* renamed from: d */
    private void m16493d(final long j) {
        if (this.f14793r == null) {
            this.f14793r = new C4338m(new C4320a() {
                /* renamed from: a */
                public final void mo12003a(Room room) {
                    LivePlayFragment.this.mo13269a(room, true);
                }

                /* renamed from: a */
                public final void mo12002a(int i, String str) {
                    if (LivePlayFragment.this.f14791m == null) {
                        LivePlayFragment.this.mo13263a(C5120a.FETCH_FAILED);
                        LivePlayFragment.this.mo13260a(i, str, j);
                    } else if (LivePlayFragment.this.f14791m.f12552c != null && LivePlayFragment.this.f14791m.f12552c.f14022a != null) {
                    } else {
                        if (!LivePlayFragment.this.f14791m.f12551b) {
                            if (LivePlayFragment.this.f14726D) {
                                LivePlayFragment.this.mo13263a(C5120a.ROOM_PLAY_FINISHED);
                            }
                        } else if (!LivePlayFragment.this.f14793r.f12641c) {
                            LivePlayFragment.this.f14793r.mo12059d();
                        }
                    }
                }
            }, j);
            this.f14793r.mo11997a();
            f14722P.booleanValue();
        }
    }

    /* renamed from: e */
    private void m16496e(String str) {
        if (this.f14763aj.getVisibility() != 0) {
            this.f14763aj.setVisibility(0);
        }
        new StringBuilder("show Background, reason: ").append(str);
        m16486a(true, str);
    }

    public void onEvent(C4455y yVar) {
        if (this.f14789k == LiveRoomState.LIVE_STARTED) {
            if (yVar.f12922d != null) {
                m16478a(yVar.f12922d);
            } else {
                m16485a(yVar.f12920b, yVar.f12921c, yVar.f12919a);
            }
        }
    }

    /* renamed from: a */
    private void m16478a(Quality quality) {
        if (this.f14789k == LiveRoomState.LIVE_STARTED) {
            this.f14784f = quality.name;
            this.f14797v = true;
            this.f14792q.switchResolution(quality.sdkKey);
            C9049ap.m27028a(getString(R.string.f4m));
        }
    }

    /* renamed from: b */
    private void m16488b(C4445o oVar) {
        if (this.f14789k == LiveRoomState.LIVE_STARTED) {
            C5226bt btVar = new C5226bt(this, oVar);
            if (!this.f14799x.mo13120a((Runnable) btVar, true)) {
                btVar.run();
            }
            return;
        }
        mo13263a(C5120a.JUMP_TO_OTHER);
        if (m16471I() != null) {
            m16471I().mo11349a(oVar.f12898a, oVar.f12899b, oVar.f12900c, oVar.f12901d);
        }
    }

    /* renamed from: c */
    private void m16492c(boolean z) {
        if (this.f14789k == LiveRoomState.PREPARING || this.f14789k == LiveRoomState.PREPARED) {
            m16502y();
            m16503z();
            m16501x();
            mo13268a(z);
            this.f14790l.mo12020a();
            this.f14789k = LiveRoomState.INITIALIZED;
            this.f14725C = "other";
            f14722P.booleanValue();
        }
    }

    /* renamed from: d */
    private void m16494d(String str) {
        if (this.f14764ak.getVisibility() != 0) {
            this.f14764ak.setVisibility(0);
        }
        new StringBuilder("show Below Background, reason: ").append(str);
        m16486a(true, str);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            if (this.f14786h != getActivity().getRequestedOrientation()) {
                getActivity().setRequestedOrientation(this.f14786h);
            }
        } catch (Exception unused) {
            C3166a.m11964c("ttlive_room", "setRequestedOrientation wrong");
        }
        C0608j childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2644a("AbsInteractionFragment");
        if (a != null) {
            childFragmentManager.mo2645a().mo2587a(a).mo2606d();
        }
    }

    /* renamed from: a */
    private void m16476a(C4448r rVar) {
        if (mo8989l() && this.f14792q != null) {
            if (rVar.f12904a == 0) {
                this.f14792q.setAnchorInteractMode(true);
                this.f14755ab = true;
            } else if (rVar.f12904a == 1) {
                this.f14792q.setAnchorInteractMode(false);
                this.f14755ab = false;
            }
            int[] iArr = new int[2];
            this.f14792q.getVideoSize(iArr);
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                mo13259a(iArr[0], iArr[1], C9738o.m28691a(getContext()));
            }
        }
    }

    /* renamed from: b */
    private void m16487b(final long j) {
        if (this.f14791m == null) {
            String str = "";
            if (!TextUtils.isEmpty(this.f14790l.f12621r)) {
                str = this.f14790l.f12621r;
            } else if (!TextUtils.isEmpty(this.f14790l.f12613j)) {
                if (TextUtils.isEmpty(this.f14790l.f12614k)) {
                    str = this.f14790l.f12613j;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f14790l.f12613j);
                    sb.append("-");
                    sb.append(this.f14790l.f12614k);
                    str = sb.toString();
                }
            }
            C4323e eVar = new C4323e(new C4325a() {
                /* renamed from: a */
                public final void mo12009a(C4904f fVar) {
                    String str;
                    LivePlayFragment.this.f14730H.mo21815a();
                    LivePlayFragment.this.f14731I.mo11975b("apiDuration");
                    LivePlayFragment.this.mo13279h();
                    Room room = fVar.f14022a;
                    if (room != null) {
                        LivePlayFragment.this.f14730H.mo21820a(j, room.buildPullUrl());
                        LivePlayFragment.this.f14736N = room.isOfficial();
                        LivePlayFragment.this.mo13281j();
                    }
                    boolean a = LivePlayFragment.this.mo13269a(room, true);
                    C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
                    if (a2 != null) {
                        room.setLog_pb(String.valueOf(a2.mo21568a().get("log_pb")));
                        room.setRequestId(String.valueOf(a2.mo21568a().get("request_id")));
                        a2.mo21568a().put("orientation", String.valueOf(room.getOrientation()));
                        String string = LivePlayFragment.this.getArguments().getString("is_preview");
                        Map a3 = a2.mo21568a();
                        String str2 = "is_preview";
                        if (TextUtils.isEmpty(string)) {
                            string = "0";
                        }
                        a3.put(str2, string);
                        a2.mo21568a().put("starlight_rank", LivePlayFragment.this.getArguments().getString("starlight_rank"));
                        Map a4 = a2.mo21568a();
                        String str3 = "is_sale";
                        if (room.hasCommerceGoods) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        a4.put(str3, str);
                        a2.mo21568a().put("is_live_recall", "0");
                        Bundle bundle = LivePlayFragment.this.getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
                        if (bundle != null) {
                            a2.mo21568a().put("starlight_rank", bundle.getString("starlight_rank"));
                        }
                    }
                    LivePlayFragment.this.f14790l.mo12026a(false, true);
                    if (a) {
                        if (LivePlayFragment.this.f14789k == LiveRoomState.PREPARING) {
                            LivePlayFragment.this.f14789k = LiveRoomState.PREPARED;
                        }
                        LivePlayFragment.this.f14787i.lambda$put$1$DataCenter("data_message_manager", C9038ag.m26997a(room.getId(), false, LivePlayFragment.this.getContext()));
                        LivePlayFragment.this.mo13277f();
                    }
                }

                /* renamed from: a */
                public final void mo12008a(int i, String str, String str2) {
                    int i2;
                    LivePlayFragment.this.f14730H.mo21822b();
                    LivePlayFragment.this.mo13279h();
                    LivePlayFragment.this.mo13274c("fetch_room_error");
                    if ((TextUtils.isEmpty(str) || !str.contains("30003")) && i != 30003) {
                        C8443c.m25663a().mo21607a("rd_enter_room_failed", C8438j.class, Room.class);
                        if (i != 0) {
                            i2 = i;
                        } else {
                            i2 = 103;
                        }
                        LivePlayFragment.this.f14790l.mo12025a(false, i2, str);
                        LivePlayFragment.this.f14730H.mo21818a(i2, str, j, LivePlayFragment.this.f14725C, LivePlayFragment.this.f14780b);
                        if (TextUtils.isEmpty(str2) || i == 0) {
                            C5227bu.m16884a(Toast.makeText(LivePlayFragment.this.getContext(), R.string.er8, 0));
                            LivePlayFragment.this.mo13263a(C5120a.ENTER_FAILED);
                        } else if ((TextUtils.isEmpty(str) || !str.contains("30005")) && i != 30005) {
                            C5227bu.m16884a(Toast.makeText(LivePlayFragment.this.getContext(), str2, 0));
                            LivePlayFragment.this.f14734L = false;
                            LivePlayFragment.this.mo13263a(C5120a.ENTER_FAILED);
                        } else if (LivePlayFragment.this.f14800y == null || !LivePlayFragment.this.f14800y.isShowing()) {
                            LivePlayFragment.this.f14790l.mo12039m();
                            LivePlayFragment.this.f14800y = new C9249a(LivePlayFragment.this.getContext()).mo22716a(false).mo22718b((int) R.string.ezf).mo22722b(0, (int) R.string.eze, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (LivePlayFragment.this.f14791m != null) {
                                        LivePlayFragment.this.f14791m.mo12007d();
                                    }
                                    if (LivePlayFragment.this.f14790l != null) {
                                        LivePlayFragment.this.f14790l.mo12040n();
                                    }
                                }
                            }).mo22722b(1, (int) R.string.fdl, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    LivePlayFragment.this.mo13263a(C5120a.ENTER_FAILED);
                                }
                            }).mo22720b();
                            LivePlayFragment.this.f14800y.show();
                        }
                    } else {
                        C8443c.m25663a().mo21607a("rd_enter_room_live_end", C8438j.class, Room.class);
                        LivePlayFragment.this.mo13292p();
                        LivePlayFragment.this.mo13296t();
                    }
                }
            }, j, this.f14723A, this.f14790l.f12611h, this.f14790l.f12607d, this.f14790l.f12612i, str);
            this.f14791m = eVar;
            this.f14791m.mo12004a();
            this.f14731I.mo11973a("apiDuration");
            f14722P.booleanValue();
        }
    }

    /* renamed from: d */
    private void m16495d(boolean z) {
        if (this.f14787i != null) {
            ((Long) this.f14787i.get("data_room_id", Long.valueOf(-1))).longValue();
        }
        if (!z) {
            if (this.f14792q != null) {
                this.f14792q.setMute(true);
                this.f14792q.stopWhenPlayingOther(getContext());
                this.f14772as = true;
            }
            this.f14778ay.post(new Runnable() {
                public final void run() {
                    C9097a.m27146a().mo22267a((Object) new C4452v(34));
                }
            });
        } else if (this.f14792q != null) {
            this.f14792q.tryResumePlay();
            this.f14772as = false;
            C9096z.m27145a(this);
        }
    }

    /* renamed from: e */
    private void m16497e(boolean z) {
        Object obj;
        if (this.f14787i != null) {
            obj = this.f14787i.get("data_member_count");
        } else {
            obj = null;
        }
        int i = 0;
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        }
        RoomStatusEvent roomStatusEvent = new RoomStatusEvent();
        roomStatusEvent.f7646c = z;
        roomStatusEvent.f7647d = i;
        roomStatusEvent.f7645b = this.f14738Q;
        roomStatusEvent.f7644a = this.f14748a;
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                intent.putExtra("host_room_status_event", roomStatusEvent);
            }
        }
    }

    public void onEvent(C4445o oVar) {
        C8444d.m25673b();
        C8444d.m11970a("ttlive_room", "received JumpToOtherRoomEvent");
        if (oVar.f12898a != this.f14748a) {
            long j = oVar.f12900c.getLong("live.intent.extra.FROM_PORTAL_ID");
            if (j > 0) {
                C8444d.m25673b();
                StringBuilder sb = new StringBuilder("preparing jump bundle, portalId=");
                sb.append(j);
                sb.append(" originatingRoomId=");
                sb.append(this.f14748a);
                C8444d.m11970a("ttlive_portal", sb.toString());
                oVar.f12900c.putInt("back_source", 4);
                C8804a.m26400c(this.f14787i, oVar.f12900c);
                oVar.f12900c.putLong("live.intent.extra.ORIGINATING_ROOM_ID", this.f14748a);
            }
            m16488b(oVar);
        }
    }

    /* renamed from: a */
    private void m16477a(C4450t tVar) {
        if (!isResumed()) {
            this.f14751aC.add(tVar);
        } else if (this.f14789k == LiveRoomState.LIVE_STARTED) {
            if (3 == tVar.f12909a) {
                if (this.f14792q != null) {
                    this.f14792q.stopWhenJoinInteract(getContext());
                }
                this.f14798w.setVisibility(4);
                mo13283m();
                return;
            }
            if (4 == tVar.f12909a) {
                this.f14798w.setVisibility(0);
                if (this.f14792q != null) {
                    this.f14792q.tryResumePlay();
                    if (this.f14796u) {
                        this.f14792q.setMute(true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m16489b(boolean z) {
        if (this.f14789k != LiveRoomState.IDLE && this.f14789k != LiveRoomState.INITIALIZED) {
            if (this.f14798w != null && (this.f14798w instanceof C9519c)) {
                ((C9519c) this.f14798w).mo23564a();
            }
            if (this.f14790l != null) {
                this.f14790l.mo12036j();
                this.f14790l.mo12037k();
            }
            if (this.f14759af != null) {
                this.f14759af.mo13641d();
                this.f14759af.mo13642e();
            }
            C4308a.m14513a().mo11985a(this.f14748a);
            if (this.f14789k != LiveRoomState.LIVE_FINISHED) {
                if (this.f14789k == LiveRoomState.LIVE_STARTED) {
                    mo13280i();
                }
                if (this.f14789k == LiveRoomState.PREPARED || this.f14789k == LiveRoomState.PREPARING) {
                    m16492c(z);
                }
                if (this.f14790l != null) {
                    this.f14790l.mo12020a();
                }
                m16473K();
            }
        }
    }

    /* renamed from: c */
    private void m16491c(Room room) {
        AbsInteractionFragment absInteractionFragment;
        room.setRequestId(this.f14723A);
        room.setLog_pb(this.f14724B);
        room.setUserFrom(this.f14775av);
        if (this.f14799x == null) {
            C0608j childFragmentManager = getChildFragmentManager();
            boolean z = true;
            if (this.f14786h == 1) {
                absInteractionFragment = new PortraitInteractionFragment();
            } else {
                absInteractionFragment = new LandscapeInteractionFragment();
            }
            this.f14799x = absInteractionFragment;
            this.f14799x.setArguments(getArguments());
            this.f14787i.lambda$put$1$DataCenter("data_room", room);
            this.f14787i.lambda$put$1$DataCenter("data_room_logger", this.f14790l);
            this.f14799x.mo10478a(this.f14787i, false, (C3487a) new C3487a() {
                /* renamed from: a */
                public final void mo10490a(int i) {
                    if (LivePlayFragment.this.f14789k == LiveRoomState.LIVE_STARTED) {
                        if (i == 3) {
                            LivePlayFragment.this.f14794s = true;
                            return;
                        }
                        if (i == 2) {
                            LivePlayFragment.this.f14794s = false;
                        }
                    }
                }

                /* renamed from: a */
                public final void mo8807a(C8540cb cbVar) {
                    if (cbVar != null && LivePlayFragment.this.f14789k == LiveRoomState.LIVE_STARTED) {
                        LivePlayFragment.this.mo13264a(cbVar);
                    }
                }
            }, this.f14791m.f12552c.f14023b);
            this.f14799x.f14471u = this.f14790l;
            this.f14799x.mo10477a(this.f14781c);
            if (this.f14799x instanceof PortraitInteractionFragment) {
                ((PortraitInteractionFragment) this.f14799x).f15147K = this.f14749aA;
            }
            if (this.f14792q == null || !this.f14792q.isVideoHorizontal()) {
                z = false;
            }
            this.f14783e = z;
            this.f14787i.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(this.f14783e, this.f14788j));
            childFragmentManager.mo2645a().mo2586a(R.id.aoy, this.f14799x, "AbsInteractionFragment").mo2606d();
            this.f14799x.getLifecycle().mo55a(new GenericLifecycleObserver() {
                /* renamed from: a */
                public final void mo44a(C0043i iVar, Event event) {
                    if (event.equals(Event.ON_START) && LivePlayFragment.this.f14799x != null) {
                        FragmentActivity activity = LivePlayFragment.this.getActivity();
                        if (!(activity == null || activity.getWindow() == null || LivePlayFragment.this.f14786h != 1 || LivePlayFragment.this.f14799x == null || LivePlayFragment.this.mo13295s().mo11366e() == null)) {
                            LivePlayFragment.this.mo13295s().mo11366e().mo11385a(true, LivePlayFragment.this.f14799x.getView(), LivePlayFragment.this.f14799x.f14458h, LivePlayFragment.this.f14799x.f14459i, LivePlayFragment.this.f14799x.mo13131h());
                        }
                    }
                }
            });
            this.f14799x.mo10479a((Runnable) new C5224br(this, room));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        boolean z2;
        super.onConfigurationChanged(configuration);
        int requestedOrientation = getActivity().getRequestedOrientation();
        if ((requestedOrientation == 0 || requestedOrientation == 1) && requestedOrientation != this.f14786h) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f14760ag) {
            this.f14786h = requestedOrientation;
        }
        int[] iArr = new int[2];
        if (this.f14792q != null) {
            C2260a aVar = this.f14792q;
            if (requestedOrientation == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.setScreenOrientation(z2);
            this.f14792q.getVideoSize(iArr);
        }
        if (iArr[0] > 0 && iArr[1] > 0) {
            mo13259a(iArr[0], iArr[1], (int) C9738o.m28708b(getContext(), (float) configuration.screenWidthDp));
        }
        this.f14787i.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(this.f14783e, this.f14788j));
        if (this.f14760ag) {
            if (z) {
                this.f14760ag = false;
                if (this.f14793r != null) {
                    m16491c(this.f14791m.f12552c.f14022a);
                }
                this.f14758ae.mo12013b(this.f14786h);
            }
            super.onConfigurationChanged(configuration);
        }
    }

    public void onEvent(C9409a aVar) {
        View view;
        if (this.f14799x != null) {
            if (aVar.f25901b != 2) {
                if (aVar.f25901b == 1) {
                    FragmentActivity activity = getActivity();
                    if (!(activity == null || activity.getWindow() == null || !C3387g.m12599a(activity))) {
                        activity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                    }
                    if (aVar.f25900a.equals("login")) {
                        C8946b.f24404ac.mo22118a("");
                    }
                    if (mo8989l() && this.f14786h != 1) {
                        m16466D();
                        if (activity != null) {
                            activity.setRequestedOrientation(1);
                        }
                        this.f14760ag = true;
                    }
                }
            } else if (mo8989l() && this.f14786h != 0) {
                FragmentActivity activity2 = getActivity();
                if (!(this.f14799x == null || activity2 == null || activity2.getWindow() == null || mo13295s().mo11366e() == null)) {
                    C9336j e = mo13295s().mo11366e();
                    View view2 = this.f14799x.getView();
                    View view3 = this.f14799x.f14458h;
                    if (this.f14799x == null) {
                        view = null;
                    } else {
                        view = this.f14799x.f14459i;
                    }
                    e.mo11385a(false, view2, view3, view, this.f14799x.mo13131h());
                }
                m16466D();
                if (activity2 != null) {
                    activity2.setRequestedOrientation(0);
                }
                this.f14760ag = true;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z;
        Serializable serializable;
        bundle.putAll(getArguments());
        bundle.putInt("live.SCREEN_ORIENTATION", this.f14786h);
        String str = "enter_from_dou_plus";
        boolean z2 = true;
        if (this.f14787i == null || !((Boolean) this.f14787i.get("enter_from_dou_plus", Boolean.valueOf(false))).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean(str, z);
        String str2 = "live_douplus_log_extra";
        Serializable serializable2 = null;
        if (this.f14787i == null) {
            serializable = null;
        } else {
            serializable = (Serializable) this.f14787i.get("live_douplus_log_extra", new HashMap());
        }
        bundle.putSerializable(str2, serializable);
        String str3 = "enter_from_effect_ad";
        if (this.f14787i == null || !((Boolean) this.f14787i.get("enter_from_effect_ad", Boolean.valueOf(false))).booleanValue()) {
            z2 = false;
        }
        bundle.putBoolean(str3, z2);
        String str4 = "live_effect_ad_log_extra_map";
        if (this.f14787i != null) {
            serializable2 = (Serializable) this.f14787i.get("live_effect_ad_log_extra_map", new HashMap());
        }
        bundle.putSerializable(str4, serializable2);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: c */
    public final void mo13274c(String str) {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a != null && a.mo21568a() != null && a.mo21568a().get("enter_method") != null && TextUtils.equals(a.mo21568a().get("enter_method").toString(), "push")) {
            Fragment fragment = this.mParentFragment;
            String str2 = "";
            if (!(fragment == null || fragment.getArguments() == null)) {
                str2 = fragment.getArguments().getString("livesdk_live_push_status", "");
            }
            C8443c.m25663a().mo21606a("livesdk_push_error", C8446a.m25675a().mo21609a("anchor_id", String.valueOf(this.f14738Q)).mo21609a("anchor_status", str).mo21609a("room_id", String.valueOf(this.f14748a)).mo21609a("push_lookup_status", str2).f23108a, new Object[0]);
        }
    }

    public void onEvent(C4452v vVar) {
        int i = vVar.f12912a;
        if (i == 7) {
            mo13263a(C5120a.ROOM_PLAY_FINISHED);
        } else if (i == 11) {
            mo13263a(C5120a.USER_KICK_OUT);
        } else if (i == 20) {
            mo13263a(C5120a.WATCHER_KIT_OUT);
        } else if (i == 32) {
            m16495d(false);
        } else if (i == 35) {
            mo13263a(C5120a.ENTER_FAILED);
        }
        if (isResumed()) {
            int i2 = vVar.f12912a;
            if (!(i2 == 8 || i2 == 17)) {
                switch (i2) {
                    case 5:
                    case 6:
                        break;
                }
            }
            if (this.mUserVisibleHint) {
                if (this.f14786h == 1) {
                    mo13285o();
                } else {
                    onEvent(new C9409a(1));
                }
                if (this.f14789k == LiveRoomState.LIVE_STARTED) {
                    int i3 = vVar.f12912a;
                    if (i3 == 10 || i3 == 24) {
                        mo13284n();
                        return;
                    }
                    if (i3 != 26) {
                        if (i3 != 33) {
                            switch (i3) {
                                case 30:
                                    float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
                                    if (C6311g.m19574b(this.f14739R)) {
                                        C5343e.m17039a(this.f14763aj, new ImageModel(null, this.f14739R), (C13842b) new C9092w(5, a, null));
                                    } else {
                                        StringBuilder sb = new StringBuilder("res://");
                                        sb.append(getContext().getPackageName());
                                        sb.append("/2131234707");
                                        C5343e.m17041a(this.f14763aj, sb.toString(), (C13842b) new C9092w(5, a, null));
                                    }
                                    m16496e("anchor leave");
                                    return;
                                case 31:
                                    mo13267a("anchor back");
                                    return;
                            }
                        } else {
                            m16495d(true);
                        }
                    } else if (!(m16471I() == null || !m16471I().mo11359a(vVar.f12913b) || getView() == null)) {
                        getView().getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (mo8989l() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == -1180299966 && key.equals("cmd_interact_state_change")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m16477a((C4450t) kVData.getData());
                    return;
                case 1:
                    m16476a((C4448r) kVData.getData());
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13271b(Room room) {
        if (this.f14791m != null) {
            this.f14791m.mo12006c();
        }
        if (room.getStatus() == 3) {
            C8688t a = C4270b.m14426a(this.f14748a, false);
            if (C9038ag.m26996a() != null) {
                C9038ag.m26996a().insertMessage(a, true);
            }
        }
        if (this.f14746Y) {
            User user = new User();
            user.setId(this.f14738Q);
            this.f14787i.lambda$put$1$DataCenter("data_gift_panel_type", Boolean.valueOf(true));
            this.f14787i.lambda$put$1$DataCenter("cmd_send_gift", user);
            this.f14746Y = false;
        } else if (this.f14744W) {
            User user2 = new User();
            user2.setId(this.f14738Q);
            this.f14787i.lambda$put$1$DataCenter("cmd_send_gift", user2);
            this.f14744W = false;
        }
        if (TextUtils.equals(this.f14745X, "gift_panel")) {
            User user3 = new User();
            user3.setId(this.f14738Q);
            this.f14787i.lambda$put$1$DataCenter("data_gift_panel_type", PanelType.GIFT);
            this.f14787i.lambda$put$1$DataCenter("cmd_send_gift", user3);
            this.f14745X = null;
            return;
        }
        if (TextUtils.equals(this.f14745X, "package_panel")) {
            User user4 = new User();
            user4.setId(this.f14738Q);
            this.f14787i.lambda$put$1$DataCenter("data_gift_panel_type", PanelType.PROP);
            this.f14787i.lambda$put$1$DataCenter("cmd_send_gift", user4);
            this.f14745X = null;
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Bundle bundle2 = bundle;
        this.f14728F = new HashMap<>();
        this.f14729G = System.currentTimeMillis();
        super.onCreate(bundle);
        this.f14787i = DataCenter.create(C0069x.m157a((Fragment) this), this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f14787i.lambda$put$1$DataCenter("is_embedded_live_room", Boolean.valueOf(arguments.getBoolean("live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM")));
        long j = arguments.getLong("live.intent.extra.FROM_PORTAL_ID");
        if (j > 0) {
            this.f14787i.lambda$put$1$DataCenter("data_from_portal_id", Long.valueOf(j));
            C8444d.m25673b();
            StringBuilder sb = new StringBuilder("entering target room, portalId=");
            sb.append(j);
            C8444d.m11970a("ttlive_portal", sb.toString());
        }
        this.f14787i.lambda$put$1$DataCenter("interaction_layer_margin_top", Integer.valueOf(arguments.getInt("live.intent.extra.EXTRA_INTERACTION_LAYER_MARGIN_TOP", 0)));
        C9074l.m27083a(this.f14787i, arguments);
        C9074l.m27085b(this.f14787i, arguments);
        if (arguments.getLong("live.intent.extra.ROOM_ID", 0) > 0) {
            this.f14748a = arguments.getLong("live.intent.extra.ROOM_ID");
        } else if (!TextUtils.isEmpty(arguments.getString("live.intent.extra.ROOM_ID", ""))) {
            try {
                this.f14748a = Long.parseLong(arguments.getString("live.intent.extra.ROOM_ID"));
            } catch (Exception unused) {
            }
        }
        this.f14738Q = arguments.getLong("live.intent.extra.USER_ID", 0);
        this.f14786h = arguments.getInt("live.intent.extra.SCREEN_ORIENTATION", 1);
        if (this.f14748a > 0 || this.f14738Q > 0 || bundle2 == null) {
            bundle2 = arguments;
        } else {
            if (bundle2.containsKey("live.intent.extra.ROOM_ID")) {
                C9074l.m27083a(this.f14787i, bundle2);
                C9074l.m27085b(this.f14787i, bundle2);
                this.f14748a = bundle2.getLong("live.intent.extra.ROOM_ID", 0);
            }
            if (bundle2.containsKey("live.intent.extra.USER_ID")) {
                this.f14738Q = bundle2.getLong("live.intent.extra.USER_ID", 0);
            }
            if (bundle2.containsKey("live.SCREEN_ORIENTATION")) {
                this.f14786h = bundle2.getInt("live.SCREEN_ORIENTATION");
            }
            setArguments(bundle);
        }
        this.f14739R = bundle2.getStringArrayList("live.intent.extra.BG_URLS");
        this.f14780b = bundle2.getString("live.intent.extra.PULL_STREAM_URL");
        this.f14740S = bundle2.getString("live.intent.extra.PULL_SDK_PARAMS");
        this.f14741T = bundle2.getString("live.intent.extra.PULL_STREAM_DATA");
        this.f14742U = bundle2.getString("live.intent.extra.PULL_DEFAULT_RESOLUTION");
        this.f14781c = LiveMode.valueOf(bundle2.getInt("live.intent.extra.STREAM_TYPE", 0));
        this.f14743V = new C9384a(bundle2.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", false), bundle2.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", false), bundle2.getInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", 0));
        boolean z2 = bundle2.getBoolean("live.intent.extra.IS_THIRD_PARTY", false);
        if (bundle2.getBoolean("from_notification", false) && this.f14738Q != 0) {
            this.f14748a = 0;
        }
        if (!(this.f14748a == 0 && this.f14738Q == 0)) {
            this.f14789k = LiveRoomState.INITIALIZED;
        }
        this.f14735M = false;
        this.f14750aB = !TextUtils.isEmpty(this.f14780b);
        this.f14733K = !TextUtils.isEmpty(this.f14741T);
        this.f14723A = bundle2.getString("live.intent.extra.REQUEST_ID", null);
        this.f14724B = bundle2.getString("live.intent.extra.LOG_PB", null);
        this.f14775av = bundle2.getLong("live.intent.extra.USER_FROM", 0);
        this.f14776aw = bundle2.getString("live.intent.extra.SOURCE_EXTRA");
        String string = bundle2.getString("scene_id");
        String string2 = bundle2.getString("enter_from_merge");
        String string3 = bundle2.getString("enter_method");
        bundle2.getString("top_message_type", "");
        String string4 = bundle2.getString("live.intent.extra.ROOM_LABELS", null);
        String string5 = bundle2.getString("live.intent.extra.ENTER_LIVE_SOURCE", "");
        Bundle bundle3 = bundle2.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        String string6 = bundle2.getString("live.intent.extra.PRIVATE_INFO");
        String string7 = bundle2.getString("enter_from_merge_recommend");
        if (bundle3 != null) {
            this.f14744W = bundle3.getBoolean("live.intent.extra.OPEN_GIFT_PANEL");
            bundle3.remove("live.intent.extra.OPEN_GIFT_PANEL");
            this.f14746Y = bundle3.getBoolean("live.intent.extra.OPEN_PROP_PANEL");
            bundle3.remove("live.intent.extra.OPEN_PROP_PANEL");
            this.f14745X = bundle3.getString("pop_type");
            bundle3.remove("pop_type");
            this.f14747Z = bundle3.getBoolean("live.intent.extra.OPEN_PICK_PROFILE_PANEL");
            this.f14754aa = bundle3.getBoolean("live.intent.extra.OPEN_PICK_TOP");
            bundle3.remove("live.intent.extra.OPEN_PICK_PROFILE_PANEL");
            bundle3.remove("live.intent.extra.OPEN_PICK_TOP");
            if (this.f14723A == null && bundle3.containsKey("live.intent.extra.REQUEST_ID")) {
                this.f14723A = bundle3.getString("live.intent.extra.REQUEST_ID", "");
            }
            if (this.f14724B == null && bundle3.containsKey("live.intent.extra.LOG_PB")) {
                this.f14724B = bundle3.getString("live.intent.extra.LOG_PB", "");
            }
            if (this.f14775av == 0 && bundle3.containsKey("live.intent.extra.USER_FROM")) {
                this.f14775av = bundle3.getLong("live.intent.extra.USER_FROM", 0);
            }
            if (string7 == null && bundle3.containsKey("enter_from_merge_recommend")) {
                string7 = bundle3.getString("enter_from_merge_recommend", "");
            }
        }
        m16483a(this.f14724B, this.f14723A, bundle3);
        Bundle bundle4 = bundle2.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
        C4329h hVar = new C4329h(getContext(), this.f14723A, this.f14724B, this.f14775av, string4, string5, bundle3, bundle4, string6, string2, string3);
        this.f14790l = hVar;
        C4329h hVar2 = this.f14790l;
        long j2 = this.f14748a;
        if (this.f14781c == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        hVar2.mo12021a(j2, z, z2, this.f14738Q, null);
        this.f14790l.f12616m = this.f14776aw;
        this.f14790l.f12619p = string;
        this.f14790l.f12621r = string7;
        this.f14730H = new C8773k();
        this.f14731I = new C4300c();
        this.f14732J = new C4331i();
        this.f14759af = new C5367t();
        f14722P.booleanValue();
        C8946b.f24404ac.mo22118a("");
        this.f14728F.put("time", String.valueOf(System.currentTimeMillis() - this.f14729G));
        this.f14728F.put("location", "finish live play oncreate");
        TTLiveSDKContext.getHostService().mo22363d().mo23269a("feed_enter_room", this.f14728F);
        C5357o.m17076a(getArguments(), this.f14787i);
        m16472J();
    }

    /* renamed from: a */
    private <T> void m16481a(Class<T> cls) {
        this.f14752aD.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C9409a) {
                    LivePlayFragment.this.onEvent((C9409a) t);
                } else if (t instanceof C4452v) {
                    LivePlayFragment.this.onEvent((C4452v) t);
                } else if (t instanceof C4453w) {
                    LivePlayFragment.this.onEvent((C4453w) t);
                } else if (t instanceof C4445o) {
                    LivePlayFragment.this.onEvent((C4445o) t);
                } else if (t instanceof C4455y) {
                    LivePlayFragment.this.onEvent((C4455y) t);
                } else {
                    if (t instanceof C4409aa) {
                        LivePlayFragment.this.onEvent((C4409aa) t);
                    }
                }
            }
        }));
    }

    /* renamed from: a */
    private void m16474a(int i, int i2) {
        if (this.f14779az != null) {
            View findViewById = this.f14779az.findViewById(R.id.ea8);
            if (findViewById != null && findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14779az = view;
        this.f14798w = (TextureView) view.findViewById(R.id.ebx);
        if (this.f14798w instanceof C9519c) {
            ((C9519c) this.f14798w).setScaleType(2);
        }
        this.f14763aj = (HSImageView) view.findViewById(R.id.bnk);
        this.f14764ak = (HSImageView) view.findViewById(R.id.bnl);
        this.f14765al = (ViewGroup) view.findViewById(R.id.bp9);
        this.f14766am = (CircularProgressView) view.findViewById(R.id.bp6);
        this.f14767an = (LoadingAnimView) view.findViewById(R.id.bp_);
        this.f14767an.setColor(-1);
        this.f14768ao = (TextView) view.findViewById(R.id.bp7);
        this.f14771ar = (ViewStub) view.findViewById(R.id.u0);
        this.f14769ap = (HSImageView) view.findViewById(R.id.cmu);
        this.f14770aq = view.findViewById(R.id.cmv);
        m16479a(this.f14781c, this.f14739R);
        if (this.f14777ax) {
            m16494d("init");
        } else {
            m16496e("init");
        }
        this.f14798w.setVisibility(8);
        if (m16463A()) {
            this.f14766am.setVisibility(8);
            this.f14768ao.setVisibility(8);
        } else {
            this.f14767an.setVisibility(8);
        }
        int intValue = ((Integer) this.f14787i.get("interaction_layer_margin_top", Integer.valueOf(0))).intValue();
        if (intValue > 0) {
            this.f14758ae.mo12011a(view.findViewById(R.id.b2j));
            this.f14758ae.mo12010a(intValue);
        }
    }

    /* renamed from: a */
    private void m16479a(LiveMode liveMode, List<String> list) {
        if (liveMode == LiveMode.AUDIO) {
            this.f14763aj.setBackgroundResource(R.drawable.bsa);
        } else if (C6311g.m19574b(this.f14739R)) {
            C5343e.m17039a(this.f14763aj, new ImageModel(null, list), (C13842b) new C9092w(5, ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext())), null));
        } else {
            float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
            StringBuilder sb = new StringBuilder("res://");
            sb.append(getContext().getPackageName());
            sb.append("/2131234707");
            C5343e.m17041a(this.f14763aj, sb.toString(), (C13842b) new C9092w(5, a, null));
        }
        if (this.f14777ax) {
            if (liveMode == LiveMode.AUDIO) {
                this.f14764ak.setBackgroundResource(R.drawable.bsa);
            } else if (C6311g.m19574b(this.f14739R)) {
                C5343e.m17039a(this.f14764ak, new ImageModel(null, list), (C13842b) new C9092w(5, ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext())), null));
            } else {
                float a2 = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
                StringBuilder sb2 = new StringBuilder("res://");
                sb2.append(getContext().getPackageName());
                sb2.append("/2131234707");
                C5343e.m17041a(this.f14764ak, sb2.toString(), (C13842b) new C9092w(5, a2, null));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.aqk, viewGroup, false);
    }
}
