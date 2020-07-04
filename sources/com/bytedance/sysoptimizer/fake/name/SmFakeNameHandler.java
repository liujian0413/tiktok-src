package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.sysoptimizer.Optimizer;
import java.util.Arrays;

public class SmFakeNameHandler {
    private static String[] BLACK_LIST_5_0 = {"SM-A300F", "SM-A300H", "SM-G530H", "SM-G530FZ", "SM-G530F", "SM-G530BT", "SM-A300M", "SM-G360F", "SM-G530M", "SM-A300G"};
    private static String[] BLACK_LIST_5_1 = {"SM-J200G", "SM-J200GU", "SM-J105B", "SM-J200BT", "SM-J200Y", "SM-G361H", "SM-G6000", "SM-G531H", "SM-J111F", "SM-J111M", "SM-J200F", "SM-A300F", "SM-A300H", "SM-J200H", "SM-G360T1", "SM-G531F", "SM-G530H", "SM-J120F", "SM-J200M", "SM-J120H", "SM-J105F", "SM-G530FZ", "SM-G530F", "SM-A300M", "SM-J120G", "SM-G530BT", "SM-J105H"};
    private static volatile boolean inited;

    private static native void replace(int i);

    private static boolean inAndroid50List() {
        if (!Arrays.asList(BLACK_LIST_5_0).contains(Build.MODEL) || VERSION.SDK_INT != 21) {
            return false;
        }
        return true;
    }

    private static boolean inAndroid51List() {
        if (!Arrays.asList(BLACK_LIST_5_1).contains(Build.MODEL) || VERSION.SDK_INT != 22) {
            return false;
        }
        return true;
    }

    private static boolean inAndroid5x() {
        if (VERSION.SDK_INT == 22 || VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    public static void start(Context context) {
        if (inAndroid5x() && !inited) {
            inited = true;
            if ((inAndroid50List() || inAndroid51List()) && Optimizer.loadOptimizerLibrary(context)) {
                replace(VERSION.SDK_INT);
            }
        }
    }
}
