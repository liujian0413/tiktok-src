package com.p280ss.android.ugc.aweme.miniapp_api.depend;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33450a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33458c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33459d;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33462f;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.depend.RealApi */
public interface RealApi {
    @C7730f
    C18253l<String> executeGet(int i, @C7748x String str);

    @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/follow/relation/")
    C18253l<C33458c> getFollowRelation(@C7744t(mo20436a = "from_user_token") String str, @C7744t(mo20436a = "to_user_id") long j);

    @C7730f(mo20420a = "https://gate.snssdk.com/developer/api/get_gid/")
    C18253l<C33450a> getGid(@C7744t(mo20436a = "alias_id") String str);

    @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/record/list/")
    C18253l<C33459d> getMicroAppList(@C7744t(mo20436a = "page") int i, @C7744t(mo20436a = "page_size") int i2, @C7744t(mo20436a = "list_type") int i3);

    @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/mutual/follow/")
    C18253l<C33462f> mutualFollowUser(@C7744t(mo20436a = "from_user_id") long j, @C7744t(mo20436a = "to_user_id") long j2, @C7744t(mo20436a = "sec_from_user_id") String str);

    @C7739o(mo20429a = "https://aweme.snssdk.com/aweme/v1/microapp/address/update/")
    C18253l<C33462f> updateAddressInfo(@C7744t(mo20436a = "id") long j, @C7744t(mo20436a = "name") String str, @C7744t(mo20436a = "telephone") String str2, @C7744t(mo20436a = "code") int i, @C7744t(mo20436a = "detail") String str3, @C7744t(mo20436a = "status") int i2);

    @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/record/update/")
    C18253l<Object> updateMicroRecord(@C7744t(mo20436a = "schema") String str);
}
