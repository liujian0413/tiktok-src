package com.ttnet.org.chromium.net1;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.util.Iterator;
import java.util.List;

@JNINamespace("net::android::cellular_signal_strength")
public class AndroidCellularSignalStrength {
    public static int getSignalStrengthDbm(Context context) {
        List registeredCellInfo = getRegisteredCellInfo(context);
        if (registeredCellInfo == null || registeredCellInfo.size() != 1) {
            return Integer.MIN_VALUE;
        }
        return getSignalStrengthDbm((CellInfo) registeredCellInfo.get(0));
    }

    public static int getSignalStrengthLevel(Context context) {
        List registeredCellInfo = getRegisteredCellInfo(context);
        if (registeredCellInfo == null || registeredCellInfo.size() != 1) {
            return Integer.MIN_VALUE;
        }
        return getSignalStrengthLevel((CellInfo) registeredCellInfo.get(0));
    }

    private static boolean isAPIAvailable(Context context) {
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        try {
            if (context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static List<CellInfo> getRegisteredCellInfo(Context context) {
        if (!isAPIAvailable(context)) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        if (allCellInfo == null) {
            return null;
        }
        Iterator it = allCellInfo.iterator();
        while (it.hasNext()) {
            if (!((CellInfo) it.next()).isRegistered()) {
                it.remove();
            }
        }
        return allCellInfo;
    }

    private static int getSignalStrengthDbm(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
        }
        return Integer.MIN_VALUE;
    }

    private static int getSignalStrengthLevel(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
        }
        return Integer.MIN_VALUE;
    }
}
