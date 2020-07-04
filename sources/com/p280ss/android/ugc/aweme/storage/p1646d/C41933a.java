package com.p280ss.android.ugc.aweme.storage.p1646d;

import android.util.Log;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.storage.exception.IllegalPathException;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41938b;
import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.storage.d.a */
public final class C41933a implements C41938b {

    /* renamed from: a */
    public static final C41934a f109003a = new C41934a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.d.a$a */
    public static final class C41934a {
        private C41934a() {
        }

        public /* synthetic */ C41934a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo102962a() {
        boolean a = C35574k.m114859a().mo70091f().mo93342a(Property.StorageMonitorLocalSwitch);
        IESSettingsProxy a2 = C30199h.m98861a();
        C7573i.m23582a((Object) a2, "SettingsReader.get()");
        Boolean enableAvStorageMonitor = a2.getEnableAvStorageMonitor();
        if (a) {
            C7573i.m23582a((Object) enableAvStorageMonitor, "settingsSwitch");
            if (enableAvStorageMonitor.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo102961a(boolean z) {
        C35574k.m114859a().mo70091f().mo93341a(Property.StorageMonitorLocalSwitch, z);
    }

    /* renamed from: b */
    public final void mo102963b(File file) {
        if (file == null || mo102962a()) {
        }
    }

    /* renamed from: a */
    public final void mo102958a(File file) {
        if (file == null || !mo102962a()) {
            return;
        }
        if (!C41911c.f108992a.mo102947c()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileExist", file.exists());
            jSONObject.put("fileName", file.getName());
            jSONObject.put("filePath", file.getAbsolutePath());
            jSONObject.put("fileLength", file.length());
            C6893q.m21447a("av_storage_use_invalid_path", jSONObject);
            return;
        }
        throw new IllegalPathException(file);
    }

    /* renamed from: a */
    public final void mo102959a(String str, long j) {
        C7573i.m23587b(str, "key");
        if (mo102962a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C6893q.m21447a("av_storage_storage_size_count_time", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo102964b(String str, long j) {
        C7573i.m23587b(str, "key");
        if (mo102962a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j);
            C6893q.m21447a("av_storage_storage_clean_time", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo102960a(String str, Exception exc) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(exc, "error");
        if (mo102962a()) {
            if (!C41911c.f108992a.mo102947c()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("module", str);
                jSONObject.put("exception", Log.getStackTraceString(exc));
                C6893q.m21447a("av_storage_storage_clean_error", jSONObject);
                return;
            }
            throw exc;
        }
    }
}
