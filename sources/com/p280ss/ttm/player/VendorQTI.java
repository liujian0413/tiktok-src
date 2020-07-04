package com.p280ss.ttm.player;

import android.media.MediaFormat;

/* renamed from: com.ss.ttm.player.VendorQTI */
public class VendorQTI {
    public static void debugEffect(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setInteger("vendor.qti-ext-vpp-demo.process-percent", 50);
        }
    }

    public static void enableLowLatency(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
        }
    }

    public static void setupVpp(MediaFormat mediaFormat, int i) {
        int i2;
        if (mediaFormat != null) {
            mediaFormat.setString("vendor.qti-ext-vpp.mode", "HQV_MODE_MANUAL");
            switch (i) {
                case 0:
                case 1:
                    String str = "vendor.qti-ext-vpp-cade.cade-level";
                    if (i == 0) {
                        i2 = 10;
                    } else {
                        i2 = 20;
                    }
                    mediaFormat.setInteger(str, i2);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 65);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 60);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
                    break;
                case 2:
                    mediaFormat.setInteger("vendor.qti-ext-vpp-cade.cade-level", 15);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 70);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 70);
                    mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
                    break;
                default:
                    return;
            }
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-low", 20);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-high", 20);
        }
    }
}
