package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GroupInfo */
public final class GroupInfo extends Message<GroupInfo, Builder> {
    public static final ProtoAdapter<GroupInfo> ADAPTER = new ProtoAdapter_GroupInfo();
    public static final Long DEFAULT_INFO_VERSION = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final Map<String, String> ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String group_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String group_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String group_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long info_version;

    /* renamed from: com.bytedance.im.core.proto.GroupInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GroupInfo, Builder> {
        public String conversation_id;
        public Map<String, String> ext = Internal.newMutableMap();
        public String group_desc;
        public String group_icon;
        public String group_name;
        public Long info_version;

        public final GroupInfo build() {
            GroupInfo groupInfo = new GroupInfo(this.conversation_id, this.info_version, this.group_name, this.group_desc, this.group_icon, this.ext, super.buildUnknownFields());
            return groupInfo;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder group_desc(String str) {
            this.group_desc = str;
            return this;
        }

        public final Builder group_icon(String str) {
            this.group_icon = str;
            return this;
        }

        public final Builder group_name(String str) {
            this.group_name = str;
            return this;
        }

        public final Builder info_version(Long l) {
            this.info_version = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GroupInfo$ProtoAdapter_GroupInfo */
    static final class ProtoAdapter_GroupInfo extends ProtoAdapter<GroupInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_GroupInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, GroupInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final GroupInfo redact(GroupInfo groupInfo) {
            Builder newBuilder = groupInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GroupInfo groupInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, groupInfo.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, groupInfo.info_version) + ProtoAdapter.STRING.encodedSizeWithTag(5, groupInfo.group_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, groupInfo.group_desc) + ProtoAdapter.STRING.encodedSizeWithTag(7, groupInfo.group_icon) + this.ext.encodedSizeWithTag(10, groupInfo.ext) + groupInfo.unknownFields().size();
        }

        public final GroupInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.info_version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.group_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.group_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.group_icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GroupInfo groupInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, groupInfo.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, groupInfo.info_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, groupInfo.group_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, groupInfo.group_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, groupInfo.group_icon);
            this.ext.encodeWithTag(protoWriter, 10, groupInfo.ext);
            protoWriter.writeBytes(groupInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.info_version = this.info_version;
        builder.group_name = this.group_name;
        builder.group_desc = this.group_desc;
        builder.group_icon = this.group_icon;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.info_version != null) {
            i2 = this.info_version.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.group_name != null) {
            i3 = this.group_name.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.group_desc != null) {
            i4 = this.group_desc.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.group_icon != null) {
            i6 = this.group_icon.hashCode();
        }
        int hashCode2 = ((i10 + i6) * 37) + this.ext.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.info_version != null) {
            sb.append(", info_version=");
            sb.append(this.info_version);
        }
        if (this.group_name != null) {
            sb.append(", group_name=");
            sb.append(this.group_name);
        }
        if (this.group_desc != null) {
            sb.append(", group_desc=");
            sb.append(this.group_desc);
        }
        if (this.group_icon != null) {
            sb.append(", group_icon=");
            sb.append(this.group_icon);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        StringBuilder replace = sb.replace(0, 2, "GroupInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        if (!unknownFields().equals(groupInfo.unknownFields()) || !Internal.equals(this.conversation_id, groupInfo.conversation_id) || !Internal.equals(this.info_version, groupInfo.info_version) || !Internal.equals(this.group_name, groupInfo.group_name) || !Internal.equals(this.group_desc, groupInfo.group_desc) || !Internal.equals(this.group_icon, groupInfo.group_icon) || !this.ext.equals(groupInfo.ext)) {
            return false;
        }
        return true;
    }

    public GroupInfo(String str, Long l, String str2, String str3, String str4, Map<String, String> map) {
        this(str, l, str2, str3, str4, map, ByteString.EMPTY);
    }

    public GroupInfo(String str, Long l, String str2, String str3, String str4, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.info_version = l;
        this.group_name = str2;
        this.group_desc = str3;
        this.group_icon = str4;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
