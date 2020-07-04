package com.p280ss.android.ugc.aweme.discover.base;

import android.content.Context;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.vast.p673a.C13008a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26755e;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.Commodity;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29448a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.f */
public final class C26601f {

    /* renamed from: a */
    public static final C26601f f70159a = new C26601f();

    private C26601f() {
    }

    /* renamed from: b */
    public static List<C26754d> m87382b(List<? extends C26754d> list) {
        C7573i.m23587b(list, "searchMixFeedList");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C26754d) list.get(i)).getFeedType() == 65280 && ((C26754d) list.get(i)).getAweme() != null) {
                Aweme aweme = ((C26754d) list.get(i)).getAweme();
                if (aweme == null) {
                    C7573i.m23580a();
                }
                aweme.setAwemePosition(i);
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C26754d> m87379a(List<? extends C26754d> list) {
        int i;
        int i2;
        C7573i.m23587b(list, "searchMixFeedList");
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = true;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C26754d) next).getFeedType() == 65465) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<C26754d> d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
        int a = C6384b.m19835a().mo15287a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", C6384b.m19835a().mo15295d().general_related_search_style, 0);
        List<Number> arrayList2 = new ArrayList<>();
        boolean z2 = false;
        int i3 = 0;
        for (C26754d dVar : d) {
            if (!z2 && dVar.mo68495a()) {
                C13008a.m37957a(arrayList2, Integer.valueOf(i3));
            }
            if (dVar.mo68495a() || (a == 1 && dVar.getFeedType() == 65459)) {
                z2 = true;
            } else {
                z2 = false;
            }
            i3++;
        }
        for (Number intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            C26754d dVar2 = new C26754d();
            dVar2.setFeedType(65465);
            Context a2 = C6399b.m19921a();
            if (C6399b.m19947w()) {
                i2 = R.string.fp7;
            } else {
                i2 = R.string.fny;
            }
            dVar2.f70527a = a2.getString(i2);
            d.add(intValue2 + i, dVar2);
            i++;
        }
        return d;
    }

    /* renamed from: a */
    public final void mo68289a(C26755e eVar) {
        int i;
        C7573i.m23587b(eVar, "data");
        List<C26754d> list = eVar.f70555d;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C26754d dVar = (C26754d) eVar.f70555d.get(i2);
            if (dVar == null) {
                C7573i.m23580a();
            }
            dVar.f70552z = eVar.logPb;
            if (dVar.getFeedType() == 65280) {
                m87380a(dVar, eVar, i2);
            }
            if (dVar.getFeedType() == 65458) {
                for (SearchUser searchUser : dVar.f70528b) {
                    C7573i.m23582a((Object) searchUser, "user");
                    if (searchUser.user != null) {
                        User user = searchUser.user;
                        C7573i.m23582a((Object) user, "user.user");
                        user.setRequestId(eVar.getRequestId());
                        m87381a(searchUser, eVar.getRequestId());
                    }
                }
            }
            if (dVar.getFeedType() == 65456) {
                for (SearchChallenge searchChallenge : dVar.f70531e) {
                    if (searchChallenge != null) {
                        searchChallenge.setRequestId(eVar.getRequestId());
                        if (searchChallenge.getChallenge() != null) {
                            Challenge challenge = searchChallenge.getChallenge();
                            C7573i.m23582a((Object) challenge, "challenge.challenge");
                            challenge.setRequestId(eVar.getRequestId());
                        }
                    }
                }
            }
            if (dVar.getFeedType() == 65457) {
                for (Music music : dVar.f70530d) {
                    if (music != null) {
                        music.setRequestId(eVar.getRequestId());
                    }
                }
            }
            if (dVar.getFeedType() == 65463) {
                for (SearchCommodity searchCommodity : dVar.f70537k) {
                    if (searchCommodity != null) {
                        Commodity commodity = searchCommodity.getCommodity();
                        if (commodity != null) {
                            commodity.setLogPb(eVar.logPb);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m87381a(SearchUser searchUser, String str) {
        if (searchUser != null && !C6307b.m19566a((Collection<T>) searchUser.awemeCards)) {
            List<Aweme> arrayList = new ArrayList<>();
            int i = 0;
            List<Aweme> list = searchUser.awemeCards;
            C7573i.m23582a((Object) list, "searchUser.awemeCards");
            for (Aweme aweme : list) {
                if (aweme != null) {
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append(aweme.getAid());
                    sb.append(9);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), str, i);
                    Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                    C7573i.m23582a((Object) updateAweme, "updateAweme");
                    arrayList.add(updateAweme);
                }
                i++;
            }
            searchUser.awemeCards = arrayList;
        }
    }

    /* renamed from: a */
    private static void m87380a(C26754d dVar, C26755e eVar, int i) {
        Aweme aweme = dVar.getAweme();
        if (C29448a.m96898a(aweme)) {
            Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
            StringBuilder sb = new StringBuilder();
            if (updateAweme == null) {
                C7573i.m23580a();
            }
            sb.append(updateAweme.getAid());
            sb.append(9);
            iRequestIdService.setRequestIdAndIndex(sb.toString(), eVar.getRequestId(), i);
            dVar.setAweme(updateAweme);
            eVar.f70555d.set(i, dVar);
            updateAweme.setRequestId(eVar.getRequestId());
            if (updateAweme.getAwemeType() == 13) {
                Aweme forwardItem = updateAweme.getForwardItem();
                if (forwardItem != null) {
                    forwardItem.setRepostFromGroupId(updateAweme.getAid());
                    forwardItem.setRepostFromUserId(updateAweme.getAuthorUid());
                    Aweme updateAweme2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(forwardItem);
                    IRequestIdService iRequestIdService2 = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb2 = new StringBuilder();
                    if (updateAweme2 == null) {
                        C7573i.m23580a();
                    }
                    sb2.append(updateAweme2.getAid());
                    sb2.append(1);
                    iRequestIdService2.setRequestIdAndIndex(sb2.toString(), eVar.getRequestId(), i);
                    updateAweme2.setRequestId(eVar.getRequestId());
                }
            }
        }
    }
}
