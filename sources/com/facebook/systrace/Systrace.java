package com.facebook.systrace;

import android.os.Build.VERSION;
import android.os.Trace;

public final class Systrace {

    public enum EventScope {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        
        private final char mCode;

        public final char getCode() {
            return this.mCode;
        }

        private EventScope(char c) {
            this.mCode = c;
        }
    }

    /* renamed from: a */
    public static void m42323a(long j) {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m42324a(long j, String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
