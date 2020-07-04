package com.p280ss.android.ugc.aweme.memory.api;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildResponse */
public final class CIBuildResponse {
    @C6593c(mo15949a = "app")
    private String app = "";
    @C6593c(mo15949a = "app_id")
    private String appId = "";
    @C6593c(mo15949a = "build_type")
    private String buildType = "";
    @C6593c(mo15949a = "channel")
    private String channel = "";
    @C6593c(mo15949a = "commit_id")
    private String commitId = "";
    @C6593c(mo15949a = "dependencies_url")
    private String dependenciesUrl = "";
    @C6593c(mo15949a = "is_release")
    private final boolean isRelease;
    @C6593c(mo15949a = "jenkins_url")
    private String jenkinsUrl = "";
    @C6593c(mo15949a = "mapping_url")
    private String mappingUrl = "";
    @C6593c(mo15949a = "merge_request_id")
    private String mergeRequestId = "";
    @C6593c(mo15949a = "package_size")
    private long packageSize;
    @C6593c(mo15949a = "package_url")
    private String packageUrl = "";
    @C6593c(mo15949a = "previous_root_node_commit_id")
    private String previousRootNodeCommitId = "";
    @C6593c(mo15949a = "update_version")
    private String updateVersion = "";
    @C6593c(mo15949a = "version")
    private String version = "";

    public final String getApp() {
        return this.app;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBuildType() {
        return this.buildType;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCommitId() {
        return this.commitId;
    }

    public final String getDependenciesUrl() {
        return this.dependenciesUrl;
    }

    public final String getJenkinsUrl() {
        return this.jenkinsUrl;
    }

    public final String getMappingUrl() {
        return this.mappingUrl;
    }

    public final String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public final long getPackageSize() {
        return this.packageSize;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getPreviousRootNodeCommitId() {
        return this.previousRootNodeCommitId;
    }

    public final String getUpdateVersion() {
        return this.updateVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isRelease() {
        return this.isRelease;
    }

    public final void setPackageSize(long j) {
        this.packageSize = j;
    }

    public final void setApp(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.app = str;
    }

    public final void setAppId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.appId = str;
    }

    public final void setBuildType(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.buildType = str;
    }

    public final void setChannel(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.channel = str;
    }

    public final void setCommitId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.commitId = str;
    }

    public final void setDependenciesUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.dependenciesUrl = str;
    }

    public final void setJenkinsUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.jenkinsUrl = str;
    }

    public final void setMappingUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.mappingUrl = str;
    }

    public final void setMergeRequestId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.mergeRequestId = str;
    }

    public final void setPackageUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.packageUrl = str;
    }

    public final void setPreviousRootNodeCommitId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.previousRootNodeCommitId = str;
    }

    public final void setUpdateVersion(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.updateVersion = str;
    }

    public final void setVersion(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.version = str;
    }
}
