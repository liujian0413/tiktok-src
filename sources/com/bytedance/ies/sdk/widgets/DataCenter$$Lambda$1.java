package com.bytedance.ies.sdk.widgets;

final /* synthetic */ class DataCenter$$Lambda$1 implements Runnable {
    private final DataCenter arg$1;
    private final String arg$2;
    private final Object arg$3;

    DataCenter$$Lambda$1(DataCenter dataCenter, String str, Object obj) {
        this.arg$1 = dataCenter;
        this.arg$2 = str;
        this.arg$3 = obj;
    }

    public final void run() {
        this.arg$1.lambda$put$1$DataCenter(this.arg$2, this.arg$3);
    }
}
