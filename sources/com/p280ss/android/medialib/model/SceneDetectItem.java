package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.SceneDetectItem */
public class SceneDetectItem {
    float prob;
    boolean satisfied;

    public float getProb() {
        return this.prob;
    }

    public boolean isSatisfied() {
        return this.satisfied;
    }

    public void setProb(float f) {
        this.prob = f;
    }

    public void setSatisfied(boolean z) {
        this.satisfied = z;
    }
}
