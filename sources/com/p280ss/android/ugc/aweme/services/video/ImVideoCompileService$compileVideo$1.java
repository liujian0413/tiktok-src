package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1 */
final class ImVideoCompileService$compileVideo$1<T> implements C7495v<T> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileVideo$1(ImVideoCompileService imVideoCompileService, CompileParam compileParam, CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
        this.$result = compileResult;
    }

    public final void subscribe(C47870u<Boolean> uVar) {
        C7573i.m23587b(uVar, "it");
        VEEditor createVEEditor = this.this$0.createVEEditor();
        C45329l imVideoCompileService$compileVideo$1$onCompileErrorCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(this, createVEEditor, uVar);
        C45329l imVideoCompileService$compileVideo$1$onCompileInfoCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(this, createVEEditor, uVar);
        try {
            int initVEEditor = this.this$0.initVEEditor(createVEEditor, this.$compileParam.getRawVideoPath());
            if (initVEEditor != 0) {
                StringBuilder sb = new StringBuilder("ImVideoCompileService VEEditor init error: ");
                sb.append(initVEEditor);
                C6921a.m21555a(sb.toString());
                ImVideoCompileService imVideoCompileService = this.this$0;
                StringBuilder sb2 = new StringBuilder("VEEditor init error: ");
                sb2.append(initVEEditor);
                imVideoCompileService.safeOnError(uVar, new IllegalStateException(sb2.toString()));
                return;
            }
            createVEEditor.mo107914a(imVideoCompileService$compileVideo$1$onCompileErrorCallback$1);
            createVEEditor.mo107934b(imVideoCompileService$compileVideo$1$onCompileInfoCallback$1);
            VEVideoEncodeSettings createEncodeSettings = this.this$0.createEncodeSettings(this.$compileParam);
            VESize videoRes = createEncodeSettings.getVideoRes();
            this.$result.setVideoWidth(videoRes.f116385a);
            this.$result.setVideoHeight(videoRes.f116386b);
            this.$result.setVideoPath(this.this$0.getOutputVideoFilePath());
            createVEEditor.mo107916a(this.$result.getVideoPath(), (String) null, createEncodeSettings);
        } catch (VEException e) {
            Throwable th = e;
            C6921a.m21559a(th);
            this.this$0.safeOnError(uVar, new IllegalStateException("VEEditor init error", th));
        }
    }
}
