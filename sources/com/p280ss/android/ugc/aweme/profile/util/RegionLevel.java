package com.p280ss.android.ugc.aweme.profile.util;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.util.RegionLevel */
public class RegionLevel extends ArrayList<RegionLevel> {
    String code;
    String name;

    public RegionLevel() {
        this.name = "";
        this.code = "";
    }

    public String getCode() {
        if (this.code == null) {
            return "";
        }
        return this.code;
    }

    public String getName() {
        if (this.name == null) {
            return "";
        }
        return this.name;
    }

    public RegionLevel(String str) {
        this.name = str;
        this.code = "";
    }

    public RegionLevel(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public void setValue(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
