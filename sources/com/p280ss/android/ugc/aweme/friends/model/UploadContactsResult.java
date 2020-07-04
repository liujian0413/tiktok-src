package com.p280ss.android.ugc.aweme.friends.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UploadContactsResult */
public class UploadContactsResult extends BaseResponse {
    @C6593c(mo15949a = "unregistered_contact")
    public List<ContactModel> contacts;
    @C6593c(mo15949a = "registered_user")
    public List<User> users;
}
