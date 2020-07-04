package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.C1642a;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.share.internal.m */
public final class C14535m {

    /* renamed from: a */
    private static C14538b f37556a;

    /* renamed from: b */
    private static C14538b f37557b;

    /* renamed from: c */
    private static C14538b f37558c;

    /* renamed from: com.facebook.share.internal.m$a */
    static class C14537a extends C14538b {
        private C14537a() {
            super();
        }

        /* renamed from: a */
        public final void mo36700a(ShareStoryContent shareStoryContent) {
            C14535m.m41985a(shareStoryContent, (C14538b) this);
        }
    }

    /* renamed from: com.facebook.share.internal.m$b */
    static class C14538b {

        /* renamed from: a */
        public boolean f37559a;

        private C14538b() {
        }

        /* renamed from: a */
        public final void mo36710a(SharePhotoContent sharePhotoContent) {
            C14535m.m41984a(sharePhotoContent, this);
        }

        /* renamed from: a */
        public void mo36712a(ShareVideoContent shareVideoContent) {
            C14535m.m41987a(shareVideoContent, this);
        }

        /* renamed from: a */
        public final void mo36708a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            C14535m.m41981a(shareOpenGraphValueContainer, this, z);
        }

        /* renamed from: a */
        public void mo36709a(SharePhoto sharePhoto) {
            C14535m.m41983a(sharePhoto, this);
        }

        /* renamed from: a */
        public final void mo36711a(ShareVideo shareVideo) {
            C14535m.m41986a(shareVideo, this);
        }

        /* renamed from: a */
        public void mo36700a(ShareStoryContent shareStoryContent) {
            C14535m.m41985a(shareStoryContent, this);
        }

