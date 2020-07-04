package org.apache.commons.net.ntp;

import com.taobao.android.dexposed.ClassUtils;
import java.net.DatagramPacket;
import java.util.Arrays;

public class NtpV3Impl implements NtpV3Packet {
    private final byte[] buf = new byte[48];

    /* renamed from: dp */
    private volatile DatagramPacket f123353dp;

    /* renamed from: ui */
    protected static final int m149829ui(byte b) {
        return b & 255;
    }

    /* renamed from: ul */
    protected static final long m149830ul(byte b) {
        return (long) (b & 255);
    }

    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    public int getPoll() {
        return this.buf[2];
    }

    public int getPrecision() {
        return this.buf[3];
    }

    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    public int getReferenceId() {
        return getInt(12);
    }

    public int getRootDelay() {
        return getInt(4);
    }

    public int getRootDispersion() {
        return getInt(8);
    }

    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    public int getMode() {
        return (m149829ui(this.buf[0]) >> 0) & 7;
    }

    public double getRootDispersionInMillisDouble() {
        double rootDispersion = (double) getRootDispersion();
        Double.isNaN(rootDispersion);
        return rootDispersion / 65.536d;
    }

    public int getStratum() {
        return m149829ui(this.buf[1]);
    }

    public int getVersion() {
        return (m149829ui(this.buf[0]) >> 3) & 7;
    }

    private String idAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            char c = (char) this.buf[i + 12];
            if (c == 0) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public synchronized DatagramPacket getDatagramPacket() {
        if (this.f123353dp == null) {
            this.f123353dp = new DatagramPacket(this.buf, this.buf.length);
            this.f123353dp.setPort(123);
        }
        return this.f123353dp;
    }

    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    private String idAsIPAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(m149829ui(this.buf[12]));
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(m149829ui(this.buf[13]));
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(m149829ui(this.buf[14]));
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(m149829ui(this.buf[15]));
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[version:");
        sb.append(getVersion());
        sb.append(", mode:");
        sb.append(getMode());
        sb.append(", poll:");
        sb.append(getPoll());
        sb.append(", precision:");
        sb.append(getPrecision());
        sb.append(", delay:");
        sb.append(getRootDelay());
        sb.append(", dispersion(ms):");
        sb.append(getRootDispersionInMillisDouble());
        sb.append(", id:");
        sb.append(getReferenceIdString());
        sb.append(", xmitTime:");
        sb.append(getTransmitTimeStamp().toDateString());
        sb.append(" ]");
        return sb.toString();
    }

    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    private TimeStamp getTimestamp(int i) {
        return new TimeStamp(getLong(i));
    }

    public void setMode(int i) {
        this.buf[0] = (byte) ((i & 7) | (this.buf[0] & 248));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
    }

    public void setVersion(int i) {
        this.buf[0] = (byte) (((i & 7) << 3) | (this.buf[0] & 199));
    }

    private int getInt(int i) {
        return m149829ui(this.buf[i + 3]) | (m149829ui(this.buf[i]) << 24) | (m149829ui(this.buf[i + 1]) << 16) | (m149829ui(this.buf[i + 2]) << 8);
    }

    private long getLong(int i) {
        return (m149830ul(this.buf[i]) << 56) | (m149830ul(this.buf[i + 1]) << 48) | (m149830ul(this.buf[i + 2]) << 40) | (m149830ul(this.buf[i + 3]) << 32) | (m149830ul(this.buf[i + 4]) << 24) | (m149830ul(this.buf[i + 5]) << 16) | (m149830ul(this.buf[i + 6]) << 8) | m149830ul(this.buf[i + 7]);
    }

    private void setTimestamp(int i, TimeStamp timeStamp) {
        long j;
        if (timeStamp == null) {
            j = 0;
        } else {
            j = timeStamp.ntpValue();
        }
        for (int i2 = 7; i2 >= 0; i2--) {
            this.buf[i + i2] = (byte) ((int) (255 & j));
            j >>>= 8;
        }
    }
}
