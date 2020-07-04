package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C13498g;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.HttpMethod;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13861a;
import com.facebook.internal.C13950u;
import com.facebook.internal.C13950u.C13952a;
import com.facebook.internal.C13953v;
import com.facebook.internal.C13967z;
import com.facebook.internal.C13967z.C13971b;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.C13855a;
import com.facebook.share.C14478a.C14479a;
import com.facebook.share.internal.C14532k.C14533a;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView.ObjectType;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.n */
public final class C14540n {
    /* renamed from: a */
    public static String m42027a(Bundle bundle) {
        if (bundle.containsKey("completionGesture")) {
            return bundle.getString("completionGesture");
        }
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    /* renamed from: a */
    public static boolean m42039a(int i, int i2, Intent intent, C14534l lVar) {
        C13861a a = m42021a(i, i2, intent);
        if (a == null) {
            return false;
        }
        C13950u.m41150a(a.f36731a);
        if (lVar == null) {
            return true;
        }
        FacebookException a2 = C13953v.m41162a(C13953v.m41179e(intent));
        if (a2 == null) {
            lVar.mo36686a(a, C13953v.m41175c(intent));
        } else if (a2 instanceof FacebookOperationCanceledException) {
            lVar.mo36685a(a);
        } else {
            lVar.mo36687a(a, a2);
        }
        return true;
    }

    /* renamed from: a */
    public static void m42035a(final int i) {
        CallbackManagerImpl.m40921a(i, new C13855a() {
            /* renamed from: a */
            public final boolean mo33483a(int i, Intent intent) {
                return C14540n.m42039a(i, i, intent, C14540n.m42024a(null));
            }
        });
    }

    /* renamed from: a */
    public static List<String> m42030a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (sharePhotoContent != null) {
            List<SharePhoto> list = sharePhotoContent.f37651a;
            if (list != null) {
                List a = C13967z.m41231a(list, (C13971b<T, K>) new C13971b<SharePhoto, C13952a>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C13952a mo33619a(SharePhoto sharePhoto) {
                        return C14540n.m42023a(uuid, (ShareMedia) sharePhoto);
                    }
                });
                List<String> a2 = C13967z.m41231a(a, (C13971b<T, K>) new C13971b<C13952a, String>() {
                    /* renamed from: a */
                    private static String m42055a(C13952a aVar) {
                        return aVar.f36915b;
                    }

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Object mo33619a(Object obj) {
                        return m42055a((C13952a) obj);
                    }
                });
                C13950u.m41149a((Collection<C13952a>) a);
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m42028a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (shareVideoContent == null || shareVideoContent.f37662d == null) {
            return null;
        }
        C13952a a = C13950u.m41142a(uuid, shareVideoContent.f37662d.f37657a);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a);
        C13950u.m41149a((Collection<C13952a>) arrayList);
        return a.f36915b;
    }

