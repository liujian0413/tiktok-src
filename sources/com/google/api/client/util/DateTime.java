package com.google.api.client.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DateTime implements Serializable {
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Pattern RFC3339_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;

    public final int getTimeZoneShift() {
        return this.tzShift;
    }

    public final long getValue() {
        return this.value;
    }

    public final boolean isDateOnly() {
        return this.dateOnly;
    }

    public final String toString() {
        return toStringRfc3339();
    }

    public final int hashCode() {
        long j;
        long[] jArr = new long[3];
        jArr[0] = this.value;
        if (this.dateOnly) {
            j = 1;
        } else {
            j = 0;
        }
        jArr[1] = j;
        jArr[2] = (long) this.tzShift;
        return Arrays.hashCode(jArr);
    }

    public final String toStringRfc3339() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.tzShift) * 60000));
        appendInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        appendInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        appendInt(sb, gregorianCalendar.get(5), 2);
        if (!this.dateOnly) {
            sb.append('T');
            appendInt(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            appendInt(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            appendInt(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                appendInt(sb, gregorianCalendar.get(14), 3);
            }
            if (this.tzShift == 0) {
                sb.append('Z');
            } else {
                int i = this.tzShift;
                if (this.tzShift > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                int i3 = i % 60;
                appendInt(sb, i2, 2);
                sb.append(':');
                appendInt(sb, i3, 2);
            }
        }
        return sb.toString();
    }

    public DateTime(long j) {
        this(false, j, null);
    }

    public DateTime(String str) {
        DateTime parseRfc3339 = parseRfc3339(str);
        this.dateOnly = parseRfc3339.dateOnly;
        this.value = parseRfc3339.value;
        this.tzShift = parseRfc3339.tzShift;
    }

    public DateTime(Date date) {
        this(date.getTime());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        if (this.dateOnly == dateTime.dateOnly && this.value == dateTime.value && this.tzShift == dateTime.tzShift) {
            return true;
        }
        return false;
    }

    public static DateTime parseRfc3339(String str) throws NumberFormatException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        String str3;
        Matcher matcher = RFC3339_PATTERN.matcher(str);
        if (!matcher.matches()) {
            String str4 = "Invalid date/time format: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = str4.concat(valueOf);
            } else {
                str3 = new String(str4);
            }
            throw new NumberFormatException(str3);
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            z = true;
        } else {
            z = false;
        }
        String group = matcher.group(9);
        if (group != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer num = null;
        if (!z2 || z) {
            if (z) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    double parseInt7 = (double) ((float) Integer.parseInt(matcher.group(8).substring(1)));
                    z3 = z;
                    double pow = Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3));
                    Double.isNaN(parseInt7);
                    i = (int) (parseInt7 / pow);
                    i3 = parseInt5;
                    i2 = parseInt6;
                } else {
                    z3 = z;
                    i3 = parseInt5;
                    i2 = parseInt6;
                    i = 0;
                }
                i4 = parseInt4;
            } else {
                z3 = z;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i4, i3, i2);
            gregorianCalendar.set(14, i);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z3 && z2) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i5 = 0;
                } else {
                    int parseInt8 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    if (matcher.group(10).charAt(0) == '-') {
                        i6 = -parseInt8;
                    } else {
                        i6 = parseInt8;
                    }
                    timeInMillis -= ((long) i6) * 60000;
                    i5 = i6;
                }
                num = Integer.valueOf(i5);
            }
            return new DateTime(!z3, timeInMillis, num);
        }
        String valueOf2 = String.valueOf("Invalid date/time format, cannot specify time zone shift without specifying time: ");
        String valueOf3 = String.valueOf(str);
        if (valueOf3.length() != 0) {
            str2 = valueOf2.concat(valueOf3);
        } else {
            str2 = new String(valueOf2);
        }
        throw new NumberFormatException(str2);
    }

    public DateTime(long j, int i) {
        this(false, j, Integer.valueOf(i));
    }

    public DateTime(Date date, TimeZone timeZone) {
        Integer num;
        long time = date.getTime();
        if (timeZone == null) {
            num = null;
        } else {
            num = Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000);
        }
        this(false, time, num);
    }

    private static void appendInt(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i2;
        int i4 = i;
        while (i4 > 0) {
            i4 /= 10;
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public DateTime(boolean z, long j, Integer num) {
        int i;
        this.dateOnly = z;
        this.value = j;
        if (z) {
            i = 0;
        } else if (num == null) {
            i = TimeZone.getDefault().getOffset(j) / 60000;
        } else {
            i = num.intValue();
        }
        this.tzShift = i;
    }
}
