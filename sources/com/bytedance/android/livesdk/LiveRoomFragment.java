package com.bytedance.android.livesdk;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.feed.C2346b;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.PingType;
import com.bytedance.android.livesdk.chatroom.event.C4436f;
import com.bytedance.android.livesdk.chatroom.p210c.C4300c;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.chatroom.utils.C5362q;
import com.bytedance.android.livesdk.chatroom.utils.C5363r;
import com.bytedance.android.livesdk.chatroom.utils.C5363r.C5364a;
import com.bytedance.android.livesdk.chatroom.widget.C5787aj;
import com.bytedance.android.livesdk.chatroom.widget.C5787aj.C5791a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.list.C8382c;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.live.LiveDetailPagerAdapter;
import com.bytedance.android.livesdk.live.api.DislikeApi;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.C8398b;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.bytedance.android.livesdk.live.p402a.C8384a;
import com.bytedance.android.livesdk.live.p403b.C8385a;
import com.bytedance.android.livesdk.log.C8428b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver;
import com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver.C8704a;
import com.bytedance.android.livesdk.overscroll.C8747a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.player.C8773k;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.utils.C9030aa;
import com.bytedance.android.livesdk.utils.C9030aa.C9031a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.viewmodel.C9142e;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C9213e;
import com.bytedance.android.livesdkapi.C9291c;
import com.bytedance.android.livesdkapi.depend.live.C9326b;
import com.bytedance.android.livesdkapi.depend.live.C9328d;
import com.bytedance.android.livesdkapi.depend.live.C9330e;
import com.bytedance.android.livesdkapi.depend.live.C9330e.C9331a;
import com.bytedance.android.livesdkapi.depend.live.C9333g;
import com.bytedance.android.livesdkapi.depend.live.C9335i;
import com.bytedance.android.livesdkapi.depend.live.C9336j;
import com.bytedance.android.livesdkapi.depend.live.C9339m;
import com.bytedance.android.livesdkapi.depend.live.EntryType;
import com.bytedance.android.livesdkapi.depend.live.LiveRoomState;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.android.livesdkapi.p452h.C9421i;
import com.bytedance.android.livesdkapi.p452h.C9422j;
import com.bytedance.android.livesdkapi.p452h.C9423k;
import com.bytedance.android.livesdkapi.view.C9518b;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.p534b.C10296b;
import com.bytedance.ies.util.thread.C11081a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

public class LiveRoomFragment extends BaseFragment implements C9031a, C9328d, C9331a, C9518b {

    /* renamed from: F */
    private static boolean f11449F = true;

    /* renamed from: a */
    public static boolean f11450a = true;

    /* renamed from: A */
    private Runnable f11451A = null;

    /* renamed from: B */
    private boolean f11452B = false;

    /* renamed from: C */
    private C3844a f11453C;

    /* renamed from: D */
    private boolean f11454D = false;

    /* renamed from: E */
    private boolean f11455E = false;

    /* renamed from: G */
    private boolean f11456G = false;

    /* renamed from: H */
    private boolean f11457H = false;

    /* renamed from: I */
    private boolean f11458I = false;

    /* renamed from: J */
    private LiveNetworkBroadcastReceiver f11459J = new LiveNetworkBroadcastReceiver();

    /* renamed from: K */
    private C8704a f11460K = new C8704a() {
    };

    /* renamed from: L */
    private int f11461L = -1;

    /* renamed from: M */
    private C8773k f11462M;

    /* renamed from: N */
    private long f11463N = 0;

    /* renamed from: O */
    private long f11464O = 0;

