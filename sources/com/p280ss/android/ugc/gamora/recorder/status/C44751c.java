package com.p280ss.android.ugc.gamora.recorder.status;

import android.graphics.Color;
import android.graphics.Point;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.p482io.C9734a;
import com.google.gson.C6600e;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.ttve.model.MVResourceBean;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39559ak;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42018a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.recorder.status.c */
public final class C44751c {

    /* renamed from: a */
    public static final C44751c f115162a = new C44751c();

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.c$a */
    static final class C44752a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C27311c f115163a;

        C44752a(C27311c cVar) {
            this.f115163a = cVar;
        }

        public final /* synthetic */ Object call() {
            m141251a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141251a() {
            C9734a.m28683a(this.f115163a.mo70176R().getVideoCoverImgPath());
            C9734a.m28683a(this.f115163a.mo70176R().getEffectPath());
            C9734a.m28683a(this.f115163a.mo70176R().getBgPath());
            C9734a.m28683a(this.f115163a.mo70176R().getMusicPath());
        }
    }

    private C44751c() {
    }

    /* renamed from: a */
    public static void m141250a(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        if (cVar.mo70175Q() != null) {
            C1592h.m7853a((Callable<TResult>) new C44752a<TResult>(cVar));
        }
    }

    /* renamed from: a */
    public static String m141247a(String str) {
        C7573i.m23587b(str, "path");
        File file = new File(str);
        if (file.exists()) {
            String[] list = file.list();
            C7573i.m23582a((Object) list, "file.list()");
            if (C7519g.m23440b((T[]) list, "bgimg.json")) {
                String a = C42018a.m133564a(new File(str, "bgimg.json"));
                C7573i.m23582a((Object) a, "BaseFileUtils.readFileFo…ng(File(path, JSON_NAME))");
                return new File(str, new JSONObject(C7634n.m23762b(a).toString()).optString("path", "")).getPath();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<Integer> m141249a(InfoStickerModel infoStickerModel, C15389d dVar) {
        String sb;
        C7573i.m23587b(dVar, "mVEEditor");
        List<Integer> arrayList = new ArrayList<>();
        if (infoStickerModel == null || C6311g.m19573a(infoStickerModel.stickers)) {
            return arrayList;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel == null) {
                if (C7163a.m22363a()) {
                    StringBuilder sb2 = new StringBuilder("VeSdk add infoSticker failed ");
                    sb2.append(infoStickerModel);
                    throw new IllegalStateException(sb2.toString());
                }
            } else if (!stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                if (C7276d.m22812b(stickerItemModel.path)) {
                    sb = stickerItemModel.path;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(infoStickerModel.infoStickerDraftDir);
                    sb3.append(File.separator);
                    sb3.append(new File(stickerItemModel.path).getName());
                    sb = sb3.toString();
                }
                String str = sb;
                if (!C7276d.m22812b(str)) {
                    if (!C7163a.m22363a()) {
                        StringBuilder sb4 = new StringBuilder("infoSticker not exist ");
                        sb4.append(stickerItemModel);
                        C6921a.m21559a((Throwable) new Exception(sb4.toString()));
                    } else {
                        StringBuilder sb5 = new StringBuilder("infoSticker not exist ");
                        sb5.append(infoStickerModel);
                        throw new IllegalStateException(sb5.toString());
                    }
                } else if (stickerItemModel.isImageStickerLayer) {
                    C7573i.m23582a((Object) str, "path");
                    int b = dVar.mo38818b(str, 0.0f, 0.0f, 1.0f, 1.7777778f);
                    StringBuilder sb6 = new StringBuilder("changeInfoSticker id = ");
                    sb6.append(b);
                    C41530am.m132285d(sb6.toString());
                    if (b != -1) {
                        dVar.mo38749a(b, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                        dVar.mo38810b(b, stickerItemModel.scale);
                        dVar.mo38748a(b, -stickerItemModel.rotateAngle);
                        dVar.mo38813b(b, stickerItemModel.startTime, stickerItemModel.endTime);
                        dVar.mo38838e(b, stickerItemModel.layerWeight);
                        arrayList.add(Integer.valueOf(b));
                    } else if (C7163a.m22363a()) {
                        StringBuilder sb7 = new StringBuilder("VeSdk add infoSticker failed ");
                        sb7.append(infoStickerModel);
                        throw new IllegalStateException(sb7.toString());
                    }
                } else {
                    continue;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<StickerItemModel> m141248a(int i, int i2, MVInfoBean mVInfoBean) {
        int i3;
        MVInfoBean mVInfoBean2 = mVInfoBean;
        C7573i.m23587b(mVInfoBean2, "mvInfo");
        List<StickerItemModel> arrayList = new ArrayList<>();
        ArrayList<MVResourceBean> arrayList2 = mVInfoBean2.resources;
        C7573i.m23582a((Object) arrayList2, "mvInfo.resources");
        int i4 = 0;
        boolean z = true;
        for (Object next : arrayList2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C7525m.m23465b();
            }
            MVResourceBean mVResourceBean = (MVResourceBean) next;
            if (C7573i.m23585a((Object) mVResourceBean.type, (Object) "text")) {
                String str = mVResourceBean.content;
                C7573i.m23582a((Object) str, C38347c.f99553h);
                String substring = str.substring(C7634n.m23726a((CharSequence) str, '{', 0, false, 6, (Object) null), str.length());
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                JSONObject jSONObject = new JSONObject(substring);
                StickerItemModel stickerItemModel = new StickerItemModel(null, null, null, C39559ak.m126369c(), false, 0, 0);
                int i6 = 2;
                stickerItemModel.type = 2;
                TextStickerData textStickerData = new TextStickerData("测试文字", 1, -1, 2, "test");
                JSONArray optJSONArray = jSONObject.optJSONArray("text_str_ary");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        String string = optJSONArray.getString(i7);
                        if (!TextUtils.isEmpty(string)) {
                            C7573i.m23582a((Object) string, "str");
                            if (!C7634n.m23723c(string, "\n", false)) {
                                if (i7 < optJSONArray.length() - 1) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append("\n");
                                    string = sb.toString();
                                }
                            }
                            arrayList3.add(string);
                        }
                    }
                }
                String[] strArr = new String[arrayList3.size()];
                arrayList3.toArray(strArr);
                textStickerData.mTextStrAry = strArr;
                textStickerData.fontSize = jSONObject.optInt("font_size", 28);
                textStickerData.scale = 1.0f;
                textStickerData.rotation = (float) jSONObject.optDouble("r");
                textStickerData.mBgMode = jSONObject.optInt("bg_mode");
                String optString = jSONObject.optString("color", "#ffffff");
                C7573i.m23582a((Object) optString, "jsonObject.optString(\"color\", \"#ffffff\")");
                String a = C7634n.m23711a(optString, "0x", "#", false);
                if (C7634n.m23776c((CharSequence) a, (CharSequence) "#", false)) {
                    i3 = Color.parseColor(a);
                } else {
                    i3 = -1;
                }
                textStickerData.mColor = i3;
                int optInt = jSONObject.optInt("align");
                if (optInt != 0) {
                    if (optInt != 2) {
                        i6 = optInt;
                    } else {
                        i6 = 3;
                    }
                }
                textStickerData.mAlign = i6;
                textStickerData.f109252x = ((float) i) * ((float) jSONObject.optDouble("x"));
                textStickerData.f109253y = ((float) i2) * ((float) jSONObject.optDouble("y"));
                textStickerData.mEditCenterPoint = new Point((int) textStickerData.f109252x, (int) textStickerData.f109253y);
                textStickerData.mStartTime = jSONObject.optInt("mStartTime");
                textStickerData.mEndTime = jSONObject.optInt("mEndTime");
                textStickerData.autoSelect = z;
                if (z) {
                    z = false;
                }
                String optString2 = jSONObject.optString("font_file_name", "default");
                C7573i.m23582a((Object) optString2, "jsonObject.optString(\"font_file_name\", \"default\")");
                textStickerData.mFontType = C7634n.m23711a(optString2, "0x", "#", false);
                C42039d a2 = C42039d.m133620a();
                C7573i.m23582a((Object) a2, "TextFontStyleManager.getInstance()");
                a2.mo103228b();
                if (!C42039d.m133620a().mo103226a(textStickerData.mFontType)) {
                    textStickerData.mFontType = "default";
                }
                stickerItemModel.extra = new C6600e().mo15979b((Object) textStickerData);
                arrayList.add(stickerItemModel);
            } else {
                int i8 = i;
                int i9 = i2;
            }
            i4 = i5;
        }
        return arrayList;
    }
}
