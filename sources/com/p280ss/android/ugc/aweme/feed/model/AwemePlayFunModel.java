package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel */
public final class AwemePlayFunModel implements Serializable {
    @C6593c(mo15949a = "angle")
    private final int angle;
    @C6593c(mo15949a = "end_duration")
    private final float endDuration;
    @C6593c(mo15949a = "image_info")
    private final UrlModel imageInfo;
    @C6593c(mo15949a = "position_x")
    private final float positionX;
    @C6593c(mo15949a = "position_y")
    private final float positionY;
    @C6593c(mo15949a = "show_duration")
    private final float showDuration;
    @C6593c(mo15949a = "show_time")
    private final float showTime;
    @C6593c(mo15949a = "size")
    private final float size;
    @C6593c(mo15949a = "start_duration")
    private final float startDuration;
    @C6593c(mo15949a = "tips")
    private final String tips;

    public static /* synthetic */ AwemePlayFunModel copy$default(AwemePlayFunModel awemePlayFunModel, UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, Object obj) {
        AwemePlayFunModel awemePlayFunModel2 = awemePlayFunModel;
        int i3 = i2;
        return awemePlayFunModel.copy((i3 & 1) != 0 ? awemePlayFunModel2.imageInfo : urlModel, (i3 & 2) != 0 ? awemePlayFunModel2.tips : str, (i3 & 4) != 0 ? awemePlayFunModel2.startDuration : f, (i3 & 8) != 0 ? awemePlayFunModel2.endDuration : f2, (i3 & 16) != 0 ? awemePlayFunModel2.showDuration : f3, (i3 & 32) != 0 ? awemePlayFunModel2.showTime : f4, (i3 & 64) != 0 ? awemePlayFunModel2.positionX : f5, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? awemePlayFunModel2.positionY : f6, (i3 & 256) != 0 ? awemePlayFunModel2.size : f7, (i3 & 512) != 0 ? awemePlayFunModel2.angle : i);
    }

    public final UrlModel component1() {
        return this.imageInfo;
    }

    public final int component10() {
        return this.angle;
    }

    public final String component2() {
        return this.tips;
    }

    public final float component3() {
        return this.startDuration;
    }

    public final float component4() {
        return this.endDuration;
    }

    public final float component5() {
        return this.showDuration;
    }

    public final float component6() {
        return this.showTime;
    }

    public final float component7() {
        return this.positionX;
    }

    public final float component8() {
        return this.positionY;
    }

    public final float component9() {
        return this.size;
    }

    public final AwemePlayFunModel copy(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        AwemePlayFunModel awemePlayFunModel = new AwemePlayFunModel(urlModel, str, f, f2, f3, f4, f5, f6, f7, i);
        return awemePlayFunModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwemePlayFunModel) {
                AwemePlayFunModel awemePlayFunModel = (AwemePlayFunModel) obj;
                if (C7573i.m23585a((Object) this.imageInfo, (Object) awemePlayFunModel.imageInfo) && C7573i.m23585a((Object) this.tips, (Object) awemePlayFunModel.tips) && Float.compare(this.startDuration, awemePlayFunModel.startDuration) == 0 && Float.compare(this.endDuration, awemePlayFunModel.endDuration) == 0 && Float.compare(this.showDuration, awemePlayFunModel.showDuration) == 0 && Float.compare(this.showTime, awemePlayFunModel.showTime) == 0 && Float.compare(this.positionX, awemePlayFunModel.positionX) == 0 && Float.compare(this.positionY, awemePlayFunModel.positionY) == 0 && Float.compare(this.size, awemePlayFunModel.size) == 0) {
                    if (this.angle == awemePlayFunModel.angle) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getEndDuration() {
        return this.endDuration;
    }

    public final UrlModel getImageInfo() {
        return this.imageInfo;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowDuration() {
        return this.showDuration;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getStartDuration() {
        return this.startDuration;
    }

    public final String getTips() {
        return this.tips;
    }

    public final int hashCode() {
        UrlModel urlModel = this.imageInfo;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.tips;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((((((hashCode + i) * 31) + Float.floatToIntBits(this.startDuration)) * 31) + Float.floatToIntBits(this.endDuration)) * 31) + Float.floatToIntBits(this.showDuration)) * 31) + Float.floatToIntBits(this.showTime)) * 31) + Float.floatToIntBits(this.positionX)) * 31) + Float.floatToIntBits(this.positionY)) * 31) + Float.floatToIntBits(this.size)) * 31) + this.angle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemePlayFunModel(imageInfo=");
        sb.append(this.imageInfo);
        sb.append(", tips=");
        sb.append(this.tips);
        sb.append(", startDuration=");
        sb.append(this.startDuration);
        sb.append(", endDuration=");
        sb.append(this.endDuration);
        sb.append(", showDuration=");
        sb.append(this.showDuration);
        sb.append(", showTime=");
        sb.append(this.showTime);
        sb.append(", positionX=");
        sb.append(this.positionX);
        sb.append(", positionY=");
        sb.append(this.positionY);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(")");
        return sb.toString();
    }

    public AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.imageInfo = urlModel;
        this.tips = str;
        this.startDuration = f;
        this.endDuration = f2;
        this.showDuration = f3;
        this.showTime = f4;
        this.positionX = f5;
        this.positionY = f6;
        this.size = f7;
        this.angle = i;
    }

    public /* synthetic */ AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, C7571f fVar) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3;
        int i4 = i2;
        if ((i4 & 4) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f;
        }
        if ((i4 & 8) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f2;
        }
        if ((i4 & 16) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f3;
        }
        if ((i4 & 32) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f4;
        }
        if ((i4 & 64) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f5;
        }
        if ((i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f6;
        }
        if ((i4 & 256) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f7;
        }
        if ((i4 & 512) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this(urlModel, str, f8, f9, f10, f11, f12, f13, f14, i3);
    }
}
