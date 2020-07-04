package com.p280ss.android.ugc.aweme.gesturelog;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.TouchData */
public class TouchData {
    @C6593c(mo15949a = "action")
    public int action;
    @C6593c(mo15949a = "phone_orientation")
    public int phoneOrientation;
    @C6593c(mo15949a = "pressure")
    public float pressure;
    @C6593c(mo15949a = "time")
    public long time;
    @C6593c(mo15949a = "size")
    public float touchAreaSize;
    @C6593c(mo15949a = "touch_orientation")
    public float touchOrientation;
    @C6593c(mo15949a = "x")

    /* renamed from: x */
    public float f79441x;
    @C6593c(mo15949a = "x_velocity")
    public float xVelocity;
    @C6593c(mo15949a = "y")

    /* renamed from: y */
    public float f79442y;
    @C6593c(mo15949a = "y_velocity")
    public float yVelocity;

    public TouchData(long j, int i, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.time = j;
        this.action = i;
        this.touchOrientation = f;
        this.phoneOrientation = i2;
        this.f79441x = f2;
        this.f79442y = f3;
        this.pressure = f4;
        this.touchAreaSize = f5;
        this.xVelocity = f6;
        this.yVelocity = f7;
    }
}
