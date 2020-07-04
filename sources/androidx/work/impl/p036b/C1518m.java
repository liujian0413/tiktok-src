package androidx.work.impl.p036b;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;

/* renamed from: androidx.work.impl.b.m */
public final class C1518m {
    /* renamed from: a */
    public static int m7495a(BackoffPolicy backoffPolicy) {
        switch (backoffPolicy) {
            case EXPONENTIAL:
                return 0;
            case LINEAR:
                return 1;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(backoffPolicy);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static BackoffPolicy m7501b(int i) {
        switch (i) {
            case 0:
                return BackoffPolicy.EXPONENTIAL;
            case 1:
                return BackoffPolicy.LINEAR;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to BackoffPolicy");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static NetworkType m7502c(int i) {
        switch (i) {
            case 0:
                return NetworkType.NOT_REQUIRED;
            case 1:
                return NetworkType.CONNECTED;
            case 2:
                return NetworkType.UNMETERED;
            case 3:
                return NetworkType.NOT_ROAMING;
            case 4:
                return NetworkType.METERED;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to NetworkType");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m7496a(NetworkType networkType) {
        switch (networkType) {
            case NOT_REQUIRED:
                return 0;
            case CONNECTED:
                return 1;
            case UNMETERED:
                return 2;
            case NOT_ROAMING:
                return 3;
            case METERED:
                return 4;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(networkType);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m7497a(State state) {
        switch (state) {
            case ENQUEUED:
                return 0;
            case RUNNING:
                return 1;
            case SUCCEEDED:
                return 2;
            case FAILED:
                return 3;
            case BLOCKED:
                return 4;
            case CANCELLED:
                return 5;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(state);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static State m7498a(int i) {
        switch (i) {
            case 0:
                return State.ENQUEUED;
            case 1:
                return State.RUNNING;
            case 2:
                return State.SUCCEEDED;
            case 3:
                return State.FAILED;
            case 4:
                return State.BLOCKED;
            case 5:
                return State.CANCELLED;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to State");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|(0)|23|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|(5:6|7|(2:9|10)|11|12)|13|14|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC, Splitter:B:29:0x0044] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1456d m7499a(byte[] r5) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0042, all -> 0x0036 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0042, all -> 0x0036 }
            int r5 = r2.readInt()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
        L_0x0017:
            if (r5 <= 0) goto L_0x002b
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            r0.mo6686a(r3, r4)     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            int r5 = r5 + -1
            goto L_0x0017
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r1.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0032:
            r5 = move-exception
            goto L_0x0039
        L_0x0034:
            r5 = r2
            goto L_0x0042
        L_0x0036:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r1.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r5
        L_0x0042:
            if (r5 == 0) goto L_0x002e
            r5.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p036b.C1518m.m7499a(byte[]):androidx.work.d");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|(3:4|5|(5:6|7|(2:10|8)|11|12))|13|14|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[SYNTHETIC, Splitter:B:29:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m7500a(androidx.work.C1456d r4) {
        /*
            int r0 = r4.mo6685a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0050, all -> 0x0045 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0050, all -> 0x0045 }
            int r1 = r4.mo6685a()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.util.Set<androidx.work.d$a> r4 = r4.f5669a     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
        L_0x001f:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            androidx.work.d$a r1 = (androidx.work.C1456d.C1457a) r1     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            android.net.Uri r3 = r1.f5670a     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            boolean r1 = r1.f5671b     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            goto L_0x001f
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r0.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x0041:
            r4 = move-exception
            goto L_0x0047
        L_0x0043:
            r1 = r2
            goto L_0x0050
        L_0x0045:
            r4 = move-exception
            r2 = r1
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            r0.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r4
        L_0x0050:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003d
        L_0x0056:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p036b.C1518m.m7500a(androidx.work.d):byte[]");
    }
}
