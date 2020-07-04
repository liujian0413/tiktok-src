package com.p280ss.android.ugc.aweme.audiorecord;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.audiorecord.Point */
public final class Point implements Serializable {
    @C6593c(mo15949a = "time")

    /* renamed from: t */
    private long f61020t;
    @C6593c(mo15949a = "x")

    /* renamed from: x */
    private int f61021x;
    @C6593c(mo15949a = "y")

    /* renamed from: y */
    private int f61022y;

    public final long getT() {
        return this.f61020t;
    }

    public final int getX() {
        return this.f61021x;
    }

    public final int getY() {
        return this.f61022y;
    }

    public final void setT(long j) {
        this.f61020t = j;
    }

    public final void setX(int i) {
        this.f61021x = i;
    }

    public final void setY(int i) {
        this.f61022y = i;
    }

    public final boolean isEqual(Point point) {
        C7573i.m23587b(point, "p");
        if (this.f61021x == point.f61021x && this.f61022y == point.f61022y && this.f61020t == point.f61020t) {
            return true;
        }
        return false;
    }

    public Point(int i, int i2, long j) {
        this.f61021x = i;
        this.f61022y = i2;
        this.f61020t = j;
    }
}
