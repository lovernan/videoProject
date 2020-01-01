package cn.whxlover.pojo;

public class Comment {
    private Integer cid;

    private String username1;

    private String username2;

    private Integer vid;

    private String content;

    private Integer verified;

    private String avator;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1 == null ? null : username1.trim();
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2 == null ? null : username2.trim();
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

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }
}