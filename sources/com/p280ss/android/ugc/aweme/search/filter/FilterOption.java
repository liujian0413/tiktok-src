package com.p280ss.android.ugc.aweme.search.filter;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.filter.FilterOption */
public final class FilterOption implements Serializable {
    private final int publishTime;
    private final int sortType;

    public static /* synthetic */ FilterOption copy$default(FilterOption filterOption, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = filterOption.sortType;
        }
        if ((i3 & 2) != 0) {
            i2 = filterOption.publishTime;
        }
        return filterOption.copy(i, i2);
    }

    public final int component1() {
        return this.sortType;
    }

    public final int component2() {
        return this.publishTime;
    }

    public final FilterOption copy(int i, int i2) {
        return new FilterOption(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FilterOption) {
                FilterOption filterOption = (FilterOption) obj;
                if (this.sortType == filterOption.sortType) {
                    if (this.publishTime == filterOption.publishTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getPublishTime() {
        return this.publishTime;
    }

    public final int getSortType() {
        return this.sortType;
    }

    public final int hashCode() {
        return (this.sortType * 31) + this.publishTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterOption(sortType=");
        sb.append(this.sortType);
        sb.append(", publishTime=");
        sb.append(this.publishTime);
        sb.append(")");
        return sb.toString();
    }

    public FilterOption(int i, int i2) {
        this.sortType = i;
        this.publishTime = i2;
    }
}
