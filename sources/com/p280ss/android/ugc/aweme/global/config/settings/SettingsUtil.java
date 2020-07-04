package com.p280ss.android.ugc.aweme.global.config.settings;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.alibaba.fastjson.JSON;
import com.aweme.storage.C1921e;
import com.bytedance.ies.C10287a;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6717s;
import com.google.gson.JsonParseException;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.JsonStubWillConvertToString.Builder;
import com.squareup.wire.DefaultValueBuilder;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil */
public final class SettingsUtil {

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$JsonObjectDeserializer */
    static final class JsonObjectDeserializer implements C6708j<JsonStubWillConvertToString> {
        JsonObjectDeserializer() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            return m98828b(kVar, type, iVar);
        }

        /* renamed from: b */
        private static JsonStubWillConvertToString m98828b(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            try {
                return new Builder().jsonobj_convert_string(kVar.toString()).build();
            } catch (Exception e) {
                SettingsUtil.m98824a((Throwable) e);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$a */
    static class C30190a {
        C30190a() {
        }

        /* renamed from: a */
        static final /* synthetic */ IESSettings m98831a(IESSettings iESSettings) {
            return iESSettings;
        }

        /* renamed from: a */
        static IESSettings m98832a(List<AbstractSettingsGroup> list) {
            DefaultValueBuilder defaultValueBuilder = new DefaultValueBuilder(new IESSettings.Builder());
            for (AbstractSettingsGroup addDefaultSettingGroup : list) {
                defaultValueBuilder.addDefaultSettingGroup(addDefaultSettingGroup);
            }
            return (IESSettings) defaultValueBuilder.build();
        }

        /* renamed from: a */
        static IESSettings m98830a(Context context, IESSettings iESSettings) {
            C10287a aVar = new C10287a(context, IESSettings.ADAPTER, new C30205m(iESSettings), null, false);
            return (IESSettings) aVar.mo25008a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$b */
    public static final class C30191b {

        /* renamed from: a */
        public C6600e f79444a;

        /* renamed from: a */
        private void m98833a(WireTypeAdapterFactory wireTypeAdapterFactory) {
            this.f79444a = JSON.createAdapterGsonBuilder().mo15985a((C6717s) wireTypeAdapterFactory).mo15986a(JsonStubWillConvertToString.class, new JsonObjectDeserializer()).mo15992f();
        }

        C30191b(IESSettings iESSettings, List<AbstractSettingsGroup> list) {
            WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
            WireDeserializeErrorListener wireDeserializeErrorListener = SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0.$instance;
            wireTypeAdapterFactory.registerDefaultValue(iESSettings, wireDeserializeErrorListener);
            for (AbstractSettingsGroup registerOptionalObjectDefaultValue : list) {
                registerOptionalObjectDefaultValue.registerOptionalObjectDefaultValue(wireTypeAdapterFactory, wireDeserializeErrorListener);
            }
            m98833a(wireTypeAdapterFactory);
        }

        /* renamed from: a */
        static final /* synthetic */ void m98834a(Class cls, String str, Throwable th) {
            StringBuilder sb = new StringBuilder("errorFiled:");
            sb.append(str);
            sb.append(" e.message:");
            sb.append(th.getMessage());
            SettingsUtil.m98822a(sb.toString());
            SettingsUtil.m98823a(cls.getCanonicalName(), str, th, "", 1);
        }
    }

    /* renamed from: a */
    public static void m98822a(String str) {
        if (!TextUtils.isEmpty(str)) {
        }
    }

    /* renamed from: a */
    public static void m98824a(Throwable th) {
        if (th != null && th.getMessage() != null) {
        }
    }

    /* renamed from: b */
    private static String m98827b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C6497a.m20180a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m98820a(String str, Throwable th, String str2) throws Exception {
        String b = C1921e.m8894b(str);
        if (b == null) {
            b = "";
        }
        if (th != null) {
            m98823a(str2, str2, th, b, 1);
        } else {
            m98823a(str2, str2, null, b, 0);
        }
        return null;
    }

    /* renamed from: a */
    public static void m98826a(Throwable th, String str, String str2) {
        C1592h.m7853a((Callable<TResult>) new C30204l<TResult>(str2, th, str));
    }

    /* renamed from: a */
    static final /* synthetic */ String m98821a(String str, Throwable th, String str2, IESSettings iESSettings) throws Exception {
        String b = C1921e.m8894b(str);
        if (b == null) {
            b = "";
        }
        if (th != null) {
            m98823a(str2, str2, th, b, 1);
        }
        if (iESSettings != null) {
            m98823a(str2, str2, null, b, 0);
        }
        return null;
    }

    /* renamed from: a */
    static void m98825a(Throwable th, IESSettings iESSettings, String str, String str2) {
        C1592h.m7853a((Callable<TResult>) new C30203k<TResult>(str2, th, str, iESSettings));
    }

    /* renamed from: a */
    public static void m98823a(String str, String str2, Throwable th, String str3, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("classDesc", str);
            jSONObject.put("errorField", str2);
            jSONObject.put("errorDesc", m98827b(th));
            jSONObject.put("jsonDesc", str3);
            jSONObject.put("status", i);
            C6893q.m21447a("aweme_settings_error_log", jSONObject);
        } catch (Exception unused) {
            m98824a(th);
        }
    }
}
