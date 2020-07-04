package com.p280ss.android.ugc.aweme.app.debug;

import com.p280ss.android.ugc.aweme.setting.p336a.C37538g;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbTestSettingPageParam */
public class AbTestSettingPageParam implements Serializable {
    public String category;

    public ArrayList<C37538g> getExtraInfoDelegates() {
        return (ArrayList) C37538g.f97915a.get(this.category);
    }

    public AbTestSettingPageParam setCategory(String str) {
        this.category = str;
        return this;
    }
}
