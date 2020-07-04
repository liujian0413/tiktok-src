package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes */
public final class LoftAnimationRes implements Serializable {
    private String backgroundUri;
    @C6593c(mo15949a = "image_src")
    private String downloadUrl = "";
    @C6593c(mo15949a = "end_color")
    private String endColor = "#2c016d";
    private String floatLeftBottomUri;
    private String floatLeftTopUri;
    private String floatRightBottomUri;
    private String floatRightTopUri;
    private String goodsBackgroundUri;
    private String goodsUri;
    private String logoLeftUri;
    private String logoRightUri;
    @C6593c(mo15949a = "start_color")
    private String startColor = "#ccaaff";
    @C6593c(mo15949a = "activity_time")
    private String timeDesc = "";

    public final String getBackgroundUri() {
        return this.backgroundUri;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final String getFloatLeftBottomUri() {
        return this.floatLeftBottomUri;
    }

    public final String getFloatLeftTopUri() {
        return this.floatLeftTopUri;
    }

    public final String getFloatRightBottomUri() {
        return this.floatRightBottomUri;
    }

    public final String getFloatRightTopUri() {
        return this.floatRightTopUri;
    }

    public final String getGoodsBackgroundUri() {
        return this.goodsBackgroundUri;
    }

    public final String getGoodsUri() {
        return this.goodsUri;
    }

    public final String getLogoLeftUri() {
        return this.logoLeftUri;
    }

    public final String getLogoRightUri() {
        return this.logoRightUri;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public final String getTimeDesc() {
        return this.timeDesc;
    }

    public final void setBackgroundUri(String str) {
        this.backgroundUri = str;
    }

    public final void setFloatLeftBottomUri(String str) {
        this.floatLeftBottomUri = str;
    }

    public final void setFloatLeftTopUri(String str) {
        this.floatLeftTopUri = str;
    }

    public final void setFloatRightBottomUri(String str) {
        this.floatRightBottomUri = str;
    }

    public final void setFloatRightTopUri(String str) {
        this.floatRightTopUri = str;
    }

    public final void setGoodsBackgroundUri(String str) {
        this.goodsBackgroundUri = str;
    }

    public final void setGoodsUri(String str) {
        this.goodsUri = str;
    }

    public final void setLogoLeftUri(String str) {
        this.logoLeftUri = str;
    }

    public final void setLogoRightUri(String str) {
        this.logoRightUri = str;
    }

    public final void setDownloadUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setEndColor(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.endColor = str;
    }

    public final void setStartColor(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.startColor = str;
    }

    public final void setTimeDesc(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.timeDesc = str;
    }
}
