package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.measurement.internal.C16825ay;
import com.google.android.gms.measurement.internal.C16853bz;
import com.google.android.gms.measurement.internal.C16869co;
import com.google.android.gms.measurement.internal.C16948m;
import java.util.List;
import java.util.Map;

public class AppMeasurement {

    /* renamed from: a */
    private final C16825ay f46891a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C15267r.m44384a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = C16869co.m55654a(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C16798a extends C16853bz {
    }

    public static AppMeasurement getInstance(Context context) {
        return C16825ay.m55497a(context, (C16948m) null).f47011g;
    }

    /* renamed from: a */
    public final void mo43502a(String str, Bundle bundle) {
        this.f46891a.mo43661e().mo43732a("app", str, bundle, true);
    }

    /* renamed from: a */
    public final void mo43504a(boolean z) {
        this.f46891a.mo43661e().mo43736a(z);
    }

    public AppMeasurement(C16825ay ayVar) {
        C15267r.m44384a(ayVar);
        this.f46891a = ayVar;
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f46891a.mo43661e().mo43731a(str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo43503a(String str, String str2, Object obj) {
        C15267r.m44386a(str);
        this.f46891a.mo43661e().mo43734a(str, str2, obj, true);
    }

    public String getCurrentScreenName() {
        return this.f46891a.mo43661e().mo43743x();
    }

    public String getCurrentScreenClass() {
        return this.f46891a.mo43661e().mo43744y();
    }

    public String getAppInstanceId() {
        return this.f46891a.mo43661e().mo43741v();
    }

    public String getGmpAppId() {
        return this.f46891a.mo43661e().mo43745z();
    }

    public long generateEventId() {
        return this.f46891a.mo43662f().mo43912f();
    }

    public void beginAdUnitExposure(String str) {
        this.f46891a.mo43670r().mo43568a(str, this.f46891a.mo43580l().mo38685b());
    }

    public void endAdUnitExposure(String str) {
        this.f46891a.mo43670r().mo43570b(str, this.f46891a.mo43580l().mo38685b());
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.f46891a.mo43661e().mo43728a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.f46891a.mo43661e().mo43737b(conditionalUserProperty);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f46891a.mo43661e().mo43739c(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.f46891a.mo43661e().mo43735a(str, str2, str3, bundle);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f46891a.mo43661e().mo43727a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.f46891a.mo43661e().mo43726a(str, str2, str3, z);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.f46891a.mo43661e().mo43724a(str, str2);
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.f46891a.mo43661e().mo43725a(str, str2, str3);
    }

    public int getMaxUserProperties(String str) {
        this.f46891a.mo43661e();
        C15267r.m44386a(str);
        return 25;
    }
}
