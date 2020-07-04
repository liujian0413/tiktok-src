package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.LandMarkFrame */
public class LandMarkFrame {
    private float[] FOVAngle;
    private float accuracy;
    private double gpsTimestamp;
    private float latitude;
    private float longitude;
    private float[] quaternion;
    private double sensorTimestamp;
    private float trueHeading;

    public float getAccuracy() {
        return this.accuracy;
    }

    public float[] getFOVAngle() {
        return this.FOVAngle;
    }

    public double getGpsTimestamp() {
        return this.gpsTimestamp;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public float[] getQuaternion() {
        return this.quaternion;
    }

    public double getSensorTimestamp() {
        return this.sensorTimestamp;
    }

    public float getTrueHeading() {
        return this.trueHeading;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public void setFOVAngle(float[] fArr) {
        this.FOVAngle = fArr;
    }

    public void setGpsTimestamp(double d) {
        this.gpsTimestamp = d;
    }

    public void setLatitude(float f) {
        this.latitude = f;
    }

    public void setLongitude(float f) {
        this.longitude = f;
    }

    public void setQuaternion(float[] fArr) {
        this.quaternion = fArr;
    }

    public void setSensorTimestamp(double d) {
        this.sensorTimestamp = d;
    }

    public void setTrueHeading(float f) {
        this.trueHeading = f;
    }

    /* access modifiers changed from: 0000 */
    public void setInfo(float f, float f2, float f3, double d, double d2, float f4, float[] fArr, float[] fArr2) {
        this.latitude = f;
        this.longitude = f2;
        this.accuracy = f3;
        this.gpsTimestamp = d;
        this.sensorTimestamp = d2;
        this.trueHeading = f4;
        this.quaternion = fArr;
        this.FOVAngle = fArr2;
    }
}
