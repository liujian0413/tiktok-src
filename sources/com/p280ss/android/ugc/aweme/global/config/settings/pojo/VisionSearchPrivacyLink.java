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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacyLink */
public final class VisionSearchPrivacyLink extends Message<VisionSearchPrivacyLink, Builder> {
    public static final DefaultValueProtoAdapter<VisionSearchPrivacyLink> ADAPTER = new ProtoAdapter_VisionSearchPrivacyLink();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String link_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String link_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacyLink$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VisionSearchPrivacyLink, Builder> {
        public String link_text;
        public String link_url;

        public final VisionSearchPrivacyLink build() {
            return new VisionSearchPrivacyLink(this.link_text, this.link_url, super.buildUnknownFields());
        }

        public final Builder link_text(String str) {
            this.link_text = str;
            return this;
        }

        public final Builder link_url(String str) {
            this.link_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacyLink$ProtoAdapter_VisionSearchPrivacyLink */
    static final class ProtoAdapter_VisionSearchPrivacyLink extends DefaultValueProtoAdapter<VisionSearchPrivacyLink> {
        public final VisionSearchPrivacyLink redact(VisionSearchPrivacyLink visionSearchPrivacyLink) {
            return visionSearchPrivacyLink;
        }

        public ProtoAdapter_VisionSearchPrivacyLink() {
            super(FieldEncoding.LENGTH_DELIMITED, VisionSearchPrivacyLink.class);
        }

        public final VisionSearchPrivacyLink decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VisionSearchPrivacyLink) null);
        }

        public final int encodedSize(VisionSearchPrivacyLink visionSearchPrivacyLink) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, visionSearchPrivacyLink.link_text) + ProtoAdapter.STRING.encodedSizeWithTag(2, visionSearchPrivacyLink.link_url) + visionSearchPrivacyLink.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VisionSearchPrivacyLink visionSearchPrivacyLink) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, visionSearchPrivacyLink.link_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, visionSearchPrivacyLink.link_url);
            protoWriter.writeBytes(visionSearchPrivacyLink.unknownFields());
        }

        public final VisionSearchPrivacyLink decode(ProtoReader protoReader, VisionSearchPrivacyLink visionSearchPrivacyLink) throws IOException {
            Builder builder;
            VisionSearchPrivacyLink visionSearchPrivacyLink2 = (VisionSearchPrivacyLink) C10938a.m32097a().mo26425a(VisionSearchPrivacyLink.class, visionSearchPrivacyLink);
            if (visionSearchPrivacyLink2 != null) {
                builder = visionSearchPrivacyLink2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.link_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.link_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (visionSearchPrivacyLink2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getLinkText() throws NullValueException {
        if (this.link_text != null) {
            return this.link_text;
        }
        throw new NullValueException();
    }

    public final String getLinkUrl() throws NullValueException {
        if (this.link_url != null) {
            return this.link_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.link_text = this.link_text;
        builder.link_url = this.link_url;
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
        if (this.link_text != null) {
            i = this.link_text.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.link_url != null) {
            i3 = this.link_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link_text != null) {
            sb.append(", link_text=");
            sb.append(this.link_text);
        }
        if (this.link_url != null) {
            sb.append(", link_url=");
            sb.append(this.link_url);
        }
        StringBuilder replace = sb.replace(0, 2, "VisionSearchPrivacyLink{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisionSearchPrivacyLink)) {
            return false;
        }
        VisionSearchPrivacyLink visionSearchPrivacyLink = (VisionSearchPrivacyLink) obj;
        if (!unknownFields().equals(visionSearchPrivacyLink.unknownFields()) || !Internal.equals(this.link_text, visionSearchPrivacyLink.link_text) || !Internal.equals(this.link_url, visionSearchPrivacyLink.link_url)) {
            return false;
        }
        return true;
    }

    public VisionSearchPrivacyLink(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public VisionSearchPrivacyLink(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_text = str;
        this.link_url = str2;
    }
}
