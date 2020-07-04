package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeLinkLabel */
public final class AwemeLinkLabel implements Serializable {
    @C6593c(mo15949a = "color")
    private final String color;
    @C6593c(mo15949a = "color_icon")
    private final String colorIcon;
    @C6593c(mo15949a = "color_text")
    private final String colorText;
    @C6593c(mo15949a = "icon")
    private final UrlModel icon;
    @C6593c(mo15949a = "show_seconds")
    private final int showSeconds;
    @C6593c(mo15949a = "style_type")
    private final int styleType;
    @C6593c(mo15949a = "text")
    private final String text;
    @C6593c(mo15949a = "type")
    private final int type;

    public static /* synthetic */ AwemeLinkLabel copy$default(AwemeLinkLabel awemeLinkLabel, String str, String str2, String str3, int i, String str4, int i2, int i3, UrlModel urlModel, int i4, Object obj) {
        AwemeLinkLabel awemeLinkLabel2 = awemeLinkLabel;
        int i5 = i4;
        return awemeLinkLabel.copy((i5 & 1) != 0 ? awemeLinkLabel2.color : str, (i5 & 2) != 0 ? awemeLinkLabel2.text : str2, (i5 & 4) != 0 ? awemeLinkLabel2.colorText : str3, (i5 & 8) != 0 ? awemeLinkLabel2.type : i, (i5 & 16) != 0 ? awemeLinkLabel2.colorIcon : str4, (i5 & 32) != 0 ? awemeLinkLabel2.styleType : i2, (i5 & 64) != 0 ? awemeLinkLabel2.showSeconds : i3, (i5 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? awemeLinkLabel2.icon : urlModel);
    }

    public final String component1() {
        return this.color;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.colorText;
    }

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.colorIcon;
    }

    public final int component6() {
        return this.styleType;
    }

    public final int component7() {
        return this.showSeconds;
    }

    public final UrlModel component8() {
        return this.icon;
    }

    public final AwemeLinkLabel copy(String str, String str2, String str3, int i, String str4, int i2, int i3, UrlModel urlModel) {
        AwemeLinkLabel awemeLinkLabel = new AwemeLinkLabel(str, str2, str3, i, str4, i2, i3, urlModel);
        return awemeLinkLabel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwemeLinkLabel) {
                AwemeLinkLabel awemeLinkLabel = (AwemeLinkLabel) obj;
                if (C7573i.m23585a((Object) this.color, (Object) awemeLinkLabel.color) && C7573i.m23585a((Object) this.text, (Object) awemeLinkLabel.text) && C7573i.m23585a((Object) this.colorText, (Object) awemeLinkLabel.colorText)) {
                    if ((this.type == awemeLinkLabel.type) && C7573i.m23585a((Object) this.colorIcon, (Object) awemeLinkLabel.colorIcon)) {
                        if (this.styleType == awemeLinkLabel.styleType) {
                            if (!(this.showSeconds == awemeLinkLabel.showSeconds) || !C7573i.m23585a((Object) this.icon, (Object) awemeLinkLabel.icon)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorIcon() {
        return this.colorIcon;
    }

    public final String getColorText() {
        return this.colorText;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.color;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.colorText;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.type) * 31;
        String str4 = this.colorIcon;
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.styleType) * 31) + this.showSeconds) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeLinkLabel(color=");
        sb.append(this.color);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", colorText=");
        sb.append(this.colorText);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", colorIcon=");
        sb.append(this.colorIcon);
        sb.append(", styleType=");
        sb.append(this.styleType);
        sb.append(", showSeconds=");
        sb.append(this.showSeconds);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(")");
        return sb.toString();
    }

    public AwemeLinkLabel(String str, String str2, String str3, int i, String str4, int i2, int i3, UrlModel urlModel) {
        this.color = str;
        this.text = str2;
        this.colorText = str3;
        this.type = i;
        this.colorIcon = str4;
        this.styleType = i2;
        this.showSeconds = i3;
        this.icon = urlModel;
    }

    public /* synthetic */ AwemeLinkLabel(String str, String str2, String str3, int i, String str4, int i2, int i3, UrlModel urlModel, int i4, C7571f fVar) {
        int i5;
        int i6;
        int i7;
        if ((i4 & 8) != 0) {
            i5 = 4;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 64) != 0) {
            i7 = 0;
        } else {
            i7 = i3;
        }
        this(str, str2, str3, i5, str4, i6, i7, urlModel);
    }
}
