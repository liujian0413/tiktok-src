package com.bytedance.android.livesdk.feed;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.SystemClock;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout.C3564a;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.roomdetector.C6106a;
import com.bytedance.android.livesdk.feed.roomdetector.C6106a.C6107a;
import com.bytedance.android.livesdk.feed.roomdetector.C6112e;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9318b;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9319c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p434a.C9287b;
import com.bytedance.android.livesdkapi.p450f.C9405a;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseFeedRoomPlayComponent implements C0042h, C9318b {

    /* renamed from: a */
    public final String f17498a;

    /* renamed from: b */
    public final WeakReference<Lifecycle> f17499b;

    /* renamed from: c */
    protected final RecyclerView f17500c;

    /* renamed from: d */
    protected final C1273i f17501d;

    /* renamed from: e */
    protected final BaseFeedAdapter f17502e;

    /* renamed from: f */
    protected final BannerSwipeRefreshLayout f17503f;

    /* renamed from: g */
    protected final ViewGroup f17504g;

    /* renamed from: h */
    protected final TextureView f17505h;

    /* renamed from: i */
    protected final ILivePlayController f17506i;

    /* renamed from: j */
    protected final Activity f17507j;

    /* renamed from: k */
    protected C6106a f17508k;

    /* renamed from: l */
    protected C5919b f17509l;

    /* renamed from: m */
    protected C9287b f17510m;

    /* renamed from: n */
    public boolean f17511n;

    /* renamed from: o */
    protected boolean f17512o;

    /* renamed from: p */
    public boolean f17513p;

    /* renamed from: q */
    public boolean f17514q;

    /* renamed from: r */
    public boolean f17515r;

    /* renamed from: s */
    private final C1264c f17516s = new C1264c() {
        /* renamed from: a */
        public final void mo5721a() {
            super.mo5721a();
            m18457a(true);
        }

        /* renamed from: a */
        private void m18457a(boolean z) {
            boolean z2;
            boolean z3 = true;
            if (BaseFeedRoomPlayComponent.this.f17509l == null || BaseFeedRoomPlayComponent.this.f17509l.f17528b <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (BaseFeedRoomPlayComponent.this.f17502e.getItemCount() > 0) {
                z3 = false;
            }
            if (BaseFeedRoomPlayComponent.this.f17510m != null) {
                if (z3 || z) {
                    BaseFeedRoomPlayComponent.this.mo14458c(false);
                }
            } else if (z2 && z3) {
                BaseFeedRoomPlayComponent.this.mo14458c(false);
            } else if (!z2 && !z3) {
                BaseFeedRoomPlayComponent.this.mo14459d();
            } else if (z2 && z) {
                BaseFeedRoomPlayComponent.this.mo14458c(false);
                BaseFeedRoomPlayComponent.this.mo14459d();
            }
        }

        /* renamed from: b */
        public final void mo5725b(int i, int i2) {
            boolean z;
            super.mo5725b(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.f17509l.f17527a) {
                z = true;
            } else {
                z = false;
            }
            m18457a(z);
        }

        /* renamed from: c */
        public final void mo5726c(int i, int i2) {
            boolean z;
            super.mo5726c(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.f17509l.f17527a) {
                z = true;
            } else {
                z = false;
            }
            m18457a(z);
        }

        /* renamed from: a */
        public final void mo5723a(int i, int i2, int i3) {
            boolean z;
            super.mo5723a(i, i2, i3);
            if (i <= BaseFeedRoomPlayComponent.this.f17509l.f17527a || i2 <= BaseFeedRoomPlayComponent.this.f17509l.f17527a) {
                z = true;
            } else {
                z = false;
            }
            m18457a(z);
        }
    };

    /* renamed from: t */
    private final Runnable f17517t = new Runnable() {
        public final void run() {
            if (!(!BaseFeedRoomPlayComponent.this.f17512o || !BaseFeedRoomPlayComponent.this.f17513p || BaseFeedRoomPlayComponent.this.f17500c == null || BaseFeedRoomPlayComponent.this.f17500c.getAdapter() == null || BaseFeedRoomPlayComponent.this.f17500c.getAdapter().getItemCount() == 0 || !BaseFeedRoomPlayComponent.this.mo14455b() || BaseFeedRoomPlayComponent.this.f17509l == null)) {
                BaseFeedRoomPlayComponent.this.f17509l.onScrollStateChanged(BaseFeedRoomPlayComponent.this.f17500c, 0);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$a */
    public interface C5918a {
        /* renamed from: a */
        RecyclerView mo14472a();

        /* renamed from: b */
        BaseFeedAdapter mo14473b();

        /* renamed from: c */
        BannerSwipeRefreshLayout mo14474c();

        /* renamed from: d */
        View mo14475d();

        /* renamed from: e */
        TextureView mo14476e();

        /* renamed from: f */
        ILivePlayController mo14477f();

        /* renamed from: g */
        Lifecycle mo14478g();

        /* renamed from: h */
        Activity mo14479h();

        /* renamed from: i */
        String mo14480i();
    }

    /* renamed from: com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b */
    abstract class C5919b extends C1281m {

        /* renamed from: a */
        int f17527a = -1;

        /* renamed from: b */
        long f17528b = -1;

        /* renamed from: c */
        protected LinkedHashMap<Long, Long> f17529c = new LinkedHashMap<>();

        /* renamed from: d */
        protected LinkedHashMap<Long, Long> f17530d = new LinkedHashMap<>();

        /* renamed from: e */
        protected LinkedHashMap<Long, Long> f17531e = new LinkedHashMap<>();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo14481a(boolean z);

        /* renamed from: a */
        public abstract void mo14484a(int i, int i2);

        /* renamed from: b */
        public abstract void mo14486b();

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo14489d() {
        }

        /* renamed from: f */
        public abstract void mo14491f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo14492g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int[] mo14488c() {
            return new int[]{-1, -1};
        }

        /* renamed from: h */
        public final void mo14493h() {
            this.f17529c.clear();
            this.f17530d.clear();
            this.f17531e.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final Room mo14490e() {
            FeedItem d = BaseFeedRoomPlayComponent.this.f17502e.mo14522d(this.f17527a);
            if (d == null || d.type != 1) {
                return null;
            }
            return (Room) d.item;
        }

        /* renamed from: a */
        public void mo14483a() {
            this.f17527a = -1;
            this.f17528b = -1;
            if (BaseFeedRoomPlayComponent.this.f17504g != null) {
                BaseFeedRoomPlayComponent.this.f17504g.setVisibility(4);
            }
            BaseFeedRoomPlayComponent.this.mo14454b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Room mo14482a(int i) {
            FeedItem d = BaseFeedRoomPlayComponent.this.f17502e.mo14522d(i);
            if (d == null || d.type != 1) {
                return null;
            }
            return (Room) d.item;
        }

        C5919b() {
        }

        /* renamed from: a */
        private void m18478a(Room room) {
            if (room != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room.getRequestId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - ((Long) BaseFeedRoomPlayComponent.this.f17509l.f17531e.get(Long.valueOf(room.getId()))).longValue()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", BaseFeedRoomPlayComponent.this.f17498a);
                C5982b.m18722a("live_window_show_start", (Map<String, String>) hashMap);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14485a(int[] iArr) {
            if (BaseFeedRoomPlayComponent.this.f17512o && BaseFeedRoomPlayComponent.this.f17513p && iArr[1] >= 0) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo14487b(int i) {
            if (BaseFeedRoomPlayComponent.this.f17512o && BaseFeedRoomPlayComponent.this.f17513p) {
                if (BaseFeedRoomPlayComponent.this.f17506i != null) {
                    BaseFeedRoomPlayComponent.this.f17506i.mo21789d(true);
                }
                C9319c cVar = null;
                if (i == this.f17527a) {
                    FeedItem d = BaseFeedRoomPlayComponent.this.f17502e.mo14522d(this.f17527a);
                    if (d != null && d.type == 1) {
                        if (BaseFeedRoomPlayComponent.this.f17510m != null) {
                            BaseFeedRoomPlayComponent.this.f17510m = null;
                        }
                        Room room = (Room) d.item;
                        this.f17528b = room.getId();
                        if (!BaseFeedRoomPlayComponent.m18441a(room)) {
                            if (BaseFeedRoomPlayComponent.this.f17506i != null) {
                                BaseFeedRoomPlayComponent.this.f17506i.mo21788d(BaseFeedRoomPlayComponent.this.f17505h.getContext());
                            }
                            if (BaseFeedRoomPlayComponent.this.f17504g != null) {
                                BaseFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                            }
                            BaseFeedRoomPlayComponent.this.mo14460e();
                            BaseFeedRoomPlayComponent.this.mo14454b(false);
                            return;
                        } else if (BaseFeedRoomPlayComponent.this.f17506i.mo21795g() && m18479a(room, BaseFeedRoomPlayComponent.this.f17506i)) {
                            if (!(BaseFeedRoomPlayComponent.this.f17504g == null || BaseFeedRoomPlayComponent.this.f17504g.getVisibility() == 0)) {
                                if (BaseFeedRoomPlayComponent.this.f17506i.mo21796h()) {
                                    BaseFeedRoomPlayComponent.this.mo14454b(true);
                                    BaseFeedRoomPlayComponent.this.mo14457c(room);
                                    BaseFeedRoomPlayComponent.this.f17504g.setVisibility(0);
                                    int f = BaseFeedRoomPlayComponent.this.f17506i.mo21793f();
                                    mo14484a(65535 & f, f >> 16);
                                } else {
                                    return;
                                }
                            }
                            mo14486b();
                            return;
                        }
                    } else if (d == null || d.type != 3 || !(d.item instanceof C9368k) || ((C9368k) d.item).f25669C != 0 || ((C9368k) d.item).f25699v == null) {
                        this.f17528b = 0;
                    } else {
                        if (BaseFeedRoomPlayComponent.this.f17506i != null && BaseFeedRoomPlayComponent.this.f17506i.mo21795g()) {
                            if (BaseFeedRoomPlayComponent.this.f17506i != null) {
                                BaseFeedRoomPlayComponent.this.f17506i.mo21794f(BaseFeedRoomPlayComponent.this.f17505h.getContext());
                            }
                            if (BaseFeedRoomPlayComponent.this.f17504g != null) {
                                BaseFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                            }
                            BaseFeedRoomPlayComponent.this.mo14460e();
                            BaseFeedRoomPlayComponent.this.mo14454b(false);
                        }
                        if (BaseFeedRoomPlayComponent.this.f17510m != null && BaseFeedRoomPlayComponent.this.f17510m.mo22772a() == 4 && BaseFeedRoomPlayComponent.this.f17510m.mo22773b() == d.item.getId()) {
                            if (!(BaseFeedRoomPlayComponent.this.f17504g == null || BaseFeedRoomPlayComponent.this.f17504g.getVisibility() == 0)) {
                                BaseFeedRoomPlayComponent.this.mo14454b(true);
                                BaseFeedRoomPlayComponent.this.f17504g.setVisibility(0);
                                mo14484a(((C9368k) d.item).f25699v.f25712c, ((C9368k) d.item).f25699v.f25713d);
                            }
                            mo14486b();
                            return;
                        }
                    }
                }
                if (BaseFeedRoomPlayComponent.this.f17504g != null) {
                    BaseFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                }
                mo14489d();
                this.f17527a = i;
                BaseFeedRoomPlayComponent.this.mo14460e();
                FeedItem d2 = BaseFeedRoomPlayComponent.this.f17502e.mo14522d(this.f17527a);
                if (d2 == null || !(d2.type == 1 || d2.type == 3)) {
                    this.f17528b = 0;
                    return;
                }
                if (d2.type == 1) {
                    if (BaseFeedRoomPlayComponent.this.f17510m != null) {
                        BaseFeedRoomPlayComponent.this.f17510m = null;
                    }
                    Room room2 = (Room) d2.item;
                    this.f17528b = room2.getId();
                    if (!NetworkUtils.m19548b(C3358ac.m12528e())) {
                        if (C5924a.f17550c && NetworkUtils.m19550d(C3358ac.m12528e()) != NetworkType.MOBILE_4G) {
                            return;
                        }
                        if (!C5924a.f17548a) {
                            if (((float) (System.currentTimeMillis() - ((Long) C9405a.f25885e.mo22117a()).longValue())) > ((Float) LiveFeedSettings.DEFAULT_DURATION_SHOW_PREVIEW_TIP.mo10240a()).floatValue() * 8.64E7f) {
                                C3517a.m12960a((Context) BaseFeedRoomPlayComponent.this.f17507j, (int) R.string.ekj);
                                C9405a.f25885e.mo22118a(Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    }
                    if (room2.getStatus() == 4 || room2.getMosaicStatus() != 0 || !room2.isPullUrlValid() || room2.isLiveTypeAudio()) {
                        BaseFeedRoomPlayComponent.this.f17506i.mo21788d(BaseFeedRoomPlayComponent.this.f17505h.getContext());
                        return;
                    }
                    C9384a aVar = room2.getStreamUrlExtraSafely().f25790n;
                    try {
                        if (room2.isMultiPullDataValid()) {
                            ILivePlayController iLivePlayController = BaseFeedRoomPlayComponent.this.f17506i;
                            String multiStreamData = room2.getMultiStreamData();
                            String multiStreamDefaultQualitySdkKey = room2.getMultiStreamDefaultQualitySdkKey();
                            TextureView textureView = BaseFeedRoomPlayComponent.this.f17505h;
                            int ordinal = room2.getStreamType().ordinal();
                            if (aVar != null) {
                                cVar = C9319c.m27713a().mo22793a(aVar.f25798a).mo22795b(aVar.f25799b).mo22792a(aVar.f25800c).mo22794a();
                            }
                            iLivePlayController.mo21784a(multiStreamData, multiStreamDefaultQualitySdkKey, textureView, ordinal, cVar, (C9318b) BaseFeedRoomPlayComponent.this);
                        } else {
                            ILivePlayController iLivePlayController2 = BaseFeedRoomPlayComponent.this.f17506i;
                            String buildPullUrl = room2.buildPullUrl();
                            TextureView textureView2 = BaseFeedRoomPlayComponent.this.f17505h;
                            int ordinal2 = room2.getStreamType().ordinal();
                            if (aVar != null) {
                                cVar = C9319c.m27713a().mo22793a(aVar.f25798a).mo22795b(aVar.f25799b).mo22792a(aVar.f25800c).mo22794a();
                            }
                            iLivePlayController2.mo21783a(buildPullUrl, textureView2, ordinal2, cVar, (C9318b) BaseFeedRoomPlayComponent.this, room2.getSdkParams());
                        }
                        BaseFeedRoomPlayComponent.this.f17506i.mo21785a(true, BaseFeedRoomPlayComponent.this.f17505h.getContext());
                        BaseFeedRoomPlayComponent.this.mo14453b(room2);
                        this.f17531e.put(Long.valueOf(room2.getId()), Long.valueOf(SystemClock.currentThreadTimeMillis()));
                        m18478a(room2);
                        C3222b.m12218a().mo10135a(Tag.LiveFeedPreview.name(), (Lifecycle) BaseFeedRoomPlayComponent.this.f17499b.get(), BaseFeedRoomPlayComponent.this.f17505h.getContext());
                        C3222b.m12218a().mo10144b(Tag.LiveFeedPreview.name(), (Lifecycle) BaseFeedRoomPlayComponent.this.f17499b.get(), BaseFeedRoomPlayComponent.this.f17505h.getContext());
                        TimeCostUtil.m12208b(Tag.LiveFeedPreview);
                    } catch (Exception unused) {
                        this.f17528b = 0;
                    }
                } else if (d2.type == 3 && (d2.item instanceof C9368k)) {
                    C9368k kVar = (C9368k) d2.item;
                    if (kVar != null && kVar.f25669C == 0) {
                        BaseFeedRoomPlayComponent.this.mo14451a(d2);
                    }
                }
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && BaseFeedRoomPlayComponent.this.f17512o) {
                mo14487b(mo14481a(true));
                mo14485a(mo14488c());
            }
        }

        /* renamed from: a */
        private static boolean m18479a(Room room, ILivePlayController iLivePlayController) {
            if (room.isMultiPullDataValid()) {
                return TextUtils.equals(iLivePlayController.mo21798j(), room.getMultiStreamData());
            }
            if (room.isPullUrlValid()) {
                return TextUtils.equals(iLivePlayController.mo21797i(), room.buildPullUrl());
            }
            return false;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (BaseFeedRoomPlayComponent.this.f17504g == null || BaseFeedRoomPlayComponent.this.f17504g.getVisibility() == 0) {
                mo14486b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo14454b(boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo14455b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C5919b mo14456c();

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f17514q = true;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f17514q = false;
    }

    /* renamed from: e */
    public final void mo14460e() {
        if (this.f17508k != null) {
            this.f17508k.mo14767b();
            this.f17508k = null;
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f17512o = true;
        this.f17515r = true;
        mo14459d();
    }

    /* renamed from: d */
    public final void mo14459d() {
        if (mo14455b() && this.f17512o && this.f17513p) {
            this.f17500c.removeCallbacks(this.f17517t);
            this.f17500c.postDelayed(this.f17517t, 1000);
        }
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f17512o = false;
        if (mo14455b() && this.f17513p) {
            mo14458c(false);
        }
        this.f17511n = false;
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        this.f17515r = false;
        if (mo14455b() && this.f17507j.isFinishing()) {
            mo14458c(true);
        }
        mo14460e();
    }

    /* renamed from: a */
    public final void mo14448a() {
        if (!mo14455b()) {
            if (!(this.f17500c == null || this.f17509l == null)) {
                this.f17500c.mo5545b((C1281m) this.f17509l);
                this.f17509l.mo14483a();
            }
        } else if (mo14511f()) {
            if (this.f17509l.f17528b > 0) {
                mo14458c(false);
            }
            mo14459d();
        }
    }

    /* renamed from: f */
    private boolean mo14511f() {
        if (this.f17500c == null) {
            return false;
        }
        if (this.f17509l != null) {
            this.f17500c.mo5545b((C1281m) this.f17509l);
            this.f17509l.mo14483a();
            this.f17502e.unregisterAdapterDataObserver(this.f17516s);
        }
        this.f17509l = mo14456c();
        if (this.f17509l == null) {
            return false;
        }
        this.f17500c.mo5528a((C1281m) this.f17509l);
        this.f17502e.registerAdapterDataObserver(this.f17516s);
        if (this.f17503f != null) {
            this.f17503f.setStartEndRefreshListener(new C3564a() {

                /* renamed from: a */
                boolean f17520a;

                /* renamed from: b */
                public final void mo10877b() {
                    if (this.f17520a) {
                        BaseFeedRoomPlayComponent.this.mo14459d();
                    }
                    this.f17520a = false;
                }

                /* renamed from: a */
                public final void mo10876a() {
                    if (BaseFeedRoomPlayComponent.this.f17509l != null && BaseFeedRoomPlayComponent.this.f17509l.f17528b > 0) {
                        BaseFeedRoomPlayComponent.this.mo14458c(false);
                        this.f17520a = true;
                    }
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    protected static boolean m18441a(Room room) {
        if (room == null || room.getMosaicStatus() != 0 || room.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo14453b(final Room room) {
        if (this.f17515r && room != null) {
            if (this.f17508k == null) {
                C6112e eVar = new C6112e(room.getId(), room.getStreamId(), true, new C6107a() {

                    /* renamed from: c */
                    private boolean f17524c = true;

                    /* renamed from: b */
                    public final void mo14470b() {
                        this.f17524c = false;
                        BaseFeedRoomPlayComponent.this.mo14449a(room.getId());
                    }

                    /* renamed from: c */
                    public final void mo14471c() {
                        this.f17524c = false;
                        BaseFeedRoomPlayComponent.this.mo14449a(room.getId());
                    }

                    /* renamed from: a */
                    public final boolean mo14469a() {
                        if (!this.f17524c || !BaseFeedRoomPlayComponent.this.f17515r || !BaseFeedRoomPlayComponent.this.f17514q) {
                            return false;
                        }
                        return true;
                    }

                    /* renamed from: a */
                    public final void mo14467a(int i) {
                        this.f17524c = false;
                        BaseFeedRoomPlayComponent.this.mo14449a(-1);
                    }

                    /* renamed from: a */
                    public final void mo14468a(long j, long j2) {
                        this.f17524c = false;
                        BaseFeedRoomPlayComponent.this.mo14450a(j, (int) j2);
                    }
                });
                this.f17508k = eVar;
            }
            this.f17508k.mo14766a();
        }
    }

    BaseFeedRoomPlayComponent(C5918a aVar) {
        this.f17504g = (ViewGroup) aVar.mo14475d();
        this.f17505h = aVar.mo14476e();
        this.f17506i = aVar.mo14477f();
        this.f17500c = aVar.mo14472a();
        this.f17501d = this.f17500c.getLayoutManager();
        this.f17502e = aVar.mo14473b();
        this.f17503f = aVar.mo14474c();
        this.f17507j = aVar.mo14479h();
        this.f17498a = aVar.mo14480i();
        aVar.mo14478g().mo55a(this);
        this.f17499b = new WeakReference<>(aVar.mo14478g());
    }

    /* renamed from: a */
    public final void mo14449a(long j) {
        if (this.f17500c != null && this.f17500c.getScrollState() == 0 && this.f17509l != null) {
            Room e = this.f17509l.mo14490e();
            if (e != null) {
                if (j == e.getId()) {
                    this.f17506i.mo21788d(this.f17505h.getContext());
                    this.f17504g.setVisibility(4);
                    mo14454b(false);
                    e.setStatus(4);
                    this.f17509l.mo14491f();
                    return;
                }
                for (FeedItem feedItem : this.f17502e.mo14531l()) {
                    if (feedItem.type == 1) {
                        Room room = (Room) feedItem.item;
                        if (room.getId() == j) {
                            room.setStatus(4);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo14458c(boolean z) {
        mo14460e();
        if (this.f17500c != null) {
            this.f17500c.removeCallbacks(this.f17517t);
        }
        if (this.f17504g != null) {
            this.f17504g.setVisibility(4);
        }
        mo14454b(false);
        if (this.f17506i != null) {
            if (z) {
                this.f17506i.mo21791e(this.f17505h.getContext());
            } else {
                this.f17506i.mo21788d(this.f17505h.getContext());
            }
        }
        if (this.f17509l != null) {
            this.f17509l.mo14483a();
        }
    }

    /* renamed from: c */
    public final void mo14457c(Room room) {
        if (room == null) {
            room = this.f17509l.mo14490e();
        }
        if (room != null) {
            Long l = (Long) this.f17509l.f17531e.get(Long.valueOf(room.getId()));
            if (l != null) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - l.longValue();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(currentThreadTimeMillis));
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room.getRequestId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", this.f17498a);
                C5982b.m18722a("live_window_show_finish", (Map<String, String>) hashMap);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14451a(final FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C9368k) && ((C9368k) feedItem.item).f25699v != null && !C6307b.m19566a((Collection<T>) ((C9368k) feedItem.item).f25699v.f25714e)) {
            if (this.f17506i != null) {
                this.f17506i.mo21794f(this.f17505h.getContext());
            }
            if (this.f17510m == null) {
                this.f17510m = C5951b.m18637b().mo14576p().mo23198a(this.f17507j, feedItem.adJSONObject);
            }
            if (this.f17510m != null) {
                new Object() {
                };
                feedItem.item.getId();
            }
        }
    }

    /* renamed from: a */
    public final void mo14452a(boolean z) {
        if (this.f17513p != z) {
            this.f17513p = z;
            if (z) {
                mo14459d();
                return;
            }
            if (mo14455b() && this.f17512o) {
                mo14458c(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo14450a(long j, int i) {
        if (this.f17514q && this.f17500c != null && this.f17509l != null && this.f17509l.mo14490e() != null) {
            Room e = this.f17509l.mo14490e();
            if (j == e.getId()) {
                this.f17506i.mo21788d(this.f17505h.getContext());
                this.f17504g.setVisibility(4);
                mo14454b(false);
                e.setMosaicStatus(i);
                this.f17509l.mo14491f();
                return;
            }
            for (FeedItem feedItem : this.f17502e.mo14531l()) {
                if (feedItem.type == 1) {
                    Room room = (Room) feedItem.item;
                    if (room.getId() == j) {
                        room.setMosaicStatus(i);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11991a(PlayerMessage playerMessage, Object obj) {
        int i;
        if (this.f17515r) {
            if (playerMessage == PlayerMessage.DISPLAYED_PLAY) {
                if (this.f17500c.getScrollState() == 0) {
                    if (!(this.f17504g == null || this.f17504g.getVisibility() == 0)) {
                        this.f17504g.setVisibility(0);
                        this.f17504g.setAlpha(0.0f);
                        this.f17504g.animate().alpha(1.0f).setDuration(100).start();
                    }
                    mo14454b(true);
                    mo14457c((Room) null);
                    int f = this.f17506i.mo21793f();
                    this.f17509l.mo14484a(f & 65535, f >> 16);
                    this.f17509l.mo14486b();
                    this.f17509l.mo14492g();
                    this.f17511n = true;
                    C3222b.m12218a().mo10134a(Tag.LiveFeedPreview.name());
                    TimeCostUtil.m12209c(Tag.LiveFeedPreview);
                }
            } else if (playerMessage == PlayerMessage.VIDEO_SIZE_CHANGED && this.f17500c.getScrollState() == 0) {
                if (this.f17504g.getVisibility() != 0 && !this.f17511n) {
                    this.f17504g.setVisibility(0);
                    this.f17504g.setAlpha(0.0f);
                    this.f17504g.animate().alpha(1.0f).setDuration(100).start();
                }
                try {
                    i = Integer.valueOf(String.valueOf(obj)).intValue();
                } catch (Throwable unused) {
                    i = -1;
                }
                if (i >= 0) {
                    this.f17509l.mo14484a(i & 65535, i >> 16);
                    this.f17509l.mo14486b();
                }
            }
        }
    }
}
