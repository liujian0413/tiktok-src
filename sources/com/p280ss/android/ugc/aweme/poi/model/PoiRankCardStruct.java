package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiRankCardStruct */
public final class PoiRankCardStruct implements Serializable {
    @C6593c(mo15949a = "backend_type_code")
    private final String backendTypeCode;
    @C6593c(mo15949a = "backend_type_name")
    private final String backendTypeName;
    @C6593c(mo15949a = "city_code")
    private String cityCode;
    @C6593c(mo15949a = "city_name")
    private final String cityName;
    @C6593c(mo15949a = "class_code")
    private String classCode;
    @C6593c(mo15949a = "cover")
    private final UrlModel cover;
    @C6593c(mo15949a = "description")
    private String description;
    @C6593c(mo15949a = "location_index")
    private long locationIndex;
    @C6593c(mo15949a = "schema")
    private String schema;
    @C6593c(mo15949a = "sec_class_name")
    private String subClass;
    @C6593c(mo15949a = "title")
    private String title;

    public static /* synthetic */ PoiRankCardStruct copy$default(PoiRankCardStruct poiRankCardStruct, String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        PoiRankCardStruct poiRankCardStruct2 = poiRankCardStruct;
        int i2 = i;
        return poiRankCardStruct.copy((i2 & 1) != 0 ? poiRankCardStruct2.title : str, (i2 & 2) != 0 ? poiRankCardStruct2.cover : urlModel, (i2 & 4) != 0 ? poiRankCardStruct2.description : str2, (i2 & 8) != 0 ? poiRankCardStruct2.classCode : str3, (i2 & 16) != 0 ? poiRankCardStruct2.cityCode : str4, (i2 & 32) != 0 ? poiRankCardStruct2.locationIndex : j, (i2 & 64) != 0 ? poiRankCardStruct2.schema : str5, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? poiRankCardStruct2.subClass : str6, (i2 & 256) != 0 ? poiRankCardStruct2.backendTypeCode : str7, (i2 & 512) != 0 ? poiRankCardStruct2.cityName : str8, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? poiRankCardStruct2.backendTypeName : str9);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.cityName;
    }

    public final String component11() {
        return this.backendTypeName;
    }

    public final UrlModel component2() {
        return this.cover;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.classCode;
    }

    public final String component5() {
        return this.cityCode;
    }

    public final long component6() {
        return this.locationIndex;
    }

    public final String component7() {
        return this.schema;
    }

    public final String component8() {
        return this.subClass;
    }

    public final String component9() {
        return this.backendTypeCode;
    }

    public final PoiRankCardStruct copy(String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9) {
        PoiRankCardStruct poiRankCardStruct = new PoiRankCardStruct(str, urlModel, str2, str3, str4, j, str5, str6, str7, str8, str9);
        return poiRankCardStruct;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiRankCardStruct) {
                PoiRankCardStruct poiRankCardStruct = (PoiRankCardStruct) obj;
                if (C7573i.m23585a((Object) this.title, (Object) poiRankCardStruct.title) && C7573i.m23585a((Object) this.cover, (Object) poiRankCardStruct.cover) && C7573i.m23585a((Object) this.description, (Object) poiRankCardStruct.description) && C7573i.m23585a((Object) this.classCode, (Object) poiRankCardStruct.classCode) && C7573i.m23585a((Object) this.cityCode, (Object) poiRankCardStruct.cityCode)) {
                    if (!(this.locationIndex == poiRankCardStruct.locationIndex) || !C7573i.m23585a((Object) this.schema, (Object) poiRankCardStruct.schema) || !C7573i.m23585a((Object) this.subClass, (Object) poiRankCardStruct.subClass) || !C7573i.m23585a((Object) this.backendTypeCode, (Object) poiRankCardStruct.backendTypeCode) || !C7573i.m23585a((Object) this.cityName, (Object) poiRankCardStruct.cityName) || !C7573i.m23585a((Object) this.backendTypeName, (Object) poiRankCardStruct.backendTypeName)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getBackendTypeCode() {
        return this.backendTypeCode;
    }

    public final String getBackendTypeName() {
        return this.backendTypeName;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getClassCode() {
        return this.classCode;
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

    public final String getSubClass() {
        return this.subClass;
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
        String str3 = this.classCode;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cityCode;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j = this.locationIndex;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        String str5 = this.schema;
        int hashCode6 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.subClass;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.backendTypeCode;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.cityName;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.backendTypeName;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRankCardStruct(title=");
        sb.append(this.title);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", classCode=");
        sb.append(this.classCode);
        sb.append(", cityCode=");
        sb.append(this.cityCode);
        sb.append(", locationIndex=");
        sb.append(this.locationIndex);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", subClass=");
        sb.append(this.subClass);
        sb.append(", backendTypeCode=");
        sb.append(this.backendTypeCode);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", backendTypeName=");
        sb.append(this.backendTypeName);
        sb.append(")");
        return sb.toString();
    }

    public final void setCityCode(String str) {
        this.cityCode = str;
    }

    public final void setClassCode(String str) {
        this.classCode = str;
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

    public final void setSubClass(String str) {
        this.subClass = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public PoiRankCardStruct(String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9) {
        this.title = str;
        this.cover = urlModel;
        this.description = str2;
        this.classCode = str3;
        this.cityCode = str4;
        this.locationIndex = j;
        this.schema = str5;
        this.subClass = str6;
        this.backendTypeCode = str7;
        this.cityName = str8;
        this.backendTypeName = str9;
    }
}
