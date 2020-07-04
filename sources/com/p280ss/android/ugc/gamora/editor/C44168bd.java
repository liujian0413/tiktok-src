package com.p280ss.android.ugc.gamora.editor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.StickerDeleteView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.bd */
public final class C44168bd extends C12629j implements C44295cr {

    /* renamed from: i */
    public static final C44169a f114236i = new C44169a(null);

    /* renamed from: j */
    private StickerDeleteView f114237j;

    /* renamed from: com.ss.android.ugc.gamora.editor.bd$a */
    public static final class C44169a {
        private C44169a() {
        }

        public /* synthetic */ C44169a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo103323b() {
        StickerDeleteView stickerDeleteView = this.f114237j;
        if (stickerDeleteView == null) {
            C7573i.m23583a("deleteView");
        }
        stickerDeleteView.mo103323b();
    }

    /* renamed from: a */
    public final void mo103322a() {
        StickerDeleteView stickerDeleteView = this.f114237j;
        if (stickerDeleteView == null) {
            C7573i.m23583a("deleteView");
        }
        stickerDeleteView.mo103322a();
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        StickerDeleteView a = StickerDeleteView.m133790a(viewGroup.getContext());
        C7573i.m23582a((Object) a, "StickerDeleteView.create(container.context)");
        this.f114237j = a;
        StickerDeleteView stickerDeleteView = this.f114237j;
        if (stickerDeleteView == null) {
            C7573i.m23583a("deleteView");
        }
        return stickerDeleteView;
    }

    /* renamed from: a */
    public final int mo103321a(int i, int i2, boolean z, boolean z2) {
        StickerDeleteView stickerDeleteView = this.f114237j;
        if (stickerDeleteView == null) {
            C7573i.m23583a("deleteView");
        }
        return stickerDeleteView.mo103321a(i, i2, z, z2);
    }
}
