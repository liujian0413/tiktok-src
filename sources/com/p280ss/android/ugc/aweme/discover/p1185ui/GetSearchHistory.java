package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.GetSearchHistory */
public final class GetSearchHistory extends BaseCommonJavaMethod {
    public GetSearchHistory() {
    }

    public GetSearchHistory(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            SearchHistoryManager inst = SearchHistoryManager.inst();
            C7573i.m23582a((Object) inst, "model");
            List<SearchHistory> searchHistory = inst.getSearchHistory();
            C7573i.m23582a((Object) searchHistory, "model.searchHistory");
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory2 : searchHistory) {
                C7573i.m23582a((Object) searchHistory2, "v");
                jSONArray.put(searchHistory2.keyword);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("history_array", jSONArray);
            aVar.mo71363a((Object) jSONObject2);
        } catch (Exception e) {
            C27064b.m88836a(e, "GetSearchHistory");
            aVar.mo71362a(0, e.getMessage());
        }
    }
}
