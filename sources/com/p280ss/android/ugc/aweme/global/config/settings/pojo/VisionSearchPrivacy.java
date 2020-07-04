package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacy */
public final class VisionSearchPrivacy extends Message<VisionSearchPrivacy, Builder> {
    public static final DefaultValueProtoAdapter<VisionSearchPrivacy> ADAPTER = new ProtoAdapter_VisionSearchPrivacy();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacyLink#ADAPTER", label = 2, tag = 3)
    public final List<VisionSearchPrivacyLink> links;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacy$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VisionSearchPrivacy, Builder> {
        public String content;
        public List<VisionSearchPrivacyLink> links = Internal.newMutableList();
        public String title;

        public final VisionSearchPrivacy build() {
            return new VisionSearchPrivacy(this.title, this.content, this.links, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder links(List<VisionSearchPrivacyLink> list) {
            Internal.checkElementsNotNull(list);
            this.links = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacy$ProtoAdapter_VisionSearchPrivacy */
    static final class ProtoAdapter_VisionSearchPrivacy extends DefaultValueProtoAdapter<VisionSearchPrivacy> {
        public final VisionSearchPrivacy redact(VisionSearchPrivacy visionSearchPrivacy) {
            return visionSearchPrivacy;
        }

        public ProtoAdapter_VisionSearchPrivacy() {
            super(FieldEncoding.LENGTH_DELIMITED, VisionSearchPrivacy.class);
        }

        public final VisionSearchPrivacy decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VisionSearchPrivacy) null);
        }

        public final int encodedSize(VisionSearchPrivacy visionSearchPrivacy) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, visionSearchPrivacy.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, visionSearchPrivacy.content) + VisionSearchPrivacyLink.ADAPTER.asRepeated().encodedSizeWithTag(3, visionSearchPrivacy.links) + visionSearchPrivacy.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VisionSearchPrivacy visionSearchPrivacy) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, visionSearchPrivacy.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, visionSearchPrivacy.content);
            VisionSearchPrivacyLink.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, visionSearchPrivacy.links);
            protoWriter.writeBytes(visionSearchPrivacy.unknownFields());
        }

        public final VisionSearchPrivacy decode(ProtoReader protoReader, VisionSearchPrivacy visionSearchPrivacy) throws IOException {
            Builder builder;
            VisionSearchPrivacy visionSearchPrivacy2 = (VisionSearchPrivacy) C10938a.m32097a().mo26425a(VisionSearchPrivacy.class, visionSearchPrivacy);
            if (visionSearchPrivacy2 != null) {
                builder = visionSearchPrivacy2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<VisionSearchPrivacyLink> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            newMutableList.add(VisionSearchPrivacyLink.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(VisionSearchPrivacyLink.class)));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (visionSearchPrivacy2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.links = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<VisionSearchPrivacyLink> getLinks() {
        return this.links;
    }

    public final String getContent() throws NullValueException {
        if (this.content != null) {
            return this.content;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.content = this.content;
        builder.links = Internal.copyOf("links", this.links);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.content != null) {
            i3 = this.content.hashCode();
        }
        int hashCode2 = ((i4 + i3) * 37) + this.links.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.links.isEmpty()) {
            sb.append(", links=");
            sb.append(this.links);
        }
        StringBuilder replace = sb.replace(0, 2, "VisionSearchPrivacy{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisionSearchPrivacy)) {
            return false;
        }
        VisionSearchPrivacy visionSearchPrivacy = (VisionSearchPrivacy) obj;
        if (!unknownFields().equals(visionSearchPrivacy.unknownFields()) || !Internal.equals(this.title, visionSearchPrivacy.title) || !Internal.equals(this.content, visionSearchPrivacy.content) || !this.links.equals(visionSearchPrivacy.links)) {
            return false;
        }
        return true;
    }

    public VisionSearchPrivacy(String str, String str2, List<VisionSearchPrivacyLink> list) {
        this(str, str2, list, ByteString.EMPTY);
    }

    public VisionSearchPrivacy(String str, String str2, List<VisionSearchPrivacyLink> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.content = str2;
        this.links = Internal.immutableCopyOf("links", list);
    }
}
