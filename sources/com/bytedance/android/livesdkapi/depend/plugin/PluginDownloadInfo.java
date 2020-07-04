package com.bytedance.android.livesdkapi.depend.plugin;

public final class PluginDownloadInfo {

    public enum ActivationType {
        Direct("direct"),
        SwitchToFullNet("data"),
        Entrance("entrance"),
        Retry("retry"),
        Pause("pause"),
        Resume("resume"),
        NetworkChangeRetry("network");
        
        private final String mType;

        public final String getType() {
            return this.mType;
        }

        private ActivationType(String str) {
            this.mType = str;
        }
    }

    public enum Status {
        SUCCESS(0),
        ALREADY_DOWNLOADED(0),
        FAILED(1),
        DELETED(2),
        CANCELED(3),
        PENDING(4),
        PAUSED_BY_APP(5),
        PAUSED_BY_NETWORK(5),
        PAUSED_BY_HIGH_PRIORITY(5),
        PAUSED_BY_OTHERS(5),
        CREATED(6),
        DOWNLOADING(7),
        FIRST_DOWNLOAD(8),
        VERIFY_FAILED(9),
        INSUFFICIENT_STORAGE_FAILED(10);
        
        private final int status;

        public final int getStatus() {
            return this.status;
        }

        public final boolean isCanceled() {
            if (this == CANCELED) {
                return true;
            }
            return false;
        }

        public final boolean isCreated() {
            if (this == CREATED) {
                return true;
            }
            return false;
        }

        public final boolean isDownloading() {
            if (this == DOWNLOADING) {
                return true;
            }
            return false;
        }

        public final boolean isInSufficientStorage() {
            if (this == INSUFFICIENT_STORAGE_FAILED) {
                return true;
            }
            return false;
        }

        public final boolean isPending() {
            if (this == PENDING) {
                return true;
            }
            return false;
        }

        public final boolean isSucceed() {
            if (this.status == 0) {
                return true;
            }
            return false;
        }

        public final boolean isPaused() {
            if (this.status == 5) {
                return true;
            }
            return false;
        }

        public final boolean isComplete() {
            if (this.status <= CANCELED.status || this == VERIFY_FAILED) {
                return true;
            }
            return false;
        }

        public final boolean isFailed() {
            if (this == FAILED || this == VERIFY_FAILED || this == INSUFFICIENT_STORAGE_FAILED) {
                return true;
            }
            return false;
        }

        private Status(int i) {
            this.status = i;
        }
    }
}
