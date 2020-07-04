package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.app.C22898bh;
import com.p280ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p280ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26575b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SearchKeywordChangeMethod */
public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod {
    public SearchKeywordChangeMethod() {
    }

    public SearchKeywordChangeMethod(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            try {
                int i = jSONObject.getInt("searchFrom");
                String string = jSONObject.getString("enterFrom");
                String string2 = jSONObject.getString(POIService.KEY_KEYWORD);
                String string3 = jSONObject.getString("type");
                SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(i).setKeyword(string2).setEnterFrom(string);
                C7573i.m23582a((Object) enterFrom, "param");
                C42961az.m136380a(new C26575b(enterFrom));
                SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                if (searchTabViewModel != null) {
                    NextLiveData<C22898bh> nextLiveData = searchTabViewModel.tabInfo;
                    if (nextLiveData != null) {
                        if (string3 == null) {
                            C7573i.m23580a();
                        }
                        nextLiveData.setValue(new C22898bh(string3));
                    }
                }
            } catch (Exception e) {
                C27064b.m88836a(e, "SearchKeywordChangeMethod");
                aVar.mo71362a(0, e.getMessage());
                return;
            }
        }
        aVar.mo71363a((Object) new JSONArray());
    }
}
