package com.p280ss.android.ugc.aweme.p984ad.model;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ad.model.AdTagTextLabelModel */
public class AdTagTextLabelModel implements Serializable {
    private String adMoreTextual;
    private String bgColor;
    private boolean isAd;
    private boolean isRightStyle;
    private String labelName;
    private int labelType;
    private float showSeconds;
    private String textColor;

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public boolean isAd() {
        return this.isAd;
    }

    public boolean isRightStyle() {
        return this.isRightStyle;
    }

    public boolean isAdHollowText() {
        if (TextUtils.isEmpty(this.textColor) || !this.textColor.endsWith("00000000")) {
            return false;
        }
        return true;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setRightStyle(boolean z) {
        this.isRightStyle = z;
    }

    public void setShowSeconds(float f) {
        this.showSeconds = f;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
