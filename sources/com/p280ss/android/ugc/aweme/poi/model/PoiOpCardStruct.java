package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiOpCardStruct */
public final class PoiOpCardStruct implements Serializable {
    @C6593c(mo15949a = "card_id")
    private String cardId;
    @C6593c(mo15949a = "cover")
    private final UrlModel cover;
    @C6593c(mo15949a = "description")
    private String description;
    @C6593c(mo15949a = "location_index")
    private long locationIndex;
    @C6593c(mo15949a = "schema")
    private String schema;
    @C6593c(mo15949a = "title")
    private String title;

    public static /* synthetic */ PoiOpCardStruct copy$default(PoiOpCardStruct poiOpCardStruct, String str, UrlModel urlModel, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiOpCardStruct.title;
        }
        if ((i & 2) != 0) {
            urlModel = poiOpCardStruct.cover;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 4) != 0) {
            str2 = poiOpCardStruct.description;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            j = poiOpCardStruct.locationIndex;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str3 = poiOpCardStruct.schema;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = poiOpCardStruct.cardId;
        }
        return poiOpCardStruct.copy(str, urlModel2, str5, j2, str6, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final UrlModel component2() {
        return this.cover;
    }

    public final String component3() {
        return this.description;
    }

    public final long component4() {
        return this.locationIndex;
    }

    public final String component5() {
        return this.schema;
    }

    public final String component6() {
        return this.cardId;
    }

    public final PoiOpCardStruct copy(String str, UrlModel urlModel, String str2, long j, String str3, String str4) {
        PoiOpCardStruct poiOpCardStruct = new PoiOpCardStruct(str, urlModel, str2, j, str3, str4);
        return poiOpCardStruct;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiOpCardStruct) {
                PoiOpCardStruct poiOpCardStruct = (PoiOpCardStruct) obj;
                if (C7573i.m23585a((Object) this.title, (Object) poiOpCardStruct.title) && C7573i.m23585a((Object) this.cover, (Object) poiOpCardStruct.cover) && C7573i.m23585a((Object) this.description, (Object) poiOpCardStruct.description)) {
                    if (!(this.locationIndex == poiOpCardStruct.locationIndex) || !C7573i.m23585a((Object) this.schema, (Object) poiOpCardStruct.schema) || !C7573i.m23585a((Object) this.cardId, (Object) poiOpCardStruct.cardId)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getLocationIndex() {
        return this.locationIndex;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.cover;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.locationIndex;
        int i2 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.schema;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cardId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiOpCardStruct(title=");
        sb.append(this.title);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", locationIndex=");
        sb.append(this.locationIndex);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(")");
        return sb.toString();
    }

    public final void setCardId(String str) {
        this.cardId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setLocationIndex(long j) {
        this.locationIndex = j;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public PoiOpCardStruct(String str, UrlModel urlModel, String str2, long j, String str3, String str4) {
        this.title = str;
        this.cover = urlModel;
        this.description = str2;
        this.locationIndex = j;
        this.schema = str3;
        this.cardId = str4;
    }
}
