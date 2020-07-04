package com.kakao.auth.network;

import com.kakao.network.IRequest;
import com.kakao.util.IConfiguration;

public interface AuthorizedRequest extends IRequest {
    void setAccessToken(String str);

    void setConfiguration(IConfiguration iConfiguration);
}
