package com.p280ss.android.ugc.lib.video.bitrate.regulator;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException */
public class BitrateNotMatchException extends Exception {
    private final int code;
    private ShiftInfo shiftInfo;

    public int getCode() {
        return this.code;
    }

    public ShiftInfo getShiftInfo() {
        return this.shiftInfo;
    }

    public void setShiftInfo(ShiftInfo shiftInfo2) {
        this.shiftInfo = shiftInfo2;
    }

    public BitrateNotMatchException(int i, String str) {
        super(str);
        this.code = i;
    }
}
