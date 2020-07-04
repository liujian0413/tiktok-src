package com.p280ss.android.ttve.common;

/* renamed from: com.ss.android.ttve.common.TESpdLogManager */
public class TESpdLogManager {

    /* renamed from: a */
    private static volatile TESpdLogManager f55203a;

    /* renamed from: b */
    private TESpdLogInvoker f55204b = new TESpdLogInvoker();

    /* renamed from: com.ss.android.ttve.common.TESpdLogManager$InfoLevel */
    public enum InfoLevel {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3
    }

    /* renamed from: b */
    public final void mo55038b() {
        this.f55204b.close();
    }

    private TESpdLogManager() {
    }

    /* renamed from: a */
    public static TESpdLogManager m67830a() {
        if (f55203a == null) {
            synchronized (TESpdLogManager.class) {
                if (f55203a == null) {
                    f55203a = new TESpdLogManager();
                }
            }
        }
        return f55203a;
    }

    /* renamed from: a */
    public final void mo55037a(InfoLevel infoLevel) {
        this.f55204b.setLevel(infoLevel.ordinal());
    }

    /* renamed from: a */
    public final int mo55036a(String str, int i, int i2) {
        int initSpdLog = this.f55204b.initSpdLog(str, i, 3);
        if (initSpdLog < 0) {
            return initSpdLog;
        }
        return 0;
    }
}
