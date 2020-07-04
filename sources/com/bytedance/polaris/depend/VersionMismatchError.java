package com.bytedance.polaris.depend;

public class VersionMismatchError extends Error {
    public VersionMismatchError(String str) {
        super(str);
    }
}
