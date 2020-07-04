package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.net1.CronetException;

public class CronetExceptionImpl extends CronetException {
    public CronetExceptionImpl(String str, Throwable th) {
        super(str, th);
    }
}
