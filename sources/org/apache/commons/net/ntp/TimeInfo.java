package org.apache.commons.net.ntp;

import java.util.List;

public class TimeInfo {
    private List<String> _comments;
    private Long _delay;
    private boolean _detailsComputed;
    private final NtpV3Packet _message;
    private Long _offset;
    private final long _returnTime;

    public NtpV3Packet getMessage() {
        return this._message;
    }

    public int hashCode() {
        return (((int) this._returnTime) * 31) + this._message.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeDetails() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0._detailsComputed
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 1
            r0._detailsComputed = r1
            java.util.List<java.lang.String> r1 = r0._comments
            if (r1 != 0) goto L_0x0015
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0._comments = r1
        L_0x0015:
            org.apache.commons.net.ntp.NtpV3Packet r1 = r0._message
            org.apache.commons.net.ntp.TimeStamp r1 = r1.getOriginateTimeStamp()
            long r2 = r1.getTime()
            org.apache.commons.net.ntp.NtpV3Packet r4 = r0._message
            org.apache.commons.net.ntp.TimeStamp r4 = r4.getReceiveTimeStamp()
            long r5 = r4.getTime()
            org.apache.commons.net.ntp.NtpV3Packet r7 = r0._message
            org.apache.commons.net.ntp.TimeStamp r7 = r7.getTransmitTimeStamp()
            long r8 = r7.getTime()
            long r10 = r1.ntpValue()
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x005e
            long r1 = r7.ntpValue()
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0056
            long r1 = r0._returnTime
            long r8 = r8 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0._offset = r1
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r2 = "Error: zero orig time -- cannot compute delay"
            r1.add(r2)
            return
        L_0x0056:
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r2 = "Error: zero orig time -- cannot compute delay/offset"
            r1.add(r2)
            return
        L_0x005e:
            long r10 = r4.ntpValue()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00c7
            long r10 = r7.ntpValue()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x006f
            goto L_0x00c7
        L_0x006f:
            long r10 = r0._returnTime
            long r10 = r10 - r2
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r4 = "Error: xmitTime < rcvTime"
            r1.add(r4)
            goto L_0x00a3
        L_0x007e:
            r1 = 0
            long r14 = r8 - r5
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0088
            long r12 = r10 - r14
            goto L_0x00a4
        L_0x0088:
            r1 = 0
            long r14 = r14 - r10
            r16 = 1
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x009c
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00a3
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r4 = "Info: processing time > total network time by 1 ms -> assume zero delay"
            r1.add(r4)
            goto L_0x00a4
        L_0x009c:
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r4 = "Warning: processing time > total network time"
            r1.add(r4)
        L_0x00a3:
            r12 = r10
        L_0x00a4:
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0._delay = r1
            long r10 = r0._returnTime
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b7
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r4 = "Error: OrigTime > DestRcvTime"
            r1.add(r4)
        L_0x00b7:
            r1 = 0
            long r5 = r5 - r2
            long r1 = r0._returnTime
            long r8 = r8 - r1
            long r5 = r5 + r8
            r1 = 2
            long r5 = r5 / r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0._offset = r1
            goto L_0x0107
        L_0x00c7:
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r10 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r1.add(r10)
            long r10 = r0._returnTime
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            java.util.List<java.lang.String> r1 = r0._comments
            java.lang.String r10 = "Error: OrigTime > DestRcvTime"
            r1.add(r10)
            goto L_0x00e5
        L_0x00dc:
            long r10 = r0._returnTime
            long r10 = r10 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0._delay = r1
        L_0x00e5:
            long r10 = r4.ntpValue()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00f5
            long r5 = r5 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0._offset = r1
            return
        L_0x00f5:
            long r1 = r7.ntpValue()
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0107
            long r1 = r0._returnTime
            long r8 = r8 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0._offset = r1
            return
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) obj;
        if (this._returnTime != timeInfo._returnTime || !this._message.equals(timeInfo._message)) {
            return false;
        }
        return true;
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, boolean z) {
        this(ntpV3Packet, j, null, z);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list, boolean z) {
        if (ntpV3Packet != null) {
            this._returnTime = j;
            this._message = ntpV3Packet;
            this._comments = list;
            if (z) {
                computeDetails();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("message cannot be null");
    }
}
