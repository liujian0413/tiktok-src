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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFeEliteItem */
public final class AwemeFeEliteItem extends Message<AwemeFeEliteItem, Builder> {
    public static final DefaultValueProtoAdapter<AwemeFeEliteItem> ADAPTER = new ProtoAdapter_AwemeFeEliteItem();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String edit_contact_link;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String edit_service_center_link;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFeEliteItem$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeFeEliteItem, Builder> {
        public String edit_contact_link;
        public String edit_service_center_link;

        public final AwemeFeEliteItem build() {
            return new AwemeFeEliteItem(this.edit_contact_link, this.edit_service_center_link, super.buildUnknownFields());
        }

        public final Builder edit_contact_link(String str) {
            this.edit_contact_link = str;
            return this;
        }

        public final Builder edit_service_center_link(String str) {
            this.edit_service_center_link = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFeEliteItem$ProtoAdapter_AwemeFeEliteItem */
    static final class ProtoAdapter_AwemeFeEliteItem extends DefaultValueProtoAdapter<AwemeFeEliteItem> {
        public final AwemeFeEliteItem redact(AwemeFeEliteItem awemeFeEliteItem) {
            return awemeFeEliteItem;
        }

        public ProtoAdapter_AwemeFeEliteItem() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeFeEliteItem.class);
        }

        public final AwemeFeEliteItem decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AwemeFeEliteItem) null);
        }

        public final int encodedSize(AwemeFeEliteItem awemeFeEliteItem) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeFeEliteItem.edit_contact_link) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeFeEliteItem.edit_service_center_link) + awemeFeEliteItem.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AwemeFeEliteItem awemeFeEliteItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeFeEliteItem.edit_contact_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeFeEliteItem.edit_service_center_link);
            protoWriter.writeBytes(awemeFeEliteItem.unknownFields());
        }

        public final AwemeFeEliteItem decode(ProtoReader protoReader, AwemeFeEliteItem awemeFeEliteItem) throws IOException {
            Builder builder;
            AwemeFeEliteItem awemeFeEliteItem2 = (AwemeFeEliteItem) C10938a.m32097a().mo26425a(AwemeFeEliteItem.class, awemeFeEliteItem);
            if (awemeFeEliteItem2 != null) {
                builder = awemeFeEliteItem2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.edit_contact_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.edit_service_center_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (awemeFeEliteItem2 != null) {
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

    public final String getEditContactLink() throws NullValueException {
        if (this.edit_contact_link != null) {
            return this.edit_contact_link;
        }
        throw new NullValueException();
    }

    public final String getEditServiceCenterLink() throws NullValueException {
        if (this.edit_service_center_link != null) {
            return this.edit_service_center_link;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.edit_contact_link = this.edit_contact_link;
        builder.edit_service_center_link = this.edit_service_center_link;
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
        if (this.edit_contact_link != null) {
            i = this.edit_contact_link.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.edit_service_center_link != null) {
            i3 = this.edit_service_center_link.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.edit_contact_link != null) {
            sb.append(", edit_contact_link=");
            sb.append(this.edit_contact_link);
        }
        if (this.edit_service_center_link != null) {
            sb.append(", edit_service_center_link=");
            sb.append(this.edit_service_center_link);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeFeEliteItem{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeFeEliteItem)) {
            return false;
        }
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) obj;
        if (!unknownFields().equals(awemeFeEliteItem.unknownFields()) || !Internal.equals(this.edit_contact_link, awemeFeEliteItem.edit_contact_link) || !Internal.equals(this.edit_service_center_link, awemeFeEliteItem.edit_service_center_link)) {
            return false;
        }
        return true;
    }

    public AwemeFeEliteItem(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AwemeFeEliteItem(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.edit_contact_link = str;
        this.edit_service_center_link = str2;
    }
}
