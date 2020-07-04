package com.kakao.network.storage;

import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.util.IConfiguration;

public class ImageScrapRequest extends ApiRequest {
    private String imageUrl;
    private Boolean secureResource;

    public String getMethod() {
        return "POST";
    }

    public Builder getUriBuilder() {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(ServerProtocol.API_AUTHORITY);
        if (this.secureResource.booleanValue()) {
            builder.appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        }
        if (this.imageUrl != null) {
            builder.appendQueryParameter("image_url", this.imageUrl);
        }
        return builder;
    }

    protected ImageScrapRequest(IConfiguration iConfiguration, String str, Boolean bool) {
        super(iConfiguration);
        this.imageUrl = str;
        this.secureResource = bool;
    }
}
