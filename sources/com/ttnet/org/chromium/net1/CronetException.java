package com.ttnet.org.chromium.net1;

import java.io.IOException;

public abstract class CronetException extends IOException {
    protected CronetException(String str, Throwable th) {
        super(str, th);
    }
}
