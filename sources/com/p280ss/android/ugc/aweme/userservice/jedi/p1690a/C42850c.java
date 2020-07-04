package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import android.arch.lifecycle.C0053p;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.story.api.C41974f;
import com.p280ss.android.ugc.aweme.story.api.userstory.C41982b;
import com.p280ss.android.ugc.aweme.userservice.jedi.C42847a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c */
public final class C42850c {

    /* renamed from: a */
    public final ConcurrentHashMap<String, User> f111337a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final C0053p<FollowStatus> f111338b = new C42852a(this);

    /* renamed from: c */
    private final C0053p<C41982b> f111339c = new C42854b(this);

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c$a */
    static final class C42852a<T> implements C0053p<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ C42850c f111341a;

        /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c$a$a */
        static final class C42853a<T> implements C7326g<C11786e<? extends User>> {

            /* renamed from: a */
            final /* synthetic */ FollowStatus f111342a;

            /* renamed from: b */
            final /* synthetic */ C42852a f111343b;

            /* renamed from: c */
            final /* synthetic */ FollowStatus f111344c;

            C42853a(FollowStatus followStatus, C42852a aVar, FollowStatus followStatus2) {
                this.f111342a = followStatus;
                this.f111343b = aVar;
                this.f111344c = followStatus2;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C11786e<? extends User> eVar) {
                User user = (User) eVar.mo29356a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        C7573i.m23582a((Object) clone, "user");
                        int followStatus = clone.getFollowStatus();
                        FollowStatus followStatus2 = this.f111342a;
                        C7573i.m23582a((Object) followStatus2, "this");
                        if (followStatus != followStatus2.followStatus) {
                            FollowStatus followStatus3 = this.f111342a;
                            C7573i.m23582a((Object) followStatus3, "this");
                            clone.setFollowStatus(followStatus3.followStatus);
                            Map map = this.f111343b.f111341a.f111337a;
                            String uid = clone.getUid();
                            C7573i.m23582a((Object) uid, "user.uid");
                            map.put(uid, clone);
                            C42859g a = C42847a.m136030a();
                            String uid2 = clone.getUid();
                            C7573i.m23582a((Object) uid2, "user.uid");
                            a.mo29326a(uid2, clone);
                        }
                    }
                }
            }
        }

        C42852a(C42850c cVar) {
            this.f111341a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(FollowStatus followStatus) {
            if (followStatus != null) {
                String str = followStatus.userId;
                if (str != null) {
                    C42847a.m136030a().mo29325a(str).mo19325f((C7326g<? super T>) new C42853a<Object>(followStatus, this, followStatus));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c$b */
    static final class C42854b<T> implements C0053p<C41982b> {

        /* renamed from: a */
        final /* synthetic */ C42850c f111345a;

        /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c$b$a */
        static final class C42855a<T> implements C7326g<C11786e<? extends User>> {

            /* renamed from: a */
            final /* synthetic */ C42854b f111346a;

            C42855a(C42854b bVar) {
                this.f111346a = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C11786e<? extends User> eVar) {
                User user = (User) eVar.mo29356a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        C7573i.m23582a((Object) clone, "user");
                        clone.setHasUnreadStory(false);
                        Map map = this.f111346a.f111345a.f111337a;
                        String uid = clone.getUid();
                        C7573i.m23582a((Object) uid, "user.uid");
                        map.put(uid, clone);
                        C42859g a = C42847a.m136030a();
                        String uid2 = clone.getUid();
                        C7573i.m23582a((Object) uid2, "user.uid");
                        a.mo29326a(uid2, clone);
                    }
                }
            }
        }

        C42854b(C42850c cVar) {
            this.f111345a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C41982b bVar) {
            if (bVar != null && bVar.f109062b) {
                C42859g a = C42847a.m136030a();
                String str = bVar.f109061a;
                C7573i.m23582a((Object) str, "this.userId");
                a.mo29325a(str).mo19325f((C7326g<? super T>) new C42855a<Object>(this));
            }
        }
    }

    public C42850c() {
        C23352a.m76612a().mo60651a("#FollowStatus", FollowStatus.class).observeForever(this.f111338b);
        if (!C6399b.m19944t()) {
            C41974f fVar = (C41974f) ServiceManager.get().getService(C41974f.class);
            if (fVar != null) {
                C23084b a = fVar.mo102994a();
                if (a != null) {
                    a.observeForever(this.f111339c);
                }
            }
        }
        C42847a.m136031b().mo104567b().mo19294a(C7333a.m23047e()).mo19325f((C7326g<? super T>) new C7326g<List<? extends Pair<? extends String, ? extends User>>>(this) {

            /* renamed from: a */
            final /* synthetic */ C42850c f111340a;

            {
                this.f111340a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(List<? extends Pair<String, ? extends User>> list) {
                C7573i.m23582a((Object) list, "pairList");
                for (Pair pair : list) {
                    this.f111340a.mo104561a((User) this.f111340a.f111337a.get(pair.getFirst()), (User) pair.getSecond());
                    this.f111340a.f111337a.put(pair.getFirst(), pair.getSecond());
                }
            }
        });
    }

    /* renamed from: a */
    private static void m136038a(FollowStatus followStatus) {
        C42961az.m136380a(followStatus);
        C23352a.m76612a().mo60651a("#FollowStatus", FollowStatus.class).postValue(followStatus);
    }

    /* renamed from: a */
    public final void mo104561a(User user, User user2) {
        boolean z;
        if (user != null && user2 != null && user.getFollowStatus() != user2.getFollowStatus()) {
            FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
            if (user.getFollowStatus() == 0 || user2.getFollowStatus() == 0) {
                z = true;
            } else {
                z = false;
            }
            followStatus.isFollowChange = z;
            m136038a(followStatus);
            ((IMainService) ServiceManager.get().getService(IMainService.class)).updateIMUserFollowStatus(user2);
        }
    }
}
