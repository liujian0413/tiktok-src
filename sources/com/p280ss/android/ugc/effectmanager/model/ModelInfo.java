package com.p280ss.android.ugc.effectmanager.model;

/* renamed from: com.ss.android.ugc.effectmanager.model.ModelInfo */
public class ModelInfo {
    private ExtendedUrlModel file_url;
    private String name;
    private String version;

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.version.hashCode();
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelInfo modelInfo = (ModelInfo) obj;
        if (!this.name.equals(modelInfo.name)) {
            return false;
        }
        return this.version.equals(modelInfo.version);
    }
}
