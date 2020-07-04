package com.kakao.network;

import com.kakao.network.multipart.Part;
import java.util.List;
import java.util.Map;

public interface IRequest {
    String getBodyEncoding();

    Map<String, String> getHeaders();

    String getMethod();

    List<Part> getMultiPartList();

    Map<String, String> getParams();

    String getUrl();
}
