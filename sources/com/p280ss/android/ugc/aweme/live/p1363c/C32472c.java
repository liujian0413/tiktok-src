package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.C2347g;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.android.livesdkapi.host.C9468j;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p454b.C9455a;
import com.bytedance.android.livesdkapi.p452h.C9414c;
import com.bytedance.android.livesdkapi.p452h.C9415d;
import com.bytedance.android.livesdkapi.view.C9517a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.util.C10831a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.LiveBgBroadcastActivity;
import com.p280ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.p280ss.android.ugc.aweme.live.LivePlayActivity;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p280ss.android.ugc.aweme.sticker.IStickerViewService.C41839a;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.c.c */
public final class C32472c implements IHostApp {
    public final C9414c avatarBorderController() {
        return null;
    }

    public final void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2) {
    }

    public final void checkBindHelpShow(FragmentActivity fragmentActivity, String str) {
    }

    public final void enterRecorderActivity(Activity activity) {
    }

    public final String getBgBroadcastServiceName() {
        return "";
    }

    public final Class getLiveActivityClass() {
        return LivePlayActivity.class;
    }

    public final Uri getUriForFile(Context context, File file) {
        return null;
    }

    public final void initImageLib() {
    }

    public final C9415d liveCircleView(Context context) {
        return null;
    }

    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C9517a aVar, CharSequence charSequence4, C9517a aVar2, C9455a aVar3) {
        return null;
    }

    public final void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar) {
    }

    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, C9467i iVar) {
    }

    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return true;
    }

    public final void transCloudControlCommand(JSONObject jSONObject) {
    }

    public C32472c() {
        C3596c.m13174a(IHostApp.class, this);
    }

    public final void hideStickerView() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.hideStickerView();
        }
    }

    public final boolean isShowStickerView() {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            return iStickerViewService.isShowStickerView();
        }
        return false;
    }

    public final void tryDownloadGiftImage(String str) {
        C23323e.m76526b(str);
    }

    public final void tryDownloadImage(String str) {
        C23323e.m76526b(str);
    }

    public final Class getHostActivity(int i) {
        switch (i) {
            case 5:
                return LiveBroadcastActivity.class;
            case 6:
                return LiveBgBroadcastActivity.class;
            default:
                return null;
        }
    }

    public final Typeface getHostTypeface(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 3;
                break;
        }
        return C10831a.m31777a().mo26158a(i2);
    }

    public final void openWallet(Activity activity) {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.openWallet(activity, IWalletMainProxy.KEY_PAGE_CHARGE);
        }
    }

    public final void centerToast(Context context, String str, int i) {
        C10761a.m31410e(context, str).mo25750a();
    }

    public final void systemToast(Context context, String str, int i) {
        C10761a.m31410e(context, str).mo25750a();
    }

    public final void bindGifImage(View view, String str, Config config) {
        if (view instanceof SimpleDraweeView) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            ImageRequest imageRequest = null;
            if (str != null && !str.isEmpty()) {
                imageRequest = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33469a(C13597e.m40011c()).mo33467a(new C13595c().mo33153a(config).mo33152a(1).mo33151a()).mo33476b();
            }
            simpleDraweeView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32751c(true)).mo32748b(imageRequest)).mo32730f());
        }
    }

    public final void centerToast(Context context, String str, int i, boolean z) {
        C10761a.m31410e(context, str).mo25750a();
    }

    public final void showStickerView(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, final C9468j jVar2) {
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.showStickerView(appCompatActivity, jVar, str, frameLayout, new C41839a() {
                /* renamed from: a */
                private static C2347g m105203a(ToolsUrlModel toolsUrlModel) {
                    C2347g gVar = new C2347g();
                    gVar.f7710a = toolsUrlModel.f109646a;
                    gVar.f7711b = toolsUrlModel.f109647b;
                    return gVar;
                }

                /* renamed from: b */
                public final void mo83724b(FaceSticker faceSticker) {
                    jVar2.mo9901b(m105204c(faceSticker));
                }

                /* renamed from: a */
                public final void mo83723a(FaceSticker faceSticker) {
                    jVar2.mo9900a(m105204c(faceSticker));
                }

                /* renamed from: c */
                private C9355c m105204c(FaceSticker faceSticker) {
                    C9355c cVar = new C9355c();
                    if (faceSticker != null) {
                        cVar.f25566e = faceSticker.stickerId;
                        cVar.f25574m = String.valueOf(faceSticker.stickerId);
                        cVar.f25567f = faceSticker.name;
                        cVar.f25562a = m105203a(faceSticker.iconUrl);
                        cVar.f25563b = m105203a(faceSticker.fileUrl);
                        cVar.f25584w = faceSticker.hint;
                        cVar.f25569h = faceSticker.types;
                        cVar.f25581t = faceSticker.localPath;
                        cVar.f25577p = String.valueOf(faceSticker.stickerId);
                    }
                    return cVar;
                }
            });
        }
    }
}
