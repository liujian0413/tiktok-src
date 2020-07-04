package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.LongRef;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$3 */
final class ImVideoCompileService$compileImVideo$3<T, R> implements C7327h<T, C7496w<? extends R>> {
    final /* synthetic */ LongRef $costTime;
    final /* synthetic */ LongRef $currentTime;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ LongRef $startTime;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileImVideo$3(ImVideoCompileService imVideoCompileService, CompileResult compileResult, LongRef longRef, LongRef longRef2, LongRef longRef3) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
        this.$currentTime = longRef;
        this.$costTime = longRef2;
        this.$startTime = longRef3;
    }

    public final C7492s<String> apply(Boolean bool) {
        C7573i.m23587b(bool, "it");
        CompileResult compileResult = this.$result;
        ImVideoCompileService imVideoCompileService = this.this$0;
        String videoPath = this.$result.getVideoPath();
        if (videoPath == null) {
            C7573i.m23580a();
        }
        compileResult.setVideoMd5(imVideoCompileService.getVideoFileMD5(videoPath));
        this.$currentTime.element = System.currentTimeMillis();
        this.$costTime.element = this.$currentTime.element - this.$startTime.element;
        this.$startTime.element = this.$currentTime.element;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo step 3: result=");
        sb.append(this.$result);
        sb.append(", costTime=");
        sb.append(this.$costTime.element);
        C6921a.m21555a(sb.toString());
        ImVideoCompileService imVideoCompileService2 = this.this$0;
        String videoPath2 = this.$result.getVideoPath();
        if (videoPath2 == null) {
            C7573i.m23580a();
        }
        return ImVideoCompileService.getVideoCover$default(imVideoCompileService2, videoPath2, 0, 0, 6, null);
    }
}