    /* renamed from: P */
    private final Runnable f11465P = new Runnable() {
        public final void run() {
            List list;
            ArrayList arrayList = new ArrayList(100);
            if (LiveRoomFragment.this.f11472e != null) {
                list = LiveRoomFragment.this.f11472e.mo14634d();
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(list);
                if (!C6311g.m19573a(arrayList2)) {
                    try {
                        int currentItem = LiveRoomFragment.this.f11469b.getCurrentItem();
                        if (currentItem >= 0) {
                            if (currentItem < arrayList2.size()) {
                                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                    } catch (Throwable unused) {
                    }
                }
            }
            LiveRoomFragment.this.f11475h.mo21555a((List<Room>) arrayList);
        }
    };

    /* renamed from: Q */
    private final Handler f11466Q = new Handler(Looper.getMainLooper());

    /* renamed from: R */
    private boolean f11467R = false;

    /* renamed from: S */
    private C9326b f11468S = new C6130i(this);

    /* renamed from: b */
    LiveVerticalViewPager f11469b;

    /* renamed from: c */
    FrameLayout f11470c;

    /* renamed from: d */
    public C5787aj f11471d;

    /* renamed from: e */
    public C9419g f11472e;

    /* renamed from: f */
    public LiveDetailPagerAdapter f11473f;

    /* renamed from: g */
    public boolean f11474g;

    /* renamed from: h */
    public RoomStatsViewModel f11475h;

    /* renamed from: i */
    public C3845b f11476i;

    /* renamed from: j */
    public C8747a f11477j;

    /* renamed from: k */
    C3491h f11478k;

    /* renamed from: l */
    C9418f f11479l;

    /* renamed from: m */
    C9335i f11480m;

    /* renamed from: q */
    C9336j f11481q;

    /* renamed from: r */
    public String f11482r;

    /* renamed from: s */
    public boolean f11483s = true;

    /* renamed from: t */
    C5364a f11484t = new C5364a() {
    };

    /* renamed from: u */
    private C9030aa f11485u;

    /* renamed from: v */
    private TelephonyManager f11486v;

    /* renamed from: w */
    private List<String> f11487w = Arrays.asList(new String[]{"homepage_hot", "live_merge", "homepage_follow"});

    /* renamed from: x */
    private PopupWindow f11488x;

    /* renamed from: y */
    private boolean f11489y;

    /* renamed from: z */
    private long f11490z = -1;

    /* renamed from: com.bytedance.android.livesdk.LiveRoomFragment$a */
    class C3844a {

        /* renamed from: a */
        public final String f11527a;

        /* renamed from: c */
        private C7321c f11529c;

        /* renamed from: a */
        public final void mo11391a() {
            if (this.f11529c != null) {
                this.f11529c.dispose();
                this.f11529c = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo11394a(Throwable th) throws Exception {
            C9076n.m27095a(LiveRoomFragment.this.getContext(), th);
        }

        /* renamed from: a */
        public final void mo11393a(Room room) {
            mo11391a();
            long id = room.getId();
            this.f11529c = ((DislikeApi) C9178j.m27302j().mo22373b().mo10440a(DislikeApi.class)).dislikeRoom(id, room.getOwner().getId(), room.getRequestId(), this.f11527a, this.f11527a, room.getLog_pb()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6145x<Object>(this, id), (C7326g<? super Throwable>) new C6146y<Object>(this));
            LiveRoomFragment.this.mo10241a(this.f11529c);
        }

        private C3844a(String str) {
            this.f11527a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo11392a(long j, C3479d dVar) throws Exception {
            LiveRoomFragment.this.f11472e.mo14627a(j);
            C3517a.m12960a(LiveRoomFragment.this.getContext(), (int) R.string.eic);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.LiveRoomFragment$b */
    class C3845b implements C0935e {

        /* renamed from: a */
        public C9330e f11530a;

        /* renamed from: c */
        private int f11532c = -1;

        /* renamed from: d */
        private int f11533d;

        /* renamed from: e */
        private int f11534e;

        /* renamed from: f */
        private int f11535f;

        /* renamed from: g */
        private int f11536g;

        /* renamed from: h */
        private final String f11537h;

        /* renamed from: a */
        public final void mo11395a(C9330e eVar) {
            m13686a(this.f11536g, eVar);
        }

        public final void onPageScrollStateChanged(int i) {
            this.f11533d = i;
            if (this.f11530a != null) {
                this.f11530a.mo13258a(i);
            }
            if (this.f11536g != LiveRoomFragment.this.f11473f.getCount() - 1) {
                C3222b.m12218a().mo10138a(Tag.ScrollWatchLivePlay.name(), (C0043i) LiveRoomFragment.this, LiveRoomFragment.this.getContext(), i);
            }
        }

        public final void onPageSelected(int i) {
            C9330e b = LiveRoomFragment.this.f11473f.mo21543b(i);
            if (b != this.f11530a) {
                if (LiveRoomFragment.this.getContext() == null) {
                    C8444d.m25673b();
                    C8444d.m11972c("LiveRoomFragment", "onPageSelected getContext==null");
                    return;
                }
                C8427a.m25623a().mo21577a(LiveRoomFragment.this.f11469b, i);
                this.f11536g = i;
                this.f11532c = i;
                if (this.f11530a != null) {
                    this.f11530a.mo13293q();
                }
                if (this.f11533d == 0) {
                    m13686a(i, b);
                    LiveRoomFragment.this.mo11361b(i);
                }
            }
        }

        C3845b(String str) {
            this.f11537h = str;
        }

        /* renamed from: a */
        private void m13686a(int i, C9330e eVar) {
            TimeCostUtil.m12208b(Tag.ScrollWatchLivePlay);
            C3222b.m12218a().mo10146b(Tag.ScrollWatchLivePlay.name(), (C0043i) LiveRoomFragment.this, LiveRoomFragment.this.getContext());
            C3222b.m12218a().mo10137a(Tag.ScrollWatchLivePlay.name(), (C0043i) LiveRoomFragment.this, LiveRoomFragment.this.getContext());
            LiveRoomFragment.this.mo11375o();
            ((C3495l) C3596c.m13172a(C3495l.class)).recordEnterStart(EntryType.SLIDE);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f11530a != null) {
                this.f11530a.mo13278g().getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STOP_KEY_TYPE", C4300c.m14481a((Object) eVar));
                this.f11530a.mo13275d();
                this.f11530a.mo13278g().getArguments().remove("live.intent.extra.ENTER_TYPE");
                this.f11530a.mo13278g().getArguments().remove("live.intent.extra.PAGE_DELAY_TYPE");
                if (LiveRoomFragment.f11450a) {
                    LiveRoomFragment.f11450a = false;
                    C10296b a = C10296b.m30493a(LiveRoomFragment.this.getContext());
                    String q = LiveRoomFragment.this.mo11377q();
                    if (a.mo25024a(q, true)) {
                        a.mo25021a(q, (Object) Boolean.valueOf(false)).mo25023a();
                    }
                }
            }
            if (eVar != null) {
                if (this.f11530a != null) {
                    eVar.mo13278g().getArguments().putString("live.intent.extra.ENTER_TYPE", "draw");
                    eVar.mo13278g().getArguments().putString("live.intent.extra.PAGE_DELAY_TYPE", "slide");
                    eVar.mo13278g().getArguments().putString("enter_live_from_page", this.f11530a.mo13278g().getArguments().getString("enter_live_from_page"));
                    eVar.mo13278g().getArguments().putInt("current_room_position", i);
                    eVar.mo13278g().getArguments().putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", LiveRoomFragment.this.f11482r);
                    eVar.mo13278g().getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", currentTimeMillis);
                    eVar.mo13278g().getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "slide");
                    List d = LiveRoomFragment.this.f11472e.mo14634d();
                    if (!C3409v.m12670a(d) && i >= 0 && i < d.size() && ((Room) d.get(i)).isFromRecommendCard) {
                        eVar.mo13278g().getArguments().putString("enter_from_merge_recommend", "pop_card");
                    }
                }
                eVar.mo13270b();
                if (this.f11530a != null) {
                    C8416g a2 = C8443c.m25663a().mo21605a(C8438j.class);
                    if (a2 != null) {
                        a2.mo21570a("action_type", "draw");
                    }
                    if (LiveRoomFragment.this.f11472e instanceof MultiRoomIdListProvider) {
                        long j = LiveRoomFragment.this.f11472e.mo14625a(i).getLong("anchor_id");
                        if (j > 0) {
                            eVar.mo13278g().getArguments().putLong("anchor_id", j);
                        }
                    }
                    LiveRoomFragment.this.mo11355a(this.f11537h, "draw", eVar, eVar.mo13278g().getArguments());
                    LiveRoomFragment.this.mo11353a(this.f11537h, 0, "draw", eVar.mo13278g().getArguments(), null);
                    Bundle arguments = eVar.mo13278g().getArguments();
                    if (LiveRoomFragment.this.mo11376p() && arguments != null) {
                        ((C8385a) LiveRoomFragment.this.f11472e).mo21550b(arguments.getLong("live.intent.extra.ROOM_ID", 0));
                    }
                }
            }
            this.f11530a = eVar;
            this.f11532c = -1;
            LiveRoomFragment.this.mo11368g();
            LiveRoomFragment.this.mo11369h();
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (!(LiveRoomFragment.this.f11477j == null || LiveRoomFragment.this.f11477j.mo21751a() == null)) {
                LiveRoomFragment.this.f11477j.mo21751a().onPageScrolled(i, f, i2);
            }
            if (i == this.f11532c && f < 1.0E-10f) {
                C9330e b = LiveRoomFragment.this.f11473f.mo21543b(i);
                if (b != this.f11530a) {
                    m13686a(i, b);
                    LiveRoomFragment.this.mo11361b(i);
                }
                if (this.f11535f >= 0 && i != this.f11535f) {
                    if (i < this.f11535f) {
                        this.f11534e = 0;
                    } else {
                        this.f11534e++;
                    }
                    this.f11535f = i;
                    if (this.f11534e > 15) {
                        this.f11535f = -1;
                        LiveRoomFragment.this.mo11373m();
                    }
                }
            }
        }
    }

    /* renamed from: C */
    private static String m13609C() {
        return "";
    }

    /* renamed from: b */
    public final Fragment mo11360b() {
        return this;
    }

    /* renamed from: d */
    public final C9335i mo11365d() {
        return this.f11480m;
    }

    /* renamed from: e */
    public final C9336j mo11366e() {
        return this.f11481q;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m13630a(Map map, Room room) throws Exception {
        String valueOf = String.valueOf(room.getId());
        return map.containsKey(valueOf) && !((C8398b) map.get(valueOf)).f23021b;
    }

    /* renamed from: a */
    public final boolean mo11358a() {
        C9330e c = mo11364c();
        return c != null && c.mo9067a();
    }

    /* renamed from: a */
    public final void mo11352a(String str) {
        C9330e c = mo11364c();
        if (c != null) {
            LiveRoomState e = c.mo13276e();
            if (e == LiveRoomState.LIVE_STARTED || e == LiveRoomState.DETACHED) {
                c.mo13261a(c.mo13278g().getArguments());
                Bundle arguments = getArguments();
                if (arguments != null) {
                    m13627a(arguments.getString("live.intent.extra.ENTER_LIVE_SOURCE"), arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA"));
                    C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
                    if (a != null) {
                        a.mo21570a("action_type", str);
                    }
                    if (e == LiveRoomState.LIVE_STARTED) {
                        return;
                    }
                }
            }
            if (this.f11454D) {
                this.f11454D = false;
                m13637w();
            } else if (TextUtils.equals(str, "click")) {
                c.mo13270b();
            } else {
                if (this.f11476i != null) {
                    this.f11476i.mo11395a(c);
                }
            }
        }
    }

    /* renamed from: a */
    private void m13629a(long... jArr) {
        ArrayList arrayList = new ArrayList();
        for (long a : jArr) {
            Room a2 = C9423k.m27944b().mo23119a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (!C6311g.m19573a(arrayList)) {
            this.f11472e.mo21539a((List<Room>) arrayList);
            this.f11479l.mo23117a(this.f11472e);
        }
    }

    /* renamed from: a */
    private void m13627a(String str, Bundle bundle) {
        if (bundle != null) {
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            if (a != null) {
                a.mo21569a("source");
                a.mo21569a("enter_from");
                a.mo21569a("enter_from_merge");
                a.mo21569a("video_id");
                a.mo21569a("superior_page_from");
                a.mo21569a("push_type");
                a.mo21569a("instation_push_type");
                a.mo21569a("from_room_id");
                a.mo21569a("enter_method");
                a.mo21569a("top_message_type");
                a.mo21569a("card_id");
                a.mo21569a("card_position");
                if (bundle.containsKey("enter_method")) {
                    a.mo21570a("enter_method", bundle.getString("enter_method", ""));
                }
                if (bundle.containsKey("enter_from_merge")) {
                    a.mo21570a("enter_from_merge", bundle.getString("enter_from_merge", ""));
                }
                if (bundle.containsKey("source")) {
                    String string = bundle.getString("source", "");
                    bundle.remove("source");
                    a.mo21570a("source", String.valueOf(string));
                }
                a.mo21570a("enter_from", str);
                if (bundle.containsKey("enter_from")) {
                    a.mo21570a("enter_from", bundle.getString("enter_from", ""));
                }
                if (bundle.containsKey("from_room_id")) {
                    long j = bundle.getLong("from_room_id", 0);
                    bundle.remove("from_room_id");
                    a.mo21570a("from_room_id", String.valueOf(j));
                }
                if (bundle.containsKey("video_id")) {
                    long j2 = bundle.getLong("video_id", 0);
                    String valueOf = String.valueOf(j2);
                    if (j2 == 0) {
                        valueOf = bundle.getString("video_id");
                    }
                    bundle.remove("video_id");
                    a.mo21570a("video_id", valueOf);
                }
                if (bundle.containsKey("superior_page_from")) {
                    String string2 = bundle.getString("superior_page_from", "");
                    bundle.remove("superior_page_from");
                    a.mo21570a("superior_page_from", string2);
                }
                if (bundle.containsKey("push_type")) {
                    String string3 = bundle.getString("push_type", "");
                    bundle.remove("push_type");
                    a.mo21570a("push_type", string3);
                }
                if (bundle.containsKey("instation_push_type")) {
                    int i = bundle.getInt("instation_push_type", 0);
                    bundle.remove("instation_push_type");
                    a.mo21570a("instation_push_type", String.valueOf(i));
                }
                if (bundle.containsKey("top_message_type")) {
                    String string4 = bundle.getString("top_message_type", "");
                    bundle.remove("top_message_type");
                    a.mo21570a("top_message_type", string4);
                }
                if (bundle.containsKey("gd_label")) {
                    a.mo21570a("gd_label", bundle.getString("gd_label", ""));
                }
                if (bundle.containsKey("card_id")) {
                    a.mo21570a("card_id", bundle.getString("card_id"));
                }
                if (bundle.containsKey("card_position")) {
                    a.mo21570a("card_position", bundle.getString("card_position"));
                }
            }
        }
        if (getArguments() != null && getArguments().containsKey("sort_type")) {
            C8428b.m25637a().mo21580a(getArguments().getLong("live.intent.extra.ROOM_ID"), "sort_type", getArguments().getString("sort_type"));
            getArguments().remove("sort_type");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11354a(String str, Bundle bundle, String str2, long j) {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        String str3 = str2;
        C9330e c = mo11364c();
        if (c != null) {
            this.f11451A = null;
            if (this.f11476i == null) {
                C8444d.m25673b();
                C8444d.m11972c("LiveRoomFragment", "mPageChangeListener is null !");
                return;
            }
            this.f11476i.f11530a = c;
            String string = getArguments().getString("live.intent.extra.ENTER_TYPE", C5357o.m17081a(getArguments()) ? "draw" : "click");
            c.mo13278g().getArguments().putString("live.intent.extra.ENTER_TYPE", string);
            String str4 = str;
            c.mo13278g().getArguments().putString("live.intent.extra.PAGE_DELAY_TYPE", str);
            c.mo13278g().getArguments().putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", this.f11482r);
            String string2 = getArguments().getString("enter_from_merge_recommend", "");
            if (TextUtils.isEmpty(string2) && getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA") != null) {
                string2 = getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA").getString("enter_from_merge_recommend", "");
            }
            long j2 = getArguments().getLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", 0);
            String string3 = getArguments().getString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "");
            c.mo13278g().getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", j2);
            c.mo13278g().getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", string3);
            c.mo13278g().getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_INNER_TIME", this.f11464O);
            c.mo13278g().getArguments().putString("enter_from_merge_recommend", string2);
            c.mo13270b();
            String str5 = "";
            if (bundle3 != null) {
                str5 = bundle3.getString("live.intent.extra.WINDOW_MODE");
            }
            if (!TextUtils.equals(string, "draw")) {
                boolean equals = TextUtils.equals(str5, "small_picture");
            } else {
                mo11355a(str3, string, c, c.mo13278g().getArguments());
            }
            if (c.mo13276e() == null || c.mo13276e() == LiveRoomState.IDLE) {
                C6147z.m19084a(Toast.makeText(getContext(), R.string.er8, 0));
                m13626a("", 0, "init_state_invalid");
                this.f11480m.mo11383a();
            }
            if (bundle3 != null) {
                Bundle bundle4 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1");
                if (bundle4 != null) {
                    str3 = bundle4.getString("live.intent.extra.ENTER_LIVE_SOURCE_V1", str3);
                    bundle4.remove("live.intent.extra.ENTER_LIVE_SOURCE_V1");
                }
                bundle2 = bundle4;
            } else {
                bundle2 = null;
            }
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            if (a != null) {
                a.mo21570a("action_type", string);
            }
            mo11353a(str3, j, string, c.mo13278g().getArguments(), bundle2);
            mo11369h();
        }
        if (!this.f11474g) {
            mo11368g();
        }
    }

    /* renamed from: a */
    public final void mo11349a(long j, String str, Bundle bundle, boolean z) {
        long j2;
        bundle.putLong("live.intent.extra.ENTER_LIVE_TIME", this.f11463N);
        bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        bundle.putBoolean("live.intent.extra.IS_BACK_PRE_ROOM_NOW", z);
        Bundle a = C9339m.m27771a(getContext(), j, str, bundle);
        Bundle bundle2 = a.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
        if (!(bundle2 == null || getArguments() == null)) {
            bundle2.putBoolean("live.intent.extra.IS_MULTI", getArguments().getBoolean("live.intent.extra.IS_MULTI", false));
            bundle2.putInt("live.intent.extra.POSITION", this.f11469b.getCurrentItem());
        }
        if (bundle != null) {
            bundle.getBoolean("live.intent.extra.EXTRA_FLAG_FROM_NEW_AB_OF_BACK_PRE_ROOM");
        }
        a.putLongArray("live.intent.extra.ENTER_ROOM_IDS", bundle.getLongArray("live.intent.extra.ENTER_ROOM_IDS"));
        a.putString("back_live_source", bundle.getString("back_live_source", ""));
        a.putInt("orientation", bundle.getInt("orientation", 0));
        C9330e c = mo11364c();
        if (c != null) {
            j2 = c.mo13278g().getArguments().getLong("live.intent.extra.ROOM_ID", 0);
            if (j2 != 0) {
                a.putLong("live.intent.extra.FROM_ROOM_ID", j2);
            }
            Object obj = c.mo13278g().getArguments().get("live.intent.extra.USER_ID");
            if (obj != null && a.get("live.intent.extra.USER_ID") == null) {
                a.putString("live.intent.extra.USER_ID", String.valueOf(obj));
            }
            a.putString("enter_live_from_page", c.mo13278g().getArguments().getString("enter_live_from_page"));
        } else {
            j2 = 0;
        }
        this.f11456G = true;
        a.putInt("live.intent.extra.SCREEN_ORIENTATION", 1);
        C5357o.m17075a(a, getArguments());
        long j3 = bundle.getLong("live.intent.extra.FROM_PORTAL_ID");
        if (j3 > 0) {
            a.putLong("live.intent.extra.FROM_PORTAL_ID", j3);
            m13621a(j2, j3);
        }
        TTLiveSDKContext.getHostService().mo22366g().mo23270a(getContext(), j, a);
        if (this.f11455E && getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: a */
    public final void mo11348a(long j) {
        this.f11490z = j;
        m13619a(126, "leave for profile");
        this.f11480m.mo11383a();
    }

    /* renamed from: a */
    public final boolean mo11359a(Room room) {
        if (this.f11453C == null) {
            return false;
        }
        m13625a(room, this.f11453C.f11527a);
        return true;
    }

    /* renamed from: a */
    public final void mo11357a(boolean z) {
        this.f11467R = z;
        m13608B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11351a(Room room, View view) {
        this.f11453C.mo11393a(room);
        C6147z.m19083a(this.f11488x);
        C8443c.m25663a().mo21607a("live_dislike", new C8438j().mo21603f("core").mo21599b("live_interact").mo21598a("live_detail").mo21600c("live"), new C8439k(), Room.class);
    }

    /* renamed from: a */
    public final void mo11353a(String str, long j, String str2, Bundle bundle, Bundle bundle2) {
        long j2;
        final String str3;
        Bundle bundle3 = bundle;
        String string = bundle3.getString("live.intent.extra.REQUEST_ID");
        if (TextUtils.isEmpty(string)) {
            Bundle bundle4 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            string = bundle4 != null ? bundle4.getString("request_id") : "";
        }
        final String str4 = string;
        Bundle bundle5 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        final String string2 = bundle5 != null ? bundle5.getString("request_page") : "";
        final String string3 = bundle5 != null ? bundle5.getString("anchor_type") : "";
        final String string4 = bundle3.getString("live.intent.extra.LOG_PB");
        final long j3 = bundle3.getLong("live.intent.extra.USER_FROM");
        final long j4 = bundle3.getLong("live.intent.extra.ROOM_ID", 0);
        bundle3.getLong("live.intent.extra.USER_ID", 0);
        long j5 = bundle3.getLong("anchor_id", 0);
        final String string5 = bundle3.getString("live.intent.extra.SOURCE_EXTRA");
        final String string6 = bundle3.getString("scene_id");
        final String C = m13609C();
        final String string7 = bundle3.getString("card_id");
        final String string8 = bundle3.getString("card_position");
        Bundle bundle6 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle6 != null) {
            Bundle bundle7 = bundle6.getBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1");
            String str5 = (bundle7 == null || !bundle7.containsKey("subtab")) ? str : (String) bundle7.get("subtab");
            if (j5 == 0) {
                j5 = bundle6.getLong("anchor_id", 0);
            }
            j2 = j5;
            str3 = str5;
        } else {
            str3 = str;
            j2 = j5;
        }
        C383411 r24 = r0;
        final long j6 = j;
        C11081a a = C11081a.m32463a();
        final String str6 = str2;
        final Bundle bundle8 = bundle6;
        final Bundle bundle9 = bundle2;
        final long j7 = j2;
        final Bundle bundle10 = bundle;
        C383411 r0 = new Callable(this) {

            /* renamed from: s */
            final /* synthetic */ LiveRoomFragment f11511s;

            public final Object call() throws Exception {
                String str;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("request_id", str4);
                    jSONObject.put("log_pb", string4);
                    jSONObject.put("source", j3);
                    jSONObject.put("from_room_id", j6);
                    jSONObject.put("enter_type", str6);
                    if (!C.equals(str3)) {
                        jSONObject.put("is_fix", str3);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        jSONObject.put("moment_room_source", string5);
                    }
                    if (bundle9 != null) {
                        for (String str2 : bundle9.keySet()) {
                            jSONObject.put(str2, String.valueOf(bundle9.get(str2)));
                        }
                    }
                } catch (Exception unused) {
                }
                if (C8443c.m25663a().mo21605a(C8438j.class).mo21568a().containsKey("video_id")) {
                    jSONObject.put("video_id", C8443c.m25663a().mo21605a(C8438j.class).mo21568a().get("video_id"));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(j4));
                hashMap.put("anchor_id", String.valueOf(j7));
                hashMap.put("request_id", str4);
                hashMap.put("log_pb", string4);
                if (!TextUtils.isEmpty(string5)) {
                    hashMap.put("moment_room_source", string5);
                }
                hashMap.put("is_preview", this.f11511s.getArguments().getString("is_preview", "0"));
                hashMap.put("is_sale", "unknown");
                hashMap.put("orientation", String.valueOf(this.f11511s.getArguments().getInt("orientation")));
                if (bundle10 != null && bundle10.containsKey("live.intent.extra.WINDOW_MODE")) {
                    hashMap.put("live_window_mode", bundle10.getString("live.intent.extra.WINDOW_MODE", ""));
                }
                if (this.f11511s.f11483s) {
                    if (bundle8 != null) {
                        TextUtils.isEmpty(bundle8.getString("log_pb"));
                        if (!TextUtils.isEmpty(bundle8.getString("request_id"))) {
                            hashMap.put("request_id", bundle8.getString("request_id"));
                        }
                        if (!TextUtils.isEmpty(bundle8.getString("log_pb"))) {
                            hashMap.put("log_pb", bundle8.getString("log_pb"));
                        }
                    }
                    C5357o.m17080a(this.f11511s.f11483s, bundle10);
                    this.f11511s.f11483s = false;
                } else {
                    C8416g a = C8443c.m25663a().mo21605a(Room.class);
                    if (a instanceof C8423n) {
                        C8423n nVar = (C8423n) a;
                        nVar.f23039a = String.valueOf(j4);
                        nVar.f23040b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
                    }
                    C5357o.m17080a(this.f11511s.f11483s, bundle10);
                }
                if (!TextUtils.isEmpty(string6) && "draw".equals(str6)) {
                    hashMap.put("scene_id", string6);
                }
                hashMap.put("growth_deepevent", "1");
                hashMap.put("live_cover_mode", this.f11511s.f11482r);
                hashMap.put("request_page", string2);
                hashMap.put("anchor_type", string3);
                if (bundle10.getBoolean("enter_from_dou_plus", false) || bundle10.getBoolean("enter_from_effect_ad")) {
                    String str3 = "is_other_channel";
                    if (bundle10.getBoolean("enter_from_effect_ad")) {
                        str = "effective_ad";
                    } else {
                        str = "dou_plus";
                    }
                    hashMap.put(str3, str);
                }
                Bundle bundle = bundle10.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
                if (!(bundle == null || bundle.getBundle("log_extra") == null)) {
                    String string = bundle.getBundle("log_extra").getString("enter_from_merge");
                    if (!TextUtils.isEmpty(string)) {
                        hashMap.put("previous_page", string);
                    }
                }
                C8443c.m25663a().mo21606a("rec_live_play", hashMap, new C8438j().mo21599b("live_view").mo21604g(str6));
                return null;
            }

            {
                this.f11511s = r4;
            }
        };
        a.mo27013a((Callable) r24);
    }

    /* renamed from: a */
    public final void mo11355a(String str, String str2, C9330e eVar, Bundle bundle) {
        String str3 = str2;
        Bundle bundle2 = bundle;
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        String string = bundle2.getString("live.intent.extra.REQUEST_ID");
        if (TextUtils.isEmpty(string)) {
            Bundle bundle3 = bundle2.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            string = bundle3 != null ? bundle3.getString("request_id") : "";
        }
        String string2 = bundle2.getString("live.intent.extra.LOG_PB");
        long j = bundle2.getLong("live.intent.extra.ROOM_ID", 0);
        long j2 = bundle2.getLong("anchor_id", 0);
        String str4 = (String) a.mo21568a().get("enter_from");
        String str5 = (String) a.mo21568a().get("source");
        String string3 = bundle2.getString("live.intent.extra.SOURCE_EXTRA");
        boolean z = bundle2.getBoolean("live.intent.extra.IS_THIRD_PARTY", false);
        String string4 = bundle2.getString("scene_id");
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("anchor_id", String.valueOf(j2));
        C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
        if (a2 instanceof C8423n) {
            C8423n nVar = (C8423n) a2;
            nVar.f23039a = String.valueOf(j);
            nVar.f23040b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        }
        String string5 = bundle2.getString("enter_from_merge", "");
        String string6 = bundle2.getString("enter_method", "");
        hashMap.put("request_id", string);
        hashMap.put("log_pb", string2);
        hashMap.put("streaming_type", z ? "thirdparty" : "general");
        hashMap.put("action_type", str3);
        hashMap.put("enter_from_merge", string5);
        hashMap.put("enter_method", string6);
        hashMap.put("live_cover_mode", this.f11482r);
        if (!TextUtils.isEmpty(string3)) {
            hashMap.put("moment_room_source", string3);
        }
        if (!TextUtils.isEmpty(string4) && "draw".equals(str3)) {
            hashMap.put("scene_id", string4);
        }
        if ("draw".equals(str3)) {
            hashMap.put("orientation", "0");
        }
        if (bundle2 != null && bundle2.containsKey("live.intent.extra.WINDOW_MODE")) {
            hashMap.put("live_window_mode", bundle2.getString("live.intent.extra.WINDOW_MODE", ""));
        }
        C8443c.m25663a().mo21606a("live_show", hashMap, new C8438j().mo21598a(str4).mo21599b("live_view").mo21603f("core").mo21600c(str5));
    }

    /* renamed from: a */
    public final void mo11347a(int i) {
        switch (i) {
            case 0:
                this.f11478k.mo21785a(false, getContext());
                return;
            case 1:
                return;
            case 2:
                this.f11478k.mo21785a(true, getContext());
                break;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m13628a(Throwable th) throws Exception {
        C8444d.m25673b();
        C8444d.m11969a(5, th.getStackTrace());
    }

    /* renamed from: v */
    private void m13636v() {
        this.f11466Q.removeCallbacks(this.f11465P);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void mo11380t() {
        TTLiveSDKContext.getHostService().mo22361b();
    }

    /* renamed from: p */
    public final boolean mo11376p() {
        return this.f11472e instanceof C8385a;
    }

    /* renamed from: h */
    public final void mo11369h() {
        m13636v();
        this.f11466Q.postDelayed(this.f11465P, 180000);
    }

    /* renamed from: j */
    public final void mo11371j() {
        this.f11470c.post(new C6141t(this));
    }

    public void onStop() {
        if (this.f11471d != null) {
            this.f11471d.mo14276c();
        }
        super.onStop();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ void mo11379s() {
        if (this.f11451A != null) {
            this.f11451A.run();
        }
    }

    /* renamed from: A */
    private static boolean m13607A() {
        if (C3596c.m13172a(C3495l.class) == null) {
            return false;
        }
        return ((C3495l) C3596c.m13172a(C3495l.class)).isInteracting();
    }

    /* renamed from: B */
    private void m13608B() {
        boolean z;
        if (this.f11469b != null) {
            LiveVerticalViewPager liveVerticalViewPager = this.f11469b;
            if (this.f11489y || this.f11474g || this.f11467R || m13607A()) {
                z = false;
            } else {
                z = true;
            }
            liveVerticalViewPager.setEnabled(z);
        }
    }

    /* renamed from: D */
    private void m13610D() {
        this.f11475h = (RoomStatsViewModel) C0069x.m158a((Fragment) this, (C0067b) new C9142e()).mo147a(RoomStatsViewModel.class);
        this.f11475h.f23006a.observe(this, new C6134m(this));
    }

    /* renamed from: E */
    private boolean m13611E() {
        if (!C10296b.m30493a(C3358ac.m12528e()).mo25024a(m13613G(), true)) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    private String m13615I() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "";
        }
        Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle == null) {
            return "";
        }
        return bundle.getString("enter_from_merge", "");
    }

    /* renamed from: K */
    private void m13617K() {
        if (this.f11480m == null) {
            this.f11480m = new C9335i() {
                /* renamed from: a */
                public final void mo11383a() {
                    FragmentActivity activity = LiveRoomFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            };
        }
        if (this.f11481q == null) {
            this.f11481q = new C9336j() {
                /* renamed from: a */
                public final void mo11384a(View view, View view2) {
                    C3361af.m12533a((Activity) LiveRoomFragment.this.getActivity());
                }

                /* renamed from: a */
                public final void mo11385a(boolean z, View view, View view2, View view3, View view4) {
                    FragmentActivity activity = LiveRoomFragment.this.getActivity();
                    if (activity != null) {
                        Window window = activity.getWindow();
                        if (window != null) {
                            if (!z) {
                                activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
                            } else if (C3387g.m12599a(activity)) {
                                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: u */
    private static int m13635u() {
        int i;
        C2346b bVar = (C2346b) CoreSettingKeys.LIVE_FEED_PRELOAD.mo10240a();
        if (bVar != null) {
            i = bVar.f7708c;
        } else {
            i = 0;
        }
        if (i <= 0) {
            return 2;
        }
        return i;
    }

    /* renamed from: w */
    private void m13637w() {
        if (this.f11451A != null && this.f11469b != null && !this.f11454D) {
            this.f11469b.post(new C6140s(this));
        }
    }

    /* renamed from: c */
    public final C9330e mo11364c() {
        if (this.f11473f == null || this.f11473f.getCount() == 0) {
            return null;
        }
        return this.f11473f.mo21543b(this.f11469b.getCurrentItem());
    }

    /* renamed from: g */
    public final void mo11368g() {
        int currentItem = this.f11469b.getCurrentItem();
        if (currentItem >= 0 && this.f11473f != null && this.f11473f.getCount() - currentItem <= m13635u()) {
            this.f11472e.mo14631b(currentItem);
        }
    }

    /* renamed from: k */
    public final void mo11372k() {
        if (this.f11488x != null && this.f11488x.isShowing()) {
            C6147z.m19083a(this.f11488x);
        }
        mo11374n();
    }

    /* renamed from: n */
    public final void mo11374n() {
        if (this.f11471d != null) {
            this.f11471d.mo14275b();
            this.f11470c.postDelayed(new Runnable() {
                public final void run() {
                    if (LiveRoomFragment.this.mo8989l() && LiveRoomFragment.this.f11471d != null) {
                        LiveRoomFragment.this.f11470c.removeView(LiveRoomFragment.this.f11471d);
                        LiveRoomFragment.this.f11471d.mo14276c();
                        LiveRoomFragment.this.f11471d = null;
                    }
                }
            }, 320);
        }
        C5363r.m17096b();
    }

    /* renamed from: o */
    public final void mo11375o() {
        if (getArguments() != null) {
            getArguments().putString("is_preview", "0");
        }
    }

    public void onResume() {
        super.onResume();
        m13637w();
        this.f11456G = false;
        this.f11478k.mo21789d(false);
        mo11377q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo11378r() {
        this.f11471d.setClickable(false);
        mo11374n();
        C9097a.m27146a().mo22267a((Object) new C4436f(false));
    }

    /* renamed from: F */
    private String m13612F() {
        String I = m13615I();
        if (this.f11487w == null || !this.f11487w.contains(I)) {
            C10296b.m30493a(C3358ac.m12528e()).mo25021a("live.pref.SHOW_SCROLL_TIPS", (Object) Boolean.valueOf(false)).mo25023a();
            return "live.pref.SHOW_SCROLL_TIPS";
        }
        StringBuilder sb = new StringBuilder("live.pref.SHOW_SCROLL_TIPS_");
        sb.append(I);
        return sb.toString();
    }

    /* renamed from: G */
    private String m13613G() {
        if (!mo11376p() || this.f11461L == 0) {
            return "live.pref.SHOW_SCROLL_TIPS";
        }
        StringBuilder sb = new StringBuilder("live.pref.SHOW_SCROLL_TIPS_");
        sb.append(((C8385a) this.f11472e).f22988b);
        return sb.toString();
    }

    /* renamed from: H */
    private String m13614H() {
        String I = m13615I();
        String str = "";
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle == null) {
                str = "";
            } else {
                str = bundle.getString("enter_method", "");
            }
        }
        if (!"homepage_follow".equals(I) || !"live_cover".equals(str)) {
            return "";
        }
        return "live.pref.SHOW_SCROLL_TIPS_follow_story";
    }

    /* renamed from: f */
    public final void mo11367f() {
        C9330e c = mo11364c();
        if (c != null) {
            c.mo13273c();
        }
        try {
            this.f11469b.setAdapter(null);
        } catch (Exception unused) {
        }
        if (this.f11473f != null) {
            this.f11473f.mo21542a();
            this.f11473f = null;
        }
        if (this.f11472e != null) {
            this.f11472e.mo14632c();
            this.f11472e = null;
        }
    }

    /* renamed from: q */
    public final String mo11377q() {
        String H = m13614H();
        if (!C6319n.m19593a(H)) {
            return H;
        }
        String F = m13612F();
        if (m13611E()) {
            C10296b.m30493a(C3358ac.m12528e()).mo25021a(F, (Object) Boolean.valueOf(false)).mo25023a();
        }
        return F;
    }

    /* renamed from: J */
    private void m13616J() {
        if (this.f11461L == 0) {
            C9419g gVar = null;
            if (!(this.f11479l == null || this.f11479l.mo23116a() == null)) {
                gVar = this.f11479l.mo23116a();
            }
            int currentItem = this.f11469b.getCurrentItem();
            if (currentItem > 0 && currentItem < this.f11472e.mo14629b() && gVar != null) {
                int a = gVar.mo14624a(this.f11472e.mo14625a(0));
                if (a >= 0) {
                    gVar.mo14626a(a, ((C8385a) this.f11472e).mo21551c(currentItem));
                }
            }
        }
    }

    /* renamed from: x */
    private void m13638x() {
        if (this.f11471d != null) {
            this.f11470c.removeView(this.f11471d);
        }
        C9097a.m27146a().mo22267a((Object) new C4436f(true));
        this.f11471d = new C5787aj(getContext());
        this.f11471d.mo14274a("ttlive_dy_drawer_hand_guide.json", "entranceguideimages");
        this.f11471d.setDestText(C3358ac.m12515a((int) R.string.fcs));
        this.f11471d.mo14273a();
        this.f11471d.setClickListener(new C6133l(this));
        this.f11470c.addView(this.f11471d);
    }

    /* renamed from: y */
    private void m13639y() {
        if (this.f11471d != null) {
            this.f11470c.removeView(this.f11471d);
        }
        this.f11471d = new C5787aj(getContext());
        this.f11471d.mo14274a("Gesture_SlideUp.json", "images/");
        this.f11471d.setDestText(C3358ac.m12515a((int) R.string.fcv));
        this.f11471d.mo14273a();
        this.f11471d.setClickListener(new C5791a() {
            /* renamed from: a */
            public final void mo11381a() {
                LiveRoomFragment.this.f11471d.setClickable(false);
                LiveRoomFragment.this.mo11374n();
            }
        });
        this.f11470c.addView(this.f11471d);
    }

    /* renamed from: i */
    public final boolean mo11370i() {
        if (C5357o.m17087d(getArguments())) {
            C10296b a = C10296b.m30493a(getContext());
            if (a.mo25019a("live.pref.SHOW_ENTRANCE_GUIDE", 1) == 2) {
                a.mo25021a("live.pref.SHOW_ENTRANCE_GUIDE", (Object) Integer.valueOf(3)).mo25023a();
                m13638x();
                return true;
            }
        }
        if (C5363r.m17095a() || this.f11472e.mo14629b() <= 1 || this.f11474g) {
            return false;
        }
        String q = mo11377q();
        C10296b a2 = C10296b.m30493a(getContext());
        if (!a2.mo25024a(q, true)) {
            mo11374n();
            return false;
        }
        a2.mo25021a(q, (Object) Boolean.valueOf(false)).mo25023a();
        m13639y();
        return true;
    }

    public void onPause() {
        if (getActivity() != null && getActivity().isFinishing()) {
            if (this.f11472e instanceof C9422j) {
                int currentItem = this.f11469b.getCurrentItem();
                if (currentItem >= 0 && currentItem < this.f11472e.mo14629b()) {
                    long j = this.f11472e.mo14625a(currentItem).getLong("live.intent.extra.ROOM_ID", 0);
                    if (j != 0) {
                        ((C9422j) this.f11472e).mo14633c(j);
                    }
                }
            } else if (this.f11461L == 0 && ((Integer) LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE.mo10240a()).intValue() == 1) {
                m13616J();
            }
        }
        super.onPause();
    }

    /* renamed from: m */
    public final void mo11373m() {
        if (this.f11453C != null) {
            C10296b a = C10296b.m30493a(getContext());
            if (a.mo25024a("live.pref.PREF_SHOW_DISLIKE_TIPS", true)) {
                a.mo25021a("live.pref.PREF_SHOW_DISLIKE_TIPS", (Object) Boolean.valueOf(false)).mo25023a();
                View inflate = View.inflate(getContext(), R.layout.auz, null);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.gd);
                LayoutParams layoutParams = (LayoutParams) lottieAnimationView.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) getActivity().getWindow().getDecorView().getHeight()) / 2.0f) - (((float) getResources().getDimensionPixelSize(R.dimen.ok)) / 2.0f));
                PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                inflate.setOnClickListener(new C6142u(popupWindow));
                popupWindow.showAtLocation(getActivity().getWindow().getDecorView(), 51, 0, 0);
                lottieAnimationView.getClass();
                popupWindow.setOnDismissListener(C6143v.m19082a(lottieAnimationView));
                lottieAnimationView.setAnimation("dislike_live_tips.json");
                lottieAnimationView.mo7082c(true);
                lottieAnimationView.mo7078b();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        m13636v();
        ((C3495l) C3596c.m13172a(C3495l.class)).removeInteractStateChangeListener(this.f11468S);
        if (this.f11472e instanceof C8385a) {
            ((C8385a) this.f11472e).mo21552e();
        }
        if (this.f11456G || getActivity() == null || getActivity().getLifecycle().mo54a().isAtLeast(State.INITIALIZED)) {
            final FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.getLifecycle().mo55a(new GenericLifecycleObserver() {
                    /* renamed from: a */
                    public final void mo44a(C0043i iVar, Event event) {
                        if (activity.isFinishing() && event.equals(Event.ON_DESTROY)) {
                            LiveRoomFragment.this.mo11367f();
                            LiveRoomFragment.this.f11479l.mo23117a(null);
                            C8804a.f23951a = null;
                        }
                    }
                });
            }
        } else {
            mo11367f();
            this.f11479l.mo23117a(null);
            C8804a.f23951a = null;
        }
        if (this.f11452B) {
            this.f11452B = false;
        } else {
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(null);
        }
        ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController().mo21787c(((IHostContext) C3596c.m13172a(IHostContext.class)).context());
        C3850ab.m13691a().mo11396b();
        if (this.f11478k != null) {
            this.f11478k.mo21785a(true, getContext());
            this.f11478k.mo21788d(getContext());
        }
        if (!(this.f11485u == null || this.f11486v == null)) {
            this.f11486v.listen(this.f11485u, 0);
            this.f11485u = null;
        }
        this.f11478k.mo10509c();
        if (this.f11490z > 0) {
            this.f11490z = 0;
        }
        if ((getActivity() instanceof C9291c) && !this.f11456G) {
            getActivity();
        }
        if (this.f11476i != null) {
            this.f11476i.f11530a = null;
            this.f11476i = null;
            this.f11451A = null;
        }
    }

    /* renamed from: c */
    private void m13634c(int i) {
        this.f11489y = false;
        m13608B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11350a(View view) {
        C6147z.m19083a(this.f11488x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11363b(boolean z) {
        m13608B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11362b(Room room) throws Exception {
        this.f11472e.mo14627a(room.getId());
    }

    /* renamed from: b */
    private static void m13632b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", LiveRoomFragment.class.getName());
        C8444d.m25673b().mo10001b("ttlive_page", (Map<String, ?>) hashMap);
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f11489y = z;
        m13608B();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = "enter_from_dou_plus";
        boolean z = false;
        if (getArguments() != null && getArguments().getBoolean("enter_from_dou_plus", false)) {
            z = true;
        }
        bundle.putBoolean(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo11356a(Map<String, C8398b> map) {
        if (this.f11472e != null && this.f11472e.mo14634d() != null) {
            C7492s.m23300b((Iterable<? extends T>) new ArrayList<Object>(this.f11472e.mo14634d())).mo19291a((C7328l<? super T>) new C6131j<Object>(map)).mo19280a((C7326g<? super T>) new C6137p<Object>(this), C6138q.f18088a);
            mo11369h();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m13624a(C3479d dVar) throws Exception {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "JUMP_TO_ROOM ping success");
    }

    /* renamed from: b */
    public final void mo11361b(int i) {
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("has_page_slide", true);
        }
        List d = this.f11472e.mo14634d();
        if (i >= 0 && d.size() > i) {
            ((Room) d.get(i)).getId();
            if (getActivity() instanceof C9333g) {
                getActivity();
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            if (C3387g.m12599a(getActivity())) {
                getActivity().getWindow().setSoftInputMode(48);
            }
            m13634c(1);
            getActivity().getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        if (!C9290a.f25466a) {
            this.f11485u = new C9030aa(this);
            this.f11486v = (TelephonyManager) getActivity().getSystemService("phone");
            if (this.f11486v != null) {
                this.f11486v.listen(this.f11485u, 32);
            }
        }
        if (!(bundle == null || getArguments() == null)) {
            getArguments().putBoolean("enter_from_dou_plus", bundle.getBoolean("enter_from_dou_plus", false));
        }
        m13631b(getArguments());
    }

    public void onCreate(Bundle bundle) {
        this.f11464O = System.currentTimeMillis();
        TimeCostUtil.m12208b(Tag.StartLivePlay);
        C3222b.m12218a().mo10137a(Tag.StartLivePlay.name(), (C0043i) this, getContext());
        C3222b.m12218a().mo10146b(Tag.StartLivePlay.name(), (C0043i) this, getContext());
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        hashMap.put("location", "live detail after super oncreate");
        TTLiveSDKContext.getHostService().mo22363d().mo23269a("feed_enter_room", hashMap);
        this.f11462M = new C8773k();
        this.f11479l = C9421i.m27940b();
        this.f11478k = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
        this.f11478k.mo10506b();
        ((C3495l) C3596c.m13172a(C3495l.class)).registerInteractStateChangeListener(this.f11468S);
        m13610D();
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        hashMap.put("location", "finish live detail oncreate");
        TTLiveSDKContext.getHostService().mo22363d().mo23269a("feed_enter_room", hashMap);
        ((C3450b) C3596c.m13172a(C3450b.class)).getDnsOptimizer().mo10469a(false);
        m13617K();
        m13632b("onCreate");
    }

    /* renamed from: a */
    private static void m13622a(Bundle bundle) {
        String str;
        String str2;
        C8384a a = C9178j.m27302j().mo22376e().mo21566a(false);
        if (a == null || TextUtils.isEmpty(a.f22984a) || (!a.f22984a.equals(EntryType.FEED.typeName) && !a.f22984a.equals(EntryType.FEED_WITH_PREVIEW.typeName))) {
            String string = bundle.getString("enter_from", "");
            String string2 = bundle.getString("enter_from_merge", "");
            String string3 = bundle.getString("enter_method", "");
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle2 == null) {
                str = "";
            } else {
                str = bundle2.getString("enter_from_merge", "");
            }
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(string)) {
                    StringBuilder sb = new StringBuilder("from_");
                    sb.append(string);
                    str2 = sb.toString();
                } else if (!TextUtils.isEmpty(string2)) {
                    StringBuilder sb2 = new StringBuilder("from_merge_");
                    sb2.append(string2);
                    str2 = sb2.toString();
                } else if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb3 = new StringBuilder("extra_from_merge_");
                    sb3.append(str);
                    str2 = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder("method_");
                    sb4.append(string3);
                    str2 = sb4.toString();
                }
                C9178j.m27302j().mo22376e().f23036a = new C8384a(str2);
            }
        }
    }

    /* renamed from: b */
    private void m13631b(Bundle bundle) {
        long j;
        String str;
        Bundle bundle2;
        String str2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str3;
        boolean z6;
        Bundle bundle3 = bundle;
        mo11367f();
        C8804a.m26393a(bundle);
        if (TTLiveSDKContext.getHostService() == null || TTLiveSDKContext.getHostService().mo22367h() == null) {
            j = 0;
        } else {
            j = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        }
        if (j > 0) {
            Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
            if (!(currentRoom == null || currentRoom.getOwner() == null || currentRoom.getOwner().getId() != j)) {
                C6147z.m19084a(Toast.makeText(getContext(), R.string.f39, 0));
                this.f11452B = true;
                m13619a(123, getString(R.string.f39));
                m13626a(String.valueOf(j), currentRoom.getId(), "user_is_broadcasting");
                this.f11480m.mo11383a();
                return;
            }
        }
        String string = bundle3.getString("live.intent.extra.ENTER_LIVE_SOURCE");
        String string2 = bundle3.getString("live.intent.extra.EXTRA_ENTER_FEED_STYLE");
        this.f11482r = string2;
        long j2 = bundle3.getLong("live.intent.extra.FROM_ROOM_ID", 0);
        Bundle bundle4 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        boolean z7 = bundle3.getBoolean("live.intent.extra.DISLIKE_ENABLED", false);
        String str4 = "";
        if (bundle4 != null) {
            this.f11463N = bundle4.getLong("live.intent.extra.ENTER_LIVE_TIME", 0);
            String string3 = bundle4.getString("enter_from_merge");
            str = bundle4.getString("enter_method");
            String str5 = string3;
            bundle2 = bundle4;
            str2 = str5;
        } else {
            str = str4;
            bundle2 = new Bundle();
            str2 = string;
        }
        if (bundle2.getBoolean("live.intent.extra.IS_MULTI", false)) {
            bundle3.putBoolean("live.intent.extra.IS_MULTI", true);
        }
        if (bundle2.getInt("live.intent.extra.POSITION", 0) != 0) {
            bundle3.putInt("live.intent.extra.POSITION", bundle2.getInt("live.intent.extra.POSITION", 0));
        }
        bundle2.putString("live_cell_position", bundle3.getString("live_cell_position"));
        this.f11457H = bundle2.getBoolean("live.intent.extra.EXTRA_FLAG_FROM_NEW_AB_OF_BACK_PRE_ROOM", false);
        if (C6319n.m19593a(bundle2.getString("live.intent.extra.WINDOW_MODE", ""))) {
            bundle2.putString("live.intent.extra.WINDOW_MODE", bundle3.getString("live.intent.extra.WINDOW_MODE", ""));
        }
        String string4 = bundle3.getString("double_stream_feed_url");
        boolean z8 = !TextUtils.isEmpty(string4);
        if (!"homepage_follow".equals(str2) || (!"live_cell_cover".equals(str) && !TextUtils.equals("live_cell", str))) {
            z = false;
        } else {
            z = true;
        }
        if (C5357o.m17086c(bundle)) {
            bundle3.putBoolean("live.intent.extra.IS_MULTI", false);
            z2 = false;
            i = -1;
        } else {
            String b = C5357o.m17084b(bundle);
            if (!C6319n.m19593a(b)) {
                string4 = b;
            } else if (z8) {
                if (((Integer) LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE.mo10240a()).intValue() == 0) {
                    z2 = false;
                    i = 0;
                }
            } else if (z) {
                string4 = ((FeedDraw) LiveConfigSettingKeys.LIVE_FOLLOW_DRAW_URL.mo10240a()).getUrl();
                z2 = !TextUtils.isEmpty(string4);
                i = 1;
            } else {
                String url = ((FeedDraw) LiveConfigSettingKeys.LIVE_FEED_DRAW.mo10240a()).getUrl();
                if (!((Boolean) LiveConfigSettingKeys.LIVE_FEED_DRAW_ENABLE.mo10240a()).booleanValue() || !((FeedDraw) LiveConfigSettingKeys.LIVE_FEED_DRAW.mo10240a()).isSupportedRequestFrom(FeedDraw.conventRequestFrom(str2, str))) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                i = 2;
                String str6 = url;
                z2 = z6;
                string4 = str6;
            }
            z2 = true;
            i = 0;
        }
        if (z2) {
            i2 = i;
        } else {
            i2 = -1;
        }
        this.f11461L = i2;
        this.f11474g = false;
        boolean z9 = bundle3.getBoolean("live.intent.extra.IS_MULTI", false);
        int i3 = bundle3.getInt("live.intent.extra.POSITION", 0);
        if (i3 < 0) {
            i3 = 0;
        }
        long[] longArray = bundle3.getLongArray("live.intent.extra.ENTER_ROOM_IDS");
        if (z2) {
            if (C5362q.m17094a(str)) {
                getArguments();
            }
            if (z8) {
                str3 = "draw";
            } else {
                str3 = "";
            }
            this.f11472e = new C8385a(bundle3, string4, str3);
        } else {
            if (z9) {
                this.f11472e = this.f11479l.mo23116a();
                z5 = z9;
            } else if (longArray == null || longArray.length <= 0) {
                z5 = z9;
                this.f11472e = new C8382c(bundle3);
                z3 = false;
                m13629a(bundle3.getLong("live.intent.extra.ROOM_ID", 0));
                z4 = z5;
                C9423k.m27944b().mo23120a();
                this.f11454D = bundle3.getBoolean("live.intent.extra.EXTRA_ROOM_MANUAL_START", z3);
                this.f11455E = bundle3.getBoolean("live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM", z3);
                m13627a(string, bundle2);
                m13620a(i3, z4, string, string2, j2, z7, str2, str, bundle2);
            } else if (C5362q.m17094a(str)) {
                getArguments();
                this.f11472e = new C8382c(bundle3);
                z5 = z9;
                m13629a(bundle3.getLong("live.intent.extra.ROOM_ID", 0));
            } else {
                long j3 = bundle3.getLong("live.intent.extra.ROOM_ID");
                int i4 = 0;
                while (true) {
                    if (i4 >= longArray.length) {
                        i4 = i3;
                        break;
                    } else if (longArray[i4] == j3) {
                        break;
                    } else {
                        i4++;
                    }
                }
                this.f11472e = new MultiRoomIdListProvider(getLifecycle(), longArray, bundle3);
                m13629a(longArray);
                i3 = i4;
            }
            z3 = false;
            z4 = z5;
            C9423k.m27944b().mo23120a();
            this.f11454D = bundle3.getBoolean("live.intent.extra.EXTRA_ROOM_MANUAL_START", z3);
            this.f11455E = bundle3.getBoolean("live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM", z3);
            m13627a(string, bundle2);
            m13620a(i3, z4, string, string2, j2, z7, str2, str, bundle2);
        }
        z4 = true;
        z3 = false;
        C9423k.m27944b().mo23120a();
        this.f11454D = bundle3.getBoolean("live.intent.extra.EXTRA_ROOM_MANUAL_START", z3);
        this.f11455E = bundle3.getBoolean("live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM", z3);
        m13627a(string, bundle2);
        m13620a(i3, z4, string, string2, j2, z7, str2, str, bundle2);
    }

    /* renamed from: a */
    private void m13619a(int i, String str) {
        if (this.f11462M != null) {
            this.f11462M.mo21816a(i, str);
        }
    }

    /* renamed from: a */
    public static LiveRoomFragment m13618a(long j, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m13622a(bundle2);
        bundle2.putLong("live.intent.extra.ROOM_ID", j);
        LiveRoomFragment liveRoomFragment = new LiveRoomFragment();
        liveRoomFragment.setArguments(bundle2);
        return liveRoomFragment;
    }

    /* renamed from: a */
    private void m13621a(long j, long j2) {
        ((C3245ad) ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).ping(j, j2, PingType.JUMP_TO_ROOM).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(C6135n.f18085a, C6136o.f18086a);
    }

    /* renamed from: a */
    private void m13625a(Room room, String str) {
        View inflate = View.inflate(getContext(), R.layout.av0, null);
        View findViewById = inflate.findViewById(R.id.a97);
        ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).gravity = 17;
        this.f11488x = new PopupWindow(inflate, -1, -1, true);
        inflate.setOnClickListener(new C6144w(this));
        findViewById.setOnClickListener(new C6132k(this, room));
        this.f11488x.showAtLocation(getActivity().getWindow().getDecorView(), 51, 0, 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.aqn, viewGroup, false);
        this.f11469b = (LiveVerticalViewPager) inflate.findViewById(R.id.edp);
        this.f11470c = (FrameLayout) inflate.findViewById(R.id.a19);
        this.f11470c.setBackgroundColor(getResources().getColor(R.color.wd));
        return inflate;
    }

    /* renamed from: a */
    private void m13626a(String str, long j, String str2) {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a != null && a.mo21568a() != null && a.mo21568a().get("enter_method") != null && getArguments() != null) {
            Bundle arguments = getArguments();
            if (TextUtils.isEmpty(str)) {
                str = arguments.getString("live.intent.extra.USER_ID");
            }
            String string = arguments.getString("livesdk_live_push_status", "");
            if (j == 0) {
                j = arguments.getLong("live.intent.extra.ROOM_ID", 0);
            }
            if (a.mo21568a().get("enter_method") != null && TextUtils.equals(a.mo21568a().get("enter_method").toString(), "push")) {
                C8443c.m25663a().mo21606a("livesdk_push_error", C8446a.m25675a().mo21609a("anchor_id", str).mo21609a("anchor_status", str2).mo21609a("room_id", String.valueOf(j)).mo21609a("push_lookup_status", string).f23108a, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m13620a(int i, boolean z, String str, String str2, long j, boolean z2, String str3, String str4, Bundle bundle) {
        String str5 = str;
        if (this.f11472e == null) {
            m13619a(124, "list provider is null");
            m13626a("", 0, "room_list_provider_error");
            this.f11480m.mo11383a();
            return;
        }
        final String str6 = str;
        final String str7 = str3;
        final String str8 = str4;
        final Bundle bundle2 = bundle;
        C38396 r0 = new LiveDetailPagerAdapter(getChildFragmentManager(), this.f11472e) {
            public final void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                LiveRoomFragment.this.f11469b.post(new Runnable() {
                    public final void run() {
                        if (LiveRoomFragment.this.getActivity() != null && !LiveRoomFragment.this.getActivity().isFinishing()) {
                            if (!(LiveRoomFragment.this.mo11364c() == null || LiveRoomFragment.this.f11476i == null)) {
                                LiveRoomFragment.this.f11476i.onPageSelected(LiveRoomFragment.this.f11469b.getCurrentItem());
                            }
                            LiveRoomFragment.this.mo11368g();
                        }
                    }
                });
                LiveRoomFragment.this.mo11377q();
            }

            public final Object instantiateItem(ViewGroup viewGroup, int i) {
                C9330e eVar = (C9330e) super.instantiateItem(viewGroup, i);
                eVar.mo13265a((C9331a) LiveRoomFragment.this);
                eVar.mo13278g().getArguments().putString("live.intent.extra.ENTER_LIVE_SOURCE", str6);
                eVar.mo13278g().getArguments().putString("enter_from_merge", str7);
                eVar.mo13278g().getArguments().putString("enter_method", str8);
                if (LiveRoomFragment.this.mo11376p()) {
                    eVar.mo13278g().getArguments().putString("scene_id", "1005");
                }
                eVar.mo13278g().getArguments().putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
                return eVar;
            }
        };
        this.f11473f = r0;
        this.f11469b.setOffscreenPageLimit(1);
        try {
            this.f11469b.setAdapter(this.f11473f);
        } catch (Exception unused) {
        }
        int i2 = i;
        this.f11469b.mo22510a(i, false);
        this.f11476i = new C3845b(str);
        this.f11469b.setOnPageChangeListener(this.f11476i);
        C6139r rVar = new C6139r(this, str2, bundle, str, j);
        this.f11451A = rVar;
        m13637w();
        m13608B();
        this.f11469b.setOverScrollListener(new C9213e() {

            /* renamed from: b */
            private long f11524b;

            /* renamed from: a */
            public final void mo11387a() {
                if (System.currentTimeMillis() - this.f11524b > 2500) {
                    this.f11524b = System.currentTimeMillis();
                    if (LiveRoomFragment.this.getContext() != null) {
                        C9049ap.m27026a(LiveRoomFragment.this.getContext(), LiveRoomFragment.this.getString(R.string.fdj));
                    }
                }
            }

            /* renamed from: b */
            public final void mo11388b() {
                if (System.currentTimeMillis() - this.f11524b > 2500) {
                    this.f11524b = System.currentTimeMillis();
                    if (LiveRoomFragment.this.getContext() != null) {
                        C9049ap.m27026a(LiveRoomFragment.this.getContext(), LiveRoomFragment.this.getString(R.string.fdk));
                    }
                }
            }
        });
        if (this.f11453C != null) {
            this.f11453C.mo11391a();
        }
        if (z2) {
            this.f11453C = new C3844a(str);
        } else {
            this.f11453C = null;
        }
    }
}
