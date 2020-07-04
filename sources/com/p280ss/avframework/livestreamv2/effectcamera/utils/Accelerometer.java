package com.p280ss.avframework.livestreamv2.effectcamera.utils;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.utils.Accelerometer */
public class Accelerometer {
    private AlbumOrientationEventListener mAlbumOrientationEventListener;
    public int mOrientation;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.utils.Accelerometer$AlbumOrientationEventListener */
    class AlbumOrientationEventListener extends OrientationEventListener {
        public void onOrientationChanged(int i) {
            if (i != -1) {
                int i2 = (((i + 45) / 90) * 90) % 360;
                if (i2 != Accelerometer.this.mOrientation) {
                    Accelerometer.this.mOrientation = i2;
                }
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
        }

        public AlbumOrientationEventListener(Context context, int i) {
            super(context, i);
        }
    }

    public int getDirection() {
        return this.mOrientation;
    }

    public Accelerometer(Context context) {
        this.mAlbumOrientationEventListener = new AlbumOrientationEventListener(context, 3);
        if (this.mAlbumOrientationEventListener.canDetectOrientation()) {
            this.mAlbumOrientationEventListener.enable();
        } else {
            LogUtils.m143677d("Accelerometer", "Can't Detect Orientation", new Object[0]);
        }
    }
}
