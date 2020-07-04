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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan */
public final class LinkPlan extends Message<LinkPlan, Builder> {
    public static final DefaultValueProtoAdapter<LinkPlan> ADAPTER = new ProtoAdapter_LinkPlan();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String info;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String settings;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LinkPlan, Builder> {
        public String info;
        public String publish;
        public String settings;

        public final LinkPlan build() {
            return new LinkPlan(this.publish, this.settings, this.info, super.buildUnknownFields());
        }

        public final Builder info(String str) {
            this.info = str;
            return this;
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }

        public final Builder settings(String str) {
            this.settings = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan$ProtoAdapter_LinkPlan */
    static final class ProtoAdapter_LinkPlan extends DefaultValueProtoAdapter<LinkPlan> {
        public final LinkPlan redact(LinkPlan linkPlan) {
            return linkPlan;
        }

        public ProtoAdapter_LinkPlan() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkPlan.class);
        }

        public final LinkPlan decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LinkPlan) null);
        }

        public final int encodedSize(LinkPlan linkPlan) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, linkPlan.publish) + ProtoAdapter.STRING.encodedSizeWithTag(2, linkPlan.settings) + ProtoAdapter.STRING.encodedSizeWithTag(3, linkPlan.info) + linkPlan.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LinkPlan linkPlan) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, linkPlan.publish);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, linkPlan.settings);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, linkPlan.info);
            protoWriter.writeBytes(linkPlan.unknownFields());
        }

        public final LinkPlan decode(ProtoReader protoReader, LinkPlan linkPlan) throws IOException {
            Builder builder;
            LinkPlan linkPlan2 = (LinkPlan) C10938a.m32097a().mo26425a(LinkPlan.class, linkPlan);
            if (linkPlan2 != null) {
                builder = linkPlan2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.publish((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.settings((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (linkPlan2 != null) {
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

    public final String getInfo() throws NullValueException {
        if (this.info != null) {
            return this.info;
        }
        throw new NullValueException();
    }

    public final String getPublish() throws NullValueException {
        if (this.publish != null) {
            return this.publish;
        }
        throw new NullValueException();
    }

    public final String getSettings() throws NullValueException {
        if (this.settings != null) {
            return this.settings;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.settings = this.settings;
        builder.info = this.info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.publish != null) {
            i = this.publish.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.settings != null) {
            i2 = this.settings.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.info != null) {
            i4 = this.info.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.info != null) {
            sb.append(", info=");
            sb.append(this.info);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkPlan{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkPlan)) {
            return false;
        }
        LinkPlan linkPlan = (LinkPlan) obj;
        if (!unknownFields().equals(linkPlan.unknownFields()) || !Internal.equals(this.publish, linkPlan.publish) || !Internal.equals(this.settings, linkPlan.settings) || !Internal.equals(this.info, linkPlan.info)) {
            return false;
        }
        return true;
    }

    public LinkPlan(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public LinkPlan(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
        this.settings = str2;
        this.info = str3;
    }
}
