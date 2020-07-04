package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42142ai;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.c */
public final class C40305c {

    /* renamed from: a */
    public final VideoRecordNewActivity f104690a;

    /* renamed from: b */
    private final ASCameraView f104691b;

    public C40305c(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        C7573i.m23587b(videoRecordNewActivity, "activity");
        C7573i.m23587b(aSCameraView, "cameraView");
        this.f104690a = videoRecordNewActivity;
        this.f104691b = aSCameraView;
        C0063u a = C0069x.m159a((FragmentActivity) this.f104690a).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ((ShortVideoContextViewModel) a).mo96181j().observe(this.f104690a, new C0053p<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C40305c f104692a;

            {
                this.f104692a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        bool = null;
                    }
                    if (bool != null) {
                        C42156aw awVar = this.f104692a.f104690a.f107337w;
                        if (awVar != null) {
                            awVar.mo103594a((Object) this.f104692a.f104690a, (C42155av) new C42142ai());
                        }
                    }
                }
            }
        });
    }
}
