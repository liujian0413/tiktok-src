package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RoomType */
public final class RoomType implements Serializable {
    @C6593c(mo15949a = "cover_url")
    private final UrlModel coverUrl;
    @C6593c(mo15949a = "detail_url")
    private final String detailUrl;
    @C6593c(mo15949a = "hotel_id")
    private final long homeStayId;
    @C6593c(mo15949a = "hotel_name")
    private final String homeStayName;
    @C6593c(mo15949a = "price")
    private final long price;
    @C6593c(mo15949a = "roomtype_id")
    private final long roomTypeId;
    @C6593c(mo15949a = "roomtype_name")
    private final String roomTypeName;

    public static /* synthetic */ RoomType copy$default(RoomType roomType, long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3, int i, Object obj) {
        RoomType roomType2 = roomType;
        return roomType.copy((i & 1) != 0 ? roomType2.homeStayId : j, (i & 2) != 0 ? roomType2.homeStayName : str, (i & 4) != 0 ? roomType2.roomTypeId : j2, (i & 8) != 0 ? roomType2.roomTypeName : str2, (i & 16) != 0 ? roomType2.coverUrl : urlModel, (i & 32) != 0 ? roomType2.detailUrl : str3, (i & 64) != 0 ? roomType2.price : j3);
    }

    public final long component1() {
        return this.homeStayId;
    }

    public final String component2() {
        return this.homeStayName;
    }

    public final long component3() {
        return this.roomTypeId;
    }

    public final String component4() {
        return this.roomTypeName;
    }

    public final UrlModel component5() {
        return this.coverUrl;
    }

    public final String component6() {
        return this.detailUrl;
    }

    public final long component7() {
        return this.price;
    }

    public final RoomType copy(long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3) {
        String str4 = str;
        C7573i.m23587b(str, "homeStayName");
        String str5 = str2;
        C7573i.m23587b(str5, "roomTypeName");
        String str6 = str3;
        C7573i.m23587b(str6, "detailUrl");
        RoomType roomType = new RoomType(j, str4, j2, str5, urlModel, str6, j3);
        return roomType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomType) {
                RoomType roomType = (RoomType) obj;
                if ((this.homeStayId == roomType.homeStayId) && C7573i.m23585a((Object) this.homeStayName, (Object) roomType.homeStayName)) {
                    if ((this.roomTypeId == roomType.roomTypeId) && C7573i.m23585a((Object) this.roomTypeName, (Object) roomType.roomTypeName) && C7573i.m23585a((Object) this.coverUrl, (Object) roomType.coverUrl) && C7573i.m23585a((Object) this.detailUrl, (Object) roomType.detailUrl)) {
                        if (this.price == roomType.price) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final long getHomeStayId() {
        return this.homeStayId;
    }

    public final String getHomeStayName() {
        return this.homeStayName;
    }

    public final long getPrice() {
        return this.price;
    }

    public final long getRoomTypeId() {
        return this.roomTypeId;
    }

    public final String getRoomTypeName() {
        return this.roomTypeName;
    }

    public final int hashCode() {
        long j = this.homeStayId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.homeStayName;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.roomTypeId;
        int i3 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.roomTypeName;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.coverUrl;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.detailUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i4 = (hashCode3 + i2) * 31;
        long j3 = this.price;
        return i4 + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomType(homeStayId=");
        sb.append(this.homeStayId);
        sb.append(", homeStayName=");
        sb.append(this.homeStayName);
        sb.append(", roomTypeId=");
        sb.append(this.roomTypeId);
        sb.append(", roomTypeName=");
        sb.append(this.roomTypeName);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(")");
        return sb.toString();
    }

    public RoomType(long j, String str, long j2, String str2, UrlModel urlModel, String str3, long j3) {
        C7573i.m23587b(str, "homeStayName");
        C7573i.m23587b(str2, "roomTypeName");
        C7573i.m23587b(str3, "detailUrl");
        this.homeStayId = j;
        this.homeStayName = str;
        this.roomTypeId = j2;
        this.roomTypeName = str2;
        this.coverUrl = urlModel;
        this.detailUrl = str3;
        this.price = j3;
    }
}
