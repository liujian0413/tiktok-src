package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.GuideSearchWord */
public final class GuideSearchWord implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private String f70739id;
    private boolean isAllTab;
    private boolean selected;
    @C6593c(mo15949a = "type")
    private String type;
    @C6593c(mo15949a = "word")
    private String word;

    public final String getId() {
        return this.f70739id;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWord() {
        return this.word;
    }

    public final boolean isAllTab() {
        return this.isAllTab;
    }

    public final String toString() {
        String str;
        if (this.word != null) {
            str = this.word;
            if (str == null) {
                C7573i.m23580a();
                return str;
            }
        } else {
            str = "";
        }
        return str;
    }

    public final void setAllTab(boolean z) {
        this.isAllTab = z;
    }

    public final void setId(String str) {
        this.f70739id = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setWord(String str) {
        this.word = str;
    }
}
