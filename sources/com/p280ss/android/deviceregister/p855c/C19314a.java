package com.p280ss.android.deviceregister.p855c;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.c.a */
final class C19314a {

    /* renamed from: a */
    private static final C19316a f52225a;

    /* renamed from: com.ss.android.deviceregister.c.a$a */
    static class C19316a {
        private C19316a() {
        }

        /* renamed from: a */
        public JSONArray mo51218a(Context context) {
            if (context == null) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            JSONArray jSONArray = new JSONArray();
            List neighboringCellInfo = telephonyManager.getNeighboringCellInfo();
            ArrayList arrayList = new ArrayList();
            if (neighboringCellInfo != null) {
                for (int i = 0; i < neighboringCellInfo.size(); i++) {
                    try {
                        NeighboringCellInfo neighboringCellInfo2 = (NeighboringCellInfo) neighboringCellInfo.get(i);
                        if (!arrayList.contains(Integer.valueOf(neighboringCellInfo2.getCid()))) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cellId", neighboringCellInfo2.getCid());
                            jSONObject.put("lac", neighboringCellInfo2.getLac());
                            jSONObject.put("rssi", neighboringCellInfo2.getRssi());
                            jSONObject.put("psc", neighboringCellInfo2.getPsc());
                            jSONObject.put("networktype", neighboringCellInfo2.getNetworkType());
                            arrayList.add(Integer.valueOf(neighboringCellInfo2.getCid()));
                            jSONArray.put(jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: com.ss.android.deviceregister.c.a$b */
    static class C19317b extends C19316a {
        private C19317b() {
            super();
        }

        /* renamed from: a */
        public final JSONArray mo51218a(Context context) {
            if (context == null) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            JSONArray jSONArray = new JSONArray();
            List allCellInfo = telephonyManager.getAllCellInfo();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < allCellInfo.size(); i++) {
                try {
                    CellInfo cellInfo = (CellInfo) allCellInfo.get(i);
                    if (cellInfo instanceof CellInfoGsm) {
                        CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                        CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                        if (!arrayList.contains(cellIdentity)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cellId", cellIdentity.getCid());
                            jSONObject.put("lac", cellIdentity.getLac());
                            jSONObject.put("dbm", cellSignalStrength.getDbm());
                            jSONObject.put("mcc", cellIdentity.getMcc());
                            jSONObject.put("mnc", cellIdentity.getMnc());
                            jSONArray.put(jSONObject);
                            arrayList.add(cellIdentity);
                        }
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellSignalStrengthLte cellSignalStrength2 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                        CellIdentityLte cellIdentity2 = ((CellInfoLte) cellInfo).getCellIdentity();
                        if (!arrayList.contains(cellIdentity2)) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("cellId", cellIdentity2.getCi());
                            jSONObject2.put("tac", cellIdentity2.getTac());
                            jSONObject2.put("dbm", cellSignalStrength2.getDbm());
                            jSONObject2.put("mcc", cellIdentity2.getMcc());
                            jSONObject2.put("mnc", cellIdentity2.getMnc());
                            jSONArray.put(jSONObject2);
                            arrayList.add(cellIdentity2);
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellSignalStrengthWcdma cellSignalStrength3 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                        CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        if (!arrayList.contains(cellIdentity3)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("cellId", cellIdentity3.getCid());
                            jSONObject3.put("lac", cellIdentity3.getLac());
                            jSONObject3.put("dbm", cellSignalStrength3.getDbm());
                            jSONObject3.put("psc", cellIdentity3.getPsc());
                            jSONObject3.put("mcc", cellIdentity3.getMcc());
                            jSONObject3.put("mnc", cellIdentity3.getMnc());
                            jSONArray.put(jSONObject3);
                            arrayList.add(cellIdentity3);
                        }
                    } else if (cellInfo instanceof CellInfoCdma) {
                        CellSignalStrengthCdma cellSignalStrength4 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                        CellIdentityCdma cellIdentity4 = ((CellInfoCdma) cellInfo).getCellIdentity();
                        if (!arrayList.contains(cellIdentity4)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("nid", cellIdentity4.getNetworkId());
                            jSONObject4.put("sid", cellIdentity4.getSystemId());
                            jSONObject4.put("bid", cellIdentity4.getBasestationId());
                            jSONObject4.put("dbm", cellSignalStrength4.getDbm());
                            jSONArray.put(jSONObject4);
                            arrayList.add(cellIdentity4);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return jSONArray;
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f52225a = new C19317b();
        } else {
            f52225a = new C19316a();
        }
    }

    /* renamed from: a */
    public static JSONArray m63338a(Context context) {
        return f52225a.mo51218a(context);
    }
}
