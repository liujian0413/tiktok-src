package com.bytedance.android.livesdk.user;

public enum LiveInteractFunction {
    COMMENT("comment"),
    AT("AT"),
    INTERACT("interact"),
    GIFT("gift"),
    TASK_GIFT("task_gift"),
    RECHARGE("recharge"),
    TURNTABLE("turntable"),
    LUCKYBOX("lucky_box"),
    GUARD("guard"),
    START_LIVE("start_live"),
    COMMENT_GUIDE("comment_guide"),
    RECHARGE_GUIDE("recharge_guide");
    
    String func;

    public final String getFunc() {
        return this.func;
    }

    private LiveInteractFunction(String str) {
        this.func = str;
    }
}
