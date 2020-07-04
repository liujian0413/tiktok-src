package com.bytedance.netecho;

import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    private static final String LIB_NAME = LIB_NAME;
    private static final int STAGE_ATON = 1;
    private static final int STAGE_FINISH = 6;
    private static final int STAGE_RECV = 5;
    private static final int STAGE_SEND = 4;
    private static final int STAGE_SET_OPT = 3;
    private static final int STAGE_SOCKET = 2;
    /* access modifiers changed from: private */
    public static final String TAG = TAG;

    private Netecho() {
    }

    private static final native IcmpDetectResult nativeDetectIcmp(String str, long j, int i);

    private static final native TcpDetectResult nativeDetectTcp(String str, int i, long j);

    static {
        NetechoConfig.INSTANCE.getLoadLibrary().invoke(LIB_NAME);
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i];
        for (int i2 = 0; i2 < i; i2++) {
            icmpPacketResultArr[i2] = null;
        }
        return icmpPacketResultArr;
    }

    public final DnsResolveResult resolveDns(String str, long j) {
        C7573i.m23587b(str, "hostName");
        ObjectRef objectRef = new ObjectRef();
        boolean z = true;
        objectRef.element = new CountDownLatch(1);
        ObjectRef objectRef2 = new ObjectRef();
        objectRef2.element = null;
        ObjectRef objectRef3 = new ObjectRef();
        objectRef3.element = null;
        new Thread(new Netecho$resolveDns$1(objectRef2, str, objectRef3, objectRef)).start();
        ((CountDownLatch) objectRef.element).await(j, TimeUnit.MILLISECONDS);
        if (((String) objectRef2.element) == null) {
            z = false;
        }
        return new DnsResolveResult(z, (String) objectRef2.element, (String) objectRef3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final IcmpDetectResult detectIcmp(String str, long j, int i) {
        C7573i.m23587b(str, "hostIp");
        return nativeDetectIcmp(str, j, i);
    }

    public final TcpDetectResult detectTcp(String str, int i, long j) {
        C7573i.m23587b(str, "hostIp");
        return nativeDetectTcp(str, i, j);
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] icmpPacketResultArr, int i, boolean z, int i2, float f, int i3) {
        C7573i.m23587b(icmpPacketResultArr, "packetResultsArray");
        icmpPacketResultArr[i] = new IcmpPacketResult(z, i2, f, i3);
    }
}
