package com.p280ss.android.ugc.aweme.commercialize;

import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggPageParams */
public class EasterEggPageParams implements Serializable {
    private String enterFrom;
    private String enterMethod;
    private String keyWords;
    private EasterEggInfo mEasterEggInfo;

    public EasterEggInfo getEasterEggInfo() {
        return this.mEasterEggInfo;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getKeyWords() {
        return this.keyWords;
    }

    public void setEasterEggInfo(EasterEggInfo easterEggInfo) {
        this.mEasterEggInfo = easterEggInfo;
    }

    public void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setKeyWords(String str) {
        this.keyWords = str;
    }
}
