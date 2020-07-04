package com.p280ss.android.ugc.aweme.sticker;

import android.support.p022v4.app.C0608j;
import android.support.p029v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;

/* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService */
public interface IStickerViewService {

    /* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService$a */
    public interface C41839a {
        /* renamed from: a */
        void mo83723a(FaceSticker faceSticker);

        /* renamed from: b */
        void mo83724b(FaceSticker faceSticker);
    }

    void hideStickerView();

    boolean isShowStickerView();

    void showStickerView(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, C41839a aVar);
}
