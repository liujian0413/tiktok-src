package com.p280ss.android.message.push.connection.p887a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;

/* renamed from: com.ss.android.message.push.connection.a.k */
abstract class C19886k {

    /* renamed from: a */
    public SelectableChannel f53944a;

    /* renamed from: b */
    private boolean f53945b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo53286a(ByteBuffer byteBuffer) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53287a() {
        this.f53945b = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo53289b() {
        if (this.f53945b || !this.f53944a.isOpen()) {
            return false;
        }
        return true;
    }

    C19886k(SelectableChannel selectableChannel) throws IOException {
        m65664a((Object) selectableChannel);
        this.f53944a = selectableChannel;
        selectableChannel.configureBlocking(false);
    }

    /* renamed from: a */
    static void m65664a(Object obj) throws IOException {
        if (obj == null) {
            throw new IOException("Channel is null. Check how the channel or socket is created.");
        } else if (!(obj instanceof SelectableChannel)) {
            throw new IOException("Channel should be a SelectableChannel");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo53288b(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Buffer has no data left.");
        } else if (!byteBuffer.hasRemaining()) {
            return 0;
        } else {
            if (this.f53945b) {
                return -1;
            }
            try {
                return mo53286a(byteBuffer);
            } catch (IOException e) {
                if (!this.f53944a.isOpen()) {
                    this.f53945b = true;
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static String m65663a(SelectableChannel selectableChannel, int i) {
        StringBuilder sb = new StringBuilder("waiting for channel to be ready for ");
        sb.append("connect");
        sb.append(". ch : ");
        sb.append(selectableChannel);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m65662a(java.nio.channels.SelectableChannel r4, long r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.nio.channels.spi.SelectorProvider r1 = r4.provider()
            java.nio.channels.spi.AbstractSelector r1 = r1.openSelector()
            r2 = 0
            boolean r3 = r4.isOpen()     // Catch:{ Exception -> 0x0049, all -> 0x003d }
            if (r3 == 0) goto L_0x0037
            boolean r3 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x0049, all -> 0x003d }
            if (r3 == 0) goto L_0x001e
            boolean r4 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x0049, all -> 0x003d }
            goto L_0x0037
        L_0x001e:
            r3 = 8
            java.nio.channels.SelectionKey r4 = r4.register(r1, r3)     // Catch:{ Exception -> 0x0049, all -> 0x003d }
            int r5 = r1.select(r5)     // Catch:{ Exception -> 0x004a, all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            r4.cancel()
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r5
        L_0x0033:
            r5 = move-exception
            r2 = r4
            r4 = r5
            goto L_0x003e
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            return r0
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.cancel()
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()
        L_0x0048:
            throw r4
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x004f
            r4.cancel()
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19886k.m65662a(java.nio.channels.SelectableChannel, long):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x004a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m65665a(java.nio.channels.SocketChannel r3, java.net.SocketAddress r4, long r5) throws java.io.IOException {
        /*
            boolean r0 = r3.isBlocking()
            if (r0 == 0) goto L_0x000a
            r1 = 0
            r3.configureBlocking(r1)
        L_0x000a:
            r1 = 1
            boolean r4 = r3.connect(r4)     // Catch:{ IOException -> 0x0046 }
            if (r4 == 0) goto L_0x001d
            if (r0 == 0) goto L_0x001c
            boolean r4 = r3.isOpen()
            if (r4 == 0) goto L_0x001c
            r3.configureBlocking(r1)
        L_0x001c:
            return
        L_0x001d:
            int r4 = m65662a(r3, r5)     // Catch:{ IOException -> 0x0046 }
            if (r4 <= 0) goto L_0x0035
            boolean r2 = r3.finishConnect()     // Catch:{ IOException -> 0x0046 }
            if (r2 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0034
            boolean r4 = r3.isOpen()
            if (r4 == 0) goto L_0x0034
            r3.configureBlocking(r1)
        L_0x0034:
            return
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x001d
        L_0x0038:
            java.net.SocketTimeoutException r4 = new java.net.SocketTimeoutException     // Catch:{ IOException -> 0x0046 }
            r5 = 8
            java.lang.String r5 = m65663a(r3, r5)     // Catch:{ IOException -> 0x0046 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0046 }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x0044:
            r4 = move-exception
            goto L_0x004b
        L_0x0046:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r4     // Catch:{ all -> 0x0044 }
        L_0x004b:
            if (r0 == 0) goto L_0x0056
            boolean r5 = r3.isOpen()
            if (r5 == 0) goto L_0x0056
            r3.configureBlocking(r1)
        L_0x0056:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19886k.m65665a(java.nio.channels.SocketChannel, java.net.SocketAddress, long):void");
    }
}
