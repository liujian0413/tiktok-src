package com.p280ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SuperAccountList */
public class SuperAccountList extends BaseResponse {
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "user_list")
    public List<UserWithAweme> userList;

    public List<UserWithAweme> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public SuperAccountList clone() {
        SuperAccountList superAccountList = new SuperAccountList();
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) this.userList)) {
            for (UserWithAweme userWithAweme : this.userList) {
                if (userWithAweme != null) {
                    arrayList.add(userWithAweme.clone());
                }
            }
        }
        superAccountList.userList = arrayList;
        superAccountList.extra = this.extra;
        superAccountList.status_code = this.status_code;
        superAccountList.status_msg = this.status_msg;
        superAccountList.error_code = this.error_code;
        superAccountList.logPb = this.logPb;
        return superAccountList;
    }
}
