package com.bytedance.jirafast.net;

import com.bytedance.jirafast.models.C12011c;
import com.google.common.util.concurrent.C18253l;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

public interface JIRAApi {
    @C7739o(mo20429a = "create/fast/feedback/")
    C18253l<C12011c> fastback(@C7744t(mo20436a = "aid") int i, @C7744t(mo20436a = "diff_test") int i2, @C7744t(mo20436a = "reporter", mo20437b = true) String str, @C7744t(mo20436a = "description", mo20437b = true) String str2, @C7744t(mo20436a = "log_link", mo20437b = true) String str3, @C7744t(mo20436a = "image_uri", mo20437b = true) String str4, @C7744t(mo20436a = "os_version") String str5, @C7744t(mo20436a = "device_type") String str6, @C7744t(mo20436a = "app_version") String str7);
}
