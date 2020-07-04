package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40233e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ej */
public final class C39799ej {
    /* renamed from: a */
    public static boolean m127420a(int i) {
        return i == 2;
    }

    /* renamed from: b */
    public static int m127421b(int i) {
        return i == 2 ? 1 : -1;
    }

    /* renamed from: c */
    private static boolean m127423c(int i) {
        return i != 0;
    }

    /* renamed from: a */
    public static AVUploadSaveModel m127418a(AVUploadSaveModel aVUploadSaveModel, int i) {
        return m127419a(aVUploadSaveModel, i, false, null);
    }

    /* renamed from: b */
    private static AVUploadSaveModel m127422b(AVUploadSaveModel aVUploadSaveModel, int i) {
        aVUploadSaveModel.setWaterMark(!C35563c.f93230L.mo93342a(Property.ForbidLifeStoryLocalWatermark));
        aVUploadSaveModel.setSaveLocal(true);
        aVUploadSaveModel.setSaveType(i);
        return aVUploadSaveModel;
    }

    /* renamed from: a */
    public static AVUploadSaveModel m127419a(AVUploadSaveModel aVUploadSaveModel, int i, boolean z, C40233e eVar) {
        if (!C36964i.m118940p()) {
            return null;
        }
        if (aVUploadSaveModel == null) {
            aVUploadSaveModel = new AVUploadSaveModel();
        }
        if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
            aVUploadSaveModel.setLocalTempPath(C39811er.m127464b());
        }
        if (i == 4) {
            return m127422b(aVUploadSaveModel, i);
        }
        boolean z2 = true;
        aVUploadSaveModel.setWaterMark(!C35563c.f93230L.mo93342a(Property.ForbidLocalWatermark));
        if (z) {
            if (C6399b.m19945u()) {
                z2 = ((Boolean) C35563c.f93252o.mo83227c().mo83238a()).booleanValue();
            } else if (!m127423c(i) && (eVar == null || !eVar.mo100028a())) {
                z2 = false;
            }
            aVUploadSaveModel.setSaveLocal(z2);
            aVUploadSaveModel.setSaveType(i);
        } else if (C6399b.m19944t()) {
            aVUploadSaveModel.setSaveLocal(m127423c(i));
            aVUploadSaveModel.setSaveType(i);
        } else {
            aVUploadSaveModel.setSaveLocal(((Boolean) C35563c.f93252o.mo83227c().mo83238a()).booleanValue());
            aVUploadSaveModel.setSaveType(1);
        }
        return aVUploadSaveModel;
    }
}
