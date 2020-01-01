package cn.whxlover.mapper;

import cn.whxlover.pojo.UploadFile;
import cn.whxlover.pojo.UploadFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFileMapper {
    int countByExample(UploadFileExample example);

    int deleteByExample(UploadFileExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);

    List<UploadFile> selectByExample(UploadFileExample example);

    UploadFile selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}