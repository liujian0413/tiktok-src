package org.apache.http.cookie;

import java.util.Date;

public interface Cookie {
    String getDomain();

    String getName();

    String getPath();

    int[] getPorts();

    String getValue();

    int getVersion();

    boolean isExpired(Date date);

    boolean isSecure();
}
