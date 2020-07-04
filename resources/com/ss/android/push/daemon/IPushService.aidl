package com.ss.android.push.daemon;

// 和 push service 相互通信的 adil 貌似知识为了
interface IPushService {
    void keepAlive();
}
