package cn.whxlover.pojo;

import java.util.Date;

public class UploadFile {
    private Integer fid;

    private String filename;

    private String filetype;

    private Integer size;

    private Date uploadTime;

    private Integer mid;

    private Integer createUid;

    private Boolean valid;

    private Boolean pptShow;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getPptShow() {
        return pptShow;
    }

    public void setPptShow(Boolean pptShow) {
        this.pptShow = pptShow;
    }
}