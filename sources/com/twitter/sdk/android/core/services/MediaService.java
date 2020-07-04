package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C46953j;
import okhttp3.RequestBody;
import retrofit2.C48475b;
import retrofit2.p363b.C7736l;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7741q;

public interface MediaService {
    @C7736l
    @C7739o(mo20429a = "https://upload.twitter.com/1.1/media/upload.json")
    C48475b<C46953j> upload(@C7741q(mo20431a = "media") RequestBody requestBody, @C7741q(mo20431a = "media_data") RequestBody requestBody2, @C7741q(mo20431a = "additional_owners") RequestBody requestBody3);
}
