package com.p280ss.android.ugc.aweme.p313im.service.model;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMContact */
public abstract class IMContact implements Serializable {
    private boolean isStickTop;
    protected int relationListItemType;

    public abstract UrlModel getDisplayAvatar();

    public abstract String getDisplayName();

    public int getType() {
        return this.relationListItemType;
    }

    public boolean isStickTop() {
        return this.isStickTop;
    }

    public abstract String toUidString();

    public void setStickTop(boolean z) {
        this.isStickTop = z;
    }

    public void setType(int i) {
        this.relationListItemType = i;
    }
}
