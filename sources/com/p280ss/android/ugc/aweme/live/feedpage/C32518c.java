package com.p280ss.android.ugc.aweme.live.feedpage;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.core.p145a.C3147c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p854d.C19294c;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.C29463i;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.c */
public class C32518c implements C32516a {

    /* renamed from: a */
    public static final String f84787a = "c";

    /* renamed from: b */
    public static final Long f84788b = Long.valueOf(0);

    /* renamed from: i */
    private static C19294c<C32518c> f84789i = new C19294c<C32518c>() {
        /* renamed from: c */
        private static C32518c m105329c() {
            return new C32518c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo29755a() {
            return m105329c();
        }
    };

    /* renamed from: c */
    public Map<Long, Long> f84790c = new HashMap(20);

    /* renamed from: d */
    public Map<Long, Long> f84791d = new HashMap(20);

    /* renamed from: e */
    public C3147c<Long, Long> f84792e = new C3147c<>(20);

    /* renamed from: f */
    public LiveStateApi f84793f;

    /* renamed from: g */
    private C32520a f84794g = null;

    /* renamed from: h */
    private ArrayDeque<C32520a> f84795h = new ArrayDeque<>(10);

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.c$a */
    final class C32520a implements Runnable {

        /* renamed from: a */
        public boolean f84796a;

        /* renamed from: c */
        private final Long f84798c;

        /* renamed from: d */
        private final Long f84799d;

        /* renamed from: e */
        private Set<Long> f84800e;

        /* renamed from: f */
        private List<C7326g<Map<Long, Long>>> f84801f = new ArrayList(3);

        /* renamed from: a */
        private void m105331a() {
            this.f84796a = false;
            m105332a(C32518c.this.f84790c);
            C32518c.this.mo83749b();
        }

        public final void run() {
            this.f84796a = true;
            C32518c.this.f84792e.mo9983a(this.f84798c, this.f84799d);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f84798c.longValue() == 0 || currentTimeMillis - C32518c.this.mo83748b(this.f84798c.longValue()).longValue() >= C32518c.m105320c()) {
                this.f84800e = new HashSet(C32518c.this.f84792e.mo9991a().keySet());
                StringBuilder sb = new StringBuilder();
                this.f84800e.add(this.f84798c);
                if (!C6307b.m19566a((Collection<T>) this.f84800e)) {
                    for (Long valueOf : this.f84800e) {
                        sb.append(String.valueOf(valueOf));
                        sb.append(",");
                    }
                }
                C32518c.this.f84793f.liveStates(sb.toString()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C32521d<Object>(this, currentTimeMillis), (C7326g<? super Throwable>) new C32522e<Object>(this));
                return;
            }
            m105331a();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo83752a(Throwable th) {
            StringBuilder sb = new StringBuilder("refresh net:");
            sb.append(Log.getStackTraceString(th));
            C6921a.m21562b("LiveStateManager", sb.toString());
            this.f84796a = false;
            C32518c.this.mo83749b();
        }

        /* renamed from: a */
        public final void mo83751a(C7326g<Map<Long, Long>> gVar) {
            this.f84801f.add(gVar);
        }

        /* renamed from: a */
        private void m105332a(Map<Long, Long> map) {
            if (!C6307b.m19566a((Collection<T>) this.f84801f)) {
                for (C7326g accept : this.f84801f) {
                    try {
                        accept.accept(map);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("onResult:");
                        sb.append(Log.getStackTraceString(e));
                        C6921a.m21562b("LiveStateManager", sb.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo83753a(Long l) {
            if (this.f84800e == null || !this.f84800e.contains(l)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo83750a(long j, C32523f fVar) throws Exception {
            m105333a(this.f84800e, j, fVar);
        }

        /* renamed from: a */
        private void m105333a(Set<Long> set, long j, C32523f fVar) {
            if (!fVar.mo83755a().isEmpty()) {
                Set<Long> keySet = fVar.mo83755a().keySet();
                Map a = fVar.mo83755a();
                for (Long l : keySet) {
                    C32518c.this.f84791d.put(l, Long.valueOf(j));
                    Long l2 = (Long) a.get(l);
                    if (l2 == null) {
                        l2 = Long.valueOf(0);
                    }
                    if (!C32518c.f84788b.equals(l2)) {
                        C32518c.this.f84790c.put(l, l2);
                    } else {
                        C32518c.this.f84790c.remove(l);
                    }
                }
            } else {
                C32518c.this.f84790c.put(this.f84798c, Long.valueOf(0));
            }
            m105331a();
        }

        C32520a(Long l, Long l2, C7326g<Map<Long, Long>> gVar) {
            this.f84798c = l;
            this.f84799d = l2;
            this.f84801f.add(gVar);
        }
    }

    /* renamed from: a */
    public static C32518c m105318a() {
        return (C32518c) f84789i.mo51193b();
    }

    /* renamed from: c */
    public static long m105320c() {
        try {
            return SettingsManagerProxy.inst().get().getAutoLiveStateIntervalMills().longValue();
        } catch (NullValueException unused) {
            return 60000;
        }
    }

    /* renamed from: d */
    private static boolean m105321d() {
        if (C22977g.f60742b.mo59967b()) {
            return false;
        }
        try {
            return SettingsManagerProxy.inst().get().getEnableAutoLiveState().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m105322e() {
        if (C6399b.m19944t() || !m105321d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo83749b() {
        if (this.f84794g == null || !this.f84794g.f84796a) {
            C32520a aVar = (C32520a) this.f84795h.pollLast();
            this.f84794g = aVar;
            if (aVar != null) {
                aVar.run();
            }
        }
    }

    public C32518c() {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C32430a.m105063b());
        this.f84793f = (LiveStateApi) iRetrofitService.createNewRetrofit(sb.toString()).create(LiveStateApi.class);
    }

    /* renamed from: a */
    public final void mo83744a(long j) {
        this.f84790c.remove(Long.valueOf(j));
        this.f84791d.remove(Long.valueOf(j));
        this.f84792e.mo9982a(Long.valueOf(j));
    }

    /* renamed from: b */
    public final Long mo83748b(long j) {
        long j2;
        Long l = (Long) this.f84791d.get(Long.valueOf(j));
        if (l == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
        }
        return Long.valueOf(j2);
    }

    /* renamed from: b */
    public final void mo83747b(List<FollowFeed> list) {
        if (!m105322e() && !C6307b.m19566a((Collection<T>) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed followFeed : list) {
                if (followFeed.getFeedType() == 65298) {
                    C29463i roomStruct = followFeed.getRoomStruct();
                    if (roomStruct != null) {
                        RoomStruct roomStruct2 = roomStruct.f77715a;
                        if (roomStruct2 != null) {
                            roomStruct2.owner.roomId = roomStruct2.f75166id;
                            m105319a(currentTimeMillis, roomStruct2.owner);
                        }
                    }
                } else {
                    Aweme aweme = followFeed.getAweme();
                    if (aweme != null && aweme.getAuthor().isLive()) {
                        m105319a(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83746a(List<Aweme> list) {
        if (!m105322e() && !C6307b.m19566a((Collection<T>) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if (aweme.isLive() || (aweme.getAuthor() != null && aweme.getAuthor().isLive())) {
                    m105319a(currentTimeMillis, aweme.getAuthor());
                }
            }
        }
    }

    /* renamed from: a */
    private void m105319a(long j, User user) {
        if (!m105322e() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            this.f84790c.put(valueOf, Long.valueOf(user.roomId));
            this.f84791d.put(valueOf, Long.valueOf(j));
            this.f84792e.mo9983a(valueOf, Long.valueOf(user.roomId));
        }
    }

    /* renamed from: a */
    public final void mo83745a(Class cls, User user, C7326g<Map<Long, Long>> gVar) {
        if (!m105322e() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            if (this.f84794g == null || !this.f84794g.mo83753a(valueOf)) {
                this.f84795h.addFirst(new C32520a(valueOf, Long.valueOf(user.roomId), gVar));
                mo83749b();
                return;
            }
            this.f84794g.mo83751a(gVar);
        }
    }
}
