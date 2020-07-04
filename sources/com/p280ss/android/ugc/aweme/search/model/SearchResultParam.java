package com.p280ss.android.ugc.aweme.search.model;

import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParam */
public class SearchResultParam implements Serializable {
    private String enterFrom = "";
    private String enterMethod;
    private FilterOption filterOption;
    private String guideSearchBaseWord;
    private int index;
    private int intermediatePageIndex;
    private boolean isAd;
    private boolean isOpenNewSearchContainer;
    private boolean isTrending;
    private String itemIdList;
    private String keyword;
    private String outAwemeId;
    private int position;
    private String previousPage;
    private int rankInList;
    private String realSearchWord;
    private int searchFrom;
    private String source;

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public FilterOption getFilterOption() {
        return this.filterOption;
    }

    public int getIndex() {
        return this.index;
    }

    public int getIntermediatePageIndex() {
        return this.intermediatePageIndex;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getOutAwemeId() {
        return this.outAwemeId;
    }

    public int getPosition() {
        return this.position;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public int getRankInList() {
        return this.rankInList;
    }

    public String getRealSearchWord() {
        return this.realSearchWord;
    }

    public int getSearchFrom() {
        return this.searchFrom;
    }

    public String getSource() {
        return this.source;
    }

    public boolean getTrending() {
        return this.isTrending;
    }

    public boolean isAd() {
        return this.isAd;
    }

    public boolean isOpenNewSearchContainer() {
        return this.isOpenNewSearchContainer;
    }

    public boolean fromGuideSearch() {
        if (9 == this.searchFrom) {
            return true;
        }
        return false;
    }

    public String getGuideSearchBaseWord() {
        if (this.guideSearchBaseWord == null) {
            return this.keyword;
        }
        return this.guideSearchBaseWord;
    }

    public SearchResultParam setAd(boolean z) {
        this.isAd = z;
        return this;
    }

    public SearchResultParam setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public SearchResultParam setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public SearchResultParam setFilterOption(FilterOption filterOption2) {
        this.filterOption = filterOption2;
        return this;
    }

    public SearchResultParam setGuideSearchBaseWord(String str) {
        this.guideSearchBaseWord = str;
        return this;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public SearchResultParam setIntermediatePageIndex(int i) {
        this.intermediatePageIndex = i;
        return this;
    }

    public SearchResultParam setItemIdList(String str) {
        this.itemIdList = str;
        return this;
    }

    public SearchResultParam setKeyword(String str) {
        this.keyword = str;
        return this;
    }

    public SearchResultParam setOpenNewSearchContainer(boolean z) {
        this.isOpenNewSearchContainer = z;
        return this;
    }

    public SearchResultParam setOutAwemeId(String str) {
        this.outAwemeId = str;
        return this;
    }

    public SearchResultParam setPosition(int i) {
        this.position = i;
        return this;
    }

    public SearchResultParam setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public void setRankInList(int i) {
        this.rankInList = i;
    }

    public SearchResultParam setRealSearchWord(String str) {
        this.realSearchWord = str;
        return this;
    }

    public SearchResultParam setSearchFrom(int i) {
        this.searchFrom = i;
        return this;
    }

    public SearchResultParam setSource(String str) {
        this.source = str;
        return this;
    }

    public SearchResultParam setTrending(Boolean bool) {
        this.isTrending = bool.booleanValue();
        return this;
    }
}
