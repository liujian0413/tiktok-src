package com.bytedance.jirafast.models;

import java.io.Serializable;

public class JIRAVersion implements Serializable {
    private boolean archived;

    /* renamed from: id */
    private String f31928id;
    private String name;
    private long projectId;
    private boolean released;

    public String getId() {
        return this.f31928id;
    }

    public String getName() {
        return this.name;
    }

    public long getProjectId() {
        return this.projectId;
    }

    public boolean isArchived() {
        return this.archived;
    }

    public boolean isReleased() {
        return this.released;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void setArchived(boolean z) {
        this.archived = z;
    }

    public void setId(String str) {
        this.f31928id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProjectId(long j) {
        this.projectId = j;
    }

    public void setReleased(boolean z) {
        this.released = z;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof JIRAVersion)) {
            return false;
        }
        return this.name.equals(((JIRAVersion) obj).name);
    }
}
