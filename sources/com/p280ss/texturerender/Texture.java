package com.p280ss.texturerender;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.Texture */
public class Texture implements ITexture {
    private ReentrantLock mLock = new ReentrantLock();
    private IRef mRef = new Ref();
    private int mTextureId;
    private OnTextureReturnListener mTextureReturnListener;

    /* renamed from: com.ss.texturerender.Texture$OnTextureReturnListener */
    public interface OnTextureReturnListener {
        void onTextureReturn(ITexture iTexture);
    }

    public int addRef() {
        return this.mRef.addRef();
    }

    public int refCnt() {
        return this.mRef.refCnt();
    }

    public void unlock() {
        this.mLock.unlock();
    }

    public void release() {
        lock();
        GLES20.glDeleteTextures(1, new int[this.mTextureId], 0);
        unlock();
    }

    public int lock() {
        if (!this.mLock.isHeldByCurrentThread()) {
            this.mLock.lock();
            return this.mTextureId;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    public int decRef() {
        int decRef = this.mRef.decRef();
        if (decRef == 1) {
            this.mTextureReturnListener.onTextureReturn(this);
        } else if (decRef <= 0) {
            StringBuilder sb = new StringBuilder("reference idx ");
            sb.append(decRef - 1);
            sb.append(" app abort!!");
            throw new RuntimeException(new Exception(sb.toString()));
        }
        return 0;
    }

    public int tryLock(int i) {
        try {
            if (this.mLock.tryLock((long) i, TimeUnit.MILLISECONDS)) {
                return this.mTextureId;
            }
            return -1;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    public Texture(int i, OnTextureReturnListener onTextureReturnListener) {
        this.mTextureId = i;
        this.mTextureReturnListener = onTextureReturnListener;
    }
}
