package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

public class LaxContentLengthStrategy implements ContentLengthStrategy {
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        long j;
        if (httpMessage != null) {
            boolean isParameterTrue = httpMessage.getParams().isParameterTrue("http.protocol.strict-transfer-encoding");
            Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
            Header firstHeader2 = httpMessage.getFirstHeader("Content-Length");
            if (firstHeader != null) {
                try {
                    HeaderElement[] elements = firstHeader.getElements();
                    if (isParameterTrue) {
                        int i = 0;
                        while (i < elements.length) {
                            String name = elements[i].getName();
                            if (name == null || name.length() <= 0 || name.equalsIgnoreCase("chunked") || name.equalsIgnoreCase("identity")) {
                                i++;
                            } else {
                                StringBuffer stringBuffer = new StringBuffer("Unsupported transfer encoding: ");
                                stringBuffer.append(name);
                                throw new ProtocolException(stringBuffer.toString());
                            }
                        }
                    }
                    int length = elements.length;
                    if ("identity".equalsIgnoreCase(firstHeader.getValue())) {
                        return -1;
                    }
                    if (length > 0 && "chunked".equalsIgnoreCase(elements[length - 1].getName())) {
                        return -2;
                    }
                    if (!isParameterTrue) {
                        return -1;
                    }
                    throw new ProtocolException("Chunk-encoding must be the last one applied");
                } catch (ParseException e) {
                    StringBuffer stringBuffer2 = new StringBuffer("Invalid Transfer-Encoding header value: ");
                    stringBuffer2.append(firstHeader);
                    throw new ProtocolException(stringBuffer2.toString(), e);
                }
            } else if (firstHeader2 == null) {
                return -1;
            } else {
                Header[] headers = httpMessage.getHeaders("Content-Length");
                if (!isParameterTrue || headers.length <= 1) {
                    int length2 = headers.length - 1;
                    while (true) {
                        if (length2 < 0) {
                            j = -1;
                            break;
                        }
                        Header header = headers[length2];
                        try {
                            j = Long.parseLong(header.getValue());
                            break;
                        } catch (NumberFormatException unused) {
                            if (!isParameterTrue) {
                                length2--;
                            } else {
                                StringBuffer stringBuffer3 = new StringBuffer("Invalid content length: ");
                                stringBuffer3.append(header.getValue());
                                throw new ProtocolException(stringBuffer3.toString());
                            }
                        }
                    }
                    if (j >= 0) {
                        return j;
                    }
                    return -1;
                }
                throw new ProtocolException("Multiple content length headers");
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
