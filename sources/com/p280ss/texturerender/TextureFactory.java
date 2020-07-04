package com.p280ss.texturerender;

import android.opengl.GLES20;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.texturerender.Texture.OnTextureReturnListener;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.texturerender.TextureFactory */
public class TextureFactory implements OnTextureReturnListener {
    private static BlockingQueue mTextures = new LinkedBlockingQueue(8);
    private static int mTexureIdx = 0;

    public void release() {
        synchronized (mTextures) {
            while (mTextures.size() > 0) {
                ((Texture) mTextures.remove()).release();
            }
        }
    }

    private static int loadTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            if (iArr[0] != 0) {
                GLES20.glTexParameteri(36197, 10242, 10497);
                GLES20.glTexParameteri(36197, 10243, 10497);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, VideoPreloadSizeExperiment.DEFAULT, 9729);
                GLES20.glBindTexture(36197, iArr[0]);
            }
            return iArr[0];
        }
        throw new RuntimeException("Error gen texture.");
    }

    public ITexture createTexture() {
        ITexture iTexture;
        synchronized (mTextures) {
            if (mTextures.size() <= 0) {
                mTexureIdx++;
                iTexture = new Texture(loadTexture(), this);
            } else {
                iTexture = (ITexture) mTextures.remove();
            }
        }
        iTexture.addRef();
        return iTexture;
    }

    public void onTextureReturn(ITexture iTexture) {
        synchronized (mTextures) {
            mTextures.add(iTexture);
        }
    }
}
