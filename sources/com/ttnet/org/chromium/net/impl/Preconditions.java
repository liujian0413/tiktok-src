package com.ttnet.org.chromium.net.impl;

import java.nio.ByteBuffer;

public final class Preconditions {
    private Preconditions() {
    }

    static void checkDirect(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    static void checkHasRemaining(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
