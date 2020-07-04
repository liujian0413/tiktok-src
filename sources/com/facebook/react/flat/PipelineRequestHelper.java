package com.facebook.react.flat;

import android.graphics.Bitmap;
import com.facebook.common.p685b.C13285i;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13349e;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.p728a.C13854a;

final class PipelineRequestHelper implements C13349e<C13326a<C13645c>> {
    private int mAttachCounter;
    private BitmapUpdateListener mBitmapUpdateListener;
    private C13346c<C13326a<C13645c>> mDataSource;
    private C13326a<C13645c> mImageRef;
    private final ImageRequest mImageRequest;

    public final void onProgressUpdate(C13346c<C13326a<C13645c>> cVar) {
    }

    /* access modifiers changed from: 0000 */
    public final boolean isDetached() {
        if (this.mAttachCounter == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void detach() {
        this.mAttachCounter--;
        if (this.mAttachCounter == 0) {
            if (this.mDataSource != null) {
                this.mDataSource.mo32644g();
                this.mDataSource = null;
            }
            if (this.mImageRef != null) {
                this.mImageRef.close();
                this.mImageRef = null;
            }
            this.mBitmapUpdateListener = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Bitmap getBitmap() {
        if (this.mImageRef == null) {
            return null;
        }
        C13645c cVar = (C13645c) this.mImageRef.mo32609a();
        if (cVar instanceof C13644b) {
            return ((C13644b) cVar).mo33265d();
        }
        this.mImageRef.close();
        this.mImageRef = null;
        return null;
    }

    PipelineRequestHelper(ImageRequest imageRequest) {
        this.mImageRequest = imageRequest;
    }

    public final void onCancellation(C13346c<C13326a<C13645c>> cVar) {
        if (this.mDataSource == cVar) {
            this.mDataSource = null;
        }
        cVar.mo32644g();
    }

    public final void onFailure(C13346c<C13326a<C13645c>> cVar) {
        if (this.mDataSource == cVar) {
            ((BitmapUpdateListener) C13854a.m40912a(this.mBitmapUpdateListener)).onImageLoadEvent(1);
            ((BitmapUpdateListener) C13854a.m40912a(this.mBitmapUpdateListener)).onImageLoadEvent(3);
            this.mDataSource = null;
        }
        cVar.mo32644g();
    }

    /* access modifiers changed from: 0000 */
    public final void attach(BitmapUpdateListener bitmapUpdateListener) {
        boolean z;
        this.mBitmapUpdateListener = bitmapUpdateListener;
        this.mAttachCounter++;
        if (this.mAttachCounter != 1) {
            Bitmap bitmap = getBitmap();
            if (bitmap != null) {
                bitmapUpdateListener.onSecondaryAttach(bitmap);
            }
            return;
        }
        bitmapUpdateListener.onImageLoadEvent(4);
        boolean z2 = false;
        if (this.mDataSource == null) {
            z = true;
        } else {
            z = false;
        }
        C13854a.m40914a(z);
        if (this.mImageRef == null) {
            z2 = true;
        }
        C13854a.m40914a(z2);
        this.mDataSource = C13622l.m40095a().mo33208d().mo33172a(this.mImageRequest, RCTImageView.getCallerContext());
        this.mDataSource.mo32633a(this, C13285i.m38830b());
    }

    public final void onNewResult(C13346c<C13326a<C13645c>> cVar) {
        if (cVar.mo32639b()) {
            try {
                if (this.mDataSource == cVar) {
                    this.mDataSource = null;
                    C13326a<C13645c> aVar = (C13326a) cVar.mo32641d();
                    if (aVar == null) {
                        cVar.mo32644g();
                    } else if (!(((C13645c) aVar.mo32609a()) instanceof C13644b)) {
                        aVar.close();
                        cVar.mo32644g();
                    } else {
                        this.mImageRef = aVar;
                        Bitmap bitmap = getBitmap();
                        if (bitmap == null) {
                            cVar.mo32644g();
                            return;
                        }
                        BitmapUpdateListener bitmapUpdateListener = (BitmapUpdateListener) C13854a.m40912a(this.mBitmapUpdateListener);
                        bitmapUpdateListener.onBitmapReady(bitmap);
                        bitmapUpdateListener.onImageLoadEvent(2);
                        bitmapUpdateListener.onImageLoadEvent(3);
                        cVar.mo32644g();
                    }
                }
            } finally {
                cVar.mo32644g();
            }
        }
    }
}
