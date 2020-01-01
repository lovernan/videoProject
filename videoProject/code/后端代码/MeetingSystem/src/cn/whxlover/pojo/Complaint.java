package cn.whxlover.pojo;

public class Complaint {
    private Integer cid;

    private Integer uid;

    private Integer vid;

    private String content;

    private Integer verified;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }
}