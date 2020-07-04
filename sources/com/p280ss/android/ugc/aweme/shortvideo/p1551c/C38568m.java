package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.m */
public final class C38568m {

    /* renamed from: a */
    public static final C38568m f100206a = new C38568m();

    private C38568m() {
    }

    /* renamed from: b */
    private static int m123259b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getWavFile() == null) {
            return 1;
        }
        if (videoPublishEditModel.mMusicOrigin == null) {
            return 0;
        }
        return 2;
    }

    /* renamed from: d */
    private static int m123261d(VideoPublishEditModel videoPublishEditModel) {
        int i = 2;
        switch (videoPublishEditModel.mOrigin) {
            case 0:
                return 1;
            case 1:
                if (videoPublishEditModel.videoEditorType == 2) {
                    return 3;
                }
                switch (videoPublishEditModel.videoType) {
                    case 6:
                        i = 4;
                        break;
                    case 7:
                    case 9:
                        break;
                    default:
                        if (TextUtils.isEmpty(videoPublishEditModel.mDuetFrom)) {
                            i = 0;
                            break;
                        } else {
                            return 5;
                        }
                }
            default:
                i = -1;
                break;
        }
        return i;
    }

    /* renamed from: a */
    public static String m123258a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        Map<String, Object> map = videoPublishEditModel.metadataMap;
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("uid", C35563c.f93260w.mo57091d());
        jSONObject.put("did", AppLog.getServerDeviceId());
        C35603z zVar = C35563c.f93245h;
        C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
        jSONObject.put("te_region", zVar.mo83209c());
        jSONObject.put("te_audio_type", m123259b(videoPublishEditModel));
        int d = m123261d(videoPublishEditModel);
        jSONObject.put("te_publish_type", d);
        jSONObject.put("te_face_beauty_type", videoPublishEditModel.beautyType);
        jSONObject.put("te_camera_type", videoPublishEditModel.cameraIds);
        jSONObject.put("te_filter_id", videoPublishEditModel.getFilterIds());
        jSONObject.put("te_filter_name", videoPublishEditModel.getFilterName());
        jSONObject.put("te_stricker_id", videoPublishEditModel.mStickerID);
        jSONObject.put("te_video_speed", videoPublishEditModel.getSpeed());
        if (d == 1) {
            jSONObject.put("te_is_fast_import", videoPublishEditModel.isFastImport);
        }
        String[] c = m123260c(videoPublishEditModel);
        if (c != null && c.length == 5) {
            jSONObject.put("te_import_path", c[0]);
            jSONObject.put("te_import_resolution", c[1]);
            jSONObject.put("te_import_file_encode_type", c[2]);
            jSONObject.put("te_import_file_duration", c[3]);
            jSONObject.put("te_import_file_trim_duration", c[4]);
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private static String[] m123260c(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        for (ImportVideoInfo importVideoInfo : arrayList) {
            sb.append(importVideoInfo.getImportPath());
            sb.append(",");
            sb2.append(importVideoInfo.getVideoWidth());
            sb2.append("*");
            sb2.append(importVideoInfo.getVideoHeight());
            sb2.append(",");
            sb3.append(VEUtils.getVideoEncodeTypeByID(importVideoInfo.getEncodeId()));
            sb3.append(",");
            sb4.append(importVideoInfo.getImportfileDuration());
            sb4.append(",");
            sb5.append(importVideoInfo.getDuration());
            sb5.append(",");
        }
        String[] strArr = new String[5];
        String sb6 = sb.toString();
        C7573i.m23582a((Object) sb6, "importPaths.toString()");
        int length = sb.length() - 1;
        if (sb6 != null) {
            String substring = sb6.substring(0, length);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            strArr[0] = substring;
            String sb7 = sb2.toString();
            C7573i.m23582a((Object) sb7, "importResolutions.toString()");
            int length2 = sb2.length() - 1;
            if (sb7 != null) {
                String substring2 = sb7.substring(0, length2);
                C7573i.m23582a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                strArr[1] = substring2;
                String sb8 = sb3.toString();
                C7573i.m23582a((Object) sb8, "importEncodeType.toString()");
                int length3 = sb3.length() - 1;
                if (sb8 != null) {
                    String substring3 = sb8.substring(0, length3);
                    C7573i.m23582a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    strArr[2] = substring3;
                    String sb9 = sb4.toString();
                    C7573i.m23582a((Object) sb9, "importOriginDurations.toString()");
                    int length4 = sb4.length() - 1;
                    if (sb9 != null) {
                        String substring4 = sb9.substring(0, length4);
                        C7573i.m23582a((Object) substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        strArr[3] = substring4;
                        String sb10 = sb5.toString();
                        C7573i.m23582a((Object) sb10, "importTrimDurations.toString()");
                        int length5 = sb5.length() - 1;
                        if (sb10 != null) {
                            String substring5 = sb10.substring(0, length5);
                            C7573i.m23582a((Object) substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            strArr[4] = substring5;
                            return strArr;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
