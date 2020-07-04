package com.p280ss.video.rtc.engine.utils;

import android.support.p022v4.content.C0683b;
import com.p280ss.video.rtc.base.utils.RtcContextUtils;

/* renamed from: com.ss.video.rtc.engine.utils.PermissionChecker */
public class PermissionChecker {
    public static boolean checkAudioPermission() {
        if (C0683b.m2909b(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (C0683b.m2909b(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
