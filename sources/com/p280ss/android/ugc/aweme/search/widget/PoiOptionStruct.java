package com.p280ss.android.ugc.aweme.search.widget;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.widget.PoiOptionStruct */
public class PoiOptionStruct implements Serializable {
    @C6593c(mo15949a = "code")
    long code;
    boolean isDefault;
    boolean isSelected;
    @C6593c(mo15949a = "name")
    String name;
    int type;

    public long getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCode(long j) {
        this.code = j;
    }

    public PoiOptionStruct setDefault(boolean z) {
        this.isDefault = z;
        return this;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setType(int i) {
        this.type = i;
    }
}
