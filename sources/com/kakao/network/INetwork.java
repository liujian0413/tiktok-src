package com.kakao.network;

import com.kakao.network.multipart.Part;
import java.io.IOException;

public interface INetwork {
    void addHeader(String str, String str2);

    void addParam(String str, String str2);

    void addPart(Part part);

    void configure() throws IOException;

    void connect() throws IOException;

    void create(String str, String str2, String str3) throws IOException;

    void disconnect();

    int getStatusCode();

    byte[] readFully() throws IOException;
}
