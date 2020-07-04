package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26580g;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistoryManager */
public class SearchHistoryManager {
    private static SearchHistoryManager sManager;

    public void clearForAccountChange() {
        if (C37380c.m119974a()) {
            clearSearchHistory();
        }
    }

    public void clearSearchHistory() {
        setSearchHistory(new ArrayList());
    }

    public List<SearchHistory> getSearchHistory() {
        return C23338f.m76567e().mo60628b("recent_history", SearchHistory.class);
    }

    public static SearchHistoryManager inst() {
        if (sManager == null) {
            synchronized (SearchHistoryManager.class) {
                if (sManager == null) {
                    sManager = new SearchHistoryManager();
                }
            }
        }
        return sManager;
    }

    SearchHistoryManager() {
        List searchHistory = getSearchHistory();
        if (!searchHistory.isEmpty()) {
            SearchHistory searchHistory2 = (SearchHistory) searchHistory.get(0);
            if (C37380c.m119974a()) {
                if (searchHistory2.type < 16) {
                    clearSearchHistory();
                }
            } else if (searchHistory2.type >= 16) {
                clearSearchHistory();
            }
        }
    }

    private void setSearchHistory(List<SearchHistory> list) {
        C23338f.m76567e().mo60631b("recent_history", (Object) list);
        C42961az.m136380a(new C26580g());
    }

    public void clearSearchHistory(int i) {
        List searchHistory = getSearchHistory();
        Iterator it = searchHistory.iterator();
        while (it.hasNext()) {
            if (((SearchHistory) it.next()).type == i) {
                it.remove();
            }
        }
        setSearchHistory(searchHistory);
    }

    public void deleteSearchHistory(SearchHistory searchHistory) {
        List searchHistory2 = getSearchHistory();
        Iterator it = searchHistory2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SearchHistory searchHistory3 = (SearchHistory) it.next();
            if (searchHistory3.type == searchHistory.type && TextUtils.equals(searchHistory3.keyword, searchHistory.keyword)) {
                it.remove();
                break;
            }
        }
        setSearchHistory(searchHistory2);
    }

    public List<SearchHistory> getSearchHistoryByType(int i) {
        ArrayList arrayList = new ArrayList();
        for (SearchHistory searchHistory : getSearchHistory()) {
            if (searchHistory.type == i) {
                arrayList.add(searchHistory);
            }
            if (i == 0 && !C37380c.m119978e() && C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 0 && arrayList.size() == 10) {
                break;
            }
        }
        return arrayList;
    }

    public void recordSearchHistory(SearchHistory searchHistory) {
        List searchHistory2 = getSearchHistory();
        Iterator it = searchHistory2.iterator();
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(searchHistory.type), Integer.valueOf(1));
        while (it.hasNext()) {
            SearchHistory searchHistory3 = (SearchHistory) it.next();
            if (searchHistory3.type != searchHistory.type || !TextUtils.equals(searchHistory3.keyword, searchHistory.keyword)) {
                Integer num = (Integer) hashMap.get(Integer.valueOf(searchHistory3.type));
                if (num == null) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(1));
                } else if (searchHistory3.type == 0 && num.intValue() < 20) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(num.intValue() + 1));
                } else if (num.intValue() < 10) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(num.intValue() + 1));
                } else {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
        searchHistory2.add(0, searchHistory);
        setSearchHistory(searchHistory2);
    }
}
