package com.kakao.network.storage;

import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.util.IConfiguration;
import com.p280ss.android.ugc.aweme.policy.Policy;

public class ImageDeleteRequest extends ApiRequest {
    protected final String IMAGE_TOKEN = "image_token";
    protected final String IMAGE_URL = "image_url";
    private String imageToken;
    private String imageUrl;

    public String getMethod() {
        return Policy.ACTION_DELETE;
    }

    public Builder getUriBuilder() {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(ServerProtocol.API_AUTHORITY);
        if (this.imageUrl != null) {
            builder.appendQueryParameter("image_url", this.imageUrl);
        }
        if (this.imageToken != null) {
            builder.appendQueryParameter("image_token", this.imageToken);
        }
        return builder;
    }

    public ImageDeleteRequest(IConfiguration iConfiguration, String str, String str2) {
        super(iConfiguration);
        this.imageUrl = str;
        this.imageToken = str2;
    }
}
