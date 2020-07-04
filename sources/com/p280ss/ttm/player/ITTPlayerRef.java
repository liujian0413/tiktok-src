package com.p280ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;

/* renamed from: com.ss.ttm.player.ITTPlayerRef */
public abstract class ITTPlayerRef {
    /* access modifiers changed from: protected */
    public abstract void close();

    /* access modifiers changed from: protected */
    public abstract Context getContext();

    /* access modifiers changed from: protected */
    public abstract double getDoubleOption(int i, double d);

    /* access modifiers changed from: protected */
    public abstract float getFloatOption(int i, float f);

    /* access modifiers changed from: protected */
    public abstract int getIntOption(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract int getLifeId();

    /* access modifiers changed from: protected */
    public abstract long getLongOption(int i, long j);

    /* access modifiers changed from: protected */
    public abstract String getStringOption(int i);

    /* access modifiers changed from: protected */
    public abstract int getType();

    /* access modifiers changed from: protected */
    public void invalid() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean isValid();

    /* access modifiers changed from: protected */
    public abstract void mouseEvent(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void pause();

    /* access modifiers changed from: protected */
    public abstract void prepare();

    /* access modifiers changed from: protected */
    public abstract void prevClose();

    /* access modifiers changed from: protected */
    public abstract void release();

    /* access modifiers changed from: protected */
    public abstract void reset();

    /* access modifiers changed from: protected */
    public abstract void rotateCamera(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void seekTo(int i);

    /* access modifiers changed from: protected */
    public abstract void setCacheFile(String str, int i);

    /* access modifiers changed from: protected */
    public abstract void setDataSource(IMediaDataSource iMediaDataSource);

    /* access modifiers changed from: protected */
    public abstract void setDataSource(String str);

    /* access modifiers changed from: protected */
    public abstract void setDataSourceFd(int i);

    /* access modifiers changed from: protected */
    public abstract int setDoubleOption(int i, double d);

    /* access modifiers changed from: protected */
    public abstract int setFloatOption(int i, float f);

    /* access modifiers changed from: protected */
    public abstract int setIntOption(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract int setLongOption(int i, long j);

    /* access modifiers changed from: protected */
    public abstract void setLooping(int i);

    /* access modifiers changed from: protected */
    public abstract void setNotifyState(long j);

    /* access modifiers changed from: protected */
    public abstract void setOnScreenshotListener(OnScreenshotListener onScreenshotListener);

    /* access modifiers changed from: protected */
    public abstract int setStringOption(int i, String str);

    /* access modifiers changed from: protected */
    public abstract void setSurface(Surface surface);

    /* access modifiers changed from: protected */
    public abstract void setVolume(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void start();

    /* access modifiers changed from: protected */
    public abstract void stop();

    /* access modifiers changed from: protected */
    public abstract void switchStream(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void takeScreenshot();

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.p280ss.ttm.player.ITTPlayerRef create(android.content.Context r11, com.p280ss.ttm.player.TTPlayerClient r12, java.util.HashMap<java.lang.Integer, java.lang.Integer> r13) {
        /*
            java.lang.Class<com.ss.ttm.player.ITTPlayerRef> r0 = com.p280ss.ttm.player.ITTPlayerRef.class
            monitor-enter(r0)
            int r1 = com.p280ss.ttm.utils.HardWareInfo.getCpuFamily()     // Catch:{ all -> 0x00f8 }
            r2 = 100
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r1 != r6) goto L_0x00a4
            r1 = 2
            if (r13 == 0) goto L_0x0063
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r7 = r13.get(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x00f8 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x00f8 }
            if (r7 != r6) goto L_0x0063
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r7 = r13.get(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x00f8 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x00f8 }
            if (r7 != r6) goto L_0x0063
            java.lang.String r7 = "com.ss.ttm.player.TTPlayerIPCRef"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x005b }
            java.lang.String r8 = "create"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x005b }
            java.lang.Class<com.ss.ttm.player.TTPlayerClient> r10 = com.p280ss.ttm.player.TTPlayerClient.class
            r9[r5] = r10     // Catch:{ Exception -> 0x005b }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r6] = r10     // Catch:{ Exception -> 0x005b }
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            r9[r1] = r10     // Catch:{ Exception -> 0x005b }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ Exception -> 0x005b }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x005b }
            r8[r5] = r12     // Catch:{ Exception -> 0x005b }
            r8[r6] = r11     // Catch:{ Exception -> 0x005b }
            r8[r1] = r13     // Catch:{ Exception -> 0x005b }
            java.lang.Object r1 = r7.invoke(r3, r8)     // Catch:{ Exception -> 0x005b }
            com.ss.ttm.player.ITTPlayerRef r1 = (com.p280ss.ttm.player.ITTPlayerRef) r1     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r1 = r3
        L_0x005c:
            if (r1 == 0) goto L_0x0098
            boolean r3 = com.p280ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x00f8 }
            goto L_0x0098
        L_0x0063:
            boolean r7 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r1, r5)     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x0099
            java.lang.String r7 = "com.ss.ttm.player.TTPlayerIPCRef"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r8 = "create"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<com.ss.ttm.player.TTPlayerClient> r10 = com.p280ss.ttm.player.TTPlayerClient.class
            r9[r5] = r10     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r6] = r10     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            r9[r1] = r10     // Catch:{ Exception -> 0x0092 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0092 }
            r8[r5] = r12     // Catch:{ Exception -> 0x0092 }
            r8[r6] = r11     // Catch:{ Exception -> 0x0092 }
            r8[r1] = r13     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r1 = r7.invoke(r3, r8)     // Catch:{ Exception -> 0x0092 }
            com.ss.ttm.player.ITTPlayerRef r1 = (com.p280ss.ttm.player.ITTPlayerRef) r1     // Catch:{ Exception -> 0x0092 }
            goto L_0x0093
        L_0x0092:
            r1 = r3
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            com.p280ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x00f8 }
        L_0x0098:
            r3 = r1
        L_0x0099:
            if (r3 != 0) goto L_0x00a4
            com.ss.ttm.player.TTPlayerRef r3 = com.p280ss.ttm.player.TTPlayerRef.create(r12, r11)     // Catch:{ all -> 0x00f8 }
            if (r3 == 0) goto L_0x00a4
            com.p280ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x00f8 }
        L_0x00a4:
            if (r3 != 0) goto L_0x00f6
            r11 = 10
            r12 = 7
            if (r13 == 0) goto L_0x00e7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r1 = r13.get(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00f8 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00f8 }
            if (r1 != r6) goto L_0x00e7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r1 = r13.get(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00f8 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00f8 }
            if (r1 != 0) goto L_0x00f6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x00f8 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x00f8 }
            if (r11 >= r4) goto L_0x00f6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00f8 }
            r13.put(r11, r12)     // Catch:{ all -> 0x00f8 }
            goto L_0x00f6
        L_0x00e7:
            boolean r13 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r12, r5)     // Catch:{ all -> 0x00f8 }
            if (r13 != 0) goto L_0x00f6
            int r11 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r11, r5)     // Catch:{ all -> 0x00f8 }
            if (r11 >= r4) goto L_0x00f6
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r12, r6)     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            monitor-exit(r0)
            return r3
        L_0x00f8:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.ITTPlayerRef.create(android.content.Context, com.ss.ttm.player.TTPlayerClient, java.util.HashMap):com.ss.ttm.player.ITTPlayerRef");
    }
}
