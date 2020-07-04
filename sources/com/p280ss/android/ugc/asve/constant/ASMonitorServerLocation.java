package com.p280ss.android.ugc.asve.constant;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.ASMonitorServerLocation */
public enum ASMonitorServerLocation {
    AS_SERVER_LOCATION_CHINA(0),
    AS_SERVER_LOCATION_OVERSEA(1),
    AS_SERVER_LOCATION_US(2),
    AS_SERVER_LOCATION_SEA(3);
    
    public static final C15404a Companion = null;
    private final int value;

    /* renamed from: com.ss.android.ugc.asve.constant.ASMonitorServerLocation$a */
    public static final class C15404a {
        private C15404a() {
        }

        public /* synthetic */ C15404a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ASMonitorServerLocation m45055a(int i) {
            switch (i) {
                case 0:
                    return ASMonitorServerLocation.AS_SERVER_LOCATION_CHINA;
                case 1:
                    return ASMonitorServerLocation.AS_SERVER_LOCATION_OVERSEA;
                case 2:
                    return ASMonitorServerLocation.AS_SERVER_LOCATION_US;
                case 3:
                    return ASMonitorServerLocation.AS_SERVER_LOCATION_SEA;
                default:
                    return ASMonitorServerLocation.AS_SERVER_LOCATION_CHINA;
            }
        }

        /* renamed from: a */
        public static int m45054a(ASMonitorServerLocation aSMonitorServerLocation) {
            C7573i.m23587b(aSMonitorServerLocation, "aSMonitorServerLocation");
            switch (C15413g.f39720a[aSMonitorServerLocation.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public static final ASMonitorServerLocation fromOrdinal(int i) {
        return C15404a.m45055a(i);
    }

    public static final int toIntValue(ASMonitorServerLocation aSMonitorServerLocation) {
        return C15404a.m45054a(aSMonitorServerLocation);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new C15404a(null);
    }

    private ASMonitorServerLocation(int i) {
        this.value = i;
    }
}
