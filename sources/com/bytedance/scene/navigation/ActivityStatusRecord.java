package com.bytedance.scene.navigation;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.Window;

class ActivityStatusRecord implements Parcelable {
    public static final Creator<ActivityStatusRecord> CREATOR = new Creator<ActivityStatusRecord>() {
        /* renamed from: a */
        private static ActivityStatusRecord[] m36730a(int i) {
            return new ActivityStatusRecord[i];
        }

        /* renamed from: a */
        private static ActivityStatusRecord m36729a(Parcel parcel) {
            return new ActivityStatusRecord(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m36729a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m36730a(i);
        }
    };

    /* renamed from: a */
    private int f33554a;

    /* renamed from: b */
    private int f33555b;

    /* renamed from: c */
    private int f33556c;

    /* renamed from: d */
    private int f33557d;

    /* renamed from: e */
    private int f33558e;

    /* renamed from: f */
    private int f33559f;

    private ActivityStatusRecord() {
    }

    public int describeContents() {
        return 0;
    }

    protected ActivityStatusRecord(Parcel parcel) {
        this.f33554a = parcel.readInt();
        this.f33555b = parcel.readInt();
        this.f33556c = parcel.readInt();
        this.f33557d = parcel.readInt();
        this.f33558e = parcel.readInt();
        this.f33559f = parcel.readInt();
    }

    /* renamed from: a */
    public static ActivityStatusRecord m36727a(Activity activity) {
        ActivityStatusRecord activityStatusRecord = new ActivityStatusRecord();
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        if (VERSION.SDK_INT >= 21) {
            activityStatusRecord.f33554a = window.getStatusBarColor();
            activityStatusRecord.f33555b = window.getNavigationBarColor();
        }
        activityStatusRecord.f33556c = decorView.getSystemUiVisibility();
        activityStatusRecord.f33557d = window.getAttributes().softInputMode;
        activityStatusRecord.f33558e = window.getAttributes().flags;
        activityStatusRecord.f33559f = activity.getRequestedOrientation();
        return activityStatusRecord;
    }

    /* renamed from: b */
    public final void mo31040b(Activity activity) {
        Window window = activity.getWindow();
        if (VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(this.f33554a);
            window.setNavigationBarColor(this.f33555b);
        }
        window.getDecorView().setSystemUiVisibility(this.f33556c);
        window.setSoftInputMode(this.f33557d);
        int i = window.getAttributes().flags;
        int i2 = this.f33558e;
        int i3 = (i & i2) ^ -1;
        window.addFlags(i2 & i3);
        window.clearFlags(i & i3);
        activity.setRequestedOrientation(this.f33559f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33554a);
        parcel.writeInt(this.f33555b);
        parcel.writeInt(this.f33556c);
        parcel.writeInt(this.f33557d);
        parcel.writeInt(this.f33558e);
        parcel.writeInt(this.f33559f);
    }
}
