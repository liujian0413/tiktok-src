package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47984g;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.l */
public final class C35975l {

    /* renamed from: a */
    public static final C35975l f94147a = new C35975l();

    /* renamed from: b */
    private static Map<String, FeedItemList> f94148b = new LinkedHashMap();

    /* renamed from: c */
    private static int f94149c = -1;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.l$a */
    static final class C35976a<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ String f94150a;

        /* renamed from: b */
        final /* synthetic */ Aweme f94151b;

        C35976a(String str, Aweme aweme) {
            this.f94150a = str;
            this.f94151b = aweme;
        }

        public final void subscribe(C47870u<Object> uVar) {
            C7573i.m23587b(uVar, "emitter");
            FeedItemList a = C35975l.f94147a.mo90901a(this.f94150a);
            if (a == null) {
                a = new FeedItemList();
            }
            FeedItemList feedItemList = a;
            if (feedItemList.getItems() == null) {
                feedItemList.items = new ArrayList();
            }
            List items = feedItemList.getItems();
            C7573i.m23582a((Object) items, "result.items");
            List<Aweme> d = C7525m.m23509d((Collection<? extends T>) items);
            d.add(0, this.f94151b);
            feedItemList.items = d;
            C35975l.m115925a(feedItemList, this.f94150a, 20);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.l$b */
    static final class C35977b<T> implements C7326g<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ FeedItemList f94152a;

        /* renamed from: b */
        final /* synthetic */ String f94153b;

        /* renamed from: c */
        final /* synthetic */ int f94154c;

        C35977b(FeedItemList feedItemList, String str, int i) {
            this.f94152a = feedItemList;
            this.f94153b = str;
            this.f94154c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(FeedItemList feedItemList) {
            C35975l.m115925a(this.f94152a, this.f94153b, this.f94154c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.l$c */
    static final class C35978c<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ String f94155a;

        /* renamed from: b */
        final /* synthetic */ String f94156b;

        C35978c(String str, String str2) {
            this.f94155a = str;
            this.f94156b = str2;
        }

        public final void subscribe(C47870u<Object> uVar) {
            C7573i.m23587b(uVar, "emitter");
            FeedItemList a = C35975l.f94147a.mo90901a(this.f94155a);
            if (a != null && a.getItems() != null) {
                List items = a.getItems();
                C7573i.m23582a((Object) items, "result.items");
                Iterable iterable = items;
                boolean z = false;
                ArrayList arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (z) {
                        arrayList.add(next);
                    } else {
                        Aweme aweme = (Aweme) next;
                        C7573i.m23582a((Object) aweme, "it");
                        if (!C7573i.m23585a((Object) aweme.getAid(), (Object) this.f94156b)) {
                            arrayList.add(next);
                            z = true;
                        }
                    }
                }
                a.items = arrayList;
                C35975l.m115925a(a, this.f94155a, 20);
            }
        }
    }

    private C35975l() {
    }

    /* renamed from: c */
    private static String m115931c(String str) {
        C7573i.m23587b(str, "uid");
        C36074j jVar = C36074j.f94315a;
        StringBuilder sb = new StringBuilder("/aweme/v1/aweme/post/");
        sb.append(str);
        return jVar.hexDigest(sb.toString());
    }

    /* renamed from: b */
    private File m115928b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        File file = null;
        if (z) {
            return null;
        }
        File cacheDir = C6399b.m19921a().getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        if (cacheDir.exists()) {
            file = cacheDir;
        }
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(File.separator);
            sb.append("aweme_publish");
            new File(sb.toString()).mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cacheDir.getPath());
        sb2.append(File.separator);
        sb2.append(m115931c(str));
        return new File(sb2.toString());
    }

    /* renamed from: a */
    public final FeedItemList mo90901a(String str) {
        boolean z;
        String a;
        FeedItemList feedItemList = (FeedItemList) f94148b.get(str);
        if (feedItemList != null) {
            return feedItemList;
        }
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        File b = m115928b(str);
        if (b == null || !b.exists()) {
            return null;
        }
        synchronized (this) {
            a = C47984g.m148933a(b, null, 1, null);
        }
        if (a.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        try {
            FeedItemList feedItemList2 = (FeedItemList) C10944e.m32113a().mo15974a(a, FeedItemList.class);
            FeedItemList feedItemList3 = (FeedItemList) f94148b.get(str);
            if (feedItemList3 != null) {
                return feedItemList3;
            }
            if (str != null) {
                Map<String, FeedItemList> map = f94148b;
                C7573i.m23582a((Object) feedItemList2, "lastCacheFeedItemList");
                map.put(str, feedItemList2);
            }
            return feedItemList2;
        } catch (JsonSyntaxException unused) {
            return null;
        } catch (JsonIOException e) {
            C6921a.m21556a(a, (Exception) e);
            return null;
        } catch (UnsupportedOperationException e2) {
            C6921a.m21559a((Throwable) e2);
            return null;
        }
    }

    /* renamed from: a */
    public static void m115924a(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7492s.m23282a((C7495v<T>) new C35976a<T>(str, aweme)).mo19304b(C7333a.m23044b()).mo19333l();
    }

    /* renamed from: a */
    public static void m115927a(String str, String str2) {
        C7573i.m23587b(str, "aid");
        C7492s.m23282a((C7495v<T>) new C35978c<T>(str2, str)).mo19304b(C7333a.m23044b()).mo19333l();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m115929b(FeedItemList feedItemList, String str, int i) {
        C7573i.m23587b(feedItemList, "feedItemList");
        if (f94149c != feedItemList.size()) {
            C7492s.m23301b(feedItemList).mo19304b(C7333a.m23044b()).mo19294a(C7333a.m23044b()).mo19325f((C7326g<? super T>) new C35977b<Object>(feedItemList, str, i));
        }
    }

    /* renamed from: a */
    public static void m115925a(FeedItemList feedItemList, String str, int i) {
        C7573i.m23587b(feedItemList, "feedItemList");
        if (f94149c != feedItemList.size() && str != null) {
            File b = f94147a.m115928b(str);
            if (b != null) {
                FeedItemList clone = feedItemList.clone();
                List items = clone.getItems();
                C7573i.m23582a((Object) items, "items");
                clone.items = C7525m.m23505c((Iterable<? extends T>) items, i);
                Map<String, FeedItemList> map = f94148b;
                C7573i.m23582a((Object) clone, "saveFeedItemList");
                map.put(str, clone);
                f94149c = clone.size();
                String b2 = C10944e.m32113a().mo15979b((Object) clone);
                C7573i.m23582a((Object) b2, "Network.getGson().toJson(saveFeedItemList)");
                C47984g.m148935a(b, b2, null, 2, null);
            }
        }
    }
}
