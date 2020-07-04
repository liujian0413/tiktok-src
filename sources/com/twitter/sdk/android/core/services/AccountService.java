package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.User;
import retrofit2.C48475b;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

public interface AccountService {
    @C7730f(mo20420a = "/1.1/account/verify_credentials.json")
    C48475b<User> verifyCredentials(@C7744t(mo20436a = "include_entities") Boolean bool, @C7744t(mo20436a = "skip_status") Boolean bool2, @C7744t(mo20436a = "include_email") Boolean bool3);
}
