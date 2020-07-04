package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C13967z;
import com.facebook.internal.C13967z.C13971b;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.o */
public final class C14551o {
    /* renamed from: a */
    private static Bundle m42062a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f37598m;
        if (shareHashtag != null) {
            C13967z.m41237a(bundle, "hashtag", shareHashtag.f37605a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m42061a(ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        C13967z.m41237a(bundle, "to", shareFeedContent.f37456a);
        C13967z.m41237a(bundle, "link", shareFeedContent.f37457b);
        C13967z.m41237a(bundle, "picture", shareFeedContent.f37461f);
        C13967z.m41237a(bundle, "source", shareFeedContent.f37462g);
        C13967z.m41237a(bundle, "name", shareFeedContent.f37458c);
        C13967z.m41237a(bundle, "caption", shareFeedContent.f37459d);
        C13967z.m41237a(bundle, "description", shareFeedContent.f37460e);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m42066b(ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        C13967z.m41237a(bundle, "name", shareLinkContent.f37608b);
        C13967z.m41237a(bundle, "description", shareLinkContent.f37607a);
        C13967z.m41237a(bundle, "link", C13967z.m41220a(shareLinkContent.f37593h));
        C13967z.m41237a(bundle, "picture", C13967z.m41220a(shareLinkContent.f37609c));
        C13967z.m41237a(bundle, "quote", shareLinkContent.f37610d);
        if (shareLinkContent.f37598m != null) {
            C13967z.m41237a(bundle, "hashtag", shareLinkContent.f37598m.f37605a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m42063a(ShareLinkContent shareLinkContent) {
        Bundle a = m42062a((ShareContent) shareLinkContent);
        C13967z.m41236a(a, "href", shareLinkContent.f37593h);
        C13967z.m41237a(a, "quote", shareLinkContent.f37610d);
        return a;
    }

    /* renamed from: a */
    public static Bundle m42064a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m42062a((ShareContent) shareOpenGraphContent);
        C13967z.m41237a(a, "action_type", shareOpenGraphContent.f37639a.mo36779a());
        try {
            JSONObject a2 = C14540n.m42034a(C14540n.m42032a(shareOpenGraphContent), false);
            if (a2 != null) {
                C13967z.m41237a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static Bundle m42065a(SharePhotoContent sharePhotoContent) {
        Bundle a = m42062a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.f37651a.size()];
        C13967z.m41231a(sharePhotoContent.f37651a, (C13971b<T, K>) new C13971b<SharePhoto, String>() {
            /* renamed from: a */
            private static String m42067a(SharePhoto sharePhoto) {
                return sharePhoto.f37644b.toString();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo33619a(Object obj) {
                return m42067a((SharePhoto) obj);
            }
        }).toArray(strArr);
        a.putStringArray("media", strArr);
        return a;
    }
}
