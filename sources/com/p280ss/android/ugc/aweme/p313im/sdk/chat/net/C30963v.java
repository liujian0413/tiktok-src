package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30913u;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31870ap;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be.C7059a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.v */
public final class C30963v extends C30929c {

    /* renamed from: f */
    private static C31870ap<C30963v> f81078f = new C31870ap<C30963v>() {
        /* renamed from: c */
        private static C30963v m100767c() {
            return new C30963v();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m100767c();
        }
    };

    private C30963v() {
    }

    /* renamed from: a */
    public final void mo81335a(String str, C30981y yVar) {
        C30982z zVar = new C30982z(this.f19650e);
        zVar.f81105b = str;
        zVar.mo81371a(yVar);
        mo81283a(zVar);
    }

    /* renamed from: a */
    public final void mo81336a(String str, List<PhotoParam> list) {
        System.currentTimeMillis();
        if (list != null && list.size() != 0) {
            C1592h.m7853a((Callable<TResult>) new C30979w<TResult>(this, str, list)).mo6876a(C30980x.f81103a, C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public static C30963v m100755a() {
        return (C30963v) f81078f.mo82721b();
    }

    /* renamed from: a */
    static final /* synthetic */ Void m100757a(C1592h hVar) throws Exception {
        String str = (String) hVar.mo6890e();
        if (!TextUtils.isEmpty(str)) {
            C9738o.m28697a(C6399b.m19921a(), str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo81332a(Message message) {
        String a = C30950q.m100663a(message);
        if (message.getMsgType() == 2) {
            C30982z zVar = (C30982z) this.f81004a.get(a);
            if (zVar != null) {
                zVar.mo81371a((C30981y) null);
            }
            return;
        }
        if (message.getMsgType() == 27) {
            C30935h hVar = (C30935h) this.f81004a.get(a);
            if (hVar != null) {
                hVar.f81020b = null;
            }
        }
    }

    /* renamed from: a */
    public static String m100756a(BaseContent baseContent) {
        String picturePath;
        String str = null;
        if (baseContent == null) {
            return null;
        }
        if (baseContent instanceof SharePoiContent) {
            UrlModel mapUrl = ((SharePoiContent) baseContent).getMapUrl();
            if (mapUrl != null && !TextUtils.isEmpty(mapUrl.getUri()) && mapUrl.getUri().startsWith("file://")) {
                picturePath = mapUrl.getUri().substring(7);
            }
            return str;
        } else if (baseContent instanceof OnlyPictureContent) {
            OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
            UrlModel url = onlyPictureContent.getUrl();
            if (url == null || (url.getUri() != null && url.getUri().startsWith("file://"))) {
                if (onlyPictureContent.isSendRaw() || !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
                    picturePath = onlyPictureContent.getPicturePath();
                } else {
                    picturePath = onlyPictureContent.getCompressPath();
                }
            }
            return str;
        } else {
            if (baseContent instanceof StoryPictureContent) {
                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                if (storyPictureContent.getUrl() == null) {
                    if (storyPictureContent.isSendRaw() || TextUtils.isEmpty(storyPictureContent.getCompressPath())) {
                        picturePath = storyPictureContent.getPicturePath();
                    } else {
                        picturePath = storyPictureContent.getCompressPath();
                    }
                }
            }
            return str;
        }
        str = picturePath;
        return str;
    }

    /* renamed from: c */
    public final void mo81338c(Message message) {
        if (message.getMsgType() == 2) {
            OnlyPictureContent onlyPictureContent = (OnlyPictureContent) C31913m.m103667a(message.getContent(), OnlyPictureContent.class);
            if (onlyPictureContent.getUrl() != null) {
                message.setMsgStatus(0);
                C31863ai.m103535c(message);
            } else if (onlyPictureContent.isSendRaw() || TextUtils.isEmpty(onlyPictureContent.getCompressPath()) || FileUtils.m28679c(onlyPictureContent.getCompressPath()) || C31932z.m103697a(onlyPictureContent.getPicturePath(), onlyPictureContent.getCompressPath()) != 2) {
                message.setMsgStatus(0);
                C31863ai.m103533b(message);
                mo81284b(message);
            } else {
                C10761a.m31392b(C6399b.m19921a(), (int) R.string.bi6, 1).mo25750a();
            }
        } else if (message.getMsgType() == 27) {
            StoryPictureContent storyPictureContent = (StoryPictureContent) C31913m.m103667a(message.getContent(), StoryPictureContent.class);
            if (storyPictureContent.getUrl() != null) {
                message.setMsgStatus(0);
                C31863ai.m103535c(message);
            } else if (storyPictureContent.isSendRaw() || TextUtils.isEmpty(storyPictureContent.getCompressPath()) || FileUtils.m28679c(storyPictureContent.getCompressPath()) || C31932z.m103697a(storyPictureContent.getPicturePath(), storyPictureContent.getCompressPath()) != 2) {
                message.setMsgStatus(0);
                C31863ai.m103533b(message);
                mo81284b(message);
            } else {
                C10761a.m31392b(C6399b.m19921a(), (int) R.string.bi6, 1).mo25750a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo81337b(String str, List list) throws Exception {
        return mo81331a(str, list, C30913u.m100638a().f80964b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C30926ac mo81279a(Message message, BaseContent baseContent) {
        if (baseContent instanceof OnlyPictureContent) {
            return new C30950q(this.f19650e, this.f19649d, (OnlyPictureContent) baseContent, message);
        }
        if (baseContent instanceof StoryPictureContent) {
            return new C30935h(this.f19649d, (StoryPictureContent) baseContent, message);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo81333a(Message message, C30981y yVar) {
        String a = C30950q.m100663a(message);
        if (message.getMsgType() == 2) {
            C30982z zVar = (C30982z) this.f81004a.get(a);
            if (zVar != null) {
                zVar.mo81371a(yVar);
            }
            return;
        }
        if (message.getMsgType() == 27) {
            C30935h hVar = (C30935h) this.f81004a.get(a);
            if (hVar != null) {
                hVar.f81020b = yVar;
            }
        }
    }

    /* renamed from: a */
    public final String mo81331a(String str, List<PhotoParam> list, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        for (PhotoParam photoParam : list) {
            String str2 = "";
            if (!z) {
                str2 = C31932z.m103701a(photoParam.getPath());
                int a = C31932z.m103697a(photoParam.getPath(), str2);
                if (a != 2) {
                    if (a == 1) {
                        str2 = "";
                    }
                }
                z2 = true;
            }
            String b = C31932z.m103707b(photoParam.getPath());
            int a2 = C31932z.m103698a(photoParam.getPath(), b, 240, 240);
            if (a2 != 2) {
                if (a2 == 1) {
                    b = "";
                }
                StoryPictureContent obtain = StoryPictureContent.obtain(photoParam);
                obtain.setSendRaw(z);
                obtain.setCompressPath(str2);
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(b)) {
                    arrayList.add(b);
                }
                obtain.setCheckPics(arrayList);
                C7058be.m21980a().mo18272c(str, obtain, new C7059a() {
                    public final void onSendFailure(C11438g gVar) {
                    }

                    public final void onSendSuccess(Message message) {
                    }

                    public final void onSend(Conversation conversation, List<Message> list) {
                        for (Message message : list) {
                            if (message.getMsgType() == 27) {
                                C30963v.this.mo81284b(message);
                            }
                        }
                    }
                });
            }
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        if (list.size() > 1) {
            return C6399b.m19921a().getString(R.string.bi7);
        }
        return C6399b.m19921a().getString(R.string.bi6);
    }

    /* renamed from: a */
    public final void mo81334a(String str, BaseContent baseContent, C30981y yVar) {
        if ((baseContent instanceof SharePoiContent) || (baseContent instanceof OnlyPictureContent)) {
            C30982z zVar = new C30982z(this.f19650e);
            zVar.f81105b = str;
            zVar.mo81371a(yVar);
            mo81283a(zVar);
            return;
        }
        if (baseContent instanceof StoryPictureContent) {
            C30935h hVar = new C30935h(this.f19649d, (StoryPictureContent) baseContent, null);
            hVar.f81020b = yVar;
            mo81283a(hVar);
        }
    }
}
