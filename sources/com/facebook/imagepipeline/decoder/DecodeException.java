package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.p720g.C13647e;

public class DecodeException extends RuntimeException {
    private final C13647e mEncodedImage;

    public C13647e getEncodedImage() {
        return this.mEncodedImage;
    }

    public DecodeException(String str, C13647e eVar) {
        super(str);
        this.mEncodedImage = eVar;
    }

    public DecodeException(String str, Throwable th, C13647e eVar) {
        super(str, th);
        this.mEncodedImage = eVar;
    }
}
