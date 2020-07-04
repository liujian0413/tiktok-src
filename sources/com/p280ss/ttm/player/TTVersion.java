package com.p280ss.ttm.player;

/* renamed from: com.ss.ttm.player.TTVersion */
public final class TTVersion {
    public static final String VERSION_NAME = "99.9.2.145";

    public static final void saveVersionInfo() {
        TTPlayerConfiger.setValue(15, "version name:99.9.2.145,version code:9992145,ttplayer release was built by tiger at 2020-01-20 21:46:20 on origin/master branch, commit 649c5dd3e525192160e2dd5bdc38906509a8fdac");
        TTPlayerConfiger.setValue(13, 9992145);
        TTPlayerConfiger.setValue(14, VERSION_NAME);
    }
}
