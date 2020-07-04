package com.bytedance.jirafast.models;

import java.io.Serializable;

public class JIRAEpicLink implements Serializable {
    private boolean isDone;
    private String key;
    private String name;

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public void setDone(boolean z) {
        this.isDone = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof JIRAEpicLink)) {
            return false;
        }
        return this.key.equals(((JIRAEpicLink) obj).key);
    }
}
