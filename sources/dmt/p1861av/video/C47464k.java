package dmt.p1861av.video;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dmt.av.video.k */
public final class C47464k {

    /* renamed from: dmt.av.video.k$a */
    public static final class C47465a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((C47461i) t).f121863a), Integer.valueOf(((C47461i) t2).f121863a));
        }
    }

    /* renamed from: a */
    private static final List<C47461i> m148177a(String str) {
        List<C47461i> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt("max_speed");
                    JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                    if (optJSONObject != null) {
                        String jSONObject2 = optJSONObject.toString();
                        C7573i.m23582a((Object) jSONObject2, "settings.toString()");
                        arrayList.add(new C47461i(optInt, jSONObject2));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final String m148176a(UploadSpeedInfo uploadSpeedInfo) {
        boolean z;
        C7573i.m23587b(uploadSpeedInfo, "uploadSpeedInfo");
        String e = C35563c.f93231M.mo93309e(Property.VESynthesisSettingsByUploadSpeed);
        long speed = uploadSpeedInfo.getSpeed();
        if (speed > 0 && !TextUtils.isEmpty(e)) {
            C7573i.m23582a((Object) e, "synthesisSettingsByUploadSpeed");
            Iterable a = m148177a(e);
            Collection arrayList = new ArrayList();
            for (Object next : a) {
                if (((long) ((C47461i) next).f121863a) > speed) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            C47461i iVar = (C47461i) C7525m.m23513g(C7525m.m23494a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) new C47465a<Object>()));
            if (iVar != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(iVar.f121863a);
                return iVar.f121864b;
            }
        }
        String e2 = C35563c.f93231M.mo93309e(Property.VESynthesisSettings);
        C7573i.m23582a((Object) e2, "AVEnv.AB.getStringProper…erty.VESynthesisSettings)");
        return e2;
    }

    /* renamed from: a */
    public static final void m148178a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "source");
        if (videoPublishEditModel.compileProbeResult != null) {
            CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
            if (compileProbeResult == null) {
                C7573i.m23580a();
            }
            if (compileProbeResult.getStatus().getState() == State.SUCCESS) {
                return;
            }
        }
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
        C7573i.m23582a((Object) uploadSpeedInfo, "source.uploadSpeedInfo");
        m148176a(uploadSpeedInfo);
    }
}
