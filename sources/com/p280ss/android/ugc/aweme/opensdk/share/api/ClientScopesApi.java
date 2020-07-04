package com.p280ss.android.ugc.aweme.opensdk.share.api;

import com.p280ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.api.ClientScopesApi */
public interface ClientScopesApi {
    @C7729e
    @C7739o(mo20429a = "/oauth/get_client_scopes/")
    C7492s<ClientKeyScopesResponse> getClientScopes(@C7727c(mo20417a = "client_key") String str, @C7727c(mo20417a = "app_identity") String str2);
}
