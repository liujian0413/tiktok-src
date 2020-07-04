package com.bytedance.jirafast.models;

import java.io.Serializable;

public class JIRAUser implements Serializable {
    private String mDisplayName;
    private String mEmailAddress;
    private String mName;

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getEmailAddress() {
        return this.mEmailAddress;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return this.mName;
    }

    public int hashCode() {
        return this.mName.hashCode();
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setEmailAddress(String str) {
        this.mEmailAddress = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof JIRAUser)) {
            return false;
        }
        return this.mName.equals(((JIRAUser) obj).mName);
    }

    public JIRAUser(String str, String str2, String str3) {
        this.mName = str;
        this.mEmailAddress = str2;
        this.mDisplayName = str3;
    }
}
