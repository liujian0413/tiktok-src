package com.p280ss.ttm.player;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: com.ss.ttm.player.SensorData */
public class SensorData implements SensorEventListener {
    private float[] accel = new float[3];
    private long mHandle;
    private SensorManager mSensorManager;
    private float[] magnet = new float[3];

    private static final native void _writeData(long j, int i, float f, float f2, float f3);

    /* access modifiers changed from: protected */
    public void finalize() {
        stop();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public int start() {
        if (initListeners().booleanValue()) {
            return 0;
        }
        return -1;
    }

    public Boolean initListeners() {
        return Boolean.valueOf(this.mSensorManager.registerListener(this, this.mSensorManager.getDefaultSensor(11), 0));
    }

    public void stop() {
        if (this.mSensorManager != null) {
            this.mSensorManager.unregisterListener(this);
            this.mSensorManager = null;
        }
        this.mHandle = 0;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type != 4) {
            if (type != 11) {
                switch (type) {
                    case 1:
                        System.arraycopy(sensorEvent.values, 0, this.accel, 0, 3);
                        if (this.accel[0] >= 0.001f || this.accel[1] >= 0.001f || this.accel[2] >= 0.001f) {
                            _writeData(this.mHandle, 1, this.accel[0], this.accel[1], this.accel[2]);
                            return;
                        }
                    case 2:
                        System.arraycopy(sensorEvent.values, 0, this.magnet, 0, 3);
                        _writeData(this.mHandle, 2, this.magnet[0], this.magnet[1], this.magnet[2]);
                        return;
                }
            } else {
                _writeData(this.mHandle, 3, sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            }
        }
    }

    public void setHandle(long j, TTPlayer tTPlayer) {
        this.mHandle = j;
        this.mSensorManager = (SensorManager) tTPlayer.getContext().getSystemService("sensor");
    }
}
