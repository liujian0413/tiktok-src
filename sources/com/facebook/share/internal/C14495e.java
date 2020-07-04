package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public final class C14495e {
    /* renamed from: a */
    private static Bundle m41835a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = m41834a((ShareContent) shareLinkContent, z);
        C13967z.m41237a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.f37608b);
        C13967z.m41237a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f37607a);
        C13967z.m41236a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.f37609c);
        return a;
    }

    /* renamed from: a */
    private static Bundle m41834a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C13967z.m41236a(bundle, "com.facebook.platform.extra.LINK", shareContent.f37593h);
        C13967z.m41237a(bundle, "com.facebook.platform.extra.PLACE", shareContent.f37595j);
        C13967z.m41237a(bundle, "com.facebook.platform.extra.REF", shareContent.f37597l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f37594i;
        if (!C13967z.m41250a((Collection<T>) list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(list));
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m41837a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a = m41834a((ShareContent) sharePhotoContent, z);
        a.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m41836a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = m41834a((ShareContent) shareOpenGraphContent, z);
        C13967z.m41237a(a, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f37640b);
        C13967z.m41237a(a, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f37639a.mo36779a());
        C13967z.m41237a(a, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    public static Bundle m41838a(UUID uuid, ShareContent shareContent, boolean z) {
        C13876aa.m40978a((Object) shareContent, "shareContent");
        C13876aa.m40978a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m41835a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m41837a(sharePhotoContent, C14540n.m42030a(sharePhotoContent, uuid), z);
        } else if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return m41836a(shareOpenGraphContent, C14540n.m42033a(uuid, shareOpenGraphContent), z);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        }
    }
}
