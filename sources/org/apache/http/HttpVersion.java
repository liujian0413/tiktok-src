package org.apache.http;

import java.io.Serializable;

public final class HttpVersion extends ProtocolVersion implements Serializable {
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int i, int i2) {
        super("HTTP", i, i2);
    }

    public final ProtocolVersion forVersion(int i, int i2) {
        if (i == this.major && i2 == this.minor) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return HTTP_1_0;
            }
            if (i2 == 1) {
                return HTTP_1_1;
            }
        }
        if (i == 0 && i2 == 9) {
            return HTTP_0_9;
        }
        return new HttpVersion(i, i2);
    }
}
