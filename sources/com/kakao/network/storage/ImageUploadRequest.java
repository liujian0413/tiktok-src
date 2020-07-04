package com.kakao.network.storage;

import android.net.Uri.Builder;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.FilePart;
import com.kakao.network.multipart.Part;
import com.kakao.util.IConfiguration;
import java.io.File;
import java.util.List;
import java.util.Map;

public class ImageUploadRequest extends ApiRequest {
    private File imageFile;
    private Boolean secureResource;

    public String getMethod() {
        return "POST";
    }

    public Map<String, String> getParams() {
        return super.getParams();
    }

    public List<Part> getMultiPartList() {
        List<Part> multiPartList = super.getMultiPartList();
        if (this.imageFile != null && this.imageFile.exists()) {
            multiPartList.add(new FilePart("file", this.imageFile));
        }
        return multiPartList;
    }

    public Builder getUriBuilder() {
        Builder authority = super.getUriBuilder().authority(ServerProtocol.API_AUTHORITY);
        if (this.secureResource.booleanValue()) {
            authority.appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        }
        return authority;
    }

    protected ImageUploadRequest(IConfiguration iConfiguration, Boolean bool, File file) {
        super(iConfiguration);
        this.secureResource = bool;
        this.imageFile = file;
    }
}
