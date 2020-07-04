package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ap */
public interface C27011ap {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ap$a */
    public interface C27012a {
        void handleGuessWordItemClick(Word word, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ap$b */
    public interface C27013b {
        /* renamed from: a */
        void mo68315a(HotSearchItem hotSearchItem, int i, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ap$c */
    public interface C27014c {
        /* renamed from: a */
        void mo69713a(SearchHistory searchHistory, int i);

        /* renamed from: b */
        void mo69716b(SearchHistory searchHistory, int i);

        /* renamed from: c */
        void mo69717c();

        /* renamed from: l */
        void mo69718l();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ap$d */
    public interface C27015d {
        /* renamed from: a */
        void mo69714a(SearchSugEntity searchSugEntity, String str, int i);
    }
}
