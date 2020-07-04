package com.facebook.react.animation;

import android.util.SparseArray;
import com.facebook.react.bridge.UiThreadUtil;

public class AnimationRegistry {
    private final SparseArray<Animation> mRegistry = new SparseArray<>();

    public Animation getAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        return (Animation) this.mRegistry.get(i);
    }

    public void registerAnimation(Animation animation) {
        UiThreadUtil.assertOnUiThread();
        this.mRegistry.put(animation.getAnimationID(), animation);
    }

    public Animation removeAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        Animation animation = (Animation) this.mRegistry.get(i);
        if (animation != null) {
            this.mRegistry.delete(i);
        }
        return animation;
    }
}
