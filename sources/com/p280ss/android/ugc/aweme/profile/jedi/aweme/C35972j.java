package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.text.TextUtils;
import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi.C35830a;
import com.p280ss.android.ugc.aweme.profile.service.C36072h;
import com.p280ss.android.ugc.aweme.profile.util.C36729b;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.j */
public final class C35972j extends C11789a<C35967e, List<? extends Aweme>, C35967e, FeedItemList> {

    /* renamed from: a */
    private final AwemeListApi f94145a = C35830a.m115658a();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.j$a */
    static final class C35973a<T> implements C7326g<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ C35967e f94146a;

        C35973a(C35967e eVar) {
            this.f94146a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(FeedItemList feedItemList) {
            boolean z;
            C7573i.m23582a((Object) feedItemList, "it");
            feedItemList.fetchType = this.f94146a.f94138a;
            C36729b.m118407a(this.f94146a.f94138a, this.f94146a.f94141d, feedItemList);
            C36072h.f94311a.mo64354a("personal", feedItemList.getItems());
            C28199ae.m92689a().mo71792a(feedItemList.getRequestId(), feedItemList.logPb);
            Collection items = feedItemList.getItems();
            if (items == null || items.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f94146a.f94140c == 0) {
                    CharSequence charSequence = this.f94146a.f94141d;
                    IAccountUserService f = C6861a.m21337f();
                    C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                    if (TextUtils.equals(charSequence, f.getCurUserId())) {
                        C36729b.m118409a(this.f94146a.f94138a, false, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                    }
                } else {
                    CharSequence charSequence2 = this.f94146a.f94141d;
                    IAccountUserService f2 = C6861a.m21337f();
                    C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                    if (TextUtils.equals(charSequence2, f2.getCurUserId())) {
                        C36729b.m118409a(this.f94146a.f94138a, true, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C35967e m115916a(C35967e eVar) {
        C7573i.m23587b(eVar, "req");
        return eVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m115916a((C35967e) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7492s<FeedItemList> mo29350a(C35967e eVar) {
        C7492s sVar;
        C7573i.m23587b(eVar, "req");
        int i = eVar.f94138a;
        if (i != 4) {
            switch (i) {
                case 0:
                    sVar = this.f94145a.getPublishAweme(eVar.f94139b, eVar.f94141d, eVar.f94142e, eVar.f94140c);
                    break;
                case 1:
                    sVar = this.f94145a.getFavoriteAweme(eVar.f94139b, eVar.f94141d, eVar.f94142e, eVar.f94140c);
                    break;
                default:
                    sVar = this.f94145a.getPublishAweme(eVar.f94139b, eVar.f94141d, eVar.f94142e, eVar.f94140c);
                    break;
            }
        } else {
            sVar = this.f94145a.getCollectAweme(eVar.f94139b, eVar.f94140c);
        }
        C7492s<FeedItemList> d = sVar.mo19304b(C7333a.m23044b()).mo19316d((C7326g<? super T>) new C35973a<Object>(eVar));
        C7573i.m23582a((Object) d, "when (req.type) {\n      …}\n            }\n        }");
        return d;
    }

    /* renamed from: a */
    private static List<Aweme> m115917a(C35967e eVar, FeedItemList feedItemList) {
        C7573i.m23587b(eVar, "req");
        C7573i.m23587b(feedItemList, "resp");
        List<Aweme> items = feedItemList.getItems();
        if (items == null) {
            return C7525m.m23461a();
        }
        return items;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m115917a((C35967e) obj, (FeedItemList) obj2);
    }
}
