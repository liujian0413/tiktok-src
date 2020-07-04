package com.p280ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.z */
public final class C26807z implements C26801u {

    /* renamed from: a */
    public static final C26807z f70733a = new C26807z();

    /* renamed from: b */
    private static final String[] f70734b = {"person", "tag", "music", "poi", "ecommerce"};

    /* renamed from: c */
    private static final String[] f70735c = {"user_list", "tag_list", "music_list", "poi_list", "ecommerce_list"};

    /* renamed from: d */
    private static HashSet<C26802v>[] f70736d = {new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>()};

    private C26807z() {
    }

    /* renamed from: a */
    public final void mo68584a(String str, String str2, String str3, boolean z, String str4) {
        String str5;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "toUserId");
        C7573i.m23587b(str3, "enterFrom");
        C7573i.m23587b(str4, "enterMethod");
        if (z) {
            str5 = SearchContext.m87922a(0);
        } else {
            str5 = SearchContext.m87922a(3);
        }
        Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("enter_method", str4).mo59973a("to_user_id", str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str5)).mo59973a("search_result_id", SearchContext.m87930c()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m88008a(str, map);
    }

    /* renamed from: a */
    public final void mo68583a(String str, String str2, String str3, boolean z) {
        String str4;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "musicId");
        if (z) {
            str4 = SearchContext.m87922a(1);
        } else {
            str4 = SearchContext.m87922a(3);
        }
        Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("music_id", str3).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str4)).mo59973a("search_result_id", SearchContext.m87930c()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m88008a(str, map);
    }

    /* renamed from: a */
    private static void m88007a() {
        for (HashSet<C26802v> clear : f70736d) {
            clear.clear();
        }
    }

    /* renamed from: a */
    public final String mo68588a(String str) {
        C7573i.m23587b(str, "labelName");
        int b = m88010b(str);
        if (b < 0) {
            return "";
        }
        String a = SearchContext.m87922a(b);
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* renamed from: b */
    private static int m88010b(String str) {
        switch (str.hashCode()) {
            case 111178:
                if (str.equals("poi")) {
                    return 5;
                }
                break;
            case 114586:
                if (str.equals("tag")) {
                    return 2;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    return 0;
                }
                break;
            case 104263205:
                if (str.equals("music")) {
                    return 1;
                }
                break;
            case 998835423:
                if (str.equals("general_search")) {
                    return 3;
                }
                break;
            case 1528280640:
                if (str.equals("ecommerce")) {
                    return 7;
                }
                break;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m88009a(java.util.List<? extends T> r7) {
        /*
            if (r7 == 0) goto L_0x00ed
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r0 = -1
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.discover.mixfeed.d r1 = (com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d) r1
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r2 = r1.f70528b
            m88009a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchChallenge> r2 = r1.f70531e
            m88009a(r2)
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r2 = r1.f70530d
            m88009a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r2 = r1.f70535i
            m88009a(r2)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchCommodity> r2 = r1.f70537k
            m88009a(r2)
            com.ss.android.ugc.aweme.discover.model.SearchMovie r1 = r1.f70538l
            java.util.List r1 = kotlin.collections.C7525m.m23457a(r1)
            m88009a(r1)     // Catch:{ Throwable -> 0x00ee }
            goto L_0x00e1
        L_0x0041:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchUser
            if (r2 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.discover.mob.v r6 = new com.ss.android.ugc.aweme.discover.mob.v
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = (com.p280ss.android.ugc.aweme.discover.model.SearchUser) r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.user
            java.lang.String r2 = "it.user"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = r0.getUid()
            java.lang.String r2 = "it.user.uid"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r1 = r1.isAladdin()
            r6.<init>(r0, r1)
            r0 = 0
            goto L_0x00e1
        L_0x0063:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchChallenge
            if (r2 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.discover.mob.v r0 = new com.ss.android.ugc.aweme.discover.mob.v
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r1 = (com.p280ss.android.ugc.aweme.discover.model.SearchChallenge) r1
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r1.getChallenge()
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r1.getCid()
            if (r1 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r1 = ""
        L_0x0079:
            r0.<init>(r1, r5, r4, r6)
            r6 = r0
        L_0x007d:
            r0 = 1
            goto L_0x00e1
        L_0x007f:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.music.model.Music
            if (r2 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.discover.mob.v r0 = new com.ss.android.ugc.aweme.discover.mob.v
            com.ss.android.ugc.aweme.music.model.Music r1 = (com.p280ss.android.ugc.aweme.music.model.Music) r1
            java.lang.String r1 = r1.getMid()
            java.lang.String r2 = "it.mid"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.<init>(r1, r5, r4, r6)
            r6 = r0
            r0 = 2
            goto L_0x00e1
        L_0x0096:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchPoi
            if (r2 == 0) goto L_0x00b4
            r0 = 3
            com.ss.android.ugc.aweme.discover.mob.v r2 = new com.ss.android.ugc.aweme.discover.mob.v
            com.ss.android.ugc.aweme.discover.model.SearchPoi r1 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoi) r1
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r1 = r1.poi
            java.lang.String r3 = "it.poi"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.String r1 = r1.getPoiId()
            java.lang.String r3 = "it.poi.poiId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r2.<init>(r1, r5, r4, r6)
        L_0x00b2:
            r6 = r2
            goto L_0x00e1
        L_0x00b4:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchCommodity
            if (r2 == 0) goto L_0x00c9
            r0 = 4
            com.ss.android.ugc.aweme.discover.mob.v r2 = new com.ss.android.ugc.aweme.discover.mob.v
            com.ss.android.ugc.aweme.discover.model.SearchCommodity r1 = (com.p280ss.android.ugc.aweme.discover.model.SearchCommodity) r1
            com.ss.android.ugc.aweme.discover.model.Commodity r1 = r1.getCommodity()
            java.lang.String r1 = r1.getGid()
            r2.<init>(r1, r5, r4, r6)
            goto L_0x00b2
        L_0x00c9:
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchMovie
            if (r2 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.discover.model.SearchMovie r1 = (com.p280ss.android.ugc.aweme.discover.model.SearchMovie) r1
            com.ss.android.ugc.aweme.discover.model.Movie r0 = r1.getMovie()
            java.lang.String r0 = r0.getChallengeId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.discover.mob.v r6 = new com.ss.android.ugc.aweme.discover.mob.v
            r6.<init>(r0, r3)
            goto L_0x007d
        L_0x00e1:
            if (r6 == 0) goto L_0x0009
            java.util.HashSet<com.ss.android.ugc.aweme.discover.mob.v>[] r1 = f70736d
            r1 = r1[r0]
            r1.add(r6)
            goto L_0x0009
        L_0x00ec:
            return
        L_0x00ed:
            return
        L_0x00ee:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.mob.C26807z.m88009a(java.util.List):void");
    }

    /* renamed from: a */
    private static void m88008a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(map, "map");
        C6907h.m21525a(str, C33230ac.m107211a(map));
    }

    /* renamed from: b */
    public final void mo68592b(String str, String str2) {
        String str3;
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "keyWord");
        String str4 = "search_rating_show";
        C22984d a = C22984d.m75611a();
        String str5 = "enter_from";
        if (TextUtils.equals(str, "general_search")) {
            str3 = "general_search";
        } else {
            str3 = "search_result";
        }
        C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).mo59973a("search_keyword", str2).mo59973a("search_id", mo68588a(str)).f60753a);
    }

    /* renamed from: a */
    public final void mo68589a(String str, String str2) {
        HashSet<C26802v>[] hashSetArr;
        String str3;
        String str4;
        C7573i.m23587b(str, "labelName");
        C7573i.m23587b(str2, POIService.KEY_KEYWORD);
        int b = m88010b(str);
        if (b >= 0) {
            String a = SearchContext.m87922a(b);
            int i = 0;
            for (Iterable<C26802v> iterable : f70736d) {
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((C26802v) next).f70729b) {
                        arrayList.add(next);
                    }
                }
                for (C26802v vVar : (List) arrayList) {
                    CharSequence charSequence = str;
                    if (TextUtils.equals(charSequence, "general_search")) {
                        C7573i.m23585a((Object) f70735c[i], (Object) "user_list");
                    } else {
                        C22984d a2 = C22984d.m75611a();
                        String str5 = "enter_from";
                        if (TextUtils.equals(charSequence, "general_search")) {
                            str4 = "general_search";
                        } else {
                            str4 = "search_result";
                        }
                        Map<String, String> map = a2.mo59973a(str5, str4).mo59973a("token_type", f70734b[i]).mo59973a(f70735c[i], vVar.f70728a).mo59973a("search_keyword", str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(a)).mo59973a("search_id", a).mo59970a("is_aladdin", 1).f60753a;
                        C7573i.m23582a((Object) map, "builder.builder()");
                        m88008a("search_result_show", map);
                    }
                }
                Collection arrayList2 = new ArrayList();
                for (Object next2 : iterable) {
                    if (!((C26802v) next2).f70729b) {
                        arrayList2.add(next2);
                    }
                }
                if (((List) arrayList2).size() > 0) {
                    C22984d a3 = C22984d.m75611a();
                    String str6 = "enter_from";
                    if (TextUtils.equals(str, "general_search")) {
                        str3 = "general_search";
                    } else {
                        str3 = "search_result";
                    }
                    C22984d a4 = a3.mo59973a(str6, str3).mo59973a("token_type", f70734b[i]);
                    String str7 = f70735c[i];
                    Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (C26802v vVar2 : iterable) {
                        arrayList3.add(vVar2.f70728a);
                    }
                    C22984d a5 = a4.mo59973a(str7, ((List) arrayList3).toString()).mo59973a("search_keyword", str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(a));
                    String str8 = "is_aladdin";
                    Collection arrayList4 = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (C26802v vVar3 : iterable) {
                        arrayList4.add(Integer.valueOf(vVar3.f70729b ? 1 : 0));
                    }
                    Map<String, String> map2 = a5.mo59973a(str8, ((List) arrayList4).toString()).f60753a;
                    C7573i.m23582a((Object) map2, "builder.builder()");
                    m88008a("search_result_show", map2);
                }
                i++;
            }
            m88007a();
        }
    }

    /* renamed from: b */
    public final void mo68593b(String str, String str2, int i) {
        String str3;
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "keyWord");
        String str4 = "search_enter_feedback";
        C22984d a = C22984d.m75611a();
        String str5 = "enter_from";
        if (TextUtils.equals(str, "general_search")) {
            str3 = "general_search";
        } else {
            str3 = "search_result";
        }
        C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).mo59973a("search_keyword", str2).mo59973a("search_id", mo68588a(str)).mo59970a("rating", 0).f60753a);
    }

    /* renamed from: a */
    public final void mo68590a(String str, String str2, int i) {
        String str3;
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "keyWord");
        String str4 = "search_rating_result";
        C22984d a = C22984d.m75611a();
        String str5 = "enter_from";
        if (TextUtils.equals(str, "general_search")) {
            str3 = "general_search";
        } else {
            str3 = "search_result";
        }
        C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).mo59973a("search_keyword", str2).mo59973a("search_id", mo68588a(str)).mo59970a("rating", i).f60753a);
    }

    /* renamed from: a */
    public final void mo68582a(String str, Aweme aweme, String str2, boolean z) {
        String str3;
        String str4;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        String a = SearchContext.m87922a(SearchContext.m87931d());
        C22984d a2 = C22984d.m75611a().mo59973a("enter_from", str2);
        String str5 = "group_id";
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        C22984d a3 = a2.mo59973a(str5, str3).mo59973a("log_pb", C28199ae.m92689a().mo71791a(a));
        String str6 = "search_type";
        if (C7573i.m23585a((Object) SearchContext.m87932e(), (Object) "general_search")) {
            str4 = "general";
        } else {
            str4 = SearchContext.m87932e();
        }
        Map<String, String> map = a3.mo59973a(str6, str4).mo59973a("search_result_id", SearchContext.m87930c()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m88008a(str, map);
    }

    /* renamed from: c */
    public final void mo68595c(String str, String str2, String str3, boolean z) {
        String str4;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "poiId");
        if (z) {
            str4 = SearchContext.m87922a(5);
        } else {
            str4 = SearchContext.m87922a(3);
        }
        Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("poi_id", str3).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str4)).mo59973a("search_result_id", SearchContext.m87930c()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m88008a(str, map);
    }

    /* renamed from: b */
    public final void mo68594b(String str, String str2, String str3, boolean z) {
        String str4;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "tagId");
        if (z) {
            str4 = SearchContext.m87922a(2);
        } else {
            str4 = SearchContext.m87922a(3);
        }
        Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("tag_id", str3).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str4)).mo59973a("search_result_id", SearchContext.m87930c()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        m88008a(str, map);
    }

    /* renamed from: a */
    public final void mo68591a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "labelName");
        C7573i.m23587b(str3, "searchKeyWord");
        C7573i.m23587b(str4, "musicId");
        String a = mo68588a(str2);
        String uuid = UUID.randomUUID().toString();
        C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
        String a2 = C28199ae.m92689a().mo71791a(a);
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("enter_method", "click_search_result").mo59973a("shoot_way", "search_music").mo59973a("log_pb", a2).mo59973a("music_id", str4).mo59973a("search_id", a).mo59973a("creation_id", uuid).f60753a);
        C6907h.m21524a("search_result_click", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("token_type", "music").mo59973a("search_keyword", str3).mo59973a("log_pb", a2).mo59973a("is_aladdin", "0").mo59973a("music_list", str4).f60753a);
    }
}
