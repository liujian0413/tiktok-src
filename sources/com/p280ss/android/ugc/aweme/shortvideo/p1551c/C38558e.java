package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.e */
public final class C38558e implements C38557d {

    /* renamed from: a */
    private static int f100201a = -1;

    /* renamed from: c */
    private static Property m123237c() {
        return Property.CameraPosition;
    }

    /* renamed from: b */
    private static int m123236b() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0) {
                CameraInfo cameraInfo = new CameraInfo();
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        return 1;
                    }
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo96547a() {
        if (C35563c.f93230L.mo93347f(m123237c())) {
            return C35563c.f93230L.mo93343b(m123237c());
        }
        if (f100201a == -1) {
            f100201a = m123236b();
        }
        if (f100201a == -1) {
            return 0;
        }
        return f100201a;
    }

    /* renamed from: a */
    public final int mo96548a(int i) {
        if (i == 1) {
            i = m123236b();
        }
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo96549b(int i) {
        C35563c.f93230L.mo93338a(m123237c(), i);
    }
}
