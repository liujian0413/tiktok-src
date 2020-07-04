package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel */
public class AwemeTextLabelModel implements Serializable {
    @C6593c(mo15949a = "color")
    public String bgColor;
    @C6593c(mo15949a = "text")
    public String labelName;
    @C6593c(mo15949a = "type")
    public int labelType;
    @C6593c(mo15949a = "show_seconds")
    public float showSeconds;
    @C6593c(mo15949a = "color_text")
    public String textColor;

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

    public boolean isAdHollowText() {
        if (TextUtils.isEmpty(this.textColor) || !this.textColor.endsWith("00000000")) {
            return false;
        }
        return true;
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

    public void setShowSeconds(float f) {
        this.showSeconds = f;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
