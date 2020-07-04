package com.bytedance.debugbox.base;

import android.app.Activity;
import android.app.Application;

public interface IDebugBoxService {
    void disableFloating();

    void forceShowFloatingButton(Activity activity);

    void initialize(Application application, C10050a aVar);
}
