package com.p280ss.android.ugc.aweme.opensdk.share.presenter;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33243ao;
import com.p280ss.android.ugc.aweme.opensdk.share.C34685e;
import com.p280ss.android.ugc.aweme.opensdk.share.presenter.C34686a.C34688a;
import com.p280ss.android.ugc.aweme.opensdk.share.share.C34697a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoService;
import com.p280ss.android.ugc.aweme.share.systemshare.SysActionSendShareContext;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.b */
public final class C34689b {

    /* renamed from: a */
    public Intent f90469a;

    /* renamed from: b */
    public Activity f90470b;

    /* renamed from: c */
    public C34686a f90471c;

    /* renamed from: d */
    public String f90472d;

    /* renamed from: e */
    public String f90473e;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.b$a */
    public interface C34694a {
        /* renamed from: a */
        void mo88020a(int i);
    }

    /* renamed from: a */
    public final void mo88018a(final boolean z) {
        final SysActionSendShareContext sysActionSendShareContext = (SysActionSendShareContext) this.f90469a.getParcelableExtra("sys_send_action");
        if (sysActionSendShareContext != null) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing() || !iAVService.getPublishService().isPublishServiceRunning(this.f90470b)) {
                C22477b.m74364a(this.f90470b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C22480b() {
                    /* renamed from: a */
                    public final void mo53549a(String[] strArr, int[] iArr) {
                        if (strArr.length <= 0 || iArr[0] != 0) {
                            C34696d.m112005a(Toast.makeText(C34689b.this.f90470b, R.string.ct5, 0));
                            new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("TikTok has no album permissions", 20005);
                            return;
                        }
                        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService().mo90366a(C34689b.this.f90470b, true, new C35547a() {
                            public final void onSuccess() {
                                if (!sysActionSendShareContext.mo95872a((Context) C34689b.this.f90470b, (C34694a) new C34695c(this))) {
                                    if (!sysActionSendShareContext.f99414d && !C6399b.m19944t()) {
                                        C34689b.this.f90470b.finish();
                                    }
                                    if (sysActionSendShareContext.f99414d && !C6399b.m19944t()) {
                                        new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("Unknown", 20001);
                                    }
                                } else if (!sysActionSendShareContext.mo95874c()) {
                                    C10761a.m31409e((Context) C34689b.this.f90470b, (int) R.string.dsk).mo25750a();
                                    new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("Photo doesn't meet requirements", 20008);
                                } else if (!sysActionSendShareContext.mo95871a()) {
                                    C10761a.m31409e((Context) C34689b.this.f90470b, (int) R.string.dsl).mo25750a();
                                    new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("Photo doesn't meet requirements", 20008);
                                } else {
                                    ShareContext a = C34697a.m112006a(C34689b.this.f90469a);
                                    if (z || a == null || !sysActionSendShareContext.f99414d) {
                                        C34689b.this.mo88017a(sysActionSendShareContext, C34689b.this.f90473e);
                                        return;
                                    }
                                    if (C34689b.this.f90471c == null) {
                                        C34689b.this.f90471c = new C34686a((C0043i) C34689b.this.f90470b);
                                    }
                                    C34689b.this.f90471c.mo88011a(a.mClientKey, a.mCallerPackage, new C34688a() {
                                        /* renamed from: a */
                                        public final void mo88013a() {
                                            new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("Not enough permissions to operation.", 20003);
                                        }

                                        /* renamed from: b */
                                        public final void mo88015b() {
                                            new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("TikTok Network error", 20006);
                                        }

                                        /* renamed from: a */
                                        public final void mo88014a(String str) {
                                            C34689b.this.f90473e = str;
                                            C34689b.this.mo88017a(sysActionSendShareContext, str);
                                        }
                                    });
                                }
                            }

                            /* access modifiers changed from: 0000 */
                            /* renamed from: a */
                            public final /* synthetic */ void mo88019a(int i) {
                                C34689b.this.mo88016a(i);
                            }
                        });
                    }
                });
                return;
            }
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Processing photo resources faild", 20010);
        }
    }

    /* renamed from: a */
    public final void mo88016a(int i) {
        if (i == 20001) {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Unknown", 20001);
        } else if (i == -1 || i == -6) {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Video length doesn't meet requirements", 20007);
        } else if (i == -2) {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Video format is not supported", 20012);
        } else if (i == -4) {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Processing photo resources faild", 20010);
        } else if (i == -5) {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Video resolution doesn't meet requirements", 20011);
        } else {
            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Unsupported resolution", 22001);
        }
    }

    public C34689b(Activity activity, Intent intent) {
        this.f90469a = intent;
        this.f90470b = activity;
    }

    /* renamed from: a */
    public final void mo88017a(final SysActionSendShareContext sysActionSendShareContext, String str) {
        boolean z;
        if (!C21115b.m71197a().isLogin()) {
            sysActionSendShareContext.f99415e = true;
            C32656f.m105744a(this.f90470b, this.f90472d, "video_edit_page", (Bundle) null, (C23305g) new C23305g() {
                /* renamed from: a */
                public final void mo58663a() {
                    C34689b.this.mo88018a(true);
                }

                /* renamed from: a */
                public final void mo58664a(Bundle bundle) {
                    sysActionSendShareContext.f99416f = true;
                    new C34685e(C34689b.this.f90470b, C34697a.m112006a(C34689b.this.f90469a)).mo88009a("User not login", 20004);
                }
            });
            return;
        }
        switch (sysActionSendShareContext.f99412b) {
            case 1:
                IPhotoService photoService = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService();
                PhotoContext compress = photoService.compress(sysActionSendShareContext.f99413c.getAbsolutePath(), new C34729c());
                if (compress != null) {
                    new C33243ao().mo85115a("system_upload").mo85118c("photo").mo85120e(compress.creationId).mo85114a(1).mo85119d("upload").mo85252e();
                    compress.mShootWay = "system_upload";
                    if (compress.mainBusinessData != null) {
                        compress.mPhotoFrom = 3;
                    }
                    ShareContext a = C34697a.m112006a(this.f90469a);
                    if (a != null) {
                        a.mAppName = str;
                        if (this.f90471c != null && this.f90471c.mo88012a() && !TextUtils.isEmpty(a.mHashTag)) {
                            AVChallenge aVChallenge = new AVChallenge();
                            aVChallenge.challengeName = a.mHashTag;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVChallenge);
                            compress.challenges = arrayList;
                        }
                    }
                    compress.mainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).createMainBusinessContextJson(a);
                    if (photoService != null) {
                        photoService.toPhotoEditActivity(this.f90470b, compress);
                        break;
                    }
                } else {
                    C10761a.m31399c((Context) this.f90470b, (int) R.string.bsv).mo25750a();
                    break;
                }
                break;
            case 2:
                ShareContext a2 = C34697a.m112006a(this.f90469a);
                String uuid = UUID.randomUUID().toString();
                new C33243ao().mo85115a("system_upload").mo85118c("video").mo85114a(1).mo85120e(uuid).mo85118c("video").mo85119d("upload").mo85252e();
                Intent intent = new Intent();
                intent.putExtra("file_path", sysActionSendShareContext.f99413c.getAbsolutePath());
                intent.putExtra("is_from_sys_share", true);
                intent.putExtra("creation_id", uuid);
                intent.putExtra("shoot_way", "system_upload");
                intent.putExtra("extra_share_app_name", str);
                if (!(a2 == null || this.f90471c == null)) {
                    if (this.f90471c.mo88012a() && !TextUtils.isEmpty(a2.mHashTag)) {
                        AVChallenge aVChallenge2 = new AVChallenge();
                        aVChallenge2.challengeName = a2.mHashTag;
                        intent.putExtra("av_challenge", aVChallenge2);
                        a2.setChallengeName(a2.mHashTag);
                    } else if (C6399b.m19944t()) {
                        AVChallenge aVChallenge3 = new AVChallenge();
                        aVChallenge3.challengeName = this.f90473e;
                        intent.putExtra("av_challenge", aVChallenge3);
                        a2.setChallengeName(this.f90473e);
                    }
                }
                intent.putExtra("extra_share_context", a2);
                if (!(a2 == null || a2.mExtras == null)) {
                    try {
                        if (new JSONObject(a2.mExtras).getString("diamond_publish_share_extra") != null) {
                            z = true;
                            if (a2 != null || a2.mTargetSceneType != 1 || !z) {
                                ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(this.f90470b, intent);
                                break;
                            } else {
                                ((IAVService) ServiceManager.get().getService(IAVService.class)).festivalPublishService().mo74591a((Context) this.f90470b, sysActionSendShareContext.f99413c, a2);
                                break;
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                z = false;
                if (a2 != null) {
                }
                ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(this.f90470b, intent);
                break;
            case 3:
                if (!C23477d.m77081a((Collection<T>) sysActionSendShareContext.f99417g)) {
                    for (String str2 : sysActionSendShareContext.f99417g) {
                        if (C42973bg.m136427a(str2)) {
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str2));
                            if (mimeTypeFromExtension != null && !mimeTypeFromExtension.contains("image")) {
                                new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Photo doesn't meet requirements", 20008);
                                return;
                            }
                        } else if (sysActionSendShareContext.f99414d) {
                            new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Photo doesn't meet requirements", 20008);
                            return;
                        } else {
                            C10761a.m31409e((Context) this.f90470b, (int) R.string.dsk).mo25750a();
                            return;
                        }
                    }
                    if (sysActionSendShareContext.f99417g == null || sysActionSendShareContext.f99417g.size() <= 12) {
                        PhotoMovieContext photoMovieContext = new PhotoMovieContext();
                        photoMovieContext.mImageList = sysActionSendShareContext.f99417g;
                        ShareContext a3 = C34697a.m112006a(this.f90469a);
                        if (!(a3 == null || this.f90471c == null)) {
                            a3.mAppName = str;
                            if (this.f90471c.mo88012a() && !TextUtils.isEmpty(a3.mHashTag)) {
                                AVChallenge aVChallenge4 = new AVChallenge();
                                aVChallenge4.challengeName = a3.mHashTag;
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(aVChallenge4);
                                photoMovieContext.challenges = arrayList2;
                            } else if (C6399b.m19944t()) {
                                AVChallenge aVChallenge5 = new AVChallenge();
                                aVChallenge5.challengeName = this.f90473e;
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(aVChallenge5);
                                photoMovieContext.challenges = arrayList3;
                            }
                        }
                        photoMovieContext.setMainBusinessData(((IAVService) ServiceManager.get().getService(IAVService.class)).createMainBusinessContextJson(a3));
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        if (iAVService != null) {
                            iAVService.photoMovieService().toPhotoMovieEditActivity(this.f90470b, photoMovieContext, new ArrayList(), null);
                            break;
                        }
                    } else {
                        new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Params parsing error, media resource type difference you pass", 20002);
                        if (!sysActionSendShareContext.f99414d && C6399b.m19944t()) {
                            C10761a.m31409e((Context) this.f90470b, (int) R.string.a3h).mo25750a();
                        }
                        return;
                    }
                } else if (sysActionSendShareContext.f99414d) {
                    new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Photo doesn't meet requirements", 20008);
                    return;
                } else {
                    C10761a.m31409e((Context) this.f90470b, (int) R.string.dsk).mo25750a();
                    return;
                }
                break;
            case 4:
                ShareContext a4 = C34697a.m112006a(this.f90469a);
                ArrayList b = sysActionSendShareContext.mo95873b();
                if (b != null) {
                    if (b.size() <= 12) {
                        String uuid2 = UUID.randomUUID().toString();
                        new C33243ao().mo85115a("system_upload").mo85118c("video").mo85114a(b.size()).mo85120e(uuid2).mo85118c("video").mo85119d("upload").mo85252e();
                        Intent intent2 = new Intent();
                        intent2.putExtra("open_sdk_import_media_list", b);
                        intent2.putExtra("is_from_sys_share", true);
                        intent2.putExtra("creation_id", uuid2);
                        intent2.putExtra("shoot_way", "system_upload");
                        intent2.putExtra("extra_share_context", a4);
                        intent2.putExtra("extra_share_app_name", str);
                        if (!(a4 == null || this.f90471c == null)) {
                            if (this.f90471c.mo88012a() && !TextUtils.isEmpty(a4.mHashTag)) {
                                AVChallenge aVChallenge6 = new AVChallenge();
                                aVChallenge6.challengeName = a4.mHashTag;
                                intent2.putExtra("av_challenge", aVChallenge6);
                            } else if (C6399b.m19944t()) {
                                AVChallenge aVChallenge7 = new AVChallenge();
                                aVChallenge7.challengeName = this.f90473e;
                                intent2.putExtra("av_challenge", aVChallenge7);
                            }
                        }
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(this.f90470b, intent2);
                        break;
                    } else {
                        new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Params parsing error, media resource type difference you pass", 20002);
                        if (!sysActionSendShareContext.f99414d && C6399b.m19944t()) {
                            C10761a.m31409e((Context) this.f90470b, (int) R.string.a3i).mo25750a();
                        }
                        return;
                    }
                } else {
                    new C34685e(this.f90470b, C34697a.m112006a(this.f90469a)).mo88009a("Processing photo resources faild", 20010);
                    return;
                }
        }
        sysActionSendShareContext.f99415e = false;
    }
}
