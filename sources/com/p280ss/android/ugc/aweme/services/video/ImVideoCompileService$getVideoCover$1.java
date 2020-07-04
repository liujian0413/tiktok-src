package com.p280ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p280ss.android.vesdk.C45332o;
import com.p280ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoCover$1 */
final class ImVideoCompileService$getVideoCover$1<T> implements C7495v<T> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ String $videoFilePath;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$getVideoCover$1(ImVideoCompileService imVideoCompileService, String str, int i, int i2) {
        this.this$0 = imVideoCompileService;
        this.$videoFilePath = str;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    public final void subscribe(final C47870u<String> uVar) {
        C7573i.m23587b(uVar, "emitter");
        VEUtils.getVideoFrames(this.$videoFilePath, new int[]{0}, new C45332o(this) {
            final /* synthetic */ ImVideoCompileService$getVideoCover$1 this$0;

            {
                this.this$0 = r1;
            }

            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                C7573i.m23587b(byteBuffer, "byteBuffer");
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                if (createBitmap != null) {
                    this.this$0.this$0.scaleBitmap(createBitmap, this.this$0.$maxWidth, this.this$0.$maxHeight);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.this$0.$videoFilePath);
                    sb.append("_video_cover");
                    String sb2 = sb.toString();
                    this.this$0.this$0.saveBitmapToLocal(createBitmap, sb2);
                    ImVideoCompileService imVideoCompileService = this.this$0.this$0;
                    C47870u uVar = uVar;
                    C7573i.m23582a((Object) uVar, "emitter");
                    imVideoCompileService.safeOnSingleNext(uVar, sb2);
                } else {
                    ImVideoCompileService imVideoCompileService2 = this.this$0.this$0;
                    C47870u uVar2 = uVar;
                    C7573i.m23582a((Object) uVar2, "emitter");
                    imVideoCompileService2.safeOnSingleNext(uVar2, "");
                }
                return false;
            }
        });
    }
}
