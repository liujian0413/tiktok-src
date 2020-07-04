package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.j */
public final class C14531j {
    /* renamed from: a */
    public static Bundle m41957a(UUID uuid, ShareContent shareContent, boolean z) {
        C13876aa.m40978a((Object) shareContent, "shareContent");
        C13876aa.m40978a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m41948a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m41954a(sharePhotoContent, C14540n.m42030a(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return m41956a(shareVideoContent, C14540n.m42028a(shareVideoContent, uuid), z);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return m41953a(shareOpenGraphContent, C14540n.m42034a(C14540n.m42033a(uuid, shareOpenGraphContent), false), z);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            return m41949a(shareMediaContent, C14540n.m42029a(shareMediaContent, uuid), z);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return m41946a(shareCameraEffectContent, C14540n.m42016a(shareCameraEffectContent, uuid), z);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            return m41950a((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                return m41952a((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                return m41951a((ShareMessengerMediaTemplateContent) shareContent, z);
            }
            if (!(shareContent instanceof ShareStoryContent)) {
                return null;
            }
            ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
            return m41955a(shareStoryContent, C14540n.m42040b(shareStoryContent, uuid), C14540n.m42017a(shareStoryContent, uuid), z);
        }
    }

    /* renamed from: a */
    private static Bundle m41956a(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle a = m41947a((ShareContent) shareVideoContent, z);
        C13967z.m41237a(a, "TITLE", shareVideoContent.f37660b);
        C13967z.m41237a(a, "DESCRIPTION", shareVideoContent.f37659a);
        C13967z.m41237a(a, "VIDEO", str);
        return a;
    }

    /* renamed from: a */
    private static Bundle m41953a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = m41947a((ShareContent) shareOpenGraphContent, z);
        C13967z.m41237a(a, "PREVIEW_PROPERTY_NAME", (String) C14540n.m42018a(shareOpenGraphContent.f37640b).second);
        C13967z.m41237a(a, "ACTION_TYPE", shareOpenGraphContent.f37639a.mo36779a());
        C13967z.m41237a(a, "ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    private static Bundle m41955a(ShareStoryContent shareStoryContent, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle a = m41947a((ShareContent) shareStoryContent, z);
        if (bundle != null) {
            a.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            a.putParcelable("interactive_asset_uri", bundle2);
        }
        List a2 = shareStoryContent.mo36809a();
        if (!C13967z.m41250a((Collection<T>) a2)) {
            a.putStringArrayList("top_background_color_list", new ArrayList(a2));
        }
        C13967z.m41237a(a, "content_url", shareStoryContent.f37655c);
        return a;
    }

    /* renamed from: a */
    private static Bundle m41947a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C13967z.m41236a(bundle, "LINK", shareContent.f37593h);
        C13967z.m41237a(bundle, "PLACE", shareContent.f37595j);
        C13967z.m41237a(bundle, "PAGE", shareContent.f37596k);
        C13967z.m41237a(bundle, "REF", shareContent.f37597l);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f37594i;
        if (!C13967z.m41250a((Collection<T>) list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(list));
        }
        ShareHashtag shareHashtag = shareContent.f37598m;
        if (shareHashtag != null) {
            C13967z.m41237a(bundle, "HASHTAG", shareHashtag.f37605a);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m41948a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = m41947a((ShareContent) shareLinkContent, z);
        C13967z.m41237a(a, "TITLE", shareLinkContent.f37608b);
        C13967z.m41237a(a, "DESCRIPTION", shareLinkContent.f37607a);
        C13967z.m41236a(a, "IMAGE", shareLinkContent.f37609c);
        C13967z.m41237a(a, "QUOTE", shareLinkContent.f37610d);
        C13967z.m41236a(a, "MESSENGER_LINK", shareLinkContent.f37593h);
        C13967z.m41236a(a, "TARGET_DISPLAY", shareLinkContent.f37593h);
        return a;
    }

    /* renamed from: a */
    private static Bundle m41950a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a = m41947a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            C14529i.m41937a(a, shareMessengerGenericTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m41951a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a = m41947a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            C14529i.m41939a(a, shareMessengerMediaTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m41952a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a = m41947a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            C14529i.m41940a(a, shareMessengerOpenGraphMusicTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m41949a(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z) {
        Bundle a = m41947a((ShareContent) shareMediaContent, z);
        a.putParcelableArrayList("MEDIA", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m41954a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a = m41947a((ShareContent) sharePhotoContent, z);
        a.putStringArrayList("PHOTOS", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m41946a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        Bundle a = m41947a((ShareContent) shareCameraEffectContent, z);
        C13967z.m41237a(a, "effect_id", shareCameraEffectContent.f37590a);
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject a2 = C14487a.m41826a(shareCameraEffectContent.f37591b);
            if (a2 != null) {
                C13967z.m41237a(a, "effect_arguments", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided CameraEffectArguments: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }
}
