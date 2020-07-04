package com.squareup.wire;

public interface WireDeserializeErrorListener {
    void onError(Class cls, String str, Throwable th);
}
