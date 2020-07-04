package org.apache.commons.net.ftp;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

public class FTPFile implements Serializable {
    private static final long serialVersionUID = 9010790363003271996L;
    private Calendar _date;
    private String _group;
    private int _hardLinkCount;
    private String _link;
    private String _name;
    private final boolean[][] _permissions;
    private String _rawListing;
    private long _size;
    private int _type;
    private String _user;

    public String getGroup() {
        return this._group;
    }

    public int getHardLinkCount() {
        return this._hardLinkCount;
    }

    public String getLink() {
        return this._link;
    }

    public String getName() {
        return this._name;
    }

    public String getRawListing() {
        return this._rawListing;
    }

    public long getSize() {
        return this._size;
    }

    public Calendar getTimestamp() {
        return this._date;
    }

    public int getType() {
        return this._type;
    }

    public String getUser() {
        return this._user;
    }

    public boolean isDirectory() {
        if (this._type == 1) {
            return true;
        }
        return false;
    }

    public boolean isFile() {
        if (this._type == 0) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (this._permissions != null) {
            return true;
        }
        return false;
    }

    public String toFormattedString() {
        return toFormattedString(null);
    }

    public String toString() {
        return getRawListing();
    }

    public boolean isSymbolicLink() {
        if (this._type == 2) {
            return true;
        }
        return false;
    }

    public boolean isUnknown() {
        if (this._type == 3) {
            return true;
        }
        return false;
    }

    private char formatType() {
        switch (this._type) {
            case 0:
                return '-';
            case 1:
                return 'd';
            case 2:
                return 'l';
            default:
                return '?';
        }
    }

    public FTPFile() {
        this._permissions = (boolean[][]) Array.newInstance(boolean.class, new int[]{3, 3});
        this._type = 3;
        this._size = -1;
        this._user = "";
        this._group = "";
    }

    public void setGroup(String str) {
        this._group = str;
    }

    public void setHardLinkCount(int i) {
        this._hardLinkCount = i;
    }

    public void setLink(String str) {
        this._link = str;
    }

    public void setName(String str) {
        this._name = str;
    }

    public void setRawListing(String str) {
        this._rawListing = str;
    }

    public void setSize(long j) {
        this._size = j;
    }

    public void setTimestamp(Calendar calendar) {
        this._date = calendar;
    }

    public void setType(int i) {
        this._type = i;
    }

    public void setUser(String str) {
        this._user = str;
    }

    FTPFile(String str) {
        this._permissions = null;
        this._rawListing = str;
        this._type = 3;
        this._size = -1;
        this._user = "";
        this._group = "";
    }

    private String permissionToString(int i) {
        StringBuilder sb = new StringBuilder();
        if (hasPermission(i, 0)) {
            sb.append('r');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 1)) {
            sb.append('w');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 2)) {
            sb.append('x');
        } else {
            sb.append('-');
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toFormattedString(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.isValid()
            if (r0 != 0) goto L_0x0009
            java.lang.String r9 = "[Invalid: could not parse file entry]"
            return r9
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Formatter r1 = new java.util.Formatter
            r1.<init>(r0)
            char r2 = r8.formatType()
            r0.append(r2)
            r2 = 0
            java.lang.String r3 = r8.permissionToString(r2)
            r0.append(r3)
            r3 = 1
            java.lang.String r4 = r8.permissionToString(r3)
            r0.append(r4)
            r4 = 2
            java.lang.String r5 = r8.permissionToString(r4)
            r0.append(r5)
            java.lang.String r5 = " %4d"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r7 = r8.getHardLinkCount()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            r1.format(r5, r6)
            java.lang.String r5 = " %-8s %-8s"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r8.getUser()
            r4[r2] = r6
            java.lang.String r6 = r8.getGroup()
            r4[r3] = r6
            r1.format(r5, r4)
            java.lang.String r4 = " %8d"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            long r6 = r8.getSize()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r2] = r6
            r1.format(r4, r5)
            java.util.Calendar r4 = r8.getTimestamp()
            if (r4 == 0) goto L_0x00e0
            if (r9 == 0) goto L_0x0089
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)
            java.util.TimeZone r5 = r4.getTimeZone()
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0089
            java.util.Date r4 = r4.getTime()
            java.util.Calendar r9 = java.util.Calendar.getInstance(r9)
            r9.setTime(r4)
            goto L_0x008a
        L_0x0089:
            r9 = r4
        L_0x008a:
            java.lang.String r4 = " %1$tY-%1$tm-%1$td"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r9
            r1.format(r4, r5)
            r4 = 11
            boolean r4 = r9.isSet(r4)
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = " %1$tH"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r9
            r1.format(r4, r5)
            r4 = 12
            boolean r4 = r9.isSet(r4)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r4 = ":%1$tM"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r9
            r1.format(r4, r5)
            r4 = 13
            boolean r4 = r9.isSet(r4)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r4 = ":%1$tS"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r9
            r1.format(r4, r5)
            r4 = 14
            boolean r4 = r9.isSet(r4)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r4 = ".%1$tL"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r9
            r1.format(r4, r5)
        L_0x00d7:
            java.lang.String r4 = " %1$tZ"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r9
            r1.format(r4, r3)
        L_0x00e0:
            r9 = 32
            r0.append(r9)
            java.lang.String r9 = r8.getName()
            r0.append(r9)
            r1.close()
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.FTPFile.toFormattedString(java.lang.String):java.lang.String");
    }

    public boolean hasPermission(int i, int i2) {
        if (this._permissions == null) {
            return false;
        }
        return this._permissions[i][i2];
    }

    public void setPermission(int i, int i2, boolean z) {
        this._permissions[i][i2] = z;
    }
}
