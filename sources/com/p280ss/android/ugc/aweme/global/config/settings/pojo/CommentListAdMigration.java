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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommentListAdMigration */
public final class CommentListAdMigration extends Message<CommentListAdMigration, Builder> {
    public static final DefaultValueProtoAdapter<CommentListAdMigration> ADAPTER = new ProtoAdapter_CommentListAdMigration();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String enterprise_tag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String link_tag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String star_atlas_tag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String task_tag;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommentListAdMigration$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommentListAdMigration, Builder> {
        public String enterprise_tag;
        public String link_tag;
        public String star_atlas_tag;
        public String task_tag;

        public final CommentListAdMigration build() {
            CommentListAdMigration commentListAdMigration = new CommentListAdMigration(this.link_tag, this.star_atlas_tag, this.task_tag, this.enterprise_tag, super.buildUnknownFields());
            return commentListAdMigration;
        }

        public final Builder enterprise_tag(String str) {
            this.enterprise_tag = str;
            return this;
        }

        public final Builder link_tag(String str) {
            this.link_tag = str;
            return this;
        }

        public final Builder star_atlas_tag(String str) {
            this.star_atlas_tag = str;
            return this;
        }

        public final Builder task_tag(String str) {
            this.task_tag = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommentListAdMigration$ProtoAdapter_CommentListAdMigration */
    static final class ProtoAdapter_CommentListAdMigration extends DefaultValueProtoAdapter<CommentListAdMigration> {
        public final CommentListAdMigration redact(CommentListAdMigration commentListAdMigration) {
            return commentListAdMigration;
        }

        public ProtoAdapter_CommentListAdMigration() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentListAdMigration.class);
        }

        public final CommentListAdMigration decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CommentListAdMigration) null);
        }

        public final int encodedSize(CommentListAdMigration commentListAdMigration) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commentListAdMigration.link_tag) + ProtoAdapter.STRING.encodedSizeWithTag(2, commentListAdMigration.star_atlas_tag) + ProtoAdapter.STRING.encodedSizeWithTag(3, commentListAdMigration.task_tag) + ProtoAdapter.STRING.encodedSizeWithTag(4, commentListAdMigration.enterprise_tag) + commentListAdMigration.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CommentListAdMigration commentListAdMigration) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentListAdMigration.link_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentListAdMigration.star_atlas_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentListAdMigration.task_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commentListAdMigration.enterprise_tag);
            protoWriter.writeBytes(commentListAdMigration.unknownFields());
        }

        public final CommentListAdMigration decode(ProtoReader protoReader, CommentListAdMigration commentListAdMigration) throws IOException {
            Builder builder;
            CommentListAdMigration commentListAdMigration2 = (CommentListAdMigration) C10938a.m32097a().mo26425a(CommentListAdMigration.class, commentListAdMigration);
            if (commentListAdMigration2 != null) {
                builder = commentListAdMigration2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.link_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.star_atlas_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.task_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.enterprise_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (commentListAdMigration2 != null) {
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

    public final String getEnterpriseTag() throws NullValueException {
        if (this.enterprise_tag != null) {
            return this.enterprise_tag;
        }
        throw new NullValueException();
    }

    public final String getLinkTag() throws NullValueException {
        if (this.link_tag != null) {
            return this.link_tag;
        }
        throw new NullValueException();
    }

    public final String getStarAtlasTag() throws NullValueException {
        if (this.star_atlas_tag != null) {
            return this.star_atlas_tag;
        }
        throw new NullValueException();
    }

    public final String getTaskTag() throws NullValueException {
        if (this.task_tag != null) {
            return this.task_tag;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.link_tag = this.link_tag;
        builder.star_atlas_tag = this.star_atlas_tag;
        builder.task_tag = this.task_tag;
        builder.enterprise_tag = this.enterprise_tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.link_tag != null) {
            i = this.link_tag.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.star_atlas_tag != null) {
            i2 = this.star_atlas_tag.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.task_tag != null) {
            i3 = this.task_tag.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.enterprise_tag != null) {
            i5 = this.enterprise_tag.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link_tag != null) {
            sb.append(", link_tag=");
            sb.append(this.link_tag);
        }
        if (this.star_atlas_tag != null) {
            sb.append(", star_atlas_tag=");
            sb.append(this.star_atlas_tag);
        }
        if (this.task_tag != null) {
            sb.append(", task_tag=");
            sb.append(this.task_tag);
        }
        if (this.enterprise_tag != null) {
            sb.append(", enterprise_tag=");
            sb.append(this.enterprise_tag);
        }
        StringBuilder replace = sb.replace(0, 2, "CommentListAdMigration{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommentListAdMigration)) {
            return false;
        }
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) obj;
        if (!unknownFields().equals(commentListAdMigration.unknownFields()) || !Internal.equals(this.link_tag, commentListAdMigration.link_tag) || !Internal.equals(this.star_atlas_tag, commentListAdMigration.star_atlas_tag) || !Internal.equals(this.task_tag, commentListAdMigration.task_tag) || !Internal.equals(this.enterprise_tag, commentListAdMigration.enterprise_tag)) {
            return false;
        }
        return true;
    }

    public CommentListAdMigration(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public CommentListAdMigration(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_tag = str;
        this.star_atlas_tag = str2;
        this.task_tag = str3;
        this.enterprise_tag = str4;
    }
}
