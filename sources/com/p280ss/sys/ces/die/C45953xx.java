package com.p280ss.sys.ces.die;

/* renamed from: com.ss.sys.ces.die.xx */
public class C45953xx {
    public static void HelloKitty(final int i) {
        new Thread("CZL-HelloKitty") {
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                if (r1 == null) goto L_0x001a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = "APP ERROR !!!"
                    int r1 = r2
                    r2 = 1
                    if (r1 != r2) goto L_0x000a
                    java.lang.String r0 = "[-] 检测到您设备环境不安全, 请勿进行异常操作"
                    goto L_0x0011
                L_0x000a:
                    int r1 = r2
                    r3 = 2
                    if (r1 != r3) goto L_0x0011
                    java.lang.String r0 = "[-] 检测到您当前安装的软件为非官方版本, 为了保证正常安全浏览请点击下载安装官方版本"
                L_0x0011:
                    android.app.Activity r1 = com.p280ss.sys.ces.p1802a.C45929a.m144041a()     // Catch:{ Throwable -> 0x001a, all -> 0x0018 }
                    if (r1 != 0) goto L_0x0020
                    goto L_0x001a
                L_0x0018:
                    r0 = move-exception
                    throw r0
                L_0x001a:
                    com.ss.sys.ces.c r1 = com.p280ss.sys.ces.C45939c.m144077a()
                    android.content.Context r1 = r1.f117425d
                L_0x0020:
                    android.os.Looper.prepare()
                    android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
                    com.p280ss.sys.ces.die.C45952a.m144119a(r0)
                    android.os.Looper.loop()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.die.C45953xx.C459541.run():void");
            }
        }.start();
    }
}
