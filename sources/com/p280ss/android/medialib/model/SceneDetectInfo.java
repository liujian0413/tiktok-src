package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.SceneDetectInfo */
public class SceneDetectInfo {
    int choose;
    SceneDetectItem[] mSceneDetectItems;

    public int getChoose() {
        return this.choose;
    }

    public SceneDetectItem[] getSceneDetectItems() {
        return this.mSceneDetectItems;
    }

    public void setChoose(int i) {
        this.choose = i;
    }

    public void setSceneDetectItems(SceneDetectItem[] sceneDetectItemArr) {
        this.mSceneDetectItems = sceneDetectItemArr;
    }
}
