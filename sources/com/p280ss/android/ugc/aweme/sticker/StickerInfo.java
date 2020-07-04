package com.p280ss.android.ugc.aweme.sticker;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.StickerInfo */
public final class StickerInfo implements Serializable {
    @C6593c(mo15949a = "grade_key")
    private String gradeKey;
    @C6593c(mo15949a = "prop_source")
    private String propSource;

    public StickerInfo() {
    }

    public final String getGradeKey() {
        return this.gradeKey;
    }

    public final String getPropSource() {
        return this.propSource;
    }

    public final void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public final void setPropSource(String str) {
        this.propSource = str;
    }

    public StickerInfo(String str, String str2) {
        this();
        this.propSource = str;
        this.gradeKey = str2;
    }
}
