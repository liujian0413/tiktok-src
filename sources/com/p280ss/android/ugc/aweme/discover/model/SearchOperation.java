package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperation */
public final class SearchOperation implements Serializable {
    @C6593c(mo15949a = "banner")
    private UrlModel banner;
    @C6593c(mo15949a = "activity_id")
    private String cardId;
    @C6593c(mo15949a = "link_desc")
    private String desc;
    @C6593c(mo15949a = "link_url")
    private String link;
    private boolean recorded;
    @C6593c(mo15949a = "title")
    private String title;

    public static /* synthetic */ SearchOperation copy$default(SearchOperation searchOperation, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchOperation.title;
        }
        if ((i & 2) != 0) {
            str2 = searchOperation.desc;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = searchOperation.link;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            urlModel = searchOperation.banner;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 16) != 0) {
            str4 = searchOperation.cardId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = searchOperation.recorded;
        }
        return searchOperation.copy(str, str5, str6, urlModel2, str7, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.desc;
    }

    public final String component3() {
        return this.link;
    }

    public final UrlModel component4() {
        return this.banner;
    }

    public final String component5() {
        return this.cardId;
    }

    public final boolean component6() {
        return this.recorded;
    }

    public final SearchOperation copy(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "desc");
        C7573i.m23587b(str3, "link");
        C7573i.m23587b(urlModel, "banner");
        C7573i.m23587b(str4, "cardId");
        SearchOperation searchOperation = new SearchOperation(str, str2, str3, urlModel, str4, z);
        return searchOperation;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchOperation) {
                SearchOperation searchOperation = (SearchOperation) obj;
                if (C7573i.m23585a((Object) this.title, (Object) searchOperation.title) && C7573i.m23585a((Object) this.desc, (Object) searchOperation.desc) && C7573i.m23585a((Object) this.link, (Object) searchOperation.link) && C7573i.m23585a((Object) this.banner, (Object) searchOperation.banner) && C7573i.m23585a((Object) this.cardId, (Object) searchOperation.cardId)) {
                    if (this.recorded == searchOperation.recorded) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getBanner() {
        return this.banner;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getLink() {
        return this.link;
    }

    public final boolean getRecorded() {
        return this.recorded;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.link;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.banner;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.cardId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.recorded;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchOperation(title=");
        sb.append(this.title);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(", recorded=");
        sb.append(this.recorded);
        sb.append(")");
        return sb.toString();
    }

    public final void setRecorded(boolean z) {
        this.recorded = z;
    }

    public final void setBanner(UrlModel urlModel) {
        C7573i.m23587b(urlModel, "<set-?>");
        this.banner = urlModel;
    }

    public final void setCardId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.cardId = str;
    }

    public final void setDesc(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.desc = str;
    }

    public final void setLink(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.link = str;
    }

    public final void setTitle(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.title = str;
    }

    public SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "desc");
        C7573i.m23587b(str3, "link");
        C7573i.m23587b(urlModel, "banner");
        C7573i.m23587b(str4, "cardId");
        this.title = str;
        this.desc = str2;
        this.link = str3;
        this.banner = urlModel;
        this.cardId = str4;
        this.recorded = z;
    }

    public /* synthetic */ SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, int i, C7571f fVar) {
        boolean z2;
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str3, urlModel, str4, z2);
    }
}
