package com.p280ss.android.ugc.aweme.watermark;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.BitmapUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.photo.C34726a;
import com.p280ss.android.ugc.aweme.photo.C34731e;
import com.p280ss.android.ugc.aweme.photo.C34731e.C34738a;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.p1451a.C34727a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.WaterMarkPositionConfig;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.watermark.f */
public final class C43407f implements IPhotoProcessService {
    /* renamed from: a */
    public static void m137748a() {
        C6907h.m21524a("add_watermark", (Map) C22984d.m75611a().mo59973a("enter_from", "download_video").f60753a);
    }

    /* renamed from: a */
    public static void m137749a(File file) throws Exception {
        C35563c.f93238a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    public final void photoAddWaterMarker(Bitmap bitmap, final IPhotoServiceListener iPhotoServiceListener) {
        C34731e.m112068a(bitmap, (C34738a) new C34738a() {
            /* renamed from: a */
            public final void mo88165a(Bitmap bitmap) {
                if (iPhotoServiceListener != null) {
                    iPhotoServiceListener.onWaterMakerAdded(bitmap);
                    C43407f.m137748a();
                }
            }
        });
    }

    public final void savePhotoWithWaterMarker(final PhotoContext photoContext, final IPhotoServiceListener iPhotoServiceListener) {
        C34731e.m112072a(photoContext, (C34738a) new C34738a() {
            /* renamed from: a */
            public final void mo88165a(final Bitmap bitmap) {
                if (bitmap == null) {
                    if (iPhotoServiceListener != null) {
                        iPhotoServiceListener.onSaved(-1, null);
                    }
                    return;
                }
                C6726a.m20842a(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[SYNTHETIC, Splitter:B:20:0x005d] */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[SYNTHETIC, Splitter:B:27:0x0070] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r5 = this;
                            com.ss.android.ugc.aweme.photo.a r0 = new com.ss.android.ugc.aweme.photo.a
                            android.app.Application r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
                            r0.<init>(r1)
                            java.io.File r1 = new java.io.File
                            java.lang.String r0 = r0.mo88162a()
                            r1.<init>(r0)
                            r0 = 0
                            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006e, all -> 0x0058 }
                            r2.<init>(r1)     // Catch:{ Exception -> 0x006e, all -> 0x0058 }
                            android.graphics.Bitmap r0 = r3     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r4 = 100
                            r0.compress(r3, r4, r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r2.flush()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.watermark.f$2 r3 = com.p280ss.android.ugc.aweme.watermark.C43407f.C434092.this     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.photo.PhotoContext r3 = r2     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.lang.String r3 = r3.mPhotoLocalPath     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r0.<init>(r3)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            boolean r3 = r0.exists()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            if (r3 == 0) goto L_0x0036
                            r0.delete()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                        L_0x0036:
                            com.ss.android.ugc.aweme.watermark.f$2 r0 = com.p280ss.android.ugc.aweme.watermark.C43407f.C434092.this     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.photo.PhotoContext r0 = r2     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.lang.String r3 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r0.mPhotoLocalPath = r3     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.p280ss.android.ugc.aweme.watermark.C43407f.m137749a(r1)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r2.close()     // Catch:{ Exception -> 0x0046 }
                        L_0x0046:
                            android.graphics.Bitmap r0 = r3
                            r0.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r0 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r0.<init>()
                        L_0x0050:
                            com.p280ss.android.p281a.p282a.p283a.C6726a.m20844b(r0)
                            return
                        L_0x0054:
                            r0 = move-exception
                            goto L_0x005b
                        L_0x0056:
                            r0 = r2
                            goto L_0x006e
                        L_0x0058:
                            r1 = move-exception
                            r2 = r0
                            r0 = r1
                        L_0x005b:
                            if (r2 == 0) goto L_0x0060
                            r2.close()     // Catch:{ Exception -> 0x0060 }
                        L_0x0060:
                            android.graphics.Bitmap r1 = r3
                            r1.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r1 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r1.<init>()
                            com.p280ss.android.p281a.p282a.p283a.C6726a.m20844b(r1)
                            throw r0
                        L_0x006e:
                            if (r0 == 0) goto L_0x0073
                            r0.close()     // Catch:{ Exception -> 0x0073 }
                        L_0x0073:
                            android.graphics.Bitmap r0 = r3
                            r0.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r0 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r0.<init>()
                            goto L_0x0050
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.watermark.C43407f.C434092.C434101.run():void");
                    }
                });
            }
        });
    }

    public final void savePhotoWithoutWaterMarker(final PhotoContext photoContext, final IPhotoServiceListener iPhotoServiceListener) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C434131 r0;
                C34726a aVar = new C34726a(C35563c.f93238a);
                File file = new File(aVar.mo88162a());
                try {
                    File file2 = new File(photoContext.mPhotoLocalPath);
                    C7276d.m22820d(photoContext.mPhotoLocalPath, aVar.mo88162a());
                    photoContext.mPhotoLocalPath = file.getAbsolutePath();
                    C43407f.m137749a(file);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    r0 = new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C7276d.m22812b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    };
                } catch (Exception unused) {
                    r0 = new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C7276d.m22812b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    };
                } catch (Throwable th) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C7276d.m22812b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    });
                    throw th;
                }
                C6726a.m20844b(r0);
            }
        });
    }

    public final void photoAddStoryWaterMarker(String str, String str2, IPhotoServiceListener iPhotoServiceListener) {
        C1592h.m7853a((Callable<TResult>) new C43414g<TResult>(str, iPhotoServiceListener, str2));
    }

    /* renamed from: a */
    static final /* synthetic */ Void m137747a(String str, IPhotoServiceListener iPhotoServiceListener, String str2) throws Exception {
        Options options = new Options();
        options.inMutable = true;
        options.inPreferredConfig = Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null || decodeFile.isRecycled()) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(-1, null);
            }
            return null;
        }
        C43415h hVar = new C43415h(str, decodeFile.getWidth(), decodeFile.getHeight());
        String[] b = hVar.mo102264b(false, C35563c.f93260w.mo57092e());
        WaterMarkPositionConfig a = hVar.mo102261a();
        Bitmap decodeFile2 = BitmapFactory.decodeFile(b[0]);
        new Canvas(decodeFile).drawBitmap(decodeFile2, (float) ((decodeFile.getWidth() - a.xOffset) - decodeFile2.getWidth()), (float) ((decodeFile.getHeight() - a.yOffset) - decodeFile2.getHeight()), null);
        if (TextUtils.isEmpty(str2)) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onWaterMakerAdded(decodeFile);
            }
        } else if (BitmapUtils.saveBitmapToSD(decodeFile, new File(str2).getParent(), new File(str2).getName())) {
            C34727a.m112060a(C35563c.f93238a, str2);
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(0, null);
            }
        } else if (iPhotoServiceListener != null) {
            iPhotoServiceListener.onSaved(-1, null);
        }
        return null;
    }
}
