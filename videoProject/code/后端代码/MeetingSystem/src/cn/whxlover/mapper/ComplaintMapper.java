package cn.whxlover.mapper;

import cn.whxlover.pojo.Complaint;
import cn.whxlover.pojo.ComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintMapper {
    int countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Complaint record);

    int insertSelective(Complaint record);

    List<Complaint> selectByExample(ComplaintExample example);

    Complaint selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(Complaint record);

    int updateByPrimaryKey(Complaint record);
}