package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.util.C6297v;
import com.bytedance.apm.util.C9653q;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;

public class ThreadMonitor {
    private static boolean isLocalChannel() {
        return C6174c.m19150h();
    }

    private static boolean isDebuggable() {
        return C6297v.m19538a(C6174c.m19129a());
    }

    public static void sleepMonitor(long j) throws InterruptedException {
        if (C9653q.m28546a() && j > 0) {
            if (isDebuggable()) {
                final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                new Thread(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Must not sleep in main thread \n ");
                        sb.append(C6297v.m19537a(stackTrace));
                        throw new Error(sb.toString());
                    }
                }).start();
            } else {
                C2077a.m9159a("sleep_in_main_thread");
            }
        }
        Thread.sleep(j);
    }
}
