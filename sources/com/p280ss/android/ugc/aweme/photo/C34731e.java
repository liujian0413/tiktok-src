package com.p280ss.android.ugc.aweme.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.widget.ImageView;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.photo.e */
public final class C34731e {

    /* renamed from: com.ss.android.ugc.aweme.photo.e$a */
    public interface C34738a {
        /* renamed from: a */
        void mo88165a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m112072a(PhotoContext photoContext, final C34738a aVar) {
        if (photoContext == null) {
            if (aVar != null) {
                aVar.mo88165a(null);
            }
            return;
        }
        C23323e.m76501a(m112065a(Uri.parse(Uri.fromFile(new File(photoContext.mPhotoLocalPath)).toString())), photoContext.mWidth, photoContext.mHeight, (C23319b<Bitmap>) new C23319b<Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(final Bitmap bitmap) {
                C34731e.m112071a((C23319b<Bitmap>) new C23319b<Bitmap>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Bitmap bitmap) {
                        C34731e.m112067a(bitmap, bitmap, aVar);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static UrlModel m112065a(Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    public static void m112071a(C23319b<Bitmap> bVar) {
        m112066a((int) R.drawable.bci, bVar);
    }

    /* renamed from: a */
    public static void m112068a(final Bitmap bitmap, final C34738a aVar) {
        m112071a((C23319b<Bitmap>) new C23319b<Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Bitmap bitmap) {
                C34731e.m112067a(bitmap, bitmap, aVar);
            }
        });
    }

    /* renamed from: a */
    private static void m112066a(int i, C23319b<Bitmap> bVar) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(C35563c.f93238a.getPackageName());
        sb.append("/2131233582");
        C23323e.m76501a(m112065a(Uri.parse(sb.toString())), 0, 0, bVar);
    }

    /* renamed from: a */
    public static void m112070a(ImageView imageView, Uri uri, C7561a<C7581n> aVar) {
        m112069a(imageView, uri, 0, 0, aVar);
    }

    /* renamed from: a */
    public static Bitmap m112063a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = ((float) i) / ((float) width);
        float f2 = ((float) i2) / ((float) height);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static void m112067a(final Bitmap bitmap, final Bitmap bitmap2, final C34738a aVar) {
        if (bitmap == null || bitmap2 == null) {
            if (aVar != null) {
                aVar.mo88165a(null);
            }
            return;
        }
        C6726a.m20842a(new Runnable() {
            public final void run() {
                float min = (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 1.0f) / 1920.0f;
                float height = ((float) bitmap2.getHeight()) * min;
                int width = (int) (((float) bitmap2.getWidth()) * min);
                int width2 = (bitmap.getWidth() - ((int) C9738o.m28708b((Context) C35563c.f93238a, 11.0f))) - width;
                int i = (int) height;
                int height2 = (bitmap.getHeight() - ((int) C9738o.m28708b((Context) C35563c.f93238a, 10.5f))) - i;
                Bitmap a = C34731e.m112063a(bitmap2, width, i);
                final Bitmap a2 = C34731e.m112064a(bitmap, a, width2, height2);
                bitmap.recycle();
                a.recycle();
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            aVar.mo88165a(a2);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static Bitmap m112064a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(bitmap2, (float) i, (float) i2, null);
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    /* renamed from: a */
    private static void m112069a(final ImageView imageView, Uri uri, int i, int i2, final C7561a<C7581n> aVar) {
        C23323e.m76501a(m112065a(uri), 0, 0, (C23319b<Bitmap>) new C23319b<Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Bitmap bitmap) {
                if (bitmap != null && imageView != null) {
                    C1592h.m7855a((Callable<TResult>) new C34752f<TResult>(imageView, bitmap, aVar), C1592h.f5958b);
                }
            }

            /* renamed from: a */
            static final /* synthetic */ Object m112076a(ImageView imageView, Bitmap bitmap, C7561a aVar) throws Exception {
                imageView.setImageBitmap(bitmap);
                aVar.invoke();
                return null;
            }
        });
    }
}
