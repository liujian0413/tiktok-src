package com.p280ss.ttm.utils;

import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.ss.ttm.utils.VersionInfo */
public class VersionInfo {
    private static String[] mVersion;

    public static String[] getVersion() {
        if (mVersion == null) {
            String[] strArr = {TEVideoRecorder.FACE_BEAUTY_NULL, TEVideoRecorder.FACE_BEAUTY_NULL, TEVideoRecorder.FACE_BEAUTY_NULL, TEVideoRecorder.FACE_BEAUTY_NULL};
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), VideoCacheReadBuffersizeExperiment.DEFAULT);
                strArr[0] = bufferedReader.readLine().split("\\s+")[2];
                bufferedReader.close();
            } catch (IOException unused) {
            }
            strArr[1] = VERSION.RELEASE;
            strArr[2] = Build.MODEL;
            strArr[3] = Build.DISPLAY;
            mVersion = strArr;
        }
        return mVersion;
    }
}