    /* renamed from: a */
    public static List<Bundle> m42029a(ShareMediaContent shareMediaContent, final UUID uuid) {
        if (shareMediaContent != null) {
            List<ShareMedia> list = shareMediaContent.f37618a;
            if (list != null) {
                final ArrayList arrayList = new ArrayList();
                List<Bundle> a = C13967z.m41231a(list, (C13971b<T, K>) new C13971b<ShareMedia, Bundle>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Bundle mo33619a(ShareMedia shareMedia) {
                        C13952a a = C14540n.m42023a(uuid, shareMedia);
                        arrayList.add(a);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", shareMedia.mo36759b().name());
                        bundle.putString("uri", a.f36915b);
                        return bundle;
                    }
                });
                C13950u.m41149a((Collection<C13952a>) arrayList);
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m42033a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        Set set;
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f37639a;
        final ArrayList arrayList = new ArrayList();
        JSONObject a = C14532k.m41960a(shareOpenGraphAction, (C14533a) new C14533a() {
            /* renamed from: a */
            public final JSONObject mo36699a(SharePhoto sharePhoto) {
                C13952a a = C14540n.m42023a(uuid, (ShareMedia) sharePhoto);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.f36915b);
                    if (sharePhoto.f37645c) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", (Throwable) e);
                }
            }
        });
        C13950u.m41149a((Collection<C13952a>) arrayList);
        if (shareOpenGraphContent.f37595j != null && C13967z.m41249a(a.optString("place"))) {
            a.put("place", shareOpenGraphContent.f37595j);
        }
        if (shareOpenGraphContent.f37594i != null) {
            JSONArray optJSONArray = a.optJSONArray(C38347c.f99557l);
            if (optJSONArray == null) {
                set = new HashSet();
            } else {
                set = C13967z.m41256b(optJSONArray);
            }
            for (String add : shareOpenGraphContent.f37594i) {
                set.add(add);
            }
            a.put(C38347c.f99557l, new JSONArray(set));
        }
        return a;
    }

    /* renamed from: a */
    public static JSONObject m42032a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return C14532k.m41960a(shareOpenGraphContent.f37639a, (C14533a) new C14533a() {
            /* renamed from: a */
            public final JSONObject mo36699a(SharePhoto sharePhoto) {
                Uri uri = sharePhoto.f37644b;
                if (C13967z.m41259b(uri)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", uri.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new FacebookException("Unable to attach images", (Throwable) e);
                    }
                } else {
                    throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
                }
            }
        });
    }

    /* renamed from: a */
    private static JSONArray m42031a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m42031a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m42034a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m42034a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m42034a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m42031a((JSONArray) obj, true);
                }
                Pair a = m42018a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    /* renamed from: a */
    static void m42037a(C13498g<C14479a> gVar, String str) {
        m42038a("succeeded", (String) null);
        if (gVar != null) {
            gVar.mo29947a(new C14479a(str));
        }
    }

    /* renamed from: a */
    static void m42036a(C13498g<C14479a> gVar, FacebookException facebookException) {
        m42038a("error", facebookException.getMessage());
        if (gVar != null) {
            gVar.mo29946a(facebookException);
        }
    }

    /* renamed from: a */
    private static void m42038a(String str, String str2) {
        C13187j jVar = new C13187j(C13499h.m39721g());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        jVar.mo32371b("fb_share_dialog_result", bundle);
    }

    /* renamed from: a */
    public static ObjectType m42025a(ObjectType objectType, ObjectType objectType2) {
        if (objectType == objectType2) {
            return objectType;
        }
        if (objectType == ObjectType.UNKNOWN) {
            return objectType2;
        }
        if (objectType2 == ObjectType.UNKNOWN) {
            return objectType;
        }
        return null;
    }

    /* renamed from: a */
    public static String m42026a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        int lastIndexOf = uri2.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return uri2.substring(lastIndexOf);
    }

    /* renamed from: a */
    public static C14534l m42024a(C13498g<C14479a> gVar) {
        return new C14534l(null, null) {
            /* renamed from: a */
            public final void mo36685a(C13861a aVar) {
                C14540n.m42042b(null);
            }

            /* renamed from: a */
            public final void mo36687a(C13861a aVar, FacebookException facebookException) {
                C14540n.m42036a(null, facebookException);
            }

            /* renamed from: a */
            public final void mo36686a(C13861a aVar, Bundle bundle) {
                if (bundle != null) {
                    String a = C14540n.m42027a(bundle);
                    if (a == null || "post".equalsIgnoreCase(a)) {
                        C14540n.m42037a(null, C14540n.m42041b(bundle));
                    } else if ("cancel".equalsIgnoreCase(a)) {
                        C14540n.m42042b(null);
                    } else {
                        C14540n.m42036a(null, new FacebookException("UnknownError"));
                    }
                }
            }
        };
    }

    /* renamed from: b */
    static void m42042b(C13498g<C14479a> gVar) {
        m42038a("cancelled", (String) null);
        if (gVar != null) {
            gVar.mo29948n_();
        }
    }

    /* renamed from: b */
    public static String m42041b(Bundle bundle) {
        if (bundle.containsKey("postId")) {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        }
        return bundle.getString("post_id");
    }

    /* renamed from: a */
    public static Pair<String, String> m42018a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static Bundle m42016a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (shareCameraEffectContent != null) {
            CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.f37592c;
            if (cameraEffectTextures != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                for (String str : cameraEffectTextures.mo36732a()) {
                    C13952a a = m42022a(uuid, cameraEffectTextures.mo36733b(str), cameraEffectTextures.mo36731a(str));
                    arrayList.add(a);
                    bundle.putString(str, a.f36915b);
                }
                C13950u.m41149a((Collection<C13952a>) arrayList);
                return bundle;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Bundle m42040b(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (shareStoryContent == null || shareStoryContent.f37653a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(shareStoryContent.f37653a);
        final ArrayList arrayList2 = new ArrayList();
        List a = C13967z.m41231a((List<T>) arrayList, (C13971b<T, K>) new C13971b<ShareMedia, Bundle>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Bundle mo33619a(ShareMedia shareMedia) {
                C13952a a = C14540n.m42023a(uuid, shareMedia);
                arrayList2.add(a);
                Bundle bundle = new Bundle();
                bundle.putString("type", shareMedia.mo36759b().name());
                bundle.putString("uri", a.f36915b);
                String a2 = C14540n.m42026a(a.f36918e);
                if (a2 != null) {
                    C13967z.m41237a(bundle, "extension", a2);
                }
                return bundle;
            }
        });
        C13950u.m41149a((Collection<C13952a>) arrayList2);
        return (Bundle) a.get(0);
    }

    /* renamed from: a */
    public static Bundle m42017a(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (shareStoryContent == null || shareStoryContent.f37654b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(shareStoryContent.f37654b);
        List a = C13967z.m41231a((List<T>) arrayList, (C13971b<T, K>) new C13971b<SharePhoto, C13952a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C13952a mo33619a(SharePhoto sharePhoto) {
                return C14540n.m42023a(uuid, (ShareMedia) sharePhoto);
            }
        });
        List a2 = C13967z.m41231a(a, (C13971b<T, K>) new C13971b<C13952a, Bundle>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo33619a(Object obj) {
                return m42048a((C13952a) obj);
            }

            /* renamed from: a */
            private static Bundle m42048a(C13952a aVar) {
                Bundle bundle = new Bundle();
                bundle.putString("uri", aVar.f36915b);
                String a = C14540n.m42026a(aVar.f36918e);
                if (a != null) {
                    C13967z.m41237a(bundle, "extension", a);
                }
                return bundle;
            }
        });
        C13950u.m41149a((Collection<C13952a>) a);
        return (Bundle) a2.get(0);
    }

    /* renamed from: a */
    public static C13952a m42023a(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap = null;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.f37643a;
            uri = sharePhoto.f37644b;
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).f37657a;
        } else {
            uri = null;
        }
        return m42022a(uuid, uri, bitmap);
    }

    /* renamed from: a */
    private static C13861a m42021a(int i, int i2, Intent intent) {
        UUID a = C13953v.m41166a(intent);
        if (a == null) {
            return null;
        }
        return C13861a.m40938a(a, i);
    }

    /* renamed from: a */
    private static C13952a m42022a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return C13950u.m41141a(uuid, bitmap);
        }
        if (uri != null) {
            return C13950u.m41142a(uuid, uri);
        }
        return null;
    }

    /* renamed from: a */
    public static GraphRequest m42019a(AccessToken accessToken, Uri uri, C13090b bVar) throws FileNotFoundException {
        if (C13967z.m41268d(uri)) {
            return m42020a(accessToken, new File(uri.getPath()), bVar);
        }
        if (C13967z.m41264c(uri)) {
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar);
            return graphRequest;
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }

    /* renamed from: a */
    private static GraphRequest m42020a(AccessToken accessToken, File file, C13090b bVar) throws FileNotFoundException {
        ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar);
        return graphRequest;
    }
}