        /* renamed from: a */
        public static void m41997a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            C14535m.m41974a(shareMessengerGenericTemplateContent);
        }

        /* renamed from: a */
        public static void m41998a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            C14535m.m41975a(shareMessengerMediaTemplateContent);
        }

        /* renamed from: a */
        public static void m41999a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            C14535m.m41976a(shareMessengerOpenGraphMusicTemplateContent);
        }

        /* renamed from: a */
        public final void mo36701a(ShareCameraEffectContent shareCameraEffectContent) {
            C14535m.m41967a(shareCameraEffectContent, this);
        }

        /* renamed from: a */
        public final void mo36702a(ShareLinkContent shareLinkContent) {
            C14535m.m41970a(shareLinkContent, this);
        }

        /* renamed from: a */
        public final void mo36703a(ShareMedia shareMedia) {
            C14535m.m41971a(shareMedia, this);
        }

        /* renamed from: a */
        public void mo36704a(ShareMediaContent shareMediaContent) {
            C14535m.m41972a(shareMediaContent, this);
        }

        /* renamed from: a */
        public final void mo36705a(ShareOpenGraphAction shareOpenGraphAction) {
            C14535m.m41978a(shareOpenGraphAction, this);
        }

        /* renamed from: a */
        public final void mo36706a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f37559a = true;
            C14535m.m41979a(shareOpenGraphContent, this);
        }

        /* renamed from: a */
        public final void mo36707a(ShareOpenGraphObject shareOpenGraphObject) {
            C14535m.m41980a(shareOpenGraphObject, this);
        }
    }

    /* renamed from: com.facebook.share.internal.m$c */
    static class C14539c extends C14538b {
        private C14539c() {
            super();
        }

        /* renamed from: a */
        public final void mo36709a(SharePhoto sharePhoto) {
            C14535m.m41992b(sharePhoto, this);
        }

        /* renamed from: a */
        public final void mo36704a(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        /* renamed from: a */
        public final void mo36712a(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* renamed from: a */
    public static void m41985a(ShareStoryContent shareStoryContent, C14538b bVar) {
        if (shareStoryContent == null || (shareStoryContent.f37653a == null && shareStoryContent.f37654b == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.f37653a != null) {
            bVar.mo36703a(shareStoryContent.f37653a);
        }
        if (shareStoryContent.f37654b != null) {
            bVar.mo36709a(shareStoryContent.f37654b);
        }
    }

    /* renamed from: a */
    public static void m41984a(SharePhotoContent sharePhotoContent, C14538b bVar) {
        List<SharePhoto> list = sharePhotoContent.f37651a;
        if (list == null || list.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (SharePhoto a : list) {
                bVar.mo36709a(a);
            }
        } else {
            throw new FacebookException(C1642a.m8035a(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
        }
    }

    /* renamed from: a */
    private static void m41982a(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.f37643a;
            Uri uri = sharePhoto.f37644b;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    /* renamed from: a */
    public static void m41983a(SharePhoto sharePhoto, C14538b bVar) {
        m41995c(sharePhoto, bVar);
        if (sharePhoto.f37643a != null || !C13967z.m41259b(sharePhoto.f37644b)) {
            C13876aa.m40988d(C13499h.m39721g());
        }
    }

    /* renamed from: a */
    public static void m41987a(ShareVideoContent shareVideoContent, C14538b bVar) {
        bVar.mo36711a(shareVideoContent.f37662d);
        SharePhoto sharePhoto = shareVideoContent.f37661c;
        if (sharePhoto != null) {
            bVar.mo36709a(sharePhoto);
        }
    }

    /* renamed from: a */
    public static void m41986a(ShareVideo shareVideo, C14538b bVar) {
        if (shareVideo != null) {
            Uri uri = shareVideo.f37657a;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!C13967z.m41264c(uri) && !C13967z.m41268d(uri)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
    }

    /* renamed from: a */
    public static void m41979a(ShareOpenGraphContent shareOpenGraphContent, C14538b bVar) {
        bVar.mo36705a(shareOpenGraphContent.f37639a);
        String str = shareOpenGraphContent.f37640b;
        if (C13967z.m41249a(str)) {
            throw new FacebookException("Must specify a previewPropertyName.");
        } else if (shareOpenGraphContent.f37639a.mo36789a(str) == null) {
            StringBuilder sb = new StringBuilder("Property \"");
            sb.append(str);
            sb.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m41978a(ShareOpenGraphAction shareOpenGraphAction, C14538b bVar) {
        if (shareOpenGraphAction == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (!C13967z.m41249a(shareOpenGraphAction.mo36779a())) {
            bVar.mo36708a(shareOpenGraphAction, false);
        } else {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    /* renamed from: a */
    public static void m41980a(ShareOpenGraphObject shareOpenGraphObject, C14538b bVar) {
        if (shareOpenGraphObject != null) {
            bVar.mo36708a(shareOpenGraphObject, true);
            return;
        }
        throw new FacebookException("Cannot share a null ShareOpenGraphObject");
    }

    /* renamed from: a */
    public static void m41981a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C14538b bVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.mo36792c()) {
            m41989a(str, z);
            Object a = shareOpenGraphValueContainer.mo36789a(str);
            if (a instanceof List) {
                for (Object next : (List) a) {
                    if (next != null) {
                        m41988a(next, bVar);
                    } else {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                m41988a(a, bVar);
            }
        }
    }

    /* renamed from: a */
    public static void m41976a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C13967z.m41249a(shareMessengerOpenGraphMusicTemplateContent.f37596k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.f37632a != null) {
            m41973a(shareMessengerOpenGraphMusicTemplateContent.f37633b);
        } else {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    /* renamed from: a */
    public static void m41975a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C13967z.m41249a(shareMessengerMediaTemplateContent.f37596k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.f37630c != null || !C13967z.m41249a(shareMessengerMediaTemplateContent.f37629b)) {
            m41973a(shareMessengerMediaTemplateContent.f37631d);
        } else {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    /* renamed from: a */
    private static void m41977a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f37634b == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* renamed from: a */
    private static void m41989a(String str, boolean z) {
        if (z) {
            String[] split = str.split(":");
            if (split.length >= 2) {
                int length = split.length;
                int i = 0;
                while (i < length) {
                    if (!split[i].isEmpty()) {
                        i++;
                    } else {
                        throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                    }
                }
                return;
            }
            throw new FacebookException("Open Graph keys must be namespaced: %s", str);
        }
    }

    /* renamed from: a */
    private static void m41988a(Object obj, C14538b bVar) {
        if (obj instanceof ShareOpenGraphObject) {
            bVar.mo36707a((ShareOpenGraphObject) obj);
            return;
        }
        if (obj instanceof SharePhoto) {
            bVar.mo36709a((SharePhoto) obj);
        }
    }

    /* renamed from: a */
    private static C14538b m41966a() {
        if (f37558c == null) {
            f37558c = new C14537a();
        }
        return f37558c;
    }

    /* renamed from: b */
    private static C14538b m41990b() {
        if (f37557b == null) {
            f37557b = new C14538b();
        }
        return f37557b;
    }

    /* renamed from: c */
    private static C14538b m41993c() {
        if (f37556a == null) {
            f37556a = new C14539c();
        }
        return f37556a;
    }

    /* renamed from: a */
    public static void m41968a(ShareContent shareContent) {
        m41969a(shareContent, m41990b());
    }

    /* renamed from: b */
    public static void m41991b(ShareContent shareContent) {
        m41969a(shareContent, m41993c());
    }

    /* renamed from: c */
    public static void m41994c(ShareContent shareContent) {
        m41969a(shareContent, m41966a());
    }

    /* renamed from: a */
    private static void m41973a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (!C13967z.m41249a(shareMessengerActionButton.f37619a)) {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    m41977a((ShareMessengerURLActionButton) shareMessengerActionButton);
                }
                return;
            }
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
    }

    /* renamed from: a */
    public static void m41974a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (C13967z.m41249a(shareMessengerGenericTemplateContent.f37596k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.f37622c == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!C13967z.m41249a(shareMessengerGenericTemplateContent.f37622c.f37623a)) {
            m41973a(shareMessengerGenericTemplateContent.f37622c.f37627e);
        } else {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    /* renamed from: b */
    public static void m41992b(SharePhoto sharePhoto, C14538b bVar) {
        m41982a(sharePhoto);
    }

    /* renamed from: a */
    public static void m41967a(ShareCameraEffectContent shareCameraEffectContent, C14538b bVar) {
        if (C13967z.m41249a(shareCameraEffectContent.f37590a)) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    /* renamed from: c */
    private static void m41995c(SharePhoto sharePhoto, C14538b bVar) {
        m41982a(sharePhoto);
        Bitmap bitmap = sharePhoto.f37643a;
        Uri uri = sharePhoto.f37644b;
        if (bitmap == null && C13967z.m41259b(uri) && !bVar.f37559a) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* renamed from: a */
    public static void m41970a(ShareLinkContent shareLinkContent, C14538b bVar) {
        Uri uri = shareLinkContent.f37609c;
        if (uri != null && !C13967z.m41259b(uri)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    /* renamed from: a */
    private static void m41969a(ShareContent shareContent, C14538b bVar) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            bVar.mo36702a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            bVar.mo36710a((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            bVar.mo36712a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            bVar.mo36706a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            bVar.mo36704a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            bVar.mo36701a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            C14538b.m41999a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            C14538b.m41998a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            C14538b.m41997a((ShareMessengerGenericTemplateContent) shareContent);
        } else {
            if (shareContent instanceof ShareStoryContent) {
                bVar.mo36700a((ShareStoryContent) shareContent);
            }
        }
    }

    /* renamed from: a */
    public static void m41971a(ShareMedia shareMedia, C14538b bVar) {
        if (shareMedia instanceof SharePhoto) {
            bVar.mo36709a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            bVar.mo36711a((ShareVideo) shareMedia);
        } else {
            throw new FacebookException(C1642a.m8035a(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }

    /* renamed from: a */
    public static void m41972a(ShareMediaContent shareMediaContent, C14538b bVar) {
        List<ShareMedia> list = shareMediaContent.f37618a;
        if (list == null || list.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        } else if (list.size() <= 6) {
            for (ShareMedia a : list) {
                bVar.mo36703a(a);
            }
        } else {
            throw new FacebookException(C1642a.m8035a(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
        }
    }
}
