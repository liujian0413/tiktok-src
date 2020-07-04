package com.p280ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39825f;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39962gi;
import com.p280ss.android.ugc.aweme.shortvideo.C40203p;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.api.C38456a;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41500y;
import com.p280ss.android.ugc.aweme.utils.C43131fk;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploader;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.photo.l */
public final class C34760l extends C39825f {

    /* renamed from: d */
    private final TTUploaderService f90606d;

    /* renamed from: a */
    public final void mo88206a() {
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo88204a(Object obj) {
        return new C39359dv<SynthetiseResult>() {
            {
                mo47088b(new SynthetiseResult());
            }
        };
    }

    /* renamed from: b */
    public final long mo88207b(Object obj) {
        return new File(((PhotoContext) obj).mPhotoLocalPath).length();
    }

    /* renamed from: c */
    public final Bitmap mo88209c(Object obj) {
        C43131fk.m136816a();
        return C43131fk.m136817b(((PhotoContext) obj).mPhotoLocalPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: a */
    private C39359dv<VideoCreation> m112139a(final String str, VideoCreation videoCreation) {
        if (str == null || !new File(str).exists()) {
            return new C39359dv<VideoCreation>() {
                {
                    StringBuilder sb = new StringBuilder("Photo file does not exist. file name: ");
                    sb.append(str);
                    mo47087a((Throwable) new RuntimeException(sb.toString()));
                }
            };
        }
        final C39962gi giVar = ((C39961gh) videoCreation).f103780b;
        return new C39359dv<VideoCreation>() {
            {
                TTImageUploader b;
                try {
                    b = C22487c.m74375b();
                    b.setListener(new C34771n(this, b));
                    if (C6399b.m19944t()) {
                        C41500y yVar = new C41500y();
                        yVar.mo102158a(giVar);
                        b.setServerParameter(yVar.mo102157a());
                    }
                    b.setSliceSize(giVar.f103787f);
                    b.setFileUploadDomain(giVar.f103783b);
                    b.setImageUploadDomain(giVar.f103784c);
                    b.setSliceTimeout(giVar.f103788g);
                    b.setSliceReTryCount(giVar.f103789h);
                    b.setFilePath(1, new String[]{str});
                    b.setFileRetryCount(1);
                    b.setUserKey(giVar.f103782a);
                    b.setEnableHttps(giVar.f103791j);
                    b.setAuthorization(giVar.f103790i);
                    b.setOpenBoe(C34772o.m112162a(C43171v.m136920a()));
                    b.start();
                } catch (Exception e) {
                    b.close();
                    throw e;
                } catch (Throwable th) {
                    mo47087a(th);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo88210a(TTImageUploader tTImageUploader, int i, long j, TTImageInfo tTImageInfo) {
                String str;
                if (i == 3) {
                    tTImageUploader.close();
                    mo47088b(new VideoCreation().setMaterialId(tTImageInfo.mImageUri));
                } else if (i == 4) {
                    tTImageUploader.close();
                    if (tTImageInfo != null) {
                        ApiServerException apiServerException = new ApiServerException((int) tTImageInfo.mErrcode);
                        if (tTImageInfo.mErrcode == 30411) {
                            str = C35563c.f93238a.getResources().getString(R.string.fki);
                        } else {
                            str = "upload failed.";
                        }
                        mo47087a((Throwable) apiServerException.setErrorMsg(str));
                        return;
                    }
                    mo47087a((Throwable) new IllegalArgumentException("upload failed."));
                } else {
                    if (i == 1) {
                        mo97923a((int) j);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final C18253l<VideoCreation> mo88202a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        C18253l<VideoCreation> a = this.f90606d.mo96258a(null);
        C18246h.m60214a(a, (C18245g<? super V>) new C34730d<Object>(), (Executor) C23364n.f61448a);
        return a;
    }

    /* renamed from: a */
    public final C39359dv<VideoCreation> mo88205a(Object obj, VideoCreation videoCreation) {
        C39359dv<VideoCreation> a = m112139a(((PhotoContext) obj).mPhotoLocalPath, videoCreation);
        C18246h.m60214a((C18253l<V>) a, (C18245g<? super V>) new C34818t<Object>(this.f103509a, this.f103510b), (Executor) C23364n.f61448a);
        return a;
    }

    /* renamed from: a */
    private static C18253l<? extends C38455ap> m112138a(PhotoContext photoContext, VideoCreation videoCreation) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(photoContext.mText)) {
            linkedHashMap.put("text", photoContext.mText);
        }
        if (photoContext.mExtras == null) {
            str = null;
        } else {
            str = C35563c.f93239b.mo15979b((Object) photoContext.mExtras);
        }
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("text_extra", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photoContext.mPhotoFrom);
        linkedHashMap.put("original", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(photoContext.mImageType);
        linkedHashMap.put("image_type", sb2.toString());
        TextUtils.isEmpty(photoContext.mStickers);
        String str6 = "stickers";
        if (!TextUtils.isEmpty(photoContext.mStickers)) {
            str2 = photoContext.mStickers;
        } else {
            str2 = "";
        }
        linkedHashMap.put(str6, str2);
        String str7 = "filter_name";
        if (!TextUtils.isEmpty(photoContext.mFilterName)) {
            str3 = photoContext.mFilterName;
        } else {
            str3 = "";
        }
        linkedHashMap.put(str7, str3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(photoContext.mCamera);
        linkedHashMap.put("camera", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(photoContext.mPrettify);
        linkedHashMap.put("prettify", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(photoContext.mLongitude);
        linkedHashMap.put("longitude", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(photoContext.mLatitude);
        linkedHashMap.put("latitude", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(photoContext.mIsPrivate);
        linkedHashMap.put("is_private", sb7.toString());
        if (!TextUtils.isEmpty(photoContext.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", photoContext.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoContext.mShootWay)) {
            linkedHashMap.put("shoot_way", photoContext.mShootWay);
        }
        boolean z = false;
        if (!TextUtils.isEmpty(photoContext.mSyncPlatforms)) {
            i = 0;
            for (int i2 : C38456a.m122938a(photoContext.mSyncPlatforms)) {
                if (i2 == 1) {
                    i = 1;
                }
            }
        } else {
            i = 0;
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(i);
        linkedHashMap.put("sync_to_toutiao", sb8.toString());
        if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(photoContext.mFilterRate);
            linkedHashMap.put("filter_value", sb9.toString());
            C29296g a = C35563c.f93224F.mo70097l().mo74949b().mo74962a(photoContext.mFilterIndex);
            if (((double) Math.abs(a.f77275j - photoContext.mFilterRate)) < 0.01d || a.f77275j == -1.0f) {
                z = true;
            }
            String str8 = "is_original_filter";
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            linkedHashMap.put(str8, str5);
        }
        linkedHashMap.put("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a()));
        linkedHashMap.put("beautify_used", String.valueOf(C23531b.m77286b()));
        String str9 = "is_composer";
        if (C23536f.m77298a()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        linkedHashMap.put(str9, str4);
        if (photoContext.poiServerMobParam != null) {
            linkedHashMap.putAll(photoContext.poiServerMobParam);
        }
        for (C40231c a2 : C35563c.f93257t.mo83283b()) {
            a2.mo64276a(photoContext, linkedHashMap);
        }
        C18253l<? extends C38455ap> b = C35563c.f93257t.mo83282b(videoCreation.materialId, linkedHashMap);
        C18246h.m60214a(b, (C18245g<? super V>) new C34728b<Object>(), (Executor) C23364n.f61448a);
        return b;
    }

    public C34760l(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f90606d = tTUploaderService;
        this.f103509a = i;
        this.f103510b = i2;
    }

    /* renamed from: a */
    public final C18253l<C38455ap> mo88208b(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        return C18246h.m60209a(m112138a((PhotoContext) obj, videoCreation), ApiServerException.class, C40203p.m128511a(new C34770m(this, obj, videoCreation, synthetiseResult)), C23364n.f61448a);
    }
}
