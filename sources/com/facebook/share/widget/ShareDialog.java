package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13861a;
import com.facebook.internal.C13906e;
import com.facebook.internal.C13907f;
import com.facebook.internal.C13907f.C13908a;
import com.facebook.internal.C13909g;
import com.facebook.internal.C13909g.C13910a;
import com.facebook.internal.C13950u;
import com.facebook.internal.C13950u.C13952a;
import com.facebook.internal.C13967z;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.C14478a;
import com.facebook.share.C14478a.C14479a;
import com.facebook.share.internal.C14495e;
import com.facebook.share.internal.C14531j;
import com.facebook.share.internal.C14535m;
import com.facebook.share.internal.C14540n;
import com.facebook.share.internal.C14551o;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.C14579a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C14581a;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends C13909g<ShareContent, C14479a> implements C14478a {

    /* renamed from: c */
    private static final String f37690c = "ShareDialog";

    /* renamed from: d */
    private static final int f37691d = RequestCodeOffset.Share.toRequestCode();

    /* renamed from: e */
    private boolean f37692e;

    /* renamed from: f */
    private boolean f37693f = true;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$a */
    class C14593a extends C13910a {
        /* renamed from: a */
        public final Object mo33568a() {
            return Mode.NATIVE;
        }

        private C14593a() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13861a mo33567a(final ShareContent shareContent) {
            C14535m.m41968a(shareContent);
            final C13861a c = ShareDialog.this.mo33566c();
            final boolean d = ShareDialog.this.mo36845d();
            C13907f.m41051a(c, (C13908a) new C13908a() {
                /* renamed from: a */
                public final Bundle mo33560a() {
                    return C14531j.m41957a(c.f36731a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo33561b() {
                    return C14495e.m41838a(c.f36731a, shareContent, d);
                }
            }, ShareDialog.m42203b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo33569a(Object obj, boolean z) {
            return m42210a((ShareContent) obj, z);
        }

        /* renamed from: a */
        private static boolean m42210a(ShareContent shareContent, boolean z) {
            if (!(shareContent instanceof ShareCameraEffectContent) || !ShareDialog.m42202a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$b */
    class C14595b extends C13910a {
        /* renamed from: a */
        public final Object mo33568a() {
            return Mode.FEED;
        }

        private C14595b() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13861a mo33567a(ShareContent shareContent) {
            Bundle bundle;
            ShareDialog.this.mo36844a(ShareDialog.this.mo33562a(), shareContent, Mode.FEED);
            C13861a c = ShareDialog.this.mo33566c();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                C14535m.m41991b(shareLinkContent);
                bundle = C14551o.m42066b(shareLinkContent);
            } else {
                bundle = C14551o.m42061a((ShareFeedContent) shareContent);
            }
            C13907f.m41053a(c, C22704b.f60414c, bundle);
            return c;
        }

        /* renamed from: a */
        private static boolean m42217a(ShareContent shareContent, boolean z) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo33569a(Object obj, boolean z) {
            return m42217a((ShareContent) obj, z);
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$c */
    class C14596c extends C13910a {
        /* renamed from: a */
        public final Object mo33568a() {
            return Mode.NATIVE;
        }

        private C14596c() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13861a mo33567a(final ShareContent shareContent) {
            ShareDialog.this.mo36844a(ShareDialog.this.mo33562a(), shareContent, Mode.NATIVE);
            C14535m.m41968a(shareContent);
            final C13861a c = ShareDialog.this.mo33566c();
            final boolean d = ShareDialog.this.mo36845d();
            C13907f.m41051a(c, (C13908a) new C13908a() {
                /* renamed from: a */
                public final Bundle mo33560a() {
                    return C14531j.m41957a(c.f36731a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo33561b() {
                    return C14495e.m41838a(c.f36731a, shareContent, d);
                }
            }, ShareDialog.m42203b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo33569a(Object obj, boolean z) {
            return m42222a((ShareContent) obj, z);
        }

        /* renamed from: a */
        private static boolean m42222a(ShareContent shareContent, boolean z) {
            boolean z2;
            if (shareContent == null || (shareContent instanceof ShareCameraEffectContent) || (shareContent instanceof ShareStoryContent)) {
                return false;
            }
            if (!z) {
                if (shareContent.f37598m != null) {
                    z2 = C13907f.m41054a((C13906e) ShareDialogFeature.HASHTAG);
                } else {
                    z2 = true;
                }
                if ((shareContent instanceof ShareLinkContent) && !C13967z.m41249a(((ShareLinkContent) shareContent).f37610d)) {
                    z2 &= C13907f.m41054a((C13906e) ShareDialogFeature.LINK_SHARE_QUOTES);
                }
            } else {
                z2 = true;
            }
            if (!z2 || !ShareDialog.m42202a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$d */
    class C14598d extends C13910a {
        /* renamed from: a */
        public final Object mo33568a() {
            return Mode.NATIVE;
        }

        private C14598d() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13861a mo33567a(final ShareContent shareContent) {
            C14535m.m41994c(shareContent);
            final C13861a c = ShareDialog.this.mo33566c();
            final boolean d = ShareDialog.this.mo36845d();
            C13907f.m41051a(c, (C13908a) new C13908a() {
                /* renamed from: a */
                public final Bundle mo33560a() {
                    return C14531j.m41957a(c.f36731a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo33561b() {
                    return C14495e.m41838a(c.f36731a, shareContent, d);
                }
            }, ShareDialog.m42203b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo33569a(Object obj, boolean z) {
            return m42229a((ShareContent) obj, z);
        }

        /* renamed from: a */
        private static boolean m42229a(ShareContent shareContent, boolean z) {
            if (!(shareContent instanceof ShareStoryContent) || !ShareDialog.m42202a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$e */
    class C14600e extends C13910a {
        /* renamed from: a */
        public final Object mo33568a() {
            return Mode.WEB;
        }

        private C14600e() {
            super();
        }

        /* renamed from: b */
        private static String m42238b(ShareContent shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            if (shareContent instanceof ShareOpenGraphContent) {
                return "share_open_graph";
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13861a mo33567a(ShareContent shareContent) {
            Bundle bundle;
            ShareDialog.this.mo36844a(ShareDialog.this.mo33562a(), shareContent, Mode.WEB);
            C13861a c = ShareDialog.this.mo33566c();
            C14535m.m41991b(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                bundle = C14551o.m42063a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof SharePhotoContent) {
                bundle = C14551o.m42065a(m42236a((SharePhotoContent) shareContent, c.f36731a));
            } else {
                bundle = C14551o.m42064a((ShareOpenGraphContent) shareContent);
            }
            C13907f.m41053a(c, m42238b(shareContent), bundle);
            return c;
        }

        /* renamed from: a */
        private static boolean m42237a(ShareContent shareContent, boolean z) {
            if (shareContent == null || !ShareDialog.m42201a(shareContent)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo33569a(Object obj, boolean z) {
            return m42237a((ShareContent) obj, z);
        }

        /* renamed from: a */
        private static SharePhotoContent m42236a(SharePhotoContent sharePhotoContent, UUID uuid) {
            C14581a a = new C14581a().mo36747a(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sharePhotoContent.f37651a.size(); i++) {
                SharePhoto sharePhoto = (SharePhoto) sharePhotoContent.f37651a.get(i);
                Bitmap bitmap = sharePhoto.f37643a;
                if (bitmap != null) {
                    C13952a a2 = C13950u.m41141a(uuid, bitmap);
                    sharePhoto = new C14579a().mo36762a(sharePhoto).mo36799a(Uri.parse(a2.f36915b)).mo36798a((Bitmap) null).mo36801a();
                    arrayList2.add(a2);
                }
                arrayList.add(sharePhoto);
            }
            a.mo36807a((List<SharePhoto>) arrayList);
            C13950u.m41149a((Collection<C13952a>) arrayList2);
            return a.mo36808a();
        }
    }

    /* renamed from: d */
    public final boolean mo36845d() {
        return this.f37692e;
    }

    /* renamed from: c */
    public final C13861a mo33566c() {
        return new C13861a(this.f36811b);
    }

    /* renamed from: b */
    public final List<C13910a> mo33564b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C14596c());
        arrayList.add(new C14595b());
        arrayList.add(new C14600e());
        arrayList.add(new C14593a());
        arrayList.add(new C14598d());
        return arrayList;
    }

    public ShareDialog(Activity activity) {
        super(activity, f37691d);
        C14540n.m42035a(f37691d);
    }

    /* renamed from: a */
    public static boolean m42202a(Class<? extends ShareContent> cls) {
        C13906e b = m42203b(cls);
        if (b == null || !C13907f.m41054a(b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m42201a(ShareContent shareContent) {
        if (!m42204c(shareContent.getClass())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C14540n.m42032a((ShareOpenGraphContent) shareContent);
            } catch (Exception e) {
                C13967z.m41242a(f37690c, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", (Throwable) e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m42204c(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.m38232b())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C13906e m42203b(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo36844a(Context context, ShareContent shareContent, Mode mode) {
        String str;
        String str2;
        if (this.f37693f) {
            mode = Mode.AUTOMATIC;
        }
        switch (mode) {
            case AUTOMATIC:
                str = "automatic";
                break;
            case WEB:
                str = "web";
                break;
            case NATIVE:
                str = "native";
                break;
            default:
                str = "unknown";
                break;
        }
        C13906e b = m42203b(shareContent.getClass());
        if (b == ShareDialogFeature.SHARE_DIALOG) {
            str2 = "status";
        } else if (b == ShareDialogFeature.PHOTOS) {
            str2 = "photo";
        } else if (b == ShareDialogFeature.VIDEO) {
            str2 = "video";
        } else if (b == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        } else {
            str2 = "unknown";
        }
        C13187j jVar = new C13187j(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        jVar.mo32371b("fb_share_dialog_show", bundle);
    }
}
