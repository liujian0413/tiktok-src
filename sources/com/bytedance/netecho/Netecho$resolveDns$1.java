package com.bytedance.netecho;

import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

final class Netecho$resolveDns$1 implements Runnable {
    final /* synthetic */ String $hostName;
    final /* synthetic */ ObjectRef $ip;
    final /* synthetic */ ObjectRef $latch;
    final /* synthetic */ ObjectRef $throwableMsg;

    Netecho$resolveDns$1(ObjectRef objectRef, String str, ObjectRef objectRef2, ObjectRef objectRef3) {
        this.$ip = objectRef;
        this.$hostName = str;
        this.$throwableMsg = objectRef2;
        this.$latch = objectRef3;
    }

    public final void run() {
        try {
            ObjectRef objectRef = this.$ip;
            InetAddress byName = InetAddress.getByName(this.$hostName);
            C7573i.m23582a((Object) byName, "InetAddress.getByName(hostName)");
            objectRef.element = byName.getHostAddress();
        } catch (Throwable th) {
            for (th = th; th != null; th = th.getCause()) {
                ObjectRef objectRef2 = this.$throwableMsg;
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(":");
                sb.append(th.getMessage());
                objectRef2.element = sb.toString();
            }
        }
        ((CountDownLatch) this.$latch.element).countDown();
    }
}
