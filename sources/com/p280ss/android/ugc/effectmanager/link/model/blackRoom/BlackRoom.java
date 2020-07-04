package com.p280ss.android.ugc.effectmanager.link.model.blackRoom;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoom */
public class BlackRoom {
    private long getLockedTime(int i) {
        if (i > 5) {
            i = 5;
        }
        if (i == 1) {
            return 60000;
        }
        return ((long) Math.pow(2.0d, (double) (i - 1))) * 60000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void lock(com.p280ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoomItem r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r6.lockToBlackRoom()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "lock "
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r6.getItemName()     // Catch:{ all -> 0x003c }
            r0.append(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ all -> 0x003c }
            int r1 = r6.lockedCount     // Catch:{ all -> 0x003c }
            r0.append(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = " time for "
            r0.append(r1)     // Catch:{ all -> 0x003c }
            int r6 = r6.lockedCount     // Catch:{ all -> 0x003c }
            long r1 = r5.getLockedTime(r6)     // Catch:{ all -> 0x003c }
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 / r3
            r0.append(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = " min"
            r0.append(r6)     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r5)
            return
        L_0x003c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoom.lock(com.ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoomItem):void");
    }

    public boolean checkHostAvailable(BlackRoomItem blackRoomItem) {
        if (blackRoomItem == null) {
            return false;
        }
        if (!blackRoomItem.inBlackRoom) {
            StringBuilder sb = new StringBuilder();
            sb.append(blackRoomItem.getItemName());
            sb.append(" is available");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - blackRoomItem.startLockTime;
        if (currentTimeMillis >= getLockedTime(blackRoomItem.lockedCount)) {
            StringBuilder sb2 = new StringBuilder("unlock ");
            sb2.append(blackRoomItem.getItemName());
            sb2.append(", locked count = ");
            sb2.append(blackRoomItem.lockedCount);
            sb2.append(", should lock ");
            sb2.append(getLockedTime(blackRoomItem.lockedCount) / 60000);
            sb2.append(" min, already locked ");
            sb2.append(currentTimeMillis / 60000);
            sb2.append(" min");
            blackRoomItem.unlockFromBlackRoom();
            return true;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(blackRoomItem.getItemName());
        sb3.append(" is locked, locked count = ");
        sb3.append(blackRoomItem.lockedCount);
        sb3.append(", should lock ");
        sb3.append(getLockedTime(blackRoomItem.lockedCount) / 60000);
        sb3.append(" min, already locked ");
        sb3.append(currentTimeMillis / 60000);
        sb3.append(" min");
        return false;
    }
}
