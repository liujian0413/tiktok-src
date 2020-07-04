package com.p280ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.C0063u;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.C7541d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel */
public final class SearchIntermediateViewModel extends C0063u implements C27012a {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "searchKeyword", "getSearchKeyword()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "intermediateState", "getIntermediateState()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "openSearchParam", "getOpenSearchParam()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "searchTabIndex", "getSearchTabIndex()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "dismissKeyboard", "getDismissKeyboard()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateViewModel.class), "dismissKeyboardOnActionDown", "getDismissKeyboardOnActionDown()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};
    public static final Companion Companion = new Companion(null);
    private final C7541d dismissKeyboard$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$dismissKeyboard$2.INSTANCE);
    private final C7541d dismissKeyboardOnActionDown$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$dismissKeyboardOnActionDown$2.INSTANCE);
    private final C7541d intermediateState$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$intermediateState$2.INSTANCE);
    private final C7541d openSearchParam$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$openSearchParam$2.INSTANCE);
    private final C7541d searchKeyword$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchKeyword$2.INSTANCE);
    private final C7541d searchTabIndex$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchTabIndex$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final C23084b<Boolean> getDismissKeyboard() {
        return (C23084b) this.dismissKeyboard$delegate.getValue();
    }

    public final C23084b<Boolean> getDismissKeyboardOnActionDown() {
        return (C23084b) this.dismissKeyboardOnActionDown$delegate.getValue();
    }

    public final C23084b<Integer> getIntermediateState() {
        return (C23084b) this.intermediateState$delegate.getValue();
    }

    public final C23084b<SearchResultParam> getOpenSearchParam() {
        return (C23084b) this.openSearchParam$delegate.getValue();
    }

    public final C23084b<String> getSearchKeyword() {
        return (C23084b) this.searchKeyword$delegate.getValue();
    }

    public final C23084b<Integer> getSearchTabIndex() {
        return (C23084b) this.searchTabIndex$delegate.getValue();
    }

    public final void hideIntermediate() {
        getIntermediateState().setValue(Integer.valueOf(0));
    }

    public final void openSearchSquare() {
        getIntermediateState().setValue(Integer.valueOf(1));
    }

    public final boolean canDismissKeyboardOnActionDown() {
        Boolean bool = (Boolean) getDismissKeyboardOnActionDown().getValue();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void openSearch(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        if (!TextUtils.isEmpty(searchResultParam.getKeyword())) {
            getOpenSearchParam().setValue(searchResultParam);
            hideIntermediate();
        }
    }

    public final void openSearchSug(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        Integer num = (Integer) getIntermediateState().getValue();
        if (num == null || num.intValue() != 2 || !TextUtils.equals(str, (CharSequence) getSearchKeyword().getValue())) {
            getSearchKeyword().setValue(str);
            getIntermediateState().setValue(Integer.valueOf(2));
        }
    }

    public final void handleGuessWordItemClick(Word word, int i) {
        C7573i.m23587b(word, "word");
        SearchResultParam keyword = new SearchResultParam().setSearchFrom(16).setEnterFrom("recom_search").setOpenNewSearchContainer(C6399b.m19944t()).setKeyword(word.getWord());
        C7573i.m23582a((Object) keyword, "param");
        openSearch(keyword);
    }
}
