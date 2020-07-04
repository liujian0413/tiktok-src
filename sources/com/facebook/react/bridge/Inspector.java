package com.facebook.react.bridge;

import com.facebook.common.p686c.C13286a;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Inspector {
    private final HybridData mHybridData;

    public static class LocalConnection {
        private final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Page{mId=");
            sb.append(this.mId);
            sb.append(", mTitle='");
            sb.append(this.mTitle);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }
    }

    public interface RemoteConnection {
        void onDisconnect();

        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    private static native Inspector instance();

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e) {
            C13286a.m38861c("ReactNative", "Inspector doesn't work in open source yet", (Throwable) e);
            return Collections.emptyList();
        }
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            return instance().connectNative(i, remoteConnection);
        } catch (UnsatisfiedLinkError e) {
            C13286a.m38861c("ReactNative", "Inspector doesn't work in open source yet", (Throwable) e);
            throw new RuntimeException(e);
        }
    }
}
