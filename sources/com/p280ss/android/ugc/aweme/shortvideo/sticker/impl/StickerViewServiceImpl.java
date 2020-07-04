package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p022v4.app.C0608j;
import android.support.p029v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p280ss.android.ugc.aweme.sticker.IStickerViewService.C41839a;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerViewServiceImpl */
public class StickerViewServiceImpl implements IStickerViewService {
    public C23254a mActivityOnKeyDownListener = new C23254a() {
        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || StickerViewServiceImpl.this.mIStickerView == null || !StickerViewServiceImpl.this.mIStickerView.mo100701e()) {
                return false;
            }
            StickerViewServiceImpl.this.mIStickerView.mo100700d();
            return true;
        }
    };
    public C41019y mIStickerView;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerViewServiceImpl$a */
    static class C40620a {
        C40620a() {
        }

        /* renamed from: a */
        public static UrlModel m129917a(ToolsUrlModel toolsUrlModel) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(toolsUrlModel.f109646a);
            urlModel.setUrlList(toolsUrlModel.f109647b);
            return urlModel;
        }

        /* renamed from: a */
        static ToolsUrlModel m129918a(UrlModel urlModel) {
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.f109646a = urlModel.getUri();
            toolsUrlModel.f109647b = urlModel.getUrlList();
            return toolsUrlModel;
        }
    }

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    public void hideStickerView() {
        if (this.mIStickerView != null) {
            this.mIStickerView.mo100700d();
        }
    }

    public boolean isShowStickerView() {
        if (this.mIStickerView == null || !this.mIStickerView.mo100701e()) {
            return false;
        }
        return true;
    }

    public void release() {
        if (this.mIStickerView != null) {
            this.mIStickerView.mo100702f();
            this.mIStickerView = null;
        }
    }

    public String getStickerFilePath(FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    public static FaceSticker toFaceSticker(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean == FaceStickerBean.NONE) {
            return null;
        }
        new C40620a();
        FaceSticker faceSticker = new FaceSticker();
        faceSticker.f78767id = faceStickerBean.getId();
        faceSticker.stickerId = faceStickerBean.getStickerId();
        faceSticker.fileUrl = C40620a.m129918a(faceStickerBean.getFileUrl());
        faceSticker.iconUrl = C40620a.m129918a(faceStickerBean.getIconUrl());
        faceSticker.localPath = faceStickerBean.getLocalPath();
        faceSticker.name = faceStickerBean.getName();
        faceSticker.hint = faceStickerBean.getHint();
        faceSticker.types = faceStickerBean.getTypes();
        faceSticker.tags = faceStickerBean.getTags();
        faceSticker.sdkExtra = faceStickerBean.getSdkExtra();
        faceSticker.extra = faceStickerBean.getExtra();
        return faceSticker;
    }

    public static FaceStickerBean toFaceSticker(FaceSticker faceSticker) {
        if (faceSticker == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        new C40620a();
        faceStickerBean.setId(faceSticker.f78767id);
        faceStickerBean.setStickerId(faceSticker.stickerId);
        if (faceSticker.fileUrl != null) {
            faceStickerBean.setFileUrl(C40620a.m129917a(faceSticker.fileUrl));
        }
        if (faceSticker.iconUrl != null) {
            faceStickerBean.setIconUrl(C40620a.m129917a(faceSticker.iconUrl));
        }
        faceStickerBean.setLocalPath(faceSticker.localPath);
        faceStickerBean.setName(faceSticker.name);
        faceStickerBean.setHint(faceSticker.hint);
        faceStickerBean.setTypes(faceSticker.types);
        faceStickerBean.setTags(faceSticker.tags);
        faceStickerBean.setSdkExtra(faceSticker.sdkExtra);
        faceStickerBean.setExtra(faceSticker.extra);
        return faceStickerBean;
    }

    public void showStickerView(AppCompatActivity appCompatActivity, String str, FrameLayout frameLayout, C41839a aVar) {
        showStickerView(appCompatActivity, appCompatActivity.getSupportFragmentManager(), str, frameLayout, aVar);
    }

    public void showStickerView(final AppCompatActivity appCompatActivity, C0608j jVar, final String str, FrameLayout frameLayout, final C41839a aVar) {
        if (this.mIStickerView == null) {
            this.mIStickerView = new DefaultEffectStickerViewImpl(frameLayout);
        }
        this.mIStickerView.mo100674a(appCompatActivity, appCompatActivity, jVar, str, frameLayout, new C41020a() {
            /* renamed from: a */
            public final void mo100333a(FaceStickerBean faceStickerBean) {
                aVar.mo83723a(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            /* renamed from: b */
            public final void mo100337b(FaceStickerBean faceStickerBean) {
                aVar.mo83724b(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            /* renamed from: c */
            public final void mo100339c(FaceStickerBean faceStickerBean) {
                aVar.mo83723a(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            /* renamed from: a */
            public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
                StickerViewServiceImpl.toFaceSticker(faceStickerBean);
                if ("livestreaming".equals(str) && appCompatActivity.getClass().getName().contains("VideoRecordNewActivity") && (appCompatActivity instanceof C23258e)) {
                    ((C23258e) appCompatActivity).mo60525a(StickerViewServiceImpl.this.mActivityOnKeyDownListener);
                }
            }

            /* renamed from: b */
            public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
                StickerViewServiceImpl.toFaceSticker(faceStickerBean);
                if ("livestreaming".equals(str) && appCompatActivity.getClass().getName().contains("VideoRecordNewActivity") && (appCompatActivity instanceof C23258e)) {
                    ((C23258e) appCompatActivity).mo60526b(StickerViewServiceImpl.this.mActivityOnKeyDownListener);
                }
            }
        });
    }

    public void addStickersWithModel(AppCompatActivity appCompatActivity, FrameLayout frameLayout, List<Effect> list, boolean z, boolean z2, String str) {
        if (this.mIStickerView == null) {
            this.mIStickerView = new DefaultEffectStickerViewImpl(frameLayout);
        }
        if (!C6292i.m19525a(list) && appCompatActivity != null) {
            if (z) {
                this.mIStickerView.mo100677a(appCompatActivity, list, z2, str);
            }
            if (z2 && list.get(0) != null) {
                this.mIStickerView.mo100695b((Effect) list.get(0));
            }
        }
    }
}
