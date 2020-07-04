package org.apache.http.p1893io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

/* renamed from: org.apache.http.io.HttpMessageParser */
public interface HttpMessageParser {
    HttpMessage parse() throws IOException, HttpException;
}
