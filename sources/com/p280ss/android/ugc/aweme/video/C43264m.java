package com.p280ss.android.ugc.aweme.video;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;

/* renamed from: com.ss.android.ugc.aweme.video.m */
public class C43264m {

    /* renamed from: c */
    private static final String f111997c = "m";

    /* renamed from: d */
    private static C43264m f111998d;

    /* renamed from: a */
    public int f111999a = Integer.MIN_VALUE;

    /* renamed from: b */
    public TelephonyManager f112000b;

    /* renamed from: e */
    private PhoneStateListener f112001e;

    /* renamed from: b */
    public final void mo105016b() {
        if (this.f112000b != null) {
            this.f112000b.listen(this.f112001e, 0);
        }
    }

    /* renamed from: a */
    public final void mo105014a() {
        if (this.f112000b != null) {
            if (this.f112001e == null) {
                this.f112001e = new PhoneStateListener() {
                    public final void onCellLocationChanged(CellLocation cellLocation) {
                    }

                    public final void onServiceStateChanged(ServiceState serviceState) {
                    }

                    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                        try {
                            int parseInt = Integer.parseInt(signalStrength.toString().split(" ")[9]);
                            int gsmSignalStrength = (signalStrength.getGsmSignalStrength() * 2) - 113;
                            if (C43264m.this.f112000b.getNetworkType() == 13) {
                                C43264m.this.f111999a = parseInt;
                            } else {
                                C43264m.this.f111999a = gsmSignalStrength;
                            }
                        } catch (Exception unused) {
                        }
                    }
                };
            }
            this.f112000b.listen(this.f112001e, 256);
        }
    }

    private C43264m(Context context) {
        if (context != null) {
            this.f112000b = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        }
    }

    /* renamed from: a */
    public static synchronized C43264m m137242a(Context context) {
        C43264m mVar;
        synchronized (C43264m.class) {
            if (f111998d == null) {
                f111998d = new C43264m(context);
            }
            mVar = f111998d;
        }
        return mVar;
    }

    /* renamed from: b */
    public final int mo105015b(Context context) {
        try {
            if (NetworkUtils.getNetworkType(context) == NetworkType.WIFI) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    this.f111999a = connectionInfo.getRssi();
                }
            }
        } catch (Exception unused) {
        }
        return this.f111999a;
    }
}
