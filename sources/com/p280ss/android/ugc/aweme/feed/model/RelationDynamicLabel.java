package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel */
public class RelationDynamicLabel implements Serializable {
    @C6593c(mo15949a = "count")
    public int count;
    @C6593c(mo15949a = "label_info")
    public String labelInfo;
    @C6593c(mo15949a = "nickname")
    public String nickname;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "user_id")
    public String userId;

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.labelInfo)) {
            return true;
        }
        return false;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
