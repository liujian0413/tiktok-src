package com.facebook.react.bridge;

public interface INativeLibraryLoader {
    void loadLibrary(String str) throws UnsatisfiedLinkError;
}
