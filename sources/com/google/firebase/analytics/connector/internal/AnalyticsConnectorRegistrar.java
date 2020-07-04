package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.C18272b;
import com.google.firebase.analytics.connector.C18266a;
import com.google.firebase.components.C18279a;
import com.google.firebase.components.C18284d;
import com.google.firebase.components.C18285e;
import com.google.firebase.p785a.C18265d;
import java.util.Collections;
import java.util.List;

public class AnalyticsConnectorRegistrar implements C18284d {
    public List<C18279a<?>> getComponents() {
        return Collections.singletonList(C18279a.m60266a(C18266a.class).mo47159a(C18285e.m60286a(C18272b.class)).mo47159a(C18285e.m60286a(Context.class)).mo47159a(C18285e.m60286a(C18265d.class)).mo47158a(C18270a.f49654a).mo47160b().mo47161c());
    }
}
