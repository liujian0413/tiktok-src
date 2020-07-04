package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelNew */
public final class RelationLabelNew implements Serializable {
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "extra")
    public RelationLabelExtra extra;
    @C6593c(mo15949a = "type")
    public Integer type = Integer.valueOf(0);
    @C6593c(mo15949a = "user_list")
    public List<RelationLabelUser> userList;

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}
