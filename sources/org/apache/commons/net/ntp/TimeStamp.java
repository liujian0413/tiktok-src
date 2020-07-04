package org.apache.commons.net.ntp;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    public long ntpValue() {
        return this.ntpTime;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public int hashCode() {
        return (int) (this.ntpTime ^ (this.ntpTime >>> 32));
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            this.simpleFormatter = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            this.simpleFormatter.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            this.utcFormatter = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }

    public TimeStamp(long j) {
        this.ntpTime = j;
    }

    public TimeStamp(String str) throws NumberFormatException {
        this.ntpTime = decodeNtpHexString(str);
    }

    public static TimeStamp getNtpTime(long j) {
        return new TimeStamp(toNtpTime(j));
    }

    public static TimeStamp parseNtpString(String str) throws NumberFormatException {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public TimeStamp(Date date) {
        long j;
        if (date == null) {
            j = 0;
        } else {
            j = toNtpTime(date.getTime());
        }
        this.ntpTime = j;
    }

    public static String toString(long j) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, j & 4294967295L);
        return sb.toString();
    }

    public int compareTo(TimeStamp timeStamp) {
        long j = this.ntpTime;
        long j2 = timeStamp.ntpTime;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TimeStamp) || this.ntpTime != ((TimeStamp) obj).ntpValue()) {
            return false;
        }
        return true;
    }

    protected static long decodeNtpHexString(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(46);
            if (indexOf != -1) {
                return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
            }
            if (str.length() == 0) {
                return 0;
            }
            return Long.parseLong(str, 16) << 32;
        }
        throw new NumberFormatException(TEVideoRecorder.FACE_BEAUTY_NULL);
    }

    public static long getTime(long j) {
        long j2 = (j >>> 32) & 4294967295L;
        double d = (double) (j & 4294967295L);
        Double.isNaN(d);
        long round = Math.round((d * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j2) == 0) {
            return (j2 * 1000) + 2085978496000L + round;
        }
        return ((j2 * 1000) - 2208988800000L) + round;
    }

    protected static long toNtpTime(long j) {
        boolean z;
        long j2;
        if (j < 2085978496000L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = j - -2208988800000L;
        } else {
            j2 = j - 2085978496000L;
        }
        long j3 = j2 / 1000;
        long j4 = ((j2 % 1000) * 4294967296L) / 1000;
        if (z) {
            j3 |= 2147483648L;
        }
        return j4 | (j3 << 32);
    }

    private static void appendHexString(StringBuilder sb, long j) {
        String hexString = Long.toHexString(j);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }
}
