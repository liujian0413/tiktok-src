package com.bytedance.scene.utlity;

public class SceneInternalException extends RuntimeException {
    public SceneInternalException(String str) {
        super(str);
    }

    public SceneInternalException(Throwable th) {
        super(th);
    }

    public SceneInternalException(String str, Throwable th) {
        super(str, th);
    }
}
