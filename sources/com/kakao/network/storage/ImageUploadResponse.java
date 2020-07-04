package com.kakao.network.storage;

import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.storage.ImageInfo.ImageSize;

public class ImageUploadResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<ImageUploadResponse> CONVERTER = new ResponseStringConverter<ImageUploadResponse>() {
        public final ImageUploadResponse convert(String str) throws ResponseBodyException {
            return new ImageUploadResponse(str);
        }
    };
    private ImageInfo original = getImageInfo(getBody().getBody("infos").getBody(ImageSize.ORIGINAL.getValue()));

    public ImageInfo getOriginal() {
        return this.original;
    }

    public ImageUploadResponse(String str) {
        super(str);
    }

    /* access modifiers changed from: 0000 */
    public ImageInfo getImageInfo(ResponseBody responseBody) throws ResponseBodyException {
        ImageInfo imageInfo = new ImageInfo(responseBody.getString("url"), Integer.valueOf(responseBody.getInt("length")), responseBody.getString("content_type"), Integer.valueOf(responseBody.getInt("width")), Integer.valueOf(responseBody.getInt("height")));
        return imageInfo;
    }
}
