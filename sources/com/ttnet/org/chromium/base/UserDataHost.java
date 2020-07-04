package com.ttnet.org.chromium.base;

import android.os.Process;
import java.util.HashMap;

public final class UserDataHost {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mThreadId = ((long) Process.myTid());
    private HashMap<Class<? extends UserData>, UserData> mUserDataMap = new HashMap<>();

    private void checkThreadAndState() {
    }

    public final void destroy() {
        checkThreadAndState();
        HashMap<Class<? extends UserData>, UserData> hashMap = this.mUserDataMap;
        this.mUserDataMap = null;
        for (UserData destroy : hashMap.values()) {
            destroy.destroy();
        }
    }

    public final <T extends UserData> T getUserData(Class<T> cls) {
        checkThreadAndState();
        return (UserData) cls.cast(this.mUserDataMap.get(cls));
    }

    public final <T extends UserData> T removeUserData(Class<T> cls) {
        checkThreadAndState();
        return (UserData) cls.cast(this.mUserDataMap.remove(cls));
    }

    public final <T extends UserData> T setUserData(Class<T> cls, T t) {
        checkThreadAndState();
        this.mUserDataMap.put(cls, t);
        return getUserData(cls);
    }
}
