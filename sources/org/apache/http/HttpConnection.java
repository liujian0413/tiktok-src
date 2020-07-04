package org.apache.http;

import java.io.IOException;

public interface HttpConnection {
    void close() throws IOException;

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int i);

    void shutdown() throws IOException;
}
