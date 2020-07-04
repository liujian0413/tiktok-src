package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.model.NewYearWishResp */
public final class NewYearWishResp {
    @C6593c(mo15949a = "can_dig")
    public final int canDig;
    @C6593c(mo15949a = "can_show")
    public final int canShow;
    @C6593c(mo15949a = "content")
    public final String content;
    @C6593c(mo15949a = "dig_count")
    public final int diggCount;
    @C6593c(mo15949a = "icon_url")
    public final String iconUrl;
    @C6593c(mo15949a = "is_myself")
    public final int isMySelf;
    @C6593c(mo15949a = "is_reminded")
    public final int reminded;
    @C6593c(mo15949a = "reminder_count")
    public final int reminderCount;
    @C6593c(mo15949a = "is_sensitive_area")
    public final int sensitive;
    @C6593c(mo15949a = "status")
    public final int status;
    @C6593c(mo15949a = "status_code")
    public final int statusCode;
    @C6593c(mo15949a = "status_msg")
    public final String statusMsg;
    @C6593c(mo15949a = "widget_id")
    public final int widgetId;
    @C6593c(mo15949a = "is_wished")
    public final int wished;

    public static /* synthetic */ NewYearWishResp copy$default(NewYearWishResp newYearWishResp, int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str3, int i12, Object obj) {
        NewYearWishResp newYearWishResp2 = newYearWishResp;
        int i13 = i12;
        return newYearWishResp.copy((i13 & 1) != 0 ? newYearWishResp2.statusCode : i, (i13 & 2) != 0 ? newYearWishResp2.statusMsg : str, (i13 & 4) != 0 ? newYearWishResp2.content : str2, (i13 & 8) != 0 ? newYearWishResp2.canDig : i2, (i13 & 16) != 0 ? newYearWishResp2.status : i3, (i13 & 32) != 0 ? newYearWishResp2.canShow : i4, (i13 & 64) != 0 ? newYearWishResp2.diggCount : i5, (i13 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? newYearWishResp2.isMySelf : i6, (i13 & 256) != 0 ? newYearWishResp2.wished : i7, (i13 & 512) != 0 ? newYearWishResp2.reminded : i8, (i13 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? newYearWishResp2.reminderCount : i9, (i13 & 2048) != 0 ? newYearWishResp2.widgetId : i10, (i13 & 4096) != 0 ? newYearWishResp2.sensitive : i11, (i13 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? newYearWishResp2.iconUrl : str3);
    }

    public final NewYearWishResp copy(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str3) {
        NewYearWishResp newYearWishResp = new NewYearWishResp(i, str, str2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, str3);
        return newYearWishResp;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewYearWishResp) {
                NewYearWishResp newYearWishResp = (NewYearWishResp) obj;
                if ((this.statusCode == newYearWishResp.statusCode) && C7573i.m23585a((Object) this.statusMsg, (Object) newYearWishResp.statusMsg) && C7573i.m23585a((Object) this.content, (Object) newYearWishResp.content)) {
                    if (this.canDig == newYearWishResp.canDig) {
                        if (this.status == newYearWishResp.status) {
                            if (this.canShow == newYearWishResp.canShow) {
                                if (this.diggCount == newYearWishResp.diggCount) {
                                    if (this.isMySelf == newYearWishResp.isMySelf) {
                                        if (this.wished == newYearWishResp.wished) {
                                            if (this.reminded == newYearWishResp.reminded) {
                                                if (this.reminderCount == newYearWishResp.reminderCount) {
                                                    if (this.widgetId == newYearWishResp.widgetId) {
                                                        if (!(this.sensitive == newYearWishResp.sensitive) || !C7573i.m23585a((Object) this.iconUrl, (Object) newYearWishResp.iconUrl)) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode2 = (((((((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.canDig) * 31) + this.status) * 31) + this.canShow) * 31) + this.diggCount) * 31) + this.isMySelf) * 31) + this.wished) * 31) + this.reminded) * 31) + this.reminderCount) * 31) + this.widgetId) * 31) + this.sensitive) * 31;
        String str3 = this.iconUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewYearWishResp(statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusMsg=");
        sb.append(this.statusMsg);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", canDig=");
        sb.append(this.canDig);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", canShow=");
        sb.append(this.canShow);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", isMySelf=");
        sb.append(this.isMySelf);
        sb.append(", wished=");
        sb.append(this.wished);
        sb.append(", reminded=");
        sb.append(this.reminded);
        sb.append(", reminderCount=");
        sb.append(this.reminderCount);
        sb.append(", widgetId=");
        sb.append(this.widgetId);
        sb.append(", sensitive=");
        sb.append(this.sensitive);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(")");
        return sb.toString();
    }

    public NewYearWishResp(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str3) {
        this.statusCode = i;
        this.statusMsg = str;
        this.content = str2;
        this.canDig = i2;
        this.status = i3;
        this.canShow = i4;
        this.diggCount = i5;
        this.isMySelf = i6;
        this.wished = i7;
        this.reminded = i8;
        this.reminderCount = i9;
        this.widgetId = i10;
        this.sensitive = i11;
        this.iconUrl = str3;
    }
}
