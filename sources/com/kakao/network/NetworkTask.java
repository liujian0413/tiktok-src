package com.kakao.network;

import com.kakao.network.multipart.Part;
import com.kakao.network.response.ResponseData;
import com.kakao.util.helper.log.Logger;
import java.io.IOException;
import java.util.Map;

public class NetworkTask {
    private final INetwork network;

    public NetworkTask() {
        this.network = new KakaoNetworkImpl();
    }

    public NetworkTask(INetwork iNetwork) {
        this.network = iNetwork;
    }

    public ResponseData request(IRequest iRequest) throws IOException {
        try {
            this.network.create(iRequest.getUrl(), iRequest.getMethod(), iRequest.getBodyEncoding());
            Map headers = iRequest.getHeaders();
            Logger.m60925d(headers.toString());
            for (String str : headers.keySet()) {
                if (!str.equalsIgnoreCase("Expect")) {
                    this.network.addHeader(str, (String) headers.get(str));
                } else {
                    throw new IllegalStateException("Expect: 100-Continue not supported");
                }
            }
            Map params = iRequest.getParams();
            for (String str2 : params.keySet()) {
                this.network.addParam(str2, (String) params.get(str2));
            }
            for (Part addPart : iRequest.getMultiPartList()) {
                this.network.addPart(addPart);
            }
            this.network.configure();
            this.network.connect();
            int statusCode = this.network.getStatusCode();
            Logger.m60927d("++ httpStatus : [%s]", Integer.valueOf(statusCode));
            ResponseData responseData = new ResponseData(statusCode, this.network.readFully());
            return responseData;
        } finally {
            this.network.disconnect();
        }
    }
}
