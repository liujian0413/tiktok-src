package com.ss.android.message;

import com.ss.android.message.IPushAppCallback;

interface INotifyService {

    void registerPushApp(IPushAppCallback pushApp);
    
    void unregisterPushApp(IPushAppCallback pushApp);
}
