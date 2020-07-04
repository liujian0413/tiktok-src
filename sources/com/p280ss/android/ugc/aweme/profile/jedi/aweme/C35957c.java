package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25677e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c */
public final class C35957c extends C36018b {

    /* renamed from: b */
    public static final C35961a f94128b = new C35961a(null);

    /* renamed from: a */
    public C7321c f94129a;

    /* renamed from: g */
    private final C35979m f94130g;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c$a */
    public static final class C35961a {
        private C35961a() {
        }

        public /* synthetic */ C35961a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C35957c m115904a(JediAwemeListViewModel jediAwemeListViewModel, int i) {
            C7573i.m23587b(jediAwemeListViewModel, "viewModel");
            C35957c cVar = new C35957c(jediAwemeListViewModel, null);
            cVar.f94228c = i;
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c$b */
    static final class C35962b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ int f94134a;

        C35962b(int i) {
            this.f94134a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FeedItemList apply(FeedItemList feedItemList) {
            C7573i.m23587b(feedItemList, "it");
            feedItemList.fetchType = this.f94134a;
            return feedItemList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c$c */
    static final class C35963c<T> implements C7326g<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ C35957c f94135a;

        C35963c(C35957c cVar) {
            this.f94135a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(FeedItemList feedItemList) {
            String str;
            this.f94135a.mIsLoading = false;
            if (feedItemList != null) {
                LogPbBean logPbBean = feedItemList.logPb;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                feedItemList.setRequestId(str);
            }
            this.f94135a.handleData(feedItemList);
            List<C25678f> list = this.f94135a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        fVar.mo56977b();
                    }
                }
            }
            C7321c cVar = this.f94135a.f94129a;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c$d */
    static final class C35964d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C35957c f94136a;

        C35964d(C35957c cVar) {
            this.f94136a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            Throwable th2;
            this.f94136a.mIsLoading = false;
            List<C25678f> list = this.f94136a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        if (!(th instanceof Exception)) {
                            th2 = null;
                        } else {
                            th2 = th;
                        }
                        fVar.mo57296a((Exception) th2);
                    }
                }
            }
            C7321c cVar = this.f94136a.f94129a;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    private C35957c(JediAwemeListViewModel jediAwemeListViewModel) {
        this.f94130g = jediAwemeListViewModel.mo29069f();
        this.mData = jediAwemeListViewModel.mo90882g().clone();
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).observeAwemes().mo19317d((C7327h<? super T, ? extends R>) C359581.f94131a).mo19280a((C7326g<? super T>) new C7326g<Map<String, ? extends Aweme>>(this) {

            /* renamed from: a */
            final /* synthetic */ C35957c f94132a;

            {
                this.f94132a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Map<String, ? extends Aweme> map) {
                FeedItemList feedItemList = (FeedItemList) this.f94132a.mData;
                C7573i.m23582a((Object) feedItemList, "mData");
                List<Aweme> items = feedItemList.getItems();
                C7573i.m23582a((Object) items, "mData.items");
                for (Aweme aweme : items) {
                    C7573i.m23582a((Object) aweme, "aweme");
                    Aweme aweme2 = (Aweme) map.get(aweme.getAid());
                    if (aweme2 != null) {
                        aweme.update(aweme2);
                    }
                }
            }
        }, (C7326g<? super Throwable>) C359603.f94133a);
    }

    /* renamed from: a */
    public final boolean deleteItem(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            Collection items = getItems();
            if (items == null || items.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List items2 = getItems();
                C7573i.m23582a((Object) items2, "items");
                Iterator it = items2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Aweme aweme2 = (Aweme) it.next();
                    C7573i.m23582a((Object) aweme2, "it");
                    if (C7573i.m23585a((Object) aweme2.getAid(), (Object) aweme.getAid())) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    getItems().remove(i);
                    List list = this.mNotifyListeners;
                    if (list != null) {
                        Iterable iterable = list;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            if (next instanceof C25677e) {
                                arrayList.add(next);
                            }
                        }
                        for (C25677e a : (List) arrayList) {
                            a.mo59135a(i);
                        }
                    }
                }
                if (i >= 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public /* synthetic */ C35957c(JediAwemeListViewModel jediAwemeListViewModel, C7571f fVar) {
        this(jediAwemeListViewModel);
    }

    /* renamed from: a */
    public final void mo90896a(boolean z, String str, int i, long j, int i2, String str2) {
        C7492s sVar;
        this.f94228c = i;
        this.f94230e = str;
        if (i != 4) {
            switch (i) {
                case 0:
                    sVar = this.f94130g.mo90907b(str, str2, j, i2);
                    break;
                case 1:
                    sVar = this.f94130g.mo90903a(str, str2, j, i2);
                    break;
                default:
                    sVar = this.f94130g.mo90907b(str, str2, j, i2);
                    break;
            }
        } else {
            sVar = this.f94130g.mo90902a(j, i2);
        }
        this.f94129a = sVar.mo19317d((C7327h<? super T, ? extends R>) new C35962b<Object,Object>(i)).mo19280a((C7326g<? super T>) new C35963c<Object>(this), (C7326g<? super Throwable>) new C35964d<Object>(this));
    }
}
