package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DeleteSearchHistory */
public final class DeleteSearchHistory extends BaseCommonJavaMethod {
    public DeleteSearchHistory() {
    }

    public DeleteSearchHistory(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    private static JSONObject m88227a(SearchHistoryManager searchHistoryManager) {
        C7573i.m23587b(searchHistoryManager, "model");
        List<SearchHistory> searchHistory = searchHistoryManager.getSearchHistory();
        C7573i.m23582a((Object) searchHistory, "model.searchHistory");
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory2 : searchHistory) {
            C7573i.m23582a((Object) searchHistory2, "v");
            jSONArray.put(searchHistory2.keyword);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("history_array", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject == null) {
            try {
                C7573i.m23580a();
            } catch (Exception e) {
                C27064b.m88836a(e, "DeleteSearchHistory");
                aVar.mo71362a(-1, e.getMessage());
                return;
            }
        }
        String string = jSONObject.getString("type");
        SearchHistoryManager inst = SearchHistoryManager.inst();
        if (C7573i.m23585a((Object) string, (Object) "0")) {
            inst.clearSearchHistory();
            C7573i.m23582a((Object) inst, "model");
            aVar.mo71363a((Object) m88227a(inst));
            return;
        }
        inst.deleteSearchHistory(new SearchHistory(jSONObject.getString(POIService.KEY_KEYWORD), 0));
        C7573i.m23582a((Object) inst, "model");
        aVar.mo71363a((Object) m88227a(inst));
    }
}
