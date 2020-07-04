package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26740a;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26778c;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26779d;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.b */
public final class C26774b {
    /* renamed from: a */
    public static final void m87920a(Word word, int i, C26740a aVar) {
        String str;
        String str2;
        C7573i.m23587b(word, "$this$mobShow");
        if (!word.isShowed()) {
            String a = SearchContext.m87922a(3);
            String a2 = C28199ae.m92689a().mo71791a(a);
            String str3 = null;
            C26779d a3 = new C26779d(null, 1, null).mo68556a(word);
            if (aVar != null) {
                str = aVar.f70477b;
            } else {
                str = null;
            }
            C26779d f = a3.mo68560c(str).mo68558a("click_recom").mo68557a(Integer.valueOf(i)).mo68562e(a).mo68564g(a2).mo68563f(a);
            if (aVar != null) {
                str2 = aVar.f70478c;
            } else {
                str2 = null;
            }
            C26779d d = f.mo68561d(str2);
            C22984d a4 = C22984d.m75611a();
            String str4 = "trending_source";
            if (aVar != null) {
                TrendingSource trendingSource = aVar.f70479d;
                if (trendingSource != null) {
                    str3 = trendingSource.getKey();
                }
            }
            d.mo85246a(a4.mo59973a(str4, str3).f60753a).mo85252e();
            word.setShowed(true);
        }
    }

    /* renamed from: b */
    public static final void m87921b(Word word, int i, C26740a aVar) {
        String str;
        String str2;
        C7573i.m23587b(word, "$this$mobClick");
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        C26779d a3 = new C26778c().mo68556a(word);
        String str3 = null;
        if (aVar != null) {
            str = aVar.f70477b;
        } else {
            str = null;
        }
        C26779d f = a3.mo68560c(str).mo68558a("click_recom").mo68557a(Integer.valueOf(i)).mo68562e(a).mo68564g(a2).mo68563f(a);
        if (aVar != null) {
            str2 = aVar.f70478c;
        } else {
            str2 = null;
        }
        C26779d d = f.mo68561d(str2);
        C22984d a4 = C22984d.m75611a();
        String str4 = "trending_source";
        if (aVar != null) {
            TrendingSource trendingSource = aVar.f70479d;
            if (trendingSource != null) {
                str3 = trendingSource.getKey();
            }
        }
        d.mo85246a(a4.mo59973a(str4, str3).f60753a).mo85252e();
    }
}
