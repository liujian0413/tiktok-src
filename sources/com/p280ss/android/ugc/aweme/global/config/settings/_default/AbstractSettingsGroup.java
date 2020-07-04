package com.p280ss.android.ugc.aweme.global.config.settings._default;

import com.bytedance.ies.settings.C10938a;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings.Builder;
import com.squareup.wire.DefaultValueGroup;
import com.squareup.wire.Message;
import com.squareup.wire.WireDeserializeErrorListener;
import com.squareup.wire.WireTypeAdapterFactory;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings._default.AbstractSettingsGroup */
public abstract class AbstractSettingsGroup implements DefaultValueGroup<IESSettings, Builder> {
    protected WireTypeAdapterFactory mFactory;
    protected WireDeserializeErrorListener mListener;

    /* access modifiers changed from: protected */
    public abstract void addOptionalObjectDefaultValue();

    /* access modifiers changed from: protected */
    public <T extends Message> void registerDefaultValue(T t) {
        C10938a.m32097a().mo26426a((Message) t);
        this.mFactory.registerDefaultValue(t, this.mListener);
    }

    public void registerOptionalObjectDefaultValue(WireTypeAdapterFactory wireTypeAdapterFactory, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.mFactory = wireTypeAdapterFactory;
        this.mListener = wireDeserializeErrorListener;
        addOptionalObjectDefaultValue();
    }
}
