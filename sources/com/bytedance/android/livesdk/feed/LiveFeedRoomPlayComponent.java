package com.bytedance.android.livesdk.feed;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.C5918a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.live.CommonLiveViewHolder;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LiveFeedRoomPlayComponent extends BaseFeedRoomPlayComponent {

    /* renamed from: s */
    public String f17536s;

    /* renamed from: t */
    private C5919b f17537t;

    /* renamed from: u */
    private C5919b f17538u;

    /* renamed from: v */
    private boolean f17539v;

    /* renamed from: w */
    private long f17540w;

    /* renamed from: com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent$a */
    class C5921a extends C5919b {
        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo14489d() {
            LiveFeedRoomPlayComponent.this.mo14511f();
        }

        /* renamed from: f */
        public final void mo14491f() {
            if (LiveFeedRoomPlayComponent.this.f17500c != null) {
                C1293v f = LiveFeedRoomPlayComponent.this.f17500c.mo5575f(this.f17527a);
                if (f != null && (f instanceof CommonLiveViewHolder)) {
                    ((CommonLiveViewHolder) f).mo14708f();
                }
            }
        }

        /* renamed from: b */
        public final void mo14486b() {
            View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(this.f17527a);
            if (c == null || c.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f17500c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo14511f();
                return;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) LiveFeedRoomPlayComponent.this.f17504g.getLayoutParams();
            marginLayoutParams.topMargin = (c.getBottom() - marginLayoutParams.height) + ((View) LiveFeedRoomPlayComponent.this.f17500c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = LiveFeedRoomPlayComponent.this.f17500c.getPaddingRight() + C3358ac.m12510a(1.5f);
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(marginLayoutParams);
                if (!(LiveFeedRoomPlayComponent.this.f17507j == null || LiveFeedRoomPlayComponent.this.f17507j.getWindow() == null || LiveFeedRoomPlayComponent.this.f17507j.getWindow().getDecorView() == null)) {
                    LiveFeedRoomPlayComponent.this.f17507j.getWindow().getDecorView().requestLayout();
                }
            } else {
                LiveFeedRoomPlayComponent.this.f17504g.post(new C6086r(this, marginLayoutParams));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final int[] mo14488c() {
            int[] iArr = {-1, -1};
            if (LiveFeedRoomPlayComponent.this.f17500c == null) {
                return iArr;
            }
            int j = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager()).mo5445j();
            int l = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager()).mo5447l();
            if (j == -1 || l == -1) {
                return iArr;
            }
            int height = LiveFeedRoomPlayComponent.this.f17500c.getHeight();
            while (j <= l) {
                View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(j);
                float bottom = ((float) (c.getBottom() - c.getTop())) * 0.7f;
                int i = (int) (((float) height) - bottom);
                if (c.getTop() > 0 && c.getTop() <= i) {
                    FeedItem d = LiveFeedRoomPlayComponent.this.f17502e.mo14522d(j);
                    if (d != null) {
                        if (d.type == 1) {
                            iArr[1] = j;
                        } else if (d.type == 3 && (d.item instanceof C9368k) && ((C9368k) d.item).f25699v != null) {
                            iArr[1] = j;
                        }
                    }
                }
                if (c.getBottom() > 0 && ((float) c.getBottom()) < bottom) {
                    iArr[0] = j;
                }
                j++;
            }
            return iArr;
        }

        C5921a() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14514a(LayoutParams layoutParams) {
            if (LiveFeedRoomPlayComponent.this.f17504g != null && LiveFeedRoomPlayComponent.this.f17504g.getVisibility() == 0) {
                LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(layoutParams);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14513a(MarginLayoutParams marginLayoutParams) {
            LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(marginLayoutParams);
            if (LiveFeedRoomPlayComponent.this.f17507j != null && LiveFeedRoomPlayComponent.this.f17507j.getWindow() != null && LiveFeedRoomPlayComponent.this.f17507j.getWindow().getDecorView() != null) {
                LiveFeedRoomPlayComponent.this.f17507j.getWindow().getDecorView().requestLayout();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo14481a(boolean z) {
            if (LiveFeedRoomPlayComponent.this.f17500c == null) {
                return -1;
            }
            int j = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager()).mo5445j();
            int l = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager()).mo5447l();
            if (j == -1 || l == -1) {
                return -1;
            }
            int height = LiveFeedRoomPlayComponent.this.f17500c.getHeight() / 2;
            while (j <= l) {
                View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(j);
                if (c.getTop() <= height && c.getBottom() >= height) {
                    return j;
                }
                if (c.getTop() > height) {
                    int i = j - 1;
                    if (i >= 0) {
                        View c2 = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(i);
                        if (c2 != null && c.getTop() - height >= height - c2.getBottom()) {
                            return i;
                        }
                        return j;
                    }
                }
                j++;
            }
            return -1;
        }

        /* renamed from: c */
        private void m18516c(int i) {
            if (i != -1) {
                while (i > 0) {
                    i--;
                    FeedItem d = LiveFeedRoomPlayComponent.this.f17502e.mo14522d(i);
                    if (d != null && d.type == 1) {
                        Room room = (Room) d.item;
                        if (this.f17529c.get(Long.valueOf(room.getId())) == null && this.f17530d.get(Long.valueOf(room.getId())) == null) {
                            this.f17530d.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                            HashMap hashMap = new HashMap();
                            hashMap.put("enter_from_merge", "live_merge");
                            hashMap.put("enter_method", "live_cover");
                            hashMap.put("log_pb", room.getLog_pb());
                            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                            hashMap.put("request_id", room.getRequestId());
                            hashMap.put("room_id", String.valueOf(room.getId()));
                            hashMap.put("show_type", "streak");
                            hashMap.put("event_belong", "live_view");
                            hashMap.put("event_page", "live");
                            hashMap.put("event_type", "core");
                            hashMap.put("event_module", LiveFeedRoomPlayComponent.this.f17536s);
                            C5982b.m18722a("live_cover_show", (Map<String, String>) hashMap);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo14485a(int[] iArr) {
            super.mo14485a(iArr);
            FeedItem d = LiveFeedRoomPlayComponent.this.f17502e.mo14522d(iArr[1]);
            if (d != null && d.type == 1) {
                Room room = (Room) d.item;
                if (this.f17529c.get(Long.valueOf(room.getId())) == null) {
                    this.f17529c.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from_merge", "live_merge");
                    hashMap.put("enter_method", "live_cover");
                    hashMap.put("log_pb", room.getLog_pb());
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("request_id", room.getRequestId());
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("show_type", "stay");
                    hashMap.put("event_belong", "live_view");
                    hashMap.put("event_page", "live");
                    hashMap.put("event_type", "core");
                    hashMap.put("action_type", LiveFeedRoomPlayComponent.this.f17536s);
                    C5982b.m18722a("live_cover_show", (Map<String, String>) hashMap);
                    m18516c(iArr[1]);
                }
            }
        }

        /* renamed from: a */
        public final void mo14484a(int i, int i2) {
            boolean z;
            if (i == 0 || i2 == 0) {
                LiveFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo14511f();
                return;
            }
            View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(this.f17527a);
            if (c != null) {
                LayoutParams layoutParams = (LayoutParams) LiveFeedRoomPlayComponent.this.f17504g.getLayoutParams();
                FeedItem d = LiveFeedRoomPlayComponent.this.f17502e.mo14522d(this.f17527a);
                if (d == null || d.item == null || !(d.item instanceof C9368k)) {
                    z = false;
                } else {
                    z = true;
                }
                float f = 0.8f;
                if (i > i2) {
                    float width = (float) c.getWidth();
                    if (z) {
                        f = 0.72f;
                    }
                    layoutParams.width = (int) (width * f);
                    layoutParams.height = (int) (((((float) layoutParams.width) * 1.0f) * ((float) i2)) / ((float) i));
                } else {
                    layoutParams.height = (int) (((float) c.getHeight()) * 0.8f);
                    layoutParams.width = (int) (((((float) layoutParams.height) * 1.0f) * ((float) i)) / ((float) i2));
                }
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(layoutParams);
                } else {
                    LiveFeedRoomPlayComponent.this.f17504g.post(new C6113s(this, layoutParams));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent$b */
    class C5922b extends C5919b {

        /* renamed from: h */
        private Random f17543h = new Random();

        /* renamed from: i */
        private final List<Integer> f17544i = new ArrayList();

        /* renamed from: j */
        private final List<Integer> f17545j = new ArrayList();

        /* renamed from: k */
        private Handler f17546k = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (LiveFeedRoomPlayComponent.this.f17512o) {
                    int a = C5922b.this.mo14481a(false);
                    if (a == -1) {
                        a = C5922b.this.mo14481a(true);
                    }
                    C5922b.this.mo14487b(a);
                }
            }
        };

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo14489d() {
            LiveFeedRoomPlayComponent.this.mo14511f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo14492g() {
            this.f17546k.removeCallbacksAndMessages(null);
            this.f17546k.sendEmptyMessageDelayed(0, 10000);
        }

        /* renamed from: a */
        public final void mo14483a() {
            super.mo14483a();
            this.f17544i.clear();
            this.f17545j.clear();
            this.f17546k.removeCallbacksAndMessages(null);
        }

        /* renamed from: f */
        public final void mo14491f() {
            if (LiveFeedRoomPlayComponent.this.f17500c != null) {
                C1293v f = LiveFeedRoomPlayComponent.this.f17500c.mo5575f(this.f17527a);
                if (f != null && (f instanceof CommonLiveViewHolder)) {
                    ((CommonLiveViewHolder) f).mo14708f();
                }
            }
        }

        /* renamed from: i */
        private void m18526i() {
            if (C6311g.m19573a(this.f17544i)) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager();
                int s = gridLayoutManager.mo5800s();
                for (int i = 0; i < s; i++) {
                    View g = gridLayoutManager.mo5788g(i);
                    if (gridLayoutManager.mo5767a(g, true, true)) {
                        int f = RecyclerView.m5892f(g);
                        FeedItem d = LiveFeedRoomPlayComponent.this.f17502e.mo14522d(f);
                        if (d != null && d.type == 1) {
                            this.f17544i.add(Integer.valueOf(f));
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo14486b() {
            View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(this.f17527a);
            if (c == null || c.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f17500c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo14511f();
                return;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) LiveFeedRoomPlayComponent.this.f17504g.getLayoutParams();
            marginLayoutParams.topMargin = c.getTop() + ((View) LiveFeedRoomPlayComponent.this.f17500c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = (((((View) LiveFeedRoomPlayComponent.this.f17500c.getParent()).getWidth() - c.getLeft()) - c.getWidth()) - LiveFeedRoomPlayComponent.this.f17500c.getPaddingLeft()) + LiveFeedRoomPlayComponent.this.f17500c.getPaddingRight();
            LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(marginLayoutParams);
        }

        C5922b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo14481a(boolean z) {
            if (LiveFeedRoomPlayComponent.this.f17500c == null) {
                return -1;
            }
            if (C6311g.m19573a(this.f17544i)) {
                m18526i();
            }
            if (C6311g.m19573a(this.f17545j)) {
                this.f17545j.addAll(this.f17544i);
            }
            if (this.f17545j.contains(Integer.valueOf(this.f17527a))) {
                this.f17545j.remove(Integer.valueOf(this.f17527a));
                if (z) {
                    return this.f17527a;
                }
            }
            while (this.f17545j.size() > 0) {
                Integer num = (Integer) this.f17545j.remove(this.f17543h.nextInt(this.f17545j.size()));
                Room a = mo14482a(num.intValue());
                if (a != null && a.getMosaicStatus() == 0 && !a.isLiveTypeAudio() && a.getStatus() == 2) {
                    return num.intValue();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final void mo14484a(int i, int i2) {
            if (i == 0 || i2 == 0) {
                LiveFeedRoomPlayComponent.this.f17504g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.mo14511f();
                return;
            }
            View c = LiveFeedRoomPlayComponent.this.f17500c.getLayoutManager().mo5432c(this.f17527a);
            if (c != null) {
                LayoutParams layoutParams = (LayoutParams) LiveFeedRoomPlayComponent.this.f17504g.getLayoutParams();
                layoutParams.height = c.getHeight();
                layoutParams.width = c.getWidth();
                LiveFeedRoomPlayComponent.this.f17504g.setLayoutParams(layoutParams);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f17544i.clear();
            this.f17545j.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo14455b() {
        if (this.f17539v) {
            return ((Boolean) LiveFeedSettings.LIVE_FEED_ENABLE_PREVIEW.mo10240a()).booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C5919b mo14456c() {
        if (this.f17539v) {
            if (this.f17537t == null) {
                this.f17537t = new C5922b();
            }
            return this.f17537t;
        }
        if (this.f17538u == null) {
            this.f17538u = new C5921a();
        }
        return this.f17538u;
    }

    /* renamed from: g */
    public final void mo14512g() {
        if (this.f17538u != null) {
            this.f17538u.mo14493h();
        }
        if (this.f17537t != null) {
            this.f17537t.mo14493h();
        }
    }

    /* renamed from: h */
    private void m18509h() {
        this.f17540w = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_page", "live");
        if (FeedLiveFragment.f17788A != null) {
            this.f17536s = FeedLiveFragment.f17788A.f17758h;
        }
        hashMap.put("enter_from_merge", "live_merge");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("event_module", this.f17536s);
        if (!(this.f17509l == null || this.f17509l.mo14490e() == null)) {
            Room e = this.f17509l.mo14490e();
            hashMap.put("log_pb", e.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(e.getOwnerUserId()));
            hashMap.put("request_id", e.getRequestId());
            hashMap.put("room_id", String.valueOf(e.getId()));
        }
        C5982b.m18722a("live_window_show", (Map<String, String>) hashMap);
    }

    /* renamed from: f */
    public final void mo14511f() {
        if (this.f17540w >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            if (FeedLiveFragment.f17788A != null) {
                this.f17536s = FeedLiveFragment.f17788A.f17758h;
            }
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("event_module", this.f17536s);
            if (!(this.f17509l == null || this.f17509l.mo14490e() == null)) {
                Room e = this.f17509l.mo14490e();
                hashMap.put("log_pb", e.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(e.getOwnerUserId()));
                hashMap.put("request_id", e.getRequestId());
                hashMap.put("room_id", String.valueOf(e.getId()));
            }
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f17540w));
            C5982b.m18722a("live_window_duration", (Map<String, String>) hashMap);
            this.f17540w = -1;
        }
    }

    /* renamed from: d */
    public final void mo14510d(boolean z) {
        this.f17539v = z;
        super.mo14448a();
    }

    public LiveFeedRoomPlayComponent(C5918a aVar) {
        super(aVar);
        this.f17536s = aVar.mo14480i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14454b(boolean z) {
        if (z) {
            m18509h();
        } else {
            mo14511f();
        }
    }
}
