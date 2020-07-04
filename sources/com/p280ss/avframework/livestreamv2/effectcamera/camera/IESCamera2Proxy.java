package com.p280ss.avframework.livestreamv2.effectcamera.camera;

import android.graphics.SurfaceTexture;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.IESCamera2Proxy */
public class IESCamera2Proxy extends AbsIESCameraProxy {
    private boolean isInited;
    public Camera2 mCamera2;
    public boolean mCameraChanging = false;
    public CameraParams mCameraParams;
    public final Object mStateLock = new Object();
    protected SurfaceTexture mSurfaceTexture;

    public Object getCamera() {
        return this.mCamera2;
    }

    public List<int[]> getBestMatchCameraPreviewSize() {
        return super.getBestMatchCameraPreviewSize();
    }

    public int getNumberOfCameras() {
        return super.getNumberOfCameras();
    }

    public int getOrientation() {
        return this.mCamera2.setOrientationDegrees(0);
    }

    public boolean isFlipHorizontal() {
        boolean isFlipHorizontal = super.isFlipHorizontal();
        if (this.mCamera2 != null) {
            return this.mCamera2.isFlipHorizontal();
        }
        return isFlipHorizontal;
    }

    public void releaseCamera() {
        synchronized (this.mStateLock) {
            if (this.mCamera2 != null) {
                this.mCamera2.close();
            }
        }
        this.mClientListener = null;
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
        synchronized (this.mStateLock) {
            this.mSurfaceTexture = surfaceTexture;
            this.mCamera2.startPreview(surfaceTexture);
        }
    }

    public void init(CameraParams cameraParams) {
        this.mCameraParams = cameraParams;
        if (this.mCamera2 == null) {
            this.mCamera2 = new Camera2();
        }
        synchronized (this.mStateLock) {
            this.mCamera2.init(cameraParams);
        }
        this.isInited = true;
    }

    public void changeCamera(int i, final CameraListener cameraListener) {
        synchronized (this.mStateLock) {
            this.mCamera2.setCameraPosition(i);
            this.mCamera2.changeCamera(i, new CameraListener() {
                public void onOpenFail(int i) {
                    if (cameraListener != null) {
                        cameraListener.onOpenFail(i);
                    }
                    IESCamera2Proxy.this.mCameraChanging = false;
                }

                public void onOpenSuccess(int i) {
                    IESCamera2Proxy.this.startPreview(IESCamera2Proxy.this.mSurfaceTexture);
                    if (cameraListener != null) {
                        cameraListener.onOpenSuccess(i);
                    }
                    IESCamera2Proxy.this.mCameraChanging = false;
                }
            });
        }
    }

    public boolean openCamera(int i, CameraListener cameraListener) {
        boolean open;
        this.mClientListener = cameraListener;
        C456271 r4 = new CameraListener() {
            public void onOpenSuccess(int i) {
                if (IESCamera2Proxy.this.mClientListener != null) {
                    IESCamera2Proxy.this.mClientListener.onOpenSuccess(i);
                }
            }

            public void onOpenFail(int i) {
                if (i == 2) {
                    synchronized (IESCamera2Proxy.this.mStateLock) {
                        if (IESCamera2Proxy.this.mCamera2 != null) {
                            IESCamera2Proxy.this.mCamera2.close();
                        }
                        IESCamera2Proxy.this.mCameraParams.mType = 1;
                    }
                } else if (IESCamera2Proxy.this.mClientListener != null) {
                    IESCamera2Proxy.this.mClientListener.onOpenFail(i);
                }
            }
        };
        synchronized (this.mStateLock) {
            open = this.mCamera2.open(i, r4);
        }
        return open;
    }
}
