package cn.whxlover.mapper;

import cn.whxlover.pojo.SubClass;
import cn.whxlover.pojo.SubClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubClassMapper {
    int countByExample(SubClassExample example);

    int deleteByExample(SubClassExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(SubClass record);

    int insertSelective(SubClass record);

    List<SubClass> selectByExample(SubClassExample example);

    SubClass selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") SubClass record, @Param("example") SubClassExample example);

    int updateByExample(@Param("record") SubClass record, @Param("example") SubClassExample example);

    int updateByPrimaryKeySelective(SubClass record);

    int updateByPrimaryKey(SubClass record);
}