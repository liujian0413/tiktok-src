package com.p280ss.android.ugc.aweme.commerce.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct */
public final class CommerceActivityStruct implements Serializable {
    @C6593c(mo15949a = "act_type")
    public int actType;
    public String authorId;
    @C6593c(mo15949a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @C6593c(mo15949a = "end_time")
    public long endTime;
    public String enterFrom;
    public String groupId;
    @C6593c(mo15949a = "image")
    public UrlModel image;
    @C6593c(mo15949a = "jump_open_url")
    public String jumpOpenUrl;
    @C6593c(mo15949a = "jump_web_url")
    public String jumpWebUrl;
    @C6593c(mo15949a = "start_time")
    public long startTime;
    @C6593c(mo15949a = "time_range")
    public List<ActivityTimeRange> timeRange;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "track_url_list")
    public UrlModel trackUrlList;

    public CommerceActivityStruct() {
    }

    public static /* synthetic */ CommerceActivityStruct copy$default(CommerceActivityStruct commerceActivityStruct, int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i2, Object obj) {
        CommerceActivityStruct commerceActivityStruct2 = commerceActivityStruct;
        int i3 = i2;
        return commerceActivityStruct.copy((i3 & 1) != 0 ? commerceActivityStruct2.actType : i, (i3 & 2) != 0 ? commerceActivityStruct2.image : urlModel, (i3 & 4) != 0 ? commerceActivityStruct2.jumpWebUrl : str, (i3 & 8) != 0 ? commerceActivityStruct2.jumpOpenUrl : str2, (i3 & 16) != 0 ? commerceActivityStruct2.title : str3, (i3 & 32) != 0 ? commerceActivityStruct2.startTime : j, (i3 & 64) != 0 ? commerceActivityStruct2.endTime : j2, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? commerceActivityStruct2.timeRange : list, (i3 & 256) != 0 ? commerceActivityStruct2.trackUrlList : urlModel2, (i3 & 512) != 0 ? commerceActivityStruct2.clickTrackUrlList : urlModel3, (i3 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commerceActivityStruct2.groupId : str4, (i3 & 2048) != 0 ? commerceActivityStruct2.authorId : str5, (i3 & 4096) != 0 ? commerceActivityStruct2.enterFrom : str6);
    }

    public final int component1() {
        return this.actType;
    }

    public final UrlModel component10() {
        return this.clickTrackUrlList;
    }

    public final String component11() {
        return this.groupId;
    }

    public final String component12() {
        return this.authorId;
    }

    public final String component13() {
        return this.enterFrom;
    }

    public final UrlModel component2() {
        return this.image;
    }

    public final String component3() {
        return this.jumpWebUrl;
    }

    public final String component4() {
        return this.jumpOpenUrl;
    }

    public final String component5() {
        return this.title;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final List<ActivityTimeRange> component8() {
        return this.timeRange;
    }

    public final UrlModel component9() {
        return this.trackUrlList;
    }

    public final CommerceActivityStruct copy(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List<ActivityTimeRange> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        String str7 = str;
        C7573i.m23587b(str7, "jumpWebUrl");
        String str8 = str2;
        C7573i.m23587b(str8, "jumpOpenUrl");
        String str9 = str3;
        C7573i.m23587b(str9, "title");
        CommerceActivityStruct commerceActivityStruct = new CommerceActivityStruct(i, urlModel, str7, str8, str9, j, j2, list, urlModel2, urlModel3, str4, str5, str6);
        return commerceActivityStruct;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceActivityStruct) {
                CommerceActivityStruct commerceActivityStruct = (CommerceActivityStruct) obj;
                if ((this.actType == commerceActivityStruct.actType) && C7573i.m23585a((Object) this.image, (Object) commerceActivityStruct.image) && C7573i.m23585a((Object) this.jumpWebUrl, (Object) commerceActivityStruct.jumpWebUrl) && C7573i.m23585a((Object) this.jumpOpenUrl, (Object) commerceActivityStruct.jumpOpenUrl) && C7573i.m23585a((Object) this.title, (Object) commerceActivityStruct.title)) {
                    if (this.startTime == commerceActivityStruct.startTime) {
                        if (!(this.endTime == commerceActivityStruct.endTime) || !C7573i.m23585a((Object) this.timeRange, (Object) commerceActivityStruct.timeRange) || !C7573i.m23585a((Object) this.trackUrlList, (Object) commerceActivityStruct.trackUrlList) || !C7573i.m23585a((Object) this.clickTrackUrlList, (Object) commerceActivityStruct.clickTrackUrlList) || !C7573i.m23585a((Object) this.groupId, (Object) commerceActivityStruct.groupId) || !C7573i.m23585a((Object) this.authorId, (Object) commerceActivityStruct.authorId) || !C7573i.m23585a((Object) this.enterFrom, (Object) commerceActivityStruct.enterFrom)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getActType() {
        return this.actType;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getJumpOpenUrl() {
        return this.jumpOpenUrl;
    }

    public final String getJumpWebUrl() {
        return this.jumpWebUrl;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final List<ActivityTimeRange> getTimeRange() {
        return this.timeRange;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final int hashCode() {
        int i = this.actType * 31;
        UrlModel urlModel = this.image;
        int i2 = 0;
        int hashCode = (i + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.jumpWebUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.jumpOpenUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.startTime;
        int i3 = (hashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<ActivityTimeRange> list = this.timeRange;
        int hashCode5 = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        int hashCode6 = (hashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.clickTrackUrlList;
        int hashCode7 = (hashCode6 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str4 = this.groupId;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.authorId;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceActivityStruct(actType=");
        sb.append(this.actType);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", jumpWebUrl=");
        sb.append(this.jumpWebUrl);
        sb.append(", jumpOpenUrl=");
        sb.append(this.jumpOpenUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", timeRange=");
        sb.append(this.timeRange);
        sb.append(", trackUrlList=");
        sb.append(this.trackUrlList);
        sb.append(", clickTrackUrlList=");
        sb.append(this.clickTrackUrlList);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(")");
        return sb.toString();
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public CommerceActivityStruct(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List<ActivityTimeRange> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        C7573i.m23587b(str, "jumpWebUrl");
        C7573i.m23587b(str2, "jumpOpenUrl");
        C7573i.m23587b(str3, "title");
        this.actType = i;
        this.image = urlModel;
        this.jumpWebUrl = str7;
        this.jumpOpenUrl = str8;
        this.title = str9;
        this.startTime = j;
        this.endTime = j2;
        this.timeRange = list;
        this.trackUrlList = urlModel2;
        this.clickTrackUrlList = urlModel3;
        this.groupId = str4;
        this.authorId = str5;
        this.enterFrom = str6;
    }

    public /* synthetic */ CommerceActivityStruct(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i2, C7571f fVar) {
        String str7;
        String str8;
        String str9;
        if ((i2 & 4) != 0) {
            str7 = "";
        } else {
            str7 = str;
        }
        if ((i2 & 8) != 0) {
            str8 = "";
        } else {
            str8 = str2;
        }
        if ((i2 & 16) != 0) {
            str9 = "";
        } else {
            str9 = str3;
        }
        this(i, urlModel, str7, str8, str9, j, j2, list, urlModel2, urlModel3, str4, str5, str6);
    }
}
