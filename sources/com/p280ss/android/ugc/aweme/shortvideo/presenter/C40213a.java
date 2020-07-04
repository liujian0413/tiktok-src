package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.medialib.jni.EffectThumb;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.medialib.player.EffectConfig;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.effect.C27429h;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.p1547a.C38419a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import dmt.p1861av.video.C47440an;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.a */
public final class C40213a {

    /* renamed from: a */
    private static final ExecutorService f104513a = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18994a("EffectVideoCover").mo18993a(3).mo18996a());

    /* renamed from: a */
    static final /* synthetic */ void m128524a(OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap) {
        if (onVideoCoverCallback != null) {
            if (bitmap != null) {
                onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
                return;
            }
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }

    /* renamed from: a */
    private static void m128523a(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C42341f.m134636a(bitmap, new File(str), 60, CompressFormat.PNG);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m128522a(boolean z, EditVideoSegment editVideoSegment, EffectThumb effectThumb, String str, OnVideoCoverCallback onVideoCoverCallback) throws Exception {
        int i;
        Bitmap bitmap;
        if (!z) {
            i = C47440an.m148113e(editVideoSegment.getVideoPath());
            if (editVideoSegment.getVideoCutInfo() != null) {
                i += editVideoSegment.getVideoCutInfo().getRotate();
            }
        } else {
            i = 0;
        }
        CoverInfo thumb = effectThumb.getThumb(0);
        if (thumb == null || thumb.getData() == null) {
            bitmap = null;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Config.ARGB_8888);
            if (i > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            } else {
                bitmap = createBitmap;
            }
        }
        m128523a(bitmap, str);
        C6726a.m20844b(new C40215c(onVideoCoverCallback, bitmap));
        effectThumb.stopRender();
        return null;
    }

    /* renamed from: a */
    public static void m128525a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback) {
        m128526a(list, str, f, i, z, editPreviewInfo, null, onVideoCoverCallback);
    }

    /* renamed from: a */
    public static void m128526a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, String str2, OnVideoCoverCallback onVideoCoverCallback) {
        C38419a aVar = new C38419a();
        Triple a = C39692a.m127023a(editPreviewInfo, z, (long) i);
        EditVideoSegment editVideoSegment = (EditVideoSegment) a.getFirst();
        if (aVar.init(editVideoSegment.getVideoPath()) < 0) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            }
            aVar.stopRender();
            return;
        }
        EffectConfig filter = C27429h.m89873a(list, editVideoSegment.getVideoCutInfo(), z, (long[]) a.getThird()).setFilter(str);
        if (f != -1.0f) {
            filter.setFilterIntensity(f);
        }
        int width = editVideoSegment.getVideoFileInfo().getWidth();
        if (width <= 0 || width >= 256) {
            width = 256;
        }
        aVar.renderVideo(new long[]{((Long) a.getSecond()).longValue()}, filter, width, width);
        C40214b bVar = new C40214b(z, editVideoSegment, aVar, str2, onVideoCoverCallback);
        C1592h.m7855a((Callable<TResult>) bVar, (Executor) f104513a);
    }
}
