package com.p280ss.android.vesdk.runtime.cloudconfig;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.a */
public final class C45355a implements C45357c {
    /* renamed from: a */
    public final Map<String, String> mo108574a(JSONObject jSONObject) {
        try {
            if (jSONObject.getInt("code") != 0) {
                return null;
            }
            return m143358b(jSONObject.getJSONObject("data"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m143357a(C45361e eVar) {
        eVar.f116847a = 1;
        eVar.f116848b = 1;
        eVar.f116849c = 15;
        eVar.f116850d = 15000000;
        eVar.f116851e = 0;
        eVar.f116852f = 35;
        eVar.f116853g = 15;
        eVar.f116854h = 1;
        eVar.f116855i = 4194304;
        eVar.f116856j = 0;
        eVar.f116857k = 0;
        eVar.f116858l = 0;
        eVar.f116859m = 576;
        eVar.f116860n = PreloadTask.BYTE_UNIT_NUMBER;
        eVar.f116861o = 15;
        eVar.f116862p = 15000000;
        eVar.f116863q = 0;
        eVar.f116864r = 35;
        eVar.f116865s = 15;
        eVar.f116866t = 0;
        eVar.f116867u = 0;
        eVar.f116868v = 4194304;
        eVar.f116869w = 0;
        eVar.f116870x = 0;
        eVar.f116871y = 576;
        eVar.f116872z = 15;
        eVar.f116833A = 15000000;
        eVar.f116834B = 0;
        eVar.f116835C = 35;
        eVar.f116836D = 15;
        eVar.f116837E = 1;
        eVar.f116838F = 0;
        eVar.f116839G = 4194304;
        eVar.f116840H = 0;
        eVar.f116841I = 0;
        eVar.f116842J = 1;
        eVar.f116843K = 1;
        eVar.f116844L = 1;
    }

    /* renamed from: b */
    private static Map<String, String> m143358b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject.has("record_camera_type")) {
            int i = jSONObject.getInt("record_camera_type");
            if (i > 0) {
                hashMap.put("record_camera_type", String.valueOf(i));
            } else {
                hashMap.put("record_camera_type", "1");
            }
        } else {
            hashMap.put("record_camera_type", "1");
        }
        if (jSONObject.has("record_camera_compat_level")) {
            int i2 = jSONObject.getInt("record_camera_compat_level");
            if (i2 >= 0) {
                hashMap.put("record_camera_compat_level", String.valueOf(i2));
            } else {
                hashMap.put("record_camera_compat_level", "1");
            }
        } else {
            hashMap.put("record_camera_compat_level", "1");
        }
        if (jSONObject.has("record_video_sw_crf")) {
            int i3 = jSONObject.getInt("record_video_sw_crf");
            if (i3 <= 0 || i3 > 50) {
                hashMap.put("record_video_sw_crf", "15");
            } else {
                hashMap.put("record_video_sw_crf", String.valueOf(i3));
            }
        } else {
            hashMap.put("record_video_sw_crf", "15");
        }
        if (jSONObject.has("record_video_sw_maxrate")) {
            int i4 = jSONObject.getInt("record_video_sw_maxrate");
            if (i4 < 100000 || i4 > 100000000) {
                hashMap.put("record_video_sw_maxrate", "15000000");
            } else {
                hashMap.put("record_video_sw_maxrate", String.valueOf(i4));
            }
        } else {
            hashMap.put("record_video_sw_maxrate", "15000000");
        }
        if (jSONObject.has("record_video_sw_preset")) {
            int i5 = jSONObject.getInt("record_video_sw_preset");
            if (i5 < 0 || i5 > 9) {
                hashMap.put("record_video_sw_preset", "0");
            } else {
                hashMap.put("record_video_sw_preset", String.valueOf(i5));
            }
        } else {
            hashMap.put("record_video_sw_preset", "0");
        }
        if (jSONObject.has("record_video_sw_gop")) {
            int i6 = jSONObject.getInt("record_video_sw_gop");
            if (i6 > 0) {
                hashMap.put("record_video_sw_gop", String.valueOf(i6));
            } else {
                hashMap.put("record_video_sw_gop", "35");
            }
        } else {
            hashMap.put("record_video_sw_gop", "35");
        }
        if (jSONObject.has("record_video_sw_qp")) {
            int i7 = jSONObject.getInt("record_video_sw_qp");
            if (i7 <= 0 || i7 > 50) {
                hashMap.put("record_video_sw_qp", "15");
            } else {
                hashMap.put("record_video_sw_qp", String.valueOf(i7));
            }
        } else {
            hashMap.put("record_video_sw_qp", "15");
        }
        if (jSONObject.has("record_sw_bitrate_mode")) {
            int i8 = jSONObject.getInt("record_sw_bitrate_mode");
            if (i8 < 0 || i8 > 2) {
                hashMap.put("record_sw_bitrate_mode", "1");
            } else {
                hashMap.put("record_sw_bitrate_mode", String.valueOf(i8));
            }
        } else {
            hashMap.put("record_sw_bitrate_mode", "1");
        }
        if (jSONObject.has("record_video_hw_bitrate")) {
            int i9 = jSONObject.getInt("record_video_hw_bitrate");
            if (i9 > 0) {
                hashMap.put("record_video_hw_bitrate", String.valueOf(i9));
            } else {
                hashMap.put("record_video_hw_bitrate", "4194304");
            }
        } else {
            hashMap.put("record_video_hw_bitrate", "4194304");
        }
        if (jSONObject.has("record_encode_mode")) {
            int i10 = jSONObject.getInt("record_encode_mode");
            if (i10 == 0 || i10 == 1) {
                hashMap.put("record_encode_mode", String.valueOf(i10));
            } else {
                hashMap.put("record_encode_mode", "0");
            }
        } else {
            hashMap.put("record_encode_mode", "0");
        }
        if (jSONObject.has("record_hw_bitrate_mode")) {
            int i11 = jSONObject.getInt("record_hw_bitrate_mode");
            if (i11 >= 0) {
                hashMap.put("record_hw_bitrate_mode", String.valueOf(i11));
            } else {
                hashMap.put("record_hw_bitrate_mode", "0");
            }
        } else {
            hashMap.put("record_hw_bitrate_mode", "0");
        }
        if (jSONObject.has("record_hw_profile")) {
            int i12 = jSONObject.getInt("record_hw_profile");
            if (i12 >= 0) {
                hashMap.put("record_hw_profile", String.valueOf(i12));
            } else {
                hashMap.put("record_hw_profile", "0");
            }
        } else {
            hashMap.put("record_hw_profile", "0");
        }
        if (jSONObject.has("record_resolution_width")) {
            int i13 = jSONObject.getInt("record_resolution_width");
            if (i13 % 16 != 0 || i13 < 160 || i13 > 5120) {
                hashMap.put("record_resolution_width", "576");
            } else {
                hashMap.put("record_resolution_width", String.valueOf(i13));
            }
        } else {
            hashMap.put("record_resolution_width", "576");
        }
        if (jSONObject.has("record_resolution_height")) {
            int i14 = jSONObject.getInt("record_resolution_height");
            if (i14 % 16 != 0 || i14 < 160 || i14 > 5120) {
                hashMap.put("record_resolution_height", "1024");
            } else {
                hashMap.put("record_resolution_height", String.valueOf(i14));
            }
        } else {
            hashMap.put("record_resolution_height", "1024");
        }
        if (jSONObject.has("import_video_sw_crf")) {
            int i15 = jSONObject.getInt("import_video_sw_crf");
            if (i15 <= 0 || i15 > 50) {
                hashMap.put("import_video_sw_crf", "15");
            } else {
                hashMap.put("import_video_sw_crf", String.valueOf(i15));
            }
        } else {
            hashMap.put("import_video_sw_crf", "15");
        }
        if (jSONObject.has("import_video_sw_maxrate")) {
            int i16 = jSONObject.getInt("import_video_sw_maxrate");
            if (i16 < 100000 || i16 > 100000000) {
                hashMap.put("import_video_sw_maxrate", "15000000");
            } else {
                hashMap.put("import_video_sw_maxrate", String.valueOf(i16));
            }
        } else {
            hashMap.put("import_video_sw_maxrate", "15000000");
        }
        if (jSONObject.has("import_video_sw_preset")) {
            int i17 = jSONObject.getInt("import_video_sw_preset");
            if (i17 < 0 || i17 > 9) {
                hashMap.put("import_video_sw_preset", "0");
            } else {
                hashMap.put("import_video_sw_preset", String.valueOf(i17));
            }
        } else {
            hashMap.put("import_video_sw_preset", "0");
        }
        if (jSONObject.has("import_video_sw_gop")) {
            int i18 = jSONObject.getInt("import_video_sw_gop");
            if (i18 > 0) {
                hashMap.put("import_video_sw_gop", String.valueOf(i18));
            } else {
                hashMap.put("import_video_sw_gop", "35");
            }
        } else {
            hashMap.put("import_video_sw_gop", "35");
        }
        if (jSONObject.has("import_video_sw_qp")) {
            int i19 = jSONObject.getInt("import_video_sw_qp");
            if (i19 <= 0 || i19 > 50) {
                hashMap.put("import_video_sw_qp", "15");
            } else {
                hashMap.put("import_video_sw_qp", String.valueOf(i19));
            }
        } else {
            hashMap.put("import_video_sw_qp", "15");
        }
        if (jSONObject.has("import_sw_bitrate_mode")) {
            int i20 = jSONObject.getInt("import_sw_bitrate_mode");
            if (i20 < 0 || i20 > 2) {
                hashMap.put("import_sw_bitrate_mode", "0");
            } else {
                hashMap.put("import_sw_bitrate_mode", String.valueOf(i20));
            }
        } else {
            hashMap.put("import_sw_bitrate_mode", "0");
        }
        if (jSONObject.has("import_encode_mode")) {
            int i21 = jSONObject.getInt("import_encode_mode");
            if (i21 == 0 || i21 == 1) {
                hashMap.put("import_encode_mode", String.valueOf(i21));
            } else {
                hashMap.put("import_encode_mode", "0");
            }
        } else {
            hashMap.put("import_encode_mode", "0");
        }
        if (jSONObject.has("import_video_hw_bitrate")) {
            int i22 = jSONObject.getInt("import_video_hw_bitrate");
            if (i22 > 0) {
                hashMap.put("import_video_hw_bitrate", String.valueOf(i22));
            } else {
                hashMap.put("import_video_hw_bitrate", "4194304");
            }
        } else {
            hashMap.put("import_video_hw_bitrate", "4194304");
        }
        if (jSONObject.has("import_hw_bitrate_mode")) {
            int i23 = jSONObject.getInt("import_hw_bitrate_mode");
            if (i23 >= 0) {
                hashMap.put("import_hw_bitrate_mode", String.valueOf(i23));
            } else {
                hashMap.put("import_hw_bitrate_mode", "0");
            }
        } else {
            hashMap.put("import_hw_bitrate_mode", "0");
        }
        if (jSONObject.has("import_hw_profile")) {
            int i24 = jSONObject.getInt("import_hw_profile");
            if (i24 >= 0) {
                hashMap.put("import_hw_profile", String.valueOf(i24));
            } else {
                hashMap.put("import_hw_profile", "0");
            }
        } else {
            hashMap.put("import_hw_profile", "0");
        }
        if (jSONObject.has("import_shorter_pixels")) {
            int i25 = jSONObject.getInt("import_shorter_pixels");
            if (i25 % 16 != 0 || i25 < 160 || i25 > 5120) {
                hashMap.put("import_shorter_pixels", "576");
            } else {
                hashMap.put("import_shorter_pixels", String.valueOf(i25));
            }
        } else {
            hashMap.put("import_shorter_pixels", "576");
        }
        if (jSONObject.has("synthetic_video_sw_crf")) {
            int i26 = jSONObject.getInt("synthetic_video_sw_crf");
            if (i26 <= 0 || i26 > 50) {
                hashMap.put("synthetic_video_sw_crf", "15");
            } else {
                hashMap.put("synthetic_video_sw_crf", String.valueOf(i26));
            }
        } else {
            hashMap.put("synthetic_video_sw_crf", "15");
        }
        if (jSONObject.has("synthetic_video_sw_maxrate")) {
            int i27 = jSONObject.getInt("synthetic_video_sw_maxrate");
            if (i27 < 100000 || i27 > 100000000) {
                hashMap.put("synthetic_video_sw_maxrate", "15000000");
            } else {
                hashMap.put("synthetic_video_sw_maxrate", String.valueOf(i27));
            }
        } else {
            hashMap.put("synthetic_video_sw_maxrate", "15000000");
        }
        if (jSONObject.has("synthetic_video_sw_preset")) {
            int i28 = jSONObject.getInt("synthetic_video_sw_preset");
            if (i28 < 0 || i28 > 9) {
                hashMap.put("synthetic_video_sw_preset", "0");
            } else {
                hashMap.put("synthetic_video_sw_preset", String.valueOf(i28));
            }
        } else {
            hashMap.put("synthetic_video_sw_preset", "0");
        }
        if (jSONObject.has("synthetic_video_sw_gop")) {
            int i29 = jSONObject.getInt("synthetic_video_sw_gop");
            if (i29 > 0) {
                hashMap.put("synthetic_video_sw_gop", String.valueOf(i29));
            } else {
                hashMap.put("synthetic_video_sw_gop", "35");
            }
        } else {
            hashMap.put("synthetic_video_sw_gop", "35");
        }
        if (jSONObject.has("synthetic_video_sw_qp")) {
            int i30 = jSONObject.getInt("synthetic_video_sw_qp");
            if (i30 <= 0 || i30 > 50) {
                hashMap.put("synthetic_video_sw_qp", "15");
            } else {
                hashMap.put("synthetic_video_sw_qp", String.valueOf(i30));
            }
        } else {
            hashMap.put("synthetic_video_sw_qp", "15");
        }
        if (jSONObject.has("synthetic_sw_bitrate_mode")) {
            int i31 = jSONObject.getInt("synthetic_sw_bitrate_mode");
            if (i31 < 0 || i31 > 2) {
                hashMap.put("synthetic_sw_bitrate_mode", "1");
            } else {
                hashMap.put("synthetic_sw_bitrate_mode", String.valueOf(i31));
            }
        } else {
            hashMap.put("synthetic_sw_bitrate_mode", "1");
        }
        if (jSONObject.has("synthetic_encode_mode")) {
            int i32 = jSONObject.getInt("synthetic_encode_mode");
            if (i32 == 0 || i32 == 1) {
                hashMap.put("synthetic_encode_mode", String.valueOf(i32));
            } else {
                hashMap.put("synthetic_encode_mode", "0");
            }
        } else {
            hashMap.put("synthetic_encode_mode", "0");
        }
        if (jSONObject.has("synthetic_video_hw_bitrate")) {
            int i33 = jSONObject.getInt("synthetic_video_hw_bitrate");
            if (i33 >= 0) {
                hashMap.put("synthetic_video_hw_bitrate", String.valueOf(i33));
            } else {
                hashMap.put("synthetic_video_hw_bitrate", "4194304");
            }
        } else {
            hashMap.put("synthetic_video_hw_bitrate", "4194304");
        }
        if (jSONObject.has("synthetic_hw_bitrate_mode")) {
            int i34 = jSONObject.getInt("synthetic_hw_bitrate_mode");
            if (i34 >= 0) {
                hashMap.put("synthetic_hw_bitrate_mode", String.valueOf(i34));
            } else {
                hashMap.put("synthetic_hw_bitrate_mode", "0");
            }
        } else {
            hashMap.put("synthetic_hw_bitrate_mode", "0");
        }
        if (jSONObject.has("synthetic_hw_profile")) {
            int i35 = jSONObject.getInt("synthetic_hw_profile");
            if (i35 >= 0) {
                hashMap.put("synthetic_hw_profile", String.valueOf(i35));
            } else {
                hashMap.put("synthetic_hw_profile", "0");
            }
        } else {
            hashMap.put("synthetic_hw_profile", "0");
        }
        if (jSONObject.has("earphone_echo_normal")) {
            int i36 = jSONObject.getInt("earphone_echo_normal");
            if (i36 == 0 || i36 == 1) {
                hashMap.put("earphone_echo_normal", String.valueOf(i36));
            } else {
                hashMap.put("earphone_echo_normal", "1");
            }
        } else {
            hashMap.put("earphone_echo_normal", "1");
        }
        if (jSONObject.has("earphone_echo_aaudio")) {
            int i37 = jSONObject.getInt("earphone_echo_aaudio");
            if (i37 == 0 || i37 == 1) {
                hashMap.put("earphone_echo_aaudio", String.valueOf(i37));
            } else {
                hashMap.put("earphone_echo_aaudio", "1");
            }
        } else {
            hashMap.put("earphone_echo_aaudio", "1");
        }
        if (jSONObject.has("earphone_echo_huawei")) {
            int i38 = jSONObject.getInt("earphone_echo_huawei");
            if (i38 == 0 || i38 == 1) {
                hashMap.put("earphone_echo_huawei", String.valueOf(i38));
            } else {
                hashMap.put("earphone_echo_huawei", "1");
            }
        } else {
            hashMap.put("earphone_echo_huawei", "1");
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo108575a(Map<String, String> map, C45361e eVar) {
        m143357a(eVar);
        if (map.containsKey("record_camera_type")) {
            eVar.f116847a = Integer.parseInt((String) map.get("record_camera_type"));
        }
        if (map.containsKey("record_camera_compat_level")) {
            eVar.f116848b = Integer.parseInt((String) map.get("record_camera_compat_level"));
        }
        if (map.containsKey("record_video_sw_crf")) {
            eVar.f116849c = Integer.parseInt((String) map.get("record_video_sw_crf"));
        }
        if (map.containsKey("record_video_sw_maxrate")) {
            eVar.f116850d = Integer.parseInt((String) map.get("record_video_sw_maxrate"));
        }
        if (map.containsKey("record_video_sw_preset")) {
            eVar.f116851e = Integer.parseInt((String) map.get("record_video_sw_preset"));
        }
        if (map.containsKey("record_video_sw_gop")) {
            eVar.f116852f = Integer.parseInt((String) map.get("record_video_sw_gop"));
        }
        if (map.containsKey("record_video_sw_qp")) {
            eVar.f116853g = Integer.parseInt((String) map.get("record_video_sw_qp"));
        }
        if (map.containsKey("record_sw_bitrate_mode")) {
            eVar.f116854h = Integer.parseInt((String) map.get("record_sw_bitrate_mode"));
        }
        if (map.containsKey("record_video_hw_bitrate")) {
            eVar.f116855i = Integer.parseInt((String) map.get("record_video_hw_bitrate"));
        }
        if (map.containsKey("record_encode_mode")) {
            eVar.f116856j = Integer.parseInt((String) map.get("record_encode_mode"));
        }
        if (map.containsKey("record_hw_bitrate_mode")) {
            eVar.f116857k = Integer.parseInt((String) map.get("record_hw_bitrate_mode"));
        }
        if (map.containsKey("record_hw_profile")) {
            eVar.f116858l = Integer.parseInt((String) map.get("record_hw_profile"));
        }
        if (map.containsKey("record_resolution_width")) {
            eVar.f116859m = Integer.parseInt((String) map.get("record_resolution_width"));
        }
        if (map.containsKey("record_resolution_height")) {
            eVar.f116860n = Integer.parseInt((String) map.get("record_resolution_height"));
        }
        if (map.containsKey("import_video_sw_crf")) {
            eVar.f116861o = Integer.parseInt((String) map.get("import_video_sw_crf"));
        }
        if (map.containsKey("import_video_sw_maxrate")) {
            eVar.f116862p = Integer.parseInt((String) map.get("import_video_sw_maxrate"));
        }
        if (map.containsKey("import_video_sw_preset")) {
            eVar.f116863q = Integer.parseInt((String) map.get("import_video_sw_preset"));
        }
        if (map.containsKey("import_video_sw_gop")) {
            eVar.f116864r = Integer.parseInt((String) map.get("import_video_sw_gop"));
        }
        if (map.containsKey("import_video_sw_qp")) {
            eVar.f116865s = Integer.parseInt((String) map.get("import_video_sw_qp"));
        }
        if (map.containsKey("import_sw_bitrate_mode")) {
            eVar.f116866t = Integer.parseInt((String) map.get("import_sw_bitrate_mode"));
        }
        if (map.containsKey("import_encode_mode")) {
            eVar.f116867u = Integer.parseInt((String) map.get("import_encode_mode"));
        }
        if (map.containsKey("import_video_hw_bitrate")) {
            eVar.f116868v = Integer.parseInt((String) map.get("import_video_hw_bitrate"));
        }
        if (map.containsKey("import_hw_bitrate_mode")) {
            eVar.f116869w = Integer.parseInt((String) map.get("import_hw_bitrate_mode"));
        }
        if (map.containsKey("import_hw_profile")) {
            eVar.f116870x = Integer.parseInt((String) map.get("import_hw_profile"));
        }
        if (map.containsKey("import_shorter_pixels")) {
            eVar.f116871y = Integer.parseInt((String) map.get("import_shorter_pixels"));
        }
        if (map.containsKey("synthetic_video_sw_crf")) {
            eVar.f116872z = Integer.parseInt((String) map.get("synthetic_video_sw_crf"));
        }
        if (map.containsKey("synthetic_video_sw_maxrate")) {
            eVar.f116833A = Integer.parseInt((String) map.get("synthetic_video_sw_maxrate"));
        }
        if (map.containsKey("synthetic_video_sw_preset")) {
            eVar.f116834B = Integer.parseInt((String) map.get("synthetic_video_sw_preset"));
        }
        if (map.containsKey("synthetic_video_sw_gop")) {
            eVar.f116835C = Integer.parseInt((String) map.get("synthetic_video_sw_gop"));
        }
        if (map.containsKey("synthetic_video_sw_qp")) {
            eVar.f116836D = Integer.parseInt((String) map.get("synthetic_video_sw_qp"));
        }
        if (map.containsKey("synthetic_sw_bitrate_mode")) {
            eVar.f116837E = Integer.parseInt((String) map.get("synthetic_sw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_encode_mode")) {
            eVar.f116838F = Integer.parseInt((String) map.get("synthetic_encode_mode"));
        }
        if (map.containsKey("synthetic_video_hw_bitrate")) {
            eVar.f116839G = Integer.parseInt((String) map.get("synthetic_video_hw_bitrate"));
        }
        if (map.containsKey("synthetic_hw_bitrate_mode")) {
            eVar.f116840H = Integer.parseInt((String) map.get("synthetic_hw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_hw_profile")) {
            eVar.f116841I = Integer.parseInt((String) map.get("synthetic_hw_profile"));
        }
        if (map.containsKey("earphone_echo_normal")) {
            eVar.f116842J = Integer.parseInt((String) map.get("earphone_echo_normal"));
        }
        if (map.containsKey("earphone_echo_aaudio")) {
            eVar.f116843K = Integer.parseInt((String) map.get("earphone_echo_aaudio"));
        }
        if (map.containsKey("earphone_echo_huawei")) {
            eVar.f116844L = Integer.parseInt((String) map.get("earphone_echo_huawei"));
        }
    }
}
